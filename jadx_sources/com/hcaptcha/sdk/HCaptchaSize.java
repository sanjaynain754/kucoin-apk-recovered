package com.hcaptcha.sdk;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.annotation.InterfaceC6294y;
import com.tencent.bugly.proguard.C33789m5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
public enum HCaptchaSize implements Serializable {
    INVISIBLE("invisible"),
    NORMAL(C33789m5.f70921k),
    COMPACT("compact");

    private final String size;

    public String getSize() {
        return this.size;
    }

    @Override // java.lang.Enum
    @NonNull
    @InterfaceC6294y
    public String toString() {
        return this.size;
    }

    HCaptchaSize(String str) {
        this.size = str;
    }
}
