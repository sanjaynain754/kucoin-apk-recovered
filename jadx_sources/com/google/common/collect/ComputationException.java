package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
@Deprecated
public class ComputationException extends RuntimeException {
    private static final long serialVersionUID = 0;

    public ComputationException(Throwable th2) {
        super(th2);
    }
}
