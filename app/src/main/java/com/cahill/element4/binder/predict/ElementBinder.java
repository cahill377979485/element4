package com.cahill.element4.binder.predict;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cahill.element4.R;
import com.cahill.element4.model.predict.ElementBean;
import com.cahill.element4.util.UIHelper;

import me.drakeet.multitype.ItemViewBinder;

/**
 * @author: 文琳
 * @time: 2020/5/4 14:57
 * @desc:
 */
public class ElementBinder extends ItemViewBinder<ElementBean, ElementBinder.ElementHolder> {


    @NonNull
    @Override
    protected ElementHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ElementHolder(inflater.inflate(R.layout.item_element, parent, false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ElementHolder holder, @NonNull ElementBean elementBean) {
        UIHelper.setText(holder.tvTitle, elementBean.getText());
        UIHelper.setText(holder.tvText, elementBean.getName());
    }

    static class ElementHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvText;

        ElementHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
