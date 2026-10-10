package p852kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class CancellableSimpleLock extends DefaultSimpleLock {

    @NotNull
    private final Runnable checkCancelled;

    @NotNull
    private final Function1<InterruptedException, Unit> interruptedExceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableSimpleLock(@NotNull Lock lock, @NotNull Runnable checkCancelled, @NotNull Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        super(lock);
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(checkCancelled, "checkCancelled");
        Intrinsics.checkNotNullParameter(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.checkCancelled = checkCancelled;
        this.interruptedExceptionHandler = interruptedExceptionHandler;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, p852kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        while (!getLock().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.checkCancelled.run();
            } catch (InterruptedException e11) {
                this.interruptedExceptionHandler.invoke(e11);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CancellableSimpleLock(@NotNull Runnable checkCancelled, @NotNull Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        Intrinsics.checkNotNullParameter(checkCancelled, "checkCancelled");
        Intrinsics.checkNotNullParameter(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
