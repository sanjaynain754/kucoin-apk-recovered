package com.kubi.p110rn.core.pageopen;

import com.kubi.sdk.performance.pageopen.PageOpenMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KrnPageOpenBridgePayload.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;", "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;", "rootTag", "", "routeKey", "", "pageId", "openMode", "Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "pageTraceId", "cacheHit", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenMode;Ljava/lang/String;Ljava/lang/Boolean;)V", "getRootTag", "()I", "getRouteKey", "()Ljava/lang/String;", "getPageId", "getOpenMode", "()Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "getPageTraceId", "getCacheHit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenMode;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;", "equals", "other", "", "hashCode", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KrnPageOpenDataReadyPayload implements KrnPageOpenBridgePayload {

    @Nullable
    private final Boolean cacheHit;

    @NotNull
    private final PageOpenMode openMode;

    @NotNull
    private final String pageId;

    @NotNull
    private final String pageTraceId;
    private final int rootTag;

    @NotNull
    private final String routeKey;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KrnPageOpenDataReadyPayload)) {
            return false;
        }
        KrnPageOpenDataReadyPayload krnPageOpenDataReadyPayload = (KrnPageOpenDataReadyPayload) other;
        return this.rootTag == krnPageOpenDataReadyPayload.rootTag && Intrinsics.areEqual(this.routeKey, krnPageOpenDataReadyPayload.routeKey) && Intrinsics.areEqual(this.pageId, krnPageOpenDataReadyPayload.pageId) && this.openMode == krnPageOpenDataReadyPayload.openMode && Intrinsics.areEqual(this.pageTraceId, krnPageOpenDataReadyPayload.pageTraceId) && Intrinsics.areEqual(this.cacheHit, krnPageOpenDataReadyPayload.cacheHit);
    }

    public KrnPageOpenDataReadyPayload(int i11, @NotNull String routeKey, @NotNull String pageId, @NotNull PageOpenMode openMode, @NotNull String pageTraceId, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(routeKey, "routeKey");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(openMode, "openMode");
        Intrinsics.checkNotNullParameter(pageTraceId, "pageTraceId");
        this.rootTag = i11;
        this.routeKey = routeKey;
        this.pageId = pageId;
        this.openMode = openMode;
        this.pageTraceId = pageTraceId;
        this.cacheHit = bool;
    }

    public static /* synthetic */ KrnPageOpenDataReadyPayload copy$default(KrnPageOpenDataReadyPayload krnPageOpenDataReadyPayload, int i11, String str, String str2, PageOpenMode pageOpenMode, String str3, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = krnPageOpenDataReadyPayload.rootTag;
        }
        if ((i12 & 2) != 0) {
            str = krnPageOpenDataReadyPayload.routeKey;
        }
        if ((i12 & 4) != 0) {
            str2 = krnPageOpenDataReadyPayload.pageId;
        }
        if ((i12 & 8) != 0) {
            pageOpenMode = krnPageOpenDataReadyPayload.openMode;
        }
        if ((i12 & 16) != 0) {
            str3 = krnPageOpenDataReadyPayload.pageTraceId;
        }
        if ((i12 & 32) != 0) {
            bool = krnPageOpenDataReadyPayload.cacheHit;
        }
        String str4 = str3;
        Boolean bool2 = bool;
        return krnPageOpenDataReadyPayload.copy(i11, str, str2, pageOpenMode, str4, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRootTag() {
        return this.rootTag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRouteKey() {
        return this.routeKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PageOpenMode getOpenMode() {
        return this.openMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPageTraceId() {
        return this.pageTraceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getCacheHit() {
        return this.cacheHit;
    }

    @NotNull
    public final KrnPageOpenDataReadyPayload copy(int rootTag, @NotNull String routeKey, @NotNull String pageId, @NotNull PageOpenMode openMode, @NotNull String pageTraceId, @Nullable Boolean cacheHit) {
        Intrinsics.checkNotNullParameter(routeKey, "routeKey");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(openMode, "openMode");
        Intrinsics.checkNotNullParameter(pageTraceId, "pageTraceId");
        return new KrnPageOpenDataReadyPayload(rootTag, routeKey, pageId, openMode, pageTraceId, cacheHit);
    }

    @Nullable
    public final Boolean getCacheHit() {
        return this.cacheHit;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenBridgePayload
    @NotNull
    public PageOpenMode getOpenMode() {
        return this.openMode;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenBridgePayload
    @NotNull
    public String getPageId() {
        return this.pageId;
    }

    @NotNull
    public final String getPageTraceId() {
        return this.pageTraceId;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenBridgePayload
    public int getRootTag() {
        return this.rootTag;
    }

    @Override // com.kubi.p110rn.core.pageopen.KrnPageOpenBridgePayload
    @NotNull
    public String getRouteKey() {
        return this.routeKey;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.rootTag) * 31) + this.routeKey.hashCode()) * 31) + this.pageId.hashCode()) * 31) + this.openMode.hashCode()) * 31) + this.pageTraceId.hashCode()) * 31;
        Boolean bool = this.cacheHit;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "KrnPageOpenDataReadyPayload(rootTag=" + this.rootTag + ", routeKey=" + this.routeKey + ", pageId=" + this.pageId + ", openMode=" + this.openMode + ", pageTraceId=" + this.pageTraceId + ", cacheHit=" + this.cacheHit + ')';
    }
}
