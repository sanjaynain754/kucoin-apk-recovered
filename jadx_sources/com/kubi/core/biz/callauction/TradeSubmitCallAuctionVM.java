package com.kubi.core.biz.callauction;

import af.C0296a;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.reflect.TypeToken;
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
import g10.C37781l;
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
import p427ld.InterfaceC42170a;
import p661ue.C45193a;
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
import ve.C45518a;

/* JADX INFO: compiled from: TradeSubmitCallAuctionVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0018J\u0016\u00106\u001a\u0002032\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0018J\u0018\u00107\u001a\u0002032\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0018H\u0002J\u0018\u00108\u001a\u0002032\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0018H\u0002J\u0010\u00109\u001a\u0002032\u0006\u00104\u001a\u00020\u000fH\u0002J\u0018\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000fH\u0002J\u0018\u0010<\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0018H\u0002J\u000e\u0010=\u001a\u0002032\u0006\u00105\u001a\u00020\u0018J\u0010\u0010>\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010?\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u000f2\u0006\u0010@\u001a\u00020\u0018J\u0006\u0010A\u001a\u000203R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0011R\u001b\u0010!\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0011R#\u0010$\u001a\n &*\u0004\u0018\u00010%0%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b'\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "recommendNewCoinEntityLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/data/entity/OrderBookEntity;", "getRecommendNewCoinEntityLiveData", "()Landroidx/lifecycle/MutableLiveData;", "isMargin", "", "()Z", "setMargin", "(Z)V", "oldTopic", "", "getOldTopic", "()Ljava/lang/String;", "setOldTopic", "(Ljava/lang/String;)V", "oldSymbol", "getOldSymbol", "setOldSymbol", "oldPrecision", "", "getOldPrecision", "()I", "setOldPrecision", "(I)V", "topic", "getTopic", "topic$delegate", "Lkotlin/Lazy;", "callAuctionTopic", "getCallAuctionTopic", "callAuctionTopic$delegate", "apiRequest", "Lcom/kubi/core/biz/callauction/api/ICallAuctionSocketRequest;", "kotlin.jvm.PlatformType", "getApiRequest", "()Lcom/kubi/core/biz/callauction/api/ICallAuctionSocketRequest;", "apiRequest$delegate", "oldRequest", "Lokhttp3/Request;", "getOldRequest", "()Lokhttp3/Request;", "setOldRequest", "(Lokhttp3/Request;)V", "orderBookDisposable", "Lio/reactivex/disposables/Disposable;", "registerWsData", "", "symbol", "precision", "reload", "socketObserver", "bindSpotMarketOrderBook", "bindSpotCallAuctionOrderBook", "handleOrderBookEntity", "srcOrderEntity", "getCurrentSymbols", "changePrecision", "release", "resetSymbolAndPrecision", "lastPrecision", "unBindSocket", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nTradeSubmitCallAuctionVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSubmitCallAuctionVM.kt\ncom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM\n+ 2 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n+ 3 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SpotIssue.kt\ncom/kubi/core/spot/exeption/SpotIssueKt\n*L\n1#1,252:1\n220#2,2:253\n58#3,6:255\n64#3,2:262\n58#3,6:273\n64#3,2:280\n126#4:261\n126#4:279\n1#5:264\n44#6,8:265\n44#6,8:282\n*S KotlinDebug\n*F\n+ 1 TradeSubmitCallAuctionVM.kt\ncom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM\n*L\n247#1:253,2\n127#1:255,6\n127#1:262,2\n151#1:273,6\n151#1:280,2\n127#1:261\n151#1:279\n139#1:265,8\n162#1:282,8\n*E\n"})
public final class TradeSubmitCallAuctionVM extends BaseVM {

    /* JADX INFO: renamed from: W */
    public boolean f20289W;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public Request f20296d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public Disposable f20297e0;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<OrderBookEntity> f20288V = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f20290X = "";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f20291Y = "";

    /* JADX INFO: renamed from: Z */
    public int f20292Z = 8;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f20293a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.callauction.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitCallAuctionVM.m21557K0();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f20294b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.callauction.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitCallAuctionVM.m21587m0();
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f20295c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.callauction.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeSubmitCallAuctionVM.m21559M();
        }
    });

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.TradeSubmitCallAuctionVM$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C11794a extends TypeToken<OrderBookEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.TradeSubmitCallAuctionVM$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C11795b extends TypeToken<OrderBookEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.TradeSubmitCallAuctionVM$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TradeSubmitCallAuctionVM.kt\ncom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM\n*L\n1#1,328:1\n181#2:329\n*E\n"})
    public static final class C11796c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.TradeSubmitCallAuctionVM$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TradeSubmitCallAuctionVM.kt\ncom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM\n*L\n1#1,328:1\n183#2:329\n*E\n"})
    public static final class C11797d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((double[]) t11)[0]), Double.valueOf(-((double[]) t12)[0]));
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static final String m21557K0() {
        return ThemisUtils.f54260a.m66413b() ? "/spotMarket/level2Depth50_1s:%s" : "/spotMarket/level2Depth50:%s";
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m21560O(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "heartbeat");
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m21561P(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    public static final OrderBookEntity m21562Q(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data = it.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C11794a().getType());
            } catch (Throwable unused) {
            }
        }
        return (OrderBookEntity) objM66914d;
    }

    /* JADX INFO: renamed from: R */
    public static final OrderBookEntity m21563R(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (OrderBookEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: S */
    public static final ObservableSource m21564S(OrderBookEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Observable observableJust = Observable.just(entity);
        return observableJust != null ? observableJust : Observable.empty();
    }

    /* JADX INFO: renamed from: T */
    public static final ObservableSource m21565T(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: f0 */
    public static final boolean m21580f0(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "heartbeat");
    }

    /* JADX INFO: renamed from: g0 */
    public static final boolean m21582g0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: h0 */
    public static final OrderBookEntity m21583h0(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data = it.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C11795b().getType());
            } catch (Throwable unused) {
            }
        }
        return (OrderBookEntity) objM66914d;
    }

    /* JADX INFO: renamed from: i0 */
    public static final OrderBookEntity m21584i0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (OrderBookEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: j0 */
    public static final ObservableSource m21585j0(OrderBookEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Observable observableJust = Observable.just(entity);
        return observableJust != null ? observableJust : Observable.empty();
    }

    /* JADX INFO: renamed from: l0 */
    public static final ObservableSource m21586l0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: m0 */
    public static final String m21587m0() {
        return ThemisUtils.f54260a.m66413b() ? "/spotCallAuction/level2Second:%s" : "/spotCallAuction/level2:%s";
    }

    /* JADX INFO: renamed from: A0 */
    public final String m21601A0() {
        return (String) this.f20293a0.getValue();
    }

    /* JADX INFO: renamed from: B0 */
    public final String m21602B0(String str) {
        String strM21601A0;
        if (CallAuctionSwitch.f20317a.m21642h(this.f20289W)) {
            C45518a.m100507a("集合竞价状态-getTopic", "TradeSubmitCallAuctionVM");
            strM21601A0 = m21616p0();
        } else {
            strM21601A0 = m21601A0();
        }
        return DowngradeExKt.m66551u(strM21601A0, new Object[]{str}, null, 2, null);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m21604D0(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C45518a.m100507a("registerWsData：CallAuctionState：" + CallAuctionSwitch.f20317a.m21642h(this.f20289W), "TradeSubmitCallAuctionVM");
        if (Intrinsics.areEqual(this.f20290X, m21602B0(m21617q0(symbol, i11)))) {
            return;
        }
        m21606F0(symbol, i11);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m21605E0(@Nullable String str) {
        C45518a.m100507a("release：CallAuctionState：" + CallAuctionSwitch.f20317a.m21642h(this.f20289W), "TradeSubmitCallAuctionVM");
        OrderBookEntity orderBookEntity = new OrderBookEntity(null, 0L, null, null, 0L, 31, null);
        orderBookEntity.clear(C27041f.m66668h(str));
        C0296a.m1041c(this.f20288V, orderBookEntity);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m21606F0(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C45518a.m100507a("reload：CallAuctionState：" + CallAuctionSwitch.f20317a.m21642h(this.f20289W), "TradeSubmitCallAuctionVM");
        m21611L0();
        this.f20291Y = symbol;
        this.f20292Z = i11;
        m21610J0(symbol, i11);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m21608H0(boolean z11) {
        this.f20289W = z11;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m21609I0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f20290X = str;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m21610J0(String str, int i11) {
        String str2;
        Request requestM92589d;
        boolean zM21642h = CallAuctionSwitch.f20317a.m21642h(this.f20289W);
        if (zM21642h) {
            C45518a.m100507a("集合竞价状态-socketObserver", "TradeSubmitCallAuctionVM");
            requestM92589d = InterfaceC42170a.m92590e(m21615o0(), str, null, null, 6, null);
            str2 = str;
        } else {
            str2 = str;
            requestM92589d = InterfaceC42170a.m92589d(m21615o0(), str2, null, String.valueOf(i11), 2, null);
        }
        this.f20296d0 = requestM92589d;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new TradeSubmitCallAuctionVM$socketObserver$1(this, str2, i11, zM21642h, null), 2, null);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m21611L0() {
        C45518a.m100507a("unBindSocket：CallAuctionState：" + CallAuctionSwitch.f20317a.m21642h(this.f20289W), "TradeSubmitCallAuctionVM");
        Disposable disposable = this.f20297e0;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f20297e0 = null;
        if (this.f20290X.length() > 0) {
            C37781l.f85093a.m85213c(this.f20290X, this);
            this.f20290X = "";
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m21612N(final String str) {
        Request request = this.f20296d0;
        if (request == null) {
            return;
        }
        Disposable disposable = this.f20297e0;
        if (disposable != null) {
            disposable.dispose();
        }
        com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(request, new String[0]), companion.unsubscribe(request, new String[0]), null, true, null, 20, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.core.biz.callauction.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeSubmitCallAuctionVM.m21560O((Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.core.biz.callauction.e0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeSubmitCallAuctionVM.m21561P(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.core.biz.callauction.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m21562Q((Message) obj);
            }
        };
        Observable<R> map = observableFilter.map(new Function() { // from class: com.kubi.core.biz.callauction.g0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeSubmitCallAuctionVM.m21563R(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.core.biz.callauction.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m21564S((OrderBookEntity) obj);
            }
        };
        Observable observableMerge = Observable.merge(map.flatMap(new Function() { // from class: com.kubi.core.biz.callauction.i0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeSubmitCallAuctionVM.m21565T(function3, obj);
            }
        }), SpotMarketSocketAdapter.m32656x(SpotMarketSocketAdapter.f28144a, str, ThemisUtils.f54260a.m66413b(), false, new Function0() { // from class: com.kubi.core.biz.callauction.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSubmitCallAuctionVM.m21566U();
            }
        }, 4, null));
        final Function1 function4 = new Function1() { // from class: com.kubi.core.biz.callauction.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m21567V(this.f20324b, str, (OrderBookEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.core.biz.callauction.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitCallAuctionVM.m21568W(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.core.biz.callauction.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m21569X((Throwable) obj);
            }
        };
        this.f20297e0 = observableMerge.subscribe(consumer, new Consumer() { // from class: com.kubi.core.biz.callauction.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitCallAuctionVM.m21570Y(function5, obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m21613Z(final String str, int i11) {
        Request request = this.f20296d0;
        if (request == null) {
            return;
        }
        Disposable disposable = this.f20297e0;
        if (disposable != null) {
            disposable.dispose();
        }
        com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(request, new String[0]), companion.unsubscribe(request, new String[0]), null, true, null, 20, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.core.biz.callauction.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeSubmitCallAuctionVM.m21580f0((Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.core.biz.callauction.r
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeSubmitCallAuctionVM.m21582g0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.core.biz.callauction.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m21583h0((Message) obj);
            }
        };
        Observable<R> map = observableFilter.map(new Function() { // from class: com.kubi.core.biz.callauction.t
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeSubmitCallAuctionVM.m21584i0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.core.biz.callauction.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m21585j0((OrderBookEntity) obj);
            }
        };
        Observable observableMerge = Observable.merge(map.flatMap(new Function() { // from class: com.kubi.core.biz.callauction.w
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeSubmitCallAuctionVM.m21586l0(function3, obj);
            }
        }), SpotMarketSocketAdapter.m32628Q(SpotMarketSocketAdapter.f28144a, str, i11, ThemisUtils.f54260a.m66413b(), false, new Function0() { // from class: com.kubi.core.biz.callauction.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeSubmitCallAuctionVM.m21571a0();
            }
        }, 8, null));
        final Function1 function4 = new Function1() { // from class: com.kubi.core.biz.callauction.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m21573b0(this.f20354b, str, (OrderBookEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.core.biz.callauction.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitCallAuctionVM.m21574c0(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.core.biz.callauction.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeSubmitCallAuctionVM.m21576d0((Throwable) obj);
            }
        };
        this.f20297e0 = observableMerge.subscribe(consumer, new Consumer() { // from class: com.kubi.core.biz.callauction.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeSubmitCallAuctionVM.m21578e0(function5, obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m21614n0(int i11) {
        C45518a.m100507a("changePrecision：CallAuctionState：" + CallAuctionSwitch.f20317a.m21642h(this.f20289W), "TradeSubmitCallAuctionVM");
        OrderBookEntity orderBookEntity = new OrderBookEntity(null, 0L, null, null, 0L, 31, null);
        orderBookEntity.clear(C27041f.m66668h(this.f20291Y));
        C0296a.m1041c(this.f20288V, orderBookEntity);
        m21606F0(this.f20291Y, i11);
    }

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC42170a m21615o0() {
        return (InterfaceC42170a) this.f20295c0.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    public final String m21616p0() {
        return (String) this.f20294b0.getValue();
    }

    /* JADX INFO: renamed from: q0 */
    public final String m21617q0(String str, int i11) {
        if (ThemisUtils.f54260a.m66413b() || CallAuctionSwitch.f20317a.m21642h(this.f20289W)) {
            return C27041f.m66668h(str);
        }
        return C27041f.m66668h(str) + '_' + i11;
    }

    @Nullable
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final Request getF20296d0() {
        return this.f20296d0;
    }

    @NotNull
    /* JADX INFO: renamed from: y0, reason: from getter */
    public final String getF20290X() {
        return this.f20290X;
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final MutableLiveData<OrderBookEntity> m21620z0() {
        return this.f20288V;
    }

    /* JADX INFO: renamed from: M */
    public static final InterfaceC42170a m21559M() {
        return (InterfaceC42170a) C42597a.m93390f().create(InterfaceC42170a.class);
    }

    /* JADX INFO: renamed from: U */
    public static final Observable m21566U() {
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m21567V(TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM, String str, OrderBookEntity orderBookEntity) {
        Intrinsics.checkNotNull(orderBookEntity);
        tradeSubmitCallAuctionVM.m21603C0(orderBookEntity, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final void m21568W(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m21569X(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C45193a.m99856c(th2, "TradeSubmitCallAuctionVM");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m21570Y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Observable m21571a0() {
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m21573b0(TradeSubmitCallAuctionVM tradeSubmitCallAuctionVM, String str, OrderBookEntity orderBookEntity) {
        Intrinsics.checkNotNull(orderBookEntity);
        tradeSubmitCallAuctionVM.m21603C0(orderBookEntity, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m21574c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m21576d0(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C45193a.m99856c(th2, "TradeSubmitCallAuctionVM");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m21578e0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX INFO: renamed from: C0 */
    public final void m21603C0(OrderBookEntity orderBookEntity, String str) {
        Long lValueOf;
        boolean z11;
        List<double[]> mutableList;
        List listSortedWith;
        List listSortedWith2;
        String symbol;
        if (orderBookEntity.getSymbol().length() == 0) {
            orderBookEntity.setSymbol(str);
        }
        OrderBookEntity value = this.f20288V.getValue();
        List<double[]> mutableList2 = null;
        if (value != null) {
            lValueOf = Long.valueOf(value.getSequence());
        } else {
            lValueOf = null;
        }
        long jM66652l = C27039d.m66652l(lValueOf);
        long sequence = orderBookEntity.getSequence();
        boolean z12 = false;
        if (0 <= sequence && sequence < jM66652l) {
            String symbol2 = orderBookEntity.getSymbol();
            OrderBookEntity value2 = this.f20288V.getValue();
            if (value2 != null) {
                symbol = value2.getSymbol();
            } else {
                symbol = null;
            }
            if (TextUtils.equals(symbol2, symbol)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (!TextUtils.isEmpty(orderBookEntity.getSymbol()) && !TextUtils.isEmpty(this.f20291Y) && !Intrinsics.areEqual(orderBookEntity.getSymbol(), this.f20291Y)) {
            z12 = true;
        }
        if (!z11 && !z12) {
            List<double[]> asks = orderBookEntity.getAsks();
            if (asks != null && (listSortedWith2 = CollectionsKt.sortedWith(asks, new C11796c())) != null) {
                mutableList = CollectionsKt.toMutableList((Collection) listSortedWith2);
            } else {
                mutableList = null;
            }
            orderBookEntity.setAsks(mutableList);
            List<double[]> bids = orderBookEntity.getBids();
            if (bids != null && (listSortedWith = CollectionsKt.sortedWith(bids, new C11797d())) != null) {
                mutableList2 = CollectionsKt.toMutableList((Collection) listSortedWith);
            }
            orderBookEntity.setBids(mutableList2);
            C0296a.m1041c(this.f20288V, orderBookEntity);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m21607G0(@Nullable String str, int i11) {
        m21611L0();
        if (str != null) {
            this.f20291Y = str;
        }
        this.f20292Z = i11;
    }
}
