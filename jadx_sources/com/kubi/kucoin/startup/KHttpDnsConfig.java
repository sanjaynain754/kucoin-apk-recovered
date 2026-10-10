package com.kubi.kucoin.startup;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.kubi.httpdns.ProbeConfig;
import com.kubi.httpdns.ServerConfig;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HttpDnsStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001e\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!¨\u0006$"}, m90084d2 = {"Lcom/kubi/kucoin/startup/KHttpDnsConfig;", "", "dnsEnable", "", "allowDiskCache", "allowRetryCount", "", "allowMaxTtl", "", "allowExpiredIp", "gloomyInterval", "preFetchHost", "", "", "probeConfig", "Lcom/kubi/httpdns/ProbeConfig;", "serverConfig", "Lcom/kubi/httpdns/ServerConfig;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDnsEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowDiskCache", "getAllowRetryCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAllowMaxTtl", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAllowExpiredIp", "getGloomyInterval", "getPreFetchHost", "()Ljava/util/List;", "getProbeConfig", "getServerConfig", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KHttpDnsConfig {

    @Nullable
    private final Boolean allowDiskCache;

    @Nullable
    private final Boolean allowExpiredIp;

    @Nullable
    private final Long allowMaxTtl;

    @Nullable
    private final Integer allowRetryCount;

    @Nullable
    private final Boolean dnsEnable;

    @Nullable
    private final Long gloomyInterval;

    @Nullable
    private final List<String> preFetchHost;

    @Nullable
    private final List<ProbeConfig> probeConfig;

    @Nullable
    private final List<ServerConfig> serverConfig;

    public KHttpDnsConfig() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public KHttpDnsConfig(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Long l11, @Nullable Boolean bool3, @Nullable Long l12, @Nullable List<String> list, @Nullable List<ProbeConfig> list2, @Nullable List<ServerConfig> list3) {
        this.dnsEnable = bool;
        this.allowDiskCache = bool2;
        this.allowRetryCount = num;
        this.allowMaxTtl = l11;
        this.allowExpiredIp = bool3;
        this.gloomyInterval = l12;
        this.preFetchHost = list;
        this.probeConfig = list2;
        this.serverConfig = list3;
    }

    @Nullable
    public final Boolean getAllowDiskCache() {
        return this.allowDiskCache;
    }

    @Nullable
    public final Boolean getAllowExpiredIp() {
        return this.allowExpiredIp;
    }

    @Nullable
    public final Long getAllowMaxTtl() {
        return this.allowMaxTtl;
    }

    @Nullable
    public final Integer getAllowRetryCount() {
        return this.allowRetryCount;
    }

    @Nullable
    public final Boolean getDnsEnable() {
        return this.dnsEnable;
    }

    @Nullable
    public final Long getGloomyInterval() {
        return this.gloomyInterval;
    }

    @Nullable
    public final List<String> getPreFetchHost() {
        return this.preFetchHost;
    }

    @Nullable
    public final List<ProbeConfig> getProbeConfig() {
        return this.probeConfig;
    }

    @Nullable
    public final List<ServerConfig> getServerConfig() {
        return this.serverConfig;
    }

    public /* synthetic */ KHttpDnsConfig(Boolean bool, Boolean bool2, Integer num, Long l11, Boolean bool3, Long l12, List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : bool3, (i11 & 32) != 0 ? null : l12, (i11 & 64) != 0 ? null : list, (i11 & 128) != 0 ? null : list2, (i11 & 256) != 0 ? null : list3);
    }
}
