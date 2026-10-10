package com.tencent.liteav.txcplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.liteav.txcplayer.model.C34815a;
import com.tencent.liteav.txcplayer.model.C34816b;
import com.tencent.liteav.txcplayer.model.TXSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public interface ITXVCubePlayer {
    public static final int INDEX_AUTO = -1;
    public static final int INITIAL_BITRATE_INDEX_VALUE = -1000;

    /* JADX INFO: renamed from: com.tencent.liteav.txcplayer.ITXVCubePlayer$a */
    public interface InterfaceC34793a {
        /* JADX INFO: renamed from: a */
        int mo76205a();
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcplayer.ITXVCubePlayer$b */
    public interface InterfaceC34794b {
        /* JADX INFO: renamed from: a */
        void mo75992a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcplayer.ITXVCubePlayer$c */
    public interface InterfaceC34795c {
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcplayer.ITXVCubePlayer$d */
    public interface InterfaceC34796d {
        /* JADX INFO: renamed from: a */
        void mo76206a();
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcplayer.ITXVCubePlayer$e */
    public interface InterfaceC34797e {
        /* JADX INFO: renamed from: a */
        boolean mo76207a(int i11, int i12);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcplayer.ITXVCubePlayer$f */
    public interface InterfaceC34798f {
        /* JADX INFO: renamed from: a */
        boolean mo76208a(int i11, int i12, int i13, Object obj);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcplayer.ITXVCubePlayer$g */
    public interface InterfaceC34799g {
        /* JADX INFO: renamed from: a */
        void mo76209a(ITXVCubePlayer iTXVCubePlayer);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcplayer.ITXVCubePlayer$h */
    public interface InterfaceC34800h {
        /* JADX INFO: renamed from: a */
        void mo76210a();
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcplayer.ITXVCubePlayer$i */
    public interface InterfaceC34801i {
        /* JADX INFO: renamed from: a */
        void mo75993a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleData tPSubtitleData);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcplayer.ITXVCubePlayer$j */
    public interface InterfaceC34802j {
        /* JADX INFO: renamed from: a */
        void mo76211a(ITXVCubePlayer iTXVCubePlayer, int i11, int i12, String str);
    }

    void addSubtitleSource(String str, String str2, String str3);

    void attachTRTC(Object obj);

    void checkSubtitle();

    void deselectTrack(int i11);

    void detachTRTC();

    void enableAdaptiveBitrate();

    int getBitrateIndex();

    long getCurrentPosition();

    long getDuration();

    C34816b getMediaInfo();

    long getPdtTimeMs(long j11);

    long getPlayableDurationMs();

    long getPositionMs(long j11);

    long getPropertyLong(int i11) throws IllegalStateException;

    float getRate();

    ArrayList<C34815a> getSupportedBitrates();

    Surface getSurface();

    TPTrackInfo[] getTrackInfo();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    boolean isEnableRenderProcess();

    boolean isLooping();

    @Deprecated
    boolean isPlayable();

    boolean isPlaying();

    void pause() throws IllegalStateException;

    void prepareAsync() throws IllegalStateException;

    void publishAudioToNetwork();

    void release();

    void releaseSurfaceTexture();

    void releaseTextureHost();

    void reset();

    void seekTo(long j11, boolean z11) throws IllegalStateException;

    void selectTrack(int i11);

    void setAudioNormalization(float f11);

    void setAudioStreamType(int i11);

    void setAudioVolume(int i11);

    void setAutoMaxBitrate(int i11);

    void setBitrateIndex(int i11);

    void setConfig(C34813e c34813e);

    void setDataSource(Context context, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    void setDataSource(FileDescriptor fileDescriptor) throws IllegalStateException, IOException, IllegalArgumentException;

    void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    void setDisplay(SurfaceHolder surfaceHolder);

    void setEnableRenderProcess(boolean z11);

    @Deprecated
    void setKeepInBackground(boolean z11);

    @Deprecated
    void setLogEnabled(boolean z11);

    void setLooping(boolean z11);

    void setOnBufferingUpdateListener(InterfaceC34795c interfaceC34795c);

    void setOnCompletionListener(InterfaceC34796d interfaceC34796d);

    void setOnErrorListener(InterfaceC34797e interfaceC34797e);

    void setOnGetTXCVodVideoViewTargetState(InterfaceC34793a interfaceC34793a);

    void setOnInfoListener(InterfaceC34798f interfaceC34798f);

    void setOnPreparedListener(InterfaceC34799g interfaceC34799g);

    void setOnSeekCompleteListener(InterfaceC34800h interfaceC34800h);

    void setOnSubtitleDataListener(InterfaceC34801i interfaceC34801i);

    void setOnSubtitleFrameDataListener(InterfaceC34794b interfaceC34794b);

    void setOnVideoSizeChangedListener(InterfaceC34802j interfaceC34802j);

    void setPrivateConfig(Map<String, Object> map);

    void setRate(float f11);

    void setScreenOnWhilePlaying(boolean z11);

    void setSubtitleStyle(TXSubtitleRenderModel tXSubtitleRenderModel);

    void setSurface(Surface surface);

    void setSurfaceTexture(SurfaceTexture surfaceTexture);

    @Deprecated
    void setWakeMode(Context context, int i11);

    void start() throws IllegalStateException;

    void stop() throws IllegalStateException;

    void unpublishAudioToNetwork();
}
