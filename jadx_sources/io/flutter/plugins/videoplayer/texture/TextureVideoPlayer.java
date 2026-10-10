package io.flutter.plugins.videoplayer.texture;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.VideoAsset;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import io.flutter.plugins.videoplayer.VideoPlayerOptions;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes60.dex */
public final class TextureVideoPlayer extends VideoPlayer implements TextureRegistry.SurfaceProducer.Callback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean needsSurface;

    @VisibleForTesting
    public TextureVideoPlayer(@NonNull VideoPlayerCallbacks videoPlayerCallbacks, @NonNull TextureRegistry.SurfaceProducer surfaceProducer, @NonNull MediaItem mediaItem, @NonNull VideoPlayerOptions videoPlayerOptions, @NonNull VideoPlayer.ExoPlayerProvider exoPlayerProvider) {
        super(videoPlayerCallbacks, mediaItem, videoPlayerOptions, surfaceProducer, exoPlayerProvider);
        this.needsSurface = true;
        surfaceProducer.setCallback(this);
        Surface surface = surfaceProducer.getSurface();
        this.exoPlayer.setVideoSurface(surface);
        this.needsSurface = surface == null;
    }

    @NonNull
    public static TextureVideoPlayer create(@NonNull final Context context, @NonNull VideoPlayerCallbacks videoPlayerCallbacks, @NonNull TextureRegistry.SurfaceProducer surfaceProducer, @NonNull final VideoAsset videoAsset, @NonNull VideoPlayerOptions videoPlayerOptions) {
        return new TextureVideoPlayer(videoPlayerCallbacks, surfaceProducer, videoAsset.getMediaItem(), videoPlayerOptions, new VideoPlayer.ExoPlayerProvider() { // from class: io.flutter.plugins.videoplayer.texture.a
            @Override // io.flutter.plugins.videoplayer.VideoPlayer.ExoPlayerProvider
            public final ExoPlayer get() {
                Context context2 = context;
                return new ExoPlayer.Builder(context2).setMediaSourceFactory(videoAsset.getMediaSourceFactory(context2)).build();
            }
        });
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer
    @NonNull
    public ExoPlayerEventListener createExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @Nullable TextureRegistry.SurfaceProducer surfaceProducer) {
        if (surfaceProducer == null) {
            throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        return new TextureExoPlayerEventListener(exoPlayer, this.videoPlayerEvents, surfaceProducer.handlesCropAndRotation());
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSurfaceAvailable() {
        if (this.needsSurface) {
            this.exoPlayer.setVideoSurface(this.surfaceProducer.getSurface());
            this.needsSurface = false;
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSurfaceCleanup() {
        this.exoPlayer.setVideoSurface(null);
        this.needsSurface = true;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer
    public void dispose() {
        super.dispose();
        this.surfaceProducer.release();
    }
}
