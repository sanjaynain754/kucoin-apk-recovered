package com.kubi.kumex.trade.viewModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: OrdersNumViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kumex/trade/viewModel/OrdersNum;", "", "basicNum", "", "advancedNum", "twapNum", "totalNum", "<init>", "(JJJJ)V", "getBasicNum", "()J", "getAdvancedNum", "getTwapNum", "getTotalNum", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrdersNum {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f30726e = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Lazy<OrdersNum> f30727f = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.viewModel.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrdersNum.m36404b();
        }
    });

    /* JADX INFO: renamed from: a, reason: from toString */
    public final long basicNum;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final long advancedNum;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final long twapNum;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final long totalNum;

    /* JADX INFO: compiled from: OrdersNumViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/trade/viewModel/OrdersNum$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/kubi/kumex/trade/viewModel/OrdersNum;", "getDEFAULT", "()Lcom/kubi/kumex/trade/viewModel/OrdersNum;", "DEFAULT$delegate", "Lkotlin/Lazy;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final OrdersNum getDEFAULT() {
            return (OrdersNum) OrdersNum.f30727f.getValue();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrdersNum)) {
            return false;
        }
        OrdersNum ordersNum = (OrdersNum) other;
        return this.basicNum == ordersNum.basicNum && this.advancedNum == ordersNum.advancedNum && this.twapNum == ordersNum.twapNum && this.totalNum == ordersNum.totalNum;
    }

    /* JADX INFO: renamed from: b */
    public static final OrdersNum m36404b() {
        return new OrdersNum(0L, 0L, 0L, 0L);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getAdvancedNum() {
        return this.advancedNum;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getBasicNum() {
        return this.basicNum;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTotalNum() {
        return this.totalNum;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTwapNum() {
        return this.twapNum;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.basicNum) * 31) + Long.hashCode(this.advancedNum)) * 31) + Long.hashCode(this.twapNum)) * 31) + Long.hashCode(this.totalNum);
    }

    @NotNull
    public String toString() {
        return "OrdersNum(basicNum=" + this.basicNum + ", advancedNum=" + this.advancedNum + ", twapNum=" + this.twapNum + ", totalNum=" + this.totalNum + ')';
    }

    public OrdersNum(long j11, long j12, long j13, long j14) {
        this.basicNum = j11;
        this.advancedNum = j12;
        this.twapNum = j13;
        this.totalNum = j14;
    }
}
