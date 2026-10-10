package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/copytrading/assets/LeadTradingItemRequestEntity;", "", "currentPage", "", "pageSize", "sort", "Lcom/kubi/copytrading/assets/SortRequestEntity;", "<init>", "(IILcom/kubi/copytrading/assets/SortRequestEntity;)V", "getCurrentPage", "()I", "getPageSize", "getSort", "()Lcom/kubi/copytrading/assets/SortRequestEntity;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeadTradingItemRequestEntity {
    private final int currentPage;
    private final int pageSize;

    @NotNull
    private final SortRequestEntity sort;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadTradingItemRequestEntity)) {
            return false;
        }
        LeadTradingItemRequestEntity leadTradingItemRequestEntity = (LeadTradingItemRequestEntity) other;
        return this.currentPage == leadTradingItemRequestEntity.currentPage && this.pageSize == leadTradingItemRequestEntity.pageSize && Intrinsics.areEqual(this.sort, leadTradingItemRequestEntity.sort);
    }

    public LeadTradingItemRequestEntity(int i11, int i12, @NotNull SortRequestEntity sort) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        this.currentPage = i11;
        this.pageSize = i12;
        this.sort = sort;
    }

    public static /* synthetic */ LeadTradingItemRequestEntity copy$default(LeadTradingItemRequestEntity leadTradingItemRequestEntity, int i11, int i12, SortRequestEntity sortRequestEntity, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = leadTradingItemRequestEntity.currentPage;
        }
        if ((i13 & 2) != 0) {
            i12 = leadTradingItemRequestEntity.pageSize;
        }
        if ((i13 & 4) != 0) {
            sortRequestEntity = leadTradingItemRequestEntity.sort;
        }
        return leadTradingItemRequestEntity.copy(i11, i12, sortRequestEntity);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SortRequestEntity getSort() {
        return this.sort;
    }

    @NotNull
    public final LeadTradingItemRequestEntity copy(int currentPage, int pageSize, @NotNull SortRequestEntity sort) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        return new LeadTradingItemRequestEntity(currentPage, pageSize, sort);
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    @NotNull
    public final SortRequestEntity getSort() {
        return this.sort;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.currentPage) * 31) + Integer.hashCode(this.pageSize)) * 31) + this.sort.hashCode();
    }

    @NotNull
    public String toString() {
        return "LeadTradingItemRequestEntity(currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", sort=" + this.sort + ')';
    }
}
