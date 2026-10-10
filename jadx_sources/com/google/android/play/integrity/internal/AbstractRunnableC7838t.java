package com.google.android.play.integrity.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.t */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractRunnableC7838t implements Runnable {

    /* JADX INFO: renamed from: a */
    @Nullable
    private final TaskCompletionSource f12117a;

    public AbstractRunnableC7838t() {
        this.f12117a = null;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo13221b();

    public AbstractRunnableC7838t(@Nullable TaskCompletionSource taskCompletionSource) {
        this.f12117a = taskCompletionSource;
    }

    /* JADX INFO: renamed from: a */
    public void mo13220a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f12117a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final TaskCompletionSource m13328c() {
        return this.f12117a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo13221b();
        } catch (Exception e11) {
            mo13220a(e11);
        }
    }
}
