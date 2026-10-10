package com.facebook.react.uimanager;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoSuchNativeViewException.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/uimanager/NoSuchNativeViewException;", "Lcom/facebook/react/uimanager/IllegalViewOperationException;", "detailMessage", "", "<init>", "(Ljava/lang/String;)V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NoSuchNativeViewException extends IllegalViewOperationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoSuchNativeViewException(@NotNull String detailMessage) {
        super(detailMessage);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
    }
}
