package com.kubi.tradebase.orderbook;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IOrderBookData.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003JK\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016¨\u0006("}, m90084d2 = {"Lcom/kubi/tradebase/orderbook/OrderBookItemData;", "", "displayPrice", "", "singleAmount", "Lcom/kubi/tradebase/orderbook/DisPlayAmount;", "totalAmount", "displayProgress", "", "isDelegationMark", "", "textSize", "<init>", "(Ljava/lang/String;Lcom/kubi/tradebase/orderbook/DisPlayAmount;Lcom/kubi/tradebase/orderbook/DisPlayAmount;FZF)V", "getDisplayPrice", "()Ljava/lang/String;", "getSingleAmount", "()Lcom/kubi/tradebase/orderbook/DisPlayAmount;", "getTotalAmount", "getDisplayProgress", "()F", "setDisplayProgress", "(F)V", "()Z", "setDelegationMark", "(Z)V", "getTextSize", "setTextSize", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderBookItemData {

    @Nullable
    private final String displayPrice;
    private float displayProgress;
    private boolean isDelegationMark;

    @Nullable
    private final DisPlayAmount singleAmount;
    private float textSize;

    @Nullable
    private final DisPlayAmount totalAmount;

    public OrderBookItemData() {
        this(null, null, null, 0.0f, false, 0.0f, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderBookItemData)) {
            return false;
        }
        OrderBookItemData orderBookItemData = (OrderBookItemData) other;
        return Intrinsics.areEqual(this.displayPrice, orderBookItemData.displayPrice) && Intrinsics.areEqual(this.singleAmount, orderBookItemData.singleAmount) && Intrinsics.areEqual(this.totalAmount, orderBookItemData.totalAmount) && Float.compare(this.displayProgress, orderBookItemData.displayProgress) == 0 && this.isDelegationMark == orderBookItemData.isDelegationMark && Float.compare(this.textSize, orderBookItemData.textSize) == 0;
    }

    public OrderBookItemData(@Nullable String str, @Nullable DisPlayAmount disPlayAmount, @Nullable DisPlayAmount disPlayAmount2, float f11, boolean z11, float f12) {
        this.displayPrice = str;
        this.singleAmount = disPlayAmount;
        this.totalAmount = disPlayAmount2;
        this.displayProgress = f11;
        this.isDelegationMark = z11;
        this.textSize = f12;
    }

    public static /* synthetic */ OrderBookItemData copy$default(OrderBookItemData orderBookItemData, String str, DisPlayAmount disPlayAmount, DisPlayAmount disPlayAmount2, float f11, boolean z11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderBookItemData.displayPrice;
        }
        if ((i11 & 2) != 0) {
            disPlayAmount = orderBookItemData.singleAmount;
        }
        if ((i11 & 4) != 0) {
            disPlayAmount2 = orderBookItemData.totalAmount;
        }
        if ((i11 & 8) != 0) {
            f11 = orderBookItemData.displayProgress;
        }
        if ((i11 & 16) != 0) {
            z11 = orderBookItemData.isDelegationMark;
        }
        if ((i11 & 32) != 0) {
            f12 = orderBookItemData.textSize;
        }
        boolean z12 = z11;
        float f13 = f12;
        return orderBookItemData.copy(str, disPlayAmount, disPlayAmount2, f11, z12, f13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DisPlayAmount getSingleAmount() {
        return this.singleAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DisPlayAmount getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getDisplayProgress() {
        return this.displayProgress;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsDelegationMark() {
        return this.isDelegationMark;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    @NotNull
    public final OrderBookItemData copy(@Nullable String displayPrice, @Nullable DisPlayAmount singleAmount, @Nullable DisPlayAmount totalAmount, float displayProgress, boolean isDelegationMark, float textSize) {
        return new OrderBookItemData(displayPrice, singleAmount, totalAmount, displayProgress, isDelegationMark, textSize);
    }

    @Nullable
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    public final float getDisplayProgress() {
        return this.displayProgress;
    }

    @Nullable
    public final DisPlayAmount getSingleAmount() {
        return this.singleAmount;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @Nullable
    public final DisPlayAmount getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        String str = this.displayPrice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DisPlayAmount disPlayAmount = this.singleAmount;
        int iHashCode2 = (iHashCode + (disPlayAmount == null ? 0 : disPlayAmount.hashCode())) * 31;
        DisPlayAmount disPlayAmount2 = this.totalAmount;
        return ((((((iHashCode2 + (disPlayAmount2 != null ? disPlayAmount2.hashCode() : 0)) * 31) + Float.hashCode(this.displayProgress)) * 31) + Boolean.hashCode(this.isDelegationMark)) * 31) + Float.hashCode(this.textSize);
    }

    public final boolean isDelegationMark() {
        return this.isDelegationMark;
    }

    public final void setDelegationMark(boolean z11) {
        this.isDelegationMark = z11;
    }

    public final void setDisplayProgress(float f11) {
        this.displayProgress = f11;
    }

    public final void setTextSize(float f11) {
        this.textSize = f11;
    }

    @NotNull
    public String toString() {
        return "OrderBookItemData(displayPrice=" + this.displayPrice + ", singleAmount=" + this.singleAmount + ", totalAmount=" + this.totalAmount + ", displayProgress=" + this.displayProgress + ", isDelegationMark=" + this.isDelegationMark + ", textSize=" + this.textSize + ')';
    }

    public /* synthetic */ OrderBookItemData(String str, DisPlayAmount disPlayAmount, DisPlayAmount disPlayAmount2, float f11, boolean z11, float f12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i11 & 1) != 0 ? null : str;
        if ((i11 & 2) != 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            disPlayAmount = new DisPlayAmount("--", ZERO);
        }
        if ((i11 & 4) != 0) {
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            disPlayAmount2 = new DisPlayAmount("--", ZERO2);
        }
        this(str, disPlayAmount, disPlayAmount2, (i11 & 8) != 0 ? 0.0f : f11, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? 12.0f : f12);
    }
}
