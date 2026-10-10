package com.kubi.httpdns.exception;

import dk.C36725b;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HttpDnsException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u0010\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/httpdns/exception/HttpDnsException;", "Ljava/io/IOException;", "Lokio/IOException;", "code", "", "msg", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class HttpDnsException extends IOException {

    @Nullable
    private final Throwable cause;
    private final int code;

    @Nullable
    private final String msg;

    public HttpDnsException(int i11, @Nullable String str, @Nullable Throwable th2) {
        super(C36725b.m82302c(Integer.valueOf(i11), str), th2);
        this.code = i11;
        this.msg = str;
        this.cause = th2;
    }

    public /* synthetic */ HttpDnsException(int i11, String str, Throwable th2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    public int getCode() {
        return this.code;
    }

    @Nullable
    public String getMsg() {
        return this.msg;
    }
}
