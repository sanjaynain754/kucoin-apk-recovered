package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
class Subscriber {

    @Weak
    private EventBus bus;
    private final Executor executor;
    private final Method method;

    @VisibleForTesting
    final Object target;

    @VisibleForTesting
    public static final class SynchronizedSubscriber extends Subscriber {
        @Override // com.google.common.eventbus.Subscriber
        public void invokeSubscriberMethod(Object obj) throws InvocationTargetException {
            synchronized (this) {
                super.invokeSubscriberMethod(obj);
            }
        }

        private SynchronizedSubscriber(EventBus eventBus, Object obj, Method method) {
            super(eventBus, obj, method);
        }
    }

    private Subscriber(EventBus eventBus, Object obj, Method method) {
        this.bus = eventBus;
        this.target = Preconditions.checkNotNull(obj);
        this.method = method;
        method.setAccessible(true);
        this.executor = eventBus.executor();
    }

    private SubscriberExceptionContext context(Object obj) {
        return new SubscriberExceptionContext(this.bus, obj, this.target, this.method);
    }

    private static boolean isDeclaredThreadSafe(Method method) {
        return method.getAnnotation(AllowConcurrentEvents.class) != null;
    }

    public final void dispatchEvent(final Object obj) {
        this.executor.execute(new Runnable() { // from class: com.google.common.eventbus.a
            @Override // java.lang.Runnable
            public final void run() {
                Subscriber.m13573a(this.f12324b, obj);
            }
        });
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Subscriber) {
            Subscriber subscriber = (Subscriber) obj;
            if (this.target == subscriber.target && this.method.equals(subscriber.method)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.method.hashCode() + 31) * 31) + System.identityHashCode(this.target);
    }

    @VisibleForTesting
    public void invokeSubscriberMethod(Object obj) throws InvocationTargetException {
        try {
            this.method.invoke(this.target, Preconditions.checkNotNull(obj));
        } catch (IllegalAccessException e11) {
            throw new Error("Method became inaccessible: " + obj, e11);
        } catch (IllegalArgumentException e12) {
            throw new Error("Method rejected target/argument: " + obj, e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof Error)) {
                throw e13;
            }
            throw ((Error) e13.getCause());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13573a(Subscriber subscriber, Object obj) {
        subscriber.getClass();
        try {
            subscriber.invokeSubscriberMethod(obj);
        } catch (InvocationTargetException e11) {
            subscriber.bus.handleSubscriberException(e11.getCause(), subscriber.context(obj));
        }
    }

    public static Subscriber create(EventBus eventBus, Object obj, Method method) {
        if (isDeclaredThreadSafe(method)) {
            return new Subscriber(eventBus, obj, method);
        }
        return new SynchronizedSubscriber(eventBus, obj, method);
    }
}
