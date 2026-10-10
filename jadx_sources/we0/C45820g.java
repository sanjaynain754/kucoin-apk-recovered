package we0;

import intl.o0oOOOOOooooo;
import java.util.concurrent.ConcurrentHashMap;
import p387k.C40830e;

/* JADX INFO: renamed from: we0.g */
/* JADX INFO: loaded from: classes60.dex */
public class C45820g {

    /* JADX INFO: renamed from: d */
    public final Object f103307d = new Object();

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<String, C40830e> f103304a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public C40830e f103305b = new C40830e();

    /* JADX INFO: renamed from: c */
    public C40830e f103306c = new C40830e();

    /* JADX INFO: renamed from: a */
    public C40830e m101228a() {
        return this.f103305b;
    }

    /* JADX INFO: renamed from: b */
    public C40830e m101229b() {
        return this.f103306c;
    }

    /* JADX INFO: renamed from: c */
    public void m101230c(int i11) {
        synchronized (this.f103307d) {
            this.f103305b.m89343e(i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m101231d(o0oOOOOOooooo o0ooooooooooo, int i11) {
        if (o0ooooooooooo == null) {
            return;
        }
        try {
            C40830e c40830e = this.f103304a.get(o0ooooooooooo.name());
            if (c40830e == null) {
                c40830e = new C40830e();
            }
            c40830e.m89343e(i11);
            this.f103304a.put(o0ooooooooooo.name(), c40830e);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public ConcurrentHashMap<String, C40830e> m101232e() {
        return this.f103304a;
    }

    /* JADX INFO: renamed from: f */
    public void m101233f() {
        this.f103306c.m89342d();
    }
}
