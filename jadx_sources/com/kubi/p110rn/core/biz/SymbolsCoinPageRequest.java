package com.kubi.p110rn.core.biz;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: SymbolsCoinPagination.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/rn/core/biz/SymbolsCoinPageRequest;", "", "pageIndex", "", "pageSize", "<init>", "(II)V", "getPageIndex", "()I", "getPageSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SymbolsCoinPageRequest {
    private final int pageIndex;
    private final int pageSize;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymbolsCoinPageRequest)) {
            return false;
        }
        SymbolsCoinPageRequest symbolsCoinPageRequest = (SymbolsCoinPageRequest) other;
        return this.pageIndex == symbolsCoinPageRequest.pageIndex && this.pageSize == symbolsCoinPageRequest.pageSize;
    }

    public static /* synthetic */ SymbolsCoinPageRequest copy$default(SymbolsCoinPageRequest symbolsCoinPageRequest, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = symbolsCoinPageRequest.pageIndex;
        }
        if ((i13 & 2) != 0) {
            i12 = symbolsCoinPageRequest.pageSize;
        }
        return symbolsCoinPageRequest.copy(i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    @NotNull
    public final SymbolsCoinPageRequest copy(int pageIndex, int pageSize) {
        return new SymbolsCoinPageRequest(pageIndex, pageSize);
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        return (Integer.hashCode(this.pageIndex) * 31) + Integer.hashCode(this.pageSize);
    }

    @NotNull
    public String toString() {
        return "SymbolsCoinPageRequest(pageIndex=" + this.pageIndex + ", pageSize=" + this.pageSize + ')';
    }

    public SymbolsCoinPageRequest(int i11, int i12) {
        this.pageIndex = i11;
        this.pageSize = i12;
    }
}
