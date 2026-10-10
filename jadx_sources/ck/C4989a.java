package ck;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ck.a */
/* JADX INFO: compiled from: HttpDnsResult.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u001eR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b \u0010!¨\u0006\""}, m90084d2 = {"Lck/a;", "", "", "host", "", "ips", "", "ttl", "timestamp", "", "fromDisk", "<init>", "(Ljava/lang/String;[Ljava/lang/String;JJZ)V", "e", "()Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "[Ljava/lang/String;", "d", "()[Ljava/lang/String;", "setIps", "([Ljava/lang/String;)V", "J", "getTtl", "getTimestamp", "setTimestamp", "(J)V", "Z", "setFromDisk", "(Z)V", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHttpDnsResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpDnsResult.kt\ncom/kubi/httpdns/core/HttpDnsResult\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,25:1\n26#2:26\n*S KotlinDebug\n*F\n+ 1 HttpDnsResult.kt\ncom/kubi/httpdns/core/HttpDnsResult\n*L\n10#1:26\n*E\n"})
public final class C4989a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String[] ips;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long ttl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long timestamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean fromDisk;

    public C4989a(@NotNull String host, @NotNull String[] ips, long j11, long j12, boolean z11) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(ips, "ips");
        this.host = host;
        this.ips = ips;
        this.ttl = j11;
        this.timestamp = j12;
        this.fromDisk = z11;
    }

    /* JADX INFO: renamed from: a */
    public final long m5290a() {
        return this.timestamp + (this.ttl * ((long) 1000));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFromDisk() {
        return this.fromDisk;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String[] getIps() {
        return this.ips;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5294e() {
        if (System.currentTimeMillis() > m5290a()) {
            return true;
        }
        return false;
    }
}
