package p831zg;

import androidx.media3.extractor.text.ttml.TtmlNode;
import ch.C4976h;
import cm.CancelAllOrderParams;
import cm.SubmitStopOrderParams;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.platform.model.UserMaxLeverageEntity;
import com.kubi.kumex.data.trade.model.CouponDetailEntity;
import com.kubi.kumex.data.trade.model.CrossLeverageEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrderResult;
import com.kubi.kumex.data.trade.model.OrdersPageEntityWrapper;
import com.kubi.kumex.data.trade.model.SubmitAlterTpslOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitModifyOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitReversePositionEntity;
import com.kubi.kumex.data.trade.model.SubmitScaledOrderBody;
import com.kubi.kumex.data.trade.model.SubmitTwapModifyOrderEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.kumex.data.trade.model.TwapDelegateHistPageEntity;
import com.kubi.sdk.PageEntity;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import fm.C37568c;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import java.math.BigDecimal;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44076d;
import p595rg.InterfaceC44078f;
import p595rg.InterfaceC44081i;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sg.InterfaceC44404a;

/* JADX INFO: renamed from: zg.i */
/* JADX INFO: compiled from: MultiOrderBizInterfaceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0011\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0096\u0001J\u0011\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0096\u0001J\u001b\u0010#\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0096\u0001J#\u0010%\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010&\u001a\u00020\u001bH\u0096\u0001J\u0013\u0010'\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u001bH\u0096\u0001J%\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+H\u0096\u0001J%\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+H\u0096\u0001J\u001b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001JT\u0010/\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u0001002\u0006\u00102\u001a\u00020\u00192\b\u00103\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u0001012\u0006\u00105\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001bH\u0096A¢\u0006\u0002\u00107J%\u00108\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+H\u0096\u0001J\u000b\u00109\u001a\u0004\u0018\u00010:H\u0096\u0001J\u001f\u00109\u001a\u0004\u0018\u00010;2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+H\u0096\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\t\u0010>\u001a\u00020\u0007H\u0096\u0001J\u001b\u0010?\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u001b2\u0006\u0010@\u001a\u00020\u001bH\u0096\u0001J\u0011\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0096\u0001J\u001d\u0010E\u001a\u00020B2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+H\u0096\u0001J\u0011\u0010F\u001a\u00020B2\u0006\u0010G\u001a\u00020HH\u0096\u0001J\u0011\u0010I\u001a\u00020B2\u0006\u0010C\u001a\u00020JH\u0096\u0001J'\u0010K\u001a\u00020B2\u0006\u0010\u0018\u001a\u00020\u00192\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0+H\u0096\u0001J\u0011\u0010L\u001a\u00020B2\u0006\u0010C\u001a\u00020MH\u0096\u0001J\u0011\u0010N\u001a\u00020B2\u0006\u0010O\u001a\u00020PH\u0096\u0001J\u0019\u0010Q\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020RH\u0096\u0001J\u001f\u0010S\u001a\u00020B2\u0014\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0+H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006U"}, m90084d2 = {"Lcom/kubi/futures/classic/common/order/MultiOrderBizInterfaceImpl;", "Lcom/kubi/function/common/IOrderBizInterface;", "Lcom/kubi/function/common/IMultiOrderApi;", "api", "socketApi", "Lcom/kubi/function/common/IMultiOrderSocketApi;", "type", "Lcom/kubi/broker/MultiBizType;", "<init>", "(Lcom/kubi/function/common/IMultiOrderApi;Lcom/kubi/function/common/IMultiOrderSocketApi;Lcom/kubi/broker/MultiBizType;)V", "orderServiceImpl", "Lcom/kubi/futures/classic/common/order/service/OrderServiceImpl;", "getOrderServiceImpl", "()Lcom/kubi/futures/classic/common/order/service/OrderServiceImpl;", "orderServiceImpl$delegate", "Lkotlin/Lazy;", "crossImp", "Lcom/kubi/function/cross/ICrossBizInterface;", "getCrossImp", "()Lcom/kubi/function/cross/ICrossBizInterface;", "crossImp$delegate", "observeActiveOrders", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntityWrapper;", "isTrial", "", "symbol", "", "observeAdvanceOrders", "observeTwap", "cancelAllAdvancedOrders", "", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/trade/model/CancelAllOrderParams;", "cancelAllOrder", "cancelAllTwapOrder", "advancedType", "cancelOrder", "orderId", "cancelTwapOrder", "fetchActiveOrders", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "", "fetchAdvancedOrders", "fetchCouponDetail", "Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;", "fetchEsAccountRiskRateChange", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "trial", "qty", FirebaseAnalytics.Param.PRICE, "orderType", "side", "(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHistoryOrders", "fetchTwapOrders", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "fetchUserMaxLeverage", "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "multiBizType", "pauseOrRestartTwapOrder", "status", "submitAlterTpslOrder", "Lcom/kubi/kumex/data/trade/model/OrderResult;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;", "submitChaseOrder", "submitModifyOrder", "createSubmitModifyOrderEntity", "Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;", "submitModifyTwapOrder", "Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;", "submitOrder", "submitReversePositionOrder", "Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;", "submitScaledOrder", TtmlNode.TAG_BODY, "Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;", "submitStopOrder", "Lcom/kubi/kumex/data/trade/model/SubmitStopOrderParams;", "submitTwapOrder", "request", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiOrderBizInterfaceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiOrderBizInterfaceImpl.kt\ncom/kubi/futures/classic/common/order/MultiOrderBizInterfaceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1869#2,2:83\n1869#2,2:85\n1869#2,2:87\n*S KotlinDebug\n*F\n+ 1 MultiOrderBizInterfaceImpl.kt\ncom/kubi/futures/classic/common/order/MultiOrderBizInterfaceImpl\n*L\n38#1:83,2\n57#1:85,2\n73#1:87,2\n*E\n"})
public final class C46841i implements InterfaceC44081i, InterfaceC44076d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC44076d f104674a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC44078f f104675b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final MultiBizType f104676c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f104677d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f104678e;

    public C46841i(@NotNull InterfaceC44076d api, @NotNull InterfaceC44078f socketApi, @NotNull MultiBizType type) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(socketApi, "socketApi");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f104674a = api;
        this.f104675b = socketApi;
        this.f104676c = type;
        this.f104677d = LazyKt.lazy(new Function0() { // from class: zg.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46841i.m103178x1(this.f104669b);
            }
        });
        this.f104678e = LazyKt.lazy(new Function0() { // from class: zg.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46841i.m103171o1(this.f104670b);
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public static final InterfaceC44404a m103171o1(C46841i c46841i) {
        return MultiBizFacadeManager.f19232a.m20270i(c46841i.f104676c);
    }

    /* JADX INFO: renamed from: r1 */
    public static final OrdersPageEntityWrapper m103172r1(OrdersPageEntityWrapper orderWrapper, SymbolsCrossLeverage leverages) {
        Intrinsics.checkNotNullParameter(orderWrapper, "orderWrapper");
        Intrinsics.checkNotNullParameter(leverages, "leverages");
        for (OrderEntity orderEntity : orderWrapper.getPageEntity().getItems()) {
            if (C37568c.m84634e(orderEntity)) {
                CrossLeverageEntity crossLeverageEntity = (CrossLeverageEntity) leverages.get((Object) C27041f.m66668h(orderEntity.getSymbol()));
                orderEntity.setLeverage(crossLeverageEntity != null ? crossLeverageEntity.getLeverage() : null);
            }
        }
        return orderWrapper;
    }

    /* JADX INFO: renamed from: s1 */
    public static final OrdersPageEntityWrapper m103173s1(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (OrdersPageEntityWrapper) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: t1 */
    public static final OrdersPageEntityWrapper m103174t1(OrdersPageEntityWrapper orderWrapper, SymbolsCrossLeverage leverages) {
        Intrinsics.checkNotNullParameter(orderWrapper, "orderWrapper");
        Intrinsics.checkNotNullParameter(leverages, "leverages");
        for (OrderEntity orderEntity : orderWrapper.getPageEntity().getItems()) {
            if (C37568c.m84634e(orderEntity)) {
                CrossLeverageEntity crossLeverageEntity = (CrossLeverageEntity) leverages.get((Object) C27041f.m66668h(orderEntity.getSymbol()));
                orderEntity.setLeverage(crossLeverageEntity != null ? crossLeverageEntity.getLeverage() : null);
            }
        }
        return orderWrapper;
    }

    /* JADX INFO: renamed from: u1 */
    public static final OrdersPageEntityWrapper m103175u1(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (OrdersPageEntityWrapper) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: v1 */
    public static final OrdersPageEntityWrapper m103176v1(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (OrdersPageEntityWrapper) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: w1 */
    public static final OrdersPageEntityWrapper m103177w1(OrdersPageEntityWrapper orderWrapper, SymbolsCrossLeverage leverages) {
        Intrinsics.checkNotNullParameter(orderWrapper, "orderWrapper");
        Intrinsics.checkNotNullParameter(leverages, "leverages");
        for (OrderEntity orderEntity : orderWrapper.getPageEntity().getItems()) {
            if (C37568c.m84634e(orderEntity)) {
                CrossLeverageEntity crossLeverageEntity = (CrossLeverageEntity) leverages.get((Object) C27041f.m66668h(orderEntity.getSymbol()));
                orderEntity.setLeverage(crossLeverageEntity != null ? crossLeverageEntity.getLeverage() : null);
            }
        }
        return orderWrapper;
    }

    /* JADX INFO: renamed from: x1 */
    public static final C4976h m103178x1(C46841i c46841i) {
        return new C4976h(c46841i.f104675b);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: B */
    public OrderResult mo4494B(@NotNull SubmitAlterTpslOrderEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f104674a.mo4494B(entity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: H0 */
    public OrderResult mo4496H0(boolean z11, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f104674a.mo4496H0(z11, params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: J */
    public Object mo4497J(@NotNull CancelAllOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f104674a.mo4497J(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: L0 */
    public UserMaxLeverageEntity mo4498L0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f104674a.mo4498L0(z11, symbol);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: d0 */
    public CouponDetailEntity mo4500d0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f104674a.mo4500d0(z11, symbol);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: d1 */
    public Object mo4501d1(boolean z11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Pair<? extends BigDecimal, ? extends BigDecimal>> continuation) {
        return this.f104674a.mo4501d1(z11, bigDecimal, bigDecimal2, str, str2, str3, continuation);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: e1 */
    public OrderResult mo4502e1(@NotNull SubmitScaledOrderBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return this.f104674a.mo4502e1(body);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: f */
    public PageEntity<OrderEntity> mo4503f(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f104674a.mo4503f(params);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: g */
    public PageEntity<OrderEntity> mo4504g(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f104674a.mo4504g(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: h */
    public OrderResult mo4505h(@NotNull SubmitModifyOrderEntity createSubmitModifyOrderEntity) {
        Intrinsics.checkNotNullParameter(createSubmitModifyOrderEntity, "createSubmitModifyOrderEntity");
        return this.f104674a.mo4505h(createSubmitModifyOrderEntity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: i */
    public OrderResult mo4506i(@NotNull SubmitTwapModifyOrderEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f104674a.mo4506i(entity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: i1 */
    public Object mo4507i1(boolean z11, @Nullable String str, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return this.f104674a.mo4507i1(z11, str, orderId);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: j */
    public PageEntity<OrderEntity> mo4508j(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f104674a.mo4508j(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: k */
    public OrderResult mo4509k(@NotNull SubmitReversePositionEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f104674a.mo4509k(entity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public Object mo4510l0(boolean z11, @NotNull SubmitStopOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f104674a.mo4510l0(z11, params);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: m */
    public TwapDelegateHistPageEntity mo4511m(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f104674a.mo4511m(params);
    }

    /* JADX INFO: renamed from: p1 */
    public final InterfaceC44404a m103179p1() {
        return (InterfaceC44404a) this.f104678e.getValue();
    }

    /* JADX INFO: renamed from: q1 */
    public final C4976h m103180q1() {
        return (C4976h) this.f104677d.getValue();
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: r */
    public Object mo4512r(@Nullable String str) {
        return this.f104674a.mo4512r(str);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: s */
    public Object mo4513s(@Nullable String str, @NotNull String advancedType) {
        Intrinsics.checkNotNullParameter(advancedType, "advancedType");
        return this.f104674a.mo4513s(str, advancedType);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: v */
    public OrderResult mo4514v(@NotNull Map<String, String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f104674a.mo4514v(request);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return this.f104674a.mo4515x();
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: y */
    public Object mo4516y(@Nullable String str, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return this.f104674a.mo4516y(str, status);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: z */
    public OrderResult mo4517z(@NotNull Map<String, String> entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f104674a.mo4517z(entity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: z0 */
    public Object mo4518z0(@NotNull CancelAllOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f104674a.mo4518z0(params);
    }

    @Override // p595rg.InterfaceC44077e
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public Observable<OrdersPageEntityWrapper> mo96062F0(@Nullable String str) {
        Observable<SymbolsCrossLeverage> observableMo24472C = m103179p1().mo24472C(false);
        Observable<OrdersPageEntityWrapper> observableM5280r = m103180q1().m5280r(false, str);
        final Function2 function2 = new Function2() { // from class: zg.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C46841i.m103177w1((OrdersPageEntityWrapper) obj, (SymbolsCrossLeverage) obj2);
            }
        };
        Observable<OrdersPageEntityWrapper> observableCombineLatest = Observable.combineLatest(observableM5280r, observableMo24472C, new BiFunction() { // from class: zg.d
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C46841i.m103176v1(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    @Override // p595rg.InterfaceC44077e
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public Observable<OrdersPageEntityWrapper> mo96063a0(boolean z11, @Nullable String str) {
        Observable<SymbolsCrossLeverage> observableMo24472C = m103179p1().mo24472C(z11);
        Observable<OrdersPageEntityWrapper> observableM5279q = m103180q1().m5279q(z11, str);
        final Function2 function2 = new Function2() { // from class: zg.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C46841i.m103174t1((OrdersPageEntityWrapper) obj, (SymbolsCrossLeverage) obj2);
            }
        };
        Observable<OrdersPageEntityWrapper> observableCombineLatest = Observable.combineLatest(observableM5279q, observableMo24472C, new BiFunction() { // from class: zg.f
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C46841i.m103175u1(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    @Override // p595rg.InterfaceC44077e
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public Observable<OrdersPageEntityWrapper> mo96065x0(boolean z11, @Nullable String str) {
        Observable<SymbolsCrossLeverage> observableMo24472C = m103179p1().mo24472C(z11);
        Observable<OrdersPageEntityWrapper> observableM5278p = m103180q1().m5278p(z11, str);
        final Function2 function2 = new Function2() { // from class: zg.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C46841i.m103172r1((OrdersPageEntityWrapper) obj, (SymbolsCrossLeverage) obj2);
            }
        };
        Observable<OrdersPageEntityWrapper> observableCombineLatest = Observable.combineLatest(observableM5278p, observableMo24472C, new BiFunction() { // from class: zg.h
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C46841i.m103173s1(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }
}
