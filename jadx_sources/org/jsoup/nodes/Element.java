package org.jsoup.nodes;

import com.tencent.bugly.proguard.C33627eb;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import nh0.C42841b;
import oh0.C43093c;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.parser.C43300f;
import org.jsoup.select.AbstractC43307c;
import org.jsoup.select.C43305a;
import org.jsoup.select.C43308d;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import p852kotlin.text.Typography;
import qh0.InterfaceC43743a;

/* JADX INFO: loaded from: classes61.dex */
public class Element extends AbstractC43189g {

    /* JADX INFO: renamed from: h */
    public static final List<AbstractC43189g> f95360h = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: i */
    public static final Pattern f95361i = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: j */
    public static final String f95362j = C43184b.m94925B("baseUri");

    /* JADX INFO: renamed from: d */
    public C43300f f95363d;

    /* JADX INFO: renamed from: e */
    public WeakReference<List<Element>> f95364e;

    /* JADX INFO: renamed from: f */
    public List<AbstractC43189g> f95365f;

    /* JADX INFO: renamed from: g */
    public C43184b f95366g;

    public static final class NodeList extends ChangeNotifyingArrayList<AbstractC43189g> {
        private final Element owner;

        @Override // org.jsoup.helper.ChangeNotifyingArrayList
        public void onContentsChanged() {
            this.owner.mo94840B();
        }

        public NodeList(Element element, int i11) {
            super(i11);
            this.owner = element;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.nodes.Element$a */
    public class C43181a implements InterfaceC43743a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StringBuilder f95367a;

        public C43181a(StringBuilder sb2) {
            this.f95367a = sb2;
        }

        @Override // qh0.InterfaceC43743a
        /* JADX INFO: renamed from: a */
        public void mo94906a(AbstractC43189g abstractC43189g, int i11) {
            if ((abstractC43189g instanceof Element) && ((Element) abstractC43189g).m94849H0() && (abstractC43189g.m94999z() instanceof C43192j) && !C43192j.m95002f0(this.f95367a)) {
                this.f95367a.append(' ');
            }
        }

        @Override // qh0.InterfaceC43743a
        /* JADX INFO: renamed from: b */
        public void mo94907b(AbstractC43189g abstractC43189g, int i11) {
            if (abstractC43189g instanceof C43192j) {
                Element.m94837h0(this.f95367a, (C43192j) abstractC43189g);
            } else if (abstractC43189g instanceof Element) {
                Element element = (Element) abstractC43189g;
                if (this.f95367a.length() > 0) {
                    if ((element.m94849H0() || element.f95363d.m95201c().equals("br")) && !C43192j.m95002f0(this.f95367a)) {
                        this.f95367a.append(' ');
                    }
                }
            }
        }
    }

    public Element(C43300f c43300f, String str, C43184b c43184b) {
        C42841b.m93957i(c43300f);
        this.f95365f = f95360h;
        this.f95366g = c43184b;
        this.f95363d = c43300f;
        if (str != null) {
            m94980S(str);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static boolean m94832S0(AbstractC43189g abstractC43189g) {
        if (abstractC43189g instanceof Element) {
            Element elementMo94848H = (Element) abstractC43189g;
            int i11 = 0;
            while (!elementMo94848H.f95363d.m95209k()) {
                elementMo94848H = elementMo94848H.mo94848H();
                i11++;
                if (i11 >= 6 || elementMo94848H == null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: X0 */
    public static String m94833X0(Element element, String str) {
        while (element != null) {
            if (element.mo94901w() && element.f95366g.m94948n(str)) {
                return element.f95366g.m94946l(str);
            }
            element = element.mo94848H();
        }
        return "";
    }

    /* JADX INFO: renamed from: i0 */
    public static void m94838i0(Element element, StringBuilder sb2) {
        if (!element.f95363d.m95201c().equals("br") || C43192j.m95002f0(sb2)) {
            return;
        }
        sb2.append(C33627eb.f69716f);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: A */
    public String mo94801A() {
        return this.f95363d.m95201c();
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m94839A0() {
        for (AbstractC43189g abstractC43189g : this.f95365f) {
            if (abstractC43189g instanceof C43192j) {
                if (!((C43192j) abstractC43189g).m95004e0()) {
                    return true;
                }
            } else if ((abstractC43189g instanceof Element) && ((Element) abstractC43189g).m94839A0()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public <T extends Appendable> T m94841B0(T t11) {
        int size = this.f95365f.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f95365f.get(i11).m94969D(t11);
        }
        return t11;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: F */
    public void mo94846F(Appendable appendable, int i11, Document.OutputSettings outputSettings) throws IOException {
        if (this.f95365f.isEmpty() && this.f95363d.m95207i()) {
            return;
        }
        if (outputSettings.m94828j() && !this.f95365f.isEmpty() && (this.f95363d.m95200b() || (outputSettings.m94826h() && (this.f95365f.size() > 1 || (this.f95365f.size() == 1 && !(this.f95365f.get(0) instanceof C43192j)))))) {
            m94998y(appendable, i11, outputSettings);
        }
        appendable.append("</").append(m94870c1()).append(Typography.greater);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m94849H0() {
        return this.f95363d.m95202d();
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m94850I0(Document.OutputSettings outputSettings) {
        if (this.f95363d.m95200b()) {
            return true;
        }
        return (mo94848H() != null && mo94848H().m94868b1().m95200b()) || outputSettings.m94826h();
    }

    /* JADX INFO: renamed from: K0 */
    public Element m94852K0() {
        if (this.f95385b == null) {
            return null;
        }
        List<Element> listM94889n0 = mo94848H().m94889n0();
        int iM94831F0 = m94831F0(this, listM94889n0) + 1;
        if (listM94889n0.size() > iM94831F0) {
            return listM94889n0.get(iM94831F0);
        }
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public String m94853L0() {
        return this.f95363d.m95208j();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m94855N0(StringBuilder sb2) {
        for (AbstractC43189g abstractC43189g : this.f95365f) {
            if (abstractC43189g instanceof C43192j) {
                m94837h0(sb2, (C43192j) abstractC43189g);
            } else if (abstractC43189g instanceof Element) {
                m94838i0((Element) abstractC43189g, sb2);
            }
        }
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final Element mo94848H() {
        return (Element) this.f95385b;
    }

    /* JADX INFO: renamed from: P0 */
    public Elements m94857P0() {
        Elements elements = new Elements();
        m94836b0(this, elements);
        return elements;
    }

    /* JADX INFO: renamed from: T0 */
    public Element m94861T0() {
        List<Element> listM94889n0;
        int iM94831F0;
        if (this.f95385b != null && (iM94831F0 = m94831F0(this, (listM94889n0 = mo94848H().m94889n0()))) > 0) {
            return listM94889n0.get(iM94831F0 - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public Elements m94867a1() {
        if (this.f95385b == null) {
            return new Elements(0);
        }
        List<Element> listM94889n0 = mo94848H().m94889n0();
        Elements elements = new Elements(listM94889n0.size() - 1);
        for (Element element : listM94889n0) {
            if (element != this) {
                elements.add(element);
            }
        }
        return elements;
    }

    /* JADX INFO: renamed from: b1 */
    public C43300f m94868b1() {
        return this.f95363d;
    }

    /* JADX INFO: renamed from: c1 */
    public String m94870c1() {
        return this.f95363d.m95201c();
    }

    /* JADX INFO: renamed from: d1 */
    public Element m94872d1(String str) {
        C42841b.m93956h(str, "Tag name must not be empty.");
        this.f95363d = C43300f.m95198o(str, C43190h.m95001b(this).m95195f());
        return this;
    }

    /* JADX INFO: renamed from: g0 */
    public Element m94876g0(String str) {
        Element element = new Element(C43300f.m95198o(str, C43190h.m95001b(this).m95195f()), mo94880i());
        m94875f0(element);
        return element;
    }

    /* JADX INFO: renamed from: g1 */
    public List<C43192j> m94877g1() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC43189g abstractC43189g : this.f95365f) {
            if (abstractC43189g instanceof C43192j) {
                arrayList.add((C43192j) abstractC43189g);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: i */
    public String mo94880i() {
        return m94833X0(this, f95362j);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: m */
    public int mo94887m() {
        return this.f95365f.size();
    }

    /* JADX INFO: renamed from: n0 */
    public final List<Element> m94889n0() {
        List<Element> list;
        WeakReference<List<Element>> weakReference = this.f95364e;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f95365f.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC43189g abstractC43189g = this.f95365f.get(i11);
            if (abstractC43189g instanceof Element) {
                arrayList.add((Element) abstractC43189g);
            }
        }
        this.f95364e = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: o0 */
    public Elements m94890o0() {
        return new Elements(m94889n0());
    }

    /* JADX INFO: renamed from: p0 */
    public String m94891p0() {
        return mo94960f("class").trim();
    }

    /* JADX INFO: renamed from: q0 */
    public Set<String> m94893q0() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(f95361i.split(m94891p0())));
        linkedHashSet.remove("");
        return linkedHashSet;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: t */
    public List<AbstractC43189g> mo94897t() {
        if (this.f95365f == f95360h) {
            this.f95365f = new NodeList(this, 4);
        }
        return this.f95365f;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: w */
    public boolean mo94901w() {
        return this.f95366g != null;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public Element mo94896s() {
        this.f95365f.clear();
        return this;
    }

    /* JADX INFO: renamed from: x0 */
    public Elements m94903x0() {
        return C43305a.m95276a(new AbstractC43307c.a(), this);
    }

    /* JADX INFO: renamed from: F0 */
    public static <E extends Element> int m94831F0(Element element, List<E> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11) == element) {
                return i11;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m94836b0(Element element, Elements elements) {
        Element elementMo94848H = element.mo94848H();
        if (elementMo94848H != null && !elementMo94848H.m94870c1().equals("#root")) {
            elements.add(elementMo94848H);
            m94836b0(elementMo94848H, elements);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m94837h0(StringBuilder sb2, C43192j c43192j) {
        String strM95003d0 = c43192j.m95003d0();
        if (!m94832S0(c43192j.f95385b) && !(c43192j instanceof C43185c)) {
            C43093c.m94682a(sb2, strM95003d0, C43192j.m95002f0(sb2));
        } else {
            sb2.append(strM95003d0);
        }
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: B */
    public void mo94840B() {
        super.mo94840B();
        this.f95364e = null;
    }

    /* JADX INFO: renamed from: C0 */
    public String m94842C0() {
        StringBuilder sbM94683b = C43093c.m94683b();
        m94841B0(sbM94683b);
        String strM94694m = C43093c.m94694m(sbM94683b);
        if (C43190h.m95000a(this).m94828j()) {
            return strM94694m.trim();
        }
        return strM94694m;
    }

    /* JADX INFO: renamed from: D0 */
    public Element m94843D0(String str) {
        mo94896s();
        m94873e0(str);
        return this;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: E */
    public void mo94844E(Appendable appendable, int i11, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.m94828j() && m94850I0(outputSettings) && !m94851J0(outputSettings) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            m94998y(appendable, i11, outputSettings);
        }
        appendable.append(Typography.less).append(m94870c1());
        C43184b c43184b = this.f95366g;
        if (c43184b != null) {
            c43184b.m94951t(appendable, outputSettings);
        }
        if (this.f95365f.isEmpty() && this.f95363d.m95207i()) {
            if (outputSettings.m94829k() == Document.OutputSettings.Syntax.html && this.f95363d.m95203e()) {
                appendable.append(Typography.greater);
                return;
            } else {
                appendable.append(" />");
                return;
            }
        }
        appendable.append(Typography.greater);
    }

    /* JADX INFO: renamed from: E0 */
    public String m94845E0() {
        if (mo94901w()) {
            return this.f95366g.m94947m("id");
        }
        return "";
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m94847G0(AbstractC43307c abstractC43307c) {
        return abstractC43307c.mo95282a(mo94859R(), this);
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m94851J0(Document.OutputSettings outputSettings) {
        if (m94868b1().m95205g() && !m94868b1().m95203e() && mo94848H().m94849H0() && m94972J() != null && !outputSettings.m94826h()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: M0 */
    public String m94854M0() {
        StringBuilder sbM94683b = C43093c.m94683b();
        m94855N0(sbM94683b);
        return C43093c.m94694m(sbM94683b).trim();
    }

    /* JADX INFO: renamed from: Q0 */
    public Element m94858Q0(String str) {
        C42841b.m93957i(str);
        m94987b(0, (AbstractC43189g[]) C43190h.m95001b(this).m95192c(str, this, mo94880i()).toArray(new AbstractC43189g[0]));
        return this;
    }

    /* JADX INFO: renamed from: R0 */
    public Element m94860R0(AbstractC43189g abstractC43189g) {
        C42841b.m93957i(abstractC43189g);
        m94987b(0, abstractC43189g);
        return this;
    }

    /* JADX INFO: renamed from: U0 */
    public Element m94862U0(String str) {
        return (Element) super.m94975M(str);
    }

    /* JADX INFO: renamed from: V0 */
    public Element m94863V0(String str) {
        C42841b.m93957i(str);
        Set<String> setM94893q0 = m94893q0();
        setM94893q0.remove(str);
        m94895r0(setM94893q0);
        return this;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public Element mo94859R() {
        return (Element) super.mo94859R();
    }

    /* JADX INFO: renamed from: Y0 */
    public Elements m94865Y0(String str) {
        return Selector.m95273c(str, this);
    }

    /* JADX INFO: renamed from: Z0 */
    public Element m94866Z0(String str) {
        return Selector.m95275e(str, this);
    }

    /* JADX INFO: renamed from: c0 */
    public Element m94869c0(String str) {
        C42841b.m93957i(str);
        Set<String> setM94893q0 = m94893q0();
        setM94893q0.add(str);
        m94895r0(setM94893q0);
        return this;
    }

    /* JADX INFO: renamed from: d0 */
    public Element m94871d0(String str) {
        return (Element) super.m94990e(str);
    }

    /* JADX INFO: renamed from: e0 */
    public Element m94873e0(String str) {
        C42841b.m93957i(str);
        m94988c((AbstractC43189g[]) C43190h.m95001b(this).m95192c(str, this, mo94880i()).toArray(new AbstractC43189g[0]));
        return this;
    }

    /* JADX INFO: renamed from: e1 */
    public String m94874e1() {
        StringBuilder sbM94683b = C43093c.m94683b();
        C43308d.m95288c(new C43181a(sbM94683b), this);
        return C43093c.m94694m(sbM94683b).trim();
    }

    /* JADX INFO: renamed from: f0 */
    public Element m94875f0(AbstractC43189g abstractC43189g) {
        C42841b.m93957i(abstractC43189g);
        m94977O(abstractC43189g);
        mo94897t();
        this.f95365f.add(abstractC43189g);
        abstractC43189g.m94982U(this.f95365f.size() - 1);
        return this;
    }

    /* JADX INFO: renamed from: f1 */
    public Element mo94803f1(String str) {
        C42841b.m93957i(str);
        mo94896s();
        m94875f0(new C43192j(str));
        return this;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: h */
    public C43184b mo94878h() {
        if (!mo94901w()) {
            this.f95366g = new C43184b();
        }
        return this.f95366g;
    }

    /* JADX INFO: renamed from: h1 */
    public Element m94879h1(String str) {
        C42841b.m93957i(str);
        Set<String> setM94893q0 = m94893q0();
        if (setM94893q0.contains(str)) {
            setM94893q0.remove(str);
        } else {
            setM94893q0.add(str);
        }
        m94895r0(setM94893q0);
        return this;
    }

    /* JADX INFO: renamed from: i1 */
    public String m94881i1() {
        if (m94853L0().equals("textarea")) {
            return m94874e1();
        }
        return mo94960f("value");
    }

    /* JADX INFO: renamed from: j0 */
    public Element m94882j0(String str, String str2) {
        super.mo94968g(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: j1 */
    public Element m94883j1(String str) {
        if (m94853L0().equals("textarea")) {
            mo94803f1(str);
            return this;
        }
        m94882j0("value", str);
        return this;
    }

    /* JADX INFO: renamed from: k0 */
    public Element m94884k0(String str) {
        return (Element) super.m94991j(str);
    }

    /* JADX INFO: renamed from: k1 */
    public Element m94885k1(String str) {
        return (Element) super.m94986Y(str);
    }

    /* JADX INFO: renamed from: l0 */
    public Element m94886l0(AbstractC43189g abstractC43189g) {
        return (Element) super.m94992k(abstractC43189g);
    }

    /* JADX INFO: renamed from: m0 */
    public Element m94888m0(int i11) {
        return m94889n0().get(i11);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: r */
    public void mo94894r(String str) {
        mo94878h().m94934G(f95362j, str);
    }

    /* JADX INFO: renamed from: r0 */
    public Element m94895r0(Set<String> set) {
        C42841b.m93957i(set);
        if (set.isEmpty()) {
            mo94878h().m94938N("class");
            return this;
        }
        mo94878h().m94934G("class", C43093c.m94691j(set, C33627eb.f69716f));
        return this;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Element mo94812s0() {
        return (Element) super.mo94812s0();
    }

    /* JADX INFO: renamed from: t0 */
    public String m94898t0() {
        StringBuilder sbM94683b = C43093c.m94683b();
        for (AbstractC43189g abstractC43189g : this.f95365f) {
            if (abstractC43189g instanceof C43187e) {
                sbM94683b.append(((C43187e) abstractC43189g).m94964d0());
            } else if (abstractC43189g instanceof C43186d) {
                sbM94683b.append(((C43186d) abstractC43189g).m94959e0());
            } else if (abstractC43189g instanceof Element) {
                sbM94683b.append(((Element) abstractC43189g).m94898t0());
            } else if (abstractC43189g instanceof C43185c) {
                sbM94683b.append(((C43185c) abstractC43189g).m95003d0());
            }
        }
        return C43093c.m94694m(sbM94683b);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public Element mo94892q(AbstractC43189g abstractC43189g) {
        C43184b c43184bClone;
        Element element = (Element) super.mo94892q(abstractC43189g);
        C43184b c43184b = this.f95366g;
        if (c43184b != null) {
            c43184bClone = c43184b.clone();
        } else {
            c43184bClone = null;
        }
        element.f95366g = c43184bClone;
        NodeList nodeList = new NodeList(element, this.f95365f.size());
        element.f95365f = nodeList;
        nodeList.addAll(this.f95365f);
        element.m94980S(mo94880i());
        return element;
    }

    /* JADX INFO: renamed from: v0 */
    public int m94900v0() {
        if (mo94848H() == null) {
            return 0;
        }
        return m94831F0(this, mo94848H().m94889n0());
    }

    /* JADX INFO: renamed from: y0 */
    public Element m94904y0(String str) {
        C42841b.m93955g(str);
        Elements elementsM95276a = C43305a.m95276a(new AbstractC43307c.p(str), this);
        if (elementsM95276a.size() > 0) {
            return elementsM95276a.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m94905z0(String str) {
        String str2;
        if (!mo94901w()) {
            return false;
        }
        String strM94947m = this.f95366g.m94947m("class");
        int length = strM94947m.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM94947m);
            }
            int i11 = 0;
            boolean z11 = false;
            int i12 = 0;
            while (i11 < length) {
                if (Character.isWhitespace(strM94947m.charAt(i11))) {
                    if (z11) {
                        if (i11 - i12 == length2) {
                            str2 = str;
                            if (strM94947m.regionMatches(true, i12, str2, 0, length2)) {
                                return true;
                            }
                        } else {
                            str2 = str;
                        }
                        z11 = false;
                    } else {
                        str2 = str;
                    }
                } else {
                    str2 = str;
                    if (!z11) {
                        i12 = i11;
                        z11 = true;
                    }
                }
                i11++;
                str = str2;
            }
            String str3 = str;
            if (z11 && length - i12 == length2) {
                return strM94947m.regionMatches(true, i12, str3, 0, length2);
            }
        }
        return false;
    }

    public Element(C43300f c43300f, String str) {
        this(c43300f, str, null);
    }
}
