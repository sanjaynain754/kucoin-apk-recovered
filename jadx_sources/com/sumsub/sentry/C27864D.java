package com.sumsub.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sentry.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27864D {

    /* JADX INFO: renamed from: g */
    public static final long f56902g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h */
    public static final long f56903h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: i */
    public static final Lazy f56904i = LazyKt.lazy(new Function0() { // from class: com.sumsub.sentry.i1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C27864D.m68962b();
        }
    });

    /* JADX INFO: renamed from: a */
    public final long f56905a;

    /* JADX INFO: renamed from: b */
    public final Callable f56906b;

    /* JADX INFO: renamed from: c */
    public volatile String f56907c;

    /* JADX INFO: renamed from: d */
    public volatile long f56908d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f56909e;

    /* JADX INFO: renamed from: f */
    public final ExecutorService f56910f;

    /* JADX INFO: renamed from: a */
    public static final InetAddress m68961a() {
        return InetAddress.getLocalHost();
    }

    public C27864D(long j11) {
        Callable callable = new Callable() { // from class: com.sumsub.sentry.j1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C27864D.m68961a();
            }
        };
        this.f56905a = j11;
        this.f56906b = callable;
        this.f56909e = new AtomicBoolean(false);
        this.f56910f = Executors.newSingleThreadExecutor(new ThreadFactoryC27862C());
        m68963c();
    }

    /* JADX INFO: renamed from: a */
    public static final Void m68960a(C27864D c27864d) {
        try {
            c27864d.f56907c = ((InetAddress) c27864d.f56906b.call()).getCanonicalHostName();
            c27864d.f56908d = System.currentTimeMillis() + c27864d.f56905a;
            return null;
        } finally {
            c27864d.f56909e.set(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C27864D m68962b() {
        return new C27864D(f56902g);
    }

    /* JADX INFO: renamed from: c */
    public final void m68963c() {
        try {
            this.f56910f.submit(new Callable() { // from class: com.sumsub.sentry.k1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C27864D.m68960a(this.f57088b);
                }
            }).get(f56903h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f56908d = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException unused2) {
            this.f56908d = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (ExecutionException unused3) {
            this.f56908d = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (TimeoutException unused4) {
            this.f56908d = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
