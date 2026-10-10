package com.kubi.network.socket.exception;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: NetworkException.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/network/socket/exception/RequestTimeoutException;", "Lcom/kubi/network/socket/exception/RequestBaseException;", "cause", "", "(Ljava/lang/Throwable;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RequestTimeoutException extends RequestBaseException {
    public RequestTimeoutException(@Nullable Throwable th2) {
        super(10000, th2);
    }
}
