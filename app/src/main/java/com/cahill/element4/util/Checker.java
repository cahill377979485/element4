package com.cahill.element4.util;

import java.util.List;

/**
 * @author: 文琳
 * @time: 2020/5/2 23:32
 * @desc:
 */
public class Checker {
    public static boolean isNull(Object o) {
        return o == null;
    }

    public static boolean notNull(Object o) {
        return !isNull(o);
    }

    public static boolean hasList(List list) {
        return list != null && list.size() > 0;
    }

    public static boolean noList(List list) {
        return !hasList(list);
    }

    public static boolean hasWord(String str) {
        return str != null && str.length() > 0;
    }

    public static boolean noWord(String str){
        return !hasWord(str);
    }

}
