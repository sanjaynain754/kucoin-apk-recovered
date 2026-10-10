package com.swmansion.rnscreens.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactCompoundViewGroup;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.rnscreens.ext.NumericExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DimmingView.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\fJ0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0014J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020\u0012H\u0014J\u0016\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"H\u0096\u0001¢\u0006\u0002\u0010$R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, m90084d2 = {"Lcom/swmansion/rnscreens/bottomsheet/DimmingView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/ReactCompoundViewGroup;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "context", "Landroid/content/Context;", "initialAlpha", "", "pointerEventsProxy", "Lcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsProxy;", "<init>", "(Landroid/content/Context;FLcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsProxy;)V", "(Landroid/content/Context;F)V", "blockGestures", "", "getBlockGestures$react_native_screens_release", "()Z", ViewProps.ON_LAYOUT, "", "changed", CmcdData.Factory.STREAM_TYPE_LIVE, "", "t", "r", "b", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "reactTagForTouch", "x", "y", "interceptsTouchEvent", "onDetachedFromWindow", "getPointerEvents", "Lcom/facebook/react/uimanager/PointerEvents;", "kotlin.jvm.PlatformType", "()Lcom/facebook/react/uimanager/PointerEvents;", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class DimmingView extends ViewGroup implements ReactCompoundViewGroup, ReactPointerEventsView {

    @NotNull
    public static final String TAG = "DimmingView";

    @NotNull
    private final DimmingViewPointerEventsProxy pointerEventsProxy;

    public /* synthetic */ DimmingView(Context context, float f11, DimmingViewPointerEventsProxy dimmingViewPointerEventsProxy, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0.6f : f11, dimmingViewPointerEventsProxy);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DimmingView(@NotNull Context context, float f11, @NotNull DimmingViewPointerEventsProxy pointerEventsProxy) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pointerEventsProxy, "pointerEventsProxy");
        this.pointerEventsProxy = pointerEventsProxy;
        pointerEventsProxy.setPointerEventsImpl(new DimmingViewPointerEventsImpl(this));
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        setAlpha(f11);
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        return this.pointerEventsProxy.getPointerEvents();
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float x11, float y11) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }

    public final boolean getBlockGestures$react_native_screens_release() {
        return !NumericExtKt.equalWithRespectToEps$default(getAlpha(), 0.0f, 0.0f, 2, null);
    }

    @Override // com.facebook.react.uimanager.ReactCompoundViewGroup
    public boolean interceptsTouchEvent(float x11, float y11) {
        return getBlockGestures$react_native_screens_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.pointerEventsProxy.setPointerEventsImpl(null);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (getBlockGestures$react_native_screens_release()) {
            callOnClick();
        }
        return getBlockGestures$react_native_screens_release();
    }

    public /* synthetic */ DimmingView(Context context, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0.6f : f11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DimmingView(@NotNull Context context, float f11) {
        this(context, f11, new DimmingViewPointerEventsProxy(null));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }
}
