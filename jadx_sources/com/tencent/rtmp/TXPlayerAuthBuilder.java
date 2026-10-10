package com.tencent.rtmp;

/* JADX INFO: loaded from: classes56.dex */
public class TXPlayerAuthBuilder {
    int appId;
    int exper = -1;
    String fileId;
    protected boolean isHttps;
    String sign;
    String timeout;

    /* JADX INFO: renamed from: us */
    String f75357us;

    public int getAppId() {
        return this.appId;
    }

    public int getExper() {
        return this.exper;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getSign() {
        return this.sign;
    }

    public String getTimeout() {
        return this.timeout;
    }

    public String getUs() {
        return this.f75357us;
    }

    public boolean isHttps() {
        return this.isHttps;
    }

    public void setAppId(int i11) {
        this.appId = i11;
    }

    public void setExper(int i11) {
        this.exper = i11;
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public void setHttps(boolean z11) {
        this.isHttps = z11;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setTimeout(String str) {
        this.timeout = str;
    }

    public void setUs(String str) {
        this.f75357us = str;
    }
}
