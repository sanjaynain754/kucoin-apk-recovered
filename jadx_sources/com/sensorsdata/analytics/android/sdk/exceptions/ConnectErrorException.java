package com.sensorsdata.analytics.android.sdk.exceptions;

/* JADX INFO: loaded from: classes23.dex */
public class ConnectErrorException extends Exception {
    private int mRetryAfter;

    public ConnectErrorException(String str) {
        super(str);
        this.mRetryAfter = 30000;
    }

    public int getRetryAfter() {
        return this.mRetryAfter;
    }

    public ConnectErrorException(String str, String str2) {
        super(str);
        try {
            this.mRetryAfter = Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            this.mRetryAfter = 0;
        }
    }

    public ConnectErrorException(Throwable th2) {
        super(th2);
    }
}
