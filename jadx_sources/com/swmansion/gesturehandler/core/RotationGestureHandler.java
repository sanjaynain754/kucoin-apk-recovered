package com.swmansion.gesturehandler.core;

import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RotationGestureHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R$\u0010#\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010&\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/RotationGestureHandler;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "h0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "", "force", "j", "(Z)V", "k0", "p0", "Lcom/swmansion/gesturehandler/core/a;", "N", "Lcom/swmansion/gesturehandler/core/a;", "rotationGestureDetector", "", "value", "O", "D", "W0", "()D", "rotation", "P", "X0", "velocity", "", "Q", "F", "U0", "()F", "anchorX", "R", "V0", "anchorY", "Lcom/swmansion/gesturehandler/core/a$a;", ExifInterface.LATITUDE_SOUTH, "Lcom/swmansion/gesturehandler/core/a$a;", "gestureListener", ExifInterface.GPS_DIRECTION_TRUE, "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RotationGestureHandler extends GestureHandler<RotationGestureHandler> {

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public C33427a rotationGestureDetector;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public double rotation;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public double velocity;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public float anchorX = Float.NaN;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public float anchorY = Float.NaN;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final C33427a.a gestureListener;

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.RotationGestureHandler$a */
    /* JADX INFO: compiled from: RotationGestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"com/swmansion/gesturehandler/core/RotationGestureHandler$a", "Lcom/swmansion/gesturehandler/core/a$a;", "Lcom/swmansion/gesturehandler/core/a;", "detector", "", "b", "(Lcom/swmansion/gesturehandler/core/a;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "c", "(Lcom/swmansion/gesturehandler/core/a;)V", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33426a implements C33427a.a {
        public C33426a() {
        }

        @Override // com.swmansion.gesturehandler.core.C33427a.a
        /* JADX INFO: renamed from: a */
        public boolean mo71935a(C33427a detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.C33427a.a
        /* JADX INFO: renamed from: b */
        public boolean mo71936b(C33427a detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            double rotation = RotationGestureHandler.this.getRotation();
            RotationGestureHandler rotationGestureHandler = RotationGestureHandler.this;
            rotationGestureHandler.rotation = rotationGestureHandler.getRotation() + detector.getRotation();
            long jM71969e = detector.m71969e();
            if (jM71969e > 0) {
                RotationGestureHandler rotationGestureHandler2 = RotationGestureHandler.this;
                rotationGestureHandler2.velocity = (rotationGestureHandler2.getRotation() - rotation) / jM71969e;
            }
            if (Math.abs(RotationGestureHandler.this.getRotation()) < 0.08726646259971647d || RotationGestureHandler.this.getState() != 2) {
                return true;
            }
            RotationGestureHandler.this.m71778i();
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.C33427a.a
        /* JADX INFO: renamed from: c */
        public void mo71937c(C33427a detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            RotationGestureHandler.this.m71808z();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: k0 */
    public void mo71717k0() {
        this.rotationGestureDetector = null;
        this.anchorX = Float.NaN;
        this.anchorY = Float.NaN;
        mo71790p0();
    }

    /* JADX INFO: renamed from: U0, reason: from getter */
    public final float getAnchorX() {
        return this.anchorX;
    }

    /* JADX INFO: renamed from: V0, reason: from getter */
    public final float getAnchorY() {
        return this.anchorY;
    }

    /* JADX INFO: renamed from: W0, reason: from getter */
    public final double getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final double getVelocity() {
        return this.velocity;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: h0 */
    public void mo71715h0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (getState() == 0) {
            mo71790p0();
            this.rotationGestureDetector = new C33427a(this.gestureListener);
            this.anchorX = event.getX();
            this.anchorY = event.getY();
            m71786n();
        }
        C33427a c33427a = this.rotationGestureDetector;
        if (c33427a != null) {
            c33427a.m71970f(sourceEvent);
        }
        C33427a c33427a2 = this.rotationGestureDetector;
        if (c33427a2 != null) {
            PointF pointFM71757O0 = m71757O0(new PointF(c33427a2.getAnchorX(), c33427a2.getAnchorY()));
            this.anchorX = pointFM71757O0.x;
            this.anchorY = pointFM71757O0.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            if (getState() == 4) {
                m71808z();
            } else {
                m71730B();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: p0 */
    public void mo71790p0() {
        this.velocity = 0.0d;
        this.rotation = 0.0d;
    }

    public RotationGestureHandler() {
        m71737E0(false);
        this.gestureListener = new C33426a();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: j */
    public void mo71716j(boolean force) {
        if (getState() != 4) {
            mo71790p0();
        }
        super.mo71716j(force);
    }
}
