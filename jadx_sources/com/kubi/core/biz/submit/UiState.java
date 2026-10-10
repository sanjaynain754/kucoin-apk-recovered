package com.kubi.core.biz.submit;

import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.spot.entity.MarginSymbolInfo;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.tradebase.tradetype.TradeType;
import java.math.BigDecimal;
import java.util.List;
import k30.AvailableTradeAmountState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p260fd.InterfaceC37432d;
import p309hd.InterfaceC38170b;
import p756xc.TradeSymbolBalance;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSubmitBizContract$UiState, reason: from toString */
/* JADX INFO: compiled from: TradeSubmitBizContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010G\u001a\u00020\u0015HÆ\u0003J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010K\u001a\u00020\u001eHÆ\u0003JÑ\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eHÆ\u0001J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006T"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;", "Lcom/kubi/core/base/arch/mvi/IBizUiStatus;", "symbol", "", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "tradeBalance", "Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;", "availableBalance", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "bbo", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "inputBuyPrice", "Ljava/math/BigDecimal;", "inputSellPrice", "inputBuyTriggerPrice", "inputSellTriggerPrice", "etfInfo", "Lcom/kubi/core/base/quote/data/EtfInfoData;", "panelModel", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "allActiveDelegations", "", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "supportTradeTypes", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "marginSymbolInfo", "Lcom/kubi/core/spot/entity/MarginSymbolInfo;", "availableTradeAmount", "Lcom/kubi/tradebase/available/AvailableTradeAmountState;", "<init>", "(Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/entity/OrderBookCenterEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/core/base/quote/data/EtfInfoData;Lcom/kubi/core/base/setting/data/TradePanelModel;Ljava/util/List;Ljava/util/List;Lcom/kubi/core/spot/entity/MarginSymbolInfo;Lcom/kubi/tradebase/available/AvailableTradeAmountState;)V", "getSymbol", "()Ljava/lang/String;", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "getTradeBalance", "()Lcom/kubi/core/base/arch/api/data/TradeSymbolBalance;", "getAvailableBalance", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "getBbo", "()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "getInputBuyPrice", "()Ljava/math/BigDecimal;", "getInputSellPrice", "getInputBuyTriggerPrice", "getInputSellTriggerPrice", "getEtfInfo", "()Lcom/kubi/core/base/quote/data/EtfInfoData;", "getPanelModel", "()Lcom/kubi/core/base/setting/data/TradePanelModel;", "getAllActiveDelegations", "()Ljava/util/List;", "getSupportTradeTypes", "getMarginSymbolInfo", "()Lcom/kubi/core/spot/entity/MarginSymbolInfo;", "getAvailableTradeAmount", "()Lcom/kubi/tradebase/available/AvailableTradeAmountState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UiState implements InterfaceC19284f {

    @Nullable
    private final List<OrderItem> allActiveDelegations;

    @Nullable
    private final TradeSymbolBalance availableBalance;

    @NotNull
    private final AvailableTradeAmountState availableTradeAmount;

    @Nullable
    private final OrderBookCenterEntity bbo;

    @Nullable
    private final InterfaceC37432d etfInfo;

    @Nullable
    private final BigDecimal inputBuyPrice;

    @Nullable
    private final BigDecimal inputBuyTriggerPrice;

    @Nullable
    private final BigDecimal inputSellPrice;

    @Nullable
    private final BigDecimal inputSellTriggerPrice;

    @Nullable
    private final MarginSymbolInfo marginSymbolInfo;

    @NotNull
    private final InterfaceC38170b panelModel;

    @Nullable
    private final List<TradeTypeUiData> supportTradeTypes;

    @Nullable
    private final String symbol;

    @Nullable
    private final SymbolInfoEntity symbolInfo;

    @Nullable
    private final TradeSymbolBalance tradeBalance;

    @Nullable
    private final TradeType tradeType;

    public UiState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiState)) {
            return false;
        }
        UiState uiState = (UiState) other;
        return Intrinsics.areEqual(this.symbol, uiState.symbol) && Intrinsics.areEqual(this.symbolInfo, uiState.symbolInfo) && Intrinsics.areEqual(this.tradeBalance, uiState.tradeBalance) && Intrinsics.areEqual(this.availableBalance, uiState.availableBalance) && this.tradeType == uiState.tradeType && Intrinsics.areEqual(this.bbo, uiState.bbo) && Intrinsics.areEqual(this.inputBuyPrice, uiState.inputBuyPrice) && Intrinsics.areEqual(this.inputSellPrice, uiState.inputSellPrice) && Intrinsics.areEqual(this.inputBuyTriggerPrice, uiState.inputBuyTriggerPrice) && Intrinsics.areEqual(this.inputSellTriggerPrice, uiState.inputSellTriggerPrice) && Intrinsics.areEqual(this.etfInfo, uiState.etfInfo) && Intrinsics.areEqual(this.panelModel, uiState.panelModel) && Intrinsics.areEqual(this.allActiveDelegations, uiState.allActiveDelegations) && Intrinsics.areEqual(this.supportTradeTypes, uiState.supportTradeTypes) && Intrinsics.areEqual(this.marginSymbolInfo, uiState.marginSymbolInfo) && Intrinsics.areEqual(this.availableTradeAmount, uiState.availableTradeAmount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiState(@Nullable String str, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable TradeSymbolBalance tradeSymbolBalance, @Nullable TradeSymbolBalance tradeSymbolBalance2, @Nullable TradeType tradeType, @Nullable OrderBookCenterEntity orderBookCenterEntity, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable InterfaceC37432d interfaceC37432d, @NotNull InterfaceC38170b panelModel, @Nullable List<OrderItem> list, @Nullable List<? extends TradeTypeUiData> list2, @Nullable MarginSymbolInfo marginSymbolInfo, @NotNull AvailableTradeAmountState availableTradeAmount) {
        Intrinsics.checkNotNullParameter(panelModel, "panelModel");
        Intrinsics.checkNotNullParameter(availableTradeAmount, "availableTradeAmount");
        this.symbol = str;
        this.symbolInfo = symbolInfoEntity;
        this.tradeBalance = tradeSymbolBalance;
        this.availableBalance = tradeSymbolBalance2;
        this.tradeType = tradeType;
        this.bbo = orderBookCenterEntity;
        this.inputBuyPrice = bigDecimal;
        this.inputSellPrice = bigDecimal2;
        this.inputBuyTriggerPrice = bigDecimal3;
        this.inputSellTriggerPrice = bigDecimal4;
        this.etfInfo = interfaceC37432d;
        this.panelModel = panelModel;
        this.allActiveDelegations = list;
        this.supportTradeTypes = list2;
        this.marginSymbolInfo = marginSymbolInfo;
        this.availableTradeAmount = availableTradeAmount;
    }

    @NotNull
    public final UiState copy(@Nullable String str, @Nullable SymbolInfoEntity symbolInfoEntity, @Nullable TradeSymbolBalance tradeSymbolBalance, @Nullable TradeSymbolBalance tradeSymbolBalance2, @Nullable TradeType tradeType, @Nullable OrderBookCenterEntity orderBookCenterEntity, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable InterfaceC37432d interfaceC37432d, @NotNull InterfaceC38170b panelModel, @Nullable List<OrderItem> list, @Nullable List<? extends TradeTypeUiData> list2, @Nullable MarginSymbolInfo marginSymbolInfo, @NotNull AvailableTradeAmountState availableTradeAmount) {
        Intrinsics.checkNotNullParameter(panelModel, "panelModel");
        Intrinsics.checkNotNullParameter(availableTradeAmount, "availableTradeAmount");
        return new UiState(str, symbolInfoEntity, tradeSymbolBalance, tradeSymbolBalance2, tradeType, orderBookCenterEntity, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, interfaceC37432d, panelModel, list, list2, marginSymbolInfo, availableTradeAmount);
    }

    @Nullable
    public final List<OrderItem> getAllActiveDelegations() {
        return this.allActiveDelegations;
    }

    @Nullable
    public final TradeSymbolBalance getAvailableBalance() {
        return this.availableBalance;
    }

    @NotNull
    public final AvailableTradeAmountState getAvailableTradeAmount() {
        return this.availableTradeAmount;
    }

    @Nullable
    public final OrderBookCenterEntity getBbo() {
        return this.bbo;
    }

    @Nullable
    public final InterfaceC37432d getEtfInfo() {
        return this.etfInfo;
    }

    @Nullable
    public final BigDecimal getInputBuyPrice() {
        return this.inputBuyPrice;
    }

    @Nullable
    public final BigDecimal getInputBuyTriggerPrice() {
        return this.inputBuyTriggerPrice;
    }

    @Nullable
    public final BigDecimal getInputSellPrice() {
        return this.inputSellPrice;
    }

    @Nullable
    public final BigDecimal getInputSellTriggerPrice() {
        return this.inputSellTriggerPrice;
    }

    @Nullable
    public final MarginSymbolInfo getMarginSymbolInfo() {
        return this.marginSymbolInfo;
    }

    @NotNull
    public final InterfaceC38170b getPanelModel() {
        return this.panelModel;
    }

    @Nullable
    public final List<TradeTypeUiData> getSupportTradeTypes() {
        return this.supportTradeTypes;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final SymbolInfoEntity getSymbolInfo() {
        return this.symbolInfo;
    }

    @Nullable
    public final TradeSymbolBalance getTradeBalance() {
        return this.tradeBalance;
    }

    @Nullable
    public final TradeType getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SymbolInfoEntity symbolInfoEntity = this.symbolInfo;
        int iHashCode2 = (iHashCode + (symbolInfoEntity == null ? 0 : symbolInfoEntity.hashCode())) * 31;
        TradeSymbolBalance tradeSymbolBalance = this.tradeBalance;
        int iHashCode3 = (iHashCode2 + (tradeSymbolBalance == null ? 0 : tradeSymbolBalance.hashCode())) * 31;
        TradeSymbolBalance tradeSymbolBalance2 = this.availableBalance;
        int iHashCode4 = (iHashCode3 + (tradeSymbolBalance2 == null ? 0 : tradeSymbolBalance2.hashCode())) * 31;
        TradeType tradeType = this.tradeType;
        int iHashCode5 = (iHashCode4 + (tradeType == null ? 0 : tradeType.hashCode())) * 31;
        OrderBookCenterEntity orderBookCenterEntity = this.bbo;
        int iHashCode6 = (iHashCode5 + (orderBookCenterEntity == null ? 0 : orderBookCenterEntity.hashCode())) * 31;
        BigDecimal bigDecimal = this.inputBuyPrice;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.inputSellPrice;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.inputBuyTriggerPrice;
        int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.inputSellTriggerPrice;
        int iHashCode10 = (iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        InterfaceC37432d interfaceC37432d = this.etfInfo;
        int iHashCode11 = (((iHashCode10 + (interfaceC37432d == null ? 0 : interfaceC37432d.hashCode())) * 31) + this.panelModel.hashCode()) * 31;
        List<OrderItem> list = this.allActiveDelegations;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<TradeTypeUiData> list2 = this.supportTradeTypes;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MarginSymbolInfo marginSymbolInfo = this.marginSymbolInfo;
        return ((iHashCode13 + (marginSymbolInfo != null ? marginSymbolInfo.hashCode() : 0)) * 31) + this.availableTradeAmount.hashCode();
    }

    @NotNull
    public String toString() {
        return "UiState(symbol=" + this.symbol + ", symbolInfo=" + this.symbolInfo + ", tradeBalance=" + this.tradeBalance + ", availableBalance=" + this.availableBalance + ", tradeType=" + this.tradeType + ", bbo=" + this.bbo + ", inputBuyPrice=" + this.inputBuyPrice + ", inputSellPrice=" + this.inputSellPrice + ", inputBuyTriggerPrice=" + this.inputBuyTriggerPrice + ", inputSellTriggerPrice=" + this.inputSellTriggerPrice + ", etfInfo=" + this.etfInfo + ", panelModel=" + this.panelModel + ", allActiveDelegations=" + this.allActiveDelegations + ", supportTradeTypes=" + this.supportTradeTypes + ", marginSymbolInfo=" + this.marginSymbolInfo + ", availableTradeAmount=" + this.availableTradeAmount + ')';
    }

    public /* synthetic */ UiState(String str, SymbolInfoEntity symbolInfoEntity, TradeSymbolBalance tradeSymbolBalance, TradeSymbolBalance tradeSymbolBalance2, TradeType tradeType, OrderBookCenterEntity orderBookCenterEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, InterfaceC37432d interfaceC37432d, InterfaceC38170b interfaceC38170b, List list, List list2, MarginSymbolInfo marginSymbolInfo, AvailableTradeAmountState availableTradeAmountState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        AvailableTradeAmountState availableTradeAmountState2;
        String str2;
        MarginSymbolInfo marginSymbolInfo2;
        String str3 = (i11 & 1) != 0 ? null : str;
        SymbolInfoEntity symbolInfoEntity2 = (i11 & 2) != 0 ? null : symbolInfoEntity;
        TradeSymbolBalance tradeSymbolBalance3 = (i11 & 4) != 0 ? null : tradeSymbolBalance;
        TradeSymbolBalance tradeSymbolBalance4 = (i11 & 8) != 0 ? null : tradeSymbolBalance2;
        TradeType tradeType2 = (i11 & 16) != 0 ? TradeType.LIMIT : tradeType;
        OrderBookCenterEntity orderBookCenterEntity2 = (i11 & 32) != 0 ? null : orderBookCenterEntity;
        BigDecimal bigDecimal5 = (i11 & 64) != 0 ? null : bigDecimal;
        BigDecimal bigDecimal6 = (i11 & 128) != 0 ? null : bigDecimal2;
        BigDecimal bigDecimal7 = (i11 & 256) != 0 ? null : bigDecimal3;
        BigDecimal bigDecimal8 = (i11 & 512) != 0 ? null : bigDecimal4;
        InterfaceC37432d interfaceC37432d2 = (i11 & 1024) != 0 ? null : interfaceC37432d;
        InterfaceC38170b interfaceC38170b2 = (i11 & 2048) != 0 ? InterfaceC38170b.b.f85867a : interfaceC38170b;
        List list3 = (i11 & 4096) != 0 ? null : list;
        List list4 = (i11 & 8192) != 0 ? null : list2;
        MarginSymbolInfo marginSymbolInfo3 = (i11 & 16384) != 0 ? null : marginSymbolInfo;
        if ((i11 & 32768) != 0) {
            marginSymbolInfo2 = marginSymbolInfo3;
            availableTradeAmountState2 = new AvailableTradeAmountState(null, null, 3, null);
            str2 = str3;
        } else {
            availableTradeAmountState2 = availableTradeAmountState;
            str2 = str3;
            marginSymbolInfo2 = marginSymbolInfo3;
        }
        this(str2, symbolInfoEntity2, tradeSymbolBalance3, tradeSymbolBalance4, tradeType2, orderBookCenterEntity2, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, interfaceC37432d2, interfaceC38170b2, list3, list4, marginSymbolInfo2, availableTradeAmountState2);
    }
}
