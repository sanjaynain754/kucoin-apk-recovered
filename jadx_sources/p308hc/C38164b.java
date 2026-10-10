package p308hc;

import androidx.media3.extractor.text.ttml.TtmlNode;
import cm.CancelAllOrderParams;
import cm.SubmitStopOrderParams;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
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
import p288gc.InterfaceC37862c;
import p595rg.InterfaceC44076d;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NotImplementedError;
import p852kotlin.Pair;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: hc.b */
/* JADX INFO: compiled from: IOrderApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\"\u0010$\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0016J&\u0010)\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001cH\u0016J\u0018\u0010*\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020+H\u0016J\u001a\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J$\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001cH\u0016J$\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001cH\u0016J$\u00102\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001cH\u0016J\u001e\u00103\u001a\u0004\u0018\u0001042\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001cH\u0016JT\u00105\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u0001062\u0006\u00108\u001a\u00020#2\b\u00109\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u0001072\u0006\u0010;\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020DH\u0016J\u001c\u0010E\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001cH\u0016J\n\u00103\u001a\u0004\u0018\u00010FH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006G"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/order/delegate/IOrderApiDelegate;", "Lcom/kubi/function/common/IMultiOrderApi;", "<init>", "()V", "api", "Lcom/kubi/copytrading/copytd/common/order/api/IOrderApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/copytrading/copytd/common/order/api/IOrderApi;", "api$delegate", "Lkotlin/Lazy;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "pauseOrRestartTwapOrder", "", "orderId", "", "status", "cancelTwapOrder", "cancelAllTwapOrder", "symbol", "advancedType", "submitModifyTwapOrder", "Lcom/kubi/kumex/data/trade/model/OrderResult;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;", "submitTwapOrder", "request", "", "submitScaledOrder", TtmlNode.TAG_BODY, "Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;", "fetchUserMaxLeverage", "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "isTrial", "", "cancelOrder", "cancelAllOrder", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/trade/model/CancelAllOrderParams;", "cancelAllAdvancedOrders", "submitOrder", "submitStopOrder", "Lcom/kubi/kumex/data/trade/model/SubmitStopOrderParams;", "fetchCouponDetail", "Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;", "fetchActiveOrders", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "fetchHistoryOrders", "fetchAdvancedOrders", "fetchTwapOrders", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "fetchEsAccountRiskRateChange", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "trial", "qty", FirebaseAnalytics.Param.PRICE, "orderType", "side", "(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitReversePositionOrder", "Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;", "submitModifyOrder", "createSubmitModifyOrderEntity", "Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;", "submitAlterTpslOrder", "Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;", "submitChaseOrder", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIOrderApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOrderApiDelegate.kt\ncom/kubi/copytrading/copytd/common/order/delegate/IOrderApiDelegate\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,208:1\n504#2,7:209\n*S KotlinDebug\n*F\n+ 1 IOrderApiDelegate.kt\ncom/kubi/copytrading/copytd/common/order/delegate/IOrderApiDelegate\n*L\n102#1:209,7\n*E\n"})
public final class C38164b implements InterfaceC44076d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f85861a = LazyKt.lazy(new Function0() { // from class: hc.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C38164b.m86116a0();
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
        return new OrderResult(null, null, 3, null);
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
        if (!z11) {
            return (str == null || str.length() == 0) ? m86117x0().m85450b(linkedHashMap) : InterfaceC37862c.m85445c(m86117x0(), linkedHashMap, str, null, 4, null);
        }
        InterfaceC37862c interfaceC37862cM86117x0 = m86117x0();
        if (str == null) {
            str = "";
        }
        return InterfaceC37862c.m85446k(interfaceC37862cM86117x0, linkedHashMap, str, null, 4, null);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: J */
    public Object mo4497J(@NotNull CancelAllOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m86117x0().m85460t(params.getSymbol(), params.getIncludeShortCutStopOrders(), params.getFundsType());
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: e1 */
    public OrderResult mo4502e1(@NotNull SubmitScaledOrderBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        throw new NotImplementedError("跟单不支持分段委托");
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: f */
    public PageEntity<OrderEntity> mo4503f(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m86117x0().m85453f(params);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: g */
    public PageEntity<OrderEntity> mo4504g(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m86117x0().m85454g(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: h */
    public OrderResult mo4505h(@NotNull SubmitModifyOrderEntity createSubmitModifyOrderEntity) {
        Intrinsics.checkNotNullParameter(createSubmitModifyOrderEntity, "createSubmitModifyOrderEntity");
        return new OrderResult(null, null, 3, null);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: i */
    public OrderResult mo4506i(@NotNull SubmitTwapModifyOrderEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        throw new NotImplementedError("跟单不支持twap");
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: i1 */
    public Object mo4507i1(boolean z11, @Nullable String str, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return m86117x0().m85459m(orderId, z11 ? FuturesWelfareTrialItemEntity.LEAD_TRIAL_FUND_TYPE : "selfFunds");
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: j */
    public PageEntity<OrderEntity> mo4508j(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return m86117x0().m85453f(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: k */
    public OrderResult mo4509k(@NotNull SubmitReversePositionEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new OrderResult(null, null, 3, null);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public Object mo4510l0(boolean z11, @NotNull SubmitStopOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String validationToken = params.getValidationToken();
        if (!z11) {
            return (validationToken == null || validationToken.length() == 0) ? m86117x0().m85451d(params.getSymbol(), params.getPositionSide(), params.getMarginMode(), params.getUpType(), params.getUpPrice(), params.getDownType(), params.getDownPrice()) : InterfaceC37862c.m85448o(m86117x0(), params.getSymbol(), params.getPositionSide(), params.getMarginMode(), params.getUpType(), params.getUpPrice(), params.getDownType(), params.getDownPrice(), validationToken, null, 256, null);
        }
        InterfaceC37862c interfaceC37862cM86117x0 = m86117x0();
        String symbol = params.getSymbol();
        String positionSide = params.getPositionSide();
        String marginMode = params.getMarginMode();
        String upType = params.getUpType();
        BigDecimal upPrice = params.getUpPrice();
        String downType = params.getDownType();
        BigDecimal downPrice = params.getDownPrice();
        if (validationToken == null) {
            validationToken = "";
        }
        return InterfaceC37862c.m85447n(interfaceC37862cM86117x0, symbol, positionSide, marginMode, upType, upPrice, downType, downPrice, validationToken, null, 256, null);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: m */
    public TwapDelegateHistPageEntity mo4511m(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return null;
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: r */
    public Object mo4512r(@Nullable String str) {
        throw new NotImplementedError("跟单不支持twap");
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: s */
    public Object mo4513s(@Nullable String str, @NotNull String advancedType) {
        Intrinsics.checkNotNullParameter(advancedType, "advancedType");
        throw new NotImplementedError("跟单不支持twap");
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: v */
    public OrderResult mo4514v(@NotNull Map<String, String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        throw new NotImplementedError("跟单不支持twap");
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.COPY_TRADING;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC37862c m86117x0() {
        return (InterfaceC37862c) this.f85861a.getValue();
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
        return m86117x0().m85461u(params.getSymbol(), params.getIncludeStopOrders(), params.getIncludeShortCutStopOrders(), params.getFundsType());
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC37862c m86116a0() {
        return (InterfaceC37862c) C42597a.m93391g().create(InterfaceC37862c.class);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: L0 */
    public UserMaxLeverageEntity mo4498L0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return m86117x0().m85456i(symbol);
        }
        return m86117x0().m85449a(symbol);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: d0 */
    public CouponDetailEntity mo4500d0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return null;
        }
        return m86117x0().m85462w(symbol, z11);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: y */
    public Object mo4516y(@Nullable String str, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new NotImplementedError("跟单不支持twap");
    }
}
