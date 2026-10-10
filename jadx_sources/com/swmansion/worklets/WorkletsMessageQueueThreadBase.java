package com.swmansion.worklets;

import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.swmansion.worklets.WorkletsMessageQueueThreadBase;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44695a
public abstract class WorkletsMessageQueueThreadBase implements MessageQueueThread {

    /* JADX INFO: renamed from: a */
    public final MessageQueueThreadImpl f68478a = MessageQueueThreadImpl.create(MessageQueueThreadSpec.mainThreadSpec(), new QueueThreadExceptionHandler() { // from class: wb0.c
        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public final void handleException(Exception exc) {
            WorkletsMessageQueueThreadBase.m72132a(exc);
        }
    });

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread() {
        this.f68478a.assertIsOnThread();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m72132a(Exception exc) {
        throw new RuntimeException(exc);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread(String str) {
        this.f68478a.assertIsOnThread(str);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public <T> Future<T> callOnQueue(Callable<T> callable) {
        return this.f68478a.callOnQueue(callable);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public MessageQueueThreadPerfStats getPerfStats() {
        return this.f68478a.getPerfStats();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isOnThread() {
        return this.f68478a.isOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void quitSynchronous() {
        try {
            Field declaredField = this.f68478a.getClass().getDeclaredField("mIsFinished");
            declaredField.setAccessible(true);
            declaredField.set(this.f68478a, Boolean.TRUE);
            declaredField.setAccessible(false);
        } catch (IllegalAccessException | NoSuchFieldException e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void resetPerfStats() {
        this.f68478a.resetPerfStats();
    }
}
