package jumio.core;

import com.jumio.core.preload.CDNPreloadConfiguration$Companion;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.K */
/* JADX INFO: loaded from: classes61.dex */
public final class C40551K implements InterfaceC40516D {

    /* JADX INFO: renamed from: d */
    public static final CDNPreloadConfiguration$Companion f90019d = new CDNPreloadConfiguration$Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f90020a;

    /* JADX INFO: renamed from: b */
    public final String f90021b;

    /* JADX INFO: renamed from: c */
    public final String f90022c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40551K)) {
            return false;
        }
        C40551K c40551k = (C40551K) obj;
        return Intrinsics.areEqual(this.f90020a, c40551k.f90020a) && Intrinsics.areEqual(this.f90021b, c40551k.f90021b) && Intrinsics.areEqual(this.f90022c, c40551k.f90022c);
    }

    public C40551K(String name, String file, String checksum) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(checksum, "checksum");
        this.f90020a = name;
        this.f90021b = file;
        this.f90022c = checksum;
    }

    @Override // jumio.core.InterfaceC40516D
    public final String getChecksum() {
        return this.f90022c;
    }

    @Override // jumio.core.InterfaceC40516D
    public final String getFile() {
        return this.f90021b;
    }

    @Override // jumio.core.InterfaceC40516D
    public final String getName() {
        return this.f90020a;
    }

    public final int hashCode() {
        return this.f90022c.hashCode() + AbstractC40511C.m89148a(this.f90021b, this.f90020a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CDNPreloadConfiguration(name=" + this.f90020a + ", file=" + this.f90021b + ", checksum=" + this.f90022c + ')';
    }
}
