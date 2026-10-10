package com.kubi.kucoin.quote.market;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.config.exception.KCConfigException;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.biz.togglesymbols.ToggleSymbolDialogHelperKt;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.margin.api.IMarginService;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.quotefacade.entity.SymbolData;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.SnapshotHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.SpotRemoteConfig;
import com.kubi.spot.api.ISpotService;
import com.kubi.spot.business.market.NavigationDecoration;
import com.kubi.spot.business.market.NavigationIconAdapter;
import com.kubi.spot.helper.C25307a;
import com.kubi.spot.helper.SymbolInfoHelper;
import com.kubi.spot.kline.KuCoinKlineFragment;
import com.kubi.spot.quote.market.KuCoinMarketViewModel;
import com.kubi.spot.quote.market.info.CoinInfoHelper;
import com.kubi.spot.quote.market.info.MarketBannerEntity;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.spot.quote.market.info.MarketCoinInfoFragment;
import com.kubi.spot.quote.market.recommend.MarketRecommendFragment;
import com.kubi.spot.quote.market.trade.MarketTradeFragment;
import com.kubi.spot.service.SpotDepend;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import d20.C36596a;
import e20.InterfaceC37053d;
import f00.C37304a;
import g00.InterfaceC37752d;
import g00.InterfaceC37754f;
import g00.InterfaceC37756h;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p212dv.C36976p;
import p212dv.InterfaceC36975o;
import p429lf.C42180b;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p607rv.C44183g;
import p671uq.C45290a;
import p830zf.InterfaceC46827w;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import t20.C44630b;
import t20.C44664s;
import w00.C45678b;
import y20.C46368b;

/* JADX INFO: compiled from: KuCoinMarketActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\b\u0007\u0018\u0000 v2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001vB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u00109\u001a\u00020\u0019H\u0014J\b\u0010:\u001a\u00020;H\u0002J\u0012\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0015J\b\u0010A\u001a\u00020=H\u0002J\u0010\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u000208H\u0002J\b\u0010D\u001a\u00020=H\u0002J\b\u0010E\u001a\u00020=H\u0002J\b\u0010F\u001a\u00020=H\u0002J\b\u0010G\u001a\u00020,H\u0002J\b\u0010H\u001a\u00020\u001fH\u0002J\b\u0010I\u001a\u00020=H\u0002J\b\u0010T\u001a\u00020=H\u0002J\u0010\u0010U\u001a\u00020=2\u0006\u0010V\u001a\u00020,H\u0002J\"\u0010W\u001a\b\u0012\u0004\u0012\u00020Y0X2\b\b\u0002\u0010Z\u001a\u00020,2\b\b\u0002\u0010[\u001a\u00020,H\u0002J\b\u0010\\\u001a\u00020=H\u0002J\b\u0010]\u001a\u00020=H\u0002J\b\u0010^\u001a\u00020=H\u0002J\b\u0010_\u001a\u00020=H\u0002J\u0019\u0010`\u001a\u00020=2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0002\u0010bJ\b\u0010c\u001a\u00020=H\u0002J\b\u0010d\u001a\u00020=H\u0002J\b\u0010e\u001a\u00020=H\u0014J\b\u0010f\u001a\u00020=H\u0002J\u0018\u0010g\u001a\u00020=2\u000e\u0010h\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010OH\u0002J\b\u0010i\u001a\u00020=H\u0002J\u0010\u0010j\u001a\u00020=2\u0006\u0010[\u001a\u00020,H\u0002J\u0012\u0010k\u001a\u00020=2\b\u0010l\u001a\u0004\u0018\u00010mH\u0014J\n\u0010n\u001a\u0004\u0018\u00010oH\u0014J\b\u0010p\u001a\u00020\u0014H\u0016J\b\u0010q\u001a\u00020\u0019H\u0016J\u000e\u0010r\u001a\u00020=2\u0006\u0010s\u001a\u00020\u0019J\b\u0010t\u001a\u00020,H\u0016J\b\u0010u\u001a\u00020=H\u0014R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b&\u0010'R\u000e\u0010)\u001a\u00020*X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010J\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\u0012\u001a\u0004\bK\u0010LR!\u0010N\u001a\b\u0012\u0004\u0012\u00020P0O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010\u0012\u001a\u0004\bQ\u0010R¨\u0006w"}, m90084d2 = {"Lcom/kubi/kucoin/quote/market/KuCoinMarketActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "Lcom/kubi/spot/kline/KuCoinKlineFragment$IKlineFragmentProvider;", "Lcom/kubi/quotefacade/event/IKlineCoinInfoTabProvider;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinActivityMarketBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinActivityMarketBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tradeApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getTradeApi", "()Lcom/kubi/spot/api/MarketApi;", "tradeApi$delegate", "Lkotlin/Lazy;", "mTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "getMTradeBean", "()Lcom/kubi/data/entity/TradeItemBean;", "mTradeBean$delegate", "targetTab", "", "getTargetTab", "()I", "targetTab$delegate", "titles", "", "", "[Ljava/lang/String;", "curFragments", "", "Landroidx/fragment/app/Fragment;", "tradeFragment", "Lcom/kubi/spot/quote/market/trade/MarketTradeFragment;", "getTradeFragment", "()Lcom/kubi/spot/quote/market/trade/MarketTradeFragment;", "tradeFragment$delegate", "mViewModel", "Lcom/kubi/spot/quote/market/KuCoinMarketViewModel;", "needRefreshCallAuctionProgress", "", "aiFeedOpen", "isShowKline", "isShowAiIcon", "lottieAiView", "Lcom/airbnb/lottie/LottieAnimationView;", "headerFullNameCrypto", "headerLastPrice", "headerLast24HourRate", "headerPriceIsUp", "isHeaderMarketSummaryVisible", "headerScrollY", "", "getLayout", "getKlineFragment", "Lcom/kubi/sdk/BaseFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "maxSlidePx", "applyHeaderSubTitleState", "applyLegacyHeaderPriceState", "scrollY", "updateHeaderSubTitleText", "updateHeaderMarketSummaryText", "updateHeaderPriceText", "hasHeaderFullNameCrypto", "buildHeaderMarketSummaryText", "initListener", "showShareButton", "getShowShareButton", "()Z", "showShareButton$delegate", "titleRightActions", "", "Landroid/widget/ImageView;", "getTitleRightActions", "()Ljava/util/List;", "titleRightActions$delegate", "fetchInfo", "updateRefreshCallAuctionFlag", "enableAuctionTrade", "updateEnableTradingFromPreviewInfo", "Lio/reactivex/Observable;", "Lcom/kubi/data/entity/SymbolPreviewEntity;", "isGoTrade", "isBuy", "initNavigationHeader", "updateAlertIconVisibility", "updateShareIconVisibility", "disableNavigationAmin", "initNavigationBottom", "supportF", "(Ljava/lang/Boolean;)V", "refreshTradeDataToView", "addFavor", "onResume", "getTradeDataBySymbols", "updateAiIcon", "spotMarks", "updateAiIconVisibility", "toTrade", "onNewIntent", "intent", "Landroid/content/Intent;", "initNavigationBar", "", "getTradeBean", "getPrecision", "scrollOffset", TypedValues.CycleType.S_WAVE_OFFSET, "containsCoinInfoTab", "onDestroy", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuCoinMarketActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinMarketActivity.kt\ncom/kubi/kucoin/quote/market/KuCoinMarketActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,1138:1\n49#2,15:1139\n17#3,2:1154\n33#3:1210\n17#3,2:1211\n34#3,3:1213\n17#3,2:1216\n37#4:1156\n36#4,3:1157\n76#5,7:1160\n76#5,7:1167\n76#5,7:1174\n76#5,7:1181\n76#5,7:1188\n153#5,7:1196\n76#5,7:1203\n1#6:1195\n46#7,14:1218\n1761#8,3:1232\n44#9,2:1235\n*S KotlinDebug\n*F\n+ 1 KuCoinMarketActivity.kt\ncom/kubi/kucoin/quote/market/KuCoinMarketActivity\n*L\n141#1:1139,15\n250#1:1154,2\n689#1:1210\n689#1:1211,2\n689#1:1213,3\n792#1:1216,2\n313#1:1156\n313#1:1157,3\n346#1:1160,7\n355#1:1167,7\n370#1:1174,7\n382#1:1181,7\n404#1:1188,7\n509#1:1196,7\n519#1:1203,7\n1091#1:1218,14\n1125#1:1232,3\n674#1:1235,2\n*E\n"})
public final class KuCoinMarketActivity extends BaseUiActivity implements KuCoinKlineFragment.InterfaceC25353a, InterfaceC36975o {

    /* JADX INFO: renamed from: A */
    @NotNull
    public final List<Fragment> f28317A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public final Lazy f28318B;

    /* JADX INFO: renamed from: C */
    public KuCoinMarketViewModel f28319C;

    /* JADX INFO: renamed from: D */
    public boolean f28320D;

    /* JADX INFO: renamed from: E */
    public final boolean f28321E;

    /* JADX INFO: renamed from: F */
    public final boolean f28322F;

    /* JADX INFO: renamed from: G */
    public boolean f28323G;

    /* JADX INFO: renamed from: H */
    @Nullable
    public LottieAnimationView f28324H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public String f28325I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public String f28326J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public String f28327K;

    /* JADX INFO: renamed from: L */
    public boolean f28328L;

    /* JADX INFO: renamed from: M */
    public boolean f28329M;

    /* JADX INFO: renamed from: N */
    public float f28330N;

    /* JADX INFO: renamed from: O */
    public final float f28331O;

    /* JADX INFO: renamed from: P */
    @NotNull
    public final Lazy f28332P;

    /* JADX INFO: renamed from: Q */
    @NotNull
    public final Lazy f28333Q;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f28334v = C45678b.m100788b(this, new Function1<C44630b, Unit>() { // from class: com.kubi.kucoin.quote.market.KuCoinMarketActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C44630b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44630b c44630b) {
            invoke(c44630b);
            return Unit.INSTANCE;
        }
    }, new Function1<KuCoinMarketActivity, C44630b>() { // from class: com.kubi.kucoin.quote.market.KuCoinMarketActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44630b invoke(@NotNull KuCoinMarketActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s-1855369338(...)");
            return C44630b.m98738a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public final Lazy f28335w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final Lazy f28336x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final Lazy f28337y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public String[] f28338z;

    /* JADX INFO: renamed from: S */
    public static final /* synthetic */ KProperty<Object>[] f28316S = {Reflection.property1(new PropertyReference1Impl(KuCoinMarketActivity.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinActivityMarketBinding;", 0))};

    /* JADX INFO: renamed from: R */
    @NotNull
    public static final Companion f28315R = new Companion(null);

    /* JADX INFO: compiled from: KuCoinMarketActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/quote/market/KuCoinMarketActivity$Companion;", "", "<init>", "()V", "ACTION_WIDGET_DESK_ITEM", "", "EVENT_JUMP_COIN_DETAIL", "EVENT_UPDATE_COUNT_DOWN_STATE", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.quote.market.KuCoinMarketActivity$a */
    /* JADX INFO: compiled from: KuCoinMarketActivity.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/kucoin/quote/market/KuCoinMarketActivity$initNavigationBottom$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15542a extends RecyclerView.OnScrollListener {
        public C15542a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            C44664s c44664s;
            View view;
            C44664s c44664s2;
            View view2;
            C44664s c44664s3;
            View view3;
            C44664s c44664s4;
            View view4;
            C44664s c44664s5;
            View view5;
            C44664s c44664s6;
            View view6;
            C44664s c44664s7;
            View view7;
            C44664s c44664s8;
            View view8;
            C44664s c44664s9;
            View view9;
            C44664s c44664s10;
            View view10;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                if (!recyclerView.canScrollHorizontally(1)) {
                    if (C5303w0.m6511a()) {
                        C44630b c44630bM32811W1 = KuCoinMarketActivity.this.m32811W1();
                        if (c44630bM32811W1 != null && (c44664s10 = c44630bM32811W1.f98968j) != null && (view10 = c44664s10.f99320g) != null) {
                            ViewExtKt.m66594y(view10);
                        }
                        C44630b c44630bM32811W2 = KuCoinMarketActivity.this.m32811W1();
                        if (c44630bM32811W2 == null || (c44664s9 = c44630bM32811W2.f98968j) == null || (view9 = c44664s9.f99318e) == null) {
                            return;
                        }
                        C27046k.m66700o(view9);
                        return;
                    }
                    C44630b c44630bM32811W3 = KuCoinMarketActivity.this.m32811W1();
                    if (c44630bM32811W3 != null && (c44664s8 = c44630bM32811W3.f98968j) != null && (view8 = c44664s8.f99320g) != null) {
                        C27046k.m66700o(view8);
                    }
                    C44630b c44630bM32811W4 = KuCoinMarketActivity.this.m32811W1();
                    if (c44630bM32811W4 == null || (c44664s7 = c44630bM32811W4.f98968j) == null || (view7 = c44664s7.f99318e) == null) {
                        return;
                    }
                    ViewExtKt.m66594y(view7);
                    return;
                }
                if (recyclerView.canScrollHorizontally(-1)) {
                    C44630b c44630bM32811W5 = KuCoinMarketActivity.this.m32811W1();
                    if (c44630bM32811W5 != null && (c44664s2 = c44630bM32811W5.f98968j) != null && (view2 = c44664s2.f99320g) != null) {
                        ViewExtKt.m66594y(view2);
                    }
                    C44630b c44630bM32811W6 = KuCoinMarketActivity.this.m32811W1();
                    if (c44630bM32811W6 == null || (c44664s = c44630bM32811W6.f98968j) == null || (view = c44664s.f99318e) == null) {
                        return;
                    }
                    ViewExtKt.m66594y(view);
                    return;
                }
                if (C5303w0.m6511a()) {
                    C44630b c44630bM32811W7 = KuCoinMarketActivity.this.m32811W1();
                    if (c44630bM32811W7 != null && (c44664s6 = c44630bM32811W7.f98968j) != null && (view6 = c44664s6.f99320g) != null) {
                        C27046k.m66700o(view6);
                    }
                    C44630b c44630bM32811W8 = KuCoinMarketActivity.this.m32811W1();
                    if (c44630bM32811W8 == null || (c44664s5 = c44630bM32811W8.f98968j) == null || (view5 = c44664s5.f99318e) == null) {
                        return;
                    }
                    ViewExtKt.m66594y(view5);
                    return;
                }
                C44630b c44630bM32811W9 = KuCoinMarketActivity.this.m32811W1();
                if (c44630bM32811W9 != null && (c44664s4 = c44630bM32811W9.f98968j) != null && (view4 = c44664s4.f99320g) != null) {
                    ViewExtKt.m66594y(view4);
                }
                C44630b c44630bM32811W10 = KuCoinMarketActivity.this.m32811W1();
                if (c44630bM32811W10 == null || (c44664s3 = c44630bM32811W10.f98968j) == null || (view3 = c44664s3.f99318e) == null) {
                    return;
                }
                C27046k.m66700o(view3);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.quote.market.KuCoinMarketActivity$b */
    /* JADX INFO: compiled from: KuCoinMarketActivity.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/kucoin/quote/market/KuCoinMarketActivity$onCreate$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrolled", "", ViewProps.POSITION, "", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onPageScrollStateChanged", "state", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15543b implements ViewPager.OnPageChangeListener {
        public C15543b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            String str;
            if (position != 0) {
                str = "Overview";
                if (position != 1) {
                    if (position != 2) {
                        str = position != 3 ? null : "Recommend";
                    }
                } else if (KuCoinMarketActivity.this.f28321E) {
                    str = "FeedTab";
                }
            } else {
                str = "Chart";
            }
            if (str != null) {
                C43852m.m96590b("B5candle", str, "1", TuplesKt.m90091to(FirebaseAnalytics.Param.CURRENCY, KuCoinMarketActivity.this.m32813Y1().getSymbolInfoEntity().getBaseCurrency()));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.quote.market.KuCoinMarketActivity$c */
    /* JADX INFO: compiled from: KuCoinMarketActivity.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC15544c implements Runnable {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f28342c;

        public RunnableC15544c(int i11) {
            this.f28342c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CustomViewPager customViewPager;
            C44630b c44630bM32811W1 = KuCoinMarketActivity.this.m32811W1();
            if (c44630bM32811W1 == null || (customViewPager = c44630bM32811W1.f98974p) == null) {
                return;
            }
            customViewPager.setCurrentItem(this.f28342c);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.quote.market.KuCoinMarketActivity$d */
    /* JADX INFO: compiled from: KuCoinMarketActivity.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC15545d implements Runnable {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f28344c;

        public RunnableC15545d(int i11) {
            this.f28344c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CustomViewPager customViewPager;
            C44630b c44630bM32811W1 = KuCoinMarketActivity.this.m32811W1();
            if (c44630bM32811W1 == null || (customViewPager = c44630bM32811W1.f98974p) == null) {
                return;
            }
            customViewPager.setCurrentItem(this.f28344c);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.quote.market.KuCoinMarketActivity$e */
    /* JADX INFO: compiled from: KuCoinMarketActivity.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15546e implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f28345b;

        public C15546e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28345b = function;
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
            return this.f28345b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28345b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: D2 */
    public static final Unit m32693D2(KuCoinMarketActivity kuCoinMarketActivity) {
        kuCoinMarketActivity.m32803J2(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E2 */
    public static final Unit m32696E2(KuCoinMarketActivity kuCoinMarketActivity) {
        kuCoinMarketActivity.m32803J2(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m32801I1(float f11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        float fCoerceIn = RangesKt.coerceIn((-f11) / 2.16f, -C27040e.m66657a(8.3f), 0.0f);
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 != null && (baseTextView3 = c44630bM32811W1.f98970l) != null) {
            baseTextView3.setTranslationY(fCoerceIn);
        }
        C44630b c44630bM32811W2 = m32811W1();
        if (c44630bM32811W2 != null && (baseTextView2 = c44630bM32811W2.f98972n) != null) {
            baseTextView2.setTranslationY(fCoerceIn);
        }
        C44630b c44630bM32811W3 = m32811W1();
        if (c44630bM32811W3 == null || (baseTextView = c44630bM32811W3.f98971m) == null) {
            return;
        }
        float f12 = this.f28331O;
        float fCoerceIn2 = RangesKt.coerceIn(f12 - f11, 0.0f, f12);
        baseTextView.setTranslationY(fCoerceIn2);
        if (f11 > 0.0f && ViewExtKt.m66580k(baseTextView)) {
            baseTextView.setVisibility(0);
        } else if (f11 <= 0.0f) {
            baseTextView.setVisibility(4);
        }
        baseTextView.setAlpha(1.0f - (fCoerceIn2 / this.f28331O));
    }

    /* JADX INFO: renamed from: R2 */
    public final void m32807R2(List<String> list) {
        boolean z11 = false;
        if (list != null && !list.isEmpty() && list.contains("Ai_Crypto_Insights")) {
            z11 = true;
        }
        this.f28323G = z11;
    }

    @Nullable
    /* JADX INFO: renamed from: o2 */
    public Void m32826o2() {
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SetTextI18n"})
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        BaseFragment baseFragmentMo50703f;
        BaseFragment baseFragmentNewInstance;
        BaseFragment baseFragmentNewInstance2;
        ArrayList<Fragment> arrayList;
        C44664s c44664s;
        KcPrimaryButton kcPrimaryButton;
        C44664s c44664s2;
        KcPrimaryButton kcPrimaryButton2;
        CustomViewPager customViewPager;
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager2;
        CustomViewPager customViewPager3;
        TracePageHelper.m42472g("open_k_spot", "现货K线");
        C43841b.m96557d("spot_k_line_page_load", "page_load_start", null, 4, null);
        super.onCreate(null);
        this.f28319C = (KuCoinMarketViewModel) new ViewModelProvider(this).get(KuCoinMarketViewModel.class);
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 != null && (customViewPager3 = c44630bM32811W1.f98974p) != null) {
            customViewPager3.setOffscreenPageLimit(2);
        }
        C44630b c44630bM32811W2 = m32811W1();
        if (c44630bM32811W2 != null && (customViewPager2 = c44630bM32811W2.f98974p) != null) {
            customViewPager2.addOnPageChangeListener(new C15543b());
        }
        this.f28317A.clear();
        boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.CoinInfo);
        boolean zM58030b2 = C24129b.m58030b(SiteVisibleConfigKey.RelateTrading);
        C36976p.f82091a.m82793b(this);
        if (m32813Y1().getSymbolInfoEntity().isEtfSymbol()) {
            BaseFragment baseFragmentM32812X1 = m32812X1();
            IMarginService iMarginServiceM63033c = SpotDepend.f51244a.m63033c();
            String baseCurrency = m32813Y1().getSymbolInfoEntity().getBaseCurrency();
            Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
            arrayList = CollectionsKt.arrayListOf(baseFragmentM32812X1, iMarginServiceM63033c.mo37910I(baseCurrency));
        } else {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46827w.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h == null || (arrayList = ((InterfaceC46827w) objM56186h).m103159b(m32824j2(), m32813Y1())) == null) {
                BaseFragment baseFragmentM32812X2 = m32812X1();
                if (this.f28321E) {
                    IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
                    String symbol = m32813Y1().getSymbol();
                    Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                    baseFragmentMo50703f = iQuoteFacadeService.mo50703f((String) CollectionsKt.first(StringsKt.split$default((CharSequence) symbol, new char[]{'-'}, false, 0, 6, (Object) null)), "kline_spot");
                } else {
                    baseFragmentMo50703f = null;
                }
                if (zM58030b) {
                    IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
                    if (companion.get().mo50698a()) {
                        IQuoteFacadeService iQuoteFacadeService2 = companion.get();
                        String symbol2 = m32813Y1().getSymbol();
                        Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
                        baseFragmentNewInstance = iQuoteFacadeService2.mo50695W(SearchCategory$Companion.SPOT, symbol2, m32813Y1().getSymbolInfoEntity().getBaseCurrency(), m32813Y1().getSymbolInfoEntity().getQuoteCurrency());
                    } else {
                        baseFragmentNewInstance = MarketCoinInfoFragment.f50950Y.newInstance(m32813Y1());
                    }
                } else {
                    baseFragmentNewInstance = null;
                }
                if (zM58030b2) {
                    IQuoteFacadeService.Companion companion2 = IQuoteFacadeService.f41383a;
                    if (companion2.get().mo50708k()) {
                        IQuoteFacadeService iQuoteFacadeService3 = companion2.get();
                        String symbol3 = m32813Y1().getSymbol();
                        Intrinsics.checkNotNullExpressionValue(symbol3, "getSymbol(...)");
                        baseFragmentNewInstance2 = iQuoteFacadeService3.mo50690Q(SearchCategory$Companion.SPOT, symbol3, m32813Y1().getSymbolInfoEntity().getBaseCurrency(), m32813Y1().getSymbolInfoEntity().getQuoteCurrency());
                    } else {
                        baseFragmentNewInstance2 = MarketRecommendFragment.f51032a0.newInstance(m32813Y1());
                    }
                } else {
                    baseFragmentNewInstance2 = null;
                }
                arrayList = (ArrayList) CollectionsKt.toCollection(CollectionsKt.filterNotNull(CollectionsKt.arrayListOf(baseFragmentM32812X2, baseFragmentMo50703f, baseFragmentNewInstance, baseFragmentNewInstance2)), new ArrayList());
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
        }
        this.f28317A.addAll(arrayList);
        this.f28338z = (String[]) ArraysKt.filterNotNull(new String[]{getString(R$string.market_trade), this.f28321E ? getString(R$string.kc_market_feed_tab) : null, zM58030b ? getString(R$string.market_coin_info) : null, zM58030b2 ? getString(R$string.market_recommend) : null}).toArray(new String[0]);
        C44630b c44630bM32811W3 = m32811W1();
        if (c44630bM32811W3 != null && (slidingTabLayout = c44630bM32811W3.f98969k) != null) {
            C44630b c44630bM32811W4 = m32811W1();
            slidingTabLayout.m55280F(c44630bM32811W4 != null ? c44630bM32811W4.f98974p : null, this.f28338z, this, arrayList);
        }
        C44630b c44630bM32811W5 = m32811W1();
        if (c44630bM32811W5 != null && (customViewPager = c44630bM32811W5.f98974p) != null) {
            customViewPager.setCurrentItem(m32817a2());
        }
        m32828r2();
        m32773q2(this, null, 1, null);
        m32760l2();
        if (m32813Y1().getSymbolInfoEntity().isEtfSymbol()) {
            KuCoinMarketViewModel kuCoinMarketViewModel = this.f28319C;
            if (kuCoinMarketViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                kuCoinMarketViewModel = null;
            }
            MutableLiveData<MarketCoinInfo> mutableLiveDataM62350r = kuCoinMarketViewModel.m62350r();
            KuCoinMarketViewModel kuCoinMarketViewModel2 = this.f28319C;
            if (kuCoinMarketViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                kuCoinMarketViewModel2 = null;
            }
            mutableLiveDataM62350r.setValue(kuCoinMarketViewModel2.m62350r().getValue());
        }
        C44630b c44630bM32811W6 = m32811W1();
        if (c44630bM32811W6 != null && (c44664s2 = c44630bM32811W6.f98968j) != null && (kcPrimaryButton2 = c44664s2.f99316c) != null) {
            C27046k.m66710y(kcPrimaryButton2, 1000L, new Function0() { // from class: com.kubi.kucoin.quote.market.t0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMarketActivity.m32693D2(this.f28377b);
                }
            });
        }
        C44630b c44630bM32811W7 = m32811W1();
        if (c44630bM32811W7 != null && (c44664s = c44630bM32811W7.f98968j) != null && (kcPrimaryButton = c44664s.f99317d) != null) {
            C27046k.m66710y(kcPrimaryButton, 1000L, new Function0() { // from class: com.kubi.kucoin.quote.market.u0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMarketActivity.m32696E2(this.f28379b);
                }
            });
        }
        m32805L1();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "gesture_status".length();
        }
        C12572a.m23692a(this, false, new KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$1("gesture_status", null, this));
        if (c12573b.m23696a()) {
            "JUMP_MARKET_FEED_TAB".length();
        }
        C12572a.m23692a(this, false, new KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$2("JUMP_MARKET_FEED_TAB", null, this));
        if (c12573b.m23696a()) {
            "JUMP_COIN_INFO_TAB".length();
        }
        C12572a.m23692a(this, false, new KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$3("JUMP_COIN_INFO_TAB", null, zM58030b, this));
        if (c12573b.m23696a()) {
            "kline_scroll_offset_key".length();
        }
        C12572a.m23692a(this, false, new KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$4("kline_scroll_offset_key", null, this));
        if (c12573b.m23696a()) {
            "kline_update_price_key".length();
        }
        C12572a.m23692a(this, false, new KuCoinMarketActivity$onCreate$$inlined$bindFlowEvent$default$5("kline_update_price_key", null, this));
        C12572a.m23695d("com.kubi.home.event.HomeEvent:switchDrawer", Boolean.FALSE, 0L, 4, null);
    }

    /* JADX INFO: renamed from: A2 */
    public static final Unit m32685A2(KuCoinMarketActivity kuCoinMarketActivity) {
        IQuoteFacadeService.f41383a.get().mo50692S(kuCoinMarketActivity.m32813Y1(), IQuoteFacadeService.Companion.TRADE_TYPE_SPOT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D1 */
    public static final Unit m32692D1(KuCoinMarketActivity kuCoinMarketActivity, Throwable th2) {
        if ((th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "420000")) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
        }
        kuCoinMarketActivity.hideDialogLoading();
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F1 */
    public static final Unit m32698F1() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G1 */
    public static final Unit m32700G1(KuCoinMarketActivity kuCoinMarketActivity, boolean z11) {
        if (z11) {
            kuCoinMarketActivity.m56592j0(kuCoinMarketActivity.getString(C25307a.m61759a(kuCoinMarketActivity.m32813Y1()) ? R$string.cancel_favor_ok : R$string.add_favorites_ok));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G2 */
    public static final boolean m32701G2() {
        return SpotRemoteConfig.f49637a.m59952t();
    }

    /* JADX INFO: renamed from: K2 */
    public static final Unit m32708K2(SymbolPreviewEntity symbolPreviewEntity) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M2 */
    public static final Unit m32712M2(Throwable th2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N1 */
    public static final boolean m32714N1(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() > 0;
    }

    /* JADX INFO: renamed from: O1 */
    public static final boolean m32717O1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: P1 */
    public static final ObservableSource m32720P1(KuCoinMarketActivity kuCoinMarketActivity, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Boolean enableAuctionTrade = ((SymbolInfoEntity) it.get(0)).getEnableAuctionTrade();
        Intrinsics.checkNotNullExpressionValue(enableAuctionTrade, "getEnableAuctionTrade(...)");
        kuCoinMarketActivity.m32820b3(enableAuctionTrade.booleanValue());
        kuCoinMarketActivity.m32813Y1().setSymbolInfoEntity((SymbolInfoEntity) it.get(0));
        if (!SymbolInfoHelper.f50575a.m61804a(kuCoinMarketActivity.m32813Y1(), true)) {
            return m32734V2(kuCoinMarketActivity, false, false, 3, null);
        }
        C37890n.f85269a.m85607H(kuCoinMarketActivity.m32813Y1().getSymbolInfoEntity());
        Observable observableJust = Observable.just(it);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* JADX INFO: renamed from: Q1 */
    public static final ObservableSource m32722Q1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: Q2 */
    public static final MarketTradeFragment m32723Q2(KuCoinMarketActivity kuCoinMarketActivity) {
        return MarketTradeFragment.f51115f0.newInstance(kuCoinMarketActivity.m32813Y1());
    }

    /* JADX INFO: renamed from: R1 */
    public static final void m32725R1(KuCoinMarketActivity kuCoinMarketActivity, Object obj) {
        if (kuCoinMarketActivity.f28320D && CallAuctionSwitch.f20317a.m21637c()) {
            C12572a.m23695d("socket_error_update_call_auction_process", Boolean.TRUE, 0L, 4, null);
        }
    }

    /* JADX INFO: renamed from: U1 */
    public static final Unit m32731U1(String str) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ Observable m32734V2(KuCoinMarketActivity kuCoinMarketActivity, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return kuCoinMarketActivity.m32810U2(z11, z12);
    }

    /* JADX INFO: renamed from: h2 */
    public static final Unit m32752h2(String str) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l2 */
    private final void m32760l2() {
        KuCoinMarketViewModel kuCoinMarketViewModel = this.f28319C;
        if (kuCoinMarketViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            kuCoinMarketViewModel = null;
        }
        kuCoinMarketViewModel.m62350r().observe(this, new C15546e(new Function1() { // from class: com.kubi.kucoin.quote.market.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMarketActivity.m32763m2(this.f28357b, (MarketCoinInfo) obj);
            }
        }));
        KuCoinMarketViewModel kuCoinMarketViewModel2 = this.f28319C;
        if (kuCoinMarketViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            kuCoinMarketViewModel2 = null;
        }
        kuCoinMarketViewModel2.m62348p().observe(this, new C15546e(new Function1() { // from class: com.kubi.kucoin.quote.market.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMarketActivity.m32766n2(this.f28359b, (Boolean) obj);
            }
        }));
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "spot_k_line_jump_to_coin_detail".length();
        }
        C12572a.m23692a(this, false, new C15547xba400f3e("spot_k_line_jump_to_coin_detail", null, this));
        if (c12573b.m23696a()) {
            "spot_k_line_update_count_state".length();
        }
        C12572a.m23692a(this, false, new C15548xba400f3f("spot_k_line_update_count_state", null, this));
    }

    /* JADX INFO: renamed from: m2 */
    public static final Unit m32763m2(KuCoinMarketActivity kuCoinMarketActivity, MarketCoinInfo marketCoinInfo) {
        C44630b c44630bM32811W1;
        if (marketCoinInfo != null && !C46368b.f103973a.m102263b() && (c44630bM32811W1 = kuCoinMarketActivity.m32811W1()) != null) {
            CoinInfoHelper coinInfoHelper = CoinInfoHelper.f50977a;
            List<MarketBannerEntity> activities = marketCoinInfo.getActivities();
            ConstraintLayout root = c44630bM32811W1.f98960b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            coinInfoHelper.m62623e(kuCoinMarketActivity, 0, activities, root);
            List<MarketBannerEntity> topics = marketCoinInfo.getTopics();
            ConstraintLayout root2 = c44630bM32811W1.f98962d.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            coinInfoHelper.m62623e(kuCoinMarketActivity, 1, topics, root2);
            if (!kuCoinMarketActivity.f28322F && kuCoinMarketActivity.m32824j2().isAdded() && !kuCoinMarketActivity.m32824j2().isDetached()) {
                kuCoinMarketActivity.m32824j2().m62968k4();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n2 */
    public static final Unit m32766n2(KuCoinMarketActivity kuCoinMarketActivity, Boolean bool) {
        if (bool == null) {
            return Unit.INSTANCE;
        }
        kuCoinMarketActivity.m32827p2(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m32773q2(KuCoinMarketActivity kuCoinMarketActivity, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        kuCoinMarketActivity.m32827p2(bool);
    }

    /* JADX INFO: renamed from: t2 */
    public static final Unit m32781t2(final KuCoinMarketActivity kuCoinMarketActivity) {
        final KuCoinMarketActivity kuCoinMarketActivity2;
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        if (companion.get().mo50718w()) {
            try {
                IQuoteFacadeService iQuoteFacadeService = companion.get();
                FragmentManager supportFragmentManager = kuCoinMarketActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                kuCoinMarketActivity2 = kuCoinMarketActivity;
                try {
                    iQuoteFacadeService.mo50714q(kuCoinMarketActivity2, supportFragmentManager, new CurrencyFilterTransferData(SearchCategory$Companion.SPOT, null, null, new SymbolData(kuCoinMarketActivity.m32813Y1().getSymbol(), null, 2, null), 6, null), "SpotMarketRnToggleSymbolDialog", new Function2() { // from class: com.kubi.kucoin.quote.market.d0
                        @Override // p852kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return KuCoinMarketActivity.m32784u2(this.f28350b, (CurrencyFilterTransferData) obj, (KCBridgeRejecterError) obj2);
                        }
                    });
                } catch (Exception e11) {
                    e = e11;
                    C43846g.m96568c(new KCConfigException(e, "SpotMarketRnToggleSymbolDialog", false, null, 8, null), null, 2, null);
                }
            } catch (Exception e12) {
                e = e12;
                kuCoinMarketActivity2 = kuCoinMarketActivity;
            }
        } else {
            kuCoinMarketActivity2 = kuCoinMarketActivity;
            String symbol = kuCoinMarketActivity2.m32813Y1().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            ToggleSymbolDialogHelperKt.m22839j(kuCoinMarketActivity2, symbol, new Function0() { // from class: com.kubi.kucoin.quote.market.e0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMarketActivity.m32787v2(this.f28351b);
                }
            });
        }
        C43852m.m96590b("B5candle", "symbolZone", "1", TuplesKt.m90091to("symbol", kuCoinMarketActivity2.m32813Y1().getSymbol()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u2 */
    public static final Unit m32784u2(KuCoinMarketActivity kuCoinMarketActivity, CurrencyFilterTransferData currencyFilterTransferData, KCBridgeRejecterError kCBridgeRejecterError) {
        SymbolData data;
        String symbolCode;
        SymbolData data2;
        String symbolCode2;
        SymbolData data3;
        String symbolCode3;
        SymbolData data4;
        String symbolCode4;
        Long longOrNull;
        String level1 = currencyFilterTransferData != null ? currencyFilterTransferData.getLevel1() : null;
        if (level1 != null) {
            switch (level1.hashCode()) {
                case -1263170109:
                    if (level1.equals(ClickCardReport.ReportData.CARD_TYPE_FUTURE) && (data = currencyFilterTransferData.getData()) != null && (symbolCode = data.getSymbolCode()) != null) {
                        InterfaceC37752d.a.m85122a(C37304a.f82764a, symbolCode, null, null, null, 14, null);
                        kuCoinMarketActivity.finish();
                        kuCoinMarketActivity.m32804K1();
                    }
                    break;
                case -1081309778:
                    if (level1.equals(ViewProps.MARGIN) && (data2 = currencyFilterTransferData.getData()) != null && (symbolCode2 = data2.getSymbolCode()) != null) {
                        InterfaceC37756h.a.m85145c(C37304a.f82764a, Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "cross") ? "cross" : "isolated", symbolCode2, null, null, null, null, 60, null);
                        kuCoinMarketActivity.finish();
                        kuCoinMarketActivity.m32804K1();
                    }
                    break;
                case 3537154:
                    if (level1.equals(SearchCategory$Companion.SPOT) && (data3 = currencyFilterTransferData.getData()) != null && (symbolCode3 = data3.getSymbolCode()) != null) {
                        ISpotService.m59982A(ISpotService.f49646a.get(), symbolCode3, null, null, null, 14, null);
                        kuCoinMarketActivity.m32804K1();
                        kuCoinMarketActivity.m32823d2();
                    }
                    break;
                case 92909918:
                    if (level1.equals("alpha") && currencyFilterTransferData != null && (data4 = currencyFilterTransferData.getData()) != null && (symbolCode4 = data4.getSymbolCode()) != null && (longOrNull = StringsKt.toLongOrNull(symbolCode4)) != null) {
                        long jLongValue = longOrNull.longValue();
                        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "market/alphaKline?tokenBridgeId=" + jLongValue, false, null, 6, null);
                        kuCoinMarketActivity.finish();
                        kuCoinMarketActivity.m32804K1();
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x2 */
    public static final Unit m32793x2(KuCoinMarketActivity kuCoinMarketActivity) {
        C43852m.m96591c("B5candle", "Share", null, null, 12, null);
        kuCoinMarketActivity.getContent();
        if (kuCoinMarketActivity.f28322F) {
            SnapshotHelper.f48173a.m58416i(kuCoinMarketActivity, new Function1() { // from class: com.kubi.kucoin.quote.market.p0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuCoinMarketActivity.m32795y2((Bitmap) obj);
                }
            });
        } else {
            IShareService iShareService = IShareService.f49268a.get();
            ImageShareParam imageShareParam = new ImageShareParam("c_k_share", null, false, null, false, null, null, null, null, null, 1022, null);
            imageShareParam.setBitmap(ViewExtKt.m66590u(kuCoinMarketActivity.getContent(), C27017c.f54310a.m66512a(R$color.c_overlay)));
            IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y2 */
    public static final Unit m32795y2(Bitmap bitmap) {
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("c_k_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setBitmap(bitmap);
        IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J1 */
    public final String m32802J1() {
        String strM92642g;
        String str = this.f28326J;
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        String strM66669i = C27041f.m66669i(str, "--");
        String str2 = this.f28327K;
        if (str2 == null) {
            return strM66669i;
        }
        if (StringsKt.isBlank(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            return strM66669i;
        }
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str2);
        if (bigDecimalOrNull != null && (strM92642g = C42180b.m92642g(bigDecimalOrNull, null, null, 0, true, false, true, 23, null)) != null) {
            str2 = strM92642g;
        }
        String str3 = this.f28327K;
        if (str3 == null) {
            str3 = "";
        }
        if (StringsKt.contains$default((CharSequence) strM66669i, (CharSequence) "%", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) strM66669i, (CharSequence) str2, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) strM66669i, (CharSequence) str3, false, 2, (Object) null)) {
            return strM66669i;
        }
        return strM66669i + ' ' + str2;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m32803J2(boolean z11) {
        C43852m.m96590b("B5candle", z11 ? "klineBuy" : "klineSell", "1", TuplesKt.m90091to("trade_pair", m32813Y1().getSymbol()), TuplesKt.m90091to("type", IQuoteFacadeService.Companion.TRADE_TYPE_SPOT));
        SymbolInfoEntity symbolInfoEntity = m32813Y1().getSymbolInfoEntity();
        if (symbolInfoEntity != null && !SymbolInfoHelper.f50575a.m61804a(m32813Y1(), true)) {
            Observable<SymbolPreviewEntity> observableM32810U2 = m32810U2(true, z11);
            final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.quote.market.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuCoinMarketActivity.m32708K2((SymbolPreviewEntity) obj);
                }
            };
            Consumer<? super SymbolPreviewEntity> consumer = new Consumer() { // from class: com.kubi.kucoin.quote.market.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuCoinMarketActivity.m32710L2(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.quote.market.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuCoinMarketActivity.m32712M2((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableM32810U2.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.quote.market.h
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuCoinMarketActivity.m32715N2(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
            m56592j0(TextUtils.isEmpty(symbolInfoEntity.getDisabledTip()) ? getString(R$string.current_trade_pause) : symbolInfoEntity.getDisabledTip());
            return;
        }
        if ("B5trading".length() == 0 || "page_load_start".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(B5trading) or pointName(page_load_start) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42382c("type", "market");
            C45290a.f101823a.m100101b("B5trading", "page_load_start", "", eventParametersBuilderAcquire.m42380a());
        }
        InterfaceC37754f.a.m85141m(C37304a.f82764a, 0L, m32813Y1().getSymbol(), Boolean.valueOf(z11), Boolean.TRUE, null, C43852m.m96601m("B5candle", z11 ? "klineBuy" : "klineSell", "1"), null, null, 208, null);
    }

    /* JADX INFO: renamed from: K1 */
    public final void m32804K1() {
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final void m32805L1() {
        KuCoinMarketViewModel kuCoinMarketViewModel = this.f28319C;
        KuCoinMarketViewModel kuCoinMarketViewModel2 = null;
        if (kuCoinMarketViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            kuCoinMarketViewModel = null;
        }
        kuCoinMarketViewModel.m62351s(m32813Y1());
        KuCoinMarketViewModel kuCoinMarketViewModel3 = this.f28319C;
        if (kuCoinMarketViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            kuCoinMarketViewModel2 = kuCoinMarketViewModel3;
        }
        kuCoinMarketViewModel2.m62349q(m32813Y1());
        this.f28320D = false;
        Observable<R> observableCompose = m32821c2().m82935c(m32813Y1().getSymbol()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.quote.market.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KuCoinMarketActivity.m32714N1((ArrayList) obj));
            }
        };
        Observable observableObserveOn = observableCompose.filter(new Predicate() { // from class: com.kubi.kucoin.quote.market.s
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return KuCoinMarketActivity.m32717O1(function1, obj);
            }
        }).observeOn(C42916f.m94127f());
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.quote.market.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMarketActivity.m32720P1(this.f28376b, (ArrayList) obj);
            }
        };
        Observable observableObserveOn2 = observableObserveOn.flatMap(new io.reactivex.functions.Function() { // from class: com.kubi.kucoin.quote.market.u
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return KuCoinMarketActivity.m32722Q1(function2, obj);
            }
        }).doOnNext(new Consumer() { // from class: com.kubi.kucoin.quote.market.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinMarketActivity.m32725R1(this.f28380b, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        Consumer consumer = new Consumer() { // from class: com.kubi.kucoin.quote.market.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinMarketActivity.m32727S1(obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.kucoin.quote.market.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMarketActivity.m32729T1(this.f28383b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn2.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.quote.market.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinMarketActivity.m32733V1(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // p212dv.InterfaceC36975o
    /* JADX INFO: renamed from: P2 */
    public boolean mo32806P2() {
        List<Fragment> list = this.f28317A;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Fragment) it.next()) instanceof MarketCoinInfoFragment) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W1 */
    public final C44630b m32811W1() {
        return (C44630b) this.f28334v.getValue(this, f28316S[0]);
    }

    /* JADX INFO: renamed from: X1 */
    public final BaseFragment m32812X1() {
        if (!this.f28322F) {
            return m32824j2();
        }
        IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
        String symbol = m32813Y1().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return IQuoteFacadeService.m50672J(iQuoteFacadeService, symbol, SearchCategory$Companion.SPOT, null, 4, null);
    }

    /* JADX INFO: renamed from: Y1 */
    public final TradeItemBean m32813Y1() {
        return (TradeItemBean) this.f28336x.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.bkucoin_activity_market;
    }

    /* JADX INFO: renamed from: Z1 */
    public final boolean m32815Z1() {
        return ((Boolean) this.f28332P.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: a2 */
    public final int m32817a2() {
        return ((Number) this.f28337y.getValue()).intValue();
    }

    /* JADX INFO: renamed from: a3 */
    public final void m32818a3() {
        BaseTextView baseTextView;
        if (this.f28329M) {
            m32814Y2();
            return;
        }
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 == null || (baseTextView = c44630bM32811W1.f98971m) == null) {
            return;
        }
        String str = this.f28325I;
        if (str == null) {
            str = "";
        }
        baseTextView.setText(str);
        baseTextView.setTextColor(ContextCompat.getColor(this, R$color.c_text40));
    }

    /* JADX INFO: renamed from: b2 */
    public final List<ImageView> m32819b2() {
        return (List) this.f28333Q.getValue();
    }

    /* JADX INFO: renamed from: c2 */
    public final InterfaceC37053d m32821c2() {
        return (InterfaceC37053d) this.f28335w.getValue();
    }

    /* JADX INFO: renamed from: c3 */
    public final void m32822c3() {
        ImageView imageView;
        boolean z11 = SpotRemoteConfig.f49637a.m59952t() && C24129b.m58030b(SiteVisibleConfigKey.InviteRebate);
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 == null || (imageView = c44630bM32811W1.f98967i) == null) {
            return;
        }
        imageView.setVisibility(z11 ? 0 : 8);
    }

    /* JADX INFO: renamed from: j2 */
    public final MarketTradeFragment m32824j2() {
        return (MarketTradeFragment) this.f28318B.getValue();
    }

    /* JADX INFO: renamed from: k2 */
    public final boolean m32825k2() {
        String str = this.f28325I;
        return str != null && (StringsKt.isBlank(str) ^ true);
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.base.p113ui.OldBaseActivity, com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        LottieAnimationView lottieAnimationView = this.f28324H;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
        this.f28324H = null;
        C44183g.f97524a.m97408f();
        super.onDestroy();
        C36976p.f82091a.m82794c(this);
        this.f28317A.clear();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0194  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:95:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0189  */
    /* JADX WARN: Code duplicated, block: B:97:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x018f  */
    /* JADX INFO: renamed from: p2 */
    public final void m32827p2(Boolean bool) {
        List<String> arrayList;
        float fM66565c;
        C44630b c44630bM32811W1;
        C44664s c44664s;
        View view;
        C44664s c44664s2;
        View view2;
        C44664s c44664s3;
        View view3;
        C44664s c44664s4;
        if (CallAuctionSwitch.f20317a.m21643j(m32813Y1(), true)) {
            return;
        }
        C44630b c44630bM32811W2 = m32811W1();
        String strMo33261J = null;
        RecyclerView recyclerView = (c44630bM32811W2 == null || (c44664s4 = c44630bM32811W2.f98968j) == null) ? null : c44664s4.f99315b;
        int i11 = 0;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        }
        SiteVisibleConfigKey siteVisibleConfigKey = SiteVisibleConfigKey.Futures;
        if ((C24129b.m58030b(siteVisibleConfigKey) ? siteVisibleConfigKey : null) != null) {
            IKuMexService iKuMexServiceM63032b = SpotDepend.f51244a.m63032b();
            String baseCurrency = m32813Y1().getSymbolInfoEntity().getBaseCurrency();
            Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
            String quoteCurrency = m32813Y1().getSymbolInfoEntity().getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
            strMo33261J = iKuMexServiceM63032b.mo33261J(baseCurrency, quoteCurrency);
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46827w.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            arrayList = ((InterfaceC46827w) objM56186h).m103160c(!(strMo33261J == null || strMo33261J.length() == 0), C27025c.m66566d(bool) && C24129b.m58030b(SiteVisibleConfigKey.Convert));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                if (strMo33261J != null && strMo33261J.length() != 0 && C24129b.m58030b(siteVisibleConfigKey)) {
                    arrayList.add(SearchCategory$Companion.FUTURES);
                }
                if (C27025c.m66566d(Boolean.valueOf(m32813Y1().getSymbolInfoEntity().isBotEnabled())) && C24129b.m58030b(SiteVisibleConfigKey.BotSpotGrid)) {
                    arrayList.add("robot");
                }
                if ((m32813Y1().getSymbolInfoEntity().isMarginEnabled() || m32813Y1().getSymbolInfoEntity().isIsolatedMarginTradeEnabled()) && C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
                    arrayList.add(ViewProps.MARGIN);
                }
                if (C27025c.m66566d(bool) && C24129b.m58030b(SiteVisibleConfigKey.Convert)) {
                    arrayList.add("flash");
                }
            }
        } else {
            arrayList = new ArrayList<>();
            if (strMo33261J != null) {
                arrayList.add(SearchCategory$Companion.FUTURES);
            }
            if (C27025c.m66566d(Boolean.valueOf(m32813Y1().getSymbolInfoEntity().isBotEnabled()))) {
                arrayList.add("robot");
            }
            if (m32813Y1().getSymbolInfoEntity().isMarginEnabled()) {
                arrayList.add(ViewProps.MARGIN);
            } else {
                arrayList.add(ViewProps.MARGIN);
            }
            if (C27025c.m66566d(bool)) {
                arrayList.add("flash");
            }
        }
        int size = arrayList.size();
        NavigationIconAdapter navigationIconAdapter = new NavigationIconAdapter(m32813Y1(), strMo33261J, size > 3 ? 38 : 48);
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new NavigationDecoration(arrayList.size(), (int) C27025c.m66565c(this, 8)));
        }
        if (C5303w0.m6511a()) {
            C44630b c44630bM32811W3 = m32811W1();
            if (c44630bM32811W3 != null && (c44664s3 = c44630bM32811W3.f98968j) != null && (view3 = c44664s3.f99318e) != null) {
                view3.setBackgroundResource(R$drawable.bkucoin_overlay_gradient_right);
            }
            C44630b c44630bM32811W4 = m32811W1();
            if (c44630bM32811W4 != null && (c44664s2 = c44630bM32811W4.f98968j) != null && (view2 = c44664s2.f99320g) != null) {
                view2.setBackgroundResource(R$drawable.bkucoin_overlay_gradient_left);
            }
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(navigationIconAdapter);
        }
        navigationIconAdapter.m61164j(arrayList);
        if (size <= 3) {
            if (size != 0) {
                fM66565c = C27025c.m66565c(this, (size * 48) + ((size - 1) * 8));
            }
            if (i11 == 0) {
                if (recyclerView != null) {
                    ViewExtKt.m66577h(recyclerView);
                }
            } else if (recyclerView != null) {
                ViewExtKt.m66594y(recyclerView);
            }
            if (recyclerView != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                layoutParams.width = i11;
                recyclerView.setLayoutParams(layoutParams);
            }
            if (size > 3 && (c44630bM32811W1 = m32811W1()) != null && (c44664s = c44630bM32811W1.f98968j) != null && (view = c44664s.f99320g) != null) {
                ViewExtKt.m66594y(view);
            }
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(new C15542a());
            }
        }
        fM66565c = C27025c.m66565c(this, 160);
        i11 = (int) fM66565c;
        if (i11 == 0) {
            if (recyclerView != null) {
                ViewExtKt.m66577h(recyclerView);
            }
        } else if (recyclerView != null) {
            ViewExtKt.m66594y(recyclerView);
        }
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            layoutParams2.width = i11;
            recyclerView.setLayoutParams(layoutParams2);
        }
        if (size > 3) {
            ViewExtKt.m66594y(view);
        }
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C15542a());
        }
    }

    /* JADX INFO: renamed from: y1 */
    public final void m32829y1() {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        IUserService.Companion companion = IUserService.a;
        if (companion.get().c()) {
            Observable<R> observableCompose = m32821c2().addFavorSymbol(m32813Y1().getSymbol()).compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.quote.market.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuCoinMarketActivity.m32684A1(this.f28353b, (Disposable) obj);
                }
            };
            Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.kucoin.quote.market.g0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuCoinMarketActivity.m32687B1(function1, obj);
                }
            });
            Consumer consumer = new Consumer() { // from class: com.kubi.kucoin.quote.market.i0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuCoinMarketActivity.m32690C1(this.f28358b, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.quote.market.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuCoinMarketActivity.m32692D1(this.f28360b, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.quote.market.k0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuCoinMarketActivity.m32695E1(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
            return;
        }
        if (!TextUtils.isEmpty(companion.get().d0().id) && companion.get().o()) {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kucoin.quote.market.l0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMarketActivity.m32698F1();
                }
            }), 1, (Object) null);
            return;
        }
        C43852m.m96590b("B5candle", "collect", C25307a.m61759a(m32813Y1()) ? "2" : "1", TuplesKt.m90091to("symbol", m32813Y1().getSymbol()));
        IQuoteFacadeService.f41383a.get().mo50678C(m32813Y1(), new Function1() { // from class: com.kubi.kucoin.quote.market.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMarketActivity.m32700G1(this.f28364b, ((Boolean) obj).booleanValue());
            }
        });
        if (C25307a.m61759a(m32813Y1())) {
            C44630b c44630bM32811W1 = m32811W1();
            if (c44630bM32811W1 != null && (imageView4 = c44630bM32811W1.f98966h) != null) {
                imageView4.setImageResource(R$drawable.ic2_favorite_select_20);
            }
            C44630b c44630bM32811W2 = m32811W1();
            if (c44630bM32811W2 == null || (imageView3 = c44630bM32811W2.f98966h) == null) {
                return;
            }
            imageView3.clearColorFilter();
            return;
        }
        C44630b c44630bM32811W3 = m32811W1();
        if (c44630bM32811W3 != null && (imageView2 = c44630bM32811W3.f98966h) != null) {
            imageView2.setImageResource(R$drawable.ic2_favorite_unselect_20);
        }
        C44630b c44630bM32811W4 = m32811W1();
        if (c44630bM32811W4 == null || (imageView = c44630bM32811W4.f98966h) == null) {
            return;
        }
        C27046k.m66701p(imageView, ContextCompat.getColor(this, R$color.emphasis));
    }

    public KuCoinMarketActivity() {
        setPageId("B5candle");
        this.f28335w = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.quote.market.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinMarketActivity.m32718O2();
            }
        });
        this.f28336x = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.quote.market.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinMarketActivity.m32691C2(this.f28382b);
            }
        });
        this.f28337y = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.quote.market.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(KuCoinMarketActivity.m32703H2(this.f28356b));
            }
        });
        this.f28338z = new String[0];
        this.f28317A = new ArrayList();
        this.f28318B = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.quote.market.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinMarketActivity.m32723Q2(this.f28373b);
            }
        });
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        this.f28321E = companion.get().mo50706i();
        this.f28322F = companion.get().mo50691R();
        this.f28328L = true;
        this.f28331O = C27040e.m66657a(18.0f);
        this.f28332P = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.quote.market.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(KuCoinMarketActivity.m32701G2());
            }
        });
        this.f28333Q = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.quote.market.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinMarketActivity.m32705I2(this.f28375b);
            }
        });
    }

    /* JADX INFO: renamed from: A1 */
    public static final Unit m32684A1(KuCoinMarketActivity kuCoinMarketActivity, Disposable disposable) {
        kuCoinMarketActivity.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B1 */
    public static final void m32687B1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B2 */
    public static final Unit m32688B2(KuCoinMarketActivity kuCoinMarketActivity) {
        kuCoinMarketActivity.m32829y1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C1 */
    public static final void m32690C1(KuCoinMarketActivity kuCoinMarketActivity, Object obj) {
        String str;
        int i11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (C25307a.m61759a(kuCoinMarketActivity.m32813Y1())) {
            str = "2";
        } else {
            str = "1";
        }
        C43852m.m96590b("B5candle", "collect", str, TuplesKt.m90091to("symbol", kuCoinMarketActivity.m32813Y1().getSymbol()));
        kuCoinMarketActivity.hideDialogLoading();
        if (C25307a.m61759a(kuCoinMarketActivity.m32813Y1())) {
            i11 = R$string.cancel_favor_ok;
        } else {
            i11 = R$string.add_favorites_ok;
        }
        kuCoinMarketActivity.m56592j0(kuCoinMarketActivity.getString(i11));
        kuCoinMarketActivity.m32813Y1().setFavor(!C25307a.m61759a(kuCoinMarketActivity.m32813Y1()));
        if (C25307a.m61759a(kuCoinMarketActivity.m32813Y1())) {
            C44630b c44630bM32811W1 = kuCoinMarketActivity.m32811W1();
            if (c44630bM32811W1 != null && (imageView4 = c44630bM32811W1.f98966h) != null) {
                imageView4.setImageResource(R$drawable.ic2_favorite_select_20);
            }
            C44630b c44630bM32811W2 = kuCoinMarketActivity.m32811W1();
            if (c44630bM32811W2 != null && (imageView3 = c44630bM32811W2.f98966h) != null) {
                imageView3.clearColorFilter();
                return;
            }
            return;
        }
        C44630b c44630bM32811W3 = kuCoinMarketActivity.m32811W1();
        if (c44630bM32811W3 != null && (imageView2 = c44630bM32811W3.f98966h) != null) {
            imageView2.setImageResource(R$drawable.ic2_favorite_unselect_20);
        }
        C44630b c44630bM32811W4 = kuCoinMarketActivity.m32811W1();
        if (c44630bM32811W4 != null && (imageView = c44630bM32811W4.f98966h) != null) {
            C27046k.m66701p(imageView, ContextCompat.getColor(kuCoinMarketActivity, R$color.emphasis));
        }
    }

    /* JADX INFO: renamed from: C2 */
    public static final TradeItemBean m32691C2(KuCoinMarketActivity kuCoinMarketActivity) {
        TradeItemBean tradeItemBeanM81886a = C36596a.m81886a(kuCoinMarketActivity);
        if (tradeItemBeanM81886a == null) {
            return new TradeItemBean("BTC-USDT");
        }
        return tradeItemBeanM81886a;
    }

    /* JADX INFO: renamed from: E1 */
    public static final void m32695E1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H2 */
    public static final int m32703H2(KuCoinMarketActivity kuCoinMarketActivity) {
        Intent intent = kuCoinMarketActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent, "tab");
        if (strM56280w == null || strM56280w.length() == 0 || !Intrinsics.areEqual(strM56280w, "feed") || !kuCoinMarketActivity.f28321E) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: I2 */
    public static final List m32705I2(KuCoinMarketActivity kuCoinMarketActivity) {
        ImageView imageView;
        ImageView imageView2;
        C44630b c44630bM32811W1;
        C44630b c44630bM32811W2 = kuCoinMarketActivity.m32811W1();
        ImageView imageView3 = null;
        if (c44630bM32811W2 != null) {
            imageView = c44630bM32811W2.f98964f;
        } else {
            imageView = null;
        }
        C44630b c44630bM32811W3 = kuCoinMarketActivity.m32811W1();
        if (c44630bM32811W3 != null) {
            imageView2 = c44630bM32811W3.f98966h;
        } else {
            imageView2 = null;
        }
        if (kuCoinMarketActivity.m32815Z1() && (c44630bM32811W1 = kuCoinMarketActivity.m32811W1()) != null) {
            imageView3 = c44630bM32811W1.f98967i;
        }
        return CollectionsKt.listOfNotNull((Object[]) new ImageView[]{imageView, imageView2, imageView3});
    }

    /* JADX INFO: renamed from: L2 */
    public static final void m32710L2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N2 */
    public static final void m32715N2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O2 */
    public static final InterfaceC37053d m32718O2() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: T1 */
    public static final Unit m32729T1(KuCoinMarketActivity kuCoinMarketActivity, Throwable th2) {
        if (!kuCoinMarketActivity.isDestroyed()) {
            BaseActivity.hideLoadingDialog$default(kuCoinMarketActivity, false, 1, null);
        }
        Intrinsics.checkNotNull(th2);
        C19331c.m42835b(th2, new Function1() { // from class: com.kubi.kucoin.quote.market.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMarketActivity.m32731U1((String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V1 */
    public static final void m32733V1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W2 */
    public static final Unit m32736W2(KuCoinMarketActivity kuCoinMarketActivity, boolean z11, boolean z12, SymbolPreviewEntity symbolPreviewEntity) {
        String str;
        kuCoinMarketActivity.m32813Y1().getSymbolInfoEntity().setEnableTrading(C27025c.m66566d(symbolPreviewEntity.getEnableTrading()));
        kuCoinMarketActivity.m32820b3(C27025c.m66566d(symbolPreviewEntity.isEnableAuctionTrade()));
        kuCoinMarketActivity.m32813Y1().getSymbolInfoEntity().setEnableAuctionTrade(Boolean.valueOf(C27025c.m66566d(symbolPreviewEntity.isEnableAuctionTrade())));
        C37890n.f85269a.m85607H(kuCoinMarketActivity.m32813Y1().getSymbolInfoEntity());
        if (z11 && C27025c.m66566d(symbolPreviewEntity.getEnableTrading()) && C27025c.m66566d(symbolPreviewEntity.isEnableAuctionTrade())) {
            C37304a c37304a = C37304a.f82764a;
            String symbol = kuCoinMarketActivity.m32813Y1().getSymbol();
            Boolean boolValueOf = Boolean.valueOf(z12);
            Boolean bool = Boolean.TRUE;
            if (z12) {
                str = "klineBuy";
            } else {
                str = "klineSell";
            }
            InterfaceC37754f.a.m85141m(c37304a, 0L, symbol, boolValueOf, bool, null, C43852m.m96601m("B5candle", str, "1"), null, null, 208, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X2 */
    public static final void m32738X2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e2 */
    public static final Unit m32746e2(KuCoinMarketActivity kuCoinMarketActivity, MarketListEntityItem marketListEntityItem) {
        BigDecimal bigDecimalOrNull;
        boolean z11;
        kuCoinMarketActivity.f28325I = marketListEntityItem.getFullNameCrypto();
        String lastPrice = marketListEntityItem.getLastPrice();
        if (lastPrice == null) {
            lastPrice = kuCoinMarketActivity.f28326J;
        }
        kuCoinMarketActivity.f28326J = lastPrice;
        kuCoinMarketActivity.f28327K = marketListEntityItem.getLast24HourRate();
        String last24HourRate = marketListEntityItem.getLast24HourRate();
        int iIntValue = 0;
        if (last24HourRate != null && (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(last24HourRate)) != null) {
            if (bigDecimalOrNull.signum() >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            kuCoinMarketActivity.f28328L = z11;
        }
        kuCoinMarketActivity.m32800H1();
        kuCoinMarketActivity.m32813Y1().setFavor(marketListEntityItem.getFavoritePersonal());
        kuCoinMarketActivity.m32813Y1().setAlarm(marketListEntityItem.getAlarmingPersonal());
        TradeItemBean tradeItemBeanM32813Y1 = kuCoinMarketActivity.m32813Y1();
        Integer symbolMark = marketListEntityItem.getSymbolMark();
        if (symbolMark != null) {
            iIntValue = symbolMark.intValue();
        }
        tradeItemBeanM32813Y1.setMark(iIntValue);
        if (!kuCoinMarketActivity.f28322F) {
            kuCoinMarketActivity.m32824j2().m62969m4(marketListEntityItem.getSymbolLabel());
        }
        kuCoinMarketActivity.m32807R2(marketListEntityItem.getSpotMarks());
        kuCoinMarketActivity.m32799F2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f2 */
    public static final void m32748f2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g2 */
    public static final Unit m32750g2(KuCoinMarketActivity kuCoinMarketActivity, Throwable th2) {
        if (!kuCoinMarketActivity.isDestroyed()) {
            BaseActivity.hideLoadingDialog$default(kuCoinMarketActivity, false, 1, null);
        }
        Intrinsics.checkNotNull(th2);
        C19331c.m42835b(th2, new Function1() { // from class: com.kubi.kucoin.quote.market.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMarketActivity.m32752h2((String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i2 */
    public static final void m32754i2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s2 */
    public static final Unit m32778s2(KuCoinMarketActivity kuCoinMarketActivity) {
        kuCoinMarketActivity.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v2 */
    public static final Unit m32787v2(KuCoinMarketActivity kuCoinMarketActivity) {
        kuCoinMarketActivity.m32823d2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w2 */
    public static final Unit m32790w2(KuCoinMarketActivity kuCoinMarketActivity) {
        C43852m.m96590b("B5candle", "AIInsights", "1", TuplesKt.m90091to("trade_pair", kuCoinMarketActivity.m32813Y1().getSymbol()));
        String str = "CoinInsights?base=" + kuCoinMarketActivity.m32813Y1().getSymbolInfoEntity().getBaseCurrency() + "&sourceType=" + SearchCategory$Companion.SPOT;
        Router.f46192a.m56184f("krn/router?biz=coininfo&entry=main&component=krn_coininfo&route=" + Uri.encode(str)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z2 */
    public static final Unit m32797z2(final KuCoinMarketActivity kuCoinMarketActivity) {
        C43852m.m96590b("B5candle", "priceAlarm", "1", TuplesKt.m90091to("symbol", kuCoinMarketActivity.m32813Y1().getSymbol()), TuplesKt.m90091to("is_login", Integer.valueOf(IUserService.a.get().c() ? 1 : 0)), TuplesKt.m90091to("norm_version", "1"));
        IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kucoin.quote.market.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinMarketActivity.m32685A2(this.f28347b);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.spot.kline.KuCoinKlineFragment.InterfaceC25353a
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public TradeItemBean getF49727V() {
        return m32813Y1();
    }

    /* JADX INFO: renamed from: F2 */
    public final void m32799F2() {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        ImageView imageView8;
        BaseTextView baseTextView;
        int i11;
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 != null && (baseTextView = c44630bM32811W1.f98972n) != null) {
            if (m32813Y1().getMark() == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            baseTextView.setVisibility(i11);
        }
        if (C25307a.m61759a(m32813Y1())) {
            C44630b c44630bM32811W2 = m32811W1();
            if (c44630bM32811W2 != null && (imageView8 = c44630bM32811W2.f98966h) != null) {
                imageView8.setImageResource(R$drawable.ic2_favorite_select_20);
            }
            C44630b c44630bM32811W3 = m32811W1();
            if (c44630bM32811W3 != null && (imageView7 = c44630bM32811W3.f98966h) != null) {
                imageView7.clearColorFilter();
            }
        } else {
            C44630b c44630bM32811W4 = m32811W1();
            if (c44630bM32811W4 != null && (imageView2 = c44630bM32811W4.f98966h) != null) {
                imageView2.setImageResource(R$drawable.ic2_favorite_unselect_20);
            }
            C44630b c44630bM32811W5 = m32811W1();
            if (c44630bM32811W5 != null && (imageView = c44630bM32811W5.f98966h) != null) {
                C27046k.m66701p(imageView, ContextCompat.getColor(this, R$color.emphasis));
            }
        }
        if (m32813Y1().isAlarm()) {
            C44630b c44630bM32811W6 = m32811W1();
            if (c44630bM32811W6 != null && (imageView6 = c44630bM32811W6.f98964f) != null) {
                imageView6.setImageResource(R$drawable.ic2_alert_select_20);
            }
            C44630b c44630bM32811W7 = m32811W1();
            if (c44630bM32811W7 != null && (imageView5 = c44630bM32811W7.f98964f) != null) {
                imageView5.clearColorFilter();
            }
        } else {
            C44630b c44630bM32811W8 = m32811W1();
            if (c44630bM32811W8 != null && (imageView4 = c44630bM32811W8.f98964f) != null) {
                imageView4.setImageResource(R$drawable.ic2_alert_unselect_20);
            }
            C44630b c44630bM32811W9 = m32811W1();
            if (c44630bM32811W9 != null && (imageView3 = c44630bM32811W9.f98964f) != null) {
                C27046k.m66701p(imageView3, ContextCompat.getColor(this, R$color.emphasis));
            }
        }
        m32808S2();
    }

    /* JADX INFO: renamed from: H1 */
    public final void m32800H1() {
        boolean z11;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        if (!m32825k2()) {
            m32801I1(this.f28330N);
            return;
        }
        if (this.f28330N >= this.f28331O) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28329M = z11;
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 != null && (baseTextView3 = c44630bM32811W1.f98970l) != null) {
            baseTextView3.setTranslationY(-C27040e.m66657a(8.3f));
        }
        C44630b c44630bM32811W2 = m32811W1();
        if (c44630bM32811W2 != null && (baseTextView2 = c44630bM32811W2.f98972n) != null) {
            baseTextView2.setTranslationY(-C27040e.m66657a(8.3f));
        }
        C44630b c44630bM32811W3 = m32811W1();
        if (c44630bM32811W3 != null && (baseTextView = c44630bM32811W3.f98971m) != null) {
            baseTextView.setVisibility(0);
            baseTextView.setTranslationY(0.0f);
            baseTextView.setAlpha(1.0f);
        }
        m32818a3();
    }

    /* JADX INFO: renamed from: S2 */
    public final void m32808S2() {
        LottieAnimationView lottieAnimationView;
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 != null) {
            lottieAnimationView = c44630bM32811W1.f98963e;
        } else {
            lottieAnimationView = null;
        }
        this.f28324H = lottieAnimationView;
        if (SpotRemoteConfig.f49637a.m59951s() && this.f28323G) {
            C43852m.m96594f("B5candle", "AIInsights", "1", TuplesKt.m90091to("trade_pair", m32813Y1().getSymbol()));
            LottieAnimationView lottieAnimationView2 = this.f28324H;
            if (lottieAnimationView2 != null && lottieAnimationView2.getAnimation() == null) {
                lottieAnimationView2.setAnimation("ai-belle.json");
                lottieAnimationView2.setRepeatCount(-1);
                lottieAnimationView2.playAnimation();
            }
            LottieAnimationView lottieAnimationView3 = this.f28324H;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setVisibility(0);
                return;
            }
            return;
        }
        LottieAnimationView lottieAnimationView4 = this.f28324H;
        if (lottieAnimationView4 != null) {
            lottieAnimationView4.cancelAnimation();
            lottieAnimationView4.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: T2 */
    public final void m32809T2() {
        ImageView imageView;
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 != null) {
            imageView = c44630bM32811W1.f98964f;
        } else {
            imageView = null;
        }
        ImageView imageView2 = imageView;
        if (C24129b.m58030b(SiteVisibleConfigKey.PriceAlert)) {
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            C44183g.m97407n(C44183g.f97524a, this, imageView2, false, 4, null);
        } else {
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            C44183g.f97524a.m97408f();
        }
    }

    /* JADX INFO: renamed from: U2 */
    public final Observable<SymbolPreviewEntity> m32810U2(final boolean z11, final boolean z12) {
        String code;
        InterfaceC37053d interfaceC37053d = (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
        SymbolInfoEntity symbolInfoEntity = m32813Y1().getSymbolInfoEntity();
        String baseCurrency = null;
        if (symbolInfoEntity != null) {
            code = symbolInfoEntity.getCode();
        } else {
            code = null;
        }
        String strM66668h = C27041f.m66668h(code);
        SymbolInfoEntity symbolInfoEntity2 = m32813Y1().getSymbolInfoEntity();
        if (symbolInfoEntity2 != null) {
            baseCurrency = symbolInfoEntity2.getBaseCurrency();
        }
        String strM66668h2 = C27041f.m66668h(baseCurrency);
        String string = MultiLanguageManager.f46811g.getLocale().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Observable<R> observableCompose = interfaceC37053d.m82936d(strM66668h, strM66668h2, string).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.quote.market.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMarketActivity.m32736W2(this.f28366b, z11, z12, (SymbolPreviewEntity) obj);
            }
        };
        Observable<SymbolPreviewEntity> observableDoOnNext = observableCompose.doOnNext(new Consumer() { // from class: com.kubi.kucoin.quote.market.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinMarketActivity.m32738X2(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m32814Y2() {
        BaseTextView baseTextView;
        int iM54289n;
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 != null && (baseTextView = c44630bM32811W1.f98971m) != null) {
            baseTextView.setText(m32802J1());
            if (this.f28328L) {
                iM54289n = C22890g.m54291p(this);
            } else {
                iM54289n = C22890g.m54289n(this);
            }
            baseTextView.setTextColor(iM54289n);
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m32816Z2() {
        BaseTextView baseTextView;
        int iM54289n;
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 != null && (baseTextView = c44630bM32811W1.f98971m) != null) {
            String str = this.f28326J;
            if (str == null || StringsKt.isBlank(str)) {
                str = null;
            }
            baseTextView.setText(C27041f.m66669i(str, "--"));
            if (this.f28328L) {
                iM54289n = C22890g.m54291p(this);
            } else {
                iM54289n = C22890g.m54289n(this);
            }
            baseTextView.setTextColor(iM54289n);
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final void m32820b3(boolean z11) {
        if (!Intrinsics.areEqual(m32813Y1().getSymbolInfoEntity().getEnableAuctionTrade(), Boolean.valueOf(z11))) {
            this.f28320D = true;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ /* synthetic */ View mo32393c0() {
        return (View) m32826o2();
    }

    /* JADX INFO: renamed from: d2 */
    public final void m32823d2() {
        Observable observableCompose = InterfaceC37053d.m82910D(m32821c2(), m32813Y1().getSymbol(), null, 2, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.quote.market.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMarketActivity.m32746e2(this.f28381b, (MarketListEntityItem) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kucoin.quote.market.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinMarketActivity.m32748f2(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.quote.market.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMarketActivity.m32750g2(this.f28348b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.quote.market.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinMarketActivity.m32754i2(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // com.kubi.spot.kline.KuCoinKlineFragment.InterfaceC25353a
    public int getPrecision() {
        Integer numValueOf;
        SymbolInfoEntity symbolInfoEntity = m32813Y1().getSymbolInfoEntity();
        if (symbolInfoEntity != null) {
            numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            startActivity(intent);
            finish();
            m32804K1();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m32823d2();
    }

    /* JADX INFO: renamed from: r2 */
    public final void m32828r2() {
        LottieAnimationView lottieAnimationView;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        LottieAnimationView lottieAnimationView2;
        BaseTextView baseTextView;
        int i11;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        ImageView imageView4;
        C44630b c44630bM32811W1 = m32811W1();
        if (c44630bM32811W1 != null && (imageView4 = c44630bM32811W1.f98965g) != null) {
            C27046k.m66711z(imageView4, 0L, new Function0() { // from class: com.kubi.kucoin.quote.market.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMarketActivity.m32778s2(this.f28361b);
                }
            }, 1, null);
        }
        C44630b c44630bM32811W2 = m32811W1();
        if (c44630bM32811W2 != null && (baseTextView3 = c44630bM32811W2.f98970l) != null) {
            baseTextView3.setText(m32813Y1().getShowSymbol());
        }
        C44630b c44630bM32811W3 = m32811W1();
        if (c44630bM32811W3 != null && (baseTextView2 = c44630bM32811W3.f98970l) != null) {
            C27046k.m66710y(baseTextView2, 1000L, new Function0() { // from class: com.kubi.kucoin.quote.market.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMarketActivity.m32781t2(this.f28363b);
                }
            });
        }
        C44630b c44630bM32811W4 = m32811W1();
        boolean zM103158a = true;
        if (c44630bM32811W4 != null && (baseTextView = c44630bM32811W4.f98972n) != null) {
            if (m32813Y1().getMark() == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            baseTextView.setVisibility(i11);
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46827w.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            zM103158a = ((InterfaceC46827w) objM56186h).m103158a(m32811W1());
        }
        if (zM103158a) {
            C44630b c44630bM32811W5 = m32811W1();
            if (c44630bM32811W5 != null && (lottieAnimationView2 = c44630bM32811W5.f98963e) != null) {
                C27046k.m66711z(lottieAnimationView2, 0L, new Function0() { // from class: com.kubi.kucoin.quote.market.n
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KuCoinMarketActivity.m32790w2(this.f28365b);
                    }
                }, 1, null);
            }
            C44630b c44630bM32811W6 = m32811W1();
            if (c44630bM32811W6 != null && (imageView3 = c44630bM32811W6.f98967i) != null) {
                C27046k.m66711z(imageView3, 0L, new Function0() { // from class: com.kubi.kucoin.quote.market.o
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KuCoinMarketActivity.m32793x2(this.f28369b);
                    }
                }, 1, null);
            }
            C44630b c44630bM32811W7 = m32811W1();
            if (c44630bM32811W7 != null && (imageView2 = c44630bM32811W7.f98964f) != null) {
                C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.kucoin.quote.market.p
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KuCoinMarketActivity.m32797z2(this.f28371b);
                    }
                }, 1, null);
            }
        }
        C44630b c44630bM32811W8 = m32811W1();
        if (c44630bM32811W8 != null && (imageView = c44630bM32811W8.f98966h) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.kucoin.quote.market.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMarketActivity.m32688B2(this.f28372b);
                }
            }, 1, null);
        }
        C44630b c44630bM32811W9 = m32811W1();
        if (c44630bM32811W9 != null) {
            lottieAnimationView = c44630bM32811W9.f98963e;
        } else {
            lottieAnimationView = null;
        }
        this.f28324H = lottieAnimationView;
        m32808S2();
        m32822c3();
        m32809T2();
    }

    /* JADX INFO: renamed from: S1 */
    public static final void m32727S1(Object obj) {
    }
}
