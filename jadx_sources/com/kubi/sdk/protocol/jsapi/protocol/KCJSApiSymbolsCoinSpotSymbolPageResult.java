package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiSymbolsCoinModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinSpotSymbolPageResult;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinSpotSymbolInfo;", "pageIndex", "", "pageSize", "total", "hasNext", "", "(Ljava/util/List;JJJZ)V", "getHasNext", "()Z", "getItems", "()Ljava/util/List;", "getPageIndex", "()J", "getPageSize", "getTotal", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiSymbolsCoinSpotSymbolPageResult {
    private final boolean hasNext;

    @NotNull
    private final List<KCJSApiSymbolsCoinSpotSymbolInfo> items;
    private final long pageIndex;
    private final long pageSize;
    private final long total;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiSymbolsCoinSpotSymbolPageResult)) {
            return false;
        }
        KCJSApiSymbolsCoinSpotSymbolPageResult kCJSApiSymbolsCoinSpotSymbolPageResult = (KCJSApiSymbolsCoinSpotSymbolPageResult) other;
        return Intrinsics.areEqual(this.items, kCJSApiSymbolsCoinSpotSymbolPageResult.items) && this.pageIndex == kCJSApiSymbolsCoinSpotSymbolPageResult.pageIndex && this.pageSize == kCJSApiSymbolsCoinSpotSymbolPageResult.pageSize && this.total == kCJSApiSymbolsCoinSpotSymbolPageResult.total && this.hasNext == kCJSApiSymbolsCoinSpotSymbolPageResult.hasNext;
    }

    public KCJSApiSymbolsCoinSpotSymbolPageResult(@NotNull List<KCJSApiSymbolsCoinSpotSymbolInfo> items, long j11, long j12, long j13, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.pageIndex = j11;
        this.pageSize = j12;
        this.total = j13;
        this.hasNext = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCJSApiSymbolsCoinSpotSymbolPageResult copy$default(KCJSApiSymbolsCoinSpotSymbolPageResult kCJSApiSymbolsCoinSpotSymbolPageResult, List list, long j11, long j12, long j13, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = kCJSApiSymbolsCoinSpotSymbolPageResult.items;
        }
        if ((i11 & 2) != 0) {
            j11 = kCJSApiSymbolsCoinSpotSymbolPageResult.pageIndex;
        }
        if ((i11 & 4) != 0) {
            j12 = kCJSApiSymbolsCoinSpotSymbolPageResult.pageSize;
        }
        if ((i11 & 8) != 0) {
            j13 = kCJSApiSymbolsCoinSpotSymbolPageResult.total;
        }
        if ((i11 & 16) != 0) {
            z11 = kCJSApiSymbolsCoinSpotSymbolPageResult.hasNext;
        }
        boolean z12 = z11;
        long j14 = j13;
        return kCJSApiSymbolsCoinSpotSymbolPageResult.copy(list, j11, j12, j14, z12);
    }

    @NotNull
    public final List<KCJSApiSymbolsCoinSpotSymbolInfo> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPageIndex() {
        return this.pageIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHasNext() {
        return this.hasNext;
    }

    @NotNull
    public final KCJSApiSymbolsCoinSpotSymbolPageResult copy(@NotNull List<KCJSApiSymbolsCoinSpotSymbolInfo> items, long pageIndex, long pageSize, long total, boolean hasNext) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new KCJSApiSymbolsCoinSpotSymbolPageResult(items, pageIndex, pageSize, total, hasNext);
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    @NotNull
    public final List<KCJSApiSymbolsCoinSpotSymbolInfo> getItems() {
        return this.items;
    }

    public final long getPageIndex() {
        return this.pageIndex;
    }

    public final long getPageSize() {
        return this.pageSize;
    }

    public final long getTotal() {
        return this.total;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((((this.items.hashCode() * 31) + Long.hashCode(this.pageIndex)) * 31) + Long.hashCode(this.pageSize)) * 31) + Long.hashCode(this.total)) * 31;
        boolean z11 = this.hasNext;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode + r11;
    }

    @NotNull
    public String toString() {
        return "KCJSApiSymbolsCoinSpotSymbolPageResult(items=" + this.items + ", pageIndex=" + this.pageIndex + ", pageSize=" + this.pageSize + ", total=" + this.total + ", hasNext=" + this.hasNext + ')';
    }
}
