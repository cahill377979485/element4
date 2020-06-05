package com.cahill.element4.bean.predict;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author: 文琳
 * @time: 2020/5/4 14:58
 * @desc: 四柱的其中一个对象
 */
public class ElementBean implements Parcelable {
    private int id;
    private String name;
    private String TG;//tiangan
    private String DZ;//dizhi
    private boolean check;

    public ElementBean(int id, String name, String TG, String DZ) {
        this.id = id;
        this.name = name;
        this.TG = TG;
        this.DZ = DZ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTG() {
        return TG;
    }

    public void setTG(String TG) {
        this.TG = TG;
    }

    public String getDZ() {
        return DZ;
    }

    public void setDZ(String DZ) {
        this.DZ = DZ;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.TG);
        dest.writeString(this.DZ);
        dest.writeByte(this.check ? (byte) 1 : (byte) 0);
    }

    protected ElementBean(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.TG = in.readString();
        this.DZ = in.readString();
        this.check = in.readByte() != 0;
    }

    public static final Creator<ElementBean> CREATOR = new Creator<ElementBean>() {
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
