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
import com.cahill.element4.util.Val;

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
    protected void onBindViewHolder(@NonNull ElementHolder holder, @NonNull ElementBean bean) {
        UIHelper.setText(holder.tvText, bean.getName());
        UIHelper.setText(holder.tvName, bean.getTG() + bean.getDZ());
        UIHelper.setText(holder.tvTG, bean.getTG());
        UIHelper.setText(holder.tvDZ, bean.getDZ());
        UIHelper.setText(holder.tvWX1, EleUtil.getYYbyTG(bean.getTG()) + EleUtil.getWXbyTG(bean.getTG()));
        UIHelper.setText(holder.tvWX2, EleUtil.getYYbyDZ(bean.getDZ()) + EleUtil.getWXbyDZ(bean.getDZ()));
        UIHelper.setTextColor(holder.tvWX1, EleUtil.getColorIdByWX(EleUtil.getWXbyTG(bean.getTG())));
        UIHelper.setTextColor(holder.tvWX2, EleUtil.getColorIdByWX(EleUtil.getWXbyDZ(bean.getDZ())));
        UIHelper.setVisibleInvisible(holder.v1, EleUtil.getYYbyTG(bean.getTG()).equals(Val.YY_YIN));
        UIHelper.setVisibleInvisible(holder.v2, EleUtil.getYYbyDZ(bean.getDZ()).equals(Val.YY_YIN));
    }

    static class ElementHolder extends RecyclerView.ViewHolder {
        TextView tvText, tvName, tvTG, tvDZ, tvWX1, tvWX2;
        View v1, v2;

        ElementHolder(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tv_text);
            tvName = itemView.findViewById(R.id.tv_name);
            tvTG = itemView.findViewById(R.id.tv_TG);
            tvDZ = itemView.findViewById(R.id.tv_DZ);
            tvWX1 = itemView.findViewById(R.id.tv_WX1);
            tvWX2 = itemView.findViewById(R.id.tv_WX2);
            v1 = itemView.findViewById(R.id.v_shadow1);
            v2 = itemView.findViewById(R.id.v_shadow2);
        }
    }
}
