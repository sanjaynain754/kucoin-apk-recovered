package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes23.dex */
public enum NotificationLite {
    COMPLETE;

    /* JADX INFO: loaded from: classes60.dex */
    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final Disposable upstream;

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }

        public DisposableNotification(Disposable disposable) {
            this.upstream = disposable;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: e */
        final Throwable f87222e;

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return ObjectHelper.equals(this.f87222e, ((ErrorNotification) obj).f87222e);
            }
            return false;
        }

        public int hashCode() {
            return this.f87222e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f87222e + "]";
        }

        public ErrorNotification(Throwable th2) {
            this.f87222e = th2;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final InterfaceC44418d upstream;

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }

        public SubscriptionNotification(InterfaceC44418d interfaceC44418d) {
            this.upstream = interfaceC44418d;
        }
    }

    public static <T> boolean accept(Object obj, InterfaceC44417c<? super T> interfaceC44417c) {
        if (obj == COMPLETE) {
            interfaceC44417c.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            interfaceC44417c.onError(((ErrorNotification) obj).f87222e);
            return true;
        }
        interfaceC44417c.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, InterfaceC44417c<? super T> interfaceC44417c) {
        if (obj == COMPLETE) {
            interfaceC44417c.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            interfaceC44417c.onError(((ErrorNotification) obj).f87222e);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            interfaceC44417c.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        }
        interfaceC44417c.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    public static Object error(Throwable th2) {
        return new ErrorNotification(th2);
    }

    public static Disposable getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f87222e;
    }

    public static InterfaceC44418d getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static Object subscription(InterfaceC44418d interfaceC44418d) {
        return new SubscriptionNotification(interfaceC44418d);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f87222e);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f87222e);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        }
        observer.onNext(obj);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t11) {
        return t11;
    }
}
