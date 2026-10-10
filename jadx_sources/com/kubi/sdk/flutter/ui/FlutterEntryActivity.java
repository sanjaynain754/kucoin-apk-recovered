package com.kubi.sdk.flutter.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatCallback;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.view.ActionMode;
import com.blankj.utilcode.util.C5258a;
import com.google.firebase.messaging.Constants;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.IActivityWithResult;
import com.kubi.sdk.ResultDelegate;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.applet.KCMiniAppBaseProtocol;
import com.kubi.sdk.flutter.C23722c;
import com.kubi.sdk.flutter.FlutterConfig;
import com.kubi.sdk.flutter.FlutterEvent;
import com.kubi.sdk.flutter.FlutterMethodChannel;
import com.kubi.sdk.flutter.FlutterRouterChannel;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.flutter.delegate.FlutterEngineFactory;
import com.kubi.sdk.flutter.delegate.FlutterJsApiStorageChannel;
import com.kubi.sdk.flutter.delegate.KnbHandlerHelper;
import com.kubi.sdk.flutter.delegate.LifecycleHandlerChannel;
import com.kubi.sdk.flutter.event.CommonEventHandlerChannel;
import com.kubi.sdk.flutter.event.FlutterEventHubChannel;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.function.language.dynamic.LangDynamicManager;
import com.kubi.sdk.util.IDisableEdgeToEdge;
import com.kubi.sdk.util.PermissionAspect;
import com.kubi.utils.extensions.C27025c;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import dh0.C36686b;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.C43179b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p514ou.C43330a;
import p569qq.C43846g;
import p569qq.InterfaceC43845f;
import p609ry.C44199a;
import p741wy.InterfaceC45941a;
import p741wy.InterfaceC45943c;
import p741wy.InterfaceC45944d;
import p741wy.InterfaceC45947g;
import p741wy.InterfaceC45957q;
import p840zq.C46908e;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterEntryActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u001dH\u0014J\b\u0010\"\u001a\u00020\rH\u0016J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0014J\u0012\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020%H\u0016J\u0012\u0010)\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u0004\u0018\u00010\u000bJ\b\u0010B\u001a\u00020\u001dH\u0002J\u0012\u0010C\u001a\u00020\u001d2\b\b\u0001\u0010D\u001a\u00020'H\u0016J\u0010\u0010E\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020'H\u0002J\u0010\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020 H\u0014J\b\u0010H\u001a\u00020\u001dH\u0016J\b\u0010I\u001a\u00020\u001dH\u0014J\b\u0010J\u001a\u00020\u001dH\u0014J\b\u0010K\u001a\u00020\u001dH\u0016J+\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020N2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00190P2\u0006\u0010Q\u001a\u00020RH\u0016¢\u0006\u0002\u0010SJ\n\u0010T\u001a\u0004\u0018\u00010UH\u0016J\u0012\u0010V\u001a\u00020\u001d2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u0012\u0010Y\u001a\u00020\u001d2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u0014\u0010Z\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\"\u0010]\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020N2\u0006\u0010^\u001a\u00020N2\b\u0010_\u001a\u0004\u0018\u00010`H\u0014J \u0010a\u001a\u00020\u001d2\u0006\u0010b\u001a\u00020`2\u000e\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010`0dH\u0016J\b\u0010k\u001a\u00020\u001dH\u0016J\b\u0010l\u001a\u00020\u001dH\u0002J\b\u0010m\u001a\u00020\u0019H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0017\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0017\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0017\u001a\u0004\b:\u0010;R\u001b\u0010=\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0017\u001a\u0004\b?\u0010@R(\u0010f\u001a\u0004\u0018\u00010\u00192\b\u0010e\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j¨\u0006o"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterEntryActivity;", "Lio/flutter/embedding/android/FlutterFragmentActivity;", "Lcom/kubi/sdk/IContentCallback;", "Landroidx/appcompat/app/AppCompatCallback;", "Lcom/kubi/monitor/ITrackPage;", "Lcom/kubi/sdk/IActivityWithResult;", "Lcom/kubi/sdk/util/IDisableEdgeToEdge;", "Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;", "<init>", "()V", "mDelegate", "Landroidx/appcompat/app/AppCompatDelegate;", "mResources", "Landroid/content/res/Resources;", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDestroyDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "resultDelegate", "Lcom/kubi/sdk/ResultDelegate;", "getResultDelegate", "()Lcom/kubi/sdk/ResultDelegate;", "resultDelegate$delegate", "Lkotlin/Lazy;", "currentRoute", "", "alphaKlineTransmit", "Lcom/kubi/sdk/flutter/transmit/IAlphaKlineTransmit;", "onStart", "", "onPostCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "getResources", "attachBaseContext", "newBase", "Landroid/content/Context;", "provideFlutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "context", "onCreate", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "getDelegate", "eventChannel", "Lcom/kubi/sdk/flutter/event/CommonEventHandlerChannel;", "getEventChannel", "()Lcom/kubi/sdk/flutter/event/CommonEventHandlerChannel;", "eventChannel$delegate", "lifecycleHandlerChannel", "Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;", "getLifecycleHandlerChannel", "()Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;", "lifecycleHandlerChannel$delegate", "eventHubChannel", "Lcom/kubi/sdk/flutter/event/FlutterEventHubChannel;", "getEventHubChannel", "()Lcom/kubi/sdk/flutter/event/FlutterEventHubChannel;", "eventHubChannel$delegate", "jsApiStorageChannel", "Lcom/kubi/sdk/flutter/delegate/FlutterJsApiStorageChannel;", "getJsApiStorageChannel", "()Lcom/kubi/sdk/flutter/delegate/FlutterJsApiStorageChannel;", "jsApiStorageChannel$delegate", "bindFlowEvent", "configureFlutterEngine", "flutterEngine", "registerAlphaKlineChooseCoinChannel", "onSaveInstanceState", "outState", "finish", "onResume", "onPause", "onPreFinish", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onBackBitmap", "Landroid/graphics/Bitmap;", "onSupportActionModeStarted", "mode", "Landroidx/appcompat/view/ActionMode;", "onSupportActionModeFinished", "onWindowStartingSupportActionMode", TUIConstants.TUIChat.CALL_BACK, "Landroidx/appcompat/view/ActionMode$Callback;", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "startActivityWithResult", "intent", "callBack", "Lio/reactivex/functions/Consumer;", "value", "pageId", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "onBackPressed", "handleNativeBack", "url", "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterEntryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterEntryActivity.kt\ncom/kubi/sdk/flutter/ui/FlutterEntryActivity\n+ 2 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n*L\n1#1,380:1\n44#2,15:381\n44#2,15:396\n44#2,15:411\n44#2,15:426\n44#2,15:450\n1#3:441\n76#4,7:442\n65#5:449\n*S KotlinDebug\n*F\n+ 1 FlutterEntryActivity.kt\ncom/kubi/sdk/flutter/ui/FlutterEntryActivity\n*L\n118#1:381,15\n129#1:396,15\n151#1:411,15\n187#1:426,15\n268#1:450,15\n228#1:442,7\n252#1:449\n*E\n"})
public class FlutterEntryActivity extends FlutterFragmentActivity implements AppCompatCallback, InterfaceC43845f, IActivityWithResult, IDisableEdgeToEdge, KCMiniAppBaseProtocol {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Companion f46744r;

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ InterfaceC43175a.a f46745s;

    /* JADX INFO: renamed from: d */
    @Nullable
    public AppCompatDelegate f46746d;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final Resources f46747i;

    /* JADX INFO: renamed from: m */
    @Nullable
    public InterfaceC45941a f46751m;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final CompositeDisposable f46748j = new CompositeDisposable();

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Lazy f46749k = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.ui.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlutterEntryActivity.m56946a0();
        }
    });

    /* JADX INFO: renamed from: l */
    @NotNull
    public String f46750l = "";

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Lazy f46752n = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.ui.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlutterEntryActivity.m56939Q();
        }
    });

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Lazy f46753o = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.ui.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlutterEntryActivity.m56945Y();
        }
    });

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Lazy f46754p = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.ui.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlutterEntryActivity.m56940R();
        }
    });

    /* JADX INFO: renamed from: q */
    @NotNull
    public final Lazy f46755q = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.ui.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlutterEntryActivity.m56944X();
        }
    });

    /* JADX INFO: compiled from: FlutterEntryActivity.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterEntryActivity$Companion;", "", "<init>", "()V", "startFlutterPage", "", "context", "Landroid/content/Context;", "router", "", "flags", "", "kcFlutterCallbackId", "", "TAG", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void startFlutterPage$default(Companion companion, Context context, String str, int i11, long j11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                str = "";
            }
            String str2 = str;
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            int i13 = i11;
            if ((i12 & 8) != 0) {
                j11 = 0;
            }
            companion.startFlutterPage(context, str2, i13, j11);
        }

        public final void startFlutterPage(@NotNull Context context, @NotNull String router, int flags, long kcFlutterCallbackId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(router, "router");
            if (router.length() == 0) {
                return;
            }
            Intent intentBuild = new FlutterFragmentActivity.NewEngineIntentBuilder(FlutterEntryActivity.class).initialRoute(router).dartEntrypointArgs(KnbHandlerHelper.f46655a.m56786i(null)).build(context);
            Intrinsics.checkNotNullExpressionValue(intentBuild, "build(...)");
            if (kcFlutterCallbackId > 0) {
                RouteExKt.m56265o0(intentBuild, "kcFlutterCallbackId", kcFlutterCallbackId);
            }
            if (!(context instanceof Activity)) {
                intentBuild.addFlags(268435456);
            }
            if (flags > 0) {
                intentBuild.addFlags(flags);
            }
            context.startActivity(intentBuild);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.ui.FlutterEntryActivity$a */
    /* JADX INFO: compiled from: FlutterEntryActivity.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/sdk/flutter/ui/FlutterEntryActivity$onBackPressed$1", "Lio/flutter/plugin/common/MethodChannel$Result;", "success", "", DbParams.KEY_CHANNEL_RESULT, "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "errorCode", "", "errorMessage", "details", "notImplemented", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23790a implements MethodChannel.Result {
        public C23790a() {
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String errorCode, String errorMessage, Object details) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            C44128b.m97261e("FlutterEntryActivity", "onBackPressed error: " + errorMessage);
            FlutterEntryActivity.this.m56948W();
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            C44128b.m97270n("FlutterEntryActivity", "onBackPressed notImplemented");
            FlutterEntryActivity.this.m56948W();
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object result) {
            Boolean bool = result instanceof Boolean ? (Boolean) result : null;
            if (bool != null ? bool.booleanValue() : false) {
                FlutterEntryActivity.this.m56948W();
                return;
            }
            IAppletService iAppletService = IAppletService.f46452a.get();
            final FlutterEntryActivity flutterEntryActivity = FlutterEntryActivity.this;
            iAppletService.mo15069d(flutterEntryActivity, new Function0() { // from class: com.kubi.sdk.flutter.ui.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FlutterEntryActivity.C23790a.m56951b(flutterEntryActivity);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m56951b(FlutterEntryActivity flutterEntryActivity) {
            flutterEntryActivity.m56948W();
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object objM103844constructorimpl;
        Unit unit;
        PlatformViewsController platformViewsController;
        LifecycleChannel lifecycleChannel;
        try {
            Result.Companion companion = Result.INSTANCE;
            super.onDestroy();
            KCFlutterRouteManager.f46704a.m56852r(getIntent());
            InterfaceC45947g interfaceC45947gM56654f = FlutterConfig.m56654f();
            if (interfaceC45947gM56654f != null) {
                interfaceC45947gM56654f.release();
            }
            this.f46748j.dispose();
            m56942T().unregister();
            InterfaceC45941a interfaceC45941a = this.f46751m;
            if (interfaceC45941a != null) {
                interfaceC45941a.unregister();
            }
            this.f46751m = null;
            AppCompatDelegate delegate = getDelegate();
            if (delegate != null) {
                delegate.onDestroy();
            }
            C46908e.f104773a.mo42473a(this, null);
            FlutterEngine flutterEngine = getFlutterEngine();
            if (flutterEngine != null && (lifecycleChannel = flutterEngine.getLifecycleChannel()) != null) {
                lifecycleChannel.appIsDetached();
            }
            FlutterEngine flutterEngine2 = getFlutterEngine();
            if (flutterEngine2 == null || (platformViewsController = flutterEngine2.getPlatformViewsController()) == null) {
                unit = null;
            } else {
                platformViewsController.detachFromView();
                unit = Unit.INSTANCE;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "Flutter");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "Flutter", true, null, 8, null), null, 2, null);
            }
        }
    }

    @Override // android.app.Activity
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            super.onPostCreate(savedInstanceState);
            AppCompatDelegate delegate = getDelegate();
            if (delegate != null) {
                delegate.onPostCreate(savedInstanceState);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEntryActivity");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEntryActivity", true, null, 8, null), null, 2, null);
            }
            C44128b.m97261e("FlutterEntryActivity", "after flutter framework check, onPostCreate still crash. finish page now.");
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    @Nullable
    public ActionMode onWindowStartingSupportActionMode(@Nullable ActionMode.Callback callback) {
        return null;
    }

    /* JADX INFO: renamed from: O */
    private final void m56937O() {
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.event.FlutterEvent:flutterCommonEvent".length();
        }
        C12572a.m23692a(this, false, new C23791x26d4ac50("com.kubi.event.FlutterEvent:flutterCommonEvent", null, this));
    }

    /* JADX INFO: renamed from: P */
    public static final void m56938P(FlutterEntryActivity flutterEntryActivity, MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        FlutterConfig.f46607a.m56660b(flutterEntryActivity, call, result);
    }

    /* JADX INFO: renamed from: Q */
    public static final CommonEventHandlerChannel m56939Q() {
        return new CommonEventHandlerChannel();
    }

    /* JADX INFO: renamed from: R */
    public static final FlutterEventHubChannel m56940R() {
        return new FlutterEventHubChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final CommonEventHandlerChannel m56941S() {
        return (CommonEventHandlerChannel) this.f46752n.getValue();
    }

    /* JADX INFO: renamed from: T */
    private final FlutterEventHubChannel m56942T() {
        return (FlutterEventHubChannel) this.f46754p.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final LifecycleHandlerChannel m56943V() {
        return (LifecycleHandlerChannel) this.f46753o.getValue();
    }

    /* JADX INFO: renamed from: X */
    public static final FlutterJsApiStorageChannel m56944X() {
        return new FlutterJsApiStorageChannel();
    }

    /* JADX INFO: renamed from: Y */
    public static final LifecycleHandlerChannel m56945Y() {
        return new LifecycleHandlerChannel();
    }

    /* JADX INFO: renamed from: a0 */
    public static final ResultDelegate m56946a0() {
        return new ResultDelegate();
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("FlutterEntryActivity.kt", FlutterEntryActivity.class);
        f46745s = c36686b.m82128h("method-execution", c36686b.m82127g("1", "onRequestPermissionsResult", "com.kubi.sdk.flutter.ui.FlutterEntryActivity", "int:[Ljava.lang.String;:[I", "requestCode:permissions:grantResults", "", "void"), 0);
    }

    /* JADX INFO: renamed from: U */
    public final FlutterJsApiStorageChannel m56947U() {
        return (FlutterJsApiStorageChannel) this.f46755q.getValue();
    }

    /* JADX INFO: renamed from: Z */
    public final void m56949Z(FlutterEngine flutterEngine) {
        InterfaceC45941a interfaceC45941a = (InterfaceC45941a) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45941a.class)));
        if (interfaceC45941a != null) {
            interfaceC45941a.mo50338k(this, flutterEngine);
        } else {
            interfaceC45941a = null;
        }
        this.f46751m = interfaceC45941a;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        Context contextAttachBaseContext2;
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        AppCompatDelegate delegate = getDelegate();
        super.attachBaseContext((delegate == null || (contextAttachBaseContext2 = delegate.attachBaseContext2(newBase)) == null) ? null : MultiLanguageManager.f46805a.m56994p(contextAttachBaseContext2));
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(@NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        m56941S().registerWith(this, flutterEngine);
        m56943V().registerWith(this, flutterEngine);
        m56942T().registerWith(this, flutterEngine);
        m56947U().registerWith(this, flutterEngine);
        GeneratedPluginRegistrant.registerWith(flutterEngine);
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "com.kc.user").setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: com.kubi.sdk.flutter.ui.f
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                FlutterEntryActivity.m56938P(this.f46776b, methodCall, result);
            }
        });
        DartExecutor dartExecutor = flutterEngine.getDartExecutor();
        Intrinsics.checkNotNullExpressionValue(dartExecutor, "getDartExecutor(...)");
        FlutterEvent.m56873t(dartExecutor);
        FlutterRouterChannel.m56705d(flutterEngine);
        FlutterMethodChannel.m56673D(flutterEngine);
        m56949Z(flutterEngine);
    }

    @Nullable
    public final AppCompatDelegate getDelegate() {
        if (this.f46746d == null) {
            this.f46746d = AppCompatDelegate.create(this, this);
        }
        return this.f46746d;
    }

    @NotNull
    /* JADX INFO: renamed from: getDestroyDisposable, reason: from getter */
    public final CompositeDisposable getF46748j() {
        return this.f46748j;
    }

    @Override // p569qq.InterfaceC43845f
    @Nullable
    public String getPageId() {
        return "page_flutter";
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        LangDynamicManager langDynamicManager = LangDynamicManager.f46816a;
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Resources resourcesM57014f = langDynamicManager.m57014f(resources);
        Configuration configuration = resourcesM57014f.getConfiguration();
        configuration.fontScale = 1.0f;
        resourcesM57014f.updateConfiguration(configuration, resourcesM57014f.getDisplayMetrics());
        return resourcesM57014f;
    }

    public final ResultDelegate getResultDelegate() {
        return (ResultDelegate) this.f46749k.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (this.f46747i != null) {
            Resources resources = super.getResources();
            resources.getConfiguration().fontScale = 1.0f;
            this.f46747i.updateConfiguration(newConfig, resources.getDisplayMetrics());
        }
        AppCompatDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.onConfigurationChanged(newConfig);
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) throws Throwable {
        InterfaceC43175a interfaceC43175aM82125e = C36686b.m82125e(f46745s, this, this, new Object[]{C43179b.m94790c(requestCode), permissions, grantResults});
        PermissionAspect.m58339c().m58340d(interfaceC43175aM82125e);
        C43330a.m95368b().m95370d(interfaceC43175aM82125e);
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        InterfaceC45943c interfaceC45943cM56652d = FlutterConfig.m56652d();
        if (interfaceC45943cM56652d != null) {
            interfaceC45943cM56652d.mo59660f(this, requestCode, grantResults);
        }
        InterfaceC45944d interfaceC45944dM56653e = FlutterConfig.m56653e();
        if (interfaceC45944dM56653e != null) {
            interfaceC45944dM56653e.mo59664f(this, requestCode, grantResults);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Object objM103844constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(outState, "outState");
        try {
            Result.Companion companion = Result.INSTANCE;
            super.onSaveInstanceState(outState);
            if (C27025c.m66563a(outState) > 512000) {
                outState.clear();
            }
            AppCompatDelegate delegate = getDelegate();
            if (delegate != null) {
                delegate.onSaveInstanceState(outState);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEntryActivity");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEntryActivity", true, null, 8, null), null, 2, null);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            super.onStart();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEntryActivity");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEntryActivity", true, null, 8, null), null, 2, null);
            }
            C44128b.m97261e("FlutterEntryActivity", "after flutter framework check, onStart still crash. finish page now.");
            finish();
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, io.flutter.embedding.android.FlutterEngineProvider
    @Nullable
    public FlutterEngine provideFlutterEngine(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FlutterEngineFactory flutterEngineFactory = FlutterEngineFactory.f46663a;
        String dartEntrypointFunctionName = getDartEntrypointFunctionName();
        Intrinsics.checkNotNullExpressionValue(dartEntrypointFunctionName, "getDartEntrypointFunctionName(...)");
        return flutterEngineFactory.m56798b(context, dartEntrypointFunctionName, getDartEntrypointArgs(), getInitialRoute());
    }

    @Override // com.kubi.sdk.IActivityWithResult
    public void startActivityWithResult(@NotNull Intent intent, @NotNull Consumer<Intent> callBack) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        getResultDelegate().m56599c(this, intent, callBack);
    }

    @Override // com.kubi.sdk.applet.KCBaseProtocol
    @NotNull
    public String url() {
        return IAppletService.m56507b(IAppletService.f46452a.get(), IAppletService.AppletType.FLUTTER, this.f46750l, null, 4, null);
    }

    static {
        ajc$preClinit();
        f46744r = new Companion(null);
    }

    /* JADX INFO: renamed from: W */
    public final void m56948W() {
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void finish() {
        onPreFinish();
        super.finish();
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) throws Exception {
        super.onActivityResult(requestCode, resultCode, data);
        getResultDelegate().m56597a(this, requestCode, resultCode, data);
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FlutterEngine flutterEngine = getFlutterEngine();
        if (flutterEngine != null) {
            new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "back_channel").invokeMethod("canPop", null, new C23790a());
        } else {
            super.onBackPressed();
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Object objM103844constructorimpl;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        C43846g.m96571f("LAST_ACTIVITY", simpleName);
        C23722c.m56701b(Long.valueOf(System.currentTimeMillis()));
        AppCompatDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.installViewFactory();
        }
        if (delegate != null) {
            delegate.onCreate(savedInstanceState);
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        this.f46750l = RouteExKt.m56282x(intent, "route", "");
        try {
            Result.Companion companion = Result.INSTANCE;
            super.onCreate(savedInstanceState);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || (!StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterEntryActivity");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterEntryActivity", true, null, 8, null), null, 2, null);
            }
            C44128b.m97261e("FlutterEntryActivity", "after flutter framework check, onCreate still crash. finish page now.");
            finish();
        }
        m56937O();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m56943V().m56789a();
    }

    public void onPreFinish() {
        if (C5258a.m6124g().size() == 1) {
            Router.f46192a.m56184f("home").m4048k();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56943V().m56790b();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(@Nullable ActionMode mode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(@Nullable ActionMode mode) {
    }
}
