package com.kubi.p110rn.kline;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.scroll.ReactScrollView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineChartScrollView.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineChartScrollView;", "Lcom/facebook/react/views/scroll/ReactScrollView;", "context", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "touchSlop", "", "longPressTimeout", "", "downX", "", "downY", "downTime", "gestureActive", "", "gestureDirection", "Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "requestDisallowInterceptTouchEvent", "", "disallowIntercept", "interceptMove", "lockToChart", "resetGesture", "GestureDirection", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlineChartScrollView extends ReactScrollView {
    private static final float DIRECTION_DOMINANCE_RATIO = 1.0f;
    private long downTime;
    private float downX;
    private float downY;
    private boolean gestureActive;

    @NotNull
    private GestureDirection gestureDirection;
    private final long longPressTimeout;
    private final int touchSlop;

    /* JADX INFO: compiled from: KlineChartScrollView.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/rn/kline/KlineChartScrollView$GestureDirection;", "", "<init>", "(Ljava/lang/String;I)V", "UNDECIDED", "CHART", "PAGE", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum GestureDirection {
        UNDECIDED,
        CHART,
        PAGE;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f46036c = EnumEntriesKt.enumEntries(m56018a());

        @NotNull
        public static EnumEntries<GestureDirection> getEntries() {
            return f46036c;
        }
    }

    private final void resetGesture() {
        this.gestureActive = false;
        this.gestureDirection = GestureDirection.UNDECIDED;
        this.downTime = 0L;
        super.requestDisallowInterceptTouchEvent(false);
    }

    /* JADX INFO: compiled from: KlineChartScrollView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GestureDirection.values().length];
            try {
                iArr[GestureDirection.CHART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GestureDirection.PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GestureDirection.UNDECIDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineChartScrollView(@NotNull ReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.gestureDirection = GestureDirection.UNDECIDED;
    }

    private final boolean interceptMove(MotionEvent event) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.gestureDirection.ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return super.onInterceptTouchEvent(event);
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        float fAbs = Math.abs(event.getX() - this.downX);
        float fAbs2 = Math.abs(event.getY() - this.downY);
        if (((float) Math.hypot(fAbs, fAbs2)) <= this.touchSlop) {
            return super.onInterceptTouchEvent(event);
        }
        if (fAbs2 <= fAbs * 1.0f) {
            lockToChart();
            return false;
        }
        this.gestureDirection = GestureDirection.PAGE;
        super.requestDisallowInterceptTouchEvent(false);
        return super.onInterceptTouchEvent(event);
    }

    private final void lockToChart() {
        this.gestureDirection = GestureDirection.CHART;
        super.requestDisallowInterceptTouchEvent(true);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollView, android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            resetGesture();
            this.downX = event.getX();
            this.downY = event.getY();
            this.downTime = SystemClock.uptimeMillis();
            this.gestureActive = true;
            return super.onInterceptTouchEvent(event);
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                return interceptMove(event);
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    return this.gestureDirection == GestureDirection.PAGE && super.onInterceptTouchEvent(event);
                }
                lockToChart();
                return false;
            }
        }
        boolean z11 = this.gestureDirection == GestureDirection.PAGE && super.onInterceptTouchEvent(event);
        resetGesture();
        return z11;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (!this.gestureActive) {
            super.requestDisallowInterceptTouchEvent(disallowIntercept);
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.gestureDirection.ordinal()];
        if (i11 == 1) {
            if (disallowIntercept) {
                super.requestDisallowInterceptTouchEvent(true);
                return;
            } else {
                resetGesture();
                return;
            }
        }
        if (i11 == 2) {
            super.requestDisallowInterceptTouchEvent(false);
            return;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!disallowIntercept || this.downTime <= 0 || SystemClock.uptimeMillis() - this.downTime < this.longPressTimeout) {
            return;
        }
        lockToChart();
    }
}
