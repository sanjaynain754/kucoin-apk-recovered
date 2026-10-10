package jumio.core;

import java.io.Serializable;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.i2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40675i2 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f90292a;

    /* JADX INFO: renamed from: b */
    public final List f90293b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40675i2)) {
            return false;
        }
        C40675i2 c40675i2 = (C40675i2) obj;
        return Intrinsics.areEqual(this.f90292a, c40675i2.f90292a) && Intrinsics.areEqual(this.f90293b, c40675i2.f90293b);
    }

    public C40675i2(String label, List list) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f90292a = label;
        this.f90293b = list;
    }

    public final int hashCode() {
        return this.f90293b.hashCode() + (this.f90292a.hashCode() * 31);
    }

    public final String toString() {
        return "ListSensorDataItem(label=" + this.f90292a + ", list=" + this.f90293b + ')';
    }
}
