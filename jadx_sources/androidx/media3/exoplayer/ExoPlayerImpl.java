package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.C2711C;
import androidx.media3.common.C2737c0;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes34.dex */
final class ExoPlayerImpl extends BasePlayer implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.DeviceComponent {
    private static final String TAG = "ExoPlayerImpl";
    private final AnalyticsCollector analyticsCollector;
    private final Context applicationContext;
    private final Looper applicationLooper;
    private AudioAttributes audioAttributes;
    private final AudioBecomingNoisyManager audioBecomingNoisyManager;

    @Nullable
    private DecoderCounters audioDecoderCounters;
    private final AudioFocusManager audioFocusManager;

    @Nullable
    private Format audioFormat;

    @Nullable
    private AudioManager audioManager;
    private final CopyOnWriteArraySet<ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private int audioSessionId;
    private Player.Commands availableCommands;
    private final BandwidthMeter bandwidthMeter;

    @Nullable
    private CameraMotionListener cameraMotionListener;
    private final Clock clock;
    private final ComponentListener componentListener;
    private final ConditionVariable constructorFinished;
    private CueGroup currentCueGroup;
    private final long detachSurfaceTimeoutMs;
    private DeviceInfo deviceInfo;
    final TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private final FrameMetadataListener frameMetadataListener;
    private boolean hasNotifiedFullWrongThreadWarning;
    private final ExoPlayerImplInternal internalPlayer;
    private boolean isPriorityTaskManagerRegistered;
    private final ListenerSet<Player.Listener> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private final long maxSeekToPreviousPositionMs;
    private MediaMetadata mediaMetadata;
    private final MediaSource.Factory mediaSourceFactory;
    private final List<MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;

    @Nullable
    private Surface ownedSurface;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private final Timeline.Period period;
    final Player.Commands permanentAvailableCommands;
    private PlaybackInfo playbackInfo;
    private final HandlerWrapper playbackInfoUpdateHandler;
    private final ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private boolean playerReleased;
    private MediaMetadata playlistMetadata;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private int priority;

    @Nullable
    private PriorityTaskManager priorityTaskManager;
    private final Renderer[] renderers;
    private int repeatMode;
    private final long seekBackIncrementMs;
    private final long seekForwardIncrementMs;
    private SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private ShuffleOrder shuffleOrder;
    private boolean skipSilenceEnabled;

    @Nullable
    private SphericalGLSurfaceView sphericalGLSurfaceView;
    private MediaMetadata staticAndDynamicMediaMetadata;

    @Nullable
    private final StreamVolumeManager streamVolumeManager;

    @Nullable
    private final SuitableOutputChecker suitableOutputChecker;
    private final boolean suppressPlaybackOnUnsuitableOutput;

    @Nullable
    private SurfaceHolder surfaceHolder;
    private boolean surfaceHolderSurfaceIsVideoOutput;
    private Size surfaceSize;

    @Nullable
    private TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    private final TrackSelector trackSelector;
    private final boolean useLazyPreparation;
    private int videoChangeFrameRateStrategy;

    @Nullable
    private DecoderCounters videoDecoderCounters;

    @Nullable
    private Format videoFormat;

    @Nullable
    private VideoFrameMetadataListener videoFrameMetadataListener;

    @Nullable
    private Object videoOutput;
    private int videoScalingMode;
    private VideoSize videoSize;
    private float volume;
    private final WakeLockManager wakeLockManager;
    private final WifiLockManager wifiLockManager;
    private final Player wrappingPlayer;

    public final class ComponentListener implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, ExoPlayer.AudioOffloadListener {
        private ComponentListener() {
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public void onCues(final List<Cue> list) {
            ExoPlayerImpl.this.listeners.sendEvent(27, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.j2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onCues((List<Cue>) list);
                }
            });
        }

        @Override // androidx.media3.exoplayer.AudioFocusManager.PlayerControl
        public void executePlayerCommand(int i11) {
            ExoPlayerImpl.this.updatePlayWhenReady(ExoPlayerImpl.this.getPlayWhenReady(), i11, ExoPlayerImpl.getPlayWhenReadyChangeReason(i11));
        }

        @Override // androidx.media3.exoplayer.AudioBecomingNoisyManager.EventListener
        public void onAudioBecomingNoisy() {
            ExoPlayerImpl.this.updatePlayWhenReady(false, -1, 3);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioCodecError(Exception exc) {
            ExoPlayerImpl.this.analyticsCollector.onAudioCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(String str, long j11, long j12) {
            ExoPlayerImpl.this.analyticsCollector.onAudioDecoderInitialized(str, j11, j12);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(String str) {
            ExoPlayerImpl.this.analyticsCollector.onAudioDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDisabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.analyticsCollector.onAudioDisabled(decoderCounters);
            ExoPlayerImpl.this.audioFormat = null;
            ExoPlayerImpl.this.audioDecoderCounters = null;
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioEnabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.audioDecoderCounters = decoderCounters;
            ExoPlayerImpl.this.analyticsCollector.onAudioEnabled(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl.this.audioFormat = format;
            ExoPlayerImpl.this.analyticsCollector.onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long j11) {
            ExoPlayerImpl.this.analyticsCollector.onAudioPositionAdvancing(j11);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioSinkError(Exception exc) {
            ExoPlayerImpl.this.analyticsCollector.onAudioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            ExoPlayerImpl.this.analyticsCollector.onAudioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            ExoPlayerImpl.this.analyticsCollector.onAudioTrackReleased(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioUnderrun(int i11, long j11, long j12) {
            ExoPlayerImpl.this.analyticsCollector.onAudioUnderrun(i11, j11, j12);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public void onCues(final CueGroup cueGroup) {
            ExoPlayerImpl.this.currentCueGroup = cueGroup;
            ExoPlayerImpl.this.listeners.sendEvent(27, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onCues(cueGroup);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onDroppedFrames(int i11, long j11) {
            ExoPlayerImpl.this.analyticsCollector.onDroppedFrames(i11, j11);
        }

        @Override // androidx.media3.exoplayer.metadata.MetadataOutput
        public void onMetadata(final Metadata metadata) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.staticAndDynamicMediaMetadata = exoPlayerImpl.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(metadata).build();
            MediaMetadata mediaMetadataBuildUpdatedMediaMetadata = ExoPlayerImpl.this.buildUpdatedMediaMetadata();
            if (!mediaMetadataBuildUpdatedMediaMetadata.equals(ExoPlayerImpl.this.mediaMetadata)) {
                ExoPlayerImpl.this.mediaMetadata = mediaMetadataBuildUpdatedMediaMetadata;
                ExoPlayerImpl.this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g2
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((Player.Listener) obj).onMediaMetadataChanged(ExoPlayerImpl.this.mediaMetadata);
                    }
                });
            }
            ExoPlayerImpl.this.listeners.queueEvent(28, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.h2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMetadata(metadata);
                }
            });
            ExoPlayerImpl.this.listeners.flushEvents();
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onRenderedFirstFrame(Object obj, long j11) {
            ExoPlayerImpl.this.analyticsCollector.onRenderedFirstFrame(obj, j11);
            if (ExoPlayerImpl.this.videoOutput == obj) {
                ExoPlayerImpl.this.listeners.sendEvent(26, new C2737c0());
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(final boolean z11) {
            if (ExoPlayerImpl.this.skipSilenceEnabled == z11) {
                return;
            }
            ExoPlayerImpl.this.skipSilenceEnabled = z11;
            ExoPlayerImpl.this.listeners.sendEvent(23, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.i2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSkipSilenceEnabledChanged(z11);
                }
            });
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener
        public void onSleepingForOffloadChanged(boolean z11) {
            ExoPlayerImpl.this.updateWakeAndWifiLock();
        }

        @Override // androidx.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int i11) {
            final DeviceInfo deviceInfoCreateDeviceInfo = ExoPlayerImpl.createDeviceInfo(ExoPlayerImpl.this.streamVolumeManager);
            if (deviceInfoCreateDeviceInfo.equals(ExoPlayerImpl.this.deviceInfo)) {
                return;
            }
            ExoPlayerImpl.this.deviceInfo = deviceInfoCreateDeviceInfo;
            ExoPlayerImpl.this.listeners.sendEvent(29, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.l2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceInfoChanged(deviceInfoCreateDeviceInfo);
                }
            });
        }

        @Override // androidx.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(final int i11, final boolean z11) {
            ExoPlayerImpl.this.listeners.sendEvent(30, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.m2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceVolumeChanged(i11, z11);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            ExoPlayerImpl.this.setSurfaceTextureInternal(surfaceTexture);
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i11, i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ExoPlayerImpl.this.setVideoOutputInternal(null);
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i11, i12);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoCodecError(Exception exc) {
            ExoPlayerImpl.this.analyticsCollector.onVideoCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(String str, long j11, long j12) {
            ExoPlayerImpl.this.analyticsCollector.onVideoDecoderInitialized(str, j11, j12);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderReleased(String str) {
            ExoPlayerImpl.this.analyticsCollector.onVideoDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDisabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.analyticsCollector.onVideoDisabled(decoderCounters);
            ExoPlayerImpl.this.videoFormat = null;
            ExoPlayerImpl.this.videoDecoderCounters = null;
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoEnabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.videoDecoderCounters = decoderCounters;
            ExoPlayerImpl.this.analyticsCollector.onVideoEnabled(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long j11, int i11) {
            ExoPlayerImpl.this.analyticsCollector.onVideoFrameProcessingOffset(j11, i11);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl.this.videoFormat = format;
            ExoPlayerImpl.this.analyticsCollector.onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoSizeChanged(final VideoSize videoSize) {
            ExoPlayerImpl.this.videoSize = videoSize;
            ExoPlayerImpl.this.listeners.sendEvent(25, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.k2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVideoSizeChanged(videoSize);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(Surface surface) {
            ExoPlayerImpl.this.setVideoOutputInternal(surface);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(Surface surface) {
            ExoPlayerImpl.this.setVideoOutputInternal(null);
        }

        @Override // androidx.media3.exoplayer.AudioFocusManager.PlayerControl
        public void setVolumeMultiplier(float f11) {
            ExoPlayerImpl.this.sendVolumeToRenderers();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i12, i13);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                ExoPlayerImpl.this.setVideoOutputInternal(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                ExoPlayerImpl.this.setVideoOutputInternal(null);
            }
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public static final class FrameMetadataListener implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
        public static final int MSG_SET_SPHERICAL_SURFACE_VIEW = 10000;
        public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;

        @Nullable
        private CameraMotionListener cameraMotionListener;

        @Nullable
        private CameraMotionListener internalCameraMotionListener;

        @Nullable
        private VideoFrameMetadataListener internalVideoFrameMetadataListener;

        @Nullable
        private VideoFrameMetadataListener videoFrameMetadataListener;

        private FrameMetadataListener() {
        }

        @Override // androidx.media3.exoplayer.PlayerMessage.Target
        public void handleMessage(int i11, @Nullable Object obj) {
            if (i11 == 7) {
                this.videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i11 == 8) {
                this.cameraMotionListener = (CameraMotionListener) obj;
                return;
            }
            if (i11 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.internalVideoFrameMetadataListener = null;
                this.internalCameraMotionListener = null;
            } else {
                this.internalVideoFrameMetadataListener = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.internalCameraMotionListener = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotion(long j11, float[] fArr) {
            CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotion(j11, fArr);
            }
            CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotion(j11, fArr);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
            CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotionReset();
            }
            CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotionReset();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long j11, long j12, Format format, @Nullable MediaFormat mediaFormat) {
            long j13;
            long j14;
            Format format2;
            MediaFormat mediaFormat2;
            VideoFrameMetadataListener videoFrameMetadataListener = this.internalVideoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j11, j12, format, mediaFormat);
                mediaFormat2 = mediaFormat;
                format2 = format;
                j14 = j12;
                j13 = j11;
            } else {
                j13 = j11;
                j14 = j12;
                format2 = format;
                mediaFormat2 = mediaFormat;
            }
            VideoFrameMetadataListener videoFrameMetadataListener2 = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(j13, j14, format2, mediaFormat2);
            }
        }
    }

    public static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {
        private final MediaSource mediaSource;
        private Timeline timeline;
        private final Object uid;

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Timeline getTimeline() {
            return this.timeline;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Object getUid() {
            return this.uid;
        }

        public void updateTimeline(Timeline timeline) {
            this.timeline = timeline;
        }

        public MediaSourceHolderSnapshot(Object obj, MaskingMediaSource maskingMediaSource) {
            this.uid = obj;
            this.mediaSource = maskingMediaSource;
            this.timeline = maskingMediaSource.getTimeline();
        }
    }

    @RequiresApi(23)
    public final class NoSuitableOutputPlaybackSuppressionAudioDeviceCallback extends AudioDeviceCallback {
        private NoSuitableOutputPlaybackSuppressionAudioDeviceCallback() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (ExoPlayerImpl.this.hasSupportedAudioOutput() && ExoPlayerImpl.this.playbackInfo.playbackSuppressionReason == 3) {
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                exoPlayerImpl.updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(exoPlayerImpl.playbackInfo.playWhenReady, 1, 0);
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (ExoPlayerImpl.this.hasSupportedAudioOutput()) {
                return;
            }
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(exoPlayerImpl.playbackInfo.playWhenReady, 1, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPlayWhenReadyChangeReason(int i11) {
        return i11 == -1 ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSelectedOutputSuitabilityChanged(boolean z11) {
        if (!z11) {
            updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(this.playbackInfo.playWhenReady, 1, 3);
            return;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackSuppressionReason == 3) {
            updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(playbackInfo.playWhenReady, 1, 0);
        }
    }

    private void sendRendererMessage(int i11, @Nullable Object obj) {
        sendRendererMessage(-1, i11, obj);
    }

    private void setNonVideoOutputSurfaceHolderInternal(SurfaceHolder surfaceHolder) {
        this.surfaceHolderSurfaceIsVideoOutput = false;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        Surface surface = this.surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            Rect surfaceFrame = this.surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(List<MediaSource> list) {
        verifyApplicationThread();
        addMediaSources(this.mediaSourceHolderSnapshots.size(), list);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface() {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(null);
        maybeNotifySurfaceSizeChanged(0, 0);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(1);
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(1);
        }
    }

    @Override // androidx.media3.common.Player
    public void prepare() {
        verifyApplicationThread();
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, 2);
        updatePlayWhenReady(playWhenReady, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != 1) {
            return;
        }
        PlaybackInfo playbackInfoCopyWithPlaybackError = playbackInfo.copyWithPlaybackError(null);
        PlaybackInfo playbackInfoCopyWithPlaybackState = playbackInfoCopyWithPlaybackError.copyWithPlaybackState(playbackInfoCopyWithPlaybackError.timeline.isEmpty() ? 4 : 2);
        this.pendingOperationAcks++;
        this.internalPlayer.prepare();
        updatePlaybackInfo(playbackInfoCopyWithPlaybackState, 1, false, 5, C2711C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void setDeviceMuted(boolean z11) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z11, 1);
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public void setDeviceVolume(int i11) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i11, 1);
        }
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list, boolean z11) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list) {
        verifyApplicationThread();
        setMediaSources(list, true);
    }

    @RequiresApi(23)
    public static final class Api23 {
        private Api23() {
        }

        public static boolean isSuitableExternalAudioOutputPresentInAudioDeviceInfoList(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!Util.isWear(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i11 = Util.SDK_INT;
                if (i11 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i11 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i11 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i11 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void registerAudioDeviceCallback(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    @RequiresApi(31)
    public static final class Api31 {
        private Api31() {
        }

        public static PlayerId registerMediaMetricsListener(Context context, ExoPlayerImpl exoPlayerImpl, boolean z11, String str) {
            MediaMetricsListener mediaMetricsListenerCreate = MediaMetricsListener.create(context);
            if (mediaMetricsListenerCreate == null) {
                Log.m2961w(ExoPlayerImpl.TAG, "MediaMetricsService unavailable.");
                return new PlayerId(LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z11) {
                exoPlayerImpl.addAnalyticsListener(mediaMetricsListenerCreate);
            }
            return new PlayerId(mediaMetricsListenerCreate.getLogSessionId(), str);
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public ExoPlayerImpl(ExoPlayer.Builder builder, @Nullable Player player) {
        ConditionVariable conditionVariable = new ConditionVariable();
        this.constructorFinished = conditionVariable;
        try {
            Log.m2959i(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + MediaLibraryInfo.VERSION_SLASHY + "] [" + Util.DEVICE_DEBUG_INFO + "]");
            Context applicationContext = builder.context.getApplicationContext();
            this.applicationContext = applicationContext;
            AnalyticsCollector analyticsCollectorApply = builder.analyticsCollectorFunction.apply(builder.clock);
            this.analyticsCollector = analyticsCollectorApply;
            this.priority = builder.priority;
            this.priorityTaskManager = builder.priorityTaskManager;
            this.audioAttributes = builder.audioAttributes;
            this.videoScalingMode = builder.videoScalingMode;
            this.videoChangeFrameRateStrategy = builder.videoChangeFrameRateStrategy;
            this.skipSilenceEnabled = builder.skipSilenceEnabled;
            this.detachSurfaceTimeoutMs = builder.detachSurfaceTimeoutMs;
            ComponentListener componentListener = new ComponentListener();
            this.componentListener = componentListener;
            FrameMetadataListener frameMetadataListener = new FrameMetadataListener();
            this.frameMetadataListener = frameMetadataListener;
            Handler handler = new Handler(builder.looper);
            Renderer[] rendererArrCreateRenderers = builder.renderersFactorySupplier.get().createRenderers(handler, componentListener, componentListener, componentListener, componentListener);
            this.renderers = rendererArrCreateRenderers;
            Assertions.checkState(rendererArrCreateRenderers.length > 0);
            TrackSelector trackSelector = builder.trackSelectorSupplier.get();
            this.trackSelector = trackSelector;
            this.mediaSourceFactory = builder.mediaSourceFactorySupplier.get();
            BandwidthMeter bandwidthMeter = builder.bandwidthMeterSupplier.get();
            this.bandwidthMeter = bandwidthMeter;
            this.useLazyPreparation = builder.useLazyPreparation;
            this.seekParameters = builder.seekParameters;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.pauseAtEndOfMediaItems = builder.pauseAtEndOfMediaItems;
            Looper looper = builder.looper;
            this.applicationLooper = looper;
            Clock clock = builder.clock;
            this.clock = clock;
            Player player2 = player == null ? this : player;
            this.wrappingPlayer = player2;
            boolean z11 = builder.suppressPlaybackOnUnsuitableOutput;
            this.suppressPlaybackOnUnsuitableOutput = z11;
            this.listeners = new ListenerSet<>(looper, clock, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.q1
                @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
                public final void invoke(Object obj, FlagSet flagSet) {
                    ((Player.Listener) obj).onEvents(this.f3296a.wrappingPlayer, new Player.Events(flagSet));
                }
            });
            this.audioOffloadListeners = new CopyOnWriteArraySet<>();
            this.mediaSourceHolderSnapshots = new ArrayList();
            this.shuffleOrder = new ShuffleOrder.DefaultShuffleOrder(0);
            this.preloadConfiguration = ExoPlayer.PreloadConfiguration.DEFAULT;
            TrackSelectorResult trackSelectorResult = new TrackSelectorResult(new RendererConfiguration[rendererArrCreateRenderers.length], new ExoTrackSelection[rendererArrCreateRenderers.length], Tracks.EMPTY, null);
            this.emptyTrackSelectorResult = trackSelectorResult;
            this.period = new Timeline.Period();
            Player.Commands commandsBuild = new Player.Commands.Builder().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).addIf(29, trackSelector.isSetParametersSupported()).addIf(23, builder.deviceVolumeControlEnabled).addIf(25, builder.deviceVolumeControlEnabled).addIf(33, builder.deviceVolumeControlEnabled).addIf(26, builder.deviceVolumeControlEnabled).addIf(34, builder.deviceVolumeControlEnabled).build();
            this.permanentAvailableCommands = commandsBuild;
            this.availableCommands = new Player.Commands.Builder().addAll(commandsBuild).add(4).add(10).build();
            this.playbackInfoUpdateHandler = clock.createHandler(looper, null);
            ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener = new ExoPlayerImplInternal.PlaybackInfoUpdateListener() { // from class: androidx.media3.exoplayer.r1
                @Override // androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener
                public final void onPlaybackInfoUpdate(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
                    ExoPlayerImpl exoPlayerImpl = this.f3300a;
                    exoPlayerImpl.playbackInfoUpdateHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.l1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3253b.handlePlaybackInfo(playbackInfoUpdate);
                        }
                    });
                }
            };
            this.playbackInfoUpdateListener = playbackInfoUpdateListener;
            this.playbackInfo = PlaybackInfo.createDummy(trackSelectorResult);
            analyticsCollectorApply.setPlayer(player2, looper);
            int i11 = Util.SDK_INT;
            ExoPlayerImplInternal exoPlayerImplInternal = new ExoPlayerImplInternal(rendererArrCreateRenderers, trackSelector, trackSelectorResult, builder.loadControlSupplier.get(), bandwidthMeter, this.repeatMode, this.shuffleModeEnabled, analyticsCollectorApply, this.seekParameters, builder.livePlaybackSpeedControl, builder.releaseTimeoutMs, this.pauseAtEndOfMediaItems, builder.dynamicSchedulingEnabled, looper, clock, playbackInfoUpdateListener, i11 < 31 ? new PlayerId(builder.playerName) : Api31.registerMediaMetricsListener(applicationContext, this, builder.usePlatformDiagnostics, builder.playerName), builder.playbackLooperProvider, this.preloadConfiguration);
            this.internalPlayer = exoPlayerImplInternal;
            this.volume = 1.0f;
            this.repeatMode = 0;
            MediaMetadata mediaMetadata = MediaMetadata.EMPTY;
            this.mediaMetadata = mediaMetadata;
            this.playlistMetadata = mediaMetadata;
            this.staticAndDynamicMediaMetadata = mediaMetadata;
            this.maskingWindowIndex = -1;
            this.audioSessionId = Util.generateAudioSessionIdV21(applicationContext);
            this.currentCueGroup = CueGroup.EMPTY_TIME_ZERO;
            this.throwsWhenUsingWrongThread = true;
            addListener(analyticsCollectorApply);
            bandwidthMeter.addEventListener(new Handler(looper), analyticsCollectorApply);
            addAudioOffloadListener(componentListener);
            long j11 = builder.foregroundModeTimeoutMs;
            if (j11 > 0) {
                exoPlayerImplInternal.experimentalSetForegroundModeTimeoutMs(j11);
            }
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(builder.context, handler, componentListener);
            this.audioBecomingNoisyManager = audioBecomingNoisyManager;
            audioBecomingNoisyManager.setEnabled(builder.handleAudioBecomingNoisy);
            AudioFocusManager audioFocusManager = new AudioFocusManager(builder.context, handler, componentListener);
            this.audioFocusManager = audioFocusManager;
            audioFocusManager.setAudioAttributes(builder.handleAudioFocus ? this.audioAttributes : null);
            SuitableOutputChecker suitableOutputChecker = builder.suitableOutputChecker;
            this.suitableOutputChecker = suitableOutputChecker;
            if (suitableOutputChecker != null && i11 >= 35) {
                suitableOutputChecker.enable(new SuitableOutputChecker.Callback() { // from class: androidx.media3.exoplayer.s1
                    @Override // androidx.media3.exoplayer.SuitableOutputChecker.Callback
                    public final void onSelectedOutputSuitabilityChanged(boolean z12) {
                        this.f3317a.onSelectedOutputSuitabilityChanged(z12);
                    }
                });
            } else if (z11 && i11 >= 23) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.audioManager = audioManager;
                Api23.registerAudioDeviceCallback(audioManager, new NoSuitableOutputPlaybackSuppressionAudioDeviceCallback(), new Handler(looper));
            }
            if (builder.deviceVolumeControlEnabled) {
                this.streamVolumeManager = new StreamVolumeManager(builder.context, handler, componentListener, Util.getStreamTypeForAudioUsage(this.audioAttributes.usage));
            } else {
                this.streamVolumeManager = null;
            }
            WakeLockManager wakeLockManager = new WakeLockManager(builder.context);
            this.wakeLockManager = wakeLockManager;
            wakeLockManager.setEnabled(builder.wakeMode != 0);
            WifiLockManager wifiLockManager = new WifiLockManager(builder.context);
            this.wifiLockManager = wifiLockManager;
            wifiLockManager.setEnabled(builder.wakeMode == 2);
            this.deviceInfo = createDeviceInfo(this.streamVolumeManager);
            this.videoSize = VideoSize.UNKNOWN;
            this.surfaceSize = Size.UNKNOWN;
            trackSelector.setAudioAttributes(this.audioAttributes);
            sendRendererMessage(1, 10, Integer.valueOf(this.audioSessionId));
            sendRendererMessage(2, 10, Integer.valueOf(this.audioSessionId));
            sendRendererMessage(1, 3, this.audioAttributes);
            sendRendererMessage(2, 4, Integer.valueOf(this.videoScalingMode));
            sendRendererMessage(2, 5, Integer.valueOf(this.videoChangeFrameRateStrategy));
            sendRendererMessage(1, 9, Boolean.valueOf(this.skipSilenceEnabled));
            sendRendererMessage(2, 7, frameMetadataListener);
            sendRendererMessage(6, 8, frameMetadataListener);
            sendRendererMessage(16, Integer.valueOf(this.priority));
            conditionVariable.open();
        } catch (Throwable th2) {
            this.constructorFinished.open();
            throw th2;
        }
    }

    private List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int i11, List<MediaSource> list) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder(list.get(i12), this.useLazyPreparation);
            arrayList.add(mediaSourceHolder);
            this.mediaSourceHolderSnapshots.add(i12 + i11, new MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(i11, arrayList.size());
        return arrayList;
    }

    private PlaybackInfo addMediaSourcesInternal(PlaybackInfo playbackInfo, int i11, List<MediaSource> list) {
        Timeline timeline = playbackInfo.timeline;
        this.pendingOperationAcks++;
        List<MediaSourceList.MediaSourceHolder> listAddMediaSourceHolders = addMediaSourceHolders(i11, list);
        Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(timeline, timelineCreateMaskingTimeline, getCurrentWindowIndexInternal(playbackInfo), getContentPositionInternal(playbackInfo)));
        this.internalPlayer.addMediaSources(i11, listAddMediaSourceHolders, this.shuffleOrder);
        return playbackInfoMaskTimelineAndPosition;
    }

    private boolean canUpdateMediaSourcesWithMediaItems(int i11, int i12, List<MediaItem> list) {
        if (i12 - i11 != list.size()) {
            return false;
        }
        for (int i13 = i11; i13 < i12; i13++) {
            if (!this.mediaSourceHolderSnapshots.get(i13).mediaSource.canUpdateMediaItem(list.get(i13 - i11))) {
                return false;
            }
        }
        return true;
    }

    private int computePlaybackSuppressionReason(boolean z11, int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (!this.suppressPlaybackOnUnsuitableOutput) {
            return 0;
        }
        if (!z11 || hasSupportedAudioOutput()) {
            return (z11 || this.playbackInfo.playbackSuppressionReason != 3) ? 0 : 3;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DeviceInfo createDeviceInfo(@Nullable StreamVolumeManager streamVolumeManager) {
        return new DeviceInfo.Builder(0).setMinVolume(streamVolumeManager != null ? streamVolumeManager.getMinVolume() : 0).setMaxVolume(streamVolumeManager != null ? streamVolumeManager.getMaxVolume() : 0).build();
    }

    private Timeline createMaskingTimeline() {
        return new PlaylistTimeline(this.mediaSourceHolderSnapshots, this.shuffleOrder);
    }

    private List<MediaSource> createMediaSources(List<MediaItem> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(this.mediaSourceFactory.createMediaSource(list.get(i11)));
        }
        return arrayList;
    }

    private PlayerMessage createMessageInternal(PlayerMessage.Target target) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        ExoPlayerImplInternal exoPlayerImplInternal = this.internalPlayer;
        Timeline timeline = this.playbackInfo.timeline;
        if (currentWindowIndexInternal == -1) {
            currentWindowIndexInternal = 0;
        }
        return new PlayerMessage(exoPlayerImplInternal, target, timeline, currentWindowIndexInternal, this.clock, exoPlayerImplInternal.getPlaybackLooper());
    }

    private Pair<Boolean, Integer> evaluateMediaItemTransitionReason(PlaybackInfo playbackInfo, PlaybackInfo playbackInfo2, boolean z11, int i11, boolean z12, boolean z13) {
        Timeline timeline = playbackInfo2.timeline;
        Timeline timeline2 = playbackInfo.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i12 = 3;
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (timeline.getWindow(timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period).windowIndex, this.window).uid.equals(timeline2.getWindow(timeline2.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window).uid)) {
            if (z11 && i11 == 0 && playbackInfo2.periodId.windowSequenceNumber < playbackInfo.periodId.windowSequenceNumber) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return (z11 && i11 == 1 && z13) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z11 && i11 == 0) {
            i12 = 1;
        } else if (z11 && i11 == 1) {
            i12 = 2;
        } else if (!z12) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i12));
    }

    private long getContentPositionInternal(PlaybackInfo playbackInfo) {
        if (!playbackInfo.periodId.isAd()) {
            return Util.usToMs(getCurrentPositionUsInternal(playbackInfo));
        }
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period);
        return playbackInfo.requestedContentPositionUs == C2711C.TIME_UNSET ? playbackInfo.timeline.getWindow(getCurrentWindowIndexInternal(playbackInfo), this.window).getDefaultPositionMs() : this.period.getPositionInWindowMs() + Util.usToMs(playbackInfo.requestedContentPositionUs);
    }

    private long getCurrentPositionUsInternal(PlaybackInfo playbackInfo) {
        if (playbackInfo.timeline.isEmpty()) {
            return Util.msToUs(this.maskingWindowPositionMs);
        }
        long estimatedPositionUs = playbackInfo.sleepingForOffload ? playbackInfo.getEstimatedPositionUs() : playbackInfo.positionUs;
        return playbackInfo.periodId.isAd() ? estimatedPositionUs : periodPositionUsToWindowPositionUs(playbackInfo.timeline, playbackInfo.periodId, estimatedPositionUs);
    }

    private int getCurrentWindowIndexInternal(PlaybackInfo playbackInfo) {
        return playbackInfo.timeline.isEmpty() ? this.maskingWindowIndex : playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex;
    }

    @Nullable
    private Pair<Object, Long> getPeriodPositionUsAfterTimelineChanged(Timeline timeline, Timeline timeline2, int i11, long j11) {
        boolean zIsEmpty = timeline.isEmpty();
        long j12 = C2711C.TIME_UNSET;
        if (zIsEmpty || timeline2.isEmpty()) {
            boolean z11 = !timeline.isEmpty() && timeline2.isEmpty();
            int i12 = z11 ? -1 : i11;
            if (!z11) {
                j12 = j11;
            }
            return maskWindowPositionMsOrGetPeriodPositionUs(timeline2, i12, j12);
        }
        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i11, Util.msToUs(j11));
        Object obj = ((Pair) Util.castNonNull(periodPositionUs)).first;
        if (timeline2.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        int iResolveSubsequentPeriod = ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, obj, timeline, timeline2);
        return iResolveSubsequentPeriod != -1 ? maskWindowPositionMsOrGetPeriodPositionUs(timeline2, iResolveSubsequentPeriod, timeline2.getWindow(iResolveSubsequentPeriod, this.window).getDefaultPositionMs()) : maskWindowPositionMsOrGetPeriodPositionUs(timeline2, -1, C2711C.TIME_UNSET);
    }

    private Player.PositionInfo getPreviousPositionInfo(int i11, PlaybackInfo playbackInfo, int i12) {
        int i13;
        Object obj;
        MediaItem mediaItem;
        Object obj2;
        int i14;
        long requestedContentPositionUs;
        long requestedContentPositionUs2;
        Timeline.Period period = new Timeline.Period();
        if (playbackInfo.timeline.isEmpty()) {
            i13 = i12;
            obj = null;
            mediaItem = null;
            obj2 = null;
            i14 = -1;
        } else {
            Object obj3 = playbackInfo.periodId.periodUid;
            playbackInfo.timeline.getPeriodByUid(obj3, period);
            int i15 = period.windowIndex;
            int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(obj3);
            Object obj4 = playbackInfo.timeline.getWindow(i15, this.window).uid;
            mediaItem = this.window.mediaItem;
            obj2 = obj3;
            i14 = indexOfPeriod;
            obj = obj4;
            i13 = i15;
        }
        if (i11 == 0) {
            if (playbackInfo.periodId.isAd()) {
                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
                requestedContentPositionUs = period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                requestedContentPositionUs2 = getRequestedContentPositionUs(playbackInfo);
            } else {
                requestedContentPositionUs = playbackInfo.periodId.nextAdGroupIndex != -1 ? getRequestedContentPositionUs(this.playbackInfo) : period.positionInWindowUs + period.durationUs;
                requestedContentPositionUs2 = requestedContentPositionUs;
            }
        } else if (playbackInfo.periodId.isAd()) {
            requestedContentPositionUs = playbackInfo.positionUs;
            requestedContentPositionUs2 = getRequestedContentPositionUs(playbackInfo);
        } else {
            requestedContentPositionUs = period.positionInWindowUs + playbackInfo.positionUs;
            requestedContentPositionUs2 = requestedContentPositionUs;
        }
        long jUsToMs = Util.usToMs(requestedContentPositionUs);
        long jUsToMs2 = Util.usToMs(requestedContentPositionUs2);
        MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
        return new Player.PositionInfo(obj, i13, mediaItem, obj2, i14, jUsToMs, jUsToMs2, mediaPeriodId2.adGroupIndex, mediaPeriodId2.adIndexInAdGroup);
    }

    private static long getRequestedContentPositionUs(PlaybackInfo playbackInfo) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, period);
        return playbackInfo.requestedContentPositionUs == C2711C.TIME_UNSET ? playbackInfo.timeline.getWindow(period.windowIndex, window).getDefaultPositionUs() : period.getPositionInWindowUs() + playbackInfo.requestedContentPositionUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlaybackInfo(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        boolean z11;
        long jPeriodPositionUsToWindowPositionUs;
        int i11 = this.pendingOperationAcks - playbackInfoUpdate.operationAcks;
        this.pendingOperationAcks = i11;
        boolean z12 = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.pendingDiscontinuityReason = playbackInfoUpdate.discontinuityReason;
            this.pendingDiscontinuity = true;
        }
        if (i11 == 0) {
            Timeline timeline = playbackInfoUpdate.playbackInfo.timeline;
            if (!this.playbackInfo.timeline.isEmpty() && timeline.isEmpty()) {
                this.maskingWindowIndex = -1;
                this.maskingWindowPositionMs = 0L;
                this.maskingPeriodIndex = 0;
            }
            if (!timeline.isEmpty()) {
                List<Timeline> childTimelines = ((PlaylistTimeline) timeline).getChildTimelines();
                Assertions.checkState(childTimelines.size() == this.mediaSourceHolderSnapshots.size());
                for (int i12 = 0; i12 < childTimelines.size(); i12++) {
                    this.mediaSourceHolderSnapshots.get(i12).updateTimeline(childTimelines.get(i12));
                }
            }
            boolean z13 = this.pendingDiscontinuity;
            long j11 = C2711C.TIME_UNSET;
            if (z13) {
                if (playbackInfoUpdate.playbackInfo.periodId.equals(this.playbackInfo.periodId) && playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs == this.playbackInfo.positionUs) {
                    z12 = false;
                }
                if (z12) {
                    if (timeline.isEmpty() || playbackInfoUpdate.playbackInfo.periodId.isAd()) {
                        jPeriodPositionUsToWindowPositionUs = playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs;
                    } else {
                        PlaybackInfo playbackInfo = playbackInfoUpdate.playbackInfo;
                        jPeriodPositionUsToWindowPositionUs = periodPositionUsToWindowPositionUs(timeline, playbackInfo.periodId, playbackInfo.discontinuityStartPositionUs);
                    }
                    j11 = jPeriodPositionUsToWindowPositionUs;
                }
                z11 = z12;
            } else {
                z11 = false;
            }
            this.pendingDiscontinuity = false;
            updatePlaybackInfo(playbackInfoUpdate.playbackInfo, 1, z11, this.pendingDiscontinuityReason, j11, -1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasSupportedAudioOutput() {
        AudioManager audioManager;
        SuitableOutputChecker suitableOutputChecker;
        int i11 = Util.SDK_INT;
        if (i11 >= 35 && (suitableOutputChecker = this.suitableOutputChecker) != null) {
            return suitableOutputChecker.isSelectedOutputSuitableForPlayback();
        }
        if (i11 < 23 || (audioManager = this.audioManager) == null) {
            return true;
        }
        return Api23.isSuitableExternalAudioOutputPresentInAudioDeviceInfoList(this.applicationContext, audioManager.getDevices(2));
    }

    private PlaybackInfo maskTimelineAndPosition(PlaybackInfo playbackInfo, Timeline timeline, @Nullable Pair<Object, Long> pair) {
        Assertions.checkArgument(timeline.isEmpty() || pair != null);
        Timeline timeline2 = playbackInfo.timeline;
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        PlaybackInfo playbackInfoCopyWithTimeline = playbackInfo.copyWithTimeline(timeline);
        if (timeline.isEmpty()) {
            MediaSource.MediaPeriodId dummyPeriodForEmptyTimeline = PlaybackInfo.getDummyPeriodForEmptyTimeline();
            long jMsToUs = Util.msToUs(this.maskingWindowPositionMs);
            PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfoCopyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, jMsToUs, jMsToUs, jMsToUs, 0L, TrackGroupArray.EMPTY, this.emptyTrackSelectorResult, ImmutableList.m13439of()).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
            return playbackInfoCopyWithLoadingMediaPeriodId;
        }
        Object obj = playbackInfoCopyWithTimeline.periodId.periodUid;
        boolean zEquals = obj.equals(((Pair) Util.castNonNull(pair)).first);
        MediaSource.MediaPeriodId mediaPeriodId = !zEquals ? new MediaSource.MediaPeriodId(pair.first) : playbackInfoCopyWithTimeline.periodId;
        long jLongValue = ((Long) pair.second).longValue();
        long jMsToUs2 = Util.msToUs(contentPositionInternal);
        if (!timeline2.isEmpty()) {
            jMsToUs2 -= timeline2.getPeriodByUid(obj, this.period).getPositionInWindowUs();
        }
        if (!zEquals || jLongValue < jMsToUs2) {
            MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            Assertions.checkState(!mediaPeriodId2.isAd());
            PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId2 = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? TrackGroupArray.EMPTY : playbackInfoCopyWithTimeline.trackGroups, !zEquals ? this.emptyTrackSelectorResult : playbackInfoCopyWithTimeline.trackSelectorResult, !zEquals ? ImmutableList.m13439of() : playbackInfoCopyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId2);
            playbackInfoCopyWithLoadingMediaPeriodId2.bufferedPositionUs = jLongValue;
            return playbackInfoCopyWithLoadingMediaPeriodId2;
        }
        if (jLongValue != jMsToUs2) {
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
            Assertions.checkState(!mediaPeriodId3.isAd());
            long jMax = Math.max(0L, playbackInfoCopyWithTimeline.totalBufferedDurationUs - (jLongValue - jMsToUs2));
            long j11 = playbackInfoCopyWithTimeline.bufferedPositionUs;
            if (playbackInfoCopyWithTimeline.loadingMediaPeriodId.equals(playbackInfoCopyWithTimeline.periodId)) {
                j11 = jLongValue + jMax;
            }
            PlaybackInfo playbackInfoCopyWithNewPosition = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId3, jLongValue, jLongValue, jLongValue, jMax, playbackInfoCopyWithTimeline.trackGroups, playbackInfoCopyWithTimeline.trackSelectorResult, playbackInfoCopyWithTimeline.staticMetadata);
            playbackInfoCopyWithNewPosition.bufferedPositionUs = j11;
            return playbackInfoCopyWithNewPosition;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(playbackInfoCopyWithTimeline.loadingMediaPeriodId.periodUid);
        if (indexOfPeriod != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex) {
            return playbackInfoCopyWithTimeline;
        }
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        long adDurationUs = mediaPeriodId.isAd() ? this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) : this.period.durationUs;
        MediaSource.MediaPeriodId mediaPeriodId4 = mediaPeriodId;
        PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId3 = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId4, playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.discontinuityStartPositionUs, adDurationUs - playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.trackGroups, playbackInfoCopyWithTimeline.trackSelectorResult, playbackInfoCopyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId4);
        playbackInfoCopyWithLoadingMediaPeriodId3.bufferedPositionUs = adDurationUs;
        return playbackInfoCopyWithLoadingMediaPeriodId3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(final int i11, final int i12) {
        if (i11 == this.surfaceSize.getWidth() && i12 == this.surfaceSize.getHeight()) {
            return;
        }
        this.surfaceSize = new Size(i11, i12);
        this.listeners.sendEvent(24, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.i1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onSurfaceSizeChanged(i11, i12);
            }
        });
        sendRendererMessage(2, 14, new Size(i11, i12));
    }

    private long periodPositionUsToWindowPositionUs(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j11) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return j11 + this.period.getPositionInWindowUs();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m3065q(PlaybackInfo playbackInfo, Player.Listener listener) {
        listener.onLoadingChanged(playbackInfo.isLoading);
        listener.onIsLoadingChanged(playbackInfo.isLoading);
    }

    private void removeMediaSourceHolders(int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            this.mediaSourceHolderSnapshots.remove(i13);
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i11, i12);
    }

    private void removeSurfaceCallbacks() {
        if (this.sphericalGLSurfaceView != null) {
            createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(null).send();
            this.sphericalGLSurfaceView.removeVideoSurfaceListener(this.componentListener);
            this.sphericalGLSurfaceView = null;
        }
        TextureView textureView = this.textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.componentListener) {
                Log.m2961w(TAG, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener(null);
            }
            this.textureView = null;
        }
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.componentListener);
            this.surfaceHolder = null;
        }
    }

    private void sendRendererMessage(int i11, int i12, @Nullable Object obj) {
        for (Renderer renderer : this.renderers) {
            if (i11 == -1 || renderer.getTrackType() == i11) {
                createMessageInternal(renderer).setType(i12).setPayload(obj).send();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendVolumeToRenderers() {
        sendRendererMessage(1, 2, Float.valueOf(this.volume * this.audioFocusManager.getVolumeMultiplier()));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    private void setMediaSourcesInternal(List<MediaSource> list, int i11, long j11, boolean z11) {
        long j12;
        int i12;
        int i13;
        PlaybackInfo playbackInfoCopyWithPlaybackState;
        boolean z12;
        int firstWindowIndex = i11;
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        long currentPosition = getCurrentPosition();
        this.pendingOperationAcks++;
        if (!this.mediaSourceHolderSnapshots.isEmpty()) {
            removeMediaSourceHolders(0, this.mediaSourceHolderSnapshots.size());
        }
        List<MediaSourceList.MediaSourceHolder> listAddMediaSourceHolders = addMediaSourceHolders(0, list);
        Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        if (!timelineCreateMaskingTimeline.isEmpty() && firstWindowIndex >= timelineCreateMaskingTimeline.getWindowCount()) {
            throw new IllegalSeekPositionException(timelineCreateMaskingTimeline, firstWindowIndex, j11);
        }
        if (!z11) {
            if (firstWindowIndex == -1) {
                i12 = currentWindowIndexInternal;
                j12 = currentPosition;
            } else {
                j12 = j11;
            }
            PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, timelineCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(timelineCreateMaskingTimeline, i12, j12));
            i13 = playbackInfoMaskTimelineAndPosition.playbackState;
            if (i12 != -1 && i13 != 1) {
                if (!timelineCreateMaskingTimeline.isEmpty() || i12 >= timelineCreateMaskingTimeline.getWindowCount()) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
            }
            playbackInfoCopyWithPlaybackState = playbackInfoMaskTimelineAndPosition.copyWithPlaybackState(i13);
            this.internalPlayer.setMediaSources(listAddMediaSourceHolders, i12, Util.msToUs(j12), this.shuffleOrder);
            if (!this.playbackInfo.periodId.periodUid.equals(playbackInfoCopyWithPlaybackState.periodId.periodUid) || this.playbackInfo.timeline.isEmpty()) {
                z12 = false;
            } else {
                z12 = true;
            }
            updatePlaybackInfo(playbackInfoCopyWithPlaybackState, 0, z12, 4, getCurrentPositionUsInternal(playbackInfoCopyWithPlaybackState), -1, false);
        }
        firstWindowIndex = timelineCreateMaskingTimeline.getFirstWindowIndex(this.shuffleModeEnabled);
        j12 = C2711C.TIME_UNSET;
        i12 = firstWindowIndex;
        PlaybackInfo playbackInfoMaskTimelineAndPosition2 = maskTimelineAndPosition(this.playbackInfo, timelineCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(timelineCreateMaskingTimeline, i12, j12));
        i13 = playbackInfoMaskTimelineAndPosition2.playbackState;
        if (i12 != -1) {
            if (timelineCreateMaskingTimeline.isEmpty()) {
                i13 = 4;
            } else {
                i13 = 4;
            }
        }
        playbackInfoCopyWithPlaybackState = playbackInfoMaskTimelineAndPosition2.copyWithPlaybackState(i13);
        this.internalPlayer.setMediaSources(listAddMediaSourceHolders, i12, Util.msToUs(j12), this.shuffleOrder);
        if (this.playbackInfo.periodId.periodUid.equals(playbackInfoCopyWithPlaybackState.periodId.periodUid)) {
            z12 = false;
        } else {
            z12 = false;
        }
        updatePlaybackInfo(playbackInfoCopyWithPlaybackState, 0, z12, 4, getCurrentPositionUsInternal(playbackInfoCopyWithPlaybackState), -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfaceTextureInternal(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        setVideoOutputInternal(surface);
        this.ownedSurface = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoOutputInternal(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == 2) {
                arrayList.add(createMessageInternal(renderer).setType(1).setPayload(obj).send());
            }
        }
        Object obj2 = this.videoOutput;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((PlayerMessage) it.next()).blockUntilDelivered(this.detachSurfaceTimeoutMs);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z11 = true;
            }
            Object obj3 = this.videoOutput;
            Surface surface = this.ownedSurface;
            if (obj3 == surface) {
                surface.release();
                this.ownedSurface = null;
            }
        }
        this.videoOutput = obj;
        if (z11) {
            stopInternal(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
        }
    }

    private void stopInternal(@Nullable ExoPlaybackException exoPlaybackException) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfo.copyWithLoadingMediaPeriodId(playbackInfo.periodId);
        playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
        playbackInfoCopyWithLoadingMediaPeriodId.totalBufferedDurationUs = 0L;
        PlaybackInfo playbackInfoCopyWithPlaybackState = playbackInfoCopyWithLoadingMediaPeriodId.copyWithPlaybackState(1);
        if (exoPlaybackException != null) {
            playbackInfoCopyWithPlaybackState = playbackInfoCopyWithPlaybackState.copyWithPlaybackError(exoPlaybackException);
        }
        this.pendingOperationAcks++;
        this.internalPlayer.stop();
        updatePlaybackInfo(playbackInfoCopyWithPlaybackState, 0, false, 5, C2711C.TIME_UNSET, -1, false);
    }

    private void updateAvailableCommands() {
        Player.Commands commands = this.availableCommands;
        Player.Commands availableCommands = Util.getAvailableCommands(this.wrappingPlayer, this.permanentAvailableCommands);
        this.availableCommands = availableCommands;
        if (availableCommands.equals(commands)) {
            return;
        }
        this.listeners.queueEvent(13, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.v1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onAvailableCommandsChanged(this.f3442a.availableCommands);
            }
        });
    }

    private void updateMediaSourcesWithMediaItems(int i11, int i12, List<MediaItem> list) {
        this.pendingOperationAcks++;
        this.internalPlayer.updateMediaSourcesWithMediaItems(i11, i12, list);
        for (int i13 = i11; i13 < i12; i13++) {
            MediaSourceHolderSnapshot mediaSourceHolderSnapshot = this.mediaSourceHolderSnapshots.get(i13);
            mediaSourceHolderSnapshot.updateTimeline(new TimelineWithUpdatedMediaItem(mediaSourceHolderSnapshot.getTimeline(), list.get(i13 - i11)));
        }
        updatePlaybackInfo(this.playbackInfo.copyWithTimeline(createMaskingTimeline()), 0, false, 4, C2711C.TIME_UNSET, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayWhenReady(boolean z11, int i11, int i12) {
        boolean z12 = z11 && i11 != -1;
        int iComputePlaybackSuppressionReason = computePlaybackSuppressionReason(z12, i11);
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playWhenReady == z12 && playbackInfo.playbackSuppressionReason == iComputePlaybackSuppressionReason && playbackInfo.playWhenReadyChangeReason == i12) {
            return;
        }
        updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(z12, i12, iComputePlaybackSuppressionReason);
    }

    private void updatePlaybackInfo(final PlaybackInfo playbackInfo, final int i11, boolean z11, final int i12, long j11, int i13, boolean z12) {
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        this.playbackInfo = playbackInfo;
        boolean zEquals = playbackInfo2.timeline.equals(playbackInfo.timeline);
        Pair<Boolean, Integer> pairEvaluateMediaItemTransitionReason = evaluateMediaItemTransitionReason(playbackInfo, playbackInfo2, z11, i12, !zEquals, z12);
        boolean zBooleanValue = ((Boolean) pairEvaluateMediaItemTransitionReason.first).booleanValue();
        final int iIntValue = ((Integer) pairEvaluateMediaItemTransitionReason.second).intValue();
        final MediaItem mediaItem = null;
        if (zBooleanValue) {
            if (!playbackInfo.timeline.isEmpty()) {
                mediaItem = playbackInfo.timeline.getWindow(playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window).mediaItem;
            }
            this.staticAndDynamicMediaMetadata = MediaMetadata.EMPTY;
        }
        if (zBooleanValue || !playbackInfo2.staticMetadata.equals(playbackInfo.staticMetadata)) {
            this.staticAndDynamicMediaMetadata = this.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(playbackInfo.staticMetadata).build();
        }
        MediaMetadata mediaMetadataBuildUpdatedMediaMetadata = buildUpdatedMediaMetadata();
        boolean zEquals2 = mediaMetadataBuildUpdatedMediaMetadata.equals(this.mediaMetadata);
        this.mediaMetadata = mediaMetadataBuildUpdatedMediaMetadata;
        boolean z13 = playbackInfo2.playWhenReady != playbackInfo.playWhenReady;
        boolean z14 = playbackInfo2.playbackState != playbackInfo.playbackState;
        if (z14 || z13) {
            updateWakeAndWifiLock();
        }
        boolean z15 = playbackInfo2.isLoading;
        boolean z16 = playbackInfo.isLoading;
        boolean z17 = z15 != z16;
        if (z17) {
            updatePriorityTaskManagerForIsLoadingChange(z16);
        }
        if (!zEquals) {
            this.listeners.queueEvent(0, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.b1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    Player.Listener listener = (Player.Listener) obj;
                    listener.onTimelineChanged(playbackInfo.timeline, i11);
                }
            });
        }
        if (z11) {
            final Player.PositionInfo previousPositionInfo = getPreviousPositionInfo(i12, playbackInfo2, i13);
            final Player.PositionInfo positionInfo = getPositionInfo(j11);
            this.listeners.queueEvent(11, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.z1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ExoPlayerImpl.m3055g(i12, previousPositionInfo, positionInfo, (Player.Listener) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.listeners.queueEvent(1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.a2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaItemTransition(mediaItem, iIntValue);
                }
            });
        }
        if (playbackInfo2.playbackError != playbackInfo.playbackError) {
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.b2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayerErrorChanged(playbackInfo.playbackError);
                }
            });
            if (playbackInfo.playbackError != null) {
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.c2
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((Player.Listener) obj).onPlayerError(playbackInfo.playbackError);
                    }
                });
            }
        }
        TrackSelectorResult trackSelectorResult = playbackInfo2.trackSelectorResult;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        if (trackSelectorResult != trackSelectorResult2) {
            this.trackSelector.onSelectionActivated(trackSelectorResult2.info);
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.d2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTracksChanged(playbackInfo.trackSelectorResult.tracks);
                }
            });
        }
        if (!zEquals2) {
            final MediaMetadata mediaMetadata = this.mediaMetadata;
            this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.c1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaMetadataChanged(mediaMetadata);
                }
            });
        }
        if (z17) {
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.d1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ExoPlayerImpl.m3065q(playbackInfo, (Player.Listener) obj);
                }
            });
        }
        if (z14 || z13) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    ((Player.Listener) obj).onPlayerStateChanged(playbackInfo3.playWhenReady, playbackInfo3.playbackState);
                }
            });
        }
        if (z14) {
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.f1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackStateChanged(playbackInfo.playbackState);
                }
            });
        }
        if (z13 || playbackInfo2.playWhenReadyChangeReason != playbackInfo.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.m1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    ((Player.Listener) obj).onPlayWhenReadyChanged(playbackInfo3.playWhenReady, playbackInfo3.playWhenReadyChangeReason);
                }
            });
        }
        if (playbackInfo2.playbackSuppressionReason != playbackInfo.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.w1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackSuppressionReasonChanged(playbackInfo.playbackSuppressionReason);
                }
            });
        }
        if (playbackInfo2.isPlaying() != playbackInfo.isPlaying()) {
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.x1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onIsPlayingChanged(playbackInfo.isPlaying());
                }
            });
        }
        if (!playbackInfo2.playbackParameters.equals(playbackInfo.playbackParameters)) {
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.y1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackParametersChanged(playbackInfo.playbackParameters);
                }
            });
        }
        updateAvailableCommands();
        this.listeners.flushEvents();
        if (playbackInfo2.sleepingForOffload != playbackInfo.sleepingForOffload) {
            Iterator<ExoPlayer.AudioOffloadListener> it = this.audioOffloadListeners.iterator();
            while (it.hasNext()) {
                it.next().onSleepingForOffloadChanged(playbackInfo.sleepingForOffload);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(boolean z11, int i11, int i12) {
        this.pendingOperationAcks++;
        PlaybackInfo playbackInfoCopyWithEstimatedPosition = this.playbackInfo;
        if (playbackInfoCopyWithEstimatedPosition.sleepingForOffload) {
            playbackInfoCopyWithEstimatedPosition = playbackInfoCopyWithEstimatedPosition.copyWithEstimatedPosition();
        }
        PlaybackInfo playbackInfoCopyWithPlayWhenReady = playbackInfoCopyWithEstimatedPosition.copyWithPlayWhenReady(z11, i11, i12);
        this.internalPlayer.setPlayWhenReady(z11, i11, i12);
        updatePlaybackInfo(playbackInfoCopyWithPlayWhenReady, 0, false, 5, C2711C.TIME_UNSET, -1, false);
    }

    private void updatePriorityTaskManagerForIsLoadingChange(boolean z11) {
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            if (z11 && !this.isPriorityTaskManagerRegistered) {
                priorityTaskManager.add(this.priority);
                this.isPriorityTaskManagerRegistered = true;
            } else {
                if (z11 || !this.isPriorityTaskManagerRegistered) {
                    return;
                }
                priorityTaskManager.remove(this.priority);
                this.isPriorityTaskManagerRegistered = false;
            }
        }
    }

    private void verifyApplicationThread() {
        this.constructorFinished.blockUninterruptible();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String invariant = Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.throwsWhenUsingWrongThread) {
                throw new IllegalStateException(invariant);
            }
            Log.m2962w(TAG, invariant, this.hasNotifiedFullWrongThreadWarning ? null : new IllegalStateException());
            this.hasNotifiedFullWrongThreadWarning = true;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(AnalyticsListener analyticsListener) {
        this.analyticsCollector.addListener((AnalyticsListener) Assertions.checkNotNull(analyticsListener));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.audioOffloadListeners.add(audioOffloadListener);
    }

    @Override // androidx.media3.common.Player
    public void addListener(Player.Listener listener) {
        this.listeners.add((Player.Listener) Assertions.checkNotNull(listener));
    }

    @Override // androidx.media3.common.Player
    public Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Clock getClock() {
        return this.clock;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public ExoPlaybackException getPlayerError() {
        verifyApplicationThread();
        return this.playbackInfo.playbackError;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public ExoPlayer.PreloadConfiguration getPreloadConfiguration() {
        return this.preloadConfiguration;
    }

    @Override // androidx.media3.common.Player
    public void release() {
        Log.m2959i(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + MediaLibraryInfo.VERSION_SLASHY + "] [" + Util.DEVICE_DEBUG_INFO + "] [" + MediaLibraryInfo.registeredModules() + "]");
        verifyApplicationThread();
        this.audioBecomingNoisyManager.setEnabled(false);
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.release();
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
        this.audioFocusManager.release();
        if (!this.internalPlayer.release()) {
            this.listeners.sendEvent(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.k1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayerError(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
                }
            });
        }
        this.listeners.release();
        this.playbackInfoUpdateHandler.removeCallbacksAndMessages(null);
        this.bandwidthMeter.removeEventListener(this.analyticsCollector);
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.sleepingForOffload) {
            this.playbackInfo = playbackInfo.copyWithEstimatedPosition();
        }
        SuitableOutputChecker suitableOutputChecker = this.suitableOutputChecker;
        if (suitableOutputChecker != null && Util.SDK_INT >= 35) {
            suitableOutputChecker.disable();
        }
        PlaybackInfo playbackInfoCopyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(1);
        this.playbackInfo = playbackInfoCopyWithPlaybackState;
        PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfoCopyWithPlaybackState.copyWithLoadingMediaPeriodId(playbackInfoCopyWithPlaybackState.periodId);
        this.playbackInfo = playbackInfoCopyWithLoadingMediaPeriodId;
        playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
        this.playbackInfo.totalBufferedDurationUs = 0L;
        this.analyticsCollector.release();
        this.trackSelector.release();
        removeSurfaceCallbacks();
        Surface surface = this.ownedSurface;
        if (surface != null) {
            surface.release();
            this.ownedSurface = null;
        }
        if (this.isPriorityTaskManagerRegistered) {
            ((PriorityTaskManager) Assertions.checkNotNull(this.priorityTaskManager)).remove(this.priority);
            this.isPriorityTaskManagerRegistered = false;
        }
        this.currentCueGroup = CueGroup.EMPTY_TIME_ZERO;
        this.playerReleased = true;
    }

    public void setThrowsWhenUsingWrongThread(boolean z11) {
        this.throwsWhenUsingWrongThread = z11;
        this.listeners.setThrowsWhenUsingWrongThread(z11);
        AnalyticsCollector analyticsCollector = this.analyticsCollector;
        if (analyticsCollector instanceof DefaultAnalyticsCollector) {
            ((DefaultAnalyticsCollector) analyticsCollector).setThrowsWhenUsingWrongThread(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaMetadata buildUpdatedMediaMetadata() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.staticAndDynamicMediaMetadata;
        }
        return this.staticAndDynamicMediaMetadata.buildUpon().populate(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem.mediaMetadata).build();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m3055g(int i11, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i11);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i11);
    }

    private Player.PositionInfo getPositionInfo(long j11) {
        Object obj;
        int indexOfPeriod;
        MediaItem mediaItem;
        Object obj2;
        long jUsToMs;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (!this.playbackInfo.timeline.isEmpty()) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            Object obj3 = playbackInfo.periodId.periodUid;
            playbackInfo.timeline.getPeriodByUid(obj3, this.period);
            indexOfPeriod = this.playbackInfo.timeline.getIndexOfPeriod(obj3);
            obj2 = obj3;
            obj = this.playbackInfo.timeline.getWindow(currentMediaItemIndex, this.window).uid;
            mediaItem = this.window.mediaItem;
        } else {
            obj = null;
            indexOfPeriod = -1;
            mediaItem = null;
            obj2 = null;
        }
        int i11 = indexOfPeriod;
        long jUsToMs2 = Util.usToMs(j11);
        if (this.playbackInfo.periodId.isAd()) {
            jUsToMs = Util.usToMs(getRequestedContentPositionUs(this.playbackInfo));
        } else {
            jUsToMs = jUsToMs2;
        }
        MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
        return new Player.PositionInfo(obj, currentMediaItemIndex, mediaItem, obj2, i11, jUsToMs2, jUsToMs, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
    }

    @Nullable
    private Pair<Object, Long> maskWindowPositionMsOrGetPeriodPositionUs(Timeline timeline, int i11, long j11) {
        if (timeline.isEmpty()) {
            this.maskingWindowIndex = i11;
            if (j11 == C2711C.TIME_UNSET) {
                j11 = 0;
            }
            this.maskingWindowPositionMs = j11;
            this.maskingPeriodIndex = 0;
            return null;
        }
        if (i11 == -1 || i11 >= timeline.getWindowCount()) {
            i11 = timeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j11 = timeline.getWindow(i11, this.window).getDefaultPositionMs();
        }
        return timeline.getPeriodPositionUs(this.window, this.period, i11, Util.msToUs(j11));
    }

    private PlaybackInfo removeMediaItemsInternal(PlaybackInfo playbackInfo, int i11, int i12) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(playbackInfo);
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        Timeline timeline = playbackInfo.timeline;
        int size = this.mediaSourceHolderSnapshots.size();
        this.pendingOperationAcks++;
        removeMediaSourceHolders(i11, i12);
        Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(timeline, timelineCreateMaskingTimeline, currentWindowIndexInternal, contentPositionInternal));
        int i13 = playbackInfoMaskTimelineAndPosition.playbackState;
        if (i13 != 1 && i13 != 4 && i11 < i12 && i12 == size && currentWindowIndexInternal >= playbackInfoMaskTimelineAndPosition.timeline.getWindowCount()) {
            playbackInfoMaskTimelineAndPosition = playbackInfoMaskTimelineAndPosition.copyWithPlaybackState(4);
        }
        this.internalPlayer.removeMediaSources(i11, i12, this.shuffleOrder);
        return playbackInfoMaskTimelineAndPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWakeAndWifiLock() {
        int playbackState = getPlaybackState();
        boolean z11 = true;
        if (playbackState != 1) {
            if (playbackState != 2 && playbackState != 3) {
                if (playbackState != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean zIsSleepingForOffload = isSleepingForOffload();
                WakeLockManager wakeLockManager = this.wakeLockManager;
                if (!getPlayWhenReady() || zIsSleepingForOffload) {
                    z11 = false;
                }
                wakeLockManager.setStayAwake(z11);
                this.wifiLockManager.setStayAwake(getPlayWhenReady());
                return;
            }
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(int i11, List<MediaItem> list) {
        verifyApplicationThread();
        addMediaSources(i11, createMediaSources(list));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(int i11, MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(i11, Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(int i11, List<MediaSource> list) {
        verifyApplicationThread();
        Assertions.checkArgument(i11 >= 0);
        int iMin = Math.min(i11, this.mediaSourceHolderSnapshots.size());
        if (this.mediaSourceHolderSnapshots.isEmpty()) {
            setMediaSources(list, this.maskingWindowIndex == -1);
        } else {
            updatePlaybackInfo(addMediaSourcesInternal(this.playbackInfo, iMin, list), 0, false, 5, C2711C.TIME_UNSET, -1, false);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
        verifyApplicationThread();
        setAuxEffectInfo(new AuxEffectInfo(0, 0.0f));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        if (this.cameraMotionListener != cameraMotionListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(null).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        if (this.videoFrameMetadataListener != videoFrameMetadataListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(null).send();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder != null && surfaceHolder == this.surfaceHolder) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        SurfaceHolder holder;
        verifyApplicationThread();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        clearVideoSurfaceHolder(holder);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        verifyApplicationThread();
        if (textureView != null && textureView == this.textureView) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        verifyApplicationThread();
        return createMessageInternal(target);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public AnalyticsCollector getAnalyticsCollector() {
        verifyApplicationThread();
        return this.analyticsCollector;
    }

    @Override // androidx.media3.common.Player
    public AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @CanIgnoreReturnValue
    @Deprecated
    public ExoPlayer.AudioComponent getAudioComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public DecoderCounters getAudioDecoderCounters() {
        verifyApplicationThread();
        return this.audioDecoderCounters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public Format getAudioFormat() {
        verifyApplicationThread();
        return this.audioFormat;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
        verifyApplicationThread();
        return this.audioSessionId;
    }

    @Override // androidx.media3.common.Player
    public Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return this.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public long getBufferedPosition() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            if (playbackInfo.loadingMediaPeriodId.equals(playbackInfo.periodId)) {
                return Util.usToMs(this.playbackInfo.bufferedPositionUs);
            }
            return getDuration();
        }
        return getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.loadingMediaPeriodId.windowSequenceNumber != playbackInfo.periodId.windowSequenceNumber) {
            return playbackInfo.timeline.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
        }
        long j11 = playbackInfo.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            Timeline.Period periodByUid = playbackInfo2.timeline.getPeriodByUid(playbackInfo2.loadingMediaPeriodId.periodUid, this.period);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                j11 = periodByUid.durationUs;
            } else {
                j11 = adGroupTimeUs;
            }
        }
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        return Util.usToMs(periodPositionUsToWindowPositionUs(playbackInfo3.timeline, playbackInfo3.loadingMediaPeriodId, j11));
    }

    @Override // androidx.media3.common.Player
    public long getContentPosition() {
        verifyApplicationThread();
        return getContentPositionInternal(this.playbackInfo);
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public CueGroup getCurrentCues() {
        verifyApplicationThread();
        return this.currentCueGroup;
    }

    @Override // androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    @Override // androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingPeriodIndex;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
    }

    @Override // androidx.media3.common.Player
    public long getCurrentPosition() {
        verifyApplicationThread();
        return Util.usToMs(getCurrentPositionUsInternal(this.playbackInfo));
    }

    @Override // androidx.media3.common.Player
    public Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return this.playbackInfo.timeline;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public TrackGroupArray getCurrentTrackGroups() {
        verifyApplicationThread();
        return this.playbackInfo.trackGroups;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public TrackSelectionArray getCurrentTrackSelections() {
        verifyApplicationThread();
        return new TrackSelectionArray(this.playbackInfo.trackSelectorResult.selections);
    }

    @Override // androidx.media3.common.Player
    public Tracks getCurrentTracks() {
        verifyApplicationThread();
        return this.playbackInfo.trackSelectorResult.tracks;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @CanIgnoreReturnValue
    @Deprecated
    public ExoPlayer.DeviceComponent getDeviceComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.common.Player
    public DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return this.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public int getDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.getVolume();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public long getDuration() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
            playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
            return Util.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
        }
        return getContentDuration();
    }

    @Override // androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return this.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return this.mediaMetadata;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        verifyApplicationThread();
        return this.pauseAtEndOfMediaItems;
    }

    @Override // androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return this.playbackInfo.playWhenReady;
    }

    @Override // androidx.media3.common.Player
    public PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return this.playbackInfo.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackState() {
        verifyApplicationThread();
        return this.playbackInfo.playbackState;
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return this.playbackInfo.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    public MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return this.playlistMetadata;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Renderer getRenderer(int i11) {
        verifyApplicationThread();
        return this.renderers[i11];
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        verifyApplicationThread();
        return this.renderers.length;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererType(int i11) {
        verifyApplicationThread();
        return this.renderers[i11].getTrackType();
    }

    @Override // androidx.media3.common.Player
    public int getRepeatMode() {
        verifyApplicationThread();
        return this.repeatMode;
    }

    @Override // androidx.media3.common.Player
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return this.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return this.seekForwardIncrementMs;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public SeekParameters getSeekParameters() {
        verifyApplicationThread();
        return this.seekParameters;
    }

    @Override // androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return this.shuffleModeEnabled;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
        verifyApplicationThread();
        return this.skipSilenceEnabled;
    }

    @Override // androidx.media3.common.Player
    public Size getSurfaceSize() {
        verifyApplicationThread();
        return this.surfaceSize;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @CanIgnoreReturnValue
    @Deprecated
    public ExoPlayer.TextComponent getTextComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return Util.usToMs(this.playbackInfo.totalBufferedDurationUs);
    }

    @Override // androidx.media3.common.Player
    public TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        return this.trackSelector.getParameters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public TrackSelector getTrackSelector() {
        verifyApplicationThread();
        return this.trackSelector;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public int getVideoChangeFrameRateStrategy() {
        verifyApplicationThread();
        return this.videoChangeFrameRateStrategy;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @CanIgnoreReturnValue
    @Deprecated
    public ExoPlayer.VideoComponent getVideoComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public DecoderCounters getVideoDecoderCounters() {
        verifyApplicationThread();
        return this.videoDecoderCounters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Nullable
    public Format getVideoFormat() {
        verifyApplicationThread();
        return this.videoFormat;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
        verifyApplicationThread();
        return this.videoScalingMode;
    }

    @Override // androidx.media3.common.Player
    public VideoSize getVideoSize() {
        verifyApplicationThread();
        return this.videoSize;
    }

    @Override // androidx.media3.common.Player
    public float getVolume() {
        verifyApplicationThread();
        return this.volume;
    }

    @Override // androidx.media3.common.Player
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.isMuted();
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    public boolean isLoading() {
        verifyApplicationThread();
        return this.playbackInfo.isLoading;
    }

    @Override // androidx.media3.common.Player
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return this.playbackInfo.periodId.isAd();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        verifyApplicationThread();
        return this.playerReleased;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        verifyApplicationThread();
        return this.playbackInfo.sleepingForOffload;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        verifyApplicationThread();
        for (RendererConfiguration rendererConfiguration : this.playbackInfo.trackSelectorResult.rendererConfigurations) {
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItems(int i11, int i12, int i13) {
        boolean z11;
        verifyApplicationThread();
        if (i11 >= 0 && i11 <= i12 && i13 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        int size = this.mediaSourceHolderSnapshots.size();
        int iMin = Math.min(i12, size);
        int iMin2 = Math.min(i13, size - (iMin - i11));
        if (i11 < size && i11 != iMin && i11 != iMin2) {
            Timeline currentTimeline = getCurrentTimeline();
            this.pendingOperationAcks++;
            Util.moveItems(this.mediaSourceHolderSnapshots, i11, iMin, iMin2);
            Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
            PlaybackInfo playbackInfo = this.playbackInfo;
            PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(currentTimeline, timelineCreateMaskingTimeline, getCurrentWindowIndexInternal(playbackInfo), getContentPositionInternal(this.playbackInfo)));
            this.internalPlayer.moveMediaSources(i11, iMin, iMin2, this.shuffleOrder);
            updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, false, 5, C2711C.TIME_UNSET, -1, false);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(AnalyticsListener analyticsListener) {
        verifyApplicationThread();
        this.analyticsCollector.removeListener((AnalyticsListener) Assertions.checkNotNull(analyticsListener));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        verifyApplicationThread();
        this.audioOffloadListeners.remove(audioOffloadListener);
    }

    @Override // androidx.media3.common.Player
    public void removeListener(Player.Listener listener) {
        verifyApplicationThread();
        this.listeners.remove((Player.Listener) Assertions.checkNotNull(listener));
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItems(int i11, int i12) {
        boolean z11;
        verifyApplicationThread();
        if (i11 >= 0 && i12 >= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        int size = this.mediaSourceHolderSnapshots.size();
        int iMin = Math.min(i12, size);
        if (i11 < size && i11 != iMin) {
            PlaybackInfo playbackInfoRemoveMediaItemsInternal = removeMediaItemsInternal(this.playbackInfo, i11, iMin);
            updatePlaybackInfo(playbackInfoRemoveMediaItemsInternal, 0, !playbackInfoRemoveMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(playbackInfoRemoveMediaItemsInternal), -1, false);
        }
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItems(int i11, int i12, List<MediaItem> list) {
        boolean z11;
        verifyApplicationThread();
        boolean z12 = false;
        if (i11 >= 0 && i12 >= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        int size = this.mediaSourceHolderSnapshots.size();
        if (i11 > size) {
            return;
        }
        int iMin = Math.min(i12, size);
        if (canUpdateMediaSourcesWithMediaItems(i11, iMin, list)) {
            updateMediaSourcesWithMediaItems(i11, iMin, list);
            return;
        }
        List<MediaSource> listCreateMediaSources = createMediaSources(list);
        if (this.mediaSourceHolderSnapshots.isEmpty()) {
            if (this.maskingWindowIndex == -1) {
                z12 = true;
            }
            setMediaSources(listCreateMediaSources, z12);
        } else {
            PlaybackInfo playbackInfoRemoveMediaItemsInternal = removeMediaItemsInternal(addMediaSourcesInternal(this.playbackInfo, iMin, listCreateMediaSources), i11, iMin);
            updatePlaybackInfo(playbackInfoRemoveMediaItemsInternal, 0, !playbackInfoRemoveMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(playbackInfoRemoveMediaItemsInternal), -1, false);
        }
    }

    @Override // androidx.media3.common.BasePlayer
    public void seekTo(int i11, long j11, int i12, boolean z11) {
        boolean z12;
        verifyApplicationThread();
        if (i11 != -1) {
            if (i11 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            Assertions.checkArgument(z12);
            Timeline timeline = this.playbackInfo.timeline;
            if (!timeline.isEmpty() && i11 >= timeline.getWindowCount()) {
                return;
            }
            this.analyticsCollector.notifySeekStarted();
            this.pendingOperationAcks++;
            if (isPlayingAd()) {
                Log.m2961w(TAG, "seekTo ignored because an ad is playing");
                ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
                playbackInfoUpdate.incrementPendingOperationAcks(1);
                this.playbackInfoUpdateListener.onPlaybackInfoUpdate(playbackInfoUpdate);
                return;
            }
            PlaybackInfo playbackInfoCopyWithPlaybackState = this.playbackInfo;
            int i13 = playbackInfoCopyWithPlaybackState.playbackState;
            if (i13 == 3 || (i13 == 4 && !timeline.isEmpty())) {
                playbackInfoCopyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfoCopyWithPlaybackState, timeline, maskWindowPositionMsOrGetPeriodPositionUs(timeline, i11, j11));
            this.internalPlayer.seekTo(timeline, i11, Util.msToUs(j11));
            updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, true, 1, getCurrentPositionUsInternal(playbackInfoMaskTimelineAndPosition), currentMediaItemIndex, z11);
        }
    }

    @Override // androidx.media3.common.Player
    public void setAudioAttributes(final AudioAttributes audioAttributes, boolean z11) {
        AudioAttributes audioAttributes2;
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        if (!Util.areEqual(this.audioAttributes, audioAttributes)) {
            this.audioAttributes = audioAttributes;
            sendRendererMessage(1, 3, audioAttributes);
            StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
            if (streamVolumeManager != null) {
                streamVolumeManager.setStreamType(Util.getStreamTypeForAudioUsage(audioAttributes.usage));
            }
            this.listeners.queueEvent(20, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.t1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAudioAttributesChanged(audioAttributes);
                }
            });
        }
        AudioFocusManager audioFocusManager = this.audioFocusManager;
        if (z11) {
            audioAttributes2 = audioAttributes;
        } else {
            audioAttributes2 = null;
        }
        audioFocusManager.setAudioAttributes(audioAttributes2);
        this.trackSelector.setAudioAttributes(audioAttributes);
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, getPlaybackState());
        updatePlayWhenReady(playWhenReady, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
        this.listeners.flushEvents();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAudioSessionId(final int i11) {
        verifyApplicationThread();
        if (this.audioSessionId == i11) {
            return;
        }
        if (i11 == 0) {
            i11 = Util.generateAudioSessionIdV21(this.applicationContext);
        }
        this.audioSessionId = i11;
        sendRendererMessage(1, 10, Integer.valueOf(i11));
        sendRendererMessage(2, 10, Integer.valueOf(i11));
        this.listeners.sendEvent(21, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.j1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onAudioSessionIdChanged(i11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 6, auxEffectInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setCameraMotionListener(CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        this.cameraMotionListener = cameraMotionListener;
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(cameraMotionListener).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean z11) {
        verifyApplicationThread();
        if (this.foregroundMode != z11) {
            this.foregroundMode = z11;
            if (!this.internalPlayer.setForegroundMode(z11)) {
                stopInternal(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(2), 1003));
            }
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z11) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        this.audioBecomingNoisyManager.setEnabled(z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(@Nullable ImageOutput imageOutput) {
        verifyApplicationThread();
        sendRendererMessage(4, 15, imageOutput);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(List<MediaItem> list, int i11, long j11) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), i11, j11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long j11) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource), 0, j11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list, boolean z11) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, -1, C2711C.TIME_UNSET, z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z11) {
        verifyApplicationThread();
        if (this.pauseAtEndOfMediaItems == z11) {
            return;
        }
        this.pauseAtEndOfMediaItems = z11;
        this.internalPlayer.setPauseAtEndOfWindow(z11);
    }

    @Override // androidx.media3.common.Player
    public void setPlayWhenReady(boolean z11) {
        verifyApplicationThread();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(z11, getPlaybackState());
        updatePlayWhenReady(z11, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        if (this.playbackInfo.playbackParameters.equals(playbackParameters)) {
            return;
        }
        PlaybackInfo playbackInfoCopyWithPlaybackParameters = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        this.pendingOperationAcks++;
        this.internalPlayer.setPlaybackParameters(playbackParameters);
        updatePlaybackInfo(playbackInfoCopyWithPlaybackParameters, 0, false, 5, C2711C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        Assertions.checkNotNull(mediaMetadata);
        if (mediaMetadata.equals(this.playlistMetadata)) {
            return;
        }
        this.playlistMetadata = mediaMetadata;
        this.listeners.sendEvent(15, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.o1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onPlaylistMetadataChanged(this.f3273a.playlistMetadata);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @RequiresApi(23)
    public void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 12, audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        verifyApplicationThread();
        if (this.preloadConfiguration.equals(preloadConfiguration)) {
            return;
        }
        this.preloadConfiguration = preloadConfiguration;
        this.internalPlayer.setPreloadConfiguration(preloadConfiguration);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriority(int i11) {
        verifyApplicationThread();
        if (this.priority == i11) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            PriorityTaskManager priorityTaskManager = (PriorityTaskManager) Assertions.checkNotNull(this.priorityTaskManager);
            priorityTaskManager.add(i11);
            priorityTaskManager.remove(this.priority);
        }
        this.priority = i11;
        sendRendererMessage(16, Integer.valueOf(i11));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
        verifyApplicationThread();
        if (Util.areEqual(this.priorityTaskManager, priorityTaskManager)) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            ((PriorityTaskManager) Assertions.checkNotNull(this.priorityTaskManager)).remove(this.priority);
        }
        if (priorityTaskManager != null && isLoading()) {
            priorityTaskManager.add(this.priority);
            this.isPriorityTaskManagerRegistered = true;
        } else {
            this.isPriorityTaskManagerRegistered = false;
        }
        this.priorityTaskManager = priorityTaskManager;
    }

    @Override // androidx.media3.common.Player
    public void setRepeatMode(final int i11) {
        verifyApplicationThread();
        if (this.repeatMode != i11) {
            this.repeatMode = i11;
            this.internalPlayer.setRepeatMode(i11);
            this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.n1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onRepeatModeChanged(i11);
                }
            });
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekParameters(@Nullable SeekParameters seekParameters) {
        verifyApplicationThread();
        if (seekParameters == null) {
            seekParameters = SeekParameters.DEFAULT;
        }
        if (!this.seekParameters.equals(seekParameters)) {
            this.seekParameters = seekParameters;
            this.internalPlayer.setSeekParameters(seekParameters);
        }
    }

    @Override // androidx.media3.common.Player
    public void setShuffleModeEnabled(final boolean z11) {
        verifyApplicationThread();
        if (this.shuffleModeEnabled != z11) {
            this.shuffleModeEnabled = z11;
            this.internalPlayer.setShuffleModeEnabled(z11);
            this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.p1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onShuffleModeEnabledChanged(z11);
                }
            });
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        boolean z11;
        verifyApplicationThread();
        if (shuffleOrder.getLength() == this.mediaSourceHolderSnapshots.size()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        this.shuffleOrder = shuffleOrder;
        Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, timelineCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(timelineCreateMaskingTimeline, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.pendingOperationAcks++;
        this.internalPlayer.setShuffleOrder(shuffleOrder);
        updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, false, 5, C2711C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(final boolean z11) {
        verifyApplicationThread();
        if (this.skipSilenceEnabled == z11) {
            return;
        }
        this.skipSilenceEnabled = z11;
        sendRendererMessage(1, 9, Boolean.valueOf(z11));
        this.listeners.sendEvent(23, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(z11);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public void setTrackSelectionParameters(final TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        if (this.trackSelector.isSetParametersSupported() && !trackSelectionParameters.equals(this.trackSelector.getParameters())) {
            this.trackSelector.setParameters(trackSelectionParameters);
            this.listeners.sendEvent(19, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.u1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTrackSelectionParametersChanged(trackSelectionParameters);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoChangeFrameRateStrategy(int i11) {
        verifyApplicationThread();
        if (this.videoChangeFrameRateStrategy == i11) {
            return;
        }
        this.videoChangeFrameRateStrategy = i11;
        sendRendererMessage(2, 5, Integer.valueOf(i11));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoEffects(List<Effect> list) {
        verifyApplicationThread();
        try {
            Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class);
            sendRendererMessage(2, 13, list);
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            throw new IllegalStateException("Could not find required lib-effect dependencies.", e11);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(videoFrameMetadataListener).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int i11) {
        verifyApplicationThread();
        this.videoScalingMode = i11;
        sendRendererMessage(2, 4, Integer.valueOf(i11));
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurface(@Nullable Surface surface) {
        int i11;
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(surface);
        if (surface == null) {
            i11 = 0;
        } else {
            i11 = -1;
        }
        maybeNotifySurfaceSizeChanged(i11, i11);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.surfaceHolderSurfaceIsVideoOutput = true;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            setVideoOutputInternal(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        } else {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        SurfaceHolder holder;
        verifyApplicationThread();
        if (surfaceView instanceof VideoDecoderOutputBufferRenderer) {
            removeSurfaceCallbacks();
            setVideoOutputInternal(surfaceView);
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof SphericalGLSurfaceView) {
                removeSurfaceCallbacks();
                this.sphericalGLSurfaceView = (SphericalGLSurfaceView) surfaceView;
                createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(this.sphericalGLSurfaceView).send();
                this.sphericalGLSurfaceView.addVideoSurfaceListener(this.componentListener);
                setVideoOutputInternal(this.sphericalGLSurfaceView.getVideoSurface());
                setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
                return;
            }
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            setVideoSurfaceHolder(holder);
        }
    }

    @Override // androidx.media3.common.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
        SurfaceTexture surfaceTexture;
        verifyApplicationThread();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.textureView = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.m2961w(TAG, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.componentListener);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setSurfaceTextureInternal(surfaceTexture);
            maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // androidx.media3.common.Player
    public void setVolume(float f11) {
        verifyApplicationThread();
        final float fConstrainValue = Util.constrainValue(f11, 0.0f, 1.0f);
        if (this.volume == fConstrainValue) {
            return;
        }
        this.volume = fConstrainValue;
        sendVolumeToRenderers();
        this.listeners.sendEvent(22, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.h1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onVolumeChanged(fConstrainValue);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setWakeMode(int i11) {
        verifyApplicationThread();
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                this.wakeLockManager.setEnabled(true);
                this.wifiLockManager.setEnabled(true);
                return;
            }
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(false);
            return;
        }
        this.wakeLockManager.setEnabled(false);
        this.wifiLockManager.setEnabled(false);
    }

    @Override // androidx.media3.common.Player
    public void stop() {
        verifyApplicationThread();
        this.audioFocusManager.updateAudioFocus(getPlayWhenReady(), 1);
        stopInternal(null);
        this.currentCueGroup = new CueGroup(ImmutableList.m13439of(), this.playbackInfo.positionUs);
    }

    @Override // androidx.media3.common.Player
    public void decreaseDeviceVolume(int i11) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(i11);
        }
    }

    @Override // androidx.media3.common.Player
    public void increaseDeviceVolume(int i11) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(i11);
        }
    }

    @Override // androidx.media3.common.Player
    public void setDeviceMuted(boolean z11, int i11) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z11, i11);
        }
    }

    @Override // androidx.media3.common.Player
    public void setDeviceVolume(int i11, int i12) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i11, i12);
        }
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface(@Nullable Surface surface) {
        verifyApplicationThread();
        if (surface == null || surface != this.videoOutput) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list, int i11, long j11) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, i11, j11, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean z11) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource), z11);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSource(mediaSource);
        prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource, boolean z11, boolean z12) {
        verifyApplicationThread();
        setMediaSource(mediaSource, z11);
        prepare();
    }
}
