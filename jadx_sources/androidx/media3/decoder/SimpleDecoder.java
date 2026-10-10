package androidx.media3.decoder;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;

    @Nullable
    private I dequeuedInputBuffer;

    @Nullable
    private E exception;
    private boolean flushed;
    private final Object lock = new Object();
    private long outputStartTimeUs = C2711C.TIME_UNSET;
    private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    private boolean decode() throws InterruptedException {
        E e11;
        synchronized (this.lock) {
            while (!this.released && !canDecodeBuffer()) {
                try {
                    this.lock.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.released) {
                return false;
            }
            I iRemoveFirst = this.queuedInputBuffers.removeFirst();
            O[] oArr = this.availableOutputBuffers;
            int i11 = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i11;
            O o11 = oArr[i11];
            boolean z11 = this.flushed;
            this.flushed = false;
            if (iRemoveFirst.isEndOfStream()) {
                o11.addFlag(4);
            } else {
                o11.timeUs = iRemoveFirst.timeUs;
                if (iRemoveFirst.isFirstSample()) {
                    o11.addFlag(C2711C.BUFFER_FLAG_FIRST_SAMPLE);
                }
                if (!isAtLeastOutputStartTimeUs(iRemoveFirst.timeUs)) {
                    o11.shouldBeSkipped = true;
                }
                try {
                    e11 = (E) decode(iRemoveFirst, o11, z11);
                } catch (OutOfMemoryError e12) {
                    e11 = (E) createUnexpectedDecodeException(e12);
                } catch (RuntimeException e13) {
                    e11 = (E) createUnexpectedDecodeException(e13);
                }
                if (e11 != null) {
                    synchronized (this.lock) {
                        this.exception = e11;
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        o11.release();
                    } else if (o11.shouldBeSkipped) {
                        this.skippedOutputBufferCount++;
                        o11.release();
                    } else {
                        o11.skippedOutputBufferCount = this.skippedOutputBufferCount;
                        this.skippedOutputBufferCount = 0;
                        this.queuedOutputBuffers.addLast(o11);
                    }
                    releaseInputBufferInternal(iRemoveFirst);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    public abstract I createInputBuffer();

    public abstract O createOutputBuffer();

    public abstract E createUnexpectedDecodeException(Throwable th2);

    @Nullable
    public abstract E decode(I i11, O o11, boolean z11);

    private boolean canDecodeBuffer() {
        return !this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends androidx.media3.decoder.DecoderException */
    private void maybeThrowException() throws E, DecoderException {
        E e11 = this.exception;
        if (e11 != null) {
            throw e11;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    @Nullable
    public final I dequeueInputBuffer() throws DecoderException {
        I i11;
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkState(this.dequeuedInputBuffer == null);
            int i12 = this.availableInputBufferCount;
            if (i12 == 0) {
                i11 = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i13 = i12 - 1;
                this.availableInputBufferCount = i13;
                i11 = iArr[i13];
            }
            this.dequeuedInputBuffer = i11;
        }
        return i11;
    }

    @Override // androidx.media3.decoder.Decoder
    @Nullable
    public final O dequeueOutputBuffer() throws DecoderException {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return this.queuedOutputBuffers.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                this.skippedOutputBufferCount = 0;
                I i11 = this.dequeuedInputBuffer;
                if (i11 != null) {
                    releaseInputBufferInternal(i11);
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    releaseInputBufferInternal(this.queuedInputBuffers.removeFirst());
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    this.queuedOutputBuffers.removeFirst().release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isAtLeastOutputStartTimeUs(long j11) {
        boolean z11;
        synchronized (this.lock) {
            long j12 = this.outputStartTimeUs;
            z11 = j12 == C2711C.TIME_UNSET || j11 >= j12;
        }
        return z11;
    }

    @Override // androidx.media3.decoder.Decoder
    public final void queueInputBuffer(I i11) throws DecoderException {
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkArgument(i11 == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i11);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    @CallSuper
    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @CallSuper
    public void releaseOutputBuffer(O o11) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o11);
            maybeNotifyDecodeLoop();
        }
    }

    public final void setInitialInputBufferSize(int i11) {
        Assertions.checkState(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (I i12 : this.availableInputBuffers) {
            i12.ensureSpaceForWrite(i11);
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setOutputStartTimeUs(long j11) {
        synchronized (this.lock) {
            try {
                Assertions.checkState(this.availableInputBufferCount == this.availableInputBuffers.length || this.flushed);
                this.outputStartTimeUs = j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i11 = 0; i11 < this.availableInputBufferCount; i11++) {
            ((I[]) this.availableInputBuffers)[i11] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i12 = 0; i12 < this.availableOutputBufferCount; i12++) {
            ((O[]) this.availableOutputBuffers)[i12] = createOutputBuffer();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: androidx.media3.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SimpleDecoder.this.run();
            }
        };
        this.decodeThread = thread;
        thread.start();
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    private void releaseInputBufferInternal(I i11) {
        i11.clear();
        I[] iArr = this.availableInputBuffers;
        int i12 = this.availableInputBufferCount;
        this.availableInputBufferCount = i12 + 1;
        iArr[i12] = i11;
    }

    private void releaseOutputBufferInternal(O o11) {
        o11.clear();
        O[] oArr = this.availableOutputBuffers;
        int i11 = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i11 + 1;
        oArr[i11] = o11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e11) {
                throw new IllegalStateException(e11);
            }
        } while (decode());
    }
}
