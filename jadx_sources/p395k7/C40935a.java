package p395k7;

import androidx.camera.view.C1454t;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k7.a */
/* JADX INFO: compiled from: ByteQuadsCanonicalizer.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C40935a {

    /* JADX INFO: renamed from: a */
    public final C40935a f90993a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<a> f90994b;

    /* JADX INFO: renamed from: c */
    public final int f90995c;

    /* JADX INFO: renamed from: d */
    public final boolean f90996d;

    /* JADX INFO: renamed from: e */
    public final boolean f90997e;

    /* JADX INFO: renamed from: f */
    public int[] f90998f;

    /* JADX INFO: renamed from: g */
    public int f90999g;

    /* JADX INFO: renamed from: h */
    public int f91000h;

    /* JADX INFO: renamed from: i */
    public int f91001i;

    /* JADX INFO: renamed from: j */
    public int f91002j;

    /* JADX INFO: renamed from: k */
    public int f91003k;

    /* JADX INFO: renamed from: l */
    public String[] f91004l;

    /* JADX INFO: renamed from: m */
    public int f91005m;

    /* JADX INFO: renamed from: n */
    public int f91006n;

    /* JADX INFO: renamed from: o */
    public boolean f91007o;

    /* JADX INFO: renamed from: k7.a$a */
    /* JADX INFO: compiled from: ByteQuadsCanonicalizer.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f91008a;

        /* JADX INFO: renamed from: b */
        public final int f91009b;

        /* JADX INFO: renamed from: c */
        public final int f91010c;

        /* JADX INFO: renamed from: d */
        public final int[] f91011d;

        /* JADX INFO: renamed from: e */
        public final String[] f91012e;

        /* JADX INFO: renamed from: f */
        public final int f91013f;

        /* JADX INFO: renamed from: g */
        public final int f91014g;

        public a(int i11, int i12, int i13, int[] iArr, String[] strArr, int i14, int i15) {
            this.f91008a = i11;
            this.f91009b = i12;
            this.f91010c = i13;
            this.f91011d = iArr;
            this.f91012e = strArr;
            this.f91013f = i14;
            this.f91014g = i15;
        }

        /* JADX INFO: renamed from: a */
        public static a m89687a(int i11) {
            int i12 = i11 << 3;
            return new a(i11, 0, C40935a.m89650c(i11), new int[i12], new String[i11 << 1], i12 - i11, i12);
        }

        public a(C40935a c40935a) {
            this.f91008a = c40935a.f90999g;
            this.f91009b = c40935a.f91003k;
            this.f91010c = c40935a.f91002j;
            this.f91011d = c40935a.f90998f;
            this.f91012e = c40935a.f91004l;
            this.f91013f = c40935a.f91005m;
            this.f91014g = c40935a.f91006n;
        }
    }

    public C40935a(int i11, int i12) {
        this.f90993a = null;
        this.f91003k = 0;
        this.f91007o = true;
        this.f90995c = i12;
        this.f90996d = false;
        this.f90997e = true;
        int i13 = 16;
        if (i11 < 16) {
            i11 = i13;
        } else if (((i11 - 1) & i11) != 0) {
            while (i13 < i11) {
                i13 += i13;
            }
            i11 = i13;
        }
        this.f90994b = new AtomicReference<>(a.m89687a(i11));
    }

    /* JADX INFO: renamed from: D */
    public final void m89656D(boolean z11) {
        this.f91003k = 0;
        this.f91005m = m89674l();
        this.f91006n = this.f90999g << 3;
        if (z11) {
            Arrays.fill(this.f90998f, 0);
            Arrays.fill(this.f91004l, (Object) null);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m89658F() {
        this.f91007o = false;
        int[] iArr = this.f90998f;
        String[] strArr = this.f91004l;
        int i11 = this.f90999g;
        int i12 = this.f91003k;
        int i13 = i11 + i11;
        int i14 = this.f91005m;
        if (i13 > 65536) {
            m89656D(true);
            return;
        }
        this.f90998f = new int[iArr.length + (i11 << 3)];
        this.f90999g = i13;
        int i15 = i13 << 2;
        this.f91000h = i15;
        this.f91001i = i15 + (i15 >> 1);
        this.f91002j = m89650c(i13);
        this.f91004l = new String[strArr.length << 1];
        m89656D(false);
        int[] iArr2 = new int[16];
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17 += 4) {
            int i18 = iArr[i17 + 3];
            if (i18 != 0) {
                i16++;
                String str = strArr[i17 >> 2];
                if (i18 == 1) {
                    iArr2[0] = iArr[i17];
                    m89678p(str, iArr2, 1);
                } else if (i18 == 2) {
                    iArr2[0] = iArr[i17];
                    iArr2[1] = iArr[i17 + 1];
                    m89678p(str, iArr2, 2);
                } else if (i18 != 3) {
                    if (i18 > iArr2.length) {
                        iArr2 = new int[i18];
                    }
                    System.arraycopy(iArr, iArr[i17 + 1], iArr2, 0, i18);
                    m89678p(str, iArr2, i18);
                } else {
                    iArr2[0] = iArr[i17];
                    iArr2[1] = iArr[i17 + 1];
                    iArr2[2] = iArr[i17 + 2];
                    m89678p(str, iArr2, 3);
                }
            }
        }
        if (i16 == i12) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i12 + ", copyCount=" + i16);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m89676n(int[] iArr, int i11, int i12) {
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            int i15 = i12 + 1;
            if (iArr[i13] != this.f90998f[i12]) {
                return false;
            }
            if (i14 >= i11) {
                return true;
            }
            i13 = i14;
            i12 = i15;
        }
    }

    /* JADX INFO: renamed from: t */
    public int m89682t(int[] iArr, int i11) {
        if (i11 < 4) {
            throw new IllegalArgumentException();
        }
        int i12 = iArr[0] ^ this.f90995c;
        int i13 = i12 + (i12 >>> 9) + iArr[1];
        int i14 = ((i13 + (i13 >>> 15)) * 33) ^ iArr[2];
        int i15 = i14 + (i14 >>> 4);
        for (int i16 = 3; i16 < i11; i16++) {
            int i17 = iArr[i16];
            i15 += i17 ^ (i17 >> 21);
        }
        int i18 = i15 * 65599;
        int i19 = i18 + (i18 >>> 19);
        return (i19 << 5) ^ i19;
    }

    /* JADX INFO: renamed from: z */
    public String m89686z(int[] iArr, int i11) {
        if (i11 < 4) {
            if (i11 == 1) {
                return m89683w(iArr[0]);
            }
            if (i11 != 2) {
                return i11 != 3 ? "" : m89685y(iArr[0], iArr[1], iArr[2]);
            }
            return m89684x(iArr[0], iArr[1]);
        }
        int iM89682t = m89682t(iArr, i11);
        int iM89665b = m89665b(iM89682t);
        int[] iArr2 = this.f90998f;
        int i12 = iArr2[iM89665b + 3];
        if (iM89682t == iArr2[iM89665b] && i12 == i11 && m89675m(iArr, i11, iArr2[iM89665b + 1])) {
            return this.f91004l[iM89665b >> 2];
        }
        if (i12 == 0) {
            return null;
        }
        int i13 = this.f91000h + ((iM89665b >> 3) << 2);
        return (iM89682t == iArr2[i13] && iArr2[i13 + 3] == i11 && m89675m(iArr, i11, iArr2[i13 + 1])) ? this.f91004l[i13 >> 2] : m89671i(iM89665b, iM89682t, iArr, i11);
    }

    /* JADX INFO: renamed from: c */
    public static int m89650c(int i11) {
        int i12 = i11 >> 2;
        if (i12 < 64) {
            return 4;
        }
        if (i12 <= 256) {
            return 5;
        }
        return i12 <= 1024 ? 6 : 7;
    }

    /* JADX INFO: renamed from: v */
    public static C40935a m89652v(int i11) {
        return new C40935a(64, i11);
    }

    /* JADX INFO: renamed from: A */
    public C40935a m89653A(int i11) {
        return new C40935a(this, this.f90995c, this.f90994b.get(), JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i11), JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i11));
    }

    /* JADX INFO: renamed from: B */
    public boolean m89654B() {
        return !this.f91007o;
    }

    /* JADX INFO: renamed from: C */
    public final void m89655C(a aVar) {
        int i11 = aVar.f91009b;
        a aVar2 = this.f90994b.get();
        if (i11 == aVar2.f91009b) {
            return;
        }
        if (i11 > 6000) {
            aVar = a.m89687a(64);
        }
        C1454t.m2255a(this.f90994b, aVar2, aVar);
    }

    /* JADX INFO: renamed from: E */
    public int m89657E() {
        int i11 = this.f91000h;
        int i12 = 0;
        for (int i13 = 3; i13 < i11; i13 += 4) {
            if (this.f90998f[i13] != 0) {
                i12++;
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: G */
    public void m89659G() {
        if (this.f90993a == null || !m89654B()) {
            return;
        }
        this.f90993a.m89655C(new a(this));
        this.f91007o = true;
    }

    /* JADX INFO: renamed from: H */
    public int m89660H() {
        int i11 = this.f91001i;
        int i12 = 0;
        for (int i13 = this.f91000h + 3; i13 < i11; i13 += 4) {
            if (this.f90998f[i13] != 0) {
                i12++;
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: I */
    public int m89661I() {
        return (this.f91005m - m89674l()) >> 2;
    }

    /* JADX INFO: renamed from: J */
    public int m89662J() {
        int i11 = this.f91001i + 3;
        int i12 = this.f90999g + i11;
        int i13 = 0;
        while (i11 < i12) {
            if (this.f90998f[i11] != 0) {
                i13++;
            }
            i11 += 4;
        }
        return i13;
    }

    /* JADX INFO: renamed from: K */
    public int m89663K() {
        int i11 = this.f90999g << 3;
        int i12 = 0;
        for (int i13 = 3; i13 < i11; i13 += 4) {
            if (this.f90998f[i13] != 0) {
                i12++;
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: a */
    public final int m89664a(int[] iArr, int i11) {
        int i12 = this.f91006n;
        int i13 = i12 + i11;
        int[] iArr2 = this.f90998f;
        if (i13 > iArr2.length) {
            this.f90998f = Arrays.copyOf(this.f90998f, this.f90998f.length + Math.max(i13 - iArr2.length, Math.min(4096, this.f90999g)));
        }
        System.arraycopy(iArr, 0, this.f90998f, i12, i11);
        this.f91006n += i11;
        return i12;
    }

    /* JADX INFO: renamed from: b */
    public final int m89665b(int i11) {
        return (i11 & (this.f90999g - 1)) << 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89666d() {
        if (this.f91003k <= (this.f90999g >> 1)) {
            return false;
        }
        int iM89674l = (this.f91005m - m89674l()) >> 2;
        int i11 = this.f91003k;
        return iM89674l > ((i11 + 1) >> 7) || ((double) i11) > ((double) this.f90999g) * 0.8d;
    }

    /* JADX INFO: renamed from: f */
    public final String m89668f(int i11, int i12) {
        int i13 = this.f91001i;
        int i14 = this.f91002j;
        int i15 = i13 + ((i11 >> (i14 + 2)) << i14);
        int[] iArr = this.f90998f;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr[i15 + 3];
            if (i12 == iArr[i15] && 1 == i17) {
                return this.f91004l[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int iM89674l = m89674l(); iM89674l < this.f91005m; iM89674l += 4) {
            if (i12 == iArr[iM89674l] && 1 == iArr[iM89674l + 3]) {
                return this.f91004l[iM89674l >> 2];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final String m89669g(int i11, int i12, int i13) {
        int i14 = this.f91001i;
        int i15 = this.f91002j;
        int i16 = i14 + ((i11 >> (i15 + 2)) << i15);
        int[] iArr = this.f90998f;
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            int i18 = iArr[i16 + 3];
            if (i12 == iArr[i16] && i13 == iArr[i16 + 1] && 2 == i18) {
                return this.f91004l[i16 >> 2];
            }
            if (i18 == 0) {
                return null;
            }
            i16 += 4;
        }
        for (int iM89674l = m89674l(); iM89674l < this.f91005m; iM89674l += 4) {
            if (i12 == iArr[iM89674l] && i13 == iArr[iM89674l + 1] && 2 == iArr[iM89674l + 3]) {
                return this.f91004l[iM89674l >> 2];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final String m89670h(int i11, int i12, int i13, int i14) {
        int i15 = this.f91001i;
        int i16 = this.f91002j;
        int i17 = i15 + ((i11 >> (i16 + 2)) << i16);
        int[] iArr = this.f90998f;
        int i18 = (1 << i16) + i17;
        while (i17 < i18) {
            int i19 = iArr[i17 + 3];
            if (i12 == iArr[i17] && i13 == iArr[i17 + 1] && i14 == iArr[i17 + 2] && 3 == i19) {
                return this.f91004l[i17 >> 2];
            }
            if (i19 == 0) {
                return null;
            }
            i17 += 4;
        }
        for (int iM89674l = m89674l(); iM89674l < this.f91005m; iM89674l += 4) {
            if (i12 == iArr[iM89674l] && i13 == iArr[iM89674l + 1] && i14 == iArr[iM89674l + 2] && 3 == iArr[iM89674l + 3]) {
                return this.f91004l[iM89674l >> 2];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m89671i(int i11, int i12, int[] iArr, int i13) {
        int i14 = this.f91001i;
        int i15 = this.f91002j;
        int i16 = i14 + ((i11 >> (i15 + 2)) << i15);
        int[] iArr2 = this.f90998f;
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            int i18 = iArr2[i16 + 3];
            if (i12 == iArr2[i16] && i13 == i18 && m89675m(iArr, i13, iArr2[i16 + 1])) {
                return this.f91004l[i16 >> 2];
            }
            if (i18 == 0) {
                return null;
            }
            i16 += 4;
        }
        for (int iM89674l = m89674l(); iM89674l < this.f91005m; iM89674l += 4) {
            if (i12 == iArr2[iM89674l] && i13 == iArr2[iM89674l + 3] && m89675m(iArr, i13, iArr2[iM89674l + 1])) {
                return this.f91004l[iM89674l >> 2];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m89672j() {
        if (this.f90999g <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this.f91003k + " entries, hash area of " + this.f90999g + " slots is now full (all " + (this.f90999g >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    /* JADX INFO: renamed from: l */
    public final int m89674l() {
        int i11 = this.f90999g;
        return (i11 << 3) - i11;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:23:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX INFO: renamed from: m */
    public final boolean m89675m(int[] iArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int[] iArr2 = this.f90998f;
        switch (i11) {
            case 4:
                i13 = 0;
                i17 = i13 + 1;
                i18 = i12 + 1;
                if (iArr[i13] != iArr2[i12]) {
                    return false;
                }
                i19 = i13 + 2;
                i21 = i12 + 2;
                if (iArr[i17] != iArr2[i18]) {
                    return false;
                }
                return iArr[i19] != iArr2[i21] && iArr[i13 + 3] == iArr2[i12 + 3];
            case 5:
                i14 = 0;
                i13 = i14 + 1;
                i22 = i12 + 1;
                if (iArr[i14] != iArr2[i12]) {
                    return false;
                }
                i12 = i22;
                i17 = i13 + 1;
                i18 = i12 + 1;
                if (iArr[i13] != iArr2[i12]) {
                    return false;
                }
                i19 = i13 + 2;
                i21 = i12 + 2;
                if (iArr[i17] != iArr2[i18]) {
                    return false;
                }
                if (iArr[i19] != iArr2[i21]) {
                    return false;
                }
            case 6:
                i15 = 0;
                i14 = i15 + 1;
                i23 = i12 + 1;
                if (iArr[i15] != iArr2[i12]) {
                    return false;
                }
                i12 = i23;
                i13 = i14 + 1;
                i22 = i12 + 1;
                if (iArr[i14] != iArr2[i12]) {
                    return false;
                }
                i12 = i22;
                i17 = i13 + 1;
                i18 = i12 + 1;
                if (iArr[i13] != iArr2[i12]) {
                    return false;
                }
                i19 = i13 + 2;
                i21 = i12 + 2;
                if (iArr[i17] != iArr2[i18]) {
                    return false;
                }
                if (iArr[i19] != iArr2[i21]) {
                    return false;
                }
            case 7:
                i16 = 0;
                i15 = i16 + 1;
                i24 = i12 + 1;
                if (iArr[i16] != iArr2[i12]) {
                    return false;
                }
                i12 = i24;
                i14 = i15 + 1;
                i23 = i12 + 1;
                if (iArr[i15] != iArr2[i12]) {
                    return false;
                }
                i12 = i23;
                i13 = i14 + 1;
                i22 = i12 + 1;
                if (iArr[i14] != iArr2[i12]) {
                    return false;
                }
                i12 = i22;
                i17 = i13 + 1;
                i18 = i12 + 1;
                if (iArr[i13] != iArr2[i12]) {
                    return false;
                }
                i19 = i13 + 2;
                i21 = i12 + 2;
                if (iArr[i17] != iArr2[i18]) {
                    return false;
                }
                if (iArr[i19] != iArr2[i21]) {
                    return false;
                }
            case 8:
                int i25 = i12 + 1;
                if (iArr[0] != iArr2[i12]) {
                    return false;
                }
                i16 = 1;
                i12 = i25;
                i15 = i16 + 1;
                i24 = i12 + 1;
                if (iArr[i16] != iArr2[i12]) {
                    return false;
                }
                i12 = i24;
                i14 = i15 + 1;
                i23 = i12 + 1;
                if (iArr[i15] != iArr2[i12]) {
                    return false;
                }
                i12 = i23;
                i13 = i14 + 1;
                i22 = i12 + 1;
                if (iArr[i14] != iArr2[i12]) {
                    return false;
                }
                i12 = i22;
                i17 = i13 + 1;
                i18 = i12 + 1;
                if (iArr[i13] != iArr2[i12]) {
                    return false;
                }
                i19 = i13 + 2;
                i21 = i12 + 2;
                if (iArr[i17] != iArr2[i18]) {
                    return false;
                }
                if (iArr[i19] != iArr2[i21]) {
                    return false;
                }
            default:
                return m89676n(iArr, i11, i12);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m89677o() {
        if (this.f91007o) {
            if (this.f90993a == null) {
                if (this.f91003k != 0) {
                    throw new IllegalStateException("Cannot add names to Placeholder symbol table");
                }
                throw new IllegalStateException("Cannot add names to Root symbol table");
            }
            int[] iArr = this.f90998f;
            this.f90998f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f91004l;
            this.f91004l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f91007o = false;
        }
    }

    /* JADX INFO: renamed from: q */
    public int m89679q(int i11) {
        int i12 = i11 ^ this.f90995c;
        int i13 = i12 + (i12 >>> 16);
        int i14 = i13 ^ (i13 << 3);
        return i14 + (i14 >>> 12);
    }

    /* JADX INFO: renamed from: r */
    public int m89680r(int i11, int i12) {
        int i13 = i11 + (i11 >>> 15);
        int i14 = ((i13 ^ (i13 >>> 9)) + (i12 * 33)) ^ this.f90995c;
        int i15 = i14 + (i14 >>> 16);
        int i16 = i15 ^ (i15 >>> 4);
        return i16 + (i16 << 3);
    }

    /* JADX INFO: renamed from: s */
    public int m89681s(int i11, int i12, int i13) {
        int i14 = i11 ^ this.f90995c;
        int i15 = (((i14 + (i14 >>> 9)) * 31) + i12) * 33;
        int i16 = (i15 + (i15 >>> 15)) ^ i13;
        int i17 = i16 + (i16 >>> 4);
        int i18 = i17 + (i17 >>> 15);
        return i18 ^ (i18 << 9);
    }

    /* JADX INFO: renamed from: u */
    public static C40935a m89651u() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return m89652v((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    /* JADX INFO: renamed from: e */
    public final int m89667e(int i11) {
        int iM89665b = m89665b(i11);
        int[] iArr = this.f90998f;
        if (iArr[iM89665b + 3] == 0) {
            return iM89665b;
        }
        if (m89666d()) {
            return m89673k(i11);
        }
        int i12 = this.f91000h + ((iM89665b >> 3) << 2);
        if (iArr[i12 + 3] == 0) {
            return i12;
        }
        int i13 = this.f91001i;
        int i14 = this.f91002j;
        int i15 = i13 + ((iM89665b >> (i14 + 2)) << i14);
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            if (iArr[i15 + 3] == 0) {
                return i15;
            }
            i15 += 4;
        }
        int i17 = this.f91005m;
        int i18 = i17 + 4;
        this.f91005m = i18;
        if (i18 >= (this.f90999g << 3)) {
            if (this.f90997e) {
                m89672j();
            }
            return m89673k(i11);
        }
        return i17;
    }

    /* JADX INFO: renamed from: k */
    public final int m89673k(int i11) {
        m89658F();
        int iM89665b = m89665b(i11);
        int[] iArr = this.f90998f;
        if (iArr[iM89665b + 3] == 0) {
            return iM89665b;
        }
        int i12 = this.f91000h + ((iM89665b >> 3) << 2);
        if (iArr[i12 + 3] == 0) {
            return i12;
        }
        int i13 = this.f91001i;
        int i14 = this.f91002j;
        int i15 = i13 + ((iM89665b >> (i14 + 2)) << i14);
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            if (iArr[i15 + 3] == 0) {
                return i15;
            }
            i15 += 4;
        }
        int i17 = this.f91005m;
        this.f91005m = i17 + 4;
        return i17;
    }

    /* JADX INFO: renamed from: p */
    public String m89678p(String str, int[] iArr, int i11) {
        int iM89667e;
        m89677o();
        if (this.f90996d) {
            str = InternCache.instance.intern(str);
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    int iM89682t = m89682t(iArr, i11);
                    iM89667e = m89667e(iM89682t);
                    this.f90998f[iM89667e] = iM89682t;
                    int iM89664a = m89664a(iArr, i11);
                    int[] iArr2 = this.f90998f;
                    iArr2[iM89667e + 1] = iM89664a;
                    iArr2[iM89667e + 3] = i11;
                } else {
                    int iM89667e2 = m89667e(m89681s(iArr[0], iArr[1], iArr[2]));
                    int[] iArr3 = this.f90998f;
                    iArr3[iM89667e2] = iArr[0];
                    iArr3[iM89667e2 + 1] = iArr[1];
                    iArr3[iM89667e2 + 2] = iArr[2];
                    iArr3[iM89667e2 + 3] = 3;
                    iM89667e = iM89667e2;
                }
            } else {
                iM89667e = m89667e(m89680r(iArr[0], iArr[1]));
                int[] iArr4 = this.f90998f;
                iArr4[iM89667e] = iArr[0];
                iArr4[iM89667e + 1] = iArr[1];
                iArr4[iM89667e + 3] = 2;
            }
        } else {
            iM89667e = m89667e(m89679q(iArr[0]));
            int[] iArr5 = this.f90998f;
            iArr5[iM89667e] = iArr[0];
            iArr5[iM89667e + 3] = 1;
        }
        this.f91004l[iM89667e >> 2] = str;
        this.f91003k++;
        return str;
    }

    public String toString() {
        int iM89657E = m89657E();
        int iM89660H = m89660H();
        int iM89662J = m89662J();
        int iM89661I = m89661I();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", C40935a.class.getName(), Integer.valueOf(this.f91003k), Integer.valueOf(this.f90999g), Integer.valueOf(iM89657E), Integer.valueOf(iM89660H), Integer.valueOf(iM89662J), Integer.valueOf(iM89661I), Integer.valueOf(iM89657E + iM89660H + iM89662J + iM89661I), Integer.valueOf(m89663K()));
    }

    /* JADX INFO: renamed from: w */
    public String m89683w(int i11) {
        int iM89665b = m89665b(m89679q(i11));
        int[] iArr = this.f90998f;
        int i12 = iArr[iM89665b + 3];
        if (i12 == 1) {
            if (iArr[iM89665b] == i11) {
                return this.f91004l[iM89665b >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        int i13 = this.f91000h + ((iM89665b >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 1) {
            if (iArr[i13] == i11) {
                return this.f91004l[i13 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        return m89668f(iM89665b, i11);
    }

    /* JADX INFO: renamed from: x */
    public String m89684x(int i11, int i12) {
        int iM89665b = m89665b(m89680r(i11, i12));
        int[] iArr = this.f90998f;
        int i13 = iArr[iM89665b + 3];
        if (i13 == 2) {
            if (i11 == iArr[iM89665b] && i12 == iArr[iM89665b + 1]) {
                return this.f91004l[iM89665b >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this.f91000h + ((iM89665b >> 3) << 2);
        int i15 = iArr[i14 + 3];
        if (i15 == 2) {
            if (i11 == iArr[i14] && i12 == iArr[i14 + 1]) {
                return this.f91004l[i14 >> 2];
            }
        } else if (i15 == 0) {
            return null;
        }
        return m89669g(iM89665b, i11, i12);
    }

    /* JADX INFO: renamed from: y */
    public String m89685y(int i11, int i12, int i13) {
        int iM89665b = m89665b(m89681s(i11, i12, i13));
        int[] iArr = this.f90998f;
        int i14 = iArr[iM89665b + 3];
        if (i14 == 3) {
            if (i11 == iArr[iM89665b] && iArr[iM89665b + 1] == i12 && iArr[iM89665b + 2] == i13) {
                return this.f91004l[iM89665b >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        int i15 = this.f91000h + ((iM89665b >> 3) << 2);
        int i16 = iArr[i15 + 3];
        if (i16 == 3) {
            if (i11 == iArr[i15] && iArr[i15 + 1] == i12 && iArr[i15 + 2] == i13) {
                return this.f91004l[i15 >> 2];
            }
        } else if (i16 == 0) {
            return null;
        }
        return m89670h(iM89665b, i11, i12, i13);
    }

    public C40935a(C40935a c40935a, int i11, a aVar, boolean z11, boolean z12) {
        this.f90993a = c40935a;
        this.f90995c = i11;
        this.f90996d = z11;
        this.f90997e = z12;
        this.f90994b = null;
        this.f91003k = aVar.f91009b;
        int i12 = aVar.f91008a;
        this.f90999g = i12;
        int i13 = i12 << 2;
        this.f91000h = i13;
        this.f91001i = i13 + (i13 >> 1);
        this.f91002j = aVar.f91010c;
        this.f90998f = aVar.f91011d;
        this.f91004l = aVar.f91012e;
        this.f91005m = aVar.f91013f;
        this.f91006n = aVar.f91014g;
        this.f91007o = true;
    }
}
