package com.kubi.futures.trade.position.vm;

import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.f2, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: FuturesPositionViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/PositionAndOrder;", "", "positions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "orders", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPositions", "()Ljava/util/List;", "getOrders", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PositionAndOrder {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final List<PositionEntity> positions;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final List<OrderEntity> orders;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionAndOrder)) {
            return false;
        }
        PositionAndOrder positionAndOrder = (PositionAndOrder) other;
        return Intrinsics.areEqual(this.positions, positionAndOrder.positions) && Intrinsics.areEqual(this.orders, positionAndOrder.orders);
    }

    public PositionAndOrder(@NotNull List<PositionEntity> positions, @NotNull List<OrderEntity> orders) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.positions = positions;
        this.orders = orders;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<OrderEntity> m28031a() {
        return this.orders;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<PositionEntity> m28032b() {
        return this.positions;
    }

    public int hashCode() {
        return (this.positions.hashCode() * 31) + this.orders.hashCode();
    }

    @NotNull
    public String toString() {
        return "PositionAndOrder(positions=" + this.positions + ", orders=" + this.orders + ')';
    }
}
