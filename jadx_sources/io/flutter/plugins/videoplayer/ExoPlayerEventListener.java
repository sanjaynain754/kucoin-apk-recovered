package io.flutter.plugins.videoplayer;

import androidx.annotation.NonNull;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes60.dex */
public abstract class ExoPlayerEventListener implements Player.Listener {
    protected final VideoPlayerCallbacks events;
    protected final ExoPlayer exoPlayer;
    private boolean isBuffering = false;
    private boolean isInitialized = false;

    public enum RotationDegrees {
        ROTATE_0(0),
        ROTATE_90(90),
        ROTATE_180(180),
        ROTATE_270(270);

        private final int degrees;

        public int getDegrees() {
            return this.degrees;
        }

        RotationDegrees(int i11) {
            this.degrees = i11;
        }

        public static RotationDegrees fromDegrees(int i11) {
            for (RotationDegrees rotationDegrees : values()) {
                if (rotationDegrees.degrees == i11) {
                    return rotationDegrees;
                }
            }
            throw new IllegalArgumentException("Invalid rotation degrees specified: " + i11);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaybackStateChanged(int i11) {
        if (i11 == 2) {
            setBuffering(true);
            this.events.onBufferingUpdate(this.exoPlayer.getBufferedPosition());
        } else if (i11 != 3) {
            if (i11 == 4) {
                this.events.onCompleted();
            }
        } else if (!this.isInitialized) {
            this.isInitialized = true;
            sendInitialized();
        }
        if (i11 != 2) {
            setBuffering(false);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(@NonNull PlaybackException playbackException) {
        setBuffering(false);
        if (playbackException.errorCode == 1002) {
            this.exoPlayer.seekToDefaultPosition();
            this.exoPlayer.prepare();
            return;
        }
        this.events.onError("VideoError", "Video player had error " + playbackException, null);
    }

    public abstract void sendInitialized();

    private void setBuffering(boolean z11) {
        if (this.isBuffering == z11) {
            return;
        }
        this.isBuffering = z11;
        if (z11) {
            this.events.onBufferingStart();
        } else {
            this.events.onBufferingEnd();
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(boolean z11) {
        this.events.onIsPlayingStateUpdate(z11);
    }

    public ExoPlayerEventListener(@NonNull ExoPlayer exoPlayer, @NonNull VideoPlayerCallbacks videoPlayerCallbacks) {
        this.exoPlayer = exoPlayer;
        this.events = videoPlayerCallbacks;
    }
}
