package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import nh0.C42841b;
import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.C43184b;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/* JADX INFO: renamed from: org.jsoup.parser.i */
/* JADX INFO: compiled from: TreeBuilder.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC43303i {

    /* JADX INFO: renamed from: a */
    public C43299e f95529a;

    /* JADX INFO: renamed from: b */
    public C43295a f95530b;

    /* JADX INFO: renamed from: c */
    public C43302h f95531c;

    /* JADX INFO: renamed from: d */
    public Document f95532d;

    /* JADX INFO: renamed from: e */
    public ArrayList<Element> f95533e;

    /* JADX INFO: renamed from: f */
    public String f95534f;

    /* JADX INFO: renamed from: g */
    public Token f95535g;

    /* JADX INFO: renamed from: h */
    public C43298d f95536h;

    /* JADX INFO: renamed from: i */
    public Token.C43226h f95537i = new Token.C43226h();

    /* JADX INFO: renamed from: j */
    public Token.C43225g f95538j = new Token.C43225g();

    /* JADX INFO: renamed from: b */
    public abstract C43298d mo95139b();

    /* JADX INFO: renamed from: f */
    public abstract List<AbstractC43189g> mo95145f(String str, Element element, String str2, C43299e c43299e);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo95147g(Token token);

    /* JADX INFO: renamed from: a */
    public Element m95252a() {
        int size = this.f95533e.size();
        if (size > 0) {
            return this.f95533e.get(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m95253c(String str) {
        ParseErrorList parseErrorListM95191a = this.f95529a.m95191a();
        if (parseErrorListM95191a.canAddError()) {
            parseErrorListM95191a.add(new C43297c(this.f95530b.m95079H(), str));
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo95142d(Reader reader, String str, C43299e c43299e) {
        C42841b.m93958j(reader, "String input must not be null");
        C42841b.m93958j(str, "BaseURI must not be null");
        Document document = new Document(str);
        this.f95532d = document;
        document.m94814t1(c43299e);
        this.f95529a = c43299e;
        this.f95536h = c43299e.m95195f();
        this.f95530b = new C43295a(reader);
        this.f95535g = null;
        this.f95531c = new C43302h(this.f95530b, c43299e.m95191a());
        this.f95533e = new ArrayList<>(32);
        this.f95534f = str;
    }

    /* JADX INFO: renamed from: h */
    public boolean m95255h(String str) {
        Token token = this.f95535g;
        Token.C43225g c43225g = this.f95538j;
        return token == c43225g ? mo95147g(new Token.C43225g().m95049B(str)) : mo95147g(c43225g.mo95033m().m95049B(str));
    }

    /* JADX INFO: renamed from: i */
    public boolean m95256i(String str) {
        Token.C43226h c43226h = this.f95537i;
        return this.f95535g == c43226h ? mo95147g(new Token.C43226h().m95049B(str)) : mo95147g(c43226h.mo95033m().m95049B(str));
    }

    /* JADX INFO: renamed from: j */
    public boolean mo95151j(String str, C43184b c43184b) {
        Token.C43226h c43226h = this.f95537i;
        if (this.f95535g == c43226h) {
            return mo95147g(new Token.C43226h().m95047G(str, c43184b));
        }
        c43226h.mo95033m();
        c43226h.m95047G(str, c43184b);
        return mo95147g(c43226h);
    }

    /* JADX INFO: renamed from: k */
    public void m95257k() {
        Token tokenM95250u;
        C43302h c43302h = this.f95531c;
        Token.TokenType tokenType = Token.TokenType.EOF;
        do {
            tokenM95250u = c43302h.m95250u();
            mo95147g(tokenM95250u);
            tokenM95250u.mo95033m();
        } while (tokenM95250u.f95431a != tokenType);
    }

    /* JADX INFO: renamed from: e */
    public Document m95254e(Reader reader, String str, C43299e c43299e) {
        mo95142d(reader, str, c43299e);
        m95257k();
        this.f95530b.m95085d();
        this.f95530b = null;
        this.f95531c = null;
        this.f95533e = null;
        return this.f95532d;
    }
}
