package io.noties.markwon.html.jsoup.parser;

import androidx.annotation.NonNull;
import com.tencent.bugly.proguard.C33627eb;
import hf0.C38192a;
import hf0.C38193b;
import if0.C38529b;

/* JADX INFO: loaded from: classes60.dex */
public abstract class Token {

    /* JADX INFO: renamed from: a */
    public final TokenType f87011a;

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.Token$a */
    public static final class C39138a extends C39139b {
        @Override // io.noties.markwon.html.jsoup.parser.Token.C39139b
        public String toString() {
            return "<![CDATA[" + m87845d() + "]]>";
        }

        public C39138a(String str) {
            m87844c(str);
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.Token$b */
    public static class C39139b extends Token {

        /* JADX INFO: renamed from: b */
        public String f87013b;

        @Override // io.noties.markwon.html.jsoup.parser.Token
        /* JADX INFO: renamed from: a */
        public Token mo87843a() {
            this.f87013b = null;
            return this;
        }

        public C39139b() {
            super(TokenType.Character);
        }

        /* JADX INFO: renamed from: c */
        public C39139b m87844c(String str) {
            this.f87013b = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public String m87845d() {
            return this.f87013b;
        }

        public String toString() {
            return m87845d();
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.Token$c */
    public static final class C39140c extends Token {

        /* JADX INFO: renamed from: b */
        public final StringBuilder f87014b;

        /* JADX INFO: renamed from: c */
        public boolean f87015c;

        public C39140c() {
            super(TokenType.Comment);
            this.f87014b = new StringBuilder();
            this.f87015c = false;
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        /* JADX INFO: renamed from: a */
        public Token mo87843a() {
            Token.m87842b(this.f87014b);
            this.f87015c = false;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public String m87846c() {
            return this.f87014b.toString();
        }

        public String toString() {
            return "<!--" + m87846c() + "-->";
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.Token$d */
    public static final class C39141d extends Token {

        /* JADX INFO: renamed from: b */
        public final StringBuilder f87016b;

        /* JADX INFO: renamed from: c */
        public String f87017c;

        /* JADX INFO: renamed from: d */
        public final StringBuilder f87018d;

        /* JADX INFO: renamed from: e */
        public final StringBuilder f87019e;

        /* JADX INFO: renamed from: f */
        public boolean f87020f;

        public C39141d() {
            super(TokenType.Doctype);
            this.f87016b = new StringBuilder();
            this.f87017c = null;
            this.f87018d = new StringBuilder();
            this.f87019e = new StringBuilder();
            this.f87020f = false;
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        /* JADX INFO: renamed from: a */
        public Token mo87843a() {
            Token.m87842b(this.f87016b);
            this.f87017c = null;
            Token.m87842b(this.f87018d);
            Token.m87842b(this.f87019e);
            this.f87020f = false;
            return this;
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.Token$e */
    public static final class C39142e extends Token {
        public C39142e() {
            super(TokenType.EOF);
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        /* JADX INFO: renamed from: a */
        public Token mo87843a() {
            return this;
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.Token$f */
    public static final class C39143f extends AbstractC39145h {
        public C39143f() {
            super(TokenType.EndTag);
        }

        public String toString() {
            return "</" + m87858m() + ">";
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.Token$g */
    public static final class C39144g extends AbstractC39145h {
        public C39144g() {
            super(TokenType.StartTag);
            this.f87029j = new C38529b();
        }

        public String toString() {
            C38529b c38529b = this.f87029j;
            if (c38529b == null || c38529b.size() <= 0) {
                return "<" + m87858m() + ">";
            }
            return "<" + m87858m() + C33627eb.f69716f + this.f87029j.toString() + ">";
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token.AbstractC39145h, io.noties.markwon.html.jsoup.parser.Token
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public AbstractC39145h mo87843a() {
            super.mo87843a();
            this.f87029j = new C38529b();
            return this;
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.Token$h */
    public static abstract class AbstractC39145h extends Token {

        /* JADX INFO: renamed from: b */
        public String f87021b;

        /* JADX INFO: renamed from: c */
        public String f87022c;

        /* JADX INFO: renamed from: d */
        public String f87023d;

        /* JADX INFO: renamed from: e */
        public StringBuilder f87024e;

        /* JADX INFO: renamed from: f */
        public String f87025f;

        /* JADX INFO: renamed from: g */
        public boolean f87026g;

        /* JADX INFO: renamed from: h */
        public boolean f87027h;

        /* JADX INFO: renamed from: i */
        public boolean f87028i;

        /* JADX INFO: renamed from: j */
        public C38529b f87029j;

        /* JADX INFO: renamed from: j */
        public final void m87855j() {
            this.f87027h = true;
            String str = this.f87025f;
            if (str != null) {
                this.f87024e.append(str);
                this.f87025f = null;
            }
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        /* JADX INFO: renamed from: o */
        public AbstractC39145h mo87843a() {
            this.f87021b = null;
            this.f87022c = null;
            this.f87023d = null;
            Token.m87842b(this.f87024e);
            this.f87025f = null;
            this.f87026g = false;
            this.f87027h = false;
            this.f87028i = false;
            this.f87029j = null;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public final void m87860p() {
            this.f87026g = true;
        }

        /* JADX INFO: renamed from: d */
        public final void m87849d(String str) {
            String str2 = this.f87023d;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f87023d = str;
        }

        /* JADX INFO: renamed from: i */
        public final void m87854i(String str) {
            String str2 = this.f87021b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f87021b = str;
            this.f87022c = C38192a.m86175a(str);
        }

        /* JADX INFO: renamed from: k */
        public final void m87856k() {
            if (this.f87023d != null) {
                m87859n();
            }
        }

        /* JADX INFO: renamed from: l */
        public final AbstractC39145h m87857l(String str) {
            this.f87021b = str;
            this.f87022c = C38192a.m86175a(str);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final String m87858m() {
            String str = this.f87021b;
            C38193b.m86177b(str == null || str.length() == 0);
            return this.f87021b;
        }

        /* JADX INFO: renamed from: n */
        public final void m87859n() {
            String string;
            if (this.f87029j == null) {
                this.f87029j = new C38529b();
            }
            String str = this.f87023d;
            if (str != null) {
                String strTrim = str.trim();
                this.f87023d = strTrim;
                if (strTrim.length() > 0) {
                    if (this.f87027h) {
                        string = this.f87024e.length() > 0 ? this.f87024e.toString() : this.f87025f;
                    } else {
                        string = this.f87026g ? "" : null;
                    }
                    this.f87029j.m87156j(this.f87023d, string);
                }
            }
            this.f87023d = null;
            this.f87026g = false;
            this.f87027h = false;
            Token.m87842b(this.f87024e);
            this.f87025f = null;
        }

        public AbstractC39145h(@NonNull TokenType tokenType) {
            super(tokenType);
            this.f87024e = new StringBuilder();
            this.f87026g = false;
            this.f87027h = false;
            this.f87028i = false;
        }

        /* JADX INFO: renamed from: c */
        public final void m87848c(char c11) {
            m87849d(String.valueOf(c11));
        }

        /* JADX INFO: renamed from: e */
        public final void m87850e(char c11) {
            m87855j();
            this.f87024e.append(c11);
        }

        /* JADX INFO: renamed from: f */
        public final void m87851f(String str) {
            m87855j();
            if (this.f87024e.length() == 0) {
                this.f87025f = str;
            } else {
                this.f87024e.append(str);
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m87852g(int[] iArr) {
            m87855j();
            for (int i11 : iArr) {
                this.f87024e.appendCodePoint(i11);
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m87853h(char c11) {
            m87854i(String.valueOf(c11));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Token mo87843a();

    /* JADX INFO: renamed from: b */
    public static void m87842b(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public Token(@NonNull TokenType tokenType) {
        this.f87011a = tokenType;
    }
}
