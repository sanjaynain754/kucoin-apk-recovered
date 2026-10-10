package com.kubi.network.socket.exception;

import com.kubi.network.retrofit.exception.ApiException;
import com.tencent.imsdk.BaseConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/network/socket/exception/TokenFailException;", "Lcom/kubi/network/socket/exception/ConnectBaseException;", "cause", "", "(Ljava/lang/Throwable;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class TokenFailException extends ConnectBaseException {
    /* JADX WARN: Illegal instructions before constructor call */
    public TokenFailException(@NotNull Throwable cause) {
        String str;
        Intrinsics.checkNotNullParameter(cause, "cause");
        int code = cause instanceof ApiException ? BaseConstants.ERR_SVR_MSG_PKG_PARSE_FAILED : cause instanceof TokenTimeoutException ? BaseConstants.ERR_SVR_MSG_INTERNAL_AUTH_FAILED : cause instanceof ConnectBaseException ? ((ConnectBaseException) cause).getCode() : BaseConstants.ERR_SVR_MSG_IN_PEER_BLACKLIST;
        if (cause instanceof ConnectBaseException) {
            str = "token fail, reason = " + ((ConnectBaseException) cause).getReason();
        } else {
            str = "token fail, class = " + cause.getClass().getCanonicalName();
        }
        super(code, str, cause);
    }
}
