package com.swmansion.gesturehandler.core;

import android.view.VelocityTracker;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/Vector;", "", "", "x", "y", "<init>", "(DD)V", "vector", "threshold", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/swmansion/gesturehandler/core/Vector;D)Z", "j", "(Lcom/swmansion/gesturehandler/core/Vector;)D", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "D", "getX", "()D", "b", "getY", "c", "unitX", "d", "unitY", "e", "k", "magnitude", "f", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class Vector {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Vector f68298g = new Vector(-1.0d, 0.0d);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Vector f68299h = new Vector(1.0d, 0.0d);

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Vector f68300i = new Vector(0.0d, -1.0d);

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Vector f68301j = new Vector(0.0d, 1.0d);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Vector f68302k = new Vector(1.0d, -1.0d);

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Vector f68303l = new Vector(1.0d, 1.0d);

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Vector f68304m = new Vector(-1.0d, -1.0d);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Vector f68305n = new Vector(-1.0d, 1.0d);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Vector f68306o = new Vector(0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final double x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final double y;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final double unitX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final double unitY;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final double magnitude;

    /* JADX INFO: compiled from: Vector.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/Vector$Companion;", "", "<init>", "()V", "VECTOR_LEFT", "Lcom/swmansion/gesturehandler/core/Vector;", "VECTOR_RIGHT", "VECTOR_UP", "VECTOR_DOWN", "VECTOR_RIGHT_UP", "VECTOR_RIGHT_DOWN", "VECTOR_LEFT_UP", "VECTOR_LEFT_DOWN", "VECTOR_ZERO", "MINIMAL_RECOGNIZABLE_MAGNITUDE", "", "fromDirection", "direction", "", "fromVelocity", "tracker", "Landroid/view/VelocityTracker;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Vector fromDirection(int direction) {
            switch (direction) {
                case 1:
                    return Vector.f68299h;
                case 2:
                    return Vector.f68298g;
                case 3:
                case 7:
                default:
                    return Vector.f68306o;
                case 4:
                    return Vector.f68300i;
                case 5:
                    return Vector.f68302k;
                case 6:
                    return Vector.f68304m;
                case 8:
                    return Vector.f68301j;
                case 9:
                    return Vector.f68303l;
                case 10:
                    return Vector.f68305n;
            }
        }

        @NotNull
        public final Vector fromVelocity(@NotNull VelocityTracker tracker) {
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            tracker.computeCurrentVelocity(1000);
            return new Vector(tracker.getXVelocity(), tracker.getYVelocity());
        }
    }

    /* JADX INFO: renamed from: j */
    public final double m71962j(Vector vector) {
        return (this.unitX * vector.unitX) + (this.unitY * vector.unitY);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final double getMagnitude() {
        return this.magnitude;
    }

    public Vector(double d11, double d12) {
        boolean z11;
        double d13;
        this.x = d11;
        this.y = d12;
        double dHypot = Math.hypot(d11, d12);
        this.magnitude = dHypot;
        if (dHypot > 0.1d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            d13 = d11 / dHypot;
        } else {
            d13 = 0.0d;
        }
        this.unitX = d13;
        this.unitY = z11 ? d12 / dHypot : 0.0d;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m71964l(@NotNull Vector vector, double threshold) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        if (m71962j(vector) > threshold) {
            return true;
        }
        return false;
    }
}
