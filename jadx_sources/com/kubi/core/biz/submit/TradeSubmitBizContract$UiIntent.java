package com.kubi.core.biz.submit;

import com.google.common.net.HttpHeaders;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.tradebase.tradetype.TradeType;
import io.reactivex.disposables.CompositeDisposable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38170b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeSubmitBizContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "ChangeSymbol", "UpdateSymbolInfo", "UpdateBbo", "UpdateInputPrice", "UpdateInputTriggerPrice", "UpdateCallAuctionState", "Hide", HttpHeaders.REFRESH, "ChangeTradeType", "ChangeBuyOrSellDirection", "FetchSymbolBalance", "PanelModelChange", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeBuyOrSellDirection;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeSymbol;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeTradeType;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$FetchSymbolBalance;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$Hide;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$PanelModelChange;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$Refresh;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateBbo;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateCallAuctionState;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateInputPrice;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateInputTriggerPrice;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateSymbolInfo;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class TradeSubmitBizContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeBuyOrSellDirection;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "isBuy", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ChangeBuyOrSellDirection extends TradeSubmitBizContract$UiIntent {
        private final boolean isBuy;

        public ChangeBuyOrSellDirection(boolean z11) {
            super(null);
            this.isBuy = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeBuyOrSellDirection) && this.isBuy == ((ChangeBuyOrSellDirection) other).isBuy;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isBuy);
        }

        /* JADX INFO: renamed from: isBuy, reason: from getter */
        public final boolean getIsBuy() {
            return this.isBuy;
        }

        @NotNull
        public String toString() {
            return "ChangeBuyOrSellDirection(isBuy=" + this.isBuy + ')';
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeSymbol;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "symbol", "", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "<init>", "(Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;)V", "getSymbol", "()Ljava/lang/String;", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ChangeSymbol extends TradeSubmitBizContract$UiIntent {

        @Nullable
        private final String symbol;

        @Nullable
        private final SymbolInfoEntity symbolInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public ChangeSymbol() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeSymbol)) {
                return false;
            }
            ChangeSymbol changeSymbol = (ChangeSymbol) other;
            return Intrinsics.areEqual(this.symbol, changeSymbol.symbol) && Intrinsics.areEqual(this.symbolInfo, changeSymbol.symbolInfo);
        }

        public /* synthetic */ ChangeSymbol(String str, SymbolInfoEntity symbolInfoEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : symbolInfoEntity);
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        @Nullable
        public final SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        public int hashCode() {
            String str = this.symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
            return iHashCode + (symbolInfoEntity != null ? symbolInfoEntity.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ChangeSymbol(symbol=" + this.symbol + ", symbolInfo=" + this.symbolInfo + ')';
        }

        public ChangeSymbol(@Nullable String str, @Nullable SymbolInfoEntity symbolInfoEntity) {
            super(null);
            this.symbol = str;
            this.symbolInfo = symbolInfoEntity;
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$ChangeTradeType;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "<init>", "(Lcom/kubi/tradebase/tradetype/TradeType;)V", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ChangeTradeType extends TradeSubmitBizContract$UiIntent {

        @NotNull
        private final TradeType tradeType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeTradeType) && this.tradeType == ((ChangeTradeType) other).tradeType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeTradeType(@NotNull TradeType tradeType) {
            super(null);
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            this.tradeType = tradeType;
        }

        @NotNull
        public final TradeType getTradeType() {
            return this.tradeType;
        }

        public int hashCode() {
            return this.tradeType.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChangeTradeType(tradeType=" + this.tradeType + ')';
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$FetchSymbolBalance;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "<init>", "(Lcom/kubi/data/entity/SymbolInfoEntity;Lio/reactivex/disposables/CompositeDisposable;)V", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchSymbolBalance extends TradeSubmitBizContract$UiIntent {

        @Nullable
        private final CompositeDisposable disposable;

        @Nullable
        private final SymbolInfoEntity symbolInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public FetchSymbolBalance() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchSymbolBalance)) {
                return false;
            }
            FetchSymbolBalance fetchSymbolBalance = (FetchSymbolBalance) other;
            return Intrinsics.areEqual(this.symbolInfo, fetchSymbolBalance.symbolInfo) && Intrinsics.areEqual(this.disposable, fetchSymbolBalance.disposable);
        }

        public /* synthetic */ FetchSymbolBalance(SymbolInfoEntity symbolInfoEntity, CompositeDisposable compositeDisposable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : symbolInfoEntity, (i11 & 2) != 0 ? null : compositeDisposable);
        }

        public int hashCode() {
            SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
            int iHashCode = (symbolInfoEntity == null ? 0 : symbolInfoEntity.hashCode()) * 31;
            CompositeDisposable compositeDisposable = this.disposable;
            return iHashCode + (compositeDisposable != null ? compositeDisposable.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FetchSymbolBalance(symbolInfo=" + this.symbolInfo + ", disposable=" + this.disposable + ')';
        }

        public FetchSymbolBalance(@Nullable SymbolInfoEntity symbolInfoEntity, @Nullable CompositeDisposable compositeDisposable) {
            super(null);
            this.symbolInfo = symbolInfoEntity;
            this.disposable = compositeDisposable;
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$Hide;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Hide extends TradeSubmitBizContract$UiIntent {

        @NotNull
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Hide);
        }

        @NotNull
        public String toString() {
            return "Hide";
        }

        public int hashCode() {
            return 1417750519;
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$PanelModelChange;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "panelModel", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "<init>", "(Lcom/kubi/core/base/setting/data/TradePanelModel;)V", "getPanelModel", "()Lcom/kubi/core/base/setting/data/TradePanelModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PanelModelChange extends TradeSubmitBizContract$UiIntent {

        @NotNull
        private final InterfaceC38170b panelModel;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PanelModelChange) && Intrinsics.areEqual(this.panelModel, ((PanelModelChange) other).panelModel);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PanelModelChange(@NotNull InterfaceC38170b panelModel) {
            super(null);
            Intrinsics.checkNotNullParameter(panelModel, "panelModel");
            this.panelModel = panelModel;
        }

        @NotNull
        public final InterfaceC38170b getPanelModel() {
            return this.panelModel;
        }

        public int hashCode() {
            return this.panelModel.hashCode();
        }

        @NotNull
        public String toString() {
            return "PanelModelChange(panelModel=" + this.panelModel + ')';
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$Refresh;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Refresh extends TradeSubmitBizContract$UiIntent {

        @NotNull
        public static final Refresh INSTANCE = new Refresh();

        private Refresh() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Refresh);
        }

        @NotNull
        public String toString() {
            return HttpHeaders.REFRESH;
        }

        public int hashCode() {
            return -329756666;
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateBbo;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "bbo", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "<init>", "(Lcom/kubi/core/spot/entity/OrderBookCenterEntity;)V", "getBbo", "()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateBbo extends TradeSubmitBizContract$UiIntent {

        @Nullable
        private final OrderBookCenterEntity bbo;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateBbo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateBbo) && Intrinsics.areEqual(this.bbo, ((UpdateBbo) other).bbo);
        }

        public UpdateBbo(@Nullable OrderBookCenterEntity orderBookCenterEntity) {
            super(null);
            this.bbo = orderBookCenterEntity;
        }

        @Nullable
        public final OrderBookCenterEntity getBbo() {
            return this.bbo;
        }

        public int hashCode() {
            OrderBookCenterEntity orderBookCenterEntity = this.bbo;
            if (orderBookCenterEntity == null) {
                return 0;
            }
            return orderBookCenterEntity.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateBbo(bbo=" + this.bbo + ')';
        }

        public /* synthetic */ UpdateBbo(OrderBookCenterEntity orderBookCenterEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : orderBookCenterEntity);
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateCallAuctionState;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "isInCallAuction", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateCallAuctionState extends TradeSubmitBizContract$UiIntent {
        private final boolean isInCallAuction;

        public UpdateCallAuctionState(boolean z11) {
            super(null);
            this.isInCallAuction = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateCallAuctionState) && this.isInCallAuction == ((UpdateCallAuctionState) other).isInCallAuction;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInCallAuction);
        }

        /* JADX INFO: renamed from: isInCallAuction, reason: from getter */
        public final boolean getIsInCallAuction() {
            return this.isInCallAuction;
        }

        @NotNull
        public String toString() {
            return "UpdateCallAuctionState(isInCallAuction=" + this.isInCallAuction + ')';
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateInputPrice;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "inputBuyPrice", "Ljava/math/BigDecimal;", "inputSellPrice", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getInputBuyPrice", "()Ljava/math/BigDecimal;", "getInputSellPrice", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateInputPrice extends TradeSubmitBizContract$UiIntent {

        @Nullable
        private final BigDecimal inputBuyPrice;

        @Nullable
        private final BigDecimal inputSellPrice;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateInputPrice() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateInputPrice)) {
                return false;
            }
            UpdateInputPrice updateInputPrice = (UpdateInputPrice) other;
            return Intrinsics.areEqual(this.inputBuyPrice, updateInputPrice.inputBuyPrice) && Intrinsics.areEqual(this.inputSellPrice, updateInputPrice.inputSellPrice);
        }

        public /* synthetic */ UpdateInputPrice(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2);
        }

        @Nullable
        public final BigDecimal getInputBuyPrice() {
            return this.inputBuyPrice;
        }

        @Nullable
        public final BigDecimal getInputSellPrice() {
            return this.inputSellPrice;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.inputBuyPrice;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.inputSellPrice;
            return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "UpdateInputPrice(inputBuyPrice=" + this.inputBuyPrice + ", inputSellPrice=" + this.inputSellPrice + ')';
        }

        public UpdateInputPrice(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
            super(null);
            this.inputBuyPrice = bigDecimal;
            this.inputSellPrice = bigDecimal2;
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateInputTriggerPrice;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "inputBuyTriggerPrice", "Ljava/math/BigDecimal;", "inputSellTriggerPrice", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getInputBuyTriggerPrice", "()Ljava/math/BigDecimal;", "getInputSellTriggerPrice", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateInputTriggerPrice extends TradeSubmitBizContract$UiIntent {

        @Nullable
        private final BigDecimal inputBuyTriggerPrice;

        @Nullable
        private final BigDecimal inputSellTriggerPrice;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateInputTriggerPrice() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateInputTriggerPrice)) {
                return false;
            }
            UpdateInputTriggerPrice updateInputTriggerPrice = (UpdateInputTriggerPrice) other;
            return Intrinsics.areEqual(this.inputBuyTriggerPrice, updateInputTriggerPrice.inputBuyTriggerPrice) && Intrinsics.areEqual(this.inputSellTriggerPrice, updateInputTriggerPrice.inputSellTriggerPrice);
        }

        public /* synthetic */ UpdateInputTriggerPrice(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2);
        }

        @Nullable
        public final BigDecimal getInputBuyTriggerPrice() {
            return this.inputBuyTriggerPrice;
        }

        @Nullable
        public final BigDecimal getInputSellTriggerPrice() {
            return this.inputSellTriggerPrice;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.inputBuyTriggerPrice;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.inputSellTriggerPrice;
            return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "UpdateInputTriggerPrice(inputBuyTriggerPrice=" + this.inputBuyTriggerPrice + ", inputSellTriggerPrice=" + this.inputSellTriggerPrice + ')';
        }

        public UpdateInputTriggerPrice(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
            super(null);
            this.inputBuyTriggerPrice = bigDecimal;
            this.inputSellTriggerPrice = bigDecimal2;
        }
    }

    /* JADX INFO: compiled from: TradeSubmitBizContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent$UpdateSymbolInfo;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "<init>", "(Lcom/kubi/data/entity/SymbolInfoEntity;)V", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class UpdateSymbolInfo extends TradeSubmitBizContract$UiIntent {

        @Nullable
        private final SymbolInfoEntity symbolInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateSymbolInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateSymbolInfo) && Intrinsics.areEqual(this.symbolInfo, ((UpdateSymbolInfo) other).symbolInfo);
        }

        public UpdateSymbolInfo(@Nullable SymbolInfoEntity symbolInfoEntity) {
            super(null);
            this.symbolInfo = symbolInfoEntity;
        }

        @Nullable
        public final SymbolInfoEntity getSymbolInfo() {
            return this.symbolInfo;
        }

        public int hashCode() {
            SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
            if (symbolInfoEntity == null) {
                return 0;
            }
            return symbolInfoEntity.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateSymbolInfo(symbolInfo=" + this.symbolInfo + ')';
        }

        public /* synthetic */ UpdateSymbolInfo(SymbolInfoEntity symbolInfoEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : symbolInfoEntity);
        }
    }

    public /* synthetic */ TradeSubmitBizContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TradeSubmitBizContract$UiIntent() {
    }
}
