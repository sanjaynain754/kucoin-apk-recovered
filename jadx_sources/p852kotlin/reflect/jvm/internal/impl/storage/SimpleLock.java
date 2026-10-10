package p852kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface SimpleLock {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: locks.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public final DefaultSimpleLock simpleLock(@Nullable Runnable runnable, @Nullable Function1<? super InterruptedException, Unit> function1) {
            return (runnable == null || function1 == null) ? new DefaultSimpleLock(null, 1, null) : new CancellableSimpleLock(runnable, function1);
        }

        private Companion() {
        }
    }

    void lock();

    void unlock();
}
