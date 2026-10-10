package com.kubi.kucoin.main;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.advert.api.IAdvertService;
import com.kubi.app.bizcontrol.BizControlService;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.clean.api.constant.MainTabPage;
import com.kubi.clean.api.service.IAutoCleanService;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.BeepHelperV2;
import com.kubi.data.DataInitManager;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.facade.lib.R$color;
import com.kubi.facade.lib.R$drawable;
import com.kubi.facade.lib.R$id;
import com.kubi.facade.lib.R$layout;
import com.kubi.facade.lib.R$string;
import com.kubi.home.api.IHomeService;
import com.kubi.homern.api.IHomeRNService;
import com.kubi.kucoin.api.IMainActivity;
import com.kubi.kucoin.interceptor.RequestLimitInterceptor;
import com.kubi.kucoin.main.helper.MainStatusBarFixUtil;
import com.kubi.kucoin.main.widget.HomeRadioButton;
import com.kubi.kucoin.utils.C15731n;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kucoin.utils.LocateManager;
import com.kubi.kucoin.utils.NetworkChangeReceiver;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.market.monitor.api.IMarketMonitorService;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.api.service.IMineService;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.network.websocket.DefaultWebSocketClient;
import com.kubi.notice.api.service.INoticeService;
import com.kubi.otc.api.IOtcService;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.site.migration.SiteMigrationService;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.util.StartupTrace;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradefacade.api.ITradeFacadeService;
import com.kubi.user.api.IUserService;
import com.kubi.user.api.UserRestrictedStateBean;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27012a;
import com.kubi.utils.C27077o;
import com.kubi.utils.C27100x0;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.wallet.api.IWalletService;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37764p;
import g10.C37784o;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import ml.C42565a;
import my.C42674m;
import my.InterfaceC42667f;
import my.InterfaceC42678q;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38058b;
import p316hl.C38226a;
import p374jl.InterfaceC40434b;
import p402kf.C41016c;
import p502oj.C43101f;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p622sf.C44401a;
import p671uq.C45290a;
import p693vj.C45557b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45678b;
import zw.C46932c;

/* JADX INFO: compiled from: KuCoinMainActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000±\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014*\u00018\b\u0007\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0082\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010.\u001a\u00020\u0014H\u0014J\n\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020\u0018H\u0014J\b\u00102\u001a\u00020\u0014H\u0016J\u0012\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010=\u001a\u00020;2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\b\u0010@\u001a\u00020;H\u0002J\b\u0010A\u001a\u00020;H\u0002J\b\u0010B\u001a\u00020;H\u0002J\b\u0010C\u001a\u00020;H\u0002J\b\u0010D\u001a\u00020;H\u0002J\b\u0010E\u001a\u00020;H\u0002J\u0010\u0010F\u001a\u00020;2\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020;H\u0016J\b\u0010J\u001a\u00020;H\u0002J\b\u0010K\u001a\u00020;H\u0002J\b\u0010L\u001a\u00020;H\u0002J\u0014\u0010M\u001a\u00020;2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010OH\u0002J\u0010\u0010P\u001a\u00020;2\u0006\u0010Q\u001a\u00020\u0007H\u0002J\b\u0010R\u001a\u00020SH\u0002J\u0010\u0010T\u001a\u00020;2\u0006\u0010U\u001a\u00020\u0014H\u0002J\u0018\u0010V\u001a\u00020;2\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0002J\u0018\u0010Y\u001a\u00020;2\u0006\u0010N\u001a\u00020O2\u0006\u0010Z\u001a\u00020[H\u0002J\u0012\u0010\\\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010]\u001a\u00020;2\u0006\u0010^\u001a\u00020\u0014H\u0002J\u0010\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0014H\u0002J\u0012\u0010a\u001a\u0004\u0018\u00010\u00072\u0006\u0010`\u001a\u00020\u0014H\u0002J\u0010\u0010b\u001a\u00020;2\u0006\u0010c\u001a\u00020\u0014H\u0002J\b\u0010d\u001a\u00020;H\u0002J\u0010\u0010e\u001a\u00020;2\u0006\u0010f\u001a\u00020\u0018H\u0016J\b\u0010g\u001a\u00020;H\u0014J\b\u0010h\u001a\u00020;H\u0014J\u0018\u0010i\u001a\u00020;2\u0006\u0010j\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\u0018H\u0016J\n\u0010l\u001a\u0004\u0018\u00010mH\u0002J\u0014\u0010n\u001a\u0004\u0018\u00010o2\b\u0010p\u001a\u0004\u0018\u00010mH\u0002J\b\u0010q\u001a\u00020;H\u0002J\b\u0010r\u001a\u00020;H\u0014J\u0010\u0010s\u001a\u00020;2\u0006\u0010t\u001a\u00020\u001dH\u0014J\f\u0010u\u001a\u00020\u0014*\u00020\u0014H\u0002J\f\u0010v\u001a\u00020\u0014*\u00020\u0014H\u0002J\u0015\u0010w\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010?H\u0002¢\u0006\u0002\u0010xJ\u0012\u0010y\u001a\u00020;2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\n\u0010z\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010{\u001a\u00020;2\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\b\u0010|\u001a\u00020;H\u0016J\b\u0010}\u001a\u00020;H\u0014J\u0006\u0010~\u001a\u00020\u0018J\u0012\u0010\u007f\u001a\u00020\u00182\b\b\u0001\u0010U\u001a\u00020\u0014H\u0002J\t\u0010\u0080\u0001\u001a\u00020;H\u0002J\t\u0010\u0081\u0001\u001a\u00020;H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u000e\u0010%\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010'\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b(\u0010\"R\u000e\u0010*\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00103\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b4\u00105R\u0010\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0004\n\u0002\u00109¨\u0006\u0083\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/main/KuCoinMainActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "Lcom/kubi/kucoin/api/IMainActivity;", "Lcom/kubi/sdk/eventhub/IBusinessTabBarHideable;", "<init>", "()V", "gcdMainHostId", "", "kucoinActivityMainBinding", "Lcom/kubi/facade/lib/databinding/KucoinActivityMainBinding;", "getKucoinActivityMainBinding", "()Lcom/kubi/facade/lib/databinding/KucoinActivityMainBinding;", "kucoinActivityMainBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "kycStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/mine/api/entity/KycStatusEntity;", "mViewModel", "Lcom/kubi/kucoin/main/KuCoinMainViewModel;", "currentCheckId", "", "networkChangeReceiver", "Lcom/kubi/kucoin/utils/NetworkChangeReceiver;", "isToggle", "", "mainStatusBarFixUtil", "Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;", "businessTabBarHidden", "pendingTradeRouteExtras", "Landroid/os/Bundle;", "isFirstRequestLimitConfig", "homeFragment", "Lcom/kubi/sdk/BaseFragment;", "getHomeFragment", "()Lcom/kubi/sdk/BaseFragment;", "homeFragment$delegate", "Lkotlin/Lazy;", "marketFragment", "tradeFragment", "kumexFragment", "getKumexFragment", "kumexFragment$delegate", "assetFragment", "mHomeBadge", "Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;", "mTradeBadge", "getLayout", "initNavigationBar", "Landroid/view/View;", "openDoubleBack", "getBundleSizeLimit", "rnScreenCrashSwitch", "getRnScreenCrashSwitch", "()Z", "rnScreenCrashSwitch$delegate", "appStatusListener", "com/kubi/kucoin/main/KuCoinMainActivity$appStatusListener$1", "Lcom/kubi/kucoin/main/KuCoinMainActivity$appStatusListener$1;", "onCreate", "", "savedInstanceState", "handleJumpUri", "intent", "Landroid/content/Intent;", "initRedPointNotice", "initBizControlListener", "initUpdatePasswordConfig", "bindAutoCleanEvent", "queryKycStatus", "handleKlineInMaintenance", "handleMaintenance", "maintenance", "Lcom/kubi/data/entity/MaintenanceEntity;", "recreate", "listenEvent", "bindShowDepositDisableDialogEvent", "checkCOverlaySelector", "getUserRestrictedState", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "showKycLimitNotice", "from", "getTabPageById", "Lcom/kubi/clean/api/constant/MainTabPage;", "bottomTabClickEventTrack", "id", "tabClickTrack", "pageId", "blockId", "showClearChinaUsersDialog", "restrictedState", "Lcom/kubi/user/api/UserRestrictedStateBean;", "initNavigationView", "externalDataFillFragment", "newId", "getTabName", "checkId", "getTabPageId", "showFragment", "itemId", "registerNetWorkChanged", "onWindowFocusChanged", "hasFocus", "onResume", "onPause", "setBusinessTabBarHidden", ViewProps.HIDDEN, "animated", "currentTabFragment", "Landroidx/fragment/app/Fragment;", "findRnContainerProvider", "Lcom/kubi/sdk/eventhub/RnContainerIdProvider;", "fragment", "syncTabBarForCurrentTab", "onReBack", "onSaveInstanceState", "outState", "id2Position", "position2Id", "resolveMainTabId", "(Landroid/content/Intent;)Ljava/lang/Integer;", "markPendingTradeRoute", "consumePendingTradeRouteExtras", "onNewIntent", "onBackPressed", "onDestroy", "tabOnTrade", "isTab", "checkNeedToastBack", "onRestart", "Companion", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuCoinMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinMainActivity.kt\ncom/kubi/kucoin/main/KuCoinMainActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 9 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,1285:1\n49#2,15:1286\n1869#3,2:1301\n25#4,3:1303\n25#4,3:1306\n81#5,2:1309\n81#5,2:1311\n158#5,2:1327\n81#5,2:1329\n158#5,2:1331\n46#6,14:1313\n1#7:1333\n35#8,4:1334\n39#8:1340\n35#8,4:1341\n39#8:1347\n44#9,2:1338\n44#9,2:1345\n*S KotlinDebug\n*F\n+ 1 KuCoinMainActivity.kt\ncom/kubi/kucoin/main/KuCoinMainActivity\n*L\n158#1:1286,15\n228#1:1301,2\n244#1:1303,3\n287#1:1306,3\n350#1:1309,2\n372#1:1311,2\n408#1:1327,2\n477#1:1329,2\n486#1:1331,2\n391#1:1313,14\n1170#1:1334,4\n1170#1:1340\n203#1:1341,4\n203#1:1347\n1170#1:1338,2\n203#1:1345,2\n*E\n"})
public final class KuCoinMainActivity extends BaseUiActivity implements IMainActivity, InterfaceC42667f {

    /* JADX INFO: renamed from: R */
    public static int f27953R;

    /* JADX INFO: renamed from: A */
    @Nullable
    public NetworkChangeReceiver f27954A;

    /* JADX INFO: renamed from: B */
    public boolean f27955B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public MainStatusBarFixUtil f27956C;

    /* JADX INFO: renamed from: D */
    public boolean f27957D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public Bundle f27958E;

    /* JADX INFO: renamed from: L */
    @Nullable
    public QBadgeView f27965L;

    /* JADX INFO: renamed from: M */
    @Nullable
    public QBadgeView f27966M;

    /* JADX INFO: renamed from: y */
    public KuCoinMainViewModel f27972y;

    /* JADX INFO: renamed from: z */
    public int f27973z;

    /* JADX INFO: renamed from: Q */
    public static final /* synthetic */ KProperty<Object>[] f27952Q = {Reflection.property1(new PropertyReference1Impl(KuCoinMainActivity.class, "kucoinActivityMainBinding", "getKucoinActivityMainBinding()Lcom/kubi/facade/lib/databinding/KucoinActivityMainBinding;", 0))};

    /* JADX INFO: renamed from: P */
    @NotNull
    public static final Companion f27951P = new Companion(null);

    /* JADX INFO: renamed from: v */
    @NotNull
    public final String f27969v = KuCoinMainActivity.class.getName() + '@' + System.identityHashCode(this);

    /* JADX INFO: renamed from: w */
    @NotNull
    public final InterfaceC24293a f27970w = C45678b.m100788b(this, new Function1<C44401a, Unit>() { // from class: com.kubi.kucoin.main.KuCoinMainActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C44401a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44401a c44401a) {
            invoke(c44401a);
            return Unit.INSTANCE;
        }
    }, new Function1<KuCoinMainActivity, C44401a>() { // from class: com.kubi.kucoin.main.KuCoinMainActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44401a invoke(@NotNull KuCoinMainActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s-675791165(...)");
            return C44401a.m97932a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: x */
    @NotNull
    public final MutableLiveData<KycStatusEntity> f27971x = new MutableLiveData<>();

    /* JADX INFO: renamed from: F */
    public boolean f27959F = true;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final Lazy f27960G = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.main.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuCoinMainActivity.m32311K1();
        }
    });

    /* JADX INFO: renamed from: H */
    @NotNull
    public final BaseFragment f27961H = IQuoteFacadeService.f41383a.get().mo50700c();

    /* JADX INFO: renamed from: I */
    @NotNull
    public final BaseFragment f27962I = ITradeFacadeService.f51878a.get().mo63590f();

    /* JADX INFO: renamed from: J */
    @NotNull
    public final Lazy f27963J = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.main.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuCoinMainActivity.m32326V1();
        }
    });

    /* JADX INFO: renamed from: K */
    @NotNull
    public final BaseFragment f27964K = IAssetsCenterService.f16464a.get().mo15331A();

    /* JADX INFO: renamed from: N */
    @NotNull
    public final Lazy f27967N = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.main.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(KuCoinMainActivity.m32366r2());
        }
    });

    /* JADX INFO: renamed from: O */
    @NotNull
    public final C15416a f27968O = new C15416a();

    /* JADX INFO: compiled from: KuCoinMainActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kucoin/main/KuCoinMainActivity$Companion;", "", "<init>", "()V", "navHeight", "", "getNavHeight", "TAG_SERVICE_UNAVAILABLE_IN_COUNTRY", "", "DIALOG_FROM_TAB_CHANGE", "DIALOG_FROM_TYPE_MAINTENANCE", "DIALOG_FROM_REFRESH_TOP_MSG", "DIALOG_FROM_FOREGROUND", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final int getNavHeight() {
            return KuCoinMainActivity.f27953R;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.main.KuCoinMainActivity$a */
    /* JADX INFO: compiled from: KuCoinMainActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kucoin/main/KuCoinMainActivity$appStatusListener$1", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onBackground", "", "activity", "Landroid/app/Activity;", "onForeground", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15416a implements C5287o0.b {
        public C15416a() {
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
            KuCoinMainActivity.this.m32401p1();
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
            KuCoinMainActivity.this.m32412w2("foreground");
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.main.KuCoinMainActivity$c */
    /* JADX INFO: compiled from: KuCoinMainActivity.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\n"}, m90084d2 = {"com/kubi/kucoin/main/KuCoinMainActivity$initNavigationView$1", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKuCoinMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinMainActivity.kt\ncom/kubi/kucoin/main/KuCoinMainActivity$initNavigationView$1\n+ 2 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,1285:1\n46#2,14:1286\n46#2,14:1300\n46#2,14:1314\n46#2,14:1328\n46#2,14:1342\n46#2,14:1356\n46#2,14:1370\n46#2,14:1384\n*S KotlinDebug\n*F\n+ 1 KuCoinMainActivity.kt\ncom/kubi/kucoin/main/KuCoinMainActivity$initNavigationView$1\n*L\n718#1:1286,14\n724#1:1300,14\n730#1:1314,14\n739#1:1328,14\n746#1:1342,14\n760#1:1356,14\n766#1:1370,14\n775#1:1384,14\n*E\n"})
    public static final class C15419c implements RadioGroupPlus.InterfaceC22946c {
        /* JADX INFO: renamed from: e */
        public static final Unit m32421e() {
            C43841b.m96555b("B1overview", null, 2, null);
            InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
            return Unit.INSTANCE;
        }

        public C15419c() {
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m32422f() {
            IKuMexService.f28731a.get().mo33279g();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public static final Unit m32423g(KuCoinMainActivity kuCoinMainActivity) {
            C43852m.m96591c("B5trading", "appTradeAutoLoginSuccess", "1", null, 8, null);
            C43841b.m96555b("B5trading", null, 2, null);
            C43841b.m96555b("B4tradingCross", null, 2, null);
            C43841b.m96555b("B4tradingIsolated", null, 2, null);
            C37304a c37304a = C37304a.f82764a;
            Intent intent = kuCoinMainActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            InterfaceC37754f.a.m85141m(c37304a, Long.valueOf(C27039d.m66651k(RouteExKt.m56227R(intent, "type"), 0)), null, null, null, null, null, null, null, 254, null);
            return Unit.INSTANCE;
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            int i12;
            boolean z12;
            boolean z13;
            int i13;
            boolean z14;
            Bundle bundleM32404r1;
            RadioGroupPlus radioGroupPlus2;
            RadioGroupPlus radioGroupPlus3;
            RadioGroupPlus radioGroupPlus4;
            int i14 = R$id.main_home;
            if (i11 == i14) {
                i12 = 0;
            } else if (i11 == R$id.main_quotes) {
                i12 = 1;
            } else if (i11 == R$id.main_trade) {
                i12 = 2;
            } else {
                i12 = i11 == R$id.main_kumex ? 3 : 4;
            }
            KuCoinMainActivity.this.m32397m1(i11);
            if (i12 != 2 && z11) {
                KuCoinMainViewModel kuCoinMainViewModel = KuCoinMainActivity.this.f27972y;
                if (kuCoinMainViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    kuCoinMainViewModel = null;
                }
                KuCoinMainViewModel.m32452u(kuCoinMainViewModel, i12, null, 2, null);
            }
            boolean z15 = i11 == R$id.main_assets;
            if (z15 && !UserInfo.a.n()) {
                IUserService.a.get().w(MapsKt.mapOf(TuplesKt.m90091to("preSpmId", "kcApp.B1overview.assetsBottomTab.1")), IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kucoin.main.c0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KuCoinMainActivity.C15419c.m32421e();
                    }
                }));
                C44401a c44401aM32411w1 = KuCoinMainActivity.this.m32411w1();
                if (c44401aM32411w1 == null || (radioGroupPlus4 = c44401aM32411w1.f98078g) == null) {
                    return;
                }
                radioGroupPlus4.m54743f(KuCoinMainActivity.this.f27973z);
                return;
            }
            int i15 = R$id.main_kumex;
            if (i11 == i15 && IKuMexService.f28731a.get().mo33254C(KuCoinMainActivity.this.getSupportFragmentManager())) {
                C44401a c44401aM32411w2 = KuCoinMainActivity.this.m32411w1();
                if (c44401aM32411w2 == null || (radioGroupPlus3 = c44401aM32411w2.f98078g) == null) {
                    return;
                }
                radioGroupPlus3.m54743f(KuCoinMainActivity.this.f27973z);
                return;
            }
            if (KuCoinMainActivity.this.f27973z == i11) {
                C44401a c44401aM32411w3 = KuCoinMainActivity.this.m32411w1();
                if (c44401aM32411w3 == null || (radioGroupPlus2 = c44401aM32411w3.f98078g) == null) {
                    return;
                }
                radioGroupPlus2.m54743f(KuCoinMainActivity.this.f27973z);
                return;
            }
            if (KuCoinMainActivity.this.f27973z != 0 && DataMapUtil.f54245a.m66370a("vibrate_bottom", true)) {
                Object systemService = KuCoinMainActivity.this.f46505q.getSystemService("vibrator");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                ((Vibrator) systemService).vibrate(1L);
            }
            KuCoinMainActivity.this.f27973z = i11;
            if (KuCoinMainActivity.this.f27973z == i14 || KuCoinMainActivity.this.f27973z == i15) {
                C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.kucoin.main.d0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KuCoinMainActivity.C15419c.m32422f();
                    }
                });
            }
            boolean z16 = i11 == R$id.main_quotes;
            int i16 = R$id.main_trade;
            boolean z17 = i11 == i16;
            if (z17) {
                IUserService.Companion companion = IUserService.a;
                if (!TextUtils.isEmpty(companion.get().d0().id) && companion.get().o() && !ITradeFacadeService.f51878a.get().mo63585a(KuCoinMainActivity.this.f27962I)) {
                    C43852m.m96591c("B5trading", "appTradeAutoLoginShowTimes", "1", null, 8, null);
                    IUserService iUserService = companion.get();
                    IRedirect.Companion companion2 = IRedirect.INSTANCE;
                    final KuCoinMainActivity kuCoinMainActivity = KuCoinMainActivity.this;
                    IUserService.O(iUserService, (Map) null, companion2.obtain(new Function0() { // from class: com.kubi.kucoin.main.e0
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return KuCoinMainActivity.C15419c.m32423g(kuCoinMainActivity);
                        }
                    }), 1, (Object) null);
                }
            }
            if (z17) {
                Intent intent = KuCoinMainActivity.this.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                String str = RouteExKt.m56222M(intent, "fromMarket", false) ? "market" : "tab";
                Intent intent2 = KuCoinMainActivity.this.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                int iM56225P = RouteExKt.m56225P(intent2, "type", -1);
                z12 = z16;
                z13 = z15;
                z14 = z17;
                i13 = i16;
                if (iM56225P == -1) {
                    int iMo63586b = ITradeFacadeService.f51878a.get().mo63586b(KuCoinMainActivity.this);
                    if (iMo63586b != 0) {
                        if (iMo63586b != 1) {
                            if (iMo63586b == 2) {
                                if ("B4tradingIsolated".length() == 0 || "page_load_start".length() == 0) {
                                    C44128b.m97270n("Monitor", "eventName(B4tradingIsolated) or pointName(page_load_start) is null");
                                } else {
                                    EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
                                    eventParametersBuilderAcquire.m42382c("type", str);
                                    C45290a.f101823a.m100101b("B4tradingIsolated", "page_load_start", "", eventParametersBuilderAcquire.m42380a());
                                }
                            }
                        } else if ("B4tradingCross".length() == 0 || "page_load_start".length() == 0) {
                            C44128b.m97270n("Monitor", "eventName(B4tradingCross) or pointName(page_load_start) is null");
                        } else {
                            EventParametersBuilder eventParametersBuilderAcquire2 = EventParametersBuilder.INSTANCE.acquire();
                            eventParametersBuilderAcquire2.m42382c("type", str);
                            C45290a.f101823a.m100101b("B4tradingCross", "page_load_start", "", eventParametersBuilderAcquire2.m42380a());
                        }
                    } else if ("B5trading".length() == 0 || "page_load_start".length() == 0) {
                        C44128b.m97270n("Monitor", "eventName(B5trading) or pointName(page_load_start) is null");
                    } else {
                        EventParametersBuilder eventParametersBuilderAcquire3 = EventParametersBuilder.INSTANCE.acquire();
                        eventParametersBuilderAcquire3.m42382c("type", str);
                        C45290a.f101823a.m100101b("B5trading", "page_load_start", "", eventParametersBuilderAcquire3.m42380a());
                    }
                } else if (iM56225P != 0) {
                    if (iM56225P != 1) {
                        if (iM56225P != 2) {
                            if (iM56225P == 3) {
                                int iMo63586b2 = ITradeFacadeService.f51878a.get().mo63586b(KuCoinMainActivity.this);
                                if (iMo63586b2 != 1) {
                                    if (iMo63586b2 == 2) {
                                        if ("B4tradingIsolated".length() == 0 || "page_load_start".length() == 0) {
                                            C44128b.m97270n("Monitor", "eventName(B4tradingIsolated) or pointName(page_load_start) is null");
                                        } else {
                                            EventParametersBuilder eventParametersBuilderAcquire4 = EventParametersBuilder.INSTANCE.acquire();
                                            eventParametersBuilderAcquire4.m42382c("type", str);
                                            C45290a.f101823a.m100101b("B4tradingIsolated", "page_load_start", "", eventParametersBuilderAcquire4.m42380a());
                                        }
                                    }
                                } else if ("B4tradingCross".length() == 0 || "page_load_start".length() == 0) {
                                    C44128b.m97270n("Monitor", "eventName(B4tradingCross) or pointName(page_load_start) is null");
                                } else {
                                    EventParametersBuilder eventParametersBuilderAcquire5 = EventParametersBuilder.INSTANCE.acquire();
                                    eventParametersBuilderAcquire5.m42382c("type", str);
                                    C45290a.f101823a.m100101b("B4tradingCross", "page_load_start", "", eventParametersBuilderAcquire5.m42380a());
                                }
                            }
                        } else if ("B4tradingIsolated".length() == 0 || "page_load_start".length() == 0) {
                            C44128b.m97270n("Monitor", "eventName(B4tradingIsolated) or pointName(page_load_start) is null");
                        } else {
                            EventParametersBuilder eventParametersBuilderAcquire6 = EventParametersBuilder.INSTANCE.acquire();
                            eventParametersBuilderAcquire6.m42382c("type", str);
                            C45290a.f101823a.m100101b("B4tradingIsolated", "page_load_start", "", eventParametersBuilderAcquire6.m42380a());
                        }
                    } else if ("B4tradingCross".length() == 0 || "page_load_start".length() == 0) {
                        C44128b.m97270n("Monitor", "eventName(B4tradingCross) or pointName(page_load_start) is null");
                    } else {
                        EventParametersBuilder eventParametersBuilderAcquire7 = EventParametersBuilder.INSTANCE.acquire();
                        eventParametersBuilderAcquire7.m42382c("type", str);
                        C45290a.f101823a.m100101b("B4tradingCross", "page_load_start", "", eventParametersBuilderAcquire7.m42380a());
                    }
                } else if ("B5trading".length() == 0 || "page_load_start".length() == 0) {
                    C44128b.m97270n("Monitor", "eventName(B5trading) or pointName(page_load_start) is null");
                } else {
                    EventParametersBuilder eventParametersBuilderAcquire8 = EventParametersBuilder.INSTANCE.acquire();
                    eventParametersBuilderAcquire8.m42382c("type", str);
                    C45290a.f101823a.m100101b("B5trading", "page_load_start", "", eventParametersBuilderAcquire8.m42380a());
                }
            } else {
                z12 = z16;
                z13 = z15;
                i13 = i16;
                z14 = z17;
            }
            if (z13) {
                C43841b.m96557d("B1overview_account_detail_load", "page_load_start", null, 4, null);
            }
            if (!z12) {
                IQuoteFacadeService.Companion companion3 = IQuoteFacadeService.f41383a;
                companion3.get().mo50688O(KuCoinMainActivity.this.f27961H);
                companion3.get().mo50683H(KuCoinMainActivity.this.f27961H);
                companion3.get().mo50710m(KuCoinMainActivity.this.f27961H);
            }
            if (!z14) {
                C12572a.m23695d("EVENT_KYC_RELEASE", null, 0L, 6, null);
            }
            if (i11 != i15) {
                IKuMexService.f28731a.get().mo33265O(KuCoinMainActivity.this.m32413x1());
            }
            if (i11 == i13 && (bundleM32404r1 = KuCoinMainActivity.this.m32404r1()) != null) {
                ITradeFacadeService.f51878a.get().mo63588d(KuCoinMainActivity.this.f27962I, bundleM32404r1);
            }
            IAutoCleanService.f19482a.get().mo20403c(KuCoinMainActivity.this.m32378B1());
            KuCoinMainActivity.this.m32410v2(i11);
            KuCoinMainActivity.this.m32414x2();
            INoticeService iNoticeService = INoticeService.f36364a.get();
            KuCoinMainActivity kuCoinMainActivity2 = KuCoinMainActivity.this;
            iNoticeService.mo43135d(kuCoinMainActivity2.m32377A1(kuCoinMainActivity2.f27973z));
            KuCoinMainActivity.this.m32412w2("tabChange");
            KuCoinMainActivity.this.m32400o2();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.main.KuCoinMainActivity$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15420d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.main.KuCoinMainActivity$e */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15421e extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.main.KuCoinMainActivity$onCreate$8 */
    /* JADX INFO: compiled from: KuCoinMainActivity.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kucoin.main.KuCoinMainActivity$onCreate$8", m90122f = "KuCoinMainActivity.kt", m90123i = {0}, m90124l = {268}, m90125m = "invokeSuspend", m90126n = {"waitedSignTermsJson"}, m90127s = {"L$0"})
    public static final class C154228 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C154228(Continuation<? super C154228> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KuCoinMainActivity.this.new C154228(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C154228) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strM56280w;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Intent intent = KuCoinMainActivity.this.getIntent();
                if (intent != null) {
                    strM56280w = RouteExKt.m56280w(intent, "waitedSignTerms");
                } else {
                    strM56280w = null;
                }
                if (strM56280w != null && strM56280w.length() != 0) {
                    IUserService iUserService = IUserService.a.get();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(strM56280w);
                    this.label = 1;
                    if (iUserService.e0(strM56280w, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            C42565a.f94256a.m93332a(true);
            IUserService.a.get().m0();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.main.KuCoinMainActivity$onResume$1 */
    /* JADX INFO: compiled from: KuCoinMainActivity.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kucoin.main.KuCoinMainActivity$onResume$1", m90122f = "KuCoinMainActivity.kt", m90123i = {}, m90124l = {1014}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C154231 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C154231(Continuation<? super C154231> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C154231(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C154231) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SiteMigrationService siteMigrationService = SiteMigrationService.f47924a;
                this.label = 1;
                if (SiteMigrationService.m58144l(siteMigrationService, "home", false, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseActivity
    /* JADX INFO: renamed from: W */
    public boolean mo32389W() {
        return true;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m32391X1(Intent intent) {
        Bundle extras;
        Bundle bundle = null;
        if (intent != null) {
            Integer numM32403q2 = m32403q2(intent);
            int i11 = R$id.main_trade;
            if (numM32403q2 == null || numM32403q2.intValue() != i11) {
                intent = null;
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                bundle = new Bundle(extras);
            }
        }
        this.f27958E = bundle;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public View mo32393c0() {
        return null;
    }

    @Override // android.app.Activity
    public void recreate() {
        try {
            if (DayNightThemeManager.f28592a.m33188m()) {
                return;
            }
            super.recreate();
        } finally {
            DayNightThemeManager.f28592a.m33195t(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public final InterfaceC42678q m32407u1(Fragment fragment) {
        if (fragment != 0 && fragment.isAdded()) {
            if (fragment instanceof InterfaceC42678q) {
                return (InterfaceC42678q) fragment;
            }
            Iterator<Fragment> it = fragment.getChildFragmentManager().getFragments().iterator();
            while (it.hasNext()) {
                InterfaceC42678q interfaceC42678qM32407u1 = m32407u1(it.next());
                if (interfaceC42678qM32407u1 != null) {
                    return interfaceC42678qM32407u1;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v2 */
    public final void m32410v2(int i11) {
        this.f27955B = true;
        C38226a.f85925a.m86303e();
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        for (Fragment fragment : getSupportFragmentManager().getFragments()) {
            if (fragment.isAdded() && !(fragment instanceof DialogFragment)) {
                fragmentTransactionBeginTransaction.hide(fragment);
                fragment.setUserVisibleHint(false);
            }
        }
        int i12 = R$id.main_home;
        if (i11 == i12) {
            if (m32409v1().isAdded()) {
                fragmentTransactionBeginTransaction.show(m32409v1());
            } else {
                fragmentTransactionBeginTransaction.add(R$id.fl_container, m32409v1(), "homeFragment");
            }
            MainStatusBarFixUtil mainStatusBarFixUtil = this.f27956C;
            if (mainStatusBarFixUtil != null) {
                mainStatusBarFixUtil.m32429e();
            }
            m32409v1().setUserVisibleHint(true);
        } else if (i11 == R$id.main_quotes) {
            TracePageHelper.m42472g("open_spot_quotes", "现货行情");
            if (this.f27961H.isAdded()) {
                fragmentTransactionBeginTransaction.show(this.f27961H);
            } else {
                fragmentTransactionBeginTransaction.add(R$id.fl_container, this.f27961H, "marketFragment");
            }
            MainStatusBarFixUtil mainStatusBarFixUtil2 = this.f27956C;
            if (mainStatusBarFixUtil2 != null) {
                mainStatusBarFixUtil2.m32429e();
            }
            this.f27961H.setUserVisibleHint(true);
        } else if (i11 == R$id.main_assets) {
            if (this.f27964K.isAdded()) {
                fragmentTransactionBeginTransaction.show(this.f27964K);
            } else {
                fragmentTransactionBeginTransaction.add(R$id.fl_container, this.f27964K, "assetFragment");
            }
            MainStatusBarFixUtil mainStatusBarFixUtil3 = this.f27956C;
            if (mainStatusBarFixUtil3 != null) {
                mainStatusBarFixUtil3.m32429e();
            }
            this.f27964K.setUserVisibleHint(true);
        } else if (i11 == R$id.main_trade) {
            TracePageHelper.m42472g("open_spot", "现货交易");
            if (this.f27962I.isAdded()) {
                fragmentTransactionBeginTransaction.show(this.f27962I);
            } else {
                fragmentTransactionBeginTransaction.add(R$id.fl_container, this.f27962I, "tradeFragment");
            }
            MainStatusBarFixUtil mainStatusBarFixUtil4 = this.f27956C;
            if (mainStatusBarFixUtil4 != null) {
                mainStatusBarFixUtil4.m32429e();
            }
            this.f27962I.setUserVisibleHint(true);
            ITradeFacadeService.f51878a.get().mo63589e(this.f27962I, true);
        } else if (i11 == R$id.main_kumex) {
            TracePageHelper.m42472g("open_contract", "合约");
            BaseFragment baseFragmentM32413x1 = m32413x1();
            if (baseFragmentM32413x1 != null) {
                if (baseFragmentM32413x1.isAdded()) {
                    RequestLimitInterceptor.f27943c.setTempExpiredTime(3000L);
                    fragmentTransactionBeginTransaction.show(baseFragmentM32413x1);
                } else {
                    RequestLimitInterceptor.f27943c.setTempExpiredTime(5000L);
                    fragmentTransactionBeginTransaction.add(R$id.fl_container, baseFragmentM32413x1, "kumexFragment");
                }
                MainStatusBarFixUtil mainStatusBarFixUtil5 = this.f27956C;
                if (mainStatusBarFixUtil5 != null) {
                    mainStatusBarFixUtil5.m32429e();
                }
                baseFragmentM32413x1.setUserVisibleHint(true);
            }
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        if (i11 != i12) {
            IHomeService.f25434a.get().mo28951g();
        }
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m32300D1(KuCoinMainActivity kuCoinMainActivity, FragmentManager fragmentManager, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fragmentManager = null;
        }
        kuCoinMainActivity.m32379C1(fragmentManager);
    }

    /* JADX INFO: renamed from: E1 */
    public static final Unit m32302E1(KuCoinMainActivity kuCoinMainActivity, FragmentManager fragmentManager, UserRestrictedStateBean userRestrictedStateBean) {
        if (userRestrictedStateBean != null) {
            kuCoinMainActivity.m32408u2(fragmentManager, userRestrictedStateBean);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P1 */
    public static final Unit m32317P1(KuCoinMainActivity kuCoinMainActivity) {
        if (kuCoinMainActivity.f27973z != R$id.main_trade || kuCoinMainActivity.f27955B) {
            kuCoinMainActivity.f27955B = false;
        } else {
            ITradeFacadeService.f51878a.get().mo63587c(kuCoinMainActivity.f27962I);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q1 */
    public static final Unit m32319Q1(KuCoinMainActivity kuCoinMainActivity) {
        if (kuCoinMainActivity.f27973z != R$id.main_kumex || kuCoinMainActivity.f27955B) {
            kuCoinMainActivity.f27955B = false;
        } else {
            BaseFragment baseFragmentM32413x1 = kuCoinMainActivity.m32413x1();
            if (baseFragmentM32413x1 != null) {
                IKuMexService.f28731a.get().mo33267Q(baseFragmentM32413x1);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R1 */
    public static final Unit m32321R1(KuCoinMainActivity kuCoinMainActivity) {
        if (kuCoinMainActivity.f27973z != R$id.main_assets || kuCoinMainActivity.f27955B) {
            kuCoinMainActivity.f27955B = false;
        } else {
            IAssetsCenterService.f16464a.get().mo15344j(kuCoinMainActivity.f27964K);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V1 */
    public static final BaseFragment m32326V1() {
        return IKuMexService.f28731a.get().mo33270U();
    }

    /* JADX INFO: renamed from: a2 */
    public static final boolean m32334a2(Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.booleanValue();
    }

    /* JADX INFO: renamed from: b2 */
    public static final boolean m32336b2(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: c2 */
    public static final Unit m32338c2(Boolean bool) {
        DataInitManager.f21486a.m23670k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g2 */
    public static final Unit m32346g2(KuCoinMainActivity kuCoinMainActivity) {
        IOtcService.m43953l(IOtcService.f37164a.get(), null, 1, null);
        kuCoinMainActivity.m32395k1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i2 */
    public static final Unit m32350i2(KuCoinMainActivity kuCoinMainActivity, String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        KuCoinMainViewModel kuCoinMainViewModel = kuCoinMainActivity.f27972y;
        if (kuCoinMainViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            kuCoinMainViewModel = null;
        }
        kuCoinMainViewModel.m32459t(2, symbol);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k2 */
    public static final boolean m32354k2() {
        return DayNightThemeManager.f28592a.m33187l();
    }

    /* JADX INFO: renamed from: m2 */
    public static final Unit m32358m2() {
        IKuMexService.f28731a.get().mo33279g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o1 */
    public static final Unit m32361o1(Drawable drawable, KuCoinMainActivity kuCoinMainActivity) {
        Drawable drawable2 = ((RippleDrawable) drawable).getDrawable(0);
        GradientDrawable gradientDrawable = drawable2 instanceof GradientDrawable ? (GradientDrawable) drawable2 : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(kuCoinMainActivity.m56586Y(R$color.c_overlay));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r2 */
    public static final boolean m32366r2() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C15421e().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_rn_screen_crash_switch", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: s2 */
    public static final void m32368s2(KuCoinMainActivity kuCoinMainActivity, RadioGroupPlus radioGroupPlus) {
        if (kuCoinMainActivity.f27957D) {
            radioGroupPlus.setVisibility(8);
            radioGroupPlus.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: t2 */
    public static final void m32370t2(KuCoinMainActivity kuCoinMainActivity, RadioGroupPlus radioGroupPlus, boolean z11) {
        if (kuCoinMainActivity.f27957D) {
            return;
        }
        float height = radioGroupPlus.getHeight();
        if (height <= 0.0f) {
            radioGroupPlus.setTranslationY(0.0f);
            return;
        }
        if (!z11 && radioGroupPlus.getTranslationY() == 0.0f) {
            radioGroupPlus.setTranslationY(height);
        }
        radioGroupPlus.animate().translationY(0.0f).setDuration(250L).start();
    }

    /* JADX INFO: renamed from: A1 */
    public final String m32377A1(int i11) {
        if (i11 == R$id.main_home) {
            return "main";
        }
        if (i11 == R$id.main_quotes) {
            return "market";
        }
        if (i11 == R$id.main_trade) {
            return "trade";
        }
        if (i11 == R$id.main_kumex) {
            return "contract";
        }
        return i11 == R$id.main_assets ? "assets" : "";
    }

    /* JADX INFO: renamed from: C1 */
    public final void m32379C1(final FragmentManager fragmentManager) {
        if (UserInfo.a.n()) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KuCoinMainActivity$getUserRestrictedState$1(fragmentManager, this, null), 3, null);
        } else if (fragmentManager != null) {
            IUserService.a.get().F(LifecycleOwnerKt.getLifecycleScope(this), new Function1() { // from class: com.kubi.kucoin.main.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuCoinMainActivity.m32302E1(this.f28006b, fragmentManager, (UserRestrictedStateBean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final void m32380F1(Intent intent) {
        String strM56280w = intent != null ? RouteExKt.m56280w(intent, "jumpUrl") : null;
        if (strM56280w == null || TextUtils.isEmpty(strM56280w)) {
            return;
        }
        Router.f46192a.m56184f(strM56280w).m4048k();
    }

    /* JADX INFO: renamed from: L1 */
    public final int m32383L1(int i11) {
        if (i11 == R$id.main_quotes) {
            return 1;
        }
        if (i11 == R$id.main_trade) {
            return 2;
        }
        if (i11 == R$id.main_kumex) {
            return 3;
        }
        return i11 == R$id.main_assets ? 4 : 0;
    }

    /* JADX INFO: renamed from: N1 */
    public final void m32384N1() {
        C38058b c38058b = C38058b.f85672a;
        if (c38058b.m85935g() != BizControlConfigState.SUCCESS && c38058b.m85937i()) {
            BizControlService.f15438a.m14998e(true);
        }
        if ("EVENT_BIZ_CONTROL_LOAD".length() == 0 || "page_load_end".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(EVENT_BIZ_CONTROL_LOAD) or pointName(page_load_end) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42383d("isABNew", c38058b.m85937i());
            C45290a.f101823a.m100101b("EVENT_BIZ_CONTROL_LOAD", "page_load_end", "", eventParametersBuilderAcquire.m42380a());
        }
        m32400o2();
    }

    /* JADX INFO: renamed from: O1 */
    public final void m32385O1(Bundle bundle) {
        int iM66651k;
        RadioGroupPlus radioGroupPlus;
        RadioButton radioButton;
        RadioButton radioButton2;
        RadioButton radioButton3;
        RadioGroupPlus radioGroupPlus2;
        RadioGroupPlus radioGroupPlus3;
        RadioButton radioButton4;
        RadioButton radioButton5;
        RadioButton radioButton6;
        RadioButton radioButton7;
        HomeRadioButton homeRadioButton;
        boolean zM33187l = DayNightThemeManager.f28592a.m33187l();
        C44401a c44401aM32411w1 = m32411w1();
        if (c44401aM32411w1 != null && (homeRadioButton = c44401aM32411w1.f98080i) != null) {
            homeRadioButton.m32491d("icon_home_checked.json", R$drawable.icon_menu_home, R$drawable.icon_menu_home_top, "home_to_top.json", "top_to_home.json", zM33187l);
        }
        C44401a c44401aM32411w2 = m32411w1();
        if (c44401aM32411w2 != null && (radioButton7 = c44401aM32411w2.f98082k) != null) {
            C15731n.m33153b(radioButton7, "icon_market_checked.json", R$drawable.icon_menu_market, zM33187l);
        }
        C44401a c44401aM32411w3 = m32411w1();
        if (c44401aM32411w3 != null && (radioButton6 = c44401aM32411w3.f98083l) != null) {
            C15731n.m33153b(radioButton6, "icon_trade_checked.json", R$drawable.icon_menu_trade, zM33187l);
        }
        C44401a c44401aM32411w4 = m32411w1();
        if (c44401aM32411w4 != null && (radioButton5 = c44401aM32411w4.f98081j) != null) {
            C15731n.m33153b(radioButton5, "icon_future_checked.json", R$drawable.icon_menu_future, zM33187l);
        }
        C44401a c44401aM32411w5 = m32411w1();
        if (c44401aM32411w5 != null && (radioButton4 = c44401aM32411w5.f98079h) != null) {
            C15731n.m33153b(radioButton4, "icon_assets_checked.json", R$drawable.icon_menu_assets, zM33187l);
        }
        C44401a c44401aM32411w6 = m32411w1();
        if (c44401aM32411w6 != null && (radioGroupPlus3 = c44401aM32411w6.f98078g) != null) {
            radioGroupPlus3.setOnCheckedChangeListener(new C15419c());
        }
        if (bundle != null) {
            C44401a c44401aM32411w7 = m32411w1();
            if (c44401aM32411w7 != null && (radioGroupPlus2 = c44401aM32411w7.f98078g) != null) {
                radioGroupPlus2.m54743f(m32399n2(RouteExKt.m56226Q(bundle, "save_position", 0)));
            }
        } else {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            Integer numM56227R = RouteExKt.m56227R(intent, ViewProps.POSITION);
            if (numM56227R != null) {
                iM66651k = numM56227R.intValue();
            } else {
                Intent intent2 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                Integer numM56227R2 = RouteExKt.m56227R(intent2, "page");
                iM66651k = C27039d.m66651k(numM56227R2 != null ? Integer.valueOf(m32399n2(numM56227R2.intValue())) : null, R$id.main_home);
            }
            m32391X1(getIntent());
            m32406t1(iM66651k);
            C44401a c44401aM32411w8 = m32411w1();
            if (c44401aM32411w8 != null && (radioGroupPlus = c44401aM32411w8.f98078g) != null) {
                radioGroupPlus.m54743f(iM66651k);
            }
        }
        C44401a c44401aM32411w9 = m32411w1();
        if (c44401aM32411w9 != null && (radioButton3 = c44401aM32411w9.f98083l) != null) {
            C27046k.m66711z(radioButton3, 0L, new Function0() { // from class: com.kubi.kucoin.main.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMainActivity.m32317P1(this.f28008b);
                }
            }, 1, null);
        }
        C44401a c44401aM32411w10 = m32411w1();
        if (c44401aM32411w10 != null && (radioButton2 = c44401aM32411w10.f98081j) != null) {
            C27046k.m66711z(radioButton2, 0L, new Function0() { // from class: com.kubi.kucoin.main.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMainActivity.m32319Q1(this.f28009b);
                }
            }, 1, null);
        }
        C44401a c44401aM32411w11 = m32411w1();
        if (c44401aM32411w11 == null || (radioButton = c44401aM32411w11.f98079h) == null) {
            return;
        }
        C27046k.m66711z(radioButton, 0L, new Function0() { // from class: com.kubi.kucoin.main.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinMainActivity.m32321R1(this.f28010b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: S1 */
    public final void m32386S1() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:showRedPoint".length();
        }
        C12572a.m23692a(this, false, new KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1("com.kubi.home.event.HomeEvent:showRedPoint", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.notice.event.NoticeEvent:update_notice_count".length();
        }
        C12572a.m23692a(this, false, new KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$2("com.kubi.notice.event.NoticeEvent:update_notice_count", null, this));
    }

    /* JADX INFO: renamed from: U1 */
    public final boolean m32388U1(@IdRes int i11) {
        return this.f27973z == i11;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.kucoin_activity_main;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: e0 */
    public void mo32394e0() {
        C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.kucoin.main.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinMainActivity.m32358m2();
            }
        });
    }

    @Override // com.kubi.sdk.BaseActivity
    public int getBundleSizeLimit() {
        return TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_LOSSLESS;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m32395k1() {
        IAutoCleanService.f19482a.get().mo20402b();
        if (C12573b.f21598a.m23696a()) {
            "event_refresh_top_msg".length();
        }
        C12572a.m23692a(this, false, new KuCoinMainActivity$bindAutoCleanEvent$$inlined$bindFlowEvent$1("event_refresh_top_msg", null, this));
    }

    /* JADX INFO: renamed from: l1 */
    public final void m32396l1() {
        if (C12573b.f21598a.m23696a()) {
            "show_deposit_disable_dialog".length();
        }
        C12572a.m23692a(this, true, new C15418x43f72176("show_deposit_disable_dialog", null));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m32397m1(int i11) {
        if (i11 == R$id.main_home) {
            m32416y2("B1homePage", "homeBottomTab");
            return;
        }
        if (i11 == R$id.main_quotes) {
            m32416y2("B5markets", "marketBottomTab");
            return;
        }
        if (i11 == R$id.main_trade) {
            m32416y2("B5trading", "tradingBottomTab");
        } else if (i11 == R$id.main_kumex) {
            m32416y2("B6futuresTrade", "futuresBottomTab");
        } else if (i11 == R$id.main_assets) {
            m32416y2("B1overview", "assetsBottomTab");
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final int m32399n2(int i11) {
        if (i11 == 0) {
            return R$id.main_home;
        }
        if (i11 == 1) {
            return R$id.main_quotes;
        }
        if (i11 == 2) {
            return R$id.main_trade;
        }
        if (i11 != 3) {
            return i11 != 4 ? R$id.main_home : R$id.main_assets;
        }
        return R$id.main_kumex;
    }

    /* JADX INFO: renamed from: o2 */
    public final void m32400o2() {
        if (UserInfo.a.n()) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new KuCoinMainActivity$queryKycStatus$1(this, null));
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        C44401a c44401aM32411w1;
        RadioButton radioButton;
        ImageView imageView;
        RadioButton radioButton2;
        HomeRadioButton homeRadioButton;
        View view;
        StartupTrace.f48194a.m58450j("duration7");
        C43101f c43101f = C43101f.f95302a;
        c43101f.m94715i();
        KuCoinMainViewModel kuCoinMainViewModel = null;
        if (m32415y1()) {
            super.onCreate(null);
        } else {
            super.onCreate(savedInstanceState);
        }
        c43101f.m94709b("main_activity_xml_finish");
        C44128b.m97266j("LiteTag", "KcCoinMainActivity: onCreate, " + hashCode());
        IMineService.f35025a.get().mo41628k(this);
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment : fragments) {
            Intrinsics.checkNotNull(fragment);
            C27032f.m66621l(this, fragment);
        }
        m32384N1();
        KuCoinMainViewModel kuCoinMainViewModel2 = (KuCoinMainViewModel) new ViewModelProvider(this).get(KuCoinMainViewModel.class);
        KuCoinMainViewModel.m32452u(kuCoinMainViewModel2, 0, null, 2, null);
        this.f27972y = kuCoinMainViewModel2;
        m32398n1();
        C44401a c44401aM32411w2 = m32411w1();
        if (c44401aM32411w2 != null && (view = c44401aM32411w2.f98073b) != null) {
            EdgeToEdgeCompat.f48106a.m58268f(this, view);
            ViewExtKt.m66577h(view);
        }
        MainStatusBarFixUtil mainStatusBarFixUtil = new MainStatusBarFixUtil(this, new Function0() { // from class: com.kubi.kucoin.main.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(KuCoinMainActivity.m32354k2());
            }
        });
        this.f27956C = mainStatusBarFixUtil;
        mainStatusBarFixUtil.m32429e();
        m32402p2();
        Router router = Router.f46192a;
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        Object objM56186h = router.m56186h(InterfaceC40434b.class, siteInfoManager.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40434b) objM56186h).m89079b(m32411w1());
        } else if (m32413x1() == null && (c44401aM32411w1 = m32411w1()) != null && (radioButton = c44401aM32411w1.f98081j) != null) {
            ViewExtKt.m66577h(radioButton);
        }
        m32385O1(savedInstanceState);
        UserInfo userInfo = UserInfo.a;
        Observable observableObserveOn = userInfo.e().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.main.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMainActivity.m32330Y1(this.f28052b, (Boolean) obj);
            }
        };
        m56593T(observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.kucoin.main.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinMainActivity.m32332Z1(function1, obj);
            }
        }));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C154228(null));
        if (!com.kubi.user.config.a.b() && userInfo.n()) {
            m32300D1(this, null, 1, null);
        }
        Observable<Boolean> observableObserveOn2 = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.main.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KuCoinMainActivity.m32334a2((Boolean) obj));
            }
        };
        Observable<Boolean> observableFilter = observableObserveOn2.filter(new Predicate() { // from class: com.kubi.kucoin.main.a0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return KuCoinMainActivity.m32336b2(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.kucoin.main.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMainActivity.m32338c2((Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.kucoin.main.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinMainActivity.m32340d2(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.kucoin.main.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMainActivity.m32342e2((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.main.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinMainActivity.m32344f2(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        DataInitManager.f21486a.m23670k();
        IAssetsCenterService.f16464a.get().mo15355u();
        Object objM56186h2 = router.m56186h(InterfaceC40434b.class, siteInfoManager.m58109c());
        if (objM56186h2 != null) {
            ((InterfaceC40434b) objM56186h2).m89078a(new Function0() { // from class: com.kubi.kucoin.main.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMainActivity.m32346g2(this.f27980b);
                }
            });
        } else {
            IMarketMonitorService.f34270a.get().mo40721a(this.f46505q);
        }
        C44401a c44401aM32411w3 = m32411w1();
        if (c44401aM32411w3 != null && c44401aM32411w3.f98078g != null) {
            C44401a c44401aM32411w4 = m32411w1();
            ViewParent parent = (c44401aM32411w4 == null || (homeRadioButton = c44401aM32411w4.f98080i) == null) ? null : homeRadioButton.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            C44401a c44401aM32411w5 = m32411w1();
            ViewParent parent2 = (c44401aM32411w5 == null || (radioButton2 = c44401aM32411w5.f98083l) == null) ? null : radioButton2.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup != null && viewGroup2 != null) {
                this.f27965L = (QBadgeView) C46932c.m103404a(new QBadgeView(viewGroup.getContext())).mo55429f(viewGroup);
                this.f27966M = (QBadgeView) C46932c.m103404a(new QBadgeView(viewGroup2.getContext())).mo55429f(viewGroup2);
                m32386S1();
            }
        }
        LocateManager.f28544a.m33104g(this);
        KuCoinMainViewModel kuCoinMainViewModel3 = this.f27972y;
        if (kuCoinMainViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        } else {
            kuCoinMainViewModel = kuCoinMainViewModel3;
        }
        kuCoinMainViewModel.m32458s().observe(this, new Observer() { // from class: com.kubi.kucoin.main.u
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                KuCoinMainActivity.m32348h2(this.f28032b, (MaintenanceEntity) obj);
            }
        });
        ISpotService.f49646a.get().mo60011x(this, new Function1() { // from class: com.kubi.kucoin.main.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinMainActivity.m32350i2(this.f28033b, (String) obj);
            }
        });
        C44401a c44401aM32411w6 = m32411w1();
        if (c44401aM32411w6 != null && (imageView = c44401aM32411w6.f98076e) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.kucoin.main.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMainActivity.m32352j2(this.f28034b);
                }
            }, 1, null);
        }
        m32390W1();
        C5264d.registerAppStatusChangedListener(this.f27968O);
        m32387T1();
        m32380F1(getIntent());
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.base.p113ui.OldBaseActivity, com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        try {
            Result.Companion companion = Result.INSTANCE;
            MainStatusBarFixUtil mainStatusBarFixUtil = this.f27956C;
            if (mainStatusBarFixUtil != null) {
                mainStatusBarFixUtil.m32427c();
            }
            this.f27956C = null;
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        super.onDestroy();
        unregisterReceiver(this.f27954A);
        C5264d.unregisterAppStatusChangedListener(this.f27968O);
        LocateManager.f28544a.m33105h();
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.kucoin.main.a
            @Override // java.lang.Runnable
            public final void run() {
                KuCoinMainActivity.m32356l2();
            }
        });
        C42565a.f94256a.m93332a(false);
        BeepHelperV2.f21336a.m23478g();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        RouteExKt.m56259l0(outState, "save_position", m32383L1(this.f27973z));
    }

    /* JADX INFO: renamed from: p1 */
    public final void m32401p1() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kucoin.main.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinMainActivity.m32364q1();
            }
        });
    }

    /* JADX INFO: renamed from: p2 */
    public final void m32402p2() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        NetworkChangeReceiver networkChangeReceiver = new NetworkChangeReceiver();
        this.f27954A = networkChangeReceiver;
        registerReceiver(networkChangeReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: q2 */
    public final Integer m32403q2(Intent intent) {
        Integer numM56227R;
        Integer numM56227R2;
        if (intent != null && (numM56227R2 = RouteExKt.m56227R(intent, ViewProps.POSITION)) != null) {
            return numM56227R2;
        }
        if (intent == null || (numM56227R = RouteExKt.m56227R(intent, "page")) == null) {
            return null;
        }
        return Integer.valueOf(m32399n2(numM56227R.intValue()));
    }

    /* JADX INFO: renamed from: r1 */
    public final Bundle m32404r1() {
        Bundle bundle = this.f27958E;
        this.f27958E = null;
        return bundle;
    }

    /* JADX INFO: renamed from: s1 */
    public final Fragment m32405s1() {
        int i11 = this.f27973z;
        if (i11 == R$id.main_home) {
            return m32409v1();
        }
        if (i11 == R$id.main_quotes) {
            return this.f27961H;
        }
        if (i11 == R$id.main_trade) {
            return this.f27962I;
        }
        if (i11 == R$id.main_kumex) {
            return m32413x1();
        }
        if (i11 == R$id.main_assets) {
            return this.f27964K;
        }
        return null;
    }

    /* JADX INFO: renamed from: v1 */
    public final BaseFragment m32409v1() {
        return (BaseFragment) this.f27960G.getValue();
    }

    /* JADX INFO: renamed from: w1 */
    public final C44401a m32411w1() {
        return (C44401a) this.f27970w.getValue(this, f27952Q[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final BaseFragment m32413x1() {
        return (BaseFragment) this.f27963J.getValue();
    }

    /* JADX INFO: renamed from: y1 */
    public final boolean m32415y1() {
        return ((Boolean) this.f27967N.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: y2 */
    public final void m32416y2(String str, String str2) {
        C43852m.m96590b(str, str2, "1", TuplesKt.m90091to("norm_version", "1"));
    }

    /* JADX INFO: renamed from: z2 */
    public final boolean m32417z2() {
        return m32388U1(R$id.main_trade) || m32388U1(R$id.main_kumex);
    }

    /* JADX INFO: renamed from: I1 */
    public static final Unit m32307I1(MaintenanceEntity maintenanceEntity) {
        String link = maintenanceEntity.getLink();
        if (link != null) {
            Router.f46192a.m56184f(link).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J1 */
    public static final Unit m32309J1(MaintenanceEntity maintenanceEntity) {
        String link = maintenanceEntity.getLink();
        if (link != null) {
            Router.f46192a.m56184f(link).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K1 */
    public static final BaseFragment m32311K1() {
        if (C45557b.m100614e()) {
            return IHomeRNService.f26874a.get().mo31237b();
        }
        return IHomeService.f25434a.get().mo28950f();
    }

    /* JADX INFO: renamed from: Y1 */
    public static final Unit m32330Y1(KuCoinMainActivity kuCoinMainActivity, Boolean bool) {
        if (bool.booleanValue()) {
            KuCoinMainViewModel kuCoinMainViewModel = kuCoinMainActivity.f27972y;
            if (kuCoinMainViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                kuCoinMainViewModel = null;
            }
            kuCoinMainViewModel.m32456B(true);
            INoticeService iNoticeService = INoticeService.f36364a.get();
            Context mContext = kuCoinMainActivity.f46505q;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            iNoticeService.mo43136e(mContext, true);
            C12572a.m23695d("com.kubi.user.event.UserEvent:onConfigChange", null, 0L, 6, null);
        }
        C12572a.m23695d("com.kubi.user.event.UserEvent:onConfigChangeV2", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z1 */
    public static final void m32332Z1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d2 */
    public static final void m32340d2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e2 */
    public static final Unit m32342e2(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f2 */
    public static final void m32344f2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h2 */
    public static final void m32348h2(KuCoinMainActivity kuCoinMainActivity, MaintenanceEntity maintenanceEntity) {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        Intrinsics.checkNotNull(maintenanceEntity);
        kuCoinMainActivity.m32382H1(maintenanceEntity);
        C44401a c44401aM32411w1 = kuCoinMainActivity.m32411w1();
        if (c44401aM32411w1 != null && (linearLayoutCompat = c44401aM32411w1.f98077f) != null && linearLayoutCompat.getVisibility() == 0) {
            IAutoCleanService iAutoCleanService = IAutoCleanService.f19482a.get();
            C44401a c44401aM32411w2 = kuCoinMainActivity.m32411w1();
            if (c44401aM32411w2 != null) {
                linearLayoutCompat2 = c44401aM32411w2.f98084m;
            } else {
                linearLayoutCompat2 = null;
            }
            iAutoCleanService.mo20404d(linearLayoutCompat2);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public static final Unit m32352j2(KuCoinMainActivity kuCoinMainActivity) {
        LinearLayoutCompat linearLayoutCompat;
        C44401a c44401aM32411w1 = kuCoinMainActivity.m32411w1();
        if (c44401aM32411w1 != null && (linearLayoutCompat = c44401aM32411w1.f98077f) != null) {
            linearLayoutCompat.setVisibility(8);
        }
        kuCoinMainActivity.m32412w2("maintenance");
        kuCoinMainActivity.m32381G1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l2 */
    public static final void m32356l2() {
        if (C27012a.m66486i().m66492f() == 0) {
            C37784o.f85096a.m85222f();
            DefaultWebSocketClient.INSTANCE.get().m43109c();
        }
    }

    /* JADX INFO: renamed from: q1 */
    public static final Unit m32364q1() {
        FragmentActivity fragmentActivity;
        Activity activityM66494h = C27012a.m66486i().m66494h();
        if (activityM66494h instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) activityM66494h;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null && (fragmentActivity instanceof KuCoinMainActivity) && ((KuCoinMainActivity) fragmentActivity).m32417z2()) {
            ToastCompat.m66437C(R$string.app_is_background_tips);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B1 */
    public final MainTabPage m32378B1() {
        Integer numValueOf;
        RadioGroupPlus radioGroupPlus;
        C44401a c44401aM32411w1 = m32411w1();
        if (c44401aM32411w1 != null && (radioGroupPlus = c44401aM32411w1.f98078g) != null) {
            numValueOf = Integer.valueOf(radioGroupPlus.getF44016b());
        } else {
            numValueOf = null;
        }
        int i11 = R$id.main_home;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            return MainTabPage.HOME;
        }
        int i12 = R$id.main_quotes;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            return MainTabPage.MARKET;
        }
        int i13 = R$id.main_trade;
        if (numValueOf != null && numValueOf.intValue() == i13) {
            return MainTabPage.TRADE;
        }
        int i14 = R$id.main_kumex;
        if (numValueOf != null && numValueOf.intValue() == i14) {
            return MainTabPage.FUTURES;
        }
        int i15 = R$id.main_assets;
        if (numValueOf != null && numValueOf.intValue() == i15) {
            return MainTabPage.ASSETS;
        }
        return MainTabPage.HOME;
    }

    /* JADX INFO: renamed from: G1 */
    public final void m32381G1() {
        LinearLayoutCompat linearLayoutCompat;
        C44401a c44401aM32411w1 = m32411w1();
        if (c44401aM32411w1 != null && (linearLayoutCompat = c44401aM32411w1.f98077f) != null) {
            BaseFragment baseFragmentM32413x1 = m32413x1();
            if (baseFragmentM32413x1 != null) {
                IKuMexService.f28731a.get().mo33281i(baseFragmentM32413x1, C27046k.m66704s(linearLayoutCompat));
            }
            ITradeFacadeService.f51878a.get().mo63591i(this.f27962I, C27046k.m66704s(linearLayoutCompat));
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m32382H1(final MaintenanceEntity maintenanceEntity) {
        ImageView imageView;
        TextView textView;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        int i11;
        C44401a c44401aM32411w1 = m32411w1();
        if (c44401aM32411w1 != null && (linearLayoutCompat2 = c44401aM32411w1.f98077f) != null) {
            KuCoinMainViewModel kuCoinMainViewModel = this.f27972y;
            if (kuCoinMainViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                kuCoinMainViewModel = null;
            }
            if (Intrinsics.areEqual(kuCoinMainViewModel.m32460y().getValue(), Boolean.TRUE)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayoutCompat2.setVisibility(i11);
        }
        C44401a c44401aM32411w2 = m32411w1();
        if (c44401aM32411w2 != null && (linearLayoutCompat = c44401aM32411w2.f98077f) != null) {
            linearLayoutCompat.bringToFront();
        }
        C44401a c44401aM32411w3 = m32411w1();
        if (c44401aM32411w3 != null && (textView = c44401aM32411w3.f98085n) != null) {
            textView.requestFocus();
            textView.setText(maintenanceEntity.getTitle());
            C27046k.m66679B(textView, new Function0() { // from class: com.kubi.kucoin.main.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMainActivity.m32307I1(maintenanceEntity);
                }
            });
        }
        C44401a c44401aM32411w4 = m32411w1();
        if (c44401aM32411w4 != null && (imageView = c44401aM32411w4.f98075d) != null) {
            C27046k.m66679B(imageView, new Function0() { // from class: com.kubi.kucoin.main.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMainActivity.m32309J1(maintenanceEntity);
                }
            });
        }
        m32381G1();
    }

    /* JADX INFO: renamed from: T1 */
    public final void m32387T1() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KuCoinMainActivity$initUpdatePasswordConfig$1(null), 3, null);
        IUserService.a.get().l0();
    }

    /* JADX INFO: renamed from: W1 */
    public final void m32390W1() {
        m32396l1();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_on_top".length();
        }
        C12572a.m23692a(this, true, new KuCoinMainActivity$listenEvent$$inlined$bindFlowEvent$1("com.kubi.home.feed.QuoteEvent:home_feed_on_top", null, this));
    }

    @Override // my.InterfaceC42667f
    /* JADX INFO: renamed from: c */
    public void mo32392c(boolean z11, boolean z12) {
        final RadioGroupPlus radioGroupPlus;
        int measuredHeight;
        C44401a c44401aM32411w1 = m32411w1();
        if (c44401aM32411w1 != null && (radioGroupPlus = c44401aM32411w1.f98078g) != null) {
            radioGroupPlus.animate().cancel();
            final boolean z13 = true;
            if (z11) {
                this.f27957D = true;
                if (radioGroupPlus.getVisibility() != 0) {
                    radioGroupPlus.setTranslationY(0.0f);
                    return;
                }
                if (radioGroupPlus.getHeight() > 0) {
                    measuredHeight = radioGroupPlus.getHeight();
                } else {
                    measuredHeight = radioGroupPlus.getMeasuredHeight();
                }
                float f11 = measuredHeight;
                if (z12 && f11 > 0.0f) {
                    radioGroupPlus.animate().translationY(f11).setDuration(250L).withEndAction(new Runnable() { // from class: com.kubi.kucoin.main.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            KuCoinMainActivity.m32368s2(this.f28027b, radioGroupPlus);
                        }
                    }).start();
                    return;
                } else {
                    radioGroupPlus.setVisibility(8);
                    radioGroupPlus.setTranslationY(0.0f);
                    return;
                }
            }
            if (!this.f27957D && radioGroupPlus.getVisibility() == 0 && radioGroupPlus.getTranslationY() == 0.0f) {
                return;
            }
            this.f27957D = false;
            if (radioGroupPlus.getVisibility() != 0) {
                z13 = false;
            }
            radioGroupPlus.setVisibility(0);
            if (z12) {
                radioGroupPlus.post(new Runnable() { // from class: com.kubi.kucoin.main.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        KuCoinMainActivity.m32370t2(this.f28029b, radioGroupPlus, z13);
                    }
                });
            } else {
                radioGroupPlus.setTranslationY(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m32398n1() {
        final Drawable drawable = getResources().getDrawable(R$drawable.selector_darkoverlay_click);
        if (drawable instanceof RippleDrawable) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.kucoin.main.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinMainActivity.m32361o1(drawable, this);
                }
            });
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseActivity, com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (!dispatchBackPress(supportFragmentManager)) {
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        String action;
        C44401a c44401aM32411w1;
        RadioGroupPlus radioGroupPlus;
        Bundle bundleM32404r1;
        super.onNewIntent(intent);
        m32380F1(intent);
        C44128b.m97266j("KuCoinMainActivity", "[onNewIntent]");
        BaseFragment baseFragmentM32413x1 = null;
        Object objM20457a = null;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (!Intrinsics.areEqual(action, "action_widget_desk_home")) {
            C12572a.m23695d("com.kubi.home.event.HomeEvent:switchDrawer", Boolean.FALSE, 0L, 4, null);
            if (intent != null) {
                Integer numM56227R = RouteExKt.m56227R(intent, ViewProps.POSITION);
                if (numM56227R == null) {
                    Integer numM56227R2 = RouteExKt.m56227R(intent, "page");
                    if (numM56227R2 != null) {
                        numM56227R = Integer.valueOf(m32399n2(numM56227R2.intValue()));
                    } else {
                        numM56227R = null;
                    }
                }
                if (numM56227R != null && !RouteExKt.m56222M(intent, "data", false)) {
                    C44128b.m97266j("KuCoinMainActivity", "[onNewIntent] do nothing, pos:" + numM56227R + ",  " + hashCode());
                    setIntent(intent);
                    m32391X1(intent);
                    if (numM56227R.intValue() == R$id.main_trade) {
                        if (numM56227R.intValue() == this.f27973z && (bundleM32404r1 = m32404r1()) != null) {
                            ITradeFacadeService.f51878a.get().mo63588d(this.f27962I, bundleM32404r1);
                        }
                    }
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        if (numM56227R.intValue() == R$id.main_kumex) {
                            baseFragmentM32413x1 = m32413x1();
                        } else if (numM56227R.intValue() == R$id.main_quotes) {
                            baseFragmentM32413x1 = this.f27961H;
                        } else if (numM56227R.intValue() == R$id.main_assets) {
                            baseFragmentM32413x1 = this.f27964K;
                        }
                        if (baseFragmentM32413x1 != null) {
                            baseFragmentM32413x1.performArguments(extras);
                        }
                    }
                    if (m32413x1() == null) {
                        if (numM56227R.intValue() == R$id.main_kumex) {
                            return;
                        }
                    }
                    if (numM56227R.intValue() != this.f27973z && (c44401aM32411w1 = m32411w1()) != null && (radioGroupPlus = c44401aM32411w1.f98078g) != null) {
                        radioGroupPlus.m54743f(numM56227R.intValue());
                        return;
                    }
                    return;
                }
                try {
                    RemoteConfig remoteConfig = RemoteConfig.f19636a;
                    Type type = new C15420d().getType();
                    Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                    objM20457a = RemoteConfig.m20457a("home_restart_use_clear_task", type);
                } catch (Throwable th2) {
                    C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                }
                boolean zM66567e = C27025c.m66567e((Boolean) objM20457a, true);
                if (!zM66567e && !C27077o.m66821a()) {
                    startActivity(intent);
                    finish();
                    C44128b.m97266j("KuCoinMainActivity", "[onNewIntent] start finish, " + hashCode());
                } else {
                    intent.setFlags(268468224);
                    startActivity(intent);
                    C44128b.m97266j("KuCoinMainActivity", "[onNewIntent] useClearTask:" + zM66567e + ", isHarmonyOS, " + hashCode());
                }
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        IAdvertService.f15070a.get().mo14770o(this.f27969v);
        C42674m.f94426a.m93473j(this);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        C37890n.m85597J(C37890n.f85269a, 0L, false, 3, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Boolean boolM56220K;
        super.onResume();
        IAdvertService.f15070a.get().mo14768m(this.f27969v);
        m32414x2();
        MainStatusBarFixUtil mainStatusBarFixUtil = this.f27956C;
        if (mainStatusBarFixUtil != null) {
            mainStatusBarFixUtil.m32429e();
        }
        C44128b.m97266j("LiteTag", "KcCoinMainActivity: onResume , " + hashCode());
        if (IWalletService.f54542a.get().mo66946f(this)) {
            return;
        }
        INoticeService.f36364a.get().mo43136e(this, true);
        C12572a.m23695d("com.kubi.home.event.HomeEvent:updateAvatar", null, 0L, 6, null);
        Intent intent = getIntent();
        if (intent != null) {
            boolM56220K = RouteExKt.m56220K(intent, "toLogin");
        } else {
            boolM56220K = null;
        }
        if (C27025c.m66566d(boolM56220K)) {
            InterfaceC37764p.a.m85181b(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
            Intent intent2 = getIntent();
            if (intent2 != null) {
                intent2.putExtra("toLogin", false);
            }
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C154231(null), 3, null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        int iM58271i;
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            MainStatusBarFixUtil mainStatusBarFixUtil = this.f27956C;
            if (mainStatusBarFixUtil != null) {
                mainStatusBarFixUtil.m32429e();
            }
            try {
                EdgeToEdgeCompat edgeToEdgeCompat = EdgeToEdgeCompat.f48106a;
                if (edgeToEdgeCompat.m58275m(this)) {
                    iM58271i = edgeToEdgeCompat.m58271i();
                } else {
                    iM58271i = 0;
                }
                f27953R = iM58271i;
            } catch (Resources.NotFoundException e11) {
                C44128b.m97264h(e11);
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m32406t1(int i11) {
        BaseFragment baseFragmentM32413x1;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (i11 == R$id.main_kumex) {
                baseFragmentM32413x1 = m32413x1();
            } else if (i11 == R$id.main_quotes) {
                baseFragmentM32413x1 = this.f27961H;
            } else {
                baseFragmentM32413x1 = null;
            }
            if (baseFragmentM32413x1 != null) {
                baseFragmentM32413x1.performArguments(extras);
            }
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final void m32408u2(FragmentManager fragmentManager, UserRestrictedStateBean userRestrictedStateBean) {
        if (!isFinishing() && !isDestroyed()) {
            IUserService.l(IUserService.a.get(), userRestrictedStateBean, this, fragmentManager, (Function0) null, 8, (Object) null);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final void m32414x2() {
        String rnContainerId;
        boolean z11;
        InterfaceC42678q interfaceC42678qM32407u1 = m32407u1(m32405s1());
        C42674m c42674m = C42674m.f94426a;
        if (interfaceC42678qM32407u1 != null) {
            rnContainerId = interfaceC42678qM32407u1.getRnContainerId();
        } else {
            rnContainerId = null;
        }
        if (interfaceC42678qM32407u1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        c42674m.m93476o(this, rnContainerId, z11);
    }

    /* JADX INFO: renamed from: w2 */
    public final void m32412w2(String str) {
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.main.KuCoinMainActivity$b */
    /* JADX INFO: compiled from: KuCoinMainActivity.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DialogInterfaceOnClickListenerC15417b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b */
        public static final DialogInterfaceOnClickListenerC15417b f27975b = new DialogInterfaceOnClickListenerC15417b();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
        }
    }
}
