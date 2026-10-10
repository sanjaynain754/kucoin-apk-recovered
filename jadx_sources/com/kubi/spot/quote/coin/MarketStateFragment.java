package com.kubi.spot.quote.coin;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.quote.market.info.CoinWrapEntity;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.spot.quote.market.info.MarketCurrencyEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37053d;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.util.Arrays;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
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
import t20.C44648k;
import w00.C45681e;

/* JADX INFO: compiled from: MarketStateFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020$H\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020$H\u0002J\u0012\u0010-\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0018\u00100\u001a\u00020$2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019¨\u00065"}, m90084d2 = {"Lcom/kubi/spot/quote/coin/MarketStateFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinFragmentMarketStateBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinFragmentMarketStateBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "api", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/api/MarketApi;", "api$delegate", "Lkotlin/Lazy;", "coin", "", "getCoin", "()Ljava/lang/String;", "coin$delegate", "viewModel", "Lcom/kubi/spot/quote/coin/KuCoinCoinViewModel;", "getViewModel", "()Lcom/kubi/spot/quote/coin/KuCoinCoinViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initListener", "initView", "info", "Lcom/kubi/spot/quote/market/info/MarketCoinInfo;", "subscribe", "initMarket", "data", "Lcom/kubi/spot/quote/market/info/MarketCurrencyEntity;", "showTips", "titleId", "", "tipsId", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketStateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketStateFragment.kt\ncom/kubi/spot/quote/coin/MarketStateFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ExUtils.kt\ncom/kubi/spot/utils/ExUtilsKt\n+ 6 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,217:1\n147#2,16:218\n172#3,9:234\n1#4:243\n60#5,3:244\n60#5,3:247\n60#5,3:250\n60#5,3:253\n60#5,3:256\n60#5,3:259\n60#5,3:262\n60#5,3:265\n60#5,3:268\n58#6,6:271\n64#6,2:278\n126#7:277\n*S KotlinDebug\n*F\n+ 1 MarketStateFragment.kt\ncom/kubi/spot/quote/coin/MarketStateFragment\n*L\n47#1:218,16\n61#1:234,9\n138#1:244,3\n143#1:247,3\n149#1:250,3\n155#1:253,3\n158#1:256,3\n186#1:259,3\n191#1:262,3\n194#1:265,3\n201#1:268,3\n176#1:271,6\n176#1:278,2\n176#1:277\n*E\n"})
public final class MarketStateFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50805U = C45681e.m100799e(this, new Function1<MarketStateFragment, C44648k>() { // from class: com.kubi.spot.quote.coin.MarketStateFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44648k invoke(@NotNull MarketStateFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44648k.m98772a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44648k, Unit>() { // from class: com.kubi.spot.quote.coin.MarketStateFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44648k it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44648k c44648k) {
            invoke(c44648k);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f50806V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.coin.q1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketStateFragment.m62298E3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f50807W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.coin.r1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketStateFragment.m62299F3(this.f50861b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f50808X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f50804Z = {Reflection.property1(new PropertyReference1Impl(MarketStateFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinFragmentMarketStateBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f50803Y = new Companion(null);

    /* JADX INFO: compiled from: MarketStateFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/quote/coin/MarketStateFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/quote/coin/MarketStateFragment;", "coin", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarketStateFragment newInstance(@Nullable String coin) {
            MarketStateFragment marketStateFragment = new MarketStateFragment();
            marketStateFragment.setArguments(new C27051h().m66724h("coin", coin).m66717a());
            return marketStateFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.MarketStateFragment$a */
    /* JADX INFO: compiled from: MarketStateFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25483a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f50809b;

        public C25483a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f50809b = function;
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
            return this.f50809b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50809b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.MarketStateFragment$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25484b extends TypeToken<MarketCurrencyEntity> {
    }

    /* JADX INFO: renamed from: I3 */
    private final String m62300I3() {
        return (String) this.f50807W.getValue();
    }

    /* JADX INFO: renamed from: J3 */
    private final KuCoinCoinViewModel m62301J3() {
        return (KuCoinCoinViewModel) this.f50808X.getValue();
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m62303L3(MarketStateFragment marketStateFragment, CoinWrapEntity coinWrapEntity) {
        if ((coinWrapEntity != null ? coinWrapEntity.getInfo() : null) == null) {
            return Unit.INSTANCE;
        }
        marketStateFragment.m62343N3(coinWrapEntity.getInfo());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m62304O3(MarketStateFragment marketStateFragment) {
        marketStateFragment.m62344Y3(R$string.coin_value_chg, R$string.coin_value_chg_tip);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m62305P3(MarketStateFragment marketStateFragment) {
        marketStateFragment.m62344Y3(R$string.max_supply_label, R$string.max_supply_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m62306Q3(MarketStateFragment marketStateFragment) {
        marketStateFragment.m62344Y3(R$string.max_circulating_label, R$string.max_circulating_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m62307R3(MarketStateFragment marketStateFragment) {
        marketStateFragment.m62344Y3(R$string.rank_label, R$string.rank_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m62308S3(MarketStateFragment marketStateFragment) {
        marketStateFragment.m62344Y3(R$string.rating_label, R$string.rating_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m62309T3(MarketStateFragment marketStateFragment) {
        marketStateFragment.m62344Y3(R$string.market_cap_label, R$string.market_cap_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m62310U3(MarketStateFragment marketStateFragment) {
        marketStateFragment.m62344Y3(R$string.coin_amount, R$string.coin_amount_tip);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m62311V3(MarketStateFragment marketStateFragment) {
        marketStateFragment.m62344Y3(R$string.coin_ath, R$string.coin_ath_tip);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m62312W3(MarketStateFragment marketStateFragment) {
        marketStateFragment.m62344Y3(R$string.coin_atl, R$string.coin_atl_tip);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m62313X3(MarketStateFragment marketStateFragment) {
        marketStateFragment.m62344Y3(R$string.coin_price_chg, R$string.coin_price_chg_tip);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final boolean m62315a4(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: renamed from: b4 */
    public static final boolean m62316b4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: c4 */
    public static final MarketCurrencyEntity m62317c4(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data = it.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C25484b().getType());
            } catch (Throwable unused) {
            }
        }
        return (MarketCurrencyEntity) objM66914d;
    }

    /* JADX INFO: renamed from: d4 */
    public static final MarketCurrencyEntity m62318d4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (MarketCurrencyEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: G3 */
    public final InterfaceC37053d m62340G3() {
        return (InterfaceC37053d) this.f50806V.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final C44648k m62341H3() {
        return (C44648k) this.f50805U.getValue(this, f50804Z[0]);
    }

    /* JADX INFO: renamed from: M3 */
    public final void m62342M3(MarketCurrencyEntity marketCurrencyEntity) {
        C44648k c44648kM62341H3;
        UpDownTextView upDownTextView;
        C44648k c44648kM62341H4;
        UpDownTextView upDownTextView2;
        C44648k c44648kM62341H5;
        BaseTextView baseTextView;
        C44648k c44648kM62341H6;
        BaseTextView baseTextView2;
        if (marketCurrencyEntity == null) {
            return;
        }
        String cap = marketCurrencyEntity.getCap();
        if (cap != null && !TextUtils.isEmpty(cap) && (c44648kM62341H6 = m62341H3()) != null && (baseTextView2 = c44648kM62341H6.f99160j) != null) {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(marketCurrencyEntity.getCap());
            baseTextView2.setText(C41014a.m89930d(bigDecimalM66536f != null ? new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalM66536f, "USD"))) : null, true));
        }
        String totalVol = marketCurrencyEntity.getTotalVol();
        if (totalVol != null && !TextUtils.isEmpty(totalVol) && (c44648kM62341H5 = m62341H3()) != null && (baseTextView = c44648kM62341H5.f99152b) != null) {
            BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(marketCurrencyEntity.getTotalVol());
            baseTextView.setText(bigDecimalM66536f2 != null ? C41014a.m89931e(bigDecimalM66536f2, false, 1, null) : null);
        }
        String changeRate = marketCurrencyEntity.getChangeRate();
        if (changeRate != null && !TextUtils.isEmpty(changeRate) && (c44648kM62341H4 = m62341H3()) != null && (upDownTextView2 = c44648kM62341H4.f99164n) != null) {
            BigDecimal bigDecimalM66536f3 = DowngradeExKt.m66536f(marketCurrencyEntity.getChangeRate());
            upDownTextView2.m54919g(bigDecimalM66536f3 != null ? Double.valueOf(bigDecimalM66536f3.doubleValue()) : null, C22890g.m54279d(C27017c.f54310a.m66513b(), C27039d.m66647g(DowngradeExKt.m66536f(marketCurrencyEntity.getChangeRate())), 0, 2, null));
        }
        String changeCap = marketCurrencyEntity.getChangeCap();
        if (changeCap == null || TextUtils.isEmpty(changeCap) || (c44648kM62341H3 = m62341H3()) == null || (upDownTextView = c44648kM62341H3.f99170t) == null) {
            return;
        }
        BigDecimal bigDecimalM66536f4 = DowngradeExKt.m66536f(marketCurrencyEntity.getChangeCap());
        upDownTextView.m54919g(bigDecimalM66536f4 != null ? Double.valueOf(bigDecimalM66536f4.doubleValue()) : null, C22890g.m54279d(C27017c.f54310a.m66513b(), C27039d.m66647g(DowngradeExKt.m66536f(marketCurrencyEntity.getChangeCap())), 0, 2, null));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m62344Y3(int i11, int i12) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(i11).m54156M4(C27017c.f54310a.m66516f(i12, new Object[0])).m54162S4(R$string.already_know, null).m54172c5(getChildFragmentManager());
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_fragment_market_state, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44648k c44648kM62341H3 = m62341H3();
        if (c44648kM62341H3 != null) {
            DashTextView tvRankLabel = c44648kM62341H3.f99167q;
            Intrinsics.checkNotNullExpressionValue(tvRankLabel, "tvRankLabel");
            C27046k.m66711z(tvRankLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.z0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketStateFragment.m62307R3(this.f50876b);
                }
            }, 1, null);
            DashTextView tvRatingLabel = c44648kM62341H3.f99169s;
            Intrinsics.checkNotNullExpressionValue(tvRatingLabel, "tvRatingLabel");
            C27046k.m66711z(tvRatingLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.a1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketStateFragment.m62308S3(this.f50812b);
                }
            }, 1, null);
            DashTextView tvMarketCapLabel = c44648kM62341H3.f99161k;
            Intrinsics.checkNotNullExpressionValue(tvMarketCapLabel, "tvMarketCapLabel");
            C27046k.m66711z(tvMarketCapLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.b1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketStateFragment.m62309T3(this.f50819b);
                }
            }, 1, null);
            DashTextView tvAmountLabel = c44648kM62341H3.f99153c;
            Intrinsics.checkNotNullExpressionValue(tvAmountLabel, "tvAmountLabel");
            C27046k.m66711z(tvAmountLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.c1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketStateFragment.m62310U3(this.f50821b);
                }
            }, 1, null);
            DashTextView tvAthLabel = c44648kM62341H3.f99155e;
            Intrinsics.checkNotNullExpressionValue(tvAthLabel, "tvAthLabel");
            C27046k.m66711z(tvAthLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.d1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketStateFragment.m62311V3(this.f50823b);
                }
            }, 1, null);
            DashTextView tvAtlLabel = c44648kM62341H3.f99157g;
            Intrinsics.checkNotNullExpressionValue(tvAtlLabel, "tvAtlLabel");
            C27046k.m66711z(tvAtlLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.e1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketStateFragment.m62312W3(this.f50826b);
                }
            }, 1, null);
            DashTextView tvPriceChgLabel = c44648kM62341H3.f99165o;
            Intrinsics.checkNotNullExpressionValue(tvPriceChgLabel, "tvPriceChgLabel");
            C27046k.m66711z(tvPriceChgLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.f1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketStateFragment.m62313X3(this.f50830b);
                }
            }, 1, null);
            DashTextView tvValueChgLabel = c44648kM62341H3.f99171u;
            Intrinsics.checkNotNullExpressionValue(tvValueChgLabel, "tvValueChgLabel");
            C27046k.m66711z(tvValueChgLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.g1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketStateFragment.m62304O3(this.f50833b);
                }
            }, 1, null);
            DashTextView tvMaxSupplyLabel = c44648kM62341H3.f99163m;
            Intrinsics.checkNotNullExpressionValue(tvMaxSupplyLabel, "tvMaxSupplyLabel");
            C27046k.m66711z(tvMaxSupplyLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.h1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketStateFragment.m62305P3(this.f50835b);
                }
            }, 1, null);
            DashTextView tvCirculatingLabel = c44648kM62341H3.f99159i;
            Intrinsics.checkNotNullExpressionValue(tvCirculatingLabel, "tvCirculatingLabel");
            C27046k.m66711z(tvCirculatingLabel, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.j1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketStateFragment.m62306Q3(this.f50842b);
                }
            }, 1, null);
        }
    }

    public MarketStateFragment() {
        final Function0 function0 = null;
        this.f50808X = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(KuCoinCoinViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.spot.quote.coin.MarketStateFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.kubi.spot.quote.coin.MarketStateFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.spot.quote.coin.MarketStateFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: E3 */
    public static final InterfaceC37053d m62298E3() {
        return (InterfaceC37053d) C42597a.m93390f().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: F3 */
    public static final String m62299F3(MarketStateFragment marketStateFragment) {
        String string;
        Bundle arguments = marketStateFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("coin");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: K3 */
    private final void m62302K3() {
        m62301J3().m62202r().observe(this, new C25483a(new Function1() { // from class: com.kubi.spot.quote.coin.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketStateFragment.m62303L3(this.f50875b, (CoinWrapEntity) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m62314Z3() {
        final String str = String.format("/quicksilver/symbol-market:%s", Arrays.copyOf(new Object[]{m62300I3()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Request.Companion companion = Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(m62340G3().m82930V(m62300I3()), str), companion.unsubscribe(m62340G3().m82930V(m62300I3()), str), null, false, null, 28, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.coin.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarketStateFragment.m62315a4(str, (Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.spot.quote.coin.i1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarketStateFragment.m62316b4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.coin.k1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketStateFragment.m62317c4((Message) obj);
            }
        };
        Observable<R> map = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.coin.l1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketStateFragment.m62318d4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableObserveOn = FlowableCompatKt.m66397k(map).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.coin.m1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketStateFragment.m62319e4(this.f50849b, (MarketCurrencyEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.coin.n1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketStateFragment.m62320f4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.quote.coin.o1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketStateFragment.m62321g4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.coin.p1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketStateFragment.m62322h4(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m62319e4(MarketStateFragment marketStateFragment, MarketCurrencyEntity marketCurrencyEntity) {
        marketStateFragment.m62342M3(marketCurrencyEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public static final void m62320f4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m62321g4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m62322h4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    /* JADX INFO: renamed from: N3 */
    public final void m62343N3(MarketCoinInfo marketCoinInfo) {
        String str;
        String strM89950x;
        String strM89950x2;
        BigDecimal bigDecimal;
        C44648k c44648kM62341H3 = m62341H3();
        if (c44648kM62341H3 != null) {
            BaseTextView baseTextView = c44648kM62341H3.f99166p;
            String rank = marketCoinInfo.getRank();
            if (rank == null) {
                str = "--";
            } else {
                str = '#' + rank;
                if (str == null) {
                    str = "--";
                }
            }
            baseTextView.setText(str);
            c44648kM62341H3.f99168r.setText(C27041f.m66669i(marketCoinInfo.getRating(), "--"));
            String marketCap = marketCoinInfo.getMarketCap();
            if (marketCap != null && !TextUtils.isEmpty(marketCap)) {
                BaseTextView baseTextView2 = c44648kM62341H3.f99160j;
                BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(marketCoinInfo.getMarketCap());
                if (bigDecimalM66536f != null) {
                    bigDecimal = new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalM66536f, "USD")));
                } else {
                    bigDecimal = null;
                }
                baseTextView2.setText(C41014a.m89930d(bigDecimal, true));
            }
            String ath = marketCoinInfo.getAth();
            if (ath != null && !TextUtils.isEmpty(ath)) {
                BaseTextView baseTextView3 = c44648kM62341H3.f99154d;
                BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(marketCoinInfo.getAth());
                if (bigDecimalM66536f2 != null) {
                    strM89950x2 = C41014a.m89950x(C41014a.m89940n(bigDecimalM66536f2, "USD"), null, null, 0, false, false, true, false, 95, null);
                } else {
                    strM89950x2 = null;
                }
                baseTextView3.setText(C27041f.m66669i(strM89950x2, "--"));
            }
            String atl = marketCoinInfo.getAtl();
            if (atl != null && !TextUtils.isEmpty(atl)) {
                BaseTextView baseTextView4 = c44648kM62341H3.f99156f;
                BigDecimal bigDecimalM66536f3 = DowngradeExKt.m66536f(marketCoinInfo.getAtl());
                if (bigDecimalM66536f3 != null) {
                    strM89950x = C41014a.m89950x(C41014a.m89940n(bigDecimalM66536f3, "USD"), null, null, 0, false, false, true, false, 95, null);
                } else {
                    strM89950x = null;
                }
                baseTextView4.setText(C27041f.m66669i(strM89950x, "--"));
            }
            String maxSupply = marketCoinInfo.getMaxSupply();
            if (maxSupply != null && !TextUtils.isEmpty(maxSupply)) {
                c44648kM62341H3.f99162l.setText(C41014a.m89931e(DowngradeExKt.m66536f(marketCoinInfo.getMaxSupply()), false, 1, null));
            }
            String circulatingSupply = marketCoinInfo.getCirculatingSupply();
            if (circulatingSupply != null && !TextUtils.isEmpty(circulatingSupply)) {
                c44648kM62341H3.f99158h.setText(C41014a.m89931e(DowngradeExKt.m66536f(marketCoinInfo.getCirculatingSupply()), false, 1, null));
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m62302K3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m62314Z3();
    }
}
