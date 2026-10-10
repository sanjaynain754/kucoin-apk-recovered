package androidx.camera.video.internal.encoder;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.utils.CodecUtil;
import androidx.camera.video.internal.workaround.VideoTimebaseConverter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public class EncoderImpl implements Encoder {
    private static final boolean DEBUG = false;
    private static final long NO_LIMIT_LONG = Long.MAX_VALUE;
    private static final Range<Long> NO_RANGE = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    static final String PARAMETER_KEY_TIMELAPSE_ENABLED = "time-lapse-enable";
    static final String PARAMETER_KEY_TIMELAPSE_FPS = "time-lapse-fps";
    private static final long SIGNAL_EOS_TIMEOUT_MS = 1000;
    private static final long STOP_TIMEOUT_MS = 1000;
    private final Rational mCaptureToEncodeFrameRateRatio;
    private final boolean mCodecStopAsFlushWorkaroundEnabled;
    private final EncoderConfig mEncoderConfig;
    final Executor mEncoderExecutor;
    private final EncoderInfo mEncoderInfo;
    final Encoder.EncoderInput mEncoderInput;
    final Timebase mInputTimebase;
    final boolean mIsVideoEncoder;
    final MediaCodec mMediaCodec;

    @VisibleForTesting
    final MediaFormat mMediaFormat;
    private final CallbackToFutureAdapter.Completer<Void> mReleasedCompleter;
    private final ListenableFuture<Void> mReleasedFuture;
    private Future<?> mSignalEosTimeoutFuture;
    InternalState mState;
    final String mTag;
    final TimeProvider mTimeProvider;
    final Object mLock = new Object();
    final Queue<Integer> mFreeInputBufferIndexQueue = new ArrayDeque();
    private final Queue<CallbackToFutureAdapter.Completer<InputBuffer>> mAcquisitionQueue = new ArrayDeque();
    private final Set<InputBuffer> mInputBufferSet = new HashSet();
    final Set<EncodedDataImpl> mEncodedDataSet = new HashSet();
    final Deque<Range<Long>> mActivePauseResumeTimeRanges = new ArrayDeque();

    @GuardedBy("mLock")
    EncoderCallback mEncoderCallback = EncoderCallback.EMPTY;

    @GuardedBy("mLock")
    Executor mEncoderCallbackExecutor = CameraXExecutors.directExecutor();
    Range<Long> mStartStopTimeRangeUs = NO_RANGE;
    long mTotalPausedDurationUs = 0;
    boolean mPendingCodecStop = false;
    Long mLastDataStopTimestamp = null;
    Future<?> mStopTimeoutFuture = null;
    private MediaCodecCallback mMediaCodecCallback = null;
    private boolean mIsFlushedAfterEndOfStream = false;
    private boolean mSourceStoppedSignalled = false;
    boolean mMediaCodecEosSignalled = false;

    public class ByteBufferInput implements Encoder.ByteBufferInput {
        private final Map<Observable.Observer<? super BufferProvider.State>, Executor> mStateObservers = new LinkedHashMap();
        private BufferProvider.State mBufferProviderState = BufferProvider.State.INACTIVE;
        private final List<ListenableFuture<InputBuffer>> mAcquisitionList = new ArrayList();

        /* JADX INFO: Access modifiers changed from: private */
        public void cancelInputBuffer(ListenableFuture<InputBuffer> listenableFuture) {
            if (listenableFuture.cancel(true)) {
                return;
            }
            Preconditions.checkState(listenableFuture.isDone());
            try {
                listenableFuture.get().cancel();
            } catch (InterruptedException | CancellationException | ExecutionException e11) {
                Logger.m1872w(EncoderImpl.this.mTag, "Unable to cancel the input buffer: " + e11);
            }
        }

        public ByteBufferInput() {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Object m2205c(final ByteBufferInput byteBufferInput, final CallbackToFutureAdapter.Completer completer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.z
                @Override // java.lang.Runnable
                public final void run() {
                    completer.set(this.f2082b.mBufferProviderState);
                }
            });
            return "fetchData";
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m2206d(ByteBufferInput byteBufferInput, final Observable.Observer observer, Executor executor) {
            byteBufferInput.mStateObservers.put((Observable.Observer) Preconditions.checkNotNull(observer), (Executor) Preconditions.checkNotNull(executor));
            final BufferProvider.State state = byteBufferInput.mBufferProviderState;
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.d0
                @Override // java.lang.Runnable
                public final void run() {
                    observer.onNewData(state);
                }
            });
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ Object m2210h(final ByteBufferInput byteBufferInput, final CallbackToFutureAdapter.Completer completer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.y
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.ByteBufferInput.m2211i(this.f2080b, completer);
                }
            });
            return "acquireBuffer";
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m2211i(final ByteBufferInput byteBufferInput, CallbackToFutureAdapter.Completer completer) {
            BufferProvider.State state = byteBufferInput.mBufferProviderState;
            if (state == BufferProvider.State.ACTIVE) {
                final ListenableFuture<InputBuffer> listenableFutureAcquireInputBuffer = EncoderImpl.this.acquireInputBuffer();
                Futures.propagate(listenableFutureAcquireInputBuffer, completer);
                completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2006b.cancelInputBuffer(listenableFutureAcquireInputBuffer);
                    }
                }, CameraXExecutors.directExecutor());
                byteBufferInput.mAcquisitionList.add(listenableFutureAcquireInputBuffer);
                listenableFutureAcquireInputBuffer.addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2009b.mAcquisitionList.remove(listenableFutureAcquireInputBuffer);
                    }
                }, EncoderImpl.this.mEncoderExecutor);
                return;
            }
            if (state == BufferProvider.State.INACTIVE) {
                completer.setException(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            completer.setException(new IllegalStateException("Unknown state: " + byteBufferInput.mBufferProviderState));
        }

        @Override // androidx.camera.video.internal.BufferProvider
        public ListenableFuture<InputBuffer> acquireBuffer() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.x
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.ByteBufferInput.m2210h(this.f2079a, completer);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public void addObserver(final Executor executor, final Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.v
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.ByteBufferInput.m2206d(this.f2075b, observer, executor);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public ListenableFuture<BufferProvider.State> fetchData() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.w
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.ByteBufferInput.m2205c(this.f2078a, completer);
                }
            });
        }

        @Override // androidx.camera.core.impl.Observable
        public void removeObserver(final Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2021b.mStateObservers.remove(Preconditions.checkNotNull(observer));
                }
            });
        }

        public void setActive(boolean z11) {
            final BufferProvider.State state = z11 ? BufferProvider.State.ACTIVE : BufferProvider.State.INACTIVE;
            if (this.mBufferProviderState == state) {
                return;
            }
            this.mBufferProviderState = state;
            if (state == BufferProvider.State.INACTIVE) {
                Iterator<ListenableFuture<InputBuffer>> it = this.mAcquisitionList.iterator();
                while (it.hasNext()) {
                    it.next().cancel(true);
                }
                this.mAcquisitionList.clear();
            }
            for (final Map.Entry<Observable.Observer<? super BufferProvider.State>, Executor> entry : this.mStateObservers.entrySet()) {
                try {
                    entry.getValue().execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.c0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((Observable.Observer) entry.getKey()).onNewData(state);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    Logger.m1869e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
                }
            }
        }
    }

    public enum InternalState {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    public class MediaCodecCallback extends MediaCodec.Callback {
        private boolean mIsFirstVideoOutput;
        private boolean mReachStopTimeAsEos;
        private final VideoTimebaseConverter mVideoTimestampConverter;
        private boolean mHasSendStartCallback = false;
        private boolean mHasFirstData = false;
        private boolean mHasEndData = false;
        private long mLastPresentationTimeUs = 0;
        private long mLastSentAdjustedTimeUs = 0;
        private boolean mIsOutputBufferInPauseState = false;
        private boolean mIsKeyFrameRequired = false;
        private boolean mStopped = false;

        public void stop() {
            this.mStopped = true;
        }

        public MediaCodecCallback() {
            this.mReachStopTimeAsEos = true;
            boolean z11 = EncoderImpl.this.mIsVideoEncoder;
            this.mIsFirstVideoOutput = z11;
            if (z11) {
                this.mVideoTimestampConverter = new VideoTimebaseConverter(EncoderImpl.this.mTimeProvider, EncoderImpl.this.mInputTimebase, (CameraUseInconsistentTimebaseQuirk) DeviceQuirks.get(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.mVideoTimestampConverter = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) DeviceQuirks.get(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.isProblematicMimeType(EncoderImpl.this.mMediaFormat.getString("mime"))) {
                return;
            }
            this.mReachStopTimeAsEos = false;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m2214b(MediaCodecCallback mediaCodecCallback, Executor executor, final EncoderCallback encoderCallback) {
            if (EncoderImpl.this.mState == InternalState.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(encoderCallback);
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        encoderCallback.onEncodeStop();
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.m1869e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
            }
        }

        private boolean checkBufferInfo(MediaCodec.BufferInfo bufferInfo) {
            if (this.mHasEndData) {
                Logger.m1866d(EncoderImpl.this.mTag, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                Logger.m1866d(EncoderImpl.this.mTag, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                Logger.m1866d(EncoderImpl.this.mTag, "Drop buffer by codec config.");
                return false;
            }
            VideoTimebaseConverter videoTimebaseConverter = this.mVideoTimestampConverter;
            if (videoTimebaseConverter != null) {
                bufferInfo.presentationTimeUs = videoTimebaseConverter.convertToUptimeUs(bufferInfo.presentationTimeUs);
            }
            long j11 = bufferInfo.presentationTimeUs;
            if (j11 <= this.mLastPresentationTimeUs) {
                Logger.m1866d(EncoderImpl.this.mTag, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.mLastPresentationTimeUs = j11;
            if (!EncoderImpl.this.mStartStopTimeRangeUs.contains(Long.valueOf(j11))) {
                Logger.m1866d(EncoderImpl.this.mTag, "Drop buffer by not in start-stop range.");
                EncoderImpl encoderImpl = EncoderImpl.this;
                if (encoderImpl.mPendingCodecStop && bufferInfo.presentationTimeUs >= ((Long) encoderImpl.mStartStopTimeRangeUs.getUpper()).longValue()) {
                    Future<?> future = EncoderImpl.this.mStopTimeoutFuture;
                    if (future != null) {
                        future.cancel(true);
                    }
                    EncoderImpl.this.mLastDataStopTimestamp = Long.valueOf(bufferInfo.presentationTimeUs);
                    EncoderImpl.this.signalCodecStop();
                    EncoderImpl.this.mPendingCodecStop = false;
                }
                return false;
            }
            if (updatePauseRangeStateAndCheckIfBufferPaused(bufferInfo)) {
                Logger.m1866d(EncoderImpl.this.mTag, "Drop buffer by pause.");
                return false;
            }
            if (EncoderImpl.this.getAdjustedTimeUs(bufferInfo) <= this.mLastSentAdjustedTimeUs) {
                Logger.m1866d(EncoderImpl.this.mTag, "Drop buffer by adjusted time is less than the last sent time.");
                if (EncoderImpl.this.mIsVideoEncoder && EncoderImpl.isKeyFrame(bufferInfo)) {
                    this.mIsKeyFrameRequired = true;
                }
                return false;
            }
            if (!this.mHasFirstData && !this.mIsKeyFrameRequired && EncoderImpl.this.mIsVideoEncoder) {
                this.mIsKeyFrameRequired = true;
            }
            if (this.mIsKeyFrameRequired) {
                if (!EncoderImpl.isKeyFrame(bufferInfo)) {
                    Logger.m1866d(EncoderImpl.this.mTag, "Drop buffer by not a key frame.");
                    EncoderImpl.this.requestKeyFrameToMediaCodec();
                    return false;
                }
                this.mIsKeyFrameRequired = false;
            }
            return true;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m2217e(MediaCodecCallback mediaCodecCallback, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i11) {
            EncoderImpl encoderImpl;
            final EncoderCallback encoderCallback;
            Executor executor;
            if (mediaCodecCallback.mStopped) {
                Logger.m1872w(EncoderImpl.this.mTag, "Receives frame after codec is reset.");
                return;
            }
            switch (EncoderImpl.this.mState) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (EncoderImpl.this.mLock) {
                        encoderImpl = EncoderImpl.this;
                        encoderCallback = encoderImpl.mEncoderCallback;
                        executor = encoderImpl.mEncoderCallbackExecutor;
                        break;
                    }
                    if (encoderImpl.mIsVideoEncoder && encoderImpl.isSlowMotion()) {
                        bufferInfo.presentationTimeUs = EncoderImpl.this.toPresentationTimeUsByCaptureEncodeRatio(bufferInfo.presentationTimeUs);
                    }
                    if (!mediaCodecCallback.mHasSendStartCallback) {
                        mediaCodecCallback.mHasSendStartCallback = true;
                        try {
                            Objects.requireNonNull(encoderCallback);
                            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.j0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    encoderCallback.onEncodeStart();
                                }
                            });
                        } catch (RejectedExecutionException e11) {
                            Logger.m1869e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
                        }
                        break;
                    }
                    if (!mediaCodecCallback.checkBufferInfo(bufferInfo)) {
                        try {
                            EncoderImpl.this.mMediaCodec.releaseOutputBuffer(i11, false);
                        } catch (MediaCodec.CodecException e12) {
                            EncoderImpl.this.handleEncodeError(e12);
                            return;
                        }
                        break;
                    } else {
                        if (!mediaCodecCallback.mHasFirstData) {
                            mediaCodecCallback.mHasFirstData = true;
                            Logger.m1866d(EncoderImpl.this.mTag, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + EncoderImpl.this.mInputTimebase + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo bufferInfoResolveOutputBufferInfo = mediaCodecCallback.resolveOutputBufferInfo(bufferInfo);
                        mediaCodecCallback.mLastSentAdjustedTimeUs = bufferInfoResolveOutputBufferInfo.presentationTimeUs;
                        try {
                            mediaCodecCallback.sendEncodedData(new EncodedDataImpl(mediaCodec, i11, bufferInfoResolveOutputBufferInfo), encoderCallback, executor);
                        } catch (MediaCodec.CodecException e13) {
                            EncoderImpl.this.handleEncodeError(e13);
                            return;
                        }
                        break;
                    }
                    if (!mediaCodecCallback.mHasEndData && mediaCodecCallback.isEndOfStream(bufferInfo)) {
                        mediaCodecCallback.reachEndData();
                    }
                    if (mediaCodecCallback.mIsFirstVideoOutput) {
                        mediaCodecCallback.mIsFirstVideoOutput = false;
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m2218f(MediaCodecCallback mediaCodecCallback, final MediaFormat mediaFormat) {
            final EncoderCallback encoderCallback;
            Executor executor;
            if (mediaCodecCallback.mStopped) {
                Logger.m1872w(EncoderImpl.this.mTag, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (EncoderImpl.this.mState) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    EncoderImpl encoderImpl = EncoderImpl.this;
                    if (encoderImpl.mIsVideoEncoder && encoderImpl.isSlowMotion()) {
                        mediaFormat.setInteger(EncoderImpl.PARAMETER_KEY_TIMELAPSE_ENABLED, 1);
                        mediaFormat.setInteger(EncoderImpl.PARAMETER_KEY_TIMELAPSE_FPS, ((VideoEncoderConfig) EncoderImpl.this.mEncoderConfig).getCaptureFrameRate());
                    }
                    synchronized (EncoderImpl.this.mLock) {
                        EncoderImpl encoderImpl2 = EncoderImpl.this;
                        encoderCallback = encoderImpl2.mEncoderCallback;
                        executor = encoderImpl2.mEncoderCallbackExecutor;
                        break;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.n0
                            @Override // java.lang.Runnable
                            public final void run() {
                                encoderCallback.onOutputConfigUpdate(new OutputConfig() { // from class: androidx.camera.video.internal.encoder.m0
                                    @Override // androidx.camera.video.internal.encoder.OutputConfig
                                    public final MediaFormat getMediaFormat() {
                                        return EncoderImpl.MediaCodecCallback.m2213a(mediaFormat);
                                    }
                                });
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e11) {
                        Logger.m1869e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m2219g(MediaCodecCallback mediaCodecCallback, int i11) {
            if (mediaCodecCallback.mStopped) {
                Logger.m1872w(EncoderImpl.this.mTag, "Receives input frame after codec is reset.");
                return;
            }
            switch (EncoderImpl.this.mState) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    EncoderImpl.this.mFreeInputBufferIndexQueue.offer(Integer.valueOf(i11));
                    EncoderImpl.this.matchAcquisitionsAndFreeBufferIndexes();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m2220h(MediaCodecCallback mediaCodecCallback, MediaCodec.CodecException codecException) {
            switch (EncoderImpl.this.mState) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    EncoderImpl.this.handleEncodeError(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        private boolean isEosSignalledAndStopTimeReached(MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            return encoderImpl.mMediaCodecEosSignalled && bufferInfo.presentationTimeUs > ((Long) encoderImpl.mStartStopTimeRangeUs.getUpper()).longValue();
        }

        private MediaCodec.BufferInfo resolveOutputBufferInfo(MediaCodec.BufferInfo bufferInfo) {
            long adjustedTimeUs = EncoderImpl.this.getAdjustedTimeUs(bufferInfo);
            if (bufferInfo.presentationTimeUs == adjustedTimeUs) {
                return bufferInfo;
            }
            Preconditions.checkState(adjustedTimeUs > this.mLastSentAdjustedTimeUs);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, adjustedTimeUs, bufferInfo.flags);
            return bufferInfo2;
        }

        private void sendEncodedData(final EncodedDataImpl encodedDataImpl, final EncoderCallback encoderCallback, Executor executor) {
            EncoderImpl.this.mEncodedDataSet.add(encodedDataImpl);
            Futures.addCallback(encodedDataImpl.getClosedFuture(), new FutureCallback<Void>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable th2) {
                    EncoderImpl.this.mEncodedDataSet.remove(encodedDataImpl);
                    if (th2 instanceof MediaCodec.CodecException) {
                        EncoderImpl.this.handleEncodeError((MediaCodec.CodecException) th2);
                    } else {
                        EncoderImpl.this.handleEncodeError(0, th2.getMessage(), th2);
                    }
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(Void r11) {
                    EncoderImpl.this.mEncodedDataSet.remove(encodedDataImpl);
                }
            }, EncoderImpl.this.mEncoderExecutor);
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        encoderCallback.onEncodedData(encodedDataImpl);
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.m1869e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
                encodedDataImpl.close();
            }
        }

        private boolean shouldSkipPrematureEos() {
            return this.mIsFirstVideoOutput && DeviceQuirks.get(PrematureEndOfStreamVideoQuirk.class) != null;
        }

        private boolean updatePauseRangeStateAndCheckIfBufferPaused(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final EncoderCallback encoderCallback;
            EncoderImpl.this.updateTotalPausedDuration(bufferInfo.presentationTimeUs);
            boolean zIsInPauseRange = EncoderImpl.this.isInPauseRange(bufferInfo.presentationTimeUs);
            boolean z11 = this.mIsOutputBufferInPauseState;
            if (!z11 && zIsInPauseRange) {
                Logger.m1866d(EncoderImpl.this.mTag, "Switch to pause state");
                this.mIsOutputBufferInPauseState = true;
                synchronized (EncoderImpl.this.mLock) {
                    EncoderImpl encoderImpl = EncoderImpl.this;
                    executor = encoderImpl.mEncoderCallbackExecutor;
                    encoderCallback = encoderImpl.mEncoderCallback;
                }
                Objects.requireNonNull(encoderCallback);
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        encoderCallback.onEncodePaused();
                    }
                });
                EncoderImpl encoderImpl2 = EncoderImpl.this;
                if (encoderImpl2.mState == InternalState.PAUSED && ((encoderImpl2.mIsVideoEncoder || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!EncoderImpl.this.mIsVideoEncoder || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    Encoder.EncoderInput encoderInput = EncoderImpl.this.mEncoderInput;
                    if (encoderInput instanceof ByteBufferInput) {
                        ((ByteBufferInput) encoderInput).setActive(false);
                    }
                    EncoderImpl.this.setMediaCodecPaused(true);
                }
                EncoderImpl.this.mLastDataStopTimestamp = Long.valueOf(bufferInfo.presentationTimeUs);
                EncoderImpl encoderImpl3 = EncoderImpl.this;
                if (encoderImpl3.mPendingCodecStop) {
                    Future<?> future = encoderImpl3.mStopTimeoutFuture;
                    if (future != null) {
                        future.cancel(true);
                    }
                    EncoderImpl.this.signalCodecStop();
                    EncoderImpl.this.mPendingCodecStop = false;
                }
            } else if (z11 && !zIsInPauseRange) {
                Logger.m1866d(EncoderImpl.this.mTag, "Switch to resume state");
                this.mIsOutputBufferInPauseState = false;
                if (EncoderImpl.this.mIsVideoEncoder && !EncoderImpl.isKeyFrame(bufferInfo)) {
                    this.mIsKeyFrameRequired = true;
                }
            }
            return this.mIsOutputBufferInPauseState;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.p0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.m2220h(this.f2060b, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i11) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.f0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.m2219g(this.f2025b, i11);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i11, final MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.h0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.m2217e(this.f2034b, bufferInfo, mediaCodec, i11);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            Logger.m1866d(EncoderImpl.this.mTag, "onOutputFormatChanged: mediaFormat = " + mediaFormat + ", CSD data = " + DebugUtils.getCsdHex(mediaFormat));
            EncoderImpl.this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.g0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.m2218f(this.f2030b, mediaFormat);
                }
            });
        }

        public void reachEndData() {
            EncoderImpl encoderImpl;
            final EncoderCallback encoderCallback;
            final Executor executor;
            Logger.m1866d(EncoderImpl.this.mTag, "reachEndData");
            if (this.mHasEndData) {
                return;
            }
            this.mHasEndData = true;
            if (EncoderImpl.this.mSignalEosTimeoutFuture != null) {
                EncoderImpl.this.mSignalEosTimeoutFuture.cancel(false);
                EncoderImpl.this.mSignalEosTimeoutFuture = null;
            }
            synchronized (EncoderImpl.this.mLock) {
                encoderImpl = EncoderImpl.this;
                encoderCallback = encoderImpl.mEncoderCallback;
                executor = encoderImpl.mEncoderCallbackExecutor;
            }
            encoderImpl.stopMediaCodec(new Runnable() { // from class: androidx.camera.video.internal.encoder.k0
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.MediaCodecCallback.m2214b(this.f2044b, executor, encoderCallback);
                }
            });
        }

        private boolean isEndOfStream(MediaCodec.BufferInfo bufferInfo) {
            if (!EncoderImpl.hasEndOfStreamFlag(bufferInfo) || shouldSkipPrematureEos()) {
                if (this.mReachStopTimeAsEos && isEosSignalledAndStopTimeReached(bufferInfo)) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ MediaFormat m2213a(MediaFormat mediaFormat) {
            return mediaFormat;
        }
    }

    public class SurfaceInput implements Encoder.SurfaceInput {
        private final Object mLock = new Object();

        @GuardedBy("mLock")
        private final Set<Surface> mObsoleteSurfaces = new HashSet();

        @GuardedBy("mLock")
        private Surface mSurface;

        @GuardedBy("mLock")
        private Executor mSurfaceUpdateExecutor;

        @GuardedBy("mLock")
        private Encoder.SurfaceInput.OnSurfaceUpdateListener mSurfaceUpdateListener;

        public SurfaceInput() {
        }

        private void notifySurfaceUpdate(Executor executor, final Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        onSurfaceUpdateListener.onSurfaceUpdate(surface);
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.m1869e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e11);
            }
        }

        public void releaseSurface() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.mLock) {
                surface = this.mSurface;
                this.mSurface = null;
                hashSet = new HashSet(this.mObsoleteSurfaces);
                this.mObsoleteSurfaces.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }

        @SuppressLint({"NewApi"})
        public void resetSurface() {
            Surface surfaceCreateInputSurface;
            Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.mLock) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.mSurface == null) {
                            surfaceCreateInputSurface = Api23Impl.createPersistentInputSurface();
                            this.mSurface = surfaceCreateInputSurface;
                        } else {
                            surfaceCreateInputSurface = null;
                        }
                        Api23Impl.setInputSurface(EncoderImpl.this.mMediaCodec, this.mSurface);
                    } else {
                        Surface surface = this.mSurface;
                        if (surface != null) {
                            this.mObsoleteSurfaces.add(surface);
                        }
                        surfaceCreateInputSurface = EncoderImpl.this.mMediaCodec.createInputSurface();
                        this.mSurface = surfaceCreateInputSurface;
                    }
                    onSurfaceUpdateListener = this.mSurfaceUpdateListener;
                    executor = this.mSurfaceUpdateExecutor;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (surfaceCreateInputSurface == null || onSurfaceUpdateListener == null || executor == null) {
                return;
            }
            notifySurfaceUpdate(executor, onSurfaceUpdateListener, surfaceCreateInputSurface);
        }

        @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput
        public void setOnSurfaceUpdateListener(Executor executor, Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
            Surface surface;
            synchronized (this.mLock) {
                this.mSurfaceUpdateListener = (Encoder.SurfaceInput.OnSurfaceUpdateListener) Preconditions.checkNotNull(onSurfaceUpdateListener);
                this.mSurfaceUpdateExecutor = (Executor) Preconditions.checkNotNull(executor);
                surface = this.mSurface;
            }
            if (surface != null) {
                notifySurfaceUpdate(executor, onSurfaceUpdateListener, surface);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2193i(EncoderImpl encoderImpl) {
        encoderImpl.mSourceStoppedSignalled = true;
        if (encoderImpl.mIsFlushedAfterEndOfStream) {
            if (!encoderImpl.mCodecStopAsFlushWorkaroundEnabled) {
                Logger.m1866d(encoderImpl.mTag, "mMediaCodec.stop()");
                encoderImpl.mMediaCodec.stop();
            }
            encoderImpl.reset();
        }
    }

    public void handleEncodeError(MediaCodec.CodecException codecException) {
        handleEncodeError(1, codecException.getMessage(), codecException);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop() {
        stop(-1L);
    }

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Surface createPersistentInputSurface() {
            return MediaCodec.createPersistentInputSurface();
        }

        public static void setInputSurface(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2185a(EncoderImpl encoderImpl) {
        if (encoderImpl.mPendingCodecStop) {
            Logger.m1872w(encoderImpl.mTag, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            encoderImpl.mLastDataStopTimestamp = null;
            encoderImpl.signalCodecStop();
            encoderImpl.mPendingCodecStop = false;
        }
    }

    private void addSignalEosTimeoutIfNeeded() {
        if (DeviceQuirks.get(SignalEosOutputBufferNotComeQuirk.class) != null) {
            final MediaCodecCallback mediaCodecCallback = this.mMediaCodecCallback;
            final Executor executor = this.mEncoderExecutor;
            Future<?> future = this.mSignalEosTimeoutFuture;
            if (future != null) {
                future.cancel(false);
            }
            this.mSignalEosTimeoutFuture = CameraXExecutors.mainThreadExecutor().schedule(new Runnable() { // from class: androidx.camera.video.internal.encoder.h
                @Override // java.lang.Runnable
                public final void run() {
                    EncoderImpl.m2190f(executor, mediaCodecCallback);
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2187c(EncoderImpl encoderImpl) {
        int iOrdinal = encoderImpl.mState.ordinal();
        if (iOrdinal == 1) {
            encoderImpl.requestKeyFrameToMediaCodec();
        } else if (iOrdinal == 6 || iOrdinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    private void clampVideoBitrateIfNotSupported(VideoEncoderInfo videoEncoderInfo, MediaFormat mediaFormat) {
        Preconditions.checkState(this.mIsVideoEncoder);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int iIntValue = ((Integer) videoEncoderInfo.getSupportedBitrateRange().clamp(Integer.valueOf(integer))).intValue();
            if (integer != iIntValue) {
                mediaFormat.setInteger("bitrate", iIntValue);
                Logger.m1866d(this.mTag, "updated bitrate from " + integer + " to " + iIntValue);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2189e(EncoderImpl encoderImpl, long j11) {
        switch (encoderImpl.mState) {
            case CONFIGURED:
            case PAUSED:
            case STOPPING:
            case PENDING_START_PAUSED:
            case ERROR:
                return;
            case STARTED:
                Logger.m1866d(encoderImpl.mTag, "Pause on " + DebugUtils.readableUs(j11));
                encoderImpl.mActivePauseResumeTimeRanges.addLast(Range.create(Long.valueOf(j11), Long.MAX_VALUE));
                encoderImpl.setState(InternalState.PAUSED);
                return;
            case PENDING_START:
                encoderImpl.setState(InternalState.PENDING_START_PAUSED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + encoderImpl.mState);
        }
    }

    public static boolean hasEndOfStreamFlag(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    private boolean hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk() {
        return DeviceQuirks.get(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null;
    }

    public static boolean isKeyFrame(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    private static boolean isRationalOne(Rational rational) {
        return rational != null && rational.getDenominator() == rational.getNumerator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSlowMotion() {
        return !isRationalOne(this.mCaptureToEncodeFrameRateRatio);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2195k(final EncoderImpl encoderImpl, long j11, long j12) {
        switch (encoderImpl.mState) {
            case CONFIGURED:
            case STOPPING:
            case ERROR:
                return;
            case STARTED:
            case PAUSED:
                InternalState internalState = encoderImpl.mState;
                encoderImpl.setState(InternalState.STOPPING);
                Long l11 = (Long) encoderImpl.mStartStopTimeRangeUs.getLower();
                long jLongValue = l11.longValue();
                if (jLongValue == Long.MAX_VALUE) {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                if (j11 == -1) {
                    j11 = j12;
                } else if (j11 < jLongValue) {
                    Logger.m1872w(encoderImpl.mTag, "The expected stop time is less than the start time. Use current time as stop time.");
                    j11 = j12;
                }
                if (j11 < jLongValue) {
                    throw new AssertionError("The start time should be before the stop time.");
                }
                encoderImpl.mStartStopTimeRangeUs = Range.create(l11, Long.valueOf(j11));
                Logger.m1866d(encoderImpl.mTag, "Stop on " + DebugUtils.readableUs(j11));
                if (internalState == InternalState.PAUSED && encoderImpl.mLastDataStopTimestamp != null) {
                    encoderImpl.signalCodecStop();
                    return;
                } else {
                    encoderImpl.mPendingCodecStop = true;
                    encoderImpl.mStopTimeoutFuture = CameraXExecutors.mainThreadExecutor().schedule(new Runnable() { // from class: androidx.camera.video.internal.encoder.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            EncoderImpl encoderImpl2 = this.f2020b;
                            encoderImpl2.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    EncoderImpl.m2185a(encoderImpl2);
                                }
                            });
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                    return;
                }
            case PENDING_START:
            case PENDING_START_PAUSED:
                encoderImpl.setState(InternalState.CONFIGURED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + encoderImpl.mState);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m2196l(EncoderImpl encoderImpl, long j11) {
        switch (encoderImpl.mState) {
            case CONFIGURED:
                encoderImpl.mLastDataStopTimestamp = null;
                Logger.m1866d(encoderImpl.mTag, "Start on " + DebugUtils.readableUs(j11));
                try {
                    if (encoderImpl.mIsFlushedAfterEndOfStream) {
                        encoderImpl.reset();
                    }
                    encoderImpl.mStartStopTimeRangeUs = Range.create(Long.valueOf(j11), Long.MAX_VALUE);
                    Logger.m1866d(encoderImpl.mTag, "mMediaCodec.start()");
                    encoderImpl.mMediaCodec.start();
                    Encoder.EncoderInput encoderInput = encoderImpl.mEncoderInput;
                    if (encoderInput instanceof ByteBufferInput) {
                        ((ByteBufferInput) encoderInput).setActive(true);
                    }
                    encoderImpl.setState(InternalState.STARTED);
                    return;
                } catch (MediaCodec.CodecException e11) {
                    encoderImpl.handleEncodeError(e11);
                    return;
                }
            case STARTED:
            case PENDING_START:
            case ERROR:
                return;
            case PAUSED:
                encoderImpl.mLastDataStopTimestamp = null;
                Range<Long> rangeRemoveLast = encoderImpl.mActivePauseResumeTimeRanges.removeLast();
                Preconditions.checkState(rangeRemoveLast != null && ((Long) rangeRemoveLast.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l11 = (Long) rangeRemoveLast.getLower();
                long jLongValue = l11.longValue();
                encoderImpl.mActivePauseResumeTimeRanges.addLast(Range.create(l11, Long.valueOf(j11)));
                Logger.m1866d(encoderImpl.mTag, "Resume on " + DebugUtils.readableUs(j11) + "\nPaused duration = " + DebugUtils.readableUs(j11 - jLongValue));
                if ((encoderImpl.mIsVideoEncoder || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!encoderImpl.mIsVideoEncoder || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    encoderImpl.setMediaCodecPaused(false);
                    Encoder.EncoderInput encoderInput2 = encoderImpl.mEncoderInput;
                    if (encoderInput2 instanceof ByteBufferInput) {
                        ((ByteBufferInput) encoderInput2).setActive(true);
                    }
                }
                if (encoderImpl.mIsVideoEncoder) {
                    encoderImpl.requestKeyFrameToMediaCodec();
                }
                encoderImpl.setState(InternalState.STARTED);
                return;
            case STOPPING:
            case PENDING_START_PAUSED:
                encoderImpl.setState(InternalState.PENDING_START);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + encoderImpl.mState);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m2200p(EncoderImpl encoderImpl, List list, Runnable runnable) {
        if (encoderImpl.mState != InternalState.ERROR) {
            if (!list.isEmpty()) {
                Logger.m1866d(encoderImpl.mTag, "encoded data and input buffers are returned");
            }
            if (!(encoderImpl.mEncoderInput instanceof SurfaceInput) || encoderImpl.mSourceStoppedSignalled || encoderImpl.hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk()) {
                Logger.m1866d(encoderImpl.mTag, "mMediaCodec.stop()");
                encoderImpl.mMediaCodec.stop();
            } else {
                if (encoderImpl.mCodecStopAsFlushWorkaroundEnabled) {
                    Logger.m1866d(encoderImpl.mTag, "mMediaCodec.stop()");
                    encoderImpl.mMediaCodec.stop();
                } else {
                    Logger.m1866d(encoderImpl.mTag, "mMediaCodec.flush()");
                    encoderImpl.mMediaCodec.flush();
                }
                encoderImpl.mIsFlushedAfterEndOfStream = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        encoderImpl.handleStopped();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m2201q(EncoderImpl encoderImpl) {
        switch (encoderImpl.mState) {
            case CONFIGURED:
            case STARTED:
            case PAUSED:
            case ERROR:
                encoderImpl.releaseInternal();
                return;
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
                encoderImpl.setState(InternalState.PENDING_RELEASE);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + encoderImpl.mState);
        }
    }

    private void releaseInternal() {
        Logger.m1866d(this.mTag, "releaseInternal");
        if (this.mIsFlushedAfterEndOfStream) {
            if (!this.mCodecStopAsFlushWorkaroundEnabled) {
                Logger.m1866d(this.mTag, "mMediaCodec.stop()");
                this.mMediaCodec.stop();
            }
            this.mIsFlushedAfterEndOfStream = false;
        }
        Logger.m1866d(this.mTag, "mMediaCodec.release()");
        this.mMediaCodec.release();
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof SurfaceInput) {
            ((SurfaceInput) encoderInput).releaseSurface();
        }
        setState(InternalState.RELEASED);
        this.mReleasedCompleter.set(null);
    }

    private void reset() {
        this.mStartStopTimeRangeUs = NO_RANGE;
        this.mTotalPausedDurationUs = 0L;
        this.mActivePauseResumeTimeRanges.clear();
        this.mFreeInputBufferIndexQueue.clear();
        Iterator<CallbackToFutureAdapter.Completer<InputBuffer>> it = this.mAcquisitionQueue.iterator();
        while (it.hasNext()) {
            it.next().setCancelled();
        }
        this.mAcquisitionQueue.clear();
        Logger.m1866d(this.mTag, "mMediaCodec.reset()");
        this.mMediaCodec.reset();
        this.mIsFlushedAfterEndOfStream = false;
        this.mSourceStoppedSignalled = false;
        this.mMediaCodecEosSignalled = false;
        this.mPendingCodecStop = false;
        Future<?> future = this.mStopTimeoutFuture;
        if (future != null) {
            future.cancel(true);
            this.mStopTimeoutFuture = null;
        }
        Future<?> future2 = this.mSignalEosTimeoutFuture;
        if (future2 != null) {
            future2.cancel(false);
            this.mSignalEosTimeoutFuture = null;
        }
        MediaCodecCallback mediaCodecCallback = this.mMediaCodecCallback;
        if (mediaCodecCallback != null) {
            mediaCodecCallback.stop();
        }
        this.mMediaCodecCallback = new MediaCodecCallback();
        Logger.m1866d(this.mTag, "mMediaCodec.setCallback()");
        this.mMediaCodec.setCallback(this.mMediaCodecCallback);
        Logger.m1866d(this.mTag, "mMediaCodec.configure()");
        this.mMediaCodec.configure(this.mMediaFormat, (Surface) null, (MediaCrypto) null, 1);
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof SurfaceInput) {
            ((SurfaceInput) encoderInput).resetSurface();
        }
    }

    private void setState(InternalState internalState) {
        if (this.mState == internalState) {
            return;
        }
        Logger.m1866d(this.mTag, "Transitioning encoder internal state: " + this.mState + " --> " + internalState);
        this.mState = internalState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signalEndOfInputStream() {
        Logger.m1866d(this.mTag, "signalEndOfInputStream");
        Futures.addCallback(acquireInputBuffer(), new FutureCallback<InputBuffer>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                EncoderImpl.this.handleEncodeError(0, "Unable to acquire InputBuffer.", th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(InputBuffer inputBuffer) {
                inputBuffer.setPresentationTimeUs(EncoderImpl.this.generatePresentationTimeUs());
                inputBuffer.setEndOfStream(true);
                inputBuffer.submit();
                Futures.addCallback(inputBuffer.getTerminationFuture(), new FutureCallback<Void>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.1.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(Void r11) {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable th2) {
                        if (th2 instanceof MediaCodec.CodecException) {
                            EncoderImpl.this.handleEncodeError((MediaCodec.CodecException) th2);
                        } else {
                            EncoderImpl.this.handleEncodeError(0, th2.getMessage(), th2);
                        }
                    }
                }, EncoderImpl.this.mEncoderExecutor);
            }
        }, this.mEncoderExecutor);
    }

    private static TimeProvider transformTimeProvider(final TimeProvider timeProvider, final Function<Long, Long> function) {
        return new TimeProvider() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.3
            @Override // androidx.camera.video.internal.encoder.TimeProvider
            public long realtimeUs() {
                return ((Long) function.apply(Long.valueOf(timeProvider.realtimeUs()))).longValue();
            }

            @Override // androidx.camera.video.internal.encoder.TimeProvider
            public long uptimeUs() {
                return ((Long) function.apply(Long.valueOf(timeProvider.uptimeUs()))).longValue();
            }
        };
    }

    public ListenableFuture<InputBuffer> acquireInputBuffer() {
        switch (this.mState) {
            case CONFIGURED:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final AtomicReference atomicReference = new AtomicReference();
                ListenableFuture<InputBuffer> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.j
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return EncoderImpl.m2202r(atomicReference, completer);
                    }
                });
                final CallbackToFutureAdapter.Completer<InputBuffer> completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
                this.mAcquisitionQueue.offer(completer);
                completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2042b.mAcquisitionQueue.remove(completer);
                    }
                }, this.mEncoderExecutor);
                matchAcquisitionsAndFreeBufferIndexes();
                return future;
            case ERROR:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    public long generatePresentationTimeUs() {
        return this.mTimeProvider.uptimeUs();
    }

    public long getAdjustedTimeUs(MediaCodec.BufferInfo bufferInfo) {
        long j11 = this.mTotalPausedDurationUs;
        return j11 > 0 ? bufferInfo.presentationTimeUs - j11 : bufferInfo.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public int getConfiguredBitrate() {
        if (this.mMediaFormat.containsKey("bitrate")) {
            return this.mMediaFormat.getInteger("bitrate");
        }
        return 0;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public EncoderInfo getEncoderInfo() {
        return this.mEncoderInfo;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public Encoder.EncoderInput getInput() {
        return this.mEncoderInput;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public ListenableFuture<Void> getReleasedFuture() {
        return this.mReleasedFuture;
    }

    public void handleEncodeError(final int i11, final String str, final Throwable th2) {
        switch (this.mState) {
            case CONFIGURED:
                notifyError(i11, str, th2);
                reset();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                setState(InternalState.ERROR);
                stopMediaCodec(new Runnable() { // from class: androidx.camera.video.internal.encoder.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2071b.notifyError(i11, str, th2);
                    }
                });
                break;
            case ERROR:
                Logger.m1873w(this.mTag, "Get more than one error: " + str + "(" + i11 + ")", th2);
                break;
        }
    }

    public void handleStopped() {
        InternalState internalState = this.mState;
        if (internalState == InternalState.PENDING_RELEASE) {
            releaseInternal();
            return;
        }
        if (!this.mIsFlushedAfterEndOfStream) {
            reset();
        }
        setState(InternalState.CONFIGURED);
        if (internalState == InternalState.PENDING_START || internalState == InternalState.PENDING_START_PAUSED) {
            start();
            if (internalState == InternalState.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    public boolean isInPauseRange(long j11) {
        for (Range<Long> range : this.mActivePauseResumeTimeRanges) {
            if (range.contains(Long.valueOf(j11))) {
                return true;
            }
            if (j11 < ((Long) range.getLower()).longValue()) {
                break;
            }
        }
        return false;
    }

    public void matchAcquisitionsAndFreeBufferIndexes() {
        while (!this.mAcquisitionQueue.isEmpty() && !this.mFreeInputBufferIndexQueue.isEmpty()) {
            CallbackToFutureAdapter.Completer completerPoll = this.mAcquisitionQueue.poll();
            Objects.requireNonNull(completerPoll);
            Integer numPoll = this.mFreeInputBufferIndexQueue.poll();
            Objects.requireNonNull(numPoll);
            try {
                final InputBufferImpl inputBufferImpl = new InputBufferImpl(this.mMediaCodec, numPoll.intValue()) { // from class: androidx.camera.video.internal.encoder.EncoderImpl.2
                    @Override // androidx.camera.video.internal.encoder.InputBufferImpl, androidx.camera.video.internal.encoder.InputBuffer
                    public void setPresentationTimeUs(long j11) {
                        EncoderImpl encoderImpl = EncoderImpl.this;
                        if (!encoderImpl.mIsVideoEncoder) {
                            j11 = encoderImpl.toPresentationTimeUsByCaptureEncodeRatio(j11);
                        }
                        super.setPresentationTimeUs(j11);
                    }
                };
                if (completerPoll.set(inputBufferImpl)) {
                    this.mInputBufferSet.add(inputBufferImpl);
                    inputBufferImpl.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2047b.mInputBufferSet.remove(inputBufferImpl);
                        }
                    }, this.mEncoderExecutor);
                } else {
                    inputBufferImpl.cancel();
                }
            } catch (MediaCodec.CodecException e11) {
                handleEncodeError(e11);
                return;
            }
        }
    }

    public void notifyError(final int i11, final String str, final Throwable th2) {
        final EncoderCallback encoderCallback;
        Executor executor;
        synchronized (this.mLock) {
            encoderCallback = this.mEncoderCallback;
            executor = this.mEncoderCallbackExecutor;
        }
        try {
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.c
                @Override // java.lang.Runnable
                public final void run() {
                    encoderCallback.onEncodeError(new EncodeException(i11, str, th2));
                }
            });
        } catch (RejectedExecutionException e11) {
            Logger.m1869e(this.mTag, "Unable to post to the supplied executor.", e11);
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void release() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.q
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m2201q(this.f2062b);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void requestKeyFrame() {
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.r
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m2187c(this.f2065b);
            }
        });
    }

    public void requestKeyFrameToMediaCodec() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        Logger.m1866d(this.mTag, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.mMediaCodec.setParameters(bundle);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void setEncoderCallback(EncoderCallback encoderCallback, Executor executor) {
        synchronized (this.mLock) {
            this.mEncoderCallback = encoderCallback;
            this.mEncoderCallbackExecutor = executor;
        }
    }

    public void setMediaCodecPaused(boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z11 ? 1 : 0);
        Logger.m1866d(this.mTag, "mMediaCodec.setParameters - setMediaCodecPaused: " + z11);
        this.mMediaCodec.setParameters(bundle);
    }

    public void signalCodecStop() {
        Logger.m1866d(this.mTag, "signalCodecStop");
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof ByteBufferInput) {
            ((ByteBufferInput) encoderInput).setActive(false);
            ArrayList arrayList = new ArrayList();
            Iterator<InputBuffer> it = this.mInputBufferSet.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getTerminationFuture());
            }
            Futures.successfulAsList(arrayList).addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2017b.signalEndOfInputStream();
                }
            }, this.mEncoderExecutor);
            return;
        }
        if (encoderInput instanceof SurfaceInput) {
            try {
                addSignalEosTimeoutIfNeeded();
                Logger.m1866d(this.mTag, "mMediaCodec.signalEndOfInputStream()");
                this.mMediaCodec.signalEndOfInputStream();
                this.mMediaCodecEosSignalled = true;
            } catch (MediaCodec.CodecException e11) {
                handleEncodeError(e11);
            }
        }
    }

    public void signalSourceStopped() {
        Logger.m1866d(this.mTag, "signalSourceStopped");
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.s
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m2193i(this.f2067b);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void stop(final long j11) {
        final long jGeneratePresentationTimeUs = generatePresentationTimeUs();
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.g
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m2195k(this.f2027b, j11, jGeneratePresentationTimeUs);
            }
        });
    }

    public void stopMediaCodec(final Runnable runnable) {
        Logger.m1866d(this.mTag, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator<EncodedDataImpl> it = this.mEncodedDataSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClosedFuture());
        }
        Iterator<InputBuffer> it2 = this.mInputBufferSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getTerminationFuture());
        }
        if (!arrayList.isEmpty()) {
            Logger.m1866d(this.mTag, "Waiting for resources to return. encoded data = " + this.mEncodedDataSet.size() + ", input buffers = " + this.mInputBufferSet.size());
        }
        Futures.successfulAsList(arrayList).addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.t
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m2200p(this.f2068b, arrayList, runnable);
            }
        }, this.mEncoderExecutor);
    }

    public void updateTotalPausedDuration(long j11) {
        while (!this.mActivePauseResumeTimeRanges.isEmpty()) {
            Range<Long> first = this.mActivePauseResumeTimeRanges.getFirst();
            if (j11 <= ((Long) first.getUpper()).longValue()) {
                return;
            }
            this.mActivePauseResumeTimeRanges.removeFirst();
            this.mTotalPausedDurationUs += ((Long) first.getUpper()).longValue() - ((Long) first.getLower()).longValue();
            Logger.m1866d(this.mTag, "Total paused duration = " + DebugUtils.readableUs(this.mTotalPausedDurationUs));
        }
    }

    public EncoderImpl(Executor executor, EncoderConfig encoderConfig, int i11) throws InvalidConfigException {
        boolean z11 = false;
        Preconditions.checkNotNull(executor);
        this.mEncoderConfig = (EncoderConfig) Preconditions.checkNotNull(encoderConfig);
        MediaCodec mediaCodecCreateCodec = CodecUtil.createCodec(encoderConfig);
        this.mMediaCodec = mediaCodecCreateCodec;
        MediaCodecInfo codecInfo = mediaCodecCreateCodec.getCodecInfo();
        this.mEncoderExecutor = CameraXExecutors.newSequentialExecutor(executor);
        MediaFormat mediaFormat = encoderConfig.toMediaFormat();
        this.mMediaFormat = mediaFormat;
        Timebase inputTimebase = encoderConfig.getInputTimebase();
        this.mInputTimebase = inputTimebase;
        this.mTimeProvider = transformTimeProvider(new SystemTimeProvider(), new Function() { // from class: androidx.camera.video.internal.encoder.m
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return Long.valueOf(this.f2051a.toPresentationTimeUsByCaptureEncodeRatio(((Long) obj).longValue()));
            }
        });
        if (encoderConfig instanceof AudioEncoderConfig) {
            AudioEncoderConfig audioEncoderConfig = (AudioEncoderConfig) encoderConfig;
            this.mTag = "AudioEncoder";
            this.mIsVideoEncoder = false;
            this.mEncoderInput = new ByteBufferInput();
            this.mEncoderInfo = new AudioEncoderInfoImpl(codecInfo, encoderConfig.getMimeType());
            this.mCaptureToEncodeFrameRateRatio = new Rational(audioEncoderConfig.getCaptureSampleRate(), audioEncoderConfig.getEncodeSampleRate());
        } else if (encoderConfig instanceof VideoEncoderConfig) {
            VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) encoderConfig;
            this.mTag = "VideoEncoder";
            this.mIsVideoEncoder = true;
            this.mEncoderInput = new SurfaceInput();
            VideoEncoderInfoImpl videoEncoderInfoImpl = new VideoEncoderInfoImpl(codecInfo, encoderConfig.getMimeType());
            clampVideoBitrateIfNotSupported(videoEncoderInfoImpl, mediaFormat);
            this.mEncoderInfo = videoEncoderInfoImpl;
            this.mCaptureToEncodeFrameRateRatio = new Rational(videoEncoderConfig.getCaptureFrameRate(), videoEncoderConfig.getEncodeFrameRate());
        } else {
            throw new InvalidConfigException("Unknown encoder config type");
        }
        Logger.m1866d(this.mTag, "mInputTimebase = " + inputTimebase);
        Logger.m1866d(this.mTag, "mMediaFormat = " + mediaFormat);
        Logger.m1866d(this.mTag, "mCaptureToEncodeFrameRateRatio = " + this.mCaptureToEncodeFrameRateRatio);
        try {
            reset();
            final AtomicReference atomicReference = new AtomicReference();
            this.mReleasedFuture = Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.n
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return EncoderImpl.m2198n(atomicReference, completer);
                }
            }));
            this.mReleasedCompleter = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
            if (this.mIsVideoEncoder && i11 == 1 && DeviceQuirks.get(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                z11 = true;
            }
            this.mCodecStopAsFlushWorkaroundEnabled = z11;
            setState(InternalState.CONFIGURED);
        } catch (MediaCodec.CodecException e11) {
            throw new InvalidConfigException(e11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2190f(Executor executor, final MediaCodecCallback mediaCodecCallback) {
        Objects.requireNonNull(mediaCodecCallback);
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.i
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodecCallback.reachEndData();
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Object m2198n(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return "mReleasedFuture";
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Object m2202r(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return "acquireInputBuffer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long toPresentationTimeUsByCaptureEncodeRatio(long j11) {
        if (isSlowMotion()) {
            return Math.round(j11 * this.mCaptureToEncodeFrameRateRatio.doubleValue());
        }
        return j11;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void pause() {
        final long jGeneratePresentationTimeUs = generatePresentationTimeUs();
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.o
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m2189e(this.f2056b, jGeneratePresentationTimeUs);
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public void start() {
        final long jGeneratePresentationTimeUs = generatePresentationTimeUs();
        this.mEncoderExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.f
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl.m2196l(this.f2023b, jGeneratePresentationTimeUs);
            }
        });
    }
}
