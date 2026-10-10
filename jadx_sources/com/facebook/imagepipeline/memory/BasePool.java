package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.VisibleForTesting;
import java.util.Set;
import p008a6.C0148h0;
import p008a6.C0150j;
import p712w3.C45708h;
import p712w3.C45710j;
import p712w3.C45713m;
import p747x3.C45999a;
import p819z3.InterfaceC46675d;
import p819z3.InterfaceC46677f;

/* JADX INFO: loaded from: classes34.dex */
public abstract class BasePool<V> implements InterfaceC46677f<V> {

    /* JADX INFO: renamed from: a */
    public final Class<?> f9148a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC46675d f9149b;

    /* JADX INFO: renamed from: c */
    public final C0148h0 f9150c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final SparseArray<C0150j<V>> f9151d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final Set<V> f9152e;

    /* JADX INFO: renamed from: f */
    public boolean f9153f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public final C5657a f9154g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public final C5657a f9155h;

    /* JADX INFO: renamed from: i */
    public final PoolStatsTracker f9156i;

    /* JADX INFO: renamed from: j */
    public boolean f9157j;

    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i11, int i12, int i13, int i14) {
            super("Pool hard cap violation? Hard cap = " + i11 + " Used size = " + i12 + " Free size = " + i13 + " Request size = " + i14);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.memory.BasePool$a */
    @VisibleForTesting
    public static class C5657a {

        /* JADX INFO: renamed from: a */
        public int f9158a;

        /* JADX INFO: renamed from: b */
        public int f9159b;

        /* JADX INFO: renamed from: a */
        public void m9480a(int i11) {
            int i12;
            int i13 = this.f9159b;
            if (i13 < i11 || (i12 = this.f9158a) <= 0) {
                C45999a.m101494O("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i11), Integer.valueOf(this.f9159b), Integer.valueOf(this.f9158a));
            } else {
                this.f9158a = i12 - 1;
                this.f9159b = i13 - i11;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m9481b(int i11) {
            this.f9158a++;
            this.f9159b += i11;
        }
    }

    public BasePool(InterfaceC46675d interfaceC46675d, C0148h0 c0148h0, PoolStatsTracker poolStatsTracker) {
        this.f9148a = getClass();
        this.f9149b = (InterfaceC46675d) C45708h.m100896g(interfaceC46675d);
        C0148h0 c0148h1 = (C0148h0) C45708h.m100896g(c0148h0);
        this.f9150c = c0148h1;
        this.f9156i = (PoolStatsTracker) C45708h.m100896g(poolStatsTracker);
        this.f9151d = new SparseArray<>();
        if (c0148h1.f519f) {
            m9473r();
        } else {
            m9476v(new SparseIntArray(0));
        }
        this.f9152e = C45710j.m100902b();
        this.f9155h = new C5657a();
        this.f9154g = new C5657a();
    }

    /* JADX INFO: renamed from: g */
    public abstract V mo699g(int i11);

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public synchronized boolean m9468h(int i11) {
        if (this.f9157j) {
            return true;
        }
        C0148h0 c0148h0 = this.f9150c;
        int i12 = c0148h0.f514a;
        int i13 = this.f9154g.f9159b;
        if (i11 > i12 - i13) {
            this.f9156i.mo617c();
            return false;
        }
        int i14 = c0148h0.f515b;
        if (i11 > i14 - (i13 + this.f9155h.f9159b)) {
            m9478y(i14 - i11);
        }
        if (i11 <= i12 - (this.f9154g.f9159b + this.f9155h.f9159b)) {
            return true;
        }
        this.f9156i.mo617c();
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m9469i() {
        try {
            C45708h.m100898i(!m9475t() || this.f9155h.f9159b == 0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public abstract void mo700k(V v11);

    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public synchronized C0150j<V> m9471l(int i11) {
        try {
            C0150j<V> c0150j = this.f9151d.get(i11);
            if (c0150j == null && this.f9153f) {
                if (C45999a.m101517w(2)) {
                    C45999a.m101519y(this.f9148a, "creating new bucket %s", Integer.valueOf(i11));
                }
                C0150j<V> c0150jMo722x = mo722x(i11);
                this.f9151d.put(i11, c0150jMo722x);
                return c0150jMo722x;
            }
            return c0150j;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized C0150j<V> m9472m(int i11) {
        return this.f9151d.get(i11);
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo701n(int i11);

    /* JADX INFO: renamed from: o */
    public abstract int mo702o(V v11);

    /* JADX INFO: renamed from: p */
    public abstract int mo703p(int i11);

    /* JADX INFO: renamed from: q */
    public synchronized V mo704q(C0150j<V> c0150j) {
        return c0150j.m683c();
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m9473r() {
        try {
            SparseIntArray sparseIntArray = this.f9150c.f516c;
            if (sparseIntArray != null) {
                m9470j(sparseIntArray);
                this.f9153f = false;
            } else {
                this.f9153f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: t */
    public synchronized boolean m9475t() {
        boolean z11;
        z11 = this.f9154g.f9159b + this.f9155h.f9159b > this.f9150c.f515b;
        if (z11) {
            this.f9156i.mo618d();
        }
        return z11;
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m9476v(SparseIntArray sparseIntArray) {
        try {
            C45708h.m100896g(sparseIntArray);
            this.f9151d.clear();
            SparseIntArray sparseIntArray2 = this.f9150c.f516c;
            if (sparseIntArray2 != null) {
                for (int i11 = 0; i11 < sparseIntArray2.size(); i11++) {
                    int iKeyAt = sparseIntArray2.keyAt(i11);
                    this.f9151d.put(iKeyAt, new C0150j<>(mo703p(iKeyAt), sparseIntArray2.valueAt(i11), sparseIntArray.get(iKeyAt, 0), this.f9150c.f519f));
                }
                this.f9153f = false;
            } else {
                this.f9153f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    /* JADX INFO: renamed from: w */
    public final void m9477w() {
        if (C45999a.m101517w(2)) {
            C45999a.m101481B(this.f9148a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f9154g.f9158a), Integer.valueOf(this.f9154g.f9159b), Integer.valueOf(this.f9155h.f9158a), Integer.valueOf(this.f9155h.f9159b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    /* JADX INFO: renamed from: y */
    public synchronized void m9478y(int i11) {
        try {
            int i12 = this.f9154g.f9159b;
            int i13 = this.f9155h.f9159b;
            int iMin = Math.min((i12 + i13) - i11, i13);
            if (iMin <= 0) {
                return;
            }
            if (C45999a.m101517w(2)) {
                C45999a.m101480A(this.f9148a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i11), Integer.valueOf(this.f9154g.f9159b + this.f9155h.f9159b), Integer.valueOf(iMin));
            }
            m9477w();
            for (int i14 = 0; i14 < this.f9151d.size() && iMin > 0; i14++) {
                C0150j c0150j = (C0150j) C45708h.m100896g(this.f9151d.valueAt(i14));
                while (iMin > 0) {
                    Object objMo624g = c0150j.mo624g();
                    if (objMo624g == null) {
                        break;
                    }
                    mo700k(objMo624g);
                    int i15 = c0150j.f521a;
                    iMin -= i15;
                    this.f9155h.m9480a(i15);
                }
            }
            m9477w();
            if (C45999a.m101517w(2)) {
                C45999a.m101520z(this.f9148a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i11), Integer.valueOf(this.f9154g.f9159b + this.f9155h.f9159b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: z */
    public synchronized void m9479z() {
        if (m9475t()) {
            m9478y(this.f9150c.f515b);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9470j(SparseIntArray sparseIntArray) {
        this.f9151d.clear();
        for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
            int iKeyAt = sparseIntArray.keyAt(i11);
            this.f9151d.put(iKeyAt, new C0150j<>(mo703p(iKeyAt), sparseIntArray.valueAt(i11), 0, this.f9150c.f519f));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m9474s() {
        this.f9149b.mo102897a(this);
        this.f9156i.mo621g(this);
    }

    /* JADX INFO: renamed from: x */
    public C0150j<V> mo722x(int i11) {
        return new C0150j<>(mo703p(i11), Integer.MAX_VALUE, 0, this.f9150c.f519f);
    }

    @Override // p819z3.InterfaceC46677f
    public V get(int i11) throws Throwable {
        V vMo699g;
        V vMo704q;
        m9469i();
        int iMo701n = mo701n(i11);
        synchronized (this) {
            try {
                C0150j<V> c0150jM9471l = m9471l(iMo701n);
                if (c0150jM9471l != null && (vMo704q = mo704q(c0150jM9471l)) != null) {
                    C45708h.m100898i(this.f9152e.add(vMo704q));
                    int iMo702o = mo702o(vMo704q);
                    int iMo703p = mo703p(iMo702o);
                    this.f9154g.m9481b(iMo703p);
                    this.f9155h.m9480a(iMo703p);
                    this.f9156i.mo616b(iMo703p);
                    m9477w();
                    if (C45999a.m101517w(2)) {
                        C45999a.m101520z(this.f9148a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vMo704q)), Integer.valueOf(iMo702o));
                    }
                    return vMo704q;
                }
                int iMo703p2 = mo703p(iMo701n);
                if (m9468h(iMo703p2)) {
                    this.f9154g.m9481b(iMo703p2);
                    if (c0150jM9471l != null) {
                        c0150jM9471l.m685e();
                    }
                    try {
                        vMo699g = mo699g(iMo701n);
                    } catch (Throwable th2) {
                        synchronized (this) {
                            try {
                                this.f9154g.m9480a(iMo703p2);
                                C0150j<V> c0150jM9471l2 = m9471l(iMo701n);
                                if (c0150jM9471l2 != null) {
                                    c0150jM9471l2.m682b();
                                }
                                C45713m.m100910c(th2);
                                vMo699g = null;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    synchronized (this) {
                        try {
                            C45708h.m100898i(this.f9152e.add(vMo699g));
                            m9479z();
                            this.f9156i.mo615a(iMo703p2);
                            m9477w();
                            if (C45999a.m101517w(2)) {
                                C45999a.m101520z(this.f9148a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vMo699g)), Integer.valueOf(iMo701n));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    return vMo699g;
                }
                throw new PoolSizeViolationException(this.f9150c.f514a, this.f9154g.f9159b, this.f9155h.f9159b, iMo703p2);
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // p819z3.InterfaceC46677f, p006a4.InterfaceC0117h
    public void release(V v11) {
        C45708h.m100896g(v11);
        int iMo702o = mo702o(v11);
        int iMo703p = mo703p(iMo702o);
        synchronized (this) {
            try {
                C0150j<V> c0150jM9472m = m9472m(iMo702o);
                if (!this.f9152e.remove(v11)) {
                    C45999a.m101505k(this.f9148a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v11)), Integer.valueOf(iMo702o));
                    mo700k(v11);
                    this.f9156i.mo619e(iMo703p);
                } else if (c0150jM9472m != null && !c0150jM9472m.m686f() && !m9475t() && mo705u(v11)) {
                    c0150jM9472m.m687h(v11);
                    this.f9155h.m9481b(iMo703p);
                    this.f9154g.m9480a(iMo703p);
                    this.f9156i.mo620f(iMo703p);
                    if (C45999a.m101517w(2)) {
                        C45999a.m101520z(this.f9148a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v11)), Integer.valueOf(iMo702o));
                    }
                } else {
                    if (c0150jM9472m != null) {
                        c0150jM9472m.m682b();
                    }
                    if (C45999a.m101517w(2)) {
                        C45999a.m101520z(this.f9148a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v11)), Integer.valueOf(iMo702o));
                    }
                    mo700k(v11);
                    this.f9154g.m9480a(iMo703p);
                    this.f9156i.mo619e(iMo703p);
                }
                m9477w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean mo705u(V v11) {
        C45708h.m100896g(v11);
        return true;
    }

    public BasePool(InterfaceC46675d interfaceC46675d, C0148h0 c0148h0, PoolStatsTracker poolStatsTracker, boolean z11) {
        this(interfaceC46675d, c0148h0, poolStatsTracker);
        this.f9157j = z11;
    }
}
