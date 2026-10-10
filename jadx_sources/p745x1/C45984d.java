package p745x1;

import java.io.File;

/* JADX INFO: renamed from: x1.d */
/* JADX INFO: compiled from: DiskLruCacheFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class C45984d implements InterfaceC45981a.a {

    /* JADX INFO: renamed from: a */
    public final long f103441a;

    /* JADX INFO: renamed from: b */
    public final a f103442b;

    /* JADX INFO: renamed from: x1.d$a */
    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        File mo101444a();
    }

    @Override // p745x1.InterfaceC45981a.a
    public InterfaceC45981a build() {
        File fileMo101444a = this.f103442b.mo101444a();
        if (fileMo101444a == null) {
            return null;
        }
        if (fileMo101444a.isDirectory() || fileMo101444a.mkdirs()) {
            return C45985e.m101445c(fileMo101444a, this.f103441a);
        }
        return null;
    }

    public C45984d(a aVar, long j11) {
        this.f103441a = j11;
        this.f103442b = aVar;
    }
}
