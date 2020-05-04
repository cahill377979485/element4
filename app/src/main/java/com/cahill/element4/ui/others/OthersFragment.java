package com.cahill.element4.ui.others;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.cahill.element4.R;
import com.cahill.element4.base.BaseFragment;
import com.cahill.element4.ui.setting.SettingVM;

import butterknife.BindView;

public class OthersFragment extends BaseFragment {
    @BindView(R.id.text_dashboard)
    TextView textView;

    private OthersVM vm;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_others;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        vm = new ViewModelProvider(this).get(OthersVM.class);
        vm.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
    }
}
