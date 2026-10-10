package com.kubi.network.socket.exception;

import com.tencent.imsdk.BaseConstants;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: NetworkException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/kubi/network/socket/exception/FlowTimeoutException;", "Lcom/kubi/network/socket/exception/ConnectBaseException;", "()V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FlowTimeoutException extends ConnectBaseException {
    public FlowTimeoutException() {
        super(BaseConstants.ERR_SVR_GROUP_INVALID_REQ, null, null, 6, null);
    }
}
