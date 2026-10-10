package p745x1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p545q1.C43578b;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: x1.e */
/* JADX INFO: compiled from: DiskLruCacheWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class C45985e implements InterfaceC45981a {

    /* JADX INFO: renamed from: b */
    public final File f103444b;

    /* JADX INFO: renamed from: c */
    public final long f103445c;

    /* JADX INFO: renamed from: e */
    public C43578b f103447e;

    /* JADX INFO: renamed from: d */
    public final C45983c f103446d = new C45983c();

    /* JADX INFO: renamed from: a */
    public final C45990j f103443a = new C45990j();

    /* JADX INFO: renamed from: d */
    public final synchronized C43578b m101446d() throws IOException {
        try {
            if (this.f103447e == null) {
                this.f103447e = C43578b.m95858C(this.f103444b, 1, 1, this.f103445c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f103447e;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC45981a m101445c(File file, long j11) {
        return new C45985e(file, j11);
    }

    @Override // p745x1.InterfaceC45981a
    /* JADX INFO: renamed from: a */
    public File mo101438a(InterfaceC44610b interfaceC44610b) {
        String strM101464b = this.f103443a.m101464b(interfaceC44610b);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM101464b + " for for Key: " + interfaceC44610b);
        }
        try {
            C43578b.e eVarM95882x = m101446d().m95882x(strM101464b);
            if (eVarM95882x != null) {
                return eVarM95882x.m95905a(0);
            }
            return null;
        } catch (IOException e11) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e11);
            return null;
        }
    }

    @Override // p745x1.InterfaceC45981a
    /* JADX INFO: renamed from: b */
    public void mo101439b(InterfaceC44610b interfaceC44610b, InterfaceC45981a.b bVar) {
        String strM101464b = this.f103443a.m101464b(interfaceC44610b);
        this.f103446d.m101440a(strM101464b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM101464b + " for for Key: " + interfaceC44610b);
            }
            try {
                C43578b c43578bM101446d = m101446d();
                if (c43578bM101446d.m95882x(strM101464b) != null) {
                    this.f103446d.m101441b(strM101464b);
                    return;
                }
                C43578b.c cVarM95880u = c43578bM101446d.m95880u(strM101464b);
                if (cVarM95880u == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: " + strM101464b);
                }
                try {
                    if (bVar.mo100249a(cVarM95880u.m95890f(0))) {
                        cVarM95880u.m95889e();
                    }
                    cVarM95880u.m95888b();
                    this.f103446d.m101441b(strM101464b);
                } catch (Throwable th2) {
                    cVarM95880u.m95888b();
                    throw th2;
                }
            } catch (IOException e11) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e11);
                }
            }
        } catch (Throwable th3) {
            this.f103446d.m101441b(strM101464b);
            throw th3;
        }
    }

    @Deprecated
    public C45985e(File file, long j11) {
        this.f103444b = file;
        this.f103445c = j11;
    }
}
