package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.Api23Impl;
import androidx.camera.video.internal.compat.Api24Impl;
import androidx.camera.video.internal.compat.Api29Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public class AudioStreamImpl implements AudioStream {
    private static final long DIFF_LIMIT_FROM_SYSTEM_TIME_NS = TimeUnit.MILLISECONDS.toNanos(500);
    private static final String TAG = "AudioStreamImpl";
    private AudioRecord mAudioRecord;
    private AudioManager.AudioRecordingCallback mAudioRecordingCallback;
    private AudioStream.AudioStreamCallback mAudioStreamCallback;
    private final int mBufferSize;
    private final int mBytesPerFrame;
    private Executor mCallbackExecutor;
    private final AudioSettings mSettings;
    private long mTotalFramesRead;
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicReference<Boolean> mNotifiedSilenceState = new AtomicReference<>(null);
    private boolean mShouldFallbackToSystemTime = false;

    @RequiresApi(29)
    public class AudioRecordingApi29Callback extends AudioManager.AudioRecordingCallback {
        public AudioRecordingApi29Callback() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                if (Api24Impl.getClientAudioSessionId(audioRecordingConfiguration) == AudioStreamImpl.this.mAudioRecord.getAudioSessionId()) {
                    AudioStreamImpl.this.notifySilenced(Api29Impl.isClientSilenced(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    private static AudioFormat createAudioFormat(AudioSettings audioSettings) throws IllegalArgumentException {
        return createAudioFormat(audioSettings.getCaptureSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat());
    }

    public static boolean isSettingsSupported(int i11, int i12, int i13) {
        if (i11 <= 0 || i12 <= 0 || getMinBufferSize(i11, i12, i13) <= 0) {
            return false;
        }
        try {
            createAudioFormat(i11, i12, i13);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    private static AudioRecord createAudioRecord(int i11, AudioSettings audioSettings, Context context) throws IllegalArgumentException {
        int i12 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatCreateAudioFormat = createAudioFormat(audioSettings);
        AudioRecord.Builder builderCreateAudioRecordBuilder = Api23Impl.createAudioRecordBuilder();
        if (i12 >= 31 && context != null) {
            Api31Impl.setContext(builderCreateAudioRecordBuilder, context);
        }
        Api23Impl.setAudioSource(builderCreateAudioRecordBuilder, audioSettings.getAudioSource());
        Api23Impl.setAudioFormat(builderCreateAudioRecordBuilder, audioFormatCreateAudioFormat);
        Api23Impl.setBufferSizeInBytes(builderCreateAudioRecordBuilder, i11);
        try {
            return Api23Impl.build(builderCreateAudioRecordBuilder);
        } catch (UnsupportedOperationException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    private long generatePresentationTimeNs() {
        long jComputeInterpolatedTimeNs;
        if (this.mShouldFallbackToSystemTime) {
            jComputeInterpolatedTimeNs = -1;
        } else {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (Api24Impl.getTimestamp(this.mAudioRecord, audioTimestamp, 0) == 0) {
                jComputeInterpolatedTimeNs = AudioUtils.computeInterpolatedTimeNs(this.mSettings.getCaptureSampleRate(), this.mTotalFramesRead, audioTimestamp);
                if (Math.abs(jComputeInterpolatedTimeNs - System.nanoTime()) > DIFF_LIMIT_FROM_SYSTEM_TIME_NS) {
                    this.mShouldFallbackToSystemTime = true;
                }
            } else {
                Logger.m1872w(TAG, "Unable to get audio timestamp");
            }
            jComputeInterpolatedTimeNs = -1;
        }
        return jComputeInterpolatedTimeNs == -1 ? System.nanoTime() : jComputeInterpolatedTimeNs;
    }

    private static boolean hasAudioTimestampQuirk() {
        return DeviceQuirks.get(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public void notifySilenced(final boolean z11) {
        Executor executor = this.mCallbackExecutor;
        final AudioStream.AudioStreamCallback audioStreamCallback = this.mAudioStreamCallback;
        if (executor == null || audioStreamCallback == null || Objects.equals(this.mNotifiedSilenceState.getAndSet(Boolean.valueOf(z11)), Boolean.valueOf(z11))) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.n
            @Override // java.lang.Runnable
            public final void run() {
                audioStreamCallback.onSilenceStateChanged(z11);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.mAudioRecordingCallback) != null) {
            Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, audioRecordingCallback);
        }
        this.mAudioRecord.release();
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
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.mAudioRecordingCallback;
            if (audioRecordingCallback != null) {
                Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, audioRecordingCallback);
            }
            if (audioStreamCallback == null) {
                return;
            }
            if (this.mAudioRecordingCallback == null) {
                this.mAudioRecordingCallback = new AudioRecordingApi29Callback();
            }
            Api29Impl.registerAudioRecordingCallback(this.mAudioRecord, executor, this.mAudioRecordingCallback);
        }
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioStreamImpl(AudioSettings audioSettings, Context context) throws AudioStream.AudioStreamException, IllegalArgumentException {
        if (isSettingsSupported(audioSettings.getCaptureSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat())) {
            this.mSettings = audioSettings;
            this.mBytesPerFrame = audioSettings.getBytesPerFrame();
            int minBufferSize = getMinBufferSize(audioSettings.getCaptureSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat());
            Preconditions.checkState(minBufferSize > 0);
            int i11 = minBufferSize * 2;
            this.mBufferSize = i11;
            AudioRecord audioRecordCreateAudioRecord = createAudioRecord(i11, audioSettings, context);
            this.mAudioRecord = audioRecordCreateAudioRecord;
            checkAudioRecordInitialStateOrReleaseAndThrow(audioRecordCreateAudioRecord);
            return;
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(audioSettings.getCaptureSampleRate()), Integer.valueOf(audioSettings.getChannelCount()), Integer.valueOf(audioSettings.getAudioFormat())));
    }

    private static void checkAudioRecordInitialStateOrReleaseAndThrow(AudioRecord audioRecord) throws AudioStream.AudioStreamException {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
    }

    private static int getMinBufferSize(int i11, int i12, int i13) {
        return AudioRecord.getMinBufferSize(i11, AudioUtils.channelCountToChannelConfig(i12), i13);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public AudioStream.PacketInfo read(ByteBuffer byteBuffer) {
        long jGeneratePresentationTimeNs;
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        int i11 = this.mAudioRecord.read(byteBuffer, this.mBufferSize);
        if (i11 > 0) {
            byteBuffer.limit(i11);
            jGeneratePresentationTimeNs = generatePresentationTimeNs();
            this.mTotalFramesRead += AudioUtils.sizeToFrameCount(i11, this.mBytesPerFrame);
        } else {
            jGeneratePresentationTimeNs = 0;
        }
        return AudioStream.PacketInfo.m2171of(i11, jGeneratePresentationTimeNs);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws AudioStream.AudioStreamException {
        checkNotReleasedOrThrow();
        boolean z11 = true;
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        if (hasAudioTimestampQuirk()) {
            checkAudioRecordInitialStateOrReleaseAndThrow(this.mAudioRecord);
        }
        this.mAudioRecord.startRecording();
        boolean z12 = false;
        if (this.mAudioRecord.getRecordingState() == 3) {
            this.mTotalFramesRead = 0L;
            this.mShouldFallbackToSystemTime = false;
            this.mNotifiedSilenceState.set(null);
            if (Build.VERSION.SDK_INT >= 29) {
                AudioRecordingConfiguration activeRecordingConfiguration = Api29Impl.getActiveRecordingConfiguration(this.mAudioRecord);
                if (activeRecordingConfiguration == null || !Api29Impl.isClientSilenced(activeRecordingConfiguration)) {
                    z11 = false;
                }
                z12 = z11;
            }
            notifySilenced(z12);
            return;
        }
        this.mIsStarted.set(false);
        throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + this.mAudioRecord.getRecordingState());
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @SuppressLint({"MissingPermission"})
    public void stop() {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(false)) {
            this.mAudioRecord.stop();
            if (this.mAudioRecord.getRecordingState() != 1) {
                Logger.m1872w(TAG, "Failed to stop AudioRecord with state: " + this.mAudioRecord.getRecordingState());
            }
            if (hasAudioTimestampQuirk()) {
                this.mAudioRecord.release();
                this.mAudioRecord = createAudioRecord(this.mBufferSize, this.mSettings, null);
            }
        }
    }

    private static AudioFormat createAudioFormat(int i11, int i12, int i13) throws IllegalArgumentException {
        return new AudioFormat.Builder().setSampleRate(i11).setChannelMask(AudioUtils.channelCountToChannelMask(i12)).setEncoding(i13).build();
    }
}
