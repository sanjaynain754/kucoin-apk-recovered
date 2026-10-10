package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StylusData.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\"B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006#"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/StylusData;", "", "", "tiltX", "tiltY", "altitudeAngle", "azimuthAngle", "pressure", "<init>", "(DDDDD)V", "Lcom/facebook/react/bridge/ReadableMap;", "b", "()Lcom/facebook/react/bridge/ReadableMap;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "D", "getTiltX", "()D", "getTiltY", "c", "getAltitudeAngle", "d", "getAzimuthAngle", "e", "f", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class StylusData {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final double tiltX;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final double tiltY;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final double altitudeAngle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final double azimuthAngle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final double pressure;

    /* JADX INFO: compiled from: StylusData.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/StylusData$Companion;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "Lcom/swmansion/gesturehandler/core/StylusData;", "fromEvent", "(Landroid/view/MotionEvent;)Lcom/swmansion/gesturehandler/core/StylusData;", "", "altitudeAngle", "azimuthAngle", "Lkotlin/Pair;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(DD)Lkotlin/Pair;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final StylusData fromEvent(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            double axisValue = 1.5707963267948966d - ((double) event.getAxisValue(25));
            double pressure = event.getPressure(0);
            double orientation = (((double) event.getOrientation(0)) + 1.5707963267948966d) % 6.283185307179586d;
            if (orientation != 0.0d && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
                orientation += 6.283185307179586d;
            }
            double d11 = orientation;
            Pair<Double, Double> pairM71940a = m71940a(axisValue, d11);
            return new StylusData(pairM71940a.getFirst().doubleValue(), pairM71940a.getSecond().doubleValue(), axisValue, d11, pressure);
        }

        /* JADX INFO: renamed from: a */
        public final Pair<Double, Double> m71940a(double altitudeAngle, double azimuthAngle) {
            double dAtan;
            double dAtan2;
            double d11;
            if (altitudeAngle < 1.0E-9d) {
                dAtan = 1.5707963267948966d;
                double d12 = 0.0d;
                if (azimuthAngle >= 1.0E-9d && Math.abs(azimuthAngle - 6.283185307179586d) >= 1.0E-9d) {
                    d11 = 0.0d;
                } else {
                    d11 = 1.5707963267948966d;
                }
                double d13 = azimuthAngle - 1.5707963267948966d;
                if (Math.abs(d13) < 1.0E-9d) {
                    d12 = 1.5707963267948966d;
                }
                double d14 = azimuthAngle - 3.141592653589793d;
                dAtan2 = -1.5707963267948966d;
                if (Math.abs(d14) < 1.0E-9d) {
                    d11 = -1.5707963267948966d;
                }
                double d15 = azimuthAngle - 4.71238898038469d;
                if (Math.abs(d15) < 1.0E-9d) {
                    d12 = -1.5707963267948966d;
                }
                if (azimuthAngle > 1.0E-9d && Math.abs(d13) < 1.0E-9d) {
                    d12 = 1.5707963267948966d;
                    d11 = 1.5707963267948966d;
                }
                if (Math.abs(d13) > 1.0E-9d && Math.abs(d14) < 1.0E-9d) {
                    d12 = 1.5707963267948966d;
                    d11 = -1.5707963267948966d;
                }
                if (Math.abs(d14) > 1.0E-9d && Math.abs(d15) < 1.0E-9d) {
                    d12 = -1.5707963267948966d;
                    d11 = -1.5707963267948966d;
                }
                if (Math.abs(d15) <= 1.0E-9d || Math.abs(azimuthAngle - 6.283185307179586d) >= 1.0E-9d) {
                    dAtan2 = d12;
                    dAtan = d11;
                }
            } else {
                double dTan = Math.tan(altitudeAngle);
                dAtan = Math.atan(Math.cos(azimuthAngle) / dTan);
                dAtan2 = Math.atan(Math.sin(azimuthAngle) / dTan);
            }
            return new Pair<>(Double.valueOf(Math.rint(dAtan * 57.29577951308232d)), Double.valueOf(Math.rint(dAtan2 * 57.29577951308232d)));
        }
    }

    public StylusData() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StylusData)) {
            return false;
        }
        StylusData stylusData = (StylusData) other;
        return Double.compare(this.tiltX, stylusData.tiltX) == 0 && Double.compare(this.tiltY, stylusData.tiltY) == 0 && Double.compare(this.altitudeAngle, stylusData.altitudeAngle) == 0 && Double.compare(this.azimuthAngle, stylusData.azimuthAngle) == 0 && Double.compare(this.pressure, stylusData.pressure) == 0;
    }

    public StylusData(double d11, double d12, double d13, double d14, double d15) {
        this.tiltX = d11;
        this.tiltY = d12;
        this.altitudeAngle = d13;
        this.azimuthAngle = d14;
        this.pressure = d15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getPressure() {
        return this.pressure;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.tiltX) * 31) + Double.hashCode(this.tiltY)) * 31) + Double.hashCode(this.altitudeAngle)) * 31) + Double.hashCode(this.azimuthAngle)) * 31) + Double.hashCode(this.pressure);
    }

    @NotNull
    public String toString() {
        return "StylusData(tiltX=" + this.tiltX + ", tiltY=" + this.tiltY + ", altitudeAngle=" + this.altitudeAngle + ", azimuthAngle=" + this.azimuthAngle + ", pressure=" + this.pressure + ")";
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ReadableMap m71939b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("tiltX", this.tiltX);
        writableMapCreateMap.putDouble("tiltY", this.tiltY);
        writableMapCreateMap.putDouble("altitudeAngle", this.altitudeAngle);
        writableMapCreateMap.putDouble("azimuthAngle", this.azimuthAngle);
        writableMapCreateMap.putDouble("pressure", this.pressure);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ StylusData(double d11, double d12, double d13, double d14, double d15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? 0.0d : d12, (i11 & 4) != 0 ? 0.0d : d13, (i11 & 8) != 0 ? 0.0d : d14, (i11 & 16) != 0 ? -1.0d : d15);
    }
}
