package p799yj;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.host.core.InterfaceC15182d;
import com.kubi.host.core.MonitorConfig;
import com.kubi.host.utils.ConfigUrl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yj.a */
/* JADX INFO: compiled from: HostConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0001\u0013BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, m90084d2 = {"Lyj/a;", "", "", "configDefault", "Lcom/kubi/host/utils/ConfigUrl;", "configUrl", "", "configHeaders", "", "Lcom/kubi/host/core/d;", "configParsers", "Lcom/kubi/host/core/MonitorConfig;", "monitorConfig", "monitorInet4Default", "monitorInet6Default", "Lokhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Ljava/lang/String;Lcom/kubi/host/utils/ConfigUrl;Ljava/util/Map;Ljava/util/List;Lcom/kubi/host/core/MonitorConfig;Ljava/lang/String;Ljava/lang/String;Lokhttp3/OkHttpClient;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Lcom/kubi/host/utils/ConfigUrl;", "d", "()Lcom/kubi/host/utils/ConfigUrl;", "setConfigUrl", "(Lcom/kubi/host/utils/ConfigUrl;)V", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "Ljava/util/List;", "()Ljava/util/List;", "e", "Lcom/kubi/host/core/MonitorConfig;", "()Lcom/kubi/host/core/MonitorConfig;", "f", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lokhttp3/OkHttpClient;", "()Lokhttp3/OkHttpClient;", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C46509a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String configDefault;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public ConfigUrl configUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> configHeaders;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC15182d> configParsers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final MonitorConfig monitorConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String monitorInet4Default;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String monitorInet6Default;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final OkHttpClient okHttpClient;

    /* JADX INFO: renamed from: yj.a$a */
    /* JADX INFO: compiled from: HostConfig.kt */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0007J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0007J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m90084d2 = {"Lyj/a$a;", "", "<init>", "()V", "", "default", "b", "(Ljava/lang/String;)Lyj/a$a;", "Lcom/kubi/host/utils/ConfigUrl;", "config", "d", "(Lcom/kubi/host/utils/ConfigUrl;)Lyj/a$a;", "", "headers", "c", "(Ljava/util/Map;)Lyj/a$a;", "Lcom/kubi/host/core/MonitorConfig;", "monitorConfig", "e", "(Lcom/kubi/host/core/MonitorConfig;)Lyj/a$a;", "f", "g", "Lyj/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lyj/a;", "Ljava/lang/String;", "configDefault", "Lcom/kubi/host/utils/ConfigUrl;", "configUrl", "Ljava/util/Map;", "configHeaders", "", "Lcom/kubi/host/core/d;", "Ljava/util/List;", "configParsers", "Lcom/kubi/host/core/MonitorConfig;", "monitorInet4Default", "monitorInet6Default", "Lokhttp3/OkHttpClient;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lokhttp3/OkHttpClient;", "monitorOkHttpClient", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public String configDefault;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public ConfigUrl configUrl;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public Map<String, String> configHeaders;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public List<InterfaceC15182d> configParsers;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public MonitorConfig monitorConfig;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public String monitorInet4Default;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public String monitorInet6Default;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public OkHttpClient monitorOkHttpClient;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C46509a m102590a() {
            if (TextUtils.isEmpty(this.configDefault)) {
                this.configDefault = "{}";
            }
            if (this.configUrl == null) {
                this.configUrl = ConfigUrl.INSTANCE.m103793default();
            }
            if (this.configHeaders == null) {
                this.configHeaders = new HashMap();
            }
            if (this.configParsers == null) {
                this.configParsers = new ArrayList();
            }
            if (this.monitorConfig == null) {
                this.monitorConfig = MonitorConfig.INSTANCE.m103792default();
            }
            if (TextUtils.isEmpty(this.monitorInet4Default)) {
                this.monitorInet4Default = "";
            }
            if (TextUtils.isEmpty(this.monitorInet6Default)) {
                this.monitorInet6Default = "";
            }
            if (this.monitorOkHttpClient == null) {
                this.monitorOkHttpClient = new OkHttpClient.Builder().build();
            }
            String str = this.configDefault;
            Intrinsics.checkNotNull(str);
            ConfigUrl configUrl = this.configUrl;
            Intrinsics.checkNotNull(configUrl);
            Map<String, String> map = this.configHeaders;
            Intrinsics.checkNotNull(map);
            List<InterfaceC15182d> list = this.configParsers;
            Intrinsics.checkNotNull(list);
            MonitorConfig monitorConfig = this.monitorConfig;
            Intrinsics.checkNotNull(monitorConfig);
            String str2 = this.monitorInet4Default;
            Intrinsics.checkNotNull(str2);
            String str3 = this.monitorInet6Default;
            Intrinsics.checkNotNull(str3);
            OkHttpClient okHttpClient = this.monitorOkHttpClient;
            Intrinsics.checkNotNull(okHttpClient);
            return new C46509a(str, configUrl, map, list, monitorConfig, str2, str3, okHttpClient);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m102591b(@Nullable String str) {
            this.configDefault = str;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m102592c(@NotNull Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.configHeaders = headers;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m102593d(@NotNull ConfigUrl config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.configUrl = config;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a m102594e(@NotNull MonitorConfig monitorConfig) {
            Intrinsics.checkNotNullParameter(monitorConfig, "monitorConfig");
            this.monitorConfig = monitorConfig;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final a m102595f(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "default");
            this.monitorInet4Default = str;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final a m102596g(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "default");
            this.monitorInet6Default = str;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C46509a(@NotNull String configDefault, @NotNull ConfigUrl configUrl, @NotNull Map<String, String> configHeaders, @NotNull List<? extends InterfaceC15182d> configParsers, @NotNull MonitorConfig monitorConfig, @NotNull String monitorInet4Default, @NotNull String monitorInet6Default, @NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(configDefault, "configDefault");
        Intrinsics.checkNotNullParameter(configUrl, "configUrl");
        Intrinsics.checkNotNullParameter(configHeaders, "configHeaders");
        Intrinsics.checkNotNullParameter(configParsers, "configParsers");
        Intrinsics.checkNotNullParameter(monitorConfig, "monitorConfig");
        Intrinsics.checkNotNullParameter(monitorInet4Default, "monitorInet4Default");
        Intrinsics.checkNotNullParameter(monitorInet6Default, "monitorInet6Default");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.configDefault = configDefault;
        this.configUrl = configUrl;
        this.configHeaders = configHeaders;
        this.configParsers = configParsers;
        this.monitorConfig = monitorConfig;
        this.monitorInet4Default = monitorInet4Default;
        this.monitorInet6Default = monitorInet6Default;
        this.okHttpClient = okHttpClient;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConfigDefault() {
        return this.configDefault;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, String> m102583b() {
        return this.configHeaders;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<InterfaceC15182d> m102584c() {
        return this.configParsers;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ConfigUrl getConfigUrl() {
        return this.configUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final MonitorConfig getMonitorConfig() {
        return this.monitorConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMonitorInet4Default() {
        return this.monitorInet4Default;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getMonitorInet6Default() {
        return this.monitorInet6Default;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }
}
