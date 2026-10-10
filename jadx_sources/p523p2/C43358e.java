package p523p2;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: p2.e */
/* JADX INFO: compiled from: Executors.java */
/* JADX INFO: loaded from: classes.dex */
public final class C43358e {

    /* JADX INFO: renamed from: a */
    public static final Executor f95749a = new a();

    /* JADX INFO: renamed from: b */
    public static final Executor f95750b = new b();

    /* JADX INFO: renamed from: p2.e$a */
    /* JADX INFO: compiled from: Executors.java */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            C43364k.m95529v(runnable);
        }
    }

    /* JADX INFO: renamed from: p2.e$b */
    /* JADX INFO: compiled from: Executors.java */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m95487a() {
        return f95750b;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m95488b() {
        return f95749a;
    }
}
