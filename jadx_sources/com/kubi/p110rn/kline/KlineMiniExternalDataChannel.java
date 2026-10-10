package com.kubi.p110rn.kline;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.flutter.delegate.IChannelRegister;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KlineMiniExternalDataChannel.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 _2\u00020\u0001:\u0002^_B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\"H\u0016J\u0018\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010\f2\u0006\u0010*\u001a\u00020\fJ\u0010\u0010+\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\fJ\u0016\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\fJ\u0016\u00100\u001a\u00020\"2\u0006\u0010/\u001a\u00020\f2\u0006\u00101\u001a\u00020\fJ\u0010\u00102\u001a\u00020\"2\b\u00103\u001a\u0004\u0018\u000104J\u0006\u00105\u001a\u00020\"J\u0006\u00106\u001a\u00020\"J\u0006\u00107\u001a\u00020\"J\u001a\u00108\u001a\u00020\"2\b\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00109\u001a\u00020\u0017J\u000e\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020\u0013J\u0006\u0010<\u001a\u00020\"J\u0006\u0010=\u001a\u00020\"J&\u0010>\u001a\u00020\"2\u0014\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00190\u00192\u0006\u0010@\u001a\u00020\u000eH\u0002J\u0010\u0010A\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017H\u0002J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\fH\u0002J \u0010D\u001a\u0004\u0018\u00010\f2\u0014\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00190\u0019H\u0002JD\u0010E\u001a\u00020\"2\u000e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0G2\u0014\u0010H\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\"0I2\u0006\u0010J\u001a\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\"0GH\u0002J\b\u0010M\u001a\u00020\"H\u0002J&\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\f2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a0PH\u0002J&\u0010Q\u001a\u00020\"2\u0006\u0010O\u001a\u00020\f2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a0PH\u0002J\b\u0010R\u001a\u00020\"H\u0002J \u0010S\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00190\u00192\b\u0010T\u001a\u0004\u0018\u000104H\u0002J\u001a\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\b\u0010V\u001a\u0004\u0018\u000104H\u0002J\u001a\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\b\u0010X\u001a\u0004\u0018\u00010YH\u0002J\u001a\u0010Z\u001a\u0004\u0018\u00010\u001a2\u0006\u0010T\u001a\u0002042\u0006\u0010[\u001a\u00020\u0017H\u0002J\u001a\u0010\\\u001a\u0004\u0018\u00010\u001a2\u0006\u0010X\u001a\u00020Y2\u0006\u0010]\u001a\u00020\fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00190\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00190\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006`"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineMiniExternalDataChannel;", "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "mainHandler", "Landroid/os/Handler;", "pendingCalls", "Ljava/util/ArrayDeque;", "Lcom/kubi/rn/kline/KlineMiniExternalDataChannel$PendingCall;", "symbol", "", "externalEnabled", "", KlineFlutterMiniConstants.PROP_SHOW_BS_POINTS, "lastReplaceDigest", "hasDeliveredSnapshot", "lastLatestPrice", "", "Ljava/lang/Double;", "lastPeriod", "lastRealtimeRevision", "", "cachedCandlesPayload", "", "", "cachedRealtimeCandlesPayload", "cachedLatestPrice", "replaceCandlesRunnable", "Ljava/lang/Runnable;", "updateRealtimeCandlesRunnable", "updateLatestPriceRunnable", "registerWith", "", "context", "Landroid/content/Context;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "unregister", "updateExternalConfig", KlineFlutterMiniConstants.PROP_DATA_SOURCE, "nextSymbol", "updatePeriod", "period", "updateTradeOverlayVisibility", "nextShowBSPoints", "requestedSymbol", "refreshTradeOverlays", "scope", "updateCandles", KlineFlutterMiniConstants.PROP_CANDLES, "Lcom/facebook/react/bridge/ReadableArray;", "invalidateReplaceDigest", "resetRealtimeState", "resetSnapshotCache", "updateRealtimeCandles", "revision", "updateLatestPrice", FirebaseAnalytics.Param.PRICE, "resetExternalState", "replayCachedPayloads", "deliverReplaceCandles", "payload", "immediate", "deliverRealtimeCandles", "flushPendingRealtimeCandles", "reason", "buildCandlesDigest", "invokeThrottled", "runnableHolder", "Lkotlin/Function0;", "setter", "Lkotlin/Function1;", "delayMs", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "cancelThrottledTasks", "invokeOnMain", FirebaseAnalytics.Param.METHOD, "", "enqueuePending", "flushPendingCalls", "readableArrayToList", "array", "readableArrayRowToList", "row", "readableMapToRow", "map", "Lcom/facebook/react/bridge/ReadableMap;", "readableValue", "index", "readableMapValue", "key", "PendingCall", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineMiniExternalDataChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineMiniExternalDataChannel.kt\ncom/kubi/rn/kline/KlineMiniExternalDataChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,484:1\n1#2:485\n*E\n"})
public final class KlineMiniExternalDataChannel implements IChannelRegister {

    @NotNull
    private static final String DATA_SOURCE_EXTERNAL = "external";
    private static final long PENDING_FLUSH_DELAY_MS = 200;
    private static final int PENDING_MAX_SIZE = 200;

    @NotNull
    private static final String SCOPE_BS = "bs";
    private static final int SNAPSHOT_MIN_SIZE = 10;

    @NotNull
    private static final String TAG = "KlineMiniExternalData";
    private static final long UPDATE_CANDLES_THROTTLE_MS = 200;
    private static final long UPDATE_LATEST_PRICE_THROTTLE_MS = 300;

    @Nullable
    private Double cachedLatestPrice;

    @Nullable
    private MethodChannel channel;
    private boolean externalEnabled;
    private boolean hasDeliveredSnapshot;

    @Nullable
    private Double lastLatestPrice;

    @Nullable
    private String lastPeriod;
    private int lastRealtimeRevision;

    @Nullable
    private String lastReplaceDigest;

    @Nullable
    private Runnable replaceCandlesRunnable;

    @Nullable
    private Runnable updateLatestPriceRunnable;

    @Nullable
    private Runnable updateRealtimeCandlesRunnable;

    @NotNull
    private static final Set<String> TRADE_OVERLAY_SCOPES = SetsKt.setOf((Object[]) new String[]{"bs", "activeOrders", TtmlNode.COMBINE_ALL});

    @NotNull
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private final ArrayDeque<PendingCall> pendingCalls = new ArrayDeque<>();

    @NotNull
    private String symbol = "";
    private boolean showBSPoints = true;

    @NotNull
    private List<? extends List<? extends Object>> cachedCandlesPayload = CollectionsKt.emptyList();

    @NotNull
    private List<? extends List<? extends Object>> cachedRealtimeCandlesPayload = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: com.kubi.rn.kline.KlineMiniExternalDataChannel$a, reason: from toString */
    /* JADX INFO: compiled from: KlineMiniExternalDataChannel.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineMiniExternalDataChannel$PendingCall;", "", FirebaseAnalytics.Param.METHOD, "", "payload", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getMethod", "()Ljava/lang/String;", "getPayload", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PendingCall {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String method;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final Map<String, Object> payload;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingCall)) {
                return false;
            }
            PendingCall pendingCall = (PendingCall) other;
            return Intrinsics.areEqual(this.method, pendingCall.method) && Intrinsics.areEqual(this.payload, pendingCall.payload);
        }

        public PendingCall(@NotNull String method, @NotNull Map<String, ? extends Object> payload) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.method = method;
            this.payload = payload;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Map<String, Object> m56070b() {
            return this.payload;
        }

        public int hashCode() {
            return (this.method.hashCode() * 31) + this.payload.hashCode();
        }

        @NotNull
        public String toString() {
            return "PendingCall(method=" + this.method + ", payload=" + this.payload + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeThrottled$lambda$19(Function1 function1, Function0 function0) {
        function1.invoke(null);
        function0.invoke();
    }

    public final void invalidateReplaceDigest() {
        this.lastReplaceDigest = null;
    }

    public final void resetExternalState() {
        this.lastReplaceDigest = null;
        this.hasDeliveredSnapshot = false;
        this.lastLatestPrice = null;
        this.lastPeriod = null;
        this.lastRealtimeRevision = 0;
        cancelThrottledTasks();
    }

    public final void updateRealtimeCandles(@Nullable ReadableArray candles, int revision) {
        List<List<Object>> list = readableArrayToList(candles);
        if (!list.isEmpty()) {
            this.cachedRealtimeCandlesPayload = list;
            C44128b.m97259c(TAG, "updateRealtimeCandles recv size=" + list.size() + " revision=" + revision + " symbol=" + this.symbol + " externalEnabled=" + this.externalEnabled + " hasSnapshot=" + this.hasDeliveredSnapshot);
        } else {
            if (candles == null || candles.size() != 0) {
                C44128b.m97259c(TAG, "updateRealtimeCandles skip empty payload symbol=" + this.symbol + " revision=" + revision);
                return;
            }
            this.cachedRealtimeCandlesPayload = CollectionsKt.emptyList();
            this.lastRealtimeRevision = 0;
            C44128b.m97259c(TAG, "updateRealtimeCandles clear symbol=" + this.symbol + " revision=" + revision);
        }
        if (revision > 0 && revision != this.lastRealtimeRevision) {
            this.lastRealtimeRevision = revision;
        }
        if (!this.externalEnabled) {
            C44128b.m97259c(TAG, "updateRealtimeCandles skip external disabled size=" + list.size() + " symbol=" + this.symbol);
            return;
        }
        if (this.hasDeliveredSnapshot) {
            deliverRealtimeCandles(revision);
            return;
        }
        C44128b.m97259c(TAG, "updateRealtimeCandles queued size=" + this.cachedRealtimeCandlesPayload.size() + " symbol=" + this.symbol + " revision=" + revision + " waitingSnapshot=true");
    }

    /* JADX INFO: compiled from: KlineMiniExternalDataChannel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Array.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Null.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void cancelThrottledTasks() {
        Runnable runnable = this.replaceCandlesRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.updateRealtimeCandlesRunnable;
        if (runnable2 != null) {
            this.mainHandler.removeCallbacks(runnable2);
        }
        Runnable runnable3 = this.updateLatestPriceRunnable;
        if (runnable3 != null) {
            this.mainHandler.removeCallbacks(runnable3);
        }
        this.replaceCandlesRunnable = null;
        this.updateRealtimeCandlesRunnable = null;
        this.updateLatestPriceRunnable = null;
    }

    private final void deliverRealtimeCandles(final int revision) {
        final List<? extends List<? extends Object>> list = this.cachedRealtimeCandlesPayload;
        if (list.isEmpty()) {
            C44128b.m97259c(TAG, "deliverRealtimeCandles skip empty symbol=" + this.symbol + " revision=" + revision);
            return;
        }
        final boolean z11 = revision > 0 && revision != this.lastRealtimeRevision;
        if (z11) {
            this.lastRealtimeRevision = revision;
        }
        final Function0 function0 = new Function0() { // from class: com.kubi.rn.kline.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KlineMiniExternalDataChannel.deliverRealtimeCandles$lambda$12(this.f46056b, list, revision, z11);
            }
        };
        if (!z11) {
            invokeThrottled(new Function0() { // from class: com.kubi.rn.kline.c0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f46061b.updateRealtimeCandlesRunnable;
                }
            }, new Function1() { // from class: com.kubi.rn.kline.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KlineMiniExternalDataChannel.deliverRealtimeCandles$lambda$15(this.f46063b, (Runnable) obj);
                }
            }, 200L, new Function0() { // from class: com.kubi.rn.kline.e0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KlineMiniExternalDataChannel.deliverRealtimeCandles$lambda$16(function0);
                }
            });
            return;
        }
        Runnable runnable = this.updateRealtimeCandlesRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.updateRealtimeCandlesRunnable = null;
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deliverRealtimeCandles$lambda$12(KlineMiniExternalDataChannel klineMiniExternalDataChannel, List list, int i11, boolean z11) {
        klineMiniExternalDataChannel.invokeOnMain("updateCandles", MapsKt.mapOf(TuplesKt.m90091to("symbol", klineMiniExternalDataChannel.symbol), TuplesKt.m90091to(KlineFlutterMiniConstants.PROP_CANDLES, list)));
        C44128b.m97259c(TAG, "deliverRealtimeCandles size=" + list.size() + " symbol=" + klineMiniExternalDataChannel.symbol + " revision=" + i11 + " force=" + z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deliverRealtimeCandles$lambda$15(KlineMiniExternalDataChannel klineMiniExternalDataChannel, Runnable runnable) {
        klineMiniExternalDataChannel.updateRealtimeCandlesRunnable = runnable;
        return Unit.INSTANCE;
    }

    private final void deliverReplaceCandles(final List<? extends List<? extends Object>> payload, boolean immediate) {
        final Function0 function0 = new Function0() { // from class: com.kubi.rn.kline.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KlineMiniExternalDataChannel.deliverReplaceCandles$lambda$7(this.f46067b, payload);
            }
        };
        if (!immediate) {
            invokeThrottled(new Function0() { // from class: com.kubi.rn.kline.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f46070b.replaceCandlesRunnable;
                }
            }, new Function1() { // from class: com.kubi.rn.kline.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KlineMiniExternalDataChannel.deliverReplaceCandles$lambda$10(this.f46089b, (Runnable) obj);
                }
            }, 200L, new Function0() { // from class: com.kubi.rn.kline.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KlineMiniExternalDataChannel.deliverReplaceCandles$lambda$11(function0);
                }
            });
            return;
        }
        Runnable runnable = this.replaceCandlesRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.replaceCandlesRunnable = null;
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deliverReplaceCandles$lambda$10(KlineMiniExternalDataChannel klineMiniExternalDataChannel, Runnable runnable) {
        klineMiniExternalDataChannel.replaceCandlesRunnable = runnable;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deliverReplaceCandles$lambda$7(KlineMiniExternalDataChannel klineMiniExternalDataChannel, List list) {
        klineMiniExternalDataChannel.invokeOnMain("replaceCandles", MapsKt.mapOf(TuplesKt.m90091to("symbol", klineMiniExternalDataChannel.symbol), TuplesKt.m90091to(KlineFlutterMiniConstants.PROP_CANDLES, list)));
        klineMiniExternalDataChannel.hasDeliveredSnapshot = true;
        C44128b.m97259c(TAG, "replaceCandles size=" + list.size() + " symbol=" + klineMiniExternalDataChannel.symbol);
        klineMiniExternalDataChannel.flushPendingRealtimeCandles("afterReplaceCandles");
        return Unit.INSTANCE;
    }

    private final void enqueuePending(String method, Map<String, ? extends Object> payload) {
        if (this.pendingCalls.size() >= 200) {
            this.pendingCalls.removeFirst();
        }
        this.pendingCalls.addLast(new PendingCall(method, payload));
    }

    private final void flushPendingCalls() {
        while (!this.pendingCalls.isEmpty()) {
            PendingCall pendingCallRemoveFirst = this.pendingCalls.removeFirst();
            invokeOnMain(pendingCallRemoveFirst.getMethod(), pendingCallRemoveFirst.m56070b());
        }
    }

    private final void flushPendingRealtimeCandles(String reason) {
        if (this.externalEnabled && this.hasDeliveredSnapshot && !this.cachedRealtimeCandlesPayload.isEmpty()) {
            Runnable runnable = this.updateRealtimeCandlesRunnable;
            if (runnable != null) {
                this.mainHandler.removeCallbacks(runnable);
            }
            this.updateRealtimeCandlesRunnable = null;
            invokeOnMain("updateCandles", MapsKt.mapOf(TuplesKt.m90091to("symbol", this.symbol), TuplesKt.m90091to(KlineFlutterMiniConstants.PROP_CANDLES, this.cachedRealtimeCandlesPayload)));
            C44128b.m97259c(TAG, "flushPendingRealtimeCandles reason=" + reason + " size=" + this.cachedRealtimeCandlesPayload.size() + " symbol=" + this.symbol + " revision=" + this.lastRealtimeRevision);
        }
    }

    private final void invokeOnMain(String method, Map<String, ? extends Object> payload) {
        Object objM103844constructorimpl;
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            enqueuePending(method, payload);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (methodChannel != null) {
                methodChannel.invokeMethod(method, payload);
            }
            C44128b.m97259c(TAG, "invoke " + method + " symbol=" + this.symbol);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n(TAG, "invoke " + method + " failed: " + thM103847exceptionOrNullimpl.getMessage());
        }
    }

    private final List<Object> readableArrayRowToList(ReadableArray row) {
        if (row == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(row.size());
        int size = row.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(readableValue(row, i11));
        }
        return arrayList;
    }

    private final List<List<Object>> readableArrayToList(ReadableArray array) {
        if (array == null || array.size() == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(array.size());
        int size = array.size();
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[array.getType(i11).ordinal()];
            if (i12 == 1) {
                arrayList.add(readableArrayRowToList(array.getArray(i11)));
            } else if (i12 == 2) {
                arrayList.add(readableMapToRow(array.getMap(i11)));
            }
        }
        return arrayList;
    }

    private final List<Object> readableMapToRow(ReadableMap map) {
        return map == null ? CollectionsKt.emptyList() : CollectionsKt.listOf(readableMapValue(map, "time"), readableMapValue(map, TtmlNode.TEXT_EMPHASIS_MARK_OPEN), readableMapValue(map, "close"), readableMapValue(map, "high"), readableMapValue(map, "low"), null, readableMapValue(map, "volume"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateLatestPrice$lambda$4(KlineMiniExternalDataChannel klineMiniExternalDataChannel, Runnable runnable) {
        klineMiniExternalDataChannel.updateLatestPriceRunnable = runnable;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateLatestPrice$lambda$5(KlineMiniExternalDataChannel klineMiniExternalDataChannel, double d11) {
        klineMiniExternalDataChannel.invokeOnMain("updateLatestPrice", MapsKt.mapOf(TuplesKt.m90091to("symbol", klineMiniExternalDataChannel.symbol), TuplesKt.m90091to(FirebaseAnalytics.Param.PRICE, Double.valueOf(d11))));
        C44128b.m97259c(TAG, "updateLatestPrice price=" + d11 + " symbol=" + klineMiniExternalDataChannel.symbol);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateRealtimeCandles$default(KlineMiniExternalDataChannel klineMiniExternalDataChannel, ReadableArray readableArray, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        klineMiniExternalDataChannel.updateRealtimeCandles(readableArray, i11);
    }

    public final void refreshTradeOverlays(@NotNull String requestedSymbol, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(requestedSymbol, "requestedSymbol");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (StringsKt.isBlank(requestedSymbol) || !Intrinsics.areEqual(requestedSymbol, this.symbol)) {
            C44128b.m97259c(TAG, "refreshTradeOverlays skip requested=" + requestedSymbol + " current=" + this.symbol + " scope=" + scope);
            return;
        }
        if (!TRADE_OVERLAY_SCOPES.contains(scope)) {
            C44128b.m97270n(TAG, "refreshTradeOverlays skip invalid scope=" + scope + " symbol=" + this.symbol);
            return;
        }
        if (!Intrinsics.areEqual(scope, "bs") || this.showBSPoints) {
            invokeOnMain("refreshTradeOverlays", MapsKt.mapOf(TuplesKt.m90091to("symbol", this.symbol), TuplesKt.m90091to("scope", scope)));
            return;
        }
        C44128b.m97259c(TAG, "refreshTradeOverlays skip hidden bs symbol=" + this.symbol);
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void registerWith(@NotNull Context context, @NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        this.channel = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), KlineFlutterMiniConstants.EXTERNAL_DATA_CHANNEL, StandardMethodCodec.INSTANCE);
        this.mainHandler.postDelayed(new Runnable() { // from class: com.kubi.rn.kline.a0
            @Override // java.lang.Runnable
            public final void run() {
                KlineMiniExternalDataChannel.registerWith$lambda$0(this.f46054b);
            }
        }, 200L);
    }

    public final void replayCachedPayloads() {
        if (!this.cachedCandlesPayload.isEmpty()) {
            this.lastReplaceDigest = null;
            deliverReplaceCandles(this.cachedCandlesPayload, true);
            C44128b.m97259c(TAG, "replay replaceCandles size=" + this.cachedCandlesPayload.size() + " symbol=" + this.symbol);
        }
        if (!this.cachedRealtimeCandlesPayload.isEmpty()) {
            invokeOnMain("updateCandles", MapsKt.mapOf(TuplesKt.m90091to("symbol", this.symbol), TuplesKt.m90091to(KlineFlutterMiniConstants.PROP_CANDLES, this.cachedRealtimeCandlesPayload)));
            C44128b.m97259c(TAG, "replay updateCandles size=" + this.cachedRealtimeCandlesPayload.size() + " symbol=" + this.symbol);
        }
        Double d11 = this.cachedLatestPrice;
        if (d11 != null) {
            double dDoubleValue = d11.doubleValue();
            this.lastLatestPrice = null;
            updateLatestPrice(dDoubleValue);
        }
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void unregister() {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.channel = null;
        this.pendingCalls.clear();
        cancelThrottledTasks();
    }

    public final void updateExternalConfig(@Nullable String dataSource, @NotNull String nextSymbol) {
        Intrinsics.checkNotNullParameter(nextSymbol, "nextSymbol");
        boolean zAreEqual = Intrinsics.areEqual(dataSource, DATA_SOURCE_EXTERNAL);
        if (zAreEqual == this.externalEnabled && Intrinsics.areEqual(nextSymbol, this.symbol)) {
            C44128b.m97259c(TAG, "setExternalDataEnabled skip enabled=" + zAreEqual + " symbol=" + nextSymbol);
            return;
        }
        this.externalEnabled = zAreEqual;
        this.symbol = nextSymbol;
        C44128b.m97259c(TAG, "setExternalDataEnabled enabled=" + zAreEqual + " symbol=" + nextSymbol);
        invokeOnMain("setExternalDataEnabled", MapsKt.mapOf(TuplesKt.m90091to("enabled", Boolean.valueOf(zAreEqual)), TuplesKt.m90091to("symbol", nextSymbol)));
        if (zAreEqual) {
            replayCachedPayloads();
        }
    }

    public final void updatePeriod(@Nullable String period) {
        if (period == null || StringsKt.isBlank(period) || StringsKt.isBlank(this.symbol) || Intrinsics.areEqual(period, this.lastPeriod)) {
            C44128b.m97259c(TAG, "updatePeriod skip period=" + period + " symbol=" + this.symbol + " lastPeriod=" + this.lastPeriod);
            return;
        }
        this.lastPeriod = period;
        C44128b.m97259c(TAG, "updatePeriod period=" + period + " symbol=" + this.symbol + " externalEnabled=" + this.externalEnabled);
        invokeOnMain("updatePeriod", MapsKt.mapOf(TuplesKt.m90091to("symbol", this.symbol), TuplesKt.m90091to("period", period)));
    }

    public final void updateTradeOverlayVisibility(boolean nextShowBSPoints, @NotNull String requestedSymbol) {
        Intrinsics.checkNotNullParameter(requestedSymbol, "requestedSymbol");
        if (StringsKt.isBlank(requestedSymbol) || !Intrinsics.areEqual(requestedSymbol, this.symbol)) {
            C44128b.m97259c(TAG, "setTradeOverlayVisibility skip requested=" + requestedSymbol + " current=" + this.symbol);
            return;
        }
        if (this.showBSPoints != nextShowBSPoints) {
            this.showBSPoints = nextShowBSPoints;
            invokeOnMain("setTradeOverlayVisibility", MapsKt.mapOf(TuplesKt.m90091to("symbol", this.symbol), TuplesKt.m90091to(KlineFlutterMiniConstants.PROP_SHOW_BS_POINTS, Boolean.valueOf(nextShowBSPoints))));
            return;
        }
        C44128b.m97259c(TAG, "setTradeOverlayVisibility skip same=" + nextShowBSPoints + " symbol=" + this.symbol);
    }

    private final String buildCandlesDigest(List<? extends List<? extends Object>> payload) {
        if (payload.isEmpty()) {
            return null;
        }
        List list = (List) CollectionsKt.last((List) payload);
        if (list.size() < 3) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(payload.size());
        sb2.append(':');
        sb2.append(list.get(0));
        sb2.append(':');
        sb2.append(list.get(2));
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deliverRealtimeCandles$lambda$16(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deliverReplaceCandles$lambda$11(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void invokeThrottled(Function0<? extends Runnable> runnableHolder, final Function1<? super Runnable, Unit> setter, long delayMs, final Function0<Unit> action) {
        Runnable runnableInvoke = runnableHolder.invoke();
        if (runnableInvoke != null) {
            this.mainHandler.removeCallbacks(runnableInvoke);
        }
        Runnable runnable = new Runnable() { // from class: com.kubi.rn.kline.x
            @Override // java.lang.Runnable
            public final void run() {
                KlineMiniExternalDataChannel.invokeThrottled$lambda$19(setter, action);
            }
        };
        setter.invoke(runnable);
        this.mainHandler.postDelayed(runnable, delayMs);
    }

    private final Object readableMapValue(ReadableMap map, String key) {
        if (!map.hasKey(key)) {
            return null;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[map.getType(key).ordinal()];
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    return null;
                }
                return map.getString(key);
            }
            return Double.valueOf(map.getDouble(key));
        }
        return Boolean.valueOf(map.getBoolean(key));
    }

    private final Object readableValue(ReadableArray array, int index) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[array.getType(index).ordinal()];
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    return null;
                }
                return array.getString(index);
            }
            return Double.valueOf(array.getDouble(index));
        }
        return Boolean.valueOf(array.getBoolean(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerWith$lambda$0(KlineMiniExternalDataChannel klineMiniExternalDataChannel) {
        klineMiniExternalDataChannel.flushPendingCalls();
        if (klineMiniExternalDataChannel.externalEnabled && !klineMiniExternalDataChannel.cachedCandlesPayload.isEmpty()) {
            klineMiniExternalDataChannel.replayCachedPayloads();
        }
    }

    public final void resetRealtimeState() {
        this.cachedRealtimeCandlesPayload = CollectionsKt.emptyList();
        this.lastRealtimeRevision = 0;
        Runnable runnable = this.updateRealtimeCandlesRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.updateRealtimeCandlesRunnable = null;
    }

    public final void resetSnapshotCache() {
        this.cachedCandlesPayload = CollectionsKt.emptyList();
        this.hasDeliveredSnapshot = false;
        Runnable runnable = this.replaceCandlesRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.replaceCandlesRunnable = null;
    }

    public final void updateCandles(@Nullable ReadableArray candles) {
        boolean z11;
        List<List<Object>> list = readableArrayToList(candles);
        this.cachedCandlesPayload = list;
        if (this.externalEnabled && !list.isEmpty()) {
            String strBuildCandlesDigest = buildCandlesDigest(list);
            if (strBuildCandlesDigest != null && Intrinsics.areEqual(strBuildCandlesDigest, this.lastReplaceDigest)) {
                C44128b.m97259c(TAG, "replaceCandles skip same digest=" + strBuildCandlesDigest + " symbol=" + this.symbol);
                return;
            }
            this.lastReplaceDigest = strBuildCandlesDigest;
            if (list.size() > 10) {
                z11 = true;
            } else {
                z11 = false;
            }
            deliverReplaceCandles(list, z11);
            return;
        }
        C44128b.m97259c(TAG, "replaceCandles skip externalEnabled=" + this.externalEnabled + " size=" + list.size() + " symbol=" + this.symbol);
    }

    public final void updateLatestPrice(final double price) {
        this.cachedLatestPrice = Double.valueOf(price);
        if (!this.externalEnabled) {
            C44128b.m97259c(TAG, "updateLatestPrice skip external disabled price=" + price + " symbol=" + this.symbol);
            return;
        }
        if (Intrinsics.areEqual(this.lastLatestPrice, price)) {
            C44128b.m97259c(TAG, "updateLatestPrice skip same price=" + price + " symbol=" + this.symbol);
            return;
        }
        this.lastLatestPrice = Double.valueOf(price);
        invokeThrottled(new Function0() { // from class: com.kubi.rn.kline.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f46088b.updateLatestPriceRunnable;
            }
        }, new Function1() { // from class: com.kubi.rn.kline.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlineMiniExternalDataChannel.updateLatestPrice$lambda$4(this.f46093b, (Runnable) obj);
            }
        }, 300L, new Function0() { // from class: com.kubi.rn.kline.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KlineMiniExternalDataChannel.updateLatestPrice$lambda$5(this.f46094b, price);
            }
        });
    }
}
