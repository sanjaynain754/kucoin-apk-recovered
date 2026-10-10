package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.annotation.IntRange;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
class InputBufferImpl implements InputBuffer {
    private final int mBufferIndex;
    private final ByteBuffer mByteBuffer;
    private final MediaCodec mMediaCodec;
    private final CallbackToFutureAdapter.Completer<Void> mTerminationCompleter;
    private final ListenableFuture<Void> mTerminationFuture;
    private final AtomicBoolean mTerminated = new AtomicBoolean(false);
    private long mPresentationTimeUs = 0;
    private boolean mIsEndOfStream = false;

    private void throwIfTerminated() {
        if (this.mTerminated.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean cancel() {
        if (this.mTerminated.getAndSet(true)) {
            return false;
        }
        try {
            this.mMediaCodec.queueInputBuffer(this.mBufferIndex, 0, 0, 0L, 0);
            this.mTerminationCompleter.set(null);
        } catch (IllegalStateException e11) {
            this.mTerminationCompleter.setException(e11);
        }
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public ListenableFuture<Void> getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean submit() {
        if (this.mTerminated.getAndSet(true)) {
            return false;
        }
        try {
            this.mMediaCodec.queueInputBuffer(this.mBufferIndex, this.mByteBuffer.position(), this.mByteBuffer.limit(), this.mPresentationTimeUs, this.mIsEndOfStream ? 4 : 0);
            this.mTerminationCompleter.set(null);
            return true;
        } catch (IllegalStateException e11) {
            this.mTerminationCompleter.setException(e11);
            return false;
        }
    }

    public InputBufferImpl(MediaCodec mediaCodec, @IntRange(from = 0) int i11) throws MediaCodec.CodecException {
        this.mMediaCodec = (MediaCodec) Preconditions.checkNotNull(mediaCodec);
        this.mBufferIndex = Preconditions.checkArgumentNonnegative(i11);
        this.mByteBuffer = mediaCodec.getInputBuffer(i11);
        final AtomicReference atomicReference = new AtomicReference();
        this.mTerminationFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.r0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return InputBufferImpl.m2222a(atomicReference, completer);
            }
        });
        this.mTerminationCompleter = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m2222a(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return "Terminate InputBuffer";
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public ByteBuffer getByteBuffer() {
        throwIfTerminated();
        return this.mByteBuffer;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setEndOfStream(boolean z11) {
        throwIfTerminated();
        this.mIsEndOfStream = z11;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setPresentationTimeUs(long j11) {
        boolean z11;
        throwIfTerminated();
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        this.mPresentationTimeUs = j11;
    }
}
