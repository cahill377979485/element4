package com.cahill.element4.ui.predict;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.blankj.utilcode.util.SPUtils;
import com.cahill.element4.binder.predict.ElementListBean;
import com.cahill.element4.model.predict.ElementBean;
import com.cahill.element4.util.Checker;
import com.cahill.element4.util.ValSp;
import com.google.gson.Gson;

import java.util.List;

public class PredictVM extends ViewModel {

    private MutableLiveData<List<ElementBean>> list;

    public PredictVM() {
        list = new MutableLiveData<>();
        String strElementList = SPUtils.getInstance(ValSp.SP_COMMON).getString(ValSp.STR_ELEMENT_LIST);
        if (Checker.hasWord(strElementList)) {
            ElementListBean elb = new Gson().fromJson(strElementList, ElementListBean.class);
            list = (MutableLiveData<List<ElementBean>>) elb.getList();
        }
    }

    public MutableLiveData<List<ElementBean>> getList() {
        return list;
    }
}