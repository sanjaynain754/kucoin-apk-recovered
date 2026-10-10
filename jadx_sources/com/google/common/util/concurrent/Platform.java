package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
final class Platform {
    private Platform() {
    }

    public static boolean isInstanceOfThrowableClass(Throwable th2, Class<? extends Throwable> cls) {
        return cls.isInstance(th2);
    }

    public static void restoreInterruptIfIsInterruptedException(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
