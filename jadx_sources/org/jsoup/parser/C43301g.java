package org.jsoup.parser;

import com.tencent.bugly.proguard.C33820nf;
import nh0.C42841b;
import oh0.C43093c;

/* JADX INFO: renamed from: org.jsoup.parser.g */
/* JADX INFO: compiled from: TokenQueue.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43301g {

    /* JADX INFO: renamed from: a */
    public String f95508a;

    /* JADX INFO: renamed from: b */
    public int f95509b = 0;

    /* JADX INFO: renamed from: a */
    public String m95212a(char c11, char c12) {
        char c13 = 0;
        int i11 = -1;
        int i12 = -1;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 0;
        while (!m95221j()) {
            char cM95214c = m95214c();
            if (c13 == 0 || c13 != '\\') {
                if (cM95214c == '\'' && cM95214c != c11 && !z11) {
                    z12 = !z12;
                } else if (cM95214c == '\"' && cM95214c != c11 && !z12) {
                    z11 = !z11;
                }
                if (!z12 && !z11) {
                    if (cM95214c == c11) {
                        i13++;
                        if (i11 == -1) {
                            i11 = this.f95509b;
                        }
                    } else if (cM95214c == c12) {
                        i13--;
                    }
                    if (i13 > 0 && c13 != 0) {
                        i12 = this.f95509b;
                    }
                    c13 = cM95214c;
                }
            } else {
                if (i13 > 0) {
                    i12 = this.f95509b;
                }
                c13 = cM95214c;
            }
            if (i13 <= 0) {
                break;
            }
        }
        String strSubstring = i12 >= 0 ? this.f95508a.substring(i11, i12) : "";
        if (i13 > 0) {
            C42841b.m93949a("Did not find balanced marker at '" + strSubstring + "'");
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: i */
    public boolean m95220i() {
        boolean z11 = false;
        while (m95226o()) {
            this.f95509b++;
            z11 = true;
        }
        return z11;
    }

    /* JADX INFO: renamed from: n */
    public boolean m95225n(String... strArr) {
        for (String str : strArr) {
            if (m95223l(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public char m95214c() {
        String str = this.f95508a;
        int i11 = this.f95509b;
        this.f95509b = i11 + 1;
        return str.charAt(i11);
    }

    /* JADX INFO: renamed from: e */
    public String m95216e() {
        int i11 = this.f95509b;
        while (!m95221j() && (m95227p() || m95224m('-', '_'))) {
            this.f95509b++;
        }
        return this.f95508a.substring(i11, this.f95509b);
    }

    /* JADX INFO: renamed from: f */
    public String m95217f() {
        int i11 = this.f95509b;
        while (!m95221j() && (m95227p() || m95225n("*|", "|", "_", C33820nf.f71144W))) {
            this.f95509b++;
        }
        return this.f95508a.substring(i11, this.f95509b);
    }

    /* JADX INFO: renamed from: g */
    public String m95218g(String str) {
        int iIndexOf = this.f95508a.indexOf(str, this.f95509b);
        if (iIndexOf == -1) {
            return m95228q();
        }
        String strSubstring = this.f95508a.substring(this.f95509b, iIndexOf);
        this.f95509b += strSubstring.length();
        return strSubstring;
    }

    /* JADX INFO: renamed from: h */
    public String m95219h(String... strArr) {
        int i11 = this.f95509b;
        while (!m95221j() && !m95225n(strArr)) {
            this.f95509b++;
        }
        return this.f95508a.substring(i11, this.f95509b);
    }

    /* JADX INFO: renamed from: l */
    public boolean m95223l(String str) {
        return this.f95508a.regionMatches(true, this.f95509b, str, 0, str.length());
    }

    /* JADX INFO: renamed from: q */
    public String m95228q() {
        String str = this.f95508a;
        String strSubstring = str.substring(this.f95509b, str.length());
        this.f95509b = this.f95508a.length();
        return strSubstring;
    }

    /* JADX INFO: renamed from: r */
    public final int m95229r() {
        return this.f95508a.length() - this.f95509b;
    }

    public String toString() {
        return this.f95508a.substring(this.f95509b);
    }

    public C43301g(String str) {
        C42841b.m93957i(str);
        this.f95508a = str;
    }

    /* JADX INFO: renamed from: s */
    public static String m95211s(String str) {
        StringBuilder sbM94683b = C43093c.m94683b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i11 = 0;
        char c11 = 0;
        while (i11 < length) {
            char c12 = charArray[i11];
            if (c12 == '\\') {
                if (c11 != 0 && c11 == '\\') {
                    sbM94683b.append(c12);
                }
            } else {
                sbM94683b.append(c12);
            }
            i11++;
            c11 = c12;
        }
        return C43093c.m94694m(sbM94683b);
    }

    /* JADX INFO: renamed from: b */
    public String m95213b(String str) {
        String strM95218g = m95218g(str);
        m95222k(str);
        return strM95218g;
    }

    /* JADX INFO: renamed from: d */
    public void m95215d(String str) {
        if (m95223l(str)) {
            int length = str.length();
            if (length <= m95229r()) {
                this.f95509b += length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    /* JADX INFO: renamed from: j */
    public boolean m95221j() {
        if (m95229r() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m95222k(String str) {
        if (m95223l(str)) {
            this.f95509b += str.length();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean m95224m(char... cArr) {
        if (m95221j()) {
            return false;
        }
        for (char c11 : cArr) {
            if (this.f95508a.charAt(this.f95509b) == c11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m95226o() {
        if (!m95221j() && C43093c.m94690i(this.f95508a.charAt(this.f95509b))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean m95227p() {
        if (!m95221j() && Character.isLetterOrDigit(this.f95508a.charAt(this.f95509b))) {
            return true;
        }
        return false;
    }
}
