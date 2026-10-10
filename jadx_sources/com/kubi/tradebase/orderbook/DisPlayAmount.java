package com.kubi.tradebase.orderbook;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IOrderBookData.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/tradebase/orderbook/DisPlayAmount;", "", "displayAmount", "", "valueAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getDisplayAmount", "()Ljava/lang/String;", "setDisplayAmount", "(Ljava/lang/String;)V", "getValueAmount", "()Ljava/math/BigDecimal;", "setValueAmount", "(Ljava/math/BigDecimal;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DisPlayAmount {

    @NotNull
    private String displayAmount;

    @NotNull
    private BigDecimal valueAmount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisPlayAmount)) {
            return false;
        }
        DisPlayAmount disPlayAmount = (DisPlayAmount) other;
        return Intrinsics.areEqual(this.displayAmount, disPlayAmount.displayAmount) && Intrinsics.areEqual(this.valueAmount, disPlayAmount.valueAmount);
    }

    public DisPlayAmount(@NotNull String displayAmount, @NotNull BigDecimal valueAmount) {
        Intrinsics.checkNotNullParameter(displayAmount, "displayAmount");
        Intrinsics.checkNotNullParameter(valueAmount, "valueAmount");
        this.displayAmount = displayAmount;
        this.valueAmount = valueAmount;
    }

    public static /* synthetic */ DisPlayAmount copy$default(DisPlayAmount disPlayAmount, String str, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = disPlayAmount.displayAmount;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = disPlayAmount.valueAmount;
        }
        return disPlayAmount.copy(str, bigDecimal);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayAmount() {
        return this.displayAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getValueAmount() {
        return this.valueAmount;
    }

    @NotNull
    public final DisPlayAmount copy(@NotNull String displayAmount, @NotNull BigDecimal valueAmount) {
        Intrinsics.checkNotNullParameter(displayAmount, "displayAmount");
        Intrinsics.checkNotNullParameter(valueAmount, "valueAmount");
        return new DisPlayAmount(displayAmount, valueAmount);
    }

    @NotNull
    public final String getDisplayAmount() {
        return this.displayAmount;
    }

    @NotNull
    public final BigDecimal getValueAmount() {
        return this.valueAmount;
    }

    public int hashCode() {
        return (this.displayAmount.hashCode() * 31) + this.valueAmount.hashCode();
    }

    public final void setDisplayAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.displayAmount = str;
    }

    public final void setValueAmount(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.valueAmount = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "DisPlayAmount(displayAmount=" + this.displayAmount + ", valueAmount=" + this.valueAmount + ')';
    }
}
