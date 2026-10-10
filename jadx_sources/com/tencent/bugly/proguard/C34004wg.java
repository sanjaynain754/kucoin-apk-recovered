package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.wg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34004wg extends Thread {

    /* JADX INFO: renamed from: i */
    public static final long f72449i = 5000;

    /* JADX INFO: renamed from: j */
    public static final long f72450j = 1500;

    /* JADX INFO: renamed from: k */
    public static final long f72451k = 10;

    /* JADX INFO: renamed from: l */
    public static final long f72452l = 500;

    /* JADX INFO: renamed from: m */
    public static final long f72453m = 200000;

    /* JADX INFO: renamed from: f */
    public RunnableC33875q7 f72458f;

    /* JADX INFO: renamed from: g */
    public a f72459g;

    /* JADX INFO: renamed from: b */
    public boolean f72454b = false;

    /* JADX INFO: renamed from: c */
    public boolean f72455c = true;

    /* JADX INFO: renamed from: d */
    public boolean f72456d = false;

    /* JADX INFO: renamed from: e */
    public int f72457e = 1;

    /* JADX INFO: renamed from: h */
    public boolean f72460h = true;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.wg$a */
    /* JADX INFO: compiled from: BUGLY */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m75396a(boolean z11, long j11);
    }

    /* JADX INFO: renamed from: a */
    public void m75387a(boolean z11) {
        this.f72460h = z11;
        C34012x4.m75434a("set record stack trace enable:" + z11, new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public List<C33821ng> m75389b() {
        RunnableC33875q7 runnableC33875q7 = this.f72458f;
        if (runnableC33875q7 != null) {
            return runnableC33875q7.m74666a(f72453m);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m75392c() {
        C34012x4.m75444f("MainHandlerChecker is reset to null.", new Object[0]);
        this.f72458f = null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m75395f() {
        this.f72454b = true;
        if (!isAlive()) {
            return false;
        }
        try {
            interrupt();
        } catch (Exception e11) {
            C34012x4.m75435a(e11);
        }
        m75392c();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m75393d() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC33875q7 runnableC33875q7 = this.f72458f;
        if (runnableC33875q7 != null) {
            runnableC33875q7.m74668b(5000L);
        } else {
            this.f72458f = new RunnableC33875q7(handler, handler.getLooper().getThread().getName(), 5000L);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75386a(a aVar) {
        this.f72459g = aVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m75390b(RunnableC33875q7 runnableC33875q7) {
        if (this.f72455c) {
            return;
        }
        if (this.f72456d && !runnableC33875q7.m74673g()) {
            C34012x4.m75434a("Restart getting main stack trace.", new Object[0]);
            this.f72455c = true;
            this.f72456d = false;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m75394e() {
        m75393d();
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e11) {
            C34012x4.m75435a(e11);
            return false;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!this.f72454b) {
            try {
                RunnableC33875q7 runnableC33875q7 = this.f72458f;
                if (runnableC33875q7 == null) {
                    C34012x4.m75434a("Main handler checker is null. Stop thread monitor.", new Object[0]);
                    return;
                }
                runnableC33875q7.m74676j();
                m75390b(runnableC33875q7);
                if (m75388a(runnableC33875q7)) {
                    runnableC33875q7.m74674h();
                }
                a aVar = this.f72459g;
                if (aVar != null && this.f72455c) {
                    aVar.m75396a(runnableC33875q7.m74673g(), runnableC33875q7.m74671e());
                }
                C33571bi.m72615c(500 - ((System.currentTimeMillis() - jCurrentTimeMillis) % 500));
            } catch (Exception e11) {
                C34012x4.m75435a(e11);
            } catch (OutOfMemoryError e12) {
                C34012x4.m75435a(e12);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75388a(RunnableC33875q7 runnableC33875q7) {
        if (this.f72460h && this.f72455c) {
            long jM74671e = runnableC33875q7.m74671e();
            if (jM74671e > 1510 && jM74671e < 199990) {
                if (jM74671e <= 5010) {
                    this.f72457e = 1;
                    C34012x4.m75434a("timeSinceMsgSent in [2s, 5s], record stack", new Object[0]);
                    return true;
                }
                int i11 = this.f72457e;
                int i12 = i11 + 1;
                this.f72457e = i12;
                boolean z11 = (i11 & i12) == 0;
                if (z11) {
                    C34012x4.m75434a("timeSinceMsgSent in (5s, 200s), should record stack:true", new Object[0]);
                }
                return z11;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m75391b(boolean z11) {
        this.f72456d = z11;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m75385a() {
        this.f72455c = false;
        C34012x4.m75434a("Record stack trace is disabled.", new Object[0]);
    }
}
