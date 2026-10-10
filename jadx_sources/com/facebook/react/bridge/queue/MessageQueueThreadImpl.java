package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.tencent.bugly.proguard.C33627eb;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public class MessageQueueThreadImpl implements MessageQueueThread {
    private final String mAssertionErrorMessage;
    private final MessageQueueThreadHandler mHandler;
    private volatile boolean mIsFinished;
    private final Looper mLooper;
    private final String mName;

    @Nullable
    private final MessageQueueThreadPerfStats mPerfStats;

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this(str, looper, queueThreadExceptionHandler, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10219b(SimpleSettableFuture simpleSettableFuture) {
        Process.setThreadPriority(-4);
        Looper.prepare();
        MessageQueueThreadPerfStats messageQueueThreadPerfStats = new MessageQueueThreadPerfStats();
        assignToPerfStats(messageQueueThreadPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
        simpleSettableFuture.set(new Pair(Looper.myLooper(), messageQueueThreadPerfStats));
        Looper.loop();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC44695a
    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC44695a
    public void quitSynchronous() {
        this.mIsFinished = true;
        this.mLooper.quit();
        if (this.mLooper.getThread() != Thread.currentThread()) {
            try {
                this.mLooper.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException("Got interrupted waiting to join thread " + this.mName);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.queue.MessageQueueThreadImpl$1 */
    public static /* synthetic */ class C58491 {

        /* JADX INFO: renamed from: $SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType */
        static final /* synthetic */ int[] f9697x16463f8b;

        static {
            int[] iArr = new int[MessageQueueThreadSpec.ThreadType.values().length];
            f9697x16463f8b = iArr;
            try {
                iArr[MessageQueueThreadSpec.ThreadType.MAIN_UI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9697x16463f8b[MessageQueueThreadSpec.ThreadType.NEW_BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, @Nullable MessageQueueThreadPerfStats messageQueueThreadPerfStats) {
        this.mIsFinished = false;
        this.mName = str;
        this.mLooper = looper;
        this.mHandler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.mPerfStats = messageQueueThreadPerfStats;
        this.mAssertionErrorMessage = "Expected to be called from the '" + getName() + "' thread!";
    }

    private static void assignToPerfStats(@Nullable MessageQueueThreadPerfStats messageQueueThreadPerfStats, long j11, long j12) {
        if (messageQueueThreadPerfStats == null) {
            return;
        }
        messageQueueThreadPerfStats.wallTime = j11;
        messageQueueThreadPerfStats.cpuTime = j12;
    }

    public static MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        int i11 = C58491.f9697x16463f8b[messageQueueThreadSpec.getThreadType().ordinal()];
        if (i11 == 1) {
            return createForMainThread(messageQueueThreadSpec.getName(), queueThreadExceptionHandler);
        }
        if (i11 == 2) {
            return startNewBackgroundThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
        }
        throw new RuntimeException("Unknown thread type: " + messageQueueThreadSpec.getThreadType());
    }

    private static MessageQueueThreadImpl createForMainThread(String str, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        return new MessageQueueThreadImpl(str, Looper.getMainLooper(), queueThreadExceptionHandler);
    }

    private static MessageQueueThreadImpl startNewBackgroundThread(String str, long j11, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        new Thread(null, new Runnable() { // from class: com.facebook.react.bridge.queue.b
            @Override // java.lang.Runnable
            public final void run() {
                MessageQueueThreadImpl.m10219b(simpleSettableFuture);
            }
        }, "mqt_" + str, j11).start();
        Pair pair = (Pair) simpleSettableFuture.getOrThrow();
        return new MessageQueueThreadImpl(str, (Looper) pair.first, queueThreadExceptionHandler, (MessageQueueThreadPerfStats) pair.second);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC44695a
    public void assertIsOnThread(String str) {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage + C33627eb.f69716f + str);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC44695a
    public <T> Future<T> callOnQueue(final Callable<T> callable) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.queue.a
            @Override // java.lang.Runnable
            public final void run() {
                MessageQueueThreadImpl.m10220c(simpleSettableFuture, callable);
            }
        });
        return simpleSettableFuture;
    }

    public Looper getLooper() {
        return this.mLooper;
    }

    public String getName() {
        return this.mName;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @Nullable
    @InterfaceC44695a
    public MessageQueueThreadPerfStats getPerfStats() {
        return this.mPerfStats;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC44695a
    public boolean isIdle() {
        return this.mLooper.getQueue().isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC44695a
    public boolean isOnThread() {
        return this.mLooper.getThread() == Thread.currentThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC44695a
    public void resetPerfStats() {
        assignToPerfStats(this.mPerfStats, -1L, -1L);
        runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.queue.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f9701b.lambda$resetPerfStats$1();
            }
        });
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC44695a
    public boolean runOnQueue(Runnable runnable) {
        if (!this.mIsFinished) {
            this.mHandler.post(runnable);
            return true;
        }
        C45999a.m101488I(ReactConstants.TAG, "Tried to enqueue runnable on already finished thread: '" + getName() + "... dropping Runnable.");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10220c(SimpleSettableFuture simpleSettableFuture, Callable callable) {
        try {
            simpleSettableFuture.set(callable.call());
        } catch (Exception e11) {
            simpleSettableFuture.setException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetPerfStats$1() {
        assignToPerfStats(this.mPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
    }
}
