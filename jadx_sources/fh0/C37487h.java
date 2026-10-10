package fh0;

import hh0.C38212d;
import ih0.AbstractC38619a;
import ih0.AbstractC38635q;
import ih0.C38620b;
import ih0.C38624f;
import ih0.C38626h;
import ih0.C38628j;
import ih0.C38629k;
import ih0.C38632n;
import ih0.C38634p;
import ih0.C38639u;
import ih0.C38643y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh0.InterfaceC40405a;
import jh0.InterfaceC40407c;
import kh0.AbstractC41046f;
import kh0.C41043c;
import kh0.InterfaceC41044d;
import kh0.InterfaceC41045e;
import kh0.InterfaceC41047g;
import kh0.InterfaceC41048h;
import lh0.InterfaceC42224a;

/* JADX INFO: renamed from: fh0.h */
/* JADX INFO: compiled from: DocumentParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37487h implements InterfaceC41048h {

    /* JADX INFO: renamed from: p */
    public static final Set<Class<? extends AbstractC38619a>> f83120p = new LinkedHashSet(Arrays.asList(C38620b.class, C38628j.class, C38626h.class, C38629k.class, C38643y.class, AbstractC38635q.class, C38632n.class));

    /* JADX INFO: renamed from: q */
    public static final Map<Class<? extends AbstractC38619a>, InterfaceC41045e> f83121q;

    /* JADX INFO: renamed from: a */
    public CharSequence f83122a;

    /* JADX INFO: renamed from: d */
    public boolean f83125d;

    /* JADX INFO: renamed from: h */
    public boolean f83129h;

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC41045e> f83130i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC40407c f83131j;

    /* JADX INFO: renamed from: k */
    public final List<InterfaceC42224a> f83132k;

    /* JADX INFO: renamed from: l */
    public final C37486g f83133l;

    /* JADX INFO: renamed from: b */
    public int f83123b = 0;

    /* JADX INFO: renamed from: c */
    public int f83124c = 0;

    /* JADX INFO: renamed from: e */
    public int f83126e = 0;

    /* JADX INFO: renamed from: f */
    public int f83127f = 0;

    /* JADX INFO: renamed from: g */
    public int f83128g = 0;

    /* JADX INFO: renamed from: m */
    public final Map<String, C38634p> f83134m = new LinkedHashMap();

    /* JADX INFO: renamed from: n */
    public List<InterfaceC41044d> f83135n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public Set<InterfaceC41044d> f83136o = new LinkedHashSet();

    /* JADX INFO: renamed from: fh0.h$a */
    /* JADX INFO: compiled from: DocumentParser.java */
    public static class a implements InterfaceC41047g {

        /* JADX INFO: renamed from: a */
        public final InterfaceC41044d f83137a;

        @Override // kh0.InterfaceC41047g
        /* JADX INFO: renamed from: a */
        public InterfaceC41044d mo84353a() {
            return this.f83137a;
        }

        @Override // kh0.InterfaceC41047g
        /* JADX INFO: renamed from: b */
        public CharSequence mo84354b() {
            InterfaceC41044d interfaceC41044d = this.f83137a;
            if (!(interfaceC41044d instanceof C37496q)) {
                return null;
            }
            CharSequence charSequenceM84417i = ((C37496q) interfaceC41044d).m84417i();
            if (charSequenceM84417i.length() == 0) {
                return null;
            }
            return charSequenceM84417i;
        }

        public a(InterfaceC41044d interfaceC41044d) {
            this.f83137a = interfaceC41044d;
        }
    }

    /* JADX INFO: renamed from: s */
    public C38624f m84348s(String str) {
        int i11 = 0;
        while (true) {
            int iM86218c = C38212d.m86218c(str, i11);
            if (iM86218c == -1) {
                break;
            }
            m84347r(str.substring(i11, iM86218c));
            i11 = iM86218c + 1;
            if (i11 < str.length() && str.charAt(iM86218c) == '\r' && str.charAt(i11) == '\n') {
                i11 = iM86218c + 2;
            }
        }
        if (str.length() > 0 && (i11 == 0 || i11 < str.length())) {
            m84347r(str.substring(i11));
        }
        return m84343m();
    }

    static {
        HashMap map = new HashMap();
        map.put(C38620b.class, new C37482c.a());
        map.put(C38628j.class, new C37489j.a());
        map.put(C38626h.class, new C37488i.a());
        map.put(C38629k.class, new C37490k.b());
        map.put(C38643y.class, new C37498s.a());
        map.put(AbstractC38635q.class, new C37494o.a());
        map.put(C38632n.class, new C37491l.a());
        f83121q = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: j */
    public static List<InterfaceC41045e> m84330j(List<InterfaceC41045e> list, Set<Class<? extends AbstractC38619a>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<Class<? extends AbstractC38619a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f83121q.get(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static Set<Class<? extends AbstractC38619a>> m84331q() {
        return f83120p;
    }

    @Override // kh0.InterfaceC41048h
    /* JADX INFO: renamed from: a */
    public boolean mo84332a() {
        return this.f83129h;
    }

    @Override // kh0.InterfaceC41048h
    /* JADX INFO: renamed from: b */
    public int mo84333b() {
        return this.f83126e;
    }

    @Override // kh0.InterfaceC41048h
    /* JADX INFO: renamed from: c */
    public int mo84334c() {
        return this.f83128g;
    }

    @Override // kh0.InterfaceC41048h
    /* JADX INFO: renamed from: d */
    public InterfaceC41044d mo84335d() {
        List<InterfaceC41044d> list = this.f83135n;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m84336e(InterfaceC41044d interfaceC41044d) {
        this.f83135n.add(interfaceC41044d);
        this.f83136o.add(interfaceC41044d);
    }

    @Override // kh0.InterfaceC41048h
    public int getColumn() {
        return this.f83124c;
    }

    @Override // kh0.InterfaceC41048h
    public int getIndex() {
        return this.f83123b;
    }

    @Override // kh0.InterfaceC41048h
    public CharSequence getLine() {
        return this.f83122a;
    }

    /* JADX INFO: renamed from: h */
    public final void m84339h() {
        CharSequence charSequenceSubSequence;
        if (this.f83125d) {
            int i11 = this.f83123b + 1;
            CharSequence charSequence = this.f83122a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i11, charSequence.length());
            int iM86216a = C38212d.m86216a(this.f83124c);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence2.length() + iM86216a);
            for (int i12 = 0; i12 < iM86216a; i12++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f83122a;
            charSequenceSubSequence = charSequence2.subSequence(this.f83123b, charSequence2.length());
        }
        mo84335d().mo84328d(charSequenceSubSequence);
    }

    /* JADX INFO: renamed from: i */
    public final void m84340i() {
        if (this.f83122a.charAt(this.f83123b) != '\t') {
            this.f83123b++;
            this.f83124c++;
        } else {
            this.f83123b++;
            int i11 = this.f83124c;
            this.f83124c = i11 + C38212d.m86216a(i11);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m84341k() {
        List<InterfaceC41044d> list = this.f83135n;
        list.remove(list.size() - 1);
    }

    /* JADX INFO: renamed from: m */
    public final C38624f m84343m() {
        m84344n(this.f83135n);
        m84350u();
        return this.f83133l.mo84311c();
    }

    /* JADX INFO: renamed from: o */
    public final C37483d m84345o(InterfaceC41044d interfaceC41044d) {
        a aVar = new a(interfaceC41044d);
        Iterator<InterfaceC41045e> it = this.f83130i.iterator();
        while (it.hasNext()) {
            AbstractC41046f abstractC41046fMo84315a = it.next().mo84315a(this, aVar);
            if (abstractC41046fMo84315a instanceof C37483d) {
                return (C37483d) abstractC41046fMo84315a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m84346p() {
        int i11 = this.f83123b;
        int i12 = this.f83124c;
        this.f83129h = true;
        int length = this.f83122a.length();
        while (i11 < length) {
            char cCharAt = this.f83122a.charAt(i11);
            if (cCharAt == '\t') {
                i11++;
                i12 += 4 - (i12 % 4);
            } else if (cCharAt != ' ') {
                this.f83129h = false;
                break;
            } else {
                i11++;
                i12++;
            }
        }
        this.f83126e = i11;
        this.f83127f = i12;
        this.f83128g = i12 - this.f83124c;
    }

    /* JADX INFO: renamed from: u */
    public final void m84350u() {
        InterfaceC40405a interfaceC40405aMo89039a = this.f83131j.mo89039a(new C37492m(this.f83132k, this.f83134m));
        Iterator<InterfaceC41044d> it = this.f83136o.iterator();
        while (it.hasNext()) {
            it.next().mo84365e(interfaceC40405aMo89039a);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m84351v(int i11) {
        int i12;
        int i13 = this.f83127f;
        if (i11 >= i13) {
            this.f83123b = this.f83126e;
            this.f83124c = i13;
        }
        int length = this.f83122a.length();
        while (true) {
            i12 = this.f83124c;
            if (i12 >= i11 || this.f83123b == length) {
                break;
            } else {
                m84340i();
            }
        }
        if (i12 <= i11) {
            this.f83125d = false;
            return;
        }
        this.f83123b--;
        this.f83124c = i11;
        this.f83125d = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m84352w(int i11) {
        int i12 = this.f83126e;
        if (i11 >= i12) {
            this.f83123b = i12;
            this.f83124c = this.f83127f;
        }
        int length = this.f83122a.length();
        while (true) {
            int i13 = this.f83123b;
            if (i13 >= i11 || i13 == length) {
                break;
            } else {
                m84340i();
            }
        }
        this.f83125d = false;
    }

    public C37487h(List<InterfaceC41045e> list, InterfaceC40407c interfaceC40407c, List<InterfaceC42224a> list2) {
        this.f83130i = list;
        this.f83131j = interfaceC40407c;
        this.f83132k = list2;
        C37486g c37486g = new C37486g();
        this.f83133l = c37486g;
        m84336e(c37486g);
    }

    /* JADX INFO: renamed from: f */
    public final <T extends InterfaceC41044d> T m84337f(T t11) {
        while (!mo84335d().mo84312g(t11.mo84311c())) {
            m84342l(mo84335d());
        }
        mo84335d().mo84311c().m87354b(t11.mo84311c());
        m84336e(t11);
        return t11;
    }

    /* JADX INFO: renamed from: g */
    public final void m84338g(C37496q c37496q) {
        for (C38634p c38634p : c37496q.m84418j()) {
            c37496q.mo84311c().m87360i(c38634p);
            String strM87350n = c38634p.m87350n();
            if (!this.f83134m.containsKey(strM87350n)) {
                this.f83134m.put(strM87350n, c38634p);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m84342l(InterfaceC41044d interfaceC41044d) {
        if (mo84335d() == interfaceC41044d) {
            m84341k();
        }
        if (interfaceC41044d instanceof C37496q) {
            m84338g((C37496q) interfaceC41044d);
        }
        interfaceC41044d.mo84358f();
    }

    /* JADX INFO: renamed from: n */
    public final void m84344n(List<InterfaceC41044d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            m84342l(list.get(size));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m84347r(CharSequence charSequence) {
        boolean zMo84310a;
        this.f83122a = C38212d.m86225j(charSequence);
        this.f83123b = 0;
        this.f83124c = 0;
        this.f83125d = false;
        List<InterfaceC41044d> list = this.f83135n;
        int i11 = 1;
        for (InterfaceC41044d interfaceC41044d : list.subList(1, list.size())) {
            m84346p();
            C41043c c41043cMo84313h = interfaceC41044d.mo84313h(this);
            if (!(c41043cMo84313h instanceof C37481b)) {
                break;
            }
            C37481b c37481b = (C37481b) c41043cMo84313h;
            if (c37481b.m84307g()) {
                m84342l(interfaceC41044d);
                return;
            }
            if (c37481b.m84306f() != -1) {
                m84352w(c37481b.m84306f());
            } else if (c37481b.m84305e() != -1) {
                m84351v(c37481b.m84305e());
            }
            i11++;
        }
        List<InterfaceC41044d> list2 = this.f83135n;
        ArrayList arrayList = new ArrayList(list2.subList(i11, list2.size()));
        InterfaceC41044d interfaceC41044d2 = this.f83135n.get(i11 - 1);
        boolean zIsEmpty = arrayList.isEmpty();
        if (!(interfaceC41044d2.mo84311c() instanceof C38639u) && !interfaceC41044d2.mo84310a()) {
            zMo84310a = false;
        } else {
            zMo84310a = true;
        }
        while (zMo84310a) {
            m84346p();
            if (!mo84332a() && (this.f83128g >= C38212d.f85913a || !C38212d.m86223h(this.f83122a, this.f83126e))) {
                C37483d c37483dM84345o = m84345o(interfaceC41044d2);
                if (c37483dM84345o == null) {
                    m84352w(this.f83126e);
                    break;
                }
                if (!zIsEmpty) {
                    m84344n(arrayList);
                    zIsEmpty = true;
                }
                if (c37483dM84345o.m84321h() != -1) {
                    m84352w(c37483dM84345o.m84321h());
                } else if (c37483dM84345o.m84320g() != -1) {
                    m84351v(c37483dM84345o.m84320g());
                }
                if (c37483dM84345o.m84322i()) {
                    m84349t();
                }
                InterfaceC41044d[] interfaceC41044dArrM84319f = c37483dM84345o.m84319f();
                int length = interfaceC41044dArrM84319f.length;
                int i12 = 0;
                while (i12 < length) {
                    InterfaceC41044d interfaceC41044d3 = interfaceC41044dArrM84319f[i12];
                    InterfaceC41044d interfaceC41044dM84337f = m84337f(interfaceC41044d3);
                    i12++;
                    zMo84310a = interfaceC41044d3.mo84310a();
                    interfaceC41044d2 = interfaceC41044dM84337f;
                }
            } else {
                m84352w(this.f83126e);
                break;
            }
        }
        if (!zIsEmpty && !mo84332a() && mo84335d().mo84416b()) {
            m84339h();
            return;
        }
        if (!zIsEmpty) {
            m84344n(arrayList);
        }
        if (!interfaceC41044d2.mo84310a()) {
            m84339h();
        } else if (!mo84332a()) {
            m84337f(new C37496q());
            m84339h();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m84349t() {
        InterfaceC41044d interfaceC41044dMo84335d = mo84335d();
        m84341k();
        this.f83136o.remove(interfaceC41044dMo84335d);
        if (interfaceC41044dMo84335d instanceof C37496q) {
            m84338g((C37496q) interfaceC41044dMo84335d);
        }
        interfaceC41044dMo84335d.mo84311c().m87361l();
    }
}
