package if0;

import hf0.C38193b;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: if0.b */
/* JADX INFO: compiled from: Attributes.java */
/* JADX INFO: loaded from: classes60.dex */
public class C38529b implements Iterable<C38528a>, Cloneable {

    /* JADX INFO: renamed from: e */
    public static final String[] f86496e = new String[0];

    /* JADX INFO: renamed from: b */
    public int f86497b = 0;

    /* JADX INFO: renamed from: c */
    public String[] f86498c;

    /* JADX INFO: renamed from: d */
    public String[] f86499d;

    /* JADX INFO: renamed from: if0.b$a */
    /* JADX INFO: compiled from: Attributes.java */
    public class a implements Iterator<C38528a> {

        /* JADX INFO: renamed from: b */
        public int f86500b = 0;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C38528a next() {
            C38529b c38529b = C38529b.this;
            String[] strArr = c38529b.f86499d;
            int i11 = this.f86500b;
            String str = strArr[i11];
            String str2 = c38529b.f86498c[i11];
            if (str == null) {
                str = "";
            }
            C38528a c38528a = new C38528a(str2, str, c38529b);
            this.f86500b++;
            return c38528a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86500b < C38529b.this.f86497b;
        }

        @Override // java.util.Iterator
        public void remove() {
            C38529b c38529b = C38529b.this;
            int i11 = this.f86500b - 1;
            this.f86500b = i11;
            c38529b.m87157k(i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m87149e(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: g */
    public static String[] m87150g(String[] strArr, int i11) {
        String[] strArr2 = new String[i11];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i11));
        return strArr2;
    }

    /* JADX INFO: renamed from: c */
    public final void m87151c(String str, String str2) {
        m87152d(this.f86497b + 1);
        String[] strArr = this.f86498c;
        int i11 = this.f86497b;
        strArr[i11] = str;
        this.f86499d[i11] = str2;
        this.f86497b = i11 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m87152d(int i11) {
        C38193b.m86179d(i11 >= this.f86497b);
        String[] strArr = this.f86498c;
        int length = strArr.length;
        if (length >= i11) {
            return;
        }
        int i12 = length >= 4 ? this.f86497b * 2 : 4;
        if (i11 <= i12) {
            i11 = i12;
        }
        this.f86498c = m87150g(strArr, i11);
        this.f86499d = m87150g(this.f86499d, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C38529b c38529b = (C38529b) obj;
        if (this.f86497b == c38529b.f86497b && Arrays.equals(this.f86498c, c38529b.f86498c)) {
            return Arrays.equals(this.f86499d, c38529b.f86499d);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f86497b * 31) + Arrays.hashCode(this.f86498c)) * 31) + Arrays.hashCode(this.f86499d);
    }

    @Override // java.lang.Iterable
    public Iterator<C38528a> iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: k */
    public final void m87157k(int i11) {
        C38193b.m86177b(i11 >= this.f86497b);
        int i12 = (this.f86497b - i11) - 1;
        if (i12 > 0) {
            String[] strArr = this.f86498c;
            int i13 = i11 + 1;
            System.arraycopy(strArr, i13, strArr, i11, i12);
            String[] strArr2 = this.f86499d;
            System.arraycopy(strArr2, i13, strArr2, i11, i12);
        }
        int i14 = this.f86497b - 1;
        this.f86497b = i14;
        this.f86498c[i14] = null;
        this.f86499d[i14] = null;
    }

    public int size() {
        return this.f86497b;
    }

    public C38529b() {
        String[] strArr = f86496e;
        this.f86498c = strArr;
        this.f86499d = strArr;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C38529b clone() {
        try {
            C38529b c38529b = (C38529b) super.clone();
            c38529b.f86497b = this.f86497b;
            this.f86498c = m87150g(this.f86498c, this.f86497b);
            this.f86499d = m87150g(this.f86499d, this.f86497b);
            return c38529b;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: h */
    public String m87154h(String str) {
        int iM87155i = m87155i(str);
        if (iM87155i == -1) {
            return "";
        }
        return m87149e(this.f86499d[iM87155i]);
    }

    /* JADX INFO: renamed from: i */
    public int m87155i(String str) {
        C38193b.m86181f(str);
        for (int i11 = 0; i11 < this.f86497b; i11++) {
            if (str.equals(this.f86498c[i11])) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public C38529b m87156j(String str, String str2) {
        int iM87155i = m87155i(str);
        if (iM87155i != -1) {
            this.f86499d[iM87155i] = str2;
            return this;
        }
        m87151c(str, str2);
        return this;
    }
}
