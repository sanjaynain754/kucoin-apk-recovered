package com.kubi.spot.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrailingStopPercentEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/spot/entity/TrailingStopPercentEntity;", "", "min", "", "max", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getMin", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMax", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/kubi/spot/entity/TrailingStopPercentEntity;", "equals", "", "other", "hashCode", "", "toString", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TrailingStopPercentEntity {

    @Nullable
    private final Double max;

    @Nullable
    private final Double min;

    /* JADX WARN: Multi-variable type inference failed */
    public TrailingStopPercentEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailingStopPercentEntity)) {
            return false;
        }
        TrailingStopPercentEntity trailingStopPercentEntity = (TrailingStopPercentEntity) other;
        return Intrinsics.areEqual((Object) this.min, (Object) trailingStopPercentEntity.min) && Intrinsics.areEqual((Object) this.max, (Object) trailingStopPercentEntity.max);
    }

    public TrailingStopPercentEntity(@Nullable Double d11, @Nullable Double d12) {
        this.min = d11;
        this.max = d12;
    }

    public static /* synthetic */ TrailingStopPercentEntity copy$default(TrailingStopPercentEntity trailingStopPercentEntity, Double d11, Double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = trailingStopPercentEntity.min;
        }
        if ((i11 & 2) != 0) {
            d12 = trailingStopPercentEntity.max;
        }
        return trailingStopPercentEntity.copy(d11, d12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getMin() {
        return this.min;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getMax() {
        return this.max;
    }

    @NotNull
    public final TrailingStopPercentEntity copy(@Nullable Double min, @Nullable Double max) {
        return new TrailingStopPercentEntity(min, max);
    }

    @Nullable
    public final Double getMax() {
        return this.max;
    }

    @Nullable
    public final Double getMin() {
        return this.min;
    }

    public int hashCode() {
        Double d11 = this.min;
        int iHashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.max;
        return iHashCode + (d12 != null ? d12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrailingStopPercentEntity(min=" + this.min + ", max=" + this.max + ')';
    }

    public /* synthetic */ TrailingStopPercentEntity(Double d11, Double d12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : d12);
    }
}
