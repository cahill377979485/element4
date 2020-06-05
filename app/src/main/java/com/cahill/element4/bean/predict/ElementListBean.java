package com.cahill.element4.bean.predict;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * @author: 文琳
 * @time: 2020/5/4 15:12
 * @desc:
 */
public class ElementListBean implements Parcelable {
    private List<ElementBean> list;

    public ElementListBean(List<ElementBean> list) {
        this.list = list;
    }

    public List<ElementBean> getList() {
        return list;
    }

    public void setList(List<ElementBean> list) {
        this.list = list;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.list);
    }

    protected ElementListBean(Parcel in) {
        this.list = in.createTypedArrayList(ElementBean.CREATOR);
    }

    public static final Parcelable.Creator<ElementListBean> CREATOR = new Parcelable.Creator<ElementListBean>() {
        @Override
        public ElementListBean createFromParcel(Parcel source) {
            return new ElementListBean(source);
        }

        @Override
        public ElementListBean[] newArray(int size) {
            return new ElementListBean[size];
        }
    };
}
