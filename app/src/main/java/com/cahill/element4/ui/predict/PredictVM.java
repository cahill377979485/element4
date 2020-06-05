package com.cahill.element4.ui.predict;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.blankj.utilcode.util.SPUtils;
import com.cahill.element4.bean.predict.ElementListBean;
import com.cahill.element4.bean.predict.ElementBean;
import com.cahill.element4.util.Checker;
import com.cahill.element4.util.Val;
import com.cahill.element4.util.ValSp;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class PredictVM extends ViewModel {

    private MutableLiveData<List<ElementBean>> list;

    public PredictVM() {
        list = new MutableLiveData<>();
        List<ElementBean> elementBeans = new ArrayList<>();
        elementBeans.add(new ElementBean(0, Val.SZ_NIAN, Val.TG_REN, Val.DZ_SHEN));
        elementBeans.add(new ElementBean(1, Val.SZ_YUE, Val.TG_JIA, Val.DZ_CHEN));
        elementBeans.add(new ElementBean(2, Val.SZ_RI, Val.TG_JIA, Val.DZ_ZI));
        elementBeans.add(new ElementBean(3, Val.SZ_SHI, Val.TG_BING, Val.DZ_WU));
        list.setValue(elementBeans);
//        String strElementList = SPUtils.getInstance(ValSp.SP_COMMON).getString(ValSp.STR_ELEMENT_LIST);
//        if (Checker.hasWord(strElementList)) {
//            ElementListBean elb = new Gson().fromJson(strElementList, ElementListBean.class);
//            list = (MutableLiveData<List<ElementBean>>) elb.getList();
//        }
    }

    public MutableLiveData<List<ElementBean>> getList() {
        return list;
    }
}