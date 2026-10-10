package yb0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: yb0.r */
/* JADX INFO: compiled from: DatabaseWorkerPool.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46450r implements InterfaceC46448p {

    /* JADX INFO: renamed from: a */
    public final String f104172a;

    /* JADX INFO: renamed from: b */
    public final int f104173b;

    /* JADX INFO: renamed from: c */
    public final int f104174c;

    /* JADX INFO: renamed from: d */
    public final LinkedList<C46445m> f104175d = new LinkedList<>();

    /* JADX INFO: renamed from: e */
    public final Set<C46447o> f104176e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Set<C46447o> f104177f = new HashSet();

    /* JADX INFO: renamed from: g */
    public final Map<Integer, C46447o> f104178g = new HashMap();

    @Override // yb0.InterfaceC46448p
    /* JADX INFO: renamed from: b */
    public synchronized void mo102492b(C46445m c46445m) {
        this.f104175d.add(c46445m);
        Iterator it = new HashSet(this.f104176e).iterator();
        while (it.hasNext()) {
            m102499i((C46447o) it.next());
        }
    }

    @Override // yb0.InterfaceC46448p
    /* JADX INFO: renamed from: c */
    public synchronized void mo102493c() {
        try {
            Iterator<C46447o> it = this.f104176e.iterator();
            while (it.hasNext()) {
                it.next().m102488e();
            }
            Iterator<C46447o> it2 = this.f104177f.iterator();
            while (it2.hasNext()) {
                it2.next().m102488e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized C46445m m102497g(C46447o c46447o) {
        C46445m next;
        C46447o c46447o2;
        try {
            ListIterator<C46445m> listIterator = this.f104175d.listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                next = listIterator.next();
                c46447o2 = next.m102482a() != null ? this.f104178g.get(next.m102482a()) : null;
                if (c46447o2 == null) {
                    break;
                }
            } while (c46447o2 != c46447o);
            listIterator.remove();
            return next;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m102498h(C46447o c46447o) {
        try {
            HashSet hashSet = new HashSet(this.f104176e);
            this.f104177f.remove(c46447o);
            this.f104176e.add(c46447o);
            if (!c46447o.m102485b() && c46447o.m102486c() != null) {
                this.f104178g.remove(c46447o.m102486c());
            }
            m102499i(c46447o);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                m102499i((C46447o) it.next());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m102499i(C46447o c46447o) {
        try {
            C46445m c46445mM102497g = m102497g(c46447o);
            if (c46445mM102497g != null) {
                this.f104177f.add(c46447o);
                this.f104176e.remove(c46447o);
                if (c46445mM102497g.m102482a() != null) {
                    this.f104178g.put(c46445mM102497g.m102482a(), c46447o);
                }
                c46447o.m102487d(c46445mM102497g);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // yb0.InterfaceC46448p
    public synchronized void start() {
        for (int i11 = 0; i11 < this.f104173b; i11++) {
            final C46447o c46447oM102496f = m102496f(this.f104172a + i11, this.f104174c);
            c46447oM102496f.m102489f(new Runnable() { // from class: yb0.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104170b.m102498h(c46447oM102496f);
                }
            });
            this.f104176e.add(c46447oM102496f);
        }
    }

    /* JADX INFO: renamed from: f */
    public C46447o m102496f(String str, int i11) {
        return new C46447o(str, i11);
    }

    public C46450r(String str, int i11, int i12) {
        this.f104172a = str;
        this.f104173b = i11;
        this.f104174c = i12;
    }
}
