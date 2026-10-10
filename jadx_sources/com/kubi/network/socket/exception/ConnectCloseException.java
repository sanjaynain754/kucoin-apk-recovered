package com.kubi.network.socket.exception;

import com.kubi.utils.extensions.C27039d;
import com.tencent.imsdk.BaseConstants;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/network/socket/exception/ConnectCloseException;", "Lcom/kubi/network/socket/exception/ConnectBaseException;", "exception", "", "response", "Lokhttp3/Response;", "(Ljava/lang/Throwable;Lokhttp3/Response;)V", "getException", "()Ljava/lang/Throwable;", "getResponse", "()Lokhttp3/Response;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ConnectCloseException extends ConnectBaseException {

    @NotNull
    private final Throwable exception;

    @Nullable
    private final Response response;

    public /* synthetic */ ConnectCloseException(Throwable th2, Response response, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i11 & 2) != 0 ? null : response);
    }

    public ConnectCloseException(@NotNull Throwable exception, @Nullable Response response) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        int i11 = exception instanceof ClosedChannelException ? 10001 : exception instanceof UnknownHostException ? 10002 : exception instanceof SocketException ? BaseConstants.ERR_SVR_GROUP_API_NAME_ERROR : exception instanceof SocketTimeoutException ? BaseConstants.ERR_SVR_GROUP_INVALID_PARAMETERS : exception instanceof SSLException ? BaseConstants.ERR_SVR_GROUP_ACOUNT_COUNT_LIMIT : BaseConstants.ERR_SVR_GROUP_FREQ_LIMIT;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("code = ");
        sb2.append(C27039d.m66650j(response != null ? Integer.valueOf(response.code()) : null));
        sb2.append(", class = ");
        sb2.append(exception.getClass().getCanonicalName());
        super(i11, sb2.toString(), exception);
        this.exception = exception;
        this.response = response;
    }

    @NotNull
    public final Throwable getException() {
        return this.exception;
    }

    @Nullable
    public final Response getResponse() {
        return this.response;
    }
}
