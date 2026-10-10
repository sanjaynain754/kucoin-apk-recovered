package p651u3;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: u3.i */
/* JADX INFO: compiled from: UiThreadImmediateExecutorService.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45106i extends ScheduledExecutorServiceC45102e {

    /* JADX INFO: renamed from: c */
    public static C45106i f101516c;

    public C45106i() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: renamed from: g */
    public static C45106i m99726g() {
        if (f101516c == null) {
            f101516c = new C45106i();
        }
        return f101516c;
    }

    @Override // p651u3.ScheduledExecutorServiceC45102e, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (m99718a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
