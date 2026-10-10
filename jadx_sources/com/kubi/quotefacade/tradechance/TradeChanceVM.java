package com.kubi.quotefacade.tradechance;

import android.annotation.SuppressLint;
import com.kubi.config.exception.KCConfigException;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.network.restful.C19321b;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.ChanceDiscoverConfig;
import com.kubi.quotefacade.entity.ChanceHotRankEntity;
import com.kubi.quotefacade.entity.ChanceMarketChangeEntity;
import com.kubi.quotefacade.entity.ChancePlateEntity;
import com.kubi.quotefacade.entity.ChanceWhaleEntity;
import com.kubi.quotefacade.tradechance.utils.C22586f;
import com.kubi.quotefacade.tradechance.utils.QuoteCloseableCoroutineScope;
import com.kubi.quotefacade.tradechance.utils.TradeChanceRemoteConfig;
import com.kubi.utils.C27059l;
import com.kubi.utils.C27100x0;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p844zu.InterfaceC46926c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TradeChanceVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0094@¢\u0006\u0002\u00100J\u000e\u00101\u001a\u00020-H\u0083@¢\u0006\u0002\u00102J\u0016\u00103\u001a\u00020-2\f\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0002J\b\u00107\u001a\u00020-H\u0002J\u0010\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020'H\u0002J\u0016\u0010:\u001a\u00020-2\f\u00104\u001a\b\u0012\u0004\u0012\u0002060;H\u0002J\b\u0010>\u001a\u00020=H\u0002JI\u0010?\u001a\u00020-*\u00020@2\u0006\u0010A\u001a\u00020\u00122\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C052\u001c\u0010D\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0F\u0012\u0006\u0012\u0004\u0018\u00010G0EH\u0002¢\u0006\u0002\u0010HJ\u0010\u0010I\u001a\u0004\u0018\u00010#H\u0082@¢\u0006\u0002\u00102J\u0010\u0010J\u001a\u0004\u0018\u00010KH\u0082@¢\u0006\u0002\u00102J\u0010\u0010L\u001a\u0004\u0018\u00010MH\u0082@¢\u0006\u0002\u00102J\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010;2\u0006\u0010P\u001a\u00020&H\u0082@¢\u0006\u0002\u0010QJ\u001e\u0010R\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010;2\u0006\u0010P\u001a\u00020&H\u0082@¢\u0006\u0002\u0010QJ\u0010\u0010T\u001a\u0004\u0018\u00010UH\u0082@¢\u0006\u0002\u00102J\b\u0010V\u001a\u00020-H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0018\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001b\u0010\u0014R\u001b\u0010\u001d\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001e\u0010\u0014R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010$\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'`(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/TradeChanceVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/tradechance/TradeChanceContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/quotefacade/api/ITradeChanceApi;", "wsApi", "getWsApi", "()Lcom/kubi/quotefacade/api/ITradeChanceApi;", "wsApi$delegate", "Lkotlin/Lazy;", "wsIoScope", "Lcom/kubi/quotefacade/tradechance/utils/QuoteCloseableCoroutineScope;", "loopQuerySccope", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "enablePlate", "", "getEnablePlate", "()Z", "enablePlate$delegate", "enableGemBox", "enableMarketChange", "getEnableMarketChange", "enableMarketChange$delegate", "enableWhale", "getEnableWhale", "enableWhale$delegate", "enableHotRank", "getEnableHotRank", "enableHotRank$delegate", "isFirstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mainConfig", "Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;", "tabsMap", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "initState", "getInitState", "()Lcom/kubi/quotefacade/tradechance/TradeChanceContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyUI", "dataList", "", "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;", "createTabsMap", "str", "resId", "subscribeWs", "", "repeatJob", "Lkotlinx/coroutines/Job;", "launchRepeatCall", "addAsync", "Lkotlinx/coroutines/CoroutineScope;", "enbale", "list", "Lkotlinx/coroutines/Deferred;", "handle", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/CoroutineScope;ZLjava/util/List;Lkotlin/jvm/functions/Function1;)V", "configData", "plateData", "Lcom/kubi/quotefacade/entity/ChancePlateEntity;", "gemboxData", "Lcom/kubi/quotefacade/entity/ChanceGemBoxEntity;", "marketChangeData", "Lcom/kubi/quotefacade/entity/ChanceMarketChangeEntity;", "includeMarket", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "whaleData", "Lcom/kubi/quotefacade/entity/ChanceWhaleEntity;", "hotRankData", "Lcom/kubi/quotefacade/entity/ChanceHotRankEntity;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeChanceVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeChanceVM.kt\ncom/kubi/quotefacade/tradechance/TradeChanceVM\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n47#2,4:286\n295#3,2:290\n1011#3,2:293\n808#3,11:295\n1563#3:306\n1634#3,2:307\n346#3,8:309\n1636#3:317\n1#4:292\n*S KotlinDebug\n*F\n+ 1 TradeChanceVM.kt\ncom/kubi/quotefacade/tradechance/TradeChanceVM\n*L\n61#1:286,4\n136#1:290,2\n140#1:293,2\n215#1:295,11\n153#1:306\n153#1:307,2\n154#1:309,8\n153#1:317\n*E\n"})
public final class TradeChanceVM extends AbstractC19291m<TradeChanceContract$UIState> {

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final Companion f42605k0 = new Companion(null);

    /* JADX INFO: renamed from: h0 */
    @Nullable
    public ChanceDiscoverConfig f42616h0;

    /* JADX INFO: renamed from: j0 */
    @Nullable
    public InterfaceC41775x1 f42618j0;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC46926c f42606X = (InterfaceC46926c) RetrofitFlowExKt.m42820a(InterfaceC46926c.class);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f42607Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.tradechance.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeChanceVM.m53071g0();
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final QuoteCloseableCoroutineScope f42608Z = new QuoteCloseableCoroutineScope(C42911a.m94120b());

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final QuoteCloseableCoroutineScope f42609a0 = new QuoteCloseableCoroutineScope(C42911a.m94120b());

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final CoroutineExceptionHandler f42610b0 = new C22538b(CoroutineExceptionHandler.INSTANCE);

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f42611c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.tradechance.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TradeChanceVM.m53063O());
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f42612d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.tradechance.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TradeChanceVM.m53062N());
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f42613e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.tradechance.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TradeChanceVM.m53064P());
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f42614f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.tradechance.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TradeChanceVM.m53061M());
        }
    });

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public AtomicBoolean f42615g0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final LinkedHashMap<String, Integer> f42617i0 = new LinkedHashMap<>();

    /* JADX INFO: compiled from: TradeChanceVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/TradeChanceVM$Companion;", "", "<init>", "()V", "INTERVAL_LOOP_DURATION", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.TradeChanceVM$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TradeChanceVM.kt\ncom/kubi/quotefacade/tradechance/TradeChanceVM\n*L\n1#1,328:1\n140#2:329\n*E\n"})
    public static final class C22537a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ITradeChanceDataItem) t11).getF38450c()), Integer.valueOf(((ITradeChanceDataItem) t12).getF38450c()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.TradeChanceVM$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 TradeChanceVM.kt\ncom/kubi/quotefacade/tradechance/TradeChanceVM\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,49:1\n62#2,2:50\n64#2:54\n44#3,2:52\n*S KotlinDebug\n*F\n+ 1 TradeChanceVM.kt\ncom/kubi/quotefacade/tradechance/TradeChanceVM\n*L\n63#1:52,2\n*E\n"})
    public static final class C22538b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97263g("TradeChanceVM", exception);
            C43846g.m96568c(new KCConfigException(exception, "TradeChanceVM", false, null, 8, null), null, 2, null);
        }

        public C22538b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: L */
    public static final CharSequence m53060L(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m53061M() {
        return TradeChanceRemoteConfig.f42699a.m53251a();
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m53062N() {
        return TradeChanceRemoteConfig.f42699a.m53252b();
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m53063O() {
        return TradeChanceRemoteConfig.f42699a.m53253c();
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m53064P() {
        return TradeChanceRemoteConfig.f42699a.m53254d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: X */
    public final Object m53065X(Continuation<? super Unit> continuation) {
        TradeChanceVM$loadData$1 tradeChanceVM$loadData$1;
        List<ITradeChanceDataItem> list;
        Object next;
        ChanceHotRankEntity entity;
        if (continuation instanceof TradeChanceVM$loadData$1) {
            tradeChanceVM$loadData$1 = (TradeChanceVM$loadData$1) continuation;
            int i11 = tradeChanceVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tradeChanceVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tradeChanceVM$loadData$1 = new TradeChanceVM$loadData$1(this, continuation);
            }
        } else {
            tradeChanceVM$loadData$1 = new TradeChanceVM$loadData$1(this, continuation);
        }
        Object obj = tradeChanceVM$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tradeChanceVM$loadData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            m53087K();
            ArrayList arrayList = new ArrayList();
            CoroutineContext coroutineContextPlus = C42911a.m94120b().plus(this.f42610b0);
            TradeChanceVM$loadData$2 tradeChanceVM$loadData$2 = new TradeChanceVM$loadData$2(this, arrayList, null);
            tradeChanceVM$loadData$1.L$0 = arrayList;
            tradeChanceVM$loadData$1.label = 1;
            if (C41686h.m91049g(coroutineContextPlus, tradeChanceVM$loadData$2, tradeChanceVM$loadData$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) tradeChanceVM$loadData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((ITradeChanceDataItem) next) instanceof ChanceDataHotRank));
        ITradeChanceDataItem iTradeChanceDataItem = (ITradeChanceDataItem) next;
        if (iTradeChanceDataItem != null) {
            ChanceDataHotRank chanceDataHotRank = iTradeChanceDataItem instanceof ChanceDataHotRank ? (ChanceDataHotRank) iTradeChanceDataItem : null;
            if (chanceDataHotRank != null && (entity = chanceDataHotRank.getEntity()) != null) {
                entity.setConfig(this.f42616h0);
            }
        }
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new C22537a());
        }
        m53096Z(list);
        this.f42615g0.set(false);
        m53070e0(list);
        m53094W();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m53066a0(List list, TradeChanceVM tradeChanceVM) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ITradeChanceDataItem iTradeChanceDataItem = (ITradeChanceDataItem) it.next();
            Collection<Integer> collectionValues = tradeChanceVM.f42617i0.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            Iterator<T> it2 = collectionValues.iterator();
            int i11 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i11 = -1;
                    break;
                }
                Object next = it2.next();
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Integer num = (Integer) next;
                int f38450c = iTradeChanceDataItem.getF38450c();
                if (num != null && num.intValue() == f38450c) {
                    break;
                }
                i11++;
            }
            Set<String> setKeySet = tradeChanceVM.f42617i0.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            arrayList.add((String) CollectionsKt.elementAt(setKeySet, i11));
        }
        C22586f.m53265j("notifyUI:isFirstLoad=" + tradeChanceVM.f42615g0 + ", refresh(" + list.size() + "):" + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1() { // from class: com.kubi.quotefacade.tradechance.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeChanceVM.m53067b0((String) obj);
            }
        }, 31, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static final CharSequence m53067b0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: g0 */
    public static final InterfaceC46926c m53071g0() {
        return (InterfaceC46926c) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC46926c.class);
    }

    /* JADX INFO: renamed from: I */
    public final void m53085I(InterfaceC41709m0 interfaceC41709m0, boolean z11, List<InterfaceC41729r0<?>> list, Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        if (z11) {
            list.add(C41696j.m91102b(interfaceC41709m0, null, null, new TradeChanceVM$addAsync$1(function1, null), 3, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: J */
    public final Object m53086J(Continuation<? super ChanceDiscoverConfig> continuation) {
        TradeChanceVM$configData$1 tradeChanceVM$configData$1;
        if (continuation instanceof TradeChanceVM$configData$1) {
            tradeChanceVM$configData$1 = (TradeChanceVM$configData$1) continuation;
            int i11 = tradeChanceVM$configData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tradeChanceVM$configData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tradeChanceVM$configData$1 = new TradeChanceVM$configData$1(this, continuation);
            }
        } else {
            tradeChanceVM$configData$1 = new TradeChanceVM$configData$1(this, continuation);
        }
        TradeChanceVM$configData$1 tradeChanceVM$configData$2 = tradeChanceVM$configData$1;
        Object objM42826g = tradeChanceVM$configData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tradeChanceVM$configData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<ChanceDiscoverConfig> interfaceC41634eM103389e = this.f42606X.m103389e();
            tradeChanceVM$configData$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM103389e, false, null, tradeChanceVM$configData$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        return ((C19334f) objM42826g).m42846a();
    }

    /* JADX INFO: renamed from: K */
    public final void m53087K() {
        if (this.f42615g0.get()) {
            if (m53090S()) {
                this.f42617i0.put(m53098d0(R$string.trade_opportunity_plates_title), 1);
            }
            if (m53089R()) {
                this.f42617i0.put(m53098d0(R$string.market_unusual_action), 3);
            }
            if (m53091T()) {
                this.f42617i0.put(m53098d0(R$string.trade_opportunity_whale_trend_title), 4);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("createTabs:");
            Set<String> setKeySet = this.f42617i0.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            sb2.append(CollectionsKt.joinToString$default(setKeySet, null, null, null, 0, null, new Function1() { // from class: com.kubi.quotefacade.tradechance.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeChanceVM.m53060L((String) obj);
                }
            }, 31, null));
            C22586f.m53265j(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m53088Q() {
        return ((Boolean) this.f42614f0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: R */
    public final boolean m53089R() {
        return ((Boolean) this.f42612d0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: S */
    public final boolean m53090S() {
        return ((Boolean) this.f42611c0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public final boolean m53091T() {
        return ((Boolean) this.f42613e0.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.quotefacade.tradechance.TradeChanceContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public TradeChanceContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.quotefacade.tradechance.TradeChanceContract$UIState
        };
    }

    /* JADX INFO: renamed from: V */
    public final InterfaceC46926c m53093V() {
        return (InterfaceC46926c) this.f42607Y.getValue();
    }

    /* JADX INFO: renamed from: W */
    public final InterfaceC41775x1 m53094W() {
        return C41696j.m91104d(this.f42609a0, null, null, new TradeChanceVM$launchRepeatCall$1(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: Y */
    public final Object m53095Y(String str, Continuation<? super List<ChanceMarketChangeEntity>> continuation) {
        TradeChanceVM$marketChangeData$1 tradeChanceVM$marketChangeData$1;
        if (continuation instanceof TradeChanceVM$marketChangeData$1) {
            tradeChanceVM$marketChangeData$1 = (TradeChanceVM$marketChangeData$1) continuation;
            int i11 = tradeChanceVM$marketChangeData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tradeChanceVM$marketChangeData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tradeChanceVM$marketChangeData$1 = new TradeChanceVM$marketChangeData$1(this, continuation);
            }
        } else {
            tradeChanceVM$marketChangeData$1 = new TradeChanceVM$marketChangeData$1(this, continuation);
        }
        TradeChanceVM$marketChangeData$1 tradeChanceVM$marketChangeData$2 = tradeChanceVM$marketChangeData$1;
        Object objM42826g = tradeChanceVM$marketChangeData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tradeChanceVM$marketChangeData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<List<ChanceMarketChangeEntity>> interfaceC41634eM103387c = this.f42606X.m103387c(MapsKt.mapOf(TuplesKt.m90091to("type", "ALL"), TuplesKt.m90091to("excludes", str)));
            tradeChanceVM$marketChangeData$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
            tradeChanceVM$marketChangeData$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM103387c, false, null, tradeChanceVM$marketChangeData$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        return ((C19334f) objM42826g).m42846a();
    }

    /* JADX INFO: renamed from: Z */
    public final void m53096Z(final List<ITradeChanceDataItem> list) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.quotefacade.tradechance.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeChanceVM.m53066a0(list, this);
            }
        });
        if (!this.f42615g0.get()) {
            if (list.isEmpty()) {
                return;
            }
            send(new C22546c(list));
        } else if (list.isEmpty()) {
            send(SingleEvent.C19249e.f35628b);
        } else {
            list.add(new ChanceDataFooter());
            send(new C22547d(this.f42617i0, list));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c0 */
    public final Object m53097c0(Continuation<? super ChancePlateEntity> continuation) {
        TradeChanceVM$plateData$1 tradeChanceVM$plateData$1;
        if (continuation instanceof TradeChanceVM$plateData$1) {
            tradeChanceVM$plateData$1 = (TradeChanceVM$plateData$1) continuation;
            int i11 = tradeChanceVM$plateData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tradeChanceVM$plateData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tradeChanceVM$plateData$1 = new TradeChanceVM$plateData$1(this, continuation);
            }
        } else {
            tradeChanceVM$plateData$1 = new TradeChanceVM$plateData$1(this, continuation);
        }
        TradeChanceVM$plateData$1 tradeChanceVM$plateData$2 = tradeChanceVM$plateData$1;
        Object objM42826g = tradeChanceVM$plateData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tradeChanceVM$plateData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<ChancePlateEntity> interfaceC41634eM103385a = this.f42606X.m103385a();
            tradeChanceVM$plateData$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM103385a, false, null, tradeChanceVM$plateData$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        return ((C19334f) objM42826g).m42846a();
    }

    /* JADX INFO: renamed from: d0 */
    public final String m53098d0(int i11) {
        String string = C27059l.f54343a.m66757a().getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (!(interfaceC19282d instanceof TradeChanceContract$UiIntent.LoadData)) {
            return Unit.INSTANCE;
        }
        Object objM53065X = m53065X(continuation);
        return objM53065X == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM53065X : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f0 */
    public final Object m53099f0(String str, Continuation<? super List<ChanceWhaleEntity>> continuation) {
        TradeChanceVM$whaleData$1 tradeChanceVM$whaleData$1;
        if (continuation instanceof TradeChanceVM$whaleData$1) {
            tradeChanceVM$whaleData$1 = (TradeChanceVM$whaleData$1) continuation;
            int i11 = tradeChanceVM$whaleData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tradeChanceVM$whaleData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tradeChanceVM$whaleData$1 = new TradeChanceVM$whaleData$1(this, continuation);
            }
        } else {
            tradeChanceVM$whaleData$1 = new TradeChanceVM$whaleData$1(this, continuation);
        }
        TradeChanceVM$whaleData$1 tradeChanceVM$whaleData$2 = tradeChanceVM$whaleData$1;
        Object objM42826g = tradeChanceVM$whaleData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tradeChanceVM$whaleData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<List<ChanceWhaleEntity>> interfaceC41634eM103386b = this.f42606X.m103386b(str);
            tradeChanceVM$whaleData$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
            tradeChanceVM$whaleData$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM103386b, false, null, tradeChanceVM$whaleData$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        return ((C19334f) objM42826g).m42846a();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m53070e0(List<? extends ITradeChanceDataItem> list) {
        ChanceHotRankEntity entity;
        if (m53088Q()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ChanceDataHotRank) {
                    arrayList.add(obj);
                }
            }
            ChanceDataHotRank chanceDataHotRank = (ChanceDataHotRank) CollectionsKt.firstOrNull((List) arrayList);
            if (chanceDataHotRank != null) {
                entity = chanceDataHotRank.getEntity();
            } else {
                entity = null;
            }
            if (entity != null) {
                C41696j.m91104d(this.f42608Z, this.f42610b0, null, new TradeChanceVM$subscribeWs$1(this, entity, null), 2, null);
            }
        }
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f42608Z.close();
        this.f42609a0.close();
        InterfaceC41775x1 interfaceC41775x1 = this.f42618j0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f42618j0 = null;
    }
}
