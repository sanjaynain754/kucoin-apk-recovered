package com.swmansion.gesturehandler.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import androidx.exifinterface.media.ExifInterface;
import com.swmansion.gesturehandler.core.TapGestureHandler;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import rb0.C43974h;

/* JADX INFO: compiled from: TapGestureHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001OB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0007H\u0014¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010\u0003R\u0016\u0010+\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00109\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010*R\u0016\u0010;\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010*R\u0016\u0010=\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010*R\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010*R\u0016\u0010A\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010*R\u0016\u0010C\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010*R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00104R\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006P"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/TapGestureHandler;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "", "c1", "()Z", "", "o0", "", "numberOfTaps", "b1", "(I)Lcom/swmansion/gesturehandler/core/TapGestureHandler;", "", "maxDelayMs", "V0", "(J)Lcom/swmansion/gesturehandler/core/TapGestureHandler;", "maxDurationMs", "X0", "", "deltaX", "Y0", "(F)Lcom/swmansion/gesturehandler/core/TapGestureHandler;", "deltaY", "Z0", "maxDist", "W0", "minNumberOfPointers", ICustomDataEditor.STRING_ARRAY_PARAM_1, "Landroid/view/MotionEvent;", "event", "sourceEvent", "h0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "force", "j", "(Z)V", "g0", "k0", "d1", "T0", "N", "F", "maxDeltaX", "O", "maxDeltaY", "P", "maxDistSq", "Q", "J", "R", ExifInterface.LATITUDE_SOUTH, "I", ExifInterface.GPS_DIRECTION_TRUE, "U", "currentMaxNumberOfPointers", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "startX", ExifInterface.LONGITUDE_WEST, "startY", "X", "offsetX", "Y", "offsetY", "Z", "lastX", "a0", "lastY", "Landroid/os/Handler;", "b0", "Landroid/os/Handler;", "handler", "c0", "tapsSoFar", "Ljava/lang/Runnable;", "d0", "Ljava/lang/Runnable;", "failDelayed", "e0", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class TapGestureHandler extends GestureHandler<TapGestureHandler> {

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public float startX;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public float startY;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public float offsetX;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public float offsetY;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public float lastX;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public float lastY;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    @Nullable
    public Handler handler;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public int tapsSoFar;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public float maxDeltaX = Float.MIN_VALUE;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public float maxDeltaY = Float.MIN_VALUE;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public float maxDistSq = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public long maxDurationMs = 500;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public long maxDelayMs = 200;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public int numberOfTaps = 1;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public int minNumberOfPointers = 1;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public int currentMaxNumberOfPointers = 1;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    @NotNull
    public final Runnable failDelayed = new Runnable() { // from class: rb0.p
        @Override // java.lang.Runnable
        public final void run() {
            TapGestureHandler.m71942U0(this.f97218b);
        }
    };

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public final TapGestureHandler m71946W0(float maxDist) {
        this.maxDistSq = maxDist * maxDist;
        return this;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: k0 */
    public void mo71717k0() {
        this.tapsSoFar = 0;
        this.currentMaxNumberOfPointers = 0;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: c1 */
    private final boolean m71943c1() {
        float f11 = (this.lastX - this.startX) + this.offsetX;
        if (this.maxDeltaX != Float.MIN_VALUE && Math.abs(f11) > this.maxDeltaX) {
            return true;
        }
        float f12 = (this.lastY - this.startY) + this.offsetY;
        if (this.maxDeltaY != Float.MIN_VALUE && Math.abs(f12) > this.maxDeltaY) {
            return true;
        }
        float f13 = (f12 * f12) + (f11 * f11);
        float f14 = this.maxDistSq;
        return f14 != Float.MIN_VALUE && f13 > f14;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m71944T0() {
        Handler handler = this.handler;
        if (handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i11 = this.tapsSoFar + 1;
        this.tapsSoFar = i11;
        if (i11 == this.numberOfTaps && this.currentMaxNumberOfPointers >= this.minNumberOfPointers) {
            m71778i();
            return;
        }
        Handler handler2 = this.handler;
        Intrinsics.checkNotNull(handler2);
        handler2.postDelayed(this.failDelayed, this.maxDelayMs);
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public final TapGestureHandler m71945V0(long maxDelayMs) {
        this.maxDelayMs = maxDelayMs;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final TapGestureHandler m71947X0(long maxDurationMs) {
        this.maxDurationMs = maxDurationMs;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: Y0 */
    public final TapGestureHandler m71948Y0(float deltaX) {
        this.maxDeltaX = deltaX;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final TapGestureHandler m71949Z0(float deltaY) {
        this.maxDeltaY = deltaY;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: a1 */
    public final TapGestureHandler m71950a1(int minNumberOfPointers) {
        this.minNumberOfPointers = minNumberOfPointers;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public final TapGestureHandler m71951b1(int numberOfTaps) {
        this.numberOfTaps = numberOfTaps;
        return this;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m71952d1() {
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
            int actionMasked = sourceEvent.getActionMasked();
            if (state == 0) {
                this.offsetX = 0.0f;
                this.offsetY = 0.0f;
                C43974h c43974h = C43974h.f97180a;
                this.startX = c43974h.m96912b(sourceEvent, true);
                this.startY = c43974h.m96913c(sourceEvent, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.offsetX += this.lastX - this.startX;
                this.offsetY += this.lastY - this.startY;
                C43974h c43974h2 = C43974h.f97180a;
                this.lastX = c43974h2.m96912b(sourceEvent, true);
                float fM96913c = c43974h2.m96913c(sourceEvent, true);
                this.lastY = fM96913c;
                this.startX = this.lastX;
                this.startY = fM96913c;
            } else {
                C43974h c43974h3 = C43974h.f97180a;
                this.lastX = c43974h3.m96912b(sourceEvent, true);
                this.lastY = c43974h3.m96913c(sourceEvent, true);
            }
            if (this.currentMaxNumberOfPointers < sourceEvent.getPointerCount()) {
                this.currentMaxNumberOfPointers = sourceEvent.getPointerCount();
            }
            if (m71943c1()) {
                m71730B();
                return;
            }
            if (state == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    m71786n();
                }
                m71952d1();
                return;
            }
            if (state == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    m71944T0();
                    return;
                }
                m71952d1();
            }
        }
    }

    public TapGestureHandler() {
        m71737E0(true);
    }

    /* JADX INFO: renamed from: U0 */
    public static final void m71942U0(TapGestureHandler tapGestureHandler) {
        tapGestureHandler.m71730B();
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
        this.maxDeltaX = Float.MIN_VALUE;
        this.maxDeltaY = Float.MIN_VALUE;
        this.maxDistSq = Float.MIN_VALUE;
        this.maxDurationMs = 500L;
        this.maxDelayMs = 200L;
        this.numberOfTaps = 1;
        this.minNumberOfPointers = 1;
    }
}
