package androidx.media3.common.audio;

import androidx.annotation.GuardedBy;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.SpeedProviderUtil;
import androidx.media3.common.util.TimestampConsumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SpeedChangingAudioProcessor extends BaseAudioProcessor {
    private long bytesRead;

    @GuardedBy("lock")
    private float currentSpeed;
    private boolean endOfStreamQueuedToSonic;

    @GuardedBy("lock")
    private LongArray inputSegmentStartTimesUs;

    @GuardedBy("lock")
    private long lastProcessedInputTimeUs;

    @GuardedBy("lock")
    private long lastSpeedAdjustedInputTimeUs;

    @GuardedBy("lock")
    private long lastSpeedAdjustedOutputTimeUs;
    private final Object lock;

    @GuardedBy("lock")
    private LongArray outputSegmentStartTimesUs;

    @GuardedBy("lock")
    private final LongArrayQueue pendingCallbackInputTimesUs;

    @GuardedBy("lock")
    private final Queue<TimestampConsumer> pendingCallbacks;
    private final SynchronizedSonicAudioProcessor sonicAudioProcessor;

    @GuardedBy("lock")
    private long speedAdjustedTimeAsyncInputTimeUs;
    private final SpeedProvider speedProvider;

    private static double divide(long j11, long j12) {
        return j11 / j12;
    }

    private static long getSampleRateAlignedTimestamp(long j11, int i11) {
        long j12 = i11;
        return Util.scaleLargeTimestamp(Util.scaleLargeTimestamp(j11, j12, 1000000L), 1000000L, j12);
    }

    private long calculateSpeedAdjustedTime(long j11) {
        long jRound;
        int size = this.inputSegmentStartTimesUs.size() - 1;
        while (size > 0 && this.inputSegmentStartTimesUs.get(size) > j11) {
            size--;
        }
        if (size == this.inputSegmentStartTimesUs.size() - 1) {
            if (this.lastSpeedAdjustedInputTimeUs < this.inputSegmentStartTimesUs.get(size)) {
                this.lastSpeedAdjustedInputTimeUs = this.inputSegmentStartTimesUs.get(size);
                this.lastSpeedAdjustedOutputTimeUs = this.outputSegmentStartTimesUs.get(size);
            }
            jRound = getPlayoutDurationUsAtCurrentSpeed(j11 - this.lastSpeedAdjustedInputTimeUs);
        } else {
            int i11 = size + 1;
            jRound = Math.round((j11 - this.lastSpeedAdjustedInputTimeUs) * divide(this.outputSegmentStartTimesUs.get(i11) - this.outputSegmentStartTimesUs.get(size), this.inputSegmentStartTimesUs.get(i11) - this.inputSegmentStartTimesUs.get(size)));
        }
        this.lastSpeedAdjustedInputTimeUs = j11;
        long j12 = this.lastSpeedAdjustedOutputTimeUs + jRound;
        this.lastSpeedAdjustedOutputTimeUs = j12;
        return j12;
    }

    private boolean isUsingSonic() {
        boolean z11;
        synchronized (this.lock) {
            z11 = this.currentSpeed != 1.0f;
        }
        return z11;
    }

    private void processPendingCallbacks() {
        synchronized (this.lock) {
            while (!this.pendingCallbacks.isEmpty() && (this.pendingCallbackInputTimesUs.element() <= this.lastProcessedInputTimeUs || isEnded())) {
                try {
                    this.pendingCallbacks.remove().onTimestamp(calculateSpeedAdjustedTime(this.pendingCallbackInputTimesUs.remove()));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void resetState() {
        synchronized (this.lock) {
            this.inputSegmentStartTimesUs = new LongArray();
            this.outputSegmentStartTimesUs = new LongArray();
            this.inputSegmentStartTimesUs.add(0L);
            this.outputSegmentStartTimesUs.add(0L);
            this.lastProcessedInputTimeUs = 0L;
            this.lastSpeedAdjustedInputTimeUs = 0L;
            this.lastSpeedAdjustedOutputTimeUs = 0L;
            this.currentSpeed = 1.0f;
        }
        this.bytesRead = 0L;
        this.endOfStreamQueuedToSonic = false;
    }

    private void updateLastProcessedInputTime() {
        synchronized (this.lock) {
            try {
                if (isUsingSonic()) {
                    long processedInputBytes = this.sonicAudioProcessor.getProcessedInputBytes();
                    AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
                    long jScaleLargeTimestamp = Util.scaleLargeTimestamp(processedInputBytes, 1000000L, ((long) audioFormat.bytesPerFrame) * ((long) audioFormat.sampleRate));
                    LongArray longArray = this.inputSegmentStartTimesUs;
                    this.lastProcessedInputTimeUs = longArray.get(longArray.size() - 1) + jScaleLargeTimestamp;
                } else {
                    long j11 = this.bytesRead;
                    AudioProcessor.AudioFormat audioFormat2 = this.inputAudioFormat;
                    this.lastProcessedInputTimeUs = Util.scaleLargeTimestamp(j11, 1000000L, ((long) audioFormat2.bytesPerFrame) * ((long) audioFormat2.sampleRate));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void updateSpeed(float f11, long j11) {
        synchronized (this.lock) {
            try {
                if (f11 != this.currentSpeed) {
                    updateSpeedChangeArrays(j11);
                    this.currentSpeed = f11;
                    if (isUsingSonic()) {
                        this.sonicAudioProcessor.setSpeed(f11);
                        this.sonicAudioProcessor.setPitch(f11);
                    }
                    this.sonicAudioProcessor.flush();
                    this.endOfStreamQueuedToSonic = false;
                    super.getOutput();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void updateSpeedChangeArrays(long j11) {
        LongArray longArray = this.outputSegmentStartTimesUs;
        long j12 = longArray.get(longArray.size() - 1);
        LongArray longArray2 = this.inputSegmentStartTimesUs;
        long j13 = j11 - longArray2.get(longArray2.size() - 1);
        this.inputSegmentStartTimesUs.add(j11);
        this.outputSegmentStartTimesUs.add(j12 + getPlayoutDurationUsAtCurrentSpeed(j13));
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j11) {
        return SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.speedProvider, j11);
    }

    public long getMediaDurationUs(long j11) {
        long jRound;
        long j12;
        synchronized (this.lock) {
            try {
                int size = this.outputSegmentStartTimesUs.size() - 1;
                while (size > 0 && this.outputSegmentStartTimesUs.get(size) > j11) {
                    size--;
                }
                long j13 = j11 - this.outputSegmentStartTimesUs.get(size);
                if (size == this.outputSegmentStartTimesUs.size() - 1) {
                    jRound = getMediaDurationUsAtCurrentSpeed(j13);
                } else {
                    int i11 = size + 1;
                    jRound = Math.round(j13 * divide(this.inputSegmentStartTimesUs.get(i11) - this.inputSegmentStartTimesUs.get(size), this.outputSegmentStartTimesUs.get(i11) - this.outputSegmentStartTimesUs.get(size)));
                }
                j12 = this.inputSegmentStartTimesUs.get(size) + jRound;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j12;
    }

    public void getSpeedAdjustedTimeAsync(long j11, TimestampConsumer timestampConsumer) {
        synchronized (this.lock) {
            try {
                Assertions.checkArgument(this.speedAdjustedTimeAsyncInputTimeUs < j11);
                this.speedAdjustedTimeAsyncInputTimeUs = j11;
                if (j11 > this.lastProcessedInputTimeUs || !this.pendingCallbackInputTimesUs.isEmpty()) {
                    if (!isEnded()) {
                        this.pendingCallbackInputTimesUs.add(j11);
                        this.pendingCallbacks.add(timestampConsumer);
                        return;
                    }
                }
                timestampConsumer.onTimestamp(calculateSpeedAdjustedTime(j11));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        return this.sonicAudioProcessor.configure(audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.endOfStreamQueuedToSonic) {
            return;
        }
        this.sonicAudioProcessor.queueEndOfStream();
        this.endOfStreamQueuedToSonic = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iScaleLargeTimestamp;
        long j11 = this.bytesRead;
        AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j11, 1000000L, ((long) audioFormat.sampleRate) * ((long) audioFormat.bytesPerFrame));
        float speed = this.speedProvider.getSpeed(jScaleLargeTimestamp);
        long nextSpeedChangeTimeUs = this.speedProvider.getNextSpeedChangeTimeUs(jScaleLargeTimestamp);
        if (getSampleRateAlignedTimestamp(nextSpeedChangeTimeUs, this.inputAudioFormat.sampleRate) == jScaleLargeTimestamp) {
            long jSampleCountToDurationUs = Util.sampleCountToDurationUs(1L, this.inputAudioFormat.sampleRate) + jScaleLargeTimestamp;
            float speed2 = this.speedProvider.getSpeed(jSampleCountToDurationUs);
            long nextSpeedChangeTimeUs2 = this.speedProvider.getNextSpeedChangeTimeUs(jSampleCountToDurationUs);
            speed = speed2;
            nextSpeedChangeTimeUs = nextSpeedChangeTimeUs2;
        }
        updateSpeed(speed, jScaleLargeTimestamp);
        int iLimit = byteBuffer.limit();
        if (nextSpeedChangeTimeUs != C2711C.TIME_UNSET) {
            long j12 = nextSpeedChangeTimeUs - jScaleLargeTimestamp;
            AudioProcessor.AudioFormat audioFormat2 = this.inputAudioFormat;
            iScaleLargeTimestamp = (int) Util.scaleLargeTimestamp(j12, ((long) audioFormat2.sampleRate) * ((long) audioFormat2.bytesPerFrame), 1000000L);
            int i11 = this.inputAudioFormat.bytesPerFrame;
            int i12 = i11 - (iScaleLargeTimestamp % i11);
            if (i12 != i11) {
                iScaleLargeTimestamp += i12;
            }
            byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + iScaleLargeTimestamp));
        } else {
            iScaleLargeTimestamp = -1;
        }
        long jPosition = byteBuffer.position();
        if (isUsingSonic()) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
            if (iScaleLargeTimestamp != -1 && ((long) byteBuffer.position()) - jPosition == iScaleLargeTimestamp) {
                this.sonicAudioProcessor.queueEndOfStream();
                this.endOfStreamQueuedToSonic = true;
            }
        } else {
            ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                byteBufferReplaceOutputBuffer.put(byteBuffer);
            }
            byteBufferReplaceOutputBuffer.flip();
        }
        this.bytesRead += ((long) byteBuffer.position()) - jPosition;
        updateLastProcessedInputTime();
        byteBuffer.limit(iLimit);
    }

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider) {
        this.speedProvider = speedProvider;
        Object obj = new Object();
        this.lock = obj;
        this.sonicAudioProcessor = new SynchronizedSonicAudioProcessor(obj);
        this.pendingCallbackInputTimesUs = new LongArrayQueue();
        this.pendingCallbacks = new ArrayDeque();
        this.speedAdjustedTimeAsyncInputTimeUs = C2711C.TIME_UNSET;
        resetState();
    }

    private long getMediaDurationUsAtCurrentSpeed(long j11) {
        if (isUsingSonic()) {
            return this.sonicAudioProcessor.getMediaDuration(j11);
        }
        return j11;
    }

    private long getPlayoutDurationUsAtCurrentSpeed(long j11) {
        if (isUsingSonic()) {
            return this.sonicAudioProcessor.getPlayoutDuration(j11);
        }
        return j11;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer output;
        if (isUsingSonic()) {
            output = this.sonicAudioProcessor.getOutput();
        } else {
            output = super.getOutput();
        }
        processPendingCallbacks();
        return output;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        if (super.isEnded() && this.sonicAudioProcessor.isEnded()) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush() {
        resetState();
        this.sonicAudioProcessor.flush();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        resetState();
        this.sonicAudioProcessor.reset();
    }
}
