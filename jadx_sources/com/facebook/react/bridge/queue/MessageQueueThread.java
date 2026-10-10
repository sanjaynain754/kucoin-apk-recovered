package com.facebook.react.bridge.queue;

import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public interface MessageQueueThread {
    @InterfaceC44695a
    void assertIsOnThread();

    @InterfaceC44695a
    void assertIsOnThread(String str);

    @InterfaceC44695a
    <T> Future<T> callOnQueue(Callable<T> callable);

    @Nullable
    @InterfaceC44695a
    MessageQueueThreadPerfStats getPerfStats();

    @InterfaceC44695a
    boolean isIdle();

    @InterfaceC44695a
    boolean isOnThread();

    @InterfaceC44695a
    void quitSynchronous();

    @InterfaceC44695a
    void resetPerfStats();

    @InterfaceC44695a
    boolean runOnQueue(Runnable runnable);
}
