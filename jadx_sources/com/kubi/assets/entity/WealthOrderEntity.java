package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WealthEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/entity/WealthOrderEntity;", "", "currentPage", "", "hasNext", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/assets/entity/WealthOrderItem;", "pageSize", "totalNum", "totalPage", "<init>", "(IZLjava/util/List;III)V", "getCurrentPage", "()I", "getHasNext", "()Z", "getItems", "()Ljava/util/List;", "getPageSize", "getTotalNum", "getTotalPage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WealthOrderEntity {
    private final int currentPage;
    private final boolean hasNext;

    @Nullable
    private final List<WealthOrderItem> items;
    private final int pageSize;
    private final int totalNum;
    private final int totalPage;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WealthOrderEntity)) {
            return false;
        }
        WealthOrderEntity wealthOrderEntity = (WealthOrderEntity) other;
        return this.currentPage == wealthOrderEntity.currentPage && this.hasNext == wealthOrderEntity.hasNext && Intrinsics.areEqual(this.items, wealthOrderEntity.items) && this.pageSize == wealthOrderEntity.pageSize && this.totalNum == wealthOrderEntity.totalNum && this.totalPage == wealthOrderEntity.totalPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WealthOrderEntity copy$default(WealthOrderEntity wealthOrderEntity, int i11, boolean z11, List list, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = wealthOrderEntity.currentPage;
        }
        if ((i15 & 2) != 0) {
            z11 = wealthOrderEntity.hasNext;
        }
        if ((i15 & 4) != 0) {
            list = wealthOrderEntity.items;
        }
        if ((i15 & 8) != 0) {
            i12 = wealthOrderEntity.pageSize;
        }
        if ((i15 & 16) != 0) {
            i13 = wealthOrderEntity.totalNum;
        }
        if ((i15 & 32) != 0) {
            i14 = wealthOrderEntity.totalPage;
        }
        int i16 = i13;
        int i17 = i14;
        return wealthOrderEntity.copy(i11, z11, list, i12, i16, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasNext() {
        return this.hasNext;
    }

    @Nullable
    public final List<WealthOrderItem> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalPage() {
        return this.totalPage;
    }

    @NotNull
    public final WealthOrderEntity copy(int currentPage, boolean hasNext, @Nullable List<WealthOrderItem> items, int pageSize, int totalNum, int totalPage) {
        return new WealthOrderEntity(currentPage, hasNext, items, pageSize, totalNum, totalPage);
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    @Nullable
    public final List<WealthOrderItem> getItems() {
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
        int iHashCode = ((Integer.hashCode(this.currentPage) * 31) + Boolean.hashCode(this.hasNext)) * 31;
        List<WealthOrderItem> list = this.items;
        return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.totalNum)) * 31) + Integer.hashCode(this.totalPage);
    }

    @NotNull
    public String toString() {
        return "WealthOrderEntity(currentPage=" + this.currentPage + ", hasNext=" + this.hasNext + ", items=" + this.items + ", pageSize=" + this.pageSize + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ')';
    }

    public WealthOrderEntity(int i11, boolean z11, @Nullable List<WealthOrderItem> list, int i12, int i13, int i14) {
        this.currentPage = i11;
        this.hasNext = z11;
        this.items = list;
        this.pageSize = i12;
        this.totalNum = i13;
        this.totalPage = i14;
    }
}
