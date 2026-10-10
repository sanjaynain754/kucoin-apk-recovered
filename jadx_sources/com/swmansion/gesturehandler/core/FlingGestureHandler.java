package com.swmansion.gesturehandler.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.exifinterface.media.ExifInterface;
import com.swmansion.gesturehandler.core.FlingGestureHandler;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rb0.C43974h;

/* JADX INFO: compiled from: FlingGestureHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J!\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u0014\u0010)\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010(R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001cR\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/FlingGestureHandler;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "", "o0", "", "force", "j", "(Z)V", "Landroid/view/MotionEvent;", "event", "sourceEvent", "h0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "g0", "k0", "Y0", "(Landroid/view/MotionEvent;)V", "Z0", "(Landroid/view/MotionEvent;)Z", "U0", "Landroid/view/VelocityTracker;", "tracker", "T0", "(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;)V", "", "N", "I", "getNumberOfPointersRequired", "()I", "X0", "(I)V", "numberOfPointersRequired", "O", "getDirection", "W0", "direction", "", "P", "J", "maxDurationMs", "Q", "minVelocity", "Landroid/os/Handler;", "R", "Landroid/os/Handler;", "handler", ExifInterface.LATITUDE_SOUTH, "maxNumberOfPointersSimultaneously", "Ljava/lang/Runnable;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Runnable;", "failDelayed", "U", "Landroid/view/VelocityTracker;", "velocityTracker", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlingGestureHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlingGestureHandler.kt\ncom/swmansion/gesturehandler/core/FlingGestureHandler\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n11165#2:143\n11500#2,3:144\n11165#2:147\n11500#2,3:148\n1755#3,3:151\n*S KotlinDebug\n*F\n+ 1 FlingGestureHandler.kt\ncom/swmansion/gesturehandler/core/FlingGestureHandler\n*L\n55#1:143\n55#1:144,3\n62#1:147\n62#1:148,3\n64#1:151,3\n*E\n"})
public final class FlingGestureHandler extends GestureHandler<FlingGestureHandler> {

    /* JADX INFO: renamed from: W */
    public static final double f68133W;

    /* JADX INFO: renamed from: X */
    public static final double f68134X;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public Handler handler;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public int maxNumberOfPointersSimultaneously;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    public VelocityTracker velocityTracker;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public int numberOfPointersRequired = 1;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public int direction = 1;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final long maxDurationMs = 800;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final long minVelocity = 2000;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final Runnable failDelayed = new Runnable() { // from class: rb0.a
        @Override // java.lang.Runnable
        public final void run() {
            FlingGestureHandler.m71706V0(this.f97177b);
        }
    };

    static {
        C43974h c43974h = C43974h.f97180a;
        f68133W = c43974h.m96911a(30.0d);
        f68134X = c43974h.m96911a(60.0d);
    }

    /* JADX INFO: renamed from: a1 */
    public static final boolean m71707a1(FlingGestureHandler flingGestureHandler, Vector vector, int i11, double d11) {
        return (flingGestureHandler.direction & i11) == i11 && vector.m71964l(Vector.INSTANCE.fromDirection(i11), d11);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m71710W0(int i11) {
        this.direction = i11;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m71711X0(int i11) {
        this.numberOfPointersRequired = i11;
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m71713Z0(MotionEvent event) {
        boolean z11;
        boolean z12;
        m71708T0(this.velocityTracker, event);
        Vector.Companion companion = Vector.INSTANCE;
        VelocityTracker velocityTracker = this.velocityTracker;
        Intrinsics.checkNotNull(velocityTracker);
        Vector vectorFromVelocity = companion.fromVelocity(velocityTracker);
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList.add(Boolean.valueOf(m71707a1(this, vectorFromVelocity, numArr[i11].intValue(), f68133W)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i12 = 0; i12 < 4; i12++) {
            arrayList2.add(Boolean.valueOf(m71707a1(this, vectorFromVelocity, numArr2[i12].intValue(), f68134X)));
        }
        if (arrayList.isEmpty()) {
            z11 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            if (((Boolean) it.next()).booleanValue()) {
                z11 = true;
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            z12 = false;
            break;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = false;
                break;
            }
            if (((Boolean) it2.next()).booleanValue()) {
                z12 = true;
                break;
            }
        }
        boolean z13 = z11 | z12;
        boolean z14 = vectorFromVelocity.getMagnitude() > ((double) this.minVelocity);
        if (this.maxNumberOfPointersSimultaneously != this.numberOfPointersRequired || !z13 || !z14) {
            return false;
        }
        Handler handler = this.handler;
        Intrinsics.checkNotNull(handler);
        handler.removeCallbacksAndMessages(null);
        m71778i();
        return true;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: g0 */
    public void mo71714g0() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: h0 */
    public void mo71715h0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (m71743H0(sourceEvent)) {
            int state = getState();
            if (state == 0) {
                m71712Y0(sourceEvent);
            }
            if (state == 2) {
                m71713Z0(sourceEvent);
                if (sourceEvent.getPointerCount() > this.maxNumberOfPointersSimultaneously) {
                    this.maxNumberOfPointersSimultaneously = sourceEvent.getPointerCount();
                }
                if (sourceEvent.getActionMasked() == 1) {
                    m71709U0(sourceEvent);
                }
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: k0 */
    public void mo71717k0() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.velocityTracker = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static final void m71706V0(FlingGestureHandler flingGestureHandler) {
        flingGestureHandler.m71730B();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m71708T0(VelocityTracker tracker, MotionEvent event) {
        float rawX = event.getRawX() - event.getX();
        float rawY = event.getRawY() - event.getY();
        event.offsetLocation(rawX, rawY);
        Intrinsics.checkNotNull(tracker);
        tracker.addMovement(event);
        event.offsetLocation(-rawX, -rawY);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m71709U0(MotionEvent event) {
        if (!m71713Z0(event)) {
            m71730B();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m71712Y0(MotionEvent event) {
        this.velocityTracker = VelocityTracker.obtain();
        m71786n();
        this.maxNumberOfPointersSimultaneously = 1;
        Handler handler = this.handler;
        if (handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.handler;
        Intrinsics.checkNotNull(handler2);
        handler2.postDelayed(this.failDelayed, this.maxDurationMs);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: j */
    public void mo71716j(boolean force) {
        super.mo71716j(force);
        m71808z();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: o0 */
    public void mo71718o0() {
        super.mo71718o0();
        this.numberOfPointersRequired = 1;
        this.direction = 1;
    }
}
