.class public interface abstract Lcom/tencent/liteav/txcplayer/ITXVCubePlayer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;,
        Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$a;,
        Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;,
        Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$f;,
        Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;,
        Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$j;,
        Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$h;,
        Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$c;,
        Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$d;,
        Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$g;
    }
.end annotation


# static fields
.field public static final INDEX_AUTO:I = -0x1

.field public static final INITIAL_BITRATE_INDEX_VALUE:I = -0x3e8


# virtual methods
.method public abstract addSubtitleSource(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract attachTRTC(Ljava/lang/Object;)V
.end method

.method public abstract checkSubtitle()V
.end method

.method public abstract deselectTrack(I)V
.end method

.method public abstract detachTRTC()V
.end method

.method public abstract enableAdaptiveBitrate()V
.end method

.method public abstract getBitrateIndex()I
.end method

.method public abstract getCurrentPosition()J
.end method

.method public abstract getDuration()J
.end method

.method public abstract getMediaInfo()Lcom/tencent/liteav/txcplayer/model/b;
.end method

.method public abstract getPdtTimeMs(J)J
.end method

.method public abstract getPlayableDurationMs()J
.end method

.method public abstract getPositionMs(J)J
.end method

.method public abstract getPropertyLong(I)J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract getRate()F
.end method

.method public abstract getSupportedBitrates()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/liteav/txcplayer/model/a;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSurface()Landroid/view/Surface;
.end method

.method public abstract getTrackInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;
.end method

.method public abstract getVideoHeight()I
.end method

.method public abstract getVideoSarDen()I
.end method

.method public abstract getVideoSarNum()I
.end method

.method public abstract getVideoWidth()I
.end method

.method public abstract isEnableRenderProcess()Z
.end method

.method public abstract isLooping()Z
.end method

.method public abstract isPlayable()Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract isPlaying()Z
.end method

.method public abstract pause()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract prepareAsync()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract publishAudioToNetwork()V
.end method

.method public abstract release()V
.end method

.method public abstract releaseSurfaceTexture()V
.end method

.method public abstract releaseTextureHost()V
.end method

.method public abstract reset()V
.end method

.method public abstract seekTo(JZ)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract selectTrack(I)V
.end method

.method public abstract setAudioNormalization(F)V
.end method

.method public abstract setAudioStreamType(I)V
.end method

.method public abstract setAudioVolume(I)V
.end method

.method public abstract setAutoMaxBitrate(I)V
.end method

.method public abstract setBitrateIndex(I)V
.end method

.method public abstract setConfig(Lcom/tencent/liteav/txcplayer/e;)V
.end method

.method public abstract setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/SecurityException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/SecurityException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract setDataSource(Ljava/io/FileDescriptor;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract setDataSource(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/SecurityException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract setDisplay(Landroid/view/SurfaceHolder;)V
.end method

.method public abstract setEnableRenderProcess(Z)V
.end method

.method public abstract setKeepInBackground(Z)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract setLogEnabled(Z)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract setLooping(Z)V
.end method

.method public abstract setOnBufferingUpdateListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$c;)V
.end method

.method public abstract setOnCompletionListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$d;)V
.end method

.method public abstract setOnErrorListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$e;)V
.end method

.method public abstract setOnGetTXCVodVideoViewTargetState(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$a;)V
.end method

.method public abstract setOnInfoListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$f;)V
.end method

.method public abstract setOnPreparedListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$g;)V
.end method

.method public abstract setOnSeekCompleteListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$h;)V
.end method

.method public abstract setOnSubtitleDataListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$i;)V
.end method

.method public abstract setOnSubtitleFrameDataListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$b;)V
.end method

.method public abstract setOnVideoSizeChangedListener(Lcom/tencent/liteav/txcplayer/ITXVCubePlayer$j;)V
.end method

.method public abstract setPrivateConfig(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setRate(F)V
.end method

.method public abstract setScreenOnWhilePlaying(Z)V
.end method

.method public abstract setSubtitleStyle(Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;)V
.end method

.method public abstract setSurface(Landroid/view/Surface;)V
.end method

.method public abstract setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V
.end method

.method public abstract setWakeMode(Landroid/content/Context;I)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract start()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract stop()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation
.end method

.method public abstract unpublishAudioToNetwork()V
.end method
