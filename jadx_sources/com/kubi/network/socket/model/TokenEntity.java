package com.kubi.network.socket.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/network/socket/model/TokenEntity;", "", "wsUrl", "", "pingInterval", "", "pingTimeout", "(Ljava/lang/String;II)V", "getPingInterval", "()I", "getPingTimeout", "getWsUrl", "()Ljava/lang/String;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class TokenEntity {
    private final int pingInterval;
    private final int pingTimeout;

    @NotNull
    private final String wsUrl;

    public TokenEntity(@NotNull String wsUrl, int i11, int i12) {
        Intrinsics.checkNotNullParameter(wsUrl, "wsUrl");
        this.wsUrl = wsUrl;
        this.pingInterval = i11;
        this.pingTimeout = i12;
    }

    public final int getPingInterval() {
        return this.pingInterval;
    }

    public final int getPingTimeout() {
        return this.pingTimeout;
    }

    @NotNull
    public final String getWsUrl() {
        return this.wsUrl;
    }
}
