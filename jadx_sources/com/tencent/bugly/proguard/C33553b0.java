package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import androidx.annotation.RestrictTo;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.b0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@SuppressLint({"NewApi"})
public final class C33553b0 extends C33758kg implements C33741k.b, C33678h.d {

    /* JADX INFO: renamed from: m */
    public static C33553b0 f68873m = null;

    /* JADX INFO: renamed from: n */
    public static final String f68874n = "RMonitor_launch_Monitor";

    /* JADX INFO: renamed from: o */
    public static final long f68875o = 180000;

    /* JADX INFO: renamed from: p */
    public static final long f68876p = 500;

    /* JADX INFO: renamed from: q */
    public static final int f68877q = 10;

    /* JADX INFO: renamed from: b */
    public int f68878b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f68879c = false;

    /* JADX INFO: renamed from: d */
    public boolean f68880d = true;

    /* JADX INFO: renamed from: e */
    public C33741k f68881e = null;

    /* JADX INFO: renamed from: f */
    public C33678h f68882f = null;

    /* JADX INFO: renamed from: j */
    public C33718ii f68886j = null;

    /* JADX INFO: renamed from: k */
    public C33744k2 f68887k = null;

    /* JADX INFO: renamed from: l */
    public int f68888l = 10;

    /* JADX INFO: renamed from: g */
    public final C33658g0 f68883g = new C33658g0(C33591ch.m72746d());

    /* JADX INFO: renamed from: h */
    public final C33679h0 f68884h = new C33679h0();

    /* JADX INFO: renamed from: i */
    public final C33898ra f68885i = new C33898ra();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.b0$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33553b0.this.m72388b();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.b0$b */
    /* JADX INFO: compiled from: BUGLY */
    public enum b {
        FROM_ON_APPLICATION_CREATE_TIME_OUT,
        FROM_WARM_LAUNCH,
        FROM_APP_FULL_LAUNCH
    }

    /* JADX INFO: renamed from: a */
    public void m72377a(int i11) {
        this.f68888l = i11;
        Logger.INSTANCE.mo77130d(f68874n, String.format("updateWarmLaunchReportCount, %d", Integer.valueOf(i11)));
    }

    /* JADX INFO: renamed from: b */
    public void m72389b(String str) {
        this.f68885i.m74804b(str);
    }

    /* JADX INFO: renamed from: c */
    public void m72393c(String str) {
        this.f68884h.m73229a(str);
    }

    /* JADX INFO: renamed from: d */
    public void m72395d(String str) {
        C33744k2 c33744k2 = this.f68887k;
        if (c33744k2 != null) {
            m72385a(str, (String) null, c33744k2.m73635c(), SystemClock.uptimeMillis());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m72397e(String str) {
        this.f68883g.m73119c(str);
    }

    /* JADX INFO: renamed from: g */
    public static C33553b0 m72375g() {
        if (f68873m == null) {
            synchronized (C33553b0.class) {
                try {
                    if (f68873m == null) {
                        f68873m = new C33553b0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68873m;
    }

    /* JADX INFO: renamed from: b */
    public void m72390b(String str, String str2) {
        this.f68883g.m73113a(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final void m72392c() {
        C33678h c33678h = this.f68882f;
        if (c33678h == null) {
            return;
        }
        c33678h.m73215a();
        this.f68882f = null;
    }

    /* JADX INFO: renamed from: e */
    public EnumC33532a0 m72396e() {
        EnumC33532a0 enumC33532a0 = EnumC33532a0.UNKNOWN;
        C33744k2 c33744k2 = this.f68887k;
        return c33744k2 != null ? c33744k2.m73633b() : enumC33532a0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: f */
    public long m72398f() {
        return this.f68883g.m73116b();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m72399h() {
        C33744k2 c33744k2 = this.f68887k;
        return c33744k2 != null && c33744k2.m73639g();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m72400i() {
        C33744k2 c33744k2 = this.f68887k;
        return c33744k2 != null && c33744k2.m73637e();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m72401j() {
        C33718ii c33718ii = this.f68886j;
        return c33718ii != null && c33718ii.m73444d();
    }

    /* JADX INFO: renamed from: k */
    public boolean m72402k() {
        return this.f68879c;
    }

    /* JADX INFO: renamed from: l */
    public void m72403l() {
        C33744k2 c33744k2;
        if (this.f68879c && (c33744k2 = this.f68887k) != null) {
            c33744k2.m73641i();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m72404m() {
        C33744k2 c33744k2;
        if (this.f68879c && (c33744k2 = this.f68887k) != null) {
            c33744k2.m73644l();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: n */
    public void m72405n() {
        if (!this.f68879c) {
            Logger.INSTANCE.mo77134w(f68874n, "AppLaunchMonitor has not started yet.");
            return;
        }
        LifecycleCallback.unRegister(this);
        m72392c();
        this.f68879c = false;
        Logger.INSTANCE.mo77132i(f68874n, InterfaceC33730j9.f70350a);
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onCreate(@NotNull Activity activity) {
        C33744k2 c33744k2 = this.f68887k;
        if (c33744k2 != null) {
            c33744k2.m73640h();
        }
        C33718ii c33718ii = this.f68886j;
        if (c33718ii != null) {
            c33718ii.m73446f();
        }
        if (m72401j() || m72400i()) {
            m72376a();
        }
        C33678h c33678h = this.f68882f;
        if (c33678h != null) {
            c33678h.m73220c(activity);
        }
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onDestroy(@NotNull Activity activity) {
        C33678h c33678h = this.f68882f;
        if (c33678h != null) {
            c33678h.m73221d(activity);
        }
        C33718ii c33718ii = this.f68886j;
        if (c33718ii != null) {
            c33718ii.m73447g();
        }
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onResume(@NotNull Activity activity) {
        C33678h c33678h = this.f68882f;
        if (c33678h != null) {
            c33678h.m73222e(activity);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72386a(boolean z11) {
        this.f68885i.m74803a(z11);
    }

    /* JADX INFO: renamed from: b */
    public void m72391b(boolean z11) {
        this.f68880d = z11;
        Logger.INSTANCE.mo77134w(f68874n, "setUseActivityThreadHacker, useHacker: ", String.valueOf(z11));
    }

    /* JADX INFO: renamed from: a */
    public void m72382a(String str) {
        this.f68885i.m74802a(str);
    }

    /* JADX INFO: renamed from: a */
    public void m72385a(String str, String str2, long j11, long j12) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (j12 >= j11 && j12 <= jUptimeMillis && j11 <= jUptimeMillis && jUptimeMillis - j11 <= 180000) {
            this.f68883g.m73114a(str, str2, j11, j12);
        } else {
            Logger.INSTANCE.mo77130d(f68874n, String.format("addSpan fail for [name: %s, start: %s, end: %s]", str, Long.valueOf(j11), Long.valueOf(j12)));
        }
    }

    /* JADX INFO: renamed from: d */
    public C33678h m72394d() {
        return this.f68882f;
    }

    /* JADX INFO: renamed from: b */
    public C33898ra.a m72387b(C33678h.b bVar) {
        return this.f68885i.m74805c(bVar.f70029a);
    }

    /* JADX INFO: renamed from: b */
    public void m72388b() {
        C33741k c33741k;
        Logger.INSTANCE.mo77130d(f68874n, "checkAppLaunchStage");
        C33744k2 c33744k2 = this.f68887k;
        if (c33744k2 != null) {
            c33744k2.m73628a();
        }
        if (this.f68886j != null && m72399h()) {
            this.f68886j.m73442b();
        }
        if (!m72400i() && (c33741k = this.f68881e) != null) {
            c33741k.m73611e();
        }
        if (m72400i() || m72401j()) {
            return;
        }
        m72392c();
    }

    /* JADX INFO: renamed from: a */
    public void m72378a(Application application) {
        if (this.f68879c) {
            Logger.INSTANCE.mo77131e(f68874n, "call startOnApplicationOnCreate fail forAppLaunchMonitor has started before.");
            return;
        }
        Logger.INSTANCE.mo77130d(f68874n, "startOnApplicationOnCreate");
        this.f68879c = true;
        C33744k2 c33744k2 = new C33744k2(this);
        this.f68887k = c33744k2;
        c33744k2.m73643k();
        this.f68886j = new C33718ii(this);
        LifecycleCallback.register(this);
        LifecycleCallback.initOnApplicationOnCreate(application);
        if (this.f68880d) {
            this.f68881e = new C33741k(this);
        }
        C33741k c33741k = this.f68881e;
        if (c33741k != null) {
            c33741k.m73610d();
        }
    }

    @Override // com.tencent.bugly.proguard.C33741k.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public void mo72379a(EnumC33532a0 enumC33532a0) {
        C33744k2 c33744k2 = this.f68887k;
        if (c33744k2 != null) {
            c33744k2.m73630a(enumC33532a0);
        }
    }

    @Override // com.tencent.bugly.proguard.C33678h.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public void mo72381a(C33678h.b bVar) {
        C33744k2 c33744k2 = this.f68887k;
        if (c33744k2 != null) {
            c33744k2.m73631a(bVar);
        }
        C33718ii c33718ii = this.f68886j;
        if (c33718ii != null) {
            c33718ii.m73440a(bVar);
        }
        if (Logger.debug) {
            Logger.INSTANCE.mo77130d(f68874n, "onLaunchComplete", bVar.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72380a(b bVar) {
        Logger.INSTANCE.mo77132i(f68874n, "postCheckAppLaunchStageTask, from: ", String.valueOf(bVar));
        if (bVar != b.FROM_WARM_LAUNCH || m72399h()) {
            ThreadManager.runInMainThread(new a(), bVar == b.FROM_ON_APPLICATION_CREATE_TIME_OUT ? 180000L : 500L);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72383a(String str, long j11, long j12, long j13) {
        C33616e0 c33616e0 = new C33616e0(str, j11, j12, j13);
        c33616e0.m72878a(this.f68883g.m73118c());
        c33616e0.m72879b(this.f68884h.m73230b());
        RunnableC33595d0.m72759b().m72764b(c33616e0);
        this.f68883g.m73112a();
        this.f68884h.m73228a();
        int i11 = this.f68878b + 1;
        this.f68878b = i11;
        if (i11 >= this.f68888l) {
            m72405n();
        }
        Logger.INSTANCE.mo77132i(f68874n, "report, result: ", c33616e0.toString());
    }

    /* JADX INFO: renamed from: a */
    public final void m72376a() {
        if (this.f68882f == null && AndroidVersion.isOverJellyBeanMr2()) {
            this.f68882f = new C33678h(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72384a(String str, String str2) {
        RunnableC33595d0.m72759b().m72762a(str, str2);
    }
}
