package com.cahill.element4.util;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;

import com.cahill.element4.base.MyApplication;

import org.w3c.dom.Text;

/**
 * @author: 文琳
 * @time: 2020/5/2 23:35
 * @desc:
 */
public class UIHelper {

    /**
     * 为文本控件设置文字，text可以为空字符串（""），统一用这个方法，避免空指针异常
     *
     * @param tv   文本控件
     * @param text 显示的字符串，字符串为null时，控件不显示内容
     */
    public static void setText(TextView tv, String text) {
        if (Checker.isNull(text)) text = "";
        if (Checker.notNull(tv))
            tv.setText(text);
    }

    /**
     * 设置文本
     * @param tv 文本控件
     * @param num 数值
     */
    public static void setText(TextView tv, int num){
        setText(tv, String.valueOf(num));
    }

    /**
     * 设置文本
     * @param tv 文本控件
     * @param num 数值
     */
    public static void setText(TextView tv, long num){
        setText(tv, String.valueOf(num));
    }

    /**
     * 设置文本
     * @param tv 文本控件
     * @param num 数值
     */
    public static void setText(TextView tv, double num){
        setText(tv, String.valueOf(num));
    }

    /**
     * 设置文本
     * @param tv 文本控件
     * @param num 数值
     */
    public static void setText(TextView tv, float num){
        setText(tv, String.valueOf(num));
    }

    /**
     * 设置文本
     * @param tv 文本控件
     * @param num 数值
     */
    public static void setText(TextView tv, short num){
        setText(tv, String.valueOf(num));
    }

    /**
     * 设置文本
     * @param tv 文本控件
     * @param num 数值
     */
    public static void setText(TextView tv, byte num){
        setText(tv, String.valueOf(num));
    }

    /**
     * 设置文字颜色
     *
     * @param tv      控件
     * @param colorId 颜色编号
     */
    public static void setTextColor(TextView tv, int colorId) {
        if (Checker.isNull(tv) || colorId <= 0) return;
        if (Checker.isNull(MyApplication.context)) return;
        tv.setTextColor(ContextCompat.getColor(MyApplication.context, colorId));
    }

    /**
     * 设置可用不可用
     *
     * @param view   控件
     * @param enable 可用否
     */
    public static void setEnabled(View view, boolean enable) {
        if (Checker.isNull(view)) return;
        view.setEnabled(enable);
    }

    /**
     * 设置背景样式资源
     *
     * @param view  控件
     * @param resId 资源编号
     */
    public static void setBackgroundResource(View view, int resId) {
        if (Checker.isNull(view)) return;
        view.setBackgroundResource(resId);
    }

    /**
     * 设置背景样式颜色
     *
     * @param view  控件
     * @param resId 资源编号
     */
    public static void setBackgroundColor(View view, @ColorRes int resId) {
        if (Checker.isNull(view)) return;
        view.setBackgroundColor(ContextCompat.getColor(MyApplication.context, resId));
    }

    /**
     * 设置控件是否可被点击
     *
     * @param view      控件
     * @param clickable 是否可被点击
     */
    public static void setClickable(View view, boolean clickable) {
        if (Checker.isNull(view)) return;
        view.setClickable(clickable);
    }

    /**
     * 设置显示或隐藏
     *
     * @param view       控件
     * @param visibility 显隐的类型编码，0-显示,4-隐藏,8-消失
     */
    public static void setVisibility(View view, int visibility) {
        if (Checker.isNull(view)) return;
        view.setVisibility(visibility);
    }

    /**
     * 设置显示或隐藏
     *
     * @param view    控件
     * @param visible 是否显示
     */
    public static void setVisibleInvisible(View view, boolean visible) {
        if (Checker.isNull(view)) return;
        view.setVisibility(visible ? View.VISIBLE : View.INVISIBLE);
    }

    /**
     * 设置显示或消失
     *
     * @param view    控件
     * @param visible 是否显示
     */
    public static void setVisibleGone(View view, boolean visible) {
        if (Checker.isNull(view)) return;
        view.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    /**
     * 返回控件是否可见
     *
     * @param view 控件
     * @return 所求
     */
    public static boolean isVisible(View view) {
        if (Checker.isNull(view)) return false;
        return view.getVisibility() == View.VISIBLE;
    }

    /**
     * 返回控件是否不可见
     *
     * @param view 控件
     * @return 所求
     */
    public static boolean isInvisible(View view) {
        if (Checker.isNull(view)) return false;
        return view.getVisibility() == View.INVISIBLE;
    }

    /**
     * 返回控件是否消失不见
     *
     * @param view 控件
     * @return 所求
     */
    public static boolean isGone(View view) {
        if (Checker.isNull(view)) return false;
        return view.getVisibility() == View.GONE;
    }

    /**
     * 设置点击事件
     *
     * @param view     控件
     * @param listener 点击事件监听
     */
    public static void setOnClickListener(View view, View.OnClickListener listener) {
        if (Checker.isNull(view)) return;
        if (Checker.isNull(listener)) return;
        view.setOnClickListener(listener);
    }

    /**
     * 设置控件显示本地图片
     *
     * @param view  图片控件
     * @param resId 本地图片的资源编号
     */
    public static void setImageResource(ImageView view, int resId) {
        if (Checker.isNull(view)) return;
        view.setImageResource(resId);
    }
}
