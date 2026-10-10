package com.kubi.p110rn.core.biz;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SymbolsCoinPagination.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JG\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m90084d2 = {"Lcom/kubi/rn/core/biz/SymbolsCoinPage;", ExifInterface.GPS_DIRECTION_TRUE, "", FirebaseAnalytics.Param.ITEMS, "", "pageIndex", "", "pageSize", "total", "hasNext", "", "<init>", "(Ljava/util/List;DDDZ)V", "getItems", "()Ljava/util/List;", "getPageIndex", "()D", "getPageSize", "getTotal", "getHasNext", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SymbolsCoinPage<T> {
    private final boolean hasNext;

    @NotNull
    private final List<T> items;
    private final double pageIndex;
    private final double pageSize;
    private final double total;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymbolsCoinPage)) {
            return false;
        }
        SymbolsCoinPage symbolsCoinPage = (SymbolsCoinPage) other;
        return Intrinsics.areEqual(this.items, symbolsCoinPage.items) && Double.compare(this.pageIndex, symbolsCoinPage.pageIndex) == 0 && Double.compare(this.pageSize, symbolsCoinPage.pageSize) == 0 && Double.compare(this.total, symbolsCoinPage.total) == 0 && this.hasNext == symbolsCoinPage.hasNext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SymbolsCoinPage(@NotNull List<? extends T> items, double d11, double d12, double d13, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.pageIndex = d11;
        this.pageSize = d12;
        this.total = d13;
        this.hasNext = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SymbolsCoinPage copy$default(SymbolsCoinPage symbolsCoinPage, List list, double d11, double d12, double d13, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = symbolsCoinPage.items;
        }
        if ((i11 & 2) != 0) {
            d11 = symbolsCoinPage.pageIndex;
        }
        if ((i11 & 4) != 0) {
            d12 = symbolsCoinPage.pageSize;
        }
        if ((i11 & 8) != 0) {
            d13 = symbolsCoinPage.total;
        }
        if ((i11 & 16) != 0) {
            z11 = symbolsCoinPage.hasNext;
        }
        boolean z12 = z11;
        double d14 = d13;
        return symbolsCoinPage.copy(list, d11, d12, d14, z12);
    }

    @NotNull
    public final List<T> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPageIndex() {
        return this.pageIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHasNext() {
        return this.hasNext;
    }

    @NotNull
    public final SymbolsCoinPage<T> copy(@NotNull List<? extends T> items, double pageIndex, double pageSize, double total, boolean hasNext) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new SymbolsCoinPage<>(items, pageIndex, pageSize, total, hasNext);
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    @NotNull
    public final List<T> getItems() {
        return this.items;
    }

    public final double getPageIndex() {
        return this.pageIndex;
    }

    public final double getPageSize() {
        return this.pageSize;
    }

    public final double getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((((((this.items.hashCode() * 31) + Double.hashCode(this.pageIndex)) * 31) + Double.hashCode(this.pageSize)) * 31) + Double.hashCode(this.total)) * 31) + Boolean.hashCode(this.hasNext);
    }

    @NotNull
    public String toString() {
        return "SymbolsCoinPage(items=" + this.items + ", pageIndex=" + this.pageIndex + ", pageSize=" + this.pageSize + ", total=" + this.total + ", hasNext=" + this.hasNext + ')';
    }
}
