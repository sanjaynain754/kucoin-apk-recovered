package com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils;

/* JADX INFO: loaded from: classes63.dex */
class TPRequestItem {
    private int mRequestType;
    private String mUrl;
    private int mRequestTimes = 0;
    private long mRequestFailedTime = -1;

    public long getRequestFailedTime() {
        return this.mRequestFailedTime;
    }

    public int getRequestTimes() {
        return this.mRequestTimes;
    }

    public int getRequestType() {
        return this.mRequestType;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public TPRequestItem(String str, int i11) {
        this.mUrl = str;
        this.mRequestType = i11;
    }

    public void updateFailedTime() {
        this.mRequestFailedTime = System.currentTimeMillis();
        this.mRequestTimes++;
    }
}
