package p419l2;

import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p445m2.InterfaceC42398i;
import p445m2.InterfaceC42399j;
import p460n2.InterfaceC42704b;
import p523p2.C43364k;

/* JADX INFO: renamed from: l2.d */
/* JADX INFO: compiled from: RequestFutureTarget.java */
/* JADX INFO: loaded from: classes.dex */
public class C42030d<R> implements InterfaceFutureC42028b<R>, InterfaceC42031e<R> {

    /* JADX INFO: renamed from: l */
    public static final a f92299l = new a();

    /* JADX INFO: renamed from: b */
    public final int f92300b;

    /* JADX INFO: renamed from: c */
    public final int f92301c;

    /* JADX INFO: renamed from: d */
    public final boolean f92302d;

    /* JADX INFO: renamed from: e */
    public final a f92303e;

    /* JADX INFO: renamed from: f */
    @Nullable
    @GuardedBy("this")
    public R f92304f;

    /* JADX INFO: renamed from: g */
    @Nullable
    @GuardedBy("this")
    public InterfaceC42029c f92305g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("this")
    public boolean f92306h;

    /* JADX INFO: renamed from: i */
    @GuardedBy("this")
    public boolean f92307i;

    /* JADX INFO: renamed from: j */
    @GuardedBy("this")
    public boolean f92308j;

    /* JADX INFO: renamed from: k */
    @Nullable
    @GuardedBy("this")
    public GlideException f92309k;

    public C42030d(int i11, int i12) {
        this(i11, i12, true, f92299l);
    }

    @Override // p419l2.InterfaceC42031e
    /* JADX INFO: renamed from: b */
    public synchronized boolean mo20017b(R r11, Object obj, InterfaceC42399j<R> interfaceC42399j, DataSource dataSource, boolean z11) {
        this.f92307i = true;
        this.f92304f = r11;
        this.f92303e.m92233a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f92306h = true;
                this.f92303e.m92233a(this);
                InterfaceC42029c interfaceC42029c = null;
                if (z11) {
                    InterfaceC42029c interfaceC42029c2 = this.f92305g;
                    this.f92305g = null;
                    interfaceC42029c = interfaceC42029c2;
                }
                if (interfaceC42029c != null) {
                    interfaceC42029c.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p419l2.InterfaceC42031e
    /* JADX INFO: renamed from: d */
    public synchronized boolean mo20018d(@Nullable GlideException glideException, Object obj, InterfaceC42399j<R> interfaceC42399j, boolean z11) {
        this.f92308j = true;
        this.f92309k = glideException;
        this.f92303e.m92233a(this);
        return false;
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: e */
    public synchronized void mo6639e(@NonNull R r11, @Nullable InterfaceC42704b<? super R> interfaceC42704b) {
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: g */
    public synchronized void mo92230g(@Nullable InterfaceC42029c interfaceC42029c) {
        this.f92305g = interfaceC42029c;
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return m92232j(null);
        } catch (TimeoutException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // p445m2.InterfaceC42399j
    @Nullable
    public synchronized InterfaceC42029c getRequest() {
        return this.f92305g;
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: i */
    public synchronized void mo6640i(@Nullable Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f92306h;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        return this.f92306h || this.f92307i || this.f92308j;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized R m92232j(Long l11) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f92302d && !isDone()) {
                C43364k.m95508a();
            }
            if (this.f92306h) {
                throw new CancellationException();
            }
            if (this.f92308j) {
                throw new ExecutionException(this.f92309k);
            }
            if (this.f92307i) {
                return this.f92304f;
            }
            if (l11 == null) {
                this.f92303e.m92234b(this, 0L);
            } else if (l11.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l11.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f92303e.m92234b(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f92308j) {
                throw new ExecutionException(this.f92309k);
            }
            if (this.f92306h) {
                throw new CancellationException();
            }
            if (!this.f92307i) {
                throw new TimeoutException();
            }
            return this.f92304f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l2.d$a */
    /* JADX INFO: compiled from: RequestFutureTarget.java */
    @VisibleForTesting
    public static class a {
        /* JADX INFO: renamed from: a */
        public void m92233a(Object obj) {
            obj.notifyAll();
        }

        /* JADX INFO: renamed from: b */
        public void m92234b(Object obj, long j11) throws InterruptedException {
            obj.wait(j11);
        }
    }

    public C42030d(int i11, int i12, boolean z11, a aVar) {
        this.f92300b = i11;
        this.f92301c = i12;
        this.f92302d = z11;
        this.f92303e = aVar;
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: a */
    public void mo92228a(@NonNull InterfaceC42398i interfaceC42398i) {
        interfaceC42398i.mo6939e(this.f92300b, this.f92301c);
    }

    @Override // java.util.concurrent.Future
    public R get(long j11, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return m92232j(Long.valueOf(timeUnit.toMillis(j11)));
    }

    @Override // p329i2.InterfaceC38421m
    public void onDestroy() {
    }

    @Override // p329i2.InterfaceC38421m
    public void onStart() {
    }

    @Override // p329i2.InterfaceC38421m
    public void onStop() {
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: c */
    public void mo59882c(@Nullable Drawable drawable) {
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: f */
    public void mo92229f(@NonNull InterfaceC42398i interfaceC42398i) {
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: h */
    public void mo92231h(@Nullable Drawable drawable) {
    }
}
