package androidx.media3.common;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class ForwardingSimpleBasePlayer extends SimpleBasePlayer {
    private ForwardingPositionSupplier currentPositionSupplier;
    private Metadata lastTimedMetadata;
    private int pendingDiscontinuityReason;
    private boolean pendingFirstFrameRendered;
    private long pendingPositionDiscontinuityNewPositionMs;
    private int playWhenReadyChangeReason;
    private final Player player;

    public static final class ForwardingPositionSupplier {
        private final Player player;
        private long positionsMs = C2711C.TIME_UNSET;
        private long contentPositionMs = C2711C.TIME_UNSET;

        public long getBufferedPositionMs() {
            long j11 = this.positionsMs;
            return j11 == C2711C.TIME_UNSET ? this.player.getBufferedPosition() : j11;
        }

        public long getContentBufferedPositionMs() {
            long j11 = this.contentPositionMs;
            return j11 == C2711C.TIME_UNSET ? this.player.getContentBufferedPosition() : j11;
        }

        public long getContentPositionMs() {
            long j11 = this.contentPositionMs;
            return j11 == C2711C.TIME_UNSET ? this.player.getContentPosition() : j11;
        }

        public long getCurrentPositionMs() {
            long j11 = this.positionsMs;
            return j11 == C2711C.TIME_UNSET ? this.player.getCurrentPosition() : j11;
        }

        public long getTotalBufferedDurationMs() {
            if (this.positionsMs == C2711C.TIME_UNSET) {
                return this.player.getTotalBufferedDuration();
            }
            return 0L;
        }

        public void setConstant(long j11, long j12) {
            this.positionsMs = j11;
            this.contentPositionMs = j12;
        }

        public ForwardingPositionSupplier(Player player) {
            this.player = player;
        }
    }

    public final Player getPlayer() {
        return this.player;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public SimpleBasePlayer.State getState() {
        SimpleBasePlayer.State.Builder builder = new SimpleBasePlayer.State.Builder();
        final ForwardingPositionSupplier forwardingPositionSupplier = this.currentPositionSupplier;
        if (this.player.isCommandAvailable(16)) {
            Objects.requireNonNull(forwardingPositionSupplier);
            builder.setAdBufferedPositionMs(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.i
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return forwardingPositionSupplier.getBufferedPositionMs();
                }
            });
            builder.setAdPositionMs(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.j
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return forwardingPositionSupplier.getCurrentPositionMs();
                }
            });
        }
        if (this.player.isCommandAvailable(21)) {
            builder.setAudioAttributes(this.player.getAudioAttributes());
        }
        builder.setAvailableCommands(this.player.getAvailableCommands());
        if (this.player.isCommandAvailable(16)) {
            Objects.requireNonNull(forwardingPositionSupplier);
            builder.setContentBufferedPositionMs(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.k
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return forwardingPositionSupplier.getContentBufferedPositionMs();
                }
            });
            builder.setContentPositionMs(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.l
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return forwardingPositionSupplier.getContentPositionMs();
                }
            });
            if (this.player.isCommandAvailable(17)) {
                builder.setCurrentAd(this.player.getCurrentAdGroupIndex(), this.player.getCurrentAdIndexInAdGroup());
            }
        }
        if (this.player.isCommandAvailable(28)) {
            builder.setCurrentCues(this.player.getCurrentCues());
        }
        if (this.player.isCommandAvailable(17)) {
            builder.setCurrentMediaItemIndex(this.player.getCurrentMediaItemIndex());
        }
        builder.setDeviceInfo(this.player.getDeviceInfo());
        if (this.player.isCommandAvailable(23)) {
            builder.setDeviceVolume(this.player.getDeviceVolume());
            builder.setIsDeviceMuted(this.player.isDeviceMuted());
        }
        builder.setIsLoading(this.player.isLoading());
        builder.setMaxSeekToPreviousPositionMs(this.player.getMaxSeekToPreviousPosition());
        if (this.pendingFirstFrameRendered) {
            builder.setNewlyRenderedFirstFrame(true);
            this.pendingFirstFrameRendered = false;
        }
        builder.setPlaybackParameters(this.player.getPlaybackParameters());
        builder.setPlaybackState(this.player.getPlaybackState());
        builder.setPlaybackSuppressionReason(this.player.getPlaybackSuppressionReason());
        builder.setPlayerError(this.player.getPlayerError());
        if (this.player.isCommandAvailable(17)) {
            builder.setPlaylist(this.player.getCurrentTimeline(), this.player.isCommandAvailable(30) ? this.player.getCurrentTracks() : Tracks.EMPTY, this.player.isCommandAvailable(18) ? this.player.getMediaMetadata() : null);
        }
        if (this.player.isCommandAvailable(18)) {
            builder.setPlaylistMetadata(this.player.getPlaylistMetadata());
        }
        builder.setPlayWhenReady(this.player.getPlayWhenReady(), this.playWhenReadyChangeReason);
        long j11 = this.pendingPositionDiscontinuityNewPositionMs;
        if (j11 != C2711C.TIME_UNSET) {
            builder.setPositionDiscontinuity(this.pendingDiscontinuityReason, j11);
            this.pendingPositionDiscontinuityNewPositionMs = C2711C.TIME_UNSET;
        }
        builder.setRepeatMode(this.player.getRepeatMode());
        builder.setSeekBackIncrementMs(this.player.getSeekBackIncrement());
        builder.setSeekForwardIncrementMs(this.player.getSeekForwardIncrement());
        builder.setShuffleModeEnabled(this.player.getShuffleModeEnabled());
        builder.setSurfaceSize(this.player.getSurfaceSize());
        builder.setTimedMetadata(this.lastTimedMetadata);
        if (this.player.isCommandAvailable(16)) {
            Objects.requireNonNull(forwardingPositionSupplier);
            builder.setTotalBufferedDurationMs(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.m
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return forwardingPositionSupplier.getTotalBufferedDurationMs();
                }
            });
        }
        builder.setTrackSelectionParameters(this.player.getTrackSelectionParameters());
        builder.setVideoSize(this.player.getVideoSize());
        if (this.player.isCommandAvailable(22)) {
            builder.setVolume(this.player.getVolume());
        }
        return builder.build();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleClearVideoOutput(@Nullable Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.clearVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.clearVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.clearVideoSurfaceHolder((SurfaceHolder) obj);
        } else if (obj instanceof Surface) {
            this.player.clearVideoSurface((Surface) obj);
        } else {
            if (obj != null) {
                throw new IllegalStateException();
            }
            this.player.clearVideoSurface();
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleDecreaseDeviceVolume(int i11) {
        if (this.player.isCommandAvailable(34)) {
            this.player.decreaseDeviceVolume(i11);
        } else {
            this.player.decreaseDeviceVolume();
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleIncreaseDeviceVolume(int i11) {
        if (this.player.isCommandAvailable(34)) {
            this.player.increaseDeviceVolume(i11);
        } else {
            this.player.increaseDeviceVolume();
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleMoveMediaItems(int i11, int i12, int i13) {
        if (i12 == i11 + 1) {
            this.player.moveMediaItem(i11, i13);
        } else {
            this.player.moveMediaItems(i11, i12, i13);
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handlePrepare() {
        this.player.prepare();
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleRelease() {
        this.player.release();
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleRemoveMediaItems(int i11, int i12) {
        if (i12 == i11 + 1) {
            this.player.removeMediaItem(i11);
        } else {
            this.player.removeMediaItems(i11, i12);
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleReplaceMediaItems(int i11, int i12, List<MediaItem> list) {
        if (i12 == i11 + 1 && list.size() == 1) {
            this.player.replaceMediaItem(i11, list.get(0));
        } else {
            this.player.replaceMediaItems(i11, i12, list);
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z11) {
        this.player.setAudioAttributes(audioAttributes, z11);
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetDeviceMuted(boolean z11, int i11) {
        if (this.player.isCommandAvailable(34)) {
            this.player.setDeviceMuted(z11, i11);
        } else {
            this.player.setDeviceMuted(z11);
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetDeviceVolume(int i11, int i12) {
        if (this.player.isCommandAvailable(33)) {
            this.player.setDeviceVolume(i11, i12);
        } else {
            this.player.setDeviceVolume(i11);
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetPlayWhenReady(boolean z11) {
        this.player.setPlayWhenReady(z11);
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        this.player.setPlaybackParameters(playbackParameters);
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        this.player.setPlaylistMetadata(mediaMetadata);
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetRepeatMode(int i11) {
        this.player.setRepeatMode(i11);
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetShuffleModeEnabled(boolean z11) {
        this.player.setShuffleModeEnabled(z11);
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        this.player.setTrackSelectionParameters(trackSelectionParameters);
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetVideoOutput(Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.setVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.setVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.setVideoSurfaceHolder((SurfaceHolder) obj);
        } else {
            if (!(obj instanceof Surface)) {
                throw new IllegalStateException();
            }
            this.player.setVideoSurface((Surface) obj);
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetVolume(float f11) {
        this.player.setVolume(f11);
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleStop() {
        this.player.stop();
        return Futures.immediateVoidFuture();
    }

    public ForwardingSimpleBasePlayer(final Player player) {
        super(player.getApplicationLooper());
        this.player = player;
        this.lastTimedMetadata = new Metadata(C2711C.TIME_UNSET, new Metadata.Entry[0]);
        this.playWhenReadyChangeReason = 1;
        this.pendingDiscontinuityReason = 5;
        this.currentPositionSupplier = new ForwardingPositionSupplier(player);
        player.addListener(new Player.Listener() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer.1
            @Override // androidx.media3.common.Player.Listener
            public void onEvents(Player player2, Player.Events events) {
                ForwardingSimpleBasePlayer.this.invalidateState();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onMetadata(Metadata metadata) {
                ForwardingSimpleBasePlayer.this.lastTimedMetadata = metadata;
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayWhenReadyChanged(boolean z11, int i11) {
                ForwardingSimpleBasePlayer.this.playWhenReadyChangeReason = i11;
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i11) {
                ForwardingSimpleBasePlayer.this.pendingDiscontinuityReason = i11;
                ForwardingSimpleBasePlayer.this.pendingPositionDiscontinuityNewPositionMs = positionInfo2.positionMs;
                ForwardingSimpleBasePlayer.this.currentPositionSupplier.setConstant(positionInfo.positionMs, positionInfo.contentPositionMs);
                ForwardingSimpleBasePlayer.this.currentPositionSupplier = new ForwardingPositionSupplier(player);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onRenderedFirstFrame() {
                ForwardingSimpleBasePlayer.this.pendingFirstFrameRendered = true;
            }
        });
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleAddMediaItems(int i11, List<MediaItem> list) {
        if (list.size() == 1) {
            this.player.addMediaItem(i11, list.get(0));
        } else {
            this.player.addMediaItems(i11, list);
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSeek(int i11, long j11, int i12) {
        switch (i12) {
            case 4:
                this.player.seekToDefaultPosition();
                break;
            case 5:
                this.player.seekTo(j11);
                break;
            case 6:
                this.player.seekToPreviousMediaItem();
                break;
            case 7:
                this.player.seekToPrevious();
                break;
            case 8:
                this.player.seekToNextMediaItem();
                break;
            case 9:
                this.player.seekToNext();
                break;
            case 10:
                if (i11 != -1) {
                    this.player.seekTo(i11, j11);
                }
                break;
            case 11:
                this.player.seekBack();
                break;
            case 12:
                this.player.seekForward();
                break;
            default:
                throw new IllegalStateException();
        }
        return Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    public ListenableFuture<?> handleSetMediaItems(List<MediaItem> list, int i11, long j11) {
        boolean z11 = true;
        if (list.size() != 1 || !this.player.isCommandAvailable(31)) {
            z11 = false;
        }
        if (i11 == -1) {
            if (z11) {
                this.player.setMediaItem(list.get(0));
            } else {
                this.player.setMediaItems(list);
            }
        } else if (z11) {
            this.player.setMediaItem(list.get(0), j11);
        } else {
            this.player.setMediaItems(list, i11, j11);
        }
        return Futures.immediateVoidFuture();
    }
}
