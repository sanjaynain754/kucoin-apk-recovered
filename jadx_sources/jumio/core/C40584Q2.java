package jumio.core;

import java.io.Serializable;
import java.util.ArrayList;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.Q2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40584Q2 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final ArrayList f90101a;

    /* JADX INFO: renamed from: b */
    public boolean f90102b = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40584Q2) && Intrinsics.areEqual(this.f90101a, ((C40584Q2) obj).f90101a);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f90101a;
        return (arrayList == null ? 0 : arrayList.hashCode()) * 31;
    }

    public final String toString() {
        return "PhysicalDocumentFilter(types=" + this.f90101a + ", variant=null)";
    }

    public C40584Q2(ArrayList arrayList) {
        this.f90101a = arrayList;
    }
}
