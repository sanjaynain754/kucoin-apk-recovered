package ze0;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ze0.n, reason: from toString */
/* JADX INFO: compiled from: CapacityCalculator.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m90084d2 = {"Lze0/n;", "", "Lze0/j;", "plane1Capacity", "plane2Capacity", "Lze0/p;", "plane1Stride", "plane2Stride", "<init>", "(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "b", "c", "d", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPlane1Capacity-v5S6rBc", "getPlane2Capacity-v5S6rBc", "getPlane1Stride-BElzS_M", "getPlane2Stride-BElzS_M", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class Plane2Capacities {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int plane1Capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int plane2Capacity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final int plane1Stride;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int plane2Stride;

    public /* synthetic */ Plane2Capacities(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, i14);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Plane2Capacities)) {
            return false;
        }
        Plane2Capacities plane2Capacities = (Plane2Capacities) other;
        return C46779j.m103091d(this.plane1Capacity, plane2Capacities.plane1Capacity) && C46779j.m103091d(this.plane2Capacity, plane2Capacities.plane2Capacity) && C46785p.m103111b(this.plane1Stride, plane2Capacities.plane1Stride) && C46785p.m103111b(this.plane2Stride, plane2Capacities.plane2Stride);
    }

    public Plane2Capacities(int i11, int i12, int i13, int i14) {
        this.plane1Capacity = i11;
        this.plane2Capacity = i12;
        this.plane1Stride = i13;
        this.plane2Stride = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPlane1Capacity() {
        return this.plane1Capacity;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPlane2Capacity() {
        return this.plane2Capacity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPlane1Stride() {
        return this.plane1Stride;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPlane2Stride() {
        return this.plane2Stride;
    }

    public int hashCode() {
        return (((((C46779j.m103092e(this.plane1Capacity) * 31) + C46779j.m103092e(this.plane2Capacity)) * 31) + C46785p.m103112c(this.plane1Stride)) * 31) + C46785p.m103112c(this.plane2Stride);
    }

    @NotNull
    public String toString() {
        return "Plane2Capacities(plane1Capacity=" + ((Object) C46779j.m103093f(this.plane1Capacity)) + ", plane2Capacity=" + ((Object) C46779j.m103093f(this.plane2Capacity)) + ", plane1Stride=" + ((Object) C46785p.m103114e(this.plane1Stride)) + ", plane2Stride=" + ((Object) C46785p.m103114e(this.plane2Stride)) + ')';
    }
}
