package com.kubi.network.socket.exception;

import com.tencent.imsdk.BaseConstants;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: NetworkException.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/kubi/network/socket/exception/ConnectUnknownException;", "Lcom/kubi/network/socket/exception/ConnectBaseException;", "()V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ConnectUnknownException extends ConnectBaseException {
    public ConnectUnknownException() {
        super(BaseConstants.ERR_SVR_GROUP_PERMISSION_DENY, null, null, 6, null);
    }
}
