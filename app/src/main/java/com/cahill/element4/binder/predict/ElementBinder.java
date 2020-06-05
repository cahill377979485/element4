package com.cahill.element4.binder.predict;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cahill.element4.R;
import com.cahill.element4.bean.predict.ElementBean;
import com.cahill.element4.util.EleUtil;
import com.cahill.element4.util.UIHelper;

import me.drakeet.multitype.ItemViewBinder;

/**
 * @author: 文琳
 * @time: 2020/5/4 14:57
 * @desc: 柱
 */
public class ElementBinder extends ItemViewBinder<ElementBean, ElementBinder.ElementHolder> {


    @NonNull
    @Override
    protected ElementHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ElementHolder(inflater.inflate(R.layout.item_element, parent, false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ElementHolder holder, @NonNull ElementBean elementBean) {
        UIHelper.setText(holder.tvText, elementBean.getName());
        UIHelper.setText(holder.tvName, elementBean.getTG() + elementBean.getDZ());
        UIHelper.setText(holder.tvTG, elementBean.getTG());
        UIHelper.setText(holder.tvDZ, elementBean.getDZ());
        UIHelper.setText(holder.tvWX1, EleUtil.getYYbyTG(elementBean.getTG()) + EleUtil.getWXbyTG(elementBean.getTG()));
        UIHelper.setText(holder.tvWX2, EleUtil.getYYbyDZ(elementBean.getDZ()) + EleUtil.getWXbyDZ(elementBean.getDZ()));
    }

    static class ElementHolder extends RecyclerView.ViewHolder {
        TextView tvText, tvName, tvTG, tvDZ, tvWX1, tvWX2;

        ElementHolder(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tv_text);
            tvName = itemView.findViewById(R.id.tv_name);
            tvTG = itemView.findViewById(R.id.tv_TG);
            tvDZ = itemView.findViewById(R.id.tv_DZ);
            tvWX1 = itemView.findViewById(R.id.tv_WX1);
            tvWX2 = itemView.findViewById(R.id.tv_WX2);
        }
    }
}
