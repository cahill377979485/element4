package com.cahill.element4.util;

import androidx.core.content.ContextCompat;

import com.cahill.element4.R;
import com.cahill.element4.base.MyApplication;

/**
 * @author 文琳
 * @time 2020/6/5 14:07
 * @desc 地支与五行
 * 子（鼠）属阳水，北方；亥（猪）属阴水，北方。
 * 寅（虎）属阳木，东方；卯（兔）属阴木，东方。
 * 巳（蛇）属阴火，南方；午（马）属阳火，南方。
 * 申（猴）属阳金，西方；酉（鸡）属阴金，西方。
 * 辰（龙）、戌（犬）属阳土，中央；
 * 丑（牛）、未（羊）属阴土，中央。
 * 天干与五行
 * 甲为栋梁之木，乙为花果之木，甲乙东方木。
 * 丙为太阳之火，丁为灯烛之火，丙丁南方火。
 * 戊为城墙之土，己为田园之土，戊己中央土。
 * 庚为斧钺之金，辛为首饰之金，庚辛西方金。
 * 壬为江河之水，癸为雨露之水，壬癸北方水。
 */
public class EleUtil {

    public static int getColorIdByYY(String yy) {
        return yy.equals(Val.YY_YANG) ? R.color.myTitle : R.color.myGray;
    }

    public static int getColorIdByWX(String wx) {
        return Val.WX_COLOR[getPositionByWX(wx)];
    }

    public static String getYYbyTG(String tg) {
        int position = getPositionByTG(tg);
        return position % 2 == 0 ? Val.YY_YANG : Val.YY_YIN;
    }

    public static String getWXbyTG(String tg) {
        int position = getPositionByTG(tg);
        return Val.WXsBorn[position / 2];
    }

    public static String getYYbyDZ(String dz) {
        int position = getPositionByTG(dz);
        return position == 0 ? Val.YY_YANG : Val.YY_YIN;
    }

    public static String getWXbyDZ(String dz) {
        int position = getPositionByTG(dz);
        switch (position) {
            case 0://子
            case 11://亥
                return Val.WX_SHUI;
            case 2://寅
            case 3://卯
                return Val.WX_MU;
            case 5://巳
            case 6://午
                return Val.WX_JIN;
            case 8://申
            case 9://酉
                return Val.WX_HUO;
            default:
                return Val.WX_TU;
        }
    }

    public static int getPositionByWX(String wx) {
        for (int i = 0; i < Val.WXsKill.length; i++) {
            if (Val.WXsKill[i].contains(wx)) return i;
        }
        return 0;
    }

    public static int getPositionByTG(String tg) {
        for (int i = 0; i < Val.TGs.length; i++) {
            if (Val.TGs[i].contains(tg)) return i;
        }
        return 0;
    }

    public static int getPositionByDZ(String dz) {
        for (int i = 0; i < Val.DZs.length; i++) {
            if (Val.DZs[i].contains(dz)) return i;
        }
        return 0;
    }
}
