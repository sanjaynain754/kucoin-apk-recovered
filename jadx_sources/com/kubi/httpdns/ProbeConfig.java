package com.kubi.httpdns;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KHttpDns.kt */
/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/httpdns/ProbeConfig;", "", "host", "", "port", "", "(Ljava/lang/String;I)V", "getHost", "()Ljava/lang/String;", "getPort", "()I", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ProbeConfig {

    @NotNull
    private final String host;
    private final int port;

    public ProbeConfig(@NotNull String host, int i11) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
        this.port = i11;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    public final int getPort() {
        return this.port;
    }
}
