package p483o0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: compiled from: BoltsExecutors.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C42905b {

    /* JADX INFO: renamed from: d */
    public static final C42905b f94986d = new C42905b();

    /* JADX INFO: renamed from: a */
    public final ExecutorService f94987a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f94988b;

    /* JADX INFO: renamed from: c */
    public final Executor f94989c;

    /* JADX INFO: renamed from: o0.b$b */
    /* JADX INFO: compiled from: BoltsExecutors.java */
    public static class b implements Executor {

        /* JADX INFO: renamed from: b */
        public ThreadLocal<Integer> f94990b;

        public b() {
            this.f94990b = new ThreadLocal<>();
        }

        /* JADX INFO: renamed from: a */
        public final int m94090a() {
            Integer num = this.f94990b.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.f94990b.remove();
                return iIntValue;
            }
            this.f94990b.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        /* JADX INFO: renamed from: b */
        public final int m94091b() {
            Integer num = this.f94990b.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f94990b.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (m94091b() <= 15) {
                    runnable.run();
                } else {
                    C42905b.m94087a().execute(runnable);
                }
                m94090a();
            } catch (Throwable th2) {
                m94090a();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m94087a() {
        return f94986d.f94987a;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m94088b() {
        return f94986d.f94989c;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m94089c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    public C42905b() {
        ExecutorService executorServiceM94085b;
        if (!m94089c()) {
            executorServiceM94085b = Executors.newCachedThreadPool();
        } else {
            executorServiceM94085b = C42904a.m94085b();
        }
        this.f94987a = executorServiceM94085b;
        this.f94988b = Executors.newSingleThreadScheduledExecutor();
        this.f94989c = new b();
    }
}
