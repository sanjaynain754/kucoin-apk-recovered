package fh0;

import androidx.core.net.MailTo;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33627eb;
import gh0.C37927a;
import gh0.C37929c;
import hh0.C38209a;
import hh0.C38210b;
import hh0.C38211c;
import hh0.C38212d;
import ih0.AbstractC38637s;
import ih0.C38622d;
import ih0.C38627i;
import ih0.C38630l;
import ih0.C38631m;
import ih0.C38633o;
import ih0.C38634p;
import ih0.C38640v;
import ih0.C38642x;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jh0.InterfaceC40405a;
import jh0.InterfaceC40406b;
import lh0.InterfaceC42224a;

/* JADX INFO: renamed from: fh0.n */
/* JADX INFO: compiled from: InlineParserImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37493n implements InterfaceC40405a {

    /* JADX INFO: renamed from: i */
    public static final Pattern f83152i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: j */
    public static final Pattern f83153j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* JADX INFO: renamed from: k */
    public static final Pattern f83154k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: l */
    public static final Pattern f83155l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: m */
    public static final Pattern f83156m = Pattern.compile("`+");

    /* JADX INFO: renamed from: n */
    public static final Pattern f83157n = Pattern.compile("^`+");

    /* JADX INFO: renamed from: o */
    public static final Pattern f83158o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* JADX INFO: renamed from: p */
    public static final Pattern f83159p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* JADX INFO: renamed from: q */
    public static final Pattern f83160q = Pattern.compile("^ *(?:\n *)?");

    /* JADX INFO: renamed from: r */
    public static final Pattern f83161r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* JADX INFO: renamed from: s */
    public static final Pattern f83162s = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: t */
    public static final Pattern f83163t = Pattern.compile(" *$");

    /* JADX INFO: renamed from: a */
    public final BitSet f83164a;

    /* JADX INFO: renamed from: b */
    public final BitSet f83165b;

    /* JADX INFO: renamed from: c */
    public final Map<Character, InterfaceC42224a> f83166c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC40406b f83167d;

    /* JADX INFO: renamed from: e */
    public String f83168e;

    /* JADX INFO: renamed from: f */
    public int f83169f;

    /* JADX INFO: renamed from: g */
    public C37485f f83170g;

    /* JADX INFO: renamed from: h */
    public C37484e f83171h;

    /* JADX INFO: renamed from: l */
    public final void m84393l(AbstractC38637s abstractC38637s, AbstractC38637s abstractC38637s2) {
        C38642x c38642x = null;
        C38642x c38642x2 = null;
        int length = 0;
        while (abstractC38637s != null) {
            if (abstractC38637s instanceof C38642x) {
                c38642x2 = (C38642x) abstractC38637s;
                if (c38642x == null) {
                    c38642x = c38642x2;
                }
                length += c38642x2.m87366m().length();
            } else {
                m84391j(c38642x, c38642x2, length);
                c38642x = null;
                c38642x2 = null;
                length = 0;
            }
            if (abstractC38637s == abstractC38637s2) {
                break;
            } else {
                abstractC38637s = abstractC38637s.m87357e();
            }
        }
        m84391j(c38642x, c38642x2, length);
    }

    /* JADX INFO: renamed from: fh0.n$a */
    /* JADX INFO: compiled from: InlineParserImpl.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f83172a;

        /* JADX INFO: renamed from: b */
        public final boolean f83173b;

        /* JADX INFO: renamed from: c */
        public final boolean f83174c;

        public a(int i11, boolean z11, boolean z12) {
            this.f83172a = i11;
            this.f83174c = z11;
            this.f83173b = z12;
        }
    }

    /* JADX INFO: renamed from: e */
    public static BitSet m84371e(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: f */
    public static Map<Character, InterfaceC42224a> m84372f(List<InterfaceC42224a> list) {
        HashMap map = new HashMap();
        m84370d(Arrays.asList(new C37927a(), new C37929c()), map);
        m84370d(list, map);
        return map;
    }

    /* JADX INFO: renamed from: g */
    public static BitSet m84373g(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    /* JADX INFO: renamed from: A */
    public final AbstractC38637s m84374A() {
        int i11 = this.f83169f;
        int length = this.f83168e.length();
        while (true) {
            int i12 = this.f83169f;
            if (i12 == length || this.f83164a.get(this.f83168e.charAt(i12))) {
                break;
            }
            this.f83169f++;
        }
        int i13 = this.f83169f;
        if (i11 != i13) {
            return m84386M(this.f83168e, i11, i13);
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final char m84375B() {
        if (this.f83169f < this.f83168e.length()) {
            return this.f83168e.charAt(this.f83169f);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m84376C(C37485f c37485f) {
        boolean z11;
        HashMap map = new HashMap();
        C37485f c37485f2 = this.f83170g;
        while (c37485f2 != null) {
            C37485f c37485f3 = c37485f2.f83115e;
            if (c37485f3 == c37485f) {
                break;
            } else {
                c37485f2 = c37485f3;
            }
        }
        while (c37485f2 != null) {
            char c11 = c37485f2.f83112b;
            InterfaceC42224a interfaceC42224a = this.f83166c.get(Character.valueOf(c11));
            if (!c37485f2.f83114d || interfaceC42224a == null) {
                c37485f2 = c37485f2.f83116f;
            } else {
                char cMo84422d = interfaceC42224a.mo84422d();
                C37485f c37485f4 = c37485f2.f83115e;
                int iMo84419a = 0;
                boolean z12 = false;
                while (true) {
                    if (c37485f4 == null || c37485f4 == c37485f || c37485f4 == map.get(Character.valueOf(c11))) {
                        z11 = z12;
                        z12 = false;
                        break;
                    }
                    if (c37485f4.f83113c && c37485f4.f83112b == cMo84422d) {
                        iMo84419a = interfaceC42224a.mo84419a(c37485f4, c37485f2);
                        z12 = true;
                        if (iMo84419a > 0) {
                            z11 = true;
                            break;
                        }
                    }
                    c37485f4 = c37485f4.f83115e;
                }
                if (z12) {
                    C38642x c38642x = c37485f4.f83111a;
                    C38642x c38642x2 = c37485f2.f83111a;
                    c37485f4.f83117g -= iMo84419a;
                    c37485f2.f83117g -= iMo84419a;
                    c38642x.m87367n(c38642x.m87366m().substring(0, c38642x.m87366m().length() - iMo84419a));
                    c38642x2.m87367n(c38642x2.m87366m().substring(0, c38642x2.m87366m().length() - iMo84419a));
                    m84380G(c37485f4, c37485f2);
                    m84392k(c38642x, c38642x2);
                    interfaceC42224a.mo84423e(c38642x, c38642x2, iMo84419a);
                    if (c37485f4.f83117g == 0) {
                        m84378E(c37485f4);
                    }
                    if (c37485f2.f83117g == 0) {
                        C37485f c37485f5 = c37485f2.f83116f;
                        m84378E(c37485f2);
                        c37485f2 = c37485f5;
                    }
                } else {
                    if (!z11) {
                        map.put(Character.valueOf(c11), c37485f2.f83115e);
                        if (!c37485f2.f83113c) {
                            m84379F(c37485f2);
                        }
                    }
                    c37485f2 = c37485f2.f83116f;
                }
            }
        }
        while (true) {
            C37485f c37485f6 = this.f83170g;
            if (c37485f6 == null || c37485f6 == c37485f) {
                return;
            } else {
                m84379F(c37485f6);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m84377D(C37485f c37485f) {
        C37485f c37485f2 = c37485f.f83115e;
        if (c37485f2 != null) {
            c37485f2.f83116f = c37485f.f83116f;
        }
        C37485f c37485f3 = c37485f.f83116f;
        if (c37485f3 == null) {
            this.f83170g = c37485f2;
        } else {
            c37485f3.f83115e = c37485f2;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m84378E(C37485f c37485f) {
        c37485f.f83111a.m87361l();
        m84377D(c37485f);
    }

    /* JADX INFO: renamed from: G */
    public final void m84380G(C37485f c37485f, C37485f c37485f2) {
        C37485f c37485f3 = c37485f2.f83115e;
        while (c37485f3 != null && c37485f3 != c37485f) {
            C37485f c37485f4 = c37485f3.f83115e;
            m84379F(c37485f3);
            c37485f3 = c37485f4;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m84381H() {
        this.f83171h = this.f83171h.f83107d;
    }

    /* JADX INFO: renamed from: I */
    public void m84382I(String str) {
        this.f83168e = str;
        this.f83169f = 0;
        this.f83170g = null;
        this.f83171h = null;
    }

    /* JADX INFO: renamed from: J */
    public final a m84383J(InterfaceC42224a interfaceC42224a, char c11) {
        boolean z11;
        int i11 = this.f83169f;
        boolean z12 = false;
        int i12 = 0;
        while (m84375B() == c11) {
            i12++;
            this.f83169f++;
        }
        if (i12 < interfaceC42224a.mo84421c()) {
            this.f83169f = i11;
            return null;
        }
        String strValueOf = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        String strSubstring = i11 == 0 ? ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE : this.f83168e.substring(i11 - 1, i11);
        char cM84375B = m84375B();
        if (cM84375B != 0) {
            strValueOf = String.valueOf(cM84375B);
        }
        Pattern pattern = f83152i;
        boolean zMatches = pattern.matcher(strSubstring).matches();
        Pattern pattern2 = f83161r;
        boolean zMatches2 = pattern2.matcher(strSubstring).matches();
        boolean zMatches3 = pattern.matcher(strValueOf).matches();
        boolean zMatches4 = pattern2.matcher(strValueOf).matches();
        boolean z13 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
        boolean z14 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
        if (c11 == '_') {
            z11 = z13 && (!z14 || zMatches);
            if (z14 && (!z13 || zMatches3)) {
                z12 = true;
            }
        } else {
            boolean z15 = z13 && c11 == interfaceC42224a.mo84422d();
            if (z14 && c11 == interfaceC42224a.mo84420b()) {
                z12 = true;
            }
            z11 = z15;
        }
        this.f83169f = i11;
        return new a(i12, z11, z12);
    }

    /* JADX INFO: renamed from: K */
    public final void m84384K() {
        m84389h(f83160q);
    }

    /* JADX INFO: renamed from: L */
    public final C38642x m84385L(String str) {
        return new C38642x(str);
    }

    /* JADX INFO: renamed from: M */
    public final C38642x m84386M(String str, int i11, int i12) {
        return new C38642x(str.substring(i11, i12));
    }

    /* JADX INFO: renamed from: b */
    public final void m84388b(C37484e c37484e) {
        C37484e c37484e2 = this.f83171h;
        if (c37484e2 != null) {
            c37484e2.f83110g = true;
        }
        this.f83171h = c37484e;
    }

    /* JADX INFO: renamed from: h */
    public final String m84389h(Pattern pattern) {
        if (this.f83169f >= this.f83168e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f83168e);
        matcher.region(this.f83169f, this.f83168e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f83169f = matcher.end();
        return matcher.group();
    }

    /* JADX INFO: renamed from: j */
    public final void m84391j(C38642x c38642x, C38642x c38642x2, int i11) {
        if (c38642x == null || c38642x2 == null || c38642x == c38642x2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append(c38642x.m87366m());
        AbstractC38637s abstractC38637sM87357e = c38642x.m87357e();
        AbstractC38637s abstractC38637sM87357e2 = c38642x2.m87357e();
        while (abstractC38637sM87357e != abstractC38637sM87357e2) {
            sb2.append(((C38642x) abstractC38637sM87357e).m87366m());
            AbstractC38637s abstractC38637sM87357e3 = abstractC38637sM87357e.m87357e();
            abstractC38637sM87357e.m87361l();
            abstractC38637sM87357e = abstractC38637sM87357e3;
        }
        c38642x.m87367n(sb2.toString());
    }

    /* JADX INFO: renamed from: k */
    public final void m84392k(AbstractC38637s abstractC38637s, AbstractC38637s abstractC38637s2) {
        if (abstractC38637s == abstractC38637s2 || abstractC38637s.m87357e() == abstractC38637s2) {
            return;
        }
        m84393l(abstractC38637s.m87357e(), abstractC38637s2.m87358g());
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC38637s m84394m() {
        String strM84389h = m84389h(f83158o);
        if (strM84389h != null) {
            String strSubstring = strM84389h.substring(1, strM84389h.length() - 1);
            C38633o c38633o = new C38633o(MailTo.MAILTO_SCHEME + strSubstring, null);
            c38633o.m87354b(new C38642x(strSubstring));
            return c38633o;
        }
        String strM84389h2 = m84389h(f83159p);
        if (strM84389h2 == null) {
            return null;
        }
        String strSubstring2 = strM84389h2.substring(1, strM84389h2.length() - 1);
        C38633o c38633o2 = new C38633o(strSubstring2, null);
        c38633o2.m87354b(new C38642x(strSubstring2));
        return c38633o2;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC38637s m84395n() {
        this.f83169f++;
        if (m84375B() == '\n') {
            C38627i c38627i = new C38627i();
            this.f83169f++;
            return c38627i;
        }
        if (this.f83169f < this.f83168e.length()) {
            Pattern pattern = f83154k;
            String str = this.f83168e;
            int i11 = this.f83169f;
            if (pattern.matcher(str.substring(i11, i11 + 1)).matches()) {
                String str2 = this.f83168e;
                int i12 = this.f83169f;
                C38642x c38642xM84386M = m84386M(str2, i12, i12 + 1);
                this.f83169f++;
                return c38642xM84386M;
            }
        }
        return m84385L("\\");
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC38637s m84396o() {
        String strM84389h;
        String strM84389h2 = m84389h(f83157n);
        if (strM84389h2 == null) {
            return null;
        }
        int i11 = this.f83169f;
        do {
            strM84389h = m84389h(f83156m);
            if (strM84389h == null) {
                this.f83169f = i11;
                return m84385L(strM84389h2);
            }
        } while (!strM84389h.equals(strM84389h2));
        C38622d c38622d = new C38622d();
        String strReplace = this.f83168e.substring(i11, this.f83169f - strM84389h2.length()).replace('\n', ' ');
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && C38212d.m86220e(strReplace)) {
            strReplace = strReplace.substring(1, strReplace.length() - 1);
        }
        c38622d.m87327n(strReplace);
        return c38622d;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC38637s m84397p() {
        int i11 = this.f83169f;
        this.f83169f = i11 + 1;
        if (m84375B() != '[') {
            return m84385L("!");
        }
        this.f83169f++;
        C38642x c38642xM84385L = m84385L("![");
        m84388b(C37484e.m84323a(c38642xM84385L, i11 + 1, this.f83171h, this.f83170g));
        return c38642xM84385L;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX INFO: renamed from: q */
    public final AbstractC38637s m84398q() {
        boolean z11;
        String strM87349m;
        String strM87351o;
        boolean z12 = true;
        int i11 = this.f83169f + 1;
        this.f83169f = i11;
        C37484e c37484e = this.f83171h;
        if (c37484e == null) {
            return m84385L("]");
        }
        if (!c37484e.f83109f) {
            m84381H();
            return m84385L("]");
        }
        String strSubstring = null;
        if (m84375B() == '(') {
            this.f83169f++;
            m84384K();
            strM87349m = m84403v();
            if (strM87349m != null) {
                m84384K();
                Pattern pattern = f83162s;
                String str = this.f83168e;
                int i12 = this.f83169f;
                if (pattern.matcher(str.substring(i12 - 1, i12)).matches()) {
                    strM87351o = m84405x();
                    m84384K();
                } else {
                    strM87351o = null;
                }
                if (m84375B() == ')') {
                    this.f83169f++;
                    z11 = true;
                } else {
                    this.f83169f = i11;
                    z11 = false;
                }
            } else {
                z11 = false;
                strM87351o = null;
            }
        } else {
            z11 = false;
            strM87349m = null;
            strM87351o = null;
        }
        if (z11) {
            z12 = z11;
        } else {
            int i13 = this.f83169f;
            m84404w();
            int i14 = this.f83169f - i13;
            if (i14 > 2) {
                strSubstring = this.f83168e.substring(i13, i14 + i13);
            } else if (!c37484e.f83110g) {
                strSubstring = this.f83168e.substring(c37484e.f83105b, i11);
            }
            if (strSubstring != null) {
                C38634p c38634pMo84368b = this.f83167d.mo84368b(C38209a.m86205c(strSubstring));
                if (c38634pMo84368b != null) {
                    strM87349m = c38634pMo84368b.m87349m();
                    strM87351o = c38634pMo84368b.m87351o();
                } else {
                    z12 = z11;
                }
            } else {
                z12 = z11;
            }
        }
        if (!z12) {
            this.f83169f = i11;
            m84381H();
            return m84385L("]");
        }
        AbstractC38637s c38631m = c37484e.f83106c ? new C38631m(strM87349m, strM87351o) : new C38633o(strM87349m, strM87351o);
        AbstractC38637s abstractC38637sM87357e = c37484e.f83104a.m87357e();
        while (abstractC38637sM87357e != null) {
            AbstractC38637s abstractC38637sM87357e2 = abstractC38637sM87357e.m87357e();
            c38631m.m87354b(abstractC38637sM87357e);
            abstractC38637sM87357e = abstractC38637sM87357e2;
        }
        m84376C(c37484e.f83108e);
        m84390i(c38631m);
        c37484e.f83104a.m87361l();
        m84381H();
        if (!c37484e.f83106c) {
            for (C37484e c37484e2 = this.f83171h; c37484e2 != null; c37484e2 = c37484e2.f83107d) {
                if (!c37484e2.f83106c) {
                    c37484e2.f83109f = false;
                }
            }
        }
        return c38631m;
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC38637s m84400s() {
        String strM84389h = m84389h(f83155l);
        if (strM84389h != null) {
            return m84385L(C38210b.m86209a(strM84389h));
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC38637s m84401t() {
        String strM84389h = m84389h(f83153j);
        if (strM84389h == null) {
            return null;
        }
        C38630l c38630l = new C38630l();
        c38630l.m87343n(strM84389h);
        return c38630l;
    }

    /* JADX INFO: renamed from: v */
    public final String m84403v() {
        int iM86211a = C38211c.m86211a(this.f83168e, this.f83169f);
        if (iM86211a == -1) {
            return null;
        }
        String strSubstring = m84375B() == '<' ? this.f83168e.substring(this.f83169f + 1, iM86211a - 1) : this.f83168e.substring(this.f83169f, iM86211a);
        this.f83169f = iM86211a;
        return C38209a.m86207e(strSubstring);
    }

    /* JADX INFO: renamed from: w */
    public int m84404w() {
        if (this.f83169f < this.f83168e.length() && this.f83168e.charAt(this.f83169f) == '[') {
            int i11 = this.f83169f + 1;
            int iM86213c = C38211c.m86213c(this.f83168e, i11);
            int i12 = iM86213c - i11;
            if (iM86213c != -1 && i12 <= 999 && iM86213c < this.f83168e.length() && this.f83168e.charAt(iM86213c) == ']') {
                this.f83169f = iM86213c + 1;
                return i12 + 2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public final String m84405x() {
        int iM86214d = C38211c.m86214d(this.f83168e, this.f83169f);
        if (iM86214d == -1) {
            return null;
        }
        String strSubstring = this.f83168e.substring(this.f83169f + 1, iM86214d - 1);
        this.f83169f = iM86214d;
        return C38209a.m86207e(strSubstring);
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC38637s m84406y(AbstractC38637s abstractC38637s) {
        this.f83169f++;
        if (abstractC38637s instanceof C38642x) {
            C38642x c38642x = (C38642x) abstractC38637s;
            if (c38642x.m87366m().endsWith(C33627eb.f69716f)) {
                String strM87366m = c38642x.m87366m();
                Matcher matcher = f83163t.matcher(strM87366m);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    c38642x.m87367n(strM87366m.substring(0, strM87366m.length() - iEnd));
                }
                return iEnd >= 2 ? new C38627i() : new C38640v();
            }
        }
        return new C38640v();
    }

    /* JADX INFO: renamed from: z */
    public final AbstractC38637s m84407z() {
        int i11 = this.f83169f;
        this.f83169f = i11 + 1;
        C38642x c38642xM84385L = m84385L("[");
        m84388b(C37484e.m84324b(c38642xM84385L, i11, this.f83171h, this.f83170g));
        return c38642xM84385L;
    }

    public C37493n(InterfaceC40406b interfaceC40406b) {
        Map<Character, InterfaceC42224a> mapM84372f = m84372f(interfaceC40406b.mo84367a());
        this.f83166c = mapM84372f;
        BitSet bitSetM84371e = m84371e(mapM84372f.keySet());
        this.f83165b = bitSetM84371e;
        this.f83164a = m84373g(bitSetM84371e);
        this.f83167d = interfaceC40406b;
    }

    /* JADX INFO: renamed from: c */
    public static void m84369c(char c11, InterfaceC42224a interfaceC42224a, Map<Character, InterfaceC42224a> map) {
        if (map.put(Character.valueOf(c11), interfaceC42224a) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c11 + "'");
    }

    /* JADX INFO: renamed from: d */
    public static void m84370d(Iterable<InterfaceC42224a> iterable, Map<Character, InterfaceC42224a> map) {
        C37497r c37497r;
        for (InterfaceC42224a interfaceC42224a : iterable) {
            char cMo84422d = interfaceC42224a.mo84422d();
            char cMo84420b = interfaceC42224a.mo84420b();
            if (cMo84422d == cMo84420b) {
                InterfaceC42224a interfaceC42224a2 = map.get(Character.valueOf(cMo84422d));
                if (interfaceC42224a2 != null && interfaceC42224a2.mo84422d() == interfaceC42224a2.mo84420b()) {
                    if (interfaceC42224a2 instanceof C37497r) {
                        c37497r = (C37497r) interfaceC42224a2;
                    } else {
                        C37497r c37497r2 = new C37497r(cMo84422d);
                        c37497r2.m84424f(interfaceC42224a2);
                        c37497r = c37497r2;
                    }
                    c37497r.m84424f(interfaceC42224a);
                    map.put(Character.valueOf(cMo84422d), c37497r);
                } else {
                    m84369c(cMo84422d, interfaceC42224a, map);
                }
            } else {
                m84369c(cMo84422d, interfaceC42224a, map);
                m84369c(cMo84420b, interfaceC42224a, map);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m84379F(C37485f c37485f) {
        m84377D(c37485f);
    }

    @Override // jh0.InterfaceC40405a
    /* JADX INFO: renamed from: a */
    public void mo84387a(String str, AbstractC38637s abstractC38637s) {
        m84382I(str.trim());
        AbstractC38637s abstractC38637sM84402u = null;
        while (true) {
            abstractC38637sM84402u = m84402u(abstractC38637sM84402u);
            if (abstractC38637sM84402u != null) {
                abstractC38637s.m87354b(abstractC38637sM84402u);
            } else {
                m84376C(null);
                m84390i(abstractC38637s);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m84390i(AbstractC38637s abstractC38637s) {
        if (abstractC38637s.m87355c() == abstractC38637s.m87356d()) {
            return;
        }
        m84393l(abstractC38637s.m87355c(), abstractC38637s.m87356d());
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC38637s m84399r(InterfaceC42224a interfaceC42224a, char c11) {
        a aVarM84383J = m84383J(interfaceC42224a, c11);
        if (aVarM84383J == null) {
            return null;
        }
        int i11 = aVarM84383J.f83172a;
        int i12 = this.f83169f;
        int i13 = i12 + i11;
        this.f83169f = i13;
        C38642x c38642xM84386M = m84386M(this.f83168e, i12, i13);
        C37485f c37485f = new C37485f(c38642xM84386M, c11, aVarM84383J.f83174c, aVarM84383J.f83173b, this.f83170g);
        this.f83170g = c37485f;
        c37485f.f83117g = i11;
        c37485f.f83118h = i11;
        C37485f c37485f2 = c37485f.f83115e;
        if (c37485f2 != null) {
            c37485f2.f83116f = c37485f;
        }
        return c38642xM84386M;
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC38637s m84402u(AbstractC38637s abstractC38637s) {
        AbstractC38637s abstractC38637sM84406y;
        char cM84375B = m84375B();
        if (cM84375B == 0) {
            return null;
        }
        if (cM84375B != '\n') {
            if (cM84375B != '!') {
                if (cM84375B != '&') {
                    if (cM84375B != '<') {
                        if (cM84375B != '`') {
                            switch (cM84375B) {
                                case '[':
                                    abstractC38637sM84406y = m84407z();
                                    break;
                                case '\\':
                                    abstractC38637sM84406y = m84395n();
                                    break;
                                case ']':
                                    abstractC38637sM84406y = m84398q();
                                    break;
                                default:
                                    if (this.f83165b.get(cM84375B)) {
                                        abstractC38637sM84406y = m84399r(this.f83166c.get(Character.valueOf(cM84375B)), cM84375B);
                                    } else {
                                        abstractC38637sM84406y = m84374A();
                                    }
                                    break;
                            }
                        } else {
                            abstractC38637sM84406y = m84396o();
                        }
                    } else {
                        abstractC38637sM84406y = m84394m();
                        if (abstractC38637sM84406y == null) {
                            abstractC38637sM84406y = m84401t();
                        }
                    }
                } else {
                    abstractC38637sM84406y = m84400s();
                }
            } else {
                abstractC38637sM84406y = m84397p();
            }
        } else {
            abstractC38637sM84406y = m84406y(abstractC38637s);
        }
        if (abstractC38637sM84406y != null) {
            return abstractC38637sM84406y;
        }
        this.f83169f++;
        return m84385L(String.valueOf(cM84375B));
    }
}
