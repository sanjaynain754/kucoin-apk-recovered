package com.kubi.p110rn.core;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactConst.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/rn/core/ReactHostException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "code", "", "message", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ReactHostException extends RuntimeException {
    private final int code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactHostException(int i11, @NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i11;
    }

    public final int getCode() {
        return this.code;
    }
}
