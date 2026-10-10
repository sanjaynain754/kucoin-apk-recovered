package com.hcaptcha.sdk;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.annotation.InterfaceC6294y;
import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
public enum HCaptchaOrientation implements Serializable {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape");

    private final String orientation;

    public String getOrientation() {
        return this.orientation;
    }

    @Override // java.lang.Enum
    @NonNull
    @InterfaceC6294y
    public String toString() {
        return this.orientation;
    }

    HCaptchaOrientation(String str) {
        this.orientation = str;
    }
}
