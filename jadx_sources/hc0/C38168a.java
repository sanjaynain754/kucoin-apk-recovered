package hc0;

import android.util.Log;

/* JADX INFO: renamed from: hc0.a */
/* JADX INFO: compiled from: CLSLog.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C38168a {
    /* JADX INFO: renamed from: a */
    public static void m86124a(String str, Object obj) {
        Log.e("CLSAndroid", m86125b(str, obj));
    }

    /* JADX INFO: renamed from: d */
    public static String m86127d(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        return obj instanceof Boolean ? String.valueOf(obj) : obj.toString();
    }

    /* JADX INFO: renamed from: e */
    public static void m86128e(String str, Object obj) {
        Log.w("CLSAndroid", m86125b(str, obj));
    }

    /* JADX INFO: renamed from: b */
    public static String m86125b(String str, Object obj) {
        return String.format("module: %s, %s", str, m86127d(obj));
    }

    /* JADX INFO: renamed from: c */
    public static String m86126c(String str, Object... objArr) {
        return String.format(str, objArr);
    }
}
