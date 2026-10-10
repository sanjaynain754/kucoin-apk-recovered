package cm;

import com.kubi.futures.trade.submit.panel.tradeType.limit.BBOHelper;
import com.kubi.kumex.logic.constant.OrderTradeType;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38218f;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.d, reason: from toString */
/* JADX INFO: compiled from: PanelCalculateParams.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/CalculateLotCostDeltaParams;", "Lcom/kubi/kumex/data/trade/model/ICalculateParams;", "symbol", "", "tradeType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "priceConfig", "Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "delegationPriceBuy", "Ljava/math/BigDecimal;", "delegationPriceSell", "bboType", "Lcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;", "<init>", "(Ljava/lang/String;Lcom/kubi/kumex/logic/constant/OrderTradeType;Lcom/kubi/futures/trade/config/IFuturesPriceConfig;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;)V", "getSymbol", "()Ljava/lang/String;", "getTradeType", "()Lcom/kubi/kumex/logic/constant/OrderTradeType;", "getPriceConfig", "()Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "getDelegationPriceBuy", "()Ljava/math/BigDecimal;", "getDelegationPriceSell", "getBboType", "()Lcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CalculateLotCostDeltaParams implements InterfaceC5005j {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final OrderTradeType tradeType;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final InterfaceC38218f priceConfig;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final BigDecimal delegationPriceBuy;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final BigDecimal delegationPriceSell;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final BBOHelper.BBOType bboType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalculateLotCostDeltaParams)) {
            return false;
        }
        CalculateLotCostDeltaParams calculateLotCostDeltaParams = (CalculateLotCostDeltaParams) other;
        return Intrinsics.areEqual(this.symbol, calculateLotCostDeltaParams.symbol) && this.tradeType == calculateLotCostDeltaParams.tradeType && Intrinsics.areEqual(this.priceConfig, calculateLotCostDeltaParams.priceConfig) && Intrinsics.areEqual(this.delegationPriceBuy, calculateLotCostDeltaParams.delegationPriceBuy) && Intrinsics.areEqual(this.delegationPriceSell, calculateLotCostDeltaParams.delegationPriceSell) && this.bboType == calculateLotCostDeltaParams.bboType;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BBOHelper.BBOType getBboType() {
        return this.bboType;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getDelegationPriceBuy() {
        return this.delegationPriceBuy;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getDelegationPriceSell() {
        return this.delegationPriceSell;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC38218f getPriceConfig() {
        return this.priceConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final OrderTradeType getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OrderTradeType orderTradeType = this.tradeType;
        int iHashCode2 = (iHashCode + (orderTradeType == null ? 0 : orderTradeType.hashCode())) * 31;
        InterfaceC38218f interfaceC38218f = this.priceConfig;
        int iHashCode3 = (iHashCode2 + (interfaceC38218f == null ? 0 : interfaceC38218f.hashCode())) * 31;
        BigDecimal bigDecimal = this.delegationPriceBuy;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.delegationPriceSell;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BBOHelper.BBOType bBOType = this.bboType;
        return iHashCode5 + (bBOType != null ? bBOType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CalculateLotCostDeltaParams(symbol=" + this.symbol + ", tradeType=" + this.tradeType + ", priceConfig=" + this.priceConfig + ", delegationPriceBuy=" + this.delegationPriceBuy + ", delegationPriceSell=" + this.delegationPriceSell + ", bboType=" + this.bboType + ')';
    }

    public CalculateLotCostDeltaParams(@Nullable String str, @Nullable OrderTradeType orderTradeType, @Nullable InterfaceC38218f interfaceC38218f, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BBOHelper.BBOType bBOType) {
        this.symbol = str;
        this.tradeType = orderTradeType;
        this.priceConfig = interfaceC38218f;
        this.delegationPriceBuy = bigDecimal;
        this.delegationPriceSell = bigDecimal2;
        this.bboType = bBOType;
    }
}
