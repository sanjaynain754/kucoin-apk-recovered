package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.GestureHandlerOrchestrator;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sb0.C44379e;
import sb0.C44381g;

/* JADX INFO: compiled from: RNGestureHandlerRootHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00142\u00020\u0001:\u0002\u001b,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)¨\u0006-"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "", "Lcom/facebook/react/bridge/ReactContext;", "context", "Landroid/view/ViewGroup;", "wrappedView", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Landroid/view/ViewGroup;)V", "", "j", "()V", "i", "Landroid/view/MotionEvent;", "ev", "", "e", "(Landroid/view/MotionEvent;)Z", "", "viewTag", "blockNativeResponder", "g", "(IZ)V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "d", "(Landroid/view/View;)V", "k", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/react/bridge/ReactContext;", "Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;", "b", "Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;", "orchestrator", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "c", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "jsGestureHandler", "Landroid/view/ViewGroup;", "f", "()Landroid/view/ViewGroup;", "rootView", "Z", "shouldIntercept", "passingTouch", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRNGestureHandlerRootHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNGestureHandlerRootHelper.kt\ncom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
public final class RNGestureHandlerRootHelper {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ReactContext context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final GestureHandlerOrchestrator orchestrator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final GestureHandler<?> jsGestureHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ViewGroup rootView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean shouldIntercept;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean passingTouch;

    /* JADX INFO: compiled from: RNGestureHandlerRootHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper$Companion;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "viewGroup", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;", "", "MIN_ALPHA_FOR_TOUCH", "F", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final ViewGroup m72048a(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent parent = viewGroup;
            while (parent != null && !(parent instanceof RootView)) {
                parent = parent.getParent();
            }
            if (parent != null) {
                return (ViewGroup) parent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper$a */
    /* JADX INFO: compiled from: RNGestureHandlerRootHelper.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0000R\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper$a;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "<init>", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;)V", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "h0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "i0", "g0", "()V", "S0", "(Landroid/view/MotionEvent;)V", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public final class C33439a extends GestureHandler<C33439a> {
        public C33439a() {
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        /* JADX INFO: renamed from: g0 */
        public void mo71714g0() {
            RNGestureHandlerRootHelper.this.shouldIntercept = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setAction(3);
            if (RNGestureHandlerRootHelper.this.getRootView() instanceof RootView) {
                ((RootView) RNGestureHandlerRootHelper.this.getRootView()).onChildStartedNativeGesture(RNGestureHandlerRootHelper.this.getRootView(), motionEventObtain);
            }
            motionEventObtain.recycle();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        /* JADX INFO: renamed from: h0 */
        public void mo71715h0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
            m72049S0(event);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        /* JADX INFO: renamed from: i0 */
        public void mo71779i0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
            m72049S0(event);
        }

        /* JADX INFO: renamed from: S0 */
        public final void m72049S0(MotionEvent event) {
            GestureHandlerOrchestrator orchestrator;
            if (getState() == 0 && (!RNGestureHandlerRootHelper.this.shouldIntercept || (orchestrator = getOrchestrator()) == null || !orchestrator.m71855v())) {
                m71786n();
                RNGestureHandlerRootHelper.this.shouldIntercept = false;
            }
            if (event.getActionMasked() != 1 && event.getActionMasked() != 10) {
                return;
            }
            m71808z();
        }
    }

    public RNGestureHandlerRootHelper(@NotNull ReactContext context, @NotNull ViewGroup wrappedView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrappedView, "wrappedView");
        this.context = context;
        UiThreadUtil.assertOnUiThread();
        int id2 = wrappedView.getId();
        if (id2 < 1) {
            throw new IllegalStateException(("Expect view tag to be set for " + wrappedView).toString());
        }
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((ThemedReactContext) context).getReactApplicationContext().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        C44379e registry = rNGestureHandlerModule.getRegistry();
        ViewGroup viewGroupM72048a = INSTANCE.m72048a(wrappedView);
        this.rootView = viewGroupM72048a;
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Initialize gesture handler for root view " + viewGroupM72048a);
        GestureHandlerOrchestrator gestureHandlerOrchestrator = new GestureHandlerOrchestrator(wrappedView, registry, new C44381g());
        gestureHandlerOrchestrator.m71834F(0.1f);
        this.orchestrator = gestureHandlerOrchestrator;
        C33439a c33439a = new C33439a();
        c33439a.m71741G0(-id2);
        this.jsGestureHandler = c33439a;
        registry.m97884j(c33439a);
        registry.m97878c(c33439a.getTag(), id2, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m72042e(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        this.passingTouch = true;
        GestureHandlerOrchestrator gestureHandlerOrchestrator = this.orchestrator;
        Intrinsics.checkNotNull(gestureHandlerOrchestrator);
        gestureHandlerOrchestrator.m71830B(ev2);
        this.passingTouch = false;
        return this.shouldIntercept;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ViewGroup getRootView() {
        return this.rootView;
    }

    /* JADX INFO: renamed from: g */
    public final void m72044g(int viewTag, boolean blockNativeResponder) {
        if (blockNativeResponder) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: sb0.f
                @Override // java.lang.Runnable
                public final void run() {
                    RNGestureHandlerRootHelper.m72040h(this.f98040b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m72045i() {
        if (this.orchestrator == null || this.passingTouch) {
            return;
        }
        m72047k();
    }

    /* JADX INFO: renamed from: j */
    public final void m72046j() {
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.rootView);
        ReactContext reactContext = this.context;
        Intrinsics.checkNotNull(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((ThemedReactContext) reactContext).getReactApplicationContext().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        C44379e registry = rNGestureHandlerModule.getRegistry();
        GestureHandler<?> gestureHandler = this.jsGestureHandler;
        Intrinsics.checkNotNull(gestureHandler);
        registry.m97881g(gestureHandler.getTag());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m72047k() {
        GestureHandler<?> gestureHandler = this.jsGestureHandler;
        if (gestureHandler == null || gestureHandler.getState() != 2) {
            return;
        }
        gestureHandler.m71778i();
        gestureHandler.m71808z();
    }

    /* JADX INFO: renamed from: h */
    public static final void m72040h(RNGestureHandlerRootHelper rNGestureHandlerRootHelper) {
        rNGestureHandlerRootHelper.m72047k();
    }

    /* JADX INFO: renamed from: d */
    public final void m72041d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        GestureHandlerOrchestrator gestureHandlerOrchestrator = this.orchestrator;
        if (gestureHandlerOrchestrator != null) {
            gestureHandlerOrchestrator.m71842f(view);
        }
    }
}
