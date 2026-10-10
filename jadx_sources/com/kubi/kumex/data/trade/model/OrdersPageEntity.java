package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderSocketEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "totalNum", "", "<init>", "(Ljava/util/List;J)V", "getItems", "()Ljava/util/List;", "getTotalNum", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrdersPageEntity {

    @NotNull
    private final List<OrderEntity> items;
    private final long totalNum;

    public OrdersPageEntity() {
        this(null, 0L, 3, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrdersPageEntity)) {
            return false;
        }
        OrdersPageEntity ordersPageEntity = (OrdersPageEntity) other;
        return Intrinsics.areEqual(this.items, ordersPageEntity.items) && this.totalNum == ordersPageEntity.totalNum;
    }

    public OrdersPageEntity(@NotNull List<OrderEntity> items, long j11) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.totalNum = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrdersPageEntity copy$default(OrdersPageEntity ordersPageEntity, List list, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = ordersPageEntity.items;
        }
        if ((i11 & 2) != 0) {
            j11 = ordersPageEntity.totalNum;
        }
        return ordersPageEntity.copy(list, j11);
    }

    @NotNull
    public final List<OrderEntity> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotalNum() {
        return this.totalNum;
    }

    @NotNull
    public final OrdersPageEntity copy(@NotNull List<OrderEntity> items, long totalNum) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new OrdersPageEntity(items, totalNum);
    }

    @NotNull
    public final List<OrderEntity> getItems() {
        return this.items;
    }

    public final long getTotalNum() {
        return this.totalNum;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + Long.hashCode(this.totalNum);
    }

    @NotNull
    public String toString() {
        return "OrdersPageEntity(items=" + this.items + ", totalNum=" + this.totalNum + ')';
    }

    public /* synthetic */ OrdersPageEntity(List list, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? 0L : j11);
    }
}
