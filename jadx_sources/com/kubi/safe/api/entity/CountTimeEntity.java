package com.kubi.safe.api.entity;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes40.dex */
@Keep
public class CountTimeEntity {
    private int maxRetryTimes;
    private int retryAfterSeconds;
    private int retryTimes;

    public int getMaxRetryTimes() {
        return this.maxRetryTimes;
    }

    public int getRetryAfterSeconds() {
        int i11 = this.retryAfterSeconds;
        if (i11 == 0) {
            return 60;
        }
        return i11;
    }

    public int getRetryTimes() {
        return this.retryTimes;
    }

    public void setMaxRetryTimes(int i11) {
        this.maxRetryTimes = i11;
    }

    public void setRetryAfterSeconds(int i11) {
        this.retryAfterSeconds = i11;
    }

    public void setRetryTimes(int i11) {
        this.retryTimes = i11;
    }
}
