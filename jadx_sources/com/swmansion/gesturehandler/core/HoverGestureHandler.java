package com.swmansion.gesturehandler.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.swmansion.gesturehandler.core.HoverGestureHandler;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import sb0.C44381g;

/* JADX INFO: compiled from: HoverGestureHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u001c\u0010\u0013\u001a\u00020\u00052\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0082\u0004¢\u0006\u0004\b\u0013\u0010\u0007J+\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0003R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/HoverGestureHandler;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "handler", "", "I0", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "K0", "J0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "h0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "i0", "k0", "other", "W0", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "rootView", "X0", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)Ljava/lang/Boolean;", "T0", "Landroid/os/Handler;", "N", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "O", "Ljava/lang/Runnable;", "finishRunnable", "Lcom/swmansion/gesturehandler/core/StylusData;", "value", "P", "Lcom/swmansion/gesturehandler/core/StylusData;", "V0", "()Lcom/swmansion/gesturehandler/core/StylusData;", "stylusData", "Q", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class HoverGestureHandler extends GestureHandler<HoverGestureHandler> {

    /* JADX INFO: renamed from: R */
    @NotNull
    public static final C44381g f68206R = new C44381g();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public Handler handler;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public Runnable finishRunnable = new Runnable() { // from class: rb0.i
        @Override // java.lang.Runnable
        public final void run() {
            HoverGestureHandler.m71868U0(this.f97181b);
        }
    };

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public StylusData stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ Boolean m71869Y0(HoverGestureHandler hoverGestureHandler, View view, View view2, View view3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            view3 = view.getRootView();
        }
        return hoverGestureHandler.m71873X0(view, view2, view3);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: I0 */
    public boolean mo71745I0(@NotNull GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler instanceof HoverGestureHandler) {
            HoverGestureHandler hoverGestureHandler = (HoverGestureHandler) handler;
            if (!hoverGestureHandler.m71872W0(this)) {
                View view = hoverGestureHandler.getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
                Intrinsics.checkNotNull(view);
                View view2 = getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
                Intrinsics.checkNotNull(view2);
                Boolean boolM71869Y0 = m71869Y0(this, view, view2, null, 4, null);
                Intrinsics.checkNotNull(boolM71869Y0);
                return boolM71869Y0.booleanValue();
            }
        }
        return super.mo71745I0(handler);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: J0 */
    public boolean mo71747J0(@NotNull GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (((handler instanceof HoverGestureHandler) && (m71872W0(handler) || ((HoverGestureHandler) handler).m71872W0(this))) || (handler instanceof RNGestureHandlerRootHelper.C33439a)) {
            return true;
        }
        return super.mo71747J0(handler);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: K0 */
    public boolean mo71749K0(@NotNull GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if ((handler instanceof HoverGestureHandler) && !m71872W0(handler)) {
            HoverGestureHandler hoverGestureHandler = (HoverGestureHandler) handler;
            if (!hoverGestureHandler.m71872W0(this)) {
                View view = getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
                Intrinsics.checkNotNull(view);
                View view2 = hoverGestureHandler.getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
                Intrinsics.checkNotNull(view2);
                Boolean boolM71869Y0 = m71869Y0(this, view, view2, null, 4, null);
                if (boolM71869Y0 != null) {
                    return boolM71869Y0.booleanValue();
                }
            }
        }
        return super.mo71749K0(handler);
    }

    @NotNull
    /* JADX INFO: renamed from: V0, reason: from getter */
    public final StylusData getStylusData() {
        return this.stylusData;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: h0 */
    public void mo71715h0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 0) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.handler = null;
            return;
        }
        if (event.getAction() != 1 || getIsWithinBounds()) {
            return;
        }
        m71870T0();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: i0 */
    public void mo71779i0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 10) {
            if (this.handler == null) {
                this.handler = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.handler;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.finishRunnable, 4L);
            return;
        }
        if (!getIsWithinBounds()) {
            m71870T0();
            return;
        }
        if (getState() == 4 && event.getToolType(0) == 2) {
            this.stylusData = StylusData.INSTANCE.fromEvent(event);
            return;
        }
        if (getState() == 0) {
            if (event.getAction() == 7 || event.getAction() == 9) {
                m71786n();
                m71778i();
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public static final void m71868U0(HoverGestureHandler hoverGestureHandler) {
        hoverGestureHandler.m71870T0();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m71870T0() {
        int state = getState();
        if (state != 0) {
            if (state != 2) {
                if (state != 4) {
                    return;
                }
                m71808z();
                return;
            }
            m71730B();
            return;
        }
        m71788o();
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m71872W0(GestureHandler<?> other) {
        View view = other.getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
        while (view != null) {
            if (Intrinsics.areEqual(view, getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String())) {
                return true;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: X0 */
    public final Boolean m71873X0(View view, View other, View rootView) {
        if (Intrinsics.areEqual(rootView, other)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(rootView, view)) {
            return Boolean.FALSE;
        }
        if (rootView instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) rootView;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                Boolean boolM71873X0 = m71873X0(view, other, f68206R.mo96940b(viewGroup, i11));
                if (boolM71873X0 != null) {
                    return boolM71873X0;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: k0 */
    public void mo71717k0() {
        super.mo71717k0();
        this.stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }
}
