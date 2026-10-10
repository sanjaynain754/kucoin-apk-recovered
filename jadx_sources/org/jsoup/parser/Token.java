package org.jsoup.parser;

import com.tencent.bugly.proguard.C33627eb;
import nh0.C42841b;
import oh0.C43092b;
import org.jsoup.nodes.C43184b;

/* JADX INFO: loaded from: classes61.dex */
public abstract class Token {

    /* JADX INFO: renamed from: a */
    public TokenType f95431a;

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* JADX INFO: renamed from: org.jsoup.parser.Token$b */
    public static final class C43220b extends C43221c {
        @Override // org.jsoup.parser.Token.C43221c
        public String toString() {
            return "<![CDATA[" + m95036q() + "]]>";
        }

        public C43220b(String str) {
            m95035p(str);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.parser.Token$c */
    public static class C43221c extends Token {

        /* JADX INFO: renamed from: b */
        public String f95433b;

        public C43221c() {
            super();
            this.f95431a = TokenType.Character;
        }

        @Override // org.jsoup.parser.Token
        /* JADX INFO: renamed from: m */
        public Token mo95033m() {
            this.f95433b = null;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C43221c m95035p(String str) {
            this.f95433b = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public String m95036q() {
            return this.f95433b;
        }

        public String toString() {
            return m95036q();
        }
    }

    /* JADX INFO: renamed from: org.jsoup.parser.Token$d */
    public static final class C43222d extends Token {

        /* JADX INFO: renamed from: b */
        public final StringBuilder f95434b;

        /* JADX INFO: renamed from: c */
        public String f95435c;

        /* JADX INFO: renamed from: d */
        public boolean f95436d;

        public C43222d() {
            super();
            this.f95434b = new StringBuilder();
            this.f95436d = false;
            this.f95431a = TokenType.Comment;
        }

        @Override // org.jsoup.parser.Token
        /* JADX INFO: renamed from: m */
        public Token mo95033m() {
            Token.m95020n(this.f95434b);
            this.f95435c = null;
            this.f95436d = false;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public final void m95039r() {
            String str = this.f95435c;
            if (str != null) {
                this.f95434b.append(str);
                this.f95435c = null;
            }
        }

        /* JADX INFO: renamed from: s */
        public String m95040s() {
            String str = this.f95435c;
            return str != null ? str : this.f95434b.toString();
        }

        public String toString() {
            return "<!--" + m95040s() + "-->";
        }

        /* JADX INFO: renamed from: p */
        public final C43222d m95037p(char c11) {
            m95039r();
            this.f95434b.append(c11);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public final C43222d m95038q(String str) {
            m95039r();
            if (this.f95434b.length() == 0) {
                this.f95435c = str;
                return this;
            }
            this.f95434b.append(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.parser.Token$e */
    public static final class C43223e extends Token {

        /* JADX INFO: renamed from: b */
        public final StringBuilder f95437b;

        /* JADX INFO: renamed from: c */
        public String f95438c;

        /* JADX INFO: renamed from: d */
        public final StringBuilder f95439d;

        /* JADX INFO: renamed from: e */
        public final StringBuilder f95440e;

        /* JADX INFO: renamed from: f */
        public boolean f95441f;

        public C43223e() {
            super();
            this.f95437b = new StringBuilder();
            this.f95438c = null;
            this.f95439d = new StringBuilder();
            this.f95440e = new StringBuilder();
            this.f95441f = false;
            this.f95431a = TokenType.Doctype;
        }

        @Override // org.jsoup.parser.Token
        /* JADX INFO: renamed from: m */
        public Token mo95033m() {
            Token.m95020n(this.f95437b);
            this.f95438c = null;
            Token.m95020n(this.f95439d);
            Token.m95020n(this.f95440e);
            this.f95441f = false;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public String m95041p() {
            return this.f95437b.toString();
        }

        /* JADX INFO: renamed from: q */
        public String m95042q() {
            return this.f95438c;
        }

        /* JADX INFO: renamed from: r */
        public String m95043r() {
            return this.f95439d.toString();
        }

        /* JADX INFO: renamed from: s */
        public String m95044s() {
            return this.f95440e.toString();
        }

        /* JADX INFO: renamed from: t */
        public boolean m95045t() {
            return this.f95441f;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.parser.Token$g */
    public static final class C43225g extends AbstractC43227i {
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("</");
            String str = this.f95442b;
            if (str == null) {
                str = "(unset)";
            }
            sb2.append(str);
            sb2.append(">");
            return sb2.toString();
        }

        public C43225g() {
            this.f95431a = TokenType.EndTag;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.parser.Token$h */
    public static final class C43226h extends AbstractC43227i {
        /* JADX INFO: renamed from: G */
        public C43226h m95047G(String str, C43184b c43184b) {
            this.f95442b = str;
            this.f95450j = c43184b;
            this.f95443c = C43092b.m94679a(str);
            return this;
        }

        public String toString() {
            C43184b c43184b = this.f95450j;
            if (c43184b == null || c43184b.size() <= 0) {
                return "<" + m95048A() + ">";
            }
            return "<" + m95048A() + C33627eb.f69716f + this.f95450j.toString() + ">";
        }

        public C43226h() {
            this.f95431a = TokenType.StartTag;
        }

        @Override // org.jsoup.parser.Token.AbstractC43227i, org.jsoup.parser.Token
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public AbstractC43227i mo95033m() {
            super.mo95033m();
            this.f95450j = null;
            return this;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.parser.Token$i */
    public static abstract class AbstractC43227i extends Token {

        /* JADX INFO: renamed from: b */
        public String f95442b;

        /* JADX INFO: renamed from: c */
        public String f95443c;

        /* JADX INFO: renamed from: d */
        public String f95444d;

        /* JADX INFO: renamed from: e */
        public StringBuilder f95445e;

        /* JADX INFO: renamed from: f */
        public String f95446f;

        /* JADX INFO: renamed from: g */
        public boolean f95447g;

        /* JADX INFO: renamed from: h */
        public boolean f95448h;

        /* JADX INFO: renamed from: i */
        public boolean f95449i;

        /* JADX INFO: renamed from: j */
        public C43184b f95450j;

        public AbstractC43227i() {
            super();
            this.f95445e = new StringBuilder();
            this.f95447g = false;
            this.f95448h = false;
            this.f95449i = false;
        }

        @Override // org.jsoup.parser.Token
        /* JADX INFO: renamed from: E */
        public AbstractC43227i mo95033m() {
            this.f95442b = null;
            this.f95443c = null;
            this.f95444d = null;
            Token.m95020n(this.f95445e);
            this.f95446f = null;
            this.f95447g = false;
            this.f95448h = false;
            this.f95449i = false;
            this.f95450j = null;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public final void m95052F() {
            this.f95447g = true;
        }

        /* JADX INFO: renamed from: w */
        public final void m95060w() {
            this.f95448h = true;
            String str = this.f95446f;
            if (str != null) {
                this.f95445e.append(str);
                this.f95446f = null;
            }
        }

        /* JADX INFO: renamed from: A */
        public final String m95048A() {
            String str = this.f95442b;
            C42841b.m93950b(str == null || str.length() == 0);
            return this.f95442b;
        }

        /* JADX INFO: renamed from: B */
        public final AbstractC43227i m95049B(String str) {
            this.f95442b = str;
            this.f95443c = C43092b.m94679a(str);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final void m95050C() {
            String string;
            if (this.f95450j == null) {
                this.f95450j = new C43184b();
            }
            String str = this.f95444d;
            if (str != null) {
                String strTrim = str.trim();
                this.f95444d = strTrim;
                if (strTrim.length() > 0) {
                    if (this.f95448h) {
                        string = this.f95445e.length() > 0 ? this.f95445e.toString() : this.f95446f;
                    } else {
                        string = this.f95447g ? "" : null;
                    }
                    this.f95450j.m94940d(this.f95444d, string);
                }
            }
            this.f95444d = null;
            this.f95447g = false;
            this.f95448h = false;
            Token.m95020n(this.f95445e);
            this.f95446f = null;
        }

        /* JADX INFO: renamed from: D */
        public final String m95051D() {
            return this.f95443c;
        }

        /* JADX INFO: renamed from: q */
        public final void m95054q(String str) {
            String str2 = this.f95444d;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f95444d = str;
        }

        /* JADX INFO: renamed from: v */
        public final void m95059v(String str) {
            String str2 = this.f95442b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f95442b = str;
            this.f95443c = C43092b.m94679a(str);
        }

        /* JADX INFO: renamed from: x */
        public final void m95061x() {
            if (this.f95444d != null) {
                m95050C();
            }
        }

        /* JADX INFO: renamed from: y */
        public final C43184b m95062y() {
            if (this.f95450j == null) {
                this.f95450j = new C43184b();
            }
            return this.f95450j;
        }

        /* JADX INFO: renamed from: z */
        public final boolean m95063z() {
            return this.f95449i;
        }

        /* JADX INFO: renamed from: p */
        public final void m95053p(char c11) {
            m95054q(String.valueOf(c11));
        }

        /* JADX INFO: renamed from: r */
        public final void m95055r(char c11) {
            m95060w();
            this.f95445e.append(c11);
        }

        /* JADX INFO: renamed from: s */
        public final void m95056s(String str) {
            m95060w();
            if (this.f95445e.length() == 0) {
                this.f95446f = str;
            } else {
                this.f95445e.append(str);
            }
        }

        /* JADX INFO: renamed from: t */
        public final void m95057t(int[] iArr) {
            m95060w();
            for (int i11 : iArr) {
                this.f95445e.appendCodePoint(i11);
            }
        }

        /* JADX INFO: renamed from: u */
        public final void m95058u(char c11) {
            m95059v(String.valueOf(c11));
        }
    }

    /* JADX INFO: renamed from: a */
    public final C43221c m95021a() {
        return (C43221c) this;
    }

    /* JADX INFO: renamed from: b */
    public final C43222d m95022b() {
        return (C43222d) this;
    }

    /* JADX INFO: renamed from: c */
    public final C43223e m95023c() {
        return (C43223e) this;
    }

    /* JADX INFO: renamed from: d */
    public final C43225g m95024d() {
        return (C43225g) this;
    }

    /* JADX INFO: renamed from: e */
    public final C43226h m95025e() {
        return (C43226h) this;
    }

    /* JADX INFO: renamed from: m */
    public abstract Token mo95033m();

    public Token() {
    }

    /* JADX INFO: renamed from: n */
    public static void m95020n(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m95026f() {
        return this instanceof C43220b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m95027g() {
        return this.f95431a == TokenType.Character;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m95028h() {
        return this.f95431a == TokenType.Comment;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m95029i() {
        return this.f95431a == TokenType.Doctype;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m95030j() {
        return this.f95431a == TokenType.EOF;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m95031k() {
        return this.f95431a == TokenType.EndTag;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m95032l() {
        return this.f95431a == TokenType.StartTag;
    }

    /* JADX INFO: renamed from: o */
    public String m95034o() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: org.jsoup.parser.Token$f */
    public static final class C43224f extends Token {
        public C43224f() {
            super();
            this.f95431a = TokenType.EOF;
        }

        @Override // org.jsoup.parser.Token
        /* JADX INFO: renamed from: m */
        public Token mo95033m() {
            return this;
        }
    }
}
