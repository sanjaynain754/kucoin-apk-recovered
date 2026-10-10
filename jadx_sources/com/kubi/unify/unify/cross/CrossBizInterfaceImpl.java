package com.kubi.unify.unify.cross;

import ci.InterfaceC4984e;
import cm.FuturesStreamsData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.AllContractLeverageUpdateRequest;
import com.kubi.kumex.data.platform.model.GrayCrossModeEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.data.platform.model.SubmitCrossLeverageEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMarginEntity;
import com.kubi.kumex.data.trade.model.CrossLeverageEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.PositionOrderHoldMarginEntity;
import com.kubi.kumex.data.trade.model.QuoteEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.unify.entity.UnifyBalanceEntity;
import com.kubi.unify.entity.UnifyFundsInfoEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import com.kubi.unify.stream.UnifyDataStreamManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.rx2.RxConvertKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import sg.InterfaceC44404a;
import sg.InterfaceC44405b;
import v60.C45450b;

/* JADX INFO: compiled from: CrossBizInterfaceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000bH\u0096\u0001J\u001b\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000bH\u0096\u0001J'\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000bH\u0096\u0001J\u0018\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020\u000bH\u0096A¢\u0006\u0002\u0010*J\u0011\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020-H\u0096\u0001J\u0019\u0010.\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020/H\u0096\u0001J%\u00100\u001a\u0002012\u0006\u0010\r\u001a\u00020\u000e2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m90084d2 = {"Lcom/kubi/unify/unify/cross/CrossBizInterfaceImpl;", "Lcom/kubi/function/cross/ICrossBizInterface;", "Lcom/kubi/function/cross/IMultiCrossApi;", "api", "<init>", "(Lcom/kubi/function/cross/IMultiCrossApi;)V", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "observeMarginMode", "Lio/reactivex/Observable;", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "isTrial", "", "observeOccupiedBalance", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "observePositions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "observeOccupancyAccount", "observeCrossLeverage", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "observeStreamOnError", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "observeStreamKeyData", "Lcom/kubi/kumex/data/trade/model/FuturesStreamsData;", "observeOccupancyBalance", "observeWalletBalance", "fetchActiveOrderStatistics", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;", "symbols", "fetchAllContractsMarginMode", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "fetchCrossModeGray", "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "symbol", "fetchMarginMode", "fetchPosOrderMargin", "Lcom/kubi/kumex/data/trade/model/PositionOrderHoldMarginEntity;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitAllContractsLeverage", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/AllContractLeverageUpdateRequest;", "submitCrossLeverage", "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;", "submitMarginMode", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "map", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCrossBizInterfaceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossBizInterfaceImpl.kt\ncom/kubi/unify/unify/cross/CrossBizInterfaceImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,142:1\n17#2:143\n19#2:147\n49#2:148\n51#2:152\n49#2:153\n51#2:157\n49#2:158\n51#2:162\n56#2:163\n59#2:167\n49#2:168\n51#2:172\n46#3:144\n51#3:146\n46#3:149\n51#3:151\n46#3:154\n51#3:156\n46#3:159\n51#3:161\n46#3:164\n51#3:166\n46#3:169\n51#3:171\n105#4:145\n105#4:150\n105#4:155\n105#4:160\n105#4:165\n105#4:170\n*S KotlinDebug\n*F\n+ 1 CrossBizInterfaceImpl.kt\ncom/kubi/unify/unify/cross/CrossBizInterfaceImpl\n*L\n43#1:143\n43#1:147\n62#1:148\n62#1:152\n80#1:153\n80#1:157\n94#1:158\n94#1:162\n126#1:163\n126#1:167\n128#1:168\n128#1:172\n43#1:144\n43#1:146\n62#1:149\n62#1:151\n80#1:154\n80#1:156\n94#1:159\n94#1:161\n126#1:164\n126#1:166\n128#1:169\n128#1:171\n43#1:145\n62#1:150\n80#1:155\n94#1:160\n126#1:165\n128#1:170\n*E\n"})
public final class CrossBizInterfaceImpl implements InterfaceC44404a, InterfaceC44405b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC44405b f53470a;

    /* JADX WARN: Multi-variable type inference failed */
    public CrossBizInterfaceImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CrossBizInterfaceImpl(@NotNull InterfaceC44405b api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f53470a = api;
    }

    /* JADX INFO: renamed from: A1 */
    public static final Unit m65426A1(Disposable disposable) {
        UnifyDataStreamManager.f53365a.m65349I("observePositions");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C1 */
    public static final void m65428C1() {
        UnifyDataStreamManager.f53365a.m65352M("observePositions");
    }

    /* JADX INFO: renamed from: D1 */
    public static final Unit m65429D1(Disposable disposable) {
        UnifyDataStreamManager.f53365a.m65349I("observeWalletBalance");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F1 */
    public static final void m65432F1() {
        UnifyDataStreamManager.f53365a.m65352M("observeWalletBalance");
    }

    /* JADX INFO: renamed from: r1 */
    public static final Unit m65446r1(Disposable disposable) {
        UnifyDataStreamManager.f53365a.m65349I("observeCrossLeverage");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t1 */
    public static final void m65448t1() {
        UnifyDataStreamManager.f53365a.m65352M("observeCrossLeverage");
    }

    /* JADX INFO: renamed from: u1 */
    public static final Unit m65449u1(Disposable disposable) {
        UnifyDataStreamManager.f53365a.m65349I("observeMarginMode");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w1 */
    public static final void m65451w1() {
        UnifyDataStreamManager.f53365a.m65352M("observeMarginMode");
    }

    /* JADX INFO: renamed from: x1 */
    public static final Unit m65453x1(Disposable disposable) {
        UnifyDataStreamManager.f53365a.m65349I("observeOccupiedBalance");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z1 */
    public static final void m65455z1() {
        UnifyDataStreamManager.f53365a.m65352M("observeOccupiedBalance");
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: C */
    public Observable<SymbolsCrossLeverage> mo24472C(boolean z11) {
        if (z11) {
            Observable<SymbolsCrossLeverage> observableJust = Observable.just(new SymbolsCrossLeverage());
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        final InterfaceC41678w<Map<String, String>> interfaceC41678wM65394d = UnifyDataStreamManager.f53365a.m65362u().m65394d();
        Observable observableM91207d = RxConvertKt.m91207d(C41636g.m90939v(new InterfaceC41634e<SymbolsCrossLeverage>() { // from class: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeCrossLeverage$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeCrossLeverage$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CrossBizInterfaceImpl.kt\ncom/kubi/unify/unify/cross/CrossBizInterfaceImpl\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,49:1\n50#2:50\n95#3,2:51\n97#3,3:57\n126#4:53\n153#4,3:54\n*S KotlinDebug\n*F\n+ 1 CrossBizInterfaceImpl.kt\ncom/kubi/unify/unify/cross/CrossBizInterfaceImpl\n*L\n96#1:53\n96#1:54,3\n*E\n"})
            public static final class C266832<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53472b;

                /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeCrossLeverage$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeCrossLeverage$$inlined$map$1$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C266832.this.emit(null, this);
                    }
                }

                public C266832(InterfaceC41635f interfaceC41635f) {
                    this.f53472b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f53472b;
                        Map map = (Map) obj;
                        SymbolsCrossLeverage symbolsCrossLeverage = new SymbolsCrossLeverage();
                        ArrayList arrayList = new ArrayList(map.size());
                        for (Map.Entry entry : map.entrySet()) {
                            arrayList.add(TuplesKt.m90091to(entry.getKey(), new CrossLeverageEntity(new BigDecimal((String) entry.getValue()))));
                        }
                        MapsKt.putAll(symbolsCrossLeverage, arrayList);
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(symbolsCrossLeverage, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super SymbolsCrossLeverage> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41678wM65394d.collect(new C266832(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), null, 1, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.unify.unify.cross.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossBizInterfaceImpl.m65446r1((Disposable) obj);
            }
        };
        Observable<SymbolsCrossLeverage> observableDoFinally = observableM91207d.doOnSubscribe(new Consumer() { // from class: com.kubi.unify.unify.cross.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CrossBizInterfaceImpl.m65447s1(function1, obj);
            }
        }).doFinally(new Action() { // from class: com.kubi.unify.unify.cross.k
            @Override // io.reactivex.functions.Action
            public final void run() {
                CrossBizInterfaceImpl.m65448t1();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        return observableDoFinally;
    }

    @Override // sg.InterfaceC44405b
    /* JADX INFO: renamed from: D */
    public boolean mo24473D(@NotNull AllContractLeverageUpdateRequest entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f53470a.mo24473D(entity);
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: E */
    public Observable<Map<String, MarginModeInfoEntity>> mo24474E(boolean z11) {
        if (z11) {
            Observable<Map<String, MarginModeInfoEntity>> observableJust = Observable.just(MapsKt.emptyMap());
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        final InterfaceC41678w<Map<String, MarginModeInfoEntity>> interfaceC41678wM65396f = UnifyDataStreamManager.f53365a.m65362u().m65396f();
        Observable observableM91206c = RxConvertKt.m91206c(C41636g.m90939v(new InterfaceC41634e<Map<String, ? extends MarginModeInfoEntity>>() { // from class: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeMarginMode$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeMarginMode$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CrossBizInterfaceImpl.kt\ncom/kubi/unify/unify/cross/CrossBizInterfaceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n43#3:51\n*E\n"})
            public static final class C266842<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53474b;

                /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeMarginMode$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeMarginMode$$inlined$filter$1$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C266842.this.emit(null, this);
                    }
                }

                public C266842(InterfaceC41635f interfaceC41635f) {
                    this.f53474b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f53474b;
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public Object collect(InterfaceC41635f<? super Map<String, ? extends MarginModeInfoEntity>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41678wM65396f.collect(new C266842(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), C41782z0.m91392b());
        final Function1 function1 = new Function1() { // from class: com.kubi.unify.unify.cross.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossBizInterfaceImpl.m65449u1((Disposable) obj);
            }
        };
        Observable<Map<String, MarginModeInfoEntity>> observableDoFinally = observableM91206c.doOnSubscribe(new Consumer() { // from class: com.kubi.unify.unify.cross.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CrossBizInterfaceImpl.m65450v1(function1, obj);
            }
        }).doFinally(new Action() { // from class: com.kubi.unify.unify.cross.h
            @Override // io.reactivex.functions.Action
            public final void run() {
                CrossBizInterfaceImpl.m65451w1();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        return observableDoFinally;
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: G */
    public Observable<List<PositionEntity>> mo24475G(boolean z11) {
        if (z11) {
            Observable<List<PositionEntity>> observableJust = Observable.just(CollectionsKt.emptyList());
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        final InterfaceC41678w<List<UnifyPositionEntity>> interfaceC41678wM65397g = UnifyDataStreamManager.f53365a.m65362u().m65397g();
        Observable observableM91207d = RxConvertKt.m91207d(C41636g.m90939v(new InterfaceC41634e<List<? extends PositionEntity>>() { // from class: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observePositions$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observePositions$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CrossBizInterfaceImpl.kt\ncom/kubi/unify/unify/cross/CrossBizInterfaceImpl\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n81#3:51\n82#3:56\n1563#4:52\n1634#4,3:53\n*S KotlinDebug\n*F\n+ 1 CrossBizInterfaceImpl.kt\ncom/kubi/unify/unify/cross/CrossBizInterfaceImpl\n*L\n81#1:52\n81#1:53,3\n*E\n"})
            public static final class C266862<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53480b;

                /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observePositions$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observePositions$$inlined$map$1$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C266862.this.emit(null, this);
                    }
                }

                public C266862(InterfaceC41635f interfaceC41635f) {
                    this.f53480b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f53480b;
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((UnifyPositionEntity) it.next()).toPositionEntity());
                        }
                        List listReversed = CollectionsKt.reversed(arrayList);
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(listReversed, anonymousClass1) == coroutine_suspended) {
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
                Object objCollect = interfaceC41678wM65397g.collect(new C266862(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), null, 1, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.unify.unify.cross.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossBizInterfaceImpl.m65426A1((Disposable) obj);
            }
        };
        Observable<List<PositionEntity>> observableDoFinally = observableM91207d.doOnSubscribe(new Consumer() { // from class: com.kubi.unify.unify.cross.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CrossBizInterfaceImpl.m65427B1(function1, obj);
            }
        }).doFinally(new Action() { // from class: com.kubi.unify.unify.cross.c
            @Override // io.reactivex.functions.Action
            public final void run() {
                CrossBizInterfaceImpl.m65428C1();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        return observableDoFinally;
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: I0 */
    public GrayCrossModeEntity mo24476I0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f53470a.mo24476I0(z11, symbol);
    }

    @Override // sg.InterfaceC44405b
    @Nullable
    /* JADX INFO: renamed from: L */
    public Object mo24477L(@NotNull String str, @NotNull Continuation<? super PositionOrderHoldMarginEntity> continuation) {
        return this.f53470a.mo24477L(str, continuation);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public CrossHedgeQtyMarginEntity mo24478M0(boolean z11, @NotNull String symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        return this.f53470a.mo24478M0(z11, symbols);
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: P0 */
    public InterfaceC41634e<FuturesStreamsData> mo24479P0(boolean z11) {
        return C41636g.m90889M(new FuturesStreamsData(false, null, null, null, null, 31, null));
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: X */
    public InterfaceC41634e<InterfaceC4984e> mo24480X(boolean z11) {
        return z11 ? C41636g.m90889M(null) : IUnifyAccountService.f53155a.get().mo64999o();
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: b1 */
    public Observable<SimpleBalanceEntity> mo65456b1(@NotNull final String currency, boolean z11) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (z11) {
            Observable<SimpleBalanceEntity> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
        final InterfaceC41634e<List<UnifyFundsInfoEntity>> interfaceC41634eM65365x = UnifyDataStreamManager.f53365a.m65365x();
        final InterfaceC41634e interfaceC41634eM90939v = C41636g.m90939v(new InterfaceC41634e<UnifyFundsInfoEntity>() { // from class: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeWalletBalance$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeWalletBalance$$inlined$mapNotNull$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CrossBizInterfaceImpl.kt\ncom/kubi/unify/unify/cross/CrossBizInterfaceImpl\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n57#2:50\n58#2:53\n126#3:51\n1#4:52\n*E\n"})
            public static final class C266882<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53487b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f53488c;

                /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeWalletBalance$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeWalletBalance$$inlined$mapNotNull$1$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {53}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266882.this.emit(null, this);
                    }
                }

                public C266882(InterfaceC41635f interfaceC41635f, String str) {
                    this.f53487b = interfaceC41635f;
                    this.f53488c = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object next;
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
                        InterfaceC41635f interfaceC41635f = this.f53487b;
                        Iterator<T> it = ((List) obj).iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!StringsKt.equals(((UnifyFundsInfoEntity) next).getCurrency(), this.f53488c, true));
                        if (next != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(next);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(next, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public Object collect(InterfaceC41635f<? super UnifyFundsInfoEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM65365x.collect(new C266882(interfaceC41635f, currency), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        Observable observableM91206c = RxConvertKt.m91206c(C41636g.m90917h(new InterfaceC41634e<SimpleBalanceEntity>() { // from class: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeWalletBalance$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeWalletBalance$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CrossBizInterfaceImpl.kt\ncom/kubi/unify/unify/cross/CrossBizInterfaceImpl\n*L\n1#1,49:1\n50#2:50\n132#3,3:51\n129#3,7:54\n*E\n"})
            public static final class C266872<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53483b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f53484c;

                /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeWalletBalance$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeWalletBalance$$inlined$map$1$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C266872.this.emit(null, this);
                    }
                }

                public C266872(InterfaceC41635f interfaceC41635f, String str) {
                    this.f53483b = interfaceC41635f;
                    this.f53484c = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
                        InterfaceC41635f interfaceC41635f = this.f53483b;
                        UnifyFundsInfoEntity unifyFundsInfoEntity = (UnifyFundsInfoEntity) obj;
                        BigDecimal maxWithdraw = unifyFundsInfoEntity.getMaxWithdraw();
                        if (maxWithdraw == null) {
                            maxWithdraw = unifyFundsInfoEntity.getAvailableEquity();
                        }
                        BigDecimal availableEquity = unifyFundsInfoEntity.getAvailableEquity();
                        BigDecimal maxWithdraw2 = unifyFundsInfoEntity.getMaxWithdraw();
                        SimpleBalanceEntity simpleBalanceEntity = new SimpleBalanceEntity(this.f53484c, null, null, null, null, null, null, null, null, null, null, maxWithdraw, null, null, Boxing.boxBoolean(false), 0L, null, null, availableEquity, null, maxWithdraw2, 767998, null);
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
                Object objCollect = interfaceC41634eM90939v.collect(new C266872(interfaceC41635f, currency), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new CrossBizInterfaceImpl$observeWalletBalance$3(null)), C41782z0.m91392b());
        final Function1 function1 = new Function1() { // from class: com.kubi.unify.unify.cross.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossBizInterfaceImpl.m65429D1((Disposable) obj);
            }
        };
        Observable<SimpleBalanceEntity> observableDoFinally = observableM91206c.doOnSubscribe(new Consumer() { // from class: com.kubi.unify.unify.cross.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CrossBizInterfaceImpl.m65430E1(function1, obj);
            }
        }).doFinally(new Action() { // from class: com.kubi.unify.unify.cross.n
            @Override // io.reactivex.functions.Action
            public final void run() {
                CrossBizInterfaceImpl.m65432F1();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        return observableDoFinally;
    }

    @Override // sg.InterfaceC44405b
    /* JADX INFO: renamed from: f0 */
    public boolean mo24481f0(boolean z11, @NotNull SubmitCrossLeverageEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f53470a.mo24481f0(z11, entity);
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: f1 */
    public Observable<SimpleBalanceEntity> mo24482f1(boolean z11, @NotNull final String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (z11) {
            Observable<SimpleBalanceEntity> observableJust = Observable.just(new SimpleBalanceEntity(currency, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, 0L, null, null, null, null, null, 2080766, null));
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        final InterfaceC41634e<UnifyBalanceEntity> interfaceC41634eM65366y = UnifyDataStreamManager.f53365a.m65366y(currency);
        Observable observableM91206c = RxConvertKt.m91206c(new InterfaceC41634e<SimpleBalanceEntity>() { // from class: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CrossBizInterfaceImpl.kt\ncom/kubi/unify/unify/cross/CrossBizInterfaceImpl\n*L\n1#1,49:1\n50#2:50\n67#3,4:51\n63#3,9:55\n*E\n"})
            public static final class C266852<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53477b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f53478c;

                /* JADX INFO: renamed from: com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.unify.cross.CrossBizInterfaceImpl$observeOccupiedBalance$$inlined$map$1$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C266852.this.emit(null, this);
                    }
                }

                public C266852(InterfaceC41635f interfaceC41635f, String str) {
                    this.f53477b = interfaceC41635f;
                    this.f53478c = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
                        InterfaceC41635f interfaceC41635f = this.f53477b;
                        UnifyBalanceEntity unifyBalanceEntity = (UnifyBalanceEntity) obj;
                        BigDecimal maxWithdraw = unifyBalanceEntity.getMaxWithdraw();
                        if (maxWithdraw == null) {
                            maxWithdraw = unifyBalanceEntity.getFuturesIsolatedAvailable();
                        }
                        BigDecimal futuresAvailable = unifyBalanceEntity.getFuturesAvailable();
                        BigDecimal futuresIsolatedAvailable = unifyBalanceEntity.getFuturesIsolatedAvailable();
                        BigDecimal maxWithdraw2 = unifyBalanceEntity.getMaxWithdraw();
                        SimpleBalanceEntity simpleBalanceEntity = new SimpleBalanceEntity(this.f53478c, null, null, null, null, null, null, null, null, null, null, maxWithdraw, null, null, Boxing.boxBoolean(false), 0L, null, null, futuresAvailable, futuresIsolatedAvailable, maxWithdraw2, 243710, null);
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
                Object objCollect = interfaceC41634eM65366y.collect(new C266852(interfaceC41635f, currency), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, C41782z0.m91392b());
        final Function1 function1 = new Function1() { // from class: com.kubi.unify.unify.cross.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossBizInterfaceImpl.m65453x1((Disposable) obj);
            }
        };
        Observable<SimpleBalanceEntity> observableDoFinally = observableM91206c.doOnSubscribe(new Consumer() { // from class: com.kubi.unify.unify.cross.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CrossBizInterfaceImpl.m65454y1(function1, obj);
            }
        }).doFinally(new Action() { // from class: com.kubi.unify.unify.cross.f
            @Override // io.reactivex.functions.Action
            public final void run() {
                CrossBizInterfaceImpl.m65455z1();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        return observableDoFinally;
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: g1 */
    public ModifyMarginModeResultEntity mo24483g1(boolean z11, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return this.f53470a.mo24483g1(z11, map);
    }

    @Override // sg.InterfaceC44405b
    @NotNull
    /* JADX INFO: renamed from: i0 */
    public Map<String, MarginModeInfoEntity> mo24484i0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f53470a.mo24484i0(z11, symbol);
    }

    @Override // sg.InterfaceC44405b
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public List<QuoteEntity> mo24485n0(boolean z11) {
        return this.f53470a.mo24485n0(z11);
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: q0 */
    public Observable<Boolean> mo24487q0(boolean z11) {
        Observable<Boolean> observableJust = Observable.just(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.UNIFIED;
    }

    public /* synthetic */ CrossBizInterfaceImpl(InterfaceC44405b interfaceC44405b, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new C45450b() : interfaceC44405b);
    }

    /* JADX INFO: renamed from: B1 */
    public static final void m65427B1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E1 */
    public static final void m65430E1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s1 */
    public static final void m65447s1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v1 */
    public static final void m65450v1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y1 */
    public static final void m65454y1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // sg.InterfaceC44406c
    @NotNull
    /* JADX INFO: renamed from: p */
    public Observable<List<SimpleBalanceEntity>> mo24486p(boolean z11) {
        Observable<List<SimpleBalanceEntity>> observableJust = Observable.just(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }
}
