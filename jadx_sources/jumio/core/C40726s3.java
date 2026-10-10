package jumio.core;

import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.s3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40726s3 {

    /* JADX INFO: renamed from: a */
    public final String f90409a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41775x1 f90410b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40726s3)) {
            return false;
        }
        C40726s3 c40726s3 = (C40726s3) obj;
        return Intrinsics.areEqual(this.f90409a, c40726s3.f90409a) && Intrinsics.areEqual(this.f90410b, c40726s3.f90410b);
    }

    public C40726s3(String classifier, InterfaceC41775x1 job) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(job, "job");
        this.f90409a = classifier;
        this.f90410b = job;
    }

    public final int hashCode() {
        return this.f90410b.hashCode() + (this.f90409a.hashCode() * 31);
    }

    public final String toString() {
        return "SaveImageJob(classifier=" + this.f90409a + ", job=" + this.f90410b + ')';
    }
}
