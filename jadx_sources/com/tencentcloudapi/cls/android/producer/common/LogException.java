package com.tencentcloudapi.cls.android.producer.common;

/* JADX INFO: loaded from: classes2.dex */
public class LogException extends Exception {
    private String errorCode;
    private int httpCode;

    public LogException(String str, String str2) {
        super(str2);
        this.httpCode = -1;
        this.errorCode = str;
    }

    public String GetErrorCode() {
        return this.errorCode;
    }

    public int GetHttpCode() {
        return this.httpCode;
    }

    public void SetHttpCode(int i11) {
        this.httpCode = i11;
    }

    public String GetErrorMessage() {
        return super.getMessage();
    }

    public LogException(String str, String str2, Throwable th2) {
        super(str2, th2);
        this.httpCode = -1;
        this.errorCode = str;
    }

    public LogException(int i11, String str, String str2) {
        super(str2);
        this.httpCode = i11;
        this.errorCode = str;
    }
}
