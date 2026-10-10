package io.flutter.plugins.videoplayer.platformview;

import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.videoplayer.ExoPlayerEventListener;
import io.flutter.plugins.videoplayer.VideoPlayerCallbacks;
import java.util.Objects;

/* JADX INFO: loaded from: classes60.dex */
public final class PlatformViewExoPlayerEventListener extends ExoPlayerEventListener {
    @Override // io.flutter.plugins.videoplayer.ExoPlayerEventListener
    @OptIn(markerClass = {UnstableApi.class})
    public void sendInitialized() {
        int i11;
        int i12;
        Format videoFormat = this.exoPlayer.getVideoFormat();
        Objects.requireNonNull(videoFormat);
        ExoPlayerEventListener.RotationDegrees rotationDegreesFromDegrees = ExoPlayerEventListener.RotationDegrees.fromDegrees(videoFormat.rotationDegrees);
        int i13 = videoFormat.width;
        int i14 = videoFormat.height;
        if (rotationDegreesFromDegrees == ExoPlayerEventListener.RotationDegrees.ROTATE_90 || rotationDegreesFromDegrees == ExoPlayerEventListener.RotationDegrees.ROTATE_270) {
            rotationDegreesFromDegrees = ExoPlayerEventListener.RotationDegrees.fromDegrees(0);
            i11 = i14;
            i12 = i13;
        } else {
            i12 = i14;
            i11 = i13;
        }
        this.events.onInitialized(i11, i12, this.exoPlayer.getDuration(), rotationDegreesFromDegrees.getDegrees());
    }

    public PlatformViewExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @NonNull VideoPlayerCallbacks videoPlayerCallbacks) {
        super(exoPlayer, videoPlayerCallbacks);
    }
}
