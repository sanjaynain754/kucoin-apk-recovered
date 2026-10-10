package jumio.core;

import com.jumio.commons.camera.Frame;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.s1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40724s1 {

    /* JADX INFO: renamed from: a */
    public final int f90395a;

    /* JADX INFO: renamed from: b */
    public final double f90396b;

    /* JADX INFO: renamed from: c */
    public final double f90397c;

    /* JADX INFO: renamed from: d */
    public final Frame.Metadata f90398d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40724s1)) {
            return false;
        }
        C40724s1 c40724s1 = (C40724s1) obj;
        return this.f90395a == c40724s1.f90395a && Double.compare(this.f90396b, c40724s1.f90396b) == 0 && Double.compare(this.f90397c, c40724s1.f90397c) == 0 && Intrinsics.areEqual(this.f90398d, c40724s1.f90398d);
    }

    public C40724s1(int i11, double d11, double d12, Frame.Metadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f90395a = i11;
        this.f90396b = d11;
        this.f90397c = d12;
        this.f90398d = metadata;
    }

    public final int hashCode() {
        return this.f90398d.hashCode() + ((Double.hashCode(this.f90397c) + ((Double.hashCode(this.f90396b) + (Integer.hashCode(this.f90395a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FlashFrame(color=" + this.f90395a + ", colorAverage=" + this.f90396b + ", lux=" + this.f90397c + ", metadata=" + this.f90398d + ')';
    }
}
