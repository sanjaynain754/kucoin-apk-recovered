package dh0;

import com.tencent.bugly.proguard.C33844oi;
import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import org.aspectj.lang.InterfaceC43177c;

/* JADX INFO: renamed from: dh0.f */
/* JADX INFO: compiled from: SignatureImpl.java */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC36690f implements InterfaceC43177c {

    /* JADX INFO: renamed from: h */
    public static boolean f79564h = true;

    /* JADX INFO: renamed from: i */
    public static String[] f79565i = new String[0];

    /* JADX INFO: renamed from: j */
    public static Class[] f79566j = new Class[0];

    /* JADX INFO: renamed from: a */
    public int f79567a;

    /* JADX INFO: renamed from: b */
    public String f79568b;

    /* JADX INFO: renamed from: c */
    public String f79569c;

    /* JADX INFO: renamed from: d */
    public Class f79570d;

    /* JADX INFO: renamed from: e */
    public a f79571e;

    /* JADX INFO: renamed from: f */
    public String f79572f;

    /* JADX INFO: renamed from: g */
    public ClassLoader f79573g = null;

    /* JADX INFO: renamed from: dh0.f$a */
    /* JADX INFO: compiled from: SignatureImpl.java */
    /* JADX INFO: loaded from: classes61.dex */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo82150a(int i11, String str);

        String get(int i11);
    }

    /* JADX INFO: renamed from: dh0.f$b */
    /* JADX INFO: compiled from: SignatureImpl.java */
    /* JADX INFO: loaded from: classes61.dex */
    public static final class b implements a {

        /* JADX INFO: renamed from: a */
        public SoftReference f79574a;

        /* JADX INFO: renamed from: c */
        public final String[] m82152c() {
            String[] strArr = new String[3];
            this.f79574a = new SoftReference(strArr);
            return strArr;
        }

        /* JADX INFO: renamed from: b */
        public final String[] m82151b() {
            return (String[]) this.f79574a.get();
        }

        public b() {
            m82152c();
        }

        @Override // dh0.AbstractC36690f.a
        /* JADX INFO: renamed from: a */
        public void mo82150a(int i11, String str) {
            String[] strArrM82151b = m82151b();
            if (strArrM82151b == null) {
                strArrM82151b = m82152c();
            }
            strArrM82151b[i11] = str;
        }

        @Override // dh0.AbstractC36690f.a
        public String get(int i11) {
            String[] strArrM82151b = m82151b();
            if (strArrM82151b == null) {
                return null;
            }
            return strArrM82151b[i11];
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo82138a(C36692h c36692h);

    /* JADX INFO: renamed from: c */
    public String m82141c(int i11) {
        int iIndexOf = this.f79572f.indexOf(45);
        int i12 = 0;
        while (true) {
            int i13 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            i12 = iIndexOf + 1;
            iIndexOf = this.f79572f.indexOf(45, i12);
            i11 = i13;
        }
        if (iIndexOf == -1) {
            iIndexOf = this.f79572f.length();
        }
        return this.f79572f.substring(i12, iIndexOf);
    }

    /* JADX INFO: renamed from: f */
    public Class m82144f() {
        if (this.f79570d == null) {
            this.f79570d = m82142d(2);
        }
        return this.f79570d;
    }

    /* JADX INFO: renamed from: g */
    public String m82145g() {
        if (this.f79569c == null) {
            this.f79569c = m82144f().getName();
        }
        return this.f79569c;
    }

    /* JADX INFO: renamed from: h */
    public final ClassLoader m82146h() {
        if (this.f79573g == null) {
            this.f79573g = getClass().getClassLoader();
        }
        return this.f79573g;
    }

    /* JADX INFO: renamed from: i */
    public int m82147i() {
        if (this.f79567a == -1) {
            this.f79567a = m82140b(0);
        }
        return this.f79567a;
    }

    /* JADX INFO: renamed from: j */
    public String m82148j() {
        if (this.f79568b == null) {
            this.f79568b = m82141c(1);
        }
        return this.f79568b;
    }

    /* JADX INFO: renamed from: k */
    public String m82149k(C36692h c36692h) {
        String strMo82138a;
        if (f79564h) {
            a aVar = this.f79571e;
            if (aVar == null) {
                try {
                    this.f79571e = new b();
                } catch (Throwable unused) {
                    f79564h = false;
                }
                strMo82138a = null;
            } else {
                strMo82138a = aVar.get(c36692h.f79589i);
            }
        } else {
            strMo82138a = null;
        }
        if (strMo82138a == null) {
            strMo82138a = mo82138a(c36692h);
        }
        if (f79564h) {
            this.f79571e.mo82150a(c36692h.f79589i, strMo82138a);
        }
        return strMo82138a;
    }

    public final String toString() {
        return m82149k(C36692h.f79579k);
    }

    public AbstractC36690f(int i11, String str, Class cls) {
        this.f79567a = i11;
        this.f79568b = str;
        this.f79570d = cls;
    }

    /* JADX INFO: renamed from: b */
    public int m82140b(int i11) {
        return Integer.parseInt(m82141c(i11), 16);
    }

    /* JADX INFO: renamed from: d */
    public Class m82142d(int i11) {
        return C36686b.m82121a(m82141c(i11), m82146h());
    }

    /* JADX INFO: renamed from: e */
    public Class[] m82143e(int i11) {
        StringTokenizer stringTokenizer = new StringTokenizer(m82141c(i11), C33844oi.f71346o);
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i12 = 0; i12 < iCountTokens; i12++) {
            clsArr[i12] = C36686b.m82121a(stringTokenizer.nextToken(), m82146h());
        }
        return clsArr;
    }
}
