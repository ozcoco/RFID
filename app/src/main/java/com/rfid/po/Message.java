package com.rfid.po;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.Ignore;

import java.io.Serializable;

public class Message implements Serializable, Cloneable, Parcelable {

    /*** 请求响应正常且数据不为空 ***/
    @Ignore
    public final static int OK = 0;

    /*** 请求响应正常且数据为空 ***/
    @Ignore
    public final static int DATA_EMPTY = 4;

    /*** 请求参数错误或缺少参数 ***/
    @Ignore
    public final static int ERR_NORMAL = 1;

    /*** 服务器异常 ***/
    @Ignore
    public final static int ERR_SERVER = 2;

    /*** 网络异常 ***/
    @Ignore
    public final static int ERR_NETWORK = 3;


    @Ignore
    private int code;

    @Ignore
    private String msg;

    @Ignore
    private byte[] data;


    @Ignore
    public Message() {
    }

    @Ignore
    public Message(int code, String msg, byte[] data) {
        this.code = code;
        this.msg = msg;
        this.data = data;

    }

    @Ignore
    protected Message(Parcel in) {
        code = in.readInt();
        msg = in.readString();
        data = in.createByteArray();
    }

    @Ignore
    public static final Creator<Message> CREATOR = new Creator<Message>() {
        @Override
        public Message createFromParcel(Parcel in) {
            return new Message(in);
        }

        @Override
        public Message[] newArray(int size) {
            return new Message[size];
        }
    };

    @Ignore
    public static Message newInstance() {

        return new Message();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Ignore
    @Override
    public int describeContents() {
        return 0;
    }

    @Ignore
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(code);
        dest.writeString(msg);
        dest.writeByteArray(data);
    }
}
