package com.google.api.client.util;

/* JADX INFO: loaded from: classes56.dex */
public final class Throwables {
    public static void propagateIfPossible(Throwable th2) {
        if (th2 != null) {
            com.google.common.base.Throwables.throwIfUnchecked(th2);
        }
    }

    public static <X extends Throwable> void propagateIfPossible(Throwable th2, Class<X> cls) throws Throwable {
        com.google.common.base.Throwables.propagateIfPossible(th2, cls);
    }

    private Throwables() {
    }

    public static RuntimeException propagate(Throwable th2) {
        return com.google.common.base.Throwables.propagate(th2);
    }
}
