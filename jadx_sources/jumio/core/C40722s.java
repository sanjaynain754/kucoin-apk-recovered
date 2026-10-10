package jumio.core;

import java.util.concurrent.atomic.AtomicBoolean;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.s */
/* JADX INFO: loaded from: classes61.dex */
public final class C40722s {

    /* JADX INFO: renamed from: a */
    public String f90391a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f90392b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40722s) && Intrinsics.areEqual(this.f90391a, ((C40722s) obj).f90391a);
    }

    public C40722s(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f90391a = path;
        this.f90392b = new AtomicBoolean(false);
    }

    public final int hashCode() {
        return this.f90391a.hashCode();
    }

    public final String toString() {
        return "AssetResult(path=" + this.f90391a + ')';
    }
}
