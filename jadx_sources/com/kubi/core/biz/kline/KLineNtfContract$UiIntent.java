package com.kubi.core.biz.kline;

import com.kubi.core.base.TradeAccountType;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KLineNtfContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "SymbolChange", "ChangeInCallAuctionTrade", "RefreshPosition", "KLineHide", "KLineShow", "ClickNftToggleBtn", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$ChangeInCallAuctionTrade;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$ClickNftToggleBtn;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$KLineHide;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$KLineShow;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$RefreshPosition;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$SymbolChange;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class KLineNtfContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: KLineNtfContract.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$ChangeInCallAuctionTrade;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;", "symbol", "", "isInCallAuctionTrade", "", "<init>", "(Ljava/lang/String;Z)V", "getSymbol", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ChangeInCallAuctionTrade extends KLineNtfContract$UiIntent {
        private final boolean isInCallAuctionTrade;

        @NotNull
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeInCallAuctionTrade)) {
                return false;
            }
            ChangeInCallAuctionTrade changeInCallAuctionTrade = (ChangeInCallAuctionTrade) other;
            return Intrinsics.areEqual(this.symbol, changeInCallAuctionTrade.symbol) && this.isInCallAuctionTrade == changeInCallAuctionTrade.isInCallAuctionTrade;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeInCallAuctionTrade(@NotNull String symbol, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
            this.isInCallAuctionTrade = z11;
        }

        public int hashCode() {
            return (this.symbol.hashCode() * 31) + Boolean.hashCode(this.isInCallAuctionTrade);
        }

        /* JADX INFO: renamed from: isInCallAuctionTrade, reason: from getter */
        public final boolean getIsInCallAuctionTrade() {
            return this.isInCallAuctionTrade;
        }

        @NotNull
        public String toString() {
            return "ChangeInCallAuctionTrade(symbol=" + this.symbol + ", isInCallAuctionTrade=" + this.isInCallAuctionTrade + ')';
        }
    }

    /* JADX INFO: compiled from: KLineNtfContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$ClickNftToggleBtn;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;", "isInCallAuctionTrade", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ClickNftToggleBtn extends KLineNtfContract$UiIntent {
        private final boolean isInCallAuctionTrade;

        public ClickNftToggleBtn(boolean z11) {
            super(null);
            this.isInCallAuctionTrade = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClickNftToggleBtn) && this.isInCallAuctionTrade == ((ClickNftToggleBtn) other).isInCallAuctionTrade;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInCallAuctionTrade);
        }

        @NotNull
        public String toString() {
            return "ClickNftToggleBtn(isInCallAuctionTrade=" + this.isInCallAuctionTrade + ')';
        }
    }

    /* JADX INFO: compiled from: KLineNtfContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$KLineHide;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class KLineHide extends KLineNtfContract$UiIntent {

        @NotNull
        public static final KLineHide INSTANCE = new KLineHide();

        private KLineHide() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof KLineHide);
        }

        @NotNull
        public String toString() {
            return "KLineHide";
        }

        public int hashCode() {
            return 319247893;
        }
    }

    /* JADX INFO: compiled from: KLineNtfContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$KLineShow;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class KLineShow extends KLineNtfContract$UiIntent {

        @NotNull
        public static final KLineShow INSTANCE = new KLineShow();

        private KLineShow() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof KLineShow);
        }

        @NotNull
        public String toString() {
            return "KLineShow";
        }

        public int hashCode() {
            return 319574992;
        }
    }

    /* JADX INFO: compiled from: KLineNtfContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$RefreshPosition;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RefreshPosition extends KLineNtfContract$UiIntent {

        @NotNull
        public static final RefreshPosition INSTANCE = new RefreshPosition();

        private RefreshPosition() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof RefreshPosition);
        }

        @NotNull
        public String toString() {
            return "RefreshPosition";
        }

        public int hashCode() {
            return 690713432;
        }
    }

    /* JADX INFO: compiled from: KLineNtfContract.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent$SymbolChange;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;", "symbol", "", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "<init>", "(Ljava/lang/String;Lcom/kubi/core/base/TradeAccountType;)V", "getSymbol", "()Ljava/lang/String;", "getTradeAccountType", "()Lcom/kubi/core/base/TradeAccountType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SymbolChange extends KLineNtfContract$UiIntent {

        @NotNull
        private final String symbol;

        @Nullable
        private final TradeAccountType tradeAccountType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SymbolChange)) {
                return false;
            }
            SymbolChange symbolChange = (SymbolChange) other;
            return Intrinsics.areEqual(this.symbol, symbolChange.symbol) && Intrinsics.areEqual(this.tradeAccountType, symbolChange.tradeAccountType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SymbolChange(@NotNull String symbol, @Nullable TradeAccountType tradeAccountType) {
            super(null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
            this.tradeAccountType = tradeAccountType;
        }

        @NotNull
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        public final TradeAccountType getTradeAccountType() {
            return this.tradeAccountType;
        }

        public int hashCode() {
            int iHashCode = this.symbol.hashCode() * 31;
            TradeAccountType tradeAccountType = this.tradeAccountType;
            return iHashCode + (tradeAccountType == null ? 0 : tradeAccountType.hashCode());
        }

        @NotNull
        public String toString() {
            return "SymbolChange(symbol=" + this.symbol + ", tradeAccountType=" + this.tradeAccountType + ')';
        }
    }

    public /* synthetic */ KLineNtfContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private KLineNtfContract$UiIntent() {
    }
}
