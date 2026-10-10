package com.kubi.httpdns.interpret;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InterpretResponse.kt */
/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/httpdns/interpret/IpInfo;", "", "type", "", "ip", "", "ttl", "(ILjava/lang/String;I)V", "getIp", "()Ljava/lang/String;", "getTtl", "()I", "getType", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class IpInfo {

    @NotNull
    private final String ip;
    private final int ttl;
    private final int type;

    public IpInfo(int i11, @NotNull String ip2, int i12) {
        Intrinsics.checkNotNullParameter(ip2, "ip");
        this.type = i11;
        this.ip = ip2;
        this.ttl = i12;
    }

    @NotNull
    public final String getIp() {
        return this.ip;
    }

    public final int getTtl() {
        return this.ttl;
    }

    public final int getType() {
        return this.type;
    }
}
