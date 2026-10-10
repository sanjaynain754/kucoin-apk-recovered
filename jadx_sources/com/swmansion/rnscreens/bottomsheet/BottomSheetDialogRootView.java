package com.swmansion.rnscreens.bottomsheet;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BottomSheetDialogRootView.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/swmansion/rnscreens/bottomsheet/BottomSheetDialogRootView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/uimanager/RootView;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "jsTouchDispatcher", "Lcom/facebook/react/uimanager/JSTouchDispatcher;", "jsPointerDispatcher", "Lcom/facebook/react/uimanager/JSPointerDispatcher;", ViewProps.ON_LAYOUT, "", "changed", "", CmcdData.Factory.STREAM_TYPE_LIVE, "", "t", "r", "b", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "onInterceptHoverEvent", "onHoverEvent", "onChildStartedNativeGesture", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onChildEndedNativeGesture", "requestDisallowInterceptTouchEvent", "disallowIntercept", "handleException", "throwable", "", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nBottomSheetDialogRootView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialogRootView.kt\ncom/swmansion/rnscreens/bottomsheet/BottomSheetDialogRootView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class BottomSheetDialogRootView extends ReactViewGroup implements RootView {

    @NotNull
    public static final String TAG = "BottomSheetDialogRootView";

    @NotNull
    private final EventDispatcher eventDispatcher;

    @Nullable
    private JSPointerDispatcher jsPointerDispatcher;

    @NotNull
    private final JSTouchDispatcher jsTouchDispatcher;

    @Nullable
    private final ReactContext reactContext;

    @Override // com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(@Nullable View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.jsTouchDispatcher.onChildStartedNativeGesture(event, this.eventDispatcher);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.onChildStartedNativeGesture(view, event, this.eventDispatcher);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetDialogRootView(@Nullable ReactContext reactContext, @NotNull EventDispatcher eventDispatcher) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        this.reactContext = reactContext;
        this.eventDispatcher = eventDispatcher;
        this.jsTouchDispatcher = new JSTouchDispatcher(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.jsPointerDispatcher = new JSPointerDispatcher(this);
        }
    }

    @Nullable
    public final ReactContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public boolean onHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, this.eventDispatcher, false);
        }
        return super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, this.eventDispatcher, true);
        }
        return super.onHoverEvent(event);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.jsTouchDispatcher.handleTouchEvent(event, this.eventDispatcher);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, this.eventDispatcher, true);
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        if (changed) {
            getChildCount();
            getChildAt(0).layout(l11, t11, r11, b11);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.jsTouchDispatcher.handleTouchEvent(event, this.eventDispatcher);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, this.eventDispatcher, false);
        }
        super.onTouchEvent(event);
        return true;
    }

    @Override // com.facebook.react.uimanager.RootView
    public void handleException(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildEndedNativeGesture(@NotNull View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        this.jsTouchDispatcher.onChildEndedNativeGesture(event, this.eventDispatcher);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.onChildEndedNativeGesture();
        }
    }

    @Override // com.facebook.react.uimanager.RootView
    @Deprecated(message = "Deprecated by React Native")
    public void onChildStartedNativeGesture(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        throw new IllegalStateException("Deprecated onChildStartedNativeGesture was called");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }
}
