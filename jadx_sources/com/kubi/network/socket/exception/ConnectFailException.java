package com.kubi.network.socket.exception;

import com.tencent.imsdk.BaseConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/network/socket/exception/ConnectFailException;", "Lcom/kubi/network/socket/exception/ConnectBaseException;", "cause", "", "(Ljava/lang/Throwable;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ConnectFailException extends ConnectBaseException {
    /* JADX WARN: Illegal instructions before constructor call */
    public ConnectFailException(@NotNull Throwable cause) {
        String str;
        Intrinsics.checkNotNullParameter(cause, "cause");
        int code = cause instanceof ConnectTimeoutException ? BaseConstants.ERR_SVR_FRIENDSHIP_INVALID_PARAMETERS : cause instanceof ConnectBaseException ? ((ConnectBaseException) cause).getCode() : BaseConstants.ERR_SVR_FRIENDSHIP_NET_TIMEOUT;
        if (cause instanceof ConnectBaseException) {
            str = "connect fail, reason = " + ((ConnectBaseException) cause).getReason();
        } else {
            str = "connect fail, class = " + cause.getClass().getCanonicalName();
        }
        super(code, str, cause);
    }
}
