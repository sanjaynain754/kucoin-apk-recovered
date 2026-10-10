package io.flutter.plugins.videoplayer.platformview;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugins.videoplayer.Messages;
import io.flutter.plugins.videoplayer.VideoPlayer;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class PlatformVideoViewFactory extends PlatformViewFactory {
    private final VideoPlayerProvider videoPlayerProvider;

    @FunctionalInterface
    public interface VideoPlayerProvider {
        @NonNull
        VideoPlayer getVideoPlayer(@NonNull Long l11);
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    @NonNull
    public PlatformView create(@NonNull Context context, int i11, @Nullable Object obj) {
        Messages.PlatformVideoViewCreationParams platformVideoViewCreationParams = (Messages.PlatformVideoViewCreationParams) obj;
        Objects.requireNonNull(platformVideoViewCreationParams);
        return new PlatformVideoView(context, this.videoPlayerProvider.getVideoPlayer(platformVideoViewCreationParams.getPlayerId()).getExoPlayer());
    }

    public PlatformVideoViewFactory(@NonNull VideoPlayerProvider videoPlayerProvider) {
        super(Messages.AndroidVideoPlayerApi.getCodec());
        this.videoPlayerProvider = videoPlayerProvider;
    }
}
