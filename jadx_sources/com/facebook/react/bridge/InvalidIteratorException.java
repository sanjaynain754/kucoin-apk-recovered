package com.facebook.react.bridge;

import org.jetbrains.annotations.NotNull;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InvalidIteratorException.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/react/bridge/InvalidIteratorException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "msg", "", "<init>", "(Ljava/lang/String;)V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44695a
public final class InvalidIteratorException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC44695a
    public InvalidIteratorException(@NotNull String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
