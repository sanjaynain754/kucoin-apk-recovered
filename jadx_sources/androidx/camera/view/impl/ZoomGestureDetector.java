package androidx.camera.view.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Px;
import androidx.annotation.UiThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: ZoomGestureDetector.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 02\u00020\u0001:\u0003./0B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(H\u0007J\b\u0010)\u001a\u00020\u000eH\u0002J\b\u0010*\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010+\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, m90084d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector;", "", "context", "Landroid/content/Context;", "spanSlop", "", "minSpan", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;", "<init>", "(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V", "focusX", "focusY", "isQuickZoomEnabled", "", "()Z", "setQuickZoomEnabled", "(Z)V", "isStylusZoomEnabled", "setStylusZoomEnabled", "currentSpan", "", "previousSpan", "currentSpanX", "currentSpanY", "previousSpanX", "previousSpanY", "eventTime", "", "isInProgress", "initialSpan", "prevTime", "anchoredZoomStartX", "anchoredZoomStartY", "anchoredZoomMode", "gestureDetector", "Landroid/view/GestureDetector;", "eventBeforeOrAboveStartingGestureEvent", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "inAnchoredZoomMode", "getIncrementalScaleFactor", "timeDelta", "getTimeDelta", "()J", "ZoomEvent", "OnZoomGestureListener", "Companion", "camera-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ZoomGestureDetector {
    private static final int ANCHORED_ZOOM_MODE_DOUBLE_TAP = 1;
    private static final int ANCHORED_ZOOM_MODE_NONE = 0;
    private static final int ANCHORED_ZOOM_MODE_STYLUS = 2;
    private static final int DEFAULT_MIN_SPAN = 0;
    private static final float SCALE_FACTOR = 0.5f;
    private int anchoredZoomMode;
    private float anchoredZoomStartX;
    private float anchoredZoomStartY;

    @NotNull
    private final Context context;
    private float currentSpan;
    private float currentSpanX;
    private float currentSpanY;
    private boolean eventBeforeOrAboveStartingGestureEvent;
    private long eventTime;

    @Px
    private int focusX;

    @Px
    private int focusY;

    @NotNull
    private GestureDetector gestureDetector;
    private float initialSpan;
    private boolean isInProgress;
    private boolean isQuickZoomEnabled;
    private boolean isStylusZoomEnabled;

    @NotNull
    private final OnZoomGestureListener listener;
    private final int minSpan;
    private long prevTime;
    private float previousSpan;
    private float previousSpanX;
    private float previousSpanY;
    private final int spanSlop;

    /* JADX INFO: compiled from: ZoomGestureDetector.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;", "", "onZoomEvent", "", "zoomEvent", "Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;", "camera-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface OnZoomGestureListener {
        @UiThread
        boolean onZoomEvent(@NotNull ZoomEvent zoomEvent);
    }

    /* JADX INFO: compiled from: ZoomGestureDetector.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B'\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0011"}, m90084d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;", "", "eventTime", "", "focusX", "", "focusY", "<init>", "(JII)V", "getEventTime", "()J", "getFocusX", "()I", "getFocusY", "Begin", "Move", "End", "camera-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static abstract class ZoomEvent {
        private final long eventTime;
        private final int focusX;
        private final int focusY;

        /* JADX INFO: compiled from: ZoomGestureDetector.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Begin;", "Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;", "eventTime", "", "focusX", "", "focusY", "<init>", "(JII)V", "camera-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public static final class Begin extends ZoomEvent {
            public Begin(@IntRange(from = 0) long j11, @IntRange(from = 0) @Px int i11, @IntRange(from = 0) @Px int i12) {
                super(j11, i11, i12, null);
            }
        }

        /* JADX INFO: compiled from: ZoomGestureDetector.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$End;", "Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;", "eventTime", "", "focusX", "", "focusY", "incrementalScaleFactor", "", "<init>", "(JIIF)V", "getIncrementalScaleFactor", "()F", "camera-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public static final class End extends ZoomEvent {
            private final float incrementalScaleFactor;

            public End(@IntRange(from = 0) long j11, @IntRange(from = 0) @Px int i11, @IntRange(from = 0) @Px int i12, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
                super(j11, i11, i12, null);
                this.incrementalScaleFactor = f11;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        /* JADX INFO: compiled from: ZoomGestureDetector.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Move;", "Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;", "eventTime", "", "focusX", "", "focusY", "incrementalScaleFactor", "", "<init>", "(JIIF)V", "getIncrementalScaleFactor", "()F", "camera-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public static final class Move extends ZoomEvent {
            private final float incrementalScaleFactor;

            public Move(@IntRange(from = 0) long j11, @IntRange(from = 0) @Px int i11, @IntRange(from = 0) @Px int i12, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
                super(j11, i11, i12, null);
                this.incrementalScaleFactor = f11;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        public /* synthetic */ ZoomEvent(long j11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, i11, i12);
        }

        private ZoomEvent(@IntRange(from = 0) long j11, @IntRange(from = 0) @Px int i11, @IntRange(from = 0) @Px int i12) {
            this.eventTime = j11;
            this.focusX = i11;
            this.focusY = i12;
        }

        public final long getEventTime() {
            return this.eventTime;
        }

        public final int getFocusX() {
            return this.focusX;
        }

        public final int getFocusY() {
            return this.focusY;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(@NotNull Context context, @Px int i11, @NotNull OnZoomGestureListener listener) {
        this(context, i11, 0, listener, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(@NotNull Context context, @NotNull OnZoomGestureListener listener) {
        this(context, 0, 0, listener, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    private final boolean inAnchoredZoomMode() {
        return this.anchoredZoomMode != 0;
    }

    public final long getTimeDelta() {
        return this.eventTime - this.prevTime;
    }

    /* JADX INFO: renamed from: isQuickZoomEnabled, reason: from getter */
    public final boolean getIsQuickZoomEnabled() {
        return this.isQuickZoomEnabled;
    }

    /* JADX INFO: renamed from: isStylusZoomEnabled, reason: from getter */
    public final boolean getIsStylusZoomEnabled() {
        return this.isStylusZoomEnabled;
    }

    @UiThread
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        boolean z11;
        float f11;
        float f12;
        Intrinsics.checkNotNullParameter(event, "event");
        this.eventTime = event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (this.isQuickZoomEnabled) {
            this.gestureDetector.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z12 = (event.getButtonState() & 32) != 0;
        boolean z13 = this.anchoredZoomMode == 2 && !z12;
        boolean z14 = actionMasked == 1 || actionMasked == 3 || z13;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z14) {
            if (this.isInProgress) {
                z11 = true;
                this.listener.onZoomEvent(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
                this.isInProgress = false;
                this.initialSpan = 0.0f;
                this.anchoredZoomMode = 0;
            } else {
                z11 = true;
                if (inAnchoredZoomMode() && z14) {
                    this.isInProgress = false;
                    this.initialSpan = 0.0f;
                    this.anchoredZoomMode = 0;
                }
            }
            if (z14) {
                return z11;
            }
        } else {
            z11 = true;
        }
        if (!this.isInProgress && this.isStylusZoomEnabled && !inAnchoredZoomMode() && !z14 && z12) {
            this.anchoredZoomStartX = event.getX();
            this.anchoredZoomStartY = event.getY();
            this.anchoredZoomMode = 2;
            this.initialSpan = 0.0f;
        }
        boolean z15 = (actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z13) ? z11 : false;
        boolean z16 = actionMasked == 6 ? z11 : false;
        int actionIndex = z16 ? event.getActionIndex() : -1;
        int i11 = z16 ? pointerCount - 1 : pointerCount;
        if (inAnchoredZoomMode()) {
            f12 = this.anchoredZoomStartX;
            f11 = this.anchoredZoomStartY;
            this.eventBeforeOrAboveStartingGestureEvent = event.getY() < f11 ? z11 : false;
        } else {
            float x11 = 0.0f;
            float y11 = 0.0f;
            for (int i12 = 0; i12 < pointerCount; i12++) {
                if (actionIndex != i12) {
                    x11 += event.getX(i12);
                    y11 += event.getY(i12);
                }
            }
            float f13 = i11;
            float f14 = x11 / f13;
            f11 = y11 / f13;
            f12 = f14;
        }
        float fAbs2 = 0.0f;
        for (int i13 = 0; i13 < pointerCount; i13++) {
            if (actionIndex != i13) {
                fAbs += Math.abs(event.getX(i13) - f12);
                fAbs2 += Math.abs(event.getY(i13) - f11);
            }
        }
        float f15 = i11;
        float f16 = fAbs / f15;
        float f17 = fAbs2 / f15;
        float f18 = 2;
        float f19 = f16 * f18;
        float f21 = f17 * f18;
        float fHypot = inAnchoredZoomMode() ? f21 : (float) Math.hypot(f19, f21);
        boolean z17 = this.isInProgress;
        this.focusX = MathKt.roundToInt(f12);
        this.focusY = MathKt.roundToInt(f11);
        if (!inAnchoredZoomMode() && this.isInProgress && (fHypot < this.minSpan || z15)) {
            this.listener.onZoomEvent(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
            this.isInProgress = false;
            this.initialSpan = fHypot;
        }
        if (z15) {
            this.currentSpanX = f19;
            this.previousSpanX = f19;
            this.currentSpanY = f21;
            this.previousSpanY = f21;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            this.initialSpan = fHypot;
        }
        int i14 = inAnchoredZoomMode() ? this.spanSlop : this.minSpan;
        if (!this.isInProgress && fHypot >= i14 && (z17 || Math.abs(fHypot - this.initialSpan) > this.spanSlop)) {
            this.currentSpanX = f19;
            this.previousSpanX = f19;
            this.currentSpanY = f21;
            this.previousSpanY = f21;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            long j11 = this.eventTime;
            this.prevTime = j11;
            this.isInProgress = this.listener.onZoomEvent(new ZoomEvent.Begin(j11, this.focusX, this.focusY));
        }
        if (actionMasked == 2) {
            this.currentSpanX = f19;
            this.currentSpanY = f21;
            this.currentSpan = fHypot;
            if (this.isInProgress ? this.listener.onZoomEvent(new ZoomEvent.Move(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor())) : z11) {
                this.previousSpanX = this.currentSpanX;
                this.previousSpanY = this.currentSpanY;
                this.previousSpan = this.currentSpan;
                this.prevTime = this.eventTime;
            }
        }
        return z11;
    }

    public final void setQuickZoomEnabled(boolean z11) {
        this.isQuickZoomEnabled = z11;
    }

    public final void setStylusZoomEnabled(boolean z11) {
        this.isStylusZoomEnabled = z11;
    }

    @JvmOverloads
    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(@NotNull Context context, @Px int i11, @Px int i12, @NotNull OnZoomGestureListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.spanSlop = i11;
        this.minSpan = i12;
        this.listener = listener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: androidx.camera.view.impl.ZoomGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                this.this$0.anchoredZoomStartX = e11.getX();
                this.this$0.anchoredZoomStartY = e11.getY();
                this.this$0.anchoredZoomMode = 1;
                return true;
            }
        });
    }

    private final float getIncrementalScaleFactor() {
        boolean z11;
        if (inAnchoredZoomMode()) {
            boolean z12 = this.eventBeforeOrAboveStartingGestureEvent;
            if ((z12 && this.currentSpan < this.previousSpan) || (!z12 && this.currentSpan > this.previousSpan)) {
                z11 = true;
            } else {
                z11 = false;
            }
            float fAbs = Math.abs(1 - (this.currentSpan / this.previousSpan)) * 0.5f;
            if (this.previousSpan <= this.spanSlop) {
                return 1.0f;
            }
            if (z11) {
                return fAbs + 1.0f;
            }
            return 1.0f - fAbs;
        }
        float f11 = this.previousSpan;
        if (f11 <= 0.0f) {
            return 1.0f;
        }
        return this.currentSpan / f11;
    }

    public /* synthetic */ ZoomGestureDetector(Context context, int i11, int i12, OnZoomGestureListener onZoomGestureListener, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i11, (i13 & 4) != 0 ? 0 : i12, onZoomGestureListener);
    }
}
