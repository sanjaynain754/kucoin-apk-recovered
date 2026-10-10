package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.media3.common.C2711C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.FrameInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UnstableApi
public final class PlaybackVideoGraphWrapper implements VideoSinkProvider, VideoGraph.Listener {
    private static final Executor NO_OP_EXECUTOR = new Executor() { // from class: androidx.media3.exoplayer.video.c
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            PlaybackVideoGraphWrapper.m3489a(runnable);
        }
    };
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 2;
    private long bufferTimestampAdjustmentUs;
    private final Clock clock;
    private final List<Effect> compositionEffects;
    private final Context context;

    @Nullable
    private Pair<Surface, Size> currentSurfaceAndSize;
    private final VideoSink defaultVideoSink;
    private HandlerWrapper handler;
    private final InputVideoSink inputVideoSink;
    private final CopyOnWriteArraySet<Listener> listeners;
    private Format outputFormat;
    private int pendingFlushCount;
    private final PreviewingVideoGraph.Factory previewingVideoGraphFactory;
    private int state;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameRenderControl videoFrameRenderControl;
    private PreviewingVideoGraph videoGraph;

    public static final class Builder {
        private boolean built;
        private final Context context;
        private PreviewingVideoGraph.Factory previewingVideoGraphFactory;
        private VideoFrameProcessor.Factory videoFrameProcessorFactory;
        private final VideoFrameReleaseControl videoFrameReleaseControl;
        private List<Effect> compositionEffects = ImmutableList.m13439of();
        private Clock clock = Clock.DEFAULT;

        public PlaybackVideoGraphWrapper build() {
            Assertions.checkState(!this.built);
            if (this.previewingVideoGraphFactory == null) {
                if (this.videoFrameProcessorFactory == null) {
                    this.videoFrameProcessorFactory = new ReflectiveDefaultVideoFrameProcessorFactory();
                }
                this.previewingVideoGraphFactory = new ReflectivePreviewingSingleInputVideoGraphFactory(this.videoFrameProcessorFactory);
            }
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = new PlaybackVideoGraphWrapper(this);
            this.built = true;
            return playbackVideoGraphWrapper;
        }

        @CanIgnoreReturnValue
        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setCompositionEffects(List<Effect> list) {
            this.compositionEffects = list;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPreviewingVideoGraphFactory(PreviewingVideoGraph.Factory factory) {
            this.previewingVideoGraphFactory = factory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVideoFrameProcessorFactory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
            return this;
        }

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }
    }

    public final class FrameRendererImpl implements VideoFrameRenderControl.FrameRenderer {
        private FrameRendererImpl() {
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void dropFrame() {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFrameDropped(PlaybackVideoGraphWrapper.this);
            }
            ((PreviewingVideoGraph) Assertions.checkStateNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).renderOutputFrame(-2L);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void onVideoSizeChanged(VideoSize videoSize) {
            PlaybackVideoGraphWrapper.this.outputFormat = new Format.Builder().setWidth(videoSize.width).setHeight(videoSize.height).setSampleMimeType(MimeTypes.VIDEO_RAW).build();
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onVideoSizeChanged(PlaybackVideoGraphWrapper.this, videoSize);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void renderFrame(long j11, long j12, long j13, boolean z11) {
            if (z11 && PlaybackVideoGraphWrapper.this.currentSurfaceAndSize != null) {
                Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
                while (it.hasNext()) {
                    ((Listener) it.next()).onFirstFrameRendered(PlaybackVideoGraphWrapper.this);
                }
            }
            if (PlaybackVideoGraphWrapper.this.videoFrameMetadataListener != null) {
                PlaybackVideoGraphWrapper.this.videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j12, PlaybackVideoGraphWrapper.this.clock.nanoTime(), PlaybackVideoGraphWrapper.this.outputFormat == null ? new Format.Builder().build() : PlaybackVideoGraphWrapper.this.outputFormat, null);
            }
            ((PreviewingVideoGraph) Assertions.checkStateNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).renderOutputFrame(j11);
        }
    }

    public final class InputVideoSink implements VideoSink, Listener {
        private boolean hasRegisteredFirstInputStream;
        private long inputBufferTimestampAdjustmentUs;

        @Nullable
        private Format inputFormat;
        private long inputStreamOffsetUs;
        private long inputStreamStartPositionUs;
        private int inputType;
        private boolean isInputStreamChangePending;
        private long lastResetPositionUs;
        private long pendingInputStreamBufferPresentationTimeUs;
        private boolean pendingInputStreamOffsetChange;
        private VideoFrameProcessor videoFrameProcessor;
        private final int videoFrameProcessorMaxPendingFrameCount;
        private final ArrayList<Effect> videoEffects = new ArrayList<>();
        private final VideoFrameReleaseControl.FrameReleaseInfo frameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
        private long finalBufferPresentationTimeUs = C2711C.TIME_UNSET;
        private long lastBufferPresentationTimeUs = C2711C.TIME_UNSET;
        private VideoSink.Listener listener = VideoSink.Listener.NO_OP;
        private Executor listenerExecutor = PlaybackVideoGraphWrapper.NO_OP_EXECUTOR;

        public InputVideoSink(Context context) {
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
        }

        private void maybeRegisterInputStream() {
            if (this.inputFormat == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.videoEffects);
            Format format = (Format) Assertions.checkNotNull(this.inputFormat);
            ((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).registerInputStream(this.inputType, arrayList, new FrameInfo.Builder(PlaybackVideoGraphWrapper.getAdjustedInputColorInfo(format.colorInfo), format.width, format.height).setPixelWidthHeightRatio(format.pixelWidthHeightRatio).build());
            this.finalBufferPresentationTimeUs = C2711C.TIME_UNSET;
        }

        private boolean maybeRegisterPendingInputStream() {
            if (!this.isInputStreamChangePending) {
                return true;
            }
            long j11 = this.pendingInputStreamBufferPresentationTimeUs;
            if (j11 != C2711C.TIME_UNSET && !PlaybackVideoGraphWrapper.this.hasReleasedFrame(j11)) {
                return false;
            }
            maybeRegisterInputStream();
            this.isInputStreamChangePending = false;
            this.pendingInputStreamBufferPresentationTimeUs = C2711C.TIME_UNSET;
            return true;
        }

        private void maybeSetStreamOffsetChange(long j11) {
            if (this.pendingInputStreamOffsetChange) {
                PlaybackVideoGraphWrapper.this.onStreamOffsetChange(this.inputBufferTimestampAdjustmentUs, j11, this.inputStreamOffsetUs);
                this.pendingInputStreamOffsetChange = false;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void clearOutputSurfaceInfo() {
            PlaybackVideoGraphWrapper.this.clearOutputSurfaceInfo();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void enableMayRenderStartOfStream() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.enableMayRenderStartOfStream();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return this.videoFrameProcessor != null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady(boolean z11) {
            return PlaybackVideoGraphWrapper.this.isReady(z11 && isInitialized());
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void join(boolean z11) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.join(z11);
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onError(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, final VideoFrameProcessingException videoFrameProcessingException) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.f
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackVideoGraphWrapper.InputVideoSink.m3491a(this.f3450b, listener, videoFrameProcessingException);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFirstFrameRendered(PlaybackVideoGraphWrapper playbackVideoGraphWrapper) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.g
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackVideoGraphWrapper.InputVideoSink.m3494d(this.f3453b, listener);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameDropped(PlaybackVideoGraphWrapper playbackVideoGraphWrapper) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.h
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackVideoGraphWrapper.InputVideoSink.m3493c(this.f3455b, listener);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererDisabled() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererDisabled();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererEnabled(boolean z11) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererEnabled(z11);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererStarted() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererStarted();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererStopped() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererStopped();
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onVideoSizeChanged(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, final VideoSize videoSize) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.e
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackVideoGraphWrapper.InputVideoSink.m3492b(this.f3447b, listener, videoSize);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            PlaybackVideoGraphWrapper.this.release();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j11, long j12) throws VideoSink.VideoSinkException {
            try {
                PlaybackVideoGraphWrapper.this.render(j11, j12);
            } catch (ExoPlaybackException e11) {
                Format formatBuild = this.inputFormat;
                if (formatBuild == null) {
                    formatBuild = new Format.Builder().build();
                }
                throw new VideoSink.VideoSinkException(e11, formatBuild);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setChangeFrameRateStrategy(int i11) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.setChangeFrameRateStrategy(i11);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(VideoSink.Listener listener, Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setOutputSurfaceInfo(Surface surface, Size size) {
            PlaybackVideoGraphWrapper.this.setOutputSurfaceInfo(surface, size);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPendingVideoEffects(List<Effect> list) {
            this.videoEffects.clear();
            this.videoEffects.addAll(list);
            this.videoEffects.addAll(PlaybackVideoGraphWrapper.this.compositionEffects);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f11) {
            PlaybackVideoGraphWrapper.this.setPlaybackSpeed(f11);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setStreamTimestampInfo(long j11, long j12, long j13, long j14) {
            this.pendingInputStreamOffsetChange |= (this.inputStreamOffsetUs == j12 && this.inputBufferTimestampAdjustmentUs == j13) ? false : true;
            this.inputStreamStartPositionUs = j11;
            this.inputStreamOffsetUs = j12;
            this.inputBufferTimestampAdjustmentUs = j13;
            this.lastResetPositionUs = j14;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoEffects(List<Effect> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            setPendingVideoEffects(list);
            maybeRegisterInputStream();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            PlaybackVideoGraphWrapper.this.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m3491a(InputVideoSink inputVideoSink, VideoSink.Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
            inputVideoSink.getClass();
            listener.onError(inputVideoSink, new VideoSink.VideoSinkException(videoFrameProcessingException, (Format) Assertions.checkStateNotNull(inputVideoSink.inputFormat)));
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m3492b(InputVideoSink inputVideoSink, VideoSink.Listener listener, VideoSize videoSize) {
            inputVideoSink.getClass();
            listener.onVideoSizeChanged(inputVideoSink, videoSize);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m3493c(InputVideoSink inputVideoSink, VideoSink.Listener listener) {
            inputVideoSink.getClass();
            listener.onFrameDropped((VideoSink) Assertions.checkStateNotNull(inputVideoSink));
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m3494d(InputVideoSink inputVideoSink, VideoSink.Listener listener) {
            inputVideoSink.getClass();
            listener.onFirstFrameRendered(inputVideoSink);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush(boolean z11) {
            if (isInitialized()) {
                this.videoFrameProcessor.flush();
            }
            this.hasRegisteredFirstInputStream = false;
            this.finalBufferPresentationTimeUs = C2711C.TIME_UNSET;
            this.lastBufferPresentationTimeUs = C2711C.TIME_UNSET;
            PlaybackVideoGraphWrapper.this.flush(z11);
            this.pendingInputStreamBufferPresentationTimeUs = C2711C.TIME_UNSET;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface getInputSurface() {
            Assertions.checkState(isInitialized());
            return ((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).getInputSurface();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
            Assertions.checkState(isInitialized());
            boolean z11 = false;
            if (!maybeRegisterPendingInputStream() || !((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).queueInputBitmap(bitmap, timestampIterator)) {
                return false;
            }
            TimestampIterator timestampIteratorCopyOf = timestampIterator.copyOf();
            long next = timestampIteratorCopyOf.next();
            long lastTimestampUs = timestampIteratorCopyOf.getLastTimestampUs() - this.inputBufferTimestampAdjustmentUs;
            if (lastTimestampUs != C2711C.TIME_UNSET) {
                z11 = true;
            }
            Assertions.checkState(z11);
            maybeSetStreamOffsetChange(next);
            this.lastBufferPresentationTimeUs = lastTimestampUs;
            this.finalBufferPresentationTimeUs = lastTimestampUs;
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputFrame(long j11, boolean z11, long j12, long j13, VideoSink.VideoFrameHandler videoFrameHandler) throws VideoSink.VideoSinkException {
            Assertions.checkState(isInitialized());
            long j14 = j11 - this.inputBufferTimestampAdjustmentUs;
            try {
                if (PlaybackVideoGraphWrapper.this.videoFrameReleaseControl.getFrameReleaseAction(j14, j12, j13, this.inputStreamStartPositionUs, z11, this.frameReleaseInfo) == 4) {
                    return false;
                }
                if (j14 < this.lastResetPositionUs && !z11) {
                    videoFrameHandler.skip();
                    return true;
                }
                render(j12, j13);
                if (this.isInputStreamChangePending) {
                    long j15 = this.pendingInputStreamBufferPresentationTimeUs;
                    if (j15 != C2711C.TIME_UNSET && !PlaybackVideoGraphWrapper.this.hasReleasedFrame(j15)) {
                        return false;
                    }
                    maybeRegisterInputStream();
                    this.isInputStreamChangePending = false;
                    this.pendingInputStreamBufferPresentationTimeUs = C2711C.TIME_UNSET;
                }
                if (((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).getPendingInputFrameCount() >= this.videoFrameProcessorMaxPendingFrameCount || !((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).registerInputFrame()) {
                    return false;
                }
                maybeSetStreamOffsetChange(j14);
                this.lastBufferPresentationTimeUs = j14;
                if (z11) {
                    this.finalBufferPresentationTimeUs = j14;
                }
                videoFrameHandler.render(1000 * j11);
                return true;
            } catch (ExoPlaybackException e11) {
                throw new VideoSink.VideoSinkException(e11, (Format) Assertions.checkStateNotNull(this.inputFormat));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void initialize(Format format) throws VideoSink.VideoSinkException {
            Assertions.checkState(!isInitialized());
            this.videoFrameProcessor = PlaybackVideoGraphWrapper.this.initialize(format);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            if (isInitialized()) {
                long j11 = this.finalBufferPresentationTimeUs;
                if (j11 != C2711C.TIME_UNSET && PlaybackVideoGraphWrapper.this.hasReleasedFrame(j11)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onInputStreamChanged(int i11, Format format) {
            Assertions.checkState(isInitialized());
            if (i11 != 1 && i11 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i11);
            }
            PlaybackVideoGraphWrapper.this.videoFrameReleaseControl.setFrameRate(format.frameRate);
            this.inputType = i11;
            this.inputFormat = format;
            boolean z11 = false;
            if (!this.hasRegisteredFirstInputStream) {
                maybeRegisterInputStream();
                this.hasRegisteredFirstInputStream = true;
                this.isInputStreamChangePending = false;
                this.pendingInputStreamBufferPresentationTimeUs = C2711C.TIME_UNSET;
                return;
            }
            if (this.lastBufferPresentationTimeUs != C2711C.TIME_UNSET) {
                z11 = true;
            }
            Assertions.checkState(z11);
            this.isInputStreamChangePending = true;
            this.pendingInputStreamBufferPresentationTimeUs = this.lastBufferPresentationTimeUs;
        }
    }

    public interface Listener {
        void onError(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, VideoFrameProcessingException videoFrameProcessingException);

        void onFirstFrameRendered(PlaybackVideoGraphWrapper playbackVideoGraphWrapper);

        void onFrameDropped(PlaybackVideoGraphWrapper playbackVideoGraphWrapper);

        void onVideoSizeChanged(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, VideoSize videoSize);
    }

    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {
        private static final Supplier<VideoFrameProcessor.Factory> VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER = Suppliers.memoize(new Supplier() { // from class: androidx.media3.exoplayer.video.i
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return PlaybackVideoGraphWrapper.ReflectiveDefaultVideoFrameProcessorFactory.m3495a();
            }
        });

        private ReflectiveDefaultVideoFrameProcessorFactory() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ VideoFrameProcessor.Factory m3495a() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (VideoFrameProcessor.Factory) Assertions.checkNotNull(cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]));
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Factory
        public VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z11, Executor executor, VideoFrameProcessor.Listener listener) throws VideoFrameProcessingException {
            return VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER.get().create(context, debugViewProvider, colorInfo, z11, executor, listener);
        }
    }

    public static final class ReflectivePreviewingSingleInputVideoGraphFactory implements PreviewingVideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public PreviewingVideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, List<Effect> list, long j11) throws VideoFrameProcessingException {
            try {
                return ((PreviewingVideoGraph.Factory) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.videoFrameProcessorFactory)).create(context, colorInfo, debugViewProvider, listener, executor, list, j11);
            } catch (Exception e11) {
                throw VideoFrameProcessingException.from(e11);
            }
        }

        public ReflectivePreviewingSingleInputVideoGraphFactory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }
    }

    private PlaybackVideoGraphWrapper(Builder builder) {
        Context context = builder.context;
        this.context = context;
        InputVideoSink inputVideoSink = new InputVideoSink(context);
        this.inputVideoSink = inputVideoSink;
        Clock clock = builder.clock;
        this.clock = clock;
        VideoFrameReleaseControl videoFrameReleaseControl = builder.videoFrameReleaseControl;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        videoFrameReleaseControl.setClock(clock);
        VideoFrameRenderControl videoFrameRenderControl = new VideoFrameRenderControl(new FrameRendererImpl(), videoFrameReleaseControl);
        this.videoFrameRenderControl = videoFrameRenderControl;
        this.previewingVideoGraphFactory = (PreviewingVideoGraph.Factory) Assertions.checkStateNotNull(builder.previewingVideoGraphFactory);
        this.compositionEffects = builder.compositionEffects;
        this.defaultVideoSink = new DefaultVideoSink(videoFrameReleaseControl, videoFrameRenderControl);
        this.listeners = new CopyOnWriteArraySet<>();
        this.state = 0;
        addListener(inputVideoSink);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3490b(PlaybackVideoGraphWrapper playbackVideoGraphWrapper) {
        playbackVideoGraphWrapper.pendingFlushCount--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ColorInfo getAdjustedInputColorInfo(@Nullable ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid()) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReleasedFrame(long j11) {
        return this.pendingFlushCount == 0 && this.videoFrameRenderControl.hasReleasedFrame(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoFrameProcessor initialize(Format format) throws VideoSink.VideoSinkException {
        Assertions.checkState(this.state == 0);
        ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format.colorInfo);
        if (adjustedInputColorInfo.colorTransfer == 7 && Util.SDK_INT < 34) {
            adjustedInputColorInfo = adjustedInputColorInfo.buildUpon().setColorTransfer(6).build();
        }
        ColorInfo colorInfo = adjustedInputColorInfo;
        final HandlerWrapper handlerWrapperCreateHandler = this.clock.createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), null);
        this.handler = handlerWrapperCreateHandler;
        try {
            PreviewingVideoGraph.Factory factory = this.previewingVideoGraphFactory;
            Context context = this.context;
            DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
            Objects.requireNonNull(handlerWrapperCreateHandler);
            try {
                this.videoGraph = factory.create(context, colorInfo, debugViewProvider, this, new Executor() { // from class: androidx.media3.exoplayer.video.d
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handlerWrapperCreateHandler.post(runnable);
                    }
                }, ImmutableList.m13439of(), 0L);
                Pair<Surface, Size> pair = this.currentSurfaceAndSize;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    Size size = (Size) pair.second;
                    maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
                }
                this.videoGraph.registerInput(0);
                this.defaultVideoSink.initialize(format);
                this.state = 1;
                return this.videoGraph.getProcessor(0);
            } catch (VideoFrameProcessingException e11) {
                e = e11;
                throw new VideoSink.VideoSinkException(e, format);
            }
        } catch (VideoFrameProcessingException e12) {
            e = e12;
        }
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady(boolean z11) {
        return this.defaultVideoSink.isReady(z11 && this.pendingFlushCount == 0);
    }

    private void maybeSetOutputSurfaceInfo(@Nullable Surface surface, int i11, int i12) {
        PreviewingVideoGraph previewingVideoGraph = this.videoGraph;
        if (previewingVideoGraph == null) {
            return;
        }
        if (surface != null) {
            previewingVideoGraph.setOutputSurfaceInfo(new SurfaceInfo(surface, i11, i12));
            this.defaultVideoSink.setOutputSurfaceInfo(surface, new Size(i11, i12));
        } else {
            previewingVideoGraph.setOutputSurfaceInfo(null);
            this.defaultVideoSink.clearOutputSurfaceInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamOffsetChange(long j11, long j12, long j13) {
        this.bufferTimestampAdjustmentUs = j11;
        this.videoFrameRenderControl.onStreamOffsetChange(j12, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(long j11, long j12) throws ExoPlaybackException {
        this.videoFrameRenderControl.render(j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f11) {
        this.defaultVideoSink.setPlaybackSpeed(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void clearOutputSurfaceInfo() {
        Size size = Size.UNKNOWN;
        maybeSetOutputSurfaceInfo(null, size.getWidth(), size.getHeight());
        this.currentSurfaceAndSize = null;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public VideoSink getSink() {
        return this.inputVideoSink;
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onEnded(long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(this, videoFrameProcessingException);
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameAvailableForRendering(long j11) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        this.videoFrameRenderControl.onOutputFrameAvailableForRendering(j11 - this.bufferTimestampAdjustmentUs);
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputSizeChanged(int i11, int i12) {
        this.defaultVideoSink.onInputStreamChanged(1, new Format.Builder().setWidth(i11).setHeight(i12).build());
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void release() {
        if (this.state == 2) {
            return;
        }
        HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        PreviewingVideoGraph previewingVideoGraph = this.videoGraph;
        if (previewingVideoGraph != null) {
            previewingVideoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setOutputSurfaceInfo(Surface surface, Size size) {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = Pair.create(surface, size);
        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush(boolean z11) {
        if (!isInitialized()) {
            return;
        }
        this.pendingFlushCount++;
        this.defaultVideoSink.flush(z11);
        ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new Runnable() { // from class: androidx.media3.exoplayer.video.b
            @Override // java.lang.Runnable
            public final void run() {
                PlaybackVideoGraphWrapper.m3490b(this.f3445b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3489a(Runnable runnable) {
    }
}
