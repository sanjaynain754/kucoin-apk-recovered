package p852kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class EmptySimpleLock implements SimpleLock {

    @NotNull
    public static final EmptySimpleLock INSTANCE = new EmptySimpleLock();

    private EmptySimpleLock() {
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
    }
}
