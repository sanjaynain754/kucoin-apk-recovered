package com.tencent.bugly.proguard;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.k2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33744k2 {

    /* JADX INFO: renamed from: k */
    public static final String f70467k = "RMonitor_launch_cold";

    /* JADX INFO: renamed from: l */
    public static final String f70468l = "300200";

    /* JADX INFO: renamed from: m */
    public static final String f70469m = "300201";

    /* JADX INFO: renamed from: n */
    public static final long f70470n = 180000;

    /* JADX INFO: renamed from: o */
    public static final long f70471o = 20000;

    /* JADX INFO: renamed from: p */
    public static final long f70472p = 2000;

    /* JADX INFO: renamed from: q */
    public static final int f70473q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f70474r = 2;

    /* JADX INFO: renamed from: s */
    public static final int f70475s = 3;

    /* JADX INFO: renamed from: t */
    public static final int f70476t = 4;

    /* JADX INFO: renamed from: u */
    public static final int f70477u = 5;

    /* JADX INFO: renamed from: a */
    public long f70478a = 0;

    /* JADX INFO: renamed from: b */
    public long f70479b = 0;

    /* JADX INFO: renamed from: c */
    public long f70480c = 0;

    /* JADX INFO: renamed from: d */
    public long f70481d = 0;

    /* JADX INFO: renamed from: e */
    public long f70482e = 0;

    /* JADX INFO: renamed from: f */
    public long f70483f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f70484g = false;

    /* JADX INFO: renamed from: h */
    public long f70485h = 0;

    /* JADX INFO: renamed from: i */
    public EnumC33532a0 f70486i = EnumC33532a0.UNKNOWN;

    /* JADX INFO: renamed from: j */
    public final C33553b0 f70487j;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k2$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33744k2.this.m73630a(EnumC33532a0.APP_LAUNCH_BY_OTHER);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73631a(C33678h.b bVar) {
        if (this.f70481d == 0) {
            m73632a("first_screen_complete");
            this.f70481d = SystemClock.uptimeMillis();
            this.f70487j.f68883g.m73119c(C33616e0.f69639n);
        }
        if (m73637e()) {
            C33898ra.a aVarM72387b = this.f70487j.m72387b(bVar);
            if (aVarM72387b == C33898ra.a.HIT_LANDING_PAGE) {
                m73632a("landing_page_complete");
                m73629a(2);
            } else if (aVarM72387b == C33898ra.a.INVALID) {
                m73629a(3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public EnumC33532a0 m73633b() {
        return this.f70486i;
    }

    /* JADX INFO: renamed from: b */
    public final void m73634b(long j11) {
        Logger.INSTANCE.mo77134w(f70467k, "postCheckPreLaunchTask, delay: ", String.valueOf(j11));
        ThreadManager.runInMainThread(new a(), j11);
    }

    /* JADX INFO: renamed from: c */
    public long m73635c() {
        long j11 = this.f70478a;
        long jM73636d = m73636d();
        if (jM73636d > 0) {
            j11 = jM73636d;
        }
        Logger.INSTANCE.mo77130d(f70467k, "getColdLaunchStartTime, launchStartTime:", String.valueOf(j11), ", applicationOnCreateTime:", String.valueOf(this.f70478a));
        return j11;
    }

    /* JADX INFO: renamed from: d */
    public final long m73636d() {
        long startUptimeMillis;
        try {
            startUptimeMillis = Process.getStartUptimeMillis();
        } catch (Throwable th2) {
            Log.d(f70467k, "getProcessStartTime failed", th2);
            startUptimeMillis = -1;
        }
        if (startUptimeMillis > this.f70478a) {
            return -1L;
        }
        return startUptimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public boolean m73637e() {
        return this.f70483f == 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m73638f() {
        return this.f70486i == EnumC33532a0.APP_LAUNCH_BY_ACTIVITY;
    }

    /* JADX INFO: renamed from: g */
    public boolean m73639g() {
        return this.f70484g;
    }

    /* JADX INFO: renamed from: h */
    public void m73640h() {
        m73630a(EnumC33532a0.APP_LAUNCH_BY_ACTIVITY);
        if (this.f70480c == 0) {
            this.f70480c = SystemClock.uptimeMillis();
            this.f70487j.f68883g.m73113a(C33616e0.f69639n, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m73641i() {
        Logger.INSTANCE.mo77134w(f70467k, "onApplicationCreateEnd");
        m73642j();
        m73634b(2000L);
    }

    /* JADX INFO: renamed from: j */
    public final void m73642j() {
        if (this.f70479b != 0) {
            return;
        }
        Logger.INSTANCE.mo77134w(f70467k, "onApplicationCreateEndInner");
        m73632a("application_create_end");
        this.f70479b = SystemClock.uptimeMillis();
        this.f70487j.f68883g.m73119c(C33616e0.f69638m);
    }

    /* JADX INFO: renamed from: k */
    public void m73643k() {
        Logger.INSTANCE.mo77134w(f70467k, "onApplicationCreateStart");
        this.f70485h = System.currentTimeMillis();
        this.f70478a = SystemClock.uptimeMillis();
        this.f70487j.f68883g.m73113a(C33616e0.f69638m, null);
        m73632a("application_create_start");
        m73634b(20000L);
        this.f70487j.m72380a(C33553b0.b.FROM_ON_APPLICATION_CREATE_TIME_OUT);
    }

    /* JADX INFO: renamed from: l */
    public void m73644l() {
        if (this.f70482e == 0) {
            m73632a("app_full_launch");
            this.f70482e = SystemClock.uptimeMillis();
            m73629a(4);
            this.f70487j.m72380a(C33553b0.b.FROM_APP_FULL_LAUNCH);
        }
        Logger.INSTANCE.mo77134w(f70467k, "reportAppFullLaunch, uptime: ", String.valueOf(this.f70482e));
    }

    public C33744k2(C33553b0 c33553b0) {
        this.f70487j = c33553b0;
    }

    /* JADX INFO: renamed from: m */
    public final void m73645m() {
        String str;
        if (m73638f()) {
            if (m73637e()) {
                m73629a(5);
            }
            this.f70487j.f68884h.m73229a(C33616e0.f69636k);
        } else {
            this.f70487j.f68884h.m73229a(C33616e0.f69635j);
            C33553b0 c33553b0 = this.f70487j;
            c33553b0.f68884h.m73229a(this.f70486i.toString().toLowerCase());
        }
        long j11 = this.f70483f;
        if (j11 < 180000 && j11 > 0) {
            long jM73635c = m73635c();
            this.f70487j.m72383a(C33616e0.f69633h, jM73635c, this.f70483f, m73627a(jM73635c));
        } else {
            if (j11 >= 180000) {
                str = f70469m;
            } else if (j11 < 0) {
                str = f70468l;
            } else {
                str = null;
            }
            if (str != null) {
                C33553b0 c33553b1 = this.f70487j;
                String strValueOf = String.valueOf(j11);
                c33553b1.getClass();
                RunnableC33595d0.m72759b().m72762a(str, strValueOf);
            }
            Logger.INSTANCE.mo77131e(f70467k, "reportColdCost has invalid data of launchType[", C33616e0.f69633h, "], coldCostInMs[", String.valueOf(this.f70483f), "]");
        }
        this.f70484g = true;
    }

    /* JADX INFO: renamed from: a */
    public void m73630a(EnumC33532a0 enumC33532a0) {
        EnumC33532a0 enumC33532a1;
        EnumC33532a0 enumC33532a2;
        EnumC33532a0 enumC33532a3 = EnumC33532a0.UNKNOWN;
        if (enumC33532a0 == enumC33532a3 || (enumC33532a1 = this.f70486i) == (enumC33532a2 = EnumC33532a0.APP_LAUNCH_BY_ACTIVITY)) {
            return;
        }
        if (enumC33532a1 != enumC33532a3 && (enumC33532a0 != enumC33532a2 || Math.abs(SystemClock.uptimeMillis() - this.f70479b) >= 2000)) {
            return;
        }
        m73642j();
        Logger.INSTANCE.mo77134w(f70467k, "updateLaunchMode, appLaunchMode: ", String.valueOf(enumC33532a0));
        this.f70486i = enumC33532a0;
        if (m73638f()) {
            return;
        }
        m73629a(1);
    }

    /* JADX INFO: renamed from: a */
    public void m73628a() {
        if (m73639g()) {
            return;
        }
        m73645m();
    }

    /* JADX INFO: renamed from: a */
    public final void m73629a(int i11) {
        if (i11 == 1) {
            this.f70483f = this.f70479b - m73635c();
        } else if (i11 == 2) {
            this.f70483f = SystemClock.uptimeMillis() - m73635c();
        } else if (i11 == 4) {
            this.f70483f = this.f70482e - m73635c();
        } else if (i11 != 5) {
            this.f70483f = Long.MAX_VALUE;
        } else {
            this.f70483f = this.f70481d - m73635c();
        }
        if (this.f70483f <= 0) {
            this.f70483f = Long.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m73627a(long j11) {
        long j12 = this.f70485h;
        long j13 = this.f70478a;
        return j11 != j13 ? (j12 + j11) - j13 : j12;
    }

    /* JADX INFO: renamed from: a */
    public final void m73632a(String str) {
        long jM73636d = m73636d();
        if (jM73636d > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - jM73636d;
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            this.f70487j.m72385a(str, (String) null, jUptimeMillis2 - jUptimeMillis, jUptimeMillis2);
        }
    }
}
