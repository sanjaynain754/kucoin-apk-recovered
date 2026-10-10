package com.kubi.httpdns.exception;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpDnsException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/httpdns/exception/InterpretException;", "Lcom/kubi/httpdns/exception/HttpDnsException;", "throwable", "", "(Ljava/lang/Throwable;)V", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class InterpretException extends HttpDnsException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterpretException(@NotNull Throwable throwable) {
        super(10000, null, throwable, 2, null);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }
}
