package dh0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import ch0.InterfaceC4978a;
import ch0.InterfaceC4979b;
import com.tencent.bugly.proguard.C33844oi;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.lang.InterfaceC43177c;

/* JADX INFO: renamed from: dh0.b */
/* JADX INFO: compiled from: Factory.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C36686b {

    /* JADX INFO: renamed from: e */
    public static final Class[] f79545e = new Class[0];

    /* JADX INFO: renamed from: f */
    public static final String[] f79546f = new String[0];

    /* JADX INFO: renamed from: g */
    public static Hashtable f79547g;

    /* JADX INFO: renamed from: h */
    public static Object[] f79548h;

    /* JADX INFO: renamed from: a */
    public Class f79549a;

    /* JADX INFO: renamed from: b */
    public ClassLoader f79550b;

    /* JADX INFO: renamed from: c */
    public String f79551c;

    /* JADX INFO: renamed from: d */
    public int f79552d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f79547g = hashtable;
        hashtable.put("void", Void.TYPE);
        f79547g.put(TypedValues.Custom.S_BOOLEAN, Boolean.TYPE);
        f79547g.put("byte", Byte.TYPE);
        f79547g.put("char", Character.TYPE);
        f79547g.put("short", Short.TYPE);
        f79547g.put("int", Integer.TYPE);
        f79547g.put("long", Long.TYPE);
        f79547g.put(TypedValues.Custom.S_FLOAT, Float.TYPE);
        f79547g.put("double", Double.TYPE);
        f79548h = new Object[0];
    }

    /* JADX INFO: renamed from: a */
    public static Class m82121a(String str, ClassLoader classLoader) {
        if (str.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return null;
        }
        Class cls = (Class) f79547g.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return ClassNotFoundException.class;
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC43175a m82122b(InterfaceC43175a.a aVar, Object obj, Object obj2) {
        return new C36687c(aVar, obj, obj2, f79548h);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC43175a m82123c(InterfaceC43175a.a aVar, Object obj, Object obj2, Object obj3) {
        return new C36687c(aVar, obj, obj2, new Object[]{obj3});
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC43175a m82124d(InterfaceC43175a.a aVar, Object obj, Object obj2, Object obj3, Object obj4) {
        return new C36687c(aVar, obj, obj2, new Object[]{obj3, obj4});
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC43175a m82125e(InterfaceC43175a.a aVar, Object obj, Object obj2, Object[] objArr) {
        return new C36687c(aVar, obj, obj2, objArr);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC4978a m82126f(String str, String str2, Class cls, String str3, String str4, String str5, String str6) {
        int i11 = Integer.parseInt(str, 16);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, C33844oi.f71346o);
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i12 = 0; i12 < iCountTokens; i12++) {
            clsArr[i12] = m82121a(stringTokenizer.nextToken(), this.f79550b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, C33844oi.f71346o);
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i13 = 0; i13 < iCountTokens2; i13++) {
            strArr[i13] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, C33844oi.f71346o);
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i14 = 0; i14 < iCountTokens3; i14++) {
            clsArr2[i14] = m82121a(stringTokenizer3.nextToken(), this.f79550b);
        }
        return new C36689e(i11, str2, cls, clsArr, strArr, clsArr2, m82121a(str6, this.f79550b));
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC4978a m82127g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return m82126f(str, str2, m82121a(str3, this.f79550b), str4, str5, str6, str7);
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC43175a.a m82128h(String str, InterfaceC43177c interfaceC43177c, int i11) {
        int i12 = this.f79552d;
        this.f79552d = i12 + 1;
        return new C36687c.a(i12, str, interfaceC43177c, m82129i(i11, -1));
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC4979b m82129i(int i11, int i12) {
        return new C36691g(this.f79549a, this.f79551c, i11);
    }

    public C36686b(String str, Class cls) {
        this.f79551c = str;
        this.f79549a = cls;
        this.f79550b = cls.getClassLoader();
    }
}
