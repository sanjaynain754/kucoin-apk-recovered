package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p749x5.C46075i;
import p786y5.C46385a;

/* JADX INFO: loaded from: classes34.dex */
public class JobScheduler {

    /* JADX INFO: renamed from: a */
    public final Executor f9215a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5670d f9216b;

    /* JADX INFO: renamed from: e */
    public final int f9219e;

    /* JADX INFO: renamed from: c */
    public final Runnable f9217c = new RunnableC5667a();

    /* JADX INFO: renamed from: d */
    public final Runnable f9218d = new RunnableC5668b();

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public C46075i f9220f = null;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public int f9221g = 0;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public JobState f9222h = JobState.IDLE;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public long f9223i = 0;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public long f9224j = 0;

    @VisibleForTesting
    public enum JobState {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$a */
    public class RunnableC5667a implements Runnable {
        public RunnableC5667a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JobScheduler.this.m9563d();
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$b */
    public class RunnableC5668b implements Runnable {
        public RunnableC5668b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JobScheduler.this.m9568j();
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$d */
    public interface InterfaceC5670d {
        /* JADX INFO: renamed from: a */
        void mo9570a(C46075i c46075i, int i11);
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$e */
    @VisibleForTesting
    public static class C5671e {

        /* JADX INFO: renamed from: a */
        public static ScheduledExecutorService f9229a;

        /* JADX INFO: renamed from: a */
        public static ScheduledExecutorService m9571a() {
            if (f9229a == null) {
                f9229a = Executors.newSingleThreadScheduledExecutor();
            }
            return f9229a;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m9562c() {
        C46075i c46075i;
        synchronized (this) {
            c46075i = this.f9220f;
            this.f9220f = null;
            this.f9221g = 0;
        }
        C46075i.m101556g(c46075i);
    }

    /* JADX INFO: renamed from: f */
    public synchronized long m9565f() {
        return this.f9224j - this.f9223i;
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$c */
    public static /* synthetic */ class C5669c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9228a;

        static {
            int[] iArr = new int[JobState.values().length];
            f9228a = iArr;
            try {
                iArr[JobState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9228a[JobState.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9228a[JobState.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9228a[JobState.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9564e(long j11) {
        Runnable runnableM102298a = C46385a.m102298a(this.f9218d, "JobScheduler_enqueueJob");
        if (j11 > 0) {
            C5671e.m9571a().schedule(runnableM102298a, j11, TimeUnit.MILLISECONDS);
        } else {
            runnableM102298a.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9568j() {
        this.f9215a.execute(C46385a.m102298a(this.f9217c, "JobScheduler_submitJob"));
    }

    public JobScheduler(Executor executor, InterfaceC5670d interfaceC5670d, int i11) {
        this.f9215a = executor;
        this.f9216b = interfaceC5670d;
        this.f9219e = i11;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m9561i(C46075i c46075i, int i11) {
        if (!AbstractC5682c.m9645d(i11) && !AbstractC5682c.m9649m(i11, 4) && !C46075i.m101554E(c46075i)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m9563d() {
        C46075i c46075i;
        int i11;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            c46075i = this.f9220f;
            i11 = this.f9221g;
            this.f9220f = null;
            this.f9221g = 0;
            this.f9222h = JobState.RUNNING;
            this.f9224j = jUptimeMillis;
        }
        try {
            if (m9561i(c46075i, i11)) {
                this.f9216b.mo9570a(c46075i, i11);
            }
        } finally {
            C46075i.m101556g(c46075i);
            m9566g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9566g() {
        long jMax;
        boolean z11;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f9222h == JobState.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.f9224j + ((long) this.f9219e), jUptimeMillis);
                    this.f9223i = jUptimeMillis;
                    this.f9222h = JobState.QUEUED;
                    z11 = true;
                } else {
                    this.f9222h = JobState.IDLE;
                    jMax = 0;
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            m9564e(jMax - jUptimeMillis);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m9567h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z11 = false;
                if (!m9561i(this.f9220f, this.f9221g)) {
                    return false;
                }
                int i11 = C5669c.f9228a[this.f9222h.ordinal()];
                if (i11 != 1) {
                    if (i11 == 3) {
                        this.f9222h = JobState.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.f9224j + ((long) this.f9219e), jUptimeMillis);
                    this.f9223i = jUptimeMillis;
                    this.f9222h = JobState.QUEUED;
                    z11 = true;
                }
                if (z11) {
                    m9564e(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m9569k(C46075i c46075i, int i11) {
        C46075i c46075i2;
        if (!m9561i(c46075i, i11)) {
            return false;
        }
        synchronized (this) {
            c46075i2 = this.f9220f;
            this.f9220f = C46075i.m101555b(c46075i);
            this.f9221g = i11;
        }
        C46075i.m101556g(c46075i2);
        return true;
    }
}
