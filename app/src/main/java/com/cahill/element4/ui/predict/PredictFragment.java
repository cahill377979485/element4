package com.cahill.element4.ui.predict;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.cahill.element4.R;
import com.cahill.element4.base.BaseFragment;
import com.cahill.element4.binder.predict.ElementBinder;
import com.cahill.element4.model.predict.ElementBean;
import com.cahill.element4.util.MyGridLayoutManager;

import butterknife.BindView;
import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

public class PredictFragment extends BaseFragment {
    @BindView(R.id.rv)
    RecyclerView rv;

    private PredictVM vm;
    private Items items = new Items();
    private MultiTypeAdapter adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_predict;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        vm = new ViewModelProvider(this).get(PredictVM.class);
        adapter = new MultiTypeAdapter(items);
        adapter.register(ElementBean.class, new ElementBinder());
        rv.setLayoutManager(new MyGridLayoutManager(getActivity(), 4));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        vm.getList().observe(getViewLifecycleOwner(), elementBeans -> {
            items.clear();
            adapter.notifyDataSetChanged();
            items.addAll(elementBeans);
            adapter.notifyDataSetChanged();
        });
    }
}
