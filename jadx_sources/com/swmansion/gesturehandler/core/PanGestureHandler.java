package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.swmansion.gesturehandler.core.PanGestureHandler;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import rb0.C43974h;

/* JADX INFO: compiled from: PanGestureHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 |2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001}B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0010J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0010J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010\u0010J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b&\u0010$J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\r¢\u0006\u0004\b/\u0010\u0010J\u0015\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\r¢\u0006\u0004\b1\u0010\u0010J\u0015\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u00020\r¢\u0006\u0004\b3\u0010\u0010J\u001f\u00107\u001a\u00020\n2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\nH\u0014¢\u0006\u0004\b<\u0010\fJ\u000f\u0010=\u001a\u00020\nH\u0014¢\u0006\u0004\b=\u0010\fJ\u000f\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010\fR$\u0010D\u001a\u00020\r2\u0006\u0010?\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010G\u001a\u00020\r2\u0006\u0010?\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR\u0014\u0010I\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010AR\u0016\u0010K\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010AR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010AR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010AR\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010AR\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010AR\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010AR\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010AR\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010AR\u0016\u0010\u001d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010AR\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010AR\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010AR\u0016\u0010W\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010AR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010%\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u0016\u0010\\\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010AR\u0016\u0010^\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010AR\u0016\u0010_\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010AR\u0016\u0010`\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010AR\u0016\u0010b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010AR\u0016\u0010d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010AR\u0018\u0010g\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010fR\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010TR\u0016\u0010k\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010qR$\u0010w\u001a\u00020s2\u0006\u0010?\u001a\u00020s8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010t\u001a\u0004\bu\u0010vR\u0011\u0010y\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bx\u0010CR\u0011\u0010{\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bz\u0010C¨\u0006~"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/PanGestureHandler;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "p1", "()Z", "q1", "", "o0", "()V", "", "activeOffsetXStart", "b1", "(F)Lcom/swmansion/gesturehandler/core/PanGestureHandler;", "activeOffsetXEnd", ICustomDataEditor.STRING_ARRAY_PARAM_1, "failOffsetXStart", "g1", "failOffsetXEnd", "f1", "activeOffsetYStart", "d1", "activeOffsetYEnd", "c1", "failOffsetYStart", "i1", "failOffsetYEnd", "h1", "minDist", "k1", "", "minPointers", "l1", "(I)Lcom/swmansion/gesturehandler/core/PanGestureHandler;", "maxPointers", "j1", "averageTouches", "e1", "(Z)Lcom/swmansion/gesturehandler/core/PanGestureHandler;", "", "time", "Z0", "(J)Lcom/swmansion/gesturehandler/core/PanGestureHandler;", "minVelocity", "m1", "minVelocityX", ICustomDataEditor.NUMBER_PARAM_1, "minVelocityY", "o1", "Landroid/view/MotionEvent;", "event", "sourceEvent", "h0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "force", "j", "(Z)V", "g0", "k0", "p0", "value", "N", "F", "X0", "()F", "velocityX", "O", "Y0", "velocityY", "P", "defaultMinDistSq", "Q", "minDistSq", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "a0", "b0", "minVelocitySq", "c0", "I", "d0", "e0", "startX", "f0", "startY", "offsetX", "offsetY", "i0", "lastX", "j0", "lastY", "Landroid/view/VelocityTracker;", "Landroid/view/VelocityTracker;", "velocityTracker", "l0", "m0", "J", "activateAfterLongPress", "Ljava/lang/Runnable;", "n0", "Ljava/lang/Runnable;", "activateDelayed", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Lcom/swmansion/gesturehandler/core/StylusData;", "Lcom/swmansion/gesturehandler/core/StylusData;", "U0", "()Lcom/swmansion/gesturehandler/core/StylusData;", "stylusData", "V0", "translationX", "W0", "translationY", "q0", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class PanGestureHandler extends GestureHandler<PanGestureHandler> {

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public float velocityX;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public float velocityY;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final float defaultMinDistSq;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public float minDistSq;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public float startX;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public float startY;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public float offsetX;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public float offsetY;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public float lastX;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public float lastY;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    @Nullable
    public VelocityTracker velocityTracker;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public boolean averageTouches;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public long activateAfterLongPress;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    @Nullable
    public Handler handler;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public float activeOffsetXStart = Float.MAX_VALUE;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public float activeOffsetXEnd = Float.MIN_VALUE;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public float failOffsetXStart = Float.MIN_VALUE;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public float failOffsetXEnd = Float.MAX_VALUE;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public float activeOffsetYStart = Float.MAX_VALUE;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public float activeOffsetYEnd = Float.MIN_VALUE;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public float failOffsetYStart = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public float failOffsetYEnd = Float.MAX_VALUE;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public float minVelocityX = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public float minVelocityY = Float.MAX_VALUE;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public float minVelocitySq = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public int minPointers = 1;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public int maxPointers = 10;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @NotNull
    public final Runnable activateDelayed = new Runnable() { // from class: rb0.m
        @Override // java.lang.Runnable
        public final void run() {
            PanGestureHandler.m71903T0(this.f97183b);
        }
    };

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    @NotNull
    public StylusData stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    /* JADX INFO: compiled from: PanGestureHandler.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/PanGestureHandler$Companion;", "", "<init>", "()V", "Landroid/view/VelocityTracker;", "tracker", "Landroid/view/MotionEvent;", "event", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;)V", "", "MIN_VALUE_IGNORE", "F", "MAX_VALUE_IGNORE", "", "DEFAULT_MIN_POINTERS", "I", "DEFAULT_MAX_POINTERS", "", "DEFAULT_ACTIVATE_AFTER_LONG_PRESS", "J", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final void m71927a(VelocityTracker tracker, MotionEvent event) {
            float rawX = event.getRawX() - event.getX();
            float rawY = event.getRawY() - event.getY();
            event.offsetLocation(rawX, rawY);
            Intrinsics.checkNotNull(tracker);
            tracker.addMovement(event);
            event.offsetLocation(-rawX, -rawY);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k1 */
    public final PanGestureHandler m71920k1(float minDist) {
        this.minDistSq = minDist * minDist;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: m1 */
    public final PanGestureHandler m71922m1(float minVelocity) {
        this.minVelocitySq = minVelocity * minVelocity;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: U0, reason: from getter */
    public final StylusData getStylusData() {
        return this.stylusData;
    }

    /* JADX INFO: renamed from: V0 */
    public final float m71905V0() {
        return (this.lastX - this.startX) + this.offsetX;
    }

    /* JADX INFO: renamed from: W0 */
    public final float m71906W0() {
        return (this.lastY - this.startY) + this.offsetY;
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final float getVelocityX() {
        return this.velocityX;
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final float getVelocityY() {
        return this.velocityY;
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final PanGestureHandler m71909Z0(long time) {
        this.activateAfterLongPress = time;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: a1 */
    public final PanGestureHandler m71910a1(float activeOffsetXEnd) {
        this.activeOffsetXEnd = activeOffsetXEnd;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public final PanGestureHandler m71911b1(float activeOffsetXStart) {
        this.activeOffsetXStart = activeOffsetXStart;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final PanGestureHandler m71912c1(float activeOffsetYEnd) {
        this.activeOffsetYEnd = activeOffsetYEnd;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final PanGestureHandler m71913d1(float activeOffsetYStart) {
        this.activeOffsetYStart = activeOffsetYStart;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: e1 */
    public final PanGestureHandler m71914e1(boolean averageTouches) {
        this.averageTouches = averageTouches;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: f1 */
    public final PanGestureHandler m71915f1(float failOffsetXEnd) {
        this.failOffsetXEnd = failOffsetXEnd;
        return this;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: g0 */
    public void mo71714g0() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g1 */
    public final PanGestureHandler m71916g1(float failOffsetXStart) {
        this.failOffsetXStart = failOffsetXStart;
        return this;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: h0 */
    public void mo71715h0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (m71743H0(sourceEvent)) {
            if (event.getToolType(0) == 2) {
                this.stylusData = StylusData.INSTANCE.fromEvent(event);
            }
            int state = getState();
            int actionMasked = sourceEvent.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.offsetX += this.lastX - this.startX;
                this.offsetY += this.lastY - this.startY;
                C43974h c43974h = C43974h.f97180a;
                this.lastX = c43974h.m96912b(sourceEvent, this.averageTouches);
                float fM96913c = c43974h.m96913c(sourceEvent, this.averageTouches);
                this.lastY = fM96913c;
                this.startX = this.lastX;
                this.startY = fM96913c;
            } else {
                C43974h c43974h2 = C43974h.f97180a;
                this.lastX = c43974h2.m96912b(sourceEvent, this.averageTouches);
                this.lastY = c43974h2.m96913c(sourceEvent, this.averageTouches);
            }
            if (state != 0 || sourceEvent.getPointerCount() < this.minPointers) {
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    INSTANCE.m71927a(velocityTracker, sourceEvent);
                    VelocityTracker velocityTracker2 = this.velocityTracker;
                    Intrinsics.checkNotNull(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.velocityTracker;
                    Intrinsics.checkNotNull(velocityTracker3);
                    this.velocityX = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.velocityTracker;
                    Intrinsics.checkNotNull(velocityTracker4);
                    this.velocityY = velocityTracker4.getYVelocity();
                }
            } else {
                mo71790p0();
                this.offsetX = 0.0f;
                this.offsetY = 0.0f;
                this.velocityX = 0.0f;
                this.velocityY = 0.0f;
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.velocityTracker = velocityTrackerObtain;
                INSTANCE.m71927a(velocityTrackerObtain, sourceEvent);
                m71786n();
                if (this.activateAfterLongPress > 0) {
                    if (this.handler == null) {
                        this.handler = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = this.handler;
                    Intrinsics.checkNotNull(handler);
                    handler.postDelayed(this.activateDelayed, this.activateAfterLongPress);
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (state == 4) {
                    m71808z();
                    return;
                } else {
                    m71730B();
                    return;
                }
            }
            if (actionMasked == 5 && sourceEvent.getPointerCount() > this.maxPointers) {
                if (state == 4) {
                    m71788o();
                    return;
                } else {
                    m71730B();
                    return;
                }
            }
            if (actionMasked == 6 && state == 4 && sourceEvent.getPointerCount() < this.minPointers) {
                m71730B();
                return;
            }
            if (state == 2) {
                if (m71926q1()) {
                    m71730B();
                } else if (m71925p1()) {
                    m71778i();
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h1 */
    public final PanGestureHandler m71917h1(float failOffsetYEnd) {
        this.failOffsetYEnd = failOffsetYEnd;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: i1 */
    public final PanGestureHandler m71918i1(float failOffsetYStart) {
        this.failOffsetYStart = failOffsetYStart;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: j1 */
    public final PanGestureHandler m71919j1(int maxPointers) {
        this.maxPointers = maxPointers;
        return this;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: k0 */
    public void mo71717k0() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        this.stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l1 */
    public final PanGestureHandler m71921l1(int minPointers) {
        this.minPointers = minPointers;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public final PanGestureHandler m71923n1(float minVelocityX) {
        this.minVelocityX = minVelocityX;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: o1 */
    public final PanGestureHandler m71924o1(float minVelocityY) {
        this.minVelocityY = minVelocityY;
        return this;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: p0 */
    public void mo71790p0() {
        this.startX = this.lastX;
        this.startY = this.lastY;
    }

    /* JADX INFO: renamed from: p1 */
    public final boolean m71925p1() {
        float f11 = (this.lastX - this.startX) + this.offsetX;
        float f12 = this.activeOffsetXStart;
        if (f12 != Float.MAX_VALUE && f11 < f12) {
            return true;
        }
        float f13 = this.activeOffsetXEnd;
        if (f13 != Float.MIN_VALUE && f11 > f13) {
            return true;
        }
        float f14 = (this.lastY - this.startY) + this.offsetY;
        float f15 = this.activeOffsetYStart;
        if (f15 != Float.MAX_VALUE && f14 < f15) {
            return true;
        }
        float f16 = this.activeOffsetYEnd;
        if (f16 != Float.MIN_VALUE && f14 > f16) {
            return true;
        }
        float f17 = (f11 * f11) + (f14 * f14);
        float f18 = this.minDistSq;
        if (f18 != Float.MAX_VALUE && f17 >= f18) {
            return true;
        }
        float f19 = this.velocityX;
        float f21 = this.minVelocityX;
        if (f21 != Float.MAX_VALUE && ((f21 < 0.0f && f19 <= f21) || (0.0f <= f21 && f21 <= f19))) {
            return true;
        }
        float f22 = this.velocityY;
        float f23 = this.minVelocityY;
        if (f23 != Float.MAX_VALUE && ((f23 < 0.0f && f19 <= f23) || (0.0f <= f23 && f23 <= f19))) {
            return true;
        }
        float f24 = (f19 * f19) + (f22 * f22);
        float f25 = this.minVelocitySq;
        return f25 != Float.MAX_VALUE && f24 >= f25;
    }

    /* JADX INFO: renamed from: q1 */
    public final boolean m71926q1() {
        float f11 = (this.lastX - this.startX) + this.offsetX;
        float f12 = (this.lastY - this.startY) + this.offsetY;
        if (this.activateAfterLongPress > 0 && (f11 * f11) + (f12 * f12) > this.defaultMinDistSq) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            return true;
        }
        float f13 = this.failOffsetXStart;
        if (f13 != Float.MIN_VALUE && f11 < f13) {
            return true;
        }
        float f14 = this.failOffsetXEnd;
        if (f14 != Float.MAX_VALUE && f11 > f14) {
            return true;
        }
        float f15 = this.failOffsetYStart;
        if (f15 != Float.MIN_VALUE && f12 < f15) {
            return true;
        }
        float f16 = this.failOffsetYEnd;
        return f16 != Float.MAX_VALUE && f12 > f16;
    }

    public PanGestureHandler(@Nullable Context context) {
        this.minDistSq = Float.MIN_VALUE;
        Intrinsics.checkNotNull(context);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        float f11 = scaledTouchSlop * scaledTouchSlop;
        this.defaultMinDistSq = f11;
        this.minDistSq = f11;
    }

    /* JADX INFO: renamed from: T0 */
    public static final void m71903T0(PanGestureHandler panGestureHandler) {
        panGestureHandler.m71778i();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: j */
    public void mo71716j(boolean force) {
        if (getState() != 4) {
            mo71790p0();
        }
        super.mo71716j(force);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: o0 */
    public void mo71718o0() {
        super.mo71718o0();
        this.activeOffsetXStart = Float.MAX_VALUE;
        this.activeOffsetXEnd = Float.MIN_VALUE;
        this.failOffsetXStart = Float.MIN_VALUE;
        this.failOffsetXEnd = Float.MAX_VALUE;
        this.activeOffsetYStart = Float.MAX_VALUE;
        this.activeOffsetYEnd = Float.MIN_VALUE;
        this.failOffsetYStart = Float.MIN_VALUE;
        this.failOffsetYEnd = Float.MAX_VALUE;
        this.minVelocityX = Float.MAX_VALUE;
        this.minVelocityY = Float.MAX_VALUE;
        this.minVelocitySq = Float.MAX_VALUE;
        this.minDistSq = this.defaultMinDistSq;
        this.minPointers = 1;
        this.maxPointers = 10;
        this.activateAfterLongPress = 0L;
        this.averageTouches = false;
    }
}
