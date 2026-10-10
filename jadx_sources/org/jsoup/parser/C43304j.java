package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import nh0.C42841b;
import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.C43184b;
import org.jsoup.nodes.C43185c;
import org.jsoup.nodes.C43186d;
import org.jsoup.nodes.C43188f;
import org.jsoup.nodes.C43192j;
import org.jsoup.nodes.C43193k;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/* JADX INFO: renamed from: org.jsoup.parser.j */
/* JADX INFO: compiled from: XmlTreeBuilder.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43304j extends AbstractC43303i {

    /* JADX INFO: renamed from: org.jsoup.parser.j$a */
    /* JADX INFO: compiled from: XmlTreeBuilder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95539a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f95539a = iArr;
            try {
                iArr[Token.TokenType.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95539a[Token.TokenType.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95539a[Token.TokenType.Comment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95539a[Token.TokenType.Character.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95539a[Token.TokenType.Doctype.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f95539a[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // org.jsoup.parser.AbstractC43303i
    /* JADX INFO: renamed from: b */
    public C43298d mo95139b() {
        return C43298d.f95485d;
    }

    @Override // org.jsoup.parser.AbstractC43303i
    /* JADX INFO: renamed from: g */
    public boolean mo95147g(Token token) {
        switch (a.f95539a[token.f95431a.ordinal()]) {
            case 1:
                m95259l(token.m95025e());
                break;
            case 2:
                m95264r(token.m95024d());
                break;
            case 3:
                m95261n(token.m95022b());
                break;
            case 4:
                m95260m(token.m95021a());
                break;
            case 5:
                m95262o(token.m95023c());
                break;
            case 6:
                break;
            default:
                C42841b.m93949a("Unexpected token type: " + token.f95431a);
                break;
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m95261n(Token.C43222d c43222d) {
        C43193k c43193kM94957c0;
        C43186d c43186d = new C43186d(c43222d.m95040s());
        if (c43222d.f95436d && c43186d.m94961f0() && (c43193kM94957c0 = c43186d.m94957c0()) != null) {
            c43186d = c43193kM94957c0;
        }
        m95258p(c43186d);
    }

    /* JADX INFO: renamed from: o */
    public void m95262o(Token.C43223e c43223e) {
        C43188f c43188f = new C43188f(this.f95536h.m95186c(c43223e.m95041p()), c43223e.m95043r(), c43223e.m95044s());
        c43188f.m94966d0(c43223e.m95042q());
        m95258p(c43188f);
    }

    /* JADX INFO: renamed from: q */
    public List<AbstractC43189g> m95263q(String str, String str2, C43299e c43299e) {
        mo95142d(new StringReader(str), str2, c43299e);
        m95257k();
        return this.f95532d.m94994n();
    }

    /* JADX INFO: renamed from: r */
    public final void m95264r(Token.C43225g c43225g) {
        Element element;
        String strM95186c = this.f95536h.m95186c(c43225g.f95442b);
        int size = this.f95533e.size() - 1;
        while (true) {
            if (size < 0) {
                element = null;
                break;
            }
            element = this.f95533e.get(size);
            if (element.mo94801A().equals(strM95186c)) {
                break;
            } else {
                size--;
            }
        }
        if (element == null) {
            return;
        }
        for (int size2 = this.f95533e.size() - 1; size2 >= 0; size2--) {
            Element element2 = this.f95533e.get(size2);
            this.f95533e.remove(size2);
            if (element2 == element) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m95258p(AbstractC43189g abstractC43189g) {
        m95252a().m94875f0(abstractC43189g);
    }

    @Override // org.jsoup.parser.AbstractC43303i
    /* JADX INFO: renamed from: d */
    public void mo95142d(Reader reader, String str, C43299e c43299e) {
        super.mo95142d(reader, str, c43299e);
        this.f95533e.add(this.f95532d);
        this.f95532d.m94813s1().m94830l(Document.OutputSettings.Syntax.xml);
    }

    @Override // org.jsoup.parser.AbstractC43303i
    /* JADX INFO: renamed from: f */
    public List<AbstractC43189g> mo95145f(String str, Element element, String str2, C43299e c43299e) {
        return m95263q(str, str2, c43299e);
    }

    /* JADX INFO: renamed from: l */
    public Element m95259l(Token.C43226h c43226h) {
        C43300f c43300fM95198o = C43300f.m95198o(c43226h.m95048A(), this.f95536h);
        C43184b c43184b = c43226h.f95450j;
        if (c43184b != null) {
            c43184b.m94945k(this.f95536h);
        }
        Element element = new Element(c43300fM95198o, null, this.f95536h.m95185b(c43226h.f95450j));
        m95258p(element);
        if (c43226h.m95063z()) {
            if (!c43300fM95198o.m95206h()) {
                c43300fM95198o.m95210m();
            }
            return element;
        }
        this.f95533e.add(element);
        return element;
    }

    /* JADX INFO: renamed from: m */
    public void m95260m(Token.C43221c c43221c) {
        AbstractC43189g c43192j;
        String strM95036q = c43221c.m95036q();
        if (c43221c.m95026f()) {
            c43192j = new C43185c(strM95036q);
        } else {
            c43192j = new C43192j(strM95036q);
        }
        m95258p(c43192j);
    }
}
