package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;

/* JADX INFO: loaded from: classes45.dex */
@DoNotStrip
public class CppSystemErrorException extends CppException {
    int errorCode;

    public int getErrorCode() {
        return this.errorCode;
    }

    @DoNotStrip
    public CppSystemErrorException(String str, int i11) {
        super(str);
        this.errorCode = i11;
    }
}
