package com.kubi.margin.market;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.togglesymbols.ToggleSymbolDialogHelperKt;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.exception.MarginException;
import com.kubi.margin.kline.MarginKlineFragment;
import com.kubi.margin.market.info.MarginCoinInfoHelper;
import com.kubi.margin.market.info.MarginMarketCoinInfoFragment;
import com.kubi.margin.market.info.MarketBannerEntity;
import com.kubi.margin.market.info.MarketCoinInfo;
import com.kubi.margin.market.recommend.MarginMarketRecommendFragment;
import com.kubi.margin.market.trade.MarginMarketTradeFragment;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.network.retrofit.exception.ApiException;
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
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.SnapshotHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.spot.SpotRemoteConfig;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import f00.C37304a;
import g00.InterfaceC37752d;
import g00.InterfaceC37754f;
import g00.InterfaceC37762n;
import gf.C37890n;
import gf.InterfaceC37888l;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mp.C42579a;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36901a;
import p206dp.C36932p0;
import p429lf.C42180b;
import p481ny.C42899b;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p607rv.C44183g;
import p671uq.C45290a;
import p698vp.C45612b;
import p768xo.InterfaceC46307h;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
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
import w00.C45678b;
import y20.C46368b;

/* JADX INFO: compiled from: MarginMarketActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0001gB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00108\u001a\u00020\u0014H\u0014J\b\u00109\u001a\u00020:H\u0002J\u0012\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0015J\b\u0010@\u001a\u00020<H\u0002J\u0010\u0010A\u001a\u00020<2\u0006\u0010B\u001a\u000207H\u0002J\b\u0010C\u001a\u00020<H\u0002J\b\u0010D\u001a\u00020<H\u0002J\b\u0010E\u001a\u00020<H\u0002J\b\u0010F\u001a\u00020,H\u0002J\b\u0010G\u001a\u00020\rH\u0002J\b\u0010H\u001a\u00020<H\u0002J\b\u0010I\u001a\u00020<H\u0002J\b\u0010J\u001a\u00020<H\u0002J\b\u0010K\u001a\u00020<H\u0002J\b\u0010L\u001a\u00020<H\u0002J\u0019\u0010M\u001a\u00020<2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0002\u0010OJ\b\u0010P\u001a\u00020<H\u0002J\b\u0010Q\u001a\u00020<H\u0002J\b\u0010R\u001a\u00020<H\u0014J\b\u0010S\u001a\u00020<H\u0002J\u0010\u0010T\u001a\u00020<2\u0006\u0010U\u001a\u00020,H\u0002J\u0012\u0010V\u001a\u00020<2\b\u0010W\u001a\u0004\u0018\u00010XH\u0014J\n\u0010Y\u001a\u0004\u0018\u00010ZH\u0014J\b\u0010[\u001a\u00020 H\u0016J\b\u0010\\\u001a\u00020\u0014H\u0016J\b\u0010]\u001a\u00020,H\u0016J\b\u0010^\u001a\u00020\u0014H\u0016J\u000e\u0010_\u001a\u00020<2\u0006\u0010`\u001a\u00020\u0014J\b\u0010a\u001a\u00020<H\u0014J\b\u0010b\u001a\u00020<H\u0002J\b\u0010c\u001a\u00020<H\u0002J\u0018\u0010d\u001a\u00020<2\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010fH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010'R\u000e\u0010)\u001a\u00020*X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006h"}, m90084d2 = {"Lcom/kubi/margin/market/MarginMarketActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "Lcom/kubi/margin/kline/MarginKlineFragment$IKlineFragmentProvider;", "<init>", "()V", "bmarginActivityMarketBinding", "Lcom/kubi/margin/databinding/BmarginActivityMarketBinding;", "getBmarginActivityMarketBinding", "()Lcom/kubi/margin/databinding/BmarginActivityMarketBinding;", "bmarginActivityMarketBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "titles", "", "", "[Ljava/lang/String;", "tabFragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "tradeType", "", "getTradeType", "()I", "tradeType$delegate", "Lkotlin/Lazy;", "tradeApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getTradeApi", "()Lcom/kubi/margin/api/MarketApi;", "tradeApi$delegate", "mTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "getMTradeBean", "()Lcom/kubi/data/entity/TradeItemBean;", "mTradeBean$delegate", "tradeFragment", "Lcom/kubi/margin/market/trade/MarginMarketTradeFragment;", "getTradeFragment", "()Lcom/kubi/margin/market/trade/MarginMarketTradeFragment;", "tradeFragment$delegate", "mViewModel", "Lcom/kubi/margin/market/MarginMarketViewModel;", "aiFeedOpen", "", "isShowKline", "isShowAiIcon", "lottieAiView", "Lcom/airbnb/lottie/LottieAnimationView;", "headerFullNameCrypto", "headerLastPrice", "headerLast24HourRate", "headerPriceIsUp", "isHeaderMarketSummaryVisible", "headerScrollY", "", "getLayout", "getKlineFragment", "Lcom/kubi/sdk/BaseFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "maxSlidePx", "applyHeaderSubTitleState", "applyLegacyHeaderPriceState", "scrollY", "updateHeaderSubTitleText", "updateHeaderMarketSummaryText", "updateHeaderPriceText", "hasHeaderFullNameCrypto", "buildHeaderMarketSummaryText", "initListener", "fetchInfo", "initNavigationHeader", "updateAlertIconVisibility", "disableNavigationAmin", "initNavigationBottom", "supportF", "(Ljava/lang/Boolean;)V", "refreshTradeDataToView", "addFavor", "onResume", "refreshTradeData", "toTrade", "isBuy", "onNewIntent", "intent", "Landroid/content/Intent;", "initNavigationBar", "", "getTradeBean", "getPrecision", "isIndex", "marginTradeType", "scrollOffset", TypedValues.CycleType.S_WAVE_OFFSET, "onDestroy", "updateAiIconVisibility", "updateShareIconVisibility", "updateAiIcon", "spotMarks", "", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginMarketActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketActivity.kt\ncom/kubi/margin/market/MarginMarketActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 7 MarginIssue.kt\ncom/kubi/margin/exception/MarginIssueKt\n*L\n1#1,1000:1\n49#2,15:1001\n76#3,7:1016\n76#3,7:1023\n76#3,7:1034\n76#3,7:1041\n37#4:1030\n36#4,3:1031\n1#5:1048\n46#6,14:1049\n44#7,2:1063\n*S KotlinDebug\n*F\n+ 1 MarginMarketActivity.kt\ncom/kubi/margin/market/MarginMarketActivity\n*L\n120#1:1001,15\n265#1:1016,7\n273#1:1023,7\n363#1:1034,7\n385#1:1041,7\n305#1:1030\n305#1:1031,3\n921#1:1049,14\n571#1:1063,2\n*E\n"})
public final class MarginMarketActivity extends BaseUiActivity implements MarginKlineFragment.InterfaceC17697a {

    /* JADX INFO: renamed from: A */
    @NotNull
    public final Lazy f33184A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public final Lazy f33185B;

    /* JADX INFO: renamed from: C */
    public MarginMarketViewModel f33186C;

    /* JADX INFO: renamed from: D */
    public final boolean f33187D;

    /* JADX INFO: renamed from: E */
    public final boolean f33188E;

    /* JADX INFO: renamed from: F */
    public boolean f33189F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public LottieAnimationView f33190G;

    /* JADX INFO: renamed from: H */
    @Nullable
    public String f33191H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public String f33192I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public String f33193J;

    /* JADX INFO: renamed from: K */
    public boolean f33194K;

    /* JADX INFO: renamed from: L */
    public boolean f33195L;

    /* JADX INFO: renamed from: M */
    public float f33196M;

    /* JADX INFO: renamed from: N */
    public final float f33197N;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f33198v = C45678b.m100788b(this, new Function1<C36901a, Unit>() { // from class: com.kubi.margin.market.MarginMarketActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C36901a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36901a c36901a) {
            invoke(c36901a);
            return Unit.INSTANCE;
        }
    }, new Function1<MarginMarketActivity, C36901a>() { // from class: com.kubi.margin.market.MarginMarketActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36901a invoke(@NotNull MarginMarketActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s-522785575(...)");
            return C36901a.m82671a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public String[] f33199w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public ArrayList<Fragment> f33200x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final Lazy f33201y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public final Lazy f33202z;

    /* JADX INFO: renamed from: P */
    public static final /* synthetic */ KProperty<Object>[] f33183P = {Reflection.property1(new PropertyReference1Impl(MarginMarketActivity.class, "bmarginActivityMarketBinding", "getBmarginActivityMarketBinding()Lcom/kubi/margin/databinding/BmarginActivityMarketBinding;", 0))};

    /* JADX INFO: renamed from: O */
    @NotNull
    public static final Companion f33182O = new Companion(null);

    /* JADX INFO: compiled from: MarginMarketActivity.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/margin/market/MarginMarketActivity$Companion;", "", "<init>", "()V", "ACTION_WIDGET_DESK_ITEM", "", "toMarketActivity", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "tradeType", "", "spmId", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginMarketActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketActivity.kt\ncom/kubi/margin/market/MarginMarketActivity$Companion\n+ 2 MarginIssue.kt\ncom/kubi/margin/exception/MarginIssueKt\n*L\n1#1,1000:1\n44#2,2:1001\n*S KotlinDebug\n*F\n+ 1 MarginMarketActivity.kt\ncom/kubi/margin/market/MarginMarketActivity$Companion\n*L\n206#1:1001,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m38815b(TradeItemBean tradeItemBean, int i11, String str, FragmentActivity it) {
            Object objM103844constructorimpl;
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                Result.Companion companion = Result.INSTANCE;
                Intent intent = new Intent(it, (Class<?>) MarginMarketActivity.class);
                intent.putExtra("data", tradeItemBean);
                intent.putExtra("tradeType", i11);
                intent.putExtra("spm", str);
                it.startActivity(intent);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new MarginException(thM103847exceptionOrNullimpl, "toMarketActivity", false, null, 8, null), null, 2, null);
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void toMarketActivity$default(Companion companion, TradeItemBean tradeItemBean, int i11, String str, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 1;
            }
            if ((i12 & 4) != 0) {
                str = null;
            }
            companion.toMarketActivity(tradeItemBean, i11, str);
        }

        @JvmStatic
        public final void toMarketActivity(@NotNull final TradeItemBean tradeItemBean, final int tradeType, @Nullable final String spmId) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            TracePageHelper.m42472g("open_k_lever", "打开：杠杆k线");
            C43841b.m96557d("margin_k_line_page_load", "page_load_start", null, 4, null);
            C42899b.m94073c(new Function1() { // from class: com.kubi.margin.market.n0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketActivity.Companion.m38815b(tradeItemBean, tradeType, spmId, (FragmentActivity) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginMarketActivity$a */
    /* JADX INFO: compiled from: MarginMarketActivity.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/margin/market/MarginMarketActivity$initNavigationBottom$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17774a extends RecyclerView.OnScrollListener {
        public C17774a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            C36932p0 c36932p0;
            View view;
            C36932p0 c36932p1;
            View view2;
            C36932p0 c36932p2;
            View view3;
            C36932p0 c36932p3;
            View view4;
            C36932p0 c36932p4;
            View view5;
            C36932p0 c36932p5;
            View view6;
            C36932p0 c36932p6;
            View view7;
            C36932p0 c36932p7;
            View view8;
            C36932p0 c36932p8;
            View view9;
            C36932p0 c36932p9;
            View view10;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                if (!recyclerView.canScrollHorizontally(1)) {
                    if (C5303w0.m6511a()) {
                        C36901a c36901aM38810J1 = MarginMarketActivity.this.m38810J1();
                        if (c36901aM38810J1 != null && (c36932p9 = c36901aM38810J1.f81563j) != null && (view10 = c36932p9.f81875f) != null) {
                            ViewExtKt.m66594y(view10);
                        }
                        C36901a c36901aM38810J2 = MarginMarketActivity.this.m38810J1();
                        if (c36901aM38810J2 == null || (c36932p8 = c36901aM38810J2.f81563j) == null || (view9 = c36932p8.f81874e) == null) {
                            return;
                        }
                        C27046k.m66700o(view9);
                        return;
                    }
                    C36901a c36901aM38810J3 = MarginMarketActivity.this.m38810J1();
                    if (c36901aM38810J3 != null && (c36932p7 = c36901aM38810J3.f81563j) != null && (view8 = c36932p7.f81875f) != null) {
                        C27046k.m66700o(view8);
                    }
                    C36901a c36901aM38810J4 = MarginMarketActivity.this.m38810J1();
                    if (c36901aM38810J4 == null || (c36932p6 = c36901aM38810J4.f81563j) == null || (view7 = c36932p6.f81874e) == null) {
                        return;
                    }
                    ViewExtKt.m66594y(view7);
                    return;
                }
                if (recyclerView.canScrollHorizontally(-1)) {
                    C36901a c36901aM38810J5 = MarginMarketActivity.this.m38810J1();
                    if (c36901aM38810J5 != null && (c36932p1 = c36901aM38810J5.f81563j) != null && (view2 = c36932p1.f81875f) != null) {
                        ViewExtKt.m66594y(view2);
                    }
                    C36901a c36901aM38810J6 = MarginMarketActivity.this.m38810J1();
                    if (c36901aM38810J6 == null || (c36932p0 = c36901aM38810J6.f81563j) == null || (view = c36932p0.f81874e) == null) {
                        return;
                    }
                    ViewExtKt.m66594y(view);
                    return;
                }
                if (C5303w0.m6511a()) {
                    C36901a c36901aM38810J7 = MarginMarketActivity.this.m38810J1();
                    if (c36901aM38810J7 != null && (c36932p5 = c36901aM38810J7.f81563j) != null && (view6 = c36932p5.f81875f) != null) {
                        C27046k.m66700o(view6);
                    }
                    C36901a c36901aM38810J8 = MarginMarketActivity.this.m38810J1();
                    if (c36901aM38810J8 == null || (c36932p4 = c36901aM38810J8.f81563j) == null || (view5 = c36932p4.f81874e) == null) {
                        return;
                    }
                    ViewExtKt.m66594y(view5);
                    return;
                }
                C36901a c36901aM38810J9 = MarginMarketActivity.this.m38810J1();
                if (c36901aM38810J9 != null && (c36932p3 = c36901aM38810J9.f81563j) != null && (view4 = c36932p3.f81875f) != null) {
                    ViewExtKt.m66594y(view4);
                }
                C36901a c36901aM38810J10 = MarginMarketActivity.this.m38810J1();
                if (c36901aM38810J10 == null || (c36932p2 = c36901aM38810J10.f81563j) == null || (view3 = c36932p2.f81874e) == null) {
                    return;
                }
                C27046k.m66700o(view3);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginMarketActivity$b */
    /* JADX INFO: compiled from: MarginMarketActivity.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/margin/market/MarginMarketActivity$onCreate$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrolled", "", ViewProps.POSITION, "", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onPageScrollStateChanged", "state", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginMarketActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketActivity.kt\ncom/kubi/margin/market/MarginMarketActivity$onCreate$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1000:1\n1#2:1001\n*E\n"})
    public static final class C17775b implements ViewPager.OnPageChangeListener {
        public C17775b() {
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
                } else if (MarginMarketActivity.this.f33187D) {
                    str = "FeedTab";
                }
            } else {
                str = "Chart";
            }
            if (str != null) {
                C43852m.m96590b("B4candle", str, "1", TuplesKt.m90091to(FirebaseAnalytics.Param.CURRENCY, MarginMarketActivity.this.m38718L1().getSymbolInfoEntity().getBaseCurrency()));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginMarketActivity$c */
    /* JADX INFO: compiled from: MarginMarketActivity.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC17776c implements Runnable {
        public RunnableC17776c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CustomViewPager customViewPager;
            C36901a c36901aM38810J1 = MarginMarketActivity.this.m38810J1();
            if (c36901aM38810J1 == null || (customViewPager = c36901aM38810J1.f81569p) == null) {
                return;
            }
            customViewPager.setCurrentItem(1);
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginMarketActivity$d */
    /* JADX INFO: compiled from: MarginMarketActivity.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17777d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f33206b;

        public C17777d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f33206b = function;
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
            return this.f33206b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33206b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: j2 */
    public static final Unit m38763j2(MarginMarketActivity marginMarketActivity) {
        marginMarketActivity.m38786r2(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k2 */
    public static final Unit m38766k2(MarginMarketActivity marginMarketActivity) {
        marginMarketActivity.m38786r2(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public final void m38797v1(float f11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        float fCoerceIn = RangesKt.coerceIn((-f11) / 2.16f, -C27040e.m66657a(8.3f), 0.0f);
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null && (baseTextView3 = c36901aM38810J1.f81565l) != null) {
            baseTextView3.setTranslationY(fCoerceIn);
        }
        C36901a c36901aM38810J2 = m38810J1();
        if (c36901aM38810J2 != null && (baseTextView2 = c36901aM38810J2.f81567n) != null) {
            baseTextView2.setTranslationY(fCoerceIn);
        }
        C36901a c36901aM38810J3 = m38810J1();
        if (c36901aM38810J3 == null || (baseTextView = c36901aM38810J3.f81566m) == null) {
            return;
        }
        float f12 = this.f33197N;
        float fCoerceIn2 = RangesKt.coerceIn(f12 - f11, 0.0f, f12);
        baseTextView.setTranslationY(fCoerceIn2);
        if (f11 > 0.0f && ViewExtKt.m66580k(baseTextView)) {
            baseTextView.setVisibility(0);
        } else if (f11 <= 0.0f) {
            baseTextView.setVisibility(4);
        }
        baseTextView.setAlpha(1.0f - (fCoerceIn2 / this.f33197N));
    }

    /* JADX INFO: renamed from: v2 */
    private final void m38798v2(List<String> list) {
        boolean z11 = false;
        if (list != null && !list.isEmpty() && list.contains("Ai_Crypto_Insights")) {
            z11 = true;
        }
        this.f33189F = z11;
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    /* JADX INFO: renamed from: M1 */
    public boolean mo38435M1() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: U1 */
    public Void m38812U1() {
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SetTextI18n"})
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        BaseFragment baseFragmentMo50703f;
        BaseFragment baseFragmentNewInstance;
        BaseFragment baseFragmentNewInstance2;
        C36932p0 c36932p0;
        KcPrimaryButton kcPrimaryButton;
        C36932p0 c36932p1;
        KcPrimaryButton kcPrimaryButton2;
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager;
        CustomViewPager customViewPager2;
        super.onCreate(null);
        this.f33186C = (MarginMarketViewModel) new ViewModelProvider(this).get(MarginMarketViewModel.class);
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null && (customViewPager2 = c36901aM38810J1.f81569p) != null) {
            customViewPager2.setOffscreenPageLimit(2);
        }
        C36901a c36901aM38810J2 = m38810J1();
        if (c36901aM38810J2 != null && (customViewPager = c36901aM38810J2.f81569p) != null) {
            customViewPager.addOnPageChangeListener(new C17775b());
        }
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "gesture_status".length();
        }
        C12572a.m23692a(this, false, new MarginMarketActivity$onCreate$$inlined$bindFlowEvent$default$1("gesture_status", null, this));
        if (c12573b.m23696a()) {
            "JUMP_MARKET_FEED_TAB".length();
        }
        C12572a.m23692a(this, false, new MarginMarketActivity$onCreate$$inlined$bindFlowEvent$default$2("JUMP_MARKET_FEED_TAB", null, this));
        boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.CoinInfo);
        boolean zM58030b2 = C24129b.m58030b(SiteVisibleConfigKey.RelateTrading);
        this.f33199w = (String[]) ArraysKt.filterNotNull(new String[]{getString(R$string.market_trade), this.f33187D ? getString(R$string.kc_market_feed_tab) : null, zM58030b ? getString(R$string.market_coin_info) : null, zM58030b2 ? getString(R$string.market_recommend) : null}).toArray(new String[0]);
        BaseFragment baseFragmentM38716K1 = m38716K1();
        if (this.f33187D) {
            IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
            String baseCurrency = m38718L1().getSymbolInfoEntity().getBaseCurrency();
            Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
            baseFragmentMo50703f = iQuoteFacadeService.mo50703f(baseCurrency, "kline_margin");
        } else {
            baseFragmentMo50703f = null;
        }
        if (zM58030b) {
            IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
            if (companion.get().mo50698a()) {
                IQuoteFacadeService iQuoteFacadeService2 = companion.get();
                String symbol = m38718L1().getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                baseFragmentNewInstance = iQuoteFacadeService2.mo50695W(ViewProps.MARGIN, symbol, m38718L1().getSymbolInfoEntity().getBaseCurrency(), m38718L1().getSymbolInfoEntity().getQuoteCurrency());
            } else {
                baseFragmentNewInstance = MarginMarketCoinInfoFragment.f33300Y.newInstance(m38718L1());
            }
        } else {
            baseFragmentNewInstance = null;
        }
        if (zM58030b2) {
            IQuoteFacadeService.Companion companion2 = IQuoteFacadeService.f41383a;
            if (companion2.get().mo50708k()) {
                IQuoteFacadeService iQuoteFacadeService3 = companion2.get();
                String symbol2 = m38718L1().getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
                baseFragmentNewInstance2 = iQuoteFacadeService3.mo50690Q(ViewProps.MARGIN, symbol2, m38718L1().getSymbolInfoEntity().getBaseCurrency(), m38718L1().getSymbolInfoEntity().getQuoteCurrency());
            } else {
                baseFragmentNewInstance2 = MarginMarketRecommendFragment.f33411a0.newInstance(m38718L1());
            }
        } else {
            baseFragmentNewInstance2 = null;
        }
        this.f33200x = (ArrayList) CollectionsKt.toCollection(CollectionsKt.filterNotNull(CollectionsKt.arrayListOf(baseFragmentM38716K1, baseFragmentMo50703f, baseFragmentNewInstance, baseFragmentNewInstance2)), new ArrayList());
        C36901a c36901aM38810J3 = m38810J1();
        if (c36901aM38810J3 != null && (slidingTabLayout = c36901aM38810J3.f81564k) != null) {
            C36901a c36901aM38810J4 = m38810J1();
            slidingTabLayout.m55280F(c36901aM38810J4 != null ? c36901aM38810J4.f81569p : null, this.f33199w, this, this.f33200x);
        }
        m38739X1();
        m38737W1(this, null, 1, null);
        m38728R1();
        C36901a c36901aM38810J5 = m38810J1();
        if (c36901aM38810J5 != null && (c36932p1 = c36901aM38810J5.f81563j) != null && (kcPrimaryButton2 = c36932p1.f81872c) != null) {
            C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.margin.market.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketActivity.m38763j2(this.f33361b);
                }
            }, 1, null);
        }
        C36901a c36901aM38810J6 = m38810J1();
        if (c36901aM38810J6 != null && (c36932p0 = c36901aM38810J6.f81563j) != null && (kcPrimaryButton = c36932p0.f81873d) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.margin.market.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketActivity.m38766k2(this.f33578b);
                }
            }, 1, null);
        }
        m38806y1();
        if (c12573b.m23696a()) {
            "kline_scroll_offset_key".length();
        }
        C12572a.m23692a(this, false, new MarginMarketActivity$onCreate$$inlined$bindFlowEvent$default$3("kline_scroll_offset_key", null, this));
        if (c12573b.m23696a()) {
            "kline_update_price_key".length();
        }
        C12572a.m23692a(this, false, new MarginMarketActivity$onCreate$$inlined$bindFlowEvent$default$4("kline_update_price_key", null, this));
    }

    /* JADX INFO: renamed from: A1 */
    public static final Unit m38696A1(MarginMarketActivity marginMarketActivity) {
        MarginMarketViewModel marginMarketViewModel = marginMarketActivity.f33186C;
        if (marginMarketViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            marginMarketViewModel = null;
        }
        marginMarketViewModel.m38820q(marginMarketActivity.m38718L1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public final void m38697A2() {
        BaseTextView baseTextView;
        if (this.f33195L) {
            m38807y2();
            return;
        }
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 == null || (baseTextView = c36901aM38810J1.f81566m) == null) {
            return;
        }
        String str = this.f33191H;
        if (str == null) {
            str = "";
        }
        baseTextView.setText(str);
        baseTextView.setTextColor(ContextCompat.getColor(this, R$color.c_text40));
    }

    /* JADX INFO: renamed from: B1 */
    public static final boolean m38699B1(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() > 0;
    }

    /* JADX INFO: renamed from: C1 */
    public static final boolean m38702C1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: F1 */
    public static final Unit m38707F1(ArrayList arrayList) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H1 */
    public static final Unit m38711H1(MarginMarketActivity marginMarketActivity, Throwable th2) {
        new C24223c1(marginMarketActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K1 */
    private final BaseFragment m38716K1() {
        String str;
        if (!this.f33188E) {
            return m38811O1();
        }
        int iM38724P1 = m38724P1();
        if (iM38724P1 != 1) {
            str = iM38724P1 != 2 ? "" : "MARGIN_ISOLATED_TRADE";
        } else {
            str = "MARGIN_TRADE";
        }
        IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
        String symbol = m38718L1().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return iQuoteFacadeService.mo50713p(symbol, ViewProps.MARGIN, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public final TradeItemBean m38718L1() {
        return (TradeItemBean) this.f33184A.getValue();
    }

    /* JADX INFO: renamed from: N1 */
    private final InterfaceC46307h m38721N1() {
        return (InterfaceC46307h) this.f33202z.getValue();
    }

    /* JADX INFO: renamed from: P1 */
    private final int m38724P1() {
        return ((Number) this.f33201y.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public final boolean m38726Q1() {
        String str = this.f33191H;
        return str != null && (StringsKt.isBlank(str) ^ true);
    }

    /* JADX INFO: renamed from: S1 */
    public static final Unit m38730S1(MarginMarketActivity marginMarketActivity, C36901a c36901a, MarketCoinInfo marketCoinInfo) {
        if (marketCoinInfo != null && !C46368b.f103973a.m102263b()) {
            MarginCoinInfoHelper marginCoinInfoHelper = MarginCoinInfoHelper.f33327a;
            List<MarketBannerEntity> activities = marketCoinInfo.getActivities();
            ConstraintLayout root = c36901a.f81555b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            marginCoinInfoHelper.m39119e(marginMarketActivity, 0, activities, root);
            List<MarketBannerEntity> topics = marketCoinInfo.getTopics();
            ConstraintLayout root2 = c36901a.f81557d.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            marginCoinInfoHelper.m39119e(marginMarketActivity, 1, topics, root2);
            if (!marginMarketActivity.f33188E && marginMarketActivity.m38811O1().isAdded() && !marginMarketActivity.m38811O1().isDetached()) {
                marginMarketActivity.m38811O1().m39315g4();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T1 */
    public static final Unit m38732T1(MarginMarketActivity marginMarketActivity, Boolean bool) {
        if (bool == null) {
            return Unit.INSTANCE;
        }
        marginMarketActivity.m38735V1(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W1 */
    public static /* synthetic */ void m38737W1(MarginMarketActivity marginMarketActivity, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        marginMarketActivity.m38735V1(bool);
    }

    /* JADX INFO: renamed from: Z1 */
    public static final Unit m38743Z1(final MarginMarketActivity marginMarketActivity) {
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        if (companion.get().mo50718w()) {
            try {
                String str = marginMarketActivity.m38724P1() == 2 ? "isolated" : "cross";
                IQuoteFacadeService iQuoteFacadeService = companion.get();
                FragmentManager supportFragmentManager = marginMarketActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                iQuoteFacadeService.mo50714q(marginMarketActivity, supportFragmentManager, new CurrencyFilterTransferData(ViewProps.MARGIN, str, null, new SymbolData(marginMarketActivity.m38718L1().getSymbol(), null, 2, null), 4, null), "MarginMarketRnToggleSymbolDialog", new Function2() { // from class: com.kubi.margin.market.e0
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarginMarketActivity.m38745a2(this.f33262b, (CurrencyFilterTransferData) obj, (KCBridgeRejecterError) obj2);
                    }
                });
            } catch (Exception e11) {
                C43846g.m96568c(new MarginException(e11, "MarginMarketRnToggleSymbolDialog", false, null, 8, null), null, 2, null);
            }
        } else {
            C43852m.m96590b("B4candle", "symbolZone", "1", TuplesKt.m90091to("symbol", marginMarketActivity.m38718L1().getSymbol()));
            ToggleSymbolDialogHelperKt.m22834e(marginMarketActivity, Integer.valueOf(marginMarketActivity.m38724P1()), true, marginMarketActivity.m38718L1(), new Function0() { // from class: com.kubi.margin.market.f0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketActivity.m38747b2(this.f33270b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a2 */
    public static final Unit m38745a2(MarginMarketActivity marginMarketActivity, CurrencyFilterTransferData currencyFilterTransferData, KCBridgeRejecterError kCBridgeRejecterError) {
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
                        marginMarketActivity.finish();
                        marginMarketActivity.m38803x1();
                    }
                    break;
                case -1081309778:
                    if (level1.equals(ViewProps.MARGIN) && (data2 = currencyFilterTransferData.getData()) != null && (symbolCode2 = data2.getSymbolCode()) != null) {
                        Companion.toMarketActivity$default(f33182O, new TradeItemBean(symbolCode2), Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "cross") ? 1 : 2, null, 4, null);
                        marginMarketActivity.m38803x1();
                    }
                    break;
                case 3537154:
                    if (level1.equals(SearchCategory$Companion.SPOT) && (data3 = currencyFilterTransferData.getData()) != null && (symbolCode3 = data3.getSymbolCode()) != null) {
                        InterfaceC37762n.a.m85177a(C37304a.f82764a, symbolCode3, null, null, null, 14, null);
                        marginMarketActivity.finish();
                        marginMarketActivity.m38803x1();
                    }
                    break;
                case 92909918:
                    if (level1.equals("alpha") && currencyFilterTransferData != null && (data4 = currencyFilterTransferData.getData()) != null && (symbolCode4 = data4.getSymbolCode()) != null && (longOrNull = StringsKt.toLongOrNull(symbolCode4)) != null) {
                        long jLongValue = longOrNull.longValue();
                        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "market/alphaKline?tokenBridgeId=" + jLongValue, false, null, 6, null);
                        marginMarketActivity.finish();
                        marginMarketActivity.m38803x1();
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c2 */
    public static final Unit m38749c2(MarginMarketActivity marginMarketActivity) {
        C44128b.m97259c("MarginMarketActivity", "ivAI click");
        C43852m.m96590b("B4candle", "AIInsights", "1", TuplesKt.m90091to("trade_pair", marginMarketActivity.m38718L1().getSymbol()));
        String str = "CoinInsights?base=" + marginMarketActivity.m38718L1().getSymbolInfoEntity().getBaseCurrency() + "&sourceType=" + ViewProps.MARGIN;
        Router.f46192a.m56184f("krn/router?biz=coininfo&entry=main&component=krn_coininfo&route=" + Uri.encode(str)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d2 */
    public static final Unit m38751d2(MarginMarketActivity marginMarketActivity) {
        C43852m.m96591c("B4candle", "Share", null, null, 12, null);
        FrameLayout content = marginMarketActivity.getContent();
        if (marginMarketActivity.f33188E) {
            SnapshotHelper.f48173a.m58416i(marginMarketActivity, new Function1() { // from class: com.kubi.margin.market.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketActivity.m38753e2((Bitmap) obj);
                }
            });
        } else {
            IShareService iShareService = IShareService.f49268a.get();
            ImageShareParam imageShareParam = new ImageShareParam("m_k_share", null, false, null, false, null, null, null, null, null, 1022, null);
            imageShareParam.setBitmap(ViewExtKt.m66590u(content, C27017c.f54310a.m66512a(R$color.c_overlay)));
            IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e2 */
    public static final Unit m38753e2(Bitmap bitmap) {
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("m_k_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setBitmap(bitmap);
        IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g2 */
    public static final Unit m38757g2(MarginMarketActivity marginMarketActivity) {
        IQuoteFacadeService.f41383a.get().mo50692S(marginMarketActivity.m38718L1(), IQuoteFacadeService.Companion.TRADE_TYPE_SPOT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m1 */
    private final void m38770m1() {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c()) {
            Observable<R> observableCompose = m38721N1().addFavorSymbol(m38718L1().getSymbol()).compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketActivity.m38773n1(this.f33583b, (Disposable) obj);
                }
            };
            Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.margin.market.y
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginMarketActivity.m38776o1(function1, obj);
                }
            });
            Consumer consumer = new Consumer() { // from class: com.kubi.margin.market.z
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginMarketActivity.m38779p1(this.f33591b, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketActivity.m38782q1(this.f33237b, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.b0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginMarketActivity.m38785r1(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
            return;
        }
        if (!TextUtils.isEmpty(c42579a.m93347g().d0().id) && c42579a.m93347g().o()) {
            IUserService.O(c42579a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.margin.market.c0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketActivity.m38788s1();
                }
            }), 1, (Object) null);
            return;
        }
        C43852m.m96590b("B4candle", "collect", C45612b.m100697c(m38718L1()) ? "2" : "1", TuplesKt.m90091to("symbol", m38718L1().getSymbol()));
        c42579a.m93345e().mo50678C(m38718L1(), new Function1() { // from class: com.kubi.margin.market.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginMarketActivity.m38791t1(this.f33255b, ((Boolean) obj).booleanValue());
            }
        });
        if (C45612b.m100697c(m38718L1())) {
            C36901a c36901aM38810J1 = m38810J1();
            if (c36901aM38810J1 != null && (imageView4 = c36901aM38810J1.f81561h) != null) {
                imageView4.setImageResource(R$drawable.ic2_favorite_select_20);
            }
            C36901a c36901aM38810J2 = m38810J1();
            if (c36901aM38810J2 == null || (imageView3 = c36901aM38810J2.f81561h) == null) {
                return;
            }
            imageView3.clearColorFilter();
            return;
        }
        C36901a c36901aM38810J3 = m38810J1();
        if (c36901aM38810J3 != null && (imageView2 = c36901aM38810J3.f81561h) != null) {
            imageView2.setImageResource(R$drawable.ic2_favorite_unselect_20);
        }
        C36901a c36901aM38810J4 = m38810J1();
        if (c36901aM38810J4 == null || (imageView = c36901aM38810J4.f81561h) == null) {
            return;
        }
        C27046k.m66701p(imageView, ContextCompat.getColor(this, R$color.emphasis));
    }

    /* JADX INFO: renamed from: o2 */
    public static final Unit m38777o2(MarginMarketActivity marginMarketActivity, Throwable th2) {
        new C24223c1(marginMarketActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q1 */
    public static final Unit m38782q1(MarginMarketActivity marginMarketActivity, Throwable th2) {
        if ((th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "420000")) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
        }
        marginMarketActivity.hideDialogLoading();
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r2 */
    private final void m38786r2(boolean z11) {
        C43852m.m96590b("B4candle", z11 ? "klineBuy" : "klineSell", "1", TuplesKt.m90091to("symbol", m38718L1().getSymbol()));
        SymbolInfoEntity symbolInfoEntity = m38718L1().getSymbolInfoEntity();
        if (symbolInfoEntity != null && !symbolInfoEntity.isEnableTrading()) {
            m56592j0(TextUtils.isEmpty(symbolInfoEntity.getDisabledTip()) ? BaseApplication.INSTANCE.get().getString(R$string.current_trade_pause) : symbolInfoEntity.getDisabledTip());
            return;
        }
        String str = m38724P1() == 1 ? "B4tradingCross" : "B4tradingIsolated";
        if (str.length() == 0 || "page_load_start".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(" + str + ") or pointName(page_load_start) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42382c("type", "market");
            C45290a.f101823a.m100101b(str, "page_load_start", "", eventParametersBuilderAcquire.m42380a());
        }
        InterfaceC37754f.a.m85141m(C37304a.f82764a, Long.valueOf(m38724P1()), m38718L1().getSymbol(), Boolean.valueOf(z11), Boolean.TRUE, null, null, null, null, 240, null);
    }

    /* JADX INFO: renamed from: s1 */
    public static final Unit m38788s1() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t1 */
    public static final Unit m38791t1(MarginMarketActivity marginMarketActivity, boolean z11) {
        if (z11) {
            marginMarketActivity.m56592j0(marginMarketActivity.getString(C45612b.m100697c(marginMarketActivity.m38718L1()) ? R$string.cancel_favor_ok : R$string.add_favorites_ok));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t2 */
    public static final MarginMarketTradeFragment m38792t2(MarginMarketActivity marginMarketActivity) {
        return MarginMarketTradeFragment.f33462e0.newInstance(marginMarketActivity.m38718L1(), marginMarketActivity.m38724P1());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    /* JADX INFO: renamed from: w1 */
    private final String m38800w1() {
        String strM92642g;
        String str = this.f33192I;
        if (str == null) {
            str = "--";
        } else {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str == null) {
                str = "--";
            }
        }
        String str2 = this.f33193J;
        if (str2 == null) {
            return str;
        }
        if (StringsKt.isBlank(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            return str;
        }
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str2);
        if (bigDecimalOrNull != null && (strM92642g = C42180b.m92642g(bigDecimalOrNull, null, null, 0, true, false, true, 23, null)) != null) {
            str2 = strM92642g;
        }
        String str3 = this.f33193J;
        if (str3 == null) {
            str3 = "";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "%", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) str2, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) str3, false, 2, (Object) null)) {
            return str;
        }
        return str + ' ' + str2;
    }

    /* JADX INFO: renamed from: x1 */
    private final void m38803x1() {
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: y1 */
    private final void m38806y1() {
        MarginMarketViewModel marginMarketViewModel = this.f33186C;
        if (marginMarketViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            marginMarketViewModel = null;
        }
        marginMarketViewModel.m38822s(m38718L1());
        C24129b.m58033e(SiteVisibleConfigKey.Convert, new Function0() { // from class: com.kubi.margin.market.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketActivity.m38696A1(this.f33250b);
            }
        });
        Observable<R> observableCompose = m38721N1().m102122c(m38718L1().getSymbol()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarginMarketActivity.m38699B1((ArrayList) obj));
            }
        };
        Observable observableObserveOn = observableCompose.filter(new Predicate() { // from class: com.kubi.margin.market.e
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarginMarketActivity.m38702C1(function1, obj);
            }
        }).observeOn(C42916f.m94127f());
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginMarketActivity.m38703D1(this.f33269b, (ArrayList) obj);
            }
        };
        Observable observableObserveOn2 = observableObserveOn.doOnNext(new Consumer() { // from class: com.kubi.margin.market.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginMarketActivity.m38705E1(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.market.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginMarketActivity.m38707F1((ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.market.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginMarketActivity.m38709G1(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.market.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginMarketActivity.m38711H1(this.f33351b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn2.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginMarketActivity.m38713I1(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: J1 */
    public final C36901a m38810J1() {
        return (C36901a) this.f33198v.getValue(this, f33183P[0]);
    }

    /* JADX INFO: renamed from: O1 */
    public final MarginMarketTradeFragment m38811O1() {
        return (MarginMarketTradeFragment) this.f33185B.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.bmargin_activity_market;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.base.p113ui.OldBaseActivity, com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        LottieAnimationView lottieAnimationView = this.f33190G;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
        this.f33190G = null;
        C44183g.f97524a.m97408f();
        super.onDestroy();
    }

    public MarginMarketActivity() {
        setPageId("B4candle");
        this.f33199w = new String[0];
        this.f33200x = new ArrayList<>();
        this.f33201y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(MarginMarketActivity.m38795u2(this.f33357b));
            }
        });
        this.f33202z = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketActivity.m38789s2();
            }
        });
        this.f33184A = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketActivity.m38761i2(this.f33366b);
            }
        });
        this.f33185B = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketActivity.m38792t2(this.f33244b);
            }
        });
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        this.f33187D = companion.get().mo50706i();
        this.f33188E = companion.get().mo50691R();
        this.f33194K = true;
        this.f33197N = C27040e.m66657a(18.0f);
    }

    /* JADX INFO: renamed from: B2 */
    private final void m38700B2() {
        ImageView imageView;
        int i11;
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null && (imageView = c36901aM38810J1.f81562i) != null) {
            if (SpotRemoteConfig.f49637a.m59952t() && C24129b.m58030b(SiteVisibleConfigKey.InviteRebate)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
    }

    /* JADX INFO: renamed from: D1 */
    public static final Unit m38703D1(MarginMarketActivity marginMarketActivity, ArrayList arrayList) {
        marginMarketActivity.m38718L1().setSymbolInfoEntity((SymbolInfoEntity) arrayList.get(0));
        C37890n.f85269a.m85607H(marginMarketActivity.m38718L1().getSymbolInfoEntity());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E1 */
    public static final void m38705E1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G1 */
    public static final void m38709G1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I1 */
    public static final void m38713I1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R1 */
    private final void m38728R1() {
        final C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null) {
            MarginMarketViewModel marginMarketViewModel = this.f33186C;
            MarginMarketViewModel marginMarketViewModel2 = null;
            if (marginMarketViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                marginMarketViewModel = null;
            }
            marginMarketViewModel.m38821r().observe(this, new C17777d(new Function1() { // from class: com.kubi.margin.market.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketActivity.m38730S1(this.f33364b, c36901aM38810J1, (MarketCoinInfo) obj);
                }
            }));
            MarginMarketViewModel marginMarketViewModel3 = this.f33186C;
            if (marginMarketViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            } else {
                marginMarketViewModel2 = marginMarketViewModel3;
            }
            marginMarketViewModel2.m38819p().observe(this, new C17777d(new Function1() { // from class: com.kubi.margin.market.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketActivity.m38732T1(this.f33374b, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    /* JADX INFO: renamed from: V1 */
    private final void m38735V1(Boolean bool) {
        RecyclerView recyclerView;
        SiteVisibleConfigKey siteVisibleConfigKey;
        int i11;
        float fM66565c;
        int i12;
        C36901a c36901aM38810J1;
        C36901a c36901aM38810J2;
        C36932p0 c36932p0;
        View view;
        C36932p0 c36932p1;
        KcPrimaryButton kcPrimaryButton;
        C36932p0 c36932p2;
        View view2;
        C36932p0 c36932p3;
        View view3;
        C36932p0 c36932p4;
        C36901a c36901aM38810J3 = m38810J1();
        String strMo33261J = null;
        if (c36901aM38810J3 != null && (c36932p4 = c36901aM38810J3.f81563j) != null) {
            recyclerView = c36932p4.f81871b;
        } else {
            recyclerView = null;
        }
        if (recyclerView == null) {
            return;
        }
        int i13 = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        SiteVisibleConfigKey siteVisibleConfigKey2 = SiteVisibleConfigKey.Futures;
        if (C24129b.m58030b(siteVisibleConfigKey2)) {
            siteVisibleConfigKey = siteVisibleConfigKey2;
        } else {
            siteVisibleConfigKey = null;
        }
        if (siteVisibleConfigKey != null) {
            IKuMexService iKuMexServiceM93342b = C42579a.f94275a.m93342b();
            String baseCurrency = m38718L1().getSymbolInfoEntity().getBaseCurrency();
            Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
            String quoteCurrency = m38718L1().getSymbolInfoEntity().getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
            strMo33261J = iKuMexServiceM93342b.mo33261J(baseCurrency, quoteCurrency);
        }
        ArrayList arrayList = new ArrayList();
        if (strMo33261J != null && strMo33261J.length() != 0 && C24129b.m58030b(siteVisibleConfigKey2)) {
            arrayList.add(SearchCategory$Companion.FUTURES);
        }
        if (C27025c.m66566d(Boolean.valueOf(m38718L1().getSymbolInfoEntity().isBotEnabled())) && C24129b.m58030b(SiteVisibleConfigKey.BotSpotGrid)) {
            arrayList.add("robot");
        }
        arrayList.add(SearchCategory$Companion.SPOT);
        if (C27025c.m66566d(bool) && C24129b.m58030b(SiteVisibleConfigKey.Convert)) {
            arrayList.add("flash");
        }
        int size = arrayList.size();
        TradeItemBean tradeItemBeanM38718L1 = m38718L1();
        if (size > 3) {
            i11 = 38;
        } else {
            i11 = 48;
        }
        MarginNavigationIconAdapter marginNavigationIconAdapter = new MarginNavigationIconAdapter(tradeItemBeanM38718L1, strMo33261J, i11);
        recyclerView.addItemDecoration(new MarginNavigationDecoration(arrayList.size(), (int) C27025c.m66565c(this, 8)));
        if (C5303w0.m6511a()) {
            C36901a c36901aM38810J4 = m38810J1();
            if (c36901aM38810J4 != null && (c36932p3 = c36901aM38810J4.f81563j) != null && (view3 = c36932p3.f81874e) != null) {
                view3.setBackgroundResource(R$drawable.bmargin_overlay_gradient_right);
            }
            C36901a c36901aM38810J5 = m38810J1();
            if (c36901aM38810J5 != null && (c36932p2 = c36901aM38810J5.f81563j) != null && (view2 = c36932p2.f81875f) != null) {
                view2.setBackgroundResource(R$drawable.bmargin_overlay_gradient_left);
            }
        }
        recyclerView.setAdapter(marginNavigationIconAdapter);
        marginNavigationIconAdapter.m39129j(arrayList);
        if (size > 3) {
            fM66565c = C27025c.m66565c(this, 160);
        } else {
            if (size == 0) {
                i12 = 0;
            } else {
                fM66565c = C27025c.m66565c(this, (size * 48) + ((size - 1) * 8));
            }
            if (i12 != 0) {
                i13 = 8;
            }
            c36901aM38810J1 = m38810J1();
            if (c36901aM38810J1 != null && (c36932p1 = c36901aM38810J1.f81563j) != null && (kcPrimaryButton = c36932p1.f81872c) != null) {
                ViewGroup.LayoutParams layoutParams = kcPrimaryButton.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Context context = kcPrimaryButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                marginLayoutParams.setMarginStart((int) C27025c.m66565c(context, i13));
                kcPrimaryButton.setLayoutParams(marginLayoutParams);
            }
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            layoutParams2.width = i12;
            recyclerView.setLayoutParams(layoutParams2);
            if (size > 3 && (c36901aM38810J2 = m38810J1()) != null && (c36932p0 = c36901aM38810J2.f81563j) != null && (view = c36932p0.f81875f) != null) {
                ViewExtKt.m66594y(view);
            }
            recyclerView.addOnScrollListener(new C17774a());
        }
        i12 = (int) fM66565c;
        if (i12 != 0) {
            i13 = 8;
        }
        c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null) {
            ViewGroup.LayoutParams layoutParams3 = kcPrimaryButton.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            Context context2 = kcPrimaryButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            marginLayoutParams2.setMarginStart((int) C27025c.m66565c(context2, i13));
            kcPrimaryButton.setLayoutParams(marginLayoutParams2);
        }
        ViewGroup.LayoutParams layoutParams4 = recyclerView.getLayoutParams();
        layoutParams4.width = i12;
        recyclerView.setLayoutParams(layoutParams4);
        if (size > 3) {
            ViewExtKt.m66594y(view);
        }
        recyclerView.addOnScrollListener(new C17774a());
    }

    /* JADX INFO: renamed from: X1 */
    private final void m38739X1() {
        int i11;
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null) {
            ImageView ivBack = c36901aM38810J1.f81560g;
            Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
            C27046k.m66711z(ivBack, 0L, new Function0() { // from class: com.kubi.margin.market.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketActivity.m38741Y1(this.f33380b);
                }
            }, 1, null);
            c36901aM38810J1.f81565l.setText(m38718L1().getShowSymbol());
            BaseTextView tvCoinpairs = c36901aM38810J1.f81565l;
            Intrinsics.checkNotNullExpressionValue(tvCoinpairs, "tvCoinpairs");
            C27046k.m66710y(tvCoinpairs, 1000L, new Function0() { // from class: com.kubi.margin.market.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketActivity.m38743Z1(this.f33383b);
                }
            });
            BaseTextView baseTextView = c36901aM38810J1.f81567n;
            if (m38718L1().getMark() == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            baseTextView.setVisibility(i11);
            LottieAnimationView ivAi = c36901aM38810J1.f81558e;
            Intrinsics.checkNotNullExpressionValue(ivAi, "ivAi");
            C27046k.m66711z(ivAi, 0L, new Function0() { // from class: com.kubi.margin.market.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketActivity.m38749c2(this.f33388b);
                }
            }, 1, null);
            this.f33190G = c36901aM38810J1.f81558e;
            m38801w2();
            m38700B2();
            m38804x2();
            ImageView ivShare = c36901aM38810J1.f81562i;
            Intrinsics.checkNotNullExpressionValue(ivShare, "ivShare");
            C27046k.m66711z(ivShare, 0L, new Function0() { // from class: com.kubi.margin.market.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketActivity.m38751d2(this.f33393b);
                }
            }, 1, null);
            ImageView ivAlert = c36901aM38810J1.f81559f;
            Intrinsics.checkNotNullExpressionValue(ivAlert, "ivAlert");
            C27046k.m66711z(ivAlert, 0L, new Function0() { // from class: com.kubi.margin.market.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketActivity.m38755f2(this.f33448b);
                }
            }, 1, null);
            ImageView ivFav = c36901aM38810J1.f81561h;
            Intrinsics.checkNotNullExpressionValue(ivFav, "ivFav");
            C27046k.m66711z(ivFav, 0L, new Function0() { // from class: com.kubi.margin.market.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketActivity.m38759h2(this.f33452b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static final Unit m38741Y1(MarginMarketActivity marginMarketActivity) {
        marginMarketActivity.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b2 */
    public static final Unit m38747b2(MarginMarketActivity marginMarketActivity) {
        marginMarketActivity.m38813l2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f2 */
    public static final Unit m38755f2(final MarginMarketActivity marginMarketActivity) {
        C43852m.m96590b("B4candle", "priceAlarm", "1", TuplesKt.m90091to("symbol", marginMarketActivity.m38718L1().getSymbol()), TuplesKt.m90091to("is_login", Integer.valueOf(IUserService.a.get().c() ? 1 : 0)), TuplesKt.m90091to("norm_version", "1"));
        IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.margin.market.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginMarketActivity.m38757g2(this.f33570b);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h2 */
    public static final Unit m38759h2(MarginMarketActivity marginMarketActivity) {
        marginMarketActivity.m38770m1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i2 */
    public static final TradeItemBean m38761i2(MarginMarketActivity marginMarketActivity) {
        if (Intrinsics.areEqual(marginMarketActivity.getIntent().getAction(), "action_widget_desk_item")) {
            try {
                Intent intent = marginMarketActivity.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                TradeItemBean tradeItemBean = (TradeItemBean) RouteExKt.m56272s(intent, "data");
                if (tradeItemBean == null) {
                    return new TradeItemBean("BTC-USDT");
                }
                return tradeItemBean;
            } catch (Exception e11) {
                C44128b.m97263g("KuCoinMarketActivity", e11);
                return new TradeItemBean("BTC-USDT");
            }
        }
        Intent intent2 = marginMarketActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        TradeItemBean tradeItemBean2 = (TradeItemBean) RouteExKt.m56272s(intent2, "data");
        if (tradeItemBean2 == null) {
            Intent intent3 = marginMarketActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
            String strM56237a0 = RouteExKt.m56237a0(intent3, "symbol");
            if (strM56237a0 != null && strM56237a0.length() != 0) {
                return new TradeItemBean(strM56237a0);
            }
            Intent intent4 = marginMarketActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
            String strM56237a1 = RouteExKt.m56237a0(intent4, "coin");
            if (strM56237a1 != null && strM56237a1.length() != 0) {
                return new TradeItemBean(InterfaceC37888l.m85586i(C37890n.f85269a, strM56237a1, null, 2, null));
            }
            return new TradeItemBean("BTC-USDT");
        }
        return tradeItemBean2;
    }

    /* JADX INFO: renamed from: m2 */
    public static final Unit m38771m2(MarginMarketActivity marginMarketActivity, MarketListEntityItem marketListEntityItem) {
        BigDecimal bigDecimalOrNull;
        boolean z11;
        marginMarketActivity.f33191H = marketListEntityItem.getFullNameCrypto();
        String lastPrice = marketListEntityItem.getLastPrice();
        if (lastPrice == null) {
            lastPrice = marginMarketActivity.f33192I;
        }
        marginMarketActivity.f33192I = lastPrice;
        marginMarketActivity.f33193J = marketListEntityItem.getLast24HourRate();
        String last24HourRate = marketListEntityItem.getLast24HourRate();
        int iIntValue = 0;
        if (last24HourRate != null && (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(last24HourRate)) != null) {
            if (bigDecimalOrNull.signum() >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            marginMarketActivity.f33194K = z11;
        }
        marginMarketActivity.m38794u1();
        marginMarketActivity.m38718L1().setFavor(marketListEntityItem.getFavoritePersonal());
        marginMarketActivity.m38718L1().setAlarm(marketListEntityItem.getAlarmingPersonal());
        TradeItemBean tradeItemBeanM38718L1 = marginMarketActivity.m38718L1();
        Integer symbolMark = marketListEntityItem.getSymbolMark();
        if (symbolMark != null) {
            iIntValue = symbolMark.intValue();
        }
        tradeItemBeanM38718L1.setMark(iIntValue);
        marginMarketActivity.m38798v2(marketListEntityItem.getSpotMarks());
        marginMarketActivity.m38783q2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n1 */
    public static final Unit m38773n1(MarginMarketActivity marginMarketActivity, Disposable disposable) {
        marginMarketActivity.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n2 */
    public static final void m38774n2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o1 */
    public static final void m38776o1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p1 */
    public static final void m38779p1(MarginMarketActivity marginMarketActivity, Object obj) {
        String str;
        int i11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (C45612b.m100697c(marginMarketActivity.m38718L1())) {
            str = "2";
        } else {
            str = "1";
        }
        C43852m.m96590b("B4candle", "collect", str, TuplesKt.m90091to("symbol", marginMarketActivity.m38718L1().getSymbol()));
        marginMarketActivity.hideDialogLoading();
        if (C45612b.m100697c(marginMarketActivity.m38718L1())) {
            i11 = R$string.cancel_favor_ok;
        } else {
            i11 = R$string.add_favorites_ok;
        }
        marginMarketActivity.m56592j0(marginMarketActivity.getString(i11));
        marginMarketActivity.m38718L1().setFavor(!C45612b.m100697c(marginMarketActivity.m38718L1()));
        if (C45612b.m100697c(marginMarketActivity.m38718L1())) {
            C36901a c36901aM38810J1 = marginMarketActivity.m38810J1();
            if (c36901aM38810J1 != null && (imageView4 = c36901aM38810J1.f81561h) != null) {
                imageView4.setImageResource(R$drawable.ic2_favorite_select_20);
            }
            C36901a c36901aM38810J2 = marginMarketActivity.m38810J1();
            if (c36901aM38810J2 != null && (imageView3 = c36901aM38810J2.f81561h) != null) {
                imageView3.clearColorFilter();
                return;
            }
            return;
        }
        C36901a c36901aM38810J3 = marginMarketActivity.m38810J1();
        if (c36901aM38810J3 != null && (imageView2 = c36901aM38810J3.f81561h) != null) {
            imageView2.setImageResource(R$drawable.ic2_favorite_unselect_20);
        }
        C36901a c36901aM38810J4 = marginMarketActivity.m38810J1();
        if (c36901aM38810J4 != null && (imageView = c36901aM38810J4.f81561h) != null) {
            C27046k.m66701p(imageView, ContextCompat.getColor(marginMarketActivity, R$color.emphasis));
        }
    }

    /* JADX INFO: renamed from: p2 */
    public static final void m38780p2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q2 */
    private final void m38783q2() {
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
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null && (baseTextView = c36901aM38810J1.f81567n) != null) {
            if (m38718L1().getMark() == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            baseTextView.setVisibility(i11);
        }
        if (C45612b.m100697c(m38718L1())) {
            C36901a c36901aM38810J2 = m38810J1();
            if (c36901aM38810J2 != null && (imageView8 = c36901aM38810J2.f81561h) != null) {
                imageView8.setImageResource(R$drawable.ic2_favorite_select_20);
            }
            C36901a c36901aM38810J3 = m38810J1();
            if (c36901aM38810J3 != null && (imageView7 = c36901aM38810J3.f81561h) != null) {
                imageView7.clearColorFilter();
            }
        } else {
            C36901a c36901aM38810J4 = m38810J1();
            if (c36901aM38810J4 != null && (imageView2 = c36901aM38810J4.f81561h) != null) {
                imageView2.setImageResource(R$drawable.ic2_favorite_unselect_20);
            }
            C36901a c36901aM38810J5 = m38810J1();
            if (c36901aM38810J5 != null && (imageView = c36901aM38810J5.f81561h) != null) {
                C27046k.m66701p(imageView, ContextCompat.getColor(this, R$color.emphasis));
            }
        }
        if (m38718L1().isAlarm()) {
            C36901a c36901aM38810J6 = m38810J1();
            if (c36901aM38810J6 != null && (imageView6 = c36901aM38810J6.f81559f) != null) {
                imageView6.setImageResource(R$drawable.ic2_alert_select_20);
            }
            C36901a c36901aM38810J7 = m38810J1();
            if (c36901aM38810J7 != null && (imageView5 = c36901aM38810J7.f81559f) != null) {
                imageView5.clearColorFilter();
            }
        } else {
            C36901a c36901aM38810J8 = m38810J1();
            if (c36901aM38810J8 != null && (imageView4 = c36901aM38810J8.f81559f) != null) {
                imageView4.setImageResource(R$drawable.ic2_alert_unselect_20);
            }
            C36901a c36901aM38810J9 = m38810J1();
            if (c36901aM38810J9 != null && (imageView3 = c36901aM38810J9.f81559f) != null) {
                C27046k.m66701p(imageView3, ContextCompat.getColor(this, R$color.emphasis));
            }
        }
        m38801w2();
    }

    /* JADX INFO: renamed from: r1 */
    public static final void m38785r1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s2 */
    public static final InterfaceC46307h m38789s2() {
        return (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: u1 */
    private final void m38794u1() {
        boolean z11;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        if (!m38726Q1()) {
            m38797v1(this.f33196M);
            return;
        }
        if (this.f33196M >= this.f33197N) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33195L = z11;
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null && (baseTextView3 = c36901aM38810J1.f81565l) != null) {
            baseTextView3.setTranslationY(-C27040e.m66657a(8.3f));
        }
        C36901a c36901aM38810J2 = m38810J1();
        if (c36901aM38810J2 != null && (baseTextView2 = c36901aM38810J2.f81567n) != null) {
            baseTextView2.setTranslationY(-C27040e.m66657a(8.3f));
        }
        C36901a c36901aM38810J3 = m38810J1();
        if (c36901aM38810J3 != null && (baseTextView = c36901aM38810J3.f81566m) != null) {
            baseTextView.setVisibility(0);
            baseTextView.setTranslationY(0.0f);
            baseTextView.setAlpha(1.0f);
        }
        m38697A2();
    }

    /* JADX INFO: renamed from: u2 */
    public static final int m38795u2(MarginMarketActivity marginMarketActivity) {
        Intent intent = marginMarketActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return C27039d.m66650j(RouteExKt.m56264o(intent, "tradeType"));
    }

    /* JADX INFO: renamed from: w2 */
    private final void m38801w2() {
        LottieAnimationView lottieAnimationView;
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null) {
            lottieAnimationView = c36901aM38810J1.f81558e;
        } else {
            lottieAnimationView = null;
        }
        this.f33190G = lottieAnimationView;
        if (SpotRemoteConfig.f49637a.m59951s() && this.f33189F) {
            C43852m.m96594f("B4candle", "AIInsights", "1", TuplesKt.m90091to("trade_pair", m38718L1().getSymbol()));
            LottieAnimationView lottieAnimationView2 = this.f33190G;
            if (lottieAnimationView2 != null && lottieAnimationView2.getAnimation() == null) {
                lottieAnimationView2.setAnimation("ai-belle.json");
                lottieAnimationView2.setRepeatCount(-1);
                lottieAnimationView2.playAnimation();
            }
            LottieAnimationView lottieAnimationView3 = this.f33190G;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setVisibility(0);
                return;
            }
            return;
        }
        LottieAnimationView lottieAnimationView4 = this.f33190G;
        if (lottieAnimationView4 != null) {
            lottieAnimationView4.cancelAnimation();
            lottieAnimationView4.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: x2 */
    private final void m38804x2() {
        ImageView imageView;
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null) {
            imageView = c36901aM38810J1.f81559f;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public final void m38807y2() {
        BaseTextView baseTextView;
        int iM54289n;
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null && (baseTextView = c36901aM38810J1.f81566m) != null) {
            baseTextView.setText(m38800w1());
            if (this.f33194K) {
                iM54289n = C22890g.m54291p(this);
            } else {
                iM54289n = C22890g.m54289n(this);
            }
            baseTextView.setTextColor(iM54289n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0019  */
    /* JADX INFO: renamed from: z2 */
    public final void m38809z2() {
        BaseTextView baseTextView;
        int iM54289n;
        C36901a c36901aM38810J1 = m38810J1();
        if (c36901aM38810J1 != null && (baseTextView = c36901aM38810J1.f81566m) != null) {
            String str = this.f33192I;
            if (str != null) {
                if (StringsKt.isBlank(str)) {
                    str = null;
                }
                if (str == null) {
                    str = "--";
                }
            } else {
                str = "--";
            }
            baseTextView.setText(str);
            if (this.f33194K) {
                iM54289n = C22890g.m54291p(this);
            } else {
                iM54289n = C22890g.m54289n(this);
            }
            baseTextView.setTextColor(iM54289n);
        }
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public TradeItemBean mo38428D0() {
        return m38718L1();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ /* synthetic */ View mo32393c0() {
        return (View) m38812U1();
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    public int getPrecision() {
        Integer numValueOf;
        SymbolInfoEntity symbolInfoEntity = m38718L1().getSymbolInfoEntity();
        if (symbolInfoEntity != null) {
            numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: l2 */
    public final void m38813l2() {
        Observable observableCompose = InterfaceC46307h.m102118z(m38721N1(), m38718L1().getSymbol(), null, 2, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginMarketActivity.m38771m2(this.f33276b, (MarketListEntityItem) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.market.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginMarketActivity.m38774n2(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginMarketActivity.m38777o2(this.f33286b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginMarketActivity.m38780p2(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            startActivity(intent);
            finish();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m38813l2();
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    /* JADX INFO: renamed from: z1 */
    public int mo38603z1() {
        return m38724P1();
    }
}
