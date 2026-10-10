package p747x3;

import android.util.Log;
import com.tencent.bugly.proguard.C33844oi;

/* JADX INFO: renamed from: x3.b */
/* JADX INFO: compiled from: FLogDefaultLoggingDelegate.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46000b implements InterfaceC46001c {

    /* JADX INFO: renamed from: c */
    public static final C46000b f103494c = new C46000b();

    /* JADX INFO: renamed from: a */
    public String f103495a = "unknown";

    /* JADX INFO: renamed from: b */
    public int f103496b = 5;

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: a */
    public void mo101524a(String str, String str2) {
        m101533k(6, str, str2);
    }

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: b */
    public void mo101525b(String str, String str2, Throwable th2) {
        m101534l(6, str, str2, th2);
    }

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: d */
    public void mo101527d(String str, String str2) {
        m101533k(3, str, str2);
    }

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: e */
    public void mo101529e(String str, String str2) {
        m101533k(6, str, str2);
    }

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: i */
    public void mo101531i(String str, String str2) {
        m101533k(4, str, str2);
    }

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: v */
    public void mo101535v(String str, String str2) {
        m101533k(2, str, str2);
    }

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: w */
    public void mo101536w(String str, String str2) {
        m101533k(5, str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static C46000b m101521f() {
        return f103494c;
    }

    /* JADX INFO: renamed from: g */
    public static String m101522g(String str, Throwable th2) {
        return str + '\n' + m101523h(th2);
    }

    /* JADX INFO: renamed from: h */
    public static String m101523h(Throwable th2) {
        return th2 == null ? "" : Log.getStackTraceString(th2);
    }

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: c */
    public boolean mo101526c(int i11) {
        return this.f103496b <= i11;
    }

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: d */
    public void mo101528d(String str, String str2, Throwable th2) {
        m101534l(3, str, str2, th2);
    }

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: e */
    public void mo101530e(String str, String str2, Throwable th2) {
        m101534l(6, str, str2, th2);
    }

    /* JADX INFO: renamed from: j */
    public final String m101532j(String str) {
        if (this.f103495a == null) {
            return str;
        }
        return this.f103495a + C33844oi.f71346o + str;
    }

    @Override // p747x3.InterfaceC46001c
    /* JADX INFO: renamed from: w */
    public void mo101537w(String str, String str2, Throwable th2) {
        m101534l(5, str, str2, th2);
    }

    /* JADX INFO: renamed from: k */
    public final void m101533k(int i11, String str, String str2) {
        Log.println(i11, m101532j(str), str2);
    }

    /* JADX INFO: renamed from: l */
    public final void m101534l(int i11, String str, String str2, Throwable th2) {
        Log.println(i11, m101532j(str), m101522g(str2, th2));
    }
}
