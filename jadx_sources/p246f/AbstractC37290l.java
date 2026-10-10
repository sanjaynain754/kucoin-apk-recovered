package p246f;

import aai.telemetry.AAITelemetryJNI;
import aai.telemetry.enums.MonitorType;
import android.content.Context;
import android.os.Looper;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p027b.C4403a;
import p027b.C4408f;
import p277g.C37739e;
import p295h.C38062a;
import p387k.C40832g;
import p416l.C42010b;
import p442m.AbstractC42333c;
import p442m.C42334d;

/* JADX INFO: renamed from: f.l */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC37290l {

    /* JADX INFO: renamed from: j */
    public static boolean f82713j;

    /* JADX INFO: renamed from: a */
    public AbstractC42333c f82714a;

    /* JADX INFO: renamed from: b */
    public C37739e f82715b;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f82718e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f82719f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f82720g;

    /* JADX INFO: renamed from: h */
    public Context f82721h;

    /* JADX INFO: renamed from: c */
    public ExecutorService f82716c = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: d */
    public ScheduledExecutorService f82717d = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: i */
    public AtomicInteger f82722i = new AtomicInteger(0);

    /* JADX INFO: renamed from: f.l$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC37290l.this.m83540e(MonitorType.EVENT, false);
            AbstractC37290l.this.m83540e(MonitorType.LOG, false);
            AbstractC37290l.this.m83540e(MonitorType.CRASH, false);
        }
    }

    /* JADX INFO: renamed from: f.l$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f82724b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MonitorType f82725c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f82726d;

        public b(AtomicBoolean atomicBoolean, MonitorType monitorType, boolean z11) {
            this.f82724b = atomicBoolean;
            this.f82725c = monitorType;
            this.f82726d = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f82724b.set(true);
            File[] fileArrM4081h = C4408f.m4081h(this.f82725c, AbstractC37290l.this.f82721h);
            int iMo83496r = this.f82726d ? AbstractC37290l.this.mo83496r(this.f82725c) : 1;
            if (fileArrM4081h != null && fileArrM4081h.length >= iMo83496r) {
                C4408f.m4075b(this.f82725c, AbstractC37290l.this.mo83547q(), AbstractC37290l.this.mo83548t(), AbstractC37290l.this.mo83546o(), AbstractC37290l.this.f82721h);
            }
            this.f82724b.set(false);
        }
    }

    /* JADX INFO: renamed from: f.l$c */
    public class c extends AbstractC42333c {
        public c() {
        }

        @Override // p442m.AbstractC42333c
        /* JADX INFO: renamed from: d */
        public void mo83483d(String str) {
            try {
                if (!AbstractC37290l.f82713j) {
                    boolean unused = AbstractC37290l.f82713j = true;
                    AbstractC37290l abstractC37290l = AbstractC37290l.this;
                    abstractC37290l.m83544j(str, abstractC37290l.mo83495p());
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract String mo83546o();

    /* JADX INFO: renamed from: q */
    public abstract Map<String, Object> mo83547q();

    /* JADX INFO: renamed from: s */
    public abstract boolean mo83497s();

    /* JADX INFO: renamed from: t */
    public abstract boolean mo83548t();

    /* JADX INFO: renamed from: v */
    public C37739e mo83499v(final C37287i c37287i) {
        if (c37287i == null || !c37287i.m83505a()) {
            return null;
        }
        m83539c();
        try {
            if (this.f82717d.isShutdown()) {
                this.f82717d = Executors.newScheduledThreadPool(1);
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f82717d.submit(new Runnable() { // from class: f.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82708b.m83541f(c37287i, countDownLatch);
                }
            });
            try {
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            this.f82717d.scheduleWithFixedDelay(new a(), 0L, 3L, TimeUnit.SECONDS);
        } catch (Exception unused2) {
        }
        this.f82715b = new C37739e(c37287i.m83518n());
        this.f82722i.set(0);
        return this.f82715b;
    }

    /* JADX INFO: renamed from: f.l$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82729a;

        static {
            int[] iArr = new int[MonitorType.values().length];
            f82729a = iArr;
            try {
                iArr[MonitorType.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82729a[MonitorType.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m83540e(MonitorType monitorType, boolean z11) {
        AtomicBoolean atomicBoolean;
        int i11 = d.f82729a[monitorType.ordinal()];
        if (i11 != 1) {
            atomicBoolean = i11 != 2 ? this.f82720g : this.f82718e;
        } else {
            atomicBoolean = this.f82719f;
        }
        if (z11 && atomicBoolean.get()) {
            return;
        }
        this.f82716c.submit(new b(atomicBoolean, monitorType, z11));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m83541f(C37287i c37287i, CountDownLatch countDownLatch) {
        try {
            C42010b c42010b = new C42010b(this.f82721h);
            AAITelemetryJNI.ooooooooo(String.valueOf(c37287i.m83507c()), c37287i.m83516l().name(), String.valueOf(c37287i.m83508d()), String.valueOf(this.f82721h.getPackageName()), String.valueOf(c37287i.m83510f()), String.valueOf(c37287i.m83517m()), String.valueOf(c37287i.m83506b()), c42010b.m92104i(), c42010b.m92110o(), c42010b.m92109n(), c37287i.m83519o(), String.valueOf(c37287i.m83511g()), String.valueOf(c37287i.m83514j()), String.valueOf(c37287i.m83509e()), "", C40832g.m89355j(c37287i.m83512h()), C40832g.m89355j(c37287i.m83513i()), c42010b.m92098c(), String.valueOf(c42010b.m92099d()), C42334d.m92897e().toString(), C38062a.m85942a(), "1.4.5");
        } catch (Exception unused) {
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m83542h(File file) {
        m83543i(file, MonitorType.CRASH);
    }

    /* JADX INFO: renamed from: n */
    public Context mo83494n() {
        return this.f82721h;
    }

    /* JADX INFO: renamed from: p */
    public C37739e mo83495p() {
        return this.f82715b;
    }

    /* JADX INFO: renamed from: r */
    public int mo83496r(MonitorType monitorType) {
        return monitorType.minFilesForUploadTrigger;
    }

    /* JADX INFO: renamed from: u */
    public void mo83498u() {
        m83540e(MonitorType.EVENT, false);
        m83540e(MonitorType.LOG, false);
        m83540e(MonitorType.CRASH, false);
        try {
            this.f82717d.shutdown();
        } catch (Exception unused) {
        }
        m83545m();
    }

    public AbstractC37290l(Context context) {
        if (context != null) {
            this.f82721h = context.getApplicationContext();
        }
        this.f82718e = new AtomicBoolean(false);
        this.f82719f = new AtomicBoolean(false);
        this.f82720g = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: c */
    public final void m83539c() {
        if (mo83497s()) {
            c cVar = new c();
            this.f82714a = cVar;
            cVar.m92892c();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m83543i(File file, MonitorType monitorType) {
        C4408f.m4076c(file, monitorType, mo83547q(), mo83548t(), mo83546o());
    }

    /* JADX INFO: renamed from: j */
    public final void m83544j(String str, C37739e c37739e) {
        try {
            if (mo83497s()) {
                final File fileM4060g = C4403a.m4058f().m4060g(str, "Crash", c37739e, mo83494n());
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    new Thread(new Runnable() { // from class: f.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f82711b.m83542h(fileM4060g);
                        }
                    }).start();
                } else {
                    m83543i(fileM4060g, MonitorType.CRASH);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m83545m() {
        AbstractC42333c abstractC42333c;
        if (mo83497s() && (abstractC42333c = this.f82714a) != null) {
            abstractC42333c.m92893e();
        }
    }
}
