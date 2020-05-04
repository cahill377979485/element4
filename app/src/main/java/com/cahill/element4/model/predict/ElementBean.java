package com.cahill.element4.model.predict;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author: 文琳
 * @time: 2020/5/4 14:58
 * @desc: 四柱的其中一个对象
 */
public class ElementBean implements Parcelable {
    private String text;
    private String name;
    private int position;

    public ElementBean(String text, String name, int position) {
        this.text = text;
        this.name = name;
        this.position = position;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeString(this.name);
        dest.writeInt(this.position);
    }

    protected ElementBean(Parcel in) {
        this.text = in.readString();
        this.name = in.readString();
        this.position = in.readInt();
    }

    public static final Parcelable.Creator<ElementBean> CREATOR = new Parcelable.Creator<ElementBean>() {
        @Override
        public ElementBean createFromParcel(Parcel source) {
            return new ElementBean(source);
        }

        @Override
        public ElementBean[] newArray(int size) {
            return new ElementBean[size];
        }
    };
}
