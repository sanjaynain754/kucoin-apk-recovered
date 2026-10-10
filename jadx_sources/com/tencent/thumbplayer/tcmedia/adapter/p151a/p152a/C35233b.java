package com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.FileDescriptor;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.b */
/* JADX INFO: loaded from: classes62.dex */
public class C35233b extends MediaPlayer {
    @Override // android.media.MediaPlayer
    public void setDataSource(Context context, Uri uri) {
        try {
            super.setDataSource(context, uri);
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public void release() {
        try {
            if ("N1W".equalsIgnoreCase(TPSystemInfo.getDeviceName()) || "X909T".equalsIgnoreCase(TPSystemInfo.getDeviceName()) || "X909".equalsIgnoreCase(TPSystemInfo.getDeviceName()) || "N1T".equalsIgnoreCase(TPSystemInfo.getDeviceName())) {
                super.setOnPreparedListener(null);
                super.setOnCompletionListener(null);
                super.setOnErrorListener(null);
                super.setOnInfoListener(null);
                super.setOnBufferingUpdateListener(null);
                super.setOnSeekCompleteListener(null);
                super.setOnVideoSizeChangedListener(null);
                ((Handler) super.getClass().getDeclaredField("mA2dpHandler").get(this)).removeCallbacksAndMessages(null);
            }
        } catch (IllegalAccessException e11) {
            e = e11;
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e);
        } catch (NoSuchFieldException e12) {
            e = e12;
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e);
        }
        try {
            super.release();
        } catch (Exception e13) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e13);
        }
    }

    @Override // android.media.MediaPlayer
    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        try {
            super.setDataSource(context, uri, map);
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public void finalize() {
        try {
            super.finalize();
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public int getCurrentPosition() {
        try {
            return super.getCurrentPosition();
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
            return 0;
        }
    }

    @Override // android.media.MediaPlayer
    public int getDuration() {
        try {
            return super.getDuration();
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
            return 0;
        }
    }

    @Override // android.media.MediaPlayer
    public int getSelectedTrack(int i11) {
        try {
            return super.getSelectedTrack(i11);
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
            return 0;
        }
    }

    @Override // android.media.MediaPlayer
    public MediaPlayer.TrackInfo[] getTrackInfo() {
        try {
            return super.getTrackInfo();
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
            return new MediaPlayer.TrackInfo[0];
        }
    }

    @Override // android.media.MediaPlayer
    public int getVideoHeight() {
        try {
            return super.getVideoHeight();
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
            return 0;
        }
    }

    @Override // android.media.MediaPlayer
    public int getVideoWidth() {
        try {
            return super.getVideoWidth();
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
            return 0;
        }
    }

    @Override // android.media.MediaPlayer
    public void prepare() {
        try {
            super.prepare();
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public void reset() {
        try {
            super.reset();
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) {
        try {
            super.setDataSource(fileDescriptor);
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            super.setDisplay(surfaceHolder);
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public void setLooping(boolean z11) {
        try {
            super.setLooping(z11);
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public void setPlaybackParams(PlaybackParams playbackParams) {
        try {
            super.setPlaybackParams(playbackParams);
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public void setSurface(Surface surface) {
        try {
            super.setSurface(surface);
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public void setVolume(float f11, float f12) {
        try {
            super.setVolume(f11, f12);
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }

    @Override // android.media.MediaPlayer
    public void stop() {
        try {
            super.stop();
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPThumbPlayer[TPMediaPlayer.java]", e11);
        }
    }
}
