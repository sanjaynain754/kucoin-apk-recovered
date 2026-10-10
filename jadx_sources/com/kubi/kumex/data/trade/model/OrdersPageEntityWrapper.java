package com.kubi.kumex.data.trade.model;

import com.kubi.kumex.data.trade.model.OrdersPageEntityWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderSocketEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/OrdersPageEntityWrapper;", "", "pageEntity", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "throwable", "", "<init>", "(Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;Ljava/lang/Throwable;)V", "getPageEntity", "()Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrdersPageEntityWrapper {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f28844c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<OrdersPageEntityWrapper> f28845d = LazyKt.lazy(new Function0() { // from class: cm.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrdersPageEntityWrapper.m33472b();
        }
    });

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final OrdersPageEntity pageEntity;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final Throwable throwable;

    /* JADX INFO: compiled from: OrderSocketEntity.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/OrdersPageEntityWrapper$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntityWrapper;", "getDEFAULT", "()Lcom/kubi/kumex/data/trade/model/OrdersPageEntityWrapper;", "DEFAULT$delegate", "Lkotlin/Lazy;", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final OrdersPageEntityWrapper getDEFAULT() {
            return (OrdersPageEntityWrapper) OrdersPageEntityWrapper.f28845d.getValue();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrdersPageEntityWrapper)) {
            return false;
        }
        OrdersPageEntityWrapper ordersPageEntityWrapper = (OrdersPageEntityWrapper) other;
        return Intrinsics.areEqual(this.pageEntity, ordersPageEntityWrapper.pageEntity) && Intrinsics.areEqual(this.throwable, ordersPageEntityWrapper.throwable);
    }

    public OrdersPageEntityWrapper(@NotNull OrdersPageEntity pageEntity, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(pageEntity, "pageEntity");
        this.pageEntity = pageEntity;
        this.throwable = th2;
    }

    /* JADX INFO: renamed from: b */
    public static final OrdersPageEntityWrapper m33472b() {
        return new OrdersPageEntityWrapper(new OrdersPageEntity(null, 0L, 3, null), null);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final OrdersPageEntity getPageEntity() {
        return this.pageEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = this.pageEntity.hashCode() * 31;
        Throwable th2 = this.throwable;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    @NotNull
    public String toString() {
        return "OrdersPageEntityWrapper(pageEntity=" + this.pageEntity + ", throwable=" + this.throwable + ')';
    }
}
