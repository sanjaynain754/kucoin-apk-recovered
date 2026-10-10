package com.kubi.futures.classic.cross;

import bm.C4634g;
import ci.InterfaceC4984e;
import cm.C5003h;
import cm.FuturesStreamsData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.AllContractLeverageUpdateRequest;
import com.kubi.kumex.data.platform.model.GrayCrossModeEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.data.platform.model.SubmitCrossLeverageEntity;
import com.kubi.kumex.data.trade.model.ComposeUserEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMarginEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.PositionOrderHoldMarginEntity;
import com.kubi.kumex.data.trade.model.QuoteEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.kumex.utils.Log;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.rx2.RxConvertKt;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p342ih.C38604s0;
import p342ih.C38609v;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sg.InterfaceC44404a;
import sg.InterfaceC44405b;
import sg.InterfaceC44407d;
import y70.C46392a;

/* JADX INFO: compiled from: CrossBizInterfaceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0019\u0010.\u001a\u00020/2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0016H\u0096\u0001J\u001b\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010\u001e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0019\u00103\u001a\u0002042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u0016H\u0096\u0001J'\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u0016H\u0096\u0001J\u0018\u00107\u001a\u0004\u0018\u0001082\u0006\u00105\u001a\u00020\u0016H\u0096A¢\u0006\u0002\u00109J\t\u0010:\u001a\u00020\u0004H\u0096\u0001J\u0011\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020=H\u0096\u0001J\u0019\u0010>\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010<\u001a\u00020?H\u0096\u0001J%\u0010@\u001a\u00020A2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u000f\u001a\u0004\b*\u0010+¨\u0006C"}, m90084d2 = {"Lcom/kubi/futures/classic/cross/CrossBizInterfaceImpl;", "Lcom/kubi/function/cross/ICrossBizInterface;", "Lcom/kubi/function/cross/IMultiCrossApi;", "type", "Lcom/kubi/broker/MultiBizType;", "api", "socketApi", "Lcom/kubi/function/cross/IMultiSocketCrossApi;", "<init>", "(Lcom/kubi/broker/MultiBizType;Lcom/kubi/function/cross/IMultiCrossApi;Lcom/kubi/function/cross/IMultiSocketCrossApi;)V", "selfCrossStreamManager", "Lcom/kubi/futures/classic/cross/service/ClassicCrossStreamManager;", "getSelfCrossStreamManager", "()Lcom/kubi/futures/classic/cross/service/ClassicCrossStreamManager;", "selfCrossStreamManager$delegate", "Lkotlin/Lazy;", "trialCrossStreamManager", "getTrialCrossStreamManager", "trialCrossStreamManager$delegate", "observeMarginMode", "Lio/reactivex/Observable;", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "isTrial", "", "observeOccupiedBalance", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "observePositions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "observeOccupancyAccount", "observeCrossLeverage", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "observeStreamOnError", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "observeStreamKeyData", "Lcom/kubi/kumex/data/trade/model/FuturesStreamsData;", "crossAssetsServiceImpl", "Lcom/kubi/futures/classic/cross/service/CrossAssetsServiceImpl;", "getCrossAssetsServiceImpl", "()Lcom/kubi/futures/classic/cross/service/CrossAssetsServiceImpl;", "crossAssetsServiceImpl$delegate", "observeOccupancyBalance", "fetchActiveOrderStatistics", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;", "symbols", "fetchAllContractsMarginMode", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "fetchCrossModeGray", "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "symbol", "fetchMarginMode", "fetchPosOrderMargin", "Lcom/kubi/kumex/data/trade/model/PositionOrderHoldMarginEntity;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "multiBizType", "submitAllContractsLeverage", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/AllContractLeverageUpdateRequest;", "submitCrossLeverage", "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;", "submitMarginMode", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "map", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCrossBizInterfaceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossBizInterfaceImpl.kt\ncom/kubi/futures/classic/cross/CrossBizInterfaceImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n49#2:208\n51#2:212\n49#2:213\n51#2:217\n49#2:218\n51#2:222\n46#3:209\n51#3:211\n46#3:214\n51#3:216\n46#3:219\n51#3:221\n105#4:210\n105#4:215\n105#4:220\n189#5:223\n189#5:224\n135#6,2:225\n1#7:227\n*S KotlinDebug\n*F\n+ 1 CrossBizInterfaceImpl.kt\ncom/kubi/futures/classic/cross/CrossBizInterfaceImpl\n*L\n83#1:208\n83#1:212\n88#1:213\n88#1:217\n97#1:218\n97#1:222\n83#1:209\n83#1:211\n88#1:214\n88#1:216\n97#1:219\n97#1:221\n83#1:210\n88#1:215\n97#1:220\n154#1:223\n178#1:224\n111#1:225,2\n*E\n"})
public final class CrossBizInterfaceImpl implements InterfaceC44404a, InterfaceC44405b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MultiBizType f22527a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC44405b f22528b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC44407d f22529c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f22530d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f22531e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f22532f;

    public CrossBizInterfaceImpl(@NotNull MultiBizType type, @NotNull InterfaceC44405b api, @NotNull InterfaceC44407d socketApi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(socketApi, "socketApi");
        this.f22527a = type;
        this.f22528b = api;
        this.f22529c = socketApi;
        this.f22530d = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.classic.cross.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossBizInterfaceImpl.m24450F1(this.f22549b);
            }
        });
        this.f22531e = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.classic.cross.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossBizInterfaceImpl.m24451G1(this.f22552b);
            }
        });
        this.f22532f = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.classic.cross.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossBizInterfaceImpl.m24464q1(this.f22553b);
            }
        });
    }

    /* JADX INFO: renamed from: A1 */
    public static final Map m24444A1(Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MapsKt.toMutableMap(it);
    }

    /* JADX INFO: renamed from: B1 */
    public static final Map m24445B1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Map) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: C1 */
    public static final Boolean m24446C1(boolean z11, CrossBizInterfaceImpl crossBizInterfaceImpl) {
        Object objM103844constructorimpl;
        boolean zBooleanValue;
        if (C46392a.m102322d(z11 ? C46894j.f104736a.m103257V() : C46894j.f104736a.m103244I(), false)) {
            zBooleanValue = true;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(MultiBizFacadeManager.f19232a.m20268g(crossBizInterfaceImpl.f22527a, z11, C4634g.m4564a()).getOccupancyMode()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                objM103844constructorimpl = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) objM103844constructorimpl).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: D1 */
    public static final Boolean m24447D1(Boolean netWorkValue, Boolean flowValue) {
        Intrinsics.checkNotNullParameter(netWorkValue, "netWorkValue");
        Intrinsics.checkNotNullParameter(flowValue, "flowValue");
        return Boolean.valueOf(netWorkValue.booleanValue() || flowValue.booleanValue());
    }

    /* JADX INFO: renamed from: E1 */
    public static final Boolean m24448E1(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (Boolean) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: F1 */
    public static final C38609v m24450F1(CrossBizInterfaceImpl crossBizInterfaceImpl) {
        return new C38609v(crossBizInterfaceImpl.f22527a, false, crossBizInterfaceImpl);
    }

    /* JADX INFO: renamed from: G1 */
    public static final C38609v m24451G1(CrossBizInterfaceImpl crossBizInterfaceImpl) {
        return new C38609v(crossBizInterfaceImpl.f22527a, true, crossBizInterfaceImpl);
    }

    /* JADX INFO: renamed from: q1 */
    public static final C38604s0 m24464q1(CrossBizInterfaceImpl crossBizInterfaceImpl) {
        return new C38604s0(crossBizInterfaceImpl.f22528b);
    }

    /* JADX INFO: renamed from: u1 */
    public static final ObservableSource m24465u1(CrossBizInterfaceImpl crossBizInterfaceImpl, boolean z11, Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.booleanValue()) {
            return crossBizInterfaceImpl.f22529c.mo86196C(z11);
        }
        Observable observableJust = Observable.just(new SymbolsCrossLeverage());
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* JADX INFO: renamed from: v1 */
    public static final ObservableSource m24466v1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: w1 */
    public static final SymbolsCrossLeverage m24467w1(SymbolsCrossLeverage t11, SymbolsCrossLeverage t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        if (t12.size() >= t11.size()) {
            return t12;
        }
        t11.putAll(t12);
        return t11;
    }

    /* JADX INFO: renamed from: x1 */
    public static final SymbolsCrossLeverage m24469x1(SymbolsCrossLeverage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C5003h.m5398b(it);
    }

    /* JADX INFO: renamed from: y1 */
    public static final SymbolsCrossLeverage m24470y1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (SymbolsCrossLeverage) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: z1 */
    public static final Map m24471z1(Map t11, Map t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        if (t12.size() >= t11.size()) {
            return t12;
        }
        t11.putAll(t12);
        return t11;
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: C */
    public Observable<SymbolsCrossLeverage> mo24472C(final boolean z11) {
        Observable<Boolean> observableMo24487q0 = MultiBizFacadeManager.m20256j(MultiBizFacadeManager.f19232a, null, 1, null).mo24487q0(z11);
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.classic.cross.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossBizInterfaceImpl.m24465u1(this.f22558b, z11, (Boolean) obj);
            }
        };
        Observable observableScan = observableMo24487q0.flatMap(new Function() { // from class: com.kubi.futures.classic.cross.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CrossBizInterfaceImpl.m24466v1(function1, obj);
            }
        }).distinctUntilChanged().scan(new BiFunction() { // from class: com.kubi.futures.classic.cross.c
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CrossBizInterfaceImpl.m24467w1((SymbolsCrossLeverage) obj, (SymbolsCrossLeverage) obj2);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.classic.cross.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossBizInterfaceImpl.m24469x1((SymbolsCrossLeverage) obj);
            }
        };
        Observable<SymbolsCrossLeverage> map = observableScan.map(new Function() { // from class: com.kubi.futures.classic.cross.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CrossBizInterfaceImpl.m24470y1(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // sg.InterfaceC44405b
    /* JADX INFO: renamed from: D */
    public boolean mo24473D(@NotNull AllContractLeverageUpdateRequest entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f22528b.mo24473D(entity);
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: E */
    public Observable<Map<String, MarginModeInfoEntity>> mo24474E(boolean z11) {
        Observable<Map<String, MarginModeInfoEntity>> observableScan = this.f22529c.mo86197E(z11).scan(new BiFunction() { // from class: com.kubi.futures.classic.cross.k
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CrossBizInterfaceImpl.m24471z1((Map) obj, (Map) obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.classic.cross.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossBizInterfaceImpl.m24444A1((Map) obj);
            }
        };
        Observable map = observableScan.map(new Function() { // from class: com.kubi.futures.classic.cross.m
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CrossBizInterfaceImpl.m24445B1(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: G */
    public Observable<List<PositionEntity>> mo24475G(boolean z11) {
        C38609v c38609vM24490t1 = z11 ? m24490t1() : m24489s1();
        final InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(c38609vM24490t1.m87314D());
        return RxConvertKt.m91207d(C41636g.m90895S(C41636g.m90897U(new InterfaceC41634e<List<? extends PositionEntity>>() { // from class: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observePositions$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observePositions$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CrossBizInterfaceImpl.kt\ncom/kubi/futures/classic/cross/CrossBizInterfaceImpl\n*L\n1#1,49:1\n50#2:50\n97#3:51\n*E\n"})
            public static final class C128292<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f22544b;

                /* JADX INFO: renamed from: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observePositions$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observePositions$$inlined$map$1$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C128292.this.emit(null, this);
                    }
                }

                public C128292(InterfaceC41635f interfaceC41635f) {
                    this.f22544b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f22544b;
                        List<PositionEntity> listM5406a = ((ComposeUserEntity) obj).getPositionWrapper().m5406a();
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(listM5406a, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super List<? extends PositionEntity>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new C128292(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new CrossBizInterfaceImpl$observePositions$2(c38609vM24490t1, null)), new CrossBizInterfaceImpl$observePositions$3(c38609vM24490t1, null)), null, 1, null);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: I0 */
    public GrayCrossModeEntity mo24476I0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f22528b.mo24476I0(z11, symbol);
    }

    @Override // sg.InterfaceC44405b
    @Nullable
    /* JADX INFO: renamed from: L */
    public Object mo24477L(@NotNull String str, @NotNull Continuation<? super PositionOrderHoldMarginEntity> continuation) {
        return this.f22528b.mo24477L(str, continuation);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public CrossHedgeQtyMarginEntity mo24478M0(boolean z11, @NotNull String symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        return this.f22528b.mo24478M0(z11, symbols);
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public InterfaceC41634e<FuturesStreamsData> mo24479P0(boolean z11) {
        C38609v c38609vM24490t1 = z11 ? m24490t1() : m24489s1();
        return C41636g.m90895S(C41636g.m90897U(C41636g.m90881E(C41636g.m90930n0(RxConvertKt.m91205b(mo24487q0(z11)), new C12830x8cf9c673(null, c38609vM24490t1))), new CrossBizInterfaceImpl$observeStreamKeyData$2(c38609vM24490t1, null)), new CrossBizInterfaceImpl$observeStreamKeyData$3(c38609vM24490t1, null));
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: X */
    public InterfaceC41634e<InterfaceC4984e> mo24480X(boolean z11) {
        C38609v c38609vM24490t1 = z11 ? m24490t1() : m24489s1();
        return C41636g.m90895S(C41636g.m90897U(C41636g.m90881E(C41636g.m90930n0(RxConvertKt.m91205b(mo24487q0(z11)), new C12832xb1ecb1b3(null, c38609vM24490t1))), new CrossBizInterfaceImpl$observeStreamOnError$2(c38609vM24490t1, null)), new CrossBizInterfaceImpl$observeStreamOnError$3(c38609vM24490t1, null));
    }

    @Override // sg.InterfaceC44405b
    /* JADX INFO: renamed from: f0 */
    public boolean mo24481f0(boolean z11, @NotNull SubmitCrossLeverageEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f22528b.mo24481f0(z11, entity);
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: f1 */
    public Observable<SimpleBalanceEntity> mo24482f1(final boolean z11, @NotNull final String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        C38609v c38609vM24490t1 = z11 ? m24490t1() : m24489s1();
        final InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(c38609vM24490t1.m87314D());
        final InterfaceC41634e<SimpleBalanceEntity> interfaceC41634e = new InterfaceC41634e<SimpleBalanceEntity>() { // from class: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CrossBizInterfaceImpl.kt\ncom/kubi/futures/classic/cross/CrossBizInterfaceImpl\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n50#2:50\n84#3:51\n85#3,3:53\n1#4:52\n*E\n"})
            public static final class C128272<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f22536b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f22537c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f22538d;

                /* JADX INFO: renamed from: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$1$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C128272.this.emit(null, this);
                    }
                }

                public C128272(InterfaceC41635f interfaceC41635f, String str, boolean z11) {
                    this.f22536b = interfaceC41635f;
                    this.f22537c = str;
                    this.f22538d = z11;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f22536b;
                        Iterator<T> it = ((ComposeUserEntity) obj).getBalanceWrapper().m5306a().iterator();
                        do {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.areEqual(this.f22537c, ((SimpleBalanceEntity) next).getCurrency()));
                        SimpleBalanceEntity simpleBalanceEntity = next;
                        if (simpleBalanceEntity != null) {
                            Log.f30813a.m36615a("StreamFacedServiceIml", "observeBalance:" + this.f22537c + ' ' + this.f22538d + ' ' + simpleBalanceEntity);
                        } else {
                            simpleBalanceEntity = new SimpleBalanceEntity(this.f22537c, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, 2097150, null);
                        }
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(simpleBalanceEntity, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super SimpleBalanceEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new C128272(interfaceC41635f, currency, z11), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return RxConvertKt.m91207d(C41636g.m90895S(C41636g.m90897U(new InterfaceC41634e<SimpleBalanceEntity>() { // from class: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$2

            /* JADX INFO: renamed from: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$2$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CrossBizInterfaceImpl.kt\ncom/kubi/futures/classic/cross/CrossBizInterfaceImpl\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n50#2:50\n88#3:51\n1#4:52\n*E\n"})
            public static final class C128282<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f22541b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f22542c;

                /* JADX INFO: renamed from: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$2$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C128282.this.emit(null, this);
                    }
                }

                public C128282(InterfaceC41635f interfaceC41635f, boolean z11) {
                    this.f22541b = interfaceC41635f;
                    this.f22542c = z11;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f22541b;
                        SimpleBalanceEntity simpleBalanceEntity = (SimpleBalanceEntity) obj;
                        simpleBalanceEntity.setTrialFunds(Boxing.boxBoolean(this.f22542c));
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(simpleBalanceEntity, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super SimpleBalanceEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new C128282(interfaceC41635f, z11), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new CrossBizInterfaceImpl$observeOccupiedBalance$3(c38609vM24490t1, null)), new CrossBizInterfaceImpl$observeOccupiedBalance$4(c38609vM24490t1, null)), null, 1, null);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: g1 */
    public ModifyMarginModeResultEntity mo24483g1(boolean z11, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return this.f22528b.mo24483g1(z11, map);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: i0 */
    public Map<String, MarginModeInfoEntity> mo24484i0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f22528b.mo24484i0(z11, symbol);
    }

    @Override // sg.InterfaceC44405b
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public List<QuoteEntity> mo24485n0(boolean z11) {
        return this.f22528b.mo24485n0(z11);
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: q0 */
    public Observable<Boolean> mo24487q0(final boolean z11) {
        Observable observableFromCallable = Observable.fromCallable(new Callable() { // from class: com.kubi.futures.classic.cross.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CrossBizInterfaceImpl.m24446C1(z11, this);
            }
        });
        Observable observableM91207d = RxConvertKt.m91207d(z11 ? C46894j.f104736a.m103258W() : C46894j.f104736a.m103245J(), null, 1, null);
        final Function2 function2 = new Function2() { // from class: com.kubi.futures.classic.cross.i
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CrossBizInterfaceImpl.m24447D1((Boolean) obj, (Boolean) obj2);
            }
        };
        Observable<Boolean> observableSubscribeOn = Observable.combineLatest(observableFromCallable, observableM91207d, new BiFunction() { // from class: com.kubi.futures.classic.cross.j
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CrossBizInterfaceImpl.m24448E1(function2, obj, obj2);
            }
        }).subscribeOn(C42916f.m94127f());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    /* JADX INFO: renamed from: r1 */
    public final C38604s0 m24488r1() {
        return (C38604s0) this.f22532f.getValue();
    }

    /* JADX INFO: renamed from: s1 */
    public final C38609v m24489s1() {
        return (C38609v) this.f22530d.getValue();
    }

    /* JADX INFO: renamed from: t1 */
    public final C38609v m24490t1() {
        return (C38609v) this.f22531e.getValue();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return this.f22528b.mo4515x();
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: p */
    public Observable<List<SimpleBalanceEntity>> mo24486p(boolean z11) {
        return m24488r1().m87265d(z11, this.f22529c.mo86200p(z11));
    }
}
