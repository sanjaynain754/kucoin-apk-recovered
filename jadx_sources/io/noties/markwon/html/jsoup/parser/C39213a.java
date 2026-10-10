package io.noties.markwon.html.jsoup.parser;

import hf0.C38193b;
import io.noties.markwon.html.jsoup.UncheckedIOException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;
import p852kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.a */
/* JADX INFO: compiled from: CharacterReader.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C39213a {

    /* JADX INFO: renamed from: a */
    public final char[] f87032a;

    /* JADX INFO: renamed from: b */
    public final Reader f87033b;

    /* JADX INFO: renamed from: c */
    public int f87034c;

    /* JADX INFO: renamed from: d */
    public int f87035d;

    /* JADX INFO: renamed from: e */
    public int f87036e;

    /* JADX INFO: renamed from: f */
    public int f87037f;

    /* JADX INFO: renamed from: g */
    public int f87038g;

    /* JADX INFO: renamed from: h */
    public final String[] f87039h;

    public C39213a(Reader reader, int i11) {
        this.f87039h = new String[128];
        C38193b.m86181f(reader);
        C38193b.m86179d(reader.markSupported());
        this.f87033b = reader;
        this.f87032a = new char[4096];
        m87878b();
    }

    /* JADX INFO: renamed from: c */
    public static String m87868c(char[] cArr, String[] strArr, int i11, int i12) {
        if (i12 > 12) {
            return new String(cArr, i11, i12);
        }
        if (i12 < 1) {
            return "";
        }
        int i13 = 0;
        int i14 = i11;
        int i15 = 0;
        while (i13 < i12) {
            i15 = (i15 * 31) + cArr[i14];
            i13++;
            i14++;
        }
        int length = i15 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i11, i12);
            strArr[length] = str2;
            return str2;
        }
        if (m87867G(cArr, i11, i12, str)) {
            return str;
        }
        String str3 = new String(cArr, i11, i12);
        strArr[length] = str3;
        return str3;
    }

    /* JADX INFO: renamed from: F */
    public int m87874F() {
        return this.f87037f + this.f87036e;
    }

    /* JADX INFO: renamed from: H */
    public void m87875H() {
        this.f87036e = this.f87038g;
    }

    /* JADX INFO: renamed from: I */
    public void m87876I() {
        this.f87036e--;
    }

    /* JADX INFO: renamed from: a */
    public void m87877a() {
        this.f87036e++;
    }

    /* JADX INFO: renamed from: b */
    public final void m87878b() {
        int i11 = this.f87036e;
        if (i11 < this.f87035d) {
            return;
        }
        try {
            this.f87033b.skip(i11);
            this.f87033b.mark(4096);
            int i12 = this.f87033b.read(this.f87032a);
            this.f87033b.reset();
            if (i12 != -1) {
                this.f87034c = i12;
                this.f87037f += this.f87036e;
                this.f87036e = 0;
                this.f87038g = 0;
                if (i12 > 3072) {
                    i12 = 3072;
                }
                this.f87035d = i12;
            }
        } catch (IOException e11) {
            throw new UncheckedIOException(e11);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m87891p(String str) {
        Locale locale = Locale.ENGLISH;
        return m87873E(str.toLowerCase(locale)) > -1 || m87873E(str.toUpperCase(locale)) > -1;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m87894s() {
        return this.f87036e >= this.f87034c;
    }

    /* JADX INFO: renamed from: t */
    public void m87895t() {
        this.f87038g = this.f87036e;
    }

    public String toString() {
        char[] cArr = this.f87032a;
        int i11 = this.f87036e;
        return new String(cArr, i11, this.f87034c - i11);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m87867G(char[] cArr, int i11, int i12, String str) {
        if (i12 != str.length()) {
            return false;
        }
        int i13 = 0;
        while (true) {
            int i14 = i12 - 1;
            if (i12 != 0) {
                int i15 = i11 + 1;
                int i16 = i13 + 1;
                if (cArr[i11] != str.charAt(i13)) {
                    return false;
                }
                i11 = i15;
                i12 = i14;
                i13 = i16;
            } else {
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public boolean m87869A() {
        char c11;
        if (m87893r() || (c11 = this.f87032a[this.f87036e]) < '0' || c11 > '9') {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public boolean m87870B(String str) {
        m87878b();
        int length = str.length();
        if (length > this.f87034c - this.f87036e) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (Character.toUpperCase(str.charAt(i11)) != Character.toUpperCase(this.f87032a[this.f87036e + i11])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public boolean m87871C() {
        if (m87893r()) {
            return false;
        }
        char c11 = this.f87032a[this.f87036e];
        if (c11 < 'A' || c11 > 'Z') {
            if ((c11 < 'a' || c11 > 'z') && !Character.isLetter(c11)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public int m87872D(char c11) {
        m87878b();
        for (int i11 = this.f87036e; i11 < this.f87034c; i11++) {
            if (c11 == this.f87032a[i11]) {
                return i11 - this.f87036e;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: E */
    public int m87873E(CharSequence charSequence) {
        m87878b();
        char cCharAt = charSequence.charAt(0);
        int i11 = this.f87036e;
        while (i11 < this.f87034c) {
            if (cCharAt != this.f87032a[i11]) {
                do {
                    i11++;
                    if (i11 >= this.f87034c) {
                        break;
                    }
                } while (cCharAt != this.f87032a[i11]);
            }
            int i12 = i11 + 1;
            int length = (charSequence.length() + i12) - 1;
            int i13 = this.f87034c;
            if (i11 < i13 && length <= i13) {
                int i14 = i12;
                for (int i15 = 1; i14 < length && charSequence.charAt(i15) == this.f87032a[i14]; i15++) {
                    i14++;
                }
                if (i14 == length) {
                    return i11 - this.f87036e;
                }
            }
            i11 = i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public char m87879d() {
        char c11;
        m87878b();
        if (m87894s()) {
            c11 = CharCompanionObject.MAX_VALUE;
        } else {
            c11 = this.f87032a[this.f87036e];
        }
        this.f87036e++;
        return c11;
    }

    /* JADX INFO: renamed from: e */
    public String m87880e() {
        int i11;
        char c11;
        m87878b();
        int i12 = this.f87036e;
        int i13 = this.f87034c;
        char[] cArr = this.f87032a;
        while (true) {
            i11 = this.f87036e;
            if (i11 >= i13 || (c11 = cArr[i11]) == '&' || c11 == '<' || c11 == 0) {
                break;
            }
            this.f87036e = i11 + 1;
        }
        if (i11 > i12) {
            return m87868c(this.f87032a, this.f87039h, i12, i11 - i12);
        }
        return "";
    }

    /* JADX INFO: renamed from: f */
    public String m87881f() {
        int i11;
        char c11;
        m87878b();
        int i12 = this.f87036e;
        while (true) {
            i11 = this.f87036e;
            if (i11 >= this.f87034c || (c11 = this.f87032a[i11]) < '0' || c11 > '9') {
                break;
            }
            this.f87036e = i11 + 1;
        }
        return m87868c(this.f87032a, this.f87039h, i12, i11 - i12);
    }

    /* JADX INFO: renamed from: g */
    public String m87882g() {
        int i11;
        char c11;
        m87878b();
        int i12 = this.f87036e;
        while (true) {
            i11 = this.f87036e;
            if (i11 >= this.f87034c || (((c11 = this.f87032a[i11]) < '0' || c11 > '9') && ((c11 < 'A' || c11 > 'F') && (c11 < 'a' || c11 > 'f')))) {
                break;
            }
            this.f87036e = i11 + 1;
        }
        return m87868c(this.f87032a, this.f87039h, i12, i11 - i12);
    }

    /* JADX INFO: renamed from: h */
    public String m87883h() {
        char c11;
        m87878b();
        int i11 = this.f87036e;
        while (true) {
            int i12 = this.f87036e;
            if (i12 >= this.f87034c || (((c11 = this.f87032a[i12]) < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !Character.isLetter(c11)))) {
                break;
            }
            this.f87036e++;
        }
        return m87868c(this.f87032a, this.f87039h, i11, this.f87036e - i11);
    }

    /* JADX INFO: renamed from: i */
    public String m87884i() {
        char c11;
        m87878b();
        int i11 = this.f87036e;
        while (true) {
            int i12 = this.f87036e;
            if (i12 >= this.f87034c || (((c11 = this.f87032a[i12]) < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !Character.isLetter(c11)))) {
                break;
            }
            this.f87036e++;
        }
        while (!m87894s()) {
            char[] cArr = this.f87032a;
            int i13 = this.f87036e;
            char c12 = cArr[i13];
            if (c12 < '0' || c12 > '9') {
                break;
            }
            this.f87036e = i13 + 1;
        }
        return m87868c(this.f87032a, this.f87039h, i11, this.f87036e - i11);
    }

    /* JADX INFO: renamed from: j */
    public String m87885j() {
        int i11;
        char c11;
        m87878b();
        int i12 = this.f87036e;
        int i13 = this.f87034c;
        char[] cArr = this.f87032a;
        while (true) {
            i11 = this.f87036e;
            if (i11 >= i13 || (c11 = cArr[i11]) == '\t' || c11 == '\n' || c11 == '\r' || c11 == '\f' || c11 == ' ' || c11 == '/' || c11 == '>' || c11 == 0) {
                break;
            }
            this.f87036e = i11 + 1;
        }
        if (i11 > i12) {
            return m87868c(this.f87032a, this.f87039h, i12, i11 - i12);
        }
        return "";
    }

    /* JADX INFO: renamed from: k */
    public String m87886k(char c11) {
        int iM87872D = m87872D(c11);
        if (iM87872D != -1) {
            String strM87868c = m87868c(this.f87032a, this.f87039h, this.f87036e, iM87872D);
            this.f87036e += iM87872D;
            return strM87868c;
        }
        return m87890o();
    }

    /* JADX INFO: renamed from: l */
    public String m87887l(String str) {
        int iM87873E = m87873E(str);
        if (iM87873E != -1) {
            String strM87868c = m87868c(this.f87032a, this.f87039h, this.f87036e, iM87873E);
            this.f87036e += iM87873E;
            return strM87868c;
        }
        return m87890o();
    }

    /* JADX INFO: renamed from: m */
    public String m87888m(char... cArr) {
        m87878b();
        int i11 = this.f87036e;
        int i12 = this.f87034c;
        char[] cArr2 = this.f87032a;
        loop0: while (this.f87036e < i12) {
            for (char c11 : cArr) {
                if (cArr2[this.f87036e] == c11) {
                    break loop0;
                }
            }
            this.f87036e++;
        }
        int i13 = this.f87036e;
        if (i13 > i11) {
            return m87868c(this.f87032a, this.f87039h, i11, i13 - i11);
        }
        return "";
    }

    /* JADX INFO: renamed from: n */
    public String m87889n(char... cArr) {
        m87878b();
        int i11 = this.f87036e;
        int i12 = this.f87034c;
        char[] cArr2 = this.f87032a;
        while (true) {
            int i13 = this.f87036e;
            if (i13 >= i12 || Arrays.binarySearch(cArr, cArr2[i13]) >= 0) {
                break;
            }
            this.f87036e++;
        }
        int i14 = this.f87036e;
        if (i14 > i11) {
            return m87868c(this.f87032a, this.f87039h, i11, i14 - i11);
        }
        return "";
    }

    /* JADX INFO: renamed from: o */
    public String m87890o() {
        m87878b();
        char[] cArr = this.f87032a;
        String[] strArr = this.f87039h;
        int i11 = this.f87036e;
        String strM87868c = m87868c(cArr, strArr, i11, this.f87034c - i11);
        this.f87036e = this.f87034c;
        return strM87868c;
    }

    /* JADX INFO: renamed from: q */
    public char m87892q() {
        m87878b();
        if (m87894s()) {
            return CharCompanionObject.MAX_VALUE;
        }
        return this.f87032a[this.f87036e];
    }

    /* JADX INFO: renamed from: r */
    public boolean m87893r() {
        m87878b();
        if (this.f87036e >= this.f87034c) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean m87896u(String str) {
        m87878b();
        if (m87899x(str)) {
            this.f87036e += str.length();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public boolean m87897v(String str) {
        if (m87870B(str)) {
            this.f87036e += str.length();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public boolean m87898w(char c11) {
        if (!m87893r() && this.f87032a[this.f87036e] == c11) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public boolean m87899x(String str) {
        m87878b();
        int length = str.length();
        if (length > this.f87034c - this.f87036e) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != this.f87032a[this.f87036e + i11]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public boolean m87900y(char... cArr) {
        if (m87893r()) {
            return false;
        }
        m87878b();
        char c11 = this.f87032a[this.f87036e];
        for (char c12 : cArr) {
            if (c12 == c11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public boolean m87901z(char[] cArr) {
        m87878b();
        if (!m87893r() && Arrays.binarySearch(cArr, this.f87032a[this.f87036e]) >= 0) {
            return true;
        }
        return false;
    }

    public C39213a(String str) {
        this(new StringReader(str), str.length());
    }
}
