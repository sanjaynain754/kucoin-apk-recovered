package dh0;

import com.tencent.bugly.proguard.C33627eb;
import java.lang.reflect.Modifier;
import okhttp3.HttpUrl;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: dh0.h */
/* JADX INFO: compiled from: StringMaker.java */
/* JADX INFO: loaded from: classes61.dex */
public class C36692h {

    /* JADX INFO: renamed from: j */
    public static C36692h f79578j;

    /* JADX INFO: renamed from: k */
    public static C36692h f79579k;

    /* JADX INFO: renamed from: l */
    public static C36692h f79580l;

    /* JADX INFO: renamed from: a */
    public boolean f79581a = true;

    /* JADX INFO: renamed from: b */
    public boolean f79582b = true;

    /* JADX INFO: renamed from: c */
    public boolean f79583c = false;

    /* JADX INFO: renamed from: d */
    public boolean f79584d = false;

    /* JADX INFO: renamed from: e */
    public boolean f79585e = false;

    /* JADX INFO: renamed from: f */
    public boolean f79586f = true;

    /* JADX INFO: renamed from: g */
    public boolean f79587g = true;

    /* JADX INFO: renamed from: h */
    public boolean f79588h = true;

    /* JADX INFO: renamed from: i */
    public int f79589i;

    /* JADX INFO: renamed from: c */
    public void m82157c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i11 = 0; i11 < clsArr.length; i11++) {
            if (i11 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(m82161g(clsArr[i11]));
        }
    }

    static {
        C36692h c36692h = new C36692h();
        f79578j = c36692h;
        c36692h.f79581a = true;
        c36692h.f79582b = false;
        c36692h.f79583c = false;
        c36692h.f79584d = false;
        c36692h.f79585e = true;
        c36692h.f79586f = false;
        c36692h.f79587g = false;
        c36692h.f79589i = 0;
        C36692h c36692h2 = new C36692h();
        f79579k = c36692h2;
        c36692h2.f79581a = true;
        c36692h2.f79582b = true;
        c36692h2.f79583c = false;
        c36692h2.f79584d = false;
        c36692h2.f79585e = false;
        f79578j.f79589i = 1;
        C36692h c36692h3 = new C36692h();
        f79580l = c36692h3;
        c36692h3.f79581a = false;
        c36692h3.f79582b = true;
        c36692h3.f79583c = false;
        c36692h3.f79584d = true;
        c36692h3.f79585e = false;
        c36692h3.f79588h = false;
        c36692h3.f79589i = 2;
    }

    /* JADX INFO: renamed from: a */
    public void m82155a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        if (this.f79582b) {
            stringBuffer.append("(");
            m82157c(stringBuffer, clsArr);
            stringBuffer.append(")");
        } else if (clsArr.length == 0) {
            stringBuffer.append("()");
        } else {
            stringBuffer.append("(..)");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82156b(StringBuffer stringBuffer, Class[] clsArr) {
        if (!this.f79583c || clsArr == null || clsArr.length == 0) {
            return;
        }
        stringBuffer.append(" throws ");
        m82157c(stringBuffer, clsArr);
    }

    /* JADX INFO: renamed from: d */
    public String m82158d(String str) {
        int iLastIndexOf = str.lastIndexOf(45);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: e */
    public String m82159e(int i11) {
        if (!this.f79584d) {
            return "";
        }
        String string = Modifier.toString(i11);
        if (string.length() == 0) {
            return "";
        }
        return string + C33627eb.f69716f;
    }

    /* JADX INFO: renamed from: f */
    public String m82160f(Class cls, String str) {
        return m82162h(cls, str, this.f79585e);
    }

    /* JADX INFO: renamed from: h */
    public String m82162h(Class cls, String str, boolean z11) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return z11 ? m82163i(str).replace(Typography.dollar, '.') : str.replace(Typography.dollar, '.');
        }
        Class<?> componentType = cls.getComponentType();
        return m82162h(componentType, componentType.getName(), z11) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    /* JADX INFO: renamed from: i */
    public String m82163i(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: g */
    public String m82161g(Class cls) {
        return m82162h(cls, cls.getName(), this.f79581a);
    }
}
