package jumio.core;

import java.io.InputStream;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.W0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40611W0 {

    /* JADX INFO: renamed from: a */
    public final int f90155a;

    /* JADX INFO: renamed from: b */
    public final int f90156b;

    /* JADX INFO: renamed from: c */
    public final InputStream f90157c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40611W0)) {
            return false;
        }
        C40611W0 c40611w0 = (C40611W0) obj;
        return this.f90155a == c40611w0.f90155a && this.f90156b == c40611w0.f90156b && Intrinsics.areEqual(this.f90157c, c40611w0.f90157c);
    }

    public final int hashCode() {
        return this.f90157c.hashCode() + AbstractC40653e0.m89252a(this.f90156b, Integer.hashCode(this.f90155a) * 31, 31);
    }

    public final String toString() {
        return "DownloadResponse(code=" + this.f90155a + ", length=" + this.f90156b + ", stream=" + this.f90157c + ')';
    }

    public C40611W0(int i11, int i12, InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.f90155a = i11;
        this.f90156b = i12;
        this.f90157c = stream;
    }
}
