package fh0;

import hh0.C38212d;
import ih0.AbstractC38619a;
import ih0.AbstractC38635q;
import ih0.C38621c;
import ih0.C38636r;
import ih0.C38638t;
import kh0.AbstractC41041a;
import kh0.AbstractC41042b;
import kh0.AbstractC41046f;
import kh0.C41043c;
import kh0.InterfaceC41044d;
import kh0.InterfaceC41047g;
import kh0.InterfaceC41048h;

/* JADX INFO: renamed from: fh0.o */
/* JADX INFO: compiled from: ListBlockParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37494o extends AbstractC41041a {

    /* JADX INFO: renamed from: a */
    public final AbstractC38635q f83175a;

    /* JADX INFO: renamed from: b */
    public boolean f83176b;

    /* JADX INFO: renamed from: c */
    public int f83177c;

    /* JADX INFO: renamed from: fh0.o$a */
    /* JADX INFO: compiled from: ListBlockParser.java */
    public static class a extends AbstractC41042b {
        @Override // kh0.InterfaceC41045e
        /* JADX INFO: renamed from: a */
        public AbstractC41046f mo84315a(InterfaceC41048h interfaceC41048h, InterfaceC41047g interfaceC41047g) {
            InterfaceC41044d interfaceC41044dMo84353a = interfaceC41047g.mo84353a();
            if (interfaceC41048h.mo84334c() >= C38212d.f85913a) {
                return AbstractC41046f.m90005c();
            }
            b bVarM84413n = C37494o.m84413n(interfaceC41048h.getLine(), interfaceC41048h.mo84333b(), interfaceC41048h.getColumn() + interfaceC41048h.mo84334c(), interfaceC41047g.mo84354b() != null);
            if (bVarM84413n == null) {
                return AbstractC41046f.m90005c();
            }
            int i11 = bVarM84413n.f83179b;
            C37495p c37495p = new C37495p(i11 - interfaceC41048h.getColumn());
            if ((interfaceC41044dMo84353a instanceof C37494o) && C37494o.m84412m((AbstractC38635q) interfaceC41044dMo84353a.mo84311c(), bVarM84413n.f83178a)) {
                return AbstractC41046f.m90006d(c37495p).mo84316a(i11);
            }
            C37494o c37494o = new C37494o(bVarM84413n.f83178a);
            bVarM84413n.f83178a.m87353o(true);
            return AbstractC41046f.m90006d(c37494o, c37495p).mo84316a(i11);
        }
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: a */
    public boolean mo84310a() {
        return true;
    }

    /* JADX INFO: renamed from: fh0.o$b */
    /* JADX INFO: compiled from: ListBlockParser.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final AbstractC38635q f83178a;

        /* JADX INFO: renamed from: b */
        public final int f83179b;

        public b(AbstractC38635q abstractC38635q, int i11) {
            this.f83178a = abstractC38635q;
            this.f83179b = i11;
        }
    }

    /* JADX INFO: renamed from: fh0.o$c */
    /* JADX INFO: compiled from: ListBlockParser.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final AbstractC38635q f83180a;

        /* JADX INFO: renamed from: b */
        public final int f83181b;

        public c(AbstractC38635q abstractC38635q, int i11) {
            this.f83180a = abstractC38635q;
            this.f83181b = i11;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m84410k(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m84412m(AbstractC38635q abstractC38635q, AbstractC38635q abstractC38635q2) {
        if ((abstractC38635q instanceof C38621c) && (abstractC38635q2 instanceof C38621c)) {
            return m84410k(Character.valueOf(((C38621c) abstractC38635q).m87324p()), Character.valueOf(((C38621c) abstractC38635q2).m87324p()));
        }
        if ((abstractC38635q instanceof C38638t) && (abstractC38635q2 instanceof C38638t)) {
            return m84410k(Character.valueOf(((C38638t) abstractC38635q).m87362p()), Character.valueOf(((C38638t) abstractC38635q2).m87362p()));
        }
        return false;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: c */
    public AbstractC38619a mo84311c() {
        return this.f83175a;
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: g */
    public boolean mo84312g(AbstractC38619a abstractC38619a) {
        if (!(abstractC38619a instanceof C38636r)) {
            return false;
        }
        if (this.f83176b && this.f83177c == 1) {
            this.f83175a.m87353o(false);
            this.f83176b = false;
        }
        return true;
    }

    public C37494o(AbstractC38635q abstractC38635q) {
        this.f83175a = abstractC38635q;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m84411l(CharSequence charSequence, int i11) {
        char cCharAt;
        if (i11 >= charSequence.length() || (cCharAt = charSequence.charAt(i11)) == '\t' || cCharAt == ' ') {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static b m84413n(CharSequence charSequence, int i11, int i12, boolean z11) {
        boolean z12;
        c cVarM84414o = m84414o(charSequence, i11);
        if (cVarM84414o == null) {
            return null;
        }
        AbstractC38635q abstractC38635q = cVarM84414o.f83180a;
        int i13 = cVarM84414o.f83181b;
        int i14 = i12 + (i13 - i11);
        int length = charSequence.length();
        int iM86216a = i14;
        while (true) {
            if (i13 < length) {
                char cCharAt = charSequence.charAt(i13);
                if (cCharAt == '\t') {
                    iM86216a += C38212d.m86216a(iM86216a);
                } else if (cCharAt == ' ') {
                    iM86216a++;
                } else {
                    z12 = true;
                    break;
                }
                i13++;
            } else {
                z12 = false;
                break;
            }
        }
        if (z11 && (((abstractC38635q instanceof C38638t) && ((C38638t) abstractC38635q).m87363q() != 1) || !z12)) {
            return null;
        }
        if (!z12 || iM86216a - i14 > C38212d.f85913a) {
            iM86216a = i14 + 1;
        }
        return new b(abstractC38635q, iM86216a);
    }

    /* JADX INFO: renamed from: o */
    public static c m84414o(CharSequence charSequence, int i11) {
        char cCharAt = charSequence.charAt(i11);
        if (cCharAt != '*' && cCharAt != '+' && cCharAt != '-') {
            return m84415p(charSequence, i11);
        }
        int i12 = i11 + 1;
        if (m84411l(charSequence, i12)) {
            C38621c c38621c = new C38621c();
            c38621c.m87325q(cCharAt);
            return new c(c38621c, i12);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:5:0x0009  */
    /* JADX INFO: renamed from: p */
    public static c m84415p(CharSequence charSequence, int i11) {
        int i12;
        int length = charSequence.length();
        int i13 = 0;
        for (int i14 = i11; i14 < length; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt == ')' && cCharAt != '.') {
                switch (cCharAt) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i13++;
                        if (i13 > 9) {
                            return null;
                        }
                        break;
                        break;
                    default:
                        return null;
                }
                while (i14 < length) {
                    char cCharAt2 = charSequence.charAt(i14);
                    if (cCharAt2 == ')') {
                    }
                    if (i13 >= 1) {
                        i12 = i14 + 1;
                        if (m84411l(charSequence, i12)) {
                            String string = charSequence.subSequence(i11, i14).toString();
                            C38638t c38638t = new C38638t();
                            c38638t.m87365s(Integer.parseInt(string));
                            c38638t.m87364r(cCharAt2);
                            return new c(c38638t, i12);
                        }
                    }
                    return null;
                }
            }
            if (i13 >= 1) {
                i12 = i14 + 1;
                if (m84411l(charSequence, i12)) {
                    String string2 = charSequence.subSequence(i11, i14).toString();
                    C38638t c38638t2 = new C38638t();
                    c38638t2.m87365s(Integer.parseInt(string2));
                    c38638t2.m87364r(cCharAt2);
                    return new c(c38638t2, i12);
                }
            }
            return null;
        }
        return null;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: h */
    public C41043c mo84313h(InterfaceC41048h interfaceC41048h) {
        if (interfaceC41048h.mo84332a()) {
            this.f83176b = true;
            this.f83177c = 0;
        } else if (this.f83176b) {
            this.f83177c++;
        }
        return C41043c.m90002b(interfaceC41048h.getIndex());
    }
}
