package org.jsoup.select;

import androidx.webkit.ProxyConfig;
import java.util.Iterator;
import java.util.regex.Pattern;
import nh0.C42841b;
import oh0.C43092b;
import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.C43183a;
import org.jsoup.nodes.C43186d;
import org.jsoup.nodes.C43188f;
import org.jsoup.nodes.C43191i;
import org.jsoup.nodes.C43192j;
import org.jsoup.nodes.C43193k;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.C43300f;

/* JADX INFO: renamed from: org.jsoup.select.c */
/* JADX INFO: compiled from: Evaluator.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC43307c {

    /* JADX INFO: renamed from: org.jsoup.select.c$a */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class a extends AbstractC43307c {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$a0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class a0 extends o {
        @Override // org.jsoup.select.AbstractC43307c.o
        /* JADX INFO: renamed from: c */
        public String mo95285c() {
            return "nth-last-child";
        }

        public a0(int i11, int i12) {
            super(i11, i12);
        }

        @Override // org.jsoup.select.AbstractC43307c.o
        /* JADX INFO: renamed from: b */
        public int mo95284b(Element element, Element element2) {
            return element2.mo94848H().m94890o0().size() - element2.m94900v0();
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$b */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class b extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95549a;

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element2.mo94962v(this.f95549a);
        }

        public String toString() {
            return String.format("[%s]", this.f95549a);
        }

        public b(String str) {
            this.f95549a = str;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$b0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static class b0 extends o {
        @Override // org.jsoup.select.AbstractC43307c.o
        /* JADX INFO: renamed from: c */
        public String mo95285c() {
            return "nth-last-of-type";
        }

        public b0(int i11, int i12) {
            super(i11, i12);
        }

        @Override // org.jsoup.select.AbstractC43307c.o
        /* JADX INFO: renamed from: b */
        public int mo95284b(Element element, Element element2) {
            Elements elementsM94890o0 = element2.mo94848H().m94890o0();
            int i11 = 0;
            for (int iM94900v0 = element2.m94900v0(); iM94900v0 < elementsM94890o0.size(); iM94900v0++) {
                if (elementsM94890o0.get(iM94900v0).m94868b1().equals(element2.m94868b1())) {
                    i11++;
                }
            }
            return i11;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$c */
    /* JADX INFO: compiled from: Evaluator.java */
    public static abstract class c extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95550a;

        /* JADX INFO: renamed from: b */
        public String f95551b;

        public c(String str, String str2) {
            this(str, str2, true);
        }

        public c(String str, String str2, boolean z11) {
            C42841b.m93955g(str);
            C42841b.m93955g(str2);
            this.f95550a = C43092b.m94680b(str);
            boolean z12 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z12 ? str2.substring(1, str2.length() - 1) : str2;
            this.f95551b = z11 ? C43092b.m94680b(str2) : C43092b.m94681c(str2, z12);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$c0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static class c0 extends o {
        @Override // org.jsoup.select.AbstractC43307c.o
        /* JADX INFO: renamed from: c */
        public String mo95285c() {
            return "nth-of-type";
        }

        public c0(int i11, int i12) {
            super(i11, i12);
        }

        @Override // org.jsoup.select.AbstractC43307c.o
        /* JADX INFO: renamed from: b */
        public int mo95284b(Element element, Element element2) {
            int i11 = 0;
            for (Element element3 : element2.mo94848H().m94890o0()) {
                if (element3.m94868b1().equals(element2.m94868b1())) {
                    i11++;
                }
                if (element3 == element2) {
                    break;
                }
            }
            return i11;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$d */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class d extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95552a;

        public String toString() {
            return String.format("[^%s]", this.f95552a);
        }

        public d(String str) {
            C42841b.m93955g(str);
            this.f95552a = C43092b.m94679a(str);
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            Iterator<C43183a> it = element2.mo94878h().m94942f().iterator();
            while (it.hasNext()) {
                if (C43092b.m94679a(it.next().getKey()).startsWith(this.f95552a)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$d0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class d0 extends AbstractC43307c {
        public String toString() {
            return ":only-child";
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            Element elementMo94848H = element2.mo94848H();
            if (elementMo94848H != null && !(elementMo94848H instanceof Document) && element2.m94867a1().isEmpty()) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$e */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class e extends c {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element2.mo94962v(this.f95550a) && this.f95551b.equalsIgnoreCase(element2.mo94960f(this.f95550a).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", this.f95550a, this.f95551b);
        }

        public e(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$e0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class e0 extends AbstractC43307c {
        public String toString() {
            return ":only-of-type";
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            Element elementMo94848H = element2.mo94848H();
            if (elementMo94848H != null && !(elementMo94848H instanceof Document)) {
                Iterator<Element> it = elementMo94848H.m94890o0().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    if (it.next().m94868b1().equals(element2.m94868b1())) {
                        i11++;
                    }
                }
                if (i11 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$f */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class f extends c {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element2.mo94962v(this.f95550a) && C43092b.m94679a(element2.mo94960f(this.f95550a)).contains(this.f95551b);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.f95550a, this.f95551b);
        }

        public f(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$f0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class f0 extends AbstractC43307c {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.m94888m0(0);
            }
            return element2 == element;
        }

        public String toString() {
            return ":root";
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$g */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class g extends c {
        public g(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element2.mo94962v(this.f95550a) && C43092b.m94679a(element2.mo94960f(this.f95550a)).endsWith(this.f95551b);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.f95550a, this.f95551b);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$g0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class g0 extends AbstractC43307c {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            if (element2 instanceof C43191i) {
                return true;
            }
            for (C43192j c43192j : element2.m94877g1()) {
                C43191i c43191i = new C43191i(C43300f.m95197n(element2.m94870c1()), element2.mo94880i(), element2.mo94878h());
                c43192j.m94979Q(c43191i);
                c43191i.m94875f0(c43192j);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$h */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class h extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95553a;

        /* JADX INFO: renamed from: b */
        public Pattern f95554b;

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element2.mo94962v(this.f95553a) && this.f95554b.matcher(element2.mo94960f(this.f95553a)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", this.f95553a, this.f95554b.toString());
        }

        public h(String str, Pattern pattern) {
            this.f95553a = C43092b.m94680b(str);
            this.f95554b = pattern;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$h0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class h0 extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public Pattern f95555a;

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return this.f95555a.matcher(element2.m94874e1()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.f95555a);
        }

        public h0(Pattern pattern) {
            this.f95555a = pattern;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$i */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class i extends c {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return !this.f95551b.equalsIgnoreCase(element2.mo94960f(this.f95550a));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.f95550a, this.f95551b);
        }

        public i(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$i0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class i0 extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public Pattern f95556a;

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return this.f95556a.matcher(element2.m94854M0()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.f95556a);
        }

        public i0(Pattern pattern) {
            this.f95556a = pattern;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$j */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class j extends c {
        public j(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element2.mo94962v(this.f95550a) && C43092b.m94679a(element2.mo94960f(this.f95550a)).startsWith(this.f95551b);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.f95550a, this.f95551b);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$j0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class j0 extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95557a;

        public String toString() {
            return String.format("%s", this.f95557a);
        }

        public j0(String str) {
            this.f95557a = str;
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element2.m94853L0().equals(this.f95557a);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$k */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class k extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95558a;

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element2.m94905z0(this.f95558a);
        }

        public String toString() {
            return String.format(".%s", this.f95558a);
        }

        public k(String str) {
            this.f95558a = str;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$k0 */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class k0 extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95559a;

        public String toString() {
            return String.format("%s", this.f95559a);
        }

        public k0(String str) {
            this.f95559a = str;
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element2.m94853L0().endsWith(this.f95559a);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$l */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class l extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95560a;

        public String toString() {
            return String.format(":containsData(%s)", this.f95560a);
        }

        public l(String str) {
            this.f95560a = C43092b.m94679a(str);
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return C43092b.m94679a(element2.m94898t0()).contains(this.f95560a);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$m */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class m extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95561a;

        public String toString() {
            return String.format(":containsOwn(%s)", this.f95561a);
        }

        public m(String str) {
            this.f95561a = C43092b.m94679a(str);
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return C43092b.m94679a(element2.m94854M0()).contains(this.f95561a);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$n */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class n extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95562a;

        public String toString() {
            return String.format(":contains(%s)", this.f95562a);
        }

        public n(String str) {
            this.f95562a = C43092b.m94679a(str);
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return C43092b.m94679a(element2.m94874e1()).contains(this.f95562a);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$o */
    /* JADX INFO: compiled from: Evaluator.java */
    public static abstract class o extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public final int f95563a;

        /* JADX INFO: renamed from: b */
        public final int f95564b;

        /* JADX INFO: renamed from: b */
        public abstract int mo95284b(Element element, Element element2);

        /* JADX INFO: renamed from: c */
        public abstract String mo95285c();

        public String toString() {
            if (this.f95563a == 0) {
                return String.format(":%s(%d)", mo95285c(), Integer.valueOf(this.f95564b));
            }
            return this.f95564b == 0 ? String.format(":%s(%dn)", mo95285c(), Integer.valueOf(this.f95563a)) : String.format(":%s(%dn%+d)", mo95285c(), Integer.valueOf(this.f95563a), Integer.valueOf(this.f95564b));
        }

        public o(int i11, int i12) {
            this.f95563a = i11;
            this.f95564b = i12;
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            Element elementMo94848H = element2.mo94848H();
            if (elementMo94848H != null && !(elementMo94848H instanceof Document)) {
                int iMo95284b = mo95284b(element, element2);
                int i11 = this.f95563a;
                if (i11 == 0) {
                    if (iMo95284b != this.f95564b) {
                        return false;
                    }
                    return true;
                }
                int i12 = this.f95564b;
                if ((iMo95284b - i12) * i11 >= 0 && (iMo95284b - i12) % i11 == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$p */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class p extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public String f95565a;

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return this.f95565a.equals(element2.m94845E0());
        }

        public String toString() {
            return String.format("#%s", this.f95565a);
        }

        public p(String str) {
            this.f95565a = str;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$q */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class q extends r {
        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f95566a));
        }

        public q(int i11) {
            super(i11);
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            if (element2.m94900v0() == this.f95566a) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$s */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class s extends r {
        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f95566a));
        }

        public s(int i11) {
            super(i11);
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            if (element2.m94900v0() > this.f95566a) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$t */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class t extends r {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element != element2 && element2.m94900v0() < this.f95566a;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f95566a));
        }

        public t(int i11) {
            super(i11);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$u */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class u extends AbstractC43307c {
        public String toString() {
            return ":empty";
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            for (AbstractC43189g abstractC43189g : element2.m94994n()) {
                if (!(abstractC43189g instanceof C43186d) && !(abstractC43189g instanceof C43193k) && !(abstractC43189g instanceof C43188f)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$v */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class v extends AbstractC43307c {
        public String toString() {
            return ":first-child";
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            Element elementMo94848H = element2.mo94848H();
            if (elementMo94848H != null && !(elementMo94848H instanceof Document) && element2.m94900v0() == 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$w */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class w extends c0 {
        public w() {
            super(0, 1);
        }

        @Override // org.jsoup.select.AbstractC43307c.o
        public String toString() {
            return ":first-of-type";
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$x */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class x extends AbstractC43307c {
        public String toString() {
            return ":last-child";
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            Element elementMo94848H = element2.mo94848H();
            if (elementMo94848H != null && !(elementMo94848H instanceof Document) && element2.m94900v0() == elementMo94848H.m94890o0().size() - 1) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$y */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class y extends b0 {
        public y() {
            super(0, 1);
        }

        @Override // org.jsoup.select.AbstractC43307c.o
        public String toString() {
            return ":last-of-type";
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.c$z */
    /* JADX INFO: compiled from: Evaluator.java */
    public static final class z extends o {
        @Override // org.jsoup.select.AbstractC43307c.o
        /* JADX INFO: renamed from: c */
        public String mo95285c() {
            return "nth-child";
        }

        public z(int i11, int i12) {
            super(i11, i12);
        }

        @Override // org.jsoup.select.AbstractC43307c.o
        /* JADX INFO: renamed from: b */
        public int mo95284b(Element element, Element element2) {
            return element2.m94900v0() + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo95282a(Element element, Element element2);

    /* JADX INFO: renamed from: org.jsoup.select.c$r */
    /* JADX INFO: compiled from: Evaluator.java */
    public static abstract class r extends AbstractC43307c {

        /* JADX INFO: renamed from: a */
        public int f95566a;

        public r(int i11) {
            this.f95566a = i11;
        }
    }
}
