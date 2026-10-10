package p008a6;

import java.util.LinkedList;
import java.util.Queue;
import p712w3.C45708h;
import p747x3.C45999a;

/* JADX INFO: renamed from: a6.j */
/* JADX INFO: compiled from: Bucket.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0150j<V> {

    /* JADX INFO: renamed from: a */
    public final int f521a;

    /* JADX INFO: renamed from: b */
    public final int f522b;

    /* JADX INFO: renamed from: c */
    public final Queue f523c;

    /* JADX INFO: renamed from: d */
    public final boolean f524d;

    /* JADX INFO: renamed from: e */
    public int f525e;

    /* JADX INFO: renamed from: a */
    public void mo623a(V v11) {
        this.f523c.add(v11);
    }

    /* JADX INFO: renamed from: b */
    public void m682b() {
        C45708h.m100898i(this.f525e > 0);
        this.f525e--;
    }

    /* JADX INFO: renamed from: d */
    public int m684d() {
        return this.f523c.size();
    }

    /* JADX INFO: renamed from: e */
    public void m685e() {
        this.f525e++;
    }

    /* JADX INFO: renamed from: f */
    public boolean m686f() {
        return this.f525e + m684d() > this.f522b;
    }

    /* JADX INFO: renamed from: g */
    public V mo624g() {
        return (V) this.f523c.poll();
    }

    public C0150j(int i11, int i12, int i13, boolean z11) {
        boolean z12;
        boolean z13;
        if (i11 > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        C45708h.m100898i(z12);
        if (i12 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        C45708h.m100898i(z13);
        C45708h.m100898i(i13 >= 0);
        this.f521a = i11;
        this.f522b = i12;
        this.f523c = new LinkedList();
        this.f525e = i13;
        this.f524d = z11;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public V m683c() {
        V vMo624g = mo624g();
        if (vMo624g != null) {
            this.f525e++;
        }
        return vMo624g;
    }

    /* JADX INFO: renamed from: h */
    public void m687h(V v11) {
        boolean z11;
        C45708h.m100896g(v11);
        if (this.f524d) {
            if (this.f525e > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C45708h.m100898i(z11);
            this.f525e--;
            mo623a(v11);
            return;
        }
        int i11 = this.f525e;
        if (i11 > 0) {
            this.f525e = i11 - 1;
            mo623a(v11);
        } else {
            C45999a.m101509o("BUCKET", "Tried to release value %s from an empty bucket!", v11);
        }
    }
}
