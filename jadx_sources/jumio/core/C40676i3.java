package jumio.core;

import java.io.Serializable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.i3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40676i3 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f90294a;

    /* JADX INFO: renamed from: b */
    public final String f90295b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40676i3)) {
            return false;
        }
        C40676i3 c40676i3 = (C40676i3) obj;
        return Intrinsics.areEqual(this.f90294a, c40676i3.f90294a) && Intrinsics.areEqual(this.f90295b, c40676i3.f90295b);
    }

    public C40676i3(String label, String reasonDetailCode) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(reasonDetailCode, "reasonDetailCode");
        this.f90294a = label;
        this.f90295b = reasonDetailCode;
    }

    public final int hashCode() {
        return this.f90295b.hashCode() + (this.f90294a.hashCode() * 31);
    }

    public final String toString() {
        return "RejectReasonDetail(label=" + this.f90294a + ", reasonDetailCode=" + this.f90295b + ')';
    }
}
