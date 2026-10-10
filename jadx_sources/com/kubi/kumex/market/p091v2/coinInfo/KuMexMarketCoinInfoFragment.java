package com.kubi.kumex.market.p091v2.coinInfo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.market.p091v2.coinInfo.adapter.MarketCoinInfoAdapter;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfo;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketInfoEntity;
import com.kubi.kumex.market.p091v2.coinInfo.entity.WsMarketTickerStatsEntity;
import com.kubi.kumex.market.p091v2.coinInfo.viewmodel.MarketCoinInfoViewModel;
import com.kubi.kumex.market.p091v2.coinInfo.viewmodel.MarketCoinInfoWrapper;
import com.kubi.kumex.market.p091v2.viewModel.MarketInfoViewModel;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import com.kubi.network.websocket.observable.C19409f;
import com.kubi.resources.C22912t;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36838s2;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p801yl.C46527h0;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: KuMexMarketCoinInfoFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u000bH\u0002J\u0012\u0010,\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010.H\u0003J\u0012\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u000202H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/KuMexMarketCoinInfoFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentMarketCoinInfoBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentMarketCoinInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "marketInfoViewModel", "Lcom/kubi/kumex/market/v2/viewModel/MarketInfoViewModel;", "getMarketInfoViewModel", "()Lcom/kubi/kumex/market/v2/viewModel/MarketInfoViewModel;", "marketInfoViewModel$delegate", "marketCoinInfoViewModel", "Lcom/kubi/kumex/market/v2/coinInfo/viewmodel/MarketCoinInfoViewModel;", "getMarketCoinInfoViewModel", "()Lcom/kubi/kumex/market/v2/coinInfo/viewmodel/MarketCoinInfoViewModel;", "marketCoinInfoViewModel$delegate", "adapter", "Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initRecycleView", "initObserver", "onAgainShow", "subscribe", "symbolCode", "updateAth", "ticker", "Lcom/kubi/kumex/market/v2/coinInfo/entity/WsMarketTickerStatsEntity;", "findAdapterData", "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;", "type", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexMarketCoinInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexMarketCoinInfoFragment.kt\ncom/kubi/kumex/market/v2/coinInfo/KuMexMarketCoinInfoFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,164:1\n147#2,16:165\n106#3,15:181\n106#3,15:196\n1#4:211\n58#5,6:212\n64#5,2:219\n126#6:218\n*S KotlinDebug\n*F\n+ 1 KuMexMarketCoinInfoFragment.kt\ncom/kubi/kumex/market/v2/coinInfo/KuMexMarketCoinInfoFragment\n*L\n56#1:165,16\n66#1:181,15\n67#1:196,15\n140#1:212,6\n140#1:219,2\n140#1:218\n*E\n"})
public final class KuMexMarketCoinInfoFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29712U = C45681e.m100799e(this, new Function1<KuMexMarketCoinInfoFragment, C36838s2>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36838s2 invoke(@NotNull KuMexMarketCoinInfoFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36838s2.m82540a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36838s2, Unit>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36838s2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36838s2 c36838s2) {
            invoke(c36838s2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f29713V = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.coinInfo.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketCoinInfoFragment.m35018T3(this.f29734b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29714W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f29715X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public MarketCoinInfoAdapter f29716Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f29711a0 = {Reflection.property1(new PropertyReference1Impl(KuMexMarketCoinInfoFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentMarketCoinInfoBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f29710Z = new Companion(null);

    /* JADX INFO: compiled from: KuMexMarketCoinInfoFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/KuMexMarketCoinInfoFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/kumex/market/v2/coinInfo/KuMexMarketCoinInfoFragment;", "symbol", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuMexMarketCoinInfoFragment instance(@NotNull String symbol) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            KuMexMarketCoinInfoFragment kuMexMarketCoinInfoFragment = new KuMexMarketCoinInfoFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            kuMexMarketCoinInfoFragment.setArguments(bundle);
            return kuMexMarketCoinInfoFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$a */
    /* JADX INFO: compiled from: KuMexMarketCoinInfoFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16374a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f29717b;

        public C16374a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29717b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f29717b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29717b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C16375b extends TypeToken<WsMarketTickerStatsEntity> {
    }

    /* JADX INFO: renamed from: L3 */
    public final void m35037L3(String str) {
        if (m35039y3(0) == null) {
            return;
        }
        final String str2 = String.format("/quicksilver/symbol-stats:%s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        SocketRequest.Companion companion = SocketRequest.INSTANCE;
        C19409f c19409f = new C19409f(companion.subscribe(str2), companion.unsubscribe(str2), null, 4, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.v2.coinInfo.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KuMexMarketCoinInfoFragment.m35011M3(str2, (Message) obj));
            }
        };
        Observable<Message> observableFilter = c19409f.filter(new Predicate() { // from class: com.kubi.kumex.market.v2.coinInfo.o
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return KuMexMarketCoinInfoFragment.m35012N3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.v2.coinInfo.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketCoinInfoFragment.m35013O3((Message) obj);
            }
        };
        Observable<R> map = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.kumex.market.v2.coinInfo.q
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return KuMexMarketCoinInfoFragment.m35014P3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableObserveOn = FlowableCompatKt.m66397k(map).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.market.v2.coinInfo.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexMarketCoinInfoFragment.m35015Q3(this.f29745b, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.market.v2.coinInfo.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketCoinInfoFragment.m35016R3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.v2.coinInfo.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexMarketCoinInfoFragment.m35017S3(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: U3 */
    public final void m35038U3(WsMarketTickerStatsEntity wsMarketTickerStatsEntity) {
        final MarketInfoEntity marketInfoEntityM35039y3;
        String high = wsMarketTickerStatsEntity != null ? wsMarketTickerStatsEntity.getHigh() : null;
        if (high == null || high.length() == 0 || (marketInfoEntityM35039y3 = m35039y3(0)) == null) {
            return;
        }
        MarketCoinInfo info = marketInfoEntityM35039y3.getInfo();
        if (info != null) {
            info.setAth(wsMarketTickerStatsEntity != null ? wsMarketTickerStatsEntity.getHigh() : null);
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kumex.market.v2.coinInfo.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketCoinInfoFragment.m35019V3(this.f29739b, marketInfoEntityM35039y3);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    private final MarketInfoViewModel m35002B3() {
        return (MarketInfoViewModel) this.f29714W.getValue();
    }

    /* JADX INFO: renamed from: C3 */
    private final String m35003C3() {
        return (String) this.f29713V.getValue();
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m35005E3(KuMexMarketCoinInfoFragment kuMexMarketCoinInfoFragment, MarketCoinInfoWrapper marketCoinInfoWrapper) {
        if (marketCoinInfoWrapper == null) {
            kuMexMarketCoinInfoFragment.m35002B3().m35123r(kuMexMarketCoinInfoFragment.m35003C3(), false);
        } else {
            MarketCoinInfoAdapter marketCoinInfoAdapter = kuMexMarketCoinInfoFragment.f29716Y;
            if (marketCoinInfoAdapter != null) {
                marketCoinInfoAdapter.setNewData(CollectionsKt.arrayListOf(new MarketInfoEntity(0, marketCoinInfoWrapper.getBaseCurrency(), marketCoinInfoWrapper.getMarketCoinInfo(), marketCoinInfoWrapper.getTags(), null, 16, null), new MarketInfoEntity(1, marketCoinInfoWrapper.getBaseCurrency(), marketCoinInfoWrapper.getMarketCoinInfo(), marketCoinInfoWrapper.getTags(), null, 16, null), new MarketInfoEntity(3, marketCoinInfoWrapper.getBaseCurrency(), marketCoinInfoWrapper.getMarketCoinInfo(), marketCoinInfoWrapper.getTags(), null, 16, null)));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final boolean m35011M3(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: renamed from: N3 */
    public static final boolean m35012N3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: O3 */
    public static final Object m35013O3(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data = it.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C16375b().getType());
            } catch (Throwable unused) {
            }
        }
        WsMarketTickerStatsEntity wsMarketTickerStatsEntity = (WsMarketTickerStatsEntity) objM66914d;
        return wsMarketTickerStatsEntity == null ? new Object() : wsMarketTickerStatsEntity;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Object m35014P3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m35015Q3(KuMexMarketCoinInfoFragment kuMexMarketCoinInfoFragment, Object obj) {
        if (obj instanceof WsMarketTickerStatsEntity) {
            kuMexMarketCoinInfoFragment.m35038U3((WsMarketTickerStatsEntity) obj);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m35019V3(KuMexMarketCoinInfoFragment kuMexMarketCoinInfoFragment, MarketInfoEntity marketInfoEntity) {
        View viewByPosition;
        MarketCoinInfoAdapter marketCoinInfoAdapter = kuMexMarketCoinInfoFragment.f29716Y;
        if (marketCoinInfoAdapter != null) {
            C36838s2 c36838s2M35040z3 = kuMexMarketCoinInfoFragment.m35040z3();
            viewByPosition = marketCoinInfoAdapter.getViewByPosition(c36838s2M35040z3 != null ? c36838s2M35040z3.f81036b : null, 0, R$id.tv_ath);
        } else {
            viewByPosition = null;
        }
        TextView textView = (TextView) viewByPosition;
        if (textView != null) {
            MarketCoinInfo info = marketInfoEntity.getInfo();
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(info != null ? info.getAth() : null);
            textView.setText(C27041f.m66669i(bigDecimalM66536f != null ? C41014a.m89950x(C41014a.m89940n(bigDecimalM66536f, "USD"), null, null, 0, false, false, true, false, 95, null) : null, "--"));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final MarketCoinInfoViewModel m35035A3() {
        return (MarketCoinInfoViewModel) this.f29715X.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_market_coin_info, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m35036J3();
        m35004D3();
        m35035A3().m35091g(m35003C3());
        m35035A3().m35092h(m35003C3());
    }

    /* JADX INFO: renamed from: y3 */
    public final MarketInfoEntity m35039y3(int i11) {
        Collection data;
        MarketCoinInfoAdapter marketCoinInfoAdapter = this.f29716Y;
        Object obj = null;
        if (marketCoinInfoAdapter == null || (data = marketCoinInfoAdapter.getData()) == null) {
            return null;
        }
        for (Object obj2 : data) {
            if (((MarketInfoEntity) obj2).getType() == i11) {
                obj = obj2;
                break;
            }
        }
        return (MarketInfoEntity) obj;
    }

    /* JADX INFO: renamed from: z3 */
    public final C36838s2 m35040z3() {
        return (C36838s2) this.f29712U.getValue(this, f29711a0[0]);
    }

    public KuMexMarketCoinInfoFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.kumex.market.v2.coinInfo.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketCoinInfoFragment.m35010K3(this.f29741b);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f29714W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MarketInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        final Function0<Fragment> function2 = new Function0<Fragment>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewModels$default$6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function2.invoke();
            }

            {
                super(0);
            }
        });
        this.f29715X = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MarketCoinInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function1;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    private final void m35004D3() {
        m35035A3().m35093n().observe(getViewLifecycleOwner(), new C16374a(new Function1() { // from class: com.kubi.kumex.market.v2.coinInfo.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketCoinInfoFragment.m35005E3(this.f29747b, (MarketCoinInfoWrapper) obj);
            }
        }));
        m35035A3().m35095p().observe(getViewLifecycleOwner(), new C16374a(new Function1() { // from class: com.kubi.kumex.market.v2.coinInfo.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketCoinInfoFragment.m35006F3(this.f29735b, (Boolean) obj);
            }
        }));
        m35035A3().m35096q().observe(getViewLifecycleOwner(), new C16374a(new Function1() { // from class: com.kubi.kumex.market.v2.coinInfo.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketCoinInfoFragment.m35007G3(this.f29736b, (Boolean) obj);
            }
        }));
        m35035A3().m35094o().observe(getViewLifecycleOwner(), new C16374a(new Function1() { // from class: com.kubi.kumex.market.v2.coinInfo.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketCoinInfoFragment.m35009I3(this.f29737b, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m35006F3(KuMexMarketCoinInfoFragment kuMexMarketCoinInfoFragment, Boolean bool) {
        if (bool.booleanValue()) {
            BaseFragment.showLoadingView$default(kuMexMarketCoinInfoFragment, 0, 0, 3, null);
        } else {
            kuMexMarketCoinInfoFragment.showContentView();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m35007G3(final KuMexMarketCoinInfoFragment kuMexMarketCoinInfoFragment, Boolean bool) {
        if (bool.booleanValue()) {
            BaseFragment.showFailView$default(kuMexMarketCoinInfoFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.kumex.market.v2.coinInfo.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KuMexMarketCoinInfoFragment.m35008H3(this.f29738b, view);
                }
            }, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m35008H3(KuMexMarketCoinInfoFragment kuMexMarketCoinInfoFragment, View view) {
        kuMexMarketCoinInfoFragment.m35035A3().m35091g(kuMexMarketCoinInfoFragment.m35003C3());
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m35009I3(KuMexMarketCoinInfoFragment kuMexMarketCoinInfoFragment, String str) {
        Intrinsics.checkNotNull(str);
        kuMexMarketCoinInfoFragment.m35037L3(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final ViewModelStoreOwner m35010K3(KuMexMarketCoinInfoFragment kuMexMarketCoinInfoFragment) {
        Fragment parentFragment = kuMexMarketCoinInfoFragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return kuMexMarketCoinInfoFragment;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m35016R3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public static final void m35017S3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static final String m35018T3(KuMexMarketCoinInfoFragment kuMexMarketCoinInfoFragment) {
        String strM56284y;
        Bundle arguments = kuMexMarketCoinInfoFragment.getArguments();
        if (arguments != null && (strM56284y = RouteExKt.m56284y(arguments, "symbol")) != null) {
            return strM56284y;
        }
        return C46527h0.f104291a.m102677L();
    }

    /* JADX INFO: renamed from: J3 */
    public final void m35036J3() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C36838s2 c36838s2M35040z3 = m35040z3();
        if (c36838s2M35040z3 != null && (recyclerView2 = c36838s2M35040z3.f81036b) != null) {
            C22912t.m54410h(recyclerView2, false, 1, null);
        }
        MarketCoinInfoAdapter marketCoinInfoAdapter = new MarketCoinInfoAdapter();
        this.f29716Y = marketCoinInfoAdapter;
        C36838s2 c36838s2M35040z4 = m35040z3();
        if (c36838s2M35040z4 != null && (recyclerView = c36838s2M35040z4.f81036b) != null) {
            recyclerView.setAdapter(marketCoinInfoAdapter);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        String value = m35035A3().m35094o().getValue();
        if (value != null) {
            m35037L3(value);
        }
    }
}
