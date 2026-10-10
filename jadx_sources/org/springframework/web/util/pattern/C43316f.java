package org.springframework.web.util.pattern;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import org.springframework.web.util.pattern.C43316f;
import vh0.InterfaceC45553b;
import wh0.AbstractC45839g;
import wh0.InterfaceC45841i;
import zh0.C46879e;

/* JADX INFO: renamed from: org.springframework.web.util.pattern.f */
/* JADX INFO: compiled from: PathPattern.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43316f implements Comparable<C43316f> {

    /* JADX INFO: renamed from: m */
    public static final InterfaceC45553b f95606m = InterfaceC45553b.m100603b("");

    /* JADX INFO: renamed from: n */
    public static final Comparator<C43316f> f95607n = Comparator.nullsLast(Comparator.comparingInt(new ToIntFunction() { // from class: zh0.a
        @Override // java.util.function.ToIntFunction
        public final int applyAsInt(Object obj) {
            return C43316f.m95335b((C43316f) obj);
        }
    }).thenComparingInt(new ToIntFunction() { // from class: zh0.b
        @Override // java.util.function.ToIntFunction
        public final int applyAsInt(Object obj) {
            return C43316f.m95336c((C43316f) obj);
        }
    }).thenComparingInt(new ToIntFunction() { // from class: zh0.c
        @Override // java.util.function.ToIntFunction
        public final int applyAsInt(Object obj) {
            return ((C43316f) obj).m95342h();
        }
    }).thenComparingInt(new ToIntFunction() { // from class: zh0.d
        @Override // java.util.function.ToIntFunction
        public final int applyAsInt(Object obj) {
            return C43316f.m95338o((C43316f) obj);
        }
    }));

    /* JADX INFO: renamed from: b */
    public final String f95608b;

    /* JADX INFO: renamed from: c */
    public final C46879e f95609c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC45553b.b f95610d;

    /* JADX INFO: renamed from: e */
    public final boolean f95611e;

    /* JADX INFO: renamed from: f */
    public final boolean f95612f;

    /* JADX INFO: renamed from: g */
    public final AbstractC43315e f95613g;

    /* JADX INFO: renamed from: h */
    public int f95614h;

    /* JADX INFO: renamed from: i */
    public int f95615i;

    /* JADX INFO: renamed from: j */
    public boolean f95616j;

    /* JADX INFO: renamed from: k */
    public int f95617k;

    /* JADX INFO: renamed from: l */
    public boolean f95618l;

    /* JADX INFO: renamed from: org.springframework.web.util.pattern.f$a */
    /* JADX INFO: compiled from: PathPattern.java */
    public class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC45553b f95619a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC45553b.a> f95620b;

        /* JADX INFO: renamed from: c */
        public final int f95621c;

        /* JADX INFO: renamed from: d */
        public Map<String, String> f95622d;

        /* JADX INFO: renamed from: e */
        public Map<String, InterfaceC45841i<String, String>> f95623e;

        /* JADX INFO: renamed from: f */
        public boolean f95624f;

        /* JADX INFO: renamed from: g */
        public boolean f95625g = false;

        /* JADX INFO: renamed from: h */
        public int f95626h;

        public a(InterfaceC45553b interfaceC45553b, boolean z11) {
            this.f95619a = interfaceC45553b;
            List<InterfaceC45553b.a> listMo100596a = interfaceC45553b.mo100596a();
            this.f95620b = listMo100596a;
            this.f95621c = listMo100596a.size();
            this.f95624f = z11;
        }

        /* JADX INFO: renamed from: a */
        public b m95349a() {
            return this.f95622d == null ? b.f95628c : new b(this.f95622d, this.f95623e);
        }

        /* JADX INFO: renamed from: b */
        public boolean m95350b() {
            return C43316f.this.f95611e;
        }

        /* JADX INFO: renamed from: c */
        public boolean m95351c(int i11) {
            return this.f95620b.get(i11) instanceof InterfaceC45553b.d;
        }

        /* JADX INFO: renamed from: d */
        public String m95352d(int i11) {
            InterfaceC45553b.a aVar = i11 < this.f95621c ? this.f95620b.get(i11) : null;
            return aVar instanceof InterfaceC45553b.c ? ((InterfaceC45553b.c) aVar).mo100600a() : "";
        }

        /* JADX INFO: renamed from: e */
        public void m95353e(String str, String str2, InterfaceC45841i<String, String> interfaceC45841i) {
            if (this.f95622d == null) {
                this.f95622d = new HashMap();
            }
            this.f95622d.put(str, str2);
            if (interfaceC45841i.isEmpty()) {
                return;
            }
            if (this.f95623e == null) {
                this.f95623e = new HashMap();
            }
            this.f95623e.put(str, AbstractC45839g.m101263f(interfaceC45841i));
        }
    }

    /* JADX INFO: renamed from: org.springframework.web.util.pattern.f$b */
    /* JADX INFO: compiled from: PathPattern.java */
    public static class b {

        /* JADX INFO: renamed from: c */
        public static final b f95628c;

        /* JADX INFO: renamed from: a */
        public final Map<String, String> f95629a;

        /* JADX INFO: renamed from: b */
        public final Map<String, InterfaceC45841i<String, String>> f95630b;

        static {
            Map map = Collections.EMPTY_MAP;
            f95628c = new b(map, map);
        }

        /* JADX INFO: renamed from: b */
        public Map<String, String> m95355b() {
            return this.f95629a;
        }

        public String toString() {
            return "PathMatchInfo[uriVariables=" + this.f95629a + ", matrixVariables=" + this.f95630b + "]";
        }

        public b(Map<String, String> map, Map<String, InterfaceC45841i<String, String>> map2) {
            Map<String, InterfaceC45841i<String, String>> mapUnmodifiableMap;
            this.f95629a = Collections.unmodifiableMap(map);
            if (map2 != null) {
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            } else {
                mapUnmodifiableMap = Collections.EMPTY_MAP;
            }
            this.f95630b = mapUnmodifiableMap;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43316f)) {
            return false;
        }
        C43316f c43316f = (C43316f) obj;
        return this.f95608b.equals(c43316f.m95341g()) && m95343i() == c43316f.m95343i() && this.f95612f == c43316f.f95612f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(C43316f c43316f) {
        int iCompare = f95607n.compare(this, c43316f);
        return (iCompare != 0 || c43316f == null) ? iCompare : this.f95608b.compareTo(c43316f.f95608b);
    }

    /* JADX INFO: renamed from: f */
    public int m95340f() {
        return this.f95615i;
    }

    /* JADX INFO: renamed from: g */
    public String m95341g() {
        return this.f95608b;
    }

    /* JADX INFO: renamed from: h */
    public int m95342h() {
        return this.f95617k;
    }

    public int hashCode() {
        return ((this.f95608b.hashCode() + m95343i()) * 17) + (this.f95612f ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public char m95343i() {
        return this.f95610d.m100605b();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m95344j(InterfaceC45553b interfaceC45553b) {
        return interfaceC45553b != null && interfaceC45553b.mo100596a().size() > 0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m95345k() {
        return this.f95618l;
    }

    /* JADX INFO: renamed from: l */
    public b m95346l(InterfaceC45553b interfaceC45553b) {
        if (this.f95613g == null) {
            if (!m95344j(interfaceC45553b) || (this.f95611e && m95348n(interfaceC45553b))) {
                return b.f95628c;
            }
            return null;
        }
        if (!m95344j(interfaceC45553b)) {
            AbstractC43315e abstractC43315e = this.f95613g;
            if (!(abstractC43315e instanceof C43321k) && !(abstractC43315e instanceof C43311a)) {
                return null;
            }
            interfaceC45553b = f95606m;
        }
        a aVar = new a(interfaceC45553b, true);
        if (this.f95613g.mo95320e(0, aVar)) {
            return aVar.m95349a();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m95347m(InterfaceC45553b interfaceC45553b) {
        if (this.f95613g == null) {
            if (m95344j(interfaceC45553b)) {
                return this.f95611e && m95348n(interfaceC45553b);
            }
            return true;
        }
        if (!m95344j(interfaceC45553b)) {
            AbstractC43315e abstractC43315e = this.f95613g;
            if (!(abstractC43315e instanceof C43321k) && !(abstractC43315e instanceof C43311a)) {
                return false;
            }
            interfaceC45553b = f95606m;
        }
        return this.f95613g.mo95320e(0, new a(interfaceC45553b, false));
    }

    public String toString() {
        return this.f95608b;
    }

    public C43316f(String str, C46879e c46879e, AbstractC43315e abstractC43315e) {
        this.f95616j = false;
        this.f95618l = false;
        this.f95608b = str;
        this.f95609c = c46879e;
        this.f95610d = c46879e.m103208a();
        this.f95611e = c46879e.m103210c();
        this.f95612f = c46879e.m103209b();
        this.f95613g = abstractC43315e;
        while (abstractC43315e != null) {
            this.f95614h += abstractC43315e.mo95318a();
            this.f95615i += abstractC43315e.mo95319b();
            this.f95617k += abstractC43315e.mo95322c();
            if ((abstractC43315e instanceof C43311a) || (abstractC43315e instanceof C43321k)) {
                this.f95618l = true;
            }
            if (abstractC43315e instanceof C43318h) {
                AbstractC43315e abstractC43315e2 = abstractC43315e.f95604c;
                if ((abstractC43315e2 instanceof C43320j) && abstractC43315e2.f95604c == null) {
                    this.f95616j = true;
                }
            }
            abstractC43315e = abstractC43315e.f95604c;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m95335b(C43316f c43316f) {
        return c43316f.m95345k() ? 1 : 0;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m95336c(C43316f c43316f) {
        if (c43316f.m95345k()) {
            return m95338o(c43316f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public static int m95338o(C43316f c43316f) {
        return -c43316f.m95340f();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m95348n(InterfaceC45553b interfaceC45553b) {
        if (interfaceC45553b.value().length() != 1 || interfaceC45553b.value().charAt(0) != m95343i()) {
            return false;
        }
        return true;
    }
}
