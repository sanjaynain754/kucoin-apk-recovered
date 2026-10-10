package com.kubi.margin.trade.dialog;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.trade.dialog.b */
/* JADX INFO: compiled from: CrossMarginCloseContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$CurrencyConfigState;", "", "Loading", "Success", "Failed", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$CurrencyConfigState$Failed;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$CurrencyConfigState$Loading;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$CurrencyConfigState$Success;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC18232b {

    /* JADX INFO: renamed from: com.kubi.margin.trade.dialog.b$a */
    /* JADX INFO: compiled from: CrossMarginCloseContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$CurrencyConfigState$Failed;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$CurrencyConfigState;", "<init>", "()V", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC18232b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f33788a = new a();
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.dialog.b$b */
    /* JADX INFO: compiled from: CrossMarginCloseContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$CurrencyConfigState$Loading;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$CurrencyConfigState;", "<init>", "()V", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements InterfaceC18232b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f33789a = new b();
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.dialog.b$c, reason: from toString */
    /* JADX INFO: compiled from: CrossMarginCloseContract.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$CurrencyConfigState$Success;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$CurrencyConfigState;", "selected", "Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;", "currencyList", "", "<init>", "(Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;Ljava/util/List;)V", "getSelected", "()Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;", "getCurrencyList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Success implements InterfaceC18232b {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final ClosePositionCurrency selected;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final List<ClosePositionCurrency> currencyList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.selected, success.selected) && Intrinsics.areEqual(this.currencyList, success.currencyList);
        }

        public Success(@Nullable ClosePositionCurrency closePositionCurrency, @NotNull List<ClosePositionCurrency> currencyList) {
            Intrinsics.checkNotNullParameter(currencyList, "currencyList");
            this.selected = closePositionCurrency;
            this.currencyList = currencyList;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<ClosePositionCurrency> m40268a() {
            return this.currencyList;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ClosePositionCurrency getSelected() {
            return this.selected;
        }

        public int hashCode() {
            ClosePositionCurrency closePositionCurrency = this.selected;
            return ((closePositionCurrency == null ? 0 : closePositionCurrency.hashCode()) * 31) + this.currencyList.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(selected=" + this.selected + ", currencyList=" + this.currencyList + ')';
        }
    }
}
