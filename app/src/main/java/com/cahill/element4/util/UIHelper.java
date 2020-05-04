package com.cahill.element4.util;

import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * @author: 文琳
 * @time: 2020/5/2 23:35
 * @desc:
 */
public class UIHelper {
    public static void setText(TextView tv, String str) {
        if (Checker.isNull(tv)) return;
        if (Checker.isNull(str)) str = "";
        tv.setText(str);
    }
}
