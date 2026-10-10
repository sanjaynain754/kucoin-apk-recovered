package com.kubi.margin.entity;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006#"}, m90084d2 = {"Lcom/kubi/margin/entity/OrderBook;", "", "bids", "", "", "asks", JPushConstants.Operation.KEY_SEQUENCE, "", "timestamp", "<init>", "(Ljava/util/List;Ljava/util/List;JJ)V", "getBids", "()Ljava/util/List;", "setBids", "(Ljava/util/List;)V", "getAsks", "setAsks", "getSequence", "()J", "setSequence", "(J)V", "getTimestamp", "setTimestamp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderBook {

    @NotNull
    private List<double[]> asks;

    @NotNull
    private List<double[]> bids;
    private long sequence;
    private long timestamp;

    public OrderBook(@NotNull List<double[]> bids, @NotNull List<double[]> asks, long j11, long j12) {
        Intrinsics.checkNotNullParameter(bids, "bids");
        Intrinsics.checkNotNullParameter(asks, "asks");
        this.bids = bids;
        this.asks = asks;
        this.sequence = j11;
        this.timestamp = j12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderBook)) {
            return false;
        }
        OrderBook orderBook = (OrderBook) other;
        return Intrinsics.areEqual(this.bids, orderBook.bids) && Intrinsics.areEqual(this.asks, orderBook.asks) && this.sequence == orderBook.sequence && this.timestamp == orderBook.timestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderBook copy$default(OrderBook orderBook, List list, List list2, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderBook.bids;
        }
        if ((i11 & 2) != 0) {
            list2 = orderBook.asks;
        }
        if ((i11 & 4) != 0) {
            j11 = orderBook.sequence;
        }
        if ((i11 & 8) != 0) {
            j12 = orderBook.timestamp;
        }
        long j13 = j12;
        return orderBook.copy(list, list2, j11, j13);
    }

    @NotNull
    public final List<double[]> component1() {
        return this.bids;
    }

    @NotNull
    public final List<double[]> component2() {
        return this.asks;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSequence() {
        return this.sequence;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final OrderBook copy(@NotNull List<double[]> bids, @NotNull List<double[]> asks, long sequence, long timestamp) {
        Intrinsics.checkNotNullParameter(bids, "bids");
        Intrinsics.checkNotNullParameter(asks, "asks");
        return new OrderBook(bids, asks, sequence, timestamp);
    }

    @NotNull
    public final List<double[]> getAsks() {
        return this.asks;
    }

    @NotNull
    public final List<double[]> getBids() {
        return this.bids;
    }

    public final long getSequence() {
        return this.sequence;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((this.bids.hashCode() * 31) + this.asks.hashCode()) * 31) + Long.hashCode(this.sequence)) * 31) + Long.hashCode(this.timestamp);
    }

    public final void setAsks(@NotNull List<double[]> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.asks = list;
    }

    public final void setBids(@NotNull List<double[]> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.bids = list;
    }

    public final void setSequence(long j11) {
        this.sequence = j11;
    }

    public final void setTimestamp(long j11) {
        this.timestamp = j11;
    }

    @NotNull
    public String toString() {
        return "OrderBook(bids=" + this.bids + ", asks=" + this.asks + ", sequence=" + this.sequence + ", timestamp=" + this.timestamp + ')';
    }

    public /* synthetic */ OrderBook(List list, List list2, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i11 & 4) != 0 ? 0L : j11, j12);
    }
}
