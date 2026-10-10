package io.reactivex.parallel;

import io.reactivex.functions.BiFunction;

/* JADX INFO: loaded from: classes60.dex */
public enum ParallelFailureHandling implements BiFunction<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // io.reactivex.functions.BiFunction
    public ParallelFailureHandling apply(Long l11, Throwable th2) {
        return this;
    }
}
