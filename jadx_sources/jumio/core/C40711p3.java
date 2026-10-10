package jumio.core;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.p3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40711p3 {

    /* JADX INFO: renamed from: a */
    public final String f90355a;

    /* JADX INFO: renamed from: b */
    public final String f90356b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40711p3)) {
            return false;
        }
        C40711p3 c40711p3 = (C40711p3) obj;
        return Intrinsics.areEqual(this.f90355a, c40711p3.f90355a) && Intrinsics.areEqual(this.f90356b, c40711p3.f90356b);
    }

    public C40711p3(String resultKey, String classifier) {
        Intrinsics.checkNotNullParameter(resultKey, "resultKey");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        this.f90355a = resultKey;
        this.f90356b = classifier;
    }

    public final int hashCode() {
        return this.f90356b.hashCode() + (this.f90355a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultKeyItem(resultKey=" + this.f90355a + ", classifier=" + this.f90356b + ')';
    }
}
