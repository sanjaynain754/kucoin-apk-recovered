package com.kubi.futures.trade.position;

import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesPositionAggregateManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/position/AggregateState;", "", "positions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "tpSlOrders", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPositions", "()Ljava/util/List;", "setPositions", "(Ljava/util/List;)V", "getTpSlOrders", "setTpSlOrders", "clear", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AggregateState {

    /* JADX INFO: renamed from: a */
    @NotNull
    public List<PositionEntity> f24233a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public List<OrderEntity> f24234b;

    public AggregateState(@NotNull List<PositionEntity> positions, @NotNull List<OrderEntity> tpSlOrders) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(tpSlOrders, "tpSlOrders");
        this.f24233a = positions;
        this.f24234b = tpSlOrders;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<PositionEntity> m27768b() {
        return this.f24233a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<OrderEntity> m27769c() {
        return this.f24234b;
    }

    /* JADX INFO: renamed from: d */
    public final void m27770d(@NotNull List<PositionEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f24233a = list;
    }

    /* JADX INFO: renamed from: e */
    public final void m27771e(@NotNull List<OrderEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f24234b = list;
    }

    /* JADX INFO: renamed from: a */
    public final void m27767a() {
        this.f24233a = CollectionsKt.emptyList();
        this.f24234b = CollectionsKt.emptyList();
    }

    public /* synthetic */ AggregateState(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list2);
    }
}
