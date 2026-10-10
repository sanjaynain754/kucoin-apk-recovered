package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeUserCenterCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeUserCenterUserPoliciesInfo;", "", "type", "", "url", "", "name", "(JLjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "()J", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeUserCenterUserPoliciesInfo {

    @NotNull
    private final String name;
    private final long type;

    @NotNull
    private final String url;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeUserCenterUserPoliciesInfo)) {
            return false;
        }
        KCFlutterBridgeUserCenterUserPoliciesInfo kCFlutterBridgeUserCenterUserPoliciesInfo = (KCFlutterBridgeUserCenterUserPoliciesInfo) other;
        return this.type == kCFlutterBridgeUserCenterUserPoliciesInfo.type && Intrinsics.areEqual(this.url, kCFlutterBridgeUserCenterUserPoliciesInfo.url) && Intrinsics.areEqual(this.name, kCFlutterBridgeUserCenterUserPoliciesInfo.name);
    }

    public KCFlutterBridgeUserCenterUserPoliciesInfo(long j11, @NotNull String url, @NotNull String name) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        this.type = j11;
        this.url = url;
        this.name = name;
    }

    public static /* synthetic */ KCFlutterBridgeUserCenterUserPoliciesInfo copy$default(KCFlutterBridgeUserCenterUserPoliciesInfo kCFlutterBridgeUserCenterUserPoliciesInfo, long j11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = kCFlutterBridgeUserCenterUserPoliciesInfo.type;
        }
        if ((i11 & 2) != 0) {
            str = kCFlutterBridgeUserCenterUserPoliciesInfo.url;
        }
        if ((i11 & 4) != 0) {
            str2 = kCFlutterBridgeUserCenterUserPoliciesInfo.name;
        }
        return kCFlutterBridgeUserCenterUserPoliciesInfo.copy(j11, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final KCFlutterBridgeUserCenterUserPoliciesInfo copy(long type, @NotNull String url, @NotNull String name) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        return new KCFlutterBridgeUserCenterUserPoliciesInfo(type, url, name);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((Long.hashCode(this.type) * 31) + this.url.hashCode()) * 31) + this.name.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", Long.valueOf(this.type));
        linkedHashMap.put("url", this.url);
        linkedHashMap.put("name", this.name);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeUserCenterUserPoliciesInfo(type=" + this.type + ", url=" + this.url + ", name=" + this.name + ')';
    }
}
