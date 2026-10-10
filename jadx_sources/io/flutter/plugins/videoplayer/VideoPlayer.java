package io.flutter.plugins.videoplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes60.dex */
public abstract class VideoPlayer implements Messages.VideoPlayerInstanceApi {

    @Nullable
    private DisposeHandler disposeHandler;

    @NonNull
    protected ExoPlayer exoPlayer;

    @Nullable
    protected final TextureRegistry.SurfaceProducer surfaceProducer;

    @NonNull
    protected final VideoPlayerCallbacks videoPlayerEvents;

    public interface DisposeHandler {
        void onDispose();
    }

    public interface ExoPlayerProvider {
        @NonNull
        ExoPlayer get();
    }

    @NonNull
    public abstract ExoPlayerEventListener createExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @Nullable TextureRegistry.SurfaceProducer surfaceProducer);

    private static void setAudioAttributes(ExoPlayer exoPlayer, boolean z11) {
        exoPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(3).build(), !z11);
    }

    public void dispose() {
        DisposeHandler disposeHandler = this.disposeHandler;
        if (disposeHandler != null) {
            disposeHandler.onDispose();
        }
        this.exoPlayer.release();
    }

    @NonNull
    public ExoPlayer getExoPlayer() {
        return this.exoPlayer;
    }

    @Override // io.flutter.plugins.videoplayer.Messages.VideoPlayerInstanceApi
    @NonNull
    public Messages.PlaybackState getPlaybackState() {
        return new Messages.PlaybackState.Builder().setPlayPosition(Long.valueOf(this.exoPlayer.getCurrentPosition())).setBufferPosition(Long.valueOf(this.exoPlayer.getBufferedPosition())).build();
    }

    @Override // io.flutter.plugins.videoplayer.Messages.VideoPlayerInstanceApi
    public void pause() {
        this.exoPlayer.pause();
    }

    @Override // io.flutter.plugins.videoplayer.Messages.VideoPlayerInstanceApi
    public void play() {
        this.exoPlayer.play();
    }

    @Override // io.flutter.plugins.videoplayer.Messages.VideoPlayerInstanceApi
    public void seekTo(@NonNull Long l11) {
        this.exoPlayer.seekTo(l11.longValue());
    }

    public void setDisposeHandler(@Nullable DisposeHandler disposeHandler) {
        this.disposeHandler = disposeHandler;
    }

    @Override // io.flutter.plugins.videoplayer.Messages.VideoPlayerInstanceApi
    public void setLooping(@NonNull Boolean bool) {
        this.exoPlayer.setRepeatMode(bool.booleanValue() ? 2 : 0);
    }

    @Override // io.flutter.plugins.videoplayer.Messages.VideoPlayerInstanceApi
    public void setPlaybackSpeed(@NonNull Double d11) {
        this.exoPlayer.setPlaybackParameters(new PlaybackParameters(d11.floatValue()));
    }

    @Override // io.flutter.plugins.videoplayer.Messages.VideoPlayerInstanceApi
    public void setVolume(@NonNull Double d11) {
        this.exoPlayer.setVolume((float) Math.max(0.0d, Math.min(1.0d, d11.doubleValue())));
    }

    public VideoPlayer(@NonNull VideoPlayerCallbacks videoPlayerCallbacks, @NonNull MediaItem mediaItem, @NonNull VideoPlayerOptions videoPlayerOptions, @Nullable TextureRegistry.SurfaceProducer surfaceProducer, @NonNull ExoPlayerProvider exoPlayerProvider) {
        this.videoPlayerEvents = videoPlayerCallbacks;
        this.surfaceProducer = surfaceProducer;
        ExoPlayer exoPlayer = exoPlayerProvider.get();
        this.exoPlayer = exoPlayer;
        exoPlayer.setMediaItem(mediaItem);
        this.exoPlayer.prepare();
        ExoPlayer exoPlayer2 = this.exoPlayer;
        exoPlayer2.addListener(createExoPlayerEventListener(exoPlayer2, surfaceProducer));
        setAudioAttributes(this.exoPlayer, videoPlayerOptions.mixWithOthers);
    }
}
