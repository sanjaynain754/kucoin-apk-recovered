package p710w1;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p523p2.C43363j;

/* JADX INFO: renamed from: w1.i */
/* JADX INFO: compiled from: LruArrayPool.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45691i implements InterfaceC45684b {

    /* JADX INFO: renamed from: a */
    public final C45689g<a, Object> f103000a = new C45689g<>();

    /* JADX INFO: renamed from: b */
    public final b f103001b = new b();

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f103002c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map<Class<?>, InterfaceC45683a<?>> f103003d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final int f103004e;

    /* JADX INFO: renamed from: f */
    public int f103005f;

    /* JADX INFO: renamed from: w1.i$a */
    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class a implements InterfaceC45694l {

        /* JADX INFO: renamed from: a */
        public final b f103006a;

        /* JADX INFO: renamed from: b */
        public int f103007b;

        /* JADX INFO: renamed from: c */
        public Class<?> f103008c;

        @Override // p710w1.InterfaceC45694l
        /* JADX INFO: renamed from: a */
        public void mo100840a() {
            this.f103006a.m100810c(this);
        }

        /* JADX INFO: renamed from: b */
        public void m100841b(int i11, Class<?> cls) {
            this.f103007b = i11;
            this.f103008c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f103007b == aVar.f103007b && this.f103008c == aVar.f103008c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.f103007b * 31;
            Class<?> cls = this.f103008c;
            return i11 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f103007b + "array=" + this.f103008c + '}';
        }

        public a(b bVar) {
            this.f103006a = bVar;
        }
    }

    /* JADX INFO: renamed from: w1.i$b */
    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class b extends AbstractC45685c<a> {
        @Override // p710w1.AbstractC45685c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo100808a() {
            return new a(this);
        }

        /* JADX INFO: renamed from: e */
        public a m100843e(int i11, Class<?> cls) {
            a aVarM100809b = m100809b();
            aVarM100809b.m100841b(i11, cls);
            return aVarM100809b;
        }
    }

    @Override // p710w1.InterfaceC45684b
    /* JADX INFO: renamed from: a */
    public synchronized void mo100804a(int i11) {
        try {
            if (i11 >= 40) {
                mo100805c();
            } else if (i11 >= 20 || i11 == 15) {
                m100831g(this.f103004e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p710w1.InterfaceC45684b
    /* JADX INFO: renamed from: c */
    public synchronized void mo100805c() {
        m100831g(0);
    }

    @Override // p710w1.InterfaceC45684b
    /* JADX INFO: renamed from: d */
    public synchronized <T> T mo100806d(int i11, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = m100836l(cls).ceilingKey(Integer.valueOf(i11));
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) m100835k(m100839o(i11, numCeilingKey) ? this.f103001b.m100843e(numCeilingKey.intValue(), cls) : this.f103001b.m100843e(i11, cls), cls);
    }

    @Override // p710w1.InterfaceC45684b
    /* JADX INFO: renamed from: e */
    public synchronized <T> T mo100807e(int i11, Class<T> cls) {
        return (T) m100835k(this.f103001b.m100843e(i11, cls), cls);
    }

    @Override // p710w1.InterfaceC45684b
    public synchronized <T> void put(T t11) {
        Class<?> cls = t11.getClass();
        InterfaceC45683a<T> interfaceC45683aM100833i = m100833i(cls);
        int iMo100802a = interfaceC45683aM100833i.mo100802a(t11);
        int iMo100803b = interfaceC45683aM100833i.mo100803b() * iMo100802a;
        if (m100838n(iMo100803b)) {
            a aVarM100843e = this.f103001b.m100843e(iMo100802a, cls);
            this.f103000a.m100822d(aVarM100843e, t11);
            NavigableMap<Integer, Integer> navigableMapM100836l = m100836l(cls);
            Integer num = navigableMapM100836l.get(Integer.valueOf(aVarM100843e.f103007b));
            Integer numValueOf = Integer.valueOf(aVarM100843e.f103007b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM100836l.put(numValueOf, Integer.valueOf(iIntValue));
            this.f103005f += iMo100803b;
            m100830f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m100830f() {
        m100831g(this.f103004e);
    }

    /* JADX INFO: renamed from: g */
    public final void m100831g(int i11) {
        while (this.f103005f > i11) {
            Object objM100823f = this.f103000a.m100823f();
            C43363j.m95506d(objM100823f);
            InterfaceC45683a interfaceC45683aM100832h = m100832h(objM100823f);
            this.f103005f -= interfaceC45683aM100832h.mo100802a(objM100823f) * interfaceC45683aM100832h.mo100803b();
            m100829b(interfaceC45683aM100832h.mo100802a(objM100823f), objM100823f.getClass());
            if (Log.isLoggable(interfaceC45683aM100832h.getTag(), 2)) {
                Log.v(interfaceC45683aM100832h.getTag(), "evicted: " + interfaceC45683aM100832h.mo100802a(objM100823f));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final <T> InterfaceC45683a<T> m100833i(Class<T> cls) {
        InterfaceC45683a<T> c45688f;
        InterfaceC45683a<T> interfaceC45683a = (InterfaceC45683a) this.f103003d.get(cls);
        if (interfaceC45683a != null) {
            return interfaceC45683a;
        }
        if (cls.equals(int[].class)) {
            c45688f = new C45690h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            c45688f = new C45688f();
        }
        this.f103003d.put(cls, c45688f);
        return c45688f;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final <T> T m100834j(a aVar) {
        return (T) this.f103000a.m100819a(aVar);
    }

    /* JADX INFO: renamed from: l */
    public final NavigableMap<Integer, Integer> m100836l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f103002c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f103002c.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m100837m() {
        int i11 = this.f103005f;
        return i11 == 0 || this.f103004e / i11 >= 2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m100838n(int i11) {
        return i11 <= this.f103004e / 2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m100839o(int i11, Integer num) {
        if (num != null) {
            return m100837m() || num.intValue() <= i11 * 8;
        }
        return false;
    }

    public C45691i(int i11) {
        this.f103004e = i11;
    }

    /* JADX INFO: renamed from: b */
    public final void m100829b(int i11, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapM100836l = m100836l(cls);
        Integer num = navigableMapM100836l.get(Integer.valueOf(i11));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM100836l.remove(Integer.valueOf(i11));
                return;
            } else {
                navigableMapM100836l.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i11 + ", this: " + this);
    }

    /* JADX INFO: renamed from: h */
    public final <T> InterfaceC45683a<T> m100832h(T t11) {
        return m100833i(t11.getClass());
    }

    /* JADX INFO: renamed from: k */
    public final <T> T m100835k(a aVar, Class<T> cls) {
        InterfaceC45683a<T> interfaceC45683aM100833i = m100833i(cls);
        T t11 = (T) m100834j(aVar);
        if (t11 != null) {
            this.f103005f -= interfaceC45683aM100833i.mo100802a(t11) * interfaceC45683aM100833i.mo100803b();
            m100829b(interfaceC45683aM100833i.mo100802a(t11), cls);
        }
        if (t11 == null) {
            if (Log.isLoggable(interfaceC45683aM100833i.getTag(), 2)) {
                Log.v(interfaceC45683aM100833i.getTag(), "Allocated " + aVar.f103007b + " bytes");
            }
            return interfaceC45683aM100833i.newArray(aVar.f103007b);
        }
        return t11;
    }
}
