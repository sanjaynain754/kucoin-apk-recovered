package q60;

import androidx.media3.extractor.text.ttml.TtmlNode;
import cm.CancelAllOrderParams;
import cm.SubmitStopOrderParams;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.platform.model.UserMaxLeverageEntity;
import com.kubi.kumex.data.trade.model.CouponDetailEntity;
import com.kubi.kumex.data.trade.model.CrossLeverageEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrderResult;
import com.kubi.kumex.data.trade.model.OrdersPageEntity;
import com.kubi.kumex.data.trade.model.OrdersPageEntityWrapper;
import com.kubi.kumex.data.trade.model.SubmitAlterTpslOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitModifyOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitReversePositionEntity;
import com.kubi.kumex.data.trade.model.SubmitScaledOrderBody;
import com.kubi.kumex.data.trade.model.SubmitTwapModifyOrderEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.kumex.data.trade.model.TwapDelegateHistPageEntity;
import com.kubi.router.core.Router;
import com.kubi.sdk.PageEntity;
import com.kubi.unify.unify.common.order.delegate.IOrderApiDelegate;
import com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559qg.InterfaceC43729a;
import p595rg.InterfaceC44076d;
import p595rg.InterfaceC44081i;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sg.InterfaceC44404a;

/* JADX INFO: renamed from: q60.m */
/* JADX INFO: compiled from: UnifyOrderBizInterfaceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096\u0001J\u0011\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096\u0001J\u001b\u0010\u001f\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u0017H\u0096\u0001J#\u0010!\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0096\u0001J\u0013\u0010#\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0096\u0001J%\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170'H\u0096\u0001J%\u0010(\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170'H\u0096\u0001J\u001b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001JT\u0010+\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010,2\u0006\u0010.\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010-2\u0006\u00101\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0017H\u0096A¢\u0006\u0002\u00103J%\u00104\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170'H\u0096\u0001J\u000b\u00105\u001a\u0004\u0018\u000106H\u0096\u0001J\u001f\u00105\u001a\u0004\u0018\u0001072\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170'H\u0096\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\t\u0010:\u001a\u00020;H\u0096\u0001J\u001b\u0010<\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010=\u001a\u00020\u0017H\u0096\u0001J\u0011\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0096\u0001J\u001d\u0010B\u001a\u00020?2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170'H\u0096\u0001J\u0011\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020EH\u0096\u0001J\u0011\u0010F\u001a\u00020?2\u0006\u0010@\u001a\u00020GH\u0096\u0001J'\u0010H\u001a\u00020?2\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00170'H\u0096\u0001J\u0011\u0010I\u001a\u00020?2\u0006\u0010@\u001a\u00020JH\u0096\u0001J\u0011\u0010K\u001a\u00020?2\u0006\u0010L\u001a\u00020MH\u0096\u0001J\u0019\u0010N\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020OH\u0096\u0001J\u001f\u0010P\u001a\u00020?2\u0014\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00170'H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006R"}, m90084d2 = {"Lcom/kubi/unify/unify/common/order/UnifyOrderBizInterfaceImpl;", "Lcom/kubi/function/common/IOrderBizInterface;", "Lcom/kubi/function/common/IMultiOrderApi;", "api", "<init>", "(Lcom/kubi/function/common/IMultiOrderApi;)V", "socketApi", "Lcom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate;", "getSocketApi", "()Lcom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate;", "socketApi$delegate", "Lkotlin/Lazy;", "crossImp", "Lcom/kubi/function/cross/ICrossBizInterface;", "getCrossImp", "()Lcom/kubi/function/cross/ICrossBizInterface;", "crossImp$delegate", "observeActiveOrders", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntityWrapper;", "isTrial", "", "symbol", "", "observeAdvanceOrders", "observeTwap", "cancelAllAdvancedOrders", "", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/trade/model/CancelAllOrderParams;", "cancelAllOrder", "cancelAllTwapOrder", "advancedType", "cancelOrder", "orderId", "cancelTwapOrder", "fetchActiveOrders", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "", "fetchAdvancedOrders", "fetchCouponDetail", "Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;", "fetchEsAccountRiskRateChange", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "trial", "qty", FirebaseAnalytics.Param.PRICE, "orderType", "side", "(ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHistoryOrders", "fetchTwapOrders", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "fetchUserMaxLeverage", "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "pauseOrRestartTwapOrder", "status", "submitAlterTpslOrder", "Lcom/kubi/kumex/data/trade/model/OrderResult;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;", "submitChaseOrder", "submitModifyOrder", "createSubmitModifyOrderEntity", "Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;", "submitModifyTwapOrder", "Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;", "submitOrder", "submitReversePositionOrder", "Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;", "submitScaledOrder", TtmlNode.TAG_BODY, "Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;", "submitStopOrder", "Lcom/kubi/kumex/data/trade/model/SubmitStopOrderParams;", "submitTwapOrder", "request", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyOrderBizInterfaceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyOrderBizInterfaceImpl.kt\ncom/kubi/unify/unify/common/order/UnifyOrderBizInterfaceImpl\n+ 2 MultiBizUtils.kt\ncom/kubi/broker/MultiBizUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n11#2,6:86\n17#2,5:94\n295#3,2:92\n1869#3,2:99\n1869#3,2:101\n*S KotlinDebug\n*F\n+ 1 UnifyOrderBizInterfaceImpl.kt\ncom/kubi/unify/unify/common/order/UnifyOrderBizInterfaceImpl\n*L\n31#1:86,6\n31#1:94,5\n31#1:92,2\n43#1:99,2\n67#1:101,2\n*E\n"})
public final class C43650m implements InterfaceC44081i, InterfaceC44076d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC44076d f96323a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f96324b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f96325c;

    /* JADX WARN: Multi-variable type inference failed */
    public C43650m() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C43650m(@NotNull InterfaceC44076d api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f96323a = api;
        this.f96324b = LazyKt.lazy(new Function0() { // from class: q60.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43650m.m96042F1();
            }
        });
        this.f96325c = LazyKt.lazy(new Function0() { // from class: q60.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43650m.m96055s1();
            }
        });
    }

    /* JADX INFO: renamed from: A1 */
    public static final OrdersPageEntityWrapper m96037A1(OrdersPageEntityWrapper orderWrapper, SymbolsCrossLeverage leverages) {
        Intrinsics.checkNotNullParameter(orderWrapper, "orderWrapper");
        Intrinsics.checkNotNullParameter(leverages, "leverages");
        for (OrderEntity orderEntity : orderWrapper.getPageEntity().getItems()) {
            CrossLeverageEntity crossLeverageEntity = (CrossLeverageEntity) leverages.get((Object) C27041f.m66668h(orderEntity.getSymbol()));
            orderEntity.setLeverage(crossLeverageEntity != null ? crossLeverageEntity.getLeverage() : null);
        }
        return orderWrapper;
    }

    /* JADX INFO: renamed from: B1 */
    public static final OrdersPageEntityWrapper m96038B1(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (OrdersPageEntityWrapper) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: C1 */
    public static final Observable m96039C1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Observable.just(new OrdersPageEntityWrapper(new OrdersPageEntity(null, 0L, 3, null), it));
    }

    /* JADX INFO: renamed from: D1 */
    public static final OrdersPageEntityWrapper m96040D1(OrdersPageEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new OrdersPageEntityWrapper(it, null);
    }

    /* JADX INFO: renamed from: E1 */
    public static final OrdersPageEntityWrapper m96041E1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (OrdersPageEntityWrapper) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: F1 */
    public static final IOrderSocketApiDelegate m96042F1() {
        return new IOrderSocketApiDelegate();
    }

    /* JADX INFO: renamed from: s1 */
    public static final InterfaceC44404a m96055s1() {
        Object obj;
        Object next;
        MultiBizType multiBizType = MultiBizType.UNIFIED;
        MultiBizType multiBizType2 = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(InterfaceC44404a.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC43729a) next).mo4515x() != multiBizType);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType2 != MultiBizType.UN_KNOW) {
            for (Object obj2 : listM56190l) {
                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType2) {
                    obj = obj2;
                    break;
                }
            }
            interfaceC43729a = (InterfaceC43729a) obj;
        }
        return (InterfaceC44404a) interfaceC43729a;
    }

    /* JADX INFO: renamed from: t1 */
    private final InterfaceC44404a m96056t1() {
        return (InterfaceC44404a) this.f96325c.getValue();
    }

    /* JADX INFO: renamed from: v1 */
    public static final OrdersPageEntityWrapper m96057v1(OrdersPageEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new OrdersPageEntityWrapper(it, null);
    }

    /* JADX INFO: renamed from: w1 */
    public static final OrdersPageEntityWrapper m96058w1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (OrdersPageEntityWrapper) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: x1 */
    public static final OrdersPageEntityWrapper m96059x1(OrdersPageEntityWrapper orderWrapper, SymbolsCrossLeverage leverages) {
        Intrinsics.checkNotNullParameter(orderWrapper, "orderWrapper");
        Intrinsics.checkNotNullParameter(leverages, "leverages");
        for (OrderEntity orderEntity : orderWrapper.getPageEntity().getItems()) {
            CrossLeverageEntity crossLeverageEntity = (CrossLeverageEntity) leverages.get((Object) C27041f.m66668h(orderEntity.getSymbol()));
            orderEntity.setLeverage(crossLeverageEntity != null ? crossLeverageEntity.getLeverage() : null);
        }
        return orderWrapper;
    }

    /* JADX INFO: renamed from: y1 */
    public static final OrdersPageEntityWrapper m96060y1(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (OrdersPageEntityWrapper) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: z1 */
    public static final Observable m96061z1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Observable.just(new OrdersPageEntityWrapper(new OrdersPageEntity(null, 0L, 3, null), it));
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: B */
    public OrderResult mo4494B(@NotNull SubmitAlterTpslOrderEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f96323a.mo4494B(entity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: H0 */
    public OrderResult mo4496H0(boolean z11, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f96323a.mo4496H0(z11, params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: J */
    public Object mo4497J(@NotNull CancelAllOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f96323a.mo4497J(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: L0 */
    public UserMaxLeverageEntity mo4498L0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f96323a.mo4498L0(z11, symbol);
    }

    @Override // p595rg.InterfaceC44077e
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public Observable<OrdersPageEntityWrapper> mo96063a0(boolean z11, @Nullable String str) throws Throwable {
        Observable<SymbolsCrossLeverage> observableJust;
        if (z11) {
            Observable<OrdersPageEntityWrapper> observableJust2 = Observable.just(new OrdersPageEntityWrapper(new OrdersPageEntity(null, 0L, 3, null), null));
            Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
            return observableJust2;
        }
        InterfaceC44404a interfaceC44404aM96056t1 = m96056t1();
        if (interfaceC44404aM96056t1 == null || (observableJust = interfaceC44404aM96056t1.mo24472C(z11)) == null) {
            observableJust = Observable.just(new SymbolsCrossLeverage());
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        }
        Observable<OrdersPageEntity> observableM65424l = m96064u1().m65424l(str);
        final Function1 function1 = new Function1() { // from class: q60.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43650m.m96040D1((OrdersPageEntity) obj);
            }
        };
        ObservableSource map = observableM65424l.map(new Function() { // from class: q60.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C43650m.m96041E1(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: q60.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C43650m.m96037A1((OrdersPageEntityWrapper) obj, (SymbolsCrossLeverage) obj2);
            }
        };
        Observable<OrdersPageEntityWrapper> observableOnErrorResumeNext = Observable.combineLatest(map, observableJust, new BiFunction() { // from class: q60.h
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C43650m.m96038B1(function2, obj, obj2);
            }
        }).onErrorResumeNext(new Function() { // from class: q60.i
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C43650m.m96039C1((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: d0 */
    public CouponDetailEntity mo4500d0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f96323a.mo4500d0(z11, symbol);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: d1 */
    public Object mo4501d1(boolean z11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Pair<? extends BigDecimal, ? extends BigDecimal>> continuation) {
        return this.f96323a.mo4501d1(z11, bigDecimal, bigDecimal2, str, str2, str3, continuation);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: e1 */
    public OrderResult mo4502e1(@NotNull SubmitScaledOrderBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return this.f96323a.mo4502e1(body);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: f */
    public PageEntity<OrderEntity> mo4503f(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f96323a.mo4503f(params);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: g */
    public PageEntity<OrderEntity> mo4504g(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f96323a.mo4504g(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: h */
    public OrderResult mo4505h(@NotNull SubmitModifyOrderEntity createSubmitModifyOrderEntity) {
        Intrinsics.checkNotNullParameter(createSubmitModifyOrderEntity, "createSubmitModifyOrderEntity");
        return this.f96323a.mo4505h(createSubmitModifyOrderEntity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: i */
    public OrderResult mo4506i(@NotNull SubmitTwapModifyOrderEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f96323a.mo4506i(entity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: i1 */
    public Object mo4507i1(boolean z11, @Nullable String str, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return this.f96323a.mo4507i1(z11, str, orderId);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: j */
    public PageEntity<OrderEntity> mo4508j(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f96323a.mo4508j(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: k */
    public OrderResult mo4509k(@NotNull SubmitReversePositionEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f96323a.mo4509k(entity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public Object mo4510l0(boolean z11, @NotNull SubmitStopOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f96323a.mo4510l0(z11, params);
    }

    @Override // p595rg.InterfaceC44076d
    @Nullable
    /* JADX INFO: renamed from: m */
    public TwapDelegateHistPageEntity mo4511m(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f96323a.mo4511m(params);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: r */
    public Object mo4512r(@Nullable String str) {
        return this.f96323a.mo4512r(str);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: s */
    public Object mo4513s(@Nullable String str, @NotNull String advancedType) {
        Intrinsics.checkNotNullParameter(advancedType, "advancedType");
        return this.f96323a.mo4513s(str, advancedType);
    }

    /* JADX INFO: renamed from: u1 */
    public final IOrderSocketApiDelegate m96064u1() {
        return (IOrderSocketApiDelegate) this.f96324b.getValue();
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: v */
    public OrderResult mo4514v(@NotNull Map<String, String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f96323a.mo4514v(request);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return this.f96323a.mo4515x();
    }

    @Override // p595rg.InterfaceC44077e
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public Observable<OrdersPageEntityWrapper> mo96065x0(boolean z11, @Nullable String str) throws Throwable {
        Observable<SymbolsCrossLeverage> observableJust;
        if (z11) {
            Observable<OrdersPageEntityWrapper> observableJust2 = Observable.just(new OrdersPageEntityWrapper(new OrdersPageEntity(null, 0L, 3, null), null));
            Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
            return observableJust2;
        }
        InterfaceC44404a interfaceC44404aM96056t1 = m96056t1();
        if (interfaceC44404aM96056t1 == null || (observableJust = interfaceC44404aM96056t1.mo24472C(z11)) == null) {
            observableJust = Observable.just(new SymbolsCrossLeverage());
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        }
        Observable<OrdersPageEntity> observableM65423k = m96064u1().m65423k(str);
        final Function1 function1 = new Function1() { // from class: q60.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43650m.m96057v1((OrdersPageEntity) obj);
            }
        };
        ObservableSource map = observableM65423k.map(new Function() { // from class: q60.k
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C43650m.m96058w1(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: q60.l
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C43650m.m96059x1((OrdersPageEntityWrapper) obj, (SymbolsCrossLeverage) obj2);
            }
        };
        Observable<OrdersPageEntityWrapper> observableOnErrorResumeNext = Observable.combineLatest(map, observableJust, new BiFunction() { // from class: q60.b
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C43650m.m96060y1(function2, obj, obj2);
            }
        }).onErrorResumeNext(new Function() { // from class: q60.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C43650m.m96061z1((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: y */
    public Object mo4516y(@Nullable String str, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return this.f96323a.mo4516y(str, status);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: z */
    public OrderResult mo4517z(@NotNull Map<String, String> entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f96323a.mo4517z(entity);
    }

    @Override // p595rg.InterfaceC44076d
    @NotNull
    /* JADX INFO: renamed from: z0 */
    public Object mo4518z0(@NotNull CancelAllOrderParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f96323a.mo4518z0(params);
    }

    @Override // p595rg.InterfaceC44077e
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public Observable<OrdersPageEntityWrapper> mo96062F0(@Nullable String str) {
        Observable<OrdersPageEntityWrapper> observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    public /* synthetic */ C43650m(InterfaceC44076d interfaceC44076d, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new IOrderApiDelegate() : interfaceC44076d);
    }
}
