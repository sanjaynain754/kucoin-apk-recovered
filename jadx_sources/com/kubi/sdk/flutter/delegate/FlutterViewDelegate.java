package com.kubi.sdk.flutter.delegate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.flutter.FlutterEvent;
import com.kubi.sdk.flutter.FlutterMethodChannel;
import com.kubi.sdk.flutter.FlutterRouterChannel;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.flutter.event.CommonEventHandlerChannel;
import com.kubi.sdk.flutter.event.FlutterEventHubChannel;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.sdk.flutter.ui.CustomFlutterView;
import com.kubi.sdk.flutter.ui.FlutterMode;
import com.kubi.utils.extensions.C27025c;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.flutter.FlutterInjector;
import io.flutter.embedding.android.ExclusiveAppComponent;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p569qq.C43846g;
import p609ry.C44199a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterViewDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 m2\u00020\u0001:\u0003mnoB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010'\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u0006H\u0007J\u0016\u0010+\u001a\u00020\"2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!J\u0014\u0010,\u001a\u00020\"2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001fJ\u000e\u0010-\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u001cJ\u0006\u0010;\u001a\u00020\"J\u001a\u0010<\u001a\u00020\"2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010>J\b\u0010?\u001a\u00020\"H\u0007J\u000e\u0010@\u001a\u00020\"H\u0087@¢\u0006\u0002\u0010AJ\b\u0010B\u001a\u00020\"H\u0007J\b\u0010C\u001a\u00020\"H\u0002J\u0010\u0010D\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u0006H\u0002J\b\u0010F\u001a\u00020\"H\u0002J\u000e\u0010\u0016\u001a\u00020\"2\u0006\u0010G\u001a\u00020\u0017J\b\u0010H\u001a\u00020\"H\u0002J\u0010\u0010I\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010J\u001a\u00020\"J\u0006\u0010K\u001a\u00020\"J\u0006\u0010L\u001a\u00020\"J\b\u0010M\u001a\u00020\"H\u0002J\u0010\u0010N\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010O\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010P\u001a\u00020\"H\u0002J\u0006\u0010Q\u001a\u00020\"J\u0006\u0010R\u001a\u00020\"J\u000e\u0010S\u001a\u00020\"2\u0006\u0010T\u001a\u00020\u0006J\u0006\u0010U\u001a\u00020\"J\u0006\u0010V\u001a\u00020\"J\u000e\u0010W\u001a\u00020\"2\u0006\u0010X\u001a\u00020YJ\u0006\u0010Z\u001a\u00020\"J\b\u0010[\u001a\u00020\"H\u0002J\u0006\u0010\\\u001a\u00020\u0006J+\u0010]\u001a\u00020\"2\u0006\u0010^\u001a\u00020\r2\u000e\u0010_\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110`2\u0006\u0010a\u001a\u00020b¢\u0006\u0002\u0010cJ \u0010d\u001a\u00020\"2\u0006\u0010^\u001a\u00020\r2\u0006\u0010e\u001a\u00020\r2\b\u0010f\u001a\u0004\u0018\u00010YJ\u000e\u0010g\u001a\u00020\"2\u0006\u0010h\u001a\u00020\rJ\u0006\u0010i\u001a\u00020\"J\b\u0010j\u001a\u00020\u0006H\u0007J\b\u0010k\u001a\u0004\u0018\u00010lR\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b8\u00109¨\u0006p"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;", "", "<init>", "()V", "flutterUiDisplayed", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "mainHandler", "Landroid/os/Handler;", "viewDisplayListener", "Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate$FlutterViewDisplayListener;", "lifecycleState", "", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "initialRoute", "", "flutterView", "Lio/flutter/embedding/android/FlutterView;", "context", "Landroid/content/Context;", "bindActivity", "Lcom/kubi/sdk/BaseActivity;", "platformPlugin", "Lio/flutter/plugin/platform/PlatformPlugin;", "channelRegisters", "", "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;", "isAttached", "entrypointArgs", "", "onLoadListener", "Lkotlin/Function0;", "", "onLoadDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "trackHelper", "Lcom/kubi/sdk/flutter/delegate/FlutterTrackHelper;", "onCreate", TtmlNode.TAG_LAYOUT, "Landroid/widget/FrameLayout;", "textureMode", "setLoadListener", "setEntrypointArgs", "setInitialRoute", "addChannelRegister", "register", "eventChannel", "Lcom/kubi/sdk/flutter/event/CommonEventHandlerChannel;", "getEventChannel", "()Lcom/kubi/sdk/flutter/event/CommonEventHandlerChannel;", "eventChannel$delegate", "Lkotlin/Lazy;", "lifecycleHandlerChannel", "Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;", "getLifecycleHandlerChannel", "()Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;", "lifecycleHandlerChannel$delegate", "addCommonHandlerChannel", "sendEvent", ReportDataTable.COLUMN_PARAMS, "", "startLoad", "loadAsync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSync", "onLoaded", "executeLoader", BaseJavaModule.METHOD_TYPE_ASYNC, "loadFlutterEngine", "activity", "attachToActivity", "detachPlatformViewsControllerIfNeeded", "onPostResume", "onAttach", "onDetach", "updateSystemUiOverlays", "loadDartEntrypoint", "configureFlutterEngine", "attachToFlutterEngine", "onResume", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onWindowFocusChanged", "hasFocus", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onPause", "onNewIntent", "intent", "Landroid/content/Intent;", "onDestroy", "release", "onBackPressed", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onActivityResult", "resultCode", "data", "onTrimMemory", FirebaseAnalytics.Param.LEVEL, "onUserLeaveHint", "hasChannelRegisters", "getRendererBitmap", "Landroid/graphics/Bitmap;", "Companion", "FlutterViewDisplayListener", "AppComponent", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterViewDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterViewDelegate.kt\ncom/kubi/sdk/flutter/delegate/FlutterViewDelegate\n+ 2 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,762:1\n44#2,15:763\n44#2,15:778\n44#2,15:795\n44#2,15:810\n1869#3,2:793\n1869#3,2:832\n774#3:834\n865#3,2:835\n1193#3,2:837\n1267#3,4:839\n35#4,4:825\n39#4:831\n44#5,2:829\n*S KotlinDebug\n*F\n+ 1 FlutterViewDelegate.kt\ncom/kubi/sdk/flutter/delegate/FlutterViewDelegate\n*L\n254#1:763,15\n456#1:778,15\n600#1:795,15\n628#1:810,15\n464#1:793,2\n648#1:832,2\n558#1:834\n558#1:835,2\n559#1:837,2\n559#1:839,4\n647#1:825,4\n647#1:831\n647#1:829,2\n*E\n"})
public final class FlutterViewDelegate {

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final Companion f46631s = new Companion(null);

    /* JADX INFO: renamed from: d */
    public int f46635d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public FlutterEngine f46636e;

    /* JADX INFO: renamed from: g */
    @Nullable
    public FlutterView f46638g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Context f46639h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public BaseActivity f46640i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public PlatformPlugin f46641j;

    /* JADX INFO: renamed from: l */
    public boolean f46643l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public List<String> f46644m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public Function0<Unit> f46645n;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AtomicReference<Boolean> f46632a = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Handler f46633b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C23727b f46634c = new C23727b();

    /* JADX INFO: renamed from: f */
    @NotNull
    public String f46637f = "/";

    /* JADX INFO: renamed from: k */
    @NotNull
    public List<IChannelRegister> f46642k = new ArrayList();

    /* JADX INFO: renamed from: o */
    @NotNull
    public final InterfaceC41769w<Unit> f46646o = C41777y.m91388c(null, 1, null);

    /* JADX INFO: renamed from: p */
    @NotNull
    public final FlutterTrackHelper f46647p = new FlutterTrackHelper();

    /* JADX INFO: renamed from: q */
    @NotNull
    public final Lazy f46648q = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.delegate.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlutterViewDelegate.m56734o();
        }
    });

    /* JADX INFO: renamed from: r */
    @NotNull
    public final Lazy f46649r = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.delegate.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlutterViewDelegate.m56737u();
        }
    });

    /* JADX INFO: compiled from: FlutterViewDelegate.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate$Companion;", "", "<init>", "()V", "TAGS", "", "NONE", "", "ON_CREATE", "ON_RESUME", "ON_SHOW", "ON_HIDE", "ON_PAUSE", "ON_DESTROY", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.FlutterViewDelegate$a */
    /* JADX INFO: compiled from: FlutterViewDelegate.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate$AppComponent;", "Lio/flutter/embedding/android/ExclusiveAppComponent;", "Landroid/app/Activity;", "activity", "Lcom/kubi/sdk/BaseActivity;", "<init>", "(Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;Lcom/kubi/sdk/BaseActivity;)V", "getActivity", "()Lcom/kubi/sdk/BaseActivity;", "detachFromFlutterEngine", "", "getAppComponent", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C23726a implements ExclusiveAppComponent<Activity> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final BaseActivity f46650a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FlutterViewDelegate f46651b;

        public C23726a(@NotNull FlutterViewDelegate flutterViewDelegate, BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f46651b = flutterViewDelegate;
            this.f46650a = activity;
        }

        @Override // io.flutter.embedding.android.ExclusiveAppComponent
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Activity getAppComponent() {
            return this.f46650a;
        }

        @Override // io.flutter.embedding.android.ExclusiveAppComponent
        public void detachFromFlutterEngine() {
            this.f46651b.m56741E();
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.FlutterViewDelegate$b */
    /* JADX INFO: compiled from: FlutterViewDelegate.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate$FlutterViewDisplayListener;", "Lio/flutter/embedding/engine/renderer/FlutterUiDisplayListener;", "<init>", "(Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;)V", "onFlutterUiDisplayed", "", "onFlutterUiNoLongerDisplayed", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C23727b implements FlutterUiDisplayListener {
        public C23727b() {
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiDisplayed() throws JSONException {
            if (((Boolean) FlutterViewDelegate.this.f46632a.getAndSet(Boolean.TRUE)).booleanValue()) {
                return;
            }
            FlutterViewDelegate.this.m56743H();
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiNoLongerDisplayed() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.FlutterViewDelegate$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C23728c extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: J */
    public static final Pair<String, Map<String, Object>> m56726J(String str) {
        String strSubstring;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6, (Object) null);
        String strTake = iIndexOf$default >= 0 ? StringsKt.take(str, iIndexOf$default) : str;
        if (iIndexOf$default >= 0) {
            strSubstring = str.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) strSubstring, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (StringsKt.contains$default((CharSequence) obj, (CharSequence) "=", false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 2, 2, (Object) null);
            Pair pairM90091to = TuplesKt.m90091to((String) listSplit$default2.get(0), (String) listSplit$default2.get(1));
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return TuplesKt.m90091to(strTake, linkedHashMap);
    }

    /* JADX INFO: renamed from: G */
    public final void m56742G() {
        this.f46635d = 4;
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine != null) {
            flutterEngine.getLifecycleChannel().appIsPaused();
        }
        m56769t().m56789a();
    }

    /* JADX INFO: renamed from: K */
    public final void m56745K() {
        this.f46635d = 5;
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine != null) {
            flutterEngine.getLifecycleChannel().appIsInactive();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m56749O() {
        this.f46635d = 3;
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine != null) {
            flutterEngine.getLifecycleChannel().appIsResumed();
        }
        m56769t().m56790b();
    }

    /* JADX INFO: renamed from: S */
    public final void m56753S() {
        Object objM20457a = null;
        this.f46636e = null;
        this.f46638g = null;
        this.f46641j = null;
        this.f46632a.set(Boolean.FALSE);
        this.f46635d = 10;
        this.f46640i = null;
        this.f46643l = false;
        this.f46647p.m56714a();
        this.f46645n = null;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C23728c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_mem_flutter_unregister", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
        }
        if (C27025c.m66567e((Boolean) objM20457a, true)) {
            Iterator<T> it = this.f46642k.iterator();
            while (it.hasNext()) {
                ((IChannelRegister) it.next()).unregister();
            }
        }
        this.f46642k.clear();
    }

    @MainThread
    /* JADX INFO: renamed from: X */
    public final void m56758X() throws JSONException {
        m56767p(true);
    }

    @MainThread
    /* JADX INFO: renamed from: y */
    public final void m56773y() throws JSONException {
        m56767p(false);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m56724D(FlutterViewDelegate flutterViewDelegate, Context context, FrameLayout frameLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        flutterViewDelegate.m56740C(context, frameLayout, z11);
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m56725F(FlutterEngine flutterEngine) {
        LifecycleChannel lifecycleChannel;
        if (flutterEngine != null && (lifecycleChannel = flutterEngine.getLifecycleChannel()) != null) {
            lifecycleChannel.appIsDetached();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final CommonEventHandlerChannel m56734o() {
        return new CommonEventHandlerChannel();
    }

    /* JADX INFO: renamed from: u */
    public static final LifecycleHandlerChannel m56737u() {
        return new LifecycleHandlerChannel();
    }

    /* JADX INFO: renamed from: A */
    public final void m56738A() throws JSONException {
        if (this.f46643l) {
            return;
        }
        if (this.f46636e == null) {
            m56767p(true);
        }
        m56762j();
        this.f46643l = true;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m56739B() {
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine == null) {
            return false;
        }
        flutterEngine.getNavigationChannel().popRoute();
        return true;
    }

    @MainThread
    /* JADX INFO: renamed from: C */
    public final void m56740C(@NotNull Context context, @NotNull FrameLayout layout, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f46639h = context;
        CustomFlutterView customFlutterView = z11 ? new CustomFlutterView(context, FlutterMode.b.f46782a) : new CustomFlutterView(context, FlutterMode.a.f46781a);
        customFlutterView.addOnFirstFrameRenderedListener(this.f46634c);
        layout.addView(customFlutterView, 0);
        this.f46638g = customFlutterView;
        this.f46635d = 1;
        this.f46647p.m56716c();
    }

    /* JADX INFO: renamed from: E */
    public final void m56741E() {
        Object objM103844constructorimpl;
        this.f46635d = 10;
        C44128b.m97266j("FlutterViewDelegate", "detachFromFlutterEngine destroy");
        try {
            KCFlutterRouteManager kCFlutterRouteManager = KCFlutterRouteManager.f46704a;
            BaseActivity baseActivity = this.f46640i;
            kCFlutterRouteManager.m56852r(baseActivity != null ? baseActivity.getIntent() : null);
            if (FlutterAnrStopgapConfig.f46661a.m56794d()) {
                this.f46633b.removeCallbacksAndMessages(null);
                final FlutterEngine flutterEngine = this.f46636e;
                FlutterView flutterView = this.f46638g;
                BaseActivity baseActivity2 = this.f46640i;
                PlatformPlugin platformPlugin = this.f46641j;
                if (baseActivity2 != null && flutterEngine != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        flutterEngine.getActivityControlSurface().detachFromActivity();
                        objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        String message = thM103847exceptionOrNullimpl.getMessage();
                        if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                            C44199a.m97421b(thM103847exceptionOrNullimpl, "detachFromActivity failed");
                        } else {
                            C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "detachFromActivity failed", true, null, 8, null), null, 2, null);
                        }
                    }
                }
                if (platformPlugin != null) {
                    platformPlugin.destroy();
                }
                this.f46641j = null;
                if (flutterView != null) {
                    flutterView.removeOnFirstFrameRenderedListener(this.f46634c);
                }
                FlutterEngineShutdownHelper.m56806j(FlutterEngineShutdownHelper.f46676a, flutterView, flutterEngine, new Function0() { // from class: com.kubi.sdk.flutter.delegate.s
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FlutterViewDelegate.m56725F(flutterEngine);
                    }
                }, null, null, null, 56, null);
            } else {
                FlutterEngine flutterEngine2 = this.f46636e;
                if (flutterEngine2 != null) {
                    FlutterEngineShutdownHelper flutterEngineShutdownHelper = FlutterEngineShutdownHelper.f46676a;
                    flutterEngineShutdownHelper.m56809d(flutterEngine2);
                    flutterEngineShutdownHelper.m56810e(flutterEngine2);
                    flutterEngine2.getLifecycleChannel().appIsDetached();
                    FlutterView flutterView2 = this.f46638g;
                    if (flutterView2 != null) {
                        flutterView2.detachFromFlutterEngine();
                    }
                    FlutterView flutterView3 = this.f46638g;
                    if (flutterView3 != null) {
                        flutterView3.removeOnFirstFrameRenderedListener(this.f46634c);
                    }
                    flutterEngineShutdownHelper.m56812h(this.f46638g);
                    flutterEngine2.destroy();
                }
            }
            m56753S();
        } catch (Throwable th3) {
            try {
                String message2 = th3.getMessage();
                if (message2 == null || !(StringsKt.contains$default((CharSequence) message2, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message2, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message2, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                    C44199a.m97421b(th3, "destroy failed");
                } else {
                    C43846g.m96568c(new FlutterIssueException(th3, "destroy failed", true, null, 8, null), null, 2, null);
                }
            } finally {
                this.f46636e = null;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m56743H() throws JSONException {
        this.f46647p.m56715b();
        m56738A();
        try {
            this.f46646o.mo91370n(Unit.INSTANCE);
            Function0<Unit> function0 = this.f46645n;
            if (function0 != null) {
                function0.invoke();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m56744I(@NotNull Intent intent) {
        FlutterEngine flutterEngine;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (this.f46643l && (flutterEngine = this.f46636e) != null) {
            flutterEngine.getActivityControlSurface().onNewIntent(intent);
            String strM56282x = RouteExKt.m56282x(intent, "flutterInitialRoute", "");
            if (strM56282x.length() > 0) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Pair<String, Map<String, Object>> pairM56726J = m56726J(strM56282x);
                    String strComponent1 = pairM56726J.component1();
                    Map<String, Object> mapComponent2 = pairM56726J.component2();
                    if (Intrinsics.areEqual(strComponent1, "lite/home")) {
                        FlutterRouterChannel.m56704c(flutterEngine, strComponent1, mapComponent2);
                    } else {
                        flutterEngine.getNavigationChannel().pushRouteInformation(strM56282x);
                    }
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                    flutterEngine.getNavigationChannel().pushRouteInformation(strM56282x);
                }
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m56747M(int i11, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine == null) {
            C44128b.m97270n("FlutterViewDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        C44128b.m97266j("FlutterViewDelegate", "onRequestPermissionsResult requestCode: " + i11 + " permissions: " + permissions);
        flutterEngine.getActivityControlSurface().onRequestPermissionsResult(i11, permissions, grantResults);
    }

    /* JADX INFO: renamed from: N */
    public final void m56748N() {
        int i11 = this.f46635d;
        this.f46635d = 2;
        if (i11 == 1) {
            m56763k();
            return;
        }
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine != null) {
            flutterEngine.getLifecycleChannel().appIsResumed();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m56750P(int i11) {
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine == null) {
            return;
        }
        if (this.f46632a.get().booleanValue() && i11 >= 10) {
            flutterEngine.getDartExecutor().notifyLowMemoryWarning();
            flutterEngine.getSystemChannel().sendMemoryPressureWarning();
        }
        flutterEngine.getRenderer().onTrimMemory(i11);
    }

    /* JADX INFO: renamed from: Q */
    public final void m56751Q() {
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine == null) {
            return;
        }
        flutterEngine.getActivityControlSurface().onUserLeaveHint();
    }

    /* JADX INFO: renamed from: R */
    public final void m56752R(boolean z11) {
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine != null) {
            if (z11) {
                flutterEngine.getLifecycleChannel().aWindowIsFocused();
            } else {
                flutterEngine.getLifecycleChannel().noWindowsAreFocused();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m56754T(@NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        m56768s().m56823b(params);
    }

    /* JADX INFO: renamed from: U */
    public final void m56755U(@NotNull List<String> entrypointArgs) {
        Intrinsics.checkNotNullParameter(entrypointArgs, "entrypointArgs");
        this.f46644m = entrypointArgs;
    }

    /* JADX INFO: renamed from: V */
    public final void m56756V(@NotNull String initialRoute) {
        Intrinsics.checkNotNullParameter(initialRoute, "initialRoute");
        this.f46637f = initialRoute;
        this.f46647p.m56722i(initialRoute);
    }

    /* JADX INFO: renamed from: W */
    public final void m56757W(@Nullable Function0<Unit> function0) {
        this.f46645n = function0;
    }

    /* JADX INFO: renamed from: Y */
    public final void m56759Y() {
        PlatformPlugin platformPlugin = this.f46641j;
        if (platformPlugin != null) {
            platformPlugin.updateSystemUiOverlays();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m56760h(@NotNull IChannelRegister register) {
        Intrinsics.checkNotNullParameter(register, "register");
        this.f46642k.add(register);
    }

    /* JADX INFO: renamed from: i */
    public final void m56761i() {
        m56760h(new CommonHandlerChannel());
        m56760h(m56768s());
        m56760h(new FlutterEventHubChannel());
        m56760h(m56769t());
        m56760h(new FlutterJsApiStorageChannel());
    }

    /* JADX INFO: renamed from: j */
    public final void m56762j() {
        BaseActivity baseActivity;
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine == null || (baseActivity = this.f46640i) == null) {
            return;
        }
        m56766n(flutterEngine);
        try {
            flutterEngine.getActivityControlSurface().attachToActivity(new C23726a(this, baseActivity), baseActivity.getLifecycle());
        } catch (AssertionError e11) {
            C44128b.m97263g("FlutterViewDelegate", e11);
        }
        if (this.f46641j == null) {
            this.f46641j = new PlatformPlugin(baseActivity, flutterEngine.getPlatformChannel(), null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m56763k() {
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine == null) {
            return;
        }
        FlutterView flutterView = this.f46638g;
        if (flutterView != null) {
            flutterView.attachToFlutterEngine(flutterEngine);
        }
        flutterEngine.getLifecycleChannel().appIsResumed();
        C44128b.m97266j("FlutterViewDelegate", "attachToFlutterEngine by loadFlutterEngine");
    }

    /* JADX INFO: renamed from: l */
    public final void m56764l(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46640i = activity;
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        Integer numM56264o = RouteExKt.m56264o(intent, "appLauncherType");
        if (numM56264o != null && numM56264o.intValue() == 1) {
            this.f46647p.m56720g();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m56766n(FlutterEngine flutterEngine) {
        try {
            try {
                PlatformViewsController platformViewsController = flutterEngine.getPlatformViewsController();
                Intrinsics.checkNotNullExpressionValue(platformViewsController, "getPlatformViewsController(...)");
                Field declaredField = platformViewsController.getClass().getDeclaredField("isAttached");
                declaredField.setAccessible(true);
                if (declaredField.getBoolean(platformViewsController)) {
                    platformViewsController.detach();
                    C44128b.m97259c("FlutterViewDelegate", "PlatformViewsController detached before re-attach");
                    return;
                }
                return;
            } catch (Exception e11) {
                C44128b.m97259c("FlutterViewDelegate", "detachPlatformViewsControllerIfNeeded fallback failed: " + e11.getMessage());
            }
        } catch (NoSuchFieldException unused) {
            flutterEngine.getPlatformViewsController().detach();
            C44128b.m97259c("FlutterViewDelegate", "PlatformViewsController detached (fallback)");
            return;
        } catch (Exception e12) {
            C44128b.m97259c("FlutterViewDelegate", "detachPlatformViewsControllerIfNeeded failed: " + e12.getMessage());
            return;
        }
        C44128b.m97259c("FlutterViewDelegate", "detachPlatformViewsControllerIfNeeded fallback failed: " + e11.getMessage());
    }

    /* JADX INFO: renamed from: p */
    public final void m56767p(boolean z11) throws JSONException {
        Context context = this.f46639h;
        if (context == null) {
            return;
        }
        this.f46647p.m56719f();
        try {
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            Intrinsics.checkNotNullExpressionValue(flutterLoader, "flutterLoader(...)");
            if (flutterLoader.initialized()) {
                C44128b.m97266j("FlutterViewDelegate", "flutterLoader initialized");
                this.f46647p.m56721h("ready");
                m56772x();
                return;
            }
            if (z11) {
                C44128b.m97266j("FlutterViewDelegate", "flutterLoader ensureInitializationCompleteAsync");
                if (FlutterImpellerConfig.f46678a.m56819f()) {
                    flutterLoader.ensureInitializationCompleteAsync(context, FlutterShellArgsHelper.f46683a.m56821b(), this.f46633b, new Runnable() { // from class: com.kubi.sdk.flutter.delegate.q
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            FlutterViewDelegate.m56735q(this.f46684b);
                        }
                    });
                    return;
                } else {
                    flutterLoader.ensureInitializationCompleteAsync(context, null, this.f46633b, new Runnable() { // from class: com.kubi.sdk.flutter.delegate.r
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            FlutterViewDelegate.m56736r(this.f46685b);
                        }
                    });
                    return;
                }
            }
            C44128b.m97266j("FlutterViewDelegate", "flutterLoader ensureInitializationComplete");
            if (FlutterImpellerConfig.f46678a.m56819f()) {
                flutterLoader.ensureInitializationComplete(context, FlutterShellArgsHelper.f46683a.m56821b());
                m56772x();
                this.f46647p.m56721h("sync");
            } else {
                flutterLoader.ensureInitializationComplete(context, null);
                m56772x();
                this.f46647p.m56721h("sync");
            }
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(th2, "FlutterInjector failed");
            } else {
                C43846g.m96568c(new FlutterIssueException(th2, "FlutterInjector failed", true, null, 8, null), null, 2, null);
            }
            this.f46647p.m56723j("load engine failed");
        }
    }

    /* JADX INFO: renamed from: s */
    public final CommonEventHandlerChannel m56768s() {
        return (CommonEventHandlerChannel) this.f46648q.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final LifecycleHandlerChannel m56769t() {
        return (LifecycleHandlerChannel) this.f46649r.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final void m56771w(FlutterEngine flutterEngine) throws JSONException {
        try {
            C44128b.m97266j("FlutterViewDelegate", "GeneratedPluginRegistrant");
            m56765m(flutterEngine);
            C44128b.m97266j("FlutterViewDelegate", "executeDartEntrypoint");
            this.f46647p.m56718e();
        } catch (Throwable th2) {
            C44128b.m97261e("FlutterViewDelegate", "DartExecutor failed");
            this.f46647p.m56723j("execute failed");
            String message = th2.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(th2, "DartExecutor failed");
            } else {
                C43846g.m96568c(new FlutterIssueException(th2, "DartExecutor failed", true, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m56772x() throws JSONException {
        Context context = this.f46639h;
        if (context == null) {
            return;
        }
        FlutterEngine flutterEngineM56798b = this.f46636e;
        if (flutterEngineM56798b == null) {
            flutterEngineM56798b = FlutterEngineFactory.f46663a.m56798b(context, "main", KnbHandlerHelper.f46655a.m56786i(this.f46644m), this.f46637f);
            this.f46636e = flutterEngineM56798b;
            try {
                if (this.f46635d != 10) {
                    Intrinsics.checkNotNull(flutterEngineM56798b);
                    PlatformViewsController platformViewsController = flutterEngineM56798b.getPlatformViewsController();
                    FlutterEngine flutterEngine = this.f46636e;
                    Intrinsics.checkNotNull(flutterEngine);
                    FlutterRenderer renderer = flutterEngine.getRenderer();
                    FlutterEngine flutterEngine2 = this.f46636e;
                    Intrinsics.checkNotNull(flutterEngine2);
                    platformViewsController.attach(context, renderer, flutterEngine2.getDartExecutor());
                }
            } catch (Exception e11) {
                C44128b.m97262f("FlutterViewDelegate", "Failed to attach PlatformViewsController: " + e11.getMessage(), e11);
            }
            C44128b.m97266j("FlutterViewDelegate", "flutterEngine create");
        } else {
            Intrinsics.checkNotNull(flutterEngineM56798b);
        }
        this.f46647p.m56717d();
        m56771w(flutterEngineM56798b);
        int i11 = this.f46635d;
        if (i11 == 2 || i11 == 3) {
            m56763k();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m56774z(int i11, int i12, @Nullable Intent intent) {
        FlutterEngine flutterEngine = this.f46636e;
        if (flutterEngine == null) {
            C44128b.m97270n("FlutterViewDelegate", "onActivityResult() flutterEngine = null");
            return;
        }
        C44128b.m97266j("FlutterViewDelegate", "onActivityResult requestCode: " + i11 + " resultCode: " + i12);
        flutterEngine.getActivityControlSurface().onActivityResult(i11, i12, intent);
    }

    /* JADX INFO: renamed from: q */
    public static final void m56735q(FlutterViewDelegate flutterViewDelegate) throws JSONException {
        flutterViewDelegate.m56772x();
        flutterViewDelegate.f46647p.m56721h(BaseJavaModule.METHOD_TYPE_ASYNC);
    }

    /* JADX INFO: renamed from: r */
    public static final void m56736r(FlutterViewDelegate flutterViewDelegate) throws JSONException {
        flutterViewDelegate.m56772x();
        flutterViewDelegate.f46647p.m56721h(BaseJavaModule.METHOD_TYPE_ASYNC);
    }

    /* JADX INFO: renamed from: L */
    public final void m56746L() {
        m56759Y();
    }

    /* JADX INFO: renamed from: m */
    public final void m56765m(FlutterEngine flutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine);
        Context context = this.f46639h;
        if (context != null) {
            Iterator<T> it = this.f46642k.iterator();
            while (it.hasNext()) {
                ((IChannelRegister) it.next()).registerWith(context, flutterEngine);
            }
        }
        DartExecutor dartExecutor = flutterEngine.getDartExecutor();
        Intrinsics.checkNotNullExpressionValue(dartExecutor, "getDartExecutor(...)");
        FlutterEvent.m56873t(dartExecutor);
        FlutterRouterChannel.m56705d(flutterEngine);
        FlutterMethodChannel.m56673D(flutterEngine);
    }

    @MainThread
    @Nullable
    /* JADX INFO: renamed from: v */
    public final Object m56770v(@NotNull Continuation<? super Unit> continuation) throws JSONException {
        m56758X();
        Object objMo91198h = this.f46646o.mo91198h(continuation);
        if (objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objMo91198h;
        }
        return Unit.INSTANCE;
    }
}
