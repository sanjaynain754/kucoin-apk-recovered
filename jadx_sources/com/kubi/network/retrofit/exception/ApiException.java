package com.kubi.network.retrofit.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ApiException extends IOException {
    public final String code;
    public final Object data;
    public final String dataStr;

    public ApiException(String str, String str2, Object obj) {
        this(str, str2, obj, null);
    }

    public ApiException(String str, String str2, Object obj, String str3) {
        super(str2);
        this.code = str;
        this.data = obj;
        this.dataStr = str3;
    }

    public String getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        Object obj = this.data;
        if (obj == null || !(obj instanceof Throwable)) {
            super.printStackTrace();
        } else {
            ((Throwable) obj).printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + this.code;
    }
}
