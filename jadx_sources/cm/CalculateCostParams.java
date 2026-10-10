package cm;

import com.kubi.broker.MultiBizType;
import com.kubi.futures.trade.submit.panel.footer.r0;
import com.kubi.futures.trade.submit.panel.tradeType.limit.BBOHelper;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMargin;
import com.kubi.kumex.logic.constant.OrderTradeType;
import java.math.BigDecimal;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p314hi.InterfaceC38218f;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.b, reason: from toString */
/* JADX INFO: compiled from: PanelCalculateParams.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000f\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u0006\u0010B\u001a\u00020\u0003J\b\u0010C\u001a\u00020\u0003H\u0002J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0015\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010T\u001a\u00020\u000fHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010V\u001a\u00020\u001eHÆ\u0003J\t\u0010W\u001a\u00020\u000fHÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\"HÆ\u0003J\u008b\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"HÆ\u0001J\u0013\u0010[\u001a\u00020\u00032\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\t\u0010^\u001a\u00020_HÖ\u0001J\t\u0010`\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010%R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u001b\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u001f\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010/R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006a"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/CalculateCostParams;", "Lcom/kubi/kumex/data/trade/model/ICalculateParams;", "isHedge", "", "isCross", "isUnify", "reduceOnlyChecked", "contract", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "tradeType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "buySide", "", "sellSide", "leverage", "Ljava/math/BigDecimal;", "priceConfig", "Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "delegationPriceBuy", "delegationPriceSell", "buyQty", "sellQty", "positionCouples", "", "Lcom/kubi/futures/trade/submit/panel/footer/PositionCouple;", "crossHedgeQtyMargin", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;", "taxRate", "positionStatus", "bizType", "Lcom/kubi/broker/MultiBizType;", "estimatePriceSpread", "needFetchApiForUnifyAccount", "bboType", "Lcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;", "<init>", "(ZZZZLcom/kubi/futures/trade/config/IFuturesContractConfig;Lcom/kubi/kumex/logic/constant/OrderTradeType;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/futures/trade/config/IFuturesPriceConfig;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/kubi/broker/MultiBizType;Ljava/math/BigDecimal;ZLcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;)V", "()Z", "getReduceOnlyChecked", "getContract", "()Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "getTradeType", "()Lcom/kubi/kumex/logic/constant/OrderTradeType;", "getBuySide", "()Ljava/lang/String;", "getSellSide", "getLeverage", "()Ljava/math/BigDecimal;", "getPriceConfig", "()Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "getDelegationPriceBuy", "getDelegationPriceSell", "getBuyQty", "getSellQty", "getPositionCouples", "()Ljava/util/Map;", "getCrossHedgeQtyMargin", "()Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;", "getTaxRate", "getPositionStatus", "getBizType", "()Lcom/kubi/broker/MultiBizType;", "getEstimatePriceSpread", "getNeedFetchApiForUnifyAccount", "getBboType", "()Lcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;", "isNotTriggerCalc", "isDelegationPriceNullOrZero", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CalculateCostParams implements InterfaceC5005j {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isHedge;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final boolean isCross;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean isUnify;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean reduceOnlyChecked;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final InterfaceC38213a contract;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final OrderTradeType tradeType;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final String buySide;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final String sellSide;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public final BigDecimal leverage;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public final InterfaceC38218f priceConfig;

    /* JADX INFO: renamed from: k, reason: from toString */
    @Nullable
    public final BigDecimal delegationPriceBuy;

    /* JADX INFO: renamed from: l, reason: from toString */
    @Nullable
    public final BigDecimal delegationPriceSell;

    /* JADX INFO: renamed from: m, reason: from toString */
    @Nullable
    public final BigDecimal buyQty;

    /* JADX INFO: renamed from: n, reason: from toString */
    @Nullable
    public final BigDecimal sellQty;

    /* JADX INFO: renamed from: o, reason: from toString */
    @NotNull
    public final Map<String, r0> positionCouples;

    /* JADX INFO: renamed from: p, reason: from toString */
    @Nullable
    public final CrossHedgeQtyMargin crossHedgeQtyMargin;

    /* JADX INFO: renamed from: q, reason: from toString */
    @NotNull
    public final BigDecimal taxRate;

    /* JADX INFO: renamed from: r, reason: from toString */
    @Nullable
    public final String positionStatus;

    /* JADX INFO: renamed from: s, reason: from toString */
    @NotNull
    public final MultiBizType bizType;

    /* JADX INFO: renamed from: t, reason: from toString */
    @NotNull
    public final BigDecimal estimatePriceSpread;

    /* JADX INFO: renamed from: u, reason: from toString */
    public final boolean needFetchApiForUnifyAccount;

    /* JADX INFO: renamed from: v, reason: from toString */
    @Nullable
    public final BBOHelper.BBOType bboType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalculateCostParams)) {
            return false;
        }
        CalculateCostParams calculateCostParams = (CalculateCostParams) other;
        return this.isHedge == calculateCostParams.isHedge && this.isCross == calculateCostParams.isCross && this.isUnify == calculateCostParams.isUnify && this.reduceOnlyChecked == calculateCostParams.reduceOnlyChecked && Intrinsics.areEqual(this.contract, calculateCostParams.contract) && this.tradeType == calculateCostParams.tradeType && Intrinsics.areEqual(this.buySide, calculateCostParams.buySide) && Intrinsics.areEqual(this.sellSide, calculateCostParams.sellSide) && Intrinsics.areEqual(this.leverage, calculateCostParams.leverage) && Intrinsics.areEqual(this.priceConfig, calculateCostParams.priceConfig) && Intrinsics.areEqual(this.delegationPriceBuy, calculateCostParams.delegationPriceBuy) && Intrinsics.areEqual(this.delegationPriceSell, calculateCostParams.delegationPriceSell) && Intrinsics.areEqual(this.buyQty, calculateCostParams.buyQty) && Intrinsics.areEqual(this.sellQty, calculateCostParams.sellQty) && Intrinsics.areEqual(this.positionCouples, calculateCostParams.positionCouples) && Intrinsics.areEqual(this.crossHedgeQtyMargin, calculateCostParams.crossHedgeQtyMargin) && Intrinsics.areEqual(this.taxRate, calculateCostParams.taxRate) && Intrinsics.areEqual(this.positionStatus, calculateCostParams.positionStatus) && this.bizType == calculateCostParams.bizType && Intrinsics.areEqual(this.estimatePriceSpread, calculateCostParams.estimatePriceSpread) && this.needFetchApiForUnifyAccount == calculateCostParams.needFetchApiForUnifyAccount && this.bboType == calculateCostParams.bboType;
    }

    public CalculateCostParams(boolean z11, boolean z12, boolean z13, boolean z14, @Nullable InterfaceC38213a interfaceC38213a, @Nullable OrderTradeType orderTradeType, @Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable InterfaceC38218f interfaceC38218f, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @NotNull Map<String, r0> positionCouples, @Nullable CrossHedgeQtyMargin crossHedgeQtyMargin, @NotNull BigDecimal taxRate, @Nullable String str3, @NotNull MultiBizType bizType, @NotNull BigDecimal estimatePriceSpread, boolean z15, @Nullable BBOHelper.BBOType bBOType) {
        Intrinsics.checkNotNullParameter(positionCouples, "positionCouples");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(estimatePriceSpread, "estimatePriceSpread");
        this.isHedge = z11;
        this.isCross = z12;
        this.isUnify = z13;
        this.reduceOnlyChecked = z14;
        this.contract = interfaceC38213a;
        this.tradeType = orderTradeType;
        this.buySide = str;
        this.sellSide = str2;
        this.leverage = bigDecimal;
        this.priceConfig = interfaceC38218f;
        this.delegationPriceBuy = bigDecimal2;
        this.delegationPriceSell = bigDecimal3;
        this.buyQty = bigDecimal4;
        this.sellQty = bigDecimal5;
        this.positionCouples = positionCouples;
        this.crossHedgeQtyMargin = crossHedgeQtyMargin;
        this.taxRate = taxRate;
        this.positionStatus = str3;
        this.bizType = bizType;
        this.estimatePriceSpread = estimatePriceSpread;
        this.needFetchApiForUnifyAccount = z15;
        this.bboType = bBOType;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BBOHelper.BBOType getBboType() {
        return this.bboType;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getBuyQty() {
        return this.buyQty;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBuySide() {
        return this.buySide;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC38213a getContract() {
        return this.contract;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final CrossHedgeQtyMargin getCrossHedgeQtyMargin() {
        return this.crossHedgeQtyMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final BigDecimal getDelegationPriceBuy() {
        return this.delegationPriceBuy;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getDelegationPriceSell() {
        return this.delegationPriceSell;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final BigDecimal getEstimatePriceSpread() {
        return this.estimatePriceSpread;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isHedge) * 31) + Boolean.hashCode(this.isCross)) * 31) + Boolean.hashCode(this.isUnify)) * 31) + Boolean.hashCode(this.reduceOnlyChecked)) * 31;
        InterfaceC38213a interfaceC38213a = this.contract;
        int iHashCode2 = (iHashCode + (interfaceC38213a == null ? 0 : interfaceC38213a.hashCode())) * 31;
        OrderTradeType orderTradeType = this.tradeType;
        int iHashCode3 = (iHashCode2 + (orderTradeType == null ? 0 : orderTradeType.hashCode())) * 31;
        String str = this.buySide;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sellSide;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.leverage;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        InterfaceC38218f interfaceC38218f = this.priceConfig;
        int iHashCode7 = (iHashCode6 + (interfaceC38218f == null ? 0 : interfaceC38218f.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.delegationPriceBuy;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.delegationPriceSell;
        int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.buyQty;
        int iHashCode10 = (iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.sellQty;
        int iHashCode11 = (((iHashCode10 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31) + this.positionCouples.hashCode()) * 31;
        CrossHedgeQtyMargin crossHedgeQtyMargin = this.crossHedgeQtyMargin;
        int iHashCode12 = (((iHashCode11 + (crossHedgeQtyMargin == null ? 0 : crossHedgeQtyMargin.hashCode())) * 31) + this.taxRate.hashCode()) * 31;
        String str3 = this.positionStatus;
        int iHashCode13 = (((((((iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.bizType.hashCode()) * 31) + this.estimatePriceSpread.hashCode()) * 31) + Boolean.hashCode(this.needFetchApiForUnifyAccount)) * 31;
        BBOHelper.BBOType bBOType = this.bboType;
        return iHashCode13 + (bBOType != null ? bBOType.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Map<String, r0> m5317j() {
        return this.positionCouples;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPositionStatus() {
        return this.positionStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC38218f getPriceConfig() {
        return this.priceConfig;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getReduceOnlyChecked() {
        return this.reduceOnlyChecked;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final BigDecimal getSellQty() {
        return this.sellQty;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSellSide() {
        return this.sellSide;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final BigDecimal getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final OrderTradeType getTradeType() {
        return this.tradeType;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsCross() {
        return this.isCross;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5326s() {
        return C41014a.m89917B(this.delegationPriceBuy) && C41014a.m89917B(this.delegationPriceSell);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsHedge() {
        return this.isHedge;
    }

    @NotNull
    public String toString() {
        return "CalculateCostParams(isHedge=" + this.isHedge + ", isCross=" + this.isCross + ", isUnify=" + this.isUnify + ", reduceOnlyChecked=" + this.reduceOnlyChecked + ", contract=" + this.contract + ", tradeType=" + this.tradeType + ", buySide=" + this.buySide + ", sellSide=" + this.sellSide + ", leverage=" + this.leverage + ", priceConfig=" + this.priceConfig + ", delegationPriceBuy=" + this.delegationPriceBuy + ", delegationPriceSell=" + this.delegationPriceSell + ", buyQty=" + this.buyQty + ", sellQty=" + this.sellQty + ", positionCouples=" + this.positionCouples + ", crossHedgeQtyMargin=" + this.crossHedgeQtyMargin + ", taxRate=" + this.taxRate + ", positionStatus=" + this.positionStatus + ", bizType=" + this.bizType + ", estimatePriceSpread=" + this.estimatePriceSpread + ", needFetchApiForUnifyAccount=" + this.needFetchApiForUnifyAccount + ", bboType=" + this.bboType + ')';
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5328u() {
        OrderTradeType orderTradeType;
        if (this.contract == null || C41014a.m89917B(this.leverage) || (orderTradeType = this.tradeType) == null) {
            return true;
        }
        return orderTradeType.isLimit() && m5326s();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsUnify() {
        return this.isUnify;
    }
}
