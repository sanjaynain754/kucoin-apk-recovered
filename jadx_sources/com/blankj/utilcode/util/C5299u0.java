package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import com.google.gson.Gson;
import java.io.File;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.blankj.utilcode.util.u0 */
/* JADX INFO: compiled from: UtilsBridge.java */
/* JADX INFO: loaded from: classes.dex */
public class C5299u0 {
    /* JADX INFO: renamed from: I */
    public static void m6471I(Runnable... runnableArr) {
        for (Runnable runnable : runnableArr) {
            ThreadUtils.m6109b().execute(runnable);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m6464B(Application application) {
        C5291q0.f6582h.m6381p(application);
    }

    /* JADX INFO: renamed from: J */
    public static void m6472J(Activity activity, C5287o0.a aVar) {
        C5291q0.f6582h.m6384t(activity, aVar);
    }

    /* JADX INFO: renamed from: M */
    public static void m6475M(Application application) {
        C5291q0.f6582h.m6387y(application);
    }

    /* JADX INFO: renamed from: a */
    public static void m6478a(Activity activity, C5287o0.a aVar) {
        C5291q0.f6582h.m6370c(activity, aVar);
    }

    public static void addOnAppStatusChangedListener(C5287o0.b bVar) {
        C5291q0.f6582h.addOnAppStatusChangedListener(bVar);
    }

    /* JADX INFO: renamed from: m */
    public static List<Activity> m6490m() {
        return C5291q0.f6582h.m6374i();
    }

    /* JADX INFO: renamed from: p */
    public static Application m6493p() {
        return C5291q0.f6582h.m6379n();
    }

    public static void removeOnAppStatusChangedListener(C5287o0.b bVar) {
        C5291q0.f6582h.removeOnAppStatusChangedListener(bVar);
    }

    /* JADX INFO: renamed from: w */
    public static C5265d0 m6500w() {
        return C5265d0.m6172a("Utils");
    }

    /* JADX INFO: renamed from: y */
    public static Activity m6502y() {
        return C5291q0.f6582h.m6380o();
    }

    /* JADX INFO: renamed from: A */
    public static byte[] m6463A(byte[] bArr, String str) {
        return C5280l.m6265e(bArr, str);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m6465C(Activity activity) {
        return C5258a.m6126i(activity);
    }

    @RequiresApi(api = 23)
    /* JADX INFO: renamed from: D */
    public static boolean m6466D() {
        return C5304x.m6513a();
    }

    /* JADX INFO: renamed from: E */
    public static boolean m6467E(Intent intent) {
        return C5292r.m6394g(intent);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m6468F() {
        return C5263c0.m6154a();
    }

    /* JADX INFO: renamed from: G */
    public static boolean m6469G(String str) {
        return C5277j0.m6255d(str);
    }

    /* JADX INFO: renamed from: H */
    public static void m6470H() {
        m6471I(C5260b.m6138f());
    }

    /* JADX INFO: renamed from: K */
    public static void m6473K(Runnable runnable) {
        ThreadUtils.m6114g(runnable);
    }

    /* JADX INFO: renamed from: L */
    public static void m6474L(Runnable runnable, long j11) {
        ThreadUtils.m6115h(runnable, j11);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m6476N(String str, InputStream inputStream) {
        return C5282m.m6270b(str, inputStream);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m6477O(String str, String str2, boolean z11) {
        return C5282m.m6272d(str, str2, z11);
    }

    /* JADX INFO: renamed from: b */
    public static void m6479b(Activity activity) {
        C5296t.m6400a(activity);
    }

    /* JADX INFO: renamed from: c */
    public static String m6480c(byte[] bArr) {
        return C5274i.m6233a(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m6481d(File file) {
        return C5284n.m6303f(file);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m6482e(File file) {
        return C5284n.m6304g(file);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m6483f(File file) {
        return C5284n.m6306i(file);
    }

    /* JADX INFO: renamed from: g */
    public static int m6484g(float f11) {
        return C5275i0.m6236a(f11);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m6485h(CharSequence charSequence, CharSequence charSequence2) {
        return C5277j0.m6252a(charSequence, charSequence2);
    }

    /* JADX INFO: renamed from: i */
    public static Uri m6486i(File file) {
        return C5285n0.m6316a(file);
    }

    /* JADX INFO: renamed from: j */
    public static void m6487j(Activity activity) {
        KeyboardUtils.m6030b(activity);
    }

    /* JADX INFO: renamed from: k */
    public static String m6488k(String str) {
        return C5294s.m6395a(str);
    }

    /* JADX INFO: renamed from: l */
    public static Activity m6489l(Context context) {
        return C5258a.m6121d(context);
    }

    /* JADX INFO: renamed from: n */
    public static int m6491n() {
        return C5264d.m6164j();
    }

    /* JADX INFO: renamed from: o */
    public static String m6492o() {
        return C5264d.m6166l();
    }

    /* JADX INFO: renamed from: q */
    public static String m6494q() {
        return C5306z.m6517a();
    }

    /* JADX INFO: renamed from: r */
    public static File m6495r(String str) {
        return C5284n.m6311n(str);
    }

    /* JADX INFO: renamed from: s */
    public static String m6496s(Throwable th2) {
        return C5279k0.m6258a(th2);
    }

    /* JADX INFO: renamed from: t */
    public static Gson m6497t() {
        return C5288p.m6345g();
    }

    /* JADX INFO: renamed from: u */
    public static Intent m6498u(String str, boolean z11) {
        return C5292r.m6389b(str, z11);
    }

    /* JADX INFO: renamed from: v */
    public static int m6499v() {
        return C5270g.m6191e();
    }

    /* JADX INFO: renamed from: x */
    public static int m6501x() {
        return C5270g.m6194h();
    }

    /* JADX INFO: renamed from: z */
    public static Context m6503z() {
        if (C5264d.m6168n()) {
            Activity activityM6502y = m6502y();
            if (activityM6502y == null) {
                return C5287o0.m6331a();
            }
            return activityM6502y;
        }
        return C5287o0.m6331a();
    }
}
