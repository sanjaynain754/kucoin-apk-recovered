package com.kubi.spot.business.callAuction;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.reflect.TypeToken;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.utils.C27099x;
import com.kubi.utils.ThemisUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import f30.C37334e;
import g10.C37781l;
import h20.InterfaceC38090d;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import w20.C45700a;

/* JADX INFO: compiled from: TradeSubmitCallAuctionVM.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0013J\u0016\u00101\u001a\u00020.2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0013J\u0018\u00102\u001a\u00020.2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0013H\u0002J\u0018\u00103\u001a\u00020.2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0013H\u0002J\u0010\u00104\u001a\u00020.2\u0006\u0010/\u001a\u00020\nH\u0002J\u0018\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0002J\u0018\u00107\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0013H\u0002J\u000e\u00108\u001a\u00020.2\u0006\u00100\u001a\u00020\u0013J\u0010\u00109\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\nJ\u0018\u0010:\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\n2\u0006\u0010;\u001a\u00020\u0013J\u0006\u0010<\u001a\u00020.R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\fR\u001b\u0010\u001c\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\fR#\u0010\u001f\u001a\n !*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/TradeSubmitCallAuctionVM;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "recommendNewCoinEntityLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/data/entity/OrderBookEntity;", "getRecommendNewCoinEntityLiveData", "()Landroidx/lifecycle/MutableLiveData;", "oldTopic", "", "getOldTopic", "()Ljava/lang/String;", "setOldTopic", "(Ljava/lang/String;)V", "oldSymbol", "getOldSymbol", "setOldSymbol", "oldPrecision", "", "getOldPrecision", "()I", "setOldPrecision", "(I)V", "topic", "getTopic", "topic$delegate", "Lkotlin/Lazy;", "callAuctionTopic", "getCallAuctionTopic", "callAuctionTopic$delegate", "apiRequest", "Lcom/kubi/spot/business/callAuction/api/ICallAuctionSocketRequest;", "kotlin.jvm.PlatformType", "getApiRequest", "()Lcom/kubi/spot/business/callAuction/api/ICallAuctionSocketRequest;", "apiRequest$delegate", "oldRequest", "Lokhttp3/Request;", "getOldRequest", "()Lokhttp3/Request;", "setOldRequest", "(Lokhttp3/Request;)V", "orderBookDisposable", "Lio/reactivex/disposables/Disposable;", "registerWsData", "", "symbol", "precision", "reload", "socketObserver", "bindSpotMarketOrderBook", "bindSpotCallAuctionOrderBook", "handleOrderBookEntity", "srcOrderEntity", "getCurrentSymbols", "changePrecision", "release", "resetSymbolAndPrecision", "lastPrecision", "unBindSocket", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nTradeSubmitCallAuctionVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSubmitCallAuctionVM.kt\ncom/kubi/spot/business/callAuction/TradeSubmitCallAuctionVM\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n+ 3 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n+ 4 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,244:1\n8#2,2:245\n8#2,2:247\n8#2,2:249\n8#2,2:251\n8#2,2:253\n8#2,2:255\n8#2,2:257\n220#3,2:259\n58#4,6:261\n64#4,2:268\n58#4,6:278\n64#4,2:285\n126#5:267\n126#5:284\n1#6:270\n43#7,7:271\n43#7,7:287\n*S KotlinDebug\n*F\n+ 1 TradeSubmitCallAuctionVM.kt\ncom/kubi/spot/business/callAuction/TradeSubmitCallAuctionVM\n*L\n64#1:245,2\n71#1:247,2\n81#1:249,2\n180#1:251,2\n198#1:253,2\n210#1:255,2\n231#1:257,2\n239#1:259,2\n126#1:261,6\n126#1:268,2\n150#1:278,6\n150#1:285,2\n126#1:267\n150#1:284\n138#1:271,7\n161#1:287,7\n*E\n"})
public final class TradeSubmitCallAuctionVM extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<OrderBookEntity> f49807V = new MutableLiveData<>();

    /* JADX INFO: renamed from: W */
    @NotNull
    public String f49808W = "";

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f49809X = "";

    /* JADX INFO: renamed from: Y */
    public int f49810Y = 8;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f49811Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.callAuction.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitCallAuctionVM.m60420O0();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f49812a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.callAuction.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitCallAuctionVM.m60459x0();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f49813b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.callAuction.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitCallAuctionVM.m60423R();
        }
    });

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public Request f49814c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public Disposable f49815d0;

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.TradeSubmitCallAuctionVM$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C24704a extends TypeToken<OrderBookEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.TradeSubmitCallAuctionVM$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C24705b extends TypeToken<OrderBookEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.TradeSubmitCallAuctionVM$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TradeSubmitCallAuctionVM.kt\ncom/kubi/spot/business/callAuction/TradeSubmitCallAuctionVM\n*L\n1#1,328:1\n173#2:329\n*E\n"})
    public static final class C24706c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.TradeSubmitCallAuctionVM$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TradeSubmitCallAuctionVM.kt\ncom/kubi/spot/business/callAuction/TradeSubmitCallAuctionVM\n*L\n1#1,328:1\n175#2:329\n*E\n"})
    public static final class C24707d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final String m60400A0() {
        return (String) this.f49812a0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public final String m60402B0(String str, int i11) {
        if (ThemisUtils.f54260a.m66413b() || CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null)) {
            return C27041f.m66668h(str);
        }
        return C27041f.m66668h(str) + '_' + i11;
    }

    /* JADX INFO: renamed from: F0 */
    private final String m60407F0() {
        return (String) this.f49811Z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public final String m60409G0(String str) {
        String strM60407F0;
        if (CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null)) {
            C44128b.m97266j("trade|Spot|TradeSubmitCallAuctionVM", "集合竞价状态-getTopic");
            strM60407F0 = m60400A0();
        } else {
            strM60407F0 = m60407F0();
        }
        return DowngradeExKt.m66551u(strM60407F0, new Object[]{str}, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final void m60411H0(OrderBookEntity orderBookEntity, String str) {
        List listSortedWith;
        List listSortedWith2;
        OrderBookEntity value = this.f49807V.getValue();
        List<double[]> mutableList = null;
        long jM66652l = C27039d.m66652l(value != null ? Long.valueOf(value.getSequence()) : null);
        long sequence = orderBookEntity.getSequence();
        boolean z11 = 0 <= sequence && sequence < jM66652l;
        boolean z12 = (TextUtils.isEmpty(orderBookEntity.getSymbol()) || Intrinsics.areEqual(orderBookEntity.getSymbol(), str)) ? false : true;
        if (z11 && z12) {
            return;
        }
        List<double[]> asks = orderBookEntity.getAsks();
        orderBookEntity.setAsks((asks == null || (listSortedWith2 = CollectionsKt.sortedWith(asks, new C24706c())) == null) ? null : CollectionsKt.toMutableList((Collection) listSortedWith2));
        List<double[]> bids = orderBookEntity.getBids();
        if (bids != null && (listSortedWith = CollectionsKt.sortedWith(bids, new C24707d())) != null) {
            mutableList = CollectionsKt.toMutableList((Collection) listSortedWith);
        }
        orderBookEntity.setBids(mutableList);
        C37334e.m83919a(this.f49807V, orderBookEntity);
    }

    /* JADX INFO: renamed from: N0 */
    private final void m60418N0(String str, int i11) {
        String str2;
        Request requestM85996d;
        boolean zM21636i = CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null);
        if (zM21636i) {
            C44128b.m97266j("trade|Spot|TradeSubmitCallAuctionVM", "集合竞价状态-socketObserver");
            requestM85996d = InterfaceC38090d.m85997e(m60462z0(), str, null, null, 6, null);
            str2 = str;
        } else {
            str2 = str;
            requestM85996d = InterfaceC38090d.m85996d(m60462z0(), str2, null, String.valueOf(i11), 2, null);
        }
        this.f49814c0 = requestM85996d;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new TradeSubmitCallAuctionVM$socketObserver$1(this, str2, i11, zM21636i, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final String m60420O0() {
        return ThemisUtils.f54260a.m66413b() ? "/spotMarket/level2Depth50_1s:%s" : "/spotMarket/level2Depth50:%s";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final void m60424S(final String str) {
        Request request = this.f49814c0;
        if (request == null) {
            return;
        }
        Disposable disposable = this.f49815d0;
        if (disposable != null) {
            disposable.dispose();
        }
        com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(request, new String[0]), companion.unsubscribe(request, new String[0]), null, true, null, 20, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.callAuction.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeSubmitCallAuctionVM.m60425T((Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.spot.business.callAuction.d0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeSubmitCallAuctionVM.m60426U(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.callAuction.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m60427V((Message) obj);
            }
        };
        Observable<R> map = observableFilter.map(new Function() { // from class: com.kubi.spot.business.callAuction.f0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeSubmitCallAuctionVM.m60428W(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.callAuction.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m60429X((OrderBookEntity) obj);
            }
        };
        Observable observableMerge = Observable.merge(map.flatMap(new Function() { // from class: com.kubi.spot.business.callAuction.h0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeSubmitCallAuctionVM.m60430Y(function3, obj);
            }
        }), SpotMarketSocketAdapter.m32656x(SpotMarketSocketAdapter.f28144a, str, ThemisUtils.f54260a.m66413b(), false, new Function0() { // from class: com.kubi.spot.business.callAuction.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSubmitCallAuctionVM.m60431Z();
            }
        }, 4, null));
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.business.callAuction.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m60432a0(this.f49859b, str, (OrderBookEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.callAuction.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitCallAuctionVM.m60433b0(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.spot.business.callAuction.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m60434c0((Throwable) obj);
            }
        };
        this.f49815d0 = observableMerge.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.callAuction.c0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitCallAuctionVM.m60435d0(function5, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final boolean m60425T(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "heartbeat");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final boolean m60426U(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final OrderBookEntity m60427V(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data = it.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C24704a().getType());
            } catch (Throwable unused) {
            }
        }
        return (OrderBookEntity) objM66914d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final OrderBookEntity m60428W(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (OrderBookEntity) function1.invoke(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final ObservableSource m60429X(OrderBookEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Observable observableJust = Observable.just(entity);
        return observableJust != null ? observableJust : Observable.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final ObservableSource m60430Y(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final void m60436e0(final String str, int i11) {
        Request request = this.f49814c0;
        if (request == null) {
            return;
        }
        Disposable disposable = this.f49815d0;
        if (disposable != null) {
            disposable.dispose();
        }
        com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(request, new String[0]), companion.unsubscribe(request, new String[0]), null, true, null, 20, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.callAuction.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeSubmitCallAuctionVM.m60442l0((Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.spot.business.callAuction.q
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeSubmitCallAuctionVM.m60443m0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.callAuction.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m60445n0((Message) obj);
            }
        };
        Observable<R> map = observableFilter.map(new Function() { // from class: com.kubi.spot.business.callAuction.s
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeSubmitCallAuctionVM.m60447o0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.callAuction.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m60449p0((OrderBookEntity) obj);
            }
        };
        Observable observableMerge = Observable.merge(map.flatMap(new Function() { // from class: com.kubi.spot.business.callAuction.v
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeSubmitCallAuctionVM.m60451q0(function3, obj);
            }
        }), SpotMarketSocketAdapter.m32628Q(SpotMarketSocketAdapter.f28144a, str, i11, ThemisUtils.f54260a.m66413b(), false, new Function0() { // from class: com.kubi.spot.business.callAuction.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSubmitCallAuctionVM.m60437f0();
            }
        }, 8, null));
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.business.callAuction.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m60438g0(this.f49889b, str, (OrderBookEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.callAuction.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitCallAuctionVM.m60439h0(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.spot.business.callAuction.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m60440i0((Throwable) obj);
            }
        };
        this.f49815d0 = observableMerge.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.callAuction.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitCallAuctionVM.m60441j0(function5, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final boolean m60442l0(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "heartbeat");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final boolean m60443m0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final OrderBookEntity m60445n0(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data = it.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C24705b().getType());
            } catch (Throwable unused) {
            }
        }
        return (OrderBookEntity) objM66914d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final OrderBookEntity m60447o0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (OrderBookEntity) function1.invoke(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final ObservableSource m60449p0(OrderBookEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Observable observableJust = Observable.just(entity);
        return observableJust != null ? observableJust : Observable.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final ObservableSource m60451q0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final String m60459x0() {
        return ThemisUtils.f54260a.m66413b() ? "/spotCallAuction/level2Second:%s" : "/spotCallAuction/level2:%s";
    }

    /* JADX INFO: renamed from: z0 */
    private final InterfaceC38090d m60462z0() {
        return (InterfaceC38090d) this.f49813b0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: C0, reason: from getter */
    public final Request getF49814c0() {
        return this.f49814c0;
    }

    @NotNull
    /* JADX INFO: renamed from: D0, reason: from getter */
    public final String getF49808W() {
        return this.f49808W;
    }

    @NotNull
    /* JADX INFO: renamed from: E0 */
    public final MutableLiveData<OrderBookEntity> m60465E0() {
        return this.f49807V;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m60466I0(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C44128b.m97266j("trade|Spot|TradeSubmitCallAuctionVM", "registerWsData：CallAuctionState：" + CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null));
        if (Intrinsics.areEqual(this.f49808W, m60409G0(m60402B0(symbol, i11)))) {
            return;
        }
        m60468K0(symbol, i11);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m60467J0(@Nullable String str) {
        C44128b.m97266j("trade|Spot|TradeSubmitCallAuctionVM", "release：CallAuctionState：" + CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null));
        OrderBookEntity orderBookEntity = new OrderBookEntity(null, 0L, null, null, 0L, 31, null);
        orderBookEntity.clear(C27041f.m66668h(str));
        C37334e.m83919a(this.f49807V, orderBookEntity);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m60468K0(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C44128b.m97266j("trade|Spot|TradeSubmitCallAuctionVM", "reload：CallAuctionState：" + CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null));
        m60471P0();
        this.f49809X = symbol;
        this.f49810Y = i11;
        m60418N0(symbol, i11);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m60470M0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f49808W = str;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m60471P0() {
        C44128b.m97266j("trade|Spot|TradeSubmitCallAuctionVM", "unBindSocket：CallAuctionState：" + CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null));
        Disposable disposable = this.f49815d0;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f49815d0 = null;
        if (this.f49808W.length() > 0) {
            C37781l.f85093a.m85213c(this.f49808W, this);
            this.f49808W = "";
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m60472y0(int i11) {
        C44128b.m97266j("trade|Spot|TradeSubmitCallAuctionVM", "changePrecision：CallAuctionState：" + CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null));
        OrderBookEntity orderBookEntity = new OrderBookEntity(null, 0L, null, null, 0L, 31, null);
        orderBookEntity.clear(C27041f.m66668h(this.f49809X));
        C37334e.m83919a(this.f49807V, orderBookEntity);
        m60468K0(this.f49809X, i11);
    }

    /* JADX INFO: renamed from: R */
    public static final InterfaceC38090d m60423R() {
        return (InterfaceC38090d) C42597a.m93390f().create(InterfaceC38090d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final Observable m60431Z() {
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m60432a0(TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM, String str, OrderBookEntity orderBookEntity) {
        Intrinsics.checkNotNull(orderBookEntity);
        tradeSubmitCallAuctionVM.m60411H0(orderBookEntity, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m60433b0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final Unit m60434c0(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C45700a.m100877c(th2, "TradeSubmitCallAuctionVM");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final void m60435d0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final Observable m60437f0() {
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m60438g0(TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM, String str, OrderBookEntity orderBookEntity) {
        Intrinsics.checkNotNull(orderBookEntity);
        tradeSubmitCallAuctionVM.m60411H0(orderBookEntity, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m60439h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final Unit m60440i0(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C45700a.m100877c(th2, "TradeSubmitCallAuctionVM");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m60441j0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m60469L0(@Nullable String str, int i11) {
        m60471P0();
        if (str != null) {
            this.f49809X = str;
        }
        this.f49810Y = i11;
    }
}
