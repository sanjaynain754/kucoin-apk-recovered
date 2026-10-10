package com.geetest.captcha;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.i */
/* JADX INFO: loaded from: classes45.dex */
public enum EnumC6672i {
    WEB_VIEW_NEW("0"),
    PARAM("1"),
    WEB_VIEW_HTTP("2"),
    WEB_VIEW_SSL("3"),
    USER_ERROR("4"),
    WEB_CALLBACK_ERROR("5"),
    NET("6");


    @NotNull
    private String type;

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    EnumC6672i(String str) {
        this.type = str;
    }
}
