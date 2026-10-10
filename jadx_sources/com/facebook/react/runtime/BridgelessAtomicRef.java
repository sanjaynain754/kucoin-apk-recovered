package com.facebook.react.runtime;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Objects;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
class BridgelessAtomicRef<T> {
    private volatile String failureMessage;

    @Nullable
    T mInitialValue;

    @Nullable
    volatile T mValue;
    private volatile State state;

    public interface Provider<T> {
        T get();
    }

    public enum State {
        Init,
        Creating,
        Success,
        Failure
    }

    public BridgelessAtomicRef(@Nullable T t11) {
        this.mValue = t11;
        this.mInitialValue = t11;
        this.state = State.Init;
        this.failureMessage = "";
    }

    public synchronized T get() {
        return (T) C38115a.m86047c(this.mValue);
    }

    public synchronized T getAndReset() {
        T t11;
        t11 = get();
        reset();
        return t11;
    }

    @Nullable
    public synchronized T getNullable() {
        return this.mValue;
    }

    @SuppressLint({"CatchGeneralException"})
    public T getOrCreate(Provider<T> provider) {
        boolean z11;
        T t11;
        T t12;
        synchronized (this) {
            try {
                State state = this.state;
                State state2 = State.Success;
                if (state == state2) {
                    return get();
                }
                if (this.state == State.Failure) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.failureMessage);
                }
                State state3 = this.state;
                State state4 = State.Creating;
                boolean z12 = false;
                if (state3 != state4) {
                    this.state = state4;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    try {
                        this.mValue = provider.get();
                        synchronized (this) {
                            this.state = state2;
                            notifyAll();
                            t11 = get();
                        }
                        return t11;
                    } catch (RuntimeException e11) {
                        synchronized (this) {
                            this.state = State.Failure;
                            this.failureMessage = Objects.toString(e11.getMessage(), "null");
                            notifyAll();
                            throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e11);
                        }
                    }
                }
                synchronized (this) {
                    while (this.state == State.Creating) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z12 = true;
                        }
                    }
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                    if (this.state == State.Failure) {
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.failureMessage);
                    }
                    t12 = get();
                }
                return t12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void reset() {
        this.mValue = this.mInitialValue;
        this.state = State.Init;
        this.failureMessage = "";
    }

    public BridgelessAtomicRef() {
        this(null);
    }
}
