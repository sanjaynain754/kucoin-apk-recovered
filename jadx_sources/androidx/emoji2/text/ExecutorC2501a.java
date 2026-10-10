package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.emoji2.text.a */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class ExecutorC2501a implements Executor {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Handler f2696b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2696b.post(runnable);
    }
}
