package com.kubi.p110rn.kline;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.sdk.flutter.delegate.FlutterViewDelegate;
import com.kubi.sdk.flutter.delegate.LifecycleHandlerChannel;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.C27059l;
import com.tencent.bugly.proguard.RunnableC33958ua;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p472nk.C42847d;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KlineFlutterStageHostView.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010 \u001a\u00020!2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0014J\b\u0010$\u001a\u00020!H\u0014J\b\u0010%\u001a\u00020!H\u0014J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u0014H\u0016J\u0010\u0010+\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020!H\u0002J\b\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020!H\u0002J\u0010\u0010/\u001a\u00020!2\u0006\u0010*\u001a\u00020\u0014H\u0002J\b\u00100\u001a\u00020!H\u0002J\b\u00101\u001a\u00020!H\u0002J\b\u00102\u001a\u00020!H\u0002J\u001c\u00103\u001a\u00020!2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020605H\u0002J\u001c\u00107\u001a\u00020!2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020605H\u0002J\u001c\u00108\u001a\u00020!2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020605H\u0002J\u001c\u00109\u001a\u00020!2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020605H\u0002J\b\u0010:\u001a\u00020!H\u0002J\n\u0010;\u001a\u0004\u0018\u00010<H\u0002J\b\u0010=\u001a\u00020!H\u0002J \u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\f\u0010?\u001a\u00020\u000f*\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineFlutterStageHostView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "flutterDelegate", "Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;", "lifecycleHandlerChannel", "Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;", "touchSlop", "", "longPressTimeout", "", "symbol", "", "klineType", "leverTradeType", "routeSignature", "stageVisible", "", "attached", "hostDestroyed", "downX", "", "downY", "downTime", "gestureActive", "directionDecided", "stageOwnsGesture", "commonEventJob", "Lkotlinx/coroutines/Job;", "updateProps", "", "setStageVisible", ViewProps.VISIBLE, "onAttachedToWindow", "onDetachedFromWindow", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "requestDisallowInterceptTouchEvent", "disallowIntercept", "handleMoveEvent", "lockToStage", "handOffToParent", "resetTouchGesture", "setParentInterceptDisallowed", "rebuildFlutterHost", "resumeFlutterHostIfNeeded", "bindCommonFlutterEvent", "emitChartDisplayToRn", ReportDataTable.COLUMN_PARAMS, "", "", "emitTvIntervalToRn", "emitTvOpenIndicatorsToRn", "emitNewsBannerToRn", "unbindCommonFlutterEvent", "resolveLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "createFlutterHost", "buildStageRoute", "toRouteParam", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineFlutterStageHostView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineFlutterStageHostView.kt\ncom/kubi/rn/kline/KlineFlutterStageHostView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,478:1\n1#2:479\n76#3,7:480\n*S KotlinDebug\n*F\n+ 1 KlineFlutterStageHostView.kt\ncom/kubi/rn/kline/KlineFlutterStageHostView\n*L\n289#1:480,7\n*E\n"})
public final class KlineFlutterStageHostView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float DIRECTION_DOMINANCE_RATIO = 1.0f;

    @NotNull
    private static final String EVENT_CHART_DISPLAY_UPDATE = "event_chart_display_update";

    @NotNull
    private static final String EVENT_KLINE_NEWS_BANNER_UPDATE = "event_kline_news_banner_update";

    @NotNull
    private static final String EVENT_TV_INTERVAL_UPDATE = "event_tv_interval_update";

    @NotNull
    private static final String EVENT_TV_OPEN_INDICATORS = "event_tv_open_indicators";

    @NotNull
    private static final String RN_EVENT_CHART_DISPLAY = "KlineChartDisplayChanged";

    @NotNull
    private static final String RN_EVENT_KLINE_NEWS_BANNER = "KlineNewsBannerChanged";

    @NotNull
    private static final String RN_EVENT_TV_INTERVAL = "KlineTvIntervalChanged";

    @NotNull
    private static final String RN_EVENT_TV_OPEN_INDICATORS = "KlineTvOpenIndicators";

    @NotNull
    private static final String TAG = "KlineFlutterStageHost";

    @Nullable
    private static volatile KlineFlutterStageHostView activeHost;
    private boolean attached;

    @Nullable
    private InterfaceC41775x1 commonEventJob;
    private boolean directionDecided;
    private long downTime;
    private float downX;
    private float downY;

    @NotNull
    private final FlutterViewDelegate flutterDelegate;
    private boolean gestureActive;
    private boolean hostDestroyed;

    @NotNull
    private String klineType;

    @NotNull
    private String leverTradeType;

    @NotNull
    private final LifecycleHandlerChannel lifecycleHandlerChannel;
    private final long longPressTimeout;

    @NotNull
    private String routeSignature;
    private boolean stageOwnsGesture;
    private boolean stageVisible;

    @NotNull
    private String symbol;
    private final int touchSlop;

    /* JADX INFO: compiled from: KlineFlutterStageHostView.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineFlutterStageHostView$Companion;", "", "<init>", "()V", "TAG", "", "EVENT_CHART_DISPLAY_UPDATE", "EVENT_TV_INTERVAL_UPDATE", "EVENT_TV_OPEN_INDICATORS", "EVENT_KLINE_NEWS_BANNER_UPDATE", "RN_EVENT_CHART_DISPLAY", "RN_EVENT_TV_INTERVAL", "RN_EVENT_TV_OPEN_INDICATORS", "RN_EVENT_KLINE_NEWS_BANNER", "DIRECTION_DOMINANCE_RATIO", "", "activeHost", "Lcom/kubi/rn/kline/KlineFlutterStageHostView;", "getActiveHost", "()Lcom/kubi/rn/kline/KlineFlutterStageHostView;", "setActiveHost", "(Lcom/kubi/rn/kline/KlineFlutterStageHostView;)V", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final KlineFlutterStageHostView getActiveHost() {
            return KlineFlutterStageHostView.activeHost;
        }

        public final void setActiveHost(@Nullable KlineFlutterStageHostView klineFlutterStageHostView) {
            KlineFlutterStageHostView.activeHost = klineFlutterStageHostView;
        }
    }

    private final void handOffToParent() {
        this.directionDecided = true;
        this.stageOwnsGesture = false;
        setParentInterceptDisallowed(false);
    }

    private final void lockToStage() {
        this.directionDecided = true;
        this.stageOwnsGesture = true;
        setParentInterceptDisallowed(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineFlutterStageHostView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.flutterDelegate = new FlutterViewDelegate();
        this.lifecycleHandlerChannel = new LifecycleHandlerChannel();
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.symbol = "";
        this.klineType = SearchCategory$Companion.SPOT;
        this.leverTradeType = "";
        this.routeSignature = "";
        this.stageVisible = true;
        createFlutterHost();
    }

    private final void bindCommonFlutterEvent() {
        InterfaceC41775x1 interfaceC41775x1 = this.commonEventJob;
        if (interfaceC41775x1 == null || !interfaceC41775x1.isActive()) {
            LifecycleOwner lifecycleOwnerResolveLifecycleOwner = resolveLifecycleOwner();
            if (lifecycleOwnerResolveLifecycleOwner == null) {
                C44128b.m97270n(TAG, "bindCommonFlutterEvent skip: LifecycleOwner not found");
                return;
            }
            if (C12573b.f21598a.m23696a()) {
                "com.kubi.event.FlutterEvent:flutterCommonEvent".length();
            }
            this.commonEventJob = C12572a.m23692a(lifecycleOwnerResolveLifecycleOwner, false, new C23533x9ad96304("com.kubi.event.FlutterEvent:flutterCommonEvent", null, this));
        }
    }

    private final String buildStageRoute(String symbol, String klineType, String leverTradeType) {
        return KlineFlutterStageConstants.FLUTTER_STAGE_ROUTE + ("?klineType=" + toRouteParam(klineType) + "&symbol=" + toRouteParam(symbol) + "&leverTradeType=" + toRouteParam(leverTradeType));
    }

    private final void createFlutterHost() {
        C44128b.m97259c(TAG, "createFlutterHost hostDestroyed=" + this.hostDestroyed + " symbol=" + this.symbol);
        FlutterViewDelegate flutterViewDelegate = this.flutterDelegate;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        flutterViewDelegate.m56740C(context, this, true);
        this.flutterDelegate.m56761i();
        this.flutterDelegate.m56760h(this.lifecycleHandlerChannel);
        this.hostDestroyed = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitChartDisplayToRn(Map<String, ? extends Object> params) {
        Object objM103844constructorimpl;
        if (Intrinsics.areEqual(params.get("key_event_name"), EVENT_CHART_DISPLAY_UPDATE)) {
            Object obj = params.get("isTradingViewActive");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Context context = getContext();
            ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
            if (reactContext == null) {
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putBoolean("active", zBooleanValue);
                writableMapCreateMap.putString("symbol", this.symbol);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(RN_EVENT_CHART_DISPLAY, writableMapCreateMap);
                C44128b.m97259c(TAG, "emit KlineChartDisplayChanged -> RN active=" + zBooleanValue + " symbol=" + this.symbol);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97270n(TAG, "emitChartDisplayToRn failed: " + thM103847exceptionOrNullimpl.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitNewsBannerToRn(Map<String, ? extends Object> params) {
        Object objM103844constructorimpl;
        if (Intrinsics.areEqual(params.get("key_event_name"), EVENT_KLINE_NEWS_BANNER_UPDATE)) {
            C42847d.f94914a.m93975a(C27059l.f54343a.m66757a());
            Object obj = params.get("hasClose");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                Context context = getContext();
                ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
                if (reactContext == null) {
                    return;
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("hasClose", zBooleanValue);
                    writableMapCreateMap.putString("symbol", this.symbol);
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(RN_EVENT_KLINE_NEWS_BANNER, writableMapCreateMap);
                    C44128b.m97259c(TAG, "emit KlineNewsBannerChanged -> RN hasClose=" + zBooleanValue + " symbol=" + this.symbol);
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    C44128b.m97270n(TAG, "emitNewsBannerToRn failed: " + thM103847exceptionOrNullimpl.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitTvIntervalToRn(Map<String, ? extends Object> params) {
        Object objM103844constructorimpl;
        if (Intrinsics.areEqual(params.get("key_event_name"), EVENT_TV_INTERVAL_UPDATE)) {
            Object obj = params.get(JPushConstants.Geofence.KEY_INTERVAL);
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return;
            }
            Context context = getContext();
            ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
            if (reactContext == null) {
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString(JPushConstants.Geofence.KEY_INTERVAL, str);
                writableMapCreateMap.putString("symbol", this.symbol);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(RN_EVENT_TV_INTERVAL, writableMapCreateMap);
                C44128b.m97259c(TAG, "emit KlineTvIntervalChanged -> RN interval=" + str + " symbol=" + this.symbol);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97270n(TAG, "emitTvIntervalToRn failed: " + thM103847exceptionOrNullimpl.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitTvOpenIndicatorsToRn(Map<String, ? extends Object> params) {
        Object objM103844constructorimpl;
        if (Intrinsics.areEqual(params.get("key_event_name"), EVENT_TV_OPEN_INDICATORS)) {
            Context context = getContext();
            ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
            if (reactContext == null) {
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("symbol", this.symbol);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(RN_EVENT_TV_OPEN_INDICATORS, writableMapCreateMap);
                C44128b.m97259c(TAG, "emit KlineTvOpenIndicators -> RN symbol=" + this.symbol);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97270n(TAG, "emitTvOpenIndicatorsToRn failed: " + thM103847exceptionOrNullimpl.getMessage());
            }
        }
    }

    private final void rebuildFlutterHost() {
        Object objM103844constructorimpl;
        if (StringsKt.isBlank(this.symbol)) {
            C44128b.m97259c(TAG, "rebuildFlutterHost skip blank symbol klineType=" + this.klineType);
            return;
        }
        String strBuildStageRoute = buildStageRoute(this.symbol, this.klineType, this.leverTradeType);
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!this.hostDestroyed) {
                this.flutterDelegate.m56741E();
            }
            createFlutterHost();
            this.flutterDelegate.m56756V(strBuildStageRoute);
            this.flutterDelegate.m56758X();
            resumeFlutterHostIfNeeded();
            C44128b.m97259c(TAG, "rebuildFlutterHost route=" + strBuildStageRoute);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n(TAG, "rebuildFlutterHost failed: " + thM103847exceptionOrNullimpl.getMessage());
        }
    }

    private final void resetTouchGesture() {
        this.downTime = 0L;
        this.gestureActive = false;
        this.directionDecided = false;
        this.stageOwnsGesture = false;
        setParentInterceptDisallowed(false);
    }

    private final void resumeFlutterHostIfNeeded() {
        if (!this.attached) {
            C44128b.m97259c(TAG, "resumeFlutterHostIfNeeded skip detached symbol=" + this.symbol);
            return;
        }
        this.flutterDelegate.m56748N();
        if (this.stageVisible) {
            this.lifecycleHandlerChannel.m56790b();
        }
        C44128b.m97259c(TAG, "resumeFlutterHostIfNeeded attached=" + this.attached + " stageVisible=" + this.stageVisible + " symbol=" + this.symbol);
    }

    private final void unbindCommonFlutterEvent() {
        InterfaceC41775x1 interfaceC41775x1 = this.commonEventJob;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.commonEventJob = null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        int actionMasked = ev2.getActionMasked();
        if (actionMasked == 0) {
            this.downX = ev2.getRawX();
            this.downY = ev2.getRawY();
            this.downTime = SystemClock.uptimeMillis();
            this.gestureActive = true;
            this.directionDecided = false;
            this.stageOwnsGesture = false;
            setParentInterceptDisallowed(false);
        } else if (actionMasked == 1) {
            resetTouchGesture();
        } else if (actionMasked == 2) {
            handleMoveEvent(ev2);
        } else if (actionMasked == 3) {
            resetTouchGesture();
        } else if (actionMasked == 5) {
            lockToStage();
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (this.gestureActive) {
            disallowIntercept = !this.directionDecided ? false : this.stageOwnsGesture;
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setStageVisible(boolean visible) {
        if (this.stageVisible == visible) {
            C44128b.m97259c(TAG, "setStageVisible skip visible=" + visible + " attached=" + this.attached + " symbol=" + this.symbol);
            return;
        }
        this.stageVisible = visible;
        C44128b.m97259c(TAG, "setStageVisible visible=" + visible + " attached=" + this.attached + " symbol=" + this.symbol);
        if (this.attached) {
            if (visible) {
                this.lifecycleHandlerChannel.m56790b();
            } else {
                this.lifecycleHandlerChannel.m56789a();
            }
        }
    }

    public final void updateProps(@Nullable String symbol, @Nullable String klineType, @Nullable String leverTradeType) {
        if (symbol == null) {
            symbol = "";
        }
        if (klineType == null) {
            klineType = "";
        }
        if (StringsKt.isBlank(klineType)) {
            klineType = SearchCategory$Companion.SPOT;
        }
        if (leverTradeType == null) {
            leverTradeType = "";
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{symbol, klineType, leverTradeType}), RunnableC33958ua.f72251f, null, null, 0, null, null, 62, null);
        boolean zAreEqual = Intrinsics.areEqual(strJoinToString$default, this.routeSignature);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updateProps symbol=");
        sb2.append(symbol);
        sb2.append(" klineType=");
        sb2.append(klineType);
        sb2.append(" leverTradeType=");
        sb2.append(leverTradeType);
        sb2.append(" routeChanged=");
        sb2.append(!zAreEqual);
        sb2.append(" attached=");
        sb2.append(this.attached);
        C44128b.m97259c(TAG, sb2.toString());
        this.symbol = symbol;
        this.klineType = klineType;
        this.leverTradeType = leverTradeType;
        if (zAreEqual) {
            return;
        }
        this.routeSignature = strJoinToString$default;
        rebuildFlutterHost();
    }

    private final void handleMoveEvent(MotionEvent ev2) {
        if (ev2.getPointerCount() >= 2) {
            lockToStage();
            return;
        }
        if (!this.directionDecided) {
            if (this.downTime > 0 && SystemClock.uptimeMillis() - this.downTime >= this.longPressTimeout) {
                lockToStage();
                return;
            }
            float fAbs = Math.abs(ev2.getRawX() - this.downX);
            float fAbs2 = Math.abs(ev2.getRawY() - this.downY);
            if (((float) Math.hypot(fAbs, fAbs2)) <= this.touchSlop) {
                return;
            }
            if (fAbs2 > fAbs * 1.0f) {
                handOffToParent();
            } else {
                lockToStage();
            }
        }
    }

    private final LifecycleOwner resolveLifecycleOwner() {
        ReactContext reactContext;
        ComponentCallbacks2 currentActivity;
        ContextWrapper contextWrapper;
        Object context = getContext();
        while (context != null) {
            if (context instanceof LifecycleOwner) {
                return (LifecycleOwner) context;
            }
            if (context instanceof ContextWrapper) {
                contextWrapper = (ContextWrapper) context;
            } else {
                contextWrapper = null;
            }
            if (contextWrapper != null) {
                context = contextWrapper.getBaseContext();
            } else {
                context = null;
            }
        }
        Context context2 = getContext();
        if (context2 instanceof ReactContext) {
            reactContext = (ReactContext) context2;
        } else {
            reactContext = null;
        }
        if (reactContext != null) {
            currentActivity = reactContext.getCurrentActivity();
        } else {
            currentActivity = null;
        }
        if (!(currentActivity instanceof LifecycleOwner)) {
            return null;
        }
        return (LifecycleOwner) currentActivity;
    }

    private final void setParentInterceptDisallowed(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    private final String toRouteParam(String str) {
        String strEncode = Uri.encode(str);
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        activeHost = this;
        if (this.hostDestroyed && StringsKt.isBlank(this.symbol)) {
            createFlutterHost();
        } else if (this.hostDestroyed || StringsKt.isBlank(this.routeSignature)) {
            rebuildFlutterHost();
        }
        this.flutterDelegate.m56748N();
        if (this.stageVisible) {
            this.lifecycleHandlerChannel.m56790b();
        }
        bindCommonFlutterEvent();
        C44128b.m97259c(TAG, "onAttachedToWindow symbol=" + this.symbol);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        unbindCommonFlutterEvent();
        this.lifecycleHandlerChannel.m56789a();
        this.flutterDelegate.m56745K();
        this.flutterDelegate.m56741E();
        this.hostDestroyed = true;
        this.attached = false;
        if (activeHost == this) {
            activeHost = null;
        }
        super.onDetachedFromWindow();
        C44128b.m97259c(TAG, "onDetachedFromWindow symbol=" + this.symbol);
    }
}
