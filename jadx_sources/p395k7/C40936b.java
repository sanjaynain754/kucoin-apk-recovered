package p395k7;

import androidx.camera.view.C1454t;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k7.b */
/* JADX INFO: compiled from: CharsToNameCanonicalizer.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C40936b {

    /* JADX INFO: renamed from: a */
    public final C40936b f91015a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<b> f91016b;

    /* JADX INFO: renamed from: c */
    public final int f91017c;

    /* JADX INFO: renamed from: d */
    public final int f91018d;

    /* JADX INFO: renamed from: e */
    public boolean f91019e;

    /* JADX INFO: renamed from: f */
    public String[] f91020f;

    /* JADX INFO: renamed from: g */
    public a[] f91021g;

    /* JADX INFO: renamed from: h */
    public int f91022h;

    /* JADX INFO: renamed from: i */
    public int f91023i;

    /* JADX INFO: renamed from: j */
    public int f91024j;

    /* JADX INFO: renamed from: k */
    public int f91025k;

    /* JADX INFO: renamed from: l */
    public boolean f91026l;

    /* JADX INFO: renamed from: m */
    public BitSet f91027m;

    /* JADX INFO: renamed from: k7.b$a */
    /* JADX INFO: compiled from: CharsToNameCanonicalizer.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f91028a;

        /* JADX INFO: renamed from: b */
        public final a f91029b;

        /* JADX INFO: renamed from: c */
        public final int f91030c;

        /* JADX INFO: renamed from: a */
        public String m89706a(char[] cArr, int i11, int i12) {
            if (this.f91028a.length() != i12) {
                return null;
            }
            int i13 = 0;
            while (this.f91028a.charAt(i13) == cArr[i11 + i13]) {
                i13++;
                if (i13 >= i12) {
                    return this.f91028a;
                }
            }
            return null;
        }

        public a(String str, a aVar) {
            this.f91028a = str;
            this.f91029b = aVar;
            this.f91030c = aVar != null ? 1 + aVar.f91030c : 1;
        }
    }

    /* JADX INFO: renamed from: k7.b$b */
    /* JADX INFO: compiled from: CharsToNameCanonicalizer.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f91031a;

        /* JADX INFO: renamed from: b */
        public final int f91032b;

        /* JADX INFO: renamed from: c */
        public final String[] f91033c;

        /* JADX INFO: renamed from: d */
        public final a[] f91034d;

        public b(int i11, int i12, String[] strArr, a[] aVarArr) {
            this.f91031a = i11;
            this.f91032b = i12;
            this.f91033c = strArr;
            this.f91034d = aVarArr;
        }

        /* JADX INFO: renamed from: a */
        public static b m89707a(int i11) {
            return new b(0, 0, new String[i11], new a[i11 >> 1]);
        }

        public b(C40936b c40936b) {
            this.f91031a = c40936b.f91022h;
            this.f91032b = c40936b.f91025k;
            this.f91033c = c40936b.f91020f;
            this.f91034d = c40936b.f91021g;
        }
    }

    public C40936b(int i11) {
        this.f91015a = null;
        this.f91017c = i11;
        this.f91019e = true;
        this.f91018d = -1;
        this.f91026l = false;
        this.f91025k = 0;
        this.f91016b = new AtomicReference<>(b.m89707a(64));
    }

    /* JADX INFO: renamed from: l */
    public String m89699l(char[] cArr, int i11, int i12, int i13) {
        if (i12 < 1) {
            return "";
        }
        if (!this.f91019e) {
            return new String(cArr, i11, i12);
        }
        int iM89694d = m89694d(i13);
        String str = this.f91020f[iM89694d];
        if (str != null) {
            if (str.length() == i12) {
                int i14 = 0;
                while (str.charAt(i14) == cArr[i11 + i14]) {
                    i14++;
                    if (i14 == i12) {
                        return str;
                    }
                }
            }
            a aVar = this.f91021g[iM89694d >> 1];
            if (aVar != null) {
                String strM89706a = aVar.m89706a(cArr, i11, i12);
                if (strM89706a != null) {
                    return strM89706a;
                }
                String strM89692b = m89692b(cArr, i11, i12, aVar.f91029b);
                if (strM89692b != null) {
                    return strM89692b;
                }
            }
        }
        return m89691a(cArr, i11, i12, i13, iM89694d);
    }

    /* JADX INFO: renamed from: f */
    public static int m89688f(int i11) {
        return i11 - (i11 >> 2);
    }

    /* JADX INFO: renamed from: k */
    public static C40936b m89690k(int i11) {
        return new C40936b(i11);
    }

    /* JADX INFO: renamed from: a */
    public final String m89691a(char[] cArr, int i11, int i12, int i13, int i14) {
        if (this.f91026l) {
            m89698i();
            this.f91026l = false;
        } else if (this.f91022h >= this.f91023i) {
            m89704q();
            i14 = m89694d(m89697h(cArr, i11, i12));
        }
        String str = new String(cArr, i11, i12);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this.f91018d)) {
            str = InternCache.instance.intern(str);
        }
        this.f91022h++;
        String[] strArr = this.f91020f;
        if (strArr[i14] == null) {
            strArr[i14] = str;
            return str;
        }
        int i15 = i14 >> 1;
        a aVar = new a(str, this.f91021g[i15]);
        int i16 = aVar.f91030c;
        if (i16 > 150) {
            m89693c(i15, aVar, i14);
            return str;
        }
        this.f91021g[i15] = aVar;
        this.f91025k = Math.max(i16, this.f91025k);
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final String m89692b(char[] cArr, int i11, int i12, a aVar) {
        while (aVar != null) {
            String strM89706a = aVar.m89706a(cArr, i11, i12);
            if (strM89706a != null) {
                return strM89706a;
            }
            aVar = aVar.f91029b;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m89693c(int i11, a aVar, int i12) {
        BitSet bitSet = this.f91027m;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.f91027m = bitSet2;
            bitSet2.set(i11);
        } else if (bitSet.get(i11)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this.f91018d)) {
                m89695e(150);
            }
            this.f91019e = false;
        } else {
            this.f91027m.set(i11);
        }
        this.f91020f[i12] = aVar.f91028a;
        this.f91021g[i11] = null;
        this.f91022h -= aVar.f91030c;
        this.f91025k = -1;
    }

    /* JADX INFO: renamed from: d */
    public int m89694d(int i11) {
        int i12 = i11 + (i11 >>> 15);
        int i13 = i12 ^ (i12 << 7);
        return (i13 + (i13 >>> 3)) & this.f91024j;
    }

    /* JADX INFO: renamed from: e */
    public void m89695e(int i11) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f91022h + ") now exceeds maximum, " + i11 + " -- suspect a DoS attack based on hash collisions");
    }

    /* JADX INFO: renamed from: h */
    public int m89697h(char[] cArr, int i11, int i12) {
        int i13 = this.f91017c;
        int i14 = i12 + i11;
        while (i11 < i14) {
            i13 = (i13 * 33) + cArr[i11];
            i11++;
        }
        if (i13 == 0) {
            return 1;
        }
        return i13;
    }

    /* JADX INFO: renamed from: i */
    public final void m89698i() {
        String[] strArr = this.f91020f;
        this.f91020f = (String[]) Arrays.copyOf(strArr, strArr.length);
        a[] aVarArr = this.f91021g;
        this.f91021g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    /* JADX INFO: renamed from: m */
    public int m89700m() {
        return this.f91017c;
    }

    /* JADX INFO: renamed from: n */
    public C40936b m89701n(int i11) {
        return new C40936b(this, i11, this.f91017c, this.f91016b.get());
    }

    /* JADX INFO: renamed from: o */
    public boolean m89702o() {
        return !this.f91026l;
    }

    /* JADX INFO: renamed from: p */
    public final void m89703p(b bVar) {
        int i11 = bVar.f91031a;
        b bVar2 = this.f91016b.get();
        if (i11 == bVar2.f91031a) {
            return;
        }
        if (i11 > 12000) {
            bVar = b.m89707a(64);
        }
        C1454t.m2255a(this.f91016b, bVar2, bVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m89704q() {
        String[] strArr = this.f91020f;
        int length = strArr.length;
        int i11 = length + length;
        if (i11 > 65536) {
            this.f91022h = 0;
            this.f91019e = false;
            this.f91020f = new String[64];
            this.f91021g = new a[32];
            this.f91024j = 63;
            this.f91026l = false;
            return;
        }
        a[] aVarArr = this.f91021g;
        this.f91020f = new String[i11];
        this.f91021g = new a[i11 >> 1];
        this.f91024j = i11 - 1;
        this.f91023i = m89688f(i11);
        int i12 = 0;
        int iMax = 0;
        for (String str : strArr) {
            if (str != null) {
                i12++;
                int iM89694d = m89694d(m89696g(str));
                String[] strArr2 = this.f91020f;
                if (strArr2[iM89694d] == null) {
                    strArr2[iM89694d] = str;
                } else {
                    int i13 = iM89694d >> 1;
                    a aVar = new a(str, this.f91021g[i13]);
                    this.f91021g[i13] = aVar;
                    iMax = Math.max(iMax, aVar.f91030c);
                }
            }
        }
        int i14 = length >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            for (a aVar2 = aVarArr[i15]; aVar2 != null; aVar2 = aVar2.f91029b) {
                i12++;
                String str2 = aVar2.f91028a;
                int iM89694d2 = m89694d(m89696g(str2));
                String[] strArr3 = this.f91020f;
                if (strArr3[iM89694d2] == null) {
                    strArr3[iM89694d2] = str2;
                } else {
                    int i16 = iM89694d2 >> 1;
                    a aVar3 = new a(str2, this.f91021g[i16]);
                    this.f91021g[i16] = aVar3;
                    iMax = Math.max(iMax, aVar3.f91030c);
                }
            }
        }
        this.f91025k = iMax;
        this.f91027m = null;
        if (i12 != this.f91022h) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.f91022h), Integer.valueOf(i12)));
        }
    }

    /* JADX INFO: renamed from: j */
    public static C40936b m89689j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return m89690k((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    /* JADX INFO: renamed from: g */
    public int m89696g(String str) {
        int length = str.length();
        int iCharAt = this.f91017c;
        for (int i11 = 0; i11 < length; i11++) {
            iCharAt = (iCharAt * 33) + str.charAt(i11);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    /* JADX INFO: renamed from: r */
    public void m89705r() {
        C40936b c40936b;
        if (m89702o() && (c40936b = this.f91015a) != null && this.f91019e) {
            c40936b.m89703p(new b(this));
            this.f91026l = true;
        }
    }

    public C40936b(C40936b c40936b, int i11, int i12, b bVar) {
        this.f91015a = c40936b;
        this.f91017c = i12;
        this.f91016b = null;
        this.f91018d = i11;
        this.f91019e = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i11);
        String[] strArr = bVar.f91033c;
        this.f91020f = strArr;
        this.f91021g = bVar.f91034d;
        this.f91022h = bVar.f91031a;
        this.f91025k = bVar.f91032b;
        int length = strArr.length;
        this.f91023i = m89688f(length);
        this.f91024j = length - 1;
        this.f91026l = true;
    }
}
