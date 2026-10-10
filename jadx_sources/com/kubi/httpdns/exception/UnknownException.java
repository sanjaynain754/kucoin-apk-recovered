package com.kubi.httpdns.exception;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HttpDnsException.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/httpdns/exception/UnknownException;", "Lcom/kubi/httpdns/exception/HttpDnsException;", "throwable", "", "(Ljava/lang/Throwable;)V", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class UnknownException extends HttpDnsException {
    /* JADX WARN: Multi-variable type inference failed */
    public UnknownException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public UnknownException(@Nullable Throwable th2) {
        super(40000, null, th2, 2, null);
    }

    public /* synthetic */ UnknownException(Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : th2);
    }
}
