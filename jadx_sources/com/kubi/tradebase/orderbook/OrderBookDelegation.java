package com.kubi.tradebase.orderbook;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IOrderBookData.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/tradebase/orderbook/OrderBookDelegation;", "", "isBuy", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "displayPrice", "", "<init>", "(ZLjava/math/BigDecimal;Ljava/lang/String;)V", "()Z", "setBuy", "(Z)V", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getDisplayPrice", "()Ljava/lang/String;", "setDisplayPrice", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderBookDelegation {

    @Nullable
    private String displayPrice;
    private boolean isBuy;

    @Nullable
    private BigDecimal price;

    public OrderBookDelegation() {
        this(false, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderBookDelegation)) {
            return false;
        }
        OrderBookDelegation orderBookDelegation = (OrderBookDelegation) other;
        return this.isBuy == orderBookDelegation.isBuy && Intrinsics.areEqual(this.price, orderBookDelegation.price) && Intrinsics.areEqual(this.displayPrice, orderBookDelegation.displayPrice);
    }

    public OrderBookDelegation(boolean z11, @Nullable BigDecimal bigDecimal, @Nullable String str) {
        this.isBuy = z11;
        this.price = bigDecimal;
        this.displayPrice = str;
    }

    public static /* synthetic */ OrderBookDelegation copy$default(OrderBookDelegation orderBookDelegation, boolean z11, BigDecimal bigDecimal, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = orderBookDelegation.isBuy;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = orderBookDelegation.price;
        }
        if ((i11 & 4) != 0) {
            str = orderBookDelegation.displayPrice;
        }
        return orderBookDelegation.copy(z11, bigDecimal, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsBuy() {
        return this.isBuy;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    @NotNull
    public final OrderBookDelegation copy(boolean isBuy, @Nullable BigDecimal price, @Nullable String displayPrice) {
        return new OrderBookDelegation(isBuy, price, displayPrice);
    }

    @Nullable
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isBuy) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.displayPrice;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isBuy() {
        return this.isBuy;
    }

    public final void setBuy(boolean z11) {
        this.isBuy = z11;
    }

    public final void setDisplayPrice(@Nullable String str) {
        this.displayPrice = str;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "OrderBookDelegation(isBuy=" + this.isBuy + ", price=" + this.price + ", displayPrice=" + this.displayPrice + ')';
    }

    public /* synthetic */ OrderBookDelegation(boolean z11, BigDecimal bigDecimal, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : str);
    }
}
