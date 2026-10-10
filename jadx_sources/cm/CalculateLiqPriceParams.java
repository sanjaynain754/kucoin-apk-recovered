package cm;

import androidx.media3.common.C2711C;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.data.platform.FuturesSpreadConfigService;
import com.kubi.futures.trade.submit.panel.footer.r0;
import com.kubi.futures.trade.submit.panel.tradeType.limit.BBOHelper;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMargin;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p314hi.InterfaceC38218f;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.c, reason: from toString */
/* JADX INFO: compiled from: PanelCalculateParams.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B³\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010&\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020\u000f\u0012\b\b\u0002\u0010*\u001a\u00020\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.J\u0006\u0010U\u001a\u00020\u0003J\b\u0010V\u001a\u00020\u0003H\u0002J\u0012\u0010W\u001a\u0004\u0018\u00010\u000f2\b\u0010X\u001a\u0004\u0018\u00010\u000bJ\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010^\u001a\u00020\u000bHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bHÆ\u0003J\u0015\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001f0\u001eHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010n\u001a\u00020\u000fHÆ\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010r\u001a\u00020(HÆ\u0003J\t\u0010s\u001a\u00020\u000fHÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010,HÆ\u0003Jç\u0002\u0010v\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001f0\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\u000f2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,HÆ\u0001J\u0013\u0010w\u001a\u00020\u00032\b\u0010x\u001a\u0004\u0018\u00010yHÖ\u0003J\t\u0010z\u001a\u00020{HÖ\u0001J\t\u0010|\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010/R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010/R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010/R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010/R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bA\u00109R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bB\u00109R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bC\u00109R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001d\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\"\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bJ\u00109R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010ER\u0013\u0010%\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bL\u00109R\u0013\u0010&\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010)\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bQ\u00109R\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010/R\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bS\u0010T¨\u0006}"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/CalculateLiqPriceParams;", "Lcom/kubi/kumex/data/trade/model/ICalculateParams;", "isHedge", "", "isCross", "isUnify", "contract", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "tradeType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "positionStatus", "", "buySide", "sellSide", "buyQty", "Ljava/math/BigDecimal;", "sellQty", "buyMaxQty", "sellMaxQty", "leverage", "reduceOnlyChecked", "priceConfig", "Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "delegationPriceBuy", "delegationPriceSell", "totalMargin", "positions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "positionCouples", "", "Lcom/kubi/futures/trade/submit/panel/footer/PositionCouple;", "crossHedgeQtyMargin", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;", "taxRate", "isolateRiskLimits", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "takerFeeRate", "isolatedRiskLimit", "bizType", "Lcom/kubi/broker/MultiBizType;", "estimatePriceSpread", "needFetchApiForUnifyAccount", "bboType", "Lcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;", "<init>", "(ZZZLcom/kubi/futures/trade/config/IFuturesContractConfig;Lcom/kubi/kumex/logic/constant/OrderTradeType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/kubi/futures/trade/config/IFuturesPriceConfig;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/Map;Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;Lcom/kubi/broker/MultiBizType;Ljava/math/BigDecimal;ZLcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;)V", "()Z", "getContract", "()Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "getTradeType", "()Lcom/kubi/kumex/logic/constant/OrderTradeType;", "getPositionStatus", "()Ljava/lang/String;", "getBuySide", "getSellSide", "getBuyQty", "()Ljava/math/BigDecimal;", "getSellQty", "getBuyMaxQty", "getSellMaxQty", "getLeverage", "getReduceOnlyChecked", "getPriceConfig", "()Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "getDelegationPriceBuy", "getDelegationPriceSell", "getTotalMargin", "getPositions", "()Ljava/util/List;", "getPositionCouples", "()Ljava/util/Map;", "getCrossHedgeQtyMargin", "()Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;", "getTaxRate", "getIsolateRiskLimits", "getTakerFeeRate", "getIsolatedRiskLimit", "()Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "getBizType", "()Lcom/kubi/broker/MultiBizType;", "getEstimatePriceSpread", "getNeedFetchApiForUnifyAccount", "getBboType", "()Lcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;", "isNotTriggerCalc", "isDelegationPriceNullOrZero", "getMarkPrice", "side", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "equals", "other", "", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CalculateLiqPriceParams implements InterfaceC5005j {

    /* JADX INFO: renamed from: A, reason: from toString */
    @NotNull
    public final BigDecimal estimatePriceSpread;

    /* JADX INFO: renamed from: B, reason: from toString */
    public final boolean needFetchApiForUnifyAccount;

    /* JADX INFO: renamed from: C, reason: from toString */
    @Nullable
    public final BBOHelper.BBOType bboType;

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isHedge;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final boolean isCross;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean isUnify;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final InterfaceC38213a contract;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final OrderTradeType tradeType;

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final String positionStatus;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final String buySide;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final String sellSide;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public final BigDecimal buyQty;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public final BigDecimal sellQty;

    /* JADX INFO: renamed from: k, reason: from toString */
    @Nullable
    public final BigDecimal buyMaxQty;

    /* JADX INFO: renamed from: l, reason: from toString */
    @Nullable
    public final BigDecimal sellMaxQty;

    /* JADX INFO: renamed from: m, reason: from toString */
    @Nullable
    public final BigDecimal leverage;

    /* JADX INFO: renamed from: n, reason: from toString */
    public final boolean reduceOnlyChecked;

    /* JADX INFO: renamed from: o, reason: from toString */
    @Nullable
    public final InterfaceC38218f priceConfig;

    /* JADX INFO: renamed from: p, reason: from toString */
    @Nullable
    public final BigDecimal delegationPriceBuy;

    /* JADX INFO: renamed from: q, reason: from toString */
    @Nullable
    public final BigDecimal delegationPriceSell;

    /* JADX INFO: renamed from: r, reason: from toString */
    @Nullable
    public final BigDecimal totalMargin;

    /* JADX INFO: renamed from: s, reason: from toString */
    @NotNull
    public final List<PositionEntity> positions;

    /* JADX INFO: renamed from: t, reason: from toString */
    @NotNull
    public final Map<String, r0> positionCouples;

    /* JADX INFO: renamed from: u, reason: from toString */
    @Nullable
    public final CrossHedgeQtyMargin crossHedgeQtyMargin;

    /* JADX INFO: renamed from: v, reason: from toString */
    @NotNull
    public final BigDecimal taxRate;

    /* JADX INFO: renamed from: w, reason: from toString */
    @Nullable
    public final List<ContractRiskLimitEntity> isolateRiskLimits;

    /* JADX INFO: renamed from: x, reason: from toString */
    @Nullable
    public final BigDecimal takerFeeRate;

    /* JADX INFO: renamed from: y, reason: from toString */
    @Nullable
    public final ContractRiskLimitEntity isolatedRiskLimit;

    /* JADX INFO: renamed from: z, reason: from toString */
    @NotNull
    public final MultiBizType bizType;

    public CalculateLiqPriceParams(boolean z11, boolean z12, boolean z13, @Nullable InterfaceC38213a interfaceC38213a, @Nullable OrderTradeType orderTradeType, @NotNull String positionStatus, @Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, boolean z14, @Nullable InterfaceC38218f interfaceC38218f, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @NotNull List<PositionEntity> positions, @NotNull Map<String, r0> positionCouples, @Nullable CrossHedgeQtyMargin crossHedgeQtyMargin, @NotNull BigDecimal taxRate, @Nullable List<ContractRiskLimitEntity> list, @Nullable BigDecimal bigDecimal9, @Nullable ContractRiskLimitEntity contractRiskLimitEntity, @NotNull MultiBizType bizType, @NotNull BigDecimal estimatePriceSpread, boolean z15, @Nullable BBOHelper.BBOType bBOType) {
        Intrinsics.checkNotNullParameter(positionStatus, "positionStatus");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(positionCouples, "positionCouples");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(estimatePriceSpread, "estimatePriceSpread");
        this.isHedge = z11;
        this.isCross = z12;
        this.isUnify = z13;
        this.contract = interfaceC38213a;
        this.tradeType = orderTradeType;
        this.positionStatus = positionStatus;
        this.buySide = str;
        this.sellSide = str2;
        this.buyQty = bigDecimal;
        this.sellQty = bigDecimal2;
        this.buyMaxQty = bigDecimal3;
        this.sellMaxQty = bigDecimal4;
        this.leverage = bigDecimal5;
        this.reduceOnlyChecked = z14;
        this.priceConfig = interfaceC38218f;
        this.delegationPriceBuy = bigDecimal6;
        this.delegationPriceSell = bigDecimal7;
        this.totalMargin = bigDecimal8;
        this.positions = positions;
        this.positionCouples = positionCouples;
        this.crossHedgeQtyMargin = crossHedgeQtyMargin;
        this.taxRate = taxRate;
        this.isolateRiskLimits = list;
        this.takerFeeRate = bigDecimal9;
        this.isolatedRiskLimit = contractRiskLimitEntity;
        this.bizType = bizType;
        this.estimatePriceSpread = estimatePriceSpread;
        this.needFetchApiForUnifyAccount = z15;
        this.bboType = bBOType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalculateLiqPriceParams)) {
            return false;
        }
        CalculateLiqPriceParams calculateLiqPriceParams = (CalculateLiqPriceParams) other;
        return this.isHedge == calculateLiqPriceParams.isHedge && this.isCross == calculateLiqPriceParams.isCross && this.isUnify == calculateLiqPriceParams.isUnify && Intrinsics.areEqual(this.contract, calculateLiqPriceParams.contract) && this.tradeType == calculateLiqPriceParams.tradeType && Intrinsics.areEqual(this.positionStatus, calculateLiqPriceParams.positionStatus) && Intrinsics.areEqual(this.buySide, calculateLiqPriceParams.buySide) && Intrinsics.areEqual(this.sellSide, calculateLiqPriceParams.sellSide) && Intrinsics.areEqual(this.buyQty, calculateLiqPriceParams.buyQty) && Intrinsics.areEqual(this.sellQty, calculateLiqPriceParams.sellQty) && Intrinsics.areEqual(this.buyMaxQty, calculateLiqPriceParams.buyMaxQty) && Intrinsics.areEqual(this.sellMaxQty, calculateLiqPriceParams.sellMaxQty) && Intrinsics.areEqual(this.leverage, calculateLiqPriceParams.leverage) && this.reduceOnlyChecked == calculateLiqPriceParams.reduceOnlyChecked && Intrinsics.areEqual(this.priceConfig, calculateLiqPriceParams.priceConfig) && Intrinsics.areEqual(this.delegationPriceBuy, calculateLiqPriceParams.delegationPriceBuy) && Intrinsics.areEqual(this.delegationPriceSell, calculateLiqPriceParams.delegationPriceSell) && Intrinsics.areEqual(this.totalMargin, calculateLiqPriceParams.totalMargin) && Intrinsics.areEqual(this.positions, calculateLiqPriceParams.positions) && Intrinsics.areEqual(this.positionCouples, calculateLiqPriceParams.positionCouples) && Intrinsics.areEqual(this.crossHedgeQtyMargin, calculateLiqPriceParams.crossHedgeQtyMargin) && Intrinsics.areEqual(this.taxRate, calculateLiqPriceParams.taxRate) && Intrinsics.areEqual(this.isolateRiskLimits, calculateLiqPriceParams.isolateRiskLimits) && Intrinsics.areEqual(this.takerFeeRate, calculateLiqPriceParams.takerFeeRate) && Intrinsics.areEqual(this.isolatedRiskLimit, calculateLiqPriceParams.isolatedRiskLimit) && this.bizType == calculateLiqPriceParams.bizType && Intrinsics.areEqual(this.estimatePriceSpread, calculateLiqPriceParams.estimatePriceSpread) && this.needFetchApiForUnifyAccount == calculateLiqPriceParams.needFetchApiForUnifyAccount && this.bboType == calculateLiqPriceParams.bboType;
    }

    /* JADX INFO: renamed from: A */
    private final boolean m5330A() {
        return C41014a.m89917B(this.delegationPriceBuy) && C41014a.m89917B(this.delegationPriceSell);
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final boolean getIsHedge() {
        return this.isHedge;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m5332C() {
        OrderTradeType orderTradeType;
        if (this.contract == null || C41014a.m89917B(this.leverage) || (orderTradeType = this.tradeType) == null) {
            return true;
        }
        return orderTradeType.isLimit() && m5330A();
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getIsUnify() {
        return this.isUnify;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BBOHelper.BBOType getBboType() {
        return this.bboType;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getBuyMaxQty() {
        return this.buyMaxQty;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getBuyQty() {
        return this.buyQty;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBuySide() {
        return this.buySide;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC38213a getContract() {
        return this.contract;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final CrossHedgeQtyMargin getCrossHedgeQtyMargin() {
        return this.crossHedgeQtyMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getDelegationPriceBuy() {
        return this.delegationPriceBuy;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final BigDecimal getDelegationPriceSell() {
        return this.delegationPriceSell;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isHedge) * 31) + Boolean.hashCode(this.isCross)) * 31) + Boolean.hashCode(this.isUnify)) * 31;
        InterfaceC38213a interfaceC38213a = this.contract;
        int iHashCode2 = (iHashCode + (interfaceC38213a == null ? 0 : interfaceC38213a.hashCode())) * 31;
        OrderTradeType orderTradeType = this.tradeType;
        int iHashCode3 = (((iHashCode2 + (orderTradeType == null ? 0 : orderTradeType.hashCode())) * 31) + this.positionStatus.hashCode()) * 31;
        String str = this.buySide;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sellSide;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.buyQty;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.sellQty;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.buyMaxQty;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.sellMaxQty;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.leverage;
        int iHashCode10 = (((iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31) + Boolean.hashCode(this.reduceOnlyChecked)) * 31;
        InterfaceC38218f interfaceC38218f = this.priceConfig;
        int iHashCode11 = (iHashCode10 + (interfaceC38218f == null ? 0 : interfaceC38218f.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.delegationPriceBuy;
        int iHashCode12 = (iHashCode11 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.delegationPriceSell;
        int iHashCode13 = (iHashCode12 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.totalMargin;
        int iHashCode14 = (((((iHashCode13 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31) + this.positions.hashCode()) * 31) + this.positionCouples.hashCode()) * 31;
        CrossHedgeQtyMargin crossHedgeQtyMargin = this.crossHedgeQtyMargin;
        int iHashCode15 = (((iHashCode14 + (crossHedgeQtyMargin == null ? 0 : crossHedgeQtyMargin.hashCode())) * 31) + this.taxRate.hashCode()) * 31;
        List<ContractRiskLimitEntity> list = this.isolateRiskLimits;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.takerFeeRate;
        int iHashCode17 = (iHashCode16 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        ContractRiskLimitEntity contractRiskLimitEntity = this.isolatedRiskLimit;
        int iHashCode18 = (((((((iHashCode17 + (contractRiskLimitEntity == null ? 0 : contractRiskLimitEntity.hashCode())) * 31) + this.bizType.hashCode()) * 31) + this.estimatePriceSpread.hashCode()) * 31) + Boolean.hashCode(this.needFetchApiForUnifyAccount)) * 31;
        BBOHelper.BBOType bBOType = this.bboType;
        return iHashCode18 + (bBOType != null ? bBOType.hashCode() : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final BigDecimal getEstimatePriceSpread() {
        return this.estimatePriceSpread;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final List<ContractRiskLimitEntity> m5343j() {
        return this.isolateRiskLimits;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final ContractRiskLimitEntity getIsolatedRiskLimit() {
        return this.isolatedRiskLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    @Nullable
    /* JADX INFO: renamed from: m */
    public final BigDecimal m5346m(@Nullable String str) {
        BigDecimal f86646a;
        BigDecimal markPrice;
        Map<String, r0> map = this.positionCouples;
        InterfaceC38213a interfaceC38213a = this.contract;
        r0 r0Var = map.get(C27041f.m66668h(interfaceC38213a != null ? interfaceC38213a.getSymbol() : null));
        if (r0Var == null) {
            r0Var = new r0((PositionEntity) null, (PositionEntity) null, 3, (DefaultConstructorMarker) null);
        }
        if (Intrinsics.areEqual(str, "buy")) {
            InterfaceC38218f interfaceC38218f = this.priceConfig;
            if (interfaceC38218f != null) {
                f86646a = interfaceC38218f.getF86647b();
            } else {
                f86646a = null;
            }
        } else {
            InterfaceC38218f interfaceC38218f2 = this.priceConfig;
            if (interfaceC38218f2 != null) {
                f86646a = interfaceC38218f2.getF86646a();
            } else {
                f86646a = null;
            }
        }
        PositionEntity positionEntityC = r0Var.c();
        if (positionEntityC != null && (markPrice = positionEntityC.getMarkPrice()) != null) {
            return markPrice;
        }
        PositionEntity positionEntityD = r0Var.d();
        BigDecimal markPrice2 = positionEntityD != null ? positionEntityD.getMarkPrice() : null;
        if (markPrice2 != null) {
            return markPrice2;
        }
        InterfaceC38218f interfaceC38218f3 = this.priceConfig;
        BigDecimal f86650e = interfaceC38218f3 != null ? interfaceC38218f3.getF86650e() : null;
        if (f86650e != null) {
            return f86650e;
        }
        if (m5330A()) {
            return f86646a;
        }
        return Intrinsics.areEqual(str, "buy") ? this.delegationPriceBuy : this.delegationPriceSell;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final Map<String, r0> m5347n() {
        return this.positionCouples;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPositionStatus() {
        return this.positionStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<PositionEntity> m5349p() {
        return this.positions;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterfaceC38218f getPriceConfig() {
        return this.priceConfig;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getReduceOnlyChecked() {
        return this.reduceOnlyChecked;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final BigDecimal getSellMaxQty() {
        return this.sellMaxQty;
    }

    @Nullable
    /* JADX INFO: renamed from: t, reason: from getter */
    public final BigDecimal getSellQty() {
        return this.sellQty;
    }

    @NotNull
    public String toString() {
        return "CalculateLiqPriceParams(isHedge=" + this.isHedge + ", isCross=" + this.isCross + ", isUnify=" + this.isUnify + ", contract=" + this.contract + ", tradeType=" + this.tradeType + ", positionStatus=" + this.positionStatus + ", buySide=" + this.buySide + ", sellSide=" + this.sellSide + ", buyQty=" + this.buyQty + ", sellQty=" + this.sellQty + ", buyMaxQty=" + this.buyMaxQty + ", sellMaxQty=" + this.sellMaxQty + ", leverage=" + this.leverage + ", reduceOnlyChecked=" + this.reduceOnlyChecked + ", priceConfig=" + this.priceConfig + ", delegationPriceBuy=" + this.delegationPriceBuy + ", delegationPriceSell=" + this.delegationPriceSell + ", totalMargin=" + this.totalMargin + ", positions=" + this.positions + ", positionCouples=" + this.positionCouples + ", crossHedgeQtyMargin=" + this.crossHedgeQtyMargin + ", taxRate=" + this.taxRate + ", isolateRiskLimits=" + this.isolateRiskLimits + ", takerFeeRate=" + this.takerFeeRate + ", isolatedRiskLimit=" + this.isolatedRiskLimit + ", bizType=" + this.bizType + ", estimatePriceSpread=" + this.estimatePriceSpread + ", needFetchApiForUnifyAccount=" + this.needFetchApiForUnifyAccount + ", bboType=" + this.bboType + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getSellSide() {
        return this.sellSide;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final BigDecimal getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final BigDecimal getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    /* JADX INFO: renamed from: x, reason: from getter */
    public final BigDecimal getTotalMargin() {
        return this.totalMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: y, reason: from getter */
    public final OrderTradeType getTradeType() {
        return this.tradeType;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getIsCross() {
        return this.isCross;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CalculateLiqPriceParams(boolean z11, boolean z12, boolean z13, InterfaceC38213a interfaceC38213a, OrderTradeType orderTradeType, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, boolean z14, InterfaceC38218f interfaceC38218f, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, List list, Map map, CrossHedgeQtyMargin crossHedgeQtyMargin, BigDecimal bigDecimal9, List list2, BigDecimal bigDecimal10, ContractRiskLimitEntity contractRiskLimitEntity, MultiBizType multiBizType, BigDecimal bigDecimal11, boolean z15, BBOHelper.BBOType bBOType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        BigDecimal bigDecimalMo86235f;
        if ((i11 & 8388608) != 0) {
            bigDecimalMo86235f = interfaceC38213a != null ? interfaceC38213a.mo86235f() : null;
        } else {
            bigDecimalMo86235f = bigDecimal10;
        }
        this(z11, z12, z13, interfaceC38213a, orderTradeType, str, str2, str3, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, z14, interfaceC38218f, bigDecimal6, bigDecimal7, bigDecimal8, list, map, crossHedgeQtyMargin, bigDecimal9, list2, bigDecimalMo86235f, contractRiskLimitEntity, multiBizType, (i11 & 67108864) != 0 ? FuturesSpreadConfigService.f22739a.m24887e() : bigDecimal11, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? false : z15, (i11 & 268435456) != 0 ? null : bBOType);
    }
}
