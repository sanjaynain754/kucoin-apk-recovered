package p457n;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: n.j */
/* JADX INFO: loaded from: classes23.dex */
public class ExecutorC42689j implements Executor {

    /* JADX INFO: renamed from: b */
    public final Handler f94490b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f94490b.post(runnable);
    }
}
