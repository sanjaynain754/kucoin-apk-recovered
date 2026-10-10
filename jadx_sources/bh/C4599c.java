package bh;

import androidx.media3.extractor.text.ttml.TtmlNode;
import cm.CancelAllOrderParams;
import cm.SubmitStopOrderParams;
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
import com.kubi.sdk.PageEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014ah.InterfaceC0311a;
import p014ah.InterfaceC0313c;
import p595rg.InterfaceC44076d;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: bh.c */
/* JADX INFO: compiled from: IOrderApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001e\u0010\u001f\u001a\u00020\u001c2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150!H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\"\u0010)\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,H\u0016J&\u0010.\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150!H\u0016J\u0018\u0010/\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(2\u0006\u0010+\u001a\u000200H\u0016J\u001a\u00101\u001a\u0004\u0018\u0001022\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\"\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150!H\u0016J\"\u00106\u001a\b\u0012\u0004\u0012\u000205042\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150!H\u0016J$\u00107\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150!H\u0016J\u001e\u00108\u001a\u0004\u0018\u0001092\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150!H\u0016JT\u0010:\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010<\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010;2\u0006\u0010=\u001a\u00020(2\b\u0010>\u001a\u0004\u0018\u00010<2\b\u0010?\u001a\u0004\u0018\u00010<2\u0006\u0010@\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010BJ\u0010\u0010C\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020IH\u0016J\u001c\u0010J\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150!H\u0016J\n\u00108\u001a\u0004\u0018\u00010KH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006L"}, m90084d2 = {"Lcom/kubi/futures/classic/common/order/delegate/IOrderApiDelegate;", "Lcom/kubi/function/common/IMultiOrderApi;", "<init>", "()V", "api", "Lcom/kubi/futures/classic/common/order/api/ISelfOrderApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/classic/common/order/api/ISelfOrderApi;", "api$delegate", "Lkotlin/Lazy;", "trialApi", "Lcom/kubi/futures/classic/common/order/api/ITrialOrderApi;", "getTrialApi", "()Lcom/kubi/futures/classic/common/order/api/ITrialOrderApi;", "trialApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "pauseOrRestartTwapOrder", "", "orderId", "", "status", "cancelTwapOrder", "cancelAllTwapOrder", "symbol", "advancedType", "submitModifyTwapOrder", "Lcom/kubi/kumex/data/trade/model/OrderResult;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;", "submitTwapOrder", "request", "", "submitScaledOrder", TtmlNode.TAG_BODY, "Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;", "fetchUserMaxLeverage", "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "isTrial", "", "cancelOrder", "cancelAllOrder", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/trade/model/CancelAllOrderParams;", "cancelAllAdvancedOrders", "submitOrder", "submitStopOrder", "Lcom/kubi/kumex/data/trade/model/SubmitStopOrderParams;", "fetchCouponDetail", "Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;", "fetchActiveOrders", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "fetchHistoryOrders", "fetchAdvancedOrders", "fetchTwapOrders", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "fetchEsAccountRiskRateChange", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "trial", "qty", FirebaseAnalytics.Param.PRICE, "orderType", "side", "(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitReversePositionOrder", "Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;", "submitModifyOrder", "createSubmitModifyOrderEntity", "Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;", "submitAlterTpslOrder", "Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;", "submitChaseOrder", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIOrderApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOrderApiDelegate.kt\ncom/kubi/futures/classic/common/order/delegate/IOrderApiDelegate\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,253:1\n504#2,7:254\n*S KotlinDebug\n*F\n+ 1 IOrderApiDelegate.kt\ncom/kubi/futures/classic/common/order/delegate/IOrderApiDelegate\n*L\n116#1:254,7\n*E\n"})
public final class C4599c implements InterfaceC44076d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f4128a = LazyKt.lazy(new Function0() { // from class: bh.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4599c.m4493x0();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f4129b = LazyKt.lazy(new Function0() { // from class: bh.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4599c.m4491V0();
        }
    });

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: d1 */
    public Object mo4501d1(boolean z11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Pair<? extends BigDecimal, ? extends BigDecimal>> continuation) {
        return null;
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: B */
    public OrderResult mo4494B(@NotNull SubmitAlterTpslOrderEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        String validationToken = entity.getValidationToken();
        return (validationToken == null || validationToken.length() == 0) ? m4495F0().m1062B(entity) : m4495F0().m1067G(entity, validationToken);
    }

    /* JADX INFO: renamed from: F0 */
    public final InterfaceC0311a m4495F0() {
        return (InterfaceC0311a) this.f4128a.getValue();
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: H0 */
    public OrderResult mo4496H0(boolean z11, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Map mutableMap = MapsKt.toMutableMap(params);
        mutableMap.remove("isFullPercent");
        String str = (String) mutableMap.remove("X-VALIDATION-TOKEN");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mutableMap.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (z11) {
            return (str == null || str.length() == 0) ? m4499T0().m1103b(linkedHashMap) : m4499T0().m1106n(linkedHashMap, str);
        }
        return (str == null || str.length() == 0) ? m4495F0().m1072b(linkedHashMap) : m4495F0().m1079n(linkedHashMap, str);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: J */
    public Object mo4497J(@NotNull CancelAllOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m4495F0().m1082t(params.getSymbol(), params.getIncludeShortCutStopOrders(), params.getFundsType());
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC0313c m4499T0() {
        return (InterfaceC0313c) this.f4129b.getValue();
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: e1 */
    public OrderResult mo4502e1(@NotNull SubmitScaledOrderBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        throw new UnsupportedOperationException("经典合约不支持分段委托");
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: f */
    public PageEntity<OrderEntity> mo4503f(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m4495F0().m1073f(params);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: g */
    public PageEntity<OrderEntity> mo4504g(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m4495F0().m1074g(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: h */
    public OrderResult mo4505h(@NotNull SubmitModifyOrderEntity createSubmitModifyOrderEntity) {
        Intrinsics.checkNotNullParameter(createSubmitModifyOrderEntity, "createSubmitModifyOrderEntity");
        String validationToken = createSubmitModifyOrderEntity.getValidationToken();
        return (validationToken == null || validationToken.length() == 0) ? m4495F0().m1075h(createSubmitModifyOrderEntity) : m4495F0().m1069J(createSubmitModifyOrderEntity, validationToken);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: i */
    public OrderResult mo4506i(@NotNull SubmitTwapModifyOrderEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        String validationToken = entity.getValidationToken();
        return (validationToken == null || validationToken.length() == 0) ? m4495F0().m1076i(entity) : m4495F0().m1065E(entity, entity.getValidationToken());
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: i1 */
    public Object mo4507i1(boolean z11, @Nullable String str, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return z11 ? m4499T0().m1101C(orderId) : m4495F0().m1063C(orderId);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: j */
    public PageEntity<OrderEntity> mo4508j(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m4495F0().m1073f(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: k */
    public OrderResult mo4509k(@NotNull SubmitReversePositionEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return m4495F0().m1077k(entity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public Object mo4510l0(boolean z11, @NotNull SubmitStopOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String validationToken = params.getValidationToken();
        if (z11) {
            return (validationToken == null || validationToken.length() == 0) ? InterfaceC0313c.m1099c(m4499T0(), params.getSymbol(), params.getPositionSide(), params.getMarginMode(), params.getUpType(), params.getUpPrice(), params.getDownType(), params.getDownPrice(), params.getOrderId(), null, 256, null) : InterfaceC0313c.m1100d(m4499T0(), params.getSymbol(), params.getPositionSide(), params.getMarginMode(), validationToken, params.getUpType(), params.getUpPrice(), params.getDownType(), params.getDownPrice(), params.getOrderId(), null, 512, null);
        }
        if (validationToken == null || validationToken.length() == 0) {
            return InterfaceC0311a.m1061L(m4495F0(), params.getSymbol(), params.getPositionSide(), params.getMarginMode(), params.getUpType(), params.getUpPrice(), params.getDownType(), params.getDownPrice(), params.getOrderId(), null, params.getStop(), 256, null);
        }
        return InterfaceC0311a.m1060H(m4495F0(), params.getSymbol(), params.getPositionSide(), params.getMarginMode(), params.getOrderId(), null, validationToken, params.getUpType(), params.getUpPrice(), params.getDownType(), params.getDownPrice(), params.getStop(), 16, null);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: m */
    public TwapDelegateHistPageEntity mo4511m(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m4495F0().m1078m(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: s */
    public Object mo4513s(@Nullable String str, @NotNull String advancedType) {
        Intrinsics.checkNotNullParameter(advancedType, "advancedType");
        return m4495F0().m1081s(str, advancedType);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: v */
    public OrderResult mo4514v(@NotNull Map<String, String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Map<String, String> map = TypeIntrinsics.isMutableMap(request) ? request : null;
        String strRemove = map != null ? map.remove("X-VALIDATION-TOKEN") : null;
        return (strRemove == null || strRemove.length() == 0) ? m4495F0().m1084v(request) : m4495F0().m1070K(request, strRemove);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: z */
    public OrderResult mo4517z(@NotNull Map<String, String> entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Map<String, String> mutableMap = MapsKt.toMutableMap(entity);
        String strRemove = mutableMap.remove("X-VALIDATION-TOKEN");
        return (strRemove == null || strRemove.length() == 0) ? m4495F0().m1087z(mutableMap) : m4495F0().m1064D(mutableMap, strRemove);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: z0 */
    public Object mo4518z0(@NotNull CancelAllOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m4495F0().m1083u(params.getSymbol(), params.getIncludeStopOrders(), params.getIncludeShortCutStopOrders(), params.getFundsType());
    }

    /* JADX INFO: renamed from: V0 */
    public static final InterfaceC0313c m4491V0() {
        return (InterfaceC0313c) C42597a.m93391g().create(InterfaceC0313c.class);
    }

    /* JADX INFO: renamed from: x0 */
    public static final InterfaceC0311a m4493x0() {
        return (InterfaceC0311a) C42597a.m93391g().create(InterfaceC0311a.class);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: L0 */
    public UserMaxLeverageEntity mo4498L0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return m4499T0().m1102a(symbol);
        }
        return m4495F0().m1071a(symbol);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: d0 */
    public CouponDetailEntity mo4500d0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m4495F0().m1085w(symbol, z11);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: r */
    public Object mo4512r(@Nullable String str) {
        return m4495F0().m1080r(str);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: y */
    public Object mo4516y(@Nullable String str, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return m4495F0().m1086y(str, status);
    }
}
