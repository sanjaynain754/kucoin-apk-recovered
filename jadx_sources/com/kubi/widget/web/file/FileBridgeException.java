package com.kubi.widget.web.file;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileBridgeResult.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/widget/web/file/FileBridgeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCode", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getErrorCode", "()Ljava/lang/String;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FileBridgeException extends Exception {

    @NotNull
    private final String errorCode;

    public /* synthetic */ FileBridgeException(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileBridgeException(@NotNull String errorCode, @Nullable Throwable th2) {
        super(errorCode, th2);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.errorCode = errorCode;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }
}
