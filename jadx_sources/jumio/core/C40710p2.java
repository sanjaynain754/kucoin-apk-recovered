package jumio.core;

import com.jumio.core.processor.ProcessorParameterInterface;

/* JADX INFO: renamed from: jumio.core.p2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40710p2 implements ProcessorParameterInterface {

    /* JADX INFO: renamed from: a */
    public final boolean f90354a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40710p2) && this.f90354a == ((C40710p2) obj).f90354a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90354a);
    }

    public final String toString() {
        return "ManualParameters(takeImage=" + this.f90354a + ')';
    }

    public C40710p2(boolean z11) {
        this.f90354a = z11;
    }
}
