package com.kubi.market.monitor.lib.p100ui.floating.window;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import androidx.credentials.provider.CredentialEntry;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import aq.C4373b;
import aq.WindowStatus;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5287o0;
import com.blankj.utilcode.util.ThreadUtils;
import com.kubi.kucoin.feature.widget.ChooseSymbolFragment;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.kubi.market.monitor.lib.exeption.MarketMonitorException;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.market.monitor.lib.p100ui.floating.setting.NewFloatingWindowSettingActivity;
import com.kubi.market.monitor.lib.p100ui.floating.window.util.FloatWindowBuild;
import com.kubi.network.websocket.DefaultWebSocketClient;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.C27099x;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.math.BigDecimal;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.w0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FloatingActionManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u0007J\u001a\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u000eJ\u0006\u0010$\u001a\u00020\u001bJ\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0007J\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u0007J\u000e\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u0007J\u000e\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0007J\u000e\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u0007J\u000e\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u0007J\u000e\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u0007J\u000e\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u000eJ\u000e\u00109\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u000eJ\u000e\u0010:\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u000eJ\u000e\u0010;\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u000eJ\u000e\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u0005J\u000e\u0010>\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u0005J\u0006\u0010?\u001a\u00020\u001bJ\u0006\u0010@\u001a\u00020\u001bJ\u0018\u0010A\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u000eH\u0002J\u0010\u0010;\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020DH\u0002J3\u0010F\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020D2!\u0010G\u001a\u001d\u0012\u0013\u0012\u00110I¢\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u001b0HH\u0002J\u0006\u0010M\u001a\u00020\u000eJ\u0006\u0010N\u001a\u00020\u001bJ\u0006\u0010O\u001a\u00020\u0007J\b\u0010P\u001a\u00020\u0007H\u0002J\u000e\u0010Q\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020\u0007J\u0006\u0010S\u001a\u00020\u000eJ\u0006\u0010T\u001a\u00020\u000eJ\u0006\u0010U\u001a\u00020VJ\b\u0010W\u001a\u00020\u0007H\u0002J\u0006\u0010X\u001a\u00020YJ\u0006\u0010Z\u001a\u00020\u0007J$\u0010[\u001a\u00020\u00072\b\b\u0002\u0010\\\u001a\u00020\u000e2\b\b\u0002\u0010]\u001a\u00020\u000e2\b\b\u0002\u0010^\u001a\u00020\u000eJ\u0006\u0010_\u001a\u00020YJ\u0006\u0010`\u001a\u00020\u0007J\u0006\u0010a\u001a\u00020YJ\u0006\u0010b\u001a\u00020YJ\u0006\u0010c\u001a\u00020YJ\u0006\u0010d\u001a\u00020\u000eJ\u0006\u0010e\u001a\u00020\u0007J\u0006\u0010f\u001a\u00020\u0007J\u0006\u0010g\u001a\u00020\u0007J\u0006\u0010h\u001a\u00020\u0007J\u0006\u0010i\u001a\u00020\u0007J\u0006\u0010j\u001a\u00020\u0007J\u0006\u0010k\u001a\u00020\u0007J\u0006\u0010l\u001a\u00020\u0007J\u0006\u0010m\u001a\u00020\u0007J\u000e\u0010n\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u000eJ\u000e\u0010p\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u000eJ\u0006\u0010q\u001a\u00020\u000eJ\u0006\u0010r\u001a\u00020\u000eJ\u0006\u0010s\u001a\u00020\u000eJ\u0006\u0010t\u001a\u00020\u000eJ\u0006\u0010u\u001a\u00020\u0007J\u0006\u0010v\u001a\u00020\u0007J\u0006\u0010w\u001a\u00020\u000eJ\u0006\u0010x\u001a\u00020\u0007J\u0006\u0010y\u001a\u00020\u0005J\u0006\u0010z\u001a\u00020VJ\u0018\u0010{\u001a\u00020\u001b2\b\u0010|\u001a\u0004\u0018\u00010}2\u0006\u0010~\u001a\u00020}J:\u0010\u007f\u001a\u00020\u001b2\u0007\u0010\u0080\u0001\u001a\u00020\u00052\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u00052\u001e\b\u0002\u0010\u0082\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020\u001b\u0018\u00010H¢\u0006\u0003\b\u0084\u0001J\u0012\u0010\u008e\u0001\u001a\u00020\u001b2\u0007\u0010\u008f\u0001\u001a\u00020\u000eH\u0002J\u0012\u0010\u0090\u0001\u001a\u00020\u001b2\u0007\u0010\u0091\u0001\u001a\u00020\u000eH\u0002J\u0007\u0010\u0092\u0001\u001a\u00020\u001bJ\u0007\u0010\u0093\u0001\u001a\u00020\u001bJ\t\u0010\u0096\u0001\u001a\u00020\u000eH\u0002J\u001b\u0010\u0097\u0001\u001a\u00020\u001b2\u0007\u0010\u0098\u0001\u001a\u00020\u00052\t\b\u0002\u0010\u0099\u0001\u001a\u00020\u0005J'\u0010\u009a\u0001\u001a\u00020\u001b\"\u0005\b\u0000\u0010\u009b\u00012\u0007\u0010\u0098\u0001\u001a\u00020\u00052\b\u0010\u009c\u0001\u001a\u0003H\u009b\u0001¢\u0006\u0003\u0010\u009d\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000f\u0010\u0085\u0001\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0012\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020VX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u009e\u0001"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingActionManager;", "", "<init>", "()V", "bizType", "", "NOTOPEN_NEWVERSIONWATCHFLOATING", "", "SHOW_NEWVERSIONWATCHFLOATING", "DISMISS_NEWVERSIONWATCHFLOATING", "PRICESTATECHANGEUP", "PRICESTATECHANGEDOWN", "PRICESTATECHANGEUNCHANGED", "isUpGreen", "", "()Z", "setUpGreen", "(Z)V", "isInitMarketMonitor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "floatingPoint", "Landroid/graphics/Point;", "getFloatingPoint", "()Landroid/graphics/Point;", "floatingPoint$delegate", "Lkotlin/Lazy;", "updateUpGreenValue", "", "updataFloatingPoint", "x", "y", "initMarketMonitor", "initManager", "showFloatWindow", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "unregister", "languageChangeUpdateFloatWindow", "updateFloatingBgColorTheme", "newTheme", "setTextSizeMode", "newTextSizeMode", "upDatePageMode", "newPagingMode", "upPageTurningTime", "time", "updateFloatingDisplayMode", "newDisplayMode", "updataDownTime", "intervalTime", "setPageSize", "newPageSize", "updataAutoScrollTime", "newAutoScrollTime", "updataViewBgAlpha", "floatingWindowBgAlpha", "updataItemViewCurrencyNameShow", "newStatus", "updataItemViewPriceShow", "updataItemViewQuoteChangeShow", "updataSetingLayoutStatus", "addSymbol", "symbol", "removeSymbol", "sortListData", "gotoSettingPage", "addOrRemoveSymbol", "isAdd", "config", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;", "updataViewTheme", "floatingViewUpdata", "callBack", "Lkotlin/Function1;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame;", "Lkotlin/ParameterName;", "name", "floatingFrame", "actionBarShow", "gotoChooseSymbolFragment", "defaultDisplayHeight", "windowFrameLayoutHeight", "updatefloatingWindowParams", "viewWidth", "displayModeScroll", "windowShowing", "dataUpdateIntervalTime", "", "textSizeMode", "getNodataTextSize", "", "getFloatViewMaxWidth", "getFloatViewMinWidth", "isNodataStatus", "setingActionBarGone", "paginationIndicatorGone", "getSymbolTextSiz", "getItemViewSpacing", "getChangeRateTextSiz", "getPriceTextSiz", "getLastDealPriceTextSiz", "pagingModeIsHandle", "pageTurningTime", "getPageSize", "textColorText", "textColorText40", "textColorText50", "textColorText68", "dividerColor", "getZoomIcon", "getSetingIcon", "getPreviousPageIcon", "isRtl", "getNexpageIcon", "isFloatingShowIng", "isStayLeft", "isStayTop", "isAnimIng", "getBgThemeColor", "getBgThemeAlpha", "isExceedHalfAlpha", "getHalfAlpha", "setingDialogZoomInOrOutText", "scrollRecyclerJobTime", "setPriceStateChange", "oldInfo", "Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;", "newInfo", "floatingTrackClick", "locationIdStr", "blockIdStr", "paramsJson", "Lorg/json/JSONObject;", "Lkotlin/ExtensionFunctionType;", "ONBACKGROUNDJOB_TIME_MULTIPLE", "ONBACKGROUNDJOB_UPDATETIMETIME_MULTIPLE", "appStatusChangedListener", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "isBackgroundStates", "noDataStates", "imSocketCallBackTimeLock", "imSocketCallBackTime", "updateDataTimeLock", "registerAppStatusChangedListener", "register", "onBackgroundJobStartOrStop", "start", "updateImSocketCallBackTime", "backgroundDetectionAppActivity", "backgroundRun", "Ljava/lang/Runnable;", "isCanDismissFloating", "floatingLogd", "msg", "stubMsg", "pageUpdateDataLogd", ExifInterface.GPS_DIRECTION_TRUE, "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatingActionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionManager.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingActionManager\n+ 2 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt\n+ 3 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,909:1\n63#2,14:910\n78#2:928\n45#3,4:924\n*S KotlinDebug\n*F\n+ 1 FloatingActionManager.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingActionManager\n*L\n104#1:910,14\n104#1:928\n104#1:924,4\n*E\n"})
public final class FloatingActionManager {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static C5287o0.b f34544e;

    /* JADX INFO: renamed from: f */
    public static volatile boolean f34545f;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f34546g;

    /* JADX INFO: renamed from: i */
    public static volatile long f34548i;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FloatingActionManager f34540a = new FloatingActionManager();

    /* JADX INFO: renamed from: b */
    public static boolean f34541b = DayNightThemeManager.f28592a.m33189n();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final AtomicBoolean f34542c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f34543d = LazyKt.lazy(new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FloatingActionManager.m41295l0();
        }
    });

    /* JADX INFO: renamed from: h */
    @NotNull
    public static Object f34547h = new Object();

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Object f34549j = new Object();

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Runnable f34550k = new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.window.l
        @Override // java.lang.Runnable
        public final void run() {
            FloatingActionManager.m41277e0();
        }
    };

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.w0$a */
    /* JADX INFO: compiled from: FloatingActionManager.kt */
    /* JADX INFO: loaded from: classes27.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/market/monitor/lib/ui/floating/window/FloatingActionManager$registerAppStatusChangedListener$1", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onBackground", "", "activity", "Landroid/app/Activity;", "onForeground", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements C5287o0.b {
        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
            FloatingActionManager.f34545f = false;
            FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
            FloatingActionManager.m41292k0(floatingActionManager, "onForeground", null, 2, null);
            floatingActionManager.m41346R0(false);
            if (floatingActionManager.m41341N0()) {
                return;
            }
            FloatingActionManager.m41289j1(floatingActionManager, true, false, 2, null);
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
            FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
            FloatingActionManager.m41292k0(floatingActionManager, "onBackground", null, 2, null);
            FloatingActionManager.f34545f = true;
            FloatingActionManager.f34548i = System.currentTimeMillis();
            floatingActionManager.m41376o2();
            floatingActionManager.m41346R0(true);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final int m41370i1(boolean z11, boolean z12) {
        if (!z11) {
            FloatWindowBuild.f34525a.dismiss();
            if (!z12) {
                return 1;
            }
            m41351W0(false);
            return 1;
        }
        if (!FloatingWindowConfigManager.f34272a.m40729f()) {
            return 0;
        }
        FloatWindowBuild.f34525a.with().m41187a(new FloatingFrame(BaseApplication.INSTANCE.get(), null, 0, 6, null), new Function3() { // from class: com.kubi.market.monitor.lib.ui.floating.window.v
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FloatingActionManager.m41293k1(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (View) obj3);
            }
        }).m41188b(m41390v0()).m41189c(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41296l1((WindowStatus) obj);
            }
        }).m41190d();
        m41351W0(true);
        C4373b.m3909k("B1window", TIMPushProvider.f75062n, "1", new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41299m1((JSONObject) obj);
            }
        });
        return 1;
    }

    /* JADX INFO: renamed from: A1 */
    public static final Unit m41222A1(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41011j0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C1 */
    public static final WindowStatus m41225C1(int i11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, 0, 0, 0, 0, i11, false, false, false, false, 0, 0, 0, null, 8372223, null);
    }

    /* JADX INFO: renamed from: D1 */
    public static final Unit m41227D1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41229E1((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E1 */
    public static final Unit m41229E1(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41012k0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G1 */
    public static final WindowStatus m41232G1(int i11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, i11, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, null, 8388351, null);
    }

    /* JADX INFO: renamed from: H1 */
    public static final Unit m41234H1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41236I1((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I1 */
    public static final Unit m41236I1(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41014n0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L1 */
    public static final WindowStatus m41240L1(boolean z11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, 0, 0, 0, 0, 0, false, z11, false, false, 0, 0, 0, null, 8323071, null);
    }

    /* JADX INFO: renamed from: M1 */
    public static final Unit m41242M1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41244N1((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N1 */
    public static final Unit m41244N1(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41015o0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P1 */
    public static final WindowStatus m41247P1(boolean z11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, 0, 0, 0, 0, 0, false, false, false, z11, 0, 0, 0, null, 8126463, null);
    }

    /* JADX INFO: renamed from: Q1 */
    public static final Unit m41249Q1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41251R1((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R1 */
    public static final Unit m41251R1(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41015o0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S0 */
    public static final Unit m41253S0(boolean z11, FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        f34546g = view.m40997V();
        view.m40998W(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T1 */
    public static final WindowStatus m41255T1(boolean z11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, 0, 0, 0, 0, 0, false, false, z11, false, 0, 0, 0, null, 8257535, null);
    }

    /* JADX INFO: renamed from: U1 */
    public static final Unit m41257U1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41259V1((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V1 */
    public static final Unit m41259V1(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41015o0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y1 */
    public static final WindowStatus m41263Y1(boolean z11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, 0, 0, 0, 0, 0, z11, false, false, false, 0, 0, 0, null, 8355839, null);
    }

    /* JADX INFO: renamed from: Z1 */
    public static final Unit m41264Z1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41352W1(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a1 */
    public static final WindowStatus m41266a1(int i11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, 0, 0, i11, 0, 0, false, false, false, false, 0, 0, 0, null, 8384511, null);
    }

    /* JADX INFO: renamed from: a2 */
    public static final Unit m41267a2(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41017q0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m41269b0(String str, boolean z11, FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m40995Q(str, z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m41270b1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41272c1((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m41272c1(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41003b0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c2 */
    public static final WindowStatus m41273c2(int i11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, i11, null, 6291455, null);
    }

    /* JADX INFO: renamed from: d2 */
    public static final Unit m41275d2(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41278e2((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m41277e0() {
        if (f34545f) {
            FloatingActionManager floatingActionManager = f34540a;
            floatingActionManager.m41346R0(false);
            floatingActionManager.m41370i1(false, false);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static final Unit m41278e2(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41018r0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f1 */
    public static final WindowStatus m41280f1(int i11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, i11, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, null, 8388095, null);
    }

    /* JADX INFO: renamed from: g1 */
    public static final Unit m41282g1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41285h1((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g2 */
    public static final Unit m41283g2(FloatingFrame it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.m41018r0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h1 */
    public static final Unit m41285h1(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41005d0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i2 */
    public static final WindowStatus m41287i2(int i11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, i11, 0, 0, null, 7864319, null);
    }

    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ int m41289j1(FloatingActionManager floatingActionManager, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return floatingActionManager.m41370i1(z11, z12);
    }

    /* JADX INFO: renamed from: j2 */
    public static final Unit m41290j2(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41365f2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m41292k0(FloatingActionManager floatingActionManager, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        floatingActionManager.m41371j0(str, str2);
    }

    /* JADX INFO: renamed from: k1 */
    public static final Unit m41293k1(boolean z11, boolean z12, View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        if (childView instanceof FloatingFrame) {
            FloatingFrame floatingFrame = (FloatingFrame) childView;
            floatingFrame.m41016p0(z11, z12);
            if (z11) {
                floatingFrame.m41000Y();
            } else {
                floatingFrame.m40999X();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static final Point m41295l0() {
        return FloatingWindowConfigManager.f34272a.m40731h();
    }

    /* JADX INFO: renamed from: l1 */
    public static final Unit m41296l1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FloatingActionManager floatingActionManager = f34540a;
        floatingActionManager.m41365f2(it);
        floatingActionManager.m41352W1(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l2 */
    public static final WindowStatus m41297l2(int i11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, 0, 0, 0, i11, 0, false, false, false, false, 0, 0, 0, null, 8380415, null);
    }

    /* JADX INFO: renamed from: m1 */
    public static final Unit m41299m1(JSONObject trackExpose) throws JSONException {
        Intrinsics.checkNotNullParameter(trackExpose, "$this$trackExpose");
        trackExpose.put("clickPosition", CredentialEntry.TRUE_STRING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m2 */
    public static final Unit m41300m2(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41303n2((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m41302n0(FloatingActionManager floatingActionManager, String str, String str2, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "button";
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        floatingActionManager.m41373m0(str, str2, function1);
    }

    /* JADX INFO: renamed from: n2 */
    public static final Unit m41303n2(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41007g0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o1 */
    public static final Unit m41305o1(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41009h0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q2 */
    public static final Unit m41308q2(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41010i0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ int m41313u0(FloatingActionManager floatingActionManager, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            z13 = true;
        }
        return floatingActionManager.m41388t0(z11, z12, z13);
    }

    /* JADX INFO: renamed from: u1 */
    public static final WindowStatus m41314u1(int i11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, 0, i11, 0, 0, 0, false, false, false, false, 0, 0, 0, null, 8386559, null);
    }

    /* JADX INFO: renamed from: v1 */
    public static final Unit m41316v1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41318w1((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w1 */
    public static final Unit m41318w1(FloatingFrame view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m41011j0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y1 */
    public static final WindowStatus m41321y1(int i11, WindowStatus updataFloatingConfig) {
        Intrinsics.checkNotNullParameter(updataFloatingConfig, "$this$updataFloatingConfig");
        return WindowStatus.m3924b(updataFloatingConfig, null, null, false, false, false, 0, false, null, 0, 0, i11, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, null, 8387583, null);
    }

    /* JADX INFO: renamed from: z1 */
    public static final Unit m41323z1(WindowStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f34540a.m41375o0(it, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41222A1((FloatingFrame) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public final int m41325B0() {
        return FloatWindowBuild.f34525a.getPageSize();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m41326B1(final int i11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getAutoScrollTime() == i11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41225C1(i11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41227D1((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final int m41327C0(boolean z11) {
        return FloatWindowBuild.f34525a.getPreviousPageIcon(z11);
    }

    /* JADX INFO: renamed from: E0 */
    public final int m41329E0() {
        return FloatWindowBuild.f34525a.getSetingIcon();
    }

    /* JADX INFO: renamed from: F1 */
    public final void m41331F1(final int i11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getDataUpdateIntervalTime() == i11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41232G1(i11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41234H1((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final int m41332G0() {
        return FloatWindowBuild.f34525a.getZoomIcon();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m41333H0() {
        ChooseSymbolFragment.f27783Y.toChooseSymbolFragment(BaseApplication.INSTANCE.get());
    }

    /* JADX INFO: renamed from: I0 */
    public final void m41334I0() {
        NewFloatingWindowSettingActivity.INSTANCE.launch();
    }

    /* JADX INFO: renamed from: J0 */
    public final int m41335J0() {
        FloatingWindowConfigManager floatingWindowConfigManager = FloatingWindowConfigManager.f34272a;
        floatingWindowConfigManager.m40737n();
        if (floatingWindowConfigManager.m40729f()) {
            return m41289j1(this, false, false, 3, null);
        }
        return 0;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m41337K0() throws Throwable {
        Object objM103844constructorimpl;
        AtomicBoolean atomicBoolean = f34542c;
        if (atomicBoolean.get()) {
            C44128b.m97259c("FloatingWindow", "initMarketMonitor 已经初始化");
            return;
        }
        atomicBoolean.set(true);
        C44128b.m97259c("FloatingWindow", "initMarketMonitor 开始初始化");
        boolean zM3900b = C4373b.m3900b();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(f34540a.m41335J0()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (!zM3900b || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            if (!C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                C43846g.m96568c(new MarketMonitorException(thM103847exceptionOrNullimpl, "market_monitor_init_issue", false, null, 8, null), null, 2, null);
            }
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97259c("FloatingWindow", "悬浮窗初始化失败!!!");
        }
        Result.m103843boximpl(objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: K1 */
    public final void m41338K1(final boolean z11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getCurrencyNameShow() == z11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41240L1(z11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41242M1((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m41339L0() {
        long j11;
        if (f34546g && C5258a.m6124g().size() == 0 && f34545f) {
            return true;
        }
        synchronized (f34547h) {
            j11 = f34548i;
            Unit unit = Unit.INSTANCE;
        }
        return !DefaultWebSocketClient.INSTANCE.get().m43110d() && System.currentTimeMillis() - j11 > ((long) 3) * m41364f0() && C5258a.m6124g().size() == 0 && f34545f;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m41340M0() {
        return FloatWindowBuild.f34525a.isExceedHalfAlpha();
    }

    /* JADX INFO: renamed from: N0 */
    public final boolean m41341N0() {
        return FloatWindowBuild.f34525a.isFloatingWindowShowIng();
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m41342O0() {
        return FloatWindowBuild.f34525a.isStayLeft();
    }

    /* JADX INFO: renamed from: O1 */
    public final void m41343O1(final boolean z11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getPriceShow() == z11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41247P1(z11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41249Q1((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m41344P0() {
        return f34541b;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m41345Q0() {
        FloatWindowBuild.f34525a.dismissViewAndWindow();
        m41351W0(false);
        m41289j1(this, true, false, 2, null);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m41346R0(final boolean z11) {
        WindowStatus floatingWindowHelperConfig = FloatWindowBuild.f34525a.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig != null) {
            f34540a.m41375o0(floatingWindowHelperConfig, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingActionManager.m41253S0(z11, (FloatingFrame) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final void m41347S1(final boolean z11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getQuoteChangeShow() == z11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41255T1(z11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41257U1((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final int m41348T0() {
        return FloatWindowBuild.f34525a.pageTurningTime();
    }

    /* JADX INFO: renamed from: U0 */
    public final <T> void m41349U0(@NotNull String msg, T t11) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C44128b.m97259c("FloatingPageUpdateData", "****** ******* " + msg + " ****** " + C27099x.m66919i(t11, false, 2, null) + " ********");
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m41350V0() {
        return FloatWindowBuild.f34525a.pagingMode() == 8;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m41351W0(boolean z11) {
        if (z11 && f34544e == null) {
            a aVar = new a();
            f34544e = aVar;
            C5264d.registerAppStatusChangedListener(aVar);
        } else {
            if (z11) {
                return;
            }
            C5287o0.b bVar = f34544e;
            if (bVar != null) {
                C5264d.unregisterAppStatusChangedListener(bVar);
            }
            f34544e = null;
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final void m41352W1(WindowStatus windowStatus) {
        m41375o0(windowStatus, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41267a2((FloatingFrame) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public final void m41353X0(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m41358a0(symbol, false);
    }

    /* JADX INFO: renamed from: X1 */
    public final void m41354X1(final boolean z11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getActionBarShow() == z11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41263Y1(z11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41264Z1((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m41356Z() {
        return FloatWindowBuild.f34525a.actionBarShow();
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m41357Z0(final int i11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getPageSize() == i11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41266a1(i11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41270b1((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public final void m41359b2(int i11) {
        if (i11 <= 0) {
            i11 = 0;
        }
        final int i12 = (i11 * 255) / 100;
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getAlpha() == i12) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41273c2(i12, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41275d2((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final void m41360c0(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m41358a0(symbol, true);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m41361d0() {
        if (f34545f) {
            if (!m41339L0()) {
                m41371j0("backgroundDetectionAppActivity", "后台继续轮训");
                return;
            }
            m41371j0("backgroundDetectionAppActivity", "取消悬浮窗");
            ThreadUtils.m6114g(f34550k);
            C43840a.m96550d("后台轮询监销毁window socket链接状态=" + DefaultWebSocketClient.INSTANCE.get().m43110d() + "，ActivityList().size=" + C5258a.m6124g().size(), "MarketMonitor");
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m41362d1(@Nullable StateTradeItemBean stateTradeItemBean, @NotNull StateTradeItemBean newInfo) {
        int i11;
        Intrinsics.checkNotNullParameter(newInfo, "newInfo");
        BigDecimal bigDecimal = stateTradeItemBean != null ? new BigDecimal(String.valueOf(stateTradeItemBean.getLastDealPrice())) : new BigDecimal("0");
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(newInfo.getLastDealPrice()));
        if (bigDecimal2.compareTo(bigDecimal) > 0) {
            i11 = 1;
        } else {
            i11 = bigDecimal2.compareTo(bigDecimal) < 0 ? -1 : 0;
        }
        newInfo.setLastDealPriceStateChange(i11);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m41363e1(final int i11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getTextSizeMode() == i11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41280f1(i11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41282g1((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final long m41364f0() {
        return FloatWindowBuild.f34525a.dataUpdateIntervalTime() * 1000;
    }

    /* JADX INFO: renamed from: f2 */
    public final void m41365f2(WindowStatus windowStatus) {
        m41375o0(windowStatus, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41283g2((FloatingFrame) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final int m41366g0() {
        return FloatWindowBuild.f34525a.defaultDisplayHeight();
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m41367h0() {
        WindowStatus floatingWindowHelperConfig = FloatWindowBuild.f34525a.getFloatingWindowHelperConfig();
        return (floatingWindowHelperConfig != null ? floatingWindowHelperConfig.getDisplayMode() : 0) == 8;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m41368h2(final int i11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getTheme() == i11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41287i2(i11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41290j2((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final int m41369i0() {
        return FloatWindowBuild.f34525a.dividerColor();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m41371j0(@NotNull String msg, @NotNull String stubMsg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(stubMsg, "stubMsg");
        C44128b.m97259c("FloatingActionManager", "****** ******* " + msg + " ****** " + stubMsg + " ********");
    }

    /* JADX INFO: renamed from: k2 */
    public final void m41372k2(final int i11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getDisplayMode() == i11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41297l2(i11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41300m2((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m41373m0(@NotNull String locationIdStr, @NotNull String blockIdStr, @Nullable Function1<? super JSONObject, Unit> function1) {
        Intrinsics.checkNotNullParameter(locationIdStr, "locationIdStr");
        Intrinsics.checkNotNullParameter(blockIdStr, "blockIdStr");
        C4373b.m3907i("B1window", blockIdStr, locationIdStr, function1);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m41374n1() {
        WindowStatus floatingWindowHelperConfig = FloatWindowBuild.f34525a.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig != null) {
            f34540a.m41375o0(floatingWindowHelperConfig, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.h0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingActionManager.m41305o1((FloatingFrame) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final void m41376o2() {
        if (f34545f) {
            synchronized (f34549j) {
                f34548i = System.currentTimeMillis();
                Unit unit = Unit.INSTANCE;
            }
            m41292k0(this, "updataImSocketCallBackTime", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final int m41377p0() {
        return FloatWindowBuild.f34525a.getBgThemeAlpha();
    }

    /* JADX INFO: renamed from: p1 */
    public final int m41378p1() {
        return FloatWindowBuild.f34525a.textColorText40();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m41379p2() {
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        if (zM33189n == f34541b) {
            return;
        }
        f34541b = zM33189n;
        WindowStatus floatingWindowHelperConfig = FloatWindowBuild.f34525a.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig != null) {
            f34540a.m41375o0(floatingWindowHelperConfig, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingActionManager.m41308q2((FloatingFrame) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final int m41380q0() {
        return FloatWindowBuild.f34525a.getBgThemeColor();
    }

    /* JADX INFO: renamed from: q1 */
    public final int m41381q1() {
        return FloatWindowBuild.f34525a.textColorText50();
    }

    /* JADX INFO: renamed from: r1 */
    public final int m41383r1() {
        return FloatWindowBuild.f34525a.textColorText68();
    }

    /* JADX INFO: renamed from: r2 */
    public final void m41384r2(int i11) {
        FloatWindowBuild.f34525a.updatefloatingWindowParams(i11);
    }

    /* JADX INFO: renamed from: s0 */
    public final int m41385s0() {
        return C5275i0.m6236a(128.0f);
    }

    /* JADX INFO: renamed from: s1 */
    public final int m41386s1() {
        return FloatWindowBuild.f34525a.textSizeMode();
    }

    /* JADX INFO: renamed from: s2 */
    public final boolean m41387s2() {
        return FloatWindowBuild.f34525a.windowShowing();
    }

    /* JADX INFO: renamed from: t0 */
    public final int m41388t0(boolean z11, boolean z12, boolean z13) {
        if (z11) {
            return C5275i0.m6236a(80.0f);
        }
        if (!z13) {
            return C5275i0.m6236a(58.0f);
        }
        if (z12) {
            return -1;
        }
        return C5275i0.m6236a(48.0f);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m41389t1(final int i11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getPagingMode() == i11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41314u1(i11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41316v1((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final Point m41390v0() {
        return (Point) f34543d.getValue();
    }

    /* JADX INFO: renamed from: w0 */
    public final int m41391w0() {
        return FloatWindowBuild.f34525a.getHalfAlpha();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m41393x1(final int i11) {
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        WindowStatus floatingWindowHelperConfig = companion.getFloatingWindowHelperConfig();
        if (floatingWindowHelperConfig == null || floatingWindowHelperConfig.getPageTurningTime() == i11) {
            return;
        }
        companion.updataFloatingConfig(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41321y1(i11, (WindowStatus) obj);
            }
        }, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingActionManager.m41323z1((WindowStatus) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final int m41395z0(boolean z11) {
        return FloatWindowBuild.f34525a.getNexpageIcon(z11);
    }

    /* JADX INFO: renamed from: A0 */
    public final float m41324A0() {
        int iM41386s1 = m41386s1();
        if (iM41386s1 == 3) {
            return 12.0f;
        }
        if (iM41386s1 == 2) {
            return 10.0f;
        }
        return 8.0f;
    }

    /* JADX INFO: renamed from: D0 */
    public final float m41328D0() {
        int iM41386s1 = m41386s1();
        if (iM41386s1 == 3) {
            return 10.0f;
        }
        if (iM41386s1 == 2) {
            return 9.0f;
        }
        return 8.0f;
    }

    /* JADX INFO: renamed from: F0 */
    public final float m41330F0() {
        int iM41386s1 = m41386s1();
        if (iM41386s1 == 3) {
            return 10.0f;
        }
        if (iM41386s1 == 2) {
            return 9.0f;
        }
        return 8.0f;
    }

    /* JADX INFO: renamed from: J1 */
    public final void m41336J1(int i11, int i12) {
        m41390v0().set(i11, i12);
        FloatingWindowConfigManager.f34272a.m40728e(m41390v0());
    }

    /* JADX INFO: renamed from: Y0 */
    public final long m41355Y0() {
        int iM41348T0;
        if (m41367h0()) {
            iM41348T0 = FloatWindowBuild.f34525a.getAutoScrollTime();
        } else {
            iM41348T0 = m41348T0();
        }
        return ((long) iM41348T0) * ((long) 1000);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m41358a0(final String str, final boolean z11) {
        WindowStatus floatingWindowHelperConfig;
        if (str.length() != 0 && (floatingWindowHelperConfig = FloatWindowBuild.f34525a.getFloatingWindowHelperConfig()) != null) {
            f34540a.m41375o0(floatingWindowHelperConfig, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingActionManager.m41269b0(str, z11, (FloatingFrame) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m41375o0(WindowStatus windowStatus, Function1<? super FloatingFrame, Unit> function1) {
        View floatingView;
        if (windowStatus.getIsShow() && (floatingView = windowStatus.getFloatingView()) != null && (floatingView instanceof FloatingFrame)) {
            function1.invoke(floatingView);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final float m41382r0() {
        int iM41386s1 = m41386s1();
        if (iM41386s1 == 3) {
            return 10.0f;
        }
        if (iM41386s1 == 2) {
            return 9.0f;
        }
        return 8.0f;
    }

    /* JADX INFO: renamed from: x0 */
    public final int m41392x0() {
        int iM41386s1 = m41386s1();
        if (iM41386s1 == 3) {
            return C5275i0.m6236a(6.0f);
        }
        if (iM41386s1 == 2) {
            return C5275i0.m6236a(5.0f);
        }
        return C5275i0.m6236a(4.0f);
    }

    /* JADX INFO: renamed from: y0 */
    public final float m41394y0() {
        int iM41386s1 = m41386s1();
        if (iM41386s1 == 3) {
            return 16.0f;
        }
        if (iM41386s1 == 2) {
            return 14.0f;
        }
        return 12.0f;
    }
}
