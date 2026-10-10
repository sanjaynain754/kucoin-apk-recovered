package com.sensorsdata.analytics.android.sdk.exceptions;

/* JADX INFO: loaded from: classes23.dex */
public class ResponseErrorException extends Exception {
    private int httpCode;

    public ResponseErrorException(String str, int i11) {
        super(str);
        this.httpCode = i11;
    }

    public int getHttpCode() {
        return this.httpCode;
    }

    public ResponseErrorException(Throwable th2, int i11) {
        super(th2);
        this.httpCode = i11;
    }
}
