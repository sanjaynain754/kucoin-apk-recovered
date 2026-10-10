package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.swmansion.gesturehandler.core.LongPressGestureHandler;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LongPressGestureHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001GB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\bJ-\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\"2\u0006\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00104\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010.R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010.R\u0016\u0010:\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010'R\u0016\u0010<\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010'R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00103R\u0011\u0010E\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "o0", "()V", "", "maxDist", "X0", "(F)Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;", "", "numberOfPointers", "Z0", "(I)Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;", "Landroid/view/MotionEvent;", "event", "sourceEvent", "h0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "newState", "previousState", "l0", "(II)V", "prevState", "u", "t", "(Landroid/view/MotionEvent;)V", "k0", "ev", "", "excludePointer", "Lkotlin/Pair;", "T0", "(Landroid/view/MotionEvent;Z)Lkotlin/Pair;", "", "N", "J", "getMinDurationMs", "()J", "Y0", "(J)V", "minDurationMs", "O", "F", "defaultMaxDistSq", "P", "maxDistSq", "Q", "I", "numberOfPointersRequired", "R", "startX", ExifInterface.LATITUDE_SOUTH, "startY", ExifInterface.GPS_DIRECTION_TRUE, "startTime", "U", "previousTime", "Landroid/os/Handler;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/os/Handler;", "handler", ExifInterface.LONGITUDE_WEST, "currentPointers", "V0", "()I", TypedValues.TransitionType.S_DURATION, "X", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLongPressGestureHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPressGestureHandler.kt\ncom/swmansion/gesturehandler/core/LongPressGestureHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1557#2:182\n1628#2,3:183\n1557#2:186\n1628#2,3:187\n*S KotlinDebug\n*F\n+ 1 LongPressGestureHandler.kt\ncom/swmansion/gesturehandler/core/LongPressGestureHandler\n*L\n50#1:182\n50#1:183,3\n51#1:186\n51#1:187,3\n*E\n"})
public final class LongPressGestureHandler extends GestureHandler<LongPressGestureHandler> {

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public long minDurationMs;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final float defaultMaxDistSq;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public float maxDistSq;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public int numberOfPointersRequired;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public float startX;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public float startY;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public long startTime;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public long previousTime;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @Nullable
    public Handler handler;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public int currentPointers;

    /* JADX INFO: renamed from: T0 */
    public final Pair<Float, Float> m71877T0(MotionEvent ev2, boolean excludePointer) {
        if (excludePointer) {
            int pointerCount = ev2.getPointerCount();
            float x11 = 0.0f;
            float y11 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (i11 != ev2.getActionIndex()) {
                    x11 += ev2.getX(i11);
                    y11 += ev2.getY(i11);
                }
            }
            return new Pair<>(Float.valueOf(x11 / (ev2.getPointerCount() - 1)), Float.valueOf(y11 / (ev2.getPointerCount() - 1)));
        }
        IntRange intRangeUntil = RangesKt.until(0, ev2.getPointerCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(ev2.getX(((IntIterator) it).nextInt())));
        }
        float fAverageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList);
        IntRange intRangeUntil2 = RangesKt.until(0, ev2.getPointerCount());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil2, 10));
        Iterator<Integer> it2 = intRangeUntil2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(ev2.getY(((IntIterator) it2).nextInt())));
        }
        return new Pair<>(Float.valueOf(fAverageOfFloat), Float.valueOf((float) CollectionsKt.averageOfFloat(arrayList2)));
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final LongPressGestureHandler m71879X0(float maxDist) {
        this.maxDistSq = maxDist * maxDist;
        return this;
    }

    public LongPressGestureHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.minDurationMs = 500L;
        m71737E0(true);
        float f11 = context.getResources().getDisplayMetrics().density * 10.0f;
        float f12 = f11 * f11;
        this.defaultMaxDistSq = f12;
        this.maxDistSq = f12;
        this.numberOfPointersRequired = 1;
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ Pair m71875U0(LongPressGestureHandler longPressGestureHandler, MotionEvent motionEvent, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return longPressGestureHandler.m71877T0(motionEvent, z11);
    }

    /* JADX INFO: renamed from: V0 */
    public final int m71878V0() {
        return (int) (this.previousTime - this.startTime);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m71880Y0(long j11) {
        this.minDurationMs = j11;
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final LongPressGestureHandler m71881Z0(int numberOfPointers) {
        this.numberOfPointersRequired = numberOfPointers;
        return this;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: h0 */
    public void mo71715h0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (m71743H0(sourceEvent)) {
            if (getState() == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.previousTime = jUptimeMillis;
                this.startTime = jUptimeMillis;
                m71786n();
                Pair pairM71875U0 = m71875U0(this, sourceEvent, false, 2, null);
                float fFloatValue = ((Number) pairM71875U0.component1()).floatValue();
                float fFloatValue2 = ((Number) pairM71875U0.component2()).floatValue();
                this.startX = fFloatValue;
                this.startY = fFloatValue2;
                this.currentPointers++;
            }
            if (sourceEvent.getActionMasked() == 5) {
                this.currentPointers++;
                Pair pairM71875U1 = m71875U0(this, sourceEvent, false, 2, null);
                float fFloatValue3 = ((Number) pairM71875U1.component1()).floatValue();
                float fFloatValue4 = ((Number) pairM71875U1.component2()).floatValue();
                this.startX = fFloatValue3;
                this.startY = fFloatValue4;
                if (this.currentPointers > this.numberOfPointersRequired) {
                    m71730B();
                    this.currentPointers = 0;
                }
            }
            if (getState() == 2 && this.currentPointers == this.numberOfPointersRequired && (sourceEvent.getActionMasked() == 0 || sourceEvent.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.handler = handler;
                long j11 = this.minDurationMs;
                if (j11 > 0) {
                    Intrinsics.checkNotNull(handler);
                    handler.postDelayed(new Runnable() { // from class: rb0.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            LongPressGestureHandler.m71876W0(this.f97182b);
                        }
                    }, this.minDurationMs);
                } else if (j11 == 0) {
                    m71778i();
                }
            }
            if (sourceEvent.getActionMasked() == 1 || sourceEvent.getActionMasked() == 12) {
                this.currentPointers--;
                Handler handler2 = this.handler;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.handler = null;
                }
                if (getState() == 4) {
                    m71808z();
                    return;
                } else {
                    m71730B();
                    return;
                }
            }
            if (sourceEvent.getActionMasked() != 6) {
                Pair pairM71875U2 = m71875U0(this, sourceEvent, false, 2, null);
                float fFloatValue5 = ((Number) pairM71875U2.component1()).floatValue();
                float fFloatValue6 = ((Number) pairM71875U2.component2()).floatValue();
                float f11 = fFloatValue5 - this.startX;
                float f12 = fFloatValue6 - this.startY;
                if ((f11 * f11) + (f12 * f12) > this.maxDistSq) {
                    if (getState() == 4) {
                        m71788o();
                        return;
                    } else {
                        m71730B();
                        return;
                    }
                }
                return;
            }
            int i11 = this.currentPointers - 1;
            this.currentPointers = i11;
            if (i11 < this.numberOfPointersRequired && getState() != 4) {
                m71730B();
                this.currentPointers = 0;
                return;
            }
            Pair<Float, Float> pairM71877T0 = m71877T0(sourceEvent, true);
            float fFloatValue7 = pairM71877T0.component1().floatValue();
            float fFloatValue8 = pairM71877T0.component2().floatValue();
            this.startX = fFloatValue7;
            this.startY = fFloatValue8;
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: l0 */
    public void mo71783l0(int newState, int previousState) {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: t */
    public void mo71797t(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.previousTime = SystemClock.uptimeMillis();
        super.mo71797t(event);
    }

    /* JADX INFO: renamed from: W0 */
    public static final void m71876W0(LongPressGestureHandler longPressGestureHandler) {
        longPressGestureHandler.m71778i();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: k0 */
    public void mo71717k0() {
        super.mo71717k0();
        this.currentPointers = 0;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: o0 */
    public void mo71718o0() {
        super.mo71718o0();
        this.minDurationMs = 500L;
        this.maxDistSq = this.defaultMaxDistSq;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: u */
    public void mo71799u(int newState, int prevState) {
        this.previousTime = SystemClock.uptimeMillis();
        super.mo71799u(newState, prevState);
    }
}
