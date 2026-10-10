package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BlockingSubscriber;
import io.reactivex.internal.subscribers.BoundedSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.BlockingIgnoringReceiver;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableBlockingSubscribe {
    public static <T> void subscribe(InterfaceC44416b<? extends T> interfaceC44416b, InterfaceC44417c<? super T> interfaceC44417c) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingSubscriber blockingSubscriber = new BlockingSubscriber(linkedBlockingQueue);
        interfaceC44416b.subscribe(blockingSubscriber);
        while (!blockingSubscriber.isCancelled()) {
            try {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    if (blockingSubscriber.isCancelled()) {
                        return;
                    }
                    BlockingHelper.verifyNonBlocking();
                    objPoll = linkedBlockingQueue.take();
                }
                if (blockingSubscriber.isCancelled() || objPoll == BlockingSubscriber.TERMINATED || NotificationLite.acceptFull(objPoll, interfaceC44417c)) {
                    return;
                }
            } catch (InterruptedException e11) {
                blockingSubscriber.cancel();
                interfaceC44417c.onError(e11);
                return;
            }
        }
    }

    private FlowableBlockingSubscribe() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void subscribe(InterfaceC44416b<? extends T> interfaceC44416b) {
        BlockingIgnoringReceiver blockingIgnoringReceiver = new BlockingIgnoringReceiver();
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(Functions.emptyConsumer(), blockingIgnoringReceiver, blockingIgnoringReceiver, Functions.REQUEST_MAX);
        interfaceC44416b.subscribe(lambdaSubscriber);
        BlockingHelper.awaitForComplete(blockingIgnoringReceiver, lambdaSubscriber);
        Throwable th2 = blockingIgnoringReceiver.error;
        if (th2 != null) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    public static <T> void subscribe(InterfaceC44416b<? extends T> interfaceC44416b, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        subscribe(interfaceC44416b, new LambdaSubscriber(consumer, consumer2, action, Functions.REQUEST_MAX));
    }

    public static <T> void subscribe(InterfaceC44416b<? extends T> interfaceC44416b, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, int i11) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ObjectHelper.verifyPositive(i11, "number > 0 required");
        subscribe(interfaceC44416b, new BoundedSubscriber(consumer, consumer2, action, Functions.boundedConsumer(i11), i11));
    }
}
