package p387k;

import android.text.TextUtils;
import android.util.Log;
import p295h.C38062a;

/* JADX INFO: renamed from: k.h */
/* JADX INFO: loaded from: classes23.dex */
public class C40833h {
    /* JADX INFO: renamed from: a */
    public static boolean m89357a() {
        return C38062a.f85676b;
    }

    /* JADX INFO: renamed from: c */
    public static String m89359c() {
        return C38062a.f85677c + "[" + Thread.currentThread().getName() + "]";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m89360d() {
        return C38062a.f85675a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m89358b(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* JADX INFO: renamed from: e */
    public static void m89361e(String str, String str2) {
        if (m89357a() && m89358b(str2)) {
            Log.d(m89359c() + "-debug-" + str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m89362f(String str) {
        if (m89360d() && m89358b(str)) {
            Log.d(m89359c() + "-sdk", str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m89363g(String str) {
        if (m89360d() && m89358b(str)) {
            Log.e(m89359c() + "-sdk", str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m89364h(String str) {
        if (m89360d() && m89358b(str)) {
            Log.i(m89359c() + "-sdk", str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m89365i(String str) {
        if (m89360d() && m89358b(str)) {
            Log.w(m89359c() + "-sdk", str);
        }
    }
}
