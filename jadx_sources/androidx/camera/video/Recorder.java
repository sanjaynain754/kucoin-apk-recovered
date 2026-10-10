package androidx.camera.video;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.MutableStateObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.StateObservable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.utils.ArrayRingBuffer;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.OutputStorage;
import androidx.camera.video.internal.OutputStorageImpl;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.compat.Api26Impl;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.camera.video.internal.config.AudioMimeInfo;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.BufferCopiedEncodedData;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.utils.OutputUtil;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.camera.video.internal.workaround.CorrectNegativeLatLongForMediaMuxer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public final class Recorder implements VideoOutput {
    private static final int AUDIO_CACHE_SIZE = 60;
    private static final Executor AUDIO_EXECUTOR;

    @VisibleForTesting
    static final EncoderFactory DEFAULT_ENCODER_FACTORY;
    public static final QualitySelector DEFAULT_QUALITY_SELECTOR;
    private static final String INSUFFICIENT_STORAGE_ERROR_MSG = "Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.";
    private static final String MEDIA_COLUMN = "_data";
    private static final MediaSpec MEDIA_SPEC_DEFAULT;
    private static final int NOT_PENDING = 0;
    private static final OutputStorage.Factory OUTPUT_STORAGE_FACTORY_DEFAULT;
    private static final int PENDING = 1;
    private static final Exception PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
    private static final long REQUIRED_FREE_STORAGE_DEFAULT_BYTES = 52428800;
    private static final long REQUIRED_FREE_STORAGE_UNSET = -1;
    private static final long RETRY_SETUP_VIDEO_DELAY_MS = 1000;
    private static final int RETRY_SETUP_VIDEO_MAX_COUNT = 3;
    private static final long SOURCE_NON_STREAMING_TIMEOUT_MS = 1000;
    private static final String TAG = "Recorder";
    public static final int VIDEO_CAPABILITIES_SOURCE_CAMCORDER_PROFILE = 0;
    public static final int VIDEO_CAPABILITIES_SOURCE_CODEC_CAPABILITIES = 1;
    static final int VIDEO_RECORDING_TYPE_HIGH_SPEED = 2;
    static final int VIDEO_RECORDING_TYPE_REGULAR = 1;
    private static final VideoSpec VIDEO_SPEC_DEFAULT;

    @VisibleForTesting
    static long sRetrySetupVideoDelayMs;

    @VisibleForTesting
    static int sRetrySetupVideoMaxCount;

    @GuardedBy("mLock")
    RecordingRecord mActiveRecordingRecord;
    Surface mActiveSurface;
    double mAudioAmplitude;
    Encoder mAudioEncoder;
    private final EncoderFactory mAudioEncoderFactory;
    Throwable mAudioErrorCause;
    OutputConfig mAudioOutputConfig;
    AudioSource mAudioSource;
    AudioState mAudioState;
    Integer mAudioTrackIndex;
    private long mAvailableBytesAboveRequired;
    long mDurationLimitNs;
    private final boolean mEncoderNotUsePersistentInputSurface;
    final List<ListenableFuture<Void>> mEncodingFutures;
    private final Executor mExecutor;
    long mFileSizeLimitInBytes;

    @VisibleForTesting
    long mFirstRecordingAudioDataTimeUs;

    @VisibleForTesting
    int mFirstRecordingVideoBitrate;

    @VisibleForTesting
    long mFirstRecordingVideoDataTimeUs;
    private boolean mHasGlProcessing;
    RecordingRecord mInProgressRecording;
    boolean mInProgressRecordingStopping;
    private SurfaceRequest.TransformationInfo mInProgressTransformationInfo;
    boolean mIsAudioSourceSilenced;
    private final MutableStateObservable<Boolean> mIsRecording;

    @GuardedBy("mLock")
    private long mLastGeneratedRecordingId;
    Surface mLatestSurface;
    SurfaceRequest mLatestSurfaceRequest;
    private final Object mLock = new Object();
    MediaMuxer mMediaMuxer;
    final MutableStateObservable<MediaSpec> mMediaSpec;
    private boolean mNeedsResetBeforeNextStart;

    @GuardedBy("mLock")
    private State mNonPendingState;
    private OutputStorage mOutputStorage;
    private final OutputStorage.Factory mOutputStorageFactory;
    Uri mOutputUri;
    final RingBuffer<EncodedData> mPendingAudioRingBuffer;
    EncodedData mPendingFirstVideoData;

    @GuardedBy("mLock")
    RecordingRecord mPendingRecordingRecord;
    long mPreviousRecordingAudioDataTimeUs;
    long mPreviousRecordingVideoDataTimeUs;
    long mRecordingAudioBytes;
    long mRecordingBytes;
    long mRecordingDurationNs;
    int mRecordingStopError;
    Throwable mRecordingStopErrorCause;
    private final long mRequiredFreeStorageBytes;
    private VideoValidatedEncoderProfilesProxy mResolvedEncoderProfiles;
    final Executor mSequentialExecutor;
    private SetupVideoTask mSetupVideoTask;
    private boolean mShouldSendResumeEvent;
    ScheduledFuture<?> mSourceNonStreamingTimeout;
    VideoOutput.SourceState mSourceState;
    private SurfaceRequest.TransformationInfo mSourceTransformationInfo;

    @GuardedBy("mLock")
    private State mState;

    @GuardedBy("mLock")
    int mStreamId;
    private final MutableStateObservable<StreamInfo> mStreamInfo;
    private final Executor mUserProvidedExecutor;
    private final int mVideoCapabilitiesSource;
    Encoder mVideoEncoder;
    private final MutableStateObservable<Range<Integer>> mVideoEncoderBitrateRange;
    private VideoEncoderConfig mVideoEncoderConfig;
    private final EncoderFactory mVideoEncoderFactory;
    VideoEncoderSession mVideoEncoderSession;
    VideoEncoderSession mVideoEncoderSessionToRelease;
    OutputConfig mVideoOutputConfig;
    Timebase mVideoSourceTimebase;
    Integer mVideoTrackIndex;
    private static final Set<State> PENDING_STATES = Collections.unmodifiableSet(EnumSet.of(State.PENDING_RECORDING, State.PENDING_PAUSED));
    private static final Set<State> VALID_NON_PENDING_STATES_WHILE_PENDING = Collections.unmodifiableSet(EnumSet.of(State.CONFIGURING, State.IDLING, State.RESETTING, State.STOPPING, State.ERROR));

    public enum AudioState {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    public static final class Builder {
        private EncoderFactory mAudioEncoderFactory;
        private final MediaSpec.Builder mMediaSpecBuilder;
        private OutputStorage.Factory mOutputStorageFactory;
        private long mRequiredFreeStorageBytes;
        private EncoderFactory mVideoEncoderFactory;
        private int mVideoCapabilitiesSource = 0;
        private Executor mExecutor = null;

        public Builder setVideoCapabilitiesSource(int i11) {
            boolean z11 = true;
            if (i11 != 0 && i11 != 1) {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "Not a supported video capabilities source: " + i11);
            this.mVideoCapabilitiesSource = i11;
            return this;
        }

        public Recorder build() {
            return new Recorder(this.mExecutor, this.mMediaSpecBuilder.build(), this.mVideoCapabilitiesSource, this.mVideoEncoderFactory, this.mAudioEncoderFactory, this.mOutputStorageFactory, this.mRequiredFreeStorageBytes);
        }

        public Builder setAspectRatio(final int i11) {
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.y
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setAspectRatio(i11);
                }
            });
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setAudioEncoderFactory(EncoderFactory encoderFactory) {
            this.mAudioEncoderFactory = encoderFactory;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setAudioSource(final int i11) {
            this.mMediaSpecBuilder.configureAudio(new Consumer() { // from class: androidx.camera.video.x
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((AudioSpec.Builder) obj).setSource(i11);
                }
            });
            return this;
        }

        public Builder setExecutor(Executor executor) {
            Preconditions.checkNotNull(executor, "The specified executor can't be null.");
            this.mExecutor = executor;
            return this;
        }

        public Builder setOutputStorageFactory(OutputStorage.Factory factory) {
            this.mOutputStorageFactory = factory;
            return this;
        }

        public Builder setQualitySelector(final QualitySelector qualitySelector) {
            Preconditions.checkNotNull(qualitySelector, "The specified quality selector can't be null.");
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.z
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setQualitySelector(qualitySelector);
                }
            });
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setRequiredFreeStorageBytes(@IntRange(from = 1) long j11) {
            Preconditions.checkArgument(j11 > 0);
            this.mRequiredFreeStorageBytes = j11;
            return this;
        }

        public Builder setTargetVideoEncodingBitRate(@IntRange(from = 1) final int i11) {
            if (i11 > 0) {
                this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.w
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        int i12 = i11;
                        ((VideoSpec.Builder) obj).setBitrate(new Range<>(Integer.valueOf(i12), Integer.valueOf(i12)));
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("The requested target bitrate " + i11 + " is not supported. Target bitrate must be greater than 0.");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setVideoEncoderFactory(EncoderFactory encoderFactory) {
            this.mVideoEncoderFactory = encoderFactory;
            return this;
        }

        public Builder() {
            EncoderFactory encoderFactory = Recorder.DEFAULT_ENCODER_FACTORY;
            this.mVideoEncoderFactory = encoderFactory;
            this.mAudioEncoderFactory = encoderFactory;
            this.mOutputStorageFactory = Recorder.OUTPUT_STORAGE_FACTORY_DEFAULT;
            this.mRequiredFreeStorageBytes = -1L;
            this.mMediaSpecBuilder = MediaSpec.builder();
        }
    }

    @AutoValue
    public static abstract class RecordingRecord implements AutoCloseable {
        private final CloseGuardHelper mCloseGuard = CloseGuardHelper.create();
        private final AtomicBoolean mInitialized = new AtomicBoolean(false);
        private final AtomicReference<MediaMuxerSupplier> mMediaMuxerSupplier = new AtomicReference<>(null);
        private final AtomicReference<AudioSourceSupplier> mAudioSourceSupplier = new AtomicReference<>(null);
        private final AtomicReference<Consumer<Uri>> mRecordingFinalizer = new AtomicReference<>(new Consumer() { // from class: androidx.camera.video.g0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                Recorder.RecordingRecord.m2133b((Uri) obj);
            }
        });
        private final AtomicBoolean mMuted = new AtomicBoolean(false);
        private final MutableStateObservable<Boolean> mRecordingState = MutableStateObservable.withInitialState(Boolean.FALSE);

        public interface AudioSourceSupplier {
            @RequiresPermission("android.permission.RECORD_AUDIO")
            AudioSource get(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException;
        }

        public interface MediaMuxerSupplier {
            MediaMuxer get(int i11, Consumer<Uri> consumer) throws IOException;
        }

        public abstract Executor getCallbackExecutor();

        public abstract Consumer<VideoRecordEvent> getEventListener();

        public abstract OutputOptions getOutputOptions();

        public abstract long getRecordingId();

        public abstract boolean hasAudioEnabled();

        public abstract boolean isPersistent();

        public void updateVideoRecordEvent(VideoRecordEvent videoRecordEvent) {
            updateVideoRecordEvent(videoRecordEvent, true);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2132a(String str, Uri uri) {
            if (uri == null) {
                Logger.m1868e(Recorder.TAG, String.format("File scanning operation failed [path: %s]", str));
            } else {
                Logger.m1866d(Recorder.TAG, String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        private void finalizeRecordingInternal(Consumer<Uri> consumer, Uri uri) {
            if (consumer != null) {
                this.mCloseGuard.close();
                consumer.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        public static RecordingRecord from(PendingRecording pendingRecording, long j11) {
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = new AutoValue_Recorder_RecordingRecord(pendingRecording.getOutputOptions(), pendingRecording.getListenerExecutor(), pendingRecording.getEventListener(), pendingRecording.getIsAudioEnabled(), pendingRecording.getIsPersistent(), j11);
            autoValue_Recorder_RecordingRecord.mute(pendingRecording.getIsAudioInitialMuted());
            return autoValue_Recorder_RecordingRecord;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m2134g(MediaStoreOutputOptions mediaStoreOutputOptions, Context context, Uri uri) throws Throwable {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uri, Recorder.MEDIA_COLUMN);
            if (absolutePathFromUri != null) {
                MediaScannerConnection.scanFile(context, new String[]{absolutePathFromUri}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: androidx.camera.video.e0
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        Recorder.RecordingRecord.m2132a(str, uri2);
                    }
                });
                return;
            }
            Logger.m1866d(Recorder.TAG, "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m2135h(MediaStoreOutputOptions mediaStoreOutputOptions, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            mediaStoreOutputOptions.getContentResolver().update(uri, contentValues, null, null);
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ MediaMuxer m2137j(OutputOptions outputOptions, ParcelFileDescriptor parcelFileDescriptor, int i11, Consumer consumer) throws Throwable {
            MediaMuxer mediaMuxerCreateMediaMuxer;
            MediaMuxer mediaMuxerCreateMediaMuxer2;
            Uri uriFromFile = Uri.EMPTY;
            if (outputOptions instanceof FileOutputOptions) {
                File file = ((FileOutputOptions) outputOptions).getFile();
                if (!OutputUtil.createParentFolder(file)) {
                    Logger.m1872w(Recorder.TAG, "Failed to create folder for " + file.getAbsolutePath());
                }
                mediaMuxerCreateMediaMuxer2 = new MediaMuxer(file.getAbsolutePath(), i11);
                uriFromFile = Uri.fromFile(file);
            } else if (outputOptions instanceof FileDescriptorOutputOptions) {
                if (Build.VERSION.SDK_INT < 26) {
                    throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                }
                mediaMuxerCreateMediaMuxer2 = Api26Impl.createMediaMuxer(parcelFileDescriptor.getFileDescriptor(), i11);
            } else {
                if (!(outputOptions instanceof MediaStoreOutputOptions)) {
                    throw new AssertionError("Invalid output options type: " + outputOptions.getClass().getSimpleName());
                }
                MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                ContentValues contentValues = new ContentValues(mediaStoreOutputOptions.getContentValues());
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                try {
                    Uri uriInsert = mediaStoreOutputOptions.getContentResolver().insert(mediaStoreOutputOptions.getCollectionUri(), contentValues);
                    if (uriInsert == null) {
                        throw new IOException("Unable to create MediaStore entry.");
                    }
                    if (i12 < 26) {
                        String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uriInsert, Recorder.MEDIA_COLUMN);
                        if (absolutePathFromUri == null) {
                            throw new IOException("Unable to get path from uri " + uriInsert);
                        }
                        if (!OutputUtil.createParentFolder(new File(absolutePathFromUri))) {
                            Logger.m1872w(Recorder.TAG, "Failed to create folder for " + absolutePathFromUri);
                        }
                        mediaMuxerCreateMediaMuxer = new MediaMuxer(absolutePathFromUri, i11);
                    } else {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = mediaStoreOutputOptions.getContentResolver().openFileDescriptor(uriInsert, "rw");
                        mediaMuxerCreateMediaMuxer = Api26Impl.createMediaMuxer(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), i11);
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    uriFromFile = uriInsert;
                    mediaMuxerCreateMediaMuxer2 = mediaMuxerCreateMediaMuxer;
                } catch (RuntimeException e11) {
                    throw new IOException("Unable to create MediaStore entry by " + e11, e11);
                }
            }
            consumer.accept(uriFromFile);
            return mediaMuxerCreateMediaMuxer2;
        }

        private void updateRecordingState(VideoRecordEvent videoRecordEvent) {
            if ((videoRecordEvent instanceof VideoRecordEvent.Start) || (videoRecordEvent instanceof VideoRecordEvent.Resume)) {
                this.mRecordingState.setState(Boolean.TRUE);
            } else if ((videoRecordEvent instanceof VideoRecordEvent.Pause) || (videoRecordEvent instanceof VideoRecordEvent.Finalize)) {
                this.mRecordingState.setState(Boolean.FALSE);
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            finalizeRecording(Uri.EMPTY);
        }

        public void finalize() throws Throwable {
            try {
                this.mCloseGuard.warnIfOpen();
                Consumer<Uri> andSet = this.mRecordingFinalizer.getAndSet(null);
                if (andSet != null) {
                    finalizeRecordingInternal(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public void finalizeRecording(Uri uri) {
            if (this.mInitialized.get()) {
                finalizeRecordingInternal(this.mRecordingFinalizer.getAndSet(null), uri);
            }
        }

        public StateObservable<Boolean> getRecordingState() {
            return this.mRecordingState;
        }

        public void initializeRecording(final Context context) throws IOException {
            if (this.mInitialized.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final OutputOptions outputOptions = getOutputOptions();
            boolean z11 = outputOptions instanceof FileDescriptorOutputOptions;
            Consumer<Uri> consumer = null;
            final ParcelFileDescriptor parcelFileDescriptorDup = z11 ? ((FileDescriptorOutputOptions) outputOptions).getParcelFileDescriptor().dup() : null;
            this.mCloseGuard.open("finalizeRecording");
            this.mMediaMuxerSupplier.set(new MediaMuxerSupplier() { // from class: androidx.camera.video.a0
                @Override // androidx.camera.video.Recorder.RecordingRecord.MediaMuxerSupplier
                public final MediaMuxer get(int i11, Consumer consumer2) {
                    return Recorder.RecordingRecord.m2137j(outputOptions, parcelFileDescriptorDup, i11, consumer2);
                }
            });
            if (hasAudioEnabled()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.mAudioSourceSupplier.set(new AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.1
                        @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                        @RequiresPermission("android.permission.RECORD_AUDIO")
                        public AudioSource get(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException {
                            return new AudioSource(audioSettings, executor, context);
                        }
                    });
                } else {
                    this.mAudioSourceSupplier.set(new AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.2
                        @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                        @RequiresPermission("android.permission.RECORD_AUDIO")
                        public AudioSource get(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException {
                            return new AudioSource(audioSettings, executor, null);
                        }
                    });
                }
            }
            if (outputOptions instanceof MediaStoreOutputOptions) {
                final MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                consumer = Build.VERSION.SDK_INT >= 29 ? new Consumer() { // from class: androidx.camera.video.b0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.RecordingRecord.m2135h(mediaStoreOutputOptions, (Uri) obj);
                    }
                } : new Consumer() { // from class: androidx.camera.video.c0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) throws Throwable {
                        Recorder.RecordingRecord.m2134g(mediaStoreOutputOptions, context, (Uri) obj);
                    }
                };
            } else if (z11) {
                consumer = new Consumer() { // from class: androidx.camera.video.d0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.RecordingRecord.m2138k(parcelFileDescriptorDup, (Uri) obj);
                    }
                };
            }
            if (consumer != null) {
                this.mRecordingFinalizer.set(consumer);
            }
        }

        public boolean isMuted() {
            return this.mMuted.get();
        }

        public void mute(boolean z11) {
            this.mMuted.set(z11);
        }

        public MediaMuxer performOneTimeMediaMuxerCreation(int i11, Consumer<Uri> consumer) throws IOException {
            if (!this.mInitialized.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            MediaMuxerSupplier andSet = this.mMediaMuxerSupplier.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.get(i11, consumer);
            } catch (RuntimeException e11) {
                throw new IOException("Failed to create MediaMuxer by " + e11, e11);
            }
        }

        public void updateVideoRecordEvent(final VideoRecordEvent videoRecordEvent, boolean z11) {
            if (!Objects.equals(videoRecordEvent.getOutputOptions(), getOutputOptions())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + videoRecordEvent.getOutputOptions() + ", Expected: " + getOutputOptions() + "]");
            }
            if (z11) {
                String str = "Sending VideoRecordEvent " + videoRecordEvent.getClass().getSimpleName();
                if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                    VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) videoRecordEvent;
                    if (finalize.hasError()) {
                        str = str + String.format(" [error: %s]", VideoRecordEvent.Finalize.errorToString(finalize.getError()));
                    }
                }
                Logger.m1866d(Recorder.TAG, str);
            }
            updateRecordingState(videoRecordEvent);
            if (getCallbackExecutor() == null || getEventListener() == null) {
                return;
            }
            try {
                getCallbackExecutor().execute(new Runnable() { // from class: androidx.camera.video.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1959b.getEventListener().accept(videoRecordEvent);
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.m1869e(Recorder.TAG, "The callback executor is invalid.", e11);
            }
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m2138k(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e11) {
                Logger.m1869e(Recorder.TAG, "Failed to close dup'd ParcelFileDescriptor", e11);
            }
        }

        @RequiresPermission("android.permission.RECORD_AUDIO")
        public AudioSource performOneTimeAudioSourceCreation(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException {
            if (hasAudioEnabled()) {
                AudioSourceSupplier andSet = this.mAudioSourceSupplier.getAndSet(null);
                if (andSet != null) {
                    return andSet.get(audioSettings, executor);
                }
                throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m2133b(Uri uri) {
        }
    }

    public class SetupVideoTask {
        private final int mMaxRetryCount;
        private final SurfaceRequest mSurfaceRequest;
        private final Timebase mTimebase;
        private boolean mIsFailedRetryCanceled = false;
        private int mRetryCount = 0;
        private ScheduledFuture<?> mRetryFuture = null;

        /* JADX INFO: renamed from: androidx.camera.video.Recorder$SetupVideoTask$1 */
        public class C12711 implements FutureCallback<Encoder> {
            final /* synthetic */ VideoEncoderSession val$videoEncoderSession;

            public C12711(VideoEncoderSession videoEncoderSession) {
                this.val$videoEncoderSession = videoEncoderSession;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m2140a(C12711 c12711) {
                if (SetupVideoTask.this.mIsFailedRetryCanceled) {
                    return;
                }
                Logger.m1866d(Recorder.TAG, "Retry setupVideo #" + SetupVideoTask.this.mRetryCount);
                SetupVideoTask setupVideoTask = SetupVideoTask.this;
                setupVideoTask.setupVideo(setupVideoTask.mSurfaceRequest, SetupVideoTask.this.mTimebase);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                Logger.m1873w(Recorder.TAG, "VideoEncoder Setup error: " + th2, th2);
                if (SetupVideoTask.this.mRetryCount >= SetupVideoTask.this.mMaxRetryCount) {
                    Recorder.this.onEncoderSetupError(th2);
                    return;
                }
                SetupVideoTask.access$608(SetupVideoTask.this);
                SetupVideoTask.this.mRetryFuture = Recorder.scheduleTask(new Runnable() { // from class: androidx.camera.video.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Recorder.SetupVideoTask.C12711.m2140a(this.f1969b);
                    }
                }, Recorder.this.mSequentialExecutor, Recorder.sRetrySetupVideoDelayMs, TimeUnit.MILLISECONDS);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Encoder encoder) {
                Logger.m1866d(Recorder.TAG, "VideoEncoder is created. " + encoder);
                if (encoder == null) {
                    return;
                }
                Preconditions.checkState(Recorder.this.mVideoEncoderSession == this.val$videoEncoderSession);
                Preconditions.checkState(Recorder.this.mVideoEncoder == null);
                Recorder.this.onVideoEncoderReady(this.val$videoEncoderSession);
                Recorder.this.onConfigured();
            }
        }

        public SetupVideoTask(SurfaceRequest surfaceRequest, Timebase timebase, boolean z11, int i11) {
            this.mSurfaceRequest = surfaceRequest;
            this.mTimebase = timebase;
            Recorder.this.mHasGlProcessing = z11;
            this.mMaxRetryCount = i11;
        }

        public static /* synthetic */ int access$608(SetupVideoTask setupVideoTask) {
            int i11 = setupVideoTask.mRetryCount;
            setupVideoTask.mRetryCount = i11 + 1;
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setupVideo(final SurfaceRequest surfaceRequest, final Timebase timebase) {
            Recorder.this.safeToCloseVideoEncoder().addListener(new Runnable() { // from class: androidx.camera.video.h0
                @Override // java.lang.Runnable
                public final void run() {
                    Recorder.SetupVideoTask.m2139a(this.f1964b, surfaceRequest, timebase);
                }
            }, Recorder.this.mSequentialExecutor);
        }

        public void cancelFailedRetry() {
            if (this.mIsFailedRetryCanceled) {
                return;
            }
            this.mIsFailedRetryCanceled = true;
            ScheduledFuture<?> scheduledFuture = this.mRetryFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.mRetryFuture = null;
            }
        }

        public void start() {
            setupVideo(this.mSurfaceRequest, this.mTimebase);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2139a(SetupVideoTask setupVideoTask, SurfaceRequest surfaceRequest, Timebase timebase) {
            setupVideoTask.getClass();
            if (!surfaceRequest.isServiced() && (!Recorder.this.mVideoEncoderSession.isConfiguredSurfaceRequest(surfaceRequest) || Recorder.this.isPersistentRecordingInProgress())) {
                EncoderFactory encoderFactory = Recorder.this.mVideoEncoderFactory;
                Recorder recorder = Recorder.this;
                VideoEncoderSession videoEncoderSession = new VideoEncoderSession(encoderFactory, recorder.mSequentialExecutor, recorder.mExecutor);
                Recorder recorder2 = Recorder.this;
                MediaSpec mediaSpec = (MediaSpec) recorder2.getObservableData(recorder2.mMediaSpec);
                DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
                VideoEncoderConfig videoEncoderConfigWorkaroundDataSpaceIfRequired = VideoConfigUtil.workaroundDataSpaceIfRequired(VideoConfigUtil.resolveVideoEncoderConfig(VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, Recorder.this.mResolvedEncoderProfiles), timebase, mediaSpec.getVideoSpec(), surfaceRequest.getResolution(), dynamicRange, surfaceRequest.getExpectedFrameRate()), Recorder.this.mHasGlProcessing);
                Recorder.this.mVideoEncoderConfig = videoEncoderConfigWorkaroundDataSpaceIfRequired;
                ListenableFuture<Encoder> listenableFutureConfigure = videoEncoderSession.configure(surfaceRequest, videoEncoderConfigWorkaroundDataSpaceIfRequired);
                Recorder.this.mVideoEncoderSession = videoEncoderSession;
                Futures.addCallback(listenableFutureConfigure, setupVideoTask.new C12711(videoEncoderSession), Recorder.this.mSequentialExecutor);
                return;
            }
            Logger.m1872w(Recorder.TAG, "Ignore the SurfaceRequest " + surfaceRequest + " isServiced: " + surfaceRequest.isServiced() + " VideoEncoderSession: " + Recorder.this.mVideoEncoderSession + " has been configured with a persistent in-progress recording.");
        }
    }

    public enum State {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    @ExperimentalHighSpeedVideo
    public static VideoCapabilities getHighSpeedVideoCapabilities(CameraInfo cameraInfo) {
        return getHighSpeedVideoCapabilities(cameraInfo, 0);
    }

    public static VideoCapabilities getVideoCapabilities(CameraInfo cameraInfo) {
        return getVideoCapabilitiesInternal(1, cameraInfo, 0);
    }

    private static boolean isSameRecording(Recording recording, RecordingRecord recordingRecord) {
        return recordingRecord != null && recording.getRecordingId() == recordingRecord.getRecordingId();
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo, int i11) {
        return getVideoCapabilitiesInternal(i11 == 1 ? 2 : 1, cameraInfo, this.mVideoCapabilitiesSource);
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        onSurfaceRequested(surfaceRequest, Timebase.UPTIME, false);
    }

    public PendingRecording prepareRecording(Context context, FileOutputOptions fileOutputOptions) {
        return prepareRecordingInternal(context, fileOutputOptions);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setVideoEncodingFrameRate(@IntRange(from = 1) final int i11) {
        Preconditions.checkArgument(i11 >= 1, "frameRate must be greater than 0.");
        MutableStateObservable<MediaSpec> mutableStateObservable = this.mMediaSpec;
        mutableStateObservable.setState(((MediaSpec) getObservableData(mutableStateObservable)).toBuilder().configureVideo(new Consumer() { // from class: androidx.camera.video.g
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((VideoSpec.Builder) obj).setEncodeFrameRate(i11);
            }
        }).build());
    }

    static {
        QualitySelector qualitySelector = VideoSpec.QUALITY_SELECTOR_AUTO;
        DEFAULT_QUALITY_SELECTOR = qualitySelector;
        VideoSpec videoSpecBuild = VideoSpec.builder().setQualitySelector(qualitySelector).setAspectRatio(-1).build();
        VIDEO_SPEC_DEFAULT = videoSpecBuild;
        MEDIA_SPEC_DEFAULT = MediaSpec.builder().setOutputFormat(-1).setVideoSpec(videoSpecBuild).build();
        PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE = new RuntimeException("The video frame producer became inactive before any data was received.");
        DEFAULT_ENCODER_FACTORY = new EncoderFactory() { // from class: androidx.camera.video.k
            @Override // androidx.camera.video.internal.encoder.EncoderFactory
            public final Encoder createEncoder(Executor executor, EncoderConfig encoderConfig, int i11) {
                return new EncoderImpl(executor, encoderConfig, i11);
            }
        };
        OUTPUT_STORAGE_FACTORY_DEFAULT = new OutputStorage.Factory() { // from class: androidx.camera.video.l
            @Override // androidx.camera.video.internal.OutputStorage.Factory
            public final OutputStorage create(OutputOptions outputOptions) {
                return new OutputStorageImpl(outputOptions);
            }
        };
        AUDIO_EXECUTOR = CameraXExecutors.newSequentialExecutor(CameraXExecutors.ioExecutor());
        sRetrySetupVideoMaxCount = 3;
        sRetrySetupVideoDelayMs = 1000L;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2114c(Encoder encoder) {
        Logger.m1866d(TAG, "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            notifyEncoderSourceStopped(encoder);
        }
    }

    private void clearPendingAudioRingBuffer() {
        while (!this.mPendingAudioRingBuffer.isEmpty()) {
            this.mPendingAudioRingBuffer.dequeue();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2115d(Recorder recorder, CallbackToFutureAdapter.Completer completer, Throwable th2) {
        if (recorder.mAudioErrorCause == null) {
            if (th2 instanceof EncodeException) {
                recorder.setAudioState(AudioState.ERROR_ENCODER);
            } else {
                recorder.setAudioState(AudioState.ERROR_SOURCE);
            }
            recorder.mAudioErrorCause = th2;
            recorder.updateInProgressStatusEvent(true);
            completer.set(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2117f(Recorder recorder) {
        SurfaceRequest surfaceRequest = recorder.mLatestSurfaceRequest;
        if (surfaceRequest == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        recorder.configureInternal(surfaceRequest, recorder.mVideoSourceTimebase, false);
    }

    private void finalizePendingRecording(RecordingRecord recordingRecord, int i11, Throwable th2) {
        Uri uri = Uri.EMPTY;
        recordingRecord.finalizeRecording(uri);
        recordingRecord.updateVideoRecordEvent(VideoRecordEvent.finalizeWithError(recordingRecord.getOutputOptions(), RecordingStats.m2141of(0L, 0L, AudioStats.m2107of(1, this.mAudioErrorCause, 0.0d, 0L)), OutputResults.m2108of(uri), i11, th2));
    }

    private List<EncodedData> getAudioDataToWriteAndClearCache(long j11) {
        ArrayList arrayList = new ArrayList();
        while (!this.mPendingAudioRingBuffer.isEmpty()) {
            EncodedData encodedDataDequeue = this.mPendingAudioRingBuffer.dequeue();
            if (encodedDataDequeue.getPresentationTimeUs() >= j11) {
                arrayList.add(encodedDataDequeue);
            }
        }
        return arrayList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @ExperimentalHighSpeedVideo
    public static VideoCapabilities getHighSpeedVideoCapabilities(CameraInfo cameraInfo, int i11) {
        VideoCapabilities videoCapabilitiesInternal = getVideoCapabilitiesInternal(2, cameraInfo, i11);
        if (videoCapabilitiesInternal.getSupportedDynamicRanges().isEmpty()) {
            return null;
        }
        return videoCapabilitiesInternal;
    }

    public static VideoCapabilities getVideoCapabilities(CameraInfo cameraInfo, int i11) {
        return getVideoCapabilitiesInternal(1, cameraInfo, i11);
    }

    private static VideoCapabilities getVideoCapabilitiesInternal(int i11, CameraInfo cameraInfo, int i12) {
        return new RecorderVideoCapabilities(i12, (CameraInfoInternal) cameraInfo, i11, VideoEncoderInfoImpl.FINDER);
    }

    private StreamInfo.StreamState internalStateToStreamState(State state) {
        return (state == State.RECORDING || (state == State.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? StreamInfo.StreamState.ACTIVE : StreamInfo.StreamState.INACTIVE;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Object m2123l(Recorder recorder, final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) {
        recorder.mVideoEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.3
            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(EncodeException encodeException) {
                completer.setException(encodeException);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(EncodedData encodedData) {
                boolean z11;
                Recorder recorder2 = Recorder.this;
                if (recorder2.mMediaMuxer != null) {
                    try {
                        recorder2.writeVideoData(encodedData, recordingRecord);
                        if (encodedData != null) {
                            encodedData.close();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (encodedData != null) {
                            try {
                                encodedData.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                if (recorder2.mInProgressRecordingStopping) {
                    Logger.m1866d(Recorder.TAG, "Drop video data since recording is stopping.");
                    encodedData.close();
                    return;
                }
                EncodedData encodedData2 = recorder2.mPendingFirstVideoData;
                if (encodedData2 != null) {
                    encodedData2.close();
                    Recorder.this.mPendingFirstVideoData = null;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!encodedData.isKeyFrame()) {
                    if (z11) {
                        Logger.m1866d(Recorder.TAG, "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                    }
                    Logger.m1866d(Recorder.TAG, "Dropped video data since muxer has not yet started and data is not a keyframe.");
                    Recorder.this.mVideoEncoder.requestKeyFrame();
                    encodedData.close();
                    return;
                }
                Recorder recorder3 = Recorder.this;
                recorder3.mPendingFirstVideoData = encodedData;
                if (!recorder3.isAudioEnabled() || !Recorder.this.mPendingAudioRingBuffer.isEmpty()) {
                    Logger.m1866d(Recorder.TAG, "Received video keyframe. Starting muxer...");
                    Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                } else if (z11) {
                    Logger.m1866d(Recorder.TAG, "Replaced cached video keyframe with newer keyframe.");
                } else {
                    Logger.m1866d(Recorder.TAG, "Cached video keyframe while we wait for first audio sample before starting muxer.");
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mVideoOutputConfig = outputConfig;
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }
        }, recorder.mSequentialExecutor);
        return "videoEncodingFuture";
    }

    @GuardedBy("mLock")
    private RecordingRecord makePendingRecordingActiveLocked(State state) {
        boolean z11;
        if (state == State.PENDING_PAUSED) {
            z11 = true;
        } else {
            if (state != State.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z11 = false;
        }
        if (this.mActiveRecordingRecord != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        RecordingRecord recordingRecord = this.mPendingRecordingRecord;
        if (recordingRecord == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.mActiveRecordingRecord = recordingRecord;
        recordingRecord.getRecordingState().addObserver(CameraXExecutors.directExecutor(), new Observable.Observer<Boolean>() { // from class: androidx.camera.video.Recorder.7
            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(Throwable th2) {
                Recorder.this.mIsRecording.setError(th2);
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onNewData(Boolean bool) {
                Recorder.this.mIsRecording.setState(bool);
            }
        });
        this.mPendingRecordingRecord = null;
        if (z11) {
            setState(State.PAUSED);
            return recordingRecord;
        }
        setState(State.RECORDING);
        return recordingRecord;
    }

    public static void notifyEncoderSourceStopped(Encoder encoder) {
        if (encoder instanceof EncoderImpl) {
            ((EncoderImpl) encoder).signalSourceStopped();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.camera.video.Recorder$RecordingRecord] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.camera.video.Recorder] */
    private void onRecordingFinalized(RecordingRecord recordingRecord) {
        RecordingRecord recordingRecordMakePendingRecordingActiveLocked;
        boolean z11;
        Object obj;
        Exception exc;
        int i11;
        int i12;
        int i13;
        SurfaceRequest surfaceRequest;
        ?? r11;
        synchronized (this.mLock) {
            try {
                RecordingRecord recordingRecord2 = this.mActiveRecordingRecord;
                if (recordingRecord2 != recordingRecord) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                recordingRecord2.getRecordingState().removeObservers();
                recordingRecordMakePendingRecordingActiveLocked = null;
                exc = null;
                recordingRecordMakePendingRecordingActiveLocked = null;
                recordingRecordMakePendingRecordingActiveLocked = null;
                recordingRecordMakePendingRecordingActiveLocked = null;
                this.mActiveRecordingRecord = null;
                int i14 = 1;
                switch (this.mState.ordinal()) {
                    case 1:
                        z11 = false;
                        if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                            RecordingRecord recordingRecord3 = this.mPendingRecordingRecord;
                            this.mPendingRecordingRecord = null;
                            setState(State.CONFIGURING);
                            exc = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                            i12 = 0;
                            i13 = 4;
                            i11 = 0;
                            r11 = recordingRecord3;
                        } else {
                            if (this.mEncoderNotUsePersistentInputSurface) {
                                this.mActiveSurface = null;
                                surfaceRequest = this.mLatestSurfaceRequest;
                                if (surfaceRequest != null || surfaceRequest.isServiced()) {
                                    i14 = 0;
                                }
                                updateNonPendingState(State.CONFIGURING);
                                i11 = i14;
                                i12 = 0;
                                i13 = i12;
                            } else if (this.mVideoEncoder != null) {
                                exc = null;
                                i11 = 0;
                                i12 = 0;
                                i13 = 0;
                                recordingRecordMakePendingRecordingActiveLocked = makePendingRecordingActiveLocked(this.mState);
                            } else {
                                obj = null;
                                exc = null;
                                i11 = 0;
                                i12 = i11;
                                i13 = i12;
                                r11 = obj;
                            }
                            r11 = exc;
                        }
                        break;
                    case 2:
                        z11 = true;
                        if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                            RecordingRecord recordingRecord4 = this.mPendingRecordingRecord;
                            this.mPendingRecordingRecord = null;
                            setState(State.CONFIGURING);
                            exc = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                            i12 = 0;
                            i13 = 4;
                            i11 = 0;
                            r11 = recordingRecord4;
                        } else {
                            if (this.mEncoderNotUsePersistentInputSurface) {
                                this.mActiveSurface = null;
                                surfaceRequest = this.mLatestSurfaceRequest;
                                if (surfaceRequest != null) {
                                    i14 = 0;
                                } else {
                                    i14 = 0;
                                }
                                updateNonPendingState(State.CONFIGURING);
                                i11 = i14;
                                i12 = 0;
                                i13 = i12;
                            } else if (this.mVideoEncoder != null) {
                                exc = null;
                                i11 = 0;
                                i12 = 0;
                                i13 = 0;
                                recordingRecordMakePendingRecordingActiveLocked = makePendingRecordingActiveLocked(this.mState);
                            } else {
                                obj = null;
                                exc = null;
                                i11 = 0;
                                i12 = i11;
                                i13 = i12;
                                r11 = obj;
                            }
                            r11 = exc;
                        }
                        break;
                    case 3:
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.mState);
                    case 4:
                    case 5:
                    case 6:
                        if (!this.mEncoderNotUsePersistentInputSurface) {
                            setState(State.IDLING);
                            obj = null;
                            exc = null;
                            z11 = false;
                            i11 = 0;
                            i12 = i11;
                            i13 = i12;
                            r11 = obj;
                        } else {
                            this.mActiveSurface = null;
                            SurfaceRequest surfaceRequest2 = this.mLatestSurfaceRequest;
                            if (surfaceRequest2 == null || surfaceRequest2.isServiced()) {
                                i14 = 0;
                            }
                            setState(State.CONFIGURING);
                            i11 = i14;
                            z11 = false;
                            i12 = 0;
                            i13 = i12;
                            r11 = exc;
                        }
                        break;
                    case 7:
                        exc = null;
                        i12 = 1;
                        z11 = false;
                        i11 = 0;
                        i13 = 0;
                        r11 = exc;
                        break;
                    default:
                        obj = null;
                        exc = null;
                        z11 = false;
                        i11 = 0;
                        i12 = i11;
                        i13 = i12;
                        r11 = obj;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 != 0) {
            configureInternal(this.mLatestSurfaceRequest, this.mVideoSourceTimebase, false);
            return;
        }
        if (i12 != 0) {
            reset();
            return;
        }
        if (recordingRecordMakePendingRecordingActiveLocked != null) {
            if (this.mEncoderNotUsePersistentInputSurface) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            startRecording(recordingRecordMakePendingRecordingActiveLocked, z11);
        } else if (r11 != 0) {
            finalizePendingRecording(r11, i13, exc);
        }
    }

    private void onResetVideo() {
        boolean z11;
        SurfaceRequest surfaceRequest;
        synchronized (this.mLock) {
            try {
                switch (this.mState.ordinal()) {
                    case 1:
                    case 2:
                        updateNonPendingState(State.CONFIGURING);
                        z11 = true;
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (isPersistentRecordingInProgress()) {
                            z11 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        setState(State.CONFIGURING);
                        z11 = true;
                        break;
                    default:
                        z11 = true;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mNeedsResetBeforeNextStart = false;
        if (!z11 || (surfaceRequest = this.mLatestSurfaceRequest) == null || surfaceRequest.isServiced()) {
            return;
        }
        configureInternal(this.mLatestSurfaceRequest, this.mVideoSourceTimebase, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceRequestedInternal(SurfaceRequest surfaceRequest, Timebase timebase, boolean z11) {
        SurfaceRequest surfaceRequest2 = this.mLatestSurfaceRequest;
        if (surfaceRequest2 != null && !surfaceRequest2.isServiced()) {
            this.mLatestSurfaceRequest.willNotProvideSurface();
        }
        this.mHasGlProcessing = z11;
        this.mLatestSurfaceRequest = surfaceRequest;
        this.mVideoSourceTimebase = timebase;
        configureInternal(surfaceRequest, timebase, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseInternal(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        if (isAudioEnabled()) {
            this.mAudioEncoder.pause();
        }
        this.mVideoEncoder.pause();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.pause(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    private PendingRecording prepareRecordingInternal(Context context, OutputOptions outputOptions) {
        Preconditions.checkNotNull(outputOptions, "The OutputOptions cannot be null.");
        return new PendingRecording(context, this, outputOptions);
    }

    private void releaseCurrentAudioSource() {
        final AudioSource audioSource = this.mAudioSource;
        if (audioSource == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.mAudioSource = null;
        Logger.m1866d(TAG, String.format("Releasing audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        Futures.addCallback(audioSource.release(), new FutureCallback<Void>() { // from class: androidx.camera.video.Recorder.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                Logger.m1866d(Recorder.TAG, String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r11) {
                Logger.m1866d(Recorder.TAG, String.format("Released audio source successfully: 0x%x", Integer.valueOf(audioSource.hashCode())));
            }
        }, CameraXExecutors.directExecutor());
    }

    private void reset() {
        if (this.mAudioEncoder != null) {
            Logger.m1866d(TAG, "Releasing audio encoder.");
            this.mAudioEncoder.release();
            this.mAudioEncoder = null;
            this.mAudioOutputConfig = null;
        }
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        setAudioState(AudioState.INITIALIZING);
        resetVideo();
    }

    private void resetVideo() {
        if (this.mVideoEncoder != null) {
            Logger.m1866d(TAG, "Releasing video encoder.");
            tryReleaseVideoEncoder();
        }
        onResetVideo();
    }

    @GuardedBy("mLock")
    private void restoreNonPendingState() {
        if (PENDING_STATES.contains(this.mState)) {
            setState(this.mNonPendingState);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.mState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeInternal(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        if (isAudioEnabled()) {
            this.mAudioEncoder.start();
        }
        Encoder encoder = this.mVideoEncoder;
        if (encoder == null) {
            this.mShouldSendResumeEvent = true;
            return;
        }
        encoder.start();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.resume(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ListenableFuture<Void> safeToCloseVideoEncoder() {
        Logger.m1866d(TAG, "Try to safely release video encoder: " + this.mVideoEncoder);
        return this.mVideoEncoderSession.signalTermination();
    }

    @GuardedBy("mLock")
    private void setStreamId(int i11) {
        if (this.mStreamId == i11) {
            return;
        }
        Logger.m1866d(TAG, "Transitioning streamId: " + this.mStreamId + " --> " + i11);
        this.mStreamId = i11;
        this.mStreamInfo.setState(StreamInfo.m2143of(i11, internalStateToStreamState(this.mState), this.mInProgressTransformationInfo));
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    private void setupAudio(RecordingRecord recordingRecord) throws InvalidConfigException, AudioSourceAccessException {
        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
        AudioMimeInfo audioMimeInfoResolveAudioMimeInfo = AudioConfigUtil.resolveAudioMimeInfo(mediaSpec, this.mResolvedEncoderProfiles);
        Timebase timebase = Timebase.UPTIME;
        VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) Preconditions.checkNotNull(this.mVideoEncoderConfig);
        AudioSettings audioSettingsResolveAudioSettings = AudioConfigUtil.resolveAudioSettings(audioMimeInfoResolveAudioMimeInfo, mediaSpec.getAudioSpec(), videoEncoderConfig.getCaptureFrameRate() != videoEncoderConfig.getEncodeFrameRate() ? new Rational(videoEncoderConfig.getCaptureFrameRate(), videoEncoderConfig.getEncodeFrameRate()) : null);
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        AudioSource audioSource = setupAudioSource(recordingRecord, audioSettingsResolveAudioSettings);
        this.mAudioSource = audioSource;
        Logger.m1866d(TAG, String.format("Set up new audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        Encoder encoderCreateEncoder = this.mAudioEncoderFactory.createEncoder(this.mExecutor, AudioConfigUtil.resolveAudioEncoderConfig(audioMimeInfoResolveAudioMimeInfo, timebase, audioSettingsResolveAudioSettings, mediaSpec.getAudioSpec()), ((SurfaceRequest) Preconditions.checkNotNull(this.mLatestSurfaceRequest)).getSessionType());
        this.mAudioEncoder = encoderCreateEncoder;
        Encoder.EncoderInput input = encoderCreateEncoder.getInput();
        if (!(input instanceof Encoder.ByteBufferInput)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.mAudioSource.setBufferProvider((Encoder.ByteBufferInput) input);
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    private AudioSource setupAudioSource(RecordingRecord recordingRecord, AudioSettings audioSettings) throws AudioSourceAccessException {
        return recordingRecord.performOneTimeAudioSourceCreation(audioSettings, AUDIO_EXECUTOR);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    @SuppressLint({"MissingPermission"})
    private void startInternal(RecordingRecord recordingRecord) {
        AudioState audioState;
        if (this.mInProgressRecording != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        this.mInProgressRecording = recordingRecord;
        OutputStorage outputStorageCreate = this.mOutputStorageFactory.create(recordingRecord.getOutputOptions());
        this.mOutputStorage = outputStorageCreate;
        long availableBytes = outputStorageCreate.getAvailableBytes();
        Logger.m1866d(TAG, "availableBytes = " + StorageUtil.formatSize(availableBytes));
        long j11 = this.mRequiredFreeStorageBytes;
        if (availableBytes < j11) {
            finalizeInProgressRecording(3, new IOException(String.format(INSUFFICIENT_STORAGE_ERROR_MSG, Long.valueOf(availableBytes), Long.valueOf(this.mRequiredFreeStorageBytes))));
            return;
        }
        this.mAvailableBytesAboveRequired = availableBytes - j11;
        if (recordingRecord.getOutputOptions().getFileSizeLimit() > 0) {
            this.mFileSizeLimitInBytes = Math.round(recordingRecord.getOutputOptions().getFileSizeLimit() * 0.95d);
            Logger.m1866d(TAG, "File size limit in bytes: " + this.mFileSizeLimitInBytes);
        } else {
            this.mFileSizeLimitInBytes = 0L;
        }
        if (recordingRecord.getOutputOptions().getDurationLimitMillis() > 0) {
            this.mDurationLimitNs = TimeUnit.MILLISECONDS.toNanos(recordingRecord.getOutputOptions().getDurationLimitMillis());
            Logger.m1866d(TAG, "Duration limit in nanoseconds: " + this.mDurationLimitNs);
        } else {
            this.mDurationLimitNs = 0L;
        }
        int iOrdinal = this.mAudioState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                setAudioState(recordingRecord.hasAudioEnabled() ? AudioState.ENABLED : AudioState.DISABLED);
            } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.mAudioState);
            }
        } else if (recordingRecord.hasAudioEnabled()) {
            if (!isAudioSupported()) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (!this.mInProgressRecording.isPersistent() || this.mAudioEncoder == null) {
                    setupAudio(recordingRecord);
                }
                setAudioState(AudioState.ENABLED);
            } catch (AudioSourceAccessException e11) {
                e = e11;
                Logger.m1869e(TAG, "Unable to create audio resource with error: ", e);
                if (e instanceof InvalidConfigException) {
                    audioState = AudioState.ERROR_ENCODER;
                } else {
                    audioState = AudioState.ERROR_SOURCE;
                }
                setAudioState(audioState);
                this.mAudioErrorCause = e;
            } catch (InvalidConfigException e12) {
                e = e12;
                Logger.m1869e(TAG, "Unable to create audio resource with error: ", e);
                if (e instanceof InvalidConfigException) {
                    audioState = AudioState.ERROR_ENCODER;
                } else {
                    audioState = AudioState.ERROR_SOURCE;
                }
                setAudioState(audioState);
                this.mAudioErrorCause = e;
            }
        }
        updateEncoderCallbacks(recordingRecord, false);
        if (isAudioEnabled()) {
            this.mAudioSource.start(recordingRecord.isMuted());
            this.mAudioEncoder.start();
        }
        this.mVideoEncoder.start();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.start(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    private static int supportedMuxerFormatOrDefaultFrom(VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, int i11) {
        if (videoValidatedEncoderProfilesProxy != null) {
            int recommendedFileFormat = videoValidatedEncoderProfilesProxy.getRecommendedFileFormat();
            if (recommendedFileFormat == 1) {
                return Build.VERSION.SDK_INT < 26 ? 0 : 2;
            }
            if (recommendedFileFormat == 2) {
                return 0;
            }
            if (recommendedFileFormat == 9) {
                return 1;
            }
        }
        return i11;
    }

    private void tryReleaseVideoEncoder() {
        VideoEncoderSession videoEncoderSession = this.mVideoEncoderSessionToRelease;
        if (videoEncoderSession == null) {
            safeToCloseVideoEncoder();
            return;
        }
        Preconditions.checkState(videoEncoderSession.getVideoEncoder() == this.mVideoEncoder);
        Logger.m1866d(TAG, "Releasing video encoder: " + this.mVideoEncoder);
        this.mVideoEncoderSessionToRelease.terminateNow();
        this.mVideoEncoderSessionToRelease = null;
        this.mVideoEncoder = null;
        this.mVideoOutputConfig = null;
        setLatestSurface(null);
    }

    private void updateEncoderCallbacks(final RecordingRecord recordingRecord, boolean z11) {
        if (!this.mEncodingFutures.isEmpty()) {
            ListenableFuture listenableFutureAllAsList = Futures.allAsList(this.mEncodingFutures);
            if (!listenableFutureAllAsList.isDone()) {
                listenableFutureAllAsList.cancel(true);
            }
            this.mEncodingFutures.clear();
        }
        this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.e
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Recorder.m2123l(this.f1955a, recordingRecord, completer);
            }
        }));
        if (isAudioEnabled() && !z11) {
            this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.f
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Recorder.m2124m(this.f1957a, recordingRecord, completer);
                }
            }));
        }
        Futures.addCallback(Futures.allAsList(this.mEncodingFutures), new FutureCallback<List<Void>>() { // from class: androidx.camera.video.Recorder.6
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                Preconditions.checkState(Recorder.this.mInProgressRecording != null, "In-progress recording shouldn't be null");
                if (Recorder.this.mInProgressRecording.isPersistent()) {
                    return;
                }
                Logger.m1866d(Recorder.TAG, "Encodings end with error: " + th2);
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mMediaMuxer == null ? 8 : 6, th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(List<Void> list) {
                Logger.m1866d(Recorder.TAG, "Encodings end successfully.");
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mRecordingStopError, recorder.mRecordingStopErrorCause);
            }
        }, CameraXExecutors.directExecutor());
    }

    @GuardedBy("mLock")
    private void updateNonPendingState(State state) {
        if (!PENDING_STATES.contains(this.mState)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.mState);
        }
        if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(state)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + state);
        }
        if (this.mNonPendingState != state) {
            this.mNonPendingState = state;
            this.mStreamInfo.setState(StreamInfo.m2143of(this.mStreamId, internalStateToStreamState(state), this.mInProgressTransformationInfo));
        }
    }

    public void finalizeInProgressRecording(int i11, Throwable th2) {
        if (this.mInProgressRecording == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.mMediaMuxer.release();
            } catch (IllegalStateException e11) {
                Logger.m1869e(TAG, "MediaMuxer failed to stop or release with error: " + e11.getMessage(), e11);
                if (i11 == 0) {
                    if (((OutputStorage) Preconditions.checkNotNull(this.mOutputStorage)).getAvailableBytes() < this.mRequiredFreeStorageBytes) {
                        i11 = 3;
                    } else {
                        i11 = this.mRecordingAudioBytes == 0 ? 8 : 1;
                    }
                }
            }
            this.mMediaMuxer = null;
        } else if (i11 == 0) {
            i11 = 8;
        }
        this.mInProgressRecording.finalizeRecording(this.mOutputUri);
        OutputOptions outputOptions = this.mInProgressRecording.getOutputOptions();
        RecordingStats inProgressRecordingStats = getInProgressRecordingStats();
        OutputResults outputResultsM2108of = OutputResults.m2108of(this.mOutputUri);
        this.mInProgressRecording.updateVideoRecordEvent(i11 == 0 ? VideoRecordEvent.finalize(outputOptions, inProgressRecordingStats, outputResultsM2108of) : VideoRecordEvent.finalizeWithError(outputOptions, inProgressRecordingStats, outputResultsM2108of, i11, th2));
        RecordingRecord recordingRecord = this.mInProgressRecording;
        this.mInProgressRecording = null;
        this.mInProgressRecordingStopping = false;
        this.mAudioTrackIndex = null;
        this.mVideoTrackIndex = null;
        this.mEncodingFutures.clear();
        this.mOutputUri = Uri.EMPTY;
        this.mRecordingBytes = 0L;
        this.mRecordingAudioBytes = 0L;
        this.mRecordingDurationNs = 0L;
        this.mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mRecordingStopError = 1;
        this.mRecordingStopErrorCause = null;
        this.mAudioErrorCause = null;
        this.mAudioAmplitude = 0.0d;
        this.mOutputStorage = null;
        this.mAvailableBytesAboveRequired = Long.MAX_VALUE;
        clearPendingAudioRingBuffer();
        setInProgressTransformationInfo(null);
        int iOrdinal = this.mAudioState.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            setAudioState(AudioState.IDLING);
            this.mAudioSource.stop();
        } else if (iOrdinal == 4 || iOrdinal == 5) {
            setAudioState(AudioState.INITIALIZING);
        }
        onRecordingFinalized(recordingRecord);
    }

    public int getAspectRatio() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getAspectRatio();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getAudioSource() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getSource();
    }

    public Executor getExecutor() {
        return this.mUserProvidedExecutor;
    }

    public RecordingStats getInProgressRecordingStats() {
        return RecordingStats.m2141of(this.mRecordingDurationNs, this.mRecordingBytes, AudioStats.m2107of(internalAudioStateToAudioStatsState(this.mAudioState), this.mAudioErrorCause, this.mAudioAmplitude, this.mRecordingAudioBytes));
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Observable<MediaSpec> getMediaSpec() {
        return this.mMediaSpec;
    }

    public QualitySelector getQualitySelector() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getQualitySelector();
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Observable<StreamInfo> getStreamInfo() {
        return this.mStreamInfo;
    }

    public int getTargetVideoEncodingBitRate() {
        return ((Integer) ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getBitrate().getLower()).intValue();
    }

    public int getVideoCapabilitiesSource() {
        return this.mVideoCapabilitiesSource;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public Observable<Range<Integer>> getVideoEncoderBitrateRange() {
        return this.mVideoEncoderBitrateRange;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getVideoEncodingFrameRate() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getEncodeFrameRate();
    }

    public boolean isAudioEnabled() {
        return this.mAudioState == AudioState.ENABLED;
    }

    public boolean isAudioSupported() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getChannelCount() != 0;
    }

    public boolean isPersistentRecordingInProgress() {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        return recordingRecord != null && recordingRecord.isPersistent();
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Observable<Boolean> isSourceStreamRequired() {
        return this.mIsRecording;
    }

    public void mute(Recording recording, final boolean z11) {
        synchronized (this.mLock) {
            try {
                if (isSameRecording(recording, this.mPendingRecordingRecord) || isSameRecording(recording, this.mActiveRecordingRecord)) {
                    final RecordingRecord recordingRecord = isSameRecording(recording, this.mPendingRecordingRecord) ? this.mPendingRecordingRecord : this.mActiveRecordingRecord;
                    this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2085b.muteInternal(recordingRecord, z11);
                        }
                    });
                } else {
                    Logger.m1866d(TAG, "mute() called on a recording that is no longer active: " + recording.getOutputOptions());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x008a, B:7:0x0011, B:10:0x001e, B:13:0x0024, B:14:0x002b, B:17:0x002f, B:18:0x003d, B:19:0x0055, B:22:0x0059, B:26:0x0062, B:28:0x0068, B:29:0x0074, B:30:0x0080), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x008a, B:7:0x0011, B:10:0x001e, B:13:0x0024, B:14:0x002b, B:17:0x002f, B:18:0x003d, B:19:0x0055, B:22:0x0059, B:26:0x0062, B:28:0x0068, B:29:0x0074, B:30:0x0080), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x008a, B:7:0x0011, B:10:0x001e, B:13:0x0024, B:14:0x002b, B:17:0x002f, B:18:0x003d, B:19:0x0055, B:22:0x0059, B:26:0x0062, B:28:0x0068, B:29:0x0074, B:30:0x0080), top: B:48:0x0003 }] */
    public void onConfigured() {
        RecordingRecord recordingRecordMakePendingRecordingActiveLocked;
        boolean z11;
        Exception exc;
        int i11;
        int i12;
        RecordingRecord recordingRecord;
        synchronized (this.mLock) {
            try {
                recordingRecordMakePendingRecordingActiveLocked = null;
                switch (this.mState) {
                    case CONFIGURING:
                        setState(State.IDLING);
                        recordingRecord = null;
                        exc = null;
                        z11 = false;
                        i11 = 0;
                        i12 = i11;
                        break;
                    case PENDING_RECORDING:
                        z11 = false;
                        if (this.mActiveRecordingRecord != null) {
                            recordingRecord = null;
                            exc = null;
                            i11 = 0;
                            i12 = i11;
                        } else if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                            recordingRecord = this.mPendingRecordingRecord;
                            this.mPendingRecordingRecord = null;
                            restoreNonPendingState();
                            exc = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                            i11 = 4;
                            i12 = 0;
                        } else {
                            exc = null;
                            i11 = 0;
                            i12 = 0;
                            recordingRecordMakePendingRecordingActiveLocked = makePendingRecordingActiveLocked(this.mState);
                            recordingRecord = null;
                        }
                        break;
                    case PENDING_PAUSED:
                        z11 = true;
                        if (this.mActiveRecordingRecord != null) {
                            recordingRecord = null;
                            exc = null;
                            i11 = 0;
                            i12 = i11;
                        } else if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                            recordingRecord = this.mPendingRecordingRecord;
                            this.mPendingRecordingRecord = null;
                            restoreNonPendingState();
                            exc = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                            i11 = 4;
                            i12 = 0;
                        } else {
                            exc = null;
                            i11 = 0;
                            i12 = 0;
                            recordingRecordMakePendingRecordingActiveLocked = makePendingRecordingActiveLocked(this.mState);
                            recordingRecord = null;
                        }
                        break;
                    case IDLING:
                    case RESETTING:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + this.mState);
                    case RECORDING:
                        z11 = false;
                        Preconditions.checkState(isPersistentRecordingInProgress(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i12 = 1;
                        recordingRecord = null;
                        exc = null;
                        i11 = 0;
                        break;
                    case PAUSED:
                        z11 = true;
                        Preconditions.checkState(isPersistentRecordingInProgress(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i12 = 1;
                        recordingRecord = null;
                        exc = null;
                        i11 = 0;
                        break;
                    case STOPPING:
                        if (!this.mEncoderNotUsePersistentInputSurface) {
                            throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                        }
                        recordingRecord = null;
                        exc = null;
                        z11 = false;
                        i11 = 0;
                        i12 = i11;
                        break;
                        break;
                    case ERROR:
                        Logger.m1868e(TAG, "onConfigured() was invoked when the Recorder had encountered error");
                        recordingRecord = null;
                        exc = null;
                        z11 = false;
                        i11 = 0;
                        i12 = i11;
                        break;
                    default:
                        recordingRecord = null;
                        exc = null;
                        z11 = false;
                        i11 = 0;
                        i12 = i11;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i12 == 0) {
            if (recordingRecordMakePendingRecordingActiveLocked != null) {
                startRecording(recordingRecordMakePendingRecordingActiveLocked, z11);
                return;
            } else {
                if (recordingRecord != null) {
                    finalizePendingRecording(recordingRecord, i11, exc);
                    return;
                }
                return;
            }
        }
        updateEncoderCallbacks(this.mInProgressRecording, true);
        this.mVideoEncoder.start();
        if (this.mShouldSendResumeEvent) {
            RecordingRecord recordingRecord2 = this.mInProgressRecording;
            recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.resume(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
            this.mShouldSendResumeEvent = false;
        }
        if (z11) {
            this.mVideoEncoder.pause();
        }
    }

    public void onEncoderSetupError(Throwable th2) {
        RecordingRecord recordingRecord;
        synchronized (this.mLock) {
            try {
                recordingRecord = null;
                switch (this.mState) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                        this.mPendingRecordingRecord = null;
                        recordingRecord = recordingRecord2;
                    case CONFIGURING:
                        setStreamId(-1);
                        setState(State.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.mState + ": " + th2);
                    default:
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (recordingRecord != null) {
            finalizePendingRecording(recordingRecord, 7, th2);
        }
    }

    public void onInProgressRecordingInternalError(RecordingRecord recordingRecord, int i11, Throwable th2) throws Throwable {
        Throwable th3;
        if (recordingRecord != this.mInProgressRecording) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.mLock) {
            try {
                try {
                    boolean z11 = false;
                    switch (this.mState) {
                        case CONFIGURING:
                        case IDLING:
                        case ERROR:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.mState);
                        case RECORDING:
                        case PAUSED:
                            try {
                                setState(State.STOPPING);
                                z11 = true;
                                break;
                            } catch (Throwable th4) {
                                th3 = th4;
                                throw th3;
                            }
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                        case STOPPING:
                        case RESETTING:
                            if (recordingRecord != this.mActiveRecordingRecord) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z11) {
                                stopInternal(recordingRecord, -1L, i11, th2);
                                return;
                            }
                            return;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSourceStateChanged(final VideoOutput.SourceState sourceState) {
        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.h
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f1962b.onSourceStateChangedInternal(sourceState);
            }
        });
    }

    public void onSourceStateChangedInternal(VideoOutput.SourceState sourceState) throws Throwable {
        ScheduledFuture<?> scheduledFuture;
        Encoder encoder;
        VideoOutput.SourceState sourceState2 = this.mSourceState;
        this.mSourceState = sourceState;
        if (sourceState2 == sourceState) {
            Logger.m1866d(TAG, "Video source transitions to the same state: " + sourceState);
            return;
        }
        Logger.m1866d(TAG, "Video source has transitioned to state: " + sourceState);
        if (sourceState != VideoOutput.SourceState.INACTIVE) {
            if (sourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING || (scheduledFuture = this.mSourceNonStreamingTimeout) == null || !scheduledFuture.cancel(false) || (encoder = this.mVideoEncoder) == null) {
                return;
            }
            notifyEncoderSourceStopped(encoder);
            return;
        }
        if (this.mActiveSurface == null) {
            SetupVideoTask setupVideoTask = this.mSetupVideoTask;
            if (setupVideoTask != null) {
                setupVideoTask.cancelFailedRetry();
                this.mSetupVideoTask = null;
            }
            requestReset(4, null, false);
            return;
        }
        this.mNeedsResetBeforeNextStart = true;
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord == null || recordingRecord.isPersistent()) {
            return;
        }
        onInProgressRecordingInternalError(this.mInProgressRecording, 4, null);
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSurfaceRequested(final SurfaceRequest surfaceRequest, final Timebase timebase, final boolean z11) {
        synchronized (this.mLock) {
            try {
                Logger.m1866d(TAG, "Surface is requested in state: " + this.mState + ", Current surface: " + this.mStreamId);
                if (this.mState == State.ERROR) {
                    setState(State.CONFIGURING);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f2101b.onSurfaceRequestedInternal(surfaceRequest, timebase, z11);
            }
        });
    }

    public void pause(Recording recording) {
        synchronized (this.mLock) {
            try {
                if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                    Logger.m1866d(TAG, "pause() called on a recording that is no longer active: " + recording.getOutputOptions());
                    return;
                }
                int iOrdinal = this.mState.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        setState(State.PENDING_PAUSED);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            setState(State.PAUSED);
                            final RecordingRecord recordingRecord = this.mActiveRecordingRecord;
                            this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.s
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f2109b.pauseInternal(recordingRecord);
                                }
                            });
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Called pause() from invalid state: " + this.mState);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RequiresApi(26)
    public PendingRecording prepareRecording(Context context, FileDescriptorOutputOptions fileDescriptorOutputOptions) {
        if (Build.VERSION.SDK_INT >= 26) {
            return prepareRecordingInternal(context, fileDescriptorOutputOptions);
        }
        throw new UnsupportedOperationException("File descriptors as output destinations are not supported on pre-Android O (API 26) devices.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void requestReset(int i11, Throwable th2, boolean z11) {
        boolean z12;
        boolean z13;
        synchronized (this.mLock) {
            try {
                z12 = true;
                z13 = false;
                switch (this.mState) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        updateNonPendingState(State.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        Preconditions.checkState(this.mInProgressRecording != null, "In-progress recording shouldn't be null when in state " + this.mState);
                        if (this.mActiveRecordingRecord != this.mInProgressRecording) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!isPersistentRecordingInProgress()) {
                            setState(State.RESETTING);
                            z13 = true;
                            z12 = false;
                        }
                        break;
                        break;
                    case STOPPING:
                        setState(State.RESETTING);
                        z12 = false;
                        break;
                    case RESETTING:
                    default:
                        z12 = false;
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z12) {
            if (z13) {
                stopInternal(this.mInProgressRecording, -1L, i11, th2);
            }
        } else if (z11) {
            resetVideo();
        } else {
            reset();
        }
    }

    public void resume(Recording recording) {
        synchronized (this.mLock) {
            try {
                if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                    Logger.m1866d(TAG, "resume() called on a recording that is no longer active: " + recording.getOutputOptions());
                    return;
                }
                int iOrdinal = this.mState.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 5) {
                        setState(State.RECORDING);
                        final RecordingRecord recordingRecord = this.mActiveRecordingRecord;
                        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f1967b.resumeInternal(recordingRecord);
                            }
                        });
                    } else if (iOrdinal == 2) {
                        setState(State.PENDING_RECORDING);
                    } else if (iOrdinal != 3) {
                    }
                    return;
                }
                throw new IllegalStateException("Called resume() from invalid state: " + this.mState);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setAudioState(AudioState audioState) {
        Logger.m1866d(TAG, "Transitioning audio state: " + this.mAudioState + " --> " + audioState);
        this.mAudioState = audioState;
    }

    public void setInProgressTransformationInfo(SurfaceRequest.TransformationInfo transformationInfo) {
        Logger.m1866d(TAG, "Update stream transformation info: " + transformationInfo);
        this.mInProgressTransformationInfo = transformationInfo;
        synchronized (this.mLock) {
            this.mStreamInfo.setState(StreamInfo.m2143of(this.mStreamId, internalStateToStreamState(this.mState), transformationInfo));
        }
    }

    public void setLatestSurface(Surface surface) {
        int iHashCode;
        if (this.mLatestSurface == surface) {
            return;
        }
        this.mLatestSurface = surface;
        synchronized (this.mLock) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                iHashCode = 0;
            }
            setStreamId(iHashCode);
        }
    }

    @GuardedBy("mLock")
    public void setState(State state) {
        if (this.mState == state) {
            throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
        }
        Logger.m1866d(TAG, "Transitioning Recorder internal state: " + this.mState + " --> " + state);
        Set<State> set = PENDING_STATES;
        StreamInfo.StreamState streamStateInternalStateToStreamState = null;
        if (set.contains(state)) {
            if (!set.contains(this.mState)) {
                if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(this.mState)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.mState);
                }
                State state2 = this.mState;
                this.mNonPendingState = state2;
                streamStateInternalStateToStreamState = internalStateToStreamState(state2);
            }
        } else if (this.mNonPendingState != null) {
            this.mNonPendingState = null;
        }
        this.mState = state;
        if (streamStateInternalStateToStreamState == null) {
            streamStateInternalStateToStreamState = internalStateToStreamState(state);
        }
        this.mStreamInfo.setState(StreamInfo.m2143of(this.mStreamId, streamStateInternalStateToStreamState, this.mInProgressTransformationInfo));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0105 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #2 {all -> 0x0044, blocks: (B:14:0x0020, B:15:0x0032, B:17:0x0038, B:20:0x0047, B:24:0x0053, B:28:0x0076, B:30:0x0085, B:34:0x00a1, B:35:0x00aa, B:37:0x00ae, B:38:0x00b8, B:40:0x00c2, B:45:0x00ef, B:47:0x0105, B:48:0x0115, B:49:0x0118, B:50:0x0121, B:52:0x0127, B:57:0x0136, B:61:0x014a, B:43:0x00e5, B:33:0x0099, B:62:0x014e, B:66:0x0156), top: B:83:0x0020, inners: #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0127 A[Catch: all -> 0x0044, LOOP:1: B:50:0x0121->B:52:0x0127, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x0044, blocks: (B:14:0x0020, B:15:0x0032, B:17:0x0038, B:20:0x0047, B:24:0x0053, B:28:0x0076, B:30:0x0085, B:34:0x00a1, B:35:0x00aa, B:37:0x00ae, B:38:0x00b8, B:40:0x00c2, B:45:0x00ef, B:47:0x0105, B:48:0x0115, B:49:0x0118, B:50:0x0121, B:52:0x0127, B:57:0x0136, B:61:0x014a, B:43:0x00e5, B:33:0x0099, B:62:0x014e, B:66:0x0156), top: B:83:0x0020, inners: #1, #3, #4 }] */
    public void setupAndStartMediaMuxer(RecordingRecord recordingRecord) {
        Iterator<EncodedData> it;
        if (this.mMediaMuxer != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (isAudioEnabled() && this.mPendingAudioRingBuffer.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.mPendingFirstVideoData = null;
            List<EncodedData> audioDataToWriteAndClearCache = getAudioDataToWriteAndClearCache(encodedData.getPresentationTimeUs());
            long size = encodedData.size();
            Iterator<EncodedData> it2 = audioDataToWriteAndClearCache.iterator();
            while (it2.hasNext()) {
                size += it2.next().size();
            }
            long j11 = this.mFileSizeLimitInBytes;
            if (j11 != 0 && size > j11) {
                Logger.m1866d(TAG, String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
                onInProgressRecordingInternalError(recordingRecord, 2, null);
                encodedData.close();
                return;
            }
            int i11 = 3;
            try {
                MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
                MediaMuxer mediaMuxerPerformOneTimeMediaMuxerCreation = recordingRecord.performOneTimeMediaMuxerCreation(mediaSpec.getOutputFormat() == -1 ? supportedMuxerFormatOrDefaultFrom(this.mResolvedEncoderProfiles, MediaSpec.outputFormatToMuxerFormat(MEDIA_SPEC_DEFAULT.getOutputFormat())) : MediaSpec.outputFormatToMuxerFormat(mediaSpec.getOutputFormat()), new Consumer() { // from class: androidx.camera.video.u
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        this.f2114b.mOutputUri = (Uri) obj;
                    }
                });
                SurfaceRequest.TransformationInfo transformationInfo = this.mSourceTransformationInfo;
                if (transformationInfo != null) {
                    setInProgressTransformationInfo(transformationInfo);
                    mediaMuxerPerformOneTimeMediaMuxerCreation.setOrientationHint(transformationInfo.getRotationDegrees());
                }
                Location location = recordingRecord.getOutputOptions().getLocation();
                if (location == null) {
                    this.mVideoTrackIndex = Integer.valueOf(mediaMuxerPerformOneTimeMediaMuxerCreation.addTrack(this.mVideoOutputConfig.getMediaFormat()));
                    if (isAudioEnabled()) {
                        this.mAudioTrackIndex = Integer.valueOf(mediaMuxerPerformOneTimeMediaMuxerCreation.addTrack(this.mAudioOutputConfig.getMediaFormat()));
                    }
                    mediaMuxerPerformOneTimeMediaMuxerCreation.start();
                    this.mMediaMuxer = mediaMuxerPerformOneTimeMediaMuxerCreation;
                    writeVideoData(encodedData, recordingRecord);
                    it = audioDataToWriteAndClearCache.iterator();
                    while (it.hasNext()) {
                        writeAudioData(it.next(), recordingRecord);
                    }
                    encodedData.close();
                    return;
                }
                try {
                    Pair<Double, Double> pairAdjustGeoLocation = CorrectNegativeLatLongForMediaMuxer.adjustGeoLocation(location.getLatitude(), location.getLongitude());
                    mediaMuxerPerformOneTimeMediaMuxerCreation.setLocation((float) ((Double) pairAdjustGeoLocation.first).doubleValue(), (float) ((Double) pairAdjustGeoLocation.second).doubleValue());
                    this.mVideoTrackIndex = Integer.valueOf(mediaMuxerPerformOneTimeMediaMuxerCreation.addTrack(this.mVideoOutputConfig.getMediaFormat()));
                    if (isAudioEnabled()) {
                        this.mAudioTrackIndex = Integer.valueOf(mediaMuxerPerformOneTimeMediaMuxerCreation.addTrack(this.mAudioOutputConfig.getMediaFormat()));
                    }
                    try {
                        mediaMuxerPerformOneTimeMediaMuxerCreation.start();
                        this.mMediaMuxer = mediaMuxerPerformOneTimeMediaMuxerCreation;
                        writeVideoData(encodedData, recordingRecord);
                        it = audioDataToWriteAndClearCache.iterator();
                        while (it.hasNext()) {
                            writeAudioData(it.next(), recordingRecord);
                        }
                        encodedData.close();
                        return;
                    } catch (IllegalStateException e11) {
                        if (((OutputStorage) Preconditions.checkNotNull(this.mOutputStorage)).getAvailableBytes() >= this.mRequiredFreeStorageBytes) {
                            i11 = 1;
                        }
                        onInProgressRecordingInternalError(recordingRecord, i11, e11);
                    }
                } catch (IllegalArgumentException e12) {
                    mediaMuxerPerformOneTimeMediaMuxerCreation.release();
                    onInProgressRecordingInternalError(recordingRecord, 5, e12);
                }
            } catch (IOException e13) {
                if (!StorageUtil.isStorageFullException(e13)) {
                    i11 = 5;
                }
                onInProgressRecordingInternalError(recordingRecord, i11, e13);
            }
            encodedData.close();
        } catch (Throwable th2) {
            if (encodedData != null) {
                try {
                    encodedData.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Recording start(PendingRecording pendingRecording) {
        long j11;
        RecordingRecord recordingRecord;
        int i11;
        RecordingRecord recordingRecord2;
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        synchronized (this.mLock) {
            try {
                j11 = this.mLastGeneratedRecordingId + 1;
                this.mLastGeneratedRecordingId = j11;
                recordingRecord = null;
                i11 = 0;
                switch (this.mState) {
                    case CONFIGURING:
                    case IDLING:
                    case STOPPING:
                    case RESETTING:
                    case ERROR:
                        State state = this.mState;
                        State state2 = State.IDLING;
                        if (state == state2) {
                            Preconditions.checkState(this.mActiveRecordingRecord == null && this.mPendingRecordingRecord == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            RecordingRecord recordingRecordFrom = RecordingRecord.from(pendingRecording, j11);
                            recordingRecordFrom.initializeRecording(pendingRecording.getApplicationContext());
                            this.mPendingRecordingRecord = recordingRecordFrom;
                            State state3 = this.mState;
                            if (state3 == state2) {
                                setState(State.PENDING_RECORDING);
                                this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.n
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f2089b.tryServicePendingRecording();
                                    }
                                });
                            } else if (state3 == State.ERROR) {
                                setState(State.PENDING_RECORDING);
                                this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.o
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Recorder.m2117f(this.f2096b);
                                    }
                                });
                            } else {
                                setState(State.PENDING_RECORDING);
                            }
                            e = null;
                        } catch (IOException e11) {
                            e = e11;
                            i11 = 5;
                        }
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        recordingRecord2 = (RecordingRecord) Preconditions.checkNotNull(this.mPendingRecordingRecord);
                        recordingRecord = recordingRecord2;
                        e = null;
                        break;
                    case RECORDING:
                    case PAUSED:
                        recordingRecord2 = this.mActiveRecordingRecord;
                        recordingRecord = recordingRecord2;
                        e = null;
                        break;
                    default:
                        e = null;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (recordingRecord != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i11 == 0) {
            return Recording.from(pendingRecording, j11);
        }
        Logger.m1868e(TAG, "Recording was started when the Recorder had encountered error " + e);
        finalizePendingRecording(RecordingRecord.from(pendingRecording, j11), i11, e);
        return Recording.createFinalizedFrom(pendingRecording, j11);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public void stop(Recording recording, int i11, Throwable th2) throws Throwable {
        Throwable th3;
        final int i12;
        final Throwable th4;
        synchronized (this.mLock) {
            try {
                try {
                    if (!isSameRecording(recording, this.mPendingRecordingRecord)) {
                        try {
                            if (!isSameRecording(recording, this.mActiveRecordingRecord)) {
                                Logger.m1866d(TAG, "stop() called on a recording that is no longer active: " + recording.getOutputOptions());
                                return;
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                            throw th3;
                        }
                    }
                    RecordingRecord recordingRecord = null;
                    switch (this.mState) {
                        case CONFIGURING:
                        case IDLING:
                            throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                            i12 = i11;
                            th4 = th2;
                            Preconditions.checkState(isSameRecording(recording, this.mPendingRecordingRecord));
                            RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                            this.mPendingRecordingRecord = null;
                            restoreNonPendingState();
                            recordingRecord = recordingRecord2;
                            if (recordingRecord != null) {
                                if (i12 == 10) {
                                    Logger.m1868e(TAG, "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                finalizePendingRecording(recordingRecord, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                        case RECORDING:
                        case PAUSED:
                            setState(State.STOPPING);
                            final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                            final RecordingRecord recordingRecord3 = this.mActiveRecordingRecord;
                            i12 = i11;
                            th4 = th2;
                            this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f1942b.stopInternal(recordingRecord3, micros, i12, th4);
                                }
                            });
                            if (recordingRecord != null) {
                                if (i12 == 10) {
                                    Logger.m1868e(TAG, "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                finalizePendingRecording(recordingRecord, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                        case STOPPING:
                        case RESETTING:
                            Preconditions.checkState(isSameRecording(recording, this.mActiveRecordingRecord));
                        default:
                            i12 = i11;
                            th4 = th2;
                            if (recordingRecord != null) {
                                if (i12 == 10) {
                                    Logger.m1868e(TAG, "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                finalizePendingRecording(recordingRecord, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th7) {
                th = th7;
                th3 = th;
                throw th3;
            }
        }
    }

    public void stopInternal(RecordingRecord recordingRecord, long j11, int i11, Throwable th2) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        this.mInProgressRecordingStopping = true;
        this.mRecordingStopError = i11;
        this.mRecordingStopErrorCause = th2;
        if (isAudioEnabled()) {
            clearPendingAudioRingBuffer();
            this.mAudioEncoder.stop(j11);
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData != null) {
            encodedData.close();
            this.mPendingFirstVideoData = null;
        }
        if (this.mSourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
            final Encoder encoder = this.mVideoEncoder;
            this.mSourceNonStreamingTimeout = scheduleTask(new Runnable() { // from class: androidx.camera.video.v
                @Override // java.lang.Runnable
                public final void run() {
                    Recorder.m2114c(encoder);
                }
            }, this.mSequentialExecutor, 1000L, TimeUnit.MILLISECONDS);
        } else {
            notifyEncoderSourceStopped(this.mVideoEncoder);
        }
        this.mVideoEncoder.stop(j11);
    }

    public void tryServicePendingRecording() {
        boolean z11;
        RecordingRecord recordingRecordMakePendingRecordingActiveLocked;
        int i11;
        Throwable th2;
        synchronized (this.mLock) {
            try {
                Logger.m1866d(TAG, "tryServicePendingRecording on state: " + this.mState);
                int iOrdinal = this.mState.ordinal();
                boolean z12 = true;
                z11 = false;
                i11 = 0;
                recordingRecordMakePendingRecordingActiveLocked = null;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                    }
                    th2 = recordingRecordMakePendingRecordingActiveLocked;
                } else {
                    z12 = false;
                }
                if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    recordingRecordMakePendingRecordingActiveLocked = this.mPendingRecordingRecord;
                    this.mPendingRecordingRecord = null;
                    restoreNonPendingState();
                    i11 = 4;
                    z11 = z12;
                    th2 = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                } else {
                    if (this.mActiveRecordingRecord != null || this.mNeedsResetBeforeNextStart) {
                        Logger.m1872w(TAG, "PendingRecording is not handled, active recording = " + this.mActiveRecordingRecord + ", need reset flag = " + this.mNeedsResetBeforeNextStart);
                    } else if (this.mVideoEncoder != null) {
                        i11 = 0;
                        z11 = z12;
                        th2 = null;
                        recordingRecordMakePendingRecordingActiveLocked = makePendingRecordingActiveLocked(this.mState);
                        recordingRecordMakePendingRecordingActiveLocked = null;
                    }
                    z11 = z12;
                    th2 = recordingRecordMakePendingRecordingActiveLocked;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (recordingRecordMakePendingRecordingActiveLocked != null) {
            startRecording(recordingRecordMakePendingRecordingActiveLocked, z11);
        } else if (recordingRecordMakePendingRecordingActiveLocked != null) {
            finalizePendingRecording(recordingRecordMakePendingRecordingActiveLocked, i11, th2);
        }
    }

    public void updateInProgressStatusEvent(boolean z11) {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord != null) {
            recordingRecord.updateVideoRecordEvent(VideoRecordEvent.status(recordingRecord.getOutputOptions(), getInProgressRecordingStats()), z11);
        }
    }

    public void writeAudioData(EncodedData encodedData, RecordingRecord recordingRecord) throws Throwable {
        long size = this.mRecordingBytes + encodedData.size();
        long j11 = this.mFileSizeLimitInBytes;
        if (j11 != 0 && size > j11) {
            Logger.m1866d(TAG, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j12 = this.mFirstRecordingAudioDataTimeUs;
        if (j12 == Long.MAX_VALUE) {
            this.mFirstRecordingAudioDataTimeUs = presentationTimeUs;
            Logger.m1866d(TAG, String.format("First audio time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingAudioDataTimeUs)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(presentationTimeUs - Math.min(this.mFirstRecordingVideoDataTimeUs, j12));
            Preconditions.checkState(this.mPreviousRecordingAudioDataTimeUs != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(presentationTimeUs - this.mPreviousRecordingAudioDataTimeUs);
            long j13 = this.mDurationLimitNs;
            if (j13 != 0 && nanos2 > j13) {
                Logger.m1866d(TAG, String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.mDurationLimitNs)));
                onInProgressRecordingInternalError(recordingRecord, 9, null);
                return;
            }
        }
        try {
            this.mMediaMuxer.writeSampleData(this.mAudioTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.mRecordingBytes = size;
            this.mRecordingAudioBytes += encodedData.size();
            this.mPreviousRecordingAudioDataTimeUs = presentationTimeUs;
        } catch (IllegalStateException e11) {
            onInProgressRecordingInternalError(recordingRecord, ((OutputStorage) Preconditions.checkNotNull(this.mOutputStorage)).getAvailableBytes() < this.mRequiredFreeStorageBytes ? 3 : 1, e11);
        }
    }

    public void writeVideoData(EncodedData encodedData, RecordingRecord recordingRecord) throws Throwable {
        if (this.mVideoTrackIndex == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.mRecordingBytes + encodedData.size();
        long j11 = this.mFileSizeLimitInBytes;
        long nanos = 0;
        if (j11 != 0 && size > j11) {
            Logger.m1866d(TAG, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j12 = this.mFirstRecordingVideoDataTimeUs;
        if (j12 == Long.MAX_VALUE) {
            this.mFirstRecordingVideoDataTimeUs = presentationTimeUs;
            Logger.m1866d(TAG, String.format("First video time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingVideoDataTimeUs)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            nanos = timeUnit.toNanos(presentationTimeUs - Math.min(j12, this.mFirstRecordingAudioDataTimeUs));
            Preconditions.checkState(this.mPreviousRecordingVideoDataTimeUs != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(presentationTimeUs - this.mPreviousRecordingVideoDataTimeUs) + nanos;
            long j13 = this.mDurationLimitNs;
            if (j13 != 0 && nanos2 > j13) {
                Logger.m1866d(TAG, String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.mDurationLimitNs)));
                onInProgressRecordingInternalError(recordingRecord, 9, null);
                return;
            }
        }
        try {
            this.mMediaMuxer.writeSampleData(this.mVideoTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.mRecordingBytes = size;
            this.mRecordingDurationNs = nanos;
            this.mPreviousRecordingVideoDataTimeUs = presentationTimeUs;
            updateInProgressStatusEvent(encodedData.isKeyFrame());
            if (size > this.mAvailableBytesAboveRequired) {
                long availableBytes = ((OutputStorage) Preconditions.checkNotNull(this.mOutputStorage)).getAvailableBytes();
                Logger.m1866d(TAG, "availableBytes = " + StorageUtil.formatSize(availableBytes));
                long j14 = this.mRequiredFreeStorageBytes;
                if (availableBytes < j14) {
                    onInProgressRecordingInternalError(recordingRecord, 3, new IOException(String.format(INSUFFICIENT_STORAGE_ERROR_MSG, Long.valueOf(availableBytes), Long.valueOf(this.mRequiredFreeStorageBytes))));
                } else {
                    this.mAvailableBytesAboveRequired = availableBytes - j14;
                }
            }
        } catch (IllegalStateException e11) {
            onInProgressRecordingInternalError(recordingRecord, ((OutputStorage) Preconditions.checkNotNull(this.mOutputStorage)).getAvailableBytes() < this.mRequiredFreeStorageBytes ? 3 : 1, e11);
        }
    }

    public Recorder(Executor executor, MediaSpec mediaSpec, int i11, EncoderFactory encoderFactory, EncoderFactory encoderFactory2, OutputStorage.Factory factory, long j11) {
        boolean z11;
        if (DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mEncoderNotUsePersistentInputSurface = z11;
        this.mVideoEncoderBitrateRange = MutableStateObservable.withInitialState(null);
        this.mState = State.CONFIGURING;
        this.mNonPendingState = null;
        this.mStreamId = 0;
        this.mActiveRecordingRecord = null;
        this.mPendingRecordingRecord = null;
        this.mLastGeneratedRecordingId = 0L;
        this.mInProgressRecording = null;
        this.mInProgressRecordingStopping = false;
        this.mInProgressTransformationInfo = null;
        this.mSourceTransformationInfo = null;
        this.mResolvedEncoderProfiles = null;
        this.mEncodingFutures = new ArrayList();
        this.mAudioTrackIndex = null;
        this.mVideoTrackIndex = null;
        this.mLatestSurface = null;
        this.mActiveSurface = null;
        this.mMediaMuxer = null;
        this.mAudioSource = null;
        this.mVideoEncoder = null;
        this.mVideoOutputConfig = null;
        this.mAudioEncoder = null;
        this.mAudioOutputConfig = null;
        this.mAudioState = AudioState.INITIALIZING;
        this.mOutputUri = Uri.EMPTY;
        this.mRecordingBytes = 0L;
        this.mRecordingAudioBytes = 0L;
        this.mRecordingDurationNs = 0L;
        this.mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mFirstRecordingVideoBitrate = 0;
        this.mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mFileSizeLimitInBytes = 0L;
        this.mDurationLimitNs = 0L;
        this.mRecordingStopError = 1;
        this.mRecordingStopErrorCause = null;
        this.mPendingFirstVideoData = null;
        this.mPendingAudioRingBuffer = new ArrayRingBuffer(60);
        this.mAudioErrorCause = null;
        this.mIsAudioSourceSilenced = false;
        this.mSourceState = VideoOutput.SourceState.INACTIVE;
        this.mSourceNonStreamingTimeout = null;
        this.mNeedsResetBeforeNextStart = false;
        this.mVideoEncoderConfig = null;
        this.mVideoEncoderSessionToRelease = null;
        this.mAudioAmplitude = 0.0d;
        this.mShouldSendResumeEvent = false;
        this.mSetupVideoTask = null;
        this.mOutputStorage = null;
        this.mAvailableBytesAboveRequired = Long.MAX_VALUE;
        this.mHasGlProcessing = false;
        this.mUserProvidedExecutor = executor;
        executor = executor == null ? CameraXExecutors.ioExecutor() : executor;
        this.mExecutor = executor;
        Executor executorNewSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mSequentialExecutor = executorNewSequentialExecutor;
        this.mMediaSpec = MutableStateObservable.withInitialState(composeRecorderMediaSpec(mediaSpec));
        this.mVideoCapabilitiesSource = i11;
        this.mStreamInfo = MutableStateObservable.withInitialState(StreamInfo.m2142of(this.mStreamId, internalStateToStreamState(this.mState)));
        this.mIsRecording = MutableStateObservable.withInitialState(Boolean.FALSE);
        this.mVideoEncoderFactory = encoderFactory;
        this.mAudioEncoderFactory = encoderFactory2;
        this.mOutputStorageFactory = factory;
        this.mVideoEncoderSession = new VideoEncoderSession(encoderFactory, executorNewSequentialExecutor, executor);
        j11 = j11 == -1 ? REQUIRED_FREE_STORAGE_DEFAULT_BYTES : j11;
        this.mRequiredFreeStorageBytes = j11;
        Logger.m1866d(TAG, "mRequiredFreeStorageBytes = " + StorageUtil.formatSize(j11));
    }

    private MediaSpec composeRecorderMediaSpec(MediaSpec mediaSpec) {
        MediaSpec.Builder builder = mediaSpec.toBuilder();
        if (mediaSpec.getVideoSpec().getAspectRatio() == -1) {
            builder.configureVideo(new Consumer() { // from class: androidx.camera.video.m
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setAspectRatio(Recorder.VIDEO_SPEC_DEFAULT.getAspectRatio());
                }
            });
        }
        return builder.build();
    }

    private void configureInternal(SurfaceRequest surfaceRequest, Timebase timebase, boolean z11) {
        int i11;
        if (surfaceRequest.isServiced()) {
            Logger.m1872w(TAG, "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        surfaceRequest.setTransformationInfoListener(this.mSequentialExecutor, new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.video.p
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                this.f2099a.mSourceTransformationInfo = transformationInfo;
            }
        });
        Size resolution = surfaceRequest.getResolution();
        DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
        VideoCapabilities mediaCapabilities = getMediaCapabilities(surfaceRequest.getCamera().getCameraInfo(), surfaceRequest.getSessionType());
        Quality qualityFindNearestHigherSupportedQualityFor = mediaCapabilities.findNearestHigherSupportedQualityFor(resolution, dynamicRange);
        Logger.m1866d(TAG, "Using supported quality of " + qualityFindNearestHigherSupportedQualityFor + " for surface size " + resolution);
        if (qualityFindNearestHigherSupportedQualityFor != Quality.NONE) {
            VideoValidatedEncoderProfilesProxy profiles = mediaCapabilities.getProfiles(qualityFindNearestHigherSupportedQualityFor, dynamicRange);
            this.mResolvedEncoderProfiles = profiles;
            if (profiles == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        Logger.m1866d(TAG, "mResolvedEncoderProfiles = " + this.mResolvedEncoderProfiles);
        SetupVideoTask setupVideoTask = this.mSetupVideoTask;
        if (setupVideoTask != null) {
            setupVideoTask.cancelFailedRetry();
        }
        boolean z12 = this.mHasGlProcessing;
        if (z11) {
            i11 = sRetrySetupVideoMaxCount;
        } else {
            i11 = 0;
        }
        SetupVideoTask setupVideoTask2 = new SetupVideoTask(surfaceRequest, timebase, z12, i11);
        this.mSetupVideoTask = setupVideoTask2;
        setupVideoTask2.start();
    }

    private int internalAudioStateToAudioStatsState(AudioState audioState) {
        int iOrdinal = audioState.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return 3;
            }
            if (iOrdinal == 5) {
                return 4;
            }
            throw new AssertionError("Invalid internal audio state: " + audioState);
        }
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord != null && recordingRecord.isMuted()) {
            return 5;
        }
        if (this.mIsAudioSourceSilenced) {
            return 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m2124m(final Recorder recorder, final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) {
        recorder.getClass();
        final Consumer consumer = new Consumer() { // from class: androidx.camera.video.d
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                Recorder.m2115d(this.f1950b, completer, (Throwable) obj);
            }
        };
        recorder.mAudioSource.setAudioSourceCallback(recorder.mSequentialExecutor, new AudioSource.AudioSourceCallback() { // from class: androidx.camera.video.Recorder.4
            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onAmplitudeValue(double d11) {
                Recorder.this.mAudioAmplitude = d11;
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onError(Throwable th2) {
                Logger.m1869e(Recorder.TAG, "Error occurred after audio source started.", th2);
                if (th2 instanceof AudioSourceAccessException) {
                    consumer.accept(th2);
                }
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onSilenceStateChanged(boolean z11) {
                Recorder recorder2 = Recorder.this;
                if (recorder2.mIsAudioSourceSilenced != z11) {
                    recorder2.mIsAudioSourceSilenced = z11;
                    recorder2.updateInProgressStatusEvent(true);
                } else {
                    Logger.m1872w(Recorder.TAG, "Audio source silenced transitions to the same state " + z11);
                }
            }
        });
        recorder.mAudioEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.5
            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(EncodeException encodeException) {
                if (Recorder.this.mAudioErrorCause == null) {
                    consumer.accept(encodeException);
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(EncodedData encodedData) {
                Recorder recorder2 = Recorder.this;
                if (recorder2.mAudioState == AudioState.DISABLED) {
                    encodedData.close();
                    throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
                }
                if (recorder2.mMediaMuxer == null) {
                    if (recorder2.mInProgressRecordingStopping) {
                        Logger.m1866d(Recorder.TAG, "Drop audio data since recording is stopping.");
                    } else {
                        recorder2.mPendingAudioRingBuffer.enqueue(new BufferCopiedEncodedData(encodedData));
                        if (Recorder.this.mPendingFirstVideoData != null) {
                            Logger.m1866d(Recorder.TAG, "Received audio data. Starting muxer...");
                            Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                        } else {
                            Logger.m1866d(Recorder.TAG, "Cached audio data while we wait for video keyframe before starting muxer.");
                        }
                    }
                    encodedData.close();
                    return;
                }
                try {
                    recorder2.writeAudioData(encodedData, recordingRecord);
                    if (encodedData != null) {
                        encodedData.close();
                    }
                } catch (Throwable th2) {
                    if (encodedData != null) {
                        try {
                            encodedData.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mAudioOutputConfig = outputConfig;
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }
        }, recorder.mSequentialExecutor);
        return "audioEncodingFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void muteInternal(RecordingRecord recordingRecord, boolean z11) {
        AudioSource audioSource;
        if (recordingRecord.isMuted() != z11) {
            recordingRecord.mute(z11);
            if (this.mInProgressRecording == recordingRecord && !this.mInProgressRecordingStopping && (audioSource = this.mAudioSource) != null) {
                audioSource.mute(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledFuture<?> scheduleTask(final Runnable runnable, final Executor executor, long j11, TimeUnit timeUnit) {
        return CameraXExecutors.mainThreadExecutor().schedule(new Runnable() { // from class: androidx.camera.video.b
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        }, j11, timeUnit);
    }

    private void startRecording(RecordingRecord recordingRecord, boolean z11) {
        startInternal(recordingRecord);
        if (z11) {
            pauseInternal(recordingRecord);
        }
    }

    public <T> T getObservableData(StateObservable<T> stateObservable) {
        try {
            return stateObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public void onVideoEncoderReady(final VideoEncoderSession videoEncoderSession) {
        Encoder encoder = (Encoder) Preconditions.checkNotNull(videoEncoderSession.getVideoEncoder());
        this.mVideoEncoder = encoder;
        this.mVideoEncoderBitrateRange.setState(((VideoEncoderInfo) encoder.getEncoderInfo()).getSupportedBitrateRange());
        this.mFirstRecordingVideoBitrate = this.mVideoEncoder.getConfiguredBitrate();
        Surface activeSurface = videoEncoderSession.getActiveSurface();
        this.mActiveSurface = activeSurface;
        setLatestSurface(activeSurface);
        videoEncoderSession.setOnSurfaceUpdateListener(this.mSequentialExecutor, new Encoder.SurfaceInput.OnSurfaceUpdateListener() { // from class: androidx.camera.video.t
            @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
            public final void onSurfaceUpdate(Surface surface) {
                this.f2113a.setLatestSurface(surface);
            }
        });
        Futures.addCallback(videoEncoderSession.getReadyToReleaseFuture(), new FutureCallback<Encoder>() { // from class: androidx.camera.video.Recorder.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                Logger.m1866d(Recorder.TAG, "Error in ReadyToReleaseFuture: " + th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Encoder encoder2) {
                Encoder encoder3;
                Logger.m1866d(Recorder.TAG, "VideoEncoder can be released: " + encoder2);
                if (encoder2 == null) {
                    return;
                }
                ScheduledFuture<?> scheduledFuture = Recorder.this.mSourceNonStreamingTimeout;
                if (scheduledFuture != null && scheduledFuture.cancel(false) && (encoder3 = Recorder.this.mVideoEncoder) != null && encoder3 == encoder2) {
                    Recorder.notifyEncoderSourceStopped(encoder3);
                }
                Recorder recorder = Recorder.this;
                recorder.mVideoEncoderSessionToRelease = videoEncoderSession;
                recorder.setLatestSurface(null);
                Recorder recorder2 = Recorder.this;
                recorder2.requestReset(4, null, recorder2.isPersistentRecordingInProgress());
            }
        }, this.mSequentialExecutor);
    }

    public PendingRecording prepareRecording(Context context, MediaStoreOutputOptions mediaStoreOutputOptions) {
        return prepareRecordingInternal(context, mediaStoreOutputOptions);
    }
}
