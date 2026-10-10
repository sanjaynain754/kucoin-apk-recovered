package com.kubi.core.biz.submit;

import androidx.lifecycle.ViewModelKt;
import cd.InterfaceC4934a;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.core.base.order.data.MakeOrderData$Request;
import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.base.order.data.Request;
import com.kubi.core.base.order.data.Response;
import com.kubi.core.base.quote.inner.EftTickerFetchAndSubHandler;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.biz.margininfo.IMarginInfoApi;
import com.kubi.core.spot.entity.OrderResultEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.unify.api.IUnifyAccountService;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import k30.AvailableTradeAmountState;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import mr.C42597a;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38169a;
import p309hd.InterfaceC38170b;
import p309hd.TradeSettingsBean;
import p557qe.InterfaceC43720b;
import p756xc.BalanceData;
import p756xc.C46135i;
import p756xc.TradeSymbolBalance;
import p793yc.InterfaceC46461c;
import p793yc.InterfaceC46463e;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TradeSubmitVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;0:J0\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0FJ\b\u0010G\u001a\u00020HH\u0014J\u0010\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020\u0002H\u0016J\u0010\u0010K\u001a\u00020H2\u0006\u0010A\u001a\u00020BH\u0002J\"\u0010L\u001a\u0014\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N0M2\u0006\u0010P\u001a\u00020DH\u0002J\b\u0010Q\u001a\u00020HH\u0002J\b\u0010R\u001a\u00020HH\u0002J\b\u0010S\u001a\u00020HH\u0002J\u0010\u0010T\u001a\u00020H2\u0006\u0010U\u001a\u00020*H\u0002J\b\u0010V\u001a\u00020HH\u0002J\u0017\u0010W\u001a\u00020H2\b\u0010X\u001a\u0004\u0018\u00010YH\u0000¢\u0006\u0002\bZJ\u0017\u0010[\u001a\u00020H2\b\u0010X\u001a\u0004\u0018\u00010YH\u0000¢\u0006\u0002\b\\J\u0015\u0010]\u001a\u00020H2\u0006\u0010^\u001a\u00020_H\u0000¢\u0006\u0002\b`J\b\u0010a\u001a\u00020HH\u0002R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020&X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u000e\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u000e\u001a\u0004\b6\u00107¨\u0006c"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitVM;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiIntent;", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;", "repoManager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "<init>", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)V", "utaOrderApi", "Lcom/kubi/core/biz/margininfo/IMarginInfoApi;", "kotlin.jvm.PlatformType", "getUtaOrderApi", "()Lcom/kubi/core/biz/margininfo/IMarginInfoApi;", "utaOrderApi$delegate", "Lkotlin/Lazy;", "initState", "getInitState", "()Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;", "settingsJob", "Lkotlinx/coroutines/Job;", "etfSubJob", "activeOrdersJob", "subOrdersChangeJob", "activeOrdersDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroyDisposable", "fundsInfoSubscriptionJob", "getFundsInfoSubscriptionJob$TradeCoreBizLib_googleRelease", "()Lkotlinx/coroutines/Job;", "setFundsInfoSubscriptionJob$TradeCoreBizLib_googleRelease", "(Lkotlinx/coroutines/Job;)V", "fetchBalanceSocketRepo", "getFetchBalanceSocketRepo$TradeCoreBizLib_googleRelease", "setFetchBalanceSocketRepo$TradeCoreBizLib_googleRelease", "fetchBalanceDebounceJob", "getFetchBalanceDebounceJob$TradeCoreBizLib_googleRelease", "setFetchBalanceDebounceJob$TradeCoreBizLib_googleRelease", "lastFetchBalanceTime", "Ljava/util/concurrent/atomic/AtomicLong;", "getLastFetchBalanceTime$TradeCoreBizLib_googleRelease", "()Ljava/util/concurrent/atomic/AtomicLong;", "availableTradeAmountCalculationKey", "", "getAvailableTradeAmountCalculationKey$TradeCoreBizLib_googleRelease", "()Ljava/lang/String;", "setAvailableTradeAmountCalculationKey$TradeCoreBizLib_googleRelease", "(Ljava/lang/String;)V", "etfTickerHandler", "Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler;", "getEtfTickerHandler", "()Lcom/kubi/core/base/quote/inner/EftTickerFetchAndSubHandler;", "etfTickerHandler$delegate", "supportOrderTypeConfig", "Lcom/kubi/core/biz/submit/SubmitOrderConfig;", "getSupportOrderTypeConfig", "()Lcom/kubi/core/biz/submit/SubmitOrderConfig;", "supportOrderTypeConfig$delegate", "getSubmitOrderInterceptList", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "getSubmitOrderObservable", "Lio/reactivex/Observable;", "Lcom/kubi/core/spot/entity/OrderResultEntity;", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "isAllInOrder", "", "requestEntity", "", "onCleared", "", "sendBizIntent", "intent", "updateTradeTypeUiData", "createSupportTradeTypes", "Lkotlin/Pair;", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "isCallAuction", "subSettingsChange", "subActiveOrdersChange", "executeActiveOrders", "startCollectETFData", "symbol", "startFundsInfo", "updateBalanceState", "balance", "Lcom/kubi/core/base/arch/api/data/BalanceData;", "updateBalanceState$TradeCoreBizLib_googleRelease", "updateAvailableBalanceState", "updateAvailableBalanceState$TradeCoreBizLib_googleRelease", "updateAvailableTradeAmountState", "value", "Lcom/kubi/tradebase/available/AvailableTradeAmountState;", "updateAvailableTradeAmountState$TradeCoreBizLib_googleRelease", "cancelAllFetchAndSubJob", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeSubmitVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSubmitVM.kt\ncom/kubi/core/biz/submit/TradeSubmitVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,474:1\n1#2:475\n1869#3,2:476\n1563#3:478\n1634#3,3:479\n1563#3:482\n1634#3,3:483\n1563#3:486\n1634#3,3:487\n49#4:490\n51#4:494\n49#4:495\n51#4:499\n46#5:491\n51#5:493\n46#5:496\n51#5:498\n105#6:492\n105#6:497\n*S KotlinDebug\n*F\n+ 1 TradeSubmitVM.kt\ncom/kubi/core/biz/submit/TradeSubmitVM\n*L\n277#1:476,2\n290#1:478\n290#1:479,3\n291#1:482\n291#1:483,3\n295#1:486\n295#1:487,3\n312#1:490\n312#1:494\n383#1:495\n383#1:499\n312#1:491\n312#1:493\n383#1:496\n383#1:498\n312#1:492\n383#1:497\n*E\n"})
public final class TradeSubmitVM extends AbsTradeBaseBizVM<TradeSubmitBizContract$UiIntent, UiState> {

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public static final Companion f20650l0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f20651X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public InterfaceC41775x1 f20652Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public InterfaceC41775x1 f20653Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public InterfaceC41775x1 f20654a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public InterfaceC41775x1 f20655b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final CompositeDisposable f20656c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final CompositeDisposable f20657d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public InterfaceC41775x1 f20658e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public InterfaceC41775x1 f20659f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public InterfaceC41775x1 f20660g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final AtomicLong f20661h0;

    /* JADX INFO: renamed from: i0 */
    @Nullable
    public String f20662i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f20663j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final Lazy f20664k0;

    /* JADX INFO: compiled from: TradeSubmitVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/biz/submit/TradeSubmitVM$Companion;", "", "<init>", "()V", "FUNDS_INFO_POLLING_INTERVAL_MS", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m22460N0() {
        InterfaceC41775x1 interfaceC41775x1 = this.f20658e0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        final InterfaceC41634e interfaceC41634eM90915g = C41636g.m90915g(C41636g.m90935r(IUnifyAccountService.f53155a.get().mo64992f()));
        this.f20658e0 = m21022b(C41636g.m90894R(new InterfaceC41634e<Unit>() { // from class: com.kubi.core.biz.submit.TradeSubmitVM$startFundsInfo$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSubmitVM$startFundsInfo$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TradeSubmitVM.kt\ncom/kubi/core/biz/submit/TradeSubmitVM\n*L\n1#1,49:1\n50#2:50\n383#3:51\n*E\n"})
            public static final class C120632<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20666b;

                /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSubmitVM$startFundsInfo$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSubmitVM$startFundsInfo$$inlined$map$1$2", m90122f = "TradeSubmitVM.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C120632.this.emit(null, this);
                    }
                }

                public C120632(InterfaceC41635f interfaceC41635f) {
                    this.f20666b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f20666b;
                        Unit unit = Unit.INSTANCE;
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(unit, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super Unit> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90915g.collect(new C120632(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, C41636g.m90887K(new TradeSubmitVM$startFundsInfo$timerFlow$1(null))), new TradeSubmitVM$startFundsInfo$1(this, null));
    }

    /* JADX INFO: renamed from: O0 */
    public final void m22461O0() {
        InterfaceC41775x1 interfaceC41775x1 = this.f20655b0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        InterfaceC4934a interfaceC4934aMo96893b = getF20069V().getF104578c();
        if (interfaceC4934aMo96893b == null) {
            return;
        }
        this.f20655b0 = m21022b(C41636g.m90894R(interfaceC4934aMo96893b.mo5160h(), interfaceC4934aMo96893b.mo5155c()), new TradeSubmitVM$subActiveOrdersChange$1(this, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSubmitVM(@NotNull final AbstractC46753c repoManager) {
        super(repoManager);
        Intrinsics.checkNotNullParameter(repoManager, "repoManager");
        this.f20651X = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.b2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSubmitVM.m22435Z0();
            }
        });
        this.f20656c0 = new CompositeDisposable();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f20657d0 = compositeDisposable;
        this.f20661h0 = new AtomicLong(0L);
        this.f20663j0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.c2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSubmitVM.m22436b0();
            }
        });
        this.f20664k0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.d2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSubmitVM.m22421Q0(this.f20697b);
            }
        });
        m22462P0();
        m22468c0();
        m22461O0();
        PublishSubject<Boolean> publishSubjectM21641g = CallAuctionSwitch.f20317a.m21641g();
        final Function1 function1 = new Function1() { // from class: com.kubi.core.biz.submit.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitVM.m22422R(this.f20700b, repoManager, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.core.biz.submit.f1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitVM.m22423S(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.core.biz.submit.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitVM.m22425T((Throwable) obj);
            }
        };
        compositeDisposable.add(publishSubjectM21641g.subscribe(consumer, new Consumer() { // from class: com.kubi.core.biz.submit.h1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitVM.m22426U(function2, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public static UiState m22398B(TradeSubmitVM tradeSubmitVM, AbstractC46753c abstractC46753c, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : tradeSubmitVM.m22477z0().mo22540d(CallAuctionSwitch.f20317a.m21642h(abstractC46753c.m103015f())), (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: C0 */
    public static final UiState m22400C0(TradeSubmitBizContract$UiIntent tradeSubmitBizContract$UiIntent, Pair pair, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : ((TradeSubmitBizContract$UiIntent.UpdateSymbolInfo) tradeSubmitBizContract$UiIntent).getSymbolInfo(), (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : (TradeType) pair.getFirst(), (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : (List) pair.getSecond(), (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: D0 */
    public static final UiState m22402D0(Pair pair, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : (TradeType) pair.getFirst(), (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : (List) pair.getSecond(), (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: E0 */
    public static final UiState m22404E0(TradeSubmitBizContract$UiIntent tradeSubmitBizContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        TradeSubmitBizContract$UiIntent.ChangeSymbol changeSymbol = (TradeSubmitBizContract$UiIntent.ChangeSymbol) tradeSubmitBizContract$UiIntent;
        String symbol = changeSymbol.getSymbol();
        SymbolInfoEntity symbolInfo = changeSymbol.getSymbolInfo();
        SymbolInfoEntity symbolInfo2 = changeSymbol.getSymbolInfo();
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : symbol, (57343 & 2) != 0 ? updateState.symbolInfo : symbolInfo, (57343 & 4) != 0 ? updateState.tradeBalance : symbolInfo2 != null ? C46135i.m101679b(symbolInfo2) : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : CollectionsKt.emptyList(), (57343 & 8192) != 0 ? updateState.supportTradeTypes : null, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : TradeSymbolBalanceExtKt.m22491d(changeSymbol.getSymbolInfo(), null, 2, null));
    }

    /* JADX INFO: renamed from: F0 */
    public static final UiState m22406F0(TradeSubmitBizContract$UiIntent tradeSubmitBizContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : ((TradeSubmitBizContract$UiIntent.UpdateBbo) tradeSubmitBizContract$UiIntent).getBbo(), (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : null, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: G0 */
    public static final UiState m22408G0(TradeSubmitBizContract$UiIntent tradeSubmitBizContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        TradeSubmitBizContract$UiIntent.UpdateInputPrice updateInputPrice = (TradeSubmitBizContract$UiIntent.UpdateInputPrice) tradeSubmitBizContract$UiIntent;
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : updateInputPrice.getInputBuyPrice(), (57343 & 128) != 0 ? updateState.inputSellPrice : updateInputPrice.getInputSellPrice(), (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : null, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: H0 */
    public static final UiState m22410H0(TradeSubmitBizContract$UiIntent tradeSubmitBizContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        TradeSubmitBizContract$UiIntent.UpdateInputTriggerPrice updateInputTriggerPrice = (TradeSubmitBizContract$UiIntent.UpdateInputTriggerPrice) tradeSubmitBizContract$UiIntent;
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : updateInputTriggerPrice.getInputBuyTriggerPrice(), (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : updateInputTriggerPrice.getInputSellTriggerPrice(), (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : null, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: I0 */
    public static final UiState m22412I0(TradeSubmitBizContract$UiIntent tradeSubmitBizContract$UiIntent, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : ((TradeSubmitBizContract$UiIntent.PanelModelChange) tradeSubmitBizContract$UiIntent).getPanelModel(), (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : null, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m22422R(final TradeSubmitVM tradeSubmitVM, final AbstractC46753c abstractC46753c, Boolean bool) {
        tradeSubmitVM.updateState(new Function1() { // from class: com.kubi.core.biz.submit.i1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitVM.m22398B(this.f20744b, abstractC46753c, (UiState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S0 */
    public static final UiState m22424S0(AvailableTradeAmountState availableTradeAmountState, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : null, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : availableTradeAmountState);
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m22425T(Throwable th2) {
        C44128b.m97259c("subscribe", th2.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U0 */
    public static final UiState m22427U0(TradeSymbolBalance tradeSymbolBalance, BalanceData balanceData, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : TradeSymbolBalance.m101674b(tradeSymbolBalance, balanceData, null, 2, null), (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : null, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: V0 */
    public static final UiState m22429V0(TradeSymbolBalance tradeSymbolBalance, BalanceData balanceData, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : TradeSymbolBalance.m101674b(tradeSymbolBalance, null, balanceData, 1, null), (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : null, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: X0 */
    public static final UiState m22432X0(TradeType tradeType, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : tradeType, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : null, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: Y0 */
    public static final UiState m22434Y0(List list, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : null, (57343 & 8192) != 0 ? updateState.supportTradeTypes : list, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: b0 */
    public static final EftTickerFetchAndSubHandler m22436b0() {
        return new EftTickerFetchAndSubHandler();
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m22437d0(TradeSubmitVM tradeSubmitVM, final BasePageEntity basePageEntity) {
        tradeSubmitVM.updateState(new Function1() { // from class: com.kubi.core.biz.submit.t1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitVM.m22438e0(basePageEntity, (UiState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final UiState m22438e0(BasePageEntity basePageEntity, UiState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        List items = basePageEntity.getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        return updateState.copy((57343 & 1) != 0 ? updateState.symbol : null, (57343 & 2) != 0 ? updateState.symbolInfo : null, (57343 & 4) != 0 ? updateState.tradeBalance : null, (57343 & 8) != 0 ? updateState.availableBalance : null, (57343 & 16) != 0 ? updateState.tradeType : null, (57343 & 32) != 0 ? updateState.bbo : null, (57343 & 64) != 0 ? updateState.inputBuyPrice : null, (57343 & 128) != 0 ? updateState.inputSellPrice : null, (57343 & 256) != 0 ? updateState.inputBuyTriggerPrice : null, (57343 & 512) != 0 ? updateState.inputSellTriggerPrice : null, (57343 & 1024) != 0 ? updateState.etfInfo : null, (57343 & 2048) != 0 ? updateState.panelModel : null, (57343 & 4096) != 0 ? updateState.allActiveDelegations : items, (57343 & 8192) != 0 ? updateState.supportTradeTypes : null, (57343 & 16384) != 0 ? updateState.marginSymbolInfo : null, (57343 & 32768) != 0 ? updateState.availableTradeAmount : null);
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m22440g0(Throwable th2) {
        C44128b.m97260d("executeActiveOrders, " + th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x0 */
    public static final OrderResultEntity m22450x0(Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new OrderResultEntity(null, it.getOrderId(), null, false, 8, null);
    }

    /* JADX INFO: renamed from: y0 */
    public static final OrderResultEntity m22452y0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (OrderResultEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: A0 */
    public final IMarginInfoApi m22454A0() {
        return (IMarginInfoApi) this.f20651X.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public void m22455B0(@NotNull final TradeSubmitBizContract$UiIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.m21025p(intent);
        boolean z11 = false;
        if (intent instanceof TradeSubmitBizContract$UiIntent.UpdateSymbolInfo) {
            String symbol = ((UiState) getState()).getSymbol();
            TradeSubmitBizContract$UiIntent.UpdateSymbolInfo updateSymbolInfo = (TradeSubmitBizContract$UiIntent.UpdateSymbolInfo) intent;
            SymbolInfoEntity symbolInfo = updateSymbolInfo.getSymbolInfo();
            if (Intrinsics.areEqual(symbol, symbolInfo != null ? symbolInfo.getCode() : null)) {
                if (CallAuctionSwitch.f20317a.m21637c()) {
                    SymbolInfoEntity symbolInfo2 = updateSymbolInfo.getSymbolInfo();
                    if (symbolInfo2 != null ? Intrinsics.areEqual(symbolInfo2.getEnableAuctionTrade(), Boolean.TRUE) : false) {
                        z11 = true;
                    }
                }
                final Pair<TradeType, List<TradeTypeUiData>> pairM22467a0 = m22467a0(z11);
                updateState(new Function1() { // from class: com.kubi.core.biz.submit.d1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradeSubmitVM.m22400C0(intent, pairM22467a0, (UiState) obj);
                    }
                });
                return;
            }
            return;
        }
        if (intent instanceof TradeSubmitBizContract$UiIntent.UpdateCallAuctionState) {
            final Pair<TradeType, List<TradeTypeUiData>> pairM22467a1 = m22467a0(((TradeSubmitBizContract$UiIntent.UpdateCallAuctionState) intent).getIsInCallAuction());
            updateState(new Function1() { // from class: com.kubi.core.biz.submit.o1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeSubmitVM.m22402D0(pairM22467a1, (UiState) obj);
                }
            });
            return;
        }
        if (intent instanceof TradeSubmitBizContract$UiIntent.ChangeSymbol) {
            updateState(new Function1() { // from class: com.kubi.core.biz.submit.w1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeSubmitVM.m22404E0(intent, (UiState) obj);
                }
            });
            this.f20662i0 = null;
            UiState uiState = (UiState) getState();
            IMarginInfoApi iMarginInfoApiM22454A0 = m22454A0();
            Intrinsics.checkNotNullExpressionValue(iMarginInfoApiM22454A0, "<get-utaOrderApi>(...)");
            TradeSymbolBalanceExtKt.m22494g(this, uiState, iMarginInfoApiM22454A0, false, 4, null);
            m22468c0();
            String symbol2 = ((UiState) getState()).getSymbol();
            if (symbol2 != null) {
                m22459M0(symbol2);
            }
            String symbol3 = ((UiState) getState()).getSymbol();
            if (symbol3 != null) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new TradeSubmitVM$sendBizIntent$5$1(this, symbol3, null), 2, null);
                return;
            }
            return;
        }
        if (intent instanceof TradeSubmitBizContract$UiIntent.Hide) {
            m22466Z();
            return;
        }
        if (intent instanceof TradeSubmitBizContract$UiIntent.Refresh) {
            m22462P0();
            m22468c0();
            m22461O0();
            UiState uiState2 = (UiState) getState();
            IMarginInfoApi iMarginInfoApiM22454A1 = m22454A0();
            Intrinsics.checkNotNullExpressionValue(iMarginInfoApiM22454A1, "<get-utaOrderApi>(...)");
            TradeSymbolBalanceExtKt.m22494g(this, uiState2, iMarginInfoApiM22454A1, false, 4, null);
            String symbol4 = ((UiState) getState()).getSymbol();
            if (symbol4 != null) {
                m22459M0(symbol4);
            }
            m22460N0();
            return;
        }
        if (intent instanceof TradeSubmitBizContract$UiIntent.ChangeTradeType) {
            m22465W0(((TradeSubmitBizContract$UiIntent.ChangeTradeType) intent).getTradeType());
            return;
        }
        if (intent instanceof TradeSubmitBizContract$UiIntent.ChangeBuyOrSellDirection) {
            getF20069V().getF104577b().mo85484b(((TradeSubmitBizContract$UiIntent.ChangeBuyOrSellDirection) intent).getIsBuy() ? InterfaceC38169a.a.f85864a : InterfaceC38169a.b.f85865a);
            UiState uiState3 = (UiState) getState();
            IMarginInfoApi iMarginInfoApiM22454A2 = m22454A0();
            Intrinsics.checkNotNullExpressionValue(iMarginInfoApiM22454A2, "<get-utaOrderApi>(...)");
            TradeSymbolBalanceExtKt.m22494g(this, uiState3, iMarginInfoApiM22454A2, false, 4, null);
            return;
        }
        if (intent instanceof TradeSubmitBizContract$UiIntent.FetchSymbolBalance) {
            UiState uiState4 = (UiState) getState();
            IMarginInfoApi iMarginInfoApiM22454A3 = m22454A0();
            Intrinsics.checkNotNullExpressionValue(iMarginInfoApiM22454A3, "<get-utaOrderApi>(...)");
            TradeSymbolBalanceExtKt.m22494g(this, uiState4, iMarginInfoApiM22454A3, false, 4, null);
            return;
        }
        if (intent instanceof TradeSubmitBizContract$UiIntent.UpdateBbo) {
            updateState(new Function1() { // from class: com.kubi.core.biz.submit.x1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeSubmitVM.m22406F0(intent, (UiState) obj);
                }
            });
            TradeType tradeType = ((UiState) getState()).getTradeType();
            TradeType tradeType2 = TradeType.MARKET;
            if (tradeType == tradeType2) {
                UiState uiState5 = (UiState) getState();
                IMarginInfoApi iMarginInfoApiM22454A4 = m22454A0();
                Intrinsics.checkNotNullExpressionValue(iMarginInfoApiM22454A4, "<get-utaOrderApi>(...)");
                TradeSymbolBalanceExtKt.m22493f(this, uiState5, iMarginInfoApiM22454A4, false);
            }
            if (((UiState) getState()).getTradeType() == tradeType2 || ((UiState) getState()).getTradeType() == TradeType.MARKET_STOP) {
                TradeSymbolBalanceExtKt.m22499l(this);
                return;
            }
            return;
        }
        if (intent instanceof TradeSubmitBizContract$UiIntent.UpdateInputPrice) {
            updateState(new Function1() { // from class: com.kubi.core.biz.submit.y1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeSubmitVM.m22408G0(intent, (UiState) obj);
                }
            });
            TradeSymbolBalanceExtKt.m22499l(this);
            UiState uiState6 = (UiState) getState();
            IMarginInfoApi iMarginInfoApiM22454A5 = m22454A0();
            Intrinsics.checkNotNullExpressionValue(iMarginInfoApiM22454A5, "<get-utaOrderApi>(...)");
            TradeSymbolBalanceExtKt.m22494g(this, uiState6, iMarginInfoApiM22454A5, false, 4, null);
            return;
        }
        if (intent instanceof TradeSubmitBizContract$UiIntent.UpdateInputTriggerPrice) {
            updateState(new Function1() { // from class: com.kubi.core.biz.submit.z1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeSubmitVM.m22410H0(intent, (UiState) obj);
                }
            });
            UiState uiState7 = (UiState) getState();
            IMarginInfoApi iMarginInfoApiM22454A6 = m22454A0();
            Intrinsics.checkNotNullExpressionValue(iMarginInfoApiM22454A6, "<get-utaOrderApi>(...)");
            TradeSymbolBalanceExtKt.m22494g(this, uiState7, iMarginInfoApiM22454A6, false, 4, null);
            return;
        }
        if (!(intent instanceof TradeSubmitBizContract$UiIntent.PanelModelChange)) {
            throw new NoWhenBranchMatchedException();
        }
        updateState(new Function1() { // from class: com.kubi.core.biz.submit.a2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitVM.m22412I0(intent, (UiState) obj);
            }
        });
        TradeSymbolBalanceExtKt.m22499l(this);
        UiState uiState8 = (UiState) getState();
        IMarginInfoApi iMarginInfoApiM22454A7 = m22454A0();
        Intrinsics.checkNotNullExpressionValue(iMarginInfoApiM22454A7, "<get-utaOrderApi>(...)");
        TradeSymbolBalanceExtKt.m22494g(this, uiState8, iMarginInfoApiM22454A7, false, 4, null);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m22456J0(@Nullable String str) {
        this.f20662i0 = str;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m22457K0(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        this.f20660g0 = interfaceC41775x1;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m22458L0(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        this.f20659f0 = interfaceC41775x1;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m22459M0(String str) {
        InterfaceC41775x1 interfaceC41775x1 = this.f20653Z;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f20653Z = C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new TradeSubmitVM$startCollectETFData$1(str, this, null), 2, null);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m22462P0() {
        InterfaceC41775x1 interfaceC41775x1 = this.f20652Y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        getF20069V().getF104577b().mo85485c(ISpotCommonService.f49644a.get().mo59968l() ? InterfaceC38170b.b.f85867a : InterfaceC38170b.a.f85866a);
        final InterfaceC41678w<TradeSettingsBean> interfaceC41678wMo85483a = getF20069V().getF104577b().mo85483a();
        this.f20652Y = m21022b(new InterfaceC41634e<InterfaceC38170b>() { // from class: com.kubi.core.biz.submit.TradeSubmitVM$subSettingsChange$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSubmitVM$subSettingsChange$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TradeSubmitVM.kt\ncom/kubi/core/biz/submit/TradeSubmitVM\n*L\n1#1,49:1\n50#2:50\n312#3:51\n*E\n"})
            public static final class C120642<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20668b;

                /* JADX INFO: renamed from: com.kubi.core.biz.submit.TradeSubmitVM$subSettingsChange$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSubmitVM$subSettingsChange$$inlined$map$1$2", m90122f = "TradeSubmitVM.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C120642.this.emit(null, this);
                    }
                }

                public C120642(InterfaceC41635f interfaceC41635f) {
                    this.f20668b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f20668b;
                        InterfaceC38170b tradePanelModel = ((TradeSettingsBean) obj).getTradePanelModel();
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(tradePanelModel, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super InterfaceC38170b> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41678wMo85483a.collect(new C120642(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new TradeSubmitVM$subSettingsChange$2(this, null));
    }

    /* JADX INFO: renamed from: R0 */
    public final void m22463R0(@NotNull final AvailableTradeAmountState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        updateState(new Function1() { // from class: com.kubi.core.biz.submit.s1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitVM.m22424S0(value, (UiState) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    public final void m22465W0(final TradeType tradeType) {
        updateState(new Function1() { // from class: com.kubi.core.biz.submit.j1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitVM.m22432X0(tradeType, (UiState) obj);
            }
        });
        final ArrayList arrayList = new ArrayList();
        List<TradeTypeUiData> supportTradeTypes = ((UiState) getState()).getSupportTradeTypes();
        if (supportTradeTypes != null) {
            for (TradeTypeUiData tradeTypeUiData : supportTradeTypes) {
                arrayList.add(tradeTypeUiData.mo22633c(tradeTypeUiData.getF20771b() == tradeType));
            }
        }
        updateState(new Function1() { // from class: com.kubi.core.biz.submit.k1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitVM.m22434Y0(arrayList, (UiState) obj);
            }
        });
        UiState uiState = (UiState) getState();
        IMarginInfoApi iMarginInfoApiM22454A0 = m22454A0();
        Intrinsics.checkNotNullExpressionValue(iMarginInfoApiM22454A0, "<get-utaOrderApi>(...)");
        TradeSymbolBalanceExtKt.m22494g(this, uiState, iMarginInfoApiM22454A0, false, 4, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m22466Z() {
        InterfaceC41775x1 interfaceC41775x1 = this.f20652Y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        InterfaceC41775x1 interfaceC41775x2 = this.f20653Z;
        if (interfaceC41775x2 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
        }
        InterfaceC41775x1 interfaceC41775x3 = this.f20654a0;
        if (interfaceC41775x3 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x3, null, 1, null);
        }
        InterfaceC41775x1 interfaceC41775x4 = this.f20655b0;
        if (interfaceC41775x4 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x4, null, 1, null);
        }
        InterfaceC41775x1 interfaceC41775x5 = this.f20658e0;
        if (interfaceC41775x5 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x5, null, 1, null);
        }
        InterfaceC41775x1 interfaceC41775x6 = this.f20659f0;
        if (interfaceC41775x6 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x6, null, 1, null);
        }
        InterfaceC41775x1 interfaceC41775x7 = this.f20660g0;
        if (interfaceC41775x7 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x7, null, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public final void m22468c0() {
        InterfaceC46463e<Request, OrderItem, OrderItem> f101560d;
        Observable<BasePageEntity<OrderItem>> observableMo66265a;
        if (IUnifyAccountService.f53155a.get().mo64980D()) {
            return;
        }
        this.f20656c0.clear();
        InterfaceC4934a interfaceC4934aMo96893b = getF20069V().getF104578c();
        if (interfaceC4934aMo96893b == null || (f101560d = interfaceC4934aMo96893b.getF104588f()) == null || (observableMo66265a = f101560d.mo66265a(new Request(((UiState) getState()).getSymbol(), null, OrderLevelType.Normal.INSTANCE, 1, 10, null, null, 98, null))) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: com.kubi.core.biz.submit.n1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitVM.m22437d0(this.f20783b, (BasePageEntity) obj);
            }
        };
        Consumer<? super BasePageEntity<OrderItem>> consumer = new Consumer() { // from class: com.kubi.core.biz.submit.p1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitVM.m22439f0(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.core.biz.submit.q1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitVM.m22440g0((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableMo66265a.subscribe(consumer, new Consumer() { // from class: com.kubi.core.biz.submit.r1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitVM.m22441h0(function2, obj);
            }
        });
        if (disposableSubscribe != null) {
            DisposableKt.addTo(disposableSubscribe, this.f20656c0);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final String getF20662i0() {
        return this.f20662i0;
    }

    /* JADX INFO: renamed from: j0 */
    public final EftTickerFetchAndSubHandler m22470j0() {
        return (EftTickerFetchAndSubHandler) this.f20663j0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: l0, reason: from getter */
    public final InterfaceC41775x1 getF20660g0() {
        return this.f20660g0;
    }

    @Nullable
    /* JADX INFO: renamed from: m0, reason: from getter */
    public final InterfaceC41775x1 getF20659f0() {
        return this.f20659f0;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    @NotNull
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final AtomicLong getF20661h0() {
        return this.f20661h0;
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final Observable<OrderResultEntity> m22476q0(@NotNull TradeType tradeType, boolean z11, @NotNull Map<String, String> requestEntity) {
        InterfaceC46461c<MakeOrderData$Request, Response> interfaceC46461cMo5157e;
        Observable<Response> observableMo66315a;
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(requestEntity, "requestEntity");
        MakeOrderData$Request makeOrderData$RequestM22525g = C12073b.m22525g(tradeType, z11, requestEntity);
        if (makeOrderData$RequestM22525g == null) {
            Observable<OrderResultEntity> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
        InterfaceC4934a interfaceC4934aMo96893b = getF20069V().getF104578c();
        if (interfaceC4934aMo96893b != null && (interfaceC46461cMo5157e = interfaceC4934aMo96893b.getF104585c()) != null && (observableMo66315a = interfaceC46461cMo5157e.mo66315a(makeOrderData$RequestM22525g)) != null) {
            final Function1 function1 = new Function1() { // from class: com.kubi.core.biz.submit.l1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeSubmitVM.m22450x0((Response) obj);
                }
            };
            Observable map = observableMo66315a.map(new Function() { // from class: com.kubi.core.biz.submit.m1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return TradeSubmitVM.m22452y0(function1, obj);
                }
            });
            if (map != null) {
                return map;
            }
        }
        Observable<OrderResultEntity> observableEmpty2 = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty2, "empty(...)");
        return observableEmpty2;
    }

    /* JADX INFO: renamed from: z0 */
    public final SubmitOrderConfig m22477z0() {
        return (SubmitOrderConfig) this.f20664k0.getValue();
    }

    /* JADX INFO: renamed from: Q0 */
    public static final SubmitOrderConfig m22421Q0(TradeSubmitVM tradeSubmitVM) {
        return tradeSubmitVM.getF20069V().getF104580e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final void m22423S(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m22426U(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z0 */
    public static final IMarginInfoApi m22435Z0() {
        return (IMarginInfoApi) C42597a.m93388d().create(IMarginInfoApi.class);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m22439f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m22441h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public final void m22464T0(@Nullable final BalanceData balanceData) {
        String currencyCode;
        SymbolInfoEntity symbolInfo = ((UiState) getState()).getSymbolInfo();
        if (symbolInfo != null) {
            final TradeSymbolBalance tradeBalance = ((UiState) getState()).getTradeBalance();
            if (tradeBalance == null) {
                tradeBalance = C46135i.m101679b(symbolInfo);
            }
            String currencyCode2 = null;
            if (balanceData != null) {
                currencyCode = balanceData.getCurrencyCode();
            } else {
                currencyCode = null;
            }
            if (Intrinsics.areEqual(currencyCode, symbolInfo.getBaseCurrency())) {
                updateState(new Function1() { // from class: com.kubi.core.biz.submit.u1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradeSubmitVM.m22427U0(tradeBalance, balanceData, (UiState) obj);
                    }
                });
                TradeSymbolBalanceExtKt.m22499l(this);
            }
            if (balanceData != null) {
                currencyCode2 = balanceData.getCurrencyCode();
            }
            if (Intrinsics.areEqual(currencyCode2, symbolInfo.getQuoteCurrency())) {
                updateState(new Function1() { // from class: com.kubi.core.biz.submit.v1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradeSubmitVM.m22429V0(tradeBalance, balanceData, (UiState) obj);
                    }
                });
                TradeSymbolBalanceExtKt.m22499l(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final Pair<TradeType, List<TradeTypeUiData>> m22467a0(boolean z11) {
        boolean z12;
        List<TradeTypeUiData> listMo22540d = m22477z0().mo22540d(z11);
        TradeType tradeType = ((UiState) getState()).getTradeType();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo22540d, 10));
        Iterator<T> it = listMo22540d.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeTypeUiData) it.next()).getF20771b());
        }
        if (!CollectionsKt.contains(arrayList, tradeType)) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo22540d, 10));
            Iterator<T> it2 = listMo22540d.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((TradeTypeUiData) it2.next()).getF20771b());
            }
            tradeType = (TradeType) CollectionsKt.firstOrNull((List) arrayList2);
            if (tradeType == null) {
                tradeType = TradeType.LIMIT;
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo22540d, 10));
        for (TradeTypeUiData tradeTypeUiData : listMo22540d) {
            if (tradeTypeUiData.getF20771b() == tradeType) {
                z12 = true;
            } else {
                z12 = false;
            }
            arrayList3.add(tradeTypeUiData.mo22633c(z12));
        }
        if (tradeType == null) {
            tradeType = TradeType.LIMIT;
        }
        return new Pair<>(tradeType, arrayList3);
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f20656c0.clear();
        this.f20657d0.clear();
        m22466Z();
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> m22475p0() {
        return m22477z0().mo22538b();
    }
}
