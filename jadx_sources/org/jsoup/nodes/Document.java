package org.jsoup.nodes;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.jsoup.parser.C43298d;
import org.jsoup.parser.C43299e;
import org.jsoup.parser.C43300f;

/* JADX INFO: loaded from: classes61.dex */
public class Document extends Element {

    /* JADX INFO: renamed from: k */
    public OutputSettings f95345k;

    /* JADX INFO: renamed from: l */
    public C43299e f95346l;

    /* JADX INFO: renamed from: m */
    public QuirksMode f95347m;

    /* JADX INFO: renamed from: n */
    public String f95348n;

    /* JADX INFO: renamed from: o */
    public boolean f95349o;

    public static class OutputSettings implements Cloneable {

        /* JADX INFO: renamed from: c */
        public Charset f95351c;

        /* JADX INFO: renamed from: e */
        public Entities.CoreCharset f95353e;

        /* JADX INFO: renamed from: b */
        public Entities.EscapeMode f95350b = Entities.EscapeMode.base;

        /* JADX INFO: renamed from: d */
        public ThreadLocal<CharsetEncoder> f95352d = new ThreadLocal<>();

        /* JADX INFO: renamed from: f */
        public boolean f95354f = true;

        /* JADX INFO: renamed from: g */
        public boolean f95355g = false;

        /* JADX INFO: renamed from: h */
        public int f95356h = 1;

        /* JADX INFO: renamed from: i */
        public Syntax f95357i = Syntax.html;

        public enum Syntax {
            html,
            xml
        }

        /* JADX INFO: renamed from: a */
        public Charset m94819a() {
            return this.f95351c;
        }

        /* JADX INFO: renamed from: c */
        public OutputSettings m94821c(Charset charset) {
            this.f95351c = charset;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public CharsetEncoder m94823e() {
            CharsetEncoder charsetEncoder = this.f95352d.get();
            return charsetEncoder != null ? charsetEncoder : m94827i();
        }

        /* JADX INFO: renamed from: f */
        public Entities.EscapeMode m94824f() {
            return this.f95350b;
        }

        /* JADX INFO: renamed from: g */
        public int m94825g() {
            return this.f95356h;
        }

        /* JADX INFO: renamed from: h */
        public boolean m94826h() {
            return this.f95355g;
        }

        /* JADX INFO: renamed from: i */
        public CharsetEncoder m94827i() {
            CharsetEncoder charsetEncoderNewEncoder = this.f95351c.newEncoder();
            this.f95352d.set(charsetEncoderNewEncoder);
            this.f95353e = Entities.CoreCharset.byName(charsetEncoderNewEncoder.charset().name());
            return charsetEncoderNewEncoder;
        }

        /* JADX INFO: renamed from: j */
        public boolean m94828j() {
            return this.f95354f;
        }

        /* JADX INFO: renamed from: k */
        public Syntax m94829k() {
            return this.f95357i;
        }

        /* JADX INFO: renamed from: l */
        public OutputSettings m94830l(Syntax syntax) {
            this.f95357i = syntax;
            return this;
        }

        public OutputSettings() {
            m94821c(Charset.forName("UTF8"));
        }

        /* JADX INFO: renamed from: b */
        public OutputSettings m94820b(String str) {
            m94821c(Charset.forName(str));
            return this;
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.m94820b(this.f95351c.name());
                outputSettings.f95350b = Entities.EscapeMode.valueOf(this.f95350b.name());
                return outputSettings;
            } catch (CloneNotSupportedException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    /* JADX INFO: renamed from: n1 */
    public void m94806n1(Charset charset) {
        m94818x1(true);
        this.f95345k.m94821c(charset);
        m94809p1();
    }

    public Document(String str) {
        super(C43300f.m95198o("#root", C43298d.f95484c), str);
        this.f95345k = new OutputSettings();
        this.f95347m = QuirksMode.noQuirks;
        this.f95349o = false;
        this.f95348n = str;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: A */
    public String mo94801A() {
        return "#document";
    }

    /* JADX INFO: renamed from: l1 */
    public Element m94804l1() {
        return m94810q1(TtmlNode.TAG_BODY, this);
    }

    /* JADX INFO: renamed from: m1 */
    public Charset m94805m1() {
        return this.f95345k.m94819a();
    }

    /* JADX INFO: renamed from: p1 */
    public final void m94809p1() {
        if (this.f95349o) {
            OutputSettings.Syntax syntaxM94829k = m94813s1().m94829k();
            if (syntaxM94829k == OutputSettings.Syntax.html) {
                Element elementFirst = m94865Y0("meta[charset]").first();
                if (elementFirst != null) {
                    elementFirst.m94882j0("charset", m94805m1().displayName());
                } else {
                    Element elementM94811r1 = m94811r1();
                    if (elementM94811r1 != null) {
                        elementM94811r1.m94876g0("meta").m94882j0("charset", m94805m1().displayName());
                    }
                }
                m94865Y0("meta[name=charset]").remove();
                return;
            }
            if (syntaxM94829k == OutputSettings.Syntax.xml) {
                AbstractC43189g abstractC43189g = m94994n().get(0);
                if (!(abstractC43189g instanceof C43193k)) {
                    C43193k c43193k = new C43193k("xml", false);
                    c43193k.mo94968g("version", "1.0");
                    c43193k.mo94968g("encoding", m94805m1().displayName());
                    m94860R0(c43193k);
                    return;
                }
                C43193k c43193k2 = (C43193k) abstractC43189g;
                if (c43193k2.m95007e0().equals("xml")) {
                    c43193k2.mo94968g("encoding", m94805m1().displayName());
                    if (c43193k2.mo94960f("version") != null) {
                        c43193k2.mo94968g("version", "1.0");
                        return;
                    }
                    return;
                }
                C43193k c43193k3 = new C43193k("xml", false);
                c43193k3.mo94968g("version", "1.0");
                c43193k3.mo94968g("encoding", m94805m1().displayName());
                m94860R0(c43193k3);
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public Element m94811r1() {
        return m94810q1(TtmlNode.TAG_HEAD, this);
    }

    /* JADX INFO: renamed from: s1 */
    public OutputSettings m94813s1() {
        return this.f95345k;
    }

    /* JADX INFO: renamed from: t1 */
    public Document m94814t1(C43299e c43299e) {
        this.f95346l = c43299e;
        return this;
    }

    /* JADX INFO: renamed from: u1 */
    public C43299e m94815u1() {
        return this.f95346l;
    }

    /* JADX INFO: renamed from: v1 */
    public QuirksMode m94816v1() {
        return this.f95347m;
    }

    /* JADX INFO: renamed from: w1 */
    public Document m94817w1(QuirksMode quirksMode) {
        this.f95347m = quirksMode;
        return this;
    }

    /* JADX INFO: renamed from: x1 */
    public void m94818x1(boolean z11) {
        this.f95349o = z11;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: C */
    public String mo94802C() {
        return super.m94842C0();
    }

    @Override // org.jsoup.nodes.Element
    /* JADX INFO: renamed from: f1 */
    public Element mo94803f1(String str) {
        m94804l1().mo94803f1(str);
        return this;
    }

    @Override // org.jsoup.nodes.Element
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Document mo94808p() {
        Document document = (Document) super.mo94808p();
        document.f95345k = this.f95345k.clone();
        return document;
    }

    /* JADX INFO: renamed from: q1 */
    public final Element m94810q1(String str, AbstractC43189g abstractC43189g) {
        if (abstractC43189g.mo94801A().equals(str)) {
            return (Element) abstractC43189g;
        }
        int iMo94887m = abstractC43189g.mo94887m();
        for (int i11 = 0; i11 < iMo94887m; i11++) {
            Element elementM94810q1 = m94810q1(str, abstractC43189g.m94993l(i11));
            if (elementM94810q1 != null) {
                return elementM94810q1;
            }
        }
        return null;
    }
}
