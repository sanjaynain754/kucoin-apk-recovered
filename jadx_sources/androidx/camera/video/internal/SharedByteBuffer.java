package androidx.camera.video.internal;

import androidx.annotation.GuardedBy;
import androidx.camera.core.Logger;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes23.dex */
public final class SharedByteBuffer implements Closeable {
    private static final String TAG = "SharedByteBuffer";
    private final Object mCloseLock = new Object();

    @GuardedBy("mCloseLock")
    private boolean mClosed = false;
    private final Pair<Executor, Runnable> mFinalCloseAction;
    private final int mShareId;
    private final ByteBuffer mSharedByteBuffer;

    @GuardedBy("mCloseLock")
    private final AtomicInteger mSharedRefCount;

    @GuardedBy("mCloseLock")
    private void checkNotClosed(String str) {
        if (this.mClosed) {
            throw new IllegalStateException("Cannot call " + str + " on a closed SharedByteBuffer.");
        }
    }

    private boolean closeInternal() {
        synchronized (this.mCloseLock) {
            try {
                if (this.mClosed) {
                    return false;
                }
                this.mClosed = true;
                int iDecrementAndGet = this.mSharedRefCount.decrementAndGet();
                if (Logger.isDebugEnabled(TAG)) {
                    if (iDecrementAndGet < 0) {
                        throw new AssertionError("Invalid ref count. close() should never produce a ref count below 0");
                    }
                    Logger.m1866d(TAG, String.format(Locale.US, "Ref count decremented: %d [%s]", Integer.valueOf(iDecrementAndGet), toString()));
                }
                if (iDecrementAndGet == 0) {
                    if (Logger.isDebugEnabled(TAG)) {
                        Logger.m1866d(TAG, String.format(Locale.US, "Final reference released. Running final close action. [%s]", toString()));
                    }
                    try {
                        ((Executor) Preconditions.checkNotNull(this.mFinalCloseAction.first)).execute((Runnable) Preconditions.checkNotNull(this.mFinalCloseAction.second));
                    } catch (RejectedExecutionException e11) {
                        Logger.m1869e(TAG, String.format(Locale.US, "Unable to execute final close action. [%s]", toString()), e11);
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static SharedByteBuffer newSharedInstance(ByteBuffer byteBuffer, Executor executor, Runnable runnable) {
        return new SharedByteBuffer(((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).asReadOnlyBuffer(), new AtomicInteger(1), new Pair((Executor) Preconditions.checkNotNull(executor), (Runnable) Preconditions.checkNotNull(runnable)), System.identityHashCode(byteBuffer));
    }

    public ByteBuffer get() {
        ByteBuffer byteBuffer;
        synchronized (this.mCloseLock) {
            checkNotClosed("get()");
            byteBuffer = this.mSharedByteBuffer;
        }
        return byteBuffer;
    }

    public SharedByteBuffer share() {
        int iIncrementAndGet;
        AtomicInteger atomicInteger;
        synchronized (this.mCloseLock) {
            checkNotClosed("share()");
            iIncrementAndGet = this.mSharedRefCount.incrementAndGet();
            atomicInteger = this.mSharedRefCount;
        }
        if (Logger.isDebugEnabled(TAG)) {
            if (iIncrementAndGet <= 1) {
                throw new AssertionError("Invalid ref count. share() should always produce a ref count of 2 or more.");
            }
            Logger.m1866d(TAG, String.format(Locale.US, "Ref count incremented: %d [%s]", Integer.valueOf(iIncrementAndGet), toString()));
        }
        return new SharedByteBuffer(this.mSharedByteBuffer.asReadOnlyBuffer(), atomicInteger, this.mFinalCloseAction, this.mShareId);
    }

    public String toString() {
        return String.format(Locale.US, "SharedByteBuffer[buf: %s, shareId: 0x%x, instanceId:0x%x]", this.mSharedByteBuffer, Integer.valueOf(this.mShareId), Integer.valueOf(System.identityHashCode(this)));
    }

    private SharedByteBuffer(ByteBuffer byteBuffer, AtomicInteger atomicInteger, Pair<Executor, Runnable> pair, int i11) {
        int i12;
        this.mSharedByteBuffer = byteBuffer;
        this.mSharedRefCount = atomicInteger;
        this.mFinalCloseAction = pair;
        this.mShareId = i11;
        if (Logger.isDebugEnabled(TAG) && (i12 = atomicInteger.get()) < 1) {
            throw new AssertionError(String.format(Locale.US, "Cannot create new instance of SharedByteBuffer with invalid ref count %d. Ref count must be >= 1. [%s]", Integer.valueOf(i12), toString()));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        closeInternal();
    }

    public void finalize() throws Throwable {
        try {
            if (closeInternal()) {
                Logger.m1872w(TAG, String.format(Locale.US, "SharedByteBuffer closed by finalizer, but should have been closed manually with SharedByteBuffer.close() [%s]", toString()));
            }
        } finally {
            super.finalize();
        }
    }
}
