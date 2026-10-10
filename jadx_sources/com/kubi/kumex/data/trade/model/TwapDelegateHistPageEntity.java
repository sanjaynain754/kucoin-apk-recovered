package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TwapDelegateHistPageEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "", "currentPage", "", "totalNum", "", "totalPage", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V", "getCurrentPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalNum", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalPage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "equals", "", "other", "hashCode", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TwapDelegateHistPageEntity {

    @Nullable
    private final Integer currentPage;

    @Nullable
    private final List<OrderEntity> items;

    @Nullable
    private final Long totalNum;

    @Nullable
    private final Long totalPage;

    public TwapDelegateHistPageEntity() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwapDelegateHistPageEntity)) {
            return false;
        }
        TwapDelegateHistPageEntity twapDelegateHistPageEntity = (TwapDelegateHistPageEntity) other;
        return Intrinsics.areEqual(this.currentPage, twapDelegateHistPageEntity.currentPage) && Intrinsics.areEqual(this.totalNum, twapDelegateHistPageEntity.totalNum) && Intrinsics.areEqual(this.totalPage, twapDelegateHistPageEntity.totalPage) && Intrinsics.areEqual(this.items, twapDelegateHistPageEntity.items);
    }

    public TwapDelegateHistPageEntity(@Nullable Integer num, @Nullable Long l11, @Nullable Long l12, @Nullable List<OrderEntity> list) {
        this.currentPage = num;
        this.totalNum = l11;
        this.totalPage = l12;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwapDelegateHistPageEntity copy$default(TwapDelegateHistPageEntity twapDelegateHistPageEntity, Integer num, Long l11, Long l12, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = twapDelegateHistPageEntity.currentPage;
        }
        if ((i11 & 2) != 0) {
            l11 = twapDelegateHistPageEntity.totalNum;
        }
        if ((i11 & 4) != 0) {
            l12 = twapDelegateHistPageEntity.totalPage;
        }
        if ((i11 & 8) != 0) {
            list = twapDelegateHistPageEntity.items;
        }
        return twapDelegateHistPageEntity.copy(num, l11, l12, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTotalNum() {
        return this.totalNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTotalPage() {
        return this.totalPage;
    }

    @Nullable
    public final List<OrderEntity> component4() {
        return this.items;
    }

    @NotNull
    public final TwapDelegateHistPageEntity copy(@Nullable Integer currentPage, @Nullable Long totalNum, @Nullable Long totalPage, @Nullable List<OrderEntity> items) {
        return new TwapDelegateHistPageEntity(currentPage, totalNum, totalPage, items);
    }

    @Nullable
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final List<OrderEntity> getItems() {
        return this.items;
    }

    @Nullable
    public final Long getTotalNum() {
        return this.totalNum;
    }

    @Nullable
    public final Long getTotalPage() {
        return this.totalPage;
    }

    public int hashCode() {
        Integer num = this.currentPage;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l11 = this.totalNum;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.totalPage;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        List<OrderEntity> list = this.items;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TwapDelegateHistPageEntity(currentPage=" + this.currentPage + ", totalNum=" + this.totalNum + ", totalPage=" + this.totalPage + ", items=" + this.items + ')';
    }

    public /* synthetic */ TwapDelegateHistPageEntity(Integer num, Long l11, Long l12, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : l12, (i11 & 8) != 0 ? null : list);
    }
}
