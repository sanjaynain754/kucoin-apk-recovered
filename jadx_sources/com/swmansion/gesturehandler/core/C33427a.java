package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.swmansion.gesturehandler.core.a */
/* JADX INFO: compiled from: RotationGestureDetector.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010!R$\u0010&\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b\u0017\u0010%R$\u0010'\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b\u001a\u0010%R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010(R\u0011\u00100\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b \u0010/¨\u00061"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/a;", "", "Lcom/swmansion/gesturehandler/core/a$a;", "gestureListener", "<init>", "(Lcom/swmansion/gesturehandler/core/a$a;)V", "Landroid/view/MotionEvent;", "event", "", "f", "(Landroid/view/MotionEvent;)Z", "", "i", "(Landroid/view/MotionEvent;)V", "g", "()V", "", "eventAngle", CmcdData.Factory.STREAMING_FORMAT_HLS, "(D)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/swmansion/gesturehandler/core/a$a;", "", "b", "J", "currentTime", "c", "previousTime", "d", "D", "previousAngle", "value", "e", "()D", "rotation", "", "F", "()F", "anchorX", "anchorY", "Z", "isInProgress", "", "[I", "pointerIds", "j", "isPaused", "()J", "timeDelta", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C33427a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final a gestureListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long currentTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long previousTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public double previousAngle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public double rotation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float anchorX;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float anchorY;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isInProgress;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final int[] pointerIds = new int[2];

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isPaused;

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.a$a */
    /* JADX INFO: compiled from: RotationGestureDetector.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/a$a;", "", "Lcom/swmansion/gesturehandler/core/a;", "detector", "", "b", "(Lcom/swmansion/gesturehandler/core/a;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "c", "(Lcom/swmansion/gesturehandler/core/a;)V", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo71935a(@NotNull C33427a detector);

        /* JADX INFO: renamed from: b */
        boolean mo71936b(@NotNull C33427a detector);

        /* JADX INFO: renamed from: c */
        void mo71937c(@NotNull C33427a detector);
    }

    /* JADX INFO: renamed from: a */
    public final void m71965a() {
        if (this.isInProgress) {
            this.isPaused = false;
            this.isInProgress = false;
            a aVar = this.gestureListener;
            if (aVar != null) {
                aVar.mo71937c(this);
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getAnchorX() {
        return this.anchorX;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getAnchorY() {
        return this.anchorY;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: e */
    public final long m71969e() {
        return this.currentTime - this.previousTime;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m71970f(@NotNull MotionEvent event) {
        a aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.isInProgress = false;
            this.pointerIds[0] = event.getPointerId(event.getActionIndex());
            this.pointerIds[1] = -1;
        } else if (actionMasked == 1) {
            m71965a();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.isInProgress || this.isPaused) {
                    this.pointerIds[1] = event.getPointerId(event.getActionIndex());
                    m71973i(event);
                }
                if (!this.isInProgress) {
                    this.isInProgress = true;
                    this.previousTime = event.getEventTime();
                    this.previousAngle = Double.NaN;
                    a aVar2 = this.gestureListener;
                    if (aVar2 != null) {
                        aVar2.mo71935a(this);
                    }
                }
            } else if (actionMasked == 6 && this.isInProgress) {
                int pointerId = event.getPointerId(event.getActionIndex());
                int[] iArr = this.pointerIds;
                if (pointerId == iArr[0]) {
                    iArr[0] = iArr[1];
                    iArr[1] = -1;
                    m71971g();
                } else if (pointerId == iArr[1]) {
                    iArr[1] = -1;
                    m71971g();
                }
            }
        } else if (this.isInProgress) {
            m71973i(event);
            if (!this.isPaused && (aVar = this.gestureListener) != null) {
                aVar.mo71936b(this);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m71971g() {
        if (this.isPaused) {
            return;
        }
        this.isPaused = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m71972h(double eventAngle) {
        if (this.isPaused) {
            this.previousAngle = eventAngle;
            this.isPaused = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m71973i(MotionEvent event) {
        this.previousTime = this.currentTime;
        this.currentTime = event.getEventTime();
        int iFindPointerIndex = event.findPointerIndex(this.pointerIds[0]);
        int iFindPointerIndex2 = event.findPointerIndex(this.pointerIds[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x11 = event.getX(iFindPointerIndex);
        float y11 = event.getY(iFindPointerIndex);
        float x12 = event.getX(iFindPointerIndex2);
        float y12 = event.getY(iFindPointerIndex2);
        this.anchorX = (x11 + x12) * 0.5f;
        this.anchorY = (y11 + y12) * 0.5f;
        double d11 = -Math.atan2(y12 - y11, x12 - x11);
        m71972h(d11);
        double d12 = Double.isNaN(this.previousAngle) ? 0.0d : this.previousAngle - d11;
        this.rotation = d12;
        this.previousAngle = d11;
        if (d12 > 3.141592653589793d) {
            this.rotation = d12 - 3.141592653589793d;
        } else if (d12 < -3.141592653589793d) {
            this.rotation = d12 + 3.141592653589793d;
        }
        double d13 = this.rotation;
        if (d13 > 1.5707963267948966d) {
            this.rotation = d13 - 3.141592653589793d;
        } else if (d13 < -1.5707963267948966d) {
            this.rotation = d13 + 3.141592653589793d;
        }
    }

    public C33427a(@Nullable a aVar) {
        this.gestureListener = aVar;
    }
}
