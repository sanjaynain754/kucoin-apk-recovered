package jumio.core;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.a4 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40635a4 {

    /* JADX INFO: renamed from: a */
    public final String f90217a;

    /* JADX INFO: renamed from: b */
    public final String f90218b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40635a4)) {
            return false;
        }
        C40635a4 c40635a4 = (C40635a4) obj;
        return Intrinsics.areEqual(this.f90217a, c40635a4.f90217a) && Intrinsics.areEqual(this.f90218b, c40635a4.f90218b);
    }

    public C40635a4(String multipartName, String classifier) {
        Intrinsics.checkNotNullParameter(multipartName, "multipartName");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        this.f90217a = multipartName;
        this.f90218b = classifier;
    }

    public final int hashCode() {
        return this.f90218b.hashCode() + (this.f90217a.hashCode() * 31);
    }

    public final String toString() {
        return "MultipartItem(multipartName=" + this.f90217a + ", classifier=" + this.f90218b + ')';
    }
}
