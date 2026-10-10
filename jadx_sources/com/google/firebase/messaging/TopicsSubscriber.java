package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.tencent.bugly.proguard.C33978va;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class TopicsSubscriber {
    static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static final long MIN_DELAY_SEC = 30;
    private static final long RPC_TIMEOUT_SEC = 30;
    private final Context context;
    private final FirebaseMessaging firebaseMessaging;
    private final Metadata metadata;
    private final GmsRpc rpc;
    private final TopicsStore store;
    private final ScheduledExecutorService syncExecutor;

    @GuardedBy("pendingOperations")
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> pendingOperations = new ArrayMap();

    @GuardedBy("this")
    private boolean syncScheduledOrRunning = false;

    public synchronized boolean isSyncScheduledOrRunning() {
        return this.syncScheduledOrRunning;
    }

    public synchronized void setSyncScheduledOrRunning(boolean z11) {
        this.syncScheduledOrRunning = z11;
    }

    @WorkerThread
    public boolean syncTopics() throws IOException {
        while (true) {
            synchronized (this) {
                try {
                    TopicOperation nextTopicOperation = this.store.getNextTopicOperation();
                    if (nextTopicOperation == null) {
                        if (isDebugLogEnabled()) {
                            Log.d(Constants.TAG, "topic sync succeeded");
                        }
                        return true;
                    }
                    if (!performTopicOperation(nextTopicOperation)) {
                        return false;
                    }
                    this.store.removeTopicOperation(nextTopicOperation);
                    markCompletePendingOperation(nextTopicOperation);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void addToPendingOperations(TopicOperation topicOperation, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.pendingOperations) {
            try {
                String strSerialize = topicOperation.serialize();
                if (this.pendingOperations.containsKey(strSerialize)) {
                    arrayDeque = this.pendingOperations.get(strSerialize);
                } else {
                    ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                    this.pendingOperations.put(strSerialize, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @WorkerThread
    private static <T> void awaitTask(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException(ERROR_SERVICE_NOT_AVAILABLE, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e12);
            }
            throw ((RuntimeException) cause);
        }
    }

    @WorkerThread
    private void blockingSubscribeToTopic(String str) throws IOException {
        awaitTask(this.rpc.subscribeToTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    @WorkerThread
    private void blockingUnsubscribeFromTopic(String str) throws IOException {
        awaitTask(this.rpc.unsubscribeFromTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    @VisibleForTesting
    public static Task<TopicsSubscriber> createInstance(final FirebaseMessaging firebaseMessaging, final Metadata metadata, final GmsRpc gmsRpc, final Context context, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.j0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TopicsSubscriber.m13807a(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc);
            }
        });
    }

    public static boolean isDebugLogEnabled() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    private void markCompletePendingOperation(TopicOperation topicOperation) {
        synchronized (this.pendingOperations) {
            try {
                String strSerialize = topicOperation.serialize();
                if (this.pendingOperations.containsKey(strSerialize)) {
                    ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.pendingOperations.get(strSerialize);
                    TaskCompletionSource<Void> taskCompletionSourcePoll = arrayDeque.poll();
                    if (taskCompletionSourcePoll != null) {
                        taskCompletionSourcePoll.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.pendingOperations.remove(strSerialize);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public TopicsStore getStore() {
        return this.store;
    }

    public boolean hasPendingOperation() {
        return this.store.getNextTopicOperation() != null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    @WorkerThread
    public boolean performTopicOperation(TopicOperation topicOperation) throws IOException {
        byte b11;
        try {
            String operation = topicOperation.getOperation();
            int iHashCode = operation.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && operation.equals("U")) {
                    b11 = 1;
                } else {
                    b11 = -1;
                }
            } else if (operation.equals(ExifInterface.LATITUDE_SOUTH)) {
                b11 = 0;
            } else {
                b11 = -1;
            }
            if (b11 == 0) {
                blockingSubscribeToTopic(topicOperation.getTopic());
                if (isDebugLogEnabled()) {
                    Log.d(Constants.TAG, "Subscribe to topic: " + topicOperation.getTopic() + " succeeded.");
                }
            } else if (b11 == 1) {
                blockingUnsubscribeFromTopic(topicOperation.getTopic());
                if (isDebugLogEnabled()) {
                    Log.d(Constants.TAG, "Unsubscribe from topic: " + topicOperation.getTopic() + " succeeded.");
                }
            } else if (isDebugLogEnabled()) {
                Log.d(Constants.TAG, "Unknown topic operation" + topicOperation + C33978va.f72339h);
            }
            return true;
        } catch (IOException e11) {
            if (!ERROR_SERVICE_NOT_AVAILABLE.equals(e11.getMessage()) && !ERROR_INTERNAL_SERVER_ERROR.equals(e11.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e11.getMessage())) {
                if (e11.getMessage() != null) {
                    throw e11;
                }
                Log.e(Constants.TAG, "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e(Constants.TAG, "Topic operation failed: " + e11.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    public void scheduleSyncTaskWithDelaySeconds(Runnable runnable, long j11) {
        this.syncExecutor.schedule(runnable, j11, TimeUnit.SECONDS);
    }

    @VisibleForTesting
    public Task<Void> scheduleTopicOperation(TopicOperation topicOperation) {
        this.store.addTopicOperation(topicOperation);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        addToPendingOperations(topicOperation, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public void syncWithDelaySecondsInternal(long j11) {
        scheduleSyncTaskWithDelaySeconds(new TopicsSyncTask(this, this.context, this.metadata, Math.min(Math.max(30L, 2 * j11), MAX_DELAY_SEC)), j11);
        setSyncScheduledOrRunning(true);
    }

    private TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.firebaseMessaging = firebaseMessaging;
        this.metadata = metadata;
        this.store = topicsStore;
        this.rpc = gmsRpc;
        this.context = context;
        this.syncExecutor = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ TopicsSubscriber m13807a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        return new TopicsSubscriber(firebaseMessaging, metadata, TopicsStore.getInstance(context, scheduledExecutorService), gmsRpc, context, scheduledExecutorService);
    }

    private void startSync() {
        if (!isSyncScheduledOrRunning()) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    public void startTopicsSyncIfNecessary() {
        if (hasPendingOperation()) {
            startSync();
        }
    }

    public Task<Void> subscribeToTopic(String str) {
        Task<Void> taskScheduleTopicOperation = scheduleTopicOperation(TopicOperation.subscribe(str));
        startTopicsSyncIfNecessary();
        return taskScheduleTopicOperation;
    }

    public Task<Void> unsubscribeFromTopic(String str) {
        Task<Void> taskScheduleTopicOperation = scheduleTopicOperation(TopicOperation.unsubscribe(str));
        startTopicsSyncIfNecessary();
        return taskScheduleTopicOperation;
    }
}
