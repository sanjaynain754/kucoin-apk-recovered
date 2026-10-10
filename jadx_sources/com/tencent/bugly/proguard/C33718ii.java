package com.tencent.bugly.proguard;

import android.os.SystemClock;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ii */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33718ii {

    /* JADX INFO: renamed from: i */
    public static final long f70296i = 60000;

    /* JADX INFO: renamed from: j */
    public static final String f70297j = "300400";

    /* JADX INFO: renamed from: k */
    public static final String f70298k = "300401";

    /* JADX INFO: renamed from: l */
    public static final String f70299l = "RMonitor_launch_warm";

    /* JADX INFO: renamed from: a */
    public final C33553b0 f70300a;

    /* JADX INFO: renamed from: b */
    public boolean f70301b = false;

    /* JADX INFO: renamed from: c */
    public long f70302c = 0;

    /* JADX INFO: renamed from: d */
    public long f70303d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f70304e = false;

    /* JADX INFO: renamed from: f */
    public int f70305f = 0;

    /* JADX INFO: renamed from: g */
    public int f70306g = 0;

    /* JADX INFO: renamed from: h */
    public long f70307h = 0;

    /* JADX INFO: renamed from: a */
    public void m73440a(C33678h.b bVar) {
        if (m73444d()) {
            m73443c();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m73442b() {
        if (!this.f70304e || m73441a(this.f70300a.m72396e())) {
            return;
        }
        m73448h();
    }

    /* JADX INFO: renamed from: d */
    public boolean m73444d() {
        return this.f70301b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m73445e() {
        return this.f70305f == 0;
    }

    /* JADX INFO: renamed from: g */
    public void m73447g() {
        this.f70305f--;
        if (m73445e()) {
            m73449i();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m73448h() {
        String str;
        long j11 = this.f70302c;
        if (j11 >= 60000 || j11 <= 0) {
            if (j11 >= 60000) {
                str = f70298k;
            } else {
                str = j11 < 0 ? f70297j : null;
            }
            if (str != null) {
                String strValueOf = String.valueOf(j11);
                this.f70300a.getClass();
                RunnableC33595d0.m72759b().m72762a(str, strValueOf);
            }
            Logger.INSTANCE.mo77131e(f70299l, "reportWarmCost has invalid data of launchType[", C33616e0.f69634i, "], warmCostInMs[", String.valueOf(this.f70302c), "]");
        } else {
            this.f70300a.m72383a(C33616e0.f69634i, this.f70303d, j11, this.f70307h);
        }
        this.f70304e = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m73449i() {
        this.f70307h = 0L;
        this.f70301b = false;
        this.f70303d = 0L;
        this.f70304e = false;
        this.f70302c = 0L;
    }

    public C33718ii(C33553b0 c33553b0) {
        this.f70300a = c33553b0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73441a(EnumC33532a0 enumC33532a0) {
        return this.f70306g == 1 && enumC33532a0 == EnumC33532a0.APP_LAUNCH_BY_ACTIVITY;
    }

    /* JADX INFO: renamed from: c */
    public final void m73443c() {
        this.f70302c = SystemClock.uptimeMillis() - this.f70303d;
        this.f70306g++;
        this.f70304e = true;
        this.f70301b = false;
        this.f70300a.m72380a(C33553b0.b.FROM_WARM_LAUNCH);
    }

    /* JADX INFO: renamed from: f */
    public void m73446f() {
        if (m73445e()) {
            m73439a();
        }
        this.f70305f++;
    }

    /* JADX INFO: renamed from: a */
    public final void m73439a() {
        this.f70301b = true;
        this.f70307h = System.currentTimeMillis();
        this.f70303d = SystemClock.uptimeMillis();
        this.f70302c = 0L;
        this.f70304e = false;
    }
}
