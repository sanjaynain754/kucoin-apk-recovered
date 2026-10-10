package ze0;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ze0.m, reason: from toString */
/* JADX INFO: compiled from: CapacityCalculator.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lze0/m;", "", "Lze0/j;", "planeCapacity", "Lze0/p;", "planeStride", "<init>", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "b", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPlaneCapacity-v5S6rBc", "getPlaneStride-BElzS_M", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class Plane1Capacities {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int planeCapacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int planeStride;

    public /* synthetic */ Plane1Capacities(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Plane1Capacities)) {
            return false;
        }
        Plane1Capacities plane1Capacities = (Plane1Capacities) other;
        return C46779j.m103091d(this.planeCapacity, plane1Capacities.planeCapacity) && C46785p.m103111b(this.planeStride, plane1Capacities.planeStride);
    }

    public Plane1Capacities(int i11, int i12) {
        this.planeCapacity = i11;
        this.planeStride = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPlaneCapacity() {
        return this.planeCapacity;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPlaneStride() {
        return this.planeStride;
    }

    public int hashCode() {
        return (C46779j.m103092e(this.planeCapacity) * 31) + C46785p.m103112c(this.planeStride);
    }

    @NotNull
    public String toString() {
        return "Plane1Capacities(planeCapacity=" + ((Object) C46779j.m103093f(this.planeCapacity)) + ", planeStride=" + ((Object) C46785p.m103114e(this.planeStride)) + ')';
    }
}
