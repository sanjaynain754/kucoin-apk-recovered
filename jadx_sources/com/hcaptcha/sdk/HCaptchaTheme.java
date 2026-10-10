package com.hcaptcha.sdk;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.annotation.InterfaceC6294y;
import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
public enum HCaptchaTheme implements Serializable {
    DARK("dark"),
    LIGHT("light"),
    CONTRAST("contrast");

    private final String theme;

    public String getTheme() {
        return this.theme;
    }

    @Override // java.lang.Enum
    @NonNull
    @InterfaceC6294y
    public String toString() {
        return this.theme;
    }

    HCaptchaTheme(String str) {
        this.theme = str;
    }
}
