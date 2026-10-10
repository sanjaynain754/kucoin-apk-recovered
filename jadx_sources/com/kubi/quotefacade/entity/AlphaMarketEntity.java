package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaMarketEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JP\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/AlphaMarketEntity;", "", "currentPage", "", "pageSize", "totalNum", "totalPage", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getCurrentPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageSize", "getTotalNum", "getTotalPage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/kubi/quotefacade/entity/AlphaMarketEntity;", "equals", "", "other", "hashCode", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaMarketEntity {

    @Nullable
    private final Integer currentPage;

    @Nullable
    private final List<AlphaItemEntity> items;

    @Nullable
    private final Integer pageSize;

    @Nullable
    private final Integer totalNum;

    @Nullable
    private final Integer totalPage;

    public AlphaMarketEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaMarketEntity)) {
            return false;
        }
        AlphaMarketEntity alphaMarketEntity = (AlphaMarketEntity) other;
        return Intrinsics.areEqual(this.currentPage, alphaMarketEntity.currentPage) && Intrinsics.areEqual(this.pageSize, alphaMarketEntity.pageSize) && Intrinsics.areEqual(this.totalNum, alphaMarketEntity.totalNum) && Intrinsics.areEqual(this.totalPage, alphaMarketEntity.totalPage) && Intrinsics.areEqual(this.items, alphaMarketEntity.items);
    }

    public AlphaMarketEntity(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<AlphaItemEntity> list) {
        this.currentPage = num;
        this.pageSize = num2;
        this.totalNum = num3;
        this.totalPage = num4;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlphaMarketEntity copy$default(AlphaMarketEntity alphaMarketEntity, Integer num, Integer num2, Integer num3, Integer num4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = alphaMarketEntity.currentPage;
        }
        if ((i11 & 2) != 0) {
            num2 = alphaMarketEntity.pageSize;
        }
        if ((i11 & 4) != 0) {
            num3 = alphaMarketEntity.totalNum;
        }
        if ((i11 & 8) != 0) {
            num4 = alphaMarketEntity.totalPage;
        }
        if ((i11 & 16) != 0) {
            list = alphaMarketEntity.items;
        }
        List list2 = list;
        Integer num5 = num3;
        return alphaMarketEntity.copy(num, num2, num5, num4, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTotalNum() {
        return this.totalNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTotalPage() {
        return this.totalPage;
    }

    @Nullable
    public final List<AlphaItemEntity> component5() {
        return this.items;
    }

    @NotNull
    public final AlphaMarketEntity copy(@Nullable Integer currentPage, @Nullable Integer pageSize, @Nullable Integer totalNum, @Nullable Integer totalPage, @Nullable List<AlphaItemEntity> items) {
        return new AlphaMarketEntity(currentPage, pageSize, totalNum, totalPage, items);
    }

    @Nullable
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final List<AlphaItemEntity> getItems() {
        return this.items;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final Integer getTotalNum() {
        return this.totalNum;
    }

    @Nullable
    public final Integer getTotalPage() {
        return this.totalPage;
    }

    public int hashCode() {
        Integer num = this.currentPage;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pageSize;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalNum;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalPage;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<AlphaItemEntity> list = this.items;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlphaMarketEntity(currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ", items=" + this.items + ')';
    }

    public /* synthetic */ AlphaMarketEntity(Integer num, Integer num2, Integer num3, Integer num4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4, (i11 & 16) != 0 ? null : list);
    }
}
