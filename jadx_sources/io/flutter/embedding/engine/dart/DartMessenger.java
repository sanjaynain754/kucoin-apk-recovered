package io.flutter.embedding.engine.dart;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.util.TraceSection;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
class DartMessenger implements BinaryMessenger, PlatformMessageHandler {
    private static final String TAG = "DartMessenger";

    @NonNull
    private Map<String, List<BufferedMessageInfo>> bufferedMessages;

    @NonNull
    private WeakHashMap<BinaryMessenger.TaskQueue, DartMessengerTaskQueue> createdTaskQueues;

    @NonNull
    private final AtomicBoolean enableBufferingIncomingMessages;

    @NonNull
    private final FlutterJNI flutterJNI;

    @NonNull
    private final Object handlersLock;

    @NonNull
    private final Map<String, HandlerInfo> messageHandlers;
    private int nextReplyId;

    @NonNull
    private final Map<Integer, BinaryMessenger.BinaryReply> pendingReplies;

    @NonNull
    private final DartMessengerTaskQueue platformTaskQueue;

    @NonNull
    private TaskQueueFactory taskQueueFactory;

    /* JADX INFO: loaded from: classes60.dex */
    public static class ConcurrentTaskQueue implements DartMessengerTaskQueue {

        @NonNull
        private final ExecutorService executor;

        @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
        public void dispatch(@NonNull Runnable runnable) {
            this.executor.execute(runnable);
        }

        public ConcurrentTaskQueue(ExecutorService executorService) {
            this.executor = executorService;
        }
    }

    public interface DartMessengerTaskQueue {
        void dispatch(@NonNull Runnable runnable);
    }

    public static class Reply implements BinaryMessenger.BinaryReply {
        private final AtomicBoolean done = new AtomicBoolean(false);

        @NonNull
        private final FlutterJNI flutterJNI;
        private final int replyId;

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(@Nullable ByteBuffer byteBuffer) throws Throwable {
            if (this.done.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.flutterJNI.invokePlatformMessageEmptyResponseCallback(this.replyId);
            } else {
                this.flutterJNI.invokePlatformMessageResponseCallback(this.replyId, byteBuffer, byteBuffer.position());
            }
        }

        public Reply(@NonNull FlutterJNI flutterJNI, int i11) {
            this.flutterJNI = flutterJNI;
            this.replyId = i11;
        }
    }

    public static class SerialTaskQueue implements DartMessengerTaskQueue {

        @NonNull
        private final ExecutorService executor;

        @NonNull
        private final ConcurrentLinkedQueue<Runnable> queue = new ConcurrentLinkedQueue<>();

        @NonNull
        private final AtomicBoolean isRunning = new AtomicBoolean(false);

        /* JADX INFO: Access modifiers changed from: private */
        public void flush() {
            if (this.isRunning.compareAndSet(false, true)) {
                try {
                    Runnable runnablePoll = this.queue.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    }
                } finally {
                    this.isRunning.set(false);
                    if (!this.queue.isEmpty()) {
                        this.executor.execute(new Runnable() { // from class: io.flutter.embedding.engine.dart.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f86753b.flush();
                            }
                        });
                    }
                }
            }
        }

        @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
        public void dispatch(@NonNull Runnable runnable) {
            this.queue.add(runnable);
            this.executor.execute(new Runnable() { // from class: io.flutter.embedding.engine.dart.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86752b.flush();
                }
            });
        }

        public SerialTaskQueue(ExecutorService executorService) {
            this.executor = executorService;
        }
    }

    public interface TaskQueueFactory {
        DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions);
    }

    public static class TaskQueueToken implements BinaryMessenger.TaskQueue {
        private TaskQueueToken() {
        }
    }

    public DartMessenger(@NonNull FlutterJNI flutterJNI, @NonNull TaskQueueFactory taskQueueFactory) {
        this.messageHandlers = new HashMap();
        this.bufferedMessages = new HashMap();
        this.handlersLock = new Object();
        this.enableBufferingIncomingMessages = new AtomicBoolean(false);
        this.pendingReplies = new HashMap();
        this.nextReplyId = 1;
        this.platformTaskQueue = new PlatformTaskQueue();
        this.createdTaskQueues = new WeakHashMap<>();
        this.flutterJNI = flutterJNI;
        this.taskQueueFactory = taskQueueFactory;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @UiThread
    public void send(@NonNull String str, @NonNull ByteBuffer byteBuffer) {
        Log.m87481v(TAG, "Sending message over channel '" + str + "'");
        send(str, byteBuffer, null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void setMessageHandler(@NonNull String str, @Nullable BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        setMessageHandler(str, binaryMessageHandler, null);
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class BufferedMessageInfo {

        @NonNull
        public final ByteBuffer message;
        long messageData;
        int replyId;

        public BufferedMessageInfo(@NonNull ByteBuffer byteBuffer, int i11, long j11) {
            this.message = byteBuffer;
            this.replyId = i11;
            this.messageData = j11;
        }
    }

    public static class DefaultTaskQueueFactory implements TaskQueueFactory {
        ExecutorService executorService = FlutterInjector.instance().executorService();

        @Override // io.flutter.embedding.engine.dart.DartMessenger.TaskQueueFactory
        public DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
            if (taskQueueOptions.getIsSerial()) {
                return new SerialTaskQueue(this.executorService);
            }
            return new ConcurrentTaskQueue(this.executorService);
        }
    }

    public static class HandlerInfo {

        @NonNull
        public final BinaryMessenger.BinaryMessageHandler handler;

        @Nullable
        public final DartMessengerTaskQueue taskQueue;

        public HandlerInfo(@NonNull BinaryMessenger.BinaryMessageHandler binaryMessageHandler, @Nullable DartMessengerTaskQueue dartMessengerTaskQueue) {
            this.handler = binaryMessageHandler;
            this.taskQueue = dartMessengerTaskQueue;
        }
    }

    private void dispatchMessageToQueue(@NonNull final String str, @Nullable final HandlerInfo handlerInfo, @Nullable final ByteBuffer byteBuffer, final int i11, final long j11) {
        DartMessengerTaskQueue dartMessengerTaskQueue = handlerInfo != null ? handlerInfo.taskQueue : null;
        TraceSection.beginAsyncSection("PlatformChannel ScheduleHandler on " + str, i11);
        Runnable runnable = new Runnable() { // from class: io.flutter.embedding.engine.dart.a
            @Override // java.lang.Runnable
            public final void run() {
                DartMessenger.m87499a(this.f86746b, str, i11, handlerInfo, byteBuffer, j11);
            }
        };
        if (dartMessengerTaskQueue == null) {
            dartMessengerTaskQueue = this.platformTaskQueue;
        }
        dartMessengerTaskQueue.dispatch(runnable);
    }

    private void invokeHandler(@Nullable HandlerInfo handlerInfo, @Nullable ByteBuffer byteBuffer, int i11) {
        if (handlerInfo == null) {
            Log.m87481v(TAG, "No registered handler for message. Responding to Dart with empty reply message.");
            this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i11);
            return;
        }
        try {
            Log.m87481v(TAG, "Deferring to registered handler to process message.");
            handlerInfo.handler.onMessage(byteBuffer, new Reply(this.flutterJNI, i11));
        } catch (Error e11) {
            handleError(e11);
        } catch (Exception e12) {
            Log.m87478e(TAG, "Uncaught exception in binary message listener", e12);
            this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i11);
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void disableBufferingIncomingMessages() {
        Map<String, List<BufferedMessageInfo>> map;
        synchronized (this.handlersLock) {
            this.enableBufferingIncomingMessages.set(false);
            map = this.bufferedMessages;
            this.bufferedMessages = new HashMap();
        }
        for (Map.Entry<String, List<BufferedMessageInfo>> entry : map.entrySet()) {
            for (BufferedMessageInfo bufferedMessageInfo : entry.getValue()) {
                dispatchMessageToQueue(entry.getKey(), null, bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
            }
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void enableBufferingIncomingMessages() {
        this.enableBufferingIncomingMessages.set(true);
    }

    @UiThread
    public int getPendingChannelResponseCount() {
        return this.pendingReplies.size();
    }

    @Override // io.flutter.embedding.engine.dart.PlatformMessageHandler
    public void handleMessageFromDart(@NonNull String str, @Nullable ByteBuffer byteBuffer, int i11, long j11) {
        HandlerInfo handlerInfo;
        boolean z11;
        Log.m87481v(TAG, "Received message from Dart over channel '" + str + "'");
        synchronized (this.handlersLock) {
            try {
                handlerInfo = this.messageHandlers.get(str);
                z11 = this.enableBufferingIncomingMessages.get() && handlerInfo == null;
                if (z11) {
                    if (!this.bufferedMessages.containsKey(str)) {
                        this.bufferedMessages.put(str, new LinkedList());
                    }
                    this.bufferedMessages.get(str).add(new BufferedMessageInfo(byteBuffer, i11, j11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            return;
        }
        dispatchMessageToQueue(str, handlerInfo, byteBuffer, i11, j11);
    }

    @Override // io.flutter.embedding.engine.dart.PlatformMessageHandler
    public void handlePlatformMessageResponse(int i11, @Nullable ByteBuffer byteBuffer) {
        Log.m87481v(TAG, "Received message reply from Dart.");
        BinaryMessenger.BinaryReply binaryReplyRemove = this.pendingReplies.remove(Integer.valueOf(i11));
        if (binaryReplyRemove != null) {
            try {
                Log.m87481v(TAG, "Invoking registered callback for reply from Dart.");
                binaryReplyRemove.reply(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e11) {
                handleError(e11);
            } catch (Exception e12) {
                Log.m87478e(TAG, "Uncaught exception in binary message reply handler", e12);
            }
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        DartMessengerTaskQueue dartMessengerTaskQueueMakeBackgroundTaskQueue = this.taskQueueFactory.makeBackgroundTaskQueue(taskQueueOptions);
        TaskQueueToken taskQueueToken = new TaskQueueToken();
        this.createdTaskQueues.put(taskQueueToken, dartMessengerTaskQueueMakeBackgroundTaskQueue);
        return taskQueueToken;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void setMessageHandler(@NonNull String str, @Nullable BinaryMessenger.BinaryMessageHandler binaryMessageHandler, @Nullable BinaryMessenger.TaskQueue taskQueue) {
        DartMessengerTaskQueue dartMessengerTaskQueue;
        if (binaryMessageHandler == null) {
            Log.m87481v(TAG, "Removing handler for channel '" + str + "'");
            synchronized (this.handlersLock) {
                this.messageHandlers.remove(str);
            }
            return;
        }
        if (taskQueue != null) {
            dartMessengerTaskQueue = this.createdTaskQueues.get(taskQueue);
            if (dartMessengerTaskQueue == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dartMessengerTaskQueue = null;
        }
        Log.m87481v(TAG, "Setting handler for channel '" + str + "'");
        synchronized (this.handlersLock) {
            try {
                this.messageHandlers.put(str, new HandlerInfo(binaryMessageHandler, dartMessengerTaskQueue));
                List<BufferedMessageInfo> listRemove = this.bufferedMessages.remove(str);
                if (listRemove == null) {
                    return;
                }
                for (BufferedMessageInfo bufferedMessageInfo : listRemove) {
                    dispatchMessageToQueue(str, this.messageHandlers.get(str), bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m87499a(DartMessenger dartMessenger, String str, int i11, HandlerInfo handlerInfo, ByteBuffer byteBuffer, long j11) {
        dartMessenger.getClass();
        TraceSection.endAsyncSection("PlatformChannel ScheduleHandler on " + str, i11);
        try {
            TraceSection traceSectionScoped = TraceSection.scoped("DartMessenger#handleMessageFromDart on " + str);
            try {
                dartMessenger.invokeHandler(handlerInfo, byteBuffer, i11);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (traceSectionScoped != null) {
                    traceSectionScoped.close();
                }
                dartMessenger.flutterJNI.cleanupMessageData(j11);
            } catch (Throwable th2) {
                if (traceSectionScoped != null) {
                    try {
                        traceSectionScoped.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            dartMessenger.flutterJNI.cleanupMessageData(j11);
            throw th4;
        }
    }

    private static void handleError(Error error) {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread.getUncaughtExceptionHandler() != null) {
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, error);
            return;
        }
        throw error;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void send(@NonNull String str, @Nullable ByteBuffer byteBuffer, @Nullable BinaryMessenger.BinaryReply binaryReply) {
        TraceSection traceSectionScoped = TraceSection.scoped("DartMessenger#send on " + str);
        try {
            Log.m87481v(TAG, "Sending message with callback over channel '" + str + "'");
            int i11 = this.nextReplyId;
            this.nextReplyId = i11 + 1;
            if (binaryReply != null) {
                this.pendingReplies.put(Integer.valueOf(i11), binaryReply);
            }
            if (byteBuffer == null) {
                this.flutterJNI.dispatchEmptyPlatformMessage(str, i11);
            } else {
                this.flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i11);
            }
            if (traceSectionScoped != null) {
                traceSectionScoped.close();
            }
        } catch (Throwable th2) {
            if (traceSectionScoped != null) {
                try {
                    traceSectionScoped.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public DartMessenger(@NonNull FlutterJNI flutterJNI) {
        this(flutterJNI, new DefaultTaskQueueFactory());
    }
}
