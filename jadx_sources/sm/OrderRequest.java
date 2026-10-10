package sm;

import androidx.credentials.provider.CredentialEntry;
import androidx.media3.common.C2711C;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.utils.extensions.C27039d;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37569d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sm.a, reason: from toString */
/* JADX INFO: compiled from: OrderRequest.kt */
/* JADX INFO: loaded from: classes20.dex */
@Deprecated(message = "tpsl下单参数待迁移，此方法很多没有用")
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\bQ\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B×\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b!\u0010\"J\u0006\u0010`\u001a\u00020\u0013J\u0006\u0010a\u001a\u00020\u0013J\u0006\u0010b\u001a\u00020\u0013J\u0006\u0010c\u001a\u00020\u0013J\u001c\u0010d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030e2\u0006\u0010f\u001a\u00020gJ\u0014\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030eJ\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010x\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010CJ\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jà\u0002\u0010\u0085\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0003\u0010\u0086\u0001J\u0015\u0010\u0087\u0001\u001a\u00020\u00132\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0089\u0001\u001a\u00030\u008a\u0001HÖ\u0001J\n\u0010\u008b\u0001\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010(\"\u0004\b4\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010F\u001a\u0004\b\u0012\u0010C\"\u0004\bD\u0010ER\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010F\u001a\u0004\b\u0014\u0010C\"\u0004\bG\u0010ER\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010(\"\u0004\bI\u0010*R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010(\"\u0004\bK\u0010*R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010(\"\u0004\bM\u0010*R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010(\"\u0004\bO\u0010*R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010(\"\u0004\bQ\u0010*R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010(\"\u0004\bS\u0010*R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010(\"\u0004\bU\u0010*R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010$\"\u0004\bW\u0010&R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010F\u001a\u0004\bX\u0010C\"\u0004\bY\u0010ER\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010$\"\u0004\b[\u0010&R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010$\"\u0004\b]\u0010&R\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010(\"\u0004\b_\u0010*¨\u0006\u008c\u0001"}, m90084d2 = {"Lcom/kubi/kumex/request/OrderRequest;", "", "symbol", "", "leverage", "Ljava/math/BigDecimal;", "sideType", "orderType", "priceType", "stopType", "stopPrice", "delegationPrice", "delegationAmount", "showAmount", "amount", "profitType", "profitPrice", "lossPrice", "isReduce", "", "isPassive", "delegationValue", "delegationCost", "dealPositionSize", "liquidationPrice", "couponDeductionRatio", "couponRemainAmount", "bestAskOrBidPrice", "trackOrderType", "enableStopProfitLoss", "marginMode", "positionSide", "limitPrice", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getLeverage", "()Ljava/math/BigDecimal;", "setLeverage", "(Ljava/math/BigDecimal;)V", "getSideType", "setSideType", "getOrderType", "setOrderType", "getPriceType", "setPriceType", "getStopType", "setStopType", "getStopPrice", "setStopPrice", "getDelegationPrice", "setDelegationPrice", "getDelegationAmount", "setDelegationAmount", "getShowAmount", "setShowAmount", "getAmount", "setAmount", "getProfitType", "setProfitType", "getProfitPrice", "setProfitPrice", "getLossPrice", "setLossPrice", "()Ljava/lang/Boolean;", "setReduce", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setPassive", "getDelegationValue", "setDelegationValue", "getDelegationCost", "setDelegationCost", "getDealPositionSize", "setDealPositionSize", "getLiquidationPrice", "setLiquidationPrice", "getCouponDeductionRatio", "setCouponDeductionRatio", "getCouponRemainAmount", "setCouponRemainAmount", "getBestAskOrBidPrice", "setBestAskOrBidPrice", "getTrackOrderType", "setTrackOrderType", "getEnableStopProfitLoss", "setEnableStopProfitLoss", "getMarginMode", "setMarginMode", "getPositionSide", "setPositionSide", "getLimitPrice", "setLimitPrice", "isBuy", "isMarket", "isLimit", "isStop", "getOrderParams", "", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getCloseParams", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/kubi/kumex/request/OrderRequest;", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderRequest {

    /* JADX INFO: renamed from: A, reason: from toString */
    @Nullable
    public String positionSide;

    /* JADX INFO: renamed from: B, reason: from toString */
    @Nullable
    public BigDecimal limitPrice;

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public BigDecimal leverage;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public String sideType;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public String orderType;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public String priceType;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public String stopType;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public BigDecimal stopPrice;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public BigDecimal delegationPrice;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public BigDecimal delegationAmount;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public BigDecimal showAmount;

    /* JADX INFO: renamed from: k, reason: from toString */
    @Nullable
    public BigDecimal amount;

    /* JADX INFO: renamed from: l, reason: from toString */
    @Nullable
    public String profitType;

    /* JADX INFO: renamed from: m, reason: from toString */
    @Nullable
    public BigDecimal profitPrice;

    /* JADX INFO: renamed from: n, reason: from toString */
    @Nullable
    public BigDecimal lossPrice;

    /* JADX INFO: renamed from: o, reason: from toString */
    @Nullable
    public Boolean isReduce;

    /* JADX INFO: renamed from: p, reason: from toString */
    @Nullable
    public Boolean isPassive;

    /* JADX INFO: renamed from: q, reason: from toString */
    @Nullable
    public BigDecimal delegationValue;

    /* JADX INFO: renamed from: r, reason: from toString */
    @Nullable
    public BigDecimal delegationCost;

    /* JADX INFO: renamed from: s, reason: from toString */
    @Nullable
    public BigDecimal dealPositionSize;

    /* JADX INFO: renamed from: t, reason: from toString */
    @Nullable
    public BigDecimal liquidationPrice;

    /* JADX INFO: renamed from: u, reason: from toString */
    @Nullable
    public BigDecimal couponDeductionRatio;

    /* JADX INFO: renamed from: v, reason: from toString */
    @Nullable
    public BigDecimal couponRemainAmount;

    /* JADX INFO: renamed from: w, reason: from toString */
    @Nullable
    public BigDecimal bestAskOrBidPrice;

    /* JADX INFO: renamed from: x, reason: from toString */
    @Nullable
    public String trackOrderType;

    /* JADX INFO: renamed from: y, reason: from toString */
    @Nullable
    public Boolean enableStopProfitLoss;

    /* JADX INFO: renamed from: z, reason: from toString */
    @Nullable
    public String marginMode;

    public OrderRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderRequest)) {
            return false;
        }
        OrderRequest orderRequest = (OrderRequest) other;
        return Intrinsics.areEqual(this.symbol, orderRequest.symbol) && Intrinsics.areEqual(this.leverage, orderRequest.leverage) && Intrinsics.areEqual(this.sideType, orderRequest.sideType) && Intrinsics.areEqual(this.orderType, orderRequest.orderType) && Intrinsics.areEqual(this.priceType, orderRequest.priceType) && Intrinsics.areEqual(this.stopType, orderRequest.stopType) && Intrinsics.areEqual(this.stopPrice, orderRequest.stopPrice) && Intrinsics.areEqual(this.delegationPrice, orderRequest.delegationPrice) && Intrinsics.areEqual(this.delegationAmount, orderRequest.delegationAmount) && Intrinsics.areEqual(this.showAmount, orderRequest.showAmount) && Intrinsics.areEqual(this.amount, orderRequest.amount) && Intrinsics.areEqual(this.profitType, orderRequest.profitType) && Intrinsics.areEqual(this.profitPrice, orderRequest.profitPrice) && Intrinsics.areEqual(this.lossPrice, orderRequest.lossPrice) && Intrinsics.areEqual(this.isReduce, orderRequest.isReduce) && Intrinsics.areEqual(this.isPassive, orderRequest.isPassive) && Intrinsics.areEqual(this.delegationValue, orderRequest.delegationValue) && Intrinsics.areEqual(this.delegationCost, orderRequest.delegationCost) && Intrinsics.areEqual(this.dealPositionSize, orderRequest.dealPositionSize) && Intrinsics.areEqual(this.liquidationPrice, orderRequest.liquidationPrice) && Intrinsics.areEqual(this.couponDeductionRatio, orderRequest.couponDeductionRatio) && Intrinsics.areEqual(this.couponRemainAmount, orderRequest.couponRemainAmount) && Intrinsics.areEqual(this.bestAskOrBidPrice, orderRequest.bestAskOrBidPrice) && Intrinsics.areEqual(this.trackOrderType, orderRequest.trackOrderType) && Intrinsics.areEqual(this.enableStopProfitLoss, orderRequest.enableStopProfitLoss) && Intrinsics.areEqual(this.marginMode, orderRequest.marginMode) && Intrinsics.areEqual(this.positionSide, orderRequest.positionSide) && Intrinsics.areEqual(this.limitPrice, orderRequest.limitPrice);
    }

    public OrderRequest(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable String str6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable String str7, @Nullable Boolean bool3, @Nullable String str8, @Nullable String str9, @Nullable BigDecimal bigDecimal16) {
        this.symbol = str;
        this.leverage = bigDecimal;
        this.sideType = str2;
        this.orderType = str3;
        this.priceType = str4;
        this.stopType = str5;
        this.stopPrice = bigDecimal2;
        this.delegationPrice = bigDecimal3;
        this.delegationAmount = bigDecimal4;
        this.showAmount = bigDecimal5;
        this.amount = bigDecimal6;
        this.profitType = str6;
        this.profitPrice = bigDecimal7;
        this.lossPrice = bigDecimal8;
        this.isReduce = bool;
        this.isPassive = bool2;
        this.delegationValue = bigDecimal9;
        this.delegationCost = bigDecimal10;
        this.dealPositionSize = bigDecimal11;
        this.liquidationPrice = bigDecimal12;
        this.couponDeductionRatio = bigDecimal13;
        this.couponRemainAmount = bigDecimal14;
        this.bestAskOrBidPrice = bigDecimal15;
        this.trackOrderType = str7;
        this.enableStopProfitLoss = bool3;
        this.marginMode = str8;
        this.positionSide = str9;
        this.limitPrice = bigDecimal16;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, String> m98504a() {
        BigDecimal bigDecimalM11724a;
        BigDecimal bigDecimalM11724a2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AppsFlyerProperties.CHANNEL, "ANDROID");
        linkedHashMap.put("symbol", this.symbol);
        linkedHashMap.put("side", this.sideType);
        linkedHashMap.put("type", this.orderType);
        linkedHashMap.put("positionSide", this.positionSide);
        linkedHashMap.put("fromReduce", CredentialEntry.TRUE_STRING);
        String plainString = null;
        if (!m98514k()) {
            BigDecimal bigDecimal = this.delegationPrice;
            linkedHashMap.put(FirebaseAnalytics.Param.PRICE, (bigDecimal == null || (bigDecimalM11724a2 = C6447a.m11724a(bigDecimal)) == null) ? null : bigDecimalM11724a2.toPlainString());
        }
        if (this.delegationAmount == null) {
        } else {
            linkedHashMap.put("closeOnly", CredentialEntry.TRUE_STRING);
            BigDecimal bigDecimal2 = this.delegationAmount;
            if (bigDecimal2 != null && (bigDecimalM11724a = C6447a.m11724a(bigDecimal2)) != null) {
                plainString = bigDecimalM11724a.toPlainString();
            }
        }
        linkedHashMap.put("marginMode", this.marginMode);
        return linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getDelegationPrice() {
        return this.delegationPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, String> m98506c(@NotNull PositionEntity position) {
        BigDecimal scale;
        BigDecimal scale2;
        BigDecimal scale3;
        BigDecimal scale4;
        BigDecimal bigDecimalM11724a;
        BigDecimal bigDecimalM11724a2;
        BigDecimal bigDecimalM11724a3;
        BigDecimal bigDecimalM11724a4;
        BigDecimal bigDecimalM11724a5;
        BigDecimal tickSize;
        BigDecimal bigDecimalM11724a6;
        Intrinsics.checkNotNullParameter(position, "position");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AppsFlyerProperties.CHANNEL, "ANDROID");
        linkedHashMap.put("symbol", this.symbol);
        BigDecimal bigDecimal = this.leverage;
        String plainString = null;
        linkedHashMap.put("leverage", (bigDecimal == null || (bigDecimalM11724a6 = C6447a.m11724a(bigDecimal)) == null) ? null : bigDecimalM11724a6.toPlainString());
        linkedHashMap.put("side", this.sideType);
        linkedHashMap.put("type", this.orderType);
        ContractEntity contractEntityM84661b = C37569d.m84661b(position);
        int iM66651k = C27039d.m66651k((contractEntityM84661b == null || (tickSize = contractEntityM84661b.getTickSize()) == null) ? null : Integer.valueOf(C41014a.m89952z(tickSize)), 2);
        if (m98515l()) {
            linkedHashMap.put(InterfaceC33730j9.f70350a, this.stopType);
            linkedHashMap.put("stopPriceType", this.priceType);
            BigDecimal bigDecimal2 = this.stopPrice;
            linkedHashMap.put("stopPrice", (bigDecimal2 == null || (bigDecimalM11724a5 = C6447a.m11724a(bigDecimal2)) == null) ? null : bigDecimalM11724a5.toPlainString());
        }
        if (!m98514k()) {
            if (m98513j()) {
                BigDecimal bigDecimal3 = this.limitPrice;
            } else {
                BigDecimal bigDecimal4 = this.delegationPrice;
            }
        }
        BigDecimal bigDecimal5 = this.delegationAmount;
        linkedHashMap.put("size", (bigDecimal5 == null || (bigDecimalM11724a2 = C6447a.m11724a(bigDecimal5)) == null) ? null : bigDecimalM11724a2.toPlainString());
        BigDecimal bigDecimal6 = this.showAmount;
        if (bigDecimal6 != null) {
            if (Intrinsics.areEqual(bigDecimal6 != null ? Double.valueOf(bigDecimal6.doubleValue()) : null, 0.0d)) {
            } else {
                linkedHashMap.put("iceberg", CredentialEntry.TRUE_STRING);
                BigDecimal bigDecimal7 = this.showAmount;
            }
        }
        String str = this.profitType;
        if (str != null) {
            linkedHashMap.put("stopPriceType", str);
        }
        if (this.profitPrice != null) {
            if (m98512i()) {
                BigDecimal bigDecimal8 = this.profitPrice;
            } else {
                BigDecimal bigDecimal9 = this.profitPrice;
            }
        }
        if (this.lossPrice != null) {
            if (m98512i()) {
                BigDecimal bigDecimal10 = this.lossPrice;
                if (bigDecimal10 != null && (scale2 = bigDecimal10.setScale(iM66651k, RoundingMode.DOWN)) != null) {
                    plainString = scale2.toPlainString();
                }
            } else {
                BigDecimal bigDecimal11 = this.lossPrice;
                if (bigDecimal11 != null && (scale = bigDecimal11.setScale(iM66651k, RoundingMode.DOWN)) != null) {
                    plainString = scale.toPlainString();
                }
            }
        }
        Boolean bool = this.isReduce;
        if (bool != null) {
            linkedHashMap.put("closeOnly", String.valueOf(bool));
        }
        Boolean bool2 = this.isPassive;
        if (bool2 != null) {
            linkedHashMap.put("postOnly", String.valueOf(bool2));
        }
        String str2 = this.marginMode;
        if (str2 != null) {
            linkedHashMap.put("marginMode", str2);
        }
        String str3 = this.positionSide;
        if (str3 != null) {
            linkedHashMap.put("positionSide", str3);
        }
        return linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSideType() {
        return this.sideType;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStopType() {
        return this.stopType;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.leverage;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.sideType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stopType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.stopPrice;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.delegationPrice;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.delegationAmount;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.showAmount;
        int iHashCode10 = (iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.amount;
        int iHashCode11 = (iHashCode10 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str6 = this.profitType;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.profitPrice;
        int iHashCode13 = (iHashCode12 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.lossPrice;
        int iHashCode14 = (iHashCode13 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Boolean bool = this.isReduce;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPassive;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.delegationValue;
        int iHashCode17 = (iHashCode16 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.delegationCost;
        int iHashCode18 = (iHashCode17 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.dealPositionSize;
        int iHashCode19 = (iHashCode18 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.liquidationPrice;
        int iHashCode20 = (iHashCode19 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.couponDeductionRatio;
        int iHashCode21 = (iHashCode20 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.couponRemainAmount;
        int iHashCode22 = (iHashCode21 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.bestAskOrBidPrice;
        int iHashCode23 = (iHashCode22 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        String str7 = this.trackOrderType;
        int iHashCode24 = (iHashCode23 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool3 = this.enableStopProfitLoss;
        int iHashCode25 = (iHashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str8 = this.marginMode;
        int iHashCode26 = (iHashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.positionSide;
        int iHashCode27 = (iHashCode26 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.limitPrice;
        return iHashCode27 + (bigDecimal16 != null ? bigDecimal16.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m98512i() {
        return Intrinsics.areEqual(this.sideType, "buy");
    }

    /* JADX INFO: renamed from: j */
    public final boolean m98513j() {
        return Intrinsics.areEqual(this.orderType, TUIConstants.TUIContact.LIMIT);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m98514k() {
        return Intrinsics.areEqual(this.orderType, "market");
    }

    /* JADX INFO: renamed from: l */
    public final boolean m98515l() {
        String str = this.stopType;
        return !(str == null || str.length() == 0);
    }

    /* JADX INFO: renamed from: m */
    public final void m98516m(@Nullable BigDecimal bigDecimal) {
        this.delegationAmount = bigDecimal;
    }

    /* JADX INFO: renamed from: n */
    public final void m98517n(@Nullable BigDecimal bigDecimal) {
        this.delegationPrice = bigDecimal;
    }

    /* JADX INFO: renamed from: o */
    public final void m98518o(@Nullable BigDecimal bigDecimal) {
        this.leverage = bigDecimal;
    }

    /* JADX INFO: renamed from: p */
    public final void m98519p(@Nullable BigDecimal bigDecimal) {
        this.limitPrice = bigDecimal;
    }

    /* JADX INFO: renamed from: q */
    public final void m98520q(@Nullable String str) {
        this.marginMode = str;
    }

    /* JADX INFO: renamed from: r */
    public final void m98521r(@Nullable String str) {
        this.orderType = str;
    }

    /* JADX INFO: renamed from: s */
    public final void m98522s(@Nullable String str) {
        this.positionSide = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m98523t(@Nullable String str) {
        this.priceType = str;
    }

    @NotNull
    public String toString() {
        return "OrderRequest(symbol=" + this.symbol + ", leverage=" + this.leverage + ", sideType=" + this.sideType + ", orderType=" + this.orderType + ", priceType=" + this.priceType + ", stopType=" + this.stopType + ", stopPrice=" + this.stopPrice + ", delegationPrice=" + this.delegationPrice + ", delegationAmount=" + this.delegationAmount + ", showAmount=" + this.showAmount + ", amount=" + this.amount + ", profitType=" + this.profitType + ", profitPrice=" + this.profitPrice + ", lossPrice=" + this.lossPrice + ", isReduce=" + this.isReduce + ", isPassive=" + this.isPassive + ", delegationValue=" + this.delegationValue + ", delegationCost=" + this.delegationCost + ", dealPositionSize=" + this.dealPositionSize + ", liquidationPrice=" + this.liquidationPrice + ", couponDeductionRatio=" + this.couponDeductionRatio + ", couponRemainAmount=" + this.couponRemainAmount + ", bestAskOrBidPrice=" + this.bestAskOrBidPrice + ", trackOrderType=" + this.trackOrderType + ", enableStopProfitLoss=" + this.enableStopProfitLoss + ", marginMode=" + this.marginMode + ", positionSide=" + this.positionSide + ", limitPrice=" + this.limitPrice + ')';
    }

    /* JADX INFO: renamed from: u */
    public final void m98524u(@Nullable Boolean bool) {
        this.isReduce = bool;
    }

    /* JADX INFO: renamed from: v */
    public final void m98525v(@Nullable String str) {
        this.sideType = str;
    }

    /* JADX INFO: renamed from: w */
    public final void m98526w(@Nullable BigDecimal bigDecimal) {
        this.stopPrice = bigDecimal;
    }

    /* JADX INFO: renamed from: x */
    public final void m98527x(@Nullable String str) {
        this.stopType = str;
    }

    /* JADX INFO: renamed from: y */
    public final void m98528y(@Nullable String str) {
        this.symbol = str;
    }

    public /* synthetic */ OrderRequest(String str, BigDecimal bigDecimal, String str2, String str3, String str4, String str5, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Boolean bool, Boolean bool2, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, String str7, Boolean bool3, String str8, String str9, BigDecimal bigDecimal16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & 128) != 0 ? null : bigDecimal3, (i11 & 256) != 0 ? null : bigDecimal4, (i11 & 512) != 0 ? null : bigDecimal5, (i11 & 1024) != 0 ? null : bigDecimal6, (i11 & 2048) != 0 ? null : str6, (i11 & 4096) != 0 ? null : bigDecimal7, (i11 & 8192) != 0 ? null : bigDecimal8, (i11 & 16384) != 0 ? null : bool, (i11 & 32768) != 0 ? null : bool2, (i11 & 65536) != 0 ? null : bigDecimal9, (i11 & 131072) != 0 ? null : bigDecimal10, (i11 & 262144) != 0 ? null : bigDecimal11, (i11 & 524288) != 0 ? null : bigDecimal12, (i11 & 1048576) != 0 ? null : bigDecimal13, (i11 & 2097152) != 0 ? null : bigDecimal14, (i11 & 4194304) != 0 ? null : bigDecimal15, (i11 & 8388608) != 0 ? null : str7, (i11 & 16777216) != 0 ? null : bool3, (i11 & 33554432) != 0 ? null : str8, (i11 & 67108864) != 0 ? null : str9, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bigDecimal16);
    }
}
