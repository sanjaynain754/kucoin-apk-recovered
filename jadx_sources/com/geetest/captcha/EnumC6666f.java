package com.geetest.captcha;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.f */
/* JADX INFO: loaded from: classes45.dex */
public enum EnumC6666f {
    CENTER(TtmlNode.CENTER),
    BOTTOM(ViewProps.BOTTOM);


    @NotNull
    private String value;

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    EnumC6666f(String str) {
        this.value = str;
    }
}
