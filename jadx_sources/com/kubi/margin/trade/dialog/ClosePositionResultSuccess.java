package com.kubi.margin.trade.dialog;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.trade.dialog.f, reason: from toString */
/* JADX INFO: compiled from: CrossMarginCloseContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$Event$ClosePositionResultSuccess;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$Event;", "isFromPassword", "", FirebaseAnalytics.Param.CURRENCY, "Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;", DbParams.KEY_CHANNEL_RESULT, "", "<init>", "(ZLcom/kubi/margin/trade/dialog/ClosePositionCurrency;Ljava/lang/Object;)V", "()Z", "getCurrency", "()Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;", "getResult", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ClosePositionResultSuccess implements InterfaceC36952a {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isFromPassword;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final ClosePositionCurrency currency;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Object result;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClosePositionResultSuccess)) {
            return false;
        }
        ClosePositionResultSuccess closePositionResultSuccess = (ClosePositionResultSuccess) other;
        return this.isFromPassword == closePositionResultSuccess.isFromPassword && Intrinsics.areEqual(this.currency, closePositionResultSuccess.currency) && Intrinsics.areEqual(this.result, closePositionResultSuccess.result);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isFromPassword) * 31;
        ClosePositionCurrency closePositionCurrency = this.currency;
        int iHashCode2 = (iHashCode + (closePositionCurrency == null ? 0 : closePositionCurrency.hashCode())) * 31;
        Object obj = this.result;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ClosePositionResultSuccess(isFromPassword=" + this.isFromPassword + ", currency=" + this.currency + ", result=" + this.result + ')';
    }

    public ClosePositionResultSuccess(boolean z11, @Nullable ClosePositionCurrency closePositionCurrency, @Nullable Object obj) {
        this.isFromPassword = z11;
        this.currency = closePositionCurrency;
        this.result = obj;
    }
}
