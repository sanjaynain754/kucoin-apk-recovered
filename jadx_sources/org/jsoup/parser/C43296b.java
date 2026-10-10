package org.jsoup.parser;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import nh0.C42841b;
import oh0.C43093c;
import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.C43184b;
import org.jsoup.nodes.C43185c;
import org.jsoup.nodes.C43186d;
import org.jsoup.nodes.C43187e;
import org.jsoup.nodes.C43192j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ph0.C43480b;

/* JADX INFO: renamed from: org.jsoup.parser.b */
/* JADX INFO: compiled from: HtmlTreeBuilder.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43296b extends AbstractC43303i {

    /* JADX INFO: renamed from: k */
    public HtmlTreeBuilderState f95469k;

    /* JADX INFO: renamed from: l */
    public HtmlTreeBuilderState f95470l;

    /* JADX INFO: renamed from: m */
    public boolean f95471m;

    /* JADX INFO: renamed from: n */
    public Element f95472n;

    /* JADX INFO: renamed from: o */
    public C43480b f95473o;

    /* JADX INFO: renamed from: p */
    public Element f95474p;

    /* JADX INFO: renamed from: q */
    public ArrayList<Element> f95475q;

    /* JADX INFO: renamed from: r */
    public List<String> f95476r;

    /* JADX INFO: renamed from: s */
    public Token.C43225g f95477s;

    /* JADX INFO: renamed from: t */
    public boolean f95478t;

    /* JADX INFO: renamed from: u */
    public boolean f95479u;

    /* JADX INFO: renamed from: v */
    public boolean f95480v;

    /* JADX INFO: renamed from: w */
    public String[] f95481w = {null};

    /* JADX INFO: renamed from: x */
    public static final String[] f95466x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: y */
    public static final String[] f95467y = {"ol", "ul"};

    /* JADX INFO: renamed from: z */
    public static final String[] f95468z = {"button"};

    /* JADX INFO: renamed from: A */
    public static final String[] f95462A = {"html", "table"};

    /* JADX INFO: renamed from: B */
    public static final String[] f95463B = {"optgroup", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT};

    /* JADX INFO: renamed from: C */
    public static final String[] f95464C = {"dd", "dt", "li", "optgroup", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "p", "rp", "rt"};

    /* JADX INFO: renamed from: D */
    public static final String[] f95465D = {"address", "applet", "area", "article", "aside", TtmlNode.RUBY_BASE, "basefont", "bgsound", "blockquote", TtmlNode.TAG_BODY, "br", "button", "caption", TtmlNode.CENTER, "col", "colgroup", "command", "dd", "details", "dir", TtmlNode.TAG_DIV, CmcdConfiguration.KEY_DEADLINE, "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", TypedValues.AttributesType.S_FRAME, "frameset", "h1", "h2", "h3", "h4", "h5", "h6", TtmlNode.TAG_HEAD, "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", SignTermItem.LINK, "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", TtmlNode.TAG_STYLE, "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* JADX INFO: renamed from: G */
    public boolean m95118G(String str) {
        return m95119H(str, null);
    }

    /* JADX INFO: renamed from: u */
    public void m95172u() {
        m95174v(null);
    }

    /* JADX INFO: renamed from: A */
    public Element m95108A(String str) {
        for (int size = this.f95533e.size() - 1; size >= 0; size--) {
            Element element = this.f95533e.get(size);
            if (element.m94853L0().equals(str)) {
                return element;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public void m95109A0(boolean z11) {
        this.f95479u = z11;
    }

    /* JADX INFO: renamed from: B */
    public Element m95110B() {
        return this.f95472n;
    }

    /* JADX INFO: renamed from: B0 */
    public void m95111B0(Element element) {
        this.f95472n = element;
    }

    /* JADX INFO: renamed from: C */
    public List<String> m95112C() {
        return this.f95476r;
    }

    /* JADX INFO: renamed from: C0 */
    public HtmlTreeBuilderState m95113C0() {
        return this.f95469k;
    }

    /* JADX INFO: renamed from: D */
    public ArrayList<Element> m95114D() {
        return this.f95533e;
    }

    /* JADX INFO: renamed from: D0 */
    public void m95115D0(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.f95469k = htmlTreeBuilderState;
    }

    /* JADX INFO: renamed from: E */
    public boolean m95116E(String str) {
        return m95119H(str, f95468z);
    }

    /* JADX INFO: renamed from: F */
    public boolean m95117F(String str) {
        return m95119H(str, f95467y);
    }

    /* JADX INFO: renamed from: H */
    public boolean m95119H(String str, String[] strArr) {
        return m95122K(str, f95466x, strArr);
    }

    /* JADX INFO: renamed from: I */
    public boolean m95120I(String[] strArr) {
        return m95123L(strArr, f95466x, null);
    }

    /* JADX INFO: renamed from: J */
    public boolean m95121J(String str) {
        for (int size = this.f95533e.size() - 1; size >= 0; size--) {
            String strM94853L0 = this.f95533e.get(size).m94853L0();
            if (strM94853L0.equals(str)) {
                return true;
            }
            if (!C43093c.m94685d(strM94853L0, f95463B)) {
                return false;
            }
        }
        C42841b.m93949a("Should not be reachable");
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m95122K(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.f95481w;
        strArr3[0] = str;
        return m95123L(strArr3, strArr, strArr2);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m95123L(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f95533e.size();
        int i11 = size - 1;
        int i12 = i11 > 100 ? size - 101 : 0;
        while (i11 >= i12) {
            String strM94853L0 = this.f95533e.get(i11).m94853L0();
            if (C43093c.m94685d(strM94853L0, strArr)) {
                return true;
            }
            if (C43093c.m94685d(strM94853L0, strArr2)) {
                return false;
            }
            if (strArr3 != null && C43093c.m94685d(strM94853L0, strArr3)) {
                return false;
            }
            i11--;
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public boolean m95124M(String str) {
        return m95122K(str, f95462A, null);
    }

    /* JADX INFO: renamed from: N */
    public Element m95125N(Token.C43226h c43226h) {
        C43184b c43184b = c43226h.f95450j;
        if (c43184b != null && !c43184b.isEmpty() && c43226h.f95450j.m94945k(this.f95536h) > 0) {
            m95253c("Duplicate attribute");
        }
        if (!c43226h.m95063z()) {
            Element element = new Element(C43300f.m95198o(c43226h.m95048A(), this.f95536h), null, this.f95536h.m95185b(c43226h.f95450j));
            m95126O(element);
            return element;
        }
        Element elementM95129R = m95129R(c43226h);
        this.f95533e.add(elementM95129R);
        this.f95531c.m95251v(TokeniserState.Data);
        this.f95531c.m95241l(this.f95477s.mo95033m().m95049B(elementM95129R.m94870c1()));
        return elementM95129R;
    }

    /* JADX INFO: renamed from: Q */
    public void m95128Q(Token.C43222d c43222d) {
        m95133V(new C43186d(c43222d.m95040s()));
    }

    /* JADX INFO: renamed from: U */
    public void m95132U() {
        this.f95475q.add(null);
    }

    /* JADX INFO: renamed from: V */
    public final void m95133V(AbstractC43189g abstractC43189g) {
        C43480b c43480b;
        if (this.f95533e.isEmpty()) {
            this.f95532d.m94875f0(abstractC43189g);
        } else if (m95137Z()) {
            m95131T(abstractC43189g);
        } else {
            m95252a().m94875f0(abstractC43189g);
        }
        if (abstractC43189g instanceof Element) {
            Element element = (Element) abstractC43189g;
            if (!element.m94868b1().m95204f() || (c43480b = this.f95473o) == null) {
                return;
            }
            c43480b.m95712l1(element);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m95134W(Element element, Element element2) {
        int iLastIndexOf = this.f95533e.lastIndexOf(element);
        C42841b.m93951c(iLastIndexOf != -1);
        this.f95533e.add(iLastIndexOf + 1, element2);
    }

    /* JADX INFO: renamed from: X */
    public Element m95135X(String str) {
        Element element = new Element(C43300f.m95198o(str, this.f95536h), null);
        m95126O(element);
        return element;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m95137Z() {
        return this.f95479u;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m95138a0() {
        return this.f95480v;
    }

    @Override // org.jsoup.parser.AbstractC43303i
    /* JADX INFO: renamed from: b */
    public C43298d mo95139b() {
        return C43298d.f95484c;
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m95140b0(Element element) {
        return m95136Y(this.f95475q, element);
    }

    /* JADX INFO: renamed from: e0 */
    public Element m95144e0() {
        if (this.f95475q.size() <= 0) {
            return null;
        }
        ArrayList<Element> arrayList = this.f95475q;
        return arrayList.get(arrayList.size() - 1);
    }

    @Override // org.jsoup.parser.AbstractC43303i
    /* JADX INFO: renamed from: f */
    public List<AbstractC43189g> mo95145f(String str, Element element, String str2, C43299e c43299e) {
        Element element2;
        this.f95469k = HtmlTreeBuilderState.Initial;
        mo95142d(new StringReader(str), str2, c43299e);
        this.f95474p = element;
        this.f95480v = true;
        if (element != null) {
            if (element.m94970G() != null) {
                this.f95532d.m94817w1(element.m94970G().m94816v1());
            }
            String strM94853L0 = element.m94853L0();
            if (C43093c.m94684c(strM94853L0, "title", "textarea")) {
                this.f95531c.m95251v(TokeniserState.Rcdata);
            } else if (C43093c.m94684c(strM94853L0, "iframe", "noembed", "noframes", TtmlNode.TAG_STYLE, "xmp")) {
                this.f95531c.m95251v(TokeniserState.Rawtext);
            } else if (strM94853L0.equals("script")) {
                this.f95531c.m95251v(TokeniserState.ScriptData);
            } else if (!strM94853L0.equals("noscript") && strM94853L0.equals("plaintext")) {
                this.f95531c.m95251v(TokeniserState.Data);
            } else {
                this.f95531c.m95251v(TokeniserState.Data);
            }
            element2 = new Element(C43300f.m95198o("html", this.f95536h), str2);
            this.f95532d.m94875f0(element2);
            this.f95533e.add(element2);
            m95181y0();
            Elements elementsM94857P0 = element.m94857P0();
            elementsM94857P0.add(0, element);
            for (Element element3 : elementsM94857P0) {
                if (element3 instanceof C43480b) {
                    this.f95473o = (C43480b) element3;
                    break;
                }
            }
        } else {
            element2 = null;
        }
        m95257k();
        return element != null ? element2.m94994n() : this.f95532d.m94994n();
    }

    /* JADX INFO: renamed from: f0 */
    public void m95146f0() {
        this.f95470l = this.f95469k;
    }

    @Override // org.jsoup.parser.AbstractC43303i
    /* JADX INFO: renamed from: g */
    public boolean mo95147g(Token token) {
        this.f95535g = token;
        return this.f95469k.process(token, this);
    }

    /* JADX INFO: renamed from: g0 */
    public void m95148g0(Element element) {
        if (this.f95471m) {
            return;
        }
        String strMo94956a = element.mo94956a("href");
        if (strMo94956a.length() != 0) {
            this.f95534f = strMo94956a;
            this.f95471m = true;
            this.f95532d.m94980S(strMo94956a);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m95149h0() {
        this.f95476r = new ArrayList();
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m95150i0(Element element) {
        return m95136Y(this.f95533e, element);
    }

    /* JADX INFO: renamed from: j0 */
    public HtmlTreeBuilderState m95152j0() {
        return this.f95470l;
    }

    /* JADX INFO: renamed from: k0 */
    public Element m95153k0() {
        return this.f95533e.remove(this.f95533e.size() - 1);
    }

    /* JADX INFO: renamed from: l */
    public Element m95154l(Element element) {
        for (int size = this.f95533e.size() - 1; size >= 0; size--) {
            if (this.f95533e.get(size) == element) {
                return this.f95533e.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public void m95155l0(String str) {
        for (int size = this.f95533e.size() - 1; size >= 0 && !this.f95533e.get(size).m94853L0().equals(str); size--) {
            this.f95533e.remove(size);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m95156m() {
        while (!this.f95475q.isEmpty() && m95173u0() != null) {
        }
    }

    /* JADX INFO: renamed from: m0 */
    public Element m95157m0(String str) {
        for (int size = this.f95533e.size() - 1; size >= 0; size--) {
            Element element = this.f95533e.get(size);
            this.f95533e.remove(size);
            if (element.m94853L0().equals(str)) {
                return element;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m95158n(String... strArr) {
        for (int size = this.f95533e.size() - 1; size >= 0; size--) {
            Element element = this.f95533e.get(size);
            if (C43093c.m94684c(element.m94853L0(), strArr) || element.m94853L0().equals("html")) {
                return;
            }
            this.f95533e.remove(size);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m95159n0(String... strArr) {
        for (int size = this.f95533e.size() - 1; size >= 0; size--) {
            Element element = this.f95533e.get(size);
            this.f95533e.remove(size);
            if (C43093c.m94685d(element.m94853L0(), strArr)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m95161o0(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        this.f95535g = token;
        return htmlTreeBuilderState.process(token, this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m95163p0(Element element) {
        this.f95533e.add(element);
    }

    /* JADX INFO: renamed from: q0 */
    public void m95165q0(Element element) {
        int i11 = 0;
        for (int size = this.f95475q.size() - 1; size >= 0; size--) {
            Element element2 = this.f95475q.get(size);
            if (element2 == null) {
                break;
            }
            if (m95141c0(element, element2)) {
                i11++;
            }
            if (i11 == 3) {
                this.f95475q.remove(size);
                break;
            }
        }
        this.f95475q.add(element);
    }

    /* JADX INFO: renamed from: r */
    public void m95166r(HtmlTreeBuilderState htmlTreeBuilderState) {
        if (this.f95529a.m95191a().canAddError()) {
            this.f95529a.m95191a().add(new C43297c(this.f95530b.m95079H(), "Unexpected token [%s] when in state [%s]", this.f95535g.m95034o(), htmlTreeBuilderState));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m95168s(boolean z11) {
        this.f95478t = z11;
    }

    /* JADX INFO: renamed from: s0 */
    public void m95169s0(Element element) {
        for (int size = this.f95475q.size() - 1; size >= 0; size--) {
            if (this.f95475q.get(size) == element) {
                this.f95475q.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m95170t() {
        return this.f95478t;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m95171t0(Element element) {
        for (int size = this.f95533e.size() - 1; size >= 0; size--) {
            if (this.f95533e.get(size) == element) {
                this.f95533e.remove(size);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f95535g + ", state=" + this.f95469k + ", currentElement=" + m95252a() + '}';
    }

    /* JADX INFO: renamed from: u0 */
    public Element m95173u0() {
        int size = this.f95475q.size();
        if (size > 0) {
            return this.f95475q.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public void m95174v(String str) {
        while (str != null && !m95252a().m94853L0().equals(str) && C43093c.m94685d(m95252a().m94853L0(), f95464C)) {
            m95153k0();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m95175v0(Element element, Element element2) {
        m95177w0(this.f95475q, element, element2);
    }

    /* JADX INFO: renamed from: w */
    public Element m95176w(String str) {
        for (int size = this.f95475q.size() - 1; size >= 0; size--) {
            Element element = this.f95475q.get(size);
            if (element == null) {
                return null;
            }
            if (element.m94853L0().equals(str)) {
                return element;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public String m95178x() {
        return this.f95534f;
    }

    /* JADX INFO: renamed from: x0 */
    public void m95179x0(Element element, Element element2) {
        m95177w0(this.f95533e, element, element2);
    }

    /* JADX INFO: renamed from: y */
    public Document m95180y() {
        return this.f95532d;
    }

    /* JADX INFO: renamed from: y0 */
    public void m95181y0() {
        boolean z11 = false;
        for (int size = this.f95533e.size() - 1; size >= 0; size--) {
            Element element = this.f95533e.get(size);
            if (size == 0) {
                element = this.f95474p;
                z11 = true;
            }
            String strM94853L0 = element.m94853L0();
            if ("select".equals(strM94853L0)) {
                m95115D0(HtmlTreeBuilderState.InSelect);
                return;
            }
            if ("td".equals(strM94853L0) || ("th".equals(strM94853L0) && !z11)) {
                m95115D0(HtmlTreeBuilderState.InCell);
                return;
            }
            if ("tr".equals(strM94853L0)) {
                m95115D0(HtmlTreeBuilderState.InRow);
                return;
            }
            if ("tbody".equals(strM94853L0) || "thead".equals(strM94853L0) || "tfoot".equals(strM94853L0)) {
                m95115D0(HtmlTreeBuilderState.InTableBody);
                return;
            }
            if ("caption".equals(strM94853L0)) {
                m95115D0(HtmlTreeBuilderState.InCaption);
                return;
            }
            if ("colgroup".equals(strM94853L0)) {
                m95115D0(HtmlTreeBuilderState.InColumnGroup);
                return;
            }
            if ("table".equals(strM94853L0)) {
                m95115D0(HtmlTreeBuilderState.InTable);
                return;
            }
            if (TtmlNode.TAG_HEAD.equals(strM94853L0)) {
                m95115D0(HtmlTreeBuilderState.InBody);
                return;
            }
            if (TtmlNode.TAG_BODY.equals(strM94853L0)) {
                m95115D0(HtmlTreeBuilderState.InBody);
                return;
            }
            if ("frameset".equals(strM94853L0)) {
                m95115D0(HtmlTreeBuilderState.InFrameset);
                return;
            } else if ("html".equals(strM94853L0)) {
                m95115D0(HtmlTreeBuilderState.BeforeHead);
                return;
            } else {
                if (z11) {
                    m95115D0(HtmlTreeBuilderState.InBody);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public C43480b m95182z() {
        return this.f95473o;
    }

    /* JADX INFO: renamed from: z0 */
    public void m95183z0(C43480b c43480b) {
        this.f95473o = c43480b;
    }

    /* JADX INFO: renamed from: O */
    public void m95126O(Element element) {
        m95133V(element);
        this.f95533e.add(element);
    }

    /* JADX INFO: renamed from: P */
    public void m95127P(Token.C43221c c43221c) {
        AbstractC43189g c43187e;
        Element elementM95252a = m95252a();
        if (elementM95252a == null) {
            elementM95252a = this.f95532d;
        }
        String strM94853L0 = elementM95252a.m94853L0();
        String strM95036q = c43221c.m95036q();
        if (c43221c.m95026f()) {
            c43187e = new C43185c(strM95036q);
        } else if (!strM94853L0.equals("script") && !strM94853L0.equals(TtmlNode.TAG_STYLE)) {
            c43187e = new C43192j(strM95036q);
        } else {
            c43187e = new C43187e(strM95036q);
        }
        elementM95252a.m94875f0(c43187e);
    }

    /* JADX INFO: renamed from: R */
    public Element m95129R(Token.C43226h c43226h) {
        C43300f c43300fM95198o = C43300f.m95198o(c43226h.m95048A(), this.f95536h);
        Element element = new Element(c43300fM95198o, null, this.f95536h.m95185b(c43226h.f95450j));
        m95133V(element);
        if (c43226h.m95063z()) {
            if (c43300fM95198o.m95206h()) {
                if (!c43300fM95198o.m95203e()) {
                    this.f95531c.m95247r("Tag cannot be self closing; not a void tag");
                    return element;
                }
            } else {
                c43300fM95198o.m95210m();
            }
        }
        return element;
    }

    /* JADX INFO: renamed from: S */
    public C43480b m95130S(Token.C43226h c43226h, boolean z11) {
        C43480b c43480b = new C43480b(C43300f.m95198o(c43226h.m95048A(), this.f95536h), null, this.f95536h.m95185b(c43226h.f95450j));
        m95183z0(c43480b);
        m95133V(c43480b);
        if (z11) {
            this.f95533e.add(c43480b);
        }
        return c43480b;
    }

    /* JADX INFO: renamed from: T */
    public void m95131T(AbstractC43189g abstractC43189g) {
        Element elementM95154l;
        Element elementM95108A = m95108A("table");
        boolean z11 = false;
        if (elementM95108A != null) {
            if (elementM95108A.mo94848H() != null) {
                elementM95154l = elementM95108A.mo94848H();
                z11 = true;
            } else {
                elementM95154l = m95154l(elementM95108A);
            }
        } else {
            elementM95154l = this.f95533e.get(0);
        }
        if (z11) {
            C42841b.m93957i(elementM95108A);
            elementM95108A.m94886l0(abstractC43189g);
        } else {
            elementM95154l.m94875f0(abstractC43189g);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m95136Y(ArrayList<Element> arrayList, Element element) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == element) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m95141c0(Element element, Element element2) {
        if (element.m94853L0().equals(element2.m94853L0()) && element.mo94878h().equals(element2.mo94878h())) {
            return true;
        }
        return false;
    }

    @Override // org.jsoup.parser.AbstractC43303i
    /* JADX INFO: renamed from: d */
    public void mo95142d(Reader reader, String str, C43299e c43299e) {
        super.mo95142d(reader, str, c43299e);
        this.f95469k = HtmlTreeBuilderState.Initial;
        this.f95470l = null;
        this.f95471m = false;
        this.f95472n = null;
        this.f95473o = null;
        this.f95474p = null;
        this.f95475q = new ArrayList<>();
        this.f95476r = new ArrayList();
        this.f95477s = new Token.C43225g();
        this.f95478t = true;
        this.f95479u = false;
        this.f95480v = false;
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m95143d0(Element element) {
        return C43093c.m94685d(element.m94853L0(), f95465D);
    }

    @Override // org.jsoup.parser.AbstractC43303i
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo95151j(String str, C43184b c43184b) {
        return super.mo95151j(str, c43184b);
    }

    /* JADX INFO: renamed from: o */
    public void m95160o() {
        m95158n("tbody", "tfoot", "thead", "template");
    }

    /* JADX INFO: renamed from: p */
    public void m95162p() {
        m95158n("table");
    }

    /* JADX INFO: renamed from: q */
    public void m95164q() {
        m95158n("tr", "template");
    }

    /* JADX INFO: renamed from: r0 */
    public void m95167r0() {
        Element elementM95144e0 = m95144e0();
        if (elementM95144e0 != null && !m95150i0(elementM95144e0)) {
            boolean z11 = true;
            int size = this.f95475q.size() - 1;
            int i11 = size;
            while (i11 != 0) {
                i11--;
                elementM95144e0 = this.f95475q.get(i11);
                if (elementM95144e0 == null || m95150i0(elementM95144e0)) {
                    z11 = false;
                    break;
                }
            }
            while (true) {
                if (!z11) {
                    i11++;
                    elementM95144e0 = this.f95475q.get(i11);
                }
                C42841b.m93957i(elementM95144e0);
                Element elementM95135X = m95135X(elementM95144e0.m94853L0());
                elementM95135X.mo94878h().m94941e(elementM95144e0.mo94878h());
                this.f95475q.set(i11, elementM95135X);
                if (i11 != size) {
                    z11 = false;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m95177w0(ArrayList<Element> arrayList, Element element, Element element2) {
        boolean z11;
        int iLastIndexOf = arrayList.lastIndexOf(element);
        if (iLastIndexOf != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        C42841b.m93951c(z11);
        arrayList.set(iLastIndexOf, element2);
    }
}
