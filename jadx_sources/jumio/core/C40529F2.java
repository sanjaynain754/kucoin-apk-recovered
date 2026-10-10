package jumio.core;

import android.opengl.EGLSurface;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.F2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40529F2 extends AbstractC40524E2 {

    /* JADX INFO: renamed from: b */
    public final EGLSurface f89960b;

    /* JADX INFO: renamed from: c */
    public final int f89961c;

    /* JADX INFO: renamed from: d */
    public final int f89962d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC40524E2)) {
            return false;
        }
        C40529F2 c40529f2 = (C40529F2) ((AbstractC40524E2) obj);
        return Intrinsics.areEqual(this.f89960b, c40529f2.f89960b) && this.f89961c == c40529f2.f89961c && this.f89962d == c40529f2.f89962d;
    }

    public C40529F2(EGLSurface eglSurface, int i11, int i12) {
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        this.f89960b = eglSurface;
        this.f89961c = i11;
        this.f89962d = i12;
    }

    public final int hashCode() {
        return ((((this.f89960b.hashCode() ^ 1000003) * 1000003) ^ this.f89961c) * 1000003) ^ this.f89962d;
    }

    public final String toString() {
        return "OutputSurface{eglSurface=" + this.f89960b + ", width=" + this.f89961c + ", height=" + this.f89962d + '}';
    }
}
