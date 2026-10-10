package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class HalfSerializer {
    public static void onComplete(InterfaceC44417c<?> interfaceC44417c, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                interfaceC44417c.onError(thTerminate);
            } else {
                interfaceC44417c.onComplete();
            }
        }
    }

    public static void onError(InterfaceC44417c<?> interfaceC44417c, Throwable th2, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th2)) {
            RxJavaPlugins.onError(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            interfaceC44417c.onError(atomicThrowable.terminate());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void onNext(InterfaceC44417c<? super T> interfaceC44417c, T t11, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC44417c.onNext(t11);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    interfaceC44417c.onError(thTerminate);
                } else {
                    interfaceC44417c.onComplete();
                }
            }
        }
    }

    private HalfSerializer() {
        throw new IllegalStateException("No instances!");
    }

    public static void onComplete(Observer<?> observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                observer.onError(thTerminate);
            } else {
                observer.onComplete();
            }
        }
    }

    public static void onError(Observer<?> observer, Throwable th2, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.addThrowable(th2)) {
            if (atomicInteger.getAndIncrement() == 0) {
                observer.onError(atomicThrowable.terminate());
                return;
            }
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void onNext(Observer<? super T> observer, T t11, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(t11);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    observer.onError(thTerminate);
                } else {
                    observer.onComplete();
                }
            }
        }
    }
}
