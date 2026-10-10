package com.kubi.flutter.network.exception;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HttpException.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/flutter/network/exception/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "code", "", "message", "", "cause", "", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class HttpException extends RuntimeException {

    @Nullable
    private final Throwable cause;
    private final int code;

    @Nullable
    private final String message;

    public /* synthetic */ HttpException(int i11, String str, Throwable th2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : th2);
    }

    public HttpException(int i11, @Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
        this.code = i11;
        this.message = str;
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.message;
    }
}
