package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public class SubscriptionArbiter extends AtomicInteger implements InterfaceC44418d {
    private static final long serialVersionUID = -2189523197179400958L;
    InterfaceC44418d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<InterfaceC44418d> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        drain();
    }

    public final void drainLoop() {
        int iAddAndGet = 1;
        long jAddCap = 0;
        InterfaceC44418d interfaceC44418d = null;
        do {
            InterfaceC44418d andSet = this.missedSubscription.get();
            if (andSet != null) {
                andSet = this.missedSubscription.getAndSet(null);
            }
            long andSet2 = this.missedRequested.get();
            if (andSet2 != 0) {
                andSet2 = this.missedRequested.getAndSet(0L);
            }
            long andSet3 = this.missedProduced.get();
            if (andSet3 != 0) {
                andSet3 = this.missedProduced.getAndSet(0L);
            }
            InterfaceC44418d interfaceC44418d2 = this.actual;
            if (this.cancelled) {
                if (interfaceC44418d2 != null) {
                    interfaceC44418d2.cancel();
                    this.actual = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jAddCap2 = this.requested;
                if (jAddCap2 != Long.MAX_VALUE) {
                    jAddCap2 = BackpressureHelper.addCap(jAddCap2, andSet2);
                    if (jAddCap2 != Long.MAX_VALUE) {
                        jAddCap2 -= andSet3;
                        if (jAddCap2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jAddCap2);
                            jAddCap2 = 0;
                        }
                    }
                    this.requested = jAddCap2;
                }
                if (andSet != null) {
                    if (interfaceC44418d2 != null && this.cancelOnReplace) {
                        interfaceC44418d2.cancel();
                    }
                    this.actual = andSet;
                    if (jAddCap2 != 0) {
                        jAddCap = BackpressureHelper.addCap(jAddCap, jAddCap2);
                        interfaceC44418d = andSet;
                    }
                } else if (interfaceC44418d2 != null && andSet2 != 0) {
                    jAddCap = BackpressureHelper.addCap(jAddCap, andSet2);
                    interfaceC44418d = interfaceC44418d2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jAddCap != 0) {
            interfaceC44418d.request(jAddCap);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j11) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedProduced, j11);
            drain();
            return;
        }
        long j12 = this.requested;
        if (j12 != Long.MAX_VALUE) {
            long j13 = j12 - j11;
            if (j13 < 0) {
                SubscriptionHelper.reportMoreProduced(j13);
                j13 = 0;
            }
            this.requested = j13;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    public final void setSubscription(InterfaceC44418d interfaceC44418d) {
        if (this.cancelled) {
            interfaceC44418d.cancel();
            return;
        }
        ObjectHelper.requireNonNull(interfaceC44418d, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            InterfaceC44418d andSet = this.missedSubscription.getAndSet(interfaceC44418d);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        InterfaceC44418d interfaceC44418d2 = this.actual;
        if (interfaceC44418d2 != null && this.cancelOnReplace) {
            interfaceC44418d2.cancel();
        }
        this.actual = interfaceC44418d;
        long j11 = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j11 != 0) {
            interfaceC44418d.request(j11);
        }
    }

    public SubscriptionArbiter(boolean z11) {
        this.cancelOnReplace = z11;
    }

    public final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    @Override // sh0.InterfaceC44418d
    public final void request(long j11) {
        if (SubscriptionHelper.validate(j11) && !this.unbounded) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j12 = this.requested;
                if (j12 != Long.MAX_VALUE) {
                    long jAddCap = BackpressureHelper.addCap(j12, j11);
                    this.requested = jAddCap;
                    if (jAddCap == Long.MAX_VALUE) {
                        this.unbounded = true;
                    }
                }
                InterfaceC44418d interfaceC44418d = this.actual;
                if (decrementAndGet() != 0) {
                    drainLoop();
                }
                if (interfaceC44418d != null) {
                    interfaceC44418d.request(j11);
                    return;
                }
                return;
            }
            BackpressureHelper.add(this.missedRequested, j11);
            drain();
        }
    }
}
