package cm;

import com.kubi.broker.MultiBizType;
import com.kubi.futures.data.platform.FuturesSpreadConfigService;
import com.kubi.futures.trade.submit.panel.footer.p0;
import com.kubi.futures.trade.submit.panel.footer.r0;
import com.kubi.futures.trade.submit.panel.tradeType.limit.BBOHelper;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMargin;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.C38214b;
import p314hi.InterfaceC38213a;
import p314hi.InterfaceC38218f;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.e, reason: from toString */
/* JADX INFO: compiled from: PanelCalculateParams.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u0006\u0010!\u001a\u00020\u0010\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010'\u001a\u00020\u0010\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J\u0006\u0010Q\u001a\u00020\u0003J\b\u0010R\u001a\u00020\u0003H\u0002J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\fHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\u0015\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\t\u0010e\u001a\u00020\u0010HÆ\u0003J\t\u0010f\u001a\u00020\u0010HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010h\u001a\u00020$HÆ\u0003J\t\u0010i\u001a\u00020&HÆ\u0003J\t\u0010j\u001a\u00020\u0010HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010*HÆ\u0003J¹\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\u00102\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*HÆ\u0001J\u0013\u0010n\u001a\u00020\u00032\b\u0010o\u001a\u0004\u0018\u00010pHÖ\u0003J\t\u0010q\u001a\u00020$HÖ\u0001J\t\u0010r\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010-R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010-R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010-R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b;\u00108R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b<\u00108R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b=\u00108R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010 \u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bF\u00108R\u0011\u0010!\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bG\u00108R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bH\u00108R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010'\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bM\u00108R\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010-R\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bO\u0010P¨\u0006s"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/CalculateMaxQtyParams;", "Lcom/kubi/kumex/data/trade/model/ICalculateParams;", "isHedge", "", "isCross", "isUnify", "contract", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "tradeType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "reduceOnlyChecked", "positionStatus", "", "buySide", "sellSide", "leverage", "Ljava/math/BigDecimal;", "priceConfig", "Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "delegationPriceBuy", "delegationPriceSell", "totalMargin", "positions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "positionCouples", "", "Lcom/kubi/futures/trade/submit/panel/footer/PositionCouple;", "crossHedgeQtyMargin", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;", "maxCloseSizeData", "Lcom/kubi/futures/trade/submit/panel/footer/FooterPanelData;", "maxQtyBuffer", "taxRate", "availableBalance", "availableBalancePrecision", "", "bizType", "Lcom/kubi/broker/MultiBizType;", "estimatePriceSpread", "needFetchApiForUnifyAccount", "bboType", "Lcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;", "<init>", "(ZZZLcom/kubi/futures/trade/config/IFuturesContractConfig;Lcom/kubi/kumex/logic/constant/OrderTradeType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/futures/trade/config/IFuturesPriceConfig;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/Map;Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;Lcom/kubi/futures/trade/submit/panel/footer/FooterPanelData;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILcom/kubi/broker/MultiBizType;Ljava/math/BigDecimal;ZLcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;)V", "()Z", "getContract", "()Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "getTradeType", "()Lcom/kubi/kumex/logic/constant/OrderTradeType;", "getReduceOnlyChecked", "getPositionStatus", "()Ljava/lang/String;", "getBuySide", "getSellSide", "getLeverage", "()Ljava/math/BigDecimal;", "getPriceConfig", "()Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "getDelegationPriceBuy", "getDelegationPriceSell", "getTotalMargin", "getPositions", "()Ljava/util/List;", "getPositionCouples", "()Ljava/util/Map;", "getCrossHedgeQtyMargin", "()Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;", "getMaxCloseSizeData", "()Lcom/kubi/futures/trade/submit/panel/footer/FooterPanelData;", "getMaxQtyBuffer", "getTaxRate", "getAvailableBalance", "getAvailableBalancePrecision", "()I", "getBizType", "()Lcom/kubi/broker/MultiBizType;", "getEstimatePriceSpread", "getNeedFetchApiForUnifyAccount", "getBboType", "()Lcom/kubi/futures/trade/submit/panel/tradeType/limit/BBOHelper$BBOType;", "isNotTriggerCalc", "isDelegationPriceNullOrZero", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "equals", "other", "", "hashCode", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CalculateMaxQtyParams implements InterfaceC5005j {

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
    public final boolean reduceOnlyChecked;

    /* JADX INFO: renamed from: g, reason: from toString */
    @NotNull
    public final String positionStatus;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final String buySide;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public final String sellSide;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public final BigDecimal leverage;

    /* JADX INFO: renamed from: k, reason: from toString */
    @Nullable
    public final InterfaceC38218f priceConfig;

    /* JADX INFO: renamed from: l, reason: from toString */
    @Nullable
    public final BigDecimal delegationPriceBuy;

    /* JADX INFO: renamed from: m, reason: from toString */
    @Nullable
    public final BigDecimal delegationPriceSell;

    /* JADX INFO: renamed from: n, reason: from toString */
    @Nullable
    public final BigDecimal totalMargin;

    /* JADX INFO: renamed from: o, reason: from toString */
    @NotNull
    public final List<PositionEntity> positions;

    /* JADX INFO: renamed from: p, reason: from toString */
    @NotNull
    public final Map<String, r0> positionCouples;

    /* JADX INFO: renamed from: q, reason: from toString */
    @Nullable
    public final CrossHedgeQtyMargin crossHedgeQtyMargin;

    /* JADX INFO: renamed from: r, reason: from toString */
    @Nullable
    public final p0 maxCloseSizeData;

    /* JADX INFO: renamed from: s, reason: from toString */
    @NotNull
    public final BigDecimal maxQtyBuffer;

    /* JADX INFO: renamed from: t, reason: from toString */
    @NotNull
    public final BigDecimal taxRate;

    /* JADX INFO: renamed from: u, reason: from toString */
    @Nullable
    public final BigDecimal availableBalance;

    /* JADX INFO: renamed from: v, reason: from toString */
    public final int availableBalancePrecision;

    /* JADX INFO: renamed from: w, reason: from toString */
    @NotNull
    public final MultiBizType bizType;

    /* JADX INFO: renamed from: x, reason: from toString */
    @NotNull
    public final BigDecimal estimatePriceSpread;

    /* JADX INFO: renamed from: y, reason: from toString */
    public final boolean needFetchApiForUnifyAccount;

    /* JADX INFO: renamed from: z, reason: from toString */
    @Nullable
    public final BBOHelper.BBOType bboType;

    public CalculateMaxQtyParams(boolean z11, boolean z12, boolean z13, @Nullable InterfaceC38213a interfaceC38213a, @Nullable OrderTradeType orderTradeType, boolean z14, @NotNull String positionStatus, @Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable InterfaceC38218f interfaceC38218f, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @NotNull List<PositionEntity> positions, @NotNull Map<String, r0> positionCouples, @Nullable CrossHedgeQtyMargin crossHedgeQtyMargin, @Nullable p0 p0Var, @NotNull BigDecimal maxQtyBuffer, @NotNull BigDecimal taxRate, @Nullable BigDecimal bigDecimal5, int i11, @NotNull MultiBizType bizType, @NotNull BigDecimal estimatePriceSpread, boolean z15, @Nullable BBOHelper.BBOType bBOType) {
        Intrinsics.checkNotNullParameter(positionStatus, "positionStatus");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(positionCouples, "positionCouples");
        Intrinsics.checkNotNullParameter(maxQtyBuffer, "maxQtyBuffer");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(estimatePriceSpread, "estimatePriceSpread");
        this.isHedge = z11;
        this.isCross = z12;
        this.isUnify = z13;
        this.contract = interfaceC38213a;
        this.tradeType = orderTradeType;
        this.reduceOnlyChecked = z14;
        this.positionStatus = positionStatus;
        this.buySide = str;
        this.sellSide = str2;
        this.leverage = bigDecimal;
        this.priceConfig = interfaceC38218f;
        this.delegationPriceBuy = bigDecimal2;
        this.delegationPriceSell = bigDecimal3;
        this.totalMargin = bigDecimal4;
        this.positions = positions;
        this.positionCouples = positionCouples;
        this.crossHedgeQtyMargin = crossHedgeQtyMargin;
        this.maxCloseSizeData = p0Var;
        this.maxQtyBuffer = maxQtyBuffer;
        this.taxRate = taxRate;
        this.availableBalance = bigDecimal5;
        this.availableBalancePrecision = i11;
        this.bizType = bizType;
        this.estimatePriceSpread = estimatePriceSpread;
        this.needFetchApiForUnifyAccount = z15;
        this.bboType = bBOType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalculateMaxQtyParams)) {
            return false;
        }
        CalculateMaxQtyParams calculateMaxQtyParams = (CalculateMaxQtyParams) other;
        return this.isHedge == calculateMaxQtyParams.isHedge && this.isCross == calculateMaxQtyParams.isCross && this.isUnify == calculateMaxQtyParams.isUnify && Intrinsics.areEqual(this.contract, calculateMaxQtyParams.contract) && this.tradeType == calculateMaxQtyParams.tradeType && this.reduceOnlyChecked == calculateMaxQtyParams.reduceOnlyChecked && Intrinsics.areEqual(this.positionStatus, calculateMaxQtyParams.positionStatus) && Intrinsics.areEqual(this.buySide, calculateMaxQtyParams.buySide) && Intrinsics.areEqual(this.sellSide, calculateMaxQtyParams.sellSide) && Intrinsics.areEqual(this.leverage, calculateMaxQtyParams.leverage) && Intrinsics.areEqual(this.priceConfig, calculateMaxQtyParams.priceConfig) && Intrinsics.areEqual(this.delegationPriceBuy, calculateMaxQtyParams.delegationPriceBuy) && Intrinsics.areEqual(this.delegationPriceSell, calculateMaxQtyParams.delegationPriceSell) && Intrinsics.areEqual(this.totalMargin, calculateMaxQtyParams.totalMargin) && Intrinsics.areEqual(this.positions, calculateMaxQtyParams.positions) && Intrinsics.areEqual(this.positionCouples, calculateMaxQtyParams.positionCouples) && Intrinsics.areEqual(this.crossHedgeQtyMargin, calculateMaxQtyParams.crossHedgeQtyMargin) && Intrinsics.areEqual(this.maxCloseSizeData, calculateMaxQtyParams.maxCloseSizeData) && Intrinsics.areEqual(this.maxQtyBuffer, calculateMaxQtyParams.maxQtyBuffer) && Intrinsics.areEqual(this.taxRate, calculateMaxQtyParams.taxRate) && Intrinsics.areEqual(this.availableBalance, calculateMaxQtyParams.availableBalance) && this.availableBalancePrecision == calculateMaxQtyParams.availableBalancePrecision && this.bizType == calculateMaxQtyParams.bizType && Intrinsics.areEqual(this.estimatePriceSpread, calculateMaxQtyParams.estimatePriceSpread) && this.needFetchApiForUnifyAccount == calculateMaxQtyParams.needFetchApiForUnifyAccount && this.bboType == calculateMaxQtyParams.bboType;
    }

    /* JADX INFO: renamed from: w */
    private final boolean m5366w() {
        return C41014a.m89917B(this.delegationPriceBuy) && C41014a.m89917B(this.delegationPriceSell);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAvailableBalancePrecision() {
        return this.availableBalancePrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BBOHelper.BBOType getBboType() {
        return this.bboType;
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
        int iHashCode3 = (((((iHashCode2 + (orderTradeType == null ? 0 : orderTradeType.hashCode())) * 31) + Boolean.hashCode(this.reduceOnlyChecked)) * 31) + this.positionStatus.hashCode()) * 31;
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
        BigDecimal bigDecimal4 = this.totalMargin;
        int iHashCode10 = (((((iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31) + this.positions.hashCode()) * 31) + this.positionCouples.hashCode()) * 31;
        CrossHedgeQtyMargin crossHedgeQtyMargin = this.crossHedgeQtyMargin;
        int iHashCode11 = (iHashCode10 + (crossHedgeQtyMargin == null ? 0 : crossHedgeQtyMargin.hashCode())) * 31;
        p0 p0Var = this.maxCloseSizeData;
        int iHashCode12 = (((((iHashCode11 + (p0Var == null ? 0 : p0Var.hashCode())) * 31) + this.maxQtyBuffer.hashCode()) * 31) + this.taxRate.hashCode()) * 31;
        BigDecimal bigDecimal5 = this.availableBalance;
        int iHashCode13 = (((((((((iHashCode12 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31) + Integer.hashCode(this.availableBalancePrecision)) * 31) + this.bizType.hashCode()) * 31) + this.estimatePriceSpread.hashCode()) * 31) + Boolean.hashCode(this.needFetchApiForUnifyAccount)) * 31;
        BBOHelper.BBOType bBOType = this.bboType;
        return iHashCode13 + (bBOType != null ? bBOType.hashCode() : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final BigDecimal getEstimatePriceSpread() {
        return this.estimatePriceSpread;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final p0 getMaxCloseSizeData() {
        return this.maxCloseSizeData;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final BigDecimal getMaxQtyBuffer() {
        return this.maxQtyBuffer;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final Map<String, r0> m5379m() {
        return this.positionCouples;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPositionStatus() {
        return this.positionStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<PositionEntity> m5381o() {
        return this.positions;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC38218f getPriceConfig() {
        return this.priceConfig;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getReduceOnlyChecked() {
        return this.reduceOnlyChecked;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getSellSide() {
        return this.sellSide;
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final BigDecimal getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    /* JADX INFO: renamed from: t, reason: from getter */
    public final BigDecimal getTotalMargin() {
        return this.totalMargin;
    }

    @NotNull
    public String toString() {
        return "CalculateMaxQtyParams(isHedge=" + this.isHedge + ", isCross=" + this.isCross + ", isUnify=" + this.isUnify + ", contract=" + this.contract + ", tradeType=" + this.tradeType + ", reduceOnlyChecked=" + this.reduceOnlyChecked + ", positionStatus=" + this.positionStatus + ", buySide=" + this.buySide + ", sellSide=" + this.sellSide + ", leverage=" + this.leverage + ", priceConfig=" + this.priceConfig + ", delegationPriceBuy=" + this.delegationPriceBuy + ", delegationPriceSell=" + this.delegationPriceSell + ", totalMargin=" + this.totalMargin + ", positions=" + this.positions + ", positionCouples=" + this.positionCouples + ", crossHedgeQtyMargin=" + this.crossHedgeQtyMargin + ", maxCloseSizeData=" + this.maxCloseSizeData + ", maxQtyBuffer=" + this.maxQtyBuffer + ", taxRate=" + this.taxRate + ", availableBalance=" + this.availableBalance + ", availableBalancePrecision=" + this.availableBalancePrecision + ", bizType=" + this.bizType + ", estimatePriceSpread=" + this.estimatePriceSpread + ", needFetchApiForUnifyAccount=" + this.needFetchApiForUnifyAccount + ", bboType=" + this.bboType + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final OrderTradeType getTradeType() {
        return this.tradeType;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsCross() {
        return this.isCross;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsHedge() {
        return this.isHedge;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5390y() {
        OrderTradeType orderTradeType;
        if (this.contract == null || C41014a.m89917B(this.leverage) || (orderTradeType = this.tradeType) == null) {
            return true;
        }
        return orderTradeType.isLimit() && m5366w();
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getIsUnify() {
        return this.isUnify;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CalculateMaxQtyParams(boolean z11, boolean z12, boolean z13, InterfaceC38213a interfaceC38213a, OrderTradeType orderTradeType, boolean z14, String str, String str2, String str3, BigDecimal bigDecimal, InterfaceC38218f interfaceC38218f, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List list, Map map, CrossHedgeQtyMargin crossHedgeQtyMargin, p0 p0Var, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, MultiBizType multiBizType, BigDecimal bigDecimal8, boolean z15, BBOHelper.BBOType bBOType, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        int iM66651k;
        if ((i12 & 2097152) != 0) {
            iM66651k = C27039d.m66651k(interfaceC38213a != null ? Integer.valueOf(C38214b.m86264m(interfaceC38213a)) : null, 2);
        } else {
            iM66651k = i11;
        }
        this(z11, z12, z13, interfaceC38213a, orderTradeType, z14, str, str2, str3, bigDecimal, interfaceC38218f, bigDecimal2, bigDecimal3, bigDecimal4, list, map, crossHedgeQtyMargin, p0Var, bigDecimal5, bigDecimal6, bigDecimal7, iM66651k, multiBizType, (i12 & 8388608) != 0 ? FuturesSpreadConfigService.f22739a.m24887e() : bigDecimal8, (i12 & 16777216) != 0 ? false : z15, (i12 & 33554432) != 0 ? null : bBOType);
    }
}
