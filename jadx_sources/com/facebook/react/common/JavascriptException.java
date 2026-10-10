package com.facebook.react.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JavascriptException.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/react/common/JavascriptException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "jsStackTrace", "", "<init>", "(Ljava/lang/String;)V", "extraDataAsJson", "getExtraDataAsJson", "()Ljava/lang/String;", "setExtraDataAsJson", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44695a
public class JavascriptException extends RuntimeException {

    @Nullable
    private String extraDataAsJson;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavascriptException(@NotNull String jsStackTrace) {
        super(jsStackTrace);
        Intrinsics.checkNotNullParameter(jsStackTrace, "jsStackTrace");
    }

    @Nullable
    public final String getExtraDataAsJson() {
        return this.extraDataAsJson;
    }

    public final void setExtraDataAsJson(@Nullable String str) {
        this.extraDataAsJson = str;
    }
}
