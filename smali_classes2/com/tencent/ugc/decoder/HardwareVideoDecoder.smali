.class public Lcom/tencent/ugc/decoder/HardwareVideoDecoder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ugc/decoder/MediaCodecDecoder$MediaCodecDecoderListener;
.implements Lcom/tencent/ugc/decoder/VideoDecoderInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;
    }
.end annotation


# static fields
.field private static final INTERVAL_DRAIN_ONE_FRAME_MORE:I = 0x1e


# instance fields
.field private mAllowDrainDecodedFrames:Z

.field private mDecodedFrameCount:J

.field private final mDecoderMediaFormatBuilder:Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;

.field private mEnableLimitMaxDecFrameBufferingInH264Sps:Z

.field private mIsNeedNotifyAbandonCompleted:Z

.field private mListener:Lcom/tencent/ugc/decoder/VideoDecoderListener;

.field private mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

.field private mOutputSurface:Landroid/view/Surface;

.field private final mParams:Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;

.field private mPendingDecodeFrame:Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;

.field private mPreloadMediaCodec:Landroid/media/MediaCodec;

.field private mScene:Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;

.field private mTAG:Ljava/lang/String;

.field private final mThrottlers:Lcom/tencent/liteav/base/b/b;

.field private volatile mWorkHandler:Lcom/tencent/liteav/base/util/CustomHandler;


# direct methods
.method public constructor <init>(Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;Landroid/media/MediaCodec;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "HardwareVideoDecoder"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Lcom/tencent/liteav/base/b/b;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/tencent/liteav/base/b/b;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mOutputSurface:Landroid/view/Surface;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mWorkHandler:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mListener:Lcom/tencent/ugc/decoder/VideoDecoderListener;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mPendingDecodeFrame:Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;

    .line 26
    const/4 v0, 0x1

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mAllowDrainDecodedFrames:Z

    .line 29
    .line 30
    sget-object v0, Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;->UNKNOWN:Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mScene:Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;

    .line 33
    const/4 v0, 0x0

    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mEnableLimitMaxDecFrameBufferingInH264Sps:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mIsNeedNotifyAbandonCompleted:Z

    .line 38
    .line 39
    const-wide/16 v0, 0x0

    .line 40
    .line 41
    iput-wide v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mDecodedFrameCount:J

    .line 42
    .line 43
    new-instance v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, p1}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;-><init>(Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;)V

    .line 47
    .line 48
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mParams:Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;

    .line 49
    .line 50
    iput-object p2, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mPreloadMediaCodec:Landroid/media/MediaCodec;

    .line 51
    .line 52
    iget-boolean p2, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useHevc:Z

    .line 53
    .line 54
    if-eqz p2, :cond_0

    .line 55
    .line 56
    const-string p2, "video/hevc"

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_0
    const-string p2, "video/avc"

    .line 60
    .line 61
    :goto_0
    iget-object v1, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaFormat:Landroid/media/MediaFormat;

    .line 62
    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    new-instance p2, Lcom/tencent/liteav/base/util/Size;

    .line 66
    .line 67
    const-string v2, "width"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 71
    move-result v1

    .line 72
    .line 73
    iget-object v2, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaFormat:Landroid/media/MediaFormat;

    .line 74
    .line 75
    const-string v3, "height"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 79
    move-result v2

    .line 80
    .line 81
    .line 82
    invoke-direct {p2, v1, v2}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    .line 83
    .line 84
    iput-object p2, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->resolution:Lcom/tencent/liteav/base/util/Size;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaFormat:Landroid/media/MediaFormat;

    .line 87
    .line 88
    const-string p2, "mime"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    :cond_1
    new-instance p1, Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;

    .line 95
    .line 96
    .line 97
    invoke-direct {p1}, Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;-><init>()V

    .line 98
    .line 99
    iget-object v1, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaFormat:Landroid/media/MediaFormat;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v1}, Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;->setMediaFormat(Landroid/media/MediaFormat;)Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    iget-object v1, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaCodecDeviceRelatedParams:Lorg/json/JSONArray;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v1}, Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;->setMediaCodecDeviceRelatedParams(Lorg/json/JSONArray;)Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p2}, Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;->setMimeType(Ljava/lang/String;)Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    iget-object p2, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->resolution:Lcom/tencent/liteav/base/util/Size;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Lcom/tencent/liteav/base/util/Size;->getWidth()I

    .line 119
    move-result p2

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, p2}, Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;->setWidth(I)Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    iget-object p2, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->resolution:Lcom/tencent/liteav/base/util/Size;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Lcom/tencent/liteav/base/util/Size;->getHeight()I

    .line 129
    move-result p2

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, p2}, Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;->setHeight(I)Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    iput-object p1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mDecoderMediaFormatBuilder:Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;

    .line 136
    .line 137
    new-instance p1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    iget-object p2, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string p2, "_"

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 154
    move-result p2

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    move-result-object p1

    .line 162
    .line 163
    iput-object p1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 164
    return-void
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method private abandonDecodingFramesInternal()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->releasePendingDecodeFrame()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/tencent/ugc/decoder/MediaCodecDecoder;->flush()V

    .line 11
    .line 12
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mAllowDrainDecodedFrames:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->notifyOnAbandonDecodingFramesCompleted()V

    .line 18
    return-void

    .line 19
    :cond_1
    const/4 v0, 0x1

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mIsNeedNotifyAbandonCompleted:Z

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public static synthetic access$lambda$0(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->drainAndFeedFrame()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method public static synthetic access$lambda$1(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->drainAndFeedFrame()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method public static synthetic access$lambda$2(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->stopInternal()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method public static synthetic access$lambda$3(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->abandonDecodingFramesInternal()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method private allowDrainOneFrameMore()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mDecodedFrameCount:J

    .line 3
    .line 4
    const-wide/16 v2, 0x1e

    .line 5
    rem-long/2addr v0, v2

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method private drainAndFeedFrame()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "MediaCodec is stopped."

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->releasePendingDecodeFrame()V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mAllowDrainDecodedFrames:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->drainDecodedFrame()Z

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_4

    .line 26
    :cond_1
    :goto_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    :try_start_1
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mPendingDecodeFrame:Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;

    .line 29
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    :try_start_2
    iget-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Lcom/tencent/ugc/decoder/MediaCodecDecoder;->feedEncodedFrame(Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;)Z

    .line 37
    move-result v1

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    goto :goto_3

    .line 41
    :cond_2
    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    .line 43
    :try_start_3
    iget-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mPendingDecodeFrame:Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;

    .line 44
    .line 45
    if-ne v1, v0, :cond_3

    .line 46
    const/4 v0, 0x0

    .line 47
    .line 48
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mPendingDecodeFrame:Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;

    .line 49
    goto :goto_1

    .line 50
    :catchall_1
    move-exception v0

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    :goto_1
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :goto_2
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 55
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 56
    :cond_4
    :goto_3
    return-void

    .line 57
    :catchall_2
    move-exception v0

    .line 58
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 59
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 60
    .line 61
    :goto_4
    iget-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 62
    .line 63
    const-string v2, "decode failed."

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->handleDecoderError()V

    .line 70
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method private drainDecodedFrame()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/ugc/decoder/MediaCodecDecoder;->drainDecodedFrame()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mAllowDrainDecodedFrames:Z

    .line 12
    .line 13
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mAllowDrainDecodedFrames:Z

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method private handleDecoderError()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->releasePendingDecodeFrame()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mListener:Lcom/tencent/ugc/decoder/VideoDecoderListener;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/tencent/ugc/decoder/VideoDecoderListener;->onDecodeFailed()V

    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public static synthetic lambda$setScene$1(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mScene:Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean p0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mEnableLimitMaxDecFrameBufferingInH264Sps:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;->RTC:Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;

    .line 13
    .line 14
    if-ne p1, p0, :cond_0

    .line 15
    const/4 p0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0, p0}, Lcom/tencent/ugc/decoder/MediaCodecDecoder;->enableLimitMaxDecFrameBuffer(Z)V

    .line 21
    :cond_1
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method public static synthetic lambda$start$0(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;Ljava/lang/Object;Lcom/tencent/ugc/decoder/VideoDecoderListener;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->startInternal(Ljava/lang/Object;Lcom/tencent/ugc/decoder/VideoDecoderListener;)V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
.end method

.method private notifyEndOfStream()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mListener:Lcom/tencent/ugc/decoder/VideoDecoderListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/decoder/VideoDecoderListener;->onDecodeCompleted()V

    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method private notifyOnAbandonDecodingFramesCompleted()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mListener:Lcom/tencent/ugc/decoder/VideoDecoderListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/ugc/decoder/VideoDecoderListener;->onAbandonDecodingFramesCompleted()V

    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method private releasePendingDecodeFrame()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mPendingDecodeFrame:Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method private runOnWorkThread(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mWorkHandler:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mWorkHandler:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/base/util/CustomHandler;->runOrPost(Ljava/lang/Runnable;)Z

    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method private startInternal(Ljava/lang/Object;Lcom/tencent/ugc/decoder/VideoDecoderListener;)V
    .locals 13

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "Start decoder with eglContext:%s"

    .line 5
    .line 6
    .line 7
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 21
    .line 22
    const-string p2, "Decoder already started."

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mParams:Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;

    .line 29
    .line 30
    iget-boolean v1, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useHevc:Z

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const-string v1, "video/hevc"

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    const-string v1, "video/avc"

    .line 38
    .line 39
    :goto_0
    iget-object v0, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaFormat:Landroid/media/MediaFormat;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    const-string v1, "mime"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-static {}, Lcom/tencent/ugc/decoder/DecodeAbilityProvider;->getInstance()Lcom/tencent/ugc/decoder/DecodeAbilityProvider;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lcom/tencent/ugc/decoder/DecodeAbilityProvider;->getSupportColorFormat(Ljava/lang/String;)I

    .line 55
    move-result v0

    .line 56
    .line 57
    iget-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mParams:Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;

    .line 58
    .line 59
    iget-boolean v1, v1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useOutputBuffer:Z

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lcom/tencent/ugc/decoder/MediaCodecOutputBufferDecoder;->isSupportColorFormat(I)Z

    .line 65
    move-result v0

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    new-instance v1, Lcom/tencent/ugc/decoder/MediaCodecOutputBufferDecoder;

    .line 70
    .line 71
    iget-object v2, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mDecoderMediaFormatBuilder:Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mParams:Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;

    .line 74
    .line 75
    iget-object v3, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->resolution:Lcom/tencent/liteav/base/util/Size;

    .line 76
    .line 77
    iget-boolean v4, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useSoftDecoder:Z

    .line 78
    .line 79
    iget-object v6, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mWorkHandler:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 80
    move-object v5, p0

    .line 81
    .line 82
    .line 83
    invoke-direct/range {v1 .. v6}, Lcom/tencent/ugc/decoder/MediaCodecOutputBufferDecoder;-><init>(Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;Lcom/tencent/liteav/base/util/Size;ZLcom/tencent/ugc/decoder/MediaCodecDecoder$MediaCodecDecoderListener;Lcom/tencent/liteav/base/util/CustomHandler;)V

    .line 84
    .line 85
    iput-object v1, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object v5, p0

    .line 88
    .line 89
    new-instance v7, Lcom/tencent/ugc/decoder/MediaCodecOutputOESTextureDecoder;

    .line 90
    .line 91
    iget-object v8, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mDecoderMediaFormatBuilder:Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;

    .line 92
    .line 93
    iget-object v0, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mParams:Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;

    .line 94
    .line 95
    iget-object v9, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->resolution:Lcom/tencent/liteav/base/util/Size;

    .line 96
    .line 97
    iget-boolean v10, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useSoftDecoder:Z

    .line 98
    .line 99
    iget-object v12, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mWorkHandler:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 100
    move-object v11, v5

    .line 101
    .line 102
    .line 103
    invoke-direct/range {v7 .. v12}, Lcom/tencent/ugc/decoder/MediaCodecOutputOESTextureDecoder;-><init>(Lcom/tencent/ugc/videobase/utils/HardwareDecoderMediaFormatBuilder;Lcom/tencent/liteav/base/util/Size;ZLcom/tencent/ugc/decoder/MediaCodecDecoder$MediaCodecDecoderListener;Lcom/tencent/liteav/base/util/CustomHandler;)V

    .line 104
    .line 105
    iput-object v7, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 106
    .line 107
    :goto_1
    iget-object v0, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 108
    .line 109
    iget-boolean v1, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mEnableLimitMaxDecFrameBufferingInH264Sps:Z

    .line 110
    const/4 v2, 0x1

    .line 111
    const/4 v3, 0x0

    .line 112
    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    iget-object v1, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mScene:Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;

    .line 116
    .line 117
    sget-object v4, Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;->RTC:Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;

    .line 118
    .line 119
    if-ne v1, v4, :cond_4

    .line 120
    move v1, v2

    .line 121
    goto :goto_2

    .line 122
    :cond_4
    move v1, v3

    .line 123
    .line 124
    .line 125
    :goto_2
    invoke-virtual {v0, v1}, Lcom/tencent/ugc/decoder/MediaCodecDecoder;->enableLimitMaxDecFrameBuffer(Z)V

    .line 126
    .line 127
    iget-object v0, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, p1}, Lcom/tencent/ugc/decoder/MediaCodecDecoder;->start(Ljava/lang/Object;)Z

    .line 131
    .line 132
    iput-object p2, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mListener:Lcom/tencent/ugc/decoder/VideoDecoderListener;

    .line 133
    .line 134
    iget-object p1, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 135
    .line 136
    iget-object p2, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mParams:Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;

    .line 137
    .line 138
    iget-boolean p2, p2, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->isLowLatencyEnabled:Z

    .line 139
    .line 140
    iget-object v0, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mPreloadMediaCodec:Landroid/media/MediaCodec;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p2, v0}, Lcom/tencent/ugc/decoder/MediaCodecDecoder;->buildMediaCodec(ZLandroid/media/MediaCodec;)Lcom/tencent/ugc/decoder/MediaCodecDecoder$BuildResult;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    iget-object p2, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mParams:Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;

    .line 147
    .line 148
    iget-boolean p2, p2, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->isLowLatencyEnabled:Z

    .line 149
    .line 150
    if-eqz p2, :cond_5

    .line 151
    .line 152
    iget-boolean p2, p1, Lcom/tencent/ugc/decoder/MediaCodecDecoder$BuildResult;->isSuccess:Z

    .line 153
    .line 154
    if-eqz p2, :cond_5

    .line 155
    goto :goto_3

    .line 156
    :cond_5
    move v2, v3

    .line 157
    .line 158
    :goto_3
    iget-boolean p2, p1, Lcom/tencent/ugc/decoder/MediaCodecDecoder$BuildResult;->isSuccess:Z

    .line 159
    .line 160
    if-nez p2, :cond_6

    .line 161
    .line 162
    iget-object p1, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 163
    const/4 p2, 0x0

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v3, p2}, Lcom/tencent/ugc/decoder/MediaCodecDecoder;->buildMediaCodec(ZLandroid/media/MediaCodec;)Lcom/tencent/ugc/decoder/MediaCodecDecoder$BuildResult;

    .line 167
    move-result-object p1

    .line 168
    .line 169
    :cond_6
    iget-boolean p1, p1, Lcom/tencent/ugc/decoder/MediaCodecDecoder$BuildResult;->isSuccess:Z

    .line 170
    .line 171
    if-eqz p1, :cond_8

    .line 172
    .line 173
    iget-object p1, v5, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mListener:Lcom/tencent/ugc/decoder/VideoDecoderListener;

    .line 174
    .line 175
    if-eqz p1, :cond_7

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v2}, Lcom/tencent/ugc/decoder/VideoDecoderListener;->onDecodeLatencyChanged(Z)V

    .line 179
    .line 180
    .line 181
    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 182
    return-void

    .line 183
    .line 184
    .line 185
    :cond_8
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->stopInternal()V

    .line 186
    .line 187
    .line 188
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->handleDecoderError()V

    .line 189
    return-void
.end method

.method private stopInternal()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "Stop decoder"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/tencent/ugc/decoder/MediaCodecDecoder;->stop()V

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mMediaCodecDecoder:Lcom/tencent/ugc/decoder/MediaCodecDecoder;

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->releasePendingDecodeFrame()V

    .line 21
    const/4 v0, 0x1

    .line 22
    .line 23
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mAllowDrainDecodedFrames:Z

    .line 24
    .line 25
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    iput-wide v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mDecodedFrameCount:J

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method


# virtual methods
.method public abandonDecodingFrames()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "flush"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcom/tencent/ugc/decoder/f;->a(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;)Ljava/lang/Runnable;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->runOnWorkThread(Ljava/lang/Runnable;)V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public decode(Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mPendingDecodeFrame:Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :cond_0
    iput-object p1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mPendingDecodeFrame:Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/tencent/ugc/decoder/d;->a(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;)Ljava/lang/Runnable;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->runOnWorkThread(Ljava/lang/Runnable;)V

    .line 18
    const/4 p1, 0x1

    .line 19
    monitor-exit p0

    .line 20
    return p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/tencent/ugc/decoder/c;->a(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;)Ljava/lang/Runnable;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->runOnWorkThread(Ljava/lang/Runnable;)V

    .line 30
    const/4 p1, 0x0

    .line 31
    monitor-exit p0

    .line 32
    return p1

    .line 33
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method public getDecoderType()Lcom/tencent/ugc/decoder/VideoDecoderInterface$DecoderType;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mParams:Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, v0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useSoftDecoder:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/tencent/ugc/decoder/VideoDecoderInterface$DecoderType;->SOFTWARE_DEVICE:Lcom/tencent/ugc/decoder/VideoDecoderInterface$DecoderType;

    .line 12
    return-object v0

    .line 13
    .line 14
    :cond_1
    :goto_0
    sget-object v0, Lcom/tencent/ugc/decoder/VideoDecoderInterface$DecoderType;->HARDWARE:Lcom/tencent/ugc/decoder/VideoDecoderInterface$DecoderType;

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public initialize()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/os/HandlerThread;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "HardwareVideoDecoder_"

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 13
    move-result v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 27
    .line 28
    new-instance v1, Lcom/tencent/liteav/base/util/CustomHandler;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v0}, Lcom/tencent/liteav/base/util/CustomHandler;-><init>(Landroid/os/Looper;)V

    .line 36
    .line 37
    iput-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mWorkHandler:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public onDecodeFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Z)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->notifyEndOfStream()V

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mAllowDrainDecodedFrames:Z

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    if-nez p1, :cond_1

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_1
    iget-wide v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mDecodedFrameCount:J

    .line 15
    .line 16
    const-wide/16 v3, 0x1

    .line 17
    add-long/2addr v1, v3

    .line 18
    .line 19
    iput-wide v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mDecodedFrameCount:J

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mAllowDrainDecodedFrames:Z

    .line 22
    .line 23
    iget-object p2, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mListener:Lcom/tencent/ugc/decoder/VideoDecoderListener;

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getTimestamp()J

    .line 29
    move-result-wide v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p1, v0, v1}, Lcom/tencent/ugc/decoder/VideoDecoderListener;->onDecodeFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;J)V

    .line 33
    :cond_2
    const/4 p1, 0x0

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->allowDrainOneFrameMore()Z

    .line 37
    move-result p2

    .line 38
    .line 39
    if-eqz p2, :cond_3

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->drainDecodedFrame()Z

    .line 43
    move-result p2

    .line 44
    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    iget-object p2, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 48
    .line 49
    const-string v0, "drain more frame success"

    .line 50
    .line 51
    .line 52
    invoke-static {p2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p2

    .line 55
    .line 56
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mThrottlers:Lcom/tencent/liteav/base/b/b;

    .line 57
    .line 58
    const-string v1, "drainDecodedFrame"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/b/b;->a(Ljava/lang/String;)Lcom/tencent/liteav/base/b/a;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    iget-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 65
    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v3, "exception from drain decoded frame, message:"

    .line 69
    .line 70
    .line 71
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 75
    move-result-object p2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    new-array v2, p1, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1, p2, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Lcom/tencent/liteav/base/b/a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    :cond_3
    :goto_0
    iget-boolean p2, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mIsNeedNotifyAbandonCompleted:Z

    .line 90
    .line 91
    if-eqz p2, :cond_4

    .line 92
    .line 93
    .line 94
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->notifyOnAbandonDecodingFramesCompleted()V

    .line 95
    .line 96
    iput-boolean p1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mIsNeedNotifyAbandonCompleted:Z

    .line 97
    :cond_4
    :goto_1
    return-void
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method public onDecoderError()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->handleDecoderError()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public setScene(Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/tencent/ugc/decoder/g;->a(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;)Ljava/lang/Runnable;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->runOnWorkThread(Ljava/lang/Runnable;)V

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method public start(Ljava/lang/Object;Lcom/tencent/ugc/decoder/VideoDecoderListener;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/tencent/ugc/decoder/b;->a(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;Ljava/lang/Object;Lcom/tencent/ugc/decoder/VideoDecoderListener;)Ljava/lang/Runnable;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->runOnWorkThread(Ljava/lang/Runnable;)V

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method public stop()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/ugc/decoder/e;->a(Lcom/tencent/ugc/decoder/HardwareVideoDecoder;)Ljava/lang/Runnable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->runOnWorkThread(Ljava/lang/Runnable;)V

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public uninitialize()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mWorkHandler:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mTAG:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "uninitialize quitLooper"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder;->mWorkHandler:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/tencent/liteav/base/util/CustomHandler;->quitLooper()V

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
