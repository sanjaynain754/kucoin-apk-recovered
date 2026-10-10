package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.views.view.ReactViewGroup;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RNGestureHandlerRootView.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "onAttachedToWindow", "()V", "g", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "event", "dispatchGenericMotionEvent", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "f", "(Landroid/view/View;)V", "b", "Z", "_enabled", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "c", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "rootHelper", "d", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RNGestureHandlerRootView extends ReactViewGroup {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean _enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public RNGestureHandlerRootHelper rootHelper;

    /* JADX INFO: compiled from: RNGestureHandlerRootView.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootView$Companion;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "viewGroup", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/ViewGroup;)Z", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m72052a(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (!(parent instanceof RNGestureHandlerEnabledRootView) && !(parent instanceof RNGestureHandlerRootView)) {
                    if (parent instanceof RootView) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this._enabled) {
            RNGestureHandlerRootHelper rNGestureHandlerRootHelper = this.rootHelper;
            Intrinsics.checkNotNull(rNGestureHandlerRootHelper);
            if (rNGestureHandlerRootHelper.m72042e(event)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (this._enabled) {
            RNGestureHandlerRootHelper rNGestureHandlerRootHelper = this.rootHelper;
            Intrinsics.checkNotNull(rNGestureHandlerRootHelper);
            if (rNGestureHandlerRootHelper.m72042e(ev2)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    /* JADX INFO: renamed from: g */
    public final void m72051g() {
        RNGestureHandlerRootHelper rNGestureHandlerRootHelper = this.rootHelper;
        if (rNGestureHandlerRootHelper != null) {
            rNGestureHandlerRootHelper.m72046j();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (this._enabled) {
            RNGestureHandlerRootHelper rNGestureHandlerRootHelper = this.rootHelper;
            Intrinsics.checkNotNull(rNGestureHandlerRootHelper);
            rNGestureHandlerRootHelper.m72045i();
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public RNGestureHandlerRootView(@Nullable Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m72050f(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RNGestureHandlerRootHelper rNGestureHandlerRootHelper = this.rootHelper;
        if (rNGestureHandlerRootHelper != null) {
            rNGestureHandlerRootHelper.m72041d(view);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean zM72052a = INSTANCE.m72052a(this);
        this._enabled = !zM72052a;
        if (zM72052a) {
            Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this._enabled && this.rootHelper == null) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.rootHelper = new RNGestureHandlerRootHelper((ReactContext) context, this);
        }
    }
}
