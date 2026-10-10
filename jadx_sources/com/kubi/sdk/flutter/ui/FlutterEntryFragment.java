package com.kubi.sdk.flutter.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.C11352b;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.lflutter.R$id;
import com.kubi.lflutter.R$layout;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.flutter.FlutterConfig;
import com.kubi.sdk.flutter.FlutterEvent;
import com.kubi.sdk.flutter.FlutterMethodChannel;
import com.kubi.sdk.flutter.FlutterRouterChannel;
import com.kubi.sdk.flutter.delegate.FlutterEngineFactory;
import com.kubi.sdk.flutter.delegate.FlutterImpellerConfig;
import com.kubi.sdk.flutter.delegate.FlutterShellArgsHelper;
import com.kubi.sdk.flutter.delegate.LifecycleHandlerChannel;
import com.kubi.sdk.flutter.event.CommonEventHandlerChannel;
import com.kubi.sdk.flutter.event.FlutterEventHubChannel;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.FlutterInjector;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p609ry.C44199a;
import p852kotlin.Deprecated;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterEntryFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "use FlutterDelegateFragment")
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 L2\u00020\u0001:\u0002LMB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00100\u001a\u00020.H\u0016J\u0012\u00101\u001a\u00020.2\b\b\u0002\u00102\u001a\u00020\u0011H\u0002J\b\u00103\u001a\u00020.H\u0002J\u0010\u00104\u001a\u00020.2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010E\u001a\u00020.H\u0002J\u0010\u0010F\u001a\u00020.2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010G\u001a\u00020.H\u0016J\b\u0010H\u001a\u00020.H\u0016J\b\u0010I\u001a\u00020.H\u0016J\b\u0010J\u001a\u00020.H\u0016J\b\u0010K\u001a\u00020.H\u0004R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00110\u00110\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00060\u001eR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u001b\u0010;\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bB\u0010C¨\u0006N"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterEntryFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "flutterView", "Lio/flutter/embedding/android/FlutterView;", "getFlutterView", "()Lio/flutter/embedding/android/FlutterView;", "setFlutterView", "(Lio/flutter/embedding/android/FlutterView;)V", "loadingView", "Landroid/widget/ImageView;", "getLoadingView", "()Landroid/widget/ImageView;", "setLoadingView", "(Landroid/widget/ImageView;)V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "isDataLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "flutterUiDisplayed", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "mainHandler", "Landroid/os/Handler;", "viewDisplayListener", "Lcom/kubi/sdk/flutter/ui/FlutterEntryFragment$FlutterViewDisplayListener;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "initialRoute", "", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", "executeLoader", "isRetry", "loadFlutterEngine", "loadDartEntrypoint", "lifecycleHandlerChannel", "Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;", "getLifecycleHandlerChannel", "()Lcom/kubi/sdk/flutter/delegate/LifecycleHandlerChannel;", "lifecycleHandlerChannel$delegate", "Lkotlin/Lazy;", "eventChannel", "Lcom/kubi/sdk/flutter/event/CommonEventHandlerChannel;", "getEventChannel", "()Lcom/kubi/sdk/flutter/event/CommonEventHandlerChannel;", "eventChannel$delegate", "eventHubChannel", "Lcom/kubi/sdk/flutter/event/FlutterEventHubChannel;", "getEventHubChannel", "()Lcom/kubi/sdk/flutter/event/FlutterEventHubChannel;", "eventHubChannel$delegate", "bindFlowEvent", "configureFlutterEngine", "onResume", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroyView", "sendResume", "Companion", "FlutterViewDisplayListener", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterEntryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterEntryFragment.kt\ncom/kubi/sdk/flutter/ui/FlutterEntryFragment\n+ 2 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,290:1\n44#2,15:291\n44#2,15:306\n44#2,15:328\n76#3,7:321\n*S KotlinDebug\n*F\n+ 1 FlutterEntryFragment.kt\ncom/kubi/sdk/flutter/ui/FlutterEntryFragment\n*L\n127#1:291,15\n158#1:306,15\n260#1:328,15\n173#1:321,7\n*E\n"})
public class FlutterEntryFragment extends BaseFragment {

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final Companion f46757h0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public FlutterView f46758U;

    /* JADX INFO: renamed from: V */
    public ImageView f46759V;

    /* JADX INFO: renamed from: W */
    public boolean f46760W;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public FlutterEngine f46765b0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public MethodChannel f46767d0;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final AtomicBoolean f46761X = new AtomicBoolean(false);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicReference<Boolean> f46762Y = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Handler f46763Z = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C23792a f46764a0 = new C23792a();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public String f46766c0 = "/";

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f46768e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.ui.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlutterEntryFragment.m56952C3();
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f46769f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.ui.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlutterEntryFragment.m56962s3();
        }
    });

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f46770g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.ui.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlutterEntryFragment.m56963t3();
        }
    });

    /* JADX INFO: compiled from: FlutterEntryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterEntryFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/sdk/flutter/ui/FlutterEntryFragment;", "initialRoute", "", "TAGS", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FlutterEntryFragment newInstance(@NotNull String initialRoute) {
            Intrinsics.checkNotNullParameter(initialRoute, "initialRoute");
            FlutterEntryFragment flutterEntryFragment = new FlutterEntryFragment();
            Bundle bundle = new Bundle();
            bundle.putString("flutterInitialRoute", initialRoute);
            flutterEntryFragment.setArguments(bundle);
            return flutterEntryFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.ui.FlutterEntryFragment$a */
    /* JADX INFO: compiled from: FlutterEntryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/flutter/ui/FlutterEntryFragment$FlutterViewDisplayListener;", "Lio/flutter/embedding/engine/renderer/FlutterUiDisplayListener;", "<init>", "(Lcom/kubi/sdk/flutter/ui/FlutterEntryFragment;)V", "onFlutterUiDisplayed", "", "onFlutterUiNoLongerDisplayed", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C23792a implements FlutterUiDisplayListener {
        public C23792a() {
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiDisplayed() {
            FlutterEntryFragment.this.f46762Y.set(Boolean.TRUE);
            ViewExtKt.m66577h(FlutterEntryFragment.this.m56968B3());
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiNoLongerDisplayed() {
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final LifecycleHandlerChannel m56952C3() {
        return new LifecycleHandlerChannel();
    }

    private final void bindFlowEvent() {
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.event.FlutterEvent:flutterCommonEvent".length();
        }
        C12572a.m23692a(this, false, new C23793x6150f6ef("com.kubi.event.FlutterEvent:flutterCommonEvent", null, this));
    }

    /* JADX INFO: renamed from: r3 */
    public static final void m56961r3(FlutterEntryFragment flutterEntryFragment, MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        FragmentActivity activity = flutterEntryFragment.getActivity();
        if (activity != null) {
            FlutterConfig.f46607a.m56661c(activity, call, result);
        }
    }

    /* JADX INFO: renamed from: s3 */
    public static final CommonEventHandlerChannel m56962s3() {
        return new CommonEventHandlerChannel();
    }

    /* JADX INFO: renamed from: t3 */
    public static final FlutterEventHubChannel m56963t3() {
        return new FlutterEventHubChannel();
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m56964v3(FlutterEntryFragment flutterEntryFragment, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeLoader");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        flutterEntryFragment.m56973u3(z11);
    }

    /* JADX INFO: renamed from: A3 */
    public final LifecycleHandlerChannel m56967A3() {
        return (LifecycleHandlerChannel) this.f46768e0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: B3 */
    public final ImageView m56968B3() {
        ImageView imageView = this.f46759V;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        return null;
    }

    /* JADX INFO: renamed from: D3 */
    public final void m56969D3(FlutterEngine flutterEngine) {
        try {
            C44128b.m97266j("FlutterEntryFragment", "GeneratedPluginRegistrant");
            configureFlutterEngine(flutterEngine);
            C44128b.m97266j("FlutterEntryFragment", "executeDartEntrypoint");
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(th2, "DartExecutor failed");
            } else {
                C43846g.m96568c(new FlutterIssueException(th2, "DartExecutor failed", true, null, 8, null), null, 2, null);
            }
            C44128b.m97261e("FlutterEntryFragment", "onFlutterFailed");
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m56971F3() {
        FlutterEngine flutterEngine = this.f46765b0;
        if (flutterEngine != null) {
            flutterEngine.getLifecycleChannel().appIsResumed();
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final void m56972G3(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.f46759V = imageView;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF20235f0() {
        return this.f46760W;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.flutter_entry_fragment_layout, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(R$id.loading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        m56972G3((ImageView) viewFindViewById);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R$id.container);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CustomFlutterView customFlutterView = new CustomFlutterView(context);
        customFlutterView.addOnFirstFrameRenderedListener(this.f46764a0);
        frameLayout.addView(customFlutterView, 0);
        this.f46758U = customFlutterView;
        bindFlowEvent();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f46760W = z11;
    }

    /* JADX INFO: renamed from: y3 */
    public final CommonEventHandlerChannel m56974y3() {
        return (CommonEventHandlerChannel) this.f46769f0.getValue();
    }

    /* JADX INFO: renamed from: z3 */
    public final FlutterEventHubChannel m56975z3() {
        return (FlutterEventHubChannel) this.f46770g0.getValue();
    }

    private final void configureFlutterEngine(FlutterEngine flutterEngine) {
        Context context = getContext();
        if (context != null) {
            m56974y3().registerWith(context, flutterEngine);
            m56975z3().registerWith(context, flutterEngine);
        }
        GeneratedPluginRegistrant.registerWith(flutterEngine);
        MethodChannel methodChannel = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "com.kc.user");
        methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: com.kubi.sdk.flutter.ui.r
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                FlutterEntryFragment.m56961r3(this.f46780b, methodCall, result);
            }
        });
        this.f46767d0 = methodChannel;
        DartExecutor dartExecutor = flutterEngine.getDartExecutor();
        Intrinsics.checkNotNullExpressionValue(dartExecutor, "getDartExecutor(...)");
        FlutterEvent.m56873t(dartExecutor);
        FlutterRouterChannel.m56705d(flutterEngine);
        FlutterMethodChannel.m56673D(flutterEngine);
    }

    /* JADX INFO: renamed from: w3 */
    public static final void m56965w3(FlutterEntryFragment flutterEntryFragment) {
        flutterEntryFragment.m56970E3();
    }

    /* JADX INFO: renamed from: x3 */
    public static final void m56966x3(FlutterEntryFragment flutterEntryFragment) {
        flutterEntryFragment.m56970E3();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m56970E3() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FlutterEngine flutterEngineM56796c = this.f46765b0;
        if (flutterEngineM56796c == null) {
            flutterEngineM56796c = FlutterEngineFactory.m56796c(FlutterEngineFactory.f46663a, context, null, null, this.f46766c0, 6, null);
            this.f46765b0 = flutterEngineM56796c;
            C44128b.m97266j("FlutterEntryFragment", "flutterEngine create");
        } else {
            Intrinsics.checkNotNull(flutterEngineM56796c);
        }
        m56969D3(flutterEngineM56796c);
        FlutterView flutterView = this.f46758U;
        if (flutterView != null) {
            flutterView.attachToFlutterEngine(flutterEngineM56796c);
        }
        flutterEngineM56796c.getLifecycleChannel().appIsResumed();
        C44128b.m97266j("FlutterEntryFragment", "attachToFlutterEngine by loadFlutterEngine");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C44128b.m97266j("FlutterEntryFragment", "detachFromFlutterEngine destroy");
        this.f46763Z.removeCallbacksAndMessages(null);
        try {
            MethodChannel methodChannel = this.f46767d0;
            if (methodChannel != null) {
                methodChannel.setMethodCallHandler(null);
            }
            this.f46767d0 = null;
            m56967A3().unregister();
            m56974y3().unregister();
            m56975z3().unregister();
            FlutterEngine flutterEngine = this.f46765b0;
            if (flutterEngine != null) {
                flutterEngine.getLifecycleChannel().appIsDetached();
                FlutterView flutterView = this.f46758U;
                if (flutterView != null) {
                    flutterView.detachFromFlutterEngine();
                }
                FlutterView flutterView2 = this.f46758U;
                if (flutterView2 != null) {
                    flutterView2.removeOnFirstFrameRenderedListener(this.f46764a0);
                }
                flutterEngine.destroy();
            }
            this.f46765b0 = null;
            this.f46758U = null;
        } catch (Throwable th2) {
            try {
                String message = th2.getMessage();
                if (message == null || (!StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                    C44199a.m97421b(th2, "destroy failed");
                } else {
                    C43846g.m96568c(new FlutterIssueException(th2, "destroy failed", true, null, 8, null), null, 2, null);
                }
            } finally {
                this.f46765b0 = null;
                this.f46758U = null;
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        FlutterEngine flutterEngine = this.f46765b0;
        if (flutterEngine != null) {
            flutterEngine.getLifecycleChannel().appIsPaused();
        }
        m56967A3().m56789a();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        String strM56284y;
        Bundle arguments = getArguments();
        if (arguments == null || (strM56284y = RouteExKt.m56284y(arguments, "flutterInitialRoute")) == null) {
            strM56284y = "/";
        }
        this.f46766c0 = strM56284y;
        ViewExtKt.m66594y(m56968B3());
        C11352b.m20197a(m56968B3());
        m56964v3(this, false, 1, null);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m56971F3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        FlutterEngine flutterEngine = this.f46765b0;
        if (flutterEngine != null) {
            flutterEngine.getLifecycleChannel().appIsInactive();
        }
        m56967A3().m56790b();
    }

    /* JADX INFO: renamed from: u3 */
    public final void m56973u3(boolean z11) {
        Context context = getContext();
        if (context != null) {
            try {
                FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
                Intrinsics.checkNotNullExpressionValue(flutterLoader, "flutterLoader(...)");
                if (flutterLoader.initialized()) {
                    m56970E3();
                    return;
                }
                C44128b.m97266j("FlutterEntryFragment", "flutterLoader ensureInitializationCompleteAsync");
                if (FlutterImpellerConfig.f46678a.m56819f()) {
                    flutterLoader.ensureInitializationCompleteAsync(context, FlutterShellArgsHelper.f46683a.m56821b(), this.f46763Z, new Runnable() { // from class: com.kubi.sdk.flutter.ui.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            FlutterEntryFragment.m56965w3(this.f46778b);
                        }
                    });
                } else {
                    flutterLoader.ensureInitializationCompleteAsync(context, null, this.f46763Z, new Runnable() { // from class: com.kubi.sdk.flutter.ui.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            FlutterEntryFragment.m56966x3(this.f46779b);
                        }
                    });
                }
            } catch (Throwable th2) {
                String message = th2.getMessage();
                if (message == null || (!StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                    C44199a.m97421b(th2, "FlutterInjector failed");
                } else {
                    C43846g.m96568c(new FlutterIssueException(th2, "FlutterInjector failed", true, null, 8, null), null, 2, null);
                }
            }
        }
    }
}
