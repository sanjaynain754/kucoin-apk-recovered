package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeCoreCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreApiInfo;", "", "web", "", "host", "api", "zendeskUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApi", "()Ljava/lang/String;", "getHost", "getWeb", "getZendeskUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeCoreApiInfo {

    @NotNull
    private final String api;

    @NotNull
    private final String host;

    @NotNull
    private final String web;

    @NotNull
    private final String zendeskUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeCoreApiInfo)) {
            return false;
        }
        KCFlutterBridgeCoreApiInfo kCFlutterBridgeCoreApiInfo = (KCFlutterBridgeCoreApiInfo) other;
        return Intrinsics.areEqual(this.web, kCFlutterBridgeCoreApiInfo.web) && Intrinsics.areEqual(this.host, kCFlutterBridgeCoreApiInfo.host) && Intrinsics.areEqual(this.api, kCFlutterBridgeCoreApiInfo.api) && Intrinsics.areEqual(this.zendeskUrl, kCFlutterBridgeCoreApiInfo.zendeskUrl);
    }

    public KCFlutterBridgeCoreApiInfo(@NotNull String web, @NotNull String host, @NotNull String api, @NotNull String zendeskUrl) {
        Intrinsics.checkNotNullParameter(web, "web");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(zendeskUrl, "zendeskUrl");
        this.web = web;
        this.host = host;
        this.api = api;
        this.zendeskUrl = zendeskUrl;
    }

    public static /* synthetic */ KCFlutterBridgeCoreApiInfo copy$default(KCFlutterBridgeCoreApiInfo kCFlutterBridgeCoreApiInfo, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgeCoreApiInfo.web;
        }
        if ((i11 & 2) != 0) {
            str2 = kCFlutterBridgeCoreApiInfo.host;
        }
        if ((i11 & 4) != 0) {
            str3 = kCFlutterBridgeCoreApiInfo.api;
        }
        if ((i11 & 8) != 0) {
            str4 = kCFlutterBridgeCoreApiInfo.zendeskUrl;
        }
        return kCFlutterBridgeCoreApiInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWeb() {
        return this.web;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApi() {
        return this.api;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getZendeskUrl() {
        return this.zendeskUrl;
    }

    @NotNull
    public final KCFlutterBridgeCoreApiInfo copy(@NotNull String web, @NotNull String host, @NotNull String api, @NotNull String zendeskUrl) {
        Intrinsics.checkNotNullParameter(web, "web");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(zendeskUrl, "zendeskUrl");
        return new KCFlutterBridgeCoreApiInfo(web, host, api, zendeskUrl);
    }

    @NotNull
    public final String getApi() {
        return this.api;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getWeb() {
        return this.web;
    }

    @NotNull
    public final String getZendeskUrl() {
        return this.zendeskUrl;
    }

    public int hashCode() {
        return (((((this.web.hashCode() * 31) + this.host.hashCode()) * 31) + this.api.hashCode()) * 31) + this.zendeskUrl.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("web", this.web);
        linkedHashMap.put("host", this.host);
        linkedHashMap.put("api", this.api);
        linkedHashMap.put("zendeskUrl", this.zendeskUrl);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeCoreApiInfo(web=" + this.web + ", host=" + this.host + ", api=" + this.api + ", zendeskUrl=" + this.zendeskUrl + ')';
    }
}
