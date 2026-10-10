package com.kubi.kumex.data.market.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DistributionQuoteEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/DistributionPageEntity;", "Lcom/kubi/kumex/data/market/model/IDistributionData;", "currentPage", "", "pageSize", "totalNum", "totalPage", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/kumex/data/market/model/DistributionQuoteEntity;", "<init>", "(IIIILjava/util/List;)V", "getCurrentPage", "()I", "getPageSize", "getTotalNum", "getTotalPage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DistributionPageEntity implements IDistributionData {
    private final int currentPage;

    @Nullable
    private final List<DistributionQuoteEntity> items;
    private final int pageSize;
    private final int totalNum;
    private final int totalPage;

    public DistributionPageEntity(int i11, int i12, int i13, int i14, @Nullable List<DistributionQuoteEntity> list) {
        this.currentPage = i11;
        this.pageSize = i12;
        this.totalNum = i13;
        this.totalPage = i14;
        this.items = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistributionPageEntity)) {
            return false;
        }
        DistributionPageEntity distributionPageEntity = (DistributionPageEntity) other;
        return this.currentPage == distributionPageEntity.currentPage && this.pageSize == distributionPageEntity.pageSize && this.totalNum == distributionPageEntity.totalNum && this.totalPage == distributionPageEntity.totalPage && Intrinsics.areEqual(this.items, distributionPageEntity.items);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistributionPageEntity copy$default(DistributionPageEntity distributionPageEntity, int i11, int i12, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = distributionPageEntity.currentPage;
        }
        if ((i15 & 2) != 0) {
            i12 = distributionPageEntity.pageSize;
        }
        if ((i15 & 4) != 0) {
            i13 = distributionPageEntity.totalNum;
        }
        if ((i15 & 8) != 0) {
            i14 = distributionPageEntity.totalPage;
        }
        if ((i15 & 16) != 0) {
            list = distributionPageEntity.items;
        }
        List list2 = list;
        int i16 = i13;
        return distributionPageEntity.copy(i11, i12, i16, i14, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalPage() {
        return this.totalPage;
    }

    @Nullable
    public final List<DistributionQuoteEntity> component5() {
        return this.items;
    }

    @NotNull
    public final DistributionPageEntity copy(int currentPage, int pageSize, int totalNum, int totalPage, @Nullable List<DistributionQuoteEntity> items) {
        return new DistributionPageEntity(currentPage, pageSize, totalNum, totalPage, items);
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final List<DistributionQuoteEntity> getItems() {
        return this.items;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public final int getTotalPage() {
        return this.totalPage;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.currentPage) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.totalNum)) * 31) + Integer.hashCode(this.totalPage)) * 31;
        List<DistributionQuoteEntity> list = this.items;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "DistributionPageEntity(currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ", items=" + this.items + ')';
    }

    public /* synthetic */ DistributionPageEntity(int i11, int i12, int i13, int i14, List list, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, i14, (i15 & 16) != 0 ? null : list);
    }
}
