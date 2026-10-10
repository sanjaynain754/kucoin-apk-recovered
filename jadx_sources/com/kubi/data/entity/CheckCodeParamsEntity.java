package com.kubi.data.entity;

import androidx.annotation.Keep;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CheckCodeParamsEntity {
    private String bizType;
    private String loginToken;
    private String receiver;
    private int seq = 1;
    private HashMap<String, String> validations = new HashMap<>();

    public String getBizType() {
        return this.bizType;
    }

    public String getLoginToken() {
        return this.loginToken;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public int getSeq() {
        return this.seq;
    }

    public HashMap<String, String> getValidations() {
        return this.validations;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public void setLoginToken(String str) {
        this.loginToken = str;
    }

    public void setReceiver(String str) {
        this.receiver = str;
    }

    public void setSeq(int i11) {
        this.seq = i11;
    }

    public void setValidations(HashMap<String, String> map) {
        this.validations = map;
    }
}
