package androidx.media3.exoplayer.util;

import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface ReleasableExecutor extends Executor {
    void release();

    static <T extends Executor> ReleasableExecutor from(final T t11, final Consumer<T> consumer) {
        return new ReleasableExecutor() { // from class: androidx.media3.exoplayer.util.ReleasableExecutor.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                t11.execute(runnable);
            }

            @Override // androidx.media3.exoplayer.util.ReleasableExecutor
            public void release() {
                consumer.accept(t11);
            }
        };
    }
}
