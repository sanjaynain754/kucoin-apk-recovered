package com.kubi.p110rn.core.pageopen;

import com.kubi.sdk.performance.pageopen.PageOpenMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KrnPageOpenBridgePayload.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;", "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;", "rootTag", "", "routeKey", "", "pageId", "openMode", "Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/performance/pageopen/PageOpenMode;)V", "getRootTag", "()I", "getRouteKey", "()Ljava/lang/String;", "getPageId", "getOpenMode", "()Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KrnPageOpenBindPayload implements KrnPageOpenBridgePayload {

    @NotNull
    private final PageOpenMode openMode;

    @NotNull
    private final String pageId;
    private final int rootTag;

    @NotNull
    private final String routeKey;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KrnPageOpenBindPayload)) {
            return false;
        }
        KrnPageOpenBindPayload krnPageOpenBindPayload = (KrnPageOpenBindPayload) other;
        return this.rootTag == krnPageOpenBindPayload.rootTag && Intrinsics.areEqual(this.routeKey, krnPageOpenBindPayload.routeKey) && Intrinsics.areEqual(this.pageId, krnPageOpenBindPayload.pageId) && this.openMode == krnPageOpenBindPayload.openMode;
    }

    public KrnPageOpenBindPayload(int i11, @NotNull String routeKey, @NotNull String pageId, @NotNull PageOpenMode openMode) {
        Intrinsics.checkNotNullParameter(routeKey, "routeKey");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(openMode, "openMode");
        this.rootTag = i11;
        this.routeKey = routeKey;
        this.pageId = pageId;
        this.openMode = openMode;
    }

    public static /* synthetic */ KrnPageOpenBindPayload copy$default(KrnPageOpenBindPayload krnPageOpenBindPayload, int i11, String str, String str2, PageOpenMode pageOpenMode, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = krnPageOpenBindPayload.rootTag;
        }
        if ((i12 & 2) != 0) {
            str = krnPageOpenBindPayload.routeKey;
        }
        if ((i12 & 4) != 0) {
            str2 = krnPageOpenBindPayload.pageId;
        }
        if ((i12 & 8) != 0) {
            pageOpenMode = krnPageOpenBindPayload.openMode;
        }
        return krnPageOpenBindPayload.copy(i11, str, str2, pageOpenMode);
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
    public final KrnPageOpenBindPayload copy(int rootTag, @NotNull String routeKey, @NotNull String pageId, @NotNull PageOpenMode openMode) {
        Intrinsics.checkNotNullParameter(routeKey, "routeKey");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(openMode, "openMode");
        return new KrnPageOpenBindPayload(rootTag, routeKey, pageId, openMode);
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
        return (((((Integer.hashCode(this.rootTag) * 31) + this.routeKey.hashCode()) * 31) + this.pageId.hashCode()) * 31) + this.openMode.hashCode();
    }

    @NotNull
    public String toString() {
        return "KrnPageOpenBindPayload(rootTag=" + this.rootTag + ", routeKey=" + this.routeKey + ", pageId=" + this.pageId + ", openMode=" + this.openMode + ')';
    }
}
