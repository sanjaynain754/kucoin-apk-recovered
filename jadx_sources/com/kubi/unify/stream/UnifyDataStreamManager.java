package com.kubi.unify.stream;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.unify.UnifyGlobalDataManager;
import com.kubi.unify.entity.CDRConfigEntity;
import com.kubi.unify.entity.UnifyBalanceEntity;
import com.kubi.unify.entity.UnifyFundsInfoEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import com.kubi.unify.utils.UnifyCoroutineScope;
import com.kubi.unify.utils.UnifyCoroutineScopeKt;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.user.model.AccountState;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: UnifyDataStreamManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0005J\b\u0010*\u001a\u00020&H\u0002J\u0006\u0010+\u001a\u00020&J\u0006\u0010,\u001a\u00020&J\u0006\u0010-\u001a\u00020&J\u0006\u0010.\u001a\u00020&J\u000e\u0010/\u001a\u00020&2\u0006\u00100\u001a\u000201J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0002J\b\u00104\u001a\u00020&H\u0002J\u0016\u00105\u001a\u00020&2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000507H\u0002J\u0006\u00108\u001a\u00020&J\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010<\u001a\u00020\u0005J\u0006\u0010=\u001a\u00020&J\u0012\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00140:J\b\u0010@\u001a\u00020&H\u0002J\u0006\u0010A\u001a\u00020&J\b\u0010B\u001a\u00020&H\u0002J\b\u0010C\u001a\u00020&H\u0002J\u0006\u0010D\u001a\u00020&J\u0014\u0010E\u001a\u00020&2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001f\u0010 R#\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050#0\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\f¨\u0006G"}, m90084d2 = {"Lcom/kubi/unify/stream/UnifyDataStreamManager;", "", "<init>", "()V", "LOG_TAG", "", "wsScopeMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/Job;", "currencyFuturesSymbol", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getCurrencyFuturesSymbol", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "globalScopeList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "accountEventDisposable", "Lio/reactivex/disposables/Disposable;", "manualPositionRefreshFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lcom/kubi/unify/entity/UnifyPositionEntity;", "dataSourceImpl", "Lcom/kubi/unify/stream/IUnifyNetworkDataSource;", "getDataSourceImpl", "()Lcom/kubi/unify/stream/IUnifyNetworkDataSource;", "dataSourceImpl$delegate", "Lkotlin/Lazy;", "subscribeCount", "stateManager", "Lcom/kubi/unify/stream/UnifiedStateManager;", "getStateManager", "()Lcom/kubi/unify/stream/UnifiedStateManager;", "stateManager$delegate", "indexPriceMap", "", "getIndexPriceMap", "init", "", "startDataFlow", "fromTag", "stopDataFlow", "requestFlowData", "startSpotStream", "startMarginStream", "stopSpotStream", "stopMarginStream", "onLoginStatusChanged", "hasLogin", "", "bindAccountEventState", "bindGlobalStateFlow", "observeIndexPrices", "checkIndexPriceCompleteError", "indexSet", "", "observeOverViewData", "observeFuturesAvailableBalance", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/unify/entity/UnifyBalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "observeFundsInfo", "observeFundsInfoFlow", "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;", "observeFuturesCrossLeverage", "observePositions", "observeMarginCurrencyLeverage", "observeMarginMode", "refreshStreamDataFlow", "emitFreshPositionData", "positions", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyDataStreamManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyDataStreamManager.kt\ncom/kubi/unify/stream/UnifyDataStreamManager\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,314:1\n230#2,5:315\n230#2,5:320\n1#3:325\n1563#4:326\n1634#4,3:327\n1563#4:330\n1634#4,3:331\n*S KotlinDebug\n*F\n+ 1 UnifyDataStreamManager.kt\ncom/kubi/unify/stream/UnifyDataStreamManager\n*L\n90#1:315,5\n107#1:320,5\n222#1:326\n222#1:327,3\n226#1:330\n226#1:331,3\n*E\n"})
public final class UnifyDataStreamManager {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static Disposable f53369e;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UnifyDataStreamManager f53365a = new UnifyDataStreamManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<String, InterfaceC41775x1> f53366b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC41669n<String> f53367c = C41679x.m91009a("XBTUSDTM");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ArrayList<InterfaceC41775x1> f53368d = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final InterfaceC41668m<List<UnifyPositionEntity>> f53370f = C41674s.m91001b(0, 1, null, 5, null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Lazy f53371g = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.stream.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyDataStreamManager.m65340p();
        }
    });

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final InterfaceC41669n<ArrayList<String>> f53372h = C41679x.m91009a(new ArrayList());

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Lazy f53373i = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.stream.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyDataStreamManager.m65326L();
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final InterfaceC41669n<Map<String, String>> f53374j = C41679x.m91009a(MapsKt.emptyMap());

    /* JADX INFO: renamed from: L */
    public static final UnifiedStateManager m65326L() {
        return new UnifiedStateManager();
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m65339m(Throwable th2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final UnifyNetworkDataSourceImpl m65340p() {
        return new UnifyNetworkDataSourceImpl(null, null, null, f53370f, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final void m65342B() {
        ConcurrentHashMap<String, InterfaceC41775x1> concurrentHashMap = f53366b;
        InterfaceC41775x1 interfaceC41775x1 = concurrentHashMap.get("observeMarginCurrencyLeverage");
        int i11 = 1;
        CoroutineContext coroutineContext = null;
        Object[] objArr = 0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        UnifyCoroutineScopeKt.m65462a(UnifyCoroutineScopeKt.m65466e(m65360s().mo65380i(), new UnifyCoroutineScope(coroutineContext, i11, objArr == true ? 1 : 0), new UnifyDataStreamManager$observeMarginCurrencyLeverage$1(null)), "observeMarginCurrencyLeverage", concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final void m65343C() {
        ConcurrentHashMap<String, InterfaceC41775x1> concurrentHashMap = f53366b;
        InterfaceC41775x1 interfaceC41775x1 = concurrentHashMap.get("observeMarginMode");
        int i11 = 1;
        CoroutineContext coroutineContext = null;
        Object[] objArr = 0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        UnifyCoroutineScopeKt.m65462a(UnifyCoroutineScopeKt.m65466e(C41636g.m90896T(m65360s().mo65375d(), new UnifyDataStreamManager$observeMarginMode$1(null)), new UnifyCoroutineScope(coroutineContext, i11, objArr == true ? 1 : 0), new UnifyDataStreamManager$observeMarginMode$2(null)), "observeMarginMode", concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m65344D() {
        ConcurrentHashMap<String, InterfaceC41775x1> concurrentHashMap = f53366b;
        InterfaceC41775x1 interfaceC41775x1 = concurrentHashMap.get("fetchOverViewData");
        int i11 = 1;
        CoroutineContext coroutineContext = null;
        Object[] objArr = 0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        UnifyCoroutineScopeKt.m65462a(UnifyCoroutineScopeKt.m65466e(m65360s().mo65374c(), new UnifyCoroutineScope(coroutineContext, i11, objArr == true ? 1 : 0), new UnifyDataStreamManager$observeOverViewData$1(null)), "fetchOverViewData", concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final void m65345E() {
        ConcurrentHashMap<String, InterfaceC41775x1> concurrentHashMap = f53366b;
        InterfaceC41775x1 interfaceC41775x1 = concurrentHashMap.get("observePositions");
        int i11 = 1;
        CoroutineContext coroutineContext = null;
        Object[] objArr = 0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        UnifyCoroutineScopeKt.m65462a(UnifyCoroutineScopeKt.m65466e(m65360s().mo65377f(), new UnifyCoroutineScope(coroutineContext, i11, objArr == true ? 1 : 0), new UnifyDataStreamManager$observePositions$1(null)), "observePositions", concurrentHashMap);
    }

    /* JADX INFO: renamed from: F */
    public final void m65346F(boolean z11) {
        if (z11) {
            return;
        }
        f53372h.setValue(new ArrayList<>());
        m65352M("onLoginStatusChanged");
        m65362u().m65391a();
    }

    /* JADX INFO: renamed from: H */
    public final void m65348H() {
        UnifyCoroutineScopeKt.m65465d(f53366b);
        m65341A();
        m65345E();
        m65364w();
        m65367z();
        m65344D();
        m65342B();
        m65343C();
    }

    /* JADX INFO: renamed from: I */
    public final void m65349I(@NotNull String fromTag) {
        ArrayList<String> value;
        ArrayList<String> arrayList;
        Intrinsics.checkNotNullParameter(fromTag, "fromTag");
        if (UserInfo.a.n()) {
            synchronized (this) {
                try {
                    InterfaceC41669n<ArrayList<String>> interfaceC41669n = f53372h;
                    do {
                        value = interfaceC41669n.getValue();
                        arrayList = new ArrayList<>(value);
                        if (arrayList.isEmpty()) {
                            f53365a.m65348H();
                        }
                        arrayList.add(fromTag);
                        C44128b.m97266j("UDSM", "startDataFlow-当前订阅数：" + CollectionsKt.joinToString$default(arrayList, "->", null, null, 0, null, null, 62, null));
                    } while (!interfaceC41669n.compareAndSet(value, arrayList));
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m65351K() {
        UnifyCoroutineScopeKt.m65465d(f53366b);
        m65341A();
        m65345E();
        m65364w();
        m65344D();
    }

    /* JADX INFO: renamed from: M */
    public final void m65352M(@NotNull final String fromTag) {
        ArrayList<String> value;
        ArrayList<String> arrayList;
        Intrinsics.checkNotNullParameter(fromTag, "fromTag");
        synchronized (this) {
            try {
                InterfaceC41669n<ArrayList<String>> interfaceC41669n = f53372h;
                do {
                    value = interfaceC41669n.getValue();
                    arrayList = new ArrayList<>(value);
                    CollectionsKt.removeAll((List) arrayList, new Function1() { // from class: com.kubi.unify.stream.i
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(UnifyDataStreamManager.m65327N(fromTag, (String) obj));
                        }
                    });
                    if (arrayList.isEmpty()) {
                        UnifyCoroutineScopeKt.m65465d(f53366b);
                        f53365a.m65362u().m65395e().setValue(Boolean.FALSE);
                    }
                    C44128b.m97266j("UDSM", "stopDataFlow-当前订阅数：" + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
                } while (!interfaceC41669n.compareAndSet(value, arrayList));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m65354P() {
        UnifyCoroutineScopeKt.m65465d(f53366b);
    }

    /* JADX INFO: renamed from: i */
    public final void m65355i() {
        Disposable disposable = f53369e;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.unify.stream.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyDataStreamManager.m65337k((AccountEventState) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.unify.stream.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifyDataStreamManager.m65338l(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.unify.stream.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyDataStreamManager.m65339m((Throwable) obj);
            }
        };
        f53369e = observableA.subscribe(consumer, new Consumer() { // from class: com.kubi.unify.stream.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifyDataStreamManager.m65336j(function2, obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final void m65356n() {
        ArrayList<InterfaceC41775x1> arrayList = f53368d;
        UnifyCoroutineScopeKt.m65464c(arrayList);
        UnifyCoroutineScopeKt.m65463b(UnifyCoroutineScopeKt.m65466e(m65360s().mo65372a(), new UnifyCoroutineScope(null, 1, 0 == true ? 1 : 0), new UnifyDataStreamManager$bindGlobalStateFlow$1(null)), arrayList);
    }

    /* JADX INFO: renamed from: o */
    public final void m65357o(Set<String> set) {
        List<CDRConfigEntity> value = UnifyGlobalDataManager.f53084a.m64883u().getValue();
        if (value.isEmpty()) {
            value = null;
        }
        List<CDRConfigEntity> list = value;
        if (list != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CDRConfigEntity) it.next()).getCurrency());
            }
            Set set2 = CollectionsKt.toSet(arrayList);
            if (set2 == null || f53365a.m65362u().m65395e().getValue().booleanValue()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StringsKt.replace$default((String) it2.next(), "-USDT", "", false, 4, (Object) null));
            }
            Set mutableSet = CollectionsKt.toMutableSet(arrayList2);
            mutableSet.add("USDT");
            if (SetsKt.minus(set2, (Iterable) mutableSet).isEmpty()) {
                return;
            }
            C44128b.m97266j("UDSM-observeIndexPrices", SetsKt.minus(set2, (Iterable) mutableSet) + "指数价格未匹配完全，请检查配置");
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m65358q(@NotNull List<UnifyPositionEntity> positions) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        m65362u().m65403m(positions);
        f53370f.mo90855d(positions);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final InterfaceC41669n<String> m65359r() {
        return f53367c;
    }

    /* JADX INFO: renamed from: s */
    public final IUnifyNetworkDataSource m65360s() {
        return (IUnifyNetworkDataSource) f53371g.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final InterfaceC41669n<Map<String, String>> m65361t() {
        return f53374j;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final UnifiedStateManager m65362u() {
        return (UnifiedStateManager) f53373i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final void m65364w() {
        ConcurrentHashMap<String, InterfaceC41775x1> concurrentHashMap = f53366b;
        InterfaceC41775x1 interfaceC41775x1 = concurrentHashMap.get("observeFundsInfo");
        int i11 = 1;
        CoroutineContext coroutineContext = null;
        Object[] objArr = 0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        UnifyCoroutineScopeKt.m65462a(UnifyCoroutineScopeKt.m65466e(m65360s().mo65376e(), new UnifyCoroutineScope(coroutineContext, i11, objArr == true ? 1 : 0), new UnifyDataStreamManager$observeFundsInfo$1(null)), "observeFundsInfo", concurrentHashMap);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final InterfaceC41634e<UnifyBalanceEntity> m65366y(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return m65360s().mo65379h(C27041f.m66668h(C27041f.m66677q(currency)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public final void m65367z() {
        ConcurrentHashMap<String, InterfaceC41775x1> concurrentHashMap = f53366b;
        InterfaceC41775x1 interfaceC41775x1 = concurrentHashMap.get("observeFuturesCrossLeverage");
        int i11 = 1;
        CoroutineContext coroutineContext = null;
        Object[] objArr = 0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        UnifyCoroutineScopeKt.m65462a(UnifyCoroutineScopeKt.m65466e(C41636g.m90896T(m65360s().mo65373b(), new UnifyDataStreamManager$observeFuturesCrossLeverage$1(null)), new UnifyCoroutineScope(coroutineContext, i11, objArr == true ? 1 : 0), new UnifyDataStreamManager$observeFuturesCrossLeverage$2(null)), "observeFuturesCrossLeverage", concurrentHashMap);
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m65327N(String str, String str2) {
        return Intrinsics.areEqual(str2, str);
    }

    /* JADX INFO: renamed from: j */
    public static final void m65336j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m65337k(AccountEventState accountEventState) {
        if (accountEventState.getState() == AccountState.SwitchAccount || accountEventState.getState() == AccountState.Login) {
            UnifyDataStreamManager unifyDataStreamManager = f53365a;
            unifyDataStreamManager.m65362u().m65391a();
            if (!f53372h.getValue().isEmpty() && UserInfo.a.n()) {
                unifyDataStreamManager.m65348H();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m65338l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final void m65341A() {
        UnifyCoroutineScopeKt.m65462a(UnifyCoroutineScopeKt.m65466e(m65360s().mo65378g(), new UnifyCoroutineScope(null, 1, 0 == true ? 1 : 0), new UnifyDataStreamManager$observeIndexPrices$1(null)), "observeIndexPrices", f53366b);
    }

    /* JADX INFO: renamed from: G */
    public final void m65347G() {
        m65348H();
    }

    /* JADX INFO: renamed from: J */
    public final void m65350J() {
        m65351K();
        m65342B();
    }

    /* JADX INFO: renamed from: O */
    public final void m65353O() {
        m65354P();
    }

    /* JADX INFO: renamed from: v */
    public final void m65363v() {
        m65356n();
        m65355i();
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final InterfaceC41634e<List<UnifyFundsInfoEntity>> m65365x() {
        return m65360s().mo65376e();
    }
}
