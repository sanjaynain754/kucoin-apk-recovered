package com.kubi.margin.market.trade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.MarketTicker;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.kucoin.manager.SpotMatchPushEntity;
import com.kubi.margin.R$color;
import com.kubi.margin.R$font;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.entity.Tag;
import com.kubi.margin.entity.WsMarketSnapshotEntity;
import com.kubi.margin.entity.WsMarketSnapshotWrapperEntity;
import com.kubi.margin.entity.WsRecentDealEntity;
import com.kubi.margin.kline.MarginKlineFragment;
import com.kubi.margin.market.MarginMarketViewModel;
import com.kubi.margin.market.info.MarketCoinInfo;
import com.kubi.margin.market.info.MarketTickerStatsEntity;
import com.kubi.margin.market.info.WsMarketTickerStatsEntity;
import com.kubi.margin.market.rank.MarginRankHelper;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FixAutoSizeTextView;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36906c0;
import p206dp.C36936r0;
import p239ep.C37226g;
import p402kf.C41014a;
import p569qq.C43852m;
import p768xo.InterfaceC46307h;
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
import w00.C45681e;

/* JADX INFO: compiled from: MarginMarketTradeFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001\\B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u001a\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010@H\u0017J\b\u0010F\u001a\u00020DH\u0016J\b\u0010G\u001a\u00020DH\u0016J\b\u0010H\u001a\u00020DH\u0002J\b\u0010I\u001a\u00020DH\u0002J\b\u0010J\u001a\u00020DH\u0002J\u0012\u0010K\u001a\u00020D2\b\u0010L\u001a\u0004\u0018\u00010MH\u0003J\u0012\u0010N\u001a\u00020D2\b\u0010L\u001a\u0004\u0018\u00010OH\u0002J\u0012\u0010P\u001a\u00020D2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0002J\u0010\u0010S\u001a\u00020D2\u0006\u0010T\u001a\u00020UH\u0002J\b\u0010V\u001a\u00020'H\u0016J\b\u0010W\u001a\u000206H\u0016J\b\u0010X\u001a\u00020YH\u0016J\b\u0010Z\u001a\u000206H\u0016J\u0006\u0010[\u001a\u00020DR\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u001fR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0011\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0011\u001a\u0004\b2\u00103R\u001a\u00105\u001a\u000206X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006]"}, m90084d2 = {"Lcom/kubi/margin/market/trade/MarginMarketTradeFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/margin/kline/MarginKlineFragment$IKlineFragmentProvider;", "<init>", "()V", "bmarginFragmentMarketTradeBinding", "Lcom/kubi/margin/databinding/BmarginFragmentMarketTradeBinding;", "getBmarginFragmentMarketTradeBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentMarketTradeBinding;", "bmarginFragmentMarketTradeBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/margin/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "mOrderBookFragment", "Lcom/kubi/margin/market/trade/MarginOrderBookFragment;", "getMOrderBookFragment", "()Lcom/kubi/margin/market/trade/MarginOrderBookFragment;", "mOrderBookFragment$delegate", "mRecentDealFragment", "Lcom/kubi/margin/market/trade/MarginRecentDealFragment;", "getMRecentDealFragment", "()Lcom/kubi/margin/market/trade/MarginRecentDealFragment;", "mRecentDealFragment$delegate", "mAnalysisFragment", "Lcom/kubi/margin/market/trade/MarginMarketAnalysisFragment;", "getMAnalysisFragment", "()Lcom/kubi/margin/market/trade/MarginMarketAnalysisFragment;", "mAnalysisFragment$delegate", "mFragmentList", "", "getMFragmentList", "()Ljava/util/List;", "mFragmentList$delegate", "mTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "getMTradeBean", "()Lcom/kubi/data/entity/TradeItemBean;", "mTradeBean$delegate", "mPopup", "Lcom/kubi/margin/market/trade/MarginMarketTradePopup;", "getMPopup", "()Lcom/kubi/margin/market/trade/MarginMarketTradePopup;", "mPopup$delegate", "mViewModel", "Lcom/kubi/margin/market/MarginMarketViewModel;", "getMViewModel", "()Lcom/kubi/margin/market/MarginMarketViewModel;", "mViewModel$delegate", "contentHeight", "", "getContentHeight", "()I", "setContentHeight", "(I)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initListener", "subscribe", "toggleCurrentFragment", "onQuickResponse", "ticker", "Lcom/kubi/margin/market/info/MarketTickerStatsEntity;", "onWsQuickResponse", "Lcom/kubi/margin/market/info/WsMarketTickerStatsEntity;", "onSnapShotResponse", "marketTicker", "Lcom/kubi/data/entity/MarketTicker;", "onLastDealResponse", "recentDeal", "Ljava/math/BigDecimal;", "getTradeBean", "getPrecision", "isIndex", "", "marginTradeType", "resetPopupLoc", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginMarketTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketTradeFragment.kt\ncom/kubi/margin/market/trade/MarginMarketTradeFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,442:1\n147#2,16:443\n172#3,9:459\n1#4:468\n58#5,6:469\n64#5,2:476\n58#5,6:478\n64#5,2:485\n58#5,6:487\n64#5,2:494\n58#5,6:496\n64#5,2:503\n58#5,6:505\n64#5,2:512\n58#5,6:514\n64#5,2:521\n58#5,6:523\n64#5,2:530\n126#6:475\n126#6:484\n126#6:493\n126#6:502\n126#6:511\n126#6:520\n126#6:529\n*S KotlinDebug\n*F\n+ 1 MarginMarketTradeFragment.kt\ncom/kubi/margin/market/trade/MarginMarketTradeFragment\n*L\n66#1:443,16\n87#1:459,9\n230#1:469,6\n230#1:476,2\n231#1:478,6\n231#1:485,2\n233#1:487,6\n233#1:494,2\n261#1:496,6\n261#1:503,2\n262#1:505,6\n262#1:512,2\n264#1:514,6\n264#1:521,2\n265#1:523,6\n265#1:530,2\n230#1:475\n231#1:484\n233#1:493\n261#1:502\n262#1:511\n264#1:520\n265#1:529\n*E\n"})
public final class MarginMarketTradeFragment extends BaseFragment implements MarginKlineFragment.InterfaceC17697a {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33464U = C45681e.m100799e(this, new Function1<MarginMarketTradeFragment, C36906c0>() { // from class: com.kubi.margin.market.trade.MarginMarketTradeFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36906c0 invoke(@NotNull MarginMarketTradeFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36906c0.m82681a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36906c0, Unit>() { // from class: com.kubi.margin.market.trade.MarginMarketTradeFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36906c0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36906c0 c36906c0) {
            invoke(c36906c0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33465V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketTradeFragment.m39263V3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33466W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketTradeFragment.m39265X3(this.f33547b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f33467X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketTradeFragment.m39267Z3(this.f33564b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f33468Y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketTradeFragment.m39262U3(this.f33566b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f33469Z = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketTradeFragment.m39264W3(this.f33568b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f33470a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketTradeFragment.m39268a4(this.f33496b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f33471b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketTradeFragment.m39266Y3(this.f33499b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f33472c0;

    /* JADX INFO: renamed from: d0 */
    public int f33473d0;

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f33463f0 = {Reflection.property1(new PropertyReference1Impl(MarginMarketTradeFragment.class, "bmarginFragmentMarketTradeBinding", "getBmarginFragmentMarketTradeBinding()Lcom/kubi/margin/databinding/BmarginFragmentMarketTradeBinding;", 0))};

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f33462e0 = new Companion(null);

    /* JADX INFO: compiled from: MarginMarketTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/margin/market/trade/MarginMarketTradeFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/market/trade/MarginMarketTradeFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "tradeType", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginMarketTradeFragment newInstance(@NotNull TradeItemBean tradeItemBean, int tradeType) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarginMarketTradeFragment marginMarketTradeFragment = new MarginMarketTradeFragment();
            marginMarketTradeFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66720d("tradeType", tradeType).m66717a());
            return marginMarketTradeFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginMarketTradeFragment$a */
    /* JADX INFO: compiled from: MarginMarketTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/margin/market/trade/MarginMarketTradeFragment$onViewCreated$2$3", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17999a implements RadioGroupPlus.InterfaceC22946c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C36906c0 f33474a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MarginMarketTradeFragment f33475b;

        public C17999a(C36906c0 c36906c0, MarginMarketTradeFragment marginMarketTradeFragment) {
            this.f33474a = c36906c0;
            this.f33475b = marginMarketTradeFragment;
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            RadioButton radioButton = this.f33474a.f81610f;
            radioButton.setTypeface(i11 == R$id.rb_order_book ? ResourcesCompat.getFont(radioButton.getContext(), R$font.semi) : ResourcesCompat.getFont(radioButton.getContext(), R$font.medium));
            RadioButton radioButton2 = this.f33474a.f81611g;
            radioButton2.setTypeface(i11 == R$id.rb_recent_deal ? ResourcesCompat.getFont(radioButton2.getContext(), R$font.semi) : ResourcesCompat.getFont(radioButton2.getContext(), R$font.medium));
            RadioButton radioButton3 = this.f33474a.f81612h;
            radioButton3.setTypeface(i11 == R$id.rb_trade_guide ? ResourcesCompat.getFont(radioButton3.getContext(), R$font.semi) : ResourcesCompat.getFont(radioButton3.getContext(), R$font.medium));
            this.f33475b.m39301x4();
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginMarketTradeFragment$b */
    /* JADX INFO: compiled from: MarginMarketTradeFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18000b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f33476b;

        public C18000b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f33476b = function;
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
            return this.f33476b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33476b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginMarketTradeFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18001c extends TypeToken<MarketTickerStatsEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginMarketTradeFragment$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18002d extends TypeToken<WsMarketTickerStatsEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginMarketTradeFragment$e */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18003e extends TypeToken<WsMarketSnapshotWrapperEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginMarketTradeFragment$f */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18004f extends TypeToken<MarketTickerStatsEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginMarketTradeFragment$g */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18005g extends TypeToken<WsMarketTickerStatsEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginMarketTradeFragment$h */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18006h extends TypeToken<WsMarketSnapshotWrapperEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginMarketTradeFragment$i */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18007i extends TypeToken<WsRecentDealEntity> {
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    /* JADX INFO: renamed from: M1 */
    public boolean mo38435M1() {
        return false;
    }

    /* JADX INFO: renamed from: L3 */
    private final InterfaceC46307h m39257L3() {
        return (InterfaceC46307h) this.f33465V.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    private final TradeItemBean m39258Q3() {
        return (TradeItemBean) this.f33470a0.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    private final MarginMarketViewModel m39259R3() {
        return (MarginMarketViewModel) this.f33472c0.getValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m39261T3(MarginMarketTradeFragment marginMarketTradeFragment, MarketCoinInfo marketCoinInfo) {
        if (marketCoinInfo == null) {
            return Unit.INSTANCE;
        }
        marginMarketTradeFragment.m39309O3().m39421A(marketCoinInfo);
        C36906c0 c36906c0M39304I3 = marginMarketTradeFragment.m39304I3();
        if (c36906c0M39304I3 != null) {
            List<Tag> currencyTagList = marketCoinInfo.getCurrencyTagList();
            if (currencyTagList == null || currencyTagList.isEmpty()) {
                BaseTextView coinRankInfo = c36906c0M39304I3.f81608d.f81940e;
                Intrinsics.checkNotNullExpressionValue(coinRankInfo, "coinRankInfo");
                ViewExtKt.m66577h(coinRankInfo);
                ImageView coinRankMore = c36906c0M39304I3.f81608d.f81941f;
                Intrinsics.checkNotNullExpressionValue(coinRankMore, "coinRankMore");
                ViewExtKt.m66577h(coinRankMore);
            } else {
                List<Tag> sortedTagList = marketCoinInfo.getSortedTagList();
                MarginRankHelper marginRankHelper = MarginRankHelper.f33406a;
                String symbol = marginMarketTradeFragment.m39258Q3().getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                Tag tag = sortedTagList.get(0);
                BaseTextView coinRankInfo2 = c36906c0M39304I3.f81608d.f81940e;
                Intrinsics.checkNotNullExpressionValue(coinRankInfo2, "coinRankInfo");
                marginRankHelper.m39148e(symbol, tag, coinRankInfo2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final MarginMarketAnalysisFragment m39262U3(MarginMarketTradeFragment marginMarketTradeFragment) {
        return MarginMarketAnalysisFragment.f33455Z.newInstance(marginMarketTradeFragment.m39258Q3());
    }

    /* JADX INFO: renamed from: X3 */
    public static final MarginOrderBookFragment m39265X3(MarginMarketTradeFragment marginMarketTradeFragment) {
        return MarginOrderBookFragment.f33477c0.newInstance(marginMarketTradeFragment.m39258Q3());
    }

    /* JADX INFO: renamed from: Y3 */
    public static final MarginMarketTradePopup m39266Y3(MarginMarketTradeFragment marginMarketTradeFragment) {
        return new MarginMarketTradePopup(marginMarketTradeFragment);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final MarginRecentDealFragment m39267Z3(MarginMarketTradeFragment marginMarketTradeFragment) {
        return MarginRecentDealFragment.f33487a0.newInstance(marginMarketTradeFragment.m39258Q3());
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m39269e4(MarginMarketTradeFragment marginMarketTradeFragment, C36906c0 c36906c0) {
        C43852m.m96591c("B4candle", "MoreData", null, null, 12, null);
        MarginMarketTradePopup marginMarketTradePopupM39309O3 = marginMarketTradeFragment.m39309O3();
        LinearLayout llMarketTick = c36906c0.f81608d.f81952q;
        Intrinsics.checkNotNullExpressionValue(llMarketTick, "llMarketTick");
        marginMarketTradePopupM39309O3.m39427y(llMarketTick);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final boolean m39273j4(String str, String str2, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        if (Intrinsics.areEqual(it.getSource(), "socket")) {
            return Intrinsics.areEqual(it.getTopic(), str) || Intrinsics.areEqual(it.getTopic(), str2);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static final boolean m39275k4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: l4 */
    public static final Object m39277l4(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C18001c().getType());
                } catch (Throwable unused) {
                }
            }
            objM66914d = (MarketTickerStatsEntity) objM66914d;
            if (objM66914d == null) {
                objM66914d = new Object();
            }
        } else if (Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str)) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data2 = it.getData();
                    Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x2 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data2, new C18002d().getType());
                } catch (Throwable unused2) {
                }
            }
            objM66914d = (WsMarketTickerStatsEntity) objM66914d;
            if (objM66914d == null) {
                objM66914d = new Object();
            }
        } else if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data3 = it.getData();
                Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x3 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data3, new C18003e().getType());
            } catch (Throwable unused3) {
            }
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Object m39279m4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: o4 */
    public static final Object m39283o4(SpotMatchPushEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WsRecentDealEntity wsRecentDealEntityM83276a = C37226g.m83276a(it);
        Intrinsics.checkNotNull(wsRecentDealEntityM83276a, "null cannot be cast to non-null type kotlin.Any");
        return wsRecentDealEntityM83276a;
    }

    /* JADX INFO: renamed from: p4 */
    public static final Object m39285p4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: q4 */
    public static final boolean m39287q4(String str, String str2, String str3, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        if (Intrinsics.areEqual(it.getSource(), "socket")) {
            return Intrinsics.areEqual(it.getTopic(), str) || Intrinsics.areEqual(it.getTopic(), str2) || Intrinsics.areEqual(it.getTopic(), str3);
        }
        return false;
    }

    /* JADX INFO: renamed from: r4 */
    public static final boolean m39289r4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: s4 */
    public static final Object m39291s4(String str, String str2, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C18004f().getType());
                } catch (Throwable unused) {
                }
            }
            objM66914d = (MarketTickerStatsEntity) objM66914d;
            if (objM66914d == null) {
                objM66914d = new Object();
            }
        } else if (Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str)) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data2 = it.getData();
                    Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x2 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data2, new C18005g().getType());
                } catch (Throwable unused2) {
                }
            }
            objM66914d = (WsMarketTickerStatsEntity) objM66914d;
            if (objM66914d == null) {
                objM66914d = new Object();
            }
        } else {
            try {
                if (Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str2)) {
                    if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                        String data3 = it.getData();
                        Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type kotlin.String");
                        C27099x c27099x3 = C27099x.f54458a;
                        objM66914d = C27099x.m66914d(data3, new C18006h().getType());
                    }
                } else if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                    String data4 = it.getData();
                    Intrinsics.checkNotNull(data4, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x4 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data4, new C18007i().getType());
                }
            } catch (Throwable unused3) {
            }
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Object m39293t4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m39295u4(MarginMarketTradeFragment marginMarketTradeFragment, Object obj) {
        if (obj instanceof MarketTickerStatsEntity) {
            marginMarketTradeFragment.m39312c4((MarketTickerStatsEntity) obj);
            return;
        }
        if (obj instanceof WsMarketTickerStatsEntity) {
            marginMarketTradeFragment.m39314f4((WsMarketTickerStatsEntity) obj);
            return;
        }
        if (!(obj instanceof WsMarketSnapshotWrapperEntity)) {
            if (obj instanceof WsRecentDealEntity) {
                marginMarketTradeFragment.m39311b4(((WsRecentDealEntity) obj).getPrice());
            }
        } else {
            WsMarketSnapshotWrapperEntity wsMarketSnapshotWrapperEntity = (WsMarketSnapshotWrapperEntity) obj;
            WsMarketSnapshotEntity data = wsMarketSnapshotWrapperEntity.getData();
            if (data != null) {
                data.covertToTradeItemBean(marginMarketTradeFragment.m39258Q3());
            }
            WsMarketSnapshotEntity data2 = wsMarketSnapshotWrapperEntity.getData();
            marginMarketTradeFragment.m39313d4(data2 != null ? data2.convertToMarketTicker(marginMarketTradeFragment.m39258Q3().marketTicker) : null);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final C36906c0 m39304I3() {
        return (C36906c0) this.f33464U.getValue(this, f33463f0[0]);
    }

    /* JADX INFO: renamed from: J3, reason: from getter */
    public final int getF33473d0() {
        return this.f33473d0;
    }

    /* JADX INFO: renamed from: K3 */
    public final MarginMarketAnalysisFragment m39306K3() {
        return (MarginMarketAnalysisFragment) this.f33468Y.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public final List<BaseFragment> m39307M3() {
        return (List) this.f33469Z.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    public final MarginOrderBookFragment m39308N3() {
        return (MarginOrderBookFragment) this.f33466W.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    public final MarginMarketTradePopup m39309O3() {
        return (MarginMarketTradePopup) this.f33471b0.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    public final MarginRecentDealFragment m39310P3() {
        return (MarginRecentDealFragment) this.f33467X.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c4 */
    public final void m39312c4(MarketTickerStatsEntity marketTickerStatsEntity) {
        String price;
        BigDecimal bigDecimalM66671k;
        C36906c0 c36906c0M39304I3 = m39304I3();
        if (c36906c0M39304I3 != null) {
            TradeItemBean tradeItemBeanM39258Q3 = m39258Q3();
            BigDecimal bigDecimalM66671k2 = C27041f.m66671k(marketTickerStatsEntity != null ? marketTickerStatsEntity.getPriceChangeRate24h() : null);
            tradeItemBeanM39258Q3.setChangeRate(bigDecimalM66671k2 != null ? Double.valueOf(bigDecimalM66671k2.doubleValue()) : null);
            FixAutoSizeTextView fixAutoSizeTextView = c36906c0M39304I3.f81608d.f81939d;
            BigDecimal bigDecimalM66671k3 = C27041f.m66671k(marketTickerStatsEntity != null ? marketTickerStatsEntity.getPrice() : null);
            fixAutoSizeTextView.setText(C27041f.m66669i(bigDecimalM66671k3 != null ? C37886j.m85579c(bigDecimalM66671k3, m39258Q3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
            FixAutoSizeTextView fixAutoSizeTextView2 = c36906c0M39304I3.f81608d.f81939d;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            fixAutoSizeTextView2.setTextColor(C22890g.m54278c(contextRequireContext, C27039d.m66647g(C27041f.m66671k(marketTickerStatsEntity != null ? marketTickerStatsEntity.getPriceChangeRate24h() : null)), R$color.c_text));
            c36906c0M39304I3.f81608d.f81945j.setText(C27041f.m66669i((marketTickerStatsEntity == null || (price = marketTickerStatsEntity.getPrice()) == null || (bigDecimalM66671k = C27041f.m66671k(price)) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalM66671k, m39258Q3().getSymbolInfoEntity().getQuoteCurrency()), null, null, 0, false, true, false, false, 111, null), "--"));
            UpDownTextView upDownTextView = c36906c0M39304I3.f81608d.f81944i;
            BigDecimal bigDecimalM66671k4 = C27041f.m66671k(marketTickerStatsEntity != null ? marketTickerStatsEntity.getPriceChangeRate24h() : null);
            Double dValueOf = bigDecimalM66671k4 != null ? Double.valueOf(bigDecimalM66671k4.doubleValue()) : null;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            upDownTextView.m54919g(dValueOf, C22890g.m54279d(contextRequireContext2, C27039d.m66647g(C27041f.m66671k(marketTickerStatsEntity != null ? marketTickerStatsEntity.getPriceChangeRate24h() : null)), 0, 2, null));
            BaseTextView baseTextView = c36906c0M39304I3.f81608d.f81946k;
            BigDecimal bigDecimalM66671k5 = C27041f.m66671k(marketTickerStatsEntity != null ? marketTickerStatsEntity.getVolume24h() : null);
            baseTextView.setText(bigDecimalM66671k5 != null ? C41014a.m89931e(bigDecimalM66671k5, false, 1, null) : null);
            BaseTextView baseTextView2 = c36906c0M39304I3.f81608d.f81948m;
            BigDecimal bigDecimalM66671k6 = C27041f.m66671k(marketTickerStatsEntity != null ? marketTickerStatsEntity.getVolumeValue24h() : null);
            baseTextView2.setText(bigDecimalM66671k6 != null ? C41014a.m89931e(bigDecimalM66671k6, false, 1, null) : null);
            BaseTextView baseTextView3 = c36906c0M39304I3.f81608d.f81942g;
            BigDecimal bigDecimalM66671k7 = C27041f.m66671k(marketTickerStatsEntity != null ? marketTickerStatsEntity.getHighestPrice24h() : null);
            baseTextView3.setText(C27041f.m66669i(bigDecimalM66671k7 != null ? C37886j.m85579c(bigDecimalM66671k7, m39258Q3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : true, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
            BaseTextView baseTextView4 = c36906c0M39304I3.f81608d.f81937b;
            BigDecimal bigDecimalM66671k8 = C27041f.m66671k(marketTickerStatsEntity != null ? marketTickerStatsEntity.getLowestPrice24h() : null);
            baseTextView4.setText(C27041f.m66669i(bigDecimalM66671k8 != null ? C37886j.m85579c(bigDecimalM66671k8, m39258Q3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : true, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
            m39309O3().m39422B(marketTickerStatsEntity);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bmargin_fragment_market_trade, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f33473d0 = (C5267e0.m6182d() - C5275i0.m6236a(211.0f)) - IKuFacadeService.f27711a.get().mo31927f();
        final C36906c0 c36906c0M39304I3 = m39304I3();
        if (c36906c0M39304I3 != null) {
            c36906c0M39304I3.f81608d.f81947l.setText(getString(R$string.market_24h_vol) + '(' + m39258Q3().getSymbolInfoEntity().getBaseCurrencyName() + ')');
            c36906c0M39304I3.f81608d.f81949n.setText(getString(R$string.market_24h_amount) + '(' + m39258Q3().getSymbolInfoEntity().getQuoteCurrencyName() + ')');
            ConstraintLayout infoRight = c36906c0M39304I3.f81608d.f81951p;
            Intrinsics.checkNotNullExpressionValue(infoRight, "infoRight");
            C27046k.m66711z(infoRight, 0L, new Function0() { // from class: com.kubi.margin.market.trade.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketTradeFragment.m39269e4(this.f33558b, c36906c0M39304I3);
                }
            }, 1, null);
            ViewGroup.LayoutParams layoutParams = c36906c0M39304I3.f81606b.getLayoutParams();
            layoutParams.height = this.f33473d0;
            c36906c0M39304I3.f81606b.setLayoutParams(layoutParams);
            c36906c0M39304I3.f81613i.setOnCheckedChangeListener(new C17999a(c36906c0M39304I3, this));
            c36906c0M39304I3.f81613i.m54743f(R$id.rb_order_book);
        }
    }

    public MarginMarketTradeFragment() {
        final Function0 function0 = null;
        this.f33472c0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MarginMarketViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.margin.market.trade.MarginMarketTradeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.kubi.margin.market.trade.MarginMarketTradeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.margin.market.trade.MarginMarketTradeFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: S3 */
    private final void m39260S3() {
        m39259R3().m38821r().observe(getViewLifecycleOwner(), new C18000b(new Function1() { // from class: com.kubi.margin.market.trade.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginMarketTradeFragment.m39261T3(this.f33555b, (MarketCoinInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public static final InterfaceC46307h m39263V3() {
        return (InterfaceC46307h) C42597a.m93390f().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: W3 */
    public static final List m39264W3(MarginMarketTradeFragment marginMarketTradeFragment) {
        return CollectionsKt.listOf((Object[]) new BaseFragment[]{marginMarketTradeFragment.m39308N3(), marginMarketTradeFragment.m39310P3(), marginMarketTradeFragment.m39306K3()});
    }

    /* JADX INFO: renamed from: a4 */
    public static final TradeItemBean m39268a4(MarginMarketTradeFragment marginMarketTradeFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marginMarketTradeFragment.getArguments();
        if (arguments != null && (tradeItemBean = (TradeItemBean) arguments.getParcelable("data")) != null) {
            return tradeItemBean;
        }
        return new TradeItemBean("BTC-USDT");
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m39270h4(MarginMarketTradeFragment marginMarketTradeFragment) {
        LinearLayout linearLayout;
        C36936r0 c36936r0;
        if (marginMarketTradeFragment.getView() != null && marginMarketTradeFragment.getHost() != null) {
            MarginMarketTradePopup marginMarketTradePopupM39309O3 = marginMarketTradeFragment.m39309O3();
            C36906c0 c36906c0M39304I3 = marginMarketTradeFragment.m39304I3();
            if (c36906c0M39304I3 != null && (c36936r0 = c36906c0M39304I3.f81608d) != null) {
                linearLayout = c36936r0.f81952q;
            } else {
                linearLayout = null;
            }
            marginMarketTradePopupM39309O3.m39428z(linearLayout);
        }
    }

    /* JADX INFO: renamed from: i4 */
    private final void m39271i4() {
        Observable map;
        final String strM66551u = DowngradeExKt.m66551u("/quicksilver/symbol-stats:%s", new Object[]{m39258Q3().getSymbol()}, null, 2, null);
        final String strM66551u2 = DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{m39258Q3().getSymbol()}, null, 2, null);
        final String strM66551u3 = DowngradeExKt.m66551u("/market/match:%s", new Object[]{m39258Q3().getSymbol()}, null, 2, null);
        SpotMarketSocketAdapter spotMarketSocketAdapter = SpotMarketSocketAdapter.f28144a;
        if (spotMarketSocketAdapter.m32665b0()) {
            Request.Companion companion = Request.INSTANCE;
            InterfaceC46307h interfaceC46307hM39257L3 = m39257L3();
            String symbol = m39258Q3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            Request requestSubscribe = companion.subscribe(interfaceC46307hM39257L3.m102128l(symbol), strM66551u, strM66551u2);
            InterfaceC46307h interfaceC46307hM39257L4 = m39257L3();
            String symbol2 = m39258Q3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
            C19406c c19406c = new C19406c(requestSubscribe, companion.unsubscribe(interfaceC46307hM39257L4.m102128l(symbol2), strM66551u, strM66551u2), null, false, null, 20, null);
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.trade.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginMarketTradeFragment.m39273j4(strM66551u, strM66551u2, (Message) obj));
                }
            };
            Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.margin.market.trade.k
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginMarketTradeFragment.m39275k4(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.trade.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketTradeFragment.m39277l4(strM66551u, (Message) obj);
                }
            };
            ObservableSource map2 = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.margin.market.trade.m
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginMarketTradeFragment.m39279m4(function2, obj);
                }
            });
            String symbol3 = m39258Q3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol3, "getSymbol(...)");
            Observable observableM32619F = SpotMarketSocketAdapter.m32619F(spotMarketSocketAdapter, symbol3, false, new Function0() { // from class: com.kubi.margin.market.trade.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketTradeFragment.m39281n4();
                }
            }, 2, null);
            final Function1 function3 = new Function1() { // from class: com.kubi.margin.market.trade.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketTradeFragment.m39283o4((SpotMatchPushEntity) obj);
                }
            };
            map = Observable.merge(map2, observableM32619F.map(new io.reactivex.functions.Function() { // from class: com.kubi.margin.market.trade.p
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginMarketTradeFragment.m39285p4(function3, obj);
                }
            }));
        } else {
            Request.Companion companion2 = Request.INSTANCE;
            InterfaceC46307h interfaceC46307hM39257L5 = m39257L3();
            String symbol4 = m39258Q3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol4, "getSymbol(...)");
            Request requestSubscribe2 = companion2.subscribe(interfaceC46307hM39257L5.m102128l(symbol4), strM66551u, strM66551u2, strM66551u3);
            InterfaceC46307h interfaceC46307hM39257L6 = m39257L3();
            String symbol5 = m39258Q3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol5, "getSymbol(...)");
            C19406c c19406c2 = new C19406c(requestSubscribe2, companion2.unsubscribe(interfaceC46307hM39257L6.m102128l(symbol5), strM66551u, strM66551u2, strM66551u3), null, false, null, 20, null);
            final Function1 function4 = new Function1() { // from class: com.kubi.margin.market.trade.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginMarketTradeFragment.m39287q4(strM66551u, strM66551u2, strM66551u3, (Message) obj));
                }
            };
            Observable<Message> observableFilter2 = c19406c2.filter(new Predicate() { // from class: com.kubi.margin.market.trade.r
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginMarketTradeFragment.m39289r4(function4, obj);
                }
            });
            final Function1 function5 = new Function1() { // from class: com.kubi.margin.market.trade.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketTradeFragment.m39291s4(strM66551u, strM66551u2, (Message) obj);
                }
            };
            map = observableFilter2.map(new io.reactivex.functions.Function() { // from class: com.kubi.margin.market.trade.d0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginMarketTradeFragment.m39293t4(function5, obj);
                }
            });
        }
        Intrinsics.checkNotNull(map);
        Observable observableObserveOn = FlowableCompatKt.m66394h(map).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.market.trade.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginMarketTradeFragment.m39295u4(this.f33508b, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.margin.market.trade.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginMarketTradeFragment.m39297v4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.trade.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginMarketTradeFragment.m39299w4(function6, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: n4 */
    public static final Observable m39281n4() {
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public static final Unit m39297v4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public static final void m39299w4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public final void m39301x4() {
        Integer numValueOf;
        RadioGroupPlus radioGroupPlus;
        Fragment fragmentM39308N3 = m39308N3();
        C36906c0 c36906c0M39304I3 = m39304I3();
        String str = null;
        if (c36906c0M39304I3 != null && (radioGroupPlus = c36906c0M39304I3.f81613i) != null) {
            numValueOf = Integer.valueOf(radioGroupPlus.getF44016b());
        } else {
            numValueOf = null;
        }
        int i11 = R$id.rb_order_book;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            fragmentM39308N3 = m39308N3();
            str = "oderBook";
        } else {
            int i12 = R$id.rb_recent_deal;
            if (numValueOf != null && numValueOf.intValue() == i12) {
                fragmentM39308N3 = m39310P3();
                str = "recentTrades";
            } else {
                int i13 = R$id.rb_trade_guide;
                if (numValueOf != null && numValueOf.intValue() == i13) {
                    fragmentM39308N3 = m39306K3();
                    str = "DataAnalysis";
                }
            }
        }
        if (str != null) {
            C43852m.m96591c("B4candle", str, null, null, 12, null);
        }
        if (!fragmentM39308N3.isAdded()) {
            getChildFragmentManager().beginTransaction().add(R$id.fl_main_container, fragmentM39308N3).commitNowAllowingStateLoss();
        }
        for (BaseFragment baseFragment : m39307M3()) {
            if (!Intrinsics.areEqual(baseFragment, fragmentM39308N3)) {
                C27032f.m66615f(this, baseFragment);
            } else {
                C27032f.m66627r(this, baseFragment);
            }
        }
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public TradeItemBean mo38428D0() {
        return m39258Q3();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m39311b4(BigDecimal bigDecimal) {
        Double changeRate;
        C36906c0 c36906c0M39304I3 = m39304I3();
        if (c36906c0M39304I3 != null) {
            c36906c0M39304I3.f81608d.f81939d.setText(C27041f.m66669i(C37886j.m85579c(bigDecimal, m39258Q3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null), "--"));
            FixAutoSizeTextView fixAutoSizeTextView = c36906c0M39304I3.f81608d.f81939d;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            MarketTicker marketTicker = m39258Q3().marketTicker;
            if (marketTicker != null) {
                changeRate = marketTicker.getChangeRate();
            } else {
                changeRate = null;
            }
            fixAutoSizeTextView.setTextColor(C22890g.m54278c(contextRequireContext, C27039d.m66646f(changeRate), R$color.c_text));
            c36906c0M39304I3.f81608d.f81945j.setText(C41014a.m89950x(C41014a.m89940n(bigDecimal, m39258Q3().getSymbolInfoEntity().getQuoteCurrency()), null, null, 0, false, true, false, false, 111, null));
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m39313d4(MarketTicker marketTicker) {
        String strM85579c;
        Double changeRate;
        String strM89950x;
        Double changeRate2;
        Double changeRate3;
        String strM85579c2;
        Double low;
        Double high;
        Double lastDealPrice;
        Double lastDealPrice2;
        C36906c0 c36906c0M39304I3 = m39304I3();
        if (c36906c0M39304I3 != null) {
            FixAutoSizeTextView fixAutoSizeTextView = c36906c0M39304I3.f81608d.f81939d;
            String strM85579c3 = null;
            if (marketTicker == null || (lastDealPrice2 = marketTicker.getLastDealPrice()) == null) {
                strM85579c = null;
            } else {
                strM85579c = C37886j.m85579c(new BigDecimal(String.valueOf(lastDealPrice2.doubleValue())), m39258Q3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            fixAutoSizeTextView.setText(C27041f.m66669i(strM85579c, "--"));
            FixAutoSizeTextView fixAutoSizeTextView2 = c36906c0M39304I3.f81608d.f81939d;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            if (marketTicker != null) {
                changeRate = marketTicker.getChangeRate();
            } else {
                changeRate = null;
            }
            fixAutoSizeTextView2.setTextColor(C22890g.m54278c(contextRequireContext, C27039d.m66646f(changeRate), R$color.c_text));
            BaseTextView baseTextView = c36906c0M39304I3.f81608d.f81945j;
            if (marketTicker != null && (lastDealPrice = marketTicker.getLastDealPrice()) != null) {
                strM89950x = C41014a.m89950x(C41014a.m89939m(lastDealPrice.doubleValue(), m39258Q3().getSymbolInfoEntity().getQuoteCurrency()), null, null, 0, false, true, false, false, 111, null);
            } else {
                strM89950x = null;
            }
            baseTextView.setText(C27041f.m66669i(strM89950x, "--"));
            UpDownTextView upDownTextView = c36906c0M39304I3.f81608d.f81944i;
            if (marketTicker != null) {
                changeRate2 = marketTicker.getChangeRate();
            } else {
                changeRate2 = null;
            }
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            if (marketTicker != null) {
                changeRate3 = marketTicker.getChangeRate();
            } else {
                changeRate3 = null;
            }
            upDownTextView.m54919g(changeRate2, C22890g.m54279d(contextRequireContext2, C27039d.m66646f(changeRate3), 0, 2, null));
            BaseTextView baseTextView2 = c36906c0M39304I3.f81608d.f81942g;
            if (marketTicker != null && (high = marketTicker.getHigh()) != null) {
                strM85579c2 = C37886j.m85579c(new BigDecimal(String.valueOf(high.doubleValue())), m39258Q3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : true, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            } else {
                strM85579c2 = null;
            }
            baseTextView2.setText(C27041f.m66669i(strM85579c2, "--"));
            BaseTextView baseTextView3 = c36906c0M39304I3.f81608d.f81937b;
            if (marketTicker != null && (low = marketTicker.getLow()) != null) {
                strM85579c3 = C37886j.m85579c(new BigDecimal(String.valueOf(low.doubleValue())), m39258Q3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : true, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            baseTextView3.setText(C27041f.m66669i(strM85579c3, "--"));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m39314f4(WsMarketTickerStatsEntity wsMarketTickerStatsEntity) {
        String priceChangeRate24h;
        Double dValueOf;
        String volume24h;
        String strM89931e;
        String volumeValue24h;
        C36906c0 c36906c0M39304I3 = m39304I3();
        if (c36906c0M39304I3 != null) {
            TradeItemBean tradeItemBeanM39258Q3 = m39258Q3();
            String strM89931e2 = null;
            if (wsMarketTickerStatsEntity != null) {
                priceChangeRate24h = wsMarketTickerStatsEntity.getPriceChangeRate24h();
            } else {
                priceChangeRate24h = null;
            }
            BigDecimal bigDecimalM66671k = C27041f.m66671k(priceChangeRate24h);
            if (bigDecimalM66671k != null) {
                dValueOf = Double.valueOf(bigDecimalM66671k.doubleValue());
            } else {
                dValueOf = null;
            }
            tradeItemBeanM39258Q3.setChangeRate(dValueOf);
            BaseTextView baseTextView = c36906c0M39304I3.f81608d.f81946k;
            if (wsMarketTickerStatsEntity != null) {
                volume24h = wsMarketTickerStatsEntity.getVolume24h();
            } else {
                volume24h = null;
            }
            BigDecimal bigDecimalM66671k2 = C27041f.m66671k(volume24h);
            if (bigDecimalM66671k2 != null) {
                strM89931e = C41014a.m89931e(bigDecimalM66671k2, false, 1, null);
            } else {
                strM89931e = null;
            }
            baseTextView.setText(strM89931e);
            BaseTextView baseTextView2 = c36906c0M39304I3.f81608d.f81948m;
            if (wsMarketTickerStatsEntity != null) {
                volumeValue24h = wsMarketTickerStatsEntity.getVolumeValue24h();
            } else {
                volumeValue24h = null;
            }
            BigDecimal bigDecimalM66671k3 = C27041f.m66671k(volumeValue24h);
            if (bigDecimalM66671k3 != null) {
                strM89931e2 = C41014a.m89931e(bigDecimalM66671k3, false, 1, null);
            }
            baseTextView2.setText(strM89931e2);
            m39309O3().m39423C(wsMarketTickerStatsEntity);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m39315g4() {
        C36936r0 c36936r0;
        LinearLayout linearLayout;
        C36906c0 c36906c0M39304I3 = m39304I3();
        if (c36906c0M39304I3 != null && (c36936r0 = c36906c0M39304I3.f81608d) != null && (linearLayout = c36936r0.f81952q) != null) {
            linearLayout.postDelayed(new Runnable() { // from class: com.kubi.margin.market.trade.w
                @Override // java.lang.Runnable
                public final void run() {
                    MarginMarketTradeFragment.m39270h4(this.f33562b);
                }
            }, 100L);
        }
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    public int getPrecision() {
        Integer numValueOf;
        SymbolInfoEntity symbolInfoEntity = m39258Q3().getSymbolInfoEntity();
        if (symbolInfoEntity != null) {
            numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m39260S3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m39271i4();
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    /* JADX INFO: renamed from: z1 */
    public int mo38603z1() {
        Integer numValueOf;
        Bundle arguments = getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("tradeType"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, -1);
    }
}
