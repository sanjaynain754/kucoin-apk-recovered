package p852kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes61.dex */
public class DefaultSimpleLock implements SimpleLock {

    @NotNull
    private final Lock lock;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSimpleLock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DefaultSimpleLock(@NotNull Lock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.lock = lock;
    }

    @NotNull
    public final Lock getLock() {
        return this.lock;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        this.lock.lock();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
        this.lock.unlock();
    }

    public /* synthetic */ DefaultSimpleLock(Lock lock, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
