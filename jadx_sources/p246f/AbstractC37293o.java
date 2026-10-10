package p246f;

import aai.telemetry.AAITelemetryJNI;
import aai.telemetry.enums.MonitorType;
import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p027b.C4408f;
import p277g.C37739e;
import p295h.C38062a;
import p387k.C40832g;
import p416l.C42010b;
import p442m.C42334d;

/* JADX INFO: renamed from: f.o */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC37293o {

    /* JADX INFO: renamed from: a */
    public C37739e f82734a;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f82737d;

    /* JADX INFO: renamed from: e */
    public Context f82738e;

    /* JADX INFO: renamed from: b */
    public ExecutorService f82735b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: c */
    public ScheduledExecutorService f82736c = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: f */
    public AtomicInteger f82739f = new AtomicInteger(0);

    /* JADX INFO: renamed from: f.o$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC37293o.this.m83555g(true);
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo83556j();

    /* JADX INFO: renamed from: l */
    public abstract Map<String, Object> mo83557l();

    /* JADX INFO: renamed from: m */
    public abstract int mo83558m();

    /* JADX INFO: renamed from: n */
    public abstract boolean mo83559n();

    /* JADX INFO: renamed from: p */
    public C37739e mo83479p(final C37287i c37287i) {
        if (c37287i == null || !c37287i.m83505a()) {
            return null;
        }
        mo83475h();
        if (mo83480q()) {
            C37739e c37739e = new C37739e(c37287i.m83518n());
            this.f82734a = c37739e;
            return c37739e;
        }
        try {
            if (this.f82736c.isShutdown()) {
                this.f82736c = Executors.newScheduledThreadPool(1);
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f82736c.submit(new Runnable() { // from class: f.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82731b.m83553e(c37287i, countDownLatch);
                }
            });
            try {
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            this.f82736c.scheduleWithFixedDelay(new a(), 0L, 3L, TimeUnit.SECONDS);
        } catch (Exception unused2) {
        }
        this.f82734a = new C37739e(c37287i.m83518n());
        this.f82739f.set(0);
        return this.f82734a;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo83480q() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m83551c() {
        this.f82737d.set(true);
        MonitorType monitorType = MonitorType.MIXED_EVENT;
        File[] fileArrM4081h = C4408f.m4081h(monitorType, this.f82738e);
        if (fileArrM4081h != null && fileArrM4081h.length >= mo83558m()) {
            C4408f.m4075b(monitorType, mo83557l(), mo83559n(), mo83556j(), this.f82738e);
        }
        this.f82737d.set(false);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m83553e(C37287i c37287i, CountDownLatch countDownLatch) {
        try {
            C42010b c42010b = new C42010b(this.f82738e);
            AAITelemetryJNI.ooooooooo(String.valueOf(c37287i.m83507c()), c37287i.m83516l().name(), String.valueOf(c37287i.m83508d()), String.valueOf(this.f82738e.getPackageName()), String.valueOf(c37287i.m83510f()), String.valueOf(c37287i.m83517m()), String.valueOf(c37287i.m83506b()), c42010b.m92104i(), c42010b.m92110o(), c42010b.m92109n(), c37287i.m83519o(), String.valueOf(c37287i.m83511g()), String.valueOf(c37287i.m83514j()), String.valueOf(c37287i.m83509e()), String.valueOf(c37287i.m83515k()), C40832g.m89355j(c37287i.m83512h()), C40832g.m89355j(c37287i.m83513i()), c42010b.m92098c(), String.valueOf(c42010b.m92099d()), C42334d.m92897e().toString(), C38062a.m85942a(), "1.4.5");
        } catch (Exception unused) {
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: i */
    public Context mo83476i() {
        return this.f82738e;
    }

    /* JADX INFO: renamed from: k */
    public C37739e mo83477k() {
        return this.f82734a;
    }

    public AbstractC37293o(Context context) {
        if (context != null) {
            this.f82738e = context.getApplicationContext();
        }
        this.f82737d = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: d */
    public final void m83552d() {
        if (mo83480q()) {
            return;
        }
        this.f82735b.submit(new Runnable() { // from class: f.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f82730b.m83551c();
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m83554f(File file) {
        if (mo83480q()) {
            return;
        }
        C4408f.m4076c(file, MonitorType.MIXED_EVENT, mo83557l(), mo83559n(), mo83556j());
    }

    /* JADX INFO: renamed from: g */
    public void m83555g(boolean z11) {
        if (!mo83480q()) {
            if (z11) {
                m83552d();
            } else {
                if (this.f82737d.get()) {
                    return;
                }
                m83552d();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo83478o() {
        if (!mo83480q()) {
            m83552d();
            try {
                this.f82736c.shutdown();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo83475h() {
    }
}
