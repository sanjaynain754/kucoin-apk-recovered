package gb0;

import android.util.Log;

/* JADX INFO: renamed from: gb0.a */
/* JADX INFO: compiled from: QLog.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C37859a {

    /* JADX INFO: renamed from: a */
    public static int f85236a = 5;

    /* JADX INFO: renamed from: c */
    public static String m85439c() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m85440d() {
        return f85236a > 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m85441e() {
        return f85236a > 4;
    }

    /* JADX INFO: renamed from: a */
    public static void m85437a(Exception exc) {
        if (m85440d()) {
            exc.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m85438b(Object obj) {
        if (m85440d()) {
            Log.e("RootBeer", m85439c() + String.valueOf(obj));
            Log.e("QLog", m85439c() + String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m85442f(Object obj) {
        if (m85441e()) {
            Log.v("RootBeer", m85439c() + String.valueOf(obj));
        }
    }
}
