package p359j5;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: j5.d */
/* JADX INFO: compiled from: JSObjects.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40275d {

    /* JADX INFO: renamed from: a */
    public static Object f89511a;

    /* JADX INFO: renamed from: b */
    public static Object f89512b;

    /* JADX INFO: renamed from: j5.d$b */
    /* JADX INFO: compiled from: JSObjects.java */
    public static class b {
        public b() {
        }
    }

    /* JADX INFO: renamed from: j5.d$c */
    /* JADX INFO: compiled from: JSObjects.java */
    public static class c {
        public c() {
        }
    }

    static {
        f89511a = new c();
        f89512b = new b();
    }

    /* JADX INFO: renamed from: a */
    public static Object m88670a(Object obj, String str) {
        HashMap map = (HashMap) obj;
        if (!map.containsKey(str)) {
            return m88673d();
        }
        Object obj2 = map.get(str);
        return obj2 == null ? m88671b() : obj2;
    }

    /* JADX INFO: renamed from: b */
    public static Object m88671b() {
        return f89512b;
    }

    /* JADX INFO: renamed from: c */
    public static void m88672c(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static Object m88673d() {
        return f89511a;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m88674e(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static double m88675f(Object obj) {
        return ((Double) obj).doubleValue();
    }

    /* JADX INFO: renamed from: g */
    public static Map<String, Object> m88676g(Object obj) {
        return (HashMap) obj;
    }

    /* JADX INFO: renamed from: h */
    public static String m88677h(Object obj) {
        return (String) obj;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m88678i(Object obj) {
        return obj instanceof Boolean;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m88679j(Object obj) {
        return obj instanceof b;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m88680k(Object obj) {
        return obj instanceof Double;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m88681l(Object obj) {
        return obj instanceof HashMap;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m88682m(Object obj) {
        return obj instanceof String;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m88683n(Object obj) {
        return obj instanceof c;
    }

    /* JADX INFO: renamed from: q */
    public static Object m88686q() {
        return new HashMap();
    }

    /* JADX INFO: renamed from: o */
    public static Object m88684o(boolean z11) {
        return Boolean.valueOf(z11);
    }

    /* JADX INFO: renamed from: p */
    public static Object m88685p(double d11) {
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: r */
    public static Object m88687r(String str) {
        return str;
    }
}
