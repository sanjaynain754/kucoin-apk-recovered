package androidx.camera.video.internal.audio;

import android.content.Context;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioSource {

    @VisibleForTesting
    static final long DEFAULT_START_RETRY_INTERVAL_MS = 3000;
    private static final String TAG = "AudioSource";
    private FutureCallback<InputBuffer> mAcquireBufferCallback;
    long mAmplitudeTimestamp;
    double mAudioAmplitude;
    private final int mAudioFormat;

    @VisibleForTesting
    public final int mAudioSource;
    AudioSourceCallback mAudioSourceCallback;
    final AudioStream mAudioStream;
    boolean mAudioStreamSilenced;
    BufferProvider<? extends InputBuffer> mBufferProvider;
    BufferProvider.State mBufferProviderState;
    Executor mCallbackExecutor;
    final Executor mExecutor;
    boolean mInSilentStartState;
    boolean mIsSendingAudio;
    private long mLatestFailedStartTimeNs;
    boolean mMuted;
    final AtomicReference<Boolean> mNotifiedSilenceState;
    final AtomicBoolean mNotifiedSuspendState;
    final SilentAudioStream mSilentAudioStream;
    private final long mStartRetryIntervalNs;
    InternalState mState;
    private Observable.Observer<BufferProvider.State> mStateObserver;
    private byte[] mZeroBytes;

    public class AudioStreamCallback implements AudioStream.AudioStreamCallback {
        public AudioStreamCallback() {
        }

        @Override // androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback
        public void onSilenceStateChanged(boolean z11) {
            AudioSource audioSource = AudioSource.this;
            audioSource.mAudioStreamSilenced = z11;
            if (audioSource.mState == InternalState.STARTED) {
                audioSource.notifySilenced();
            }
        }
    }

    public enum InternalState {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioSource(AudioSettings audioSettings, Executor executor, Context context) throws AudioSourceAccessException {
        this(audioSettings, executor, context, new AudioStreamFactory() { // from class: androidx.camera.video.internal.audio.d
            @Override // androidx.camera.video.internal.audio.AudioStreamFactory
            public final AudioStream create(AudioSettings audioSettings2, Context context2) {
                return new AudioStreamImpl(audioSettings2, context2);
            }
        }, 3000L);
    }

    private static BufferProvider.State fetchBufferProviderState(BufferProvider<? extends InputBuffer> bufferProvider) {
        try {
            ListenableFuture<? extends InputBuffer> listenableFutureFetchData = bufferProvider.fetchData();
            if (listenableFutureFetchData.isDone()) {
                return (BufferProvider.State) listenableFutureFetchData.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    public void start() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.j
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource audioSource = this.f1984b;
                audioSource.start(audioSource.mMuted);
            }
        });
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    @VisibleForTesting
    public AudioSource(AudioSettings audioSettings, Executor executor, Context context, AudioStreamFactory audioStreamFactory, long j11) throws AudioSourceAccessException {
        this.mNotifiedSilenceState = new AtomicReference<>(null);
        this.mNotifiedSuspendState = new AtomicBoolean(false);
        this.mState = InternalState.CONFIGURED;
        this.mBufferProviderState = BufferProvider.State.INACTIVE;
        this.mAmplitudeTimestamp = 0L;
        Executor executorNewSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mExecutor = executorNewSequentialExecutor;
        this.mStartRetryIntervalNs = TimeUnit.MILLISECONDS.toNanos(j11);
        try {
            BufferedAudioStream bufferedAudioStream = new BufferedAudioStream(audioStreamFactory.create(audioSettings, context), audioSettings);
            this.mAudioStream = bufferedAudioStream;
            bufferedAudioStream.setCallback(new AudioStreamCallback(), executorNewSequentialExecutor);
            this.mSilentAudioStream = new SilentAudioStream(audioSettings);
            this.mAudioFormat = audioSettings.getAudioFormat();
            this.mAudioSource = audioSettings.getAudioSource();
        } catch (AudioStream.AudioStreamException | IllegalArgumentException e11) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m2159a(final AudioSource audioSource, final CallbackToFutureAdapter.Completer completer) {
        audioSource.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.i
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m2164f(this.f1982b, completer);
            }
        });
        return "AudioSource-release";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2160b(AudioSource audioSource, Executor executor, AudioSourceCallback audioSourceCallback) {
        int iOrdinal = audioSource.mState.ordinal();
        if (iOrdinal == 0) {
            audioSource.mCallbackExecutor = executor;
            audioSource.mAudioSourceCallback = audioSourceCallback;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2162d(AudioSource audioSource, BufferProvider bufferProvider) {
        int iOrdinal = audioSource.mState.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (audioSource.mBufferProvider != bufferProvider) {
            audioSource.resetBufferProvider(bufferProvider);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2163e(AudioSource audioSource, boolean z11) {
        int iOrdinal = audioSource.mState.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else {
            if (audioSource.mMuted == z11) {
                return;
            }
            audioSource.mMuted = z11;
            if (audioSource.mState == InternalState.STARTED) {
                audioSource.notifySilenced();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m2165g(AudioSource audioSource) {
        int iOrdinal = audioSource.mState.ordinal();
        if (iOrdinal == 1) {
            audioSource.setState(InternalState.CONFIGURED);
            audioSource.updateSendingAudio();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            Logger.m1872w(TAG, "AudioSource is released. Calling stop() is a no-op.");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2169k(AudioSource audioSource, boolean z11) {
        int iOrdinal = audioSource.mState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        audioSource.mNotifiedSilenceState.set(null);
        audioSource.mNotifiedSuspendState.set(false);
        audioSource.setState(InternalState.STARTED);
        audioSource.mute(z11);
        audioSource.updateSendingAudio();
    }

    private void resetBufferProvider(final BufferProvider<? extends InputBuffer> bufferProvider) {
        BufferProvider<? extends InputBuffer> bufferProvider2 = this.mBufferProvider;
        if (bufferProvider2 != null) {
            Observable.Observer<BufferProvider.State> observer = this.mStateObserver;
            Objects.requireNonNull(observer);
            bufferProvider2.removeObserver(observer);
            this.mBufferProvider = null;
            this.mStateObserver = null;
            this.mAcquireBufferCallback = null;
            this.mBufferProviderState = BufferProvider.State.INACTIVE;
            updateSendingAudio();
        }
        if (bufferProvider != null) {
            this.mBufferProvider = bufferProvider;
            this.mStateObserver = new Observable.Observer<BufferProvider.State>() { // from class: androidx.camera.video.internal.audio.AudioSource.1
                @Override // androidx.camera.core.impl.Observable.Observer
                public void onError(Throwable th2) {
                    AudioSource audioSource = AudioSource.this;
                    if (audioSource.mBufferProvider == bufferProvider) {
                        audioSource.notifyError(th2);
                    }
                }

                @Override // androidx.camera.core.impl.Observable.Observer
                public void onNewData(BufferProvider.State state) {
                    Objects.requireNonNull(state);
                    if (AudioSource.this.mBufferProvider == bufferProvider) {
                        Logger.m1866d(AudioSource.TAG, "Receive BufferProvider state change: " + AudioSource.this.mBufferProviderState + " to " + state);
                        AudioSource audioSource = AudioSource.this;
                        if (audioSource.mBufferProviderState != state) {
                            audioSource.mBufferProviderState = state;
                            audioSource.updateSendingAudio();
                        }
                    }
                }
            };
            this.mAcquireBufferCallback = new FutureCallback<InputBuffer>() { // from class: androidx.camera.video.internal.audio.AudioSource.2
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable th2) {
                    if (AudioSource.this.mBufferProvider != bufferProvider) {
                        return;
                    }
                    Logger.m1866d(AudioSource.TAG, "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                    if (th2 instanceof IllegalStateException) {
                        return;
                    }
                    AudioSource.this.notifyError(th2);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(InputBuffer inputBuffer) {
                    AudioSource audioSource = AudioSource.this;
                    if (!audioSource.mIsSendingAudio || audioSource.mBufferProvider != bufferProvider) {
                        inputBuffer.cancel();
                        return;
                    }
                    if (audioSource.mInSilentStartState && audioSource.isStartRetryIntervalReached()) {
                        AudioSource.this.retryStartAudioStream();
                    }
                    AudioStream currentAudioStream = AudioSource.this.getCurrentAudioStream();
                    ByteBuffer byteBuffer = inputBuffer.getByteBuffer();
                    AudioStream.PacketInfo packetInfo = currentAudioStream.read(byteBuffer);
                    if (packetInfo.getSizeInBytes() > 0) {
                        AudioSource audioSource2 = AudioSource.this;
                        if (audioSource2.mMuted) {
                            audioSource2.overrideBySilence(byteBuffer, packetInfo.getSizeInBytes());
                        }
                        if (AudioSource.this.mCallbackExecutor != null) {
                            long timestampNs = packetInfo.getTimestampNs();
                            AudioSource audioSource3 = AudioSource.this;
                            if (timestampNs - audioSource3.mAmplitudeTimestamp >= 200) {
                                audioSource3.mAmplitudeTimestamp = packetInfo.getTimestampNs();
                                AudioSource.this.postMaxAmplitude(byteBuffer);
                            }
                        }
                        byteBuffer.limit(byteBuffer.position() + packetInfo.getSizeInBytes());
                        inputBuffer.setPresentationTimeUs(TimeUnit.NANOSECONDS.toMicros(packetInfo.getTimestampNs()));
                        inputBuffer.submit();
                    } else {
                        Logger.m1872w(AudioSource.TAG, "Unable to read data from AudioStream.");
                        inputBuffer.cancel();
                    }
                    AudioSource.this.sendNextAudio();
                }
            };
            BufferProvider.State stateFetchBufferProviderState = fetchBufferProviderState(bufferProvider);
            if (stateFetchBufferProviderState != null) {
                this.mBufferProviderState = stateFetchBufferProviderState;
                updateSendingAudio();
            }
            this.mBufferProvider.addObserver(this.mExecutor, this.mStateObserver);
        }
    }

    private void startSendingAudio() {
        if (this.mIsSendingAudio) {
            return;
        }
        try {
            Logger.m1866d(TAG, "startSendingAudio");
            this.mAudioStream.start();
            this.mInSilentStartState = false;
        } catch (AudioStream.AudioStreamException e11) {
            Logger.m1873w(TAG, "Failed to start AudioStream", e11);
            this.mInSilentStartState = true;
            this.mSilentAudioStream.start();
            this.mLatestFailedStartTimeNs = getCurrentSystemTimeNs();
            notifySilenced();
        }
        this.mIsSendingAudio = true;
        sendNextAudio();
    }

    private void stopSendingAudio() {
        if (this.mIsSendingAudio) {
            this.mIsSendingAudio = false;
            Logger.m1866d(TAG, "stopSendingAudio");
            this.mAudioStream.stop();
        }
    }

    public AudioStream getCurrentAudioStream() {
        return this.mInSilentStartState ? this.mSilentAudioStream : this.mAudioStream;
    }

    public boolean isStartRetryIntervalReached() {
        Preconditions.checkState(this.mLatestFailedStartTimeNs > 0);
        return getCurrentSystemTimeNs() - this.mLatestFailedStartTimeNs >= this.mStartRetryIntervalNs;
    }

    public void mute(final boolean z11) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.a
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m2163e(this.f1970b, z11);
            }
        });
    }

    public void notifyError(final Throwable th2) {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (executor == null || audioSourceCallback == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.c
            @Override // java.lang.Runnable
            public final void run() {
                audioSourceCallback.onError(th2);
            }
        });
    }

    public void notifySilenced() {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (executor == null || audioSourceCallback == null) {
            return;
        }
        final boolean z11 = this.mMuted || this.mInSilentStartState || this.mAudioStreamSilenced;
        if (Objects.equals(this.mNotifiedSilenceState.getAndSet(Boolean.valueOf(z11)), Boolean.valueOf(z11))) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.h
            @Override // java.lang.Runnable
            public final void run() {
                audioSourceCallback.onSilenceStateChanged(z11);
            }
        });
    }

    public void notifySuspended(final boolean z11) {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (executor == null || audioSourceCallback == null || this.mNotifiedSuspendState.getAndSet(z11) == z11) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.m
            @Override // java.lang.Runnable
            public final void run() {
                audioSourceCallback.onSuspendStateChanged(z11);
            }
        });
    }

    public void overrideBySilence(ByteBuffer byteBuffer, int i11) {
        byte[] bArr = this.mZeroBytes;
        if (bArr == null || bArr.length < i11) {
            this.mZeroBytes = new byte[i11];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.mZeroBytes, 0, i11);
        byteBuffer.limit(byteBuffer.position()).position(iPosition);
    }

    public void postMaxAmplitude(ByteBuffer byteBuffer) {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (this.mAudioFormat == 2) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            double dMax = 0.0d;
            while (shortBufferAsShortBuffer.hasRemaining()) {
                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
            }
            this.mAudioAmplitude = dMax / 32767.0d;
            if (executor == null || audioSourceCallback == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.l
                @Override // java.lang.Runnable
                public final void run() {
                    audioSourceCallback.onAmplitudeValue(this.f1988b.mAudioAmplitude);
                }
            });
        }
    }

    public ListenableFuture<Void> release() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.audio.f
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return AudioSource.m2159a(this.f1977a, completer);
            }
        });
    }

    public void retryStartAudioStream() {
        Preconditions.checkState(this.mInSilentStartState);
        try {
            this.mAudioStream.start();
            Logger.m1866d(TAG, "Retry start AudioStream succeed");
            this.mSilentAudioStream.stop();
            this.mInSilentStartState = false;
        } catch (AudioStream.AudioStreamException e11) {
            Logger.m1873w(TAG, "Retry start AudioStream failed", e11);
            this.mLatestFailedStartTimeNs = getCurrentSystemTimeNs();
        }
    }

    public void sendNextAudio() {
        BufferProvider<? extends InputBuffer> bufferProvider = this.mBufferProvider;
        Objects.requireNonNull(bufferProvider);
        ListenableFuture<? extends InputBuffer> listenableFutureAcquireBuffer = bufferProvider.acquireBuffer();
        FutureCallback<InputBuffer> futureCallback = this.mAcquireBufferCallback;
        Objects.requireNonNull(futureCallback);
        Futures.addCallback(listenableFutureAcquireBuffer, futureCallback, this.mExecutor);
    }

    public void setAudioSourceCallback(final Executor executor, final AudioSourceCallback audioSourceCallback) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.k
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m2160b(this.f1985b, executor, audioSourceCallback);
            }
        });
    }

    public void setBufferProvider(final BufferProvider<? extends InputBuffer> bufferProvider) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.b
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m2162d(this.f1972b, bufferProvider);
            }
        });
    }

    public void setState(InternalState internalState) {
        Logger.m1866d(TAG, "Transitioning internal state: " + this.mState + " --> " + internalState);
        this.mState = internalState;
    }

    public void start(final boolean z11) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.g
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m2169k(this.f1978b, z11);
            }
        });
    }

    public void stop() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.e
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.m2165g(this.f1976b);
            }
        });
    }

    public void updateSendingAudio() {
        if (this.mState != InternalState.STARTED) {
            stopSendingAudio();
            return;
        }
        boolean z11 = this.mBufferProviderState == BufferProvider.State.ACTIVE;
        notifySuspended(!z11);
        if (z11) {
            startSendingAudio();
        } else {
            stopSendingAudio();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2164f(AudioSource audioSource, CallbackToFutureAdapter.Completer completer) {
        audioSource.getClass();
        try {
            int iOrdinal = audioSource.mState.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                audioSource.resetBufferProvider(null);
                audioSource.mSilentAudioStream.release();
                audioSource.mAudioStream.release();
                audioSource.stopSendingAudio();
                audioSource.setState(InternalState.RELEASED);
            }
            completer.set(null);
        } catch (Throwable th2) {
            completer.setException(th2);
        }
    }

    private static long getCurrentSystemTimeNs() {
        return System.nanoTime();
    }

    public static boolean isSettingsSupported(int i11, int i12, int i13) {
        return AudioStreamImpl.isSettingsSupported(i11, i12, i13);
    }

    public interface AudioSourceCallback {
        void onAmplitudeValue(double d11);

        void onError(Throwable th2);

        void onSilenceStateChanged(boolean z11);

        @VisibleForTesting
        default void onSuspendStateChanged(boolean z11) {
        }
    }
}
