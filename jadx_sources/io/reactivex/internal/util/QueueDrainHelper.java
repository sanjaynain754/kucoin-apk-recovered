package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    public static <T, U> boolean checkTerminated(boolean z11, boolean z12, InterfaceC44417c<?> interfaceC44417c, boolean z13, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (!z11) {
            return false;
        }
        if (z13) {
            if (!z12) {
                return false;
            }
            Throwable thError = queueDrain.error();
            if (thError != null) {
                interfaceC44417c.onError(thError);
            } else {
                interfaceC44417c.onComplete();
            }
            return true;
        }
        Throwable thError2 = queueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            interfaceC44417c.onError(thError2);
            return true;
        }
        if (!z12) {
            return false;
        }
        interfaceC44417c.onComplete();
        return true;
    }

    public static <T, U> void drainLoop(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z11, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        int iLeave = 1;
        while (true) {
            SimplePlainQueue<T> simplePlainQueue2 = simplePlainQueue;
            Observer<? super U> observer2 = observer;
            boolean z12 = z11;
            Disposable disposable2 = disposable;
            ObservableQueueDrain<T, U> observableQueueDrain2 = observableQueueDrain;
            if (checkTerminated(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer2, z12, simplePlainQueue2, disposable2, observableQueueDrain2)) {
                return;
            }
            while (true) {
                boolean zDone = observableQueueDrain2.done();
                T tPoll = simplePlainQueue2.poll();
                boolean z13 = tPoll == null;
                boolean z14 = z13;
                if (checkTerminated(zDone, z13, observer2, z12, simplePlainQueue2, disposable2, observableQueueDrain2)) {
                    return;
                }
                if (z14) {
                    break;
                } else {
                    observableQueueDrain2.accept(observer2, tPoll);
                }
            }
            iLeave = observableQueueDrain2.leave(-iLeave);
            if (iLeave == 0) {
                return;
            }
            observer = observer2;
            z11 = z12;
            simplePlainQueue = simplePlainQueue2;
            disposable = disposable2;
            observableQueueDrain = observableQueueDrain2;
        }
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, InterfaceC44417c<? super U> interfaceC44417c, boolean z11, Disposable disposable, QueueDrain<T, U> queueDrain) {
        int iLeave = 1;
        while (true) {
            boolean zDone = queueDrain.done();
            T tPoll = simplePlainQueue.poll();
            boolean z12 = tPoll == null;
            SimplePlainQueue<T> simplePlainQueue2 = simplePlainQueue;
            InterfaceC44417c<? super U> interfaceC44417c2 = interfaceC44417c;
            boolean z13 = z11;
            QueueDrain<T, U> queueDrain2 = queueDrain;
            if (checkTerminated(zDone, z12, interfaceC44417c2, z13, simplePlainQueue2, queueDrain2)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            }
            if (z12) {
                iLeave = queueDrain2.leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else {
                long jRequested = queueDrain2.requested();
                if (jRequested == 0) {
                    simplePlainQueue2.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    interfaceC44417c2.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (queueDrain2.accept(interfaceC44417c2, tPoll) && jRequested != Long.MAX_VALUE) {
                    queueDrain2.produced(1L);
                }
            }
            interfaceC44417c = interfaceC44417c2;
            z11 = z13;
            simplePlainQueue = simplePlainQueue2;
            queueDrain = queueDrain2;
        }
    }

    public static <T> SimpleQueue<T> createQueue(int i11) {
        return i11 < 0 ? new SpscLinkedArrayQueue(-i11) : new SpscArrayQueue(i11);
    }

    public static <T> boolean postCompleteDrain(long j11, InterfaceC44417c<? super T> interfaceC44417c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j12 = j11 & Long.MIN_VALUE;
        while (true) {
            if (j12 != j11) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    interfaceC44417c.onComplete();
                    return true;
                }
                interfaceC44417c.onNext(tPoll);
                j12++;
            } else {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    interfaceC44417c.onComplete();
                    return true;
                }
                j11 = atomicLong.get();
                if (j11 == j12) {
                    long jAddAndGet = atomicLong.addAndGet(-(j12 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j12 = jAddAndGet & Long.MIN_VALUE;
                    j11 = jAddAndGet;
                } else {
                    continue;
                }
            }
        }
    }

    public static void request(InterfaceC44418d interfaceC44418d, int i11) {
        interfaceC44418d.request(i11 < 0 ? Long.MAX_VALUE : i11);
    }

    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isCancelled(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            return true;
        }
    }

    public static <T> void postComplete(InterfaceC44417c<? super T> interfaceC44417c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j11;
        long j12;
        if (queue.isEmpty()) {
            interfaceC44417c.onComplete();
            return;
        }
        if (!postCompleteDrain(atomicLong.get(), interfaceC44417c, queue, atomicLong, booleanSupplier)) {
            do {
                j11 = atomicLong.get();
                if ((j11 & Long.MIN_VALUE) == 0) {
                    j12 = j11 | Long.MIN_VALUE;
                } else {
                    return;
                }
            } while (!atomicLong.compareAndSet(j11, j12));
            if (j11 != 0) {
                postCompleteDrain(j12, interfaceC44417c, queue, atomicLong, booleanSupplier);
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j11, InterfaceC44417c<? super T> interfaceC44417c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j12;
        do {
            j12 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j12, BackpressureHelper.addCap(Long.MAX_VALUE & j12, j11) | (j12 & Long.MIN_VALUE)));
        if (j12 == Long.MIN_VALUE) {
            postCompleteDrain(j11 | Long.MIN_VALUE, interfaceC44417c, queue, atomicLong, booleanSupplier);
            return true;
        }
        return false;
    }

    public static <T, U> boolean checkTerminated(boolean z11, boolean z12, Observer<?> observer, boolean z13, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z11) {
            return false;
        }
        if (z13) {
            if (!z12) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable thError = observableQueueDrain.error();
            if (thError != null) {
                observer.onError(thError);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable thError2 = observableQueueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thError2);
            return true;
        }
        if (!z12) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }
}
