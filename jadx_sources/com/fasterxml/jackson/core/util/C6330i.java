package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.p062io.C6313g;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.util.i */
/* JADX INFO: compiled from: TextBuffer.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6330i {

    /* JADX INFO: renamed from: l */
    public static final char[] f10166l = new char[0];

    /* JADX INFO: renamed from: a */
    public final C6322a f10167a;

    /* JADX INFO: renamed from: b */
    public char[] f10168b;

    /* JADX INFO: renamed from: c */
    public int f10169c;

    /* JADX INFO: renamed from: d */
    public int f10170d;

    /* JADX INFO: renamed from: e */
    public ArrayList<char[]> f10171e;

    /* JADX INFO: renamed from: f */
    public boolean f10172f;

    /* JADX INFO: renamed from: g */
    public int f10173g;

    /* JADX INFO: renamed from: h */
    public char[] f10174h;

    /* JADX INFO: renamed from: i */
    public int f10175i;

    /* JADX INFO: renamed from: j */
    public String f10176j;

    /* JADX INFO: renamed from: k */
    public char[] f10177k;

    public C6330i(C6322a c6322a) {
        this.f10167a = c6322a;
    }

    /* JADX INFO: renamed from: A */
    public void m11088A(char[] cArr, int i11, int i12) {
        this.f10176j = null;
        this.f10177k = null;
        this.f10168b = cArr;
        this.f10169c = i11;
        this.f10170d = i12;
        if (this.f10172f) {
            m11100f();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m11089B(String str) {
        this.f10168b = null;
        this.f10169c = -1;
        this.f10170d = 0;
        this.f10176j = str;
        this.f10177k = null;
        if (this.f10172f) {
            m11100f();
        }
        this.f10175i = 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m11100f() {
        this.f10172f = false;
        this.f10171e.clear();
        this.f10173g = 0;
        this.f10175i = 0;
    }

    /* JADX INFO: renamed from: m */
    public char[] m11107m() {
        this.f10169c = -1;
        this.f10175i = 0;
        this.f10170d = 0;
        this.f10168b = null;
        this.f10176j = null;
        this.f10177k = null;
        if (this.f10172f) {
            m11100f();
        }
        char[] cArr = this.f10174h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrM11098d = m11098d(0);
        this.f10174h = cArrM11098d;
        return cArrM11098d;
    }

    /* JADX INFO: renamed from: x */
    public void m11117x() {
        char[] cArr;
        this.f10169c = -1;
        this.f10175i = 0;
        this.f10170d = 0;
        this.f10168b = null;
        this.f10177k = null;
        if (this.f10172f) {
            m11100f();
        }
        C6322a c6322a = this.f10167a;
        if (c6322a == null || (cArr = this.f10174h) == null) {
            return;
        }
        this.f10174h = null;
        c6322a.m11065j(2, cArr);
    }

    /* JADX INFO: renamed from: y */
    public void m11118y(String str, int i11, int i12) {
        this.f10168b = null;
        this.f10169c = -1;
        this.f10170d = 0;
        this.f10176j = null;
        this.f10177k = null;
        if (this.f10172f) {
            m11100f();
        } else if (this.f10174h == null) {
            this.f10174h = m11098d(i12);
        }
        this.f10173g = 0;
        this.f10175i = 0;
        m11096b(str, i11, i12);
    }

    /* JADX INFO: renamed from: z */
    public void m11119z(char[] cArr, int i11, int i12) {
        this.f10168b = null;
        this.f10169c = -1;
        this.f10170d = 0;
        this.f10176j = null;
        this.f10177k = null;
        if (this.f10172f) {
            m11100f();
        } else if (this.f10174h == null) {
            this.f10174h = m11098d(i12);
        }
        this.f10173g = 0;
        this.f10175i = 0;
        m11097c(cArr, i11, i12);
    }

    /* JADX INFO: renamed from: q */
    public static C6330i m11087q(char[] cArr) {
        return new C6330i(null, cArr);
    }

    /* JADX INFO: renamed from: C */
    public final char[] m11090C() {
        int i11;
        String str = this.f10176j;
        if (str != null) {
            return str.toCharArray();
        }
        int i12 = this.f10169c;
        if (i12 >= 0) {
            int i13 = this.f10170d;
            if (i13 < 1) {
                return f10166l;
            }
            return i12 == 0 ? Arrays.copyOf(this.f10168b, i13) : Arrays.copyOfRange(this.f10168b, i12, i13 + i12);
        }
        int iM11093F = m11093F();
        if (iM11093F < 1) {
            return f10166l;
        }
        char[] cArrM11099e = m11099e(iM11093F);
        ArrayList<char[]> arrayList = this.f10171e;
        if (arrayList != null) {
            int size = arrayList.size();
            i11 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                char[] cArr = this.f10171e.get(i14);
                int length = cArr.length;
                System.arraycopy(cArr, 0, cArrM11099e, i11, length);
                i11 += length;
            }
        } else {
            i11 = 0;
        }
        System.arraycopy(this.f10174h, 0, cArrM11099e, i11, this.f10175i);
        return cArrM11099e;
    }

    /* JADX INFO: renamed from: D */
    public String m11091D(int i11) {
        this.f10175i = i11;
        if (this.f10173g > 0) {
            return m11106l();
        }
        String str = i11 == 0 ? "" : new String(this.f10174h, 0, i11);
        this.f10176j = str;
        return str;
    }

    /* JADX INFO: renamed from: E */
    public void m11092E(int i11) {
        this.f10175i = i11;
    }

    /* JADX INFO: renamed from: F */
    public int m11093F() {
        if (this.f10169c >= 0) {
            return this.f10170d;
        }
        char[] cArr = this.f10177k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f10176j;
        return str != null ? str.length() : this.f10173g + this.f10175i;
    }

    /* JADX INFO: renamed from: G */
    public final void m11094G(int i11) {
        int i12 = this.f10170d;
        this.f10170d = 0;
        char[] cArr = this.f10168b;
        this.f10168b = null;
        int i13 = this.f10169c;
        this.f10169c = -1;
        int i14 = i11 + i12;
        char[] cArr2 = this.f10174h;
        if (cArr2 == null || i14 > cArr2.length) {
            this.f10174h = m11098d(i14);
        }
        if (i12 > 0) {
            System.arraycopy(cArr, i13, this.f10174h, 0, i12);
        }
        this.f10173g = 0;
        this.f10175i = i12;
    }

    /* JADX INFO: renamed from: a */
    public void m11095a(char c11) {
        if (this.f10169c >= 0) {
            m11094G(16);
        }
        this.f10176j = null;
        this.f10177k = null;
        char[] cArr = this.f10174h;
        if (this.f10175i >= cArr.length) {
            m11108n(1);
            cArr = this.f10174h;
        }
        int i11 = this.f10175i;
        this.f10175i = i11 + 1;
        cArr[i11] = c11;
    }

    /* JADX INFO: renamed from: b */
    public void m11096b(String str, int i11, int i12) {
        if (this.f10169c >= 0) {
            m11094G(i12);
        }
        this.f10176j = null;
        this.f10177k = null;
        char[] cArr = this.f10174h;
        int length = cArr.length;
        int i13 = this.f10175i;
        int i14 = length - i13;
        if (i14 >= i12) {
            str.getChars(i11, i11 + i12, cArr, i13);
            this.f10175i += i12;
            return;
        }
        if (i14 > 0) {
            int i15 = i11 + i14;
            str.getChars(i11, i15, cArr, i13);
            i12 -= i14;
            i11 = i15;
        }
        while (true) {
            m11108n(i12);
            int iMin = Math.min(this.f10174h.length, i12);
            int i16 = i11 + iMin;
            str.getChars(i11, i16, this.f10174h, 0);
            this.f10175i += iMin;
            i12 -= iMin;
            if (i12 <= 0) {
                return;
            } else {
                i11 = i16;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11097c(char[] cArr, int i11, int i12) {
        if (this.f10169c >= 0) {
            m11094G(i12);
        }
        this.f10176j = null;
        this.f10177k = null;
        char[] cArr2 = this.f10174h;
        int length = cArr2.length;
        int i13 = this.f10175i;
        int i14 = length - i13;
        if (i14 >= i12) {
            System.arraycopy(cArr, i11, cArr2, i13, i12);
            this.f10175i += i12;
            return;
        }
        if (i14 > 0) {
            System.arraycopy(cArr, i11, cArr2, i13, i14);
            i11 += i14;
            i12 -= i14;
        }
        do {
            m11108n(i12);
            int iMin = Math.min(this.f10174h.length, i12);
            System.arraycopy(cArr, i11, this.f10174h, 0, iMin);
            this.f10175i += iMin;
            i11 += iMin;
            i12 -= iMin;
        } while (i12 > 0);
    }

    /* JADX INFO: renamed from: d */
    public final char[] m11098d(int i11) {
        C6322a c6322a = this.f10167a;
        return c6322a != null ? c6322a.m11059d(2, i11) : new char[Math.max(i11, 500)];
    }

    /* JADX INFO: renamed from: e */
    public final char[] m11099e(int i11) {
        return new char[i11];
    }

    /* JADX INFO: renamed from: g */
    public char[] m11101g() {
        char[] cArr = this.f10177k;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrM11090C = m11090C();
        this.f10177k = cArrM11090C;
        return cArrM11090C;
    }

    /* JADX INFO: renamed from: h */
    public BigDecimal m11102h() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f10177k;
        if (cArr3 != null) {
            return C6313g.m11015g(cArr3);
        }
        int i11 = this.f10169c;
        if (i11 < 0 || (cArr2 = this.f10168b) == null) {
            return (this.f10173g != 0 || (cArr = this.f10174h) == null) ? C6313g.m11015g(m11101g()) : C6313g.m11016h(cArr, 0, this.f10175i);
        }
        return C6313g.m11016h(cArr2, i11, this.f10170d);
    }

    /* JADX INFO: renamed from: j */
    public int m11104j(boolean z11) {
        char[] cArr;
        int i11 = this.f10169c;
        if (i11 < 0 || (cArr = this.f10168b) == null) {
            return z11 ? -C6313g.m11019k(this.f10174h, 1, this.f10175i - 1) : C6313g.m11019k(this.f10174h, 0, this.f10175i);
        }
        return z11 ? -C6313g.m11019k(cArr, i11 + 1, this.f10170d - 1) : C6313g.m11019k(cArr, i11, this.f10170d);
    }

    /* JADX INFO: renamed from: k */
    public long m11105k(boolean z11) {
        char[] cArr;
        int i11 = this.f10169c;
        if (i11 < 0 || (cArr = this.f10168b) == null) {
            return z11 ? -C6313g.m11021m(this.f10174h, 1, this.f10175i - 1) : C6313g.m11021m(this.f10174h, 0, this.f10175i);
        }
        return z11 ? -C6313g.m11021m(cArr, i11 + 1, this.f10170d - 1) : C6313g.m11021m(cArr, i11, this.f10170d);
    }

    /* JADX INFO: renamed from: l */
    public String m11106l() {
        if (this.f10176j == null) {
            char[] cArr = this.f10177k;
            if (cArr != null) {
                this.f10176j = new String(cArr);
            } else {
                int i11 = this.f10169c;
                if (i11 >= 0) {
                    int i12 = this.f10170d;
                    if (i12 < 1) {
                        this.f10176j = "";
                        return "";
                    }
                    this.f10176j = new String(this.f10168b, i11, i12);
                } else {
                    int i13 = this.f10173g;
                    int i14 = this.f10175i;
                    if (i13 == 0) {
                        this.f10176j = i14 != 0 ? new String(this.f10174h, 0, i14) : "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(i13 + i14);
                        ArrayList<char[]> arrayList = this.f10171e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i15 = 0; i15 < size; i15++) {
                                char[] cArr2 = this.f10171e.get(i15);
                                sb2.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb2.append(this.f10174h, 0, this.f10175i);
                        this.f10176j = sb2.toString();
                    }
                }
            }
        }
        return this.f10176j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026 A[PHI: r0
      0x0026: PHI (r0v8 int) = (r0v6 int), (r0v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: n */
    public final void m11108n(int i11) {
        if (this.f10171e == null) {
            this.f10171e = new ArrayList<>();
        }
        char[] cArr = this.f10174h;
        this.f10172f = true;
        this.f10171e.add(cArr);
        this.f10173g += cArr.length;
        this.f10175i = 0;
        int length = cArr.length;
        int i12 = length + (length >> 1);
        int i13 = 500;
        if (i12 < 500) {
            i12 = i13;
        } else {
            i13 = 65536;
            if (i12 > 65536) {
                i12 = i13;
            }
        }
        this.f10174h = m11099e(i12);
    }

    /* JADX INFO: renamed from: o */
    public char[] m11109o() {
        char[] cArr = this.f10174h;
        int length = cArr.length;
        int i11 = (length >> 1) + length;
        if (i11 > 65536) {
            i11 = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i11);
        this.f10174h = cArrCopyOf;
        return cArrCopyOf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: p */
    public char[] m11110p() {
        if (this.f10171e == null) {
            this.f10171e = new ArrayList<>();
        }
        this.f10172f = true;
        this.f10171e.add(this.f10174h);
        int length = this.f10174h.length;
        this.f10173g += length;
        this.f10175i = 0;
        int i11 = length + (length >> 1);
        int i12 = 500;
        if (i11 < 500) {
            i11 = i12;
        } else {
            i12 = 65536;
            if (i11 > 65536) {
                i11 = i12;
            }
        }
        char[] cArrM11099e = m11099e(i11);
        this.f10174h = cArrM11099e;
        return cArrM11099e;
    }

    /* JADX INFO: renamed from: r */
    public char[] m11111r() {
        return this.f10174h;
    }

    /* JADX INFO: renamed from: s */
    public char[] m11112s() {
        if (this.f10169c >= 0) {
            m11094G(1);
        } else {
            char[] cArr = this.f10174h;
            if (cArr == null) {
                this.f10174h = m11098d(0);
            } else if (this.f10175i >= cArr.length) {
                m11108n(1);
            }
        }
        return this.f10174h;
    }

    /* JADX INFO: renamed from: t */
    public int m11113t() {
        return this.f10175i;
    }

    /* JADX INFO: renamed from: u */
    public char[] m11114u() {
        if (this.f10169c >= 0) {
            return this.f10168b;
        }
        char[] cArr = this.f10177k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f10176j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f10177k = charArray;
            return charArray;
        }
        if (this.f10172f) {
            return m11101g();
        }
        char[] cArr2 = this.f10174h;
        return cArr2 == null ? f10166l : cArr2;
    }

    /* JADX INFO: renamed from: v */
    public int m11115v() {
        int i11 = this.f10169c;
        if (i11 >= 0) {
            return i11;
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public boolean m11116w() {
        return this.f10169c >= 0 || this.f10177k != null || this.f10176j == null;
    }

    public C6330i(C6322a c6322a, char[] cArr) {
        this.f10167a = c6322a;
        this.f10174h = cArr;
        this.f10175i = cArr.length;
        this.f10169c = -1;
    }

    /* JADX INFO: renamed from: i */
    public double m11103i() throws NumberFormatException {
        return C6313g.m11017i(m11106l());
    }

    public String toString() {
        return m11106l();
    }
}
