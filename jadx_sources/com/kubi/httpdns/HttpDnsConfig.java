package com.kubi.httpdns;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.request.C15198b;
import com.kubi.httpdns.request.InterfaceC15201e;
import com.kubi.httpdns.track.C15207a;
import com.kubi.httpdns.track.IInterpretTrack;
import hk.C38222a;
import hk.InterfaceC38223b;
import java.util.List;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KHttpDns.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001:\u0001>B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b+\u0010#R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b,\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b0\u0010/R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, m90084d2 = {"Lcom/kubi/httpdns/HttpDnsConfig;", "", "Landroid/content/Context;", "context", "", "dnsEnable", "allowDiskCache", "", "allowRetryCount", "", "allowMaxTtl", "allowExpiredIp", "gloomyInterval", "", "", "preFetchHost", "Lcom/kubi/httpdns/ProbeConfig;", "probeConfig", "Lcom/kubi/httpdns/ServerConfig;", "serverConfig", "Lcom/kubi/httpdns/request/e;", "requestDecoder", "Lhk/b$a;", "requestTrackFactory", "Lcom/kubi/httpdns/track/IInterpretTrack$a;", "interpretTrackFactory", "Lokhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Landroid/content/Context;ZZIJZJLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/httpdns/request/e;Lhk/b$a;Lcom/kubi/httpdns/track/IInterpretTrack$a;Lokhttp3/OkHttpClient;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Z", "getDnsEnable", "()Z", "getAllowDiskCache", "I", "getAllowRetryCount", "()I", "J", "getAllowMaxTtl", "()J", "getAllowExpiredIp", "getGloomyInterval", "Ljava/util/List;", "getPreFetchHost", "()Ljava/util/List;", "getProbeConfig", "getServerConfig", "Lcom/kubi/httpdns/request/e;", "getRequestDecoder", "()Lcom/kubi/httpdns/request/e;", "Lhk/b$a;", "getRequestTrackFactory", "()Lhk/b$a;", "Lcom/kubi/httpdns/track/IInterpretTrack$a;", "getInterpretTrackFactory", "()Lcom/kubi/httpdns/track/IInterpretTrack$a;", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class HttpDnsConfig {
    private final boolean allowDiskCache;
    private final boolean allowExpiredIp;
    private final long allowMaxTtl;
    private final int allowRetryCount;

    @NotNull
    private final Context context;
    private final boolean dnsEnable;
    private final long gloomyInterval;

    @NotNull
    private final IInterpretTrack.InterfaceC15205a interpretTrackFactory;

    @NotNull
    private final OkHttpClient okHttpClient;

    @NotNull
    private final List<String> preFetchHost;

    @NotNull
    private final List<ProbeConfig> probeConfig;

    @NotNull
    private final InterfaceC15201e requestDecoder;

    @NotNull
    private final InterfaceC38223b.a requestTrackFactory;

    @NotNull
    private final List<ServerConfig> serverConfig;

    /* JADX INFO: renamed from: com.kubi.httpdns.HttpDnsConfig$a */
    /* JADX INFO: compiled from: KHttpDns.kt */
    @Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0007J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0011J\u001b\u0010\u0019\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010 \u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016¢\u0006\u0004\b \u0010\u001aJ\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010&R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010&R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, m90084d2 = {"Lcom/kubi/httpdns/HttpDnsConfig$a;", "", "<init>", "()V", "", "dnsEnable", "f", "(Z)Lcom/kubi/httpdns/HttpDnsConfig$a;", "allowDiskCache", "b", "", "allowRetryCount", "e", "(I)Lcom/kubi/httpdns/HttpDnsConfig$a;", "", "allowMaxTtl", "d", "(J)Lcom/kubi/httpdns/HttpDnsConfig$a;", "allowExpiredIp", "c", "gloomyInterval", "g", "", "", "preFetchHost", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/util/List;)Lcom/kubi/httpdns/HttpDnsConfig$a;", "Lcom/kubi/httpdns/ProbeConfig;", "probeConfig", "i", "Lcom/kubi/httpdns/ServerConfig;", "serverConfig", "j", "Landroid/content/Context;", "context", "Lcom/kubi/httpdns/HttpDnsConfig;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Lcom/kubi/httpdns/HttpDnsConfig;", "Z", "I", "J", "Ljava/util/List;", "Lcom/kubi/httpdns/request/e;", "Lcom/kubi/httpdns/request/e;", "requestDecoder", "Lhk/b$a;", "k", "Lhk/b$a;", "requestTrackFactory", "Lcom/kubi/httpdns/track/IInterpretTrack$a;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/kubi/httpdns/track/IInterpretTrack$a;", "interpretTrackFactory", "Lokhttp3/OkHttpClient;", "m", "Lokhttp3/OkHttpClient;", "okHttpClient", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C15191a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean dnsEnable;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean allowExpiredIp;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public List<ServerConfig> serverConfig;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public OkHttpClient okHttpClient;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean allowDiskCache = true;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int allowRetryCount = 1;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long allowMaxTtl = Long.MAX_VALUE;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public long gloomyInterval = 30;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public List<String> preFetchHost = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public List<ProbeConfig> probeConfig = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public InterfaceC15201e requestDecoder = new C15198b();

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public InterfaceC38223b.a requestTrackFactory = new C38222a();

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public IInterpretTrack.InterfaceC15205a interpretTrackFactory = new C15207a();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final HttpDnsConfig m31449a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            List<ServerConfig> list = this.serverConfig;
            if (list == null || list.isEmpty()) {
                this.serverConfig = CollectionsKt.listOf((Object[]) new ServerConfig[]{new ServerConfig("google", null, "https://dns.google/resolve", MapsKt.mapOf(TuplesKt.m90091to("type", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY), TuplesKt.m90091to("do", "1")), null, 18, null), new ServerConfig("cloudflare", null, "https://1.1.1.1/dns-query", null, MapsKt.mapOf(TuplesKt.m90091to("accept", "application/dns-json")), 10, null)});
            }
            if (this.okHttpClient == null) {
                this.okHttpClient = new OkHttpClient.Builder().build();
            }
            boolean z11 = this.dnsEnable;
            boolean z12 = this.allowDiskCache;
            int i11 = this.allowRetryCount;
            long j11 = this.allowMaxTtl;
            boolean z13 = this.allowExpiredIp;
            long j12 = this.gloomyInterval;
            List<String> list2 = this.preFetchHost;
            List<ProbeConfig> list3 = this.probeConfig;
            List<ServerConfig> list4 = this.serverConfig;
            Intrinsics.checkNotNull(list4);
            InterfaceC15201e interfaceC15201e = this.requestDecoder;
            InterfaceC38223b.a aVar = this.requestTrackFactory;
            IInterpretTrack.InterfaceC15205a interfaceC15205a = this.interpretTrackFactory;
            OkHttpClient okHttpClient = this.okHttpClient;
            Intrinsics.checkNotNull(okHttpClient);
            return new HttpDnsConfig(context, z11, z12, i11, j11, z13, j12, list2, list3, list4, interfaceC15201e, aVar, interfaceC15205a, okHttpClient);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C15191a m31450b(boolean allowDiskCache) {
            this.allowDiskCache = allowDiskCache;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C15191a m31451c(boolean allowExpiredIp) {
            this.allowExpiredIp = allowExpiredIp;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C15191a m31452d(long allowMaxTtl) {
            this.allowMaxTtl = allowMaxTtl;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C15191a m31453e(int allowRetryCount) {
            this.allowRetryCount = allowRetryCount;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C15191a m31454f(boolean dnsEnable) {
            this.dnsEnable = dnsEnable;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final C15191a m31455g(long gloomyInterval) {
            this.gloomyInterval = gloomyInterval;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C15191a m31456h(@NotNull List<String> preFetchHost) {
            Intrinsics.checkNotNullParameter(preFetchHost, "preFetchHost");
            this.preFetchHost = preFetchHost;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C15191a m31457i(@NotNull List<ProbeConfig> probeConfig) {
            Intrinsics.checkNotNullParameter(probeConfig, "probeConfig");
            this.probeConfig = probeConfig;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final C15191a m31458j(@NotNull List<ServerConfig> serverConfig) {
            Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
            this.serverConfig = serverConfig;
            return this;
        }
    }

    public HttpDnsConfig(@NotNull Context context, boolean z11, boolean z12, int i11, long j11, boolean z13, long j12, @NotNull List<String> preFetchHost, @NotNull List<ProbeConfig> probeConfig, @NotNull List<ServerConfig> serverConfig, @NotNull InterfaceC15201e requestDecoder, @NotNull InterfaceC38223b.a requestTrackFactory, @NotNull IInterpretTrack.InterfaceC15205a interpretTrackFactory, @NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preFetchHost, "preFetchHost");
        Intrinsics.checkNotNullParameter(probeConfig, "probeConfig");
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        Intrinsics.checkNotNullParameter(requestDecoder, "requestDecoder");
        Intrinsics.checkNotNullParameter(requestTrackFactory, "requestTrackFactory");
        Intrinsics.checkNotNullParameter(interpretTrackFactory, "interpretTrackFactory");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.context = context;
        this.dnsEnable = z11;
        this.allowDiskCache = z12;
        this.allowRetryCount = i11;
        this.allowMaxTtl = j11;
        this.allowExpiredIp = z13;
        this.gloomyInterval = j12;
        this.preFetchHost = preFetchHost;
        this.probeConfig = probeConfig;
        this.serverConfig = serverConfig;
        this.requestDecoder = requestDecoder;
        this.requestTrackFactory = requestTrackFactory;
        this.interpretTrackFactory = interpretTrackFactory;
        this.okHttpClient = okHttpClient;
    }

    public final boolean getAllowDiskCache() {
        return this.allowDiskCache;
    }

    public final boolean getAllowExpiredIp() {
        return this.allowExpiredIp;
    }

    public final long getAllowMaxTtl() {
        return this.allowMaxTtl;
    }

    public final int getAllowRetryCount() {
        return this.allowRetryCount;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final boolean getDnsEnable() {
        return this.dnsEnable;
    }

    public final long getGloomyInterval() {
        return this.gloomyInterval;
    }

    @NotNull
    public final IInterpretTrack.InterfaceC15205a getInterpretTrackFactory() {
        return this.interpretTrackFactory;
    }

    @NotNull
    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    @NotNull
    public final List<String> getPreFetchHost() {
        return this.preFetchHost;
    }

    @NotNull
    public final List<ProbeConfig> getProbeConfig() {
        return this.probeConfig;
    }

    @NotNull
    public final InterfaceC15201e getRequestDecoder() {
        return this.requestDecoder;
    }

    @NotNull
    public final InterfaceC38223b.a getRequestTrackFactory() {
        return this.requestTrackFactory;
    }

    @NotNull
    public final List<ServerConfig> getServerConfig() {
        return this.serverConfig;
    }
}
