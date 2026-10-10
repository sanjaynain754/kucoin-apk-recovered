package androidx.camera.video;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.core.util.Preconditions;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public final class Recording implements AutoCloseable {
    private final CloseGuardHelper mCloseGuard;
    private final AtomicBoolean mIsClosed;
    private final boolean mIsPersistent;
    private final OutputOptions mOutputOptions;
    private final Recorder mRecorder;
    private final long mRecordingId;

    @Override // java.lang.AutoCloseable
    public void close() throws Throwable {
        stopWithError(0, null);
    }

    public static Recording createFinalizedFrom(PendingRecording pendingRecording, long j11) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j11, pendingRecording.getOutputOptions(), pendingRecording.getIsPersistent(), true);
    }

    public static Recording from(PendingRecording pendingRecording, long j11) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j11, pendingRecording.getOutputOptions(), pendingRecording.getIsPersistent(), false);
    }

    private void stopWithError(int i11, Throwable th2) throws Throwable {
        this.mCloseGuard.close();
        if (this.mIsClosed.getAndSet(true)) {
            return;
        }
        this.mRecorder.stop(this, i11, th2);
    }

    public void finalize() throws Throwable {
        try {
            this.mCloseGuard.warnIfOpen();
            stopWithError(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    public OutputOptions getOutputOptions() {
        return this.mOutputOptions;
    }

    public long getRecordingId() {
        return this.mRecordingId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isClosed() {
        return this.mIsClosed.get();
    }

    @ExperimentalPersistentRecording
    public boolean isPersistent() {
        return this.mIsPersistent;
    }

    public void mute(boolean z11) {
        if (this.mIsClosed.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.mute(this, z11);
    }

    public void pause() {
        if (this.mIsClosed.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.pause(this);
    }

    public void resume() {
        if (this.mIsClosed.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.resume(this);
    }

    public Recording(Recorder recorder, long j11, OutputOptions outputOptions, boolean z11, boolean z12) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mIsClosed = atomicBoolean;
        CloseGuardHelper closeGuardHelperCreate = CloseGuardHelper.create();
        this.mCloseGuard = closeGuardHelperCreate;
        this.mRecorder = recorder;
        this.mRecordingId = j11;
        this.mOutputOptions = outputOptions;
        this.mIsPersistent = z11;
        if (z12) {
            atomicBoolean.set(true);
        } else {
            closeGuardHelperCreate.open(InterfaceC33730j9.f70350a);
        }
    }

    public void stop() {
        close();
    }
}
