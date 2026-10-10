package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public class UncheckedExecutionException extends RuntimeException {
    private static final long serialVersionUID = 0;

    @Deprecated
    public UncheckedExecutionException() {
    }

    @Deprecated
    public UncheckedExecutionException(String str) {
        super(str);
    }

    public UncheckedExecutionException(String str, Throwable th2) {
        super(str, th2);
    }

    public UncheckedExecutionException(Throwable th2) {
        super(th2);
    }
}
