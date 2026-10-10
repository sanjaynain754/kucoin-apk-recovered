package com.jumio.core.sensors;

import com.jumio.core.models.TimeModel;
import java.util.Arrays;
import jumio.core.AbstractC40525E3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/jumio/core/sensors/SensorConfig;", "", "timeModel", "Lcom/jumio/core/models/TimeModel;", "captureDelay", "", "defaultValue", "", "<init>", "(Lcom/jumio/core/models/TimeModel;I[F)V", "getTimeModel", "()Lcom/jumio/core/models/TimeModel;", "getCaptureDelay", "()I", "getDefaultValue", "()[F", "equals", "", "other", "hashCode", "component1", "component2", "component3", "copy", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SensorConfig {

    /* JADX INFO: renamed from: a */
    public final TimeModel f14569a;

    /* JADX INFO: renamed from: b */
    public final int f14570b;

    /* JADX INFO: renamed from: c */
    public final float[] f14571c;

    public SensorConfig(@NotNull TimeModel timeModel, int i11, @NotNull float[] defaultValue) {
        Intrinsics.checkNotNullParameter(timeModel, "timeModel");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.f14569a = timeModel;
        this.f14570b = i11;
        this.f14571c = defaultValue;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SensorConfig.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.jumio.core.sensors.SensorConfig");
        SensorConfig sensorConfig = (SensorConfig) other;
        return this.f14570b == sensorConfig.f14570b && Intrinsics.areEqual(this.f14569a, sensorConfig.f14569a) && Arrays.equals(this.f14571c, sensorConfig.f14571c);
    }

    public static /* synthetic */ SensorConfig copy$default(SensorConfig sensorConfig, TimeModel timeModel, int i11, float[] fArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            timeModel = sensorConfig.f14569a;
        }
        if ((i12 & 2) != 0) {
            i11 = sensorConfig.f14570b;
        }
        if ((i12 & 4) != 0) {
            fArr = sensorConfig.f14571c;
        }
        return sensorConfig.copy(timeModel, i11, fArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TimeModel getF14569a() {
        return this.f14569a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getF14570b() {
        return this.f14570b;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float[] getF14571c() {
        return this.f14571c;
    }

    @NotNull
    public final SensorConfig copy(@NotNull TimeModel timeModel, int captureDelay, @NotNull float[] defaultValue) {
        Intrinsics.checkNotNullParameter(timeModel, "timeModel");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return new SensorConfig(timeModel, captureDelay, defaultValue);
    }

    public final int getCaptureDelay() {
        return this.f14570b;
    }

    @NotNull
    public final float[] getDefaultValue() {
        return this.f14571c;
    }

    @NotNull
    public final TimeModel getTimeModel() {
        return this.f14569a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f14571c) + ((this.f14569a.hashCode() + (this.f14570b * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SensorConfig(timeModel=" + this.f14569a + ", captureDelay=" + this.f14570b + ", defaultValue=" + Arrays.toString(this.f14571c) + ')';
    }

    public /* synthetic */ SensorConfig(TimeModel timeModel, int i11, float[] fArr, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeModel, (i12 & 2) != 0 ? 3 : i11, (i12 & 4) != 0 ? AbstractC40525E3.f89956a : fArr);
    }
}
