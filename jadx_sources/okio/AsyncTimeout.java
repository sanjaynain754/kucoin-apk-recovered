package okio;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\fH\u0014J%\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m90084d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "()V", "inQueue", "", "next", "timeoutAt", "", "access$newTimeoutException", "Ljava/io/IOException;", "cause", "enter", "", "exit", "newTimeoutException", "remainingNanos", "now", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "timedOut", "withTimeout", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "Watchdog", "okio"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public class AsyncTimeout extends Timeout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @NotNull
    private static final Condition condition;

    @Nullable
    private static AsyncTimeout head;

    @NotNull
    private static final ReentrantLock lock;
    private boolean inQueue;

    @Nullable
    private AsyncTimeout next;
    private long timeoutAt;

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lokio/AsyncTimeout$Companion;", "", "()V", "IDLE_TIMEOUT_MILLIS", "", "IDLE_TIMEOUT_NANOS", "TIMEOUT_WRITE_SIZE", "", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", TtmlNode.TAG_HEAD, "Lokio/AsyncTimeout;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "awaitTimeout", "awaitTimeout$okio", "cancelScheduledTimeout", "", "node", "scheduleTimeout", "", "timeoutNanos", "hasDeadline", "okio"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean cancelScheduledTimeout(AsyncTimeout node) {
            ReentrantLock lock = AsyncTimeout.INSTANCE.getLock();
            lock.lock();
            try {
                if (!node.inQueue) {
                    return false;
                }
                node.inQueue = false;
                for (AsyncTimeout asyncTimeout = AsyncTimeout.head; asyncTimeout != null; asyncTimeout = asyncTimeout.next) {
                    if (asyncTimeout.next == node) {
                        asyncTimeout.next = node.next;
                        node.next = null;
                        return false;
                    }
                }
                return true;
            } finally {
                lock.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void scheduleTimeout(AsyncTimeout node, long timeoutNanos, boolean hasDeadline) {
            ReentrantLock lock = AsyncTimeout.INSTANCE.getLock();
            lock.lock();
            try {
                if (node.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                node.inQueue = true;
                if (AsyncTimeout.head == null) {
                    AsyncTimeout.head = new AsyncTimeout();
                    new Watchdog().start();
                }
                long jNanoTime = System.nanoTime();
                if (timeoutNanos != 0 && hasDeadline) {
                    node.timeoutAt = Math.min(timeoutNanos, node.deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (timeoutNanos != 0) {
                    node.timeoutAt = timeoutNanos + jNanoTime;
                } else {
                    if (!hasDeadline) {
                        throw new AssertionError();
                    }
                    node.timeoutAt = node.deadlineNanoTime();
                }
                long jRemainingNanos = node.remainingNanos(jNanoTime);
                AsyncTimeout asyncTimeout = AsyncTimeout.head;
                Intrinsics.checkNotNull(asyncTimeout);
                while (asyncTimeout.next != null) {
                    AsyncTimeout asyncTimeout2 = asyncTimeout.next;
                    Intrinsics.checkNotNull(asyncTimeout2);
                    if (jRemainingNanos < asyncTimeout2.remainingNanos(jNanoTime)) {
                        break;
                    }
                    asyncTimeout = asyncTimeout.next;
                    Intrinsics.checkNotNull(asyncTimeout);
                }
                node.next = asyncTimeout.next;
                asyncTimeout.next = node;
                if (asyncTimeout == AsyncTimeout.head) {
                    AsyncTimeout.INSTANCE.getCondition().signal();
                }
                Unit unit = Unit.INSTANCE;
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }

        @Nullable
        public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            Intrinsics.checkNotNull(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 != null) {
                long jRemainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
                if (jRemainingNanos <= 0) {
                    AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                    Intrinsics.checkNotNull(asyncTimeout3);
                    asyncTimeout3.next = asyncTimeout2.next;
                    asyncTimeout2.next = null;
                    return asyncTimeout2;
                }
                getCondition().await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            long jNanoTime = System.nanoTime();
            getCondition().await(AsyncTimeout.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            Intrinsics.checkNotNull(asyncTimeout4);
            if (asyncTimeout4.next == null && System.nanoTime() - jNanoTime >= AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                return AsyncTimeout.head;
            }
            return null;
        }

        @NotNull
        public final Condition getCondition() {
            return AsyncTimeout.condition;
        }

        @NotNull
        public final ReentrantLock getLock() {
            return AsyncTimeout.lock;
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m90084d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "()V", "run", "", "okio"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Companion companion = AsyncTimeout.INSTANCE;
                    ReentrantLock lock = companion.getLock();
                    lock.lock();
                    try {
                        AsyncTimeout asyncTimeoutAwaitTimeout$okio = companion.awaitTimeout$okio();
                        if (asyncTimeoutAwaitTimeout$okio == AsyncTimeout.head) {
                            AsyncTimeout.head = null;
                            lock.unlock();
                            return;
                        } else {
                            Unit unit = Unit.INSTANCE;
                            lock.unlock();
                            if (asyncTimeoutAwaitTimeout$okio != null) {
                                asyncTimeoutAwaitTimeout$okio.timedOut();
                            }
                        }
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    public final boolean exit() {
        return INSTANCE.cancelScheduledTimeout(this);
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T tInvoke = block.invoke();
                InlineMarker.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                InlineMarker.finallyEnd(1);
                return tInvoke;
            } catch (IOException e11) {
                if (exit()) {
                    throw access$newTimeoutException(e11);
                }
                throw e11;
            }
        } catch (Throwable th2) {
            InlineMarker.finallyStart(1);
            exit();
            InlineMarker.finallyEnd(1);
            throw th2;
        }
    }

    @PublishedApi
    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException cause) {
        return newTimeoutException(cause);
    }

    public final void enter() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            INSTANCE.scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    @NotNull
    public final Sink sink(@NotNull final Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new Sink() { // from class: okio.AsyncTimeout.sink.1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    try {
                        sink2.close();
                        Unit unit = Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e11) {
                        if (!asyncTimeout.exit()) {
                            throw e11;
                        }
                        throw asyncTimeout.access$newTimeoutException(e11);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    try {
                        sink2.flush();
                        Unit unit = Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e11) {
                        if (!asyncTimeout.exit()) {
                            throw e11;
                        }
                        throw asyncTimeout.access$newTimeoutException(e11);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @Override // okio.Sink
            @NotNull
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public AsyncTimeout getThis$0() {
                return AsyncTimeout.this;
            }

            @NotNull
            public String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }

            @Override // okio.Sink
            public void write(@NotNull Buffer source, long byteCount) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
                while (true) {
                    long j11 = 0;
                    if (byteCount > 0) {
                        Segment segment = source.head;
                        Intrinsics.checkNotNull(segment);
                        while (j11 < 65536) {
                            j11 += (long) (segment.limit - segment.pos);
                            if (j11 >= byteCount) {
                                j11 = byteCount;
                                break;
                            } else {
                                segment = segment.next;
                                Intrinsics.checkNotNull(segment);
                            }
                        }
                        AsyncTimeout asyncTimeout = AsyncTimeout.this;
                        Sink sink2 = sink;
                        asyncTimeout.enter();
                        try {
                            try {
                                sink2.write(source, j11);
                                Unit unit = Unit.INSTANCE;
                                if (!asyncTimeout.exit()) {
                                    byteCount -= j11;
                                } else {
                                    throw asyncTimeout.access$newTimeoutException(null);
                                }
                            } catch (IOException e11) {
                                if (!asyncTimeout.exit()) {
                                    throw e11;
                                }
                                throw asyncTimeout.access$newTimeoutException(e11);
                            }
                        } catch (Throwable th2) {
                            asyncTimeout.exit();
                            throw th2;
                        }
                    } else {
                        return;
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull final Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new Source() { // from class: okio.AsyncTimeout.source.1
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Source source2 = source;
                asyncTimeout.enter();
                try {
                    try {
                        source2.close();
                        Unit unit = Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e11) {
                        if (!asyncTimeout.exit()) {
                            throw e11;
                        }
                        throw asyncTimeout.access$newTimeoutException(e11);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }

            @Override // okio.Source
            @NotNull
            /* JADX INFO: renamed from: timeout, reason: from getter */
            public AsyncTimeout getThis$0() {
                return AsyncTimeout.this;
            }

            @NotNull
            public String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }

            @Override // okio.Source
            public long read(@NotNull Buffer sink, long byteCount) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Source source2 = source;
                asyncTimeout.enter();
                try {
                    try {
                        long j11 = source2.read(sink, byteCount);
                        if (!asyncTimeout.exit()) {
                            return j11;
                        }
                        throw asyncTimeout.access$newTimeoutException(null);
                    } catch (IOException e11) {
                        if (!asyncTimeout.exit()) {
                            throw e11;
                        }
                        throw asyncTimeout.access$newTimeoutException(e11);
                    }
                } catch (Throwable th2) {
                    asyncTimeout.exit();
                    throw th2;
                }
            }
        };
    }

    public void timedOut() {
    }
}
