package com.kubi.network.socket.exception;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NetworkException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/socket/exception/ConnectBaseException;", "Lcom/kubi/network/socket/exception/NetworkException;", "code", "", "reason", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getCode", "()I", "getReason", "()Ljava/lang/String;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class ConnectBaseException extends NetworkException {

    @Nullable
    private final Throwable cause;
    private final int code;

    @Nullable
    private final String reason;

    public ConnectBaseException(int i11, @Nullable String str, @Nullable Throwable th2) {
        super(i11, th2);
        this.code = i11;
        this.reason = str;
        this.cause = th2;
    }

    public /* synthetic */ ConnectBaseException(int i11, String str, Throwable th2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : th2);
    }

    @Override // com.kubi.network.socket.exception.NetworkException, java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // com.kubi.network.socket.exception.NetworkException
    public int getCode() {
        return this.code;
    }

    @Nullable
    public String getReason() {
        return this.reason;
    }
}
