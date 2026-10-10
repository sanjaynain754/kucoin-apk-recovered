package org.jsoup.parser;

import androidx.core.app.FrameMetricsAggregator;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;
import nh0.C42841b;
import org.jsoup.UncheckedIOException;
import p852kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: renamed from: org.jsoup.parser.a */
/* JADX INFO: compiled from: CharacterReader.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C43295a {

    /* JADX INFO: renamed from: a */
    public char[] f95453a;

    /* JADX INFO: renamed from: b */
    public Reader f95454b;

    /* JADX INFO: renamed from: c */
    public int f95455c;

    /* JADX INFO: renamed from: d */
    public int f95456d;

    /* JADX INFO: renamed from: e */
    public int f95457e;

    /* JADX INFO: renamed from: f */
    public int f95458f;

    /* JADX INFO: renamed from: g */
    public int f95459g;

    /* JADX INFO: renamed from: h */
    public String[] f95460h;

    /* JADX INFO: renamed from: i */
    public boolean f95461i;

    public C43295a(Reader reader, int i11) {
        this.f95459g = -1;
        this.f95460h = new String[512];
        C42841b.m93957i(reader);
        C42841b.m93951c(reader.markSupported());
        this.f95454b = reader;
        this.f95453a = new char[i11 > 32768 ? 32768 : i11];
        m95084b();
    }

    /* JADX INFO: renamed from: L */
    public void m95082L() {
        this.f95459g = -1;
    }

    /* JADX INFO: renamed from: c */
    public static String m95071c(char[] cArr, String[] strArr, int i11, int i12) {
        if (i12 > 12) {
            return new String(cArr, i11, i12);
        }
        if (i12 < 1) {
            return "";
        }
        int i13 = i12 * 31;
        int i14 = 0;
        int i15 = i11;
        while (i14 < i12) {
            i13 = (i13 * 31) + cArr[i15];
            i14++;
            i15++;
        }
        int i16 = i13 & FrameMetricsAggregator.EVERY_DURATION;
        String str = strArr[i16];
        if (str == null) {
            String str2 = new String(cArr, i11, i12);
            strArr[i16] = str2;
            return str2;
        }
        if (m95070I(cArr, i11, i12, str)) {
            return str;
        }
        String str3 = new String(cArr, i11, i12);
        strArr[i16] = str3;
        return str3;
    }

    /* JADX INFO: renamed from: H */
    public int m95079H() {
        return this.f95458f + this.f95457e;
    }

    /* JADX INFO: renamed from: J */
    public void m95080J() {
        int i11 = this.f95459g;
        if (i11 == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.f95457e = i11;
        m95082L();
    }

    /* JADX INFO: renamed from: K */
    public void m95081K() {
        int i11 = this.f95457e;
        if (i11 < 1) {
            throw new UncheckedIOException(new IOException("No buffer left to unconsume"));
        }
        this.f95457e = i11 - 1;
    }

    /* JADX INFO: renamed from: a */
    public void m95083a() {
        this.f95457e++;
    }

    /* JADX INFO: renamed from: b */
    public final void m95084b() {
        int i11;
        int i12;
        boolean z11;
        if (this.f95461i || (i11 = this.f95457e) < this.f95456d) {
            return;
        }
        int i13 = this.f95459g;
        if (i13 != -1) {
            i12 = i11 - i13;
            i11 = i13;
        } else {
            i12 = 0;
        }
        try {
            long j11 = i11;
            long jSkip = this.f95454b.skip(j11);
            this.f95454b.mark(32768);
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i14 > 1024) {
                    break;
                }
                Reader reader = this.f95454b;
                char[] cArr = this.f95453a;
                int i15 = reader.read(cArr, i14, cArr.length - i14);
                if (i15 == -1) {
                    this.f95461i = true;
                }
                if (i15 <= 0) {
                    break;
                } else {
                    i14 += i15;
                }
            }
            this.f95454b.reset();
            if (i14 > 0) {
                if (jSkip != j11) {
                    z11 = false;
                }
                C42841b.m93951c(z11);
                this.f95455c = i14;
                this.f95458f += i11;
                this.f95457e = i12;
                if (this.f95459g != -1) {
                    this.f95459g = 0;
                }
                if (i14 > 24576) {
                    i14 = 24576;
                }
                this.f95456d = i14;
            }
        } catch (IOException e11) {
            throw new UncheckedIOException(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public void m95085d() {
        Reader reader = this.f95454b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } finally {
            this.f95454b = null;
            this.f95453a = null;
            this.f95460h = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public String m95087f() {
        int i11 = this.f95457e;
        int i12 = this.f95455c;
        char[] cArr = this.f95453a;
        int i13 = i11;
        while (i13 < i12) {
            char c11 = cArr[i13];
            if (c11 == 0 || c11 == '&' || c11 == '<') {
                break;
            }
            i13++;
        }
        this.f95457e = i13;
        return i13 > i11 ? m95071c(this.f95453a, this.f95460h, i11, i13 - i11) : "";
    }

    /* JADX INFO: renamed from: k */
    public String m95092k() {
        int i11 = this.f95457e;
        int i12 = this.f95455c;
        char[] cArr = this.f95453a;
        int i13 = i11;
        while (i13 < i12) {
            char c11 = cArr[i13];
            if (c11 == 0 || c11 == '<') {
                break;
            }
            i13++;
        }
        this.f95457e = i13;
        return i13 > i11 ? m95071c(this.f95453a, this.f95460h, i11, i13 - i11) : "";
    }

    /* JADX INFO: renamed from: r */
    public boolean m95099r(String str) {
        Locale locale = Locale.ENGLISH;
        return m95078G(str.toLowerCase(locale)) > -1 || m95078G(str.toUpperCase(locale)) > -1;
    }

    public String toString() {
        int i11 = this.f95455c;
        int i12 = this.f95457e;
        return i11 - i12 < 0 ? "" : new String(this.f95453a, i12, i11 - i12);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m95102u() {
        return this.f95457e >= this.f95455c;
    }

    /* JADX INFO: renamed from: v */
    public void m95103v() {
        if (this.f95455c - this.f95457e < 1024) {
            this.f95456d = 0;
        }
        m95084b();
        this.f95459g = this.f95457e;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m95070I(char[] cArr, int i11, int i12, String str) {
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
    public boolean m95072A(char... cArr) {
        if (m95101t()) {
            return false;
        }
        m95084b();
        char c11 = this.f95453a[this.f95457e];
        for (char c12 : cArr) {
            if (c12 == c11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public boolean m95073B(char[] cArr) {
        m95084b();
        if (!m95101t() && Arrays.binarySearch(cArr, this.f95453a[this.f95457e]) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public boolean m95074C() {
        char c11;
        if (m95101t() || (c11 = this.f95453a[this.f95457e]) < '0' || c11 > '9') {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public boolean m95075D(String str) {
        m95084b();
        int length = str.length();
        if (length > this.f95455c - this.f95457e) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (Character.toUpperCase(str.charAt(i11)) != Character.toUpperCase(this.f95453a[this.f95457e + i11])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public boolean m95076E() {
        if (m95101t()) {
            return false;
        }
        char c11 = this.f95453a[this.f95457e];
        if (c11 < 'A' || c11 > 'Z') {
            if ((c11 < 'a' || c11 > 'z') && !Character.isLetter(c11)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public int m95077F(char c11) {
        m95084b();
        for (int i11 = this.f95457e; i11 < this.f95455c; i11++) {
            if (c11 == this.f95453a[i11]) {
                return i11 - this.f95457e;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public int m95078G(CharSequence charSequence) {
        m95084b();
        char cCharAt = charSequence.charAt(0);
        int i11 = this.f95457e;
        while (i11 < this.f95455c) {
            if (cCharAt != this.f95453a[i11]) {
                do {
                    i11++;
                    if (i11 >= this.f95455c) {
                        break;
                    }
                } while (cCharAt != this.f95453a[i11]);
            }
            int i12 = i11 + 1;
            int length = (charSequence.length() + i12) - 1;
            int i13 = this.f95455c;
            if (i11 < i13 && length <= i13) {
                int i14 = i12;
                for (int i15 = 1; i14 < length && charSequence.charAt(i15) == this.f95453a[i14]; i15++) {
                    i14++;
                }
                if (i14 == length) {
                    return i11 - this.f95457e;
                }
            }
            i11 = i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public char m95086e() {
        char c11;
        m95084b();
        if (m95102u()) {
            c11 = CharCompanionObject.MAX_VALUE;
        } else {
            c11 = this.f95453a[this.f95457e];
        }
        this.f95457e++;
        return c11;
    }

    /* JADX INFO: renamed from: g */
    public String m95088g() {
        int i11;
        char c11;
        m95084b();
        int i12 = this.f95457e;
        while (true) {
            i11 = this.f95457e;
            if (i11 >= this.f95455c || (c11 = this.f95453a[i11]) < '0' || c11 > '9') {
                break;
            }
            this.f95457e = i11 + 1;
        }
        return m95071c(this.f95453a, this.f95460h, i12, i11 - i12);
    }

    /* JADX INFO: renamed from: h */
    public String m95089h() {
        int i11;
        char c11;
        m95084b();
        int i12 = this.f95457e;
        while (true) {
            i11 = this.f95457e;
            if (i11 >= this.f95455c || (((c11 = this.f95453a[i11]) < '0' || c11 > '9') && ((c11 < 'A' || c11 > 'F') && (c11 < 'a' || c11 > 'f')))) {
                break;
            }
            this.f95457e = i11 + 1;
        }
        return m95071c(this.f95453a, this.f95460h, i12, i11 - i12);
    }

    /* JADX INFO: renamed from: i */
    public String m95090i() {
        char c11;
        m95084b();
        int i11 = this.f95457e;
        while (true) {
            int i12 = this.f95457e;
            if (i12 >= this.f95455c || (((c11 = this.f95453a[i12]) < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !Character.isLetter(c11)))) {
                break;
            }
            this.f95457e++;
        }
        return m95071c(this.f95453a, this.f95460h, i11, this.f95457e - i11);
    }

    /* JADX INFO: renamed from: j */
    public String m95091j() {
        char c11;
        m95084b();
        int i11 = this.f95457e;
        while (true) {
            int i12 = this.f95457e;
            if (i12 >= this.f95455c || (((c11 = this.f95453a[i12]) < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !Character.isLetter(c11)))) {
                break;
            }
            this.f95457e++;
        }
        while (!m95102u()) {
            char[] cArr = this.f95453a;
            int i13 = this.f95457e;
            char c12 = cArr[i13];
            if (c12 < '0' || c12 > '9') {
                break;
            }
            this.f95457e = i13 + 1;
        }
        return m95071c(this.f95453a, this.f95460h, i11, this.f95457e - i11);
    }

    /* JADX INFO: renamed from: l */
    public String m95093l() {
        m95084b();
        int i11 = this.f95457e;
        int i12 = this.f95455c;
        char[] cArr = this.f95453a;
        int i13 = i11;
        while (i13 < i12) {
            char c11 = cArr[i13];
            if (c11 == 0 || c11 == ' ' || c11 == '/' || c11 == '<' || c11 == '>' || c11 == '\t' || c11 == '\n' || c11 == '\f' || c11 == '\r') {
                break;
            }
            i13++;
        }
        this.f95457e = i13;
        if (i13 > i11) {
            return m95071c(this.f95453a, this.f95460h, i11, i13 - i11);
        }
        return "";
    }

    /* JADX INFO: renamed from: m */
    public String m95094m(char c11) {
        int iM95077F = m95077F(c11);
        if (iM95077F != -1) {
            String strM95071c = m95071c(this.f95453a, this.f95460h, this.f95457e, iM95077F);
            this.f95457e += iM95077F;
            return strM95071c;
        }
        return m95098q();
    }

    /* JADX INFO: renamed from: n */
    public String m95095n(String str) {
        int iM95078G = m95078G(str);
        if (iM95078G != -1) {
            String strM95071c = m95071c(this.f95453a, this.f95460h, this.f95457e, iM95078G);
            this.f95457e += iM95078G;
            return strM95071c;
        }
        if (this.f95455c - this.f95457e < str.length()) {
            return m95098q();
        }
        int length = (this.f95455c - str.length()) + 1;
        char[] cArr = this.f95453a;
        String[] strArr = this.f95460h;
        int i11 = this.f95457e;
        String strM95071c2 = m95071c(cArr, strArr, i11, length - i11);
        this.f95457e = length;
        return strM95071c2;
    }

    /* JADX INFO: renamed from: o */
    public String m95096o(char... cArr) {
        m95084b();
        int i11 = this.f95457e;
        int i12 = this.f95455c;
        char[] cArr2 = this.f95453a;
        int i13 = i11;
        loop0: while (i13 < i12) {
            for (char c11 : cArr) {
                if (cArr2[i13] == c11) {
                    break loop0;
                }
            }
            i13++;
        }
        this.f95457e = i13;
        if (i13 > i11) {
            return m95071c(this.f95453a, this.f95460h, i11, i13 - i11);
        }
        return "";
    }

    /* JADX INFO: renamed from: p */
    public String m95097p(char... cArr) {
        m95084b();
        int i11 = this.f95457e;
        int i12 = this.f95455c;
        char[] cArr2 = this.f95453a;
        int i13 = i11;
        while (i13 < i12 && Arrays.binarySearch(cArr, cArr2[i13]) < 0) {
            i13++;
        }
        this.f95457e = i13;
        if (i13 > i11) {
            return m95071c(this.f95453a, this.f95460h, i11, i13 - i11);
        }
        return "";
    }

    /* JADX INFO: renamed from: q */
    public String m95098q() {
        m95084b();
        char[] cArr = this.f95453a;
        String[] strArr = this.f95460h;
        int i11 = this.f95457e;
        String strM95071c = m95071c(cArr, strArr, i11, this.f95455c - i11);
        this.f95457e = this.f95455c;
        return strM95071c;
    }

    /* JADX INFO: renamed from: s */
    public char m95100s() {
        m95084b();
        if (m95102u()) {
            return CharCompanionObject.MAX_VALUE;
        }
        return this.f95453a[this.f95457e];
    }

    /* JADX INFO: renamed from: t */
    public boolean m95101t() {
        m95084b();
        if (this.f95457e >= this.f95455c) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public boolean m95104w(String str) {
        m95084b();
        if (m95107z(str)) {
            this.f95457e += str.length();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public boolean m95105x(String str) {
        if (m95075D(str)) {
            this.f95457e += str.length();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public boolean m95106y(char c11) {
        if (!m95101t() && this.f95453a[this.f95457e] == c11) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public boolean m95107z(String str) {
        m95084b();
        int length = str.length();
        if (length > this.f95455c - this.f95457e) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != this.f95453a[this.f95457e + i11]) {
                return false;
            }
        }
        return true;
    }

    public C43295a(Reader reader) {
        this(reader, 32768);
    }

    public C43295a(String str) {
        this(new StringReader(str), str.length());
    }
}
