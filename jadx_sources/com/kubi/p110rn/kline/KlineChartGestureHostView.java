package com.kubi.p110rn.kline;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineChartGestureHostView.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineChartGestureHostView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "touchSlop", "", "longPressTimeout", "", "downX", "", "downY", "gestureActive", "", "directionDecided", "chartOwnsGesture", "lockLongPressGesture", "Ljava/lang/Runnable;", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "requestDisallowInterceptTouchEvent", "", "disallowIntercept", "lockToChart", "handOffToParent", "setParentInterceptDisallowed", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlineChartGestureHostView extends FrameLayout {
    private static final float DIRECTION_DOMINANCE_RATIO = 1.5f;
    private boolean chartOwnsGesture;
    private boolean directionDecided;
    private float downX;
    private float downY;
    private boolean gestureActive;

    @NotNull
    private final Runnable lockLongPressGesture;
    private final long longPressTimeout;
    private final int touchSlop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineChartGestureHostView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.lockLongPressGesture = new Runnable() { // from class: com.kubi.rn.kline.a
            @Override // java.lang.Runnable
            public final void run() {
                KlineChartGestureHostView.lockLongPressGesture$lambda$0(this.f46053b);
            }
        };
    }

    private final void handOffToParent() {
        removeCallbacks(this.lockLongPressGesture);
        this.directionDecided = true;
        this.chartOwnsGesture = false;
        setParentInterceptDisallowed(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lockLongPressGesture$lambda$0(KlineChartGestureHostView klineChartGestureHostView) {
        if (!klineChartGestureHostView.gestureActive || klineChartGestureHostView.directionDecided) {
            return;
        }
        klineChartGestureHostView.directionDecided = true;
        klineChartGestureHostView.chartOwnsGesture = true;
        klineChartGestureHostView.setParentInterceptDisallowed(true);
    }

    private final void lockToChart() {
        removeCallbacks(this.lockLongPressGesture);
        this.directionDecided = true;
        this.chartOwnsGesture = true;
        setParentInterceptDisallowed(true);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        int actionMasked = ev2.getActionMasked();
        if (actionMasked == 0) {
            this.downX = ev2.getX();
            this.downY = ev2.getY();
            this.gestureActive = true;
            this.directionDecided = false;
            this.chartOwnsGesture = false;
            setParentInterceptDisallowed(true);
            removeCallbacks(this.lockLongPressGesture);
            postDelayed(this.lockLongPressGesture, this.longPressTimeout);
        } else if (actionMasked == 1) {
            removeCallbacks(this.lockLongPressGesture);
            this.gestureActive = false;
            this.directionDecided = false;
            this.chartOwnsGesture = false;
            setParentInterceptDisallowed(false);
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                removeCallbacks(this.lockLongPressGesture);
                this.gestureActive = false;
                this.directionDecided = false;
                this.chartOwnsGesture = false;
                setParentInterceptDisallowed(false);
            } else if (actionMasked == 5) {
                lockToChart();
            }
        } else if (ev2.getPointerCount() >= 2) {
            removeCallbacks(this.lockLongPressGesture);
            this.directionDecided = true;
            this.chartOwnsGesture = true;
            setParentInterceptDisallowed(true);
        } else if (!this.directionDecided) {
            float fAbs = Math.abs(ev2.getX() - this.downX);
            float fAbs2 = Math.abs(ev2.getY() - this.downY);
            if (((float) Math.hypot(fAbs, fAbs2)) > this.touchSlop) {
                removeCallbacks(this.lockLongPressGesture);
                if (fAbs2 >= fAbs * 1.5f) {
                    handOffToParent();
                } else {
                    lockToChart();
                }
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (this.gestureActive) {
            disallowIntercept = !this.directionDecided ? true : this.chartOwnsGesture;
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    private final void setParentInterceptDisallowed(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }
}
