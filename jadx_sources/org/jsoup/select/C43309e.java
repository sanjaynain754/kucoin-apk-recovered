package org.jsoup.select;

import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nh0.C42841b;
import oh0.C43092b;
import oh0.C43093c;
import org.jsoup.parser.C43301g;

/* JADX INFO: renamed from: org.jsoup.select.e */
/* JADX INFO: compiled from: QueryParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43309e {

    /* JADX INFO: renamed from: d */
    public static final String[] f95567d = {",", ">", "+", "~", C33627eb.f69716f};

    /* JADX INFO: renamed from: e */
    public static final String[] f95568e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: f */
    public static final Pattern f95569f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: g */
    public static final Pattern f95570g = Pattern.compile("([+-])?(\\d+)");

    /* JADX INFO: renamed from: a */
    public C43301g f95571a;

    /* JADX INFO: renamed from: b */
    public String f95572b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC43307c> f95573c = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x0059  */
    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0072  */
    /* JADX WARN: Code duplicated, block: B:19:0x0083  */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:22:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x009e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00c0, please report this as an issue */
    /* JADX INFO: renamed from: f */
    public final void m95296f(char c11) {
        AbstractC43307c aVar;
        AbstractC43307c abstractC43307c;
        boolean z11;
        AbstractC43306b.b bVar;
        AbstractC43307c abstractC43307c2;
        AbstractC43306b.a aVar2;
        AbstractC43306b.a aVar3;
        AbstractC43306b.a aVar4;
        AbstractC43307c abstractC43307c3;
        AbstractC43306b.a aVar5;
        this.f95571a.m95220i();
        AbstractC43307c abstractC43307cM95290t = m95290t(m95298h());
        if (this.f95573c.size() == 1) {
            aVar = this.f95573c.get(0);
            if ((aVar instanceof AbstractC43306b.b) && c11 != ',') {
                abstractC43307c = aVar;
                aVar = ((AbstractC43306b.b) aVar).m95280c();
                z11 = true;
            }
            this.f95573c.clear();
            if (c11 == '>') {
                aVar5 = new AbstractC43306b.a(abstractC43307cM95290t, new AbstractC43310f.b(aVar));
            } else if (c11 == ' ') {
                aVar4 = new AbstractC43306b.a(abstractC43307cM95290t, new AbstractC43310f.e(aVar));
            } else if (c11 == '+') {
                aVar3 = new AbstractC43306b.a(abstractC43307cM95290t, new AbstractC43310f.c(aVar));
            } else if (c11 == '~') {
                aVar2 = new AbstractC43306b.a(abstractC43307cM95290t, new AbstractC43310f.f(aVar));
            } else {
                if (c11 == ',') {
                    throw new Selector.SelectorParseException("Unknown combinator: " + c11, new Object[0]);
                }
                if (aVar instanceof AbstractC43306b.b) {
                    AbstractC43306b.b bVar2 = (AbstractC43306b.b) aVar;
                    bVar2.m95283e(abstractC43307cM95290t);
                    abstractC43307c2 = bVar2;
                } else {
                    bVar = new AbstractC43306b.b();
                    bVar.m95283e(aVar);
                    bVar.m95283e(abstractC43307cM95290t);
                }
            }
            if (z11) {
                abstractC43307c2 = bVar;
                abstractC43307c2 = aVar2;
                abstractC43307c2 = aVar3;
                abstractC43307c2 = aVar4;
                abstractC43307c2 = aVar5;
                ((AbstractC43306b.b) abstractC43307c).m95279b(abstractC43307c2);
                abstractC43307c3 = abstractC43307c;
            } else {
                abstractC43307c2 = bVar;
                abstractC43307c2 = aVar2;
                abstractC43307c2 = aVar3;
                abstractC43307c2 = aVar4;
                abstractC43307c2 = aVar5;
                abstractC43307c3 = abstractC43307c2;
            }
            this.f95573c.add(abstractC43307c3);
        }
        aVar = new AbstractC43306b.a(this.f95573c);
        abstractC43307c = aVar;
        z11 = false;
        this.f95573c.clear();
        if (c11 == '>') {
            aVar5 = new AbstractC43306b.a(abstractC43307cM95290t, new AbstractC43310f.b(aVar));
        } else if (c11 == ' ') {
            aVar4 = new AbstractC43306b.a(abstractC43307cM95290t, new AbstractC43310f.e(aVar));
        } else if (c11 == '+') {
            aVar3 = new AbstractC43306b.a(abstractC43307cM95290t, new AbstractC43310f.c(aVar));
        } else if (c11 == '~') {
            aVar2 = new AbstractC43306b.a(abstractC43307cM95290t, new AbstractC43310f.f(aVar));
        } else {
            if (c11 == ',') {
                throw new Selector.SelectorParseException("Unknown combinator: " + c11, new Object[0]);
            }
            if (aVar instanceof AbstractC43306b.b) {
                AbstractC43306b.b bVar3 = (AbstractC43306b.b) aVar;
                bVar3.m95283e(abstractC43307cM95290t);
                abstractC43307c2 = bVar3;
            } else {
                bVar = new AbstractC43306b.b();
                bVar.m95283e(aVar);
                bVar.m95283e(abstractC43307cM95290t);
            }
        }
        if (z11) {
            abstractC43307c2 = bVar;
            abstractC43307c2 = aVar2;
            abstractC43307c2 = aVar3;
            abstractC43307c2 = aVar4;
            abstractC43307c2 = aVar5;
            ((AbstractC43306b.b) abstractC43307c).m95279b(abstractC43307c2);
            abstractC43307c3 = abstractC43307c;
        } else {
            abstractC43307c2 = bVar;
            abstractC43307c2 = aVar2;
            abstractC43307c2 = aVar3;
            abstractC43307c2 = aVar4;
            abstractC43307c2 = aVar5;
            abstractC43307c3 = abstractC43307c2;
        }
        this.f95573c.add(abstractC43307c3);
    }

    /* JADX INFO: renamed from: t */
    public static AbstractC43307c m95290t(String str) {
        try {
            return new C43309e(str).m95309s();
        } catch (IllegalArgumentException e11) {
            throw new Selector.SelectorParseException(e11.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m95291a() {
        this.f95573c.add(new AbstractC43307c.a());
    }

    /* JADX INFO: renamed from: b */
    public final void m95292b() {
        C43301g c43301g = new C43301g(this.f95571a.m95212a('[', ']'));
        String strM95219h = c43301g.m95219h(f95568e);
        C42841b.m93955g(strM95219h);
        c43301g.m95220i();
        if (c43301g.m95221j()) {
            if (strM95219h.startsWith("^")) {
                this.f95573c.add(new AbstractC43307c.d(strM95219h.substring(1)));
                return;
            } else {
                this.f95573c.add(new AbstractC43307c.b(strM95219h));
                return;
            }
        }
        if (c43301g.m95222k("=")) {
            this.f95573c.add(new AbstractC43307c.e(strM95219h, c43301g.m95228q()));
            return;
        }
        if (c43301g.m95222k("!=")) {
            this.f95573c.add(new AbstractC43307c.i(strM95219h, c43301g.m95228q()));
            return;
        }
        if (c43301g.m95222k("^=")) {
            this.f95573c.add(new AbstractC43307c.j(strM95219h, c43301g.m95228q()));
            return;
        }
        if (c43301g.m95222k("$=")) {
            this.f95573c.add(new AbstractC43307c.g(strM95219h, c43301g.m95228q()));
        } else if (c43301g.m95222k("*=")) {
            this.f95573c.add(new AbstractC43307c.f(strM95219h, c43301g.m95228q()));
        } else {
            if (!c43301g.m95222k("~=")) {
                throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.f95572b, c43301g.m95228q());
            }
            this.f95573c.add(new AbstractC43307c.h(strM95219h, Pattern.compile(c43301g.m95228q())));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m95293c() {
        String strM95216e = this.f95571a.m95216e();
        C42841b.m93955g(strM95216e);
        this.f95573c.add(new AbstractC43307c.k(strM95216e.trim()));
    }

    /* JADX INFO: renamed from: d */
    public final void m95294d() {
        String strM95216e = this.f95571a.m95216e();
        C42841b.m93955g(strM95216e);
        this.f95573c.add(new AbstractC43307c.p(strM95216e));
    }

    /* JADX INFO: renamed from: e */
    public final void m95295e() {
        String strM94680b = C43092b.m94680b(this.f95571a.m95217f());
        C42841b.m93955g(strM94680b);
        if (strM94680b.startsWith("*|")) {
            this.f95573c.add(new AbstractC43306b.b(new AbstractC43307c.j0(strM94680b), new AbstractC43307c.k0(strM94680b.replace("*|", C33844oi.f71346o))));
            return;
        }
        if (strM94680b.contains("|")) {
            strM94680b = strM94680b.replace("|", C33844oi.f71346o);
        }
        this.f95573c.add(new AbstractC43307c.j0(strM94680b));
    }

    /* JADX INFO: renamed from: g */
    public final int m95297g() {
        String strTrim = this.f95571a.m95213b(")").trim();
        C42841b.m93952d(C43093c.m94689h(strTrim), "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    /* JADX INFO: renamed from: i */
    public final void m95299i(boolean z11) {
        this.f95571a.m95215d(z11 ? ":containsOwn" : ":contains");
        String strM95211s = C43301g.m95211s(this.f95571a.m95212a('(', ')'));
        C42841b.m93956h(strM95211s, ":contains(text) query must not be empty");
        if (z11) {
            this.f95573c.add(new AbstractC43307c.m(strM95211s));
        } else {
            this.f95573c.add(new AbstractC43307c.n(strM95211s));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m95300j() {
        this.f95571a.m95215d(":containsData");
        String strM95211s = C43301g.m95211s(this.f95571a.m95212a('(', ')'));
        C42841b.m93956h(strM95211s, ":containsData(text) query must not be empty");
        this.f95573c.add(new AbstractC43307c.l(strM95211s));
    }

    /* JADX INFO: renamed from: k */
    public final void m95301k(boolean z11, boolean z12) {
        String strM94680b = C43092b.m94680b(this.f95571a.m95213b(")"));
        Matcher matcher = f95569f.matcher(strM94680b);
        Matcher matcher2 = f95570g.matcher(strM94680b);
        int i11 = 2;
        int i12 = 1;
        if (!"odd".equals(strM94680b)) {
            if ("even".equals(strM94680b)) {
                i12 = 0;
            } else if (matcher.matches()) {
                int i13 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i12 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i11 = i13;
            } else {
                if (!matcher2.matches()) {
                    throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", strM94680b);
                }
                i12 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i11 = 0;
            }
        }
        if (z12) {
            if (z11) {
                this.f95573c.add(new AbstractC43307c.b0(i11, i12));
                return;
            } else {
                this.f95573c.add(new AbstractC43307c.c0(i11, i12));
                return;
            }
        }
        if (z11) {
            this.f95573c.add(new AbstractC43307c.a0(i11, i12));
        } else {
            this.f95573c.add(new AbstractC43307c.z(i11, i12));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m95302l() {
        if (this.f95571a.m95222k(RunnableC33958ua.f72251f)) {
            m95294d();
            return;
        }
        if (this.f95571a.m95222k(C33978va.f72339h)) {
            m95293c();
            return;
        }
        if (this.f95571a.m95227p() || this.f95571a.m95223l("*|")) {
            m95295e();
            return;
        }
        if (this.f95571a.m95223l("[")) {
            m95292b();
            return;
        }
        if (this.f95571a.m95222k(ProxyConfig.MATCH_ALL_SCHEMES)) {
            m95291a();
            return;
        }
        if (this.f95571a.m95222k(":lt(")) {
            m95306p();
            return;
        }
        if (this.f95571a.m95222k(":gt(")) {
            m95305o();
            return;
        }
        if (this.f95571a.m95222k(":eq(")) {
            m95304n();
            return;
        }
        if (this.f95571a.m95223l(":has(")) {
            m95303m();
            return;
        }
        if (this.f95571a.m95223l(":contains(")) {
            m95299i(false);
            return;
        }
        if (this.f95571a.m95223l(":containsOwn(")) {
            m95299i(true);
            return;
        }
        if (this.f95571a.m95223l(":containsData(")) {
            m95300j();
            return;
        }
        if (this.f95571a.m95223l(":matches(")) {
            m95307q(false);
            return;
        }
        if (this.f95571a.m95223l(":matchesOwn(")) {
            m95307q(true);
            return;
        }
        if (this.f95571a.m95223l(":not(")) {
            m95308r();
            return;
        }
        if (this.f95571a.m95222k(":nth-child(")) {
            m95301k(false, false);
            return;
        }
        if (this.f95571a.m95222k(":nth-last-child(")) {
            m95301k(true, false);
            return;
        }
        if (this.f95571a.m95222k(":nth-of-type(")) {
            m95301k(false, true);
            return;
        }
        if (this.f95571a.m95222k(":nth-last-of-type(")) {
            m95301k(true, true);
            return;
        }
        if (this.f95571a.m95222k(":first-child")) {
            this.f95573c.add(new AbstractC43307c.v());
            return;
        }
        if (this.f95571a.m95222k(":last-child")) {
            this.f95573c.add(new AbstractC43307c.x());
            return;
        }
        if (this.f95571a.m95222k(":first-of-type")) {
            this.f95573c.add(new AbstractC43307c.w());
            return;
        }
        if (this.f95571a.m95222k(":last-of-type")) {
            this.f95573c.add(new AbstractC43307c.y());
            return;
        }
        if (this.f95571a.m95222k(":only-child")) {
            this.f95573c.add(new AbstractC43307c.d0());
            return;
        }
        if (this.f95571a.m95222k(":only-of-type")) {
            this.f95573c.add(new AbstractC43307c.e0());
            return;
        }
        if (this.f95571a.m95222k(":empty")) {
            this.f95573c.add(new AbstractC43307c.u());
        } else if (this.f95571a.m95222k(":root")) {
            this.f95573c.add(new AbstractC43307c.f0());
        } else {
            if (!this.f95571a.m95222k(":matchText")) {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.f95572b, this.f95571a.m95228q());
            }
            this.f95573c.add(new AbstractC43307c.g0());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m95303m() {
        this.f95571a.m95215d(":has");
        String strM95212a = this.f95571a.m95212a('(', ')');
        C42841b.m93956h(strM95212a, ":has(el) subselect must not be empty");
        this.f95573c.add(new AbstractC43310f.a(m95290t(strM95212a)));
    }

    /* JADX INFO: renamed from: n */
    public final void m95304n() {
        this.f95573c.add(new AbstractC43307c.q(m95297g()));
    }

    /* JADX INFO: renamed from: o */
    public final void m95305o() {
        this.f95573c.add(new AbstractC43307c.s(m95297g()));
    }

    /* JADX INFO: renamed from: p */
    public final void m95306p() {
        this.f95573c.add(new AbstractC43307c.t(m95297g()));
    }

    /* JADX INFO: renamed from: q */
    public final void m95307q(boolean z11) {
        this.f95571a.m95215d(z11 ? ":matchesOwn" : ":matches");
        String strM95212a = this.f95571a.m95212a('(', ')');
        C42841b.m93956h(strM95212a, ":matches(regex) query must not be empty");
        if (z11) {
            this.f95573c.add(new AbstractC43307c.i0(Pattern.compile(strM95212a)));
        } else {
            this.f95573c.add(new AbstractC43307c.h0(Pattern.compile(strM95212a)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m95308r() {
        this.f95571a.m95215d(":not");
        String strM95212a = this.f95571a.m95212a('(', ')');
        C42841b.m93956h(strM95212a, ":not(selector) subselect must not be empty");
        this.f95573c.add(new AbstractC43310f.d(m95290t(strM95212a)));
    }

    /* JADX INFO: renamed from: s */
    public AbstractC43307c m95309s() {
        this.f95571a.m95220i();
        if (this.f95571a.m95225n(f95567d)) {
            this.f95573c.add(new AbstractC43310f.g());
            m95296f(this.f95571a.m95214c());
        } else {
            m95302l();
        }
        while (!this.f95571a.m95221j()) {
            boolean zM95220i = this.f95571a.m95220i();
            if (this.f95571a.m95225n(f95567d)) {
                m95296f(this.f95571a.m95214c());
            } else if (zM95220i) {
                m95296f(' ');
            } else {
                m95302l();
            }
        }
        return this.f95573c.size() == 1 ? this.f95573c.get(0) : new AbstractC43306b.a(this.f95573c);
    }

    public C43309e(String str) {
        C42841b.m93955g(str);
        String strTrim = str.trim();
        this.f95572b = strTrim;
        this.f95571a = new C43301g(strTrim);
    }

    /* JADX INFO: renamed from: h */
    public final String m95298h() {
        StringBuilder sbM94683b = C43093c.m94683b();
        while (!this.f95571a.m95221j()) {
            if (this.f95571a.m95223l("(")) {
                sbM94683b.append("(");
                sbM94683b.append(this.f95571a.m95212a('(', ')'));
                sbM94683b.append(")");
            } else if (this.f95571a.m95223l("[")) {
                sbM94683b.append("[");
                sbM94683b.append(this.f95571a.m95212a('[', ']'));
                sbM94683b.append("]");
            } else {
                if (this.f95571a.m95225n(f95567d)) {
                    break;
                }
                sbM94683b.append(this.f95571a.m95214c());
            }
        }
        return C43093c.m94694m(sbM94683b);
    }
}
