package org.jsoup.parser;

import com.tencent.bugly.proguard.RunnableC33958ua;
import java.util.Arrays;
import nh0.C42841b;
import org.jsoup.nodes.Entities;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: org.jsoup.parser.h */
/* JADX INFO: compiled from: Tokeniser.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C43302h {

    /* JADX INFO: renamed from: r */
    public static final char[] f95510r;

    /* JADX INFO: renamed from: s */
    public static final int[] f95511s;

    /* JADX INFO: renamed from: a */
    public final C43295a f95512a;

    /* JADX INFO: renamed from: b */
    public final ParseErrorList f95513b;

    /* JADX INFO: renamed from: d */
    public Token f95515d;

    /* JADX INFO: renamed from: i */
    public Token.AbstractC43227i f95520i;

    /* JADX INFO: renamed from: o */
    public String f95526o;

    /* JADX INFO: renamed from: c */
    public TokeniserState f95514c = TokeniserState.Data;

    /* JADX INFO: renamed from: e */
    public boolean f95516e = false;

    /* JADX INFO: renamed from: f */
    public String f95517f = null;

    /* JADX INFO: renamed from: g */
    public StringBuilder f95518g = new StringBuilder(1024);

    /* JADX INFO: renamed from: h */
    public StringBuilder f95519h = new StringBuilder(1024);

    /* JADX INFO: renamed from: j */
    public Token.C43226h f95521j = new Token.C43226h();

    /* JADX INFO: renamed from: k */
    public Token.C43225g f95522k = new Token.C43225g();

    /* JADX INFO: renamed from: l */
    public Token.C43221c f95523l = new Token.C43221c();

    /* JADX INFO: renamed from: m */
    public Token.C43223e f95524m = new Token.C43223e();

    /* JADX INFO: renamed from: n */
    public Token.C43222d f95525n = new Token.C43222d();

    /* JADX INFO: renamed from: p */
    public final int[] f95527p = new int[1];

    /* JADX INFO: renamed from: q */
    public final int[] f95528q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', Typography.less, Typography.amp};
        f95510r = cArr;
        f95511s = new int[]{8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, BuiltinOperator.UNSORTED_SEGMENT_MIN, 382, 376};
        Arrays.sort(cArr);
    }

    /* JADX INFO: renamed from: a */
    public void m95230a(TokeniserState tokeniserState) {
        this.f95512a.m95083a();
        this.f95514c = tokeniserState;
    }

    /* JADX INFO: renamed from: b */
    public String m95231b() {
        return this.f95526o;
    }

    /* JADX INFO: renamed from: c */
    public final void m95232c(String str) {
        if (this.f95513b.canAddError()) {
            this.f95513b.add(new C43297c(this.f95512a.m95079H(), "Invalid character reference: %s", str));
        }
    }

    /* JADX INFO: renamed from: d */
    public int[] m95233d(Character ch2, boolean z11) {
        int iIntValue;
        if (this.f95512a.m95101t()) {
            return null;
        }
        if ((ch2 != null && ch2.charValue() == this.f95512a.m95100s()) || this.f95512a.m95073B(f95510r)) {
            return null;
        }
        int[] iArr = this.f95527p;
        this.f95512a.m95103v();
        if (this.f95512a.m95104w(RunnableC33958ua.f72251f)) {
            boolean zM95105x = this.f95512a.m95105x("X");
            C43295a c43295a = this.f95512a;
            String strM95089h = zM95105x ? c43295a.m95089h() : c43295a.m95088g();
            if (strM95089h.length() == 0) {
                m95232c("numeric reference with no numerals");
                this.f95512a.m95080J();
                return null;
            }
            this.f95512a.m95082L();
            if (!this.f95512a.m95104w(";")) {
                m95232c("missing semicolon");
            }
            try {
                iIntValue = Integer.valueOf(strM95089h, zM95105x ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                m95232c("character outside of valid range");
                iArr[0] = 65533;
                return iArr;
            }
            if (iIntValue >= 128) {
                int[] iArr2 = f95511s;
                if (iIntValue < iArr2.length + 128) {
                    m95232c("character is not a valid unicode code point");
                    iIntValue = iArr2[iIntValue - 128];
                }
            }
            iArr[0] = iIntValue;
            return iArr;
        }
        String strM95091j = this.f95512a.m95091j();
        boolean zM95106y = this.f95512a.m95106y(';');
        if (!Entities.m94913f(strM95091j) && (!Entities.m94914g(strM95091j) || !zM95106y)) {
            this.f95512a.m95080J();
            if (zM95106y) {
                m95232c("invalid named reference");
            }
            return null;
        }
        if (z11 && (this.f95512a.m95076E() || this.f95512a.m95074C() || this.f95512a.m95072A('=', '-', '_'))) {
            this.f95512a.m95080J();
            return null;
        }
        this.f95512a.m95082L();
        if (!this.f95512a.m95104w(";")) {
            m95232c("missing semicolon");
        }
        int iM94911d = Entities.m94911d(strM95091j, this.f95528q);
        if (iM94911d == 1) {
            iArr[0] = this.f95528q[0];
            return iArr;
        }
        if (iM94911d == 2) {
            return this.f95528q;
        }
        C42841b.m93949a("Unexpected characters returned for " + strM95091j);
        return this.f95528q;
    }

    /* JADX INFO: renamed from: e */
    public void m95234e() {
        this.f95525n.mo95033m();
        this.f95525n.f95436d = true;
    }

    /* JADX INFO: renamed from: f */
    public void m95235f() {
        this.f95525n.mo95033m();
    }

    /* JADX INFO: renamed from: g */
    public void m95236g() {
        this.f95524m.mo95033m();
    }

    /* JADX INFO: renamed from: h */
    public Token.AbstractC43227i m95237h(boolean z11) {
        Token.AbstractC43227i abstractC43227iMo95033m = z11 ? this.f95521j.mo95033m() : this.f95522k.mo95033m();
        this.f95520i = abstractC43227iMo95033m;
        return abstractC43227iMo95033m;
    }

    /* JADX INFO: renamed from: i */
    public void m95238i() {
        Token.m95020n(this.f95519h);
    }

    /* JADX INFO: renamed from: k */
    public void m95240k(String str) {
        if (this.f95517f == null) {
            this.f95517f = str;
            return;
        }
        if (this.f95518g.length() == 0) {
            this.f95518g.append(this.f95517f);
        }
        this.f95518g.append(str);
    }

    /* JADX INFO: renamed from: l */
    public void m95241l(Token token) {
        C42841b.m93950b(this.f95516e);
        this.f95515d = token;
        this.f95516e = true;
        Token.TokenType tokenType = token.f95431a;
        if (tokenType == Token.TokenType.StartTag) {
            this.f95526o = ((Token.C43226h) token).f95442b;
        } else {
            if (tokenType != Token.TokenType.EndTag || ((Token.C43225g) token).f95450j == null) {
                return;
            }
            m95247r("Attributes incorrectly present on end tag");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m95242m(int[] iArr) {
        m95240k(new String(iArr, 0, iArr.length));
    }

    /* JADX INFO: renamed from: n */
    public void m95243n() {
        m95241l(this.f95525n);
    }

    /* JADX INFO: renamed from: o */
    public void m95244o() {
        m95241l(this.f95524m);
    }

    /* JADX INFO: renamed from: p */
    public void m95245p() {
        this.f95520i.m95061x();
        m95241l(this.f95520i);
    }

    /* JADX INFO: renamed from: q */
    public void m95246q(TokeniserState tokeniserState) {
        if (this.f95513b.canAddError()) {
            this.f95513b.add(new C43297c(this.f95512a.m95079H(), "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m95247r(String str) {
        if (this.f95513b.canAddError()) {
            this.f95513b.add(new C43297c(this.f95512a.m95079H(), str));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m95248s(TokeniserState tokeniserState) {
        if (this.f95513b.canAddError()) {
            this.f95513b.add(new C43297c(this.f95512a.m95079H(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f95512a.m95100s()), tokeniserState));
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m95249t() {
        return this.f95526o != null && this.f95520i.m95048A().equalsIgnoreCase(this.f95526o);
    }

    /* JADX INFO: renamed from: u */
    public Token m95250u() {
        while (!this.f95516e) {
            this.f95514c.read(this, this.f95512a);
        }
        StringBuilder sb2 = this.f95518g;
        if (sb2.length() != 0) {
            String string = sb2.toString();
            sb2.delete(0, sb2.length());
            this.f95517f = null;
            return this.f95523l.m95035p(string);
        }
        String str = this.f95517f;
        if (str == null) {
            this.f95516e = false;
            return this.f95515d;
        }
        Token.C43221c c43221cM95035p = this.f95523l.m95035p(str);
        this.f95517f = null;
        return c43221cM95035p;
    }

    /* JADX INFO: renamed from: v */
    public void m95251v(TokeniserState tokeniserState) {
        this.f95514c = tokeniserState;
    }

    public C43302h(C43295a c43295a, ParseErrorList parseErrorList) {
        this.f95512a = c43295a;
        this.f95513b = parseErrorList;
    }

    /* JADX INFO: renamed from: j */
    public void m95239j(char c11) {
        m95240k(String.valueOf(c11));
    }
}
