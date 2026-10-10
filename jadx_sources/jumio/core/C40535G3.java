package jumio.core;

import java.io.Serializable;
import java.util.ArrayList;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.G3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40535G3 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final long f89980a;

    /* JADX INFO: renamed from: b */
    public final String f89981b;

    /* JADX INFO: renamed from: c */
    public final int f89982c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f89983d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40535G3)) {
            return false;
        }
        C40535G3 c40535g3 = (C40535G3) obj;
        return this.f89980a == c40535g3.f89980a && Intrinsics.areEqual(this.f89981b, c40535g3.f89981b) && this.f89982c == c40535g3.f89982c && Intrinsics.areEqual(this.f89983d, c40535g3.f89983d);
    }

    public C40535G3(long j11, String credentialId, int i11, ArrayList data) {
        Intrinsics.checkNotNullParameter(credentialId, "credentialId");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f89980a = j11;
        this.f89981b = credentialId;
        this.f89982c = i11;
        this.f89983d = data;
    }

    public final int hashCode() {
        return this.f89983d.hashCode() + AbstractC40653e0.m89252a(this.f89982c, AbstractC40511C.m89148a(this.f89981b, Long.hashCode(this.f89980a) * 31, 31), 31);
    }

    public final String toString() {
        return "SensorDataResult(initialTimestamp=" + this.f89980a + ", credentialId=" + this.f89981b + ", samplingTime=" + this.f89982c + ", data=" + this.f89983d + ')';
    }
}
