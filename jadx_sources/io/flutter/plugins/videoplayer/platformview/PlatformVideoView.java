package io.flutter.plugins.videoplayer.platformview;

import android.content.Context;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugin.platform.PlatformView;

/* JADX INFO: loaded from: classes60.dex */
public final class PlatformVideoView implements PlatformView {

    @NonNull
    private final SurfaceView surfaceView;

    private void setupSurfaceWithCallback(@NonNull final ExoPlayer exoPlayer) {
        this.surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: io.flutter.plugins.videoplayer.platformview.PlatformVideoView.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                exoPlayer.setVideoSurface(surfaceHolder.getSurface());
                exoPlayer.seekTo(1L);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
                exoPlayer.setVideoSurface(null);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            }
        });
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        this.surfaceView.getHolder().getSurface().release();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    @NonNull
    public View getView() {
        return this.surfaceView;
    }

    @OptIn(markerClass = {UnstableApi.class})
    public PlatformVideoView(@NonNull Context context, @NonNull ExoPlayer exoPlayer) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.surfaceView = surfaceView;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 28) {
            setupSurfaceWithCallback(exoPlayer);
            return;
        }
        if (i11 <= 25) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        exoPlayer.setVideoSurfaceView(surfaceView);
    }
}
