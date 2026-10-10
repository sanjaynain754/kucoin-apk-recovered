package com.kubi.unify.unify.common.order.delegate;

import androidx.media3.extractor.text.ttml.TtmlNode;
import cm.CancelAllOrderParams;
import cm.SubmitStopOrderParams;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.platform.model.UserMaxLeverageEntity;
import com.kubi.kumex.data.trade.model.CouponDetailEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrderResult;
import com.kubi.kumex.data.trade.model.SubmitAlterTpslOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitModifyOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitReversePositionEntity;
import com.kubi.kumex.data.trade.model.SubmitScaledOrderBody;
import com.kubi.kumex.data.trade.model.SubmitTwapModifyOrderEntity;
import com.kubi.kumex.data.trade.model.TwapDelegateHistPageEntity;
import com.kubi.otc.entity.OtcAd;
import com.kubi.sdk.PageEntity;
import com.kubi.unify.api.entity.UnifyOrderDisplayTypeEnum;
import com.kubi.unify.api.entity.UnifySupportService;
import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import com.kubi.unify.entity.UnifyOrderEntity;
import com.kubi.unify.entity.UnifyPageEntity;
import com.kubi.unify.entity.UnifyReversePositionParams;
import com.kubi.unify.stream.UnifyDataStreamManager;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m60.C42434a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38191i;
import p402kf.C41014a;
import p595rg.InterfaceC44076d;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r60.InterfaceC43932a;

/* JADX INFO: compiled from: IOrderApiDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001e\u0010\u001d\u001a\u00020\u001a2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\"\u0010'\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0016J&\u0010,\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001fH\u0016J\u0018\u0010-\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016JT\u00101\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u0001022\u0006\u00104\u001a\u00020&2\b\u00105\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020@H\u0016J\u001c\u0010A\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J$\u0010B\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J$\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J$\u0010F\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J\u001e\u0010G\u001a\u0004\u0018\u00010H2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J\n\u0010G\u001a\u0004\u0018\u00010IH\u0016J\u0018\u0010J\u001a\b\u0012\u0004\u0012\u00020D0C*\b\u0012\u0004\u0012\u00020L0KH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006M"}, m90084d2 = {"Lcom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate;", "Lcom/kubi/function/common/IMultiOrderApi;", "<init>", "()V", "api", "Lcom/kubi/unify/unify/common/order/api/IOrderApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/unify/unify/common/order/api/IOrderApi;", "api$delegate", "Lkotlin/Lazy;", "flowApi", "getFlowApi", "flowApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "pauseOrRestartTwapOrder", "", "orderId", "", "status", "cancelTwapOrder", "cancelAllTwapOrder", "symbol", "advancedType", "submitModifyTwapOrder", "Lcom/kubi/kumex/data/trade/model/OrderResult;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;", "submitTwapOrder", "request", "", "submitScaledOrder", TtmlNode.TAG_BODY, "Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;", "fetchUserMaxLeverage", "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "isTrial", "", "cancelOrder", "cancelAllOrder", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/trade/model/CancelAllOrderParams;", "cancelAllAdvancedOrders", "submitOrder", "submitStopOrder", "Lcom/kubi/kumex/data/trade/model/SubmitStopOrderParams;", "fetchCouponDetail", "Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;", "fetchEsAccountRiskRateChange", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "trial", "qty", FirebaseAnalytics.Param.PRICE, "orderType", "side", "(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitReversePositionOrder", "Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;", "submitModifyOrder", "createSubmitModifyOrderEntity", "Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;", "submitAlterTpslOrder", "Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;", "submitChaseOrder", "fetchActiveOrders", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "fetchHistoryOrders", "fetchAdvancedOrders", "fetchTwapOrders", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "unifyPage2PageEntity", "Lcom/kubi/unify/entity/UnifyPageEntity;", "Lcom/kubi/unify/entity/UnifyOrderEntity;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIOrderApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOrderApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n1#2:423\n295#3,2:424\n1563#3:426\n1634#3,3:427\n*S KotlinDebug\n*F\n+ 1 IOrderApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderApiDelegate\n*L\n375#1:424,2\n412#1:426\n412#1:427,3\n*E\n"})
public final class IOrderApiDelegate implements InterfaceC44076d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f53459a = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.unify.common.order.delegate.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IOrderApiDelegate.m65407x0();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f53460b = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.unify.common.order.delegate.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IOrderApiDelegate.m65404F0();
        }
    });

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: B */
    public OrderResult mo4494B(@NotNull SubmitAlterTpslOrderEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new OrderResult(null, null, 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: H0 */
    public OrderResult mo4496H0(boolean z11, @NotNull Map<String, String> params) {
        String str;
        String str2;
        String upperCase;
        String str3;
        Intrinsics.checkNotNullParameter(params, "params");
        String str4 = null;
        if (z11) {
            return new OrderResult(null, null, 3, null);
        }
        boolean zAreEqual = Intrinsics.areEqual(params.get("side"), "buy");
        boolean z12 = params.get(InterfaceC33730j9.f70350a) != null;
        boolean z13 = (params.get("triggerStopUpPrice") == null && params.get("triggerStopDownPrice") == null) ? false : true;
        String str5 = zAreEqual ? params.get("triggerStopUpPrice") : params.get("triggerStopDownPrice");
        String str6 = !zAreEqual ? params.get("triggerStopUpPrice") : params.get("triggerStopDownPrice");
        String str7 = params.get("symbol");
        String str8 = params.get("side");
        if (str8 != null) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase2 = str8.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            str = upperCase2;
        } else {
            str = null;
        }
        String str9 = params.get("type");
        if (str9 != null) {
            Locale ENGLISH2 = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
            String upperCase3 = str9.toUpperCase(ENGLISH2);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
            str2 = upperCase3;
        } else {
            str2 = null;
        }
        String str10 = params.get("size");
        String str11 = params.get(FirebaseAnalytics.Param.PRICE);
        String str12 = params.get("marginMode");
        if (str12 != null) {
            Locale ENGLISH3 = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH3, "ENGLISH");
            upperCase = str12.toUpperCase(ENGLISH3);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase == null) {
                upperCase = "CROSS";
            }
        } else {
            upperCase = "CROSS";
        }
        String str13 = upperCase;
        String str14 = params.get("bboSideType");
        String str15 = params.get("bboLevel");
        String str16 = params.get("isFullPercent");
        Boolean boolValueOf = str16 != null ? Boolean.valueOf(C27041f.m66673m(str16, false, 1, null)) : null;
        String str17 = params.get("leverage");
        String str18 = params.get("timeInForce");
        String str19 = params.get("closeOnly");
        Boolean boolValueOf2 = str19 != null ? Boolean.valueOf(C27041f.m66673m(str19, false, 1, null)) : null;
        String str20 = params.get("closeOrder");
        Boolean boolValueOf3 = str20 != null ? Boolean.valueOf(C27041f.m66673m(str20, false, 1, null)) : null;
        String str21 = params.get("fromReduce");
        Boolean boolValueOf4 = str21 != null ? Boolean.valueOf(C27041f.m66673m(str21, false, 1, null)) : null;
        String str22 = params.get(ViewProps.HIDDEN);
        Boolean boolValueOf5 = str22 != null ? Boolean.valueOf(C27041f.m66673m(str22, false, 1, null)) : null;
        String str23 = params.get("iceberg");
        Boolean boolValueOf6 = str23 != null ? Boolean.valueOf(C27041f.m66673m(str23, false, 1, null)) : null;
        String str24 = params.get("visibleSize");
        String str25 = params.get(InterfaceC33730j9.f70350a);
        if (str25 != null) {
            Locale ENGLISH4 = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH4, "ENGLISH");
            String upperCase4 = str25.toUpperCase(ENGLISH4);
            Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
            str3 = upperCase4;
        } else {
            str3 = null;
        }
        String str26 = params.get("stopPrice");
        String str27 = z12 ? params.get("stopPriceType") : null;
        String str28 = (!z13 || str5 == null) ? null : params.get("stopPriceType");
        String str29 = params.get("postOnly");
        Boolean boolValueOf7 = str29 != null ? Boolean.valueOf(C27041f.m66673m(str29, false, 1, null)) : null;
        if (z13 && str6 != null) {
            str4 = params.get("stopPriceType");
        }
        UtaLimitOrMarketOrderParams utaLimitOrMarketOrderParams = new UtaLimitOrMarketOrderParams(null, null, null, null, null, str13, str2, str, str10, str7, str11, str14, str15, boolValueOf, str17, str5, str28, str6, str4, str18, boolValueOf7, boolValueOf5, boolValueOf6, str24, boolValueOf2, str3, str26, str27, boolValueOf3, boolValueOf4, null, 1073741855, null);
        String str30 = params.get("X-VALIDATION-TOKEN");
        return (str30 == null || str30.length() == 0) ? m65408T0().m96871w(utaLimitOrMarketOrderParams) : m65408T0().m96861l(utaLimitOrMarketOrderParams, str30);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: J */
    public Object mo4497J(@NotNull CancelAllOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (Intrinsics.areEqual(params.getFundsType(), "trialFunds")) {
            return new Object();
        }
        InterfaceC43932a interfaceC43932aM65408T0 = m65408T0();
        String strM86168a = C38191i.f85893a.m86168a();
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("tradeType", UnifySupportService.FUTURES.getValue()));
        String symbol = params.getSymbol();
        if (symbol != null) {
            mapHashMapOf.put("symbol", symbol);
        }
        Unit unit = Unit.INSTANCE;
        return interfaceC43932aM65408T0.m96867r(strM86168a, mapHashMapOf);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: L0 */
    public UserMaxLeverageEntity mo4498L0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return z11 ? new UserMaxLeverageEntity(null, null, null, null, 15, null) : new UserMaxLeverageEntity(null, DowngradeExKt.m66536f(m65408T0().m96857a(symbol).getLeverage()), null, null, 13, null);
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC43932a m65408T0() {
        return (InterfaceC43932a) this.f53459a.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    public final InterfaceC43932a m65409V0() {
        return (InterfaceC43932a) this.f53460b.getValue();
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: d0 */
    public CouponDetailEntity mo4500d0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: d1 */
    public Object mo4501d1(boolean z11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Pair<? extends BigDecimal, ? extends BigDecimal>> continuation) throws Throwable {
        IOrderApiDelegate$fetchEsAccountRiskRateChange$1 iOrderApiDelegate$fetchEsAccountRiskRateChange$1;
        IOrderApiDelegate iOrderApiDelegate;
        if (continuation instanceof IOrderApiDelegate$fetchEsAccountRiskRateChange$1) {
            iOrderApiDelegate$fetchEsAccountRiskRateChange$1 = (IOrderApiDelegate$fetchEsAccountRiskRateChange$1) continuation;
            int i11 = iOrderApiDelegate$fetchEsAccountRiskRateChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iOrderApiDelegate$fetchEsAccountRiskRateChange$1.label = i11 - Integer.MIN_VALUE;
                iOrderApiDelegate = this;
            } else {
                iOrderApiDelegate = this;
                iOrderApiDelegate$fetchEsAccountRiskRateChange$1 = new IOrderApiDelegate$fetchEsAccountRiskRateChange$1(iOrderApiDelegate, continuation);
            }
        } else {
            iOrderApiDelegate = this;
            iOrderApiDelegate$fetchEsAccountRiskRateChange$1 = new IOrderApiDelegate$fetchEsAccountRiskRateChange$1(iOrderApiDelegate, continuation);
        }
        Object objM96868s = iOrderApiDelegate$fetchEsAccountRiskRateChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iOrderApiDelegate$fetchEsAccountRiskRateChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM96868s);
            if (C41014a.m89917B(bigDecimal2) || C41014a.m89917B(bigDecimal) || z11) {
                return null;
            }
            InterfaceC43932a interfaceC43932aM65409V0 = iOrderApiDelegate.m65409V0();
            Pair pairM90091to = TuplesKt.m90091to("tradeType", UnifySupportService.FUTURES.getValue());
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = str.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Pair pairM90091to2 = TuplesKt.m90091to("orderType", upperCase);
            Pair pairM90091to3 = TuplesKt.m90091to("symbol", str2);
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase2 = str3.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            Map<String, String> mapMapOf = MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("side", upperCase2), TuplesKt.m90091to("size", bigDecimal != null ? bigDecimal.toPlainString() : null), TuplesKt.m90091to(FirebaseAnalytics.Param.PRICE, bigDecimal2 != null ? bigDecimal2.toPlainString() : null));
            iOrderApiDelegate$fetchEsAccountRiskRateChange$1.L$0 = SpillingKt.nullOutSpilledVariable(bigDecimal);
            iOrderApiDelegate$fetchEsAccountRiskRateChange$1.L$1 = SpillingKt.nullOutSpilledVariable(bigDecimal2);
            iOrderApiDelegate$fetchEsAccountRiskRateChange$1.L$2 = SpillingKt.nullOutSpilledVariable(str);
            iOrderApiDelegate$fetchEsAccountRiskRateChange$1.L$3 = SpillingKt.nullOutSpilledVariable(str2);
            iOrderApiDelegate$fetchEsAccountRiskRateChange$1.L$4 = SpillingKt.nullOutSpilledVariable(str3);
            iOrderApiDelegate$fetchEsAccountRiskRateChange$1.Z$0 = z11;
            iOrderApiDelegate$fetchEsAccountRiskRateChange$1.label = 1;
            objM96868s = interfaceC43932aM65409V0.m96868s(mapMapOf, iOrderApiDelegate$fetchEsAccountRiskRateChange$1);
            if (objM96868s == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM96868s);
        }
        Object obj = ((HashMap) objM96868s).get("riskRatio");
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(obj != null ? obj.toString() : null);
        UnifyAccountOverviewEntity value = UnifyDataStreamManager.f53365a.m65362u().m65392b().getValue();
        return new Pair(value != null ? value.getDisplayRiskRatio() : null, bigDecimalM66536f != null ? C42434a.m93160a(bigDecimalM66536f) : null);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: e1 */
    public OrderResult mo4502e1(@NotNull SubmitScaledOrderBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        String validationToken = body.getValidationToken();
        return (validationToken == null || validationToken.length() == 0) ? m65408T0().m96866q(C38191i.f85893a.m86173f(), body) : m65408T0().m96864o(C38191i.f85893a.m86174g(), body, body.getValidationToken());
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: f */
    public PageEntity<OrderEntity> mo4503f(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (Intrinsics.areEqual(params.get("fundsType"), "trialFunds")) {
            return null;
        }
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("tradeType", UnifySupportService.FUTURES.getValue()), TuplesKt.m90091to("orderFilter", OtcAd.STATUS_NORMAL));
        String str = params.get("symbol");
        if (str != null) {
        }
        String str2 = params.get("pageSize");
        if (str2 != null) {
        }
        String str3 = params.get("currentPage");
        if (str3 != null) {
            mapHashMapOf.put("currentPage", str3);
        }
        return m65410W0(m65408T0().m96860k(mapHashMapOf));
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: g */
    public PageEntity<OrderEntity> mo4504g(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (Intrinsics.areEqual(params.get("fundsType"), "trialFunds")) {
            return null;
        }
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("tradeType", UnifySupportService.FUTURES.getValue()), TuplesKt.m90091to("orderFilter", "ADVANCED"));
        String str = params.get("symbol");
        if (str != null) {
        }
        String str2 = params.get("pageSize");
        if (str2 != null) {
        }
        String str3 = params.get("currentPage");
        if (str3 != null) {
            mapHashMapOf.put("currentPage", str3);
        }
        return m65410W0(m65408T0().m96860k(mapHashMapOf));
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: h */
    public OrderResult mo4505h(@NotNull SubmitModifyOrderEntity createSubmitModifyOrderEntity) {
        Intrinsics.checkNotNullParameter(createSubmitModifyOrderEntity, "createSubmitModifyOrderEntity");
        boolean zAreEqual = Intrinsics.areEqual(createSubmitModifyOrderEntity.getSide(), "buy");
        BigDecimal triggerStopUpPrice = zAreEqual ? createSubmitModifyOrderEntity.getTriggerStopUpPrice() : createSubmitModifyOrderEntity.getTriggerStopDownPrice();
        BigDecimal triggerStopUpPrice2 = !zAreEqual ? createSubmitModifyOrderEntity.getTriggerStopUpPrice() : createSubmitModifyOrderEntity.getTriggerStopDownPrice();
        UtaModifyOrderParams utaModifyOrderParams = new UtaModifyOrderParams(createSubmitModifyOrderEntity.getSymbol(), createSubmitModifyOrderEntity.getOrderId(), createSubmitModifyOrderEntity.getPrice(), createSubmitModifyOrderEntity.getSize(), createSubmitModifyOrderEntity.getVisibleSize(), triggerStopUpPrice, triggerStopUpPrice != null ? createSubmitModifyOrderEntity.getStopPriceType() : null, triggerStopUpPrice2, triggerStopUpPrice2 != null ? createSubmitModifyOrderEntity.getStopPriceType() : null, C27041f.m66669i(createSubmitModifyOrderEntity.getChannel(), "ANDROID"), null, 1024, null);
        String validationToken = createSubmitModifyOrderEntity.getValidationToken();
        return (validationToken == null || validationToken.length() == 0) ? m65408T0().m96865p(utaModifyOrderParams) : m65408T0().m96863n(utaModifyOrderParams, validationToken);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: i */
    public OrderResult mo4506i(@NotNull SubmitTwapModifyOrderEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        throw new UnsupportedOperationException("统一账户不支持twap");
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: i1 */
    public Object mo4507i1(boolean z11, @Nullable String str, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        if (z11) {
            return new Object();
        }
        InterfaceC43932a interfaceC43932aM65408T0 = m65408T0();
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("tradeType", UnifySupportService.FUTURES.getValue()), TuplesKt.m90091to("orderId", orderId));
        if (str != null) {
            mapHashMapOf.put("symbol", str);
        }
        return interfaceC43932aM65408T0.m96862m(mapHashMapOf);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: j */
    public PageEntity<OrderEntity> mo4508j(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        UnifyOrderDisplayTypeEnum unifyOrderDisplayTypeEnum = null;
        if (Intrinsics.areEqual(params.get("fundsType"), "trialFunds")) {
            return null;
        }
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("tradeType", UnifySupportService.FUTURES.getValue()));
        String str = params.get("symbol");
        if (str != null) {
        }
        String str2 = params.get("pageSize");
        if (str2 != null) {
        }
        String str3 = params.get("currentPage");
        if (str3 != null) {
        }
        String str4 = params.get("type");
        if (str4 != null) {
            for (UnifyOrderDisplayTypeEnum unifyOrderDisplayTypeEnum2 : UnifyOrderDisplayTypeEnum.getEntries()) {
                if (Intrinsics.areEqual(unifyOrderDisplayTypeEnum2.getTradeType(), str4)) {
                    unifyOrderDisplayTypeEnum = unifyOrderDisplayTypeEnum2;
                    break;
                }
            }
            UnifyOrderDisplayTypeEnum unifyOrderDisplayTypeEnum3 = unifyOrderDisplayTypeEnum;
            if (unifyOrderDisplayTypeEnum3 != null) {
                mapHashMapOf.put("orderDisplayType", String.valueOf(Integer.valueOf(unifyOrderDisplayTypeEnum3.getType()).intValue()));
            }
        }
        String str5 = params.get("start");
        if (str5 != null) {
        }
        String str6 = params.get("end");
        if (str6 != null) {
            mapHashMapOf.put("endAt", str6);
        }
        return m65410W0(m65408T0().m96859j(mapHashMapOf));
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: k */
    public OrderResult mo4509k(@NotNull SubmitReversePositionEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        String symbol = entity.getSymbol();
        String channel = entity.getChannel();
        BigDecimal leverage = entity.getLeverage();
        String positionSide = entity.getPositionSide();
        String upperCase = C27041f.m66668h(entity.getSide()).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return m65408T0().m96870v(C38191i.f85893a.m86172e(), new UnifyReversePositionParams(symbol, channel, leverage, positionSide, upperCase, C41014a.m89922G(entity.getQty(), null, 1, null), C27041f.m66668h(entity.getMarginMode())));
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public Object mo4510l0(boolean z11, @NotNull SubmitStopOrderParams params) throws Throwable {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(params, "params");
        if (z11) {
            return new Object();
        }
        String symbol = params.getSymbol();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = "market".toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String side = params.getSide();
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase2 = side.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        String size = params.getSize();
        String marginMode = params.getMarginMode();
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase3 = marginMode.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        String upperCase4 = null;
        UtaLimitOrMarketOrderParams utaLimitOrMarketOrderParams = new UtaLimitOrMarketOrderParams(null, null, null, null, null, upperCase3, upperCase, upperCase2, size, symbol, null, null, null, bool, "1", null, null, null, null, null, null, null, null, null, null, null, null, null, bool2, null, bool2, 6175, null);
        String validationToken = params.getValidationToken();
        BigDecimal upPrice = params.getUpPrice();
        if (upPrice != null) {
            String upTriggerDirection = params.getUpTriggerDirection();
            if (upTriggerDirection != null) {
                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                String upperCase5 = upTriggerDirection.toUpperCase(ENGLISH);
                str = "toUpperCase(...)";
                Intrinsics.checkNotNullExpressionValue(upperCase5, str);
                str2 = upperCase5;
            } else {
                str = "toUpperCase(...)";
                str2 = null;
            }
            UtaLimitOrMarketOrderParams utaLimitOrMarketOrderParamsCopy$default = UtaLimitOrMarketOrderParams.copy$default(utaLimitOrMarketOrderParams, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str2, upPrice.toPlainString(), params.getUpType(), null, null, null, 1912602623, null);
            if (validationToken == null || validationToken.length() == 0) {
                m65408T0().m96871w(utaLimitOrMarketOrderParamsCopy$default);
            } else {
                m65408T0().m96861l(utaLimitOrMarketOrderParamsCopy$default, validationToken);
            }
        } else {
            str = "toUpperCase(...)";
        }
        BigDecimal downPrice = params.getDownPrice();
        if (downPrice != null) {
            String downTriggerDirection = params.getDownTriggerDirection();
            if (downTriggerDirection != null) {
                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                upperCase4 = downTriggerDirection.toUpperCase(ENGLISH);
                Intrinsics.checkNotNullExpressionValue(upperCase4, str);
            }
            UtaLimitOrMarketOrderParams utaLimitOrMarketOrderParamsCopy$default2 = UtaLimitOrMarketOrderParams.copy$default(utaLimitOrMarketOrderParams, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, upperCase4, downPrice.toPlainString(), params.getDownType(), null, null, null, 1912602623, null);
            if (validationToken == null || validationToken.length() == 0) {
                m65408T0().m96871w(utaLimitOrMarketOrderParamsCopy$default2);
            } else {
                m65408T0().m96861l(utaLimitOrMarketOrderParamsCopy$default2, validationToken);
            }
        }
        return bool2;
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: m */
    public TwapDelegateHistPageEntity mo4511m(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        throw new UnsupportedOperationException("统一账户不支持twap");
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: r */
    public Object mo4512r(@Nullable String str) {
        throw new UnsupportedOperationException("统一账户不支持twap");
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: s */
    public Object mo4513s(@Nullable String str, @NotNull String advancedType) {
        Intrinsics.checkNotNullParameter(advancedType, "advancedType");
        throw new UnsupportedOperationException("统一账户不支持twap");
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: v */
    public OrderResult mo4514v(@NotNull Map<String, String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        throw new UnsupportedOperationException("统一账户不支持twap");
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.UNIFIED;
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: y */
    public Object mo4516y(@Nullable String str, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException("统一账户不支持twap");
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: z */
    public OrderResult mo4517z(@NotNull Map<String, String> entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new OrderResult(null, null, 3, null);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: z0 */
    public Object mo4518z0(@NotNull CancelAllOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (Intrinsics.areEqual(params.getFundsType(), "trialFunds")) {
            return new Object();
        }
        InterfaceC43932a interfaceC43932aM65408T0 = m65408T0();
        String strM86169b = C38191i.f85893a.m86169b();
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("tradeType", UnifySupportService.FUTURES.getValue()));
        String symbol = params.getSymbol();
        if (symbol != null) {
            mapHashMapOf.put("symbol", symbol);
        }
        Unit unit = Unit.INSTANCE;
        return interfaceC43932aM65408T0.m96869u(strM86169b, mapHashMapOf);
    }

    /* JADX INFO: renamed from: F0 */
    public static final InterfaceC43932a m65404F0() {
        return (InterfaceC43932a) C42597a.m93388d().create(InterfaceC43932a.class);
    }

    /* JADX INFO: renamed from: x0 */
    public static final InterfaceC43932a m65407x0() {
        return (InterfaceC43932a) C42597a.m93391g().create(InterfaceC43932a.class);
    }

    /* JADX INFO: renamed from: W0 */
    public final PageEntity<OrderEntity> m65410W0(UnifyPageEntity<UnifyOrderEntity> unifyPageEntity) {
        List listEmptyList;
        boolean z11;
        List<UnifyOrderEntity> items = unifyPageEntity.getItems();
        if (items != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                listEmptyList.add(((UnifyOrderEntity) it.next()).toOrderEntity());
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List mutableList = CollectionsKt.toMutableList((Collection) listEmptyList);
        if (C27039d.m66650j(unifyPageEntity.getTotalPage()) > C27039d.m66650j(unifyPageEntity.getCurrentPage())) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new PageEntity<>(mutableList, z11, null, C27039d.m66650j(unifyPageEntity.getCurrentPage()) + 1, -1, unifyPageEntity.getTotalNum());
    }
}
