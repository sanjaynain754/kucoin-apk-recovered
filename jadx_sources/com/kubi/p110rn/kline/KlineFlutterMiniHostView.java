package com.kubi.p110rn.kline;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.sdk.flutter.delegate.FlutterViewDelegate;
import com.kubi.sdk.flutter.delegate.LifecycleHandlerChannel;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/* JADX INFO: compiled from: KlineFlutterMiniHostView.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 H2\u00020\u0001:\u0001HB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005Ju\u0010%\u001a\u00020&2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020\u0018J\u0016\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0011J\b\u00103\u001a\u00020&H\u0014J\b\u00104\u001a\u00020&H\u0014J\u0006\u00105\u001a\u00020&J\u0010\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020\u0018H\u0016J\u0010\u0010;\u001a\u00020&2\u0006\u00107\u001a\u000208H\u0002J\b\u0010<\u001a\u00020&H\u0002J\b\u0010=\u001a\u00020&H\u0002J\b\u0010>\u001a\u00020&H\u0002J\u0010\u0010?\u001a\u00020&2\u0006\u0010:\u001a\u00020\u0018H\u0002J\b\u0010@\u001a\u00020&H\u0002J\b\u0010A\u001a\u00020&H\u0002J\b\u0010B\u001a\u00020&H\u0002J@\u0010C\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\f\u0010D\u001a\u00020\u0011*\u00020\u0011H\u0002J\u0010\u0010E\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u000fH\u0002J\u0010\u0010G\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineFlutterMiniHostView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "flutterDelegate", "Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;", "lifecycleHandlerChannel", "Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;", "externalDataChannel", "Lcom/kubi/rn/kline/KlineMiniExternalDataChannel;", "touchSlop", "", "ownerReactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "symbol", "", "klineType", "leverTradeType", "period", KlineFlutterMiniConstants.PROP_PERIOD_BAR_SOURCE, KlineFlutterMiniConstants.PROP_DATA_SOURCE, KlineFlutterMiniConstants.PROP_SHOW_BS_POINTS, "", "routeSignature", "miniVisible", "attached", "hostDestroyed", "downX", "", "downY", "gestureActive", "directionDecided", "miniOwnsGesture", "mainHandler", "Landroid/os/Handler;", "updateProps", "", KlineFlutterMiniConstants.PROP_CANDLES, "Lcom/facebook/react/bridge/ReadableArray;", KlineFlutterMiniConstants.PROP_REALTIME_CANDLES, KlineFlutterMiniConstants.PROP_REALTIME_REVISION, KlineFlutterMiniConstants.PROP_LATEST_PRICE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;ILjava/lang/Double;)V", "setMiniVisible", ViewProps.VISIBLE, "refreshTradeOverlays", "requestedSymbol", "scope", "onAttachedToWindow", "onDetachedFromWindow", "releaseFlutterHost", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "requestDisallowInterceptTouchEvent", "disallowIntercept", "handleMoveEvent", "lockToMiniChart", "handOffToParent", "resetTouchGesture", "setParentInterceptDisallowed", "rebuildFlutterHost", "resumeFlutterHostIfNeeded", "createFlutterHost", "buildMiniRoute", "toRouteParam", "isOwnedBy", "requester", "resolveFlutterPeriodType", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineFlutterMiniHostView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineFlutterMiniHostView.kt\ncom/kubi/rn/kline/KlineFlutterMiniHostView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,446:1\n1#2:447\n*E\n"})
public final class KlineFlutterMiniHostView extends FrameLayout {
    private static final long HOST_REPLAY_DELAY_MS = 300;

    @NotNull
    private static final String TAG = "KlineFlutterMiniHost";

    @Nullable
    private static volatile KlineFlutterMiniHostView activeHost;
    private boolean attached;

    @NotNull
    private String dataSource;
    private boolean directionDecided;
    private float downX;
    private float downY;

    @NotNull
    private final KlineMiniExternalDataChannel externalDataChannel;

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

    @NotNull
    private final Handler mainHandler;
    private boolean miniOwnsGesture;
    private boolean miniVisible;

    @Nullable
    private final ReactApplicationContext ownerReactContext;

    @NotNull
    private String period;

    @NotNull
    private String periodBarSource;

    @NotNull
    private String routeSignature;
    private boolean showBSPoints;

    @NotNull
    private String symbol;
    private final int touchSlop;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final WeakHashMap<ReactApplicationContext, Boolean> pendingMiniVisibility = new WeakHashMap<>();

    /* JADX INFO: compiled from: KlineFlutterMiniHostView.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\nJ\u001e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineFlutterMiniHostView$Companion;", "", "<init>", "()V", "TAG", "", "HOST_REPLAY_DELAY_MS", "", "pendingMiniVisibility", "Ljava/util/WeakHashMap;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "", "activeHost", "Lcom/kubi/rn/kline/KlineFlutterMiniHostView;", "getActiveHost", "()Lcom/kubi/rn/kline/KlineFlutterMiniHostView;", "setActiveHost", "(Lcom/kubi/rn/kline/KlineFlutterMiniHostView;)V", "requestMiniVisible", "", ViewProps.VISIBLE, "requester", "requestTradeOverlayRefresh", "symbol", "scope", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void requestMiniVisible(boolean visible, @NotNull ReactApplicationContext requester) {
            Intrinsics.checkNotNullParameter(requester, "requester");
            KlineFlutterMiniHostView.pendingMiniVisibility.put(requester, Boolean.valueOf(visible));
            KlineFlutterMiniHostView activeHost = getActiveHost();
            if (activeHost == null) {
                return;
            }
            if (activeHost.isOwnedBy(requester)) {
                activeHost.setMiniVisible(visible);
                return;
            }
            C44128b.m97259c(KlineFlutterMiniHostView.TAG, "requestMiniVisible skip foreign runtime visible=" + visible + " symbol=" + activeHost.symbol);
        }

        public final void requestTradeOverlayRefresh(@NotNull String symbol, @NotNull String scope, @NotNull ReactApplicationContext requester) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(requester, "requester");
            KlineFlutterMiniHostView activeHost = getActiveHost();
            if (activeHost == null) {
                return;
            }
            if (activeHost.isOwnedBy(requester)) {
                activeHost.refreshTradeOverlays(symbol, scope);
                return;
            }
            C44128b.m97259c(KlineFlutterMiniHostView.TAG, "requestTradeOverlayRefresh skip foreign runtime symbol=" + symbol + " scope=" + scope);
        }

        @Nullable
        public final KlineFlutterMiniHostView getActiveHost() {
            return KlineFlutterMiniHostView.activeHost;
        }

        public final void setActiveHost(@Nullable KlineFlutterMiniHostView klineFlutterMiniHostView) {
            KlineFlutterMiniHostView.activeHost = klineFlutterMiniHostView;
        }
    }

    private final void handOffToParent() {
        this.directionDecided = true;
        this.miniOwnsGesture = false;
        setParentInterceptDisallowed(false);
    }

    private final void lockToMiniChart() {
        this.directionDecided = true;
        this.miniOwnsGesture = true;
        setParentInterceptDisallowed(true);
    }

    private final void resetTouchGesture() {
        this.gestureActive = false;
        this.directionDecided = false;
        this.miniOwnsGesture = false;
        setParentInterceptDisallowed(false);
    }

    public final void updateProps(@Nullable String symbol, @Nullable String klineType, @Nullable String leverTradeType, @Nullable String period, @Nullable String periodBarSource, @Nullable String dataSource, boolean showBSPoints, @Nullable ReadableArray candles, @Nullable ReadableArray realtimeCandles, int realtimeRevision, @Nullable Double latestPrice) {
        String str = symbol == null ? "" : symbol;
        String str2 = klineType == null ? "" : klineType;
        if (StringsKt.isBlank(str2)) {
            str2 = SearchCategory$Companion.SPOT;
        }
        String str3 = leverTradeType == null ? "" : leverTradeType;
        String str4 = period == null ? "" : period;
        if (StringsKt.isBlank(str4)) {
            str4 = "fifteenM";
        }
        String str5 = periodBarSource == null ? "" : periodBarSource;
        if (StringsKt.isBlank(str5)) {
            str5 = KCTurboFileModuleImpl.SOURCE_RN;
        }
        String str6 = dataSource != null ? dataSource : "";
        if (StringsKt.isBlank(str6)) {
            str6 = "internal";
        }
        boolean z11 = showBSPoints != this.showBSPoints;
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{str, str2, str3, str5, str6}), RunnableC33958ua.f72251f, null, null, 0, null, null, 62, null);
        boolean zAreEqual = Intrinsics.areEqual(strJoinToString$default, this.routeSignature);
        boolean z12 = !zAreEqual;
        boolean zAreEqual2 = Intrinsics.areEqual(str4, this.period);
        boolean z13 = !zAreEqual2;
        C44128b.m97259c(TAG, "updateProps symbol=" + str + " klineType=" + str2 + " period=" + str4 + " periodBarSource=" + str5 + " dataSource=" + str6 + " snapshot=" + (candles != null ? candles.size() : 0) + " realtime=" + (realtimeCandles != null ? realtimeCandles.size() : 0) + " revision=" + realtimeRevision + " showBSPoints=" + showBSPoints + " showBSPointsChanged=" + z11 + " routeChanged=" + z12 + " periodChanged=" + z13 + " attached=" + this.attached);
        this.symbol = str;
        this.klineType = str2;
        this.leverTradeType = str3;
        this.period = str4;
        this.periodBarSource = str5;
        this.dataSource = str6;
        this.showBSPoints = showBSPoints;
        if (zAreEqual == 0) {
            this.routeSignature = strJoinToString$default;
            C44128b.m97259c(TAG, "updateProps routeChanged rebuild signature=" + strJoinToString$default);
            this.externalDataChannel.resetExternalState();
            rebuildFlutterHost();
        } else if (!zAreEqual2) {
            this.externalDataChannel.invalidateReplaceDigest();
            this.externalDataChannel.resetRealtimeState();
            this.externalDataChannel.resetSnapshotCache();
            C44128b.m97259c(TAG, "updateProps periodChanged updatePeriod=" + str4 + " dataSource=" + str6);
            this.externalDataChannel.updatePeriod(str4);
        }
        this.externalDataChannel.updateExternalConfig(str6, str);
        if (z11) {
            this.externalDataChannel.updateTradeOverlayVisibility(showBSPoints, str);
        }
        this.externalDataChannel.updateCandles(candles);
        this.externalDataChannel.updateRealtimeCandles(realtimeCandles, realtimeRevision);
        if (!zAreEqual) {
            this.mainHandler.postDelayed(new Runnable() { // from class: com.kubi.rn.kline.b
                @Override // java.lang.Runnable
                public final void run() {
                    KlineFlutterMiniHostView.updateProps$lambda$4(this.f46055b);
                }
            }, 300L);
        }
        if (latestPrice == null || Double.isNaN(latestPrice.doubleValue())) {
            return;
        }
        this.externalDataChannel.updateLatestPrice(latestPrice.doubleValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineFlutterMiniHostView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.flutterDelegate = new FlutterViewDelegate();
        this.lifecycleHandlerChannel = new LifecycleHandlerChannel();
        this.externalDataChannel = new KlineMiniExternalDataChannel();
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ThemedReactContext themedReactContext = context instanceof ThemedReactContext ? (ThemedReactContext) context : null;
        this.ownerReactContext = themedReactContext != null ? themedReactContext.getReactApplicationContext() : null;
        this.symbol = "";
        this.klineType = SearchCategory$Companion.SPOT;
        this.leverTradeType = "";
        this.period = "fifteenM";
        this.periodBarSource = KCTurboFileModuleImpl.SOURCE_RN;
        this.dataSource = "internal";
        this.showBSPoints = true;
        this.routeSignature = "";
        this.miniVisible = true;
        this.mainHandler = new Handler(Looper.getMainLooper());
        createFlutterHost();
    }

    private final String buildMiniRoute(String symbol, String klineType, String leverTradeType, String period, String periodBarSource, String dataSource, boolean showBSPoints) {
        StringBuilder sb2 = new StringBuilder();
        String strResolveFlutterPeriodType = resolveFlutterPeriodType(period);
        sb2.append("?klineType=");
        sb2.append(toRouteParam(klineType));
        sb2.append("&symbol=");
        sb2.append(toRouteParam(symbol));
        sb2.append("&leverTradeType=");
        sb2.append(toRouteParam(leverTradeType));
        sb2.append("&periodBarSource=");
        sb2.append(toRouteParam(periodBarSource));
        sb2.append("&period=");
        sb2.append(toRouteParam(period));
        sb2.append("&type=");
        sb2.append(toRouteParam(strResolveFlutterPeriodType));
        if (Intrinsics.areEqual(dataSource, "external")) {
            sb2.append("&externalData=1");
        }
        sb2.append("&showBSPoints=");
        sb2.append(showBSPoints ? "1" : "0");
        return KlineFlutterMiniConstants.FLUTTER_MINI_ROUTE + sb2.toString();
    }

    private final void createFlutterHost() {
        C44128b.m97259c(TAG, "createFlutterHost hostDestroyed=" + this.hostDestroyed + " symbol=" + this.symbol + " period=" + this.period);
        FlutterViewDelegate flutterViewDelegate = this.flutterDelegate;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        flutterViewDelegate.m56740C(context, this, true);
        this.flutterDelegate.m56761i();
        this.flutterDelegate.m56760h(this.lifecycleHandlerChannel);
        this.flutterDelegate.m56760h(this.externalDataChannel);
        this.hostDestroyed = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOwnedBy(ReactApplicationContext requester) {
        return this.ownerReactContext == requester;
    }

    private final void rebuildFlutterHost() {
        Object objM103844constructorimpl;
        if (StringsKt.isBlank(this.symbol)) {
            C44128b.m97259c(TAG, "rebuildFlutterHost skip blank symbol period=" + this.period + " dataSource=" + this.dataSource);
            return;
        }
        String strBuildMiniRoute = buildMiniRoute(this.symbol, this.klineType, this.leverTradeType, this.period, this.periodBarSource, this.dataSource, this.showBSPoints);
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!this.hostDestroyed) {
                this.flutterDelegate.m56741E();
            }
            createFlutterHost();
            this.flutterDelegate.m56756V(strBuildMiniRoute);
            this.flutterDelegate.m56758X();
            resumeFlutterHostIfNeeded();
            C44128b.m97259c(TAG, "rebuildFlutterHost route=" + strBuildMiniRoute);
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

    private final void resumeFlutterHostIfNeeded() {
        if (!this.attached) {
            C44128b.m97259c(TAG, "resumeFlutterHostIfNeeded skip detached symbol=" + this.symbol + " period=" + this.period);
            return;
        }
        this.flutterDelegate.m56748N();
        if (this.miniVisible) {
            this.lifecycleHandlerChannel.m56790b();
        }
        C44128b.m97259c(TAG, "resumeFlutterHostIfNeeded attached=" + this.attached + " miniVisible=" + this.miniVisible + " symbol=" + this.symbol + " period=" + this.period);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProps$lambda$4(KlineFlutterMiniHostView klineFlutterMiniHostView) {
        klineFlutterMiniHostView.externalDataChannel.replayCachedPayloads();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        int actionMasked = ev2.getActionMasked();
        if (actionMasked == 0) {
            this.downX = ev2.getRawX();
            this.downY = ev2.getRawY();
            this.gestureActive = true;
            this.directionDecided = false;
            this.miniOwnsGesture = false;
            setParentInterceptDisallowed(false);
        } else if (actionMasked == 1) {
            resetTouchGesture();
        } else if (actionMasked == 2) {
            handleMoveEvent(ev2);
        } else if (actionMasked == 3) {
            resetTouchGesture();
        } else if (actionMasked == 5) {
            lockToMiniChart();
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.lifecycleHandlerChannel.m56789a();
        this.flutterDelegate.m56745K();
        this.attached = false;
        resetTouchGesture();
        if (activeHost == this) {
            activeHost = null;
        }
        super.onDetachedFromWindow();
        C44128b.m97259c(TAG, "onDetachedFromWindow preserveHost=true symbol=" + this.symbol);
    }

    public final void refreshTradeOverlays(@NotNull String requestedSymbol, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(requestedSymbol, "requestedSymbol");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (Intrinsics.areEqual(requestedSymbol, this.symbol)) {
            this.externalDataChannel.refreshTradeOverlays(requestedSymbol, scope);
            return;
        }
        C44128b.m97259c(TAG, "refreshTradeOverlays skip requested=" + requestedSymbol + " current=" + this.symbol + " scope=" + scope);
    }

    public final void releaseFlutterHost() {
        if (this.hostDestroyed) {
            C44128b.m97259c(TAG, "releaseFlutterHost skip destroyed symbol=" + this.symbol);
            return;
        }
        this.mainHandler.removeCallbacksAndMessages(null);
        if (this.attached) {
            this.lifecycleHandlerChannel.m56789a();
            this.flutterDelegate.m56745K();
        }
        this.flutterDelegate.m56741E();
        this.hostDestroyed = true;
        this.attached = false;
        resetTouchGesture();
        if (activeHost == this) {
            activeHost = null;
        }
        C44128b.m97259c(TAG, "releaseFlutterHost symbol=" + this.symbol);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (this.gestureActive) {
            disallowIntercept = !this.directionDecided ? false : this.miniOwnsGesture;
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setMiniVisible(boolean visible) {
        if (this.miniVisible == visible) {
            C44128b.m97259c(TAG, "setMiniVisible skip visible=" + visible + " attached=" + this.attached + " symbol=" + this.symbol);
            return;
        }
        this.miniVisible = visible;
        C44128b.m97259c(TAG, "setMiniVisible visible=" + visible + " attached=" + this.attached + " symbol=" + this.symbol);
        if (this.attached) {
            if (visible) {
                this.lifecycleHandlerChannel.m56790b();
            } else {
                this.lifecycleHandlerChannel.m56789a();
            }
        }
    }

    private final void handleMoveEvent(MotionEvent ev2) {
        if (ev2.getPointerCount() >= 2) {
            lockToMiniChart();
            return;
        }
        if (!this.directionDecided) {
            float fAbs = Math.abs(ev2.getRawX() - this.downX);
            float fAbs2 = Math.abs(ev2.getRawY() - this.downY);
            if (((float) Math.hypot(fAbs, fAbs2)) <= this.touchSlop) {
                return;
            }
            if (fAbs2 > fAbs) {
                handOffToParent();
            } else {
                lockToMiniChart();
            }
        }
    }

    private final String resolveFlutterPeriodType(String period) {
        switch (period.hashCode()) {
            case -2076650431:
                if (!period.equals("timeline")) {
                    return "15min";
                }
                return "1min";
            case -1345842517:
                if (period.equals("thirtyM")) {
                    return "30min";
                }
                return "15min";
            case -1068487221:
                if (period.equals("monthK")) {
                    return "1month";
                }
                return "15min";
            case -912120240:
                if (period.equals("twoHour")) {
                    return "2hour";
                }
                return "15min";
            case -901955002:
                if (period.equals("sixtyM")) {
                    return "1hour";
                }
                return "15min";
            case -892954992:
                period.equals("fifteenM");
                return "15min";
            case 3076143:
                if (period.equals("dayK")) {
                    return "1day";
                }
                return "15min";
            case 3415719:
                if (!period.equals("oneM")) {
                    return "15min";
                }
                return "1min";
            case 97443803:
                if (period.equals("fiveM")) {
                    return "5min";
                }
                return "15min";
            case 113008343:
                if (period.equals("weekK")) {
                    return "1week";
                }
                return "15min";
            case 452598547:
                if (period.equals("eightHour")) {
                    return "8hour";
                }
                return "15min";
            case 563835946:
                if (period.equals("fourHour")) {
                    return "4hour";
                }
                return "15min";
            default:
                return "15min";
        }
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
        boolean zBooleanValue;
        Boolean bool;
        super.onAttachedToWindow();
        this.attached = true;
        activeHost = this;
        ReactApplicationContext reactApplicationContext = this.ownerReactContext;
        if (reactApplicationContext != null && (bool = pendingMiniVisibility.get(reactApplicationContext)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = this.miniVisible;
        }
        this.miniVisible = zBooleanValue;
        if (this.hostDestroyed && StringsKt.isBlank(this.symbol)) {
            createFlutterHost();
        } else if (this.hostDestroyed || StringsKt.isBlank(this.routeSignature)) {
            rebuildFlutterHost();
        }
        this.flutterDelegate.m56748N();
        if (this.miniVisible) {
            this.lifecycleHandlerChannel.m56790b();
        } else {
            this.lifecycleHandlerChannel.m56789a();
        }
        C44128b.m97259c(TAG, "onAttachedToWindow symbol=" + this.symbol);
    }
}
