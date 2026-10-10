package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class FakeTimeLimiter implements TimeLimiter {
    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j11, TimeUnit timeUnit) throws ExecutionException {
        return (T) callWithTimeout(callable, j11, timeUnit);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T callWithTimeout(Callable<T> callable, long j11, TimeUnit timeUnit) throws ExecutionException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        try {
            return callable.call();
        } catch (Error e11) {
            throw new ExecutionError(e11);
        } catch (RuntimeException e12) {
            throw new UncheckedExecutionException(e12);
        } catch (Exception e13) {
            Platform.restoreInterruptIfIsInterruptedException(e13);
            throw new ExecutionException(e13);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T newProxy(T t11, Class<T> cls, long j11, TimeUnit timeUnit) {
        Preconditions.checkNotNull(t11);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(timeUnit);
        return t11;
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j11, TimeUnit timeUnit) {
        runWithTimeout(runnable, j11, timeUnit);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j11, TimeUnit timeUnit) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        try {
            runnable.run();
        } catch (Error e11) {
            throw new ExecutionError(e11);
        } catch (Exception e12) {
            throw new UncheckedExecutionException(e12);
        }
    }
}
