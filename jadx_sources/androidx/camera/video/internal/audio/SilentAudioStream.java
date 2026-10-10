package androidx.camera.video.internal.audio;

import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public class SilentAudioStream implements AudioStream {
    private static final String TAG = "SilentAudioStream";
    private AudioStream.AudioStreamCallback mAudioStreamCallback;
    private final int mBytesPerFrame;
    private Executor mCallbackExecutor;
    private long mCurrentReadTimeNs;
    private final int mSampleRate;
    private byte[] mZeroBytes;
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    private void notifySilenced() {
        final AudioStream.AudioStreamCallback audioStreamCallback = this.mAudioStreamCallback;
        Executor executor = this.mCallbackExecutor;
        if (audioStreamCallback == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.u
            @Override // java.lang.Runnable
            public final void run() {
                audioStreamCallback.onSilenceStateChanged(true);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        this.mIsReleased.getAndSet(true);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(AudioStream.AudioStreamCallback audioStreamCallback, Executor executor) {
        boolean z11 = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "executor can't be null with non-null callback.");
        this.mAudioStreamCallback = audioStreamCallback;
        this.mCallbackExecutor = executor;
    }

    public SilentAudioStream(AudioSettings audioSettings) {
        this.mBytesPerFrame = audioSettings.getBytesPerFrame();
        this.mSampleRate = audioSettings.getCaptureSampleRate();
    }

    private static void blockUntilSystemTimeReached(long j11) {
        long jCurrentSystemTimeNs = j11 - currentSystemTimeNs();
        if (jCurrentSystemTimeNs > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jCurrentSystemTimeNs));
            } catch (InterruptedException e11) {
                Logger.m1873w(TAG, "Ignore interruption", e11);
            }
        }
    }

    private static long currentSystemTimeNs() {
        return System.nanoTime();
    }

    private void writeSilenceToBuffer(ByteBuffer byteBuffer, int i11) {
        boolean z11;
        if (i11 <= byteBuffer.remaining()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
        byte[] bArr = this.mZeroBytes;
        if (bArr == null || bArr.length < i11) {
            this.mZeroBytes = new byte[i11];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.mZeroBytes, 0, i11).limit(i11 + iPosition).position(iPosition);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public AudioStream.PacketInfo read(ByteBuffer byteBuffer) {
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        long jSizeToFrameCount = AudioUtils.sizeToFrameCount(byteBuffer.remaining(), this.mBytesPerFrame);
        int iFrameCountToSize = (int) AudioUtils.frameCountToSize(jSizeToFrameCount, this.mBytesPerFrame);
        if (iFrameCountToSize <= 0) {
            return AudioStream.PacketInfo.m2171of(0, this.mCurrentReadTimeNs);
        }
        long jFrameCountToDurationNs = this.mCurrentReadTimeNs + AudioUtils.frameCountToDurationNs(jSizeToFrameCount, this.mSampleRate);
        blockUntilSystemTimeReached(jFrameCountToDurationNs);
        writeSilenceToBuffer(byteBuffer, iFrameCountToSize);
        AudioStream.PacketInfo packetInfoM2171of = AudioStream.PacketInfo.m2171of(iFrameCountToSize, this.mCurrentReadTimeNs);
        this.mCurrentReadTimeNs = jFrameCountToDurationNs;
        return packetInfoM2171of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        this.mCurrentReadTimeNs = currentSystemTimeNs();
        notifySilenced();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        checkNotReleasedOrThrow();
        this.mIsStarted.set(false);
    }
}
