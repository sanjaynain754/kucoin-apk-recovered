package com.kubi.network.socket.exception;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NetworkException.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/network/socket/exception/RequestBaseException;", "Lcom/kubi/network/socket/exception/NetworkException;", "code", "", "cause", "", "(ILjava/lang/Throwable;)V", "getCode", "()I", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class RequestBaseException extends NetworkException {
    private final int code;

    public RequestBaseException(int i11, @Nullable Throwable th2) {
        super(i11, th2);
        this.code = i11;
    }

    public /* synthetic */ RequestBaseException(int i11, Throwable th2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : th2);
    }

    @Override // com.kubi.network.socket.exception.NetworkException
    public int getCode() {
        return this.code;
    }
}
