package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Callables {
    @J2ktIncompatible
    @GwtIncompatible
    public static <T> Callable<T> threadRenaming(final Callable<T> callable, final Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new Callable() { // from class: com.google.common.util.concurrent.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.m13679c(supplier, callable);
            }
        };
    }

    public static <T> Callable<T> returning(@ParametricNullness final T t11) {
        return new Callable() { // from class: com.google.common.util.concurrent.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.m13680d(t11);
            }
        };
    }

    private Callables() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13677a(Supplier supplier, Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zTrySetName = trySetName((String) supplier.get(), threadCurrentThread);
        try {
            runnable.run();
        } finally {
            if (zTrySetName) {
                trySetName(name, threadCurrentThread);
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(final Callable<T> callable, final ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new AsyncCallable() { // from class: com.google.common.util.concurrent.m
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                return listeningExecutorService.submit(callable);
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m13679c(Supplier supplier, Callable callable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zTrySetName = trySetName((String) supplier.get(), threadCurrentThread);
        try {
            return callable.call();
        } finally {
            if (zTrySetName) {
                trySetName(name, threadCurrentThread);
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static boolean trySetName(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Runnable threadRenaming(final Runnable runnable, final Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new Runnable() { // from class: com.google.common.util.concurrent.o
            @Override // java.lang.Runnable
            public final void run() {
                Callables.m13677a(supplier, runnable);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m13680d(Object obj) {
        return obj;
    }
}
