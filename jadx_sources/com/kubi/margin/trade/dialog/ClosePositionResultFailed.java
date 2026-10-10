package com.kubi.margin.trade.dialog;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.trade.dialog.e, reason: from toString */
/* JADX INFO: compiled from: CrossMarginCloseContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$Event$ClosePositionResultFailed;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$Event;", "isFromPassword", "", FirebaseAnalytics.Param.CURRENCY, "Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;", "e", "", "<init>", "(ZLcom/kubi/margin/trade/dialog/ClosePositionCurrency;Ljava/lang/Throwable;)V", "()Z", "getCurrency", "()Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;", "getE", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ClosePositionResultFailed implements InterfaceC36952a {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isFromPassword;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final ClosePositionCurrency currency;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final Throwable e;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClosePositionResultFailed)) {
            return false;
        }
        ClosePositionResultFailed closePositionResultFailed = (ClosePositionResultFailed) other;
        return this.isFromPassword == closePositionResultFailed.isFromPassword && Intrinsics.areEqual(this.currency, closePositionResultFailed.currency) && Intrinsics.areEqual(this.e, closePositionResultFailed.e);
    }

    public ClosePositionResultFailed(boolean z11, @Nullable ClosePositionCurrency closePositionCurrency, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.isFromPassword = z11;
        this.currency = closePositionCurrency;
        this.e = e11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Throwable getE() {
        return this.e;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isFromPassword) * 31;
        ClosePositionCurrency closePositionCurrency = this.currency;
        return ((iHashCode + (closePositionCurrency == null ? 0 : closePositionCurrency.hashCode())) * 31) + this.e.hashCode();
    }

    @NotNull
    public String toString() {
        return "ClosePositionResultFailed(isFromPassword=" + this.isFromPassword + ", currency=" + this.currency + ", e=" + this.e + ')';
    }
}
