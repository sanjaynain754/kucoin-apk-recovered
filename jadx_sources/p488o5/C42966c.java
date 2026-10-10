package p488o5;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.cache.InterfaceC5645c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p006a4.AbstractC0110a;
import p547q3.InterfaceC43595a;
import p712w3.C45706f;
import p749x5.InterfaceC46071e;

/* JADX INFO: renamed from: o5.c */
/* JADX INFO: compiled from: AnimatedFrameCache.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42966c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC43595a f95103a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> f95104b;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet<InterfaceC43595a> f95106d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: c */
    public final InterfaceC5645c.b<InterfaceC43595a> f95105c = new a();

    /* JADX INFO: renamed from: o5.c$a */
    /* JADX INFO: compiled from: AnimatedFrameCache.java */
    public class a implements InterfaceC5645c.b<InterfaceC43595a> {
        public a() {
        }

        @Override // com.facebook.imagepipeline.cache.InterfaceC5645c.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9148a(InterfaceC43595a interfaceC43595a, boolean z11) {
            C42966c.this.m94352f(interfaceC43595a, z11);
        }
    }

    /* JADX INFO: renamed from: o5.c$b */
    /* JADX INFO: compiled from: AnimatedFrameCache.java */
    @VisibleForTesting
    public static class b implements InterfaceC43595a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC43595a f95108a;

        /* JADX INFO: renamed from: b */
        public final int f95109b;

        @Override // p547q3.InterfaceC43595a
        /* JADX INFO: renamed from: a */
        public String mo8758a() {
            return null;
        }

        @Override // p547q3.InterfaceC43595a
        /* JADX INFO: renamed from: b */
        public boolean mo8759b() {
            return false;
        }

        @Override // p547q3.InterfaceC43595a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f95109b == bVar.f95109b && this.f95108a.equals(bVar.f95108a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p547q3.InterfaceC43595a
        /* JADX INFO: renamed from: c */
        public boolean mo8760c(Uri uri) {
            return this.f95108a.mo8760c(uri);
        }

        @Override // p547q3.InterfaceC43595a
        public int hashCode() {
            return (this.f95108a.hashCode() * 1013) + this.f95109b;
        }

        public b(InterfaceC43595a interfaceC43595a, int i11) {
            this.f95108a = interfaceC43595a;
            this.f95109b = i11;
        }

        public String toString() {
            return C45706f.m100884b(this).m100886b("imageCacheKey", this.f95108a).m100885a("frameIndex", this.f95109b).toString();
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m94352f(InterfaceC43595a interfaceC43595a, boolean z11) {
        try {
            if (z11) {
                this.f95106d.add(interfaceC43595a);
            } else {
                this.f95106d.remove(interfaceC43595a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized InterfaceC43595a m94353g() {
        InterfaceC43595a next;
        Iterator<InterfaceC43595a> it = this.f95106d.iterator();
        if (it.hasNext()) {
            next = it.next();
            it.remove();
        } else {
            next = null;
        }
        return next;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0110a<InterfaceC46071e> m94347a(int i11, AbstractC0110a<InterfaceC46071e> abstractC0110a) {
        return this.f95104b.mo9145d(m94351e(i11), abstractC0110a, this.f95105c);
    }

    /* JADX INFO: renamed from: b */
    public boolean m94348b(int i11) {
        return this.f95104b.contains(m94351e(i11));
    }

    /* JADX INFO: renamed from: c */
    public AbstractC0110a<InterfaceC46071e> m94349c(int i11) {
        return this.f95104b.get(m94351e(i11));
    }

    /* JADX INFO: renamed from: e */
    public final b m94351e(int i11) {
        return new b(this.f95103a, i11);
    }

    public C42966c(InterfaceC43595a interfaceC43595a, InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> interfaceC5645c) {
        this.f95103a = interfaceC43595a;
        this.f95104b = interfaceC5645c;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC0110a<InterfaceC46071e> m94350d() {
        AbstractC0110a<InterfaceC46071e> abstractC0110aMo9144b;
        do {
            InterfaceC43595a interfaceC43595aM94353g = m94353g();
            if (interfaceC43595aM94353g == null) {
                return null;
            }
            abstractC0110aMo9144b = this.f95104b.mo9144b(interfaceC43595aM94353g);
        } while (abstractC0110aMo9144b == null);
        return abstractC0110aMo9144b;
    }
}
