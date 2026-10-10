package com.kubi.sdk.base.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public class BaseEntity<T> {

    @SerializedName("code")
    private String code;

    @SerializedName("data")
    private T data;

    @SerializedName("msg")
    private String msg;

    @SerializedName("success")
    private boolean success;

    public String getCode() {
        if (this.code == null) {
            this.code = "";
        }
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public String getMsg() {
        if (this.msg == null) {
            this.msg = "";
        }
        return this.msg;
    }

    public boolean getSuccess() {
        return this.success || "200".equals(this.code);
    }

    public boolean needGeeTest() {
        return "40011".equals(this.code);
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setData(T t11) {
        this.data = t11;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setSuccess(boolean z11) {
        this.success = z11;
    }
}
