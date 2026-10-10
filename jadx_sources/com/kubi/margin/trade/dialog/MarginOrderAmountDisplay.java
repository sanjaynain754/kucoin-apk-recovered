package com.kubi.margin.trade.dialog;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.trade.dialog.w1, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: MarginConfirmDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/MarginOrderAmountDisplay;", "", "labelRes", "", "value", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "<init>", "(ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getLabelRes", "()I", "getValue", "()Ljava/math/BigDecimal;", "getCurrency", "()Ljava/lang/String;", "getCurrencyName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginOrderAmountDisplay {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final int labelRes;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final BigDecimal value;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String currency;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String currencyName;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginOrderAmountDisplay)) {
            return false;
        }
        MarginOrderAmountDisplay marginOrderAmountDisplay = (MarginOrderAmountDisplay) other;
        return this.labelRes == marginOrderAmountDisplay.labelRes && Intrinsics.areEqual(this.value, marginOrderAmountDisplay.value) && Intrinsics.areEqual(this.currency, marginOrderAmountDisplay.currency) && Intrinsics.areEqual(this.currencyName, marginOrderAmountDisplay.currencyName);
    }

    public MarginOrderAmountDisplay(int i11, @NotNull BigDecimal value, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.labelRes = i11;
        this.value = value;
        this.currency = str;
        this.currencyName = str2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLabelRes() {
        return this.labelRes;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.labelRes) * 31) + this.value.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencyName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginOrderAmountDisplay(labelRes=" + this.labelRes + ", value=" + this.value + ", currency=" + this.currency + ", currencyName=" + this.currencyName + ')';
    }
}
