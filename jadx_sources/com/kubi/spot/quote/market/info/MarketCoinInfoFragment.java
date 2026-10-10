package com.kubi.spot.quote.market.info;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import com.kubi.network.websocket.observable.C19409f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.entity.TagEntity;
import com.kubi.spot.quote.market.KuCoinMarketViewModel;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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
import t20.C44638f;
import w00.C45681e;

/* JADX INFO: compiled from: MarketCoinInfoFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020#H\u0016J\b\u0010(\u001a\u00020#H\u0002J\b\u0010)\u001a\u00020#H\u0002J\u0012\u0010*\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010,H\u0003J\u0012\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020#H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u00063"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketCoinInfoFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinFragmentMarketCoinInfoBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinFragmentMarketCoinInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mAdapter", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;", "getMAdapter", "()Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mViewModel", "Lcom/kubi/spot/quote/market/KuCoinMarketViewModel;", "getMViewModel", "()Lcom/kubi/spot/quote/market/KuCoinMarketViewModel;", "mViewModel$delegate", "mTradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getMTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "mTradeItemBean$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "initListener", "subscribe", "updateAth", "ticker", "Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;", "findAdapterData", "Lcom/kubi/spot/quote/market/info/MarketInfoEntity;", "type", "", "trackExpose", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketCoinInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCoinInfoFragment.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,228:1\n147#2,16:229\n172#3,9:245\n1#4:254\n1869#5,2:255\n58#6,6:257\n64#6,2:264\n126#7:263\n*S KotlinDebug\n*F\n+ 1 MarketCoinInfoFragment.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoFragment\n*L\n52#1:229,16\n74#1:245,9\n129#1:255,2\n153#1:257,6\n153#1:264,2\n153#1:263\n*E\n"})
public final class MarketCoinInfoFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f50954W;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f50951Z = {Reflection.property1(new PropertyReference1Impl(MarketCoinInfoFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinFragmentMarketCoinInfoBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f50950Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50952U = C45681e.m100799e(this, new Function1<MarketCoinInfoFragment, C44638f>() { // from class: com.kubi.spot.quote.market.info.MarketCoinInfoFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44638f invoke(@NotNull MarketCoinInfoFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44638f.m98753a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44638f, Unit>() { // from class: com.kubi.spot.quote.market.info.MarketCoinInfoFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44638f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44638f c44638f) {
            invoke(c44638f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f50953V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.info.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketCoinInfoFragment.m62559E3(this.f50998b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f50955X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.info.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketCoinInfoFragment.m62560F3(this.f50999b);
        }
    });

    /* JADX INFO: compiled from: MarketCoinInfoFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketCoinInfoFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarketCoinInfoFragment newInstance(@NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarketCoinInfoFragment marketCoinInfoFragment = new MarketCoinInfoFragment();
            marketCoinInfoFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66717a());
            return marketCoinInfoFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.info.MarketCoinInfoFragment$a */
    /* JADX INFO: compiled from: MarketCoinInfoFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/spot/quote/market/info/MarketCoinInfoFragment$onViewCreated$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25598a extends RecyclerView.OnScrollListener {
        public C25598a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                MarketCoinInfoFragment.this.m62569O3();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, dx2, dy2);
            if (dx2 == 0 && dy2 == 0) {
                MarketCoinInfoFragment.this.m62569O3();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.info.MarketCoinInfoFragment$b */
    /* JADX INFO: compiled from: MarketCoinInfoFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25599b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f50957b;

        public C25599b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f50957b = function;
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
            return this.f50957b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50957b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.info.MarketCoinInfoFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25600c extends TypeToken<WsMarketTickerStatsEntity> {
    }

    /* JADX INFO: renamed from: G3 */
    private final void m62561G3() {
        if (m62587w3(0) == null) {
            return;
        }
        final String str = String.format("/quicksilver/symbol-stats:%s", Arrays.copyOf(new Object[]{m62584z3().getSymbol()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        SocketRequest.Companion companion = SocketRequest.INSTANCE;
        C19409f c19409f = new C19409f(companion.subscribe(str), companion.unsubscribe(str), null, 4, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.info.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarketCoinInfoFragment.m62566L3(str, (Message) obj));
            }
        };
        Observable<Message> observableFilter = c19409f.filter(new Predicate() { // from class: com.kubi.spot.quote.market.info.r
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarketCoinInfoFragment.m62567M3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.market.info.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketCoinInfoFragment.m62568N3((Message) obj);
            }
        };
        Observable<R> map = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.market.info.t
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketCoinInfoFragment.m62562H3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableObserveOn = FlowableCompatKt.m66397k(map).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.market.info.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketCoinInfoFragment.m62563I3(this.f50996b, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.market.info.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketCoinInfoFragment.m62564J3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.info.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketCoinInfoFragment.m62565K3(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: P3 */
    public final void m62586P3(WsMarketTickerStatsEntity wsMarketTickerStatsEntity) {
        final MarketInfoEntity marketInfoEntityM62587w3;
        String high = wsMarketTickerStatsEntity != null ? wsMarketTickerStatsEntity.getHigh() : null;
        if (high == null || high.length() == 0 || (marketInfoEntityM62587w3 = m62587w3(0)) == null) {
            return;
        }
        MarketCoinInfo info = marketInfoEntityM62587w3.getInfo();
        if (info != null) {
            info.setAth(wsMarketTickerStatsEntity != null ? wsMarketTickerStatsEntity.getHigh() : null);
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.spot.quote.market.info.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketCoinInfoFragment.m62570Q3(this.f50992b, marketInfoEntityM62587w3);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m62557C3(MarketCoinInfoFragment marketCoinInfoFragment, MarketCoinInfo marketCoinInfo) {
        if (marketCoinInfo == null) {
            return Unit.INSTANCE;
        }
        Collection<MarketInfoEntity> data = marketCoinInfoFragment.m62589y3().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        for (MarketInfoEntity marketInfoEntity : data) {
            marketInfoEntity.setInfo(marketCoinInfo);
            marketInfoEntity.setTags(marketCoinInfoFragment.m62585A3().m62353u().getValue());
        }
        marketCoinInfoFragment.showContentView();
        marketCoinInfoFragment.m62589y3().notifyDataSetChanged();
        marketCoinInfoFragment.m62561G3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m62558D3(MarketCoinInfoFragment marketCoinInfoFragment, TagEntity tagEntity) {
        if (tagEntity == null) {
            return Unit.INSTANCE;
        }
        MarketInfoEntity marketInfoEntityM62587w3 = marketCoinInfoFragment.m62587w3(0);
        if (marketInfoEntityM62587w3 != null) {
            marketInfoEntityM62587w3.setTags(tagEntity);
            marketCoinInfoFragment.m62589y3().notifyItemChanged(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final MarketCoinInfoAdapter m62559E3(MarketCoinInfoFragment marketCoinInfoFragment) {
        String symbol = marketCoinInfoFragment.m62584z3().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return new MarketCoinInfoAdapter(marketCoinInfoFragment, symbol, CollectionsKt.arrayListOf(new MarketInfoEntity(0, marketCoinInfoFragment.m62584z3(), null, null, null, 28, null), new MarketInfoEntity(1, marketCoinInfoFragment.m62584z3(), null, null, null, 28, null), new MarketInfoEntity(3, marketCoinInfoFragment.m62584z3(), null, null, null, 28, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public static final Object m62562H3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: I3 */
    public static final void m62563I3(MarketCoinInfoFragment marketCoinInfoFragment, Object obj) {
        if (obj instanceof WsMarketTickerStatsEntity) {
            marketCoinInfoFragment.m62586P3((WsMarketTickerStatsEntity) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public static final boolean m62566L3(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public static final boolean m62567M3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final Object m62568N3(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data = it.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C25600c().getType());
            } catch (Throwable unused) {
            }
        }
        WsMarketTickerStatsEntity wsMarketTickerStatsEntity = (WsMarketTickerStatsEntity) objM66914d;
        return wsMarketTickerStatsEntity == null ? new Object() : wsMarketTickerStatsEntity;
    }

    /* JADX INFO: renamed from: z3 */
    private final TradeItemBean m62584z3() {
        return (TradeItemBean) this.f50955X.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public final KuCoinMarketViewModel m62585A3() {
        return (KuCoinMarketViewModel) this.f50954W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_fragment_market_coin_info, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44638f c44638fM62588x3 = m62588x3();
        if (c44638fM62588x3 != null && (recyclerView3 = c44638fM62588x3.f99060b) != null) {
            C22912t.m54410h(recyclerView3, false, 1, null);
        }
        C44638f c44638fM62588x4 = m62588x3();
        if (c44638fM62588x4 != null && (recyclerView2 = c44638fM62588x4.f99060b) != null) {
            recyclerView2.setAdapter(m62589y3());
        }
        C44638f c44638fM62588x5 = m62588x3();
        if (c44638fM62588x5 == null || (recyclerView = c44638fM62588x5.f99060b) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C25598a());
    }

    /* JADX INFO: renamed from: x3 */
    public final C44638f m62588x3() {
        return (C44638f) this.f50952U.getValue(this, f50951Z[0]);
    }

    /* JADX INFO: renamed from: y3 */
    public final MarketCoinInfoAdapter m62589y3() {
        return (MarketCoinInfoAdapter) this.f50953V.getValue();
    }

    public MarketCoinInfoFragment() {
        final Function0 function0 = null;
        this.f50954W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(KuCoinMarketViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.spot.quote.market.info.MarketCoinInfoFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore mViewModelStore = this.requireActivity().getMViewModelStore();
                Intrinsics.checkNotNullExpressionValue(mViewModelStore, "requireActivity().viewModelStore");
                return mViewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.spot.quote.market.info.MarketCoinInfoFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.spot.quote.market.info.MarketCoinInfoFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    private final void m62556B3() {
        m62585A3().m62350r().observe(getViewLifecycleOwner(), new C25599b(new Function1() { // from class: com.kubi.spot.quote.market.info.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketCoinInfoFragment.m62557C3(this.f51000b, (MarketCoinInfo) obj);
            }
        }));
        m62585A3().m62353u().observe(getViewLifecycleOwner(), new C25599b(new Function1() { // from class: com.kubi.spot.quote.market.info.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketCoinInfoFragment.m62558D3(this.f50991b, (TagEntity) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F3 */
    public static final TradeItemBean m62560F3(MarketCoinInfoFragment marketCoinInfoFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marketCoinInfoFragment.getArguments();
        if (arguments != null && (tradeItemBean = (TradeItemBean) arguments.getParcelable("data")) != null) {
            return tradeItemBean;
        }
        return new TradeItemBean("BTC-USDT");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public static final Unit m62564J3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public static final void m62565K3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public final void m62569O3() {
        RecyclerView.LayoutManager layoutManager;
        MarketInfoEntity marketInfoEntity;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        RecyclerView recyclerView;
        C44638f c44638fM62588x3 = m62588x3();
        if (c44638fM62588x3 != null && (recyclerView = c44638fM62588x3.f99060b) != null) {
            layoutManager = recyclerView.getLayoutManager();
        } else {
            layoutManager = null;
        }
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null && (marketInfoEntity = (MarketInfoEntity) m62589y3().getData().get(iFindFirstVisibleItemPosition)) != null && m62589y3().getItemViewType(iFindFirstVisibleItemPosition) == 3) {
                MarketCoinInfo info = marketInfoEntity.getInfo();
                if (info != null) {
                    boolValueOf = Boolean.valueOf(info.isWebsiteTrack());
                } else {
                    boolValueOf = null;
                }
                if (!C27025c.m66566d(boolValueOf) && ((LinearLayout) viewFindViewByPosition.findViewById(R$id.ll_website)).getGlobalVisibleRect(new Rect())) {
                    C43852m.m96595g("B5candle", "MoreInformation", "1", null, 8, null);
                    MarketCoinInfo info2 = marketInfoEntity.getInfo();
                    if (info2 != null) {
                        info2.setWebsiteTrack(true);
                    }
                }
                MarketCoinInfo info3 = marketInfoEntity.getInfo();
                if (info3 != null) {
                    boolValueOf2 = Boolean.valueOf(info3.isDocTrack());
                } else {
                    boolValueOf2 = null;
                }
                if (!C27025c.m66566d(boolValueOf2) && ((LinearLayout) viewFindViewByPosition.findViewById(R$id.ll_doc)).getGlobalVisibleRect(new Rect())) {
                    C43852m.m96595g("B5candle", "MoreInformation", "2", null, 8, null);
                    MarketCoinInfo info4 = marketInfoEntity.getInfo();
                    if (info4 != null) {
                        info4.setDocTrack(true);
                    }
                }
                MarketCoinInfo info5 = marketInfoEntity.getInfo();
                if (info5 != null) {
                    boolValueOf3 = Boolean.valueOf(info5.isExplorerTrack());
                } else {
                    boolValueOf3 = null;
                }
                if (!C27025c.m66566d(boolValueOf3) && ((LinearLayout) viewFindViewByPosition.findViewById(R$id.ll_explorer)).getGlobalVisibleRect(new Rect())) {
                    C43852m.m96595g("B5candle", "MoreInformation", "3", null, 8, null);
                    MarketCoinInfo info6 = marketInfoEntity.getInfo();
                    if (info6 != null) {
                        info6.setExplorerTrack(true);
                    }
                }
                MarketCoinInfo info7 = marketInfoEntity.getInfo();
                if (info7 != null) {
                    boolValueOf4 = Boolean.valueOf(info7.isContractTrack());
                } else {
                    boolValueOf4 = null;
                }
                if (!C27025c.m66566d(boolValueOf4) && ((LinearLayout) viewFindViewByPosition.findViewById(R$id.ll_contract)).getGlobalVisibleRect(new Rect())) {
                    C43852m.m96595g("B5candle", "MoreInformation", "4", null, 8, null);
                    MarketCoinInfo info8 = marketInfoEntity.getInfo();
                    if (info8 != null) {
                        info8.setContractTrack(true);
                    }
                }
                MarketCoinInfo info9 = marketInfoEntity.getInfo();
                if (info9 != null) {
                    boolValueOf5 = Boolean.valueOf(info9.isCommunityTrack());
                } else {
                    boolValueOf5 = null;
                }
                if (!C27025c.m66566d(boolValueOf5) && ((LinearLayout) viewFindViewByPosition.findViewById(R$id.ll_community)).getGlobalVisibleRect(new Rect())) {
                    C43852m.m96595g("B5candle", "MoreInformation", "5", null, 8, null);
                    MarketCoinInfo info10 = marketInfoEntity.getInfo();
                    if (info10 != null) {
                        info10.setCommunityTrack(true);
                    }
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m62570Q3(MarketCoinInfoFragment marketCoinInfoFragment, MarketInfoEntity marketInfoEntity) {
        RecyclerView recyclerView;
        String ath;
        MarketCoinInfoAdapter marketCoinInfoAdapterM62589y3 = marketCoinInfoFragment.m62589y3();
        C44638f c44638fM62588x3 = marketCoinInfoFragment.m62588x3();
        String strM89950x = null;
        if (c44638fM62588x3 != null) {
            recyclerView = c44638fM62588x3.f99060b;
        } else {
            recyclerView = null;
        }
        TextView textView = (TextView) marketCoinInfoAdapterM62589y3.getViewByPosition(recyclerView, 0, R$id.tv_ath);
        if (textView != null) {
            MarketCoinInfo info = marketInfoEntity.getInfo();
            if (info != null) {
                ath = info.getAth();
            } else {
                ath = null;
            }
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(ath);
            if (bigDecimalM66536f != null) {
                strM89950x = C41014a.m89950x(C41014a.m89940n(bigDecimalM66536f, "USD"), null, null, 0, false, false, true, false, 95, null);
            }
            textView.setText(C27041f.m66669i(strM89950x, "--"));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        RecyclerView recyclerView;
        super.onHide();
        C44638f c44638fM62588x3 = m62588x3();
        if (c44638fM62588x3 != null && (recyclerView = c44638fM62588x3.f99060b) != null) {
            recyclerView.clearFocus();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m62556B3();
        m62585A3().m62354v(m62584z3());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m62561G3();
    }

    /* JADX INFO: renamed from: w3 */
    public final MarketInfoEntity m62587w3(int i11) {
        Object next;
        Collection data = m62589y3().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator it = data.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((MarketInfoEntity) next).getType() == i11) {
                return (MarketInfoEntity) next;
            }
        }
        next = null;
        return (MarketInfoEntity) next;
    }
}
