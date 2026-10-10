package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import androidx.annotation.GuardedBy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public class BufferedAudioStream implements AudioStream {
    private static final int DATA_WAITING_TIME_MILLIS = 1;
    private static final int DEFAULT_BUFFER_SIZE_IN_FRAME = 1024;
    private static final int DEFAULT_QUEUE_SIZE = 500;
    private static final String TAG = "BufferedAudioStream";
    private final AudioStream mAudioStream;
    private int mBufferSize;
    private final int mBytesPerFrame;
    private final int mQueueMaxSize;
    private final int mSampleRate;
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);

    @GuardedBy("mLock")
    private final Queue<AudioData> mAudioDataQueue = new ConcurrentLinkedQueue();
    private final Executor mProducerExecutor = CameraXExecutors.newSequentialExecutor(CameraXExecutors.audioExecutor());
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private AudioData mAudioDataNotFullyRead = null;
    private final AtomicBoolean mIsCollectingAudioData = new AtomicBoolean(false);

    public static class AudioData {
        private final ByteBuffer mByteBuffer;
        private final int mBytesPerFrame;
        private final int mSampleRate;
        private long mTimestampNs;

        public int getRemainingBufferSizeInBytes() {
            return this.mByteBuffer.remaining();
        }

        public AudioStream.PacketInfo read(ByteBuffer byteBuffer) {
            int iRemaining;
            long j11 = this.mTimestampNs;
            int iPosition = this.mByteBuffer.position();
            int iPosition2 = byteBuffer.position();
            if (this.mByteBuffer.remaining() > byteBuffer.remaining()) {
                iRemaining = byteBuffer.remaining();
                this.mTimestampNs += AudioUtils.frameCountToDurationNs(AudioUtils.sizeToFrameCount(iRemaining, this.mBytesPerFrame), this.mSampleRate);
                ByteBuffer byteBufferDuplicate = this.mByteBuffer.duplicate();
                byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
            } else {
                iRemaining = this.mByteBuffer.remaining();
                byteBuffer.put(this.mByteBuffer).limit(iPosition2 + iRemaining).position(iPosition2);
            }
            this.mByteBuffer.position(iPosition + iRemaining);
            return AudioStream.PacketInfo.m2171of(iRemaining, j11);
        }

        public AudioData(ByteBuffer byteBuffer, AudioStream.PacketInfo packetInfo, int i11, int i12) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit == packetInfo.getSizeInBytes()) {
                this.mBytesPerFrame = i11;
                this.mSampleRate = i12;
                this.mByteBuffer = byteBuffer;
                this.mTimestampNs = packetInfo.getTimestampNs();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + iLimit + " != " + packetInfo.getSizeInBytes());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2173a(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.mIsCollectingAudioData.set(false);
        bufferedAudioStream.mAudioStream.stop();
        synchronized (bufferedAudioStream.mLock) {
            bufferedAudioStream.mAudioDataNotFullyRead = null;
            bufferedAudioStream.mAudioDataQueue.clear();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2175c(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.mIsCollectingAudioData.set(false);
        bufferedAudioStream.mAudioStream.release();
        synchronized (bufferedAudioStream.mLock) {
            bufferedAudioStream.mAudioDataNotFullyRead = null;
            bufferedAudioStream.mAudioDataQueue.clear();
        }
    }

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void collectAudioData() {
        if (this.mIsCollectingAudioData.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.mBufferSize);
            AudioData audioData = new AudioData(byteBufferAllocateDirect, this.mAudioStream.read(byteBufferAllocateDirect), this.mBytesPerFrame, this.mSampleRate);
            int i11 = this.mQueueMaxSize;
            synchronized (this.mLock) {
                try {
                    this.mAudioDataQueue.offer(audioData);
                    while (this.mAudioDataQueue.size() > i11) {
                        this.mAudioDataQueue.poll();
                        Logger.m1872w(TAG, "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.mIsCollectingAudioData.get()) {
                this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1999b.collectAudioData();
                    }
                });
            }
        }
    }

    private void startCollectingAudioData() {
        if (this.mIsCollectingAudioData.getAndSet(true)) {
            return;
        }
        collectAudioData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCollectionBufferSize(int i11) {
        int i12 = this.mBufferSize;
        if (i12 == i11) {
            return;
        }
        int i13 = this.mBytesPerFrame;
        this.mBufferSize = (i11 / i13) * i13;
        Logger.m1866d(TAG, "Update buffer size from " + i12 + " to " + this.mBufferSize);
    }

    private void updateCollectionBufferSizeAsync(final int i11) {
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f2000b.updateCollectionBufferSize(i11);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.t
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m2175c(this.f2002b);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(final AudioStream.AudioStreamCallback audioStreamCallback, final Executor executor) {
        boolean z11 = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "executor can't be null with non-null callback.");
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f1995b.mAudioStream.setCallback(audioStreamCallback, executor);
            }
        });
    }

    public BufferedAudioStream(AudioStream audioStream, AudioSettings audioSettings) {
        boolean z11;
        this.mAudioStream = audioStream;
        int bytesPerFrame = audioSettings.getBytesPerFrame();
        this.mBytesPerFrame = bytesPerFrame;
        int captureSampleRate = audioSettings.getCaptureSampleRate();
        this.mSampleRate = captureSampleRate;
        if (bytesPerFrame > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "mBytesPerFrame must be greater than 0.");
        Preconditions.checkArgument(((long) captureSampleRate) > 0, "mSampleRate must be greater than 0.");
        this.mQueueMaxSize = 500;
        this.mBufferSize = bytesPerFrame * 1024;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2174b(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.getClass();
        try {
            bufferedAudioStream.mAudioStream.start();
            bufferedAudioStream.startCollectingAudioData();
        } catch (AudioStream.AudioStreamException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @SuppressLint({"BanThreadSleep"})
    public AudioStream.PacketInfo read(ByteBuffer byteBuffer) {
        boolean z11;
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        updateCollectionBufferSizeAsync(byteBuffer.remaining());
        AudioStream.PacketInfo packetInfoM2171of = AudioStream.PacketInfo.m2171of(0, 0L);
        do {
            synchronized (this.mLock) {
                try {
                    AudioData audioDataPoll = this.mAudioDataNotFullyRead;
                    this.mAudioDataNotFullyRead = null;
                    if (audioDataPoll == null) {
                        audioDataPoll = this.mAudioDataQueue.poll();
                    }
                    if (audioDataPoll != null) {
                        packetInfoM2171of = audioDataPoll.read(byteBuffer);
                        if (audioDataPoll.getRemainingBufferSizeInBytes() > 0) {
                            this.mAudioDataNotFullyRead = audioDataPoll;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (packetInfoM2171of.getSizeInBytes() <= 0 && this.mIsStarted.get() && !this.mIsReleased.get()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e11) {
                    Logger.m1873w(TAG, "Interruption while waiting for audio data", e11);
                }
            }
        } while (z11);
        return packetInfoM2171of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws IllegalStateException, AudioStream.AudioStreamException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: androidx.camera.video.internal.audio.q
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m2174b(this.f1998b);
            }
        }, null);
        this.mProducerExecutor.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e11) {
            this.mIsStarted.set(false);
            throw new AudioStream.AudioStreamException(e11);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() throws IllegalStateException {
        checkNotReleasedOrThrow();
        if (!this.mIsStarted.getAndSet(false)) {
            return;
        }
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.o
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m2173a(this.f1994b);
            }
        });
    }
}
