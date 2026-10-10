package io.noties.markwon.html.jsoup.parser;

import com.tencent.bugly.proguard.RunnableC33958ua;
import hf0.C38193b;
import if0.AbstractC38530c;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.c */
/* JADX INFO: compiled from: Tokeniser.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C39215c {

    /* JADX INFO: renamed from: r */
    public static final char[] f87042r;

    /* JADX INFO: renamed from: s */
    public static final int[] f87043s;

    /* JADX INFO: renamed from: a */
    public final C39213a f87044a;

    /* JADX INFO: renamed from: b */
    public final ParseErrorList f87045b;

    /* JADX INFO: renamed from: d */
    public Token f87047d;

    /* JADX INFO: renamed from: i */
    public Token.AbstractC39145h f87052i;

    /* JADX INFO: renamed from: o */
    public String f87058o;

    /* JADX INFO: renamed from: c */
    public TokeniserState f87046c = TokeniserState.Data;

    /* JADX INFO: renamed from: e */
    public boolean f87048e = false;

    /* JADX INFO: renamed from: f */
    public String f87049f = null;

    /* JADX INFO: renamed from: g */
    public StringBuilder f87050g = new StringBuilder(1024);

    /* JADX INFO: renamed from: h */
    public StringBuilder f87051h = new StringBuilder(1024);

    /* JADX INFO: renamed from: j */
    public Token.C39144g f87053j = new Token.C39144g();

    /* JADX INFO: renamed from: k */
    public Token.C39143f f87054k = new Token.C39143f();

    /* JADX INFO: renamed from: l */
    public Token.C39139b f87055l = new Token.C39139b();

    /* JADX INFO: renamed from: m */
    public Token.C39141d f87056m = new Token.C39141d();

    /* JADX INFO: renamed from: n */
    public Token.C39140c f87057n = new Token.C39140c();

    /* JADX INFO: renamed from: p */
    public final int[] f87059p = new int[1];

    /* JADX INFO: renamed from: q */
    public final int[] f87060q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', Typography.less, Typography.amp};
        f87042r = cArr;
        f87043s = new int[]{8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, BuiltinOperator.UNSORTED_SEGMENT_MIN, 382, 376};
        Arrays.sort(cArr);
    }

    /* JADX INFO: renamed from: a */
    public void m87902a(TokeniserState tokeniserState) {
        this.f87044a.m87877a();
        this.f87046c = tokeniserState;
    }

    /* JADX INFO: renamed from: b */
    public String m87903b() {
        return this.f87058o;
    }

    /* JADX INFO: renamed from: c */
    public final void m87904c(String str) {
        if (this.f87045b.canAddError()) {
            this.f87045b.add(new C39214b(this.f87044a.m87874F(), "Invalid character reference: %s", str));
        }
    }

    /* JADX INFO: renamed from: d */
    public int[] m87905d(Character ch2, boolean z11) {
        int iIntValue;
        if (this.f87044a.m87893r()) {
            return null;
        }
        if ((ch2 != null && ch2.charValue() == this.f87044a.m87892q()) || this.f87044a.m87901z(f87042r)) {
            return null;
        }
        int[] iArr = this.f87059p;
        this.f87044a.m87895t();
        if (this.f87044a.m87896u(RunnableC33958ua.f72251f)) {
            boolean zM87897v = this.f87044a.m87897v("X");
            C39213a c39213a = this.f87044a;
            String strM87882g = zM87897v ? c39213a.m87882g() : c39213a.m87881f();
            if (strM87882g.length() == 0) {
                m87904c("numeric reference with no numerals");
                this.f87044a.m87875H();
                return null;
            }
            if (!this.f87044a.m87896u(";")) {
                m87904c("missing semicolon");
            }
            try {
                iIntValue = Integer.valueOf(strM87882g, zM87897v ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                m87904c("character outside of valid range");
                iArr[0] = 65533;
                return iArr;
            }
            if (iIntValue >= 128) {
                int[] iArr2 = f87043s;
                if (iIntValue < iArr2.length + 128) {
                    m87904c("character is not a valid unicode code point");
                    iIntValue = iArr2[iIntValue - 128];
                }
            }
            iArr[0] = iIntValue;
            return iArr;
        }
        String strM87884i = this.f87044a.m87884i();
        boolean zM87898w = this.f87044a.m87898w(';');
        if (!AbstractC38530c.m87160b(strM87884i) || !zM87898w) {
            this.f87044a.m87875H();
            if (zM87898w) {
                m87904c(String.format("invalid named referenece '%s'", strM87884i));
            }
            return null;
        }
        if (z11 && (this.f87044a.m87871C() || this.f87044a.m87869A() || this.f87044a.m87900y('=', '-', '_'))) {
            this.f87044a.m87875H();
            return null;
        }
        if (!this.f87044a.m87896u(";")) {
            m87904c("missing semicolon");
        }
        int iM87159a = AbstractC38530c.m87159a(strM87884i, this.f87060q);
        if (iM87159a == 1) {
            iArr[0] = this.f87060q[0];
            return iArr;
        }
        if (iM87159a == 2) {
            return this.f87060q;
        }
        C38193b.m86176a("Unexpected characters returned for " + strM87884i);
        return this.f87060q;
    }

    /* JADX INFO: renamed from: e */
    public void m87906e() {
        this.f87057n.mo87843a();
    }

    /* JADX INFO: renamed from: f */
    public void m87907f() {
        this.f87056m.mo87843a();
    }

    /* JADX INFO: renamed from: g */
    public Token.AbstractC39145h m87908g(boolean z11) {
        Token.AbstractC39145h abstractC39145hMo87843a = z11 ? this.f87053j.mo87843a() : this.f87054k.mo87843a();
        this.f87052i = abstractC39145hMo87843a;
        return abstractC39145hMo87843a;
    }

    /* JADX INFO: renamed from: h */
    public void m87909h() {
        Token.m87842b(this.f87051h);
    }

    /* JADX INFO: renamed from: j */
    public void m87911j(Token token) {
        C38193b.m86178c(this.f87048e, "There is an unread token pending!");
        this.f87047d = token;
        this.f87048e = true;
        Token.TokenType tokenType = token.f87011a;
        if (tokenType == Token.TokenType.StartTag) {
            this.f87058o = ((Token.C39144g) token).f87021b;
        } else {
            if (tokenType != Token.TokenType.EndTag || ((Token.C39143f) token).f87029j == null) {
                return;
            }
            m87919r("Attributes incorrectly present on end tag");
        }
    }

    /* JADX INFO: renamed from: k */
    public void m87912k(String str) {
        if (this.f87049f == null) {
            this.f87049f = str;
            return;
        }
        if (this.f87050g.length() == 0) {
            this.f87050g.append(this.f87049f);
        }
        this.f87050g.append(str);
    }

    /* JADX INFO: renamed from: l */
    public void m87913l(int[] iArr) {
        m87912k(new String(iArr, 0, iArr.length));
    }

    /* JADX INFO: renamed from: m */
    public void m87914m() {
        m87911j(this.f87057n);
    }

    /* JADX INFO: renamed from: n */
    public void m87915n() {
        m87911j(this.f87056m);
    }

    /* JADX INFO: renamed from: o */
    public void m87916o() {
        this.f87052i.m87856k();
        m87911j(this.f87052i);
    }

    /* JADX INFO: renamed from: p */
    public void m87917p(TokeniserState tokeniserState) {
        if (this.f87045b.canAddError()) {
            this.f87045b.add(new C39214b(this.f87044a.m87874F(), "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m87918q(TokeniserState tokeniserState) {
        if (this.f87045b.canAddError()) {
            this.f87045b.add(new C39214b(this.f87044a.m87874F(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f87044a.m87892q()), tokeniserState));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m87919r(String str) {
        if (this.f87045b.canAddError()) {
            this.f87045b.add(new C39214b(this.f87044a.m87874F(), str));
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m87920s() {
        return this.f87058o != null && this.f87052i.m87858m().equalsIgnoreCase(this.f87058o);
    }

    /* JADX INFO: renamed from: t */
    public Token m87921t() {
        while (!this.f87048e) {
            this.f87046c.read(this, this.f87044a);
        }
        if (this.f87050g.length() > 0) {
            String string = this.f87050g.toString();
            StringBuilder sb2 = this.f87050g;
            sb2.delete(0, sb2.length());
            this.f87049f = null;
            return this.f87055l.m87844c(string);
        }
        String str = this.f87049f;
        if (str == null) {
            this.f87048e = false;
            return this.f87047d;
        }
        Token.C39139b c39139bM87844c = this.f87055l.m87844c(str);
        this.f87049f = null;
        return c39139bM87844c;
    }

    /* JADX INFO: renamed from: u */
    public void m87922u(TokeniserState tokeniserState) {
        this.f87046c = tokeniserState;
    }

    public C39215c(C39213a c39213a, ParseErrorList parseErrorList) {
        this.f87044a = c39213a;
        this.f87045b = parseErrorList;
    }

    /* JADX INFO: renamed from: i */
    public void m87910i(char c11) {
        m87912k(String.valueOf(c11));
    }
}
