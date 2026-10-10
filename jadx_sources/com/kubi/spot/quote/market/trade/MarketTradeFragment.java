package com.kubi.spot.quote.market.trade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.kucoin.manager.SpotMatchPushEntity;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.operation.api.IOperationService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FixAutoSizeTextView;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.spot.R$color;
import com.kubi.spot.R$font;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.spot.business.callAuction.CallAuctionViewController;
import com.kubi.spot.entity.Tag;
import com.kubi.spot.entity.WsMarketSnapshotWrapperEntity;
import com.kubi.spot.entity.WsRecentDealEntity;
import com.kubi.spot.entity.WsRecentDealEntityKt;
import com.kubi.spot.kline.KuCoinKlineFragment;
import com.kubi.spot.quote.market.KuCoinMarketViewModel;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.spot.quote.market.info.MarketTickerStatsEntity;
import com.kubi.spot.quote.market.info.WsMarketTickerStatsEntity;
import com.kubi.spot.quote.market.rank.RankHelper;
import com.kubi.spot.service.SpotDepend;
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
import e20.InterfaceC37053d;
import f30.C37330a;
import gf.C37886j;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import mr.C42597a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p830zf.InterfaceC46787a0;
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
import t20.C44650l;
import t20.C44668u;
import w00.C45681e;

/* JADX INFO: compiled from: MarketTradeFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u0000 c2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u001a\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020A2\b\u0010D\u001a\u0004\u0018\u00010EH\u0017J\b\u0010K\u001a\u00020IH\u0016J\b\u0010L\u001a\u00020IH\u0016J\u0010\u0010M\u001a\u00020I2\b\u0010N\u001a\u0004\u0018\u00010OJ\b\u0010P\u001a\u00020IH\u0002J\b\u0010Q\u001a\u00020IH\u0002J\b\u0010R\u001a\u00020IH\u0002J\u0012\u0010S\u001a\u00020I2\b\u0010T\u001a\u0004\u0018\u00010UH\u0003J\u0012\u0010V\u001a\u00020I2\b\u0010T\u001a\u0004\u0018\u00010WH\u0002J\u0012\u0010X\u001a\u00020I2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0002J\u0010\u0010[\u001a\u00020I2\u0006\u0010\\\u001a\u00020]H\u0002J\b\u0010^\u001a\u00020(H\u0016J\b\u0010_\u001a\u000207H\u0016J\u0006\u0010`\u001a\u00020IJ\u0010\u0010a\u001a\u00020I2\u0006\u0010b\u001a\u00020OH\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\u001f\u0010 R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0012\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0012\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0012\u001a\u0004\b3\u00104R\u001a\u00106\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001b\u0010<\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0012\u001a\u0004\b=\u0010>¨\u0006d"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketTradeFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/spot/kline/KuCoinKlineFragment$IKlineFragmentProvider;", "Lcom/kubi/trade/core/biz/page/ICallAuctionProcessAction;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinFragmentMarketTradeBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinFragmentMarketTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/spot/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "mOrderBookFragment", "Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;", "getMOrderBookFragment", "()Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;", "mOrderBookFragment$delegate", "mRecentDealFragment", "Lcom/kubi/spot/quote/market/trade/MarketRecentDealFragment;", "getMRecentDealFragment", "()Lcom/kubi/spot/quote/market/trade/MarketRecentDealFragment;", "mRecentDealFragment$delegate", "mAnalysisFragment", "Lcom/kubi/spot/quote/market/trade/MarketAnalysisFragment;", "getMAnalysisFragment", "()Lcom/kubi/spot/quote/market/trade/MarketAnalysisFragment;", "mAnalysisFragment$delegate", "mFragmentList", "", "getMFragmentList", "()Ljava/util/List;", "mFragmentList$delegate", "mTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "getMTradeBean", "()Lcom/kubi/data/entity/TradeItemBean;", "mTradeBean$delegate", "mPopup", "Lcom/kubi/spot/quote/market/trade/MarketTradePopup;", "getMPopup", "()Lcom/kubi/spot/quote/market/trade/MarketTradePopup;", "mPopup$delegate", "mViewModel", "Lcom/kubi/spot/quote/market/KuCoinMarketViewModel;", "getMViewModel", "()Lcom/kubi/spot/quote/market/KuCoinMarketViewModel;", "mViewModel$delegate", "contentHeight", "", "getContentHeight", "()I", "setContentHeight", "(I)V", "callAuctionProcessFragment", "getCallAuctionProcessFragment", "()Lcom/kubi/sdk/BaseFragment;", "callAuctionProcessFragment$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "setCoinLabel", "coinLabel", "", "initListener", "subscribe", "toggleCurrentFragment", "onQuickResponse", "ticker", "Lcom/kubi/spot/quote/market/info/MarketTickerStatsEntity;", "onWsQuickResponse", "Lcom/kubi/spot/quote/market/info/WsMarketTickerStatsEntity;", "onSnapShotResponse", "marketTicker", "Lcom/kubi/data/entity/MarketTicker;", "onLastDealResponse", "recentDeal", "", "getTradeBean", "getPrecision", "resetPopupLoc", "handleCallAuction", "symbol", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketTradeFragment.kt\ncom/kubi/spot/quote/market/trade/MarketTradeFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 ExUtils.kt\ncom/kubi/spot/utils/ExUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 9 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,478:1\n147#2,16:479\n172#3,9:495\n17#4,2:504\n17#4,2:506\n17#4,2:514\n17#4,2:516\n158#5,2:508\n60#6,3:510\n1#7:513\n58#8,6:518\n64#8,2:525\n58#8,6:527\n64#8,2:534\n58#8,6:536\n64#8,2:543\n58#8,6:545\n64#8,2:552\n58#8,6:554\n64#8,2:561\n58#8,6:563\n64#8,2:570\n58#8,6:572\n64#8,2:579\n126#9:524\n126#9:533\n126#9:542\n126#9:551\n126#9:560\n126#9:569\n126#9:578\n*S KotlinDebug\n*F\n+ 1 MarketTradeFragment.kt\ncom/kubi/spot/quote/market/trade/MarketTradeFragment\n*L\n72#1:479,16\n102#1:495,9\n137#1:504,2\n138#1:506,2\n86#1:514,2\n88#1:516,2\n188#1:508,2\n204#1:510,3\n262#1:518,6\n262#1:525,2\n263#1:527,6\n263#1:534,2\n266#1:536,6\n266#1:543,2\n294#1:545,6\n294#1:552,2\n295#1:554,6\n295#1:561,2\n298#1:563,6\n298#1:570,2\n299#1:572,6\n299#1:579,2\n262#1:524\n263#1:533\n266#1:542\n294#1:551\n295#1:560\n298#1:569\n299#1:578\n*E\n"})
public final class MarketTradeFragment extends BaseFragment implements KuCoinKlineFragment.InterfaceC25353a {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f51125c0;

    /* JADX INFO: renamed from: d0 */
    public int f51126d0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f51116g0 = {Reflection.property1(new PropertyReference1Impl(MarketTradeFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinFragmentMarketTradeBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f51115f0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f51117U = C45681e.m100799e(this, new Function1<MarketTradeFragment, C44650l>() { // from class: com.kubi.spot.quote.market.trade.MarketTradeFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44650l invoke(@NotNull MarketTradeFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44650l.m98776a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44650l, Unit>() { // from class: com.kubi.spot.quote.market.trade.MarketTradeFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44650l it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44650l c44650l) {
            invoke(c44650l);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f51118V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.e1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketTradeFragment.m62919Z3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f51119W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.f1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketTradeFragment.m62921b4(this.f51150b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f51120X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.g1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketTradeFragment.m62923d4(this.f51154b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f51121Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.h1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketTradeFragment.m62918Y3(this.f51157b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f51122Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.j1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketTradeFragment.m62920a4(this.f51166b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f51123a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.k1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketTradeFragment.m62924e4(this.f51169b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f51124b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.l1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketTradeFragment.m62922c4(this.f51171b);
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f51127e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.m1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketTradeFragment.m62911K3();
        }
    });

    /* JADX INFO: compiled from: MarketTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketTradeFragment$Companion;", "", "<init>", "()V", "SOCKET_ERROR_UPDATE_CALL_AUCTION_PROCESS", "", "MARKET_TRADE_FRAGMENT_CLASS_NAME", "newInstance", "Lcom/kubi/spot/quote/market/trade/MarketTradeFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarketTradeFragment newInstance(@NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarketTradeFragment marketTradeFragment = new MarketTradeFragment();
            marketTradeFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66717a());
            return marketTradeFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketTradeFragment$a */
    /* JADX INFO: compiled from: MarketTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/spot/quote/market/trade/MarketTradeFragment$onViewCreated$8", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25719a implements RadioGroupPlus.InterfaceC22946c {
        public C25719a() {
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            C44650l c44650lM62958L3 = MarketTradeFragment.this.m62958L3();
            if (c44650lM62958L3 != null) {
                MarketTradeFragment marketTradeFragment = MarketTradeFragment.this;
                RadioButton radioButton = c44650lM62958L3.f99183i;
                radioButton.setTypeface(i11 == R$id.rb_order_book ? ResourcesCompat.getFont(radioButton.getContext(), R$font.semi) : ResourcesCompat.getFont(radioButton.getContext(), R$font.medium));
                RadioButton radioButton2 = c44650lM62958L3.f99184j;
                radioButton2.setTypeface(i11 == R$id.rb_recent_deal ? ResourcesCompat.getFont(radioButton2.getContext(), R$font.semi) : ResourcesCompat.getFont(radioButton2.getContext(), R$font.medium));
                RadioButton radioButton3 = c44650lM62958L3.f99185k;
                radioButton3.setTypeface(i11 == R$id.rb_trade_guide ? ResourcesCompat.getFont(radioButton3.getContext(), R$font.semi) : ResourcesCompat.getFont(radioButton3.getContext(), R$font.medium));
                marketTradeFragment.m62903C4();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketTradeFragment$b */
    /* JADX INFO: compiled from: MarketTradeFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25720b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f51129b;

        public C25720b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f51129b = function;
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
            return this.f51129b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51129b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketTradeFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25721c extends TypeToken<MarketTickerStatsEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketTradeFragment$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25722d extends TypeToken<WsMarketTickerStatsEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketTradeFragment$e */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25723e extends TypeToken<WsMarketSnapshotWrapperEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketTradeFragment$f */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25724f extends TypeToken<MarketTickerStatsEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketTradeFragment$g */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25725g extends TypeToken<WsMarketTickerStatsEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketTradeFragment$h */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25726h extends TypeToken<WsMarketSnapshotWrapperEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketTradeFragment$i */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25727i extends TypeToken<WsRecentDealEntity> {
    }

    /* JADX INFO: renamed from: K3 */
    public static final BaseFragment m62911K3() {
        return ISpotCommonService.f49644a.get().mo59974r();
    }

    /* JADX INFO: renamed from: P3 */
    private final InterfaceC37053d m62912P3() {
        return (InterfaceC37053d) this.f51118V.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    private final List<BaseFragment> m62913Q3() {
        return (List) this.f51122Z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public final TradeItemBean m62914U3() {
        return (TradeItemBean) this.f51123a0.getValue();
    }

    /* JADX INFO: renamed from: V3 */
    private final KuCoinMarketViewModel m62915V3() {
        return (KuCoinMarketViewModel) this.f51125c0.getValue();
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m62917X3(MarketTradeFragment marketTradeFragment, MarketCoinInfo marketCoinInfo) {
        C44668u c44668u;
        ImageView imageView;
        C44668u c44668u2;
        BaseTextView baseTextView;
        C44668u c44668u3;
        BaseTextView baseTextView2;
        if (marketCoinInfo == null) {
            return Unit.INSTANCE;
        }
        marketTradeFragment.m62963S3().m62995D(marketCoinInfo);
        List<Tag> currencyTagList = marketCoinInfo.getCurrencyTagList();
        if (currencyTagList == null || currencyTagList.isEmpty()) {
            C44650l c44650lM62958L3 = marketTradeFragment.m62958L3();
            if (c44650lM62958L3 != null && (c44668u2 = c44650lM62958L3.f99181g) != null && (baseTextView = c44668u2.f99371e) != null) {
                ViewExtKt.m66577h(baseTextView);
            }
            C44650l c44650lM62958L4 = marketTradeFragment.m62958L3();
            if (c44650lM62958L4 != null && (c44668u = c44650lM62958L4.f99181g) != null && (imageView = c44668u.f99372f) != null) {
                ViewExtKt.m66577h(imageView);
            }
        } else {
            List<Tag> sortedTagList = marketCoinInfo.getSortedTagList();
            C44650l c44650lM62958L5 = marketTradeFragment.m62958L3();
            if (c44650lM62958L5 != null && (c44668u3 = c44650lM62958L5.f99181g) != null && (baseTextView2 = c44668u3.f99371e) != null) {
                RankHelper rankHelper = RankHelper.f51027a;
                String symbol = marketTradeFragment.m62914U3().getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                rankHelper.m62658e(symbol, sortedTagList.get(0), baseTextView2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final MarketAnalysisFragment m62918Y3(MarketTradeFragment marketTradeFragment) {
        return MarketAnalysisFragment.f51077Z.newInstance(marketTradeFragment.m62914U3());
    }

    /* JADX INFO: renamed from: a4 */
    public static final List m62920a4(MarketTradeFragment marketTradeFragment) {
        Router router = Router.f46192a;
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        Object objM56186h = router.m56186h(InterfaceC46787a0.class, siteInfoManager.m58109c());
        boolean zMo102972a = objM56186h != null ? ((InterfaceC46787a0) objM56186h).mo102972a() : true;
        Object objM56186h2 = router.m56186h(InterfaceC46787a0.class, siteInfoManager.m58109c());
        boolean zMo102974c = objM56186h2 != null ? ((InterfaceC46787a0) objM56186h2).mo102974c() : true;
        List listMutableListOf = CollectionsKt.mutableListOf(marketTradeFragment.m62962R3());
        if (zMo102974c) {
            listMutableListOf.add(marketTradeFragment.m62964T3());
        }
        if (zMo102972a) {
            listMutableListOf.add(marketTradeFragment.m62961O3());
        }
        return listMutableListOf;
    }

    /* JADX INFO: renamed from: b4 */
    public static final MarketOrderBookFragment m62921b4(MarketTradeFragment marketTradeFragment) {
        return MarketOrderBookFragment.f51084c0.newInstance(marketTradeFragment.m62914U3());
    }

    /* JADX INFO: renamed from: c4 */
    public static final MarketTradePopup m62922c4(MarketTradeFragment marketTradeFragment) {
        return new MarketTradePopup(marketTradeFragment);
    }

    /* JADX INFO: renamed from: d4 */
    public static final MarketRecentDealFragment m62923d4(MarketTradeFragment marketTradeFragment) {
        return MarketRecentDealFragment.f51095d0.newInstance(marketTradeFragment.m62914U3());
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m62926i4(MarketTradeFragment marketTradeFragment) {
        C44668u c44668u;
        LinearLayout linearLayout;
        C43852m.m96591c("B5candle", "MoreData", null, null, 12, null);
        C44650l c44650lM62958L3 = marketTradeFragment.m62958L3();
        if (c44650lM62958L3 != null && (c44668u = c44650lM62958L3.f99181g) != null && (linearLayout = c44668u.f99383q) != null) {
            marketTradeFragment.m62963S3().m63002z(linearLayout);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final boolean m62935o4(String str, String str2, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        if (Intrinsics.areEqual(it.getSource(), "socket")) {
            return Intrinsics.areEqual(it.getTopic(), str) || Intrinsics.areEqual(it.getTopic(), str2);
        }
        return false;
    }

    /* JADX INFO: renamed from: p4 */
    public static final boolean m62937p4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: q4 */
    public static final Object m62939q4(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C25721c().getType());
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
                    objM66914d = C27099x.m66914d(data2, new C25722d().getType());
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
                objM66914d = C27099x.m66914d(data3, new C25723e().getType());
            } catch (Throwable unused3) {
            }
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Object m62941r4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Object m62945t4(SpotMatchPushEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WsRecentDealEntity spotWsRecentDealEntity = WsRecentDealEntityKt.toSpotWsRecentDealEntity(it);
        Intrinsics.checkNotNull(spotWsRecentDealEntity, "null cannot be cast to non-null type kotlin.Any");
        return spotWsRecentDealEntity;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Object m62947u4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: v4 */
    public static final boolean m62949v4(String str, String str2, String str3, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        if (Intrinsics.areEqual(it.getSource(), "socket")) {
            return Intrinsics.areEqual(it.getTopic(), str) || Intrinsics.areEqual(it.getTopic(), str2) || Intrinsics.areEqual(it.getTopic(), str3);
        }
        return false;
    }

    /* JADX INFO: renamed from: w4 */
    public static final boolean m62951w4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: x4 */
    public static final Object m62953x4(String str, String str2, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C25724f().getType());
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
                    objM66914d = C27099x.m66914d(data2, new C25725g().getType());
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
                        objM66914d = C27099x.m66914d(data3, new C25726h().getType());
                    }
                } else if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                    String data4 = it.getData();
                    Intrinsics.checkNotNull(data4, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x4 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data4, new C25727i().getType());
                }
            } catch (Throwable unused3) {
            }
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Object m62955y4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m62957z4(MarketTradeFragment marketTradeFragment, Object obj) {
        if (obj instanceof MarketTickerStatsEntity) {
            marketTradeFragment.m62966g4((MarketTickerStatsEntity) obj);
            return;
        }
        if (obj instanceof WsMarketTickerStatsEntity) {
            marketTradeFragment.m62967j4((WsMarketTickerStatsEntity) obj);
            return;
        }
        if (!(obj instanceof WsMarketSnapshotWrapperEntity)) {
            if (obj instanceof WsRecentDealEntity) {
                marketTradeFragment.m62965f4(((WsRecentDealEntity) obj).getPrice());
            }
        } else {
            WsMarketSnapshotWrapperEntity wsMarketSnapshotWrapperEntity = (WsMarketSnapshotWrapperEntity) obj;
            WsMarketSnapshotEntity data = wsMarketSnapshotWrapperEntity.getData();
            if (data != null) {
                data.covertToTradeItemBean(marketTradeFragment.m62914U3());
            }
            WsMarketSnapshotEntity data2 = wsMarketSnapshotWrapperEntity.getData();
            marketTradeFragment.m62925h4(data2 != null ? data2.convertToMarketTicker(marketTradeFragment.m62914U3().marketTicker) : null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: L3 */
    public final C44650l m62958L3() {
        return (C44650l) this.f51117U.getValue(this, f51116g0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: M3 */
    public final BaseFragment m62959M3() {
        return (BaseFragment) this.f51127e0.getValue();
    }

    /* JADX INFO: renamed from: N3, reason: from getter */
    public final int getF51126d0() {
        return this.f51126d0;
    }

    /* JADX INFO: renamed from: O3 */
    public final MarketAnalysisFragment m62961O3() {
        return (MarketAnalysisFragment) this.f51121Y.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    public final MarketOrderBookFragment m62962R3() {
        return (MarketOrderBookFragment) this.f51119W.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    public final MarketTradePopup m62963S3() {
        return (MarketTradePopup) this.f51124b0.getValue();
    }

    /* JADX INFO: renamed from: T3 */
    public final MarketRecentDealFragment m62964T3() {
        return (MarketRecentDealFragment) this.f51120X.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g4 */
    public final void m62966g4(MarketTickerStatsEntity marketTickerStatsEntity) {
        C44668u c44668u;
        BaseTextView baseTextView;
        C44668u c44668u2;
        BaseTextView baseTextView2;
        C44668u c44668u3;
        BaseTextView baseTextView3;
        C44668u c44668u4;
        BaseTextView baseTextView4;
        C44668u c44668u5;
        UpDownTextView upDownTextView;
        C44668u c44668u6;
        UpDownTextView upDownTextView2;
        C44668u c44668u7;
        BaseTextView baseTextView5;
        String price;
        BigDecimal bigDecimalM66536f;
        C44668u c44668u8;
        FixAutoSizeTextView fixAutoSizeTextView;
        C44668u c44668u9;
        FixAutoSizeTextView fixAutoSizeTextView2;
        TradeItemBean tradeItemBeanM62914U3 = m62914U3();
        BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(marketTickerStatsEntity != null ? marketTickerStatsEntity.getPriceChangeRate24h() : null);
        tradeItemBeanM62914U3.setChangeRate(bigDecimalM66536f2 != null ? Double.valueOf(bigDecimalM66536f2.doubleValue()) : null);
        C44650l c44650lM62958L3 = m62958L3();
        if (c44650lM62958L3 != null && (c44668u9 = c44650lM62958L3.f99181g) != null && (fixAutoSizeTextView2 = c44668u9.f99370d) != null) {
            BigDecimal bigDecimalM66536f3 = DowngradeExKt.m66536f(marketTickerStatsEntity != null ? marketTickerStatsEntity.getPrice() : null);
            fixAutoSizeTextView2.setText(C27041f.m66669i(bigDecimalM66536f3 != null ? C37886j.m85579c(bigDecimalM66536f3, m62914U3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        }
        C44650l c44650lM62958L4 = m62958L3();
        if (c44650lM62958L4 != null && (c44668u8 = c44650lM62958L4.f99181g) != null && (fixAutoSizeTextView = c44668u8.f99370d) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            fixAutoSizeTextView.setTextColor(C22890g.m54278c(contextRequireContext, C27039d.m66647g(DowngradeExKt.m66536f(marketTickerStatsEntity != null ? marketTickerStatsEntity.getPriceChangeRate24h() : null)), R$color.c_text));
        }
        C44650l c44650lM62958L5 = m62958L3();
        if (c44650lM62958L5 != null && (c44668u7 = c44650lM62958L5.f99181g) != null && (baseTextView5 = c44668u7.f99376j) != null) {
            baseTextView5.setText(C27041f.m66669i((marketTickerStatsEntity == null || (price = marketTickerStatsEntity.getPrice()) == null || (bigDecimalM66536f = DowngradeExKt.m66536f(price)) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalM66536f, m62914U3().getSymbolInfoEntity().getQuoteCurrency()), null, null, 0, false, true, false, false, 111, null), "--"));
        }
        BigDecimal bigDecimalM66536f4 = DowngradeExKt.m66536f(marketTickerStatsEntity != null ? marketTickerStatsEntity.getPriceChangeRate24h() : null);
        C44650l c44650lM62958L6 = m62958L3();
        if (c44650lM62958L6 != null && (c44668u6 = c44650lM62958L6.f99181g) != null && (upDownTextView2 = c44668u6.f99375i) != null) {
            upDownTextView2.setText(C42828b.m93915p(C42828b.m93911l(C42180b.m92649n(bigDecimalM66536f4 != null ? C42180b.m92642g(bigDecimalM66536f4, null, null, 0, true, false, false, 55, null) : null))));
        }
        C44650l c44650lM62958L7 = m62958L3();
        if (c44650lM62958L7 != null && (c44668u5 = c44650lM62958L7.f99181g) != null && (upDownTextView = c44668u5.f99375i) != null) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            upDownTextView.setTextColor(C22890g.m54279d(contextRequireContext2, C27039d.m66647g(bigDecimalM66536f4), 0, 2, null));
        }
        C44650l c44650lM62958L8 = m62958L3();
        if (c44650lM62958L8 != null && (c44668u4 = c44650lM62958L8.f99181g) != null && (baseTextView4 = c44668u4.f99377k) != null) {
            BigDecimal bigDecimalM66536f5 = DowngradeExKt.m66536f(marketTickerStatsEntity != null ? marketTickerStatsEntity.getVolume24h() : null);
            baseTextView4.setText(bigDecimalM66536f5 != null ? C41014a.m89931e(bigDecimalM66536f5, false, 1, null) : null);
        }
        C44650l c44650lM62958L9 = m62958L3();
        if (c44650lM62958L9 != null && (c44668u3 = c44650lM62958L9.f99181g) != null && (baseTextView3 = c44668u3.f99379m) != null) {
            BigDecimal bigDecimalM66536f6 = DowngradeExKt.m66536f(marketTickerStatsEntity != null ? marketTickerStatsEntity.getVolumeValue24h() : null);
            baseTextView3.setText(bigDecimalM66536f6 != null ? C41014a.m89931e(bigDecimalM66536f6, false, 1, null) : null);
        }
        C44650l c44650lM62958L10 = m62958L3();
        if (c44650lM62958L10 != null && (c44668u2 = c44650lM62958L10.f99181g) != null && (baseTextView2 = c44668u2.f99373g) != null) {
            BigDecimal bigDecimalM66536f7 = DowngradeExKt.m66536f(marketTickerStatsEntity != null ? marketTickerStatsEntity.getHighestPrice24h() : null);
            baseTextView2.setText(C27041f.m66669i(bigDecimalM66536f7 != null ? C37886j.m85579c(bigDecimalM66536f7, m62914U3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : true, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        }
        C44650l c44650lM62958L11 = m62958L3();
        if (c44650lM62958L11 != null && (c44668u = c44650lM62958L11.f99181g) != null && (baseTextView = c44668u.f99368b) != null) {
            BigDecimal bigDecimalM66536f8 = DowngradeExKt.m66536f(marketTickerStatsEntity != null ? marketTickerStatsEntity.getLowestPrice24h() : null);
            baseTextView.setText(C27041f.m66669i(bigDecimalM66536f8 != null ? C37886j.m85579c(bigDecimalM66536f8, m62914U3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : true, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        }
        m62963S3().m62996E(marketTickerStatsEntity);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m62969m4(@Nullable String str) {
        C44668u c44668u;
        ShapeTextView shapeTextView;
        C44668u c44668u2;
        ShapeTextView shapeTextView2;
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        C44650l c44650lM62958L3 = m62958L3();
        if (c44650lM62958L3 != null && (c44668u2 = c44650lM62958L3.f99181g) != null && (shapeTextView2 = c44668u2.f99385s) != null) {
            shapeTextView2.setText(str);
        }
        C44650l c44650lM62958L4 = m62958L3();
        if (c44650lM62958L4 == null || (c44668u = c44650lM62958L4.f99181g) == null || (shapeTextView = c44668u.f99385s) == null) {
            return;
        }
        ViewExtKt.m66594y(shapeTextView);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_fragment_market_trade, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout2;
        C44668u c44668u;
        ConstraintLayout constraintLayout;
        C44668u c44668u2;
        BaseTextView baseTextView;
        C44668u c44668u3;
        BaseTextView baseTextView2;
        RadioButton radioButton;
        RadioButton radioButton2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f51126d0 = (C5267e0.m6182d() - C5275i0.m6236a(211.0f)) - IKuFacadeService.f27711a.get().mo31927f();
        C44650l c44650lM62958L3 = m62958L3();
        if (c44650lM62958L3 != null && (radioButton2 = c44650lM62958L3.f99185k) != null) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46787a0.class, SiteInfoManager.f47913a.m58109c());
            C37330a.m83912d(radioButton2, objM56186h != null ? ((InterfaceC46787a0) objM56186h).mo102972a() : true);
        }
        C44650l c44650lM62958L4 = m62958L3();
        if (c44650lM62958L4 != null && (radioButton = c44650lM62958L4.f99184j) != null) {
            Object objM56186h2 = Router.f46192a.m56186h(InterfaceC46787a0.class, SiteInfoManager.f47913a.m58109c());
            C37330a.m83912d(radioButton, objM56186h2 != null ? ((InterfaceC46787a0) objM56186h2).mo102974c() : true);
        }
        C44650l c44650lM62958L5 = m62958L3();
        if (c44650lM62958L5 != null && (c44668u3 = c44650lM62958L5.f99181g) != null && (baseTextView2 = c44668u3.f99378l) != null) {
            baseTextView2.setText(getString(R$string.market_24h_vol) + '(' + m62914U3().getSymbolInfoEntity().getBaseCurrencyName() + ')');
        }
        C44650l c44650lM62958L6 = m62958L3();
        if (c44650lM62958L6 != null && (c44668u2 = c44650lM62958L6.f99181g) != null && (baseTextView = c44668u2.f99380n) != null) {
            baseTextView.setText(getString(R$string.market_24h_amount) + '(' + m62914U3().getSymbolInfoEntity().getQuoteCurrencyName() + ')');
        }
        C44650l c44650lM62958L7 = m62958L3();
        if (c44650lM62958L7 != null && (c44668u = c44650lM62958L7.f99181g) != null && (constraintLayout = c44668u.f99382p) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.c1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketTradeFragment.m62926i4(this.f51139b);
                }
            }, 1, null);
        }
        C44650l c44650lM62958L8 = m62958L3();
        if (c44650lM62958L8 != null && (frameLayout = c44650lM62958L8.f99177c) != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = this.f51126d0;
            C44650l c44650lM62958L9 = m62958L3();
            if (c44650lM62958L9 != null && (frameLayout2 = c44650lM62958L9.f99177c) != null) {
                frameLayout2.setLayoutParams(layoutParams);
            }
        }
        int i11 = R$id.fragment_container_hottopic;
        IOperationService iOperationServiceM63034d = SpotDepend.f51244a.m63034d();
        String baseCurrency = m62914U3().getSymbolInfoEntity().getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        C27032f.m66625p(this, i11, iOperationServiceM63034d.mo4599a(baseCurrency), null, 4, null);
        C44650l c44650lM62958L10 = m62958L3();
        if (c44650lM62958L10 != null && (radioGroupPlus2 = c44650lM62958L10.f99186l) != null) {
            radioGroupPlus2.setOnCheckedChangeListener(new C25719a());
        }
        C44650l c44650lM62958L11 = m62958L3();
        if (c44650lM62958L11 != null && (radioGroupPlus = c44650lM62958L11.f99186l) != null) {
            radioGroupPlus.m54743f(R$id.rb_order_book);
        }
        CallAuctionViewController callAuctionViewController = CallAuctionViewController.f49857a;
        String symbol = m62914U3().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        callAuctionViewController.m60535b(this, symbol, m62958L3());
        if (C12573b.f21598a.m23696a()) {
            "socket_error_update_call_auction_process".length();
        }
        C12572a.m23692a(this, true, new MarketTradeFragment$onViewCreated$$inlined$bindFlowEvent$1("socket_error_update_call_auction_process", null, this));
    }

    public MarketTradeFragment() {
        final Function0 function0 = null;
        this.f51125c0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(KuCoinMarketViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.spot.quote.market.trade.MarketTradeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.kubi.spot.quote.market.trade.MarketTradeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.spot.quote.market.trade.MarketTradeFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: A4 */
    public static final Unit m62899A4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final void m62901B4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public final void m62903C4() {
        Integer numValueOf;
        RadioGroupPlus radioGroupPlus;
        Fragment fragmentM62962R3 = m62962R3();
        C44650l c44650lM62958L3 = m62958L3();
        String str = null;
        if (c44650lM62958L3 != null && (radioGroupPlus = c44650lM62958L3.f99186l) != null) {
            numValueOf = Integer.valueOf(radioGroupPlus.getF44016b());
        } else {
            numValueOf = null;
        }
        int i11 = R$id.rb_order_book;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            fragmentM62962R3 = m62962R3();
            str = "oderBook";
        } else {
            int i12 = R$id.rb_recent_deal;
            if (numValueOf != null && numValueOf.intValue() == i12) {
                fragmentM62962R3 = m62964T3();
                str = "recentTrades";
            } else {
                int i13 = R$id.rb_trade_guide;
                if (numValueOf != null && numValueOf.intValue() == i13) {
                    fragmentM62962R3 = m62961O3();
                    str = "DataAnalysis";
                }
            }
        }
        if (str != null) {
            C43852m.m96591c("B5candle", str, null, null, 12, null);
        }
        if (!fragmentM62962R3.isAdded()) {
            getChildFragmentManager().beginTransaction().add(R$id.fl_main_container, fragmentM62962R3).commitNowAllowingStateLoss();
        }
        for (BaseFragment baseFragment : m62913Q3()) {
            if (!Intrinsics.areEqual(baseFragment, fragmentM62962R3)) {
                C27032f.m66615f(this, baseFragment);
            } else {
                C27032f.m66627r(this, baseFragment);
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    private final void m62916W3() {
        m62915V3().m62350r().observe(getViewLifecycleOwner(), new C25720b(new Function1() { // from class: com.kubi.spot.quote.market.trade.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketTradeFragment.m62917X3(this.f51144b, (MarketCoinInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public static final InterfaceC37053d m62919Z3() {
        return (InterfaceC37053d) C42597a.m93390f().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: e4 */
    public static final TradeItemBean m62924e4(MarketTradeFragment marketTradeFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marketTradeFragment.getArguments();
        if (arguments != null && (tradeItemBean = (TradeItemBean) arguments.getParcelable("data")) != null) {
            return tradeItemBean;
        }
        return new TradeItemBean("BTC-USDT");
    }

    /* JADX INFO: renamed from: h4 */
    private final void m62925h4(MarketTicker marketTicker) {
        C44668u c44668u;
        BaseTextView baseTextView;
        Double low;
        C44668u c44668u2;
        BaseTextView baseTextView2;
        String strM85579c;
        Double high;
        C44668u c44668u3;
        UpDownTextView upDownTextView;
        Double changeRate;
        C44668u c44668u4;
        UpDownTextView upDownTextView2;
        String strM92642g;
        Double changeRate2;
        C44668u c44668u5;
        BaseTextView baseTextView3;
        String strM89950x;
        Double lastDealPrice;
        C44668u c44668u6;
        FixAutoSizeTextView fixAutoSizeTextView;
        Double changeRate3;
        C44668u c44668u7;
        FixAutoSizeTextView fixAutoSizeTextView2;
        String strM85579c2;
        Double lastDealPrice2;
        C44650l c44650lM62958L3 = m62958L3();
        String strM85579c3 = null;
        if (c44650lM62958L3 != null && (c44668u7 = c44650lM62958L3.f99181g) != null && (fixAutoSizeTextView2 = c44668u7.f99370d) != null) {
            if (marketTicker != null && (lastDealPrice2 = marketTicker.getLastDealPrice()) != null) {
                strM85579c2 = C37886j.m85579c(new BigDecimal(String.valueOf(lastDealPrice2.doubleValue())), m62914U3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            } else {
                strM85579c2 = null;
            }
            fixAutoSizeTextView2.setText(C27041f.m66669i(strM85579c2, "--"));
        }
        C44650l c44650lM62958L4 = m62958L3();
        if (c44650lM62958L4 != null && (c44668u6 = c44650lM62958L4.f99181g) != null && (fixAutoSizeTextView = c44668u6.f99370d) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            if (marketTicker != null) {
                changeRate3 = marketTicker.getChangeRate();
            } else {
                changeRate3 = null;
            }
            fixAutoSizeTextView.setTextColor(C22890g.m54278c(contextRequireContext, C27039d.m66646f(changeRate3), R$color.c_text));
        }
        C44650l c44650lM62958L5 = m62958L3();
        if (c44650lM62958L5 != null && (c44668u5 = c44650lM62958L5.f99181g) != null && (baseTextView3 = c44668u5.f99376j) != null) {
            if (marketTicker != null && (lastDealPrice = marketTicker.getLastDealPrice()) != null) {
                strM89950x = C41014a.m89950x(C41014a.m89939m(lastDealPrice.doubleValue(), m62914U3().getSymbolInfoEntity().getQuoteCurrency()), null, null, 0, false, true, false, false, 111, null);
            } else {
                strM89950x = null;
            }
            baseTextView3.setText(C27041f.m66669i(strM89950x, "--"));
        }
        C44650l c44650lM62958L6 = m62958L3();
        if (c44650lM62958L6 != null && (c44668u4 = c44650lM62958L6.f99181g) != null && (upDownTextView2 = c44668u4.f99375i) != null) {
            if (marketTicker != null && (changeRate2 = marketTicker.getChangeRate()) != null) {
                strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(changeRate2.doubleValue())), null, null, 0, true, false, false, 55, null);
            } else {
                strM92642g = null;
            }
            upDownTextView2.setText(C42828b.m93915p(C42828b.m93911l(C42180b.m92649n(strM92642g))));
        }
        C44650l c44650lM62958L7 = m62958L3();
        if (c44650lM62958L7 != null && (c44668u3 = c44650lM62958L7.f99181g) != null && (upDownTextView = c44668u3.f99375i) != null) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            if (marketTicker != null) {
                changeRate = marketTicker.getChangeRate();
            } else {
                changeRate = null;
            }
            upDownTextView.setTextColor(C22890g.m54279d(contextRequireContext2, C27039d.m66646f(changeRate), 0, 2, null));
        }
        C44650l c44650lM62958L8 = m62958L3();
        if (c44650lM62958L8 != null && (c44668u2 = c44650lM62958L8.f99181g) != null && (baseTextView2 = c44668u2.f99373g) != null) {
            if (marketTicker != null && (high = marketTicker.getHigh()) != null) {
                strM85579c = C37886j.m85579c(new BigDecimal(String.valueOf(high.doubleValue())), m62914U3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : true, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            } else {
                strM85579c = null;
            }
            baseTextView2.setText(C27041f.m66669i(strM85579c, "--"));
        }
        C44650l c44650lM62958L9 = m62958L3();
        if (c44650lM62958L9 != null && (c44668u = c44650lM62958L9.f99181g) != null && (baseTextView = c44668u.f99368b) != null) {
            if (marketTicker != null && (low = marketTicker.getLow()) != null) {
                strM85579c3 = C37886j.m85579c(new BigDecimal(String.valueOf(low.doubleValue())), m62914U3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : true, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            baseTextView.setText(C27041f.m66669i(strM85579c3, "--"));
        }
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m62930l4(MarketTradeFragment marketTradeFragment) {
        LinearLayout linearLayout;
        C44668u c44668u;
        if (marketTradeFragment.getView() == null) {
            return;
        }
        MarketTradePopup marketTradePopupM62963S3 = marketTradeFragment.m62963S3();
        C44650l c44650lM62958L3 = marketTradeFragment.m62958L3();
        if (c44650lM62958L3 != null && (c44668u = c44650lM62958L3.f99181g) != null) {
            linearLayout = c44668u.f99383q;
        } else {
            linearLayout = null;
        }
        marketTradePopupM62963S3.m62992A(linearLayout);
    }

    /* JADX INFO: renamed from: n4 */
    private final void m62933n4() {
        Observable map;
        final String str = String.format("/quicksilver/symbol-stats:%s", Arrays.copyOf(new Object[]{m62914U3().getSymbol()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        final String str2 = String.format("/market/snapshot_app:%s", Arrays.copyOf(new Object[]{m62914U3().getSymbol()}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        final String str3 = String.format("/market/match:%s", Arrays.copyOf(new Object[]{m62914U3().getSymbol()}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        SpotMarketSocketAdapter spotMarketSocketAdapter = SpotMarketSocketAdapter.f28144a;
        if (spotMarketSocketAdapter.m32665b0()) {
            Request.Companion companion = Request.INSTANCE;
            InterfaceC37053d interfaceC37053dM62912P3 = m62912P3();
            String symbol = m62914U3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            Request requestSubscribe = companion.subscribe(interfaceC37053dM62912P3.m82944l(symbol), str, str2);
            InterfaceC37053d interfaceC37053dM62912P4 = m62912P3();
            String symbol2 = m62914U3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
            C19406c c19406c = new C19406c(requestSubscribe, companion.unsubscribe(interfaceC37053dM62912P4.m82944l(symbol2), str, str2), null, false, null, 20, null);
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.trade.x0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarketTradeFragment.m62935o4(str, str2, (Message) obj));
                }
            };
            Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.spot.quote.market.trade.r1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarketTradeFragment.m62937p4(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.market.trade.s1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketTradeFragment.m62939q4(str, (Message) obj);
                }
            };
            ObservableSource map2 = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.market.trade.t1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarketTradeFragment.m62941r4(function2, obj);
                }
            });
            String symbol3 = m62914U3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol3, "getSymbol(...)");
            Observable observableM32619F = SpotMarketSocketAdapter.m32619F(spotMarketSocketAdapter, symbol3, false, new Function0() { // from class: com.kubi.spot.quote.market.trade.u1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketTradeFragment.m62943s4();
                }
            }, 2, null);
            final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.market.trade.v1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketTradeFragment.m62945t4((SpotMatchPushEntity) obj);
                }
            };
            map = Observable.merge(map2, observableM32619F.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.market.trade.y0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarketTradeFragment.m62947u4(function3, obj);
                }
            }));
        } else {
            Request.Companion companion2 = Request.INSTANCE;
            InterfaceC37053d interfaceC37053dM62912P5 = m62912P3();
            String symbol4 = m62914U3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol4, "getSymbol(...)");
            Request requestSubscribe2 = companion2.subscribe(interfaceC37053dM62912P5.m82944l(symbol4), str, str2, str3);
            InterfaceC37053d interfaceC37053dM62912P6 = m62912P3();
            String symbol5 = m62914U3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol5, "getSymbol(...)");
            C19406c c19406c2 = new C19406c(requestSubscribe2, companion2.unsubscribe(interfaceC37053dM62912P6.m82944l(symbol5), str, str2, str3), null, false, null, 20, null);
            final Function1 function4 = new Function1() { // from class: com.kubi.spot.quote.market.trade.z0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarketTradeFragment.m62949v4(str, str2, str3, (Message) obj));
                }
            };
            Observable<Message> observableFilter2 = c19406c2.filter(new Predicate() { // from class: com.kubi.spot.quote.market.trade.a1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarketTradeFragment.m62951w4(function4, obj);
                }
            });
            final Function1 function5 = new Function1() { // from class: com.kubi.spot.quote.market.trade.b1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketTradeFragment.m62953x4(str, str2, (Message) obj);
                }
            };
            map = observableFilter2.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.market.trade.i1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarketTradeFragment.m62955y4(function5, obj);
                }
            });
        }
        Intrinsics.checkNotNull(map);
        Observable observableObserveOn = FlowableCompatKt.m66394h(map).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.market.trade.o1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketTradeFragment.m62957z4(this.f51178b, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.spot.quote.market.trade.p1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketTradeFragment.m62899A4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.trade.q1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketTradeFragment.m62901B4(function6, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: s4 */
    public static final Observable m62943s4() {
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    @Override // com.kubi.spot.kline.KuCoinKlineFragment.InterfaceC25353a
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public TradeItemBean getF49727V() {
        return m62914U3();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m62965f4(double d11) {
        C44668u c44668u;
        BaseTextView baseTextView;
        C44668u c44668u2;
        FixAutoSizeTextView fixAutoSizeTextView;
        Double changeRate;
        C44668u c44668u3;
        FixAutoSizeTextView fixAutoSizeTextView2;
        C44650l c44650lM62958L3 = m62958L3();
        if (c44650lM62958L3 != null && (c44668u3 = c44650lM62958L3.f99181g) != null && (fixAutoSizeTextView2 = c44668u3.f99370d) != null) {
            fixAutoSizeTextView2.setText(C27041f.m66669i(C37886j.m85579c(new BigDecimal(String.valueOf(d11)), m62914U3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null), "--"));
        }
        C44650l c44650lM62958L4 = m62958L3();
        if (c44650lM62958L4 != null && (c44668u2 = c44650lM62958L4.f99181g) != null && (fixAutoSizeTextView = c44668u2.f99370d) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            MarketTicker marketTicker = m62914U3().marketTicker;
            if (marketTicker != null) {
                changeRate = marketTicker.getChangeRate();
            } else {
                changeRate = null;
            }
            fixAutoSizeTextView.setTextColor(C22890g.m54278c(contextRequireContext, C27039d.m66646f(changeRate), R$color.c_text));
        }
        C44650l c44650lM62958L5 = m62958L3();
        if (c44650lM62958L5 != null && (c44668u = c44650lM62958L5.f99181g) != null && (baseTextView = c44668u.f99376j) != null) {
            baseTextView.setText(C41014a.m89950x(C41014a.m89939m(d11, m62914U3().getSymbolInfoEntity().getQuoteCurrency()), null, null, 0, false, true, false, false, 111, null));
        }
    }

    @Override // com.kubi.spot.kline.KuCoinKlineFragment.InterfaceC25353a
    public int getPrecision() {
        Integer numValueOf;
        SymbolInfoEntity symbolInfoEntity = m62914U3().getSymbolInfoEntity();
        if (symbolInfoEntity != null) {
            numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m62967j4(WsMarketTickerStatsEntity wsMarketTickerStatsEntity) {
        String priceChangeRate24h;
        Double dValueOf;
        C44668u c44668u;
        BaseTextView baseTextView;
        String volumeValue24h;
        C44668u c44668u2;
        BaseTextView baseTextView2;
        String volume24h;
        String strM89931e;
        TradeItemBean tradeItemBeanM62914U3 = m62914U3();
        String strM89931e2 = null;
        if (wsMarketTickerStatsEntity != null) {
            priceChangeRate24h = wsMarketTickerStatsEntity.getPriceChangeRate24h();
        } else {
            priceChangeRate24h = null;
        }
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(priceChangeRate24h);
        if (bigDecimalM66536f != null) {
            dValueOf = Double.valueOf(bigDecimalM66536f.doubleValue());
        } else {
            dValueOf = null;
        }
        tradeItemBeanM62914U3.setChangeRate(dValueOf);
        C44650l c44650lM62958L3 = m62958L3();
        if (c44650lM62958L3 != null && (c44668u2 = c44650lM62958L3.f99181g) != null && (baseTextView2 = c44668u2.f99377k) != null) {
            if (wsMarketTickerStatsEntity != null) {
                volume24h = wsMarketTickerStatsEntity.getVolume24h();
            } else {
                volume24h = null;
            }
            BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(volume24h);
            if (bigDecimalM66536f2 != null) {
                strM89931e = C41014a.m89931e(bigDecimalM66536f2, false, 1, null);
            } else {
                strM89931e = null;
            }
            baseTextView2.setText(strM89931e);
        }
        C44650l c44650lM62958L4 = m62958L3();
        if (c44650lM62958L4 != null && (c44668u = c44650lM62958L4.f99181g) != null && (baseTextView = c44668u.f99379m) != null) {
            if (wsMarketTickerStatsEntity != null) {
                volumeValue24h = wsMarketTickerStatsEntity.getVolumeValue24h();
            } else {
                volumeValue24h = null;
            }
            BigDecimal bigDecimalM66536f3 = DowngradeExKt.m66536f(volumeValue24h);
            if (bigDecimalM66536f3 != null) {
                strM89931e2 = C41014a.m89931e(bigDecimalM66536f3, false, 1, null);
            }
            baseTextView.setText(strM89931e2);
        }
        m62963S3().m62997F(wsMarketTickerStatsEntity);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62968k4() {
        C44668u c44668u;
        LinearLayout linearLayout;
        C44650l c44650lM62958L3 = m62958L3();
        if (c44650lM62958L3 != null && (c44668u = c44650lM62958L3.f99181g) != null && (linearLayout = c44668u.f99383q) != null) {
            linearLayout.postDelayed(new Runnable() { // from class: com.kubi.spot.quote.market.trade.n1
                @Override // java.lang.Runnable
                public final void run() {
                    MarketTradeFragment.m62930l4(this.f51176b);
                }
            }, 100L);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m62916W3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m62933n4();
    }
}
