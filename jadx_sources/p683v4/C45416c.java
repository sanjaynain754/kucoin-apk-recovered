package p683v4;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p050c4.InterfaceC4820b;
import p683v4.InterfaceC45414a;

/* JADX INFO: renamed from: v4.c */
/* JADX INFO: compiled from: AnimationBackendDelegateWithInactivityCheck.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45416c<T extends InterfaceC45414a> extends C45415b<T> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC4820b f102434e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f102435f;

    /* JADX INFO: renamed from: g */
    public boolean f102436g;

    /* JADX INFO: renamed from: h */
    public long f102437h;

    /* JADX INFO: renamed from: i */
    public long f102438i;

    /* JADX INFO: renamed from: j */
    public long f102439j;

    /* JADX INFO: renamed from: k */
    public b f102440k;

    /* JADX INFO: renamed from: l */
    public final Runnable f102441l;

    /* JADX INFO: renamed from: v4.c$a */
    /* JADX INFO: compiled from: AnimationBackendDelegateWithInactivityCheck.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C45416c.this) {
                try {
                    C45416c.this.f102436g = false;
                    if (!C45416c.this.m100371t()) {
                        C45416c.this.m100372u();
                    } else if (C45416c.this.f102440k != null) {
                        C45416c.this.f102440k.mo8751n();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v4.c$b */
    /* JADX INFO: compiled from: AnimationBackendDelegateWithInactivityCheck.java */
    public interface b {
        /* JADX INFO: renamed from: n */
        void mo8751n();
    }

    /* JADX INFO: renamed from: r */
    public static <T extends InterfaceC45414a & b> C45415b<T> m100369r(T t11, InterfaceC4820b interfaceC4820b, ScheduledExecutorService scheduledExecutorService) {
        return m100370s(t11, (b) t11, interfaceC4820b, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m100372u() {
        if (!this.f102436g) {
            this.f102436g = true;
            this.f102435f.schedule(this.f102441l, this.f102439j, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: s */
    public static <T extends InterfaceC45414a> C45415b<T> m100370s(T t11, b bVar, InterfaceC4820b interfaceC4820b, ScheduledExecutorService scheduledExecutorService) {
        return new C45416c(t11, bVar, interfaceC4820b, scheduledExecutorService);
    }

    @Override // p683v4.C45415b, p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: m */
    public boolean mo8750m(Drawable drawable, Canvas canvas, int i11) {
        this.f102437h = this.f102434e.now();
        boolean zMo8750m = super.mo8750m(drawable, canvas, i11);
        m100372u();
        return zMo8750m;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m100371t() {
        return this.f102434e.now() - this.f102437h > this.f102438i;
    }

    public C45416c(T t11, b bVar, InterfaceC4820b interfaceC4820b, ScheduledExecutorService scheduledExecutorService) {
        super(t11);
        this.f102436g = false;
        this.f102438i = 2000L;
        this.f102439j = 1000L;
        this.f102441l = new a();
        this.f102440k = bVar;
        this.f102434e = interfaceC4820b;
        this.f102435f = scheduledExecutorService;
    }
}
