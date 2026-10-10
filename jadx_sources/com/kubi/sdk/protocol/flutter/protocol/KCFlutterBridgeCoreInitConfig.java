package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterBridgeCoreCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001fJ\t\u0010!\u001a\u00020 HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreInitConfig;", "", "appInfo", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreAppInfo;", "apiInfo", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreApiInfo;", "userInfo", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreUserInfo;", "requestHeader", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreHttpHeader;", "(Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreAppInfo;Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreApiInfo;Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreUserInfo;Ljava/util/List;)V", "getApiInfo", "()Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreApiInfo;", "getAppInfo", "()Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreAppInfo;", "getRequestHeader", "()Ljava/util/List;", "getUserInfo", "()Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreUserInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeCoreCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeCoreCall.kt\ncom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreInitConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,270:1\n1549#2:271\n1620#2,3:272\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeCoreCall.kt\ncom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreInitConfig\n*L\n208#1:271\n208#1:272,3\n*E\n"})
public final /* data */ class KCFlutterBridgeCoreInitConfig {

    @Nullable
    private final KCFlutterBridgeCoreApiInfo apiInfo;

    @Nullable
    private final KCFlutterBridgeCoreAppInfo appInfo;

    @Nullable
    private final List<KCFlutterBridgeCoreHttpHeader> requestHeader;

    @Nullable
    private final KCFlutterBridgeCoreUserInfo userInfo;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeCoreInitConfig)) {
            return false;
        }
        KCFlutterBridgeCoreInitConfig kCFlutterBridgeCoreInitConfig = (KCFlutterBridgeCoreInitConfig) other;
        return Intrinsics.areEqual(this.appInfo, kCFlutterBridgeCoreInitConfig.appInfo) && Intrinsics.areEqual(this.apiInfo, kCFlutterBridgeCoreInitConfig.apiInfo) && Intrinsics.areEqual(this.userInfo, kCFlutterBridgeCoreInitConfig.userInfo) && Intrinsics.areEqual(this.requestHeader, kCFlutterBridgeCoreInitConfig.requestHeader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCFlutterBridgeCoreInitConfig copy$default(KCFlutterBridgeCoreInitConfig kCFlutterBridgeCoreInitConfig, KCFlutterBridgeCoreAppInfo kCFlutterBridgeCoreAppInfo, KCFlutterBridgeCoreApiInfo kCFlutterBridgeCoreApiInfo, KCFlutterBridgeCoreUserInfo kCFlutterBridgeCoreUserInfo, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kCFlutterBridgeCoreAppInfo = kCFlutterBridgeCoreInitConfig.appInfo;
        }
        if ((i11 & 2) != 0) {
            kCFlutterBridgeCoreApiInfo = kCFlutterBridgeCoreInitConfig.apiInfo;
        }
        if ((i11 & 4) != 0) {
            kCFlutterBridgeCoreUserInfo = kCFlutterBridgeCoreInitConfig.userInfo;
        }
        if ((i11 & 8) != 0) {
            list = kCFlutterBridgeCoreInitConfig.requestHeader;
        }
        return kCFlutterBridgeCoreInitConfig.copy(kCFlutterBridgeCoreAppInfo, kCFlutterBridgeCoreApiInfo, kCFlutterBridgeCoreUserInfo, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KCFlutterBridgeCoreAppInfo getAppInfo() {
        return this.appInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KCFlutterBridgeCoreApiInfo getApiInfo() {
        return this.apiInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final KCFlutterBridgeCoreUserInfo getUserInfo() {
        return this.userInfo;
    }

    @Nullable
    public final List<KCFlutterBridgeCoreHttpHeader> component4() {
        return this.requestHeader;
    }

    @NotNull
    public final KCFlutterBridgeCoreInitConfig copy(@Nullable KCFlutterBridgeCoreAppInfo appInfo, @Nullable KCFlutterBridgeCoreApiInfo apiInfo, @Nullable KCFlutterBridgeCoreUserInfo userInfo, @Nullable List<KCFlutterBridgeCoreHttpHeader> requestHeader) {
        return new KCFlutterBridgeCoreInitConfig(appInfo, apiInfo, userInfo, requestHeader);
    }

    @Nullable
    public final KCFlutterBridgeCoreApiInfo getApiInfo() {
        return this.apiInfo;
    }

    @Nullable
    public final KCFlutterBridgeCoreAppInfo getAppInfo() {
        return this.appInfo;
    }

    @Nullable
    public final List<KCFlutterBridgeCoreHttpHeader> getRequestHeader() {
        return this.requestHeader;
    }

    @Nullable
    public final KCFlutterBridgeCoreUserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        KCFlutterBridgeCoreAppInfo kCFlutterBridgeCoreAppInfo = this.appInfo;
        int iHashCode = (kCFlutterBridgeCoreAppInfo == null ? 0 : kCFlutterBridgeCoreAppInfo.hashCode()) * 31;
        KCFlutterBridgeCoreApiInfo kCFlutterBridgeCoreApiInfo = this.apiInfo;
        int iHashCode2 = (iHashCode + (kCFlutterBridgeCoreApiInfo == null ? 0 : kCFlutterBridgeCoreApiInfo.hashCode())) * 31;
        KCFlutterBridgeCoreUserInfo kCFlutterBridgeCoreUserInfo = this.userInfo;
        int iHashCode3 = (iHashCode2 + (kCFlutterBridgeCoreUserInfo == null ? 0 : kCFlutterBridgeCoreUserInfo.hashCode())) * 31;
        List<KCFlutterBridgeCoreHttpHeader> list = this.requestHeader;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        KCFlutterBridgeCoreAppInfo kCFlutterBridgeCoreAppInfo = this.appInfo;
        ArrayList arrayList = null;
        linkedHashMap.put("appInfo", kCFlutterBridgeCoreAppInfo != null ? kCFlutterBridgeCoreAppInfo.toMap() : null);
        KCFlutterBridgeCoreApiInfo kCFlutterBridgeCoreApiInfo = this.apiInfo;
        linkedHashMap.put("apiInfo", kCFlutterBridgeCoreApiInfo != null ? kCFlutterBridgeCoreApiInfo.toMap() : null);
        KCFlutterBridgeCoreUserInfo kCFlutterBridgeCoreUserInfo = this.userInfo;
        linkedHashMap.put("userInfo", kCFlutterBridgeCoreUserInfo != null ? kCFlutterBridgeCoreUserInfo.toMap() : null);
        List<KCFlutterBridgeCoreHttpHeader> list = this.requestHeader;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((KCFlutterBridgeCoreHttpHeader) it.next()).toMap());
            }
        }
        linkedHashMap.put("requestHeader", arrayList);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeCoreInitConfig(appInfo=" + this.appInfo + ", apiInfo=" + this.apiInfo + ", userInfo=" + this.userInfo + ", requestHeader=" + this.requestHeader + ')';
    }

    public KCFlutterBridgeCoreInitConfig(@Nullable KCFlutterBridgeCoreAppInfo kCFlutterBridgeCoreAppInfo, @Nullable KCFlutterBridgeCoreApiInfo kCFlutterBridgeCoreApiInfo, @Nullable KCFlutterBridgeCoreUserInfo kCFlutterBridgeCoreUserInfo, @Nullable List<KCFlutterBridgeCoreHttpHeader> list) {
        this.appInfo = kCFlutterBridgeCoreAppInfo;
        this.apiInfo = kCFlutterBridgeCoreApiInfo;
        this.userInfo = kCFlutterBridgeCoreUserInfo;
        this.requestHeader = list;
    }
}
