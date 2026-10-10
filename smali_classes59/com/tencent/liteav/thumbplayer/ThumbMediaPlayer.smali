.class public Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;
.super Lcom/tencent/liteav/txcplayer/a;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcplayer/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TXSDKModuleLoader;,
        Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TRTCCloudClassInvokeHelper;
    }
.end annotation


# static fields
.field private static MODE_PHONE:I = 0x0

.field private static MODE_TV:I = 0x1

.field private static final THUMB_PLAYER_GUID:Ljava/lang/String; = "liteav_tbplayer_android_"

.field private static final THUMB_PLAYER_PLATFORM_ID:I = 0x238ebf

.field public static final synthetic a:I

.field private static volatile mSDKInited:Z


# instance fields
.field private final TAG:Ljava/lang/String;

.field private mBitrate:J

.field private mBitrateIndex:I

.field private mCachedBytes:J

.field private mConfig:Lcom/tencent/liteav/txcplayer/e;

.field private mContext:Landroid/content/Context;

.field private mDataSource:Ljava/lang/String;

.field private mEnableAccurateSeek:Z

.field private mHasReceiveFirstVideoRenderEvent:Z

.field private mIsLooping:Z

.field private mIsPlayerReleased:Z

.field private mIsSetDefaultBufferSize:Z

.field private mPrivateConfig:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mRate:F

.field private mReuseSurfaceTexture:Z

.field private mScreenOnWhilePlaying:Z

.field private mSurface:Landroid/view/Surface;

.field private mSurfaceHolder:Landroid/view/SurfaceHolder;

.field private mSurfaceTexture:Landroid/graphics/SurfaceTexture;

.field private mSurfaceTextureHost:Lcom/tencent/liteav/txcplayer/c;

.field private volatile mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

.field private mTcpSpeed:J

.field private mTotalFileSize:J

.field private mTrtcCloud:Ljava/lang/Object;

.field private mWakeLock:Landroid/os/PowerManager$WakeLock;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/liteav/txcplayer/a;-><init>()V

    .line 4
    .line 5
    const-class v0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->TAG:Ljava/lang/String;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mEnableAccurateSeek:Z

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    iput-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mWakeLock:Landroid/os/PowerManager$WakeLock;

    .line 18
    .line 19
    const/16 v2, -0x3e8

    .line 20
    .line 21
    iput v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    iput-wide v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mCachedBytes:J

    .line 26
    .line 27
    iput-wide v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrate:J

    .line 28
    .line 29
    iput-wide v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTcpSpeed:J

    .line 30
    .line 31
    iput-wide v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTotalFileSize:J

    .line 32
    .line 33
    iput-boolean v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mHasReceiveFirstVideoRenderEvent:Z

    .line 34
    .line 35
    iput-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mIsSetDefaultBufferSize:Z

    .line 38
    .line 39
    const-class v1, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 40
    monitor-enter v1

    .line 41
    .line 42
    :try_start_0
    sget-boolean v2, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSDKInited:Z

    .line 43
    .line 44
    if-nez v2, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setTPSystemInfo()V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setTPPLibCustomLoader()V

    .line 51
    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v3, "liteav_tbplayer_android_"

    .line 55
    .line 56
    .line 57
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    const v3, 0x238ebf

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMgr;->initSdk(Landroid/content/Context;Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMgr;->setDebugEnable(Z)V

    .line 78
    const/4 v2, 0x1

    .line 79
    .line 80
    sput-boolean v2, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSDKInited:Z

    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_1

    .line 84
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 87
    .line 88
    if-nez v1, :cond_1

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMgr;->setDebugEnable(Z)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerFactory;->createTPPlayer(Landroid/content/Context;)Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    iput-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 98
    .line 99
    new-instance v0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;-><init>(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayerListener;->attachToPlayer()V

    .line 106
    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v2, "[ITPPlayer:"

    .line 110
    .line 111
    .line 112
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 118
    move-result v2

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v2, "][ThumbMediaPlayerListener:"

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 130
    move-result v0

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v0, "], new ThumbMediaPlayer"

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    move-result-object v0

    .line 143
    .line 144
    .line 145
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 146
    .line 147
    :cond_1
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mContext:Landroid/content/Context;

    .line 148
    return-void

    .line 149
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 150
    throw p1
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
.end method

.method public static synthetic access$100(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    return-object p0
    .line 4
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
.end method

.method public static synthetic access$300(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 3
    return-object p0
    .line 4
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
.end method

.method private checkDlType()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    iget v0, v0, Lcom/tencent/liteav/txcplayer/e;->D:I

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x3

    .line 11
    .line 12
    if-eq v0, v2, :cond_4

    .line 13
    const/4 v2, 0x2

    .line 14
    .line 15
    if-eq v0, v2, :cond_3

    .line 16
    .line 17
    if-eq v0, v3, :cond_2

    .line 18
    const/4 v2, 0x4

    .line 19
    .line 20
    if-eq v0, v2, :cond_1

    .line 21
    return v1

    .line 22
    .line 23
    :cond_1
    const/16 v0, 0x13

    .line 24
    return v0

    .line 25
    .line 26
    :cond_2
    const/16 v0, 0xa

    .line 27
    return v0

    .line 28
    :cond_3
    const/4 v0, 0x5

    .line 29
    return v0

    .line 30
    :cond_4
    return v3
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
.end method

.method public static clearAllOnlineCache(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    const v0, 0x238ebf

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDownloadProxyFactory;->getTPDownloadProxy(I)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDLProxyInitParam;

    .line 18
    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v5, "liteav_tbplayer_android_"

    .line 22
    .line 23
    .line 24
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 28
    move-result-object v5

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    const-string v5, "1.0.0"

    .line 38
    .line 39
    .line 40
    invoke-direct {v3, v0, v5, v4, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDLProxyInitParam;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v2, p0, v3}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->init(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDLProxyInitParam;)I

    .line 44
    .line 45
    const/16 v5, 0x8

    .line 46
    .line 47
    const-wide/16 v6, -0x1

    .line 48
    .line 49
    const-string v4, ""

    .line 50
    move-object v3, p1

    .line 51
    .line 52
    .line 53
    invoke-interface/range {v2 .. v7}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->clearCache(Ljava/lang/String;Ljava/lang/String;IJ)I

    .line 54
    move-result p0

    .line 55
    .line 56
    if-nez p0, :cond_1

    .line 57
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_1
    return v1
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
.end method

.method private convertToTPSubtitleRenderModel(Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;)Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;-><init>()V

    .line 6
    .line 7
    iget v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->canvasHeight:I

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    iget v3, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->canvasWidth:I

    .line 13
    .line 14
    if-eqz v3, :cond_2

    .line 15
    .line 16
    iput v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->canvasWidth:I

    .line 17
    .line 18
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->canvasHeight:I

    .line 19
    .line 20
    iget-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 21
    .line 22
    const-wide/16 v5, 0x3

    .line 23
    or-long/2addr v5, v3

    .line 24
    .line 25
    iput-wide v5, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 26
    .line 27
    iget v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->fontSize:F

    .line 28
    .line 29
    cmpl-float v5, v1, v2

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->fontSize:F

    .line 34
    .line 35
    const-wide/16 v5, 0x7

    .line 36
    or-long/2addr v3, v5

    .line 37
    .line 38
    iput-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 39
    .line 40
    :cond_0
    iget v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->outlineWidth:F

    .line 41
    .line 42
    cmpl-float v3, v1, v2

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->outlineWidth:F

    .line 47
    .line 48
    iget-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 49
    .line 50
    const-wide/16 v5, 0x10

    .line 51
    or-long/2addr v3, v5

    .line 52
    .line 53
    iput-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 54
    .line 55
    :cond_1
    iget v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->lineSpace:F

    .line 56
    .line 57
    cmpl-float v3, v1, v2

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->lineSpace:F

    .line 62
    .line 63
    iget-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 64
    .line 65
    const-wide/16 v5, 0x40

    .line 66
    or-long/2addr v3, v5

    .line 67
    .line 68
    iput-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 69
    .line 70
    :cond_2
    iget v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->fontScale:F

    .line 71
    .line 72
    cmpl-float v3, v1, v2

    .line 73
    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->fontScale:F

    .line 77
    .line 78
    iget-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 79
    .line 80
    const-wide/16 v5, 0x800

    .line 81
    or-long/2addr v3, v5

    .line 82
    .line 83
    iput-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 84
    .line 85
    :cond_3
    iget-object v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->familyName:Ljava/lang/String;

    .line 86
    .line 87
    if-eqz v1, :cond_4

    .line 88
    .line 89
    iput-object v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->familyName:Ljava/lang/String;

    .line 90
    .line 91
    :cond_4
    iget v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->fontColor:I

    .line 92
    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->fontColor:I

    .line 96
    .line 97
    iget-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 98
    .line 99
    const-wide/16 v5, 0x8

    .line 100
    or-long/2addr v3, v5

    .line 101
    .line 102
    iput-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 103
    .line 104
    :cond_5
    iget-boolean v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->isBondFontStyle:Z

    .line 105
    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    iget v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->fontStyleFlags:I

    .line 109
    .line 110
    or-int/lit8 v1, v1, 0x1

    .line 111
    .line 112
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->fontStyleFlags:I

    .line 113
    .line 114
    iget-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 115
    .line 116
    const-wide/16 v5, 0x400

    .line 117
    or-long/2addr v3, v5

    .line 118
    .line 119
    iput-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 120
    .line 121
    :cond_6
    iget v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->outlineColor:I

    .line 122
    .line 123
    if-eqz v1, :cond_7

    .line 124
    .line 125
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->outlineColor:I

    .line 126
    .line 127
    iget-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 128
    .line 129
    const-wide/16 v5, 0x20

    .line 130
    or-long/2addr v3, v5

    .line 131
    .line 132
    iput-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 133
    .line 134
    :cond_7
    iget v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->startMargin:F

    .line 135
    .line 136
    cmpl-float v3, v1, v2

    .line 137
    .line 138
    if-eqz v3, :cond_8

    .line 139
    .line 140
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->lineSpace:F

    .line 141
    .line 142
    iget-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 143
    .line 144
    const-wide/16 v5, 0x80

    .line 145
    or-long/2addr v3, v5

    .line 146
    .line 147
    iput-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 148
    .line 149
    :cond_8
    iget v1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->endMargin:F

    .line 150
    .line 151
    cmpl-float v3, v1, v2

    .line 152
    .line 153
    if-eqz v3, :cond_9

    .line 154
    .line 155
    iput v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->endMargin:F

    .line 156
    .line 157
    iget-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 158
    .line 159
    const-wide/16 v5, 0x100

    .line 160
    or-long/2addr v3, v5

    .line 161
    .line 162
    iput-wide v3, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 163
    .line 164
    :cond_9
    iget p1, p1, Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;->verticalMargin:F

    .line 165
    .line 166
    cmpl-float v1, p1, v2

    .line 167
    .line 168
    if-eqz v1, :cond_a

    .line 169
    .line 170
    iput p1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->verticalMargin:F

    .line 171
    .line 172
    iget-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 173
    .line 174
    const-wide/16 v3, 0x200

    .line 175
    or-long/2addr v1, v3

    .line 176
    .line 177
    iput-wide v1, v0, Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;->paramFlags:J

    .line 178
    :cond_a
    return-object v0
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
.end method

.method private handleDRMAsset(Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mPrivateConfig:Ljava/util/Map;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    const-string v1, "TXC_DRM_ENABLE"

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mPrivateConfig:Ljava/util/Map;

    .line 25
    .line 26
    const-string v1, "TXC_DRM_KEY_URL"

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mPrivateConfig:Ljava/util/Map;

    .line 33
    .line 34
    const-string v2, "TXC_DRM_PROVISION_URL"

    .line 35
    .line 36
    .line 37
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    instance-of v2, v0, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    instance-of v2, v1, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 52
    move-result v2

    .line 53
    .line 54
    if-nez v2, :cond_0

    .line 55
    .line 56
    check-cast v1, Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    move-result v2

    .line 61
    .line 62
    if-nez v2, :cond_0

    .line 63
    const/4 v2, 0x0

    .line 64
    .line 65
    .line 66
    invoke-static {v2, p1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/TPMediaCompositionFactory;->createMediaDRMAsset(ILjava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaDRMAsset;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    const-string v2, "drm_property_provision_url"

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v2, v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaDRMAsset;->setDrmProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    const-string v1, "drm_property_license_url"

    .line 75
    .line 76
    .line 77
    invoke-interface {p1, v1, v0}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaDRMAsset;->setDrmProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    const-string v0, "drm_property_license_standardization"

    .line 80
    .line 81
    const-string v1, "1"

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaDRMAsset;->setDrmProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    return-object p1

    .line 86
    .line 87
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mPrivateConfig:Ljava/util/Map;

    .line 88
    .line 89
    const-string v0, "TXC_DRM_SIMPLE_AES_URL"

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    instance-of v0, p1, Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    check-cast p1, Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    move-result v0

    .line 104
    .line 105
    if-nez v0, :cond_1

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/TPMediaCompositionFactory;->createMediaUrlAsset(Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaUrlAsset;

    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :cond_1
    const/4 p1, 0x0

    .line 112
    return-object p1
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
.end method

.method private handleUrlAsset(Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaUrlAsset;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 3
    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    iget v1, v0, Lcom/tencent/liteav/txcplayer/e;->g:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-ne v1, v2, :cond_6

    .line 10
    .line 11
    iget v1, v0, Lcom/tencent/liteav/txcplayer/e;->r:I

    .line 12
    .line 13
    iget-wide v2, v0, Lcom/tencent/liteav/txcplayer/e;->v:J

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v2, v3}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->resolveAdaptivePreferredResolution(J)J

    .line 17
    move-result-wide v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->getConfig()Lcom/tencent/liteav/txcplayer/e;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iget-object v0, v0, Lcom/tencent/liteav/txcplayer/e;->E:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/TPMediaCompositionFactory;->createMediaUrlAsset(Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaUrlAsset;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/api/composition/TPMediaCompositionFactory;->createMediaAssetExtraParam()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetExtraParam;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    if-gtz v1, :cond_0

    .line 34
    .line 35
    const-wide/16 v6, 0x0

    .line 36
    .line 37
    cmp-long v6, v2, v6

    .line 38
    .line 39
    if-lez v6, :cond_4

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/api/composition/TPMediaCompositionFactory;->createMediaAssetOrderedMap()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetOrderedMap;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lcom/tencent/liteav/txcplayer/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    move-result v7

    .line 52
    .line 53
    if-nez v7, :cond_4

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 57
    move-result-object v7

    .line 58
    .line 59
    const-string v8, "m3u8"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 63
    move-result v7

    .line 64
    .line 65
    if-eqz v7, :cond_2

    .line 66
    .line 67
    if-lez v1, :cond_1

    .line 68
    .line 69
    const-string p1, "hls_track_bandwidth"

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-interface {v6, p1, v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetOrderedMap;->addKeyValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_1
    const-string p1, "hls_track_luma_samples"

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-interface {v6, p1, v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetOrderedMap;->addKeyValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    goto :goto_0

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    const-string/jumbo v7, "mpd"

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 98
    move-result p1

    .line 99
    .line 100
    if-eqz p1, :cond_4

    .line 101
    .line 102
    if-lez v1, :cond_3

    .line 103
    .line 104
    const-string p1, "dash_track_bandwidth"

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    .line 111
    invoke-interface {v6, p1, v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetOrderedMap;->addKeyValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    goto :goto_0

    .line 113
    .line 114
    :cond_3
    const-string p1, "dash_track_luma_samples"

    .line 115
    .line 116
    .line 117
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    .line 121
    invoke-interface {v6, p1, v1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetOrderedMap;->addKeyValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :goto_0
    const-string/jumbo p1, "preferred_video"

    .line 125
    .line 126
    .line 127
    invoke-interface {v5, p1, v6}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetExtraParam;->setExtraObject(Ljava/lang/String;Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetObjectParam;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 131
    move-result p1

    .line 132
    .line 133
    if-nez p1, :cond_5

    .line 134
    .line 135
    sget-object p1, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->h:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    .line 136
    .line 137
    .line 138
    invoke-static {p1}, Lcom/tencent/liteav/txcplayer/common/c;->a(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Z

    .line 139
    move-result p1

    .line 140
    .line 141
    if-eqz p1, :cond_5

    .line 142
    .line 143
    .line 144
    invoke-static {}, Lcom/tencent/thumbplayer/tcmedia/api/composition/TPMediaCompositionFactory;->createMediaAssetOrderedMap()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetOrderedMap;

    .line 145
    move-result-object p1

    .line 146
    .line 147
    const-string v1, "hls_track_name"

    .line 148
    .line 149
    .line 150
    invoke-interface {p1, v1, v0}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetOrderedMap;->addKeyValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const-string/jumbo v0, "preferred_audio"

    .line 154
    .line 155
    .line 156
    invoke-interface {v5, v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetExtraParam;->setExtraObject(Ljava/lang/String;Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetObjectParam;)V

    .line 157
    .line 158
    .line 159
    :cond_5
    invoke-interface {v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;->setExtraParam(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetExtraParam;)V

    .line 160
    return-object v4

    .line 161
    :cond_6
    const/4 p1, 0x0

    .line 162
    return-object p1
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
.end method

.method private innerLogE(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "["

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
    const-string v2, "], "

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    return-void
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

.method private innerLogI(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->TAG:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "["

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
    const-string v2, "], "

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    return-void
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

.method private isAssetFile(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    const-string v0, "asset://"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 23
    return p1
    .line 24
    .line 25
.end method

.method private isContentUri(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    const-string v0, "content://"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 23
    return p1
    .line 24
    .line 25
.end method

.method public static synthetic lambda$checkSubtitle$0(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->getTrackInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    array-length v1, v0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    array-length v2, v0

    .line 13
    .line 14
    if-ge v1, v2, :cond_2

    .line 15
    .line 16
    aget-object v2, v0, v1

    .line 17
    .line 18
    iget v3, v2, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->trackType:I

    .line 19
    const/4 v4, 0x3

    .line 20
    .line 21
    if-ne v3, v4, :cond_1

    .line 22
    .line 23
    iget-boolean v3, v2, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isInternal:Z

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    iget-boolean v2, v2, Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;->isSelected:Z

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->deselectTrack(I)V

    .line 33
    .line 34
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    :goto_1
    return-void
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

.method private parseExtraConfig(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_b

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_b

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    const-string v3, "USE_DOWNLOADER"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    move-result v3

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    instance-of v3, v2, Ljava/lang/Boolean;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    check-cast v2, Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    move-result v1

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->setP2PEnable(Z)V

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_1
    const-string v3, "USE_DRM_L3"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    move-result v3

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    instance-of v3, v2, Ljava/lang/Boolean;

    .line 67
    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 71
    .line 72
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 73
    .line 74
    .line 75
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 76
    .line 77
    check-cast v2, Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    move-result v2

    .line 82
    .line 83
    const/16 v4, 0x1fe

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v4, v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildBoolean(IZ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    .line 90
    invoke-interface {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 91
    goto :goto_0

    .line 92
    .line 93
    .line 94
    :cond_2
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 95
    move-result v3

    .line 96
    .line 97
    instance-of v4, v2, Ljava/lang/Boolean;

    .line 98
    .line 99
    if-eqz v4, :cond_3

    .line 100
    .line 101
    iget-object v4, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 102
    .line 103
    new-instance v5, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 104
    .line 105
    .line 106
    invoke-direct {v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 107
    .line 108
    check-cast v2, Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    move-result v2

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v3, v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildBoolean(IZ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    .line 119
    invoke-interface {v4, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 120
    goto :goto_0

    .line 121
    .line 122
    :cond_3
    instance-of v4, v2, Ljava/lang/Long;

    .line 123
    .line 124
    if-nez v4, :cond_9

    .line 125
    .line 126
    instance-of v4, v2, Ljava/lang/Integer;

    .line 127
    .line 128
    if-eqz v4, :cond_4

    .line 129
    goto :goto_3

    .line 130
    .line 131
    :cond_4
    instance-of v4, v2, Ljava/lang/Float;

    .line 132
    .line 133
    if-nez v4, :cond_7

    .line 134
    .line 135
    instance-of v4, v2, Ljava/lang/Double;

    .line 136
    .line 137
    if-eqz v4, :cond_5

    .line 138
    goto :goto_1

    .line 139
    .line 140
    :cond_5
    instance-of v4, v2, Ljava/lang/String;

    .line 141
    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    iget-object v4, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 145
    .line 146
    new-instance v5, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 147
    .line 148
    .line 149
    invoke-direct {v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 150
    .line 151
    check-cast v2, Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v3, v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildString(ILjava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 155
    move-result-object v2

    .line 156
    .line 157
    .line 158
    invoke-interface {v4, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_6
    iget-object v4, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 163
    .line 164
    new-instance v5, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 165
    .line 166
    .line 167
    invoke-direct {v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, v3, v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildObject(ILjava/lang/Object;)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 171
    move-result-object v2

    .line 172
    .line 173
    .line 174
    invoke-interface {v4, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_7
    :goto_1
    iget-object v4, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 179
    .line 180
    new-instance v5, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 181
    .line 182
    .line 183
    invoke-direct {v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 184
    .line 185
    instance-of v6, v2, Ljava/lang/Float;

    .line 186
    .line 187
    if-eqz v6, :cond_8

    .line 188
    .line 189
    check-cast v2, Ljava/lang/Float;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 193
    move-result v2

    .line 194
    goto :goto_2

    .line 195
    .line 196
    :cond_8
    check-cast v2, Ljava/lang/Double;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/lang/Double;->floatValue()F

    .line 200
    move-result v2

    .line 201
    .line 202
    .line 203
    :goto_2
    invoke-virtual {v5, v3, v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildFloat(IF)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 204
    move-result-object v2

    .line 205
    .line 206
    .line 207
    invoke-interface {v4, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_9
    :goto_3
    iget-object v4, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 212
    .line 213
    new-instance v5, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 214
    .line 215
    .line 216
    invoke-direct {v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 217
    .line 218
    instance-of v6, v2, Ljava/lang/Long;

    .line 219
    .line 220
    if-eqz v6, :cond_a

    .line 221
    .line 222
    check-cast v2, Ljava/lang/Long;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 226
    move-result-wide v6

    .line 227
    goto :goto_4

    .line 228
    .line 229
    :cond_a
    check-cast v2, Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/Integer;->longValue()J

    .line 233
    move-result-wide v6

    .line 234
    .line 235
    .line 236
    :goto_4
    invoke-virtual {v5, v3, v6, v7}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 237
    move-result-object v2

    .line 238
    .line 239
    .line 240
    invoke-interface {v4, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v3, "key "

    .line 247
    .line 248
    .line 249
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    const-string v1, " is not id!"

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    move-result-object v1

    .line 262
    .line 263
    .line 264
    invoke-direct {p0, v1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogE(Ljava/lang/String;)V

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    :cond_b
    :goto_5
    return-void
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
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method private resolveAdaptivePreferredResolution(J)J
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long v2, p1, v0

    .line 10
    .line 11
    if-gtz v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 14
    .line 15
    iget-wide v2, v2, Lcom/tencent/liteav/txcplayer/e;->t:J

    .line 16
    .line 17
    cmp-long v0, v2, v0

    .line 18
    .line 19
    if-lez v0, :cond_0

    .line 20
    return-wide v2

    .line 21
    :cond_0
    return-wide p1
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private setEnableMixExternalAudioFrame()V
    .locals 5

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "setEnableMixExternalAudioFrame"

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 9
    .line 10
    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 14
    .line 15
    const/16 v2, 0x194

    .line 16
    .line 17
    const-wide/16 v3, -0x1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2, v3, v4}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 25
    .line 26
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 27
    .line 28
    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 32
    .line 33
    const/16 v2, 0x78

    .line 34
    const/4 v3, 0x1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildBoolean(IZ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 42
    .line 43
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 44
    .line 45
    new-instance v1, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$2;

    .line 46
    .line 47
    .line 48
    invoke-direct {v1, p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$2;-><init>(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOnAudioFrameOutputListener(Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayerListener$IOnAudioFrameOutputListener;)V

    .line 52
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method private setMp4EncryptionInfo(Ljava/lang/String;Z)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/liteav/txcplayer/e;->u:I

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-ne v0, v1, :cond_5

    .line 8
    .line 9
    if-eqz p1, :cond_5

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-nez v0, :cond_5

    .line 16
    .line 17
    sget-object v0, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->h:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/tencent/liteav/txcplayer/common/c;->a(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {p1}, Lcom/tencent/liteav/txcplayer/a/a;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/c/a;->a()Lcom/tencent/liteav/txcvodplayer/c/a;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    iget-object v3, v2, Lcom/tencent/liteav/txcvodplayer/c/a;->b:Ljava/lang/Object;

    .line 36
    monitor-enter v3

    .line 37
    .line 38
    :try_start_0
    iget-object v2, v2, Lcom/tencent/liteav/txcvodplayer/c/a;->c:Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 42
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/c/a;->a()Lcom/tencent/liteav/txcvodplayer/c/a;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    const/16 v3, 0x29a

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3, v0}, Lcom/tencent/liteav/txcvodplayer/c/a;->a(ILjava/lang/String;)Lcom/tencent/liteav/txcvodplayer/b/c$b;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget-object v4, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->a:Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    move-result v4

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 v1, 0x0

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :cond_2
    :goto_0
    new-instance v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;

    .line 68
    .line 69
    .line 70
    invoke-direct {v2}, Lcom/tencent/liteav/txcvodplayer/b/c$b;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a()Ljava/lang/String;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    iput-object v4, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->a:Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a()Ljava/lang/String;

    .line 80
    move-result-object v4

    .line 81
    .line 82
    iput-object v4, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->b:Ljava/lang/String;

    .line 83
    .line 84
    :goto_1
    iget-object v4, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->c:Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 88
    move-result v4

    .line 89
    .line 90
    if-eqz v4, :cond_3

    .line 91
    .line 92
    iget-object v4, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->a:Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    invoke-static {v4}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    move-result-object v4

    .line 97
    .line 98
    iput-object v4, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->c:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v4, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->b:Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    invoke-static {v4}, Lcom/tencent/liteav/txcvodplayer/hlsencoder/TXCHLSEncoder;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    move-result-object v4

    .line 105
    .line 106
    iput-object v4, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->d:Ljava/lang/String;

    .line 107
    .line 108
    :cond_3
    iget-object v4, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->c:Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 112
    move-result v4

    .line 113
    .line 114
    if-nez v4, :cond_5

    .line 115
    .line 116
    iget-object v4, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->d:Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 120
    move-result v4

    .line 121
    .line 122
    if-nez v4, :cond_5

    .line 123
    .line 124
    iget-object v4, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 125
    .line 126
    new-instance v5, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 127
    .line 128
    .line 129
    invoke-direct {v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 130
    .line 131
    const/16 v6, 0xb8

    .line 132
    .line 133
    iget-object v7, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->a:Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v6, v7}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildString(ILjava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 137
    move-result-object v5

    .line 138
    .line 139
    .line 140
    invoke-interface {v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 141
    .line 142
    iget-object v4, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 143
    .line 144
    new-instance v5, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 145
    .line 146
    .line 147
    invoke-direct {v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 148
    .line 149
    const/16 v6, 0xb9

    .line 150
    .line 151
    iget-object v7, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->b:Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v6, v7}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildString(ILjava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 155
    move-result-object v5

    .line 156
    .line 157
    .line 158
    invoke-interface {v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 159
    .line 160
    iget-object v4, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 161
    .line 162
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/e;->h:Ljava/util/Map;

    .line 163
    .line 164
    if-nez v4, :cond_4

    .line 165
    .line 166
    new-instance v4, Ljava/util/HashMap;

    .line 167
    .line 168
    .line 169
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 170
    .line 171
    :cond_4
    const-string v5, "X-Request-CipheredOverlayKey"

    .line 172
    .line 173
    iget-object v6, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->c:Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    const-string v5, "X-Request-CipheredOverlayIV"

    .line 179
    .line 180
    iget-object v6, v2, Lcom/tencent/liteav/txcvodplayer/b/c$b;->d:Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    const-string v5, "X-Request-CipheredOverlayVersion"

    .line 186
    .line 187
    .line 188
    const-string/jumbo v6, "v2"

    .line 189
    .line 190
    .line 191
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    iget-object v5, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 194
    .line 195
    iput-object v4, v5, Lcom/tencent/liteav/txcplayer/e;->h:Ljava/util/Map;

    .line 196
    .line 197
    if-eqz v1, :cond_5

    .line 198
    .line 199
    if-eqz p2, :cond_5

    .line 200
    .line 201
    .line 202
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/c/a;->a()Lcom/tencent/liteav/txcvodplayer/c/a;

    .line 203
    move-result-object p2

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2, v3, v0, v2, p1}, Lcom/tencent/liteav/txcvodplayer/c/a;->a(ILjava/lang/String;Lcom/tencent/liteav/txcvodplayer/b/c$b;Ljava/lang/String;)V

    .line 207
    return-void

    .line 208
    :catchall_0
    move-exception p1

    .line 209
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    throw p1

    .line 211
    :cond_5
    :goto_2
    return-void
    .line 212
    .line 213
    .line 214
.end method

.method private setSurfaceToPlayer(Landroid/view/Surface;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setSurface(Landroid/view/Surface;)V

    .line 11
    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string/jumbo v0, "setSurfaceToPlayer: "

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 31
    return-void
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

.method private setTPPLibCustomLoader()V
    .locals 3

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/tencent/liteav/base/util/SoLoader;->getLibraryPath()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TXSDKModuleLoader;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TXSDKModuleLoader;-><init>(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$1;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMgr;->setLibLoader(Lcom/tencent/thumbplayer/tcmedia/api/ITPModuleLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void

    .line 24
    .line 25
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string/jumbo v2, "setTPPLibCustomLoader, ex = "

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogE(Ljava/lang/String;)V

    .line 46
    return-void
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
.end method

.method private setTPSystemInfo()V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "ro.product.model"

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getModel()Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v0, "ro.product.manufacturer"

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getManufacturer()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string/jumbo v0, "ro.build.version.release"

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersion()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string/jumbo v0, "ro.product.board"

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getBoard()Ljava/lang/String;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/core/common/TPSystemInfo;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    return-void
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
.end method

.method private setVideoInfo(Ljava/lang/String;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_6

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 11
    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoInfo$Builder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoInfo$Builder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->checkDlType()I

    .line 21
    move-result v1

    .line 22
    .line 23
    new-instance v2, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, v1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/tencent/liteav/txcplayer/a/a;->f(Ljava/lang/String;)Z

    .line 30
    move-result v3

    .line 31
    const/4 v4, 0x3

    .line 32
    .line 33
    const/16 v5, 0xa

    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lcom/tencent/liteav/txcplayer/a/a;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    const-string v3, ".mp4"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 49
    move-result v3

    .line 50
    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v5}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->setDlType(I)V

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :cond_1
    const-string v3, "?"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 61
    move-result v3

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    const/16 v3, 0x2f

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 71
    move-result v8

    .line 72
    add-int/2addr v8, v6

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 76
    move-result-object v8

    .line 77
    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    const-string v9, "hls"

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 84
    move-result v9

    .line 85
    .line 86
    if-eqz v9, :cond_2

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v4}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->setDlType(I)V

    .line 90
    goto :goto_0

    .line 91
    .line 92
    .line 93
    :cond_2
    const-string/jumbo v9, "mp4"

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 97
    move-result v9

    .line 98
    .line 99
    if-eqz v9, :cond_3

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v5}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->setDlType(I)V

    .line 103
    .line 104
    .line 105
    :cond_3
    :goto_0
    const v5, 0x238ebf

    .line 106
    .line 107
    .line 108
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDownloadProxyFactory;->getTPDownloadProxy(I)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;

    .line 109
    move-result-object v5

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 113
    move-result v3

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    .line 120
    invoke-interface {v5, p1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->updateStoragePath(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v6}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->setOffline(Z)V

    .line 124
    move-object p1, v8

    .line 125
    .line 126
    .line 127
    :cond_4
    :goto_1
    invoke-virtual {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoInfo$Builder;->fileId(Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/TPVideoInfo$Builder;

    .line 128
    .line 129
    if-nez v1, :cond_5

    .line 130
    .line 131
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 132
    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    iget-boolean v1, v1, Lcom/tencent/liteav/txcplayer/e;->z:Z

    .line 136
    .line 137
    if-eqz v1, :cond_5

    .line 138
    .line 139
    const-string v1, ".hls"

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 143
    move-result p1

    .line 144
    .line 145
    if-eqz p1, :cond_5

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->setDlType(I)V

    .line 149
    .line 150
    :cond_5
    new-instance p1, Ljava/util/HashMap;

    .line 151
    .line 152
    .line 153
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 154
    .line 155
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 156
    .line 157
    iget v3, v1, Lcom/tencent/liteav/txcplayer/e;->n:F

    .line 158
    const/4 v4, 0x0

    .line 159
    .line 160
    cmpl-float v5, v3, v4

    .line 161
    .line 162
    const/high16 v8, 0x44800000    # 1024.0f

    .line 163
    .line 164
    if-lez v5, :cond_6

    .line 165
    .line 166
    iget-boolean v5, v1, Lcom/tencent/liteav/txcplayer/e;->p:Z

    .line 167
    .line 168
    if-nez v5, :cond_6

    .line 169
    :goto_2
    mul-float/2addr v3, v8

    .line 170
    mul-float/2addr v3, v8

    .line 171
    float-to-long v3, v3

    .line 172
    goto :goto_3

    .line 173
    .line 174
    :cond_6
    iget v3, v1, Lcom/tencent/liteav/txcplayer/e;->m:F

    .line 175
    .line 176
    cmpl-float v4, v3, v4

    .line 177
    .line 178
    if-lez v4, :cond_7

    .line 179
    goto :goto_2

    .line 180
    .line 181
    :cond_7
    const-wide/16 v3, -0x1

    .line 182
    .line 183
    :goto_3
    const-wide/16 v8, 0x0

    .line 184
    .line 185
    cmp-long v5, v3, v8

    .line 186
    .line 187
    const-string v10, "dl_param_buffer_size"

    .line 188
    .line 189
    if-ltz v5, :cond_8

    .line 190
    .line 191
    .line 192
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 193
    move-result-object v1

    .line 194
    .line 195
    .line 196
    invoke-interface {p1, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    goto :goto_4

    .line 198
    .line 199
    :cond_8
    iget-boolean v1, v1, Lcom/tencent/liteav/txcplayer/e;->p:Z

    .line 200
    .line 201
    if-nez v1, :cond_9

    .line 202
    .line 203
    const/high16 v1, 0x500000

    .line 204
    .line 205
    .line 206
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    move-result-object v1

    .line 208
    .line 209
    .line 210
    invoke-interface {p1, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    iput-boolean v6, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mIsSetDefaultBufferSize:Z

    .line 213
    goto :goto_4

    .line 214
    .line 215
    .line 216
    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    move-result-object v1

    .line 218
    .line 219
    .line 220
    invoke-interface {p1, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    :goto_4
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 223
    .line 224
    iget v1, v1, Lcom/tencent/liteav/txcplayer/e;->s:I

    .line 225
    .line 226
    const-string v3, "dl_param_preferred_bitrate_index"

    .line 227
    .line 228
    const/16 v4, -0x3e8

    .line 229
    .line 230
    if-eq v1, v4, :cond_a

    .line 231
    .line 232
    .line 233
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    move-result-object v1

    .line 235
    .line 236
    .line 237
    invoke-interface {p1, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    goto :goto_5

    .line 239
    .line 240
    :cond_a
    iget v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 241
    .line 242
    if-eq v1, v4, :cond_b

    .line 243
    .line 244
    .line 245
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    move-result-object v1

    .line 247
    .line 248
    .line 249
    invoke-interface {p1, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    :cond_b
    :goto_5
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 252
    .line 253
    iget-wide v3, v1, Lcom/tencent/liteav/txcplayer/e;->v:J

    .line 254
    .line 255
    cmp-long v1, v3, v8

    .line 256
    .line 257
    if-lez v1, :cond_c

    .line 258
    .line 259
    .line 260
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 261
    move-result-object v1

    .line 262
    .line 263
    const-string v3, "dl_param_preferred_resolution"

    .line 264
    .line 265
    .line 266
    invoke-interface {p1, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    :cond_c
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 269
    .line 270
    iget v1, v1, Lcom/tencent/liteav/txcplayer/e;->u:I

    .line 271
    const/4 v3, 0x2

    .line 272
    .line 273
    if-ne v1, v3, :cond_d

    .line 274
    .line 275
    sget-object v1, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->h:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    .line 276
    .line 277
    .line 278
    invoke-static {v1}, Lcom/tencent/liteav/txcplayer/common/c;->a(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Z

    .line 279
    move-result v1

    .line 280
    .line 281
    if-eqz v1, :cond_d

    .line 282
    .line 283
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 284
    .line 285
    const-string v3, "dl_param_cache_need_encrypt"

    .line 286
    .line 287
    .line 288
    invoke-interface {p1, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    :cond_d
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 291
    .line 292
    iget-object v1, v1, Lcom/tencent/liteav/txcplayer/e;->E:Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 296
    move-result v1

    .line 297
    .line 298
    if-nez v1, :cond_e

    .line 299
    .line 300
    sget-object v1, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->h:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    .line 301
    .line 302
    .line 303
    invoke-static {v1}, Lcom/tencent/liteav/txcplayer/common/c;->a(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Z

    .line 304
    move-result v1

    .line 305
    .line 306
    if-eqz v1, :cond_e

    .line 307
    .line 308
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 309
    .line 310
    iget-object v1, v1, Lcom/tencent/liteav/txcplayer/e;->E:Ljava/lang/String;

    .line 311
    .line 312
    const-string v3, "dl_param_preferred_audio_track"

    .line 313
    .line 314
    .line 315
    invoke-interface {p1, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    :cond_e
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 319
    move-result v1

    .line 320
    .line 321
    if-lez v1, :cond_f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->setExtInfoMap(Ljava/util/Map;)V

    .line 325
    .line 326
    .line 327
    :cond_f
    invoke-virtual {v0, v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoInfo$Builder;->downloadParam(Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;)Lcom/tencent/thumbplayer/tcmedia/api/TPVideoInfo$Builder;

    .line 328
    .line 329
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0}, Lcom/tencent/thumbplayer/tcmedia/api/TPVideoInfo$Builder;->build()Lcom/tencent/thumbplayer/tcmedia/api/TPVideoInfo;

    .line 333
    move-result-object v0

    .line 334
    .line 335
    .line 336
    invoke-interface {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setVideoInfo(Lcom/tencent/thumbplayer/tcmedia/api/TPVideoInfo;)V

    .line 337
    :cond_10
    :goto_6
    return-void
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
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method


# virtual methods
.method public addSubtitleSource(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p3, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->addSubtitleSource(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    return-void
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
.end method

.method public attachTRTC(Ljava/lang/Object;)V
    .locals 3

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    const-string v0, "enableMixExternalAudioFrame"

    .line 11
    .line 12
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 23
    .line 24
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    const-string p1, "attachTRTC enableMixExternalAudioFrame"

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setEnableMixExternalAudioFrame()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    return-void

    .line 43
    :catch_0
    move-exception p1

    .line 44
    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, "attachTRTC exception : "

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogE(Ljava/lang/String;)V

    .line 65
    :cond_0
    return-void
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

.method public checkSubtitle()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/a;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$$Lambda$1;->lambdaFactory$(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)Ljava/lang/Runnable;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public deselectTrack(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    int-to-long v1, p1

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->deselectTrack(IJ)V

    .line 7
    return-void
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
.end method

.method public detachTRTC()V
    .locals 3

    .line 1
    .line 2
    const-string v0, "detachTRTC"

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    const-string v1, "enableMixExternalAudioFrame"

    .line 16
    .line 17
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    filled-new-array {v2, v2}, [Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v2, "detachTRTC exception : "

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogE(Ljava/lang/String;)V

    .line 60
    :goto_0
    const/4 v0, 0x0

    .line 61
    .line 62
    iput-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TRTCCloudClassInvokeHelper;->access$202(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TRTCCloudClassInvokeHelper;)Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$TRTCCloudClassInvokeHelper;

    .line 66
    :cond_0
    return-void
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
.end method

.method public enableAdaptiveBitrate()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 8
    .line 9
    const/16 v2, 0x1f8

    .line 10
    .line 11
    const-wide/16 v3, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2, v3, v4}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 19
    const/4 v0, -0x1

    .line 20
    .line 21
    iput v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

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
.end method

.method public getBitrateIndex()I
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getProgramInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    array-length v1, v0

    .line 16
    .line 17
    if-lez v1, :cond_2

    .line 18
    array-length v1, v0

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    :goto_0
    if-ge v2, v1, :cond_2

    .line 22
    .line 23
    aget-object v3, v0, v2

    .line 24
    .line 25
    iget-boolean v4, v3, Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;->actived:Z

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    iget-object v4, v3, Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;->resolution:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    move-result v4

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    iget v0, v3, Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;->programId:I

    .line 38
    .line 39
    iput v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 40
    goto :goto_1

    .line 41
    .line 42
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_2
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, "getBitrateIndex \uff1a"

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    iget v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 63
    .line 64
    iget v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 65
    return v0
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
.end method

.method public getConfig()Lcom/tencent/liteav/txcplayer/e;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public getCurrentPosition()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getCurrentPositionMs()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
.end method

.method public getDuration()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mIsPlayerReleased:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getDurationMs()J

    .line 12
    move-result-wide v0

    .line 13
    return-wide v0

    .line 14
    .line 15
    :cond_0
    const-wide/16 v0, 0x0

    .line 16
    return-wide v0
    .line 17
.end method

.method public getMediaInfo()Lcom/tencent/liteav/txcplayer/model/b;
    .locals 8

    .line 1
    .line 2
    const-string v0, "getMediaInfo"

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/tencent/liteav/txcplayer/model/b;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/tencent/liteav/txcplayer/model/b;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "thumbplayer"

    .line 14
    .line 15
    iput-object v1, v0, Lcom/tencent/liteav/txcplayer/model/b;->a:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Lcom/tencent/liteav/txcplayer/model/c;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Lcom/tencent/liteav/txcplayer/model/c;-><init>()V

    .line 21
    .line 22
    iput-object v1, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getPropertyString(I)Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    if-eqz v1, :cond_b

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 35
    move-result v3

    .line 36
    .line 37
    if-lez v3, :cond_b

    .line 38
    .line 39
    const-string v3, "\\n"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    if-eqz v1, :cond_b

    .line 46
    array-length v3, v1

    .line 47
    .line 48
    if-lez v3, :cond_b

    .line 49
    .line 50
    iget-object v3, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->getSupportedBitrates()Ljava/util/ArrayList;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    iput-object v4, v3, Lcom/tencent/liteav/txcplayer/model/c;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    iget v3, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 59
    .line 60
    const/16 v4, -0x3e8

    .line 61
    .line 62
    if-ne v3, v4, :cond_0

    .line 63
    move v3, v2

    .line 64
    .line 65
    :cond_0
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 66
    .line 67
    new-instance v5, Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 68
    .line 69
    .line 70
    invoke-direct {v5, v3}, Lcom/tencent/liteav/txcplayer/model/c$a;-><init>(I)V

    .line 71
    .line 72
    iput-object v5, v4, Lcom/tencent/liteav/txcplayer/model/c;->e:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 73
    .line 74
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 75
    .line 76
    new-instance v5, Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 77
    .line 78
    .line 79
    invoke-direct {v5, v3}, Lcom/tencent/liteav/txcplayer/model/c$a;-><init>(I)V

    .line 80
    .line 81
    iput-object v5, v4, Lcom/tencent/liteav/txcplayer/model/c;->d:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 82
    .line 83
    iget-object v3, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 84
    .line 85
    iget-object v4, v3, Lcom/tencent/liteav/txcplayer/model/c;->c:Ljava/util/ArrayList;

    .line 86
    .line 87
    iget-object v3, v3, Lcom/tencent/liteav/txcplayer/model/c;->e:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    iget-object v3, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 93
    .line 94
    iget-object v4, v3, Lcom/tencent/liteav/txcplayer/model/c;->c:Ljava/util/ArrayList;

    .line 95
    .line 96
    iget-object v3, v3, Lcom/tencent/liteav/txcplayer/model/c;->d:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    array-length v3, v1

    .line 101
    .line 102
    :goto_0
    if-ge v2, v3, :cond_b

    .line 103
    .line 104
    aget-object v4, v1, v2

    .line 105
    .line 106
    if-eqz v4, :cond_a

    .line 107
    .line 108
    const-string v5, "="

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 112
    move-result v5

    .line 113
    .line 114
    add-int/lit8 v5, v5, 0x1

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 118
    move-result v6

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 122
    move-result-object v5

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 126
    move-result-object v5

    .line 127
    .line 128
    const-string v6, "ContainerFormat="

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 132
    move-result v6

    .line 133
    .line 134
    if-eqz v6, :cond_1

    .line 135
    .line 136
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 137
    .line 138
    iput-object v5, v4, Lcom/tencent/liteav/txcplayer/model/c;->a:Ljava/lang/String;

    .line 139
    .line 140
    goto/16 :goto_1

    .line 141
    .line 142
    :cond_1
    const-string v6, "VideoCodec="

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 146
    move-result v6

    .line 147
    .line 148
    const-string v7, "avcodec"

    .line 149
    .line 150
    if-eqz v6, :cond_2

    .line 151
    .line 152
    iput-object v7, v0, Lcom/tencent/liteav/txcplayer/model/b;->b:Ljava/lang/String;

    .line 153
    .line 154
    iput-object v5, v0, Lcom/tencent/liteav/txcplayer/model/b;->c:Ljava/lang/String;

    .line 155
    .line 156
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 157
    .line 158
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/model/c;->d:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 159
    .line 160
    iput-object v5, v4, Lcom/tencent/liteav/txcplayer/model/c$a;->b:Ljava/lang/String;

    .line 161
    .line 162
    goto/16 :goto_1

    .line 163
    .line 164
    :cond_2
    const-string v6, "VideoProfile="

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 168
    move-result v6

    .line 169
    .line 170
    if-eqz v6, :cond_3

    .line 171
    .line 172
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 173
    .line 174
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/model/c;->d:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 175
    .line 176
    iput-object v5, v4, Lcom/tencent/liteav/txcplayer/model/c$a;->c:Ljava/lang/String;

    .line 177
    .line 178
    goto/16 :goto_1

    .line 179
    .line 180
    :cond_3
    const-string v6, "Width="

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 184
    move-result v6

    .line 185
    .line 186
    if-eqz v6, :cond_4

    .line 187
    .line 188
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 189
    .line 190
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/model/c;->d:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 191
    .line 192
    .line 193
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 194
    move-result-object v5

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 198
    move-result v5

    .line 199
    .line 200
    iput v5, v4, Lcom/tencent/liteav/txcplayer/model/c$a;->e:I

    .line 201
    .line 202
    goto/16 :goto_1

    .line 203
    .line 204
    :cond_4
    const-string v6, "Height="

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 208
    move-result v6

    .line 209
    .line 210
    if-eqz v6, :cond_5

    .line 211
    .line 212
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 213
    .line 214
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/model/c;->d:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 215
    .line 216
    .line 217
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 218
    move-result-object v5

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 222
    move-result v5

    .line 223
    .line 224
    iput v5, v4, Lcom/tencent/liteav/txcplayer/model/c$a;->f:I

    .line 225
    goto :goto_1

    .line 226
    .line 227
    :cond_5
    const-string v6, "VideoBitRate="

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 231
    move-result v6

    .line 232
    .line 233
    if-eqz v6, :cond_6

    .line 234
    .line 235
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 236
    .line 237
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/model/c;->d:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 238
    .line 239
    .line 240
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 241
    move-result-object v5

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 245
    move-result v5

    .line 246
    int-to-long v5, v5

    .line 247
    .line 248
    iput-wide v5, v4, Lcom/tencent/liteav/txcplayer/model/c$a;->d:J

    .line 249
    goto :goto_1

    .line 250
    .line 251
    :cond_6
    const-string v6, "AudioCodec="

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 255
    move-result v6

    .line 256
    .line 257
    if-eqz v6, :cond_7

    .line 258
    .line 259
    iput-object v7, v0, Lcom/tencent/liteav/txcplayer/model/b;->d:Ljava/lang/String;

    .line 260
    .line 261
    iput-object v5, v0, Lcom/tencent/liteav/txcplayer/model/b;->e:Ljava/lang/String;

    .line 262
    .line 263
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 264
    .line 265
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/model/c;->e:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 266
    .line 267
    iput-object v5, v4, Lcom/tencent/liteav/txcplayer/model/c$a;->b:Ljava/lang/String;

    .line 268
    goto :goto_1

    .line 269
    .line 270
    :cond_7
    const-string v6, "AudioProfile="

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 274
    move-result v6

    .line 275
    .line 276
    if-eqz v6, :cond_8

    .line 277
    .line 278
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 279
    .line 280
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/model/c;->e:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 281
    .line 282
    iput-object v5, v4, Lcom/tencent/liteav/txcplayer/model/c$a;->c:Ljava/lang/String;

    .line 283
    goto :goto_1

    .line 284
    .line 285
    :cond_8
    const-string v6, "AudioBitRate="

    .line 286
    .line 287
    .line 288
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 289
    move-result v6

    .line 290
    .line 291
    if-eqz v6, :cond_9

    .line 292
    .line 293
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 294
    .line 295
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/model/c;->e:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 296
    .line 297
    .line 298
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 299
    move-result-object v5

    .line 300
    .line 301
    .line 302
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 303
    move-result v5

    .line 304
    int-to-long v5, v5

    .line 305
    .line 306
    iput-wide v5, v4, Lcom/tencent/liteav/txcplayer/model/c$a;->d:J

    .line 307
    goto :goto_1

    .line 308
    .line 309
    :cond_9
    const-string v6, "SampleRate="

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 313
    move-result v4

    .line 314
    .line 315
    if-eqz v4, :cond_a

    .line 316
    .line 317
    iget-object v4, v0, Lcom/tencent/liteav/txcplayer/model/b;->f:Lcom/tencent/liteav/txcplayer/model/c;

    .line 318
    .line 319
    iget-object v4, v4, Lcom/tencent/liteav/txcplayer/model/c;->e:Lcom/tencent/liteav/txcplayer/model/c$a;

    .line 320
    .line 321
    .line 322
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 323
    move-result-object v5

    .line 324
    .line 325
    .line 326
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 327
    move-result v5

    .line 328
    .line 329
    iput v5, v4, Lcom/tencent/liteav/txcplayer/model/c$a;->g:I

    .line 330
    .line 331
    :cond_a
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 332
    .line 333
    goto/16 :goto_0

    .line 334
    :cond_b
    return-object v0
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
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public getPdtTimeMs(J)J
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getPdtTimeMs(J)J

    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
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
.end method

.method public getPlayableDurationMs()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getPlayableDurationMs()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
.end method

.method public getPositionMs(J)J
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getPositionMs(J)J

    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
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
.end method

.method public getPropertyLong(I)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xd0

    .line 3
    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/16 v0, 0xd1

    .line 7
    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    packed-switch p1, :pswitch_data_1

    .line 15
    .line 16
    .line 17
    packed-switch p1, :pswitch_data_2

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :pswitch_0
    iget-wide v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTcpSpeed:J

    .line 21
    return-wide v0

    .line 22
    .line 23
    :pswitch_1
    iget-wide v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrate:J

    .line 24
    .line 25
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getPlayableDurationMs()J

    .line 29
    move-result-wide v2

    .line 30
    .line 31
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getCurrentPositionMs()J

    .line 35
    move-result-wide v4

    .line 36
    sub-long/2addr v2, v4

    .line 37
    mul-long/2addr v0, v2

    .line 38
    .line 39
    const-wide/16 v2, 0x3e8

    .line 40
    div-long/2addr v0, v2

    .line 41
    .line 42
    const-wide/16 v2, 0x8

    .line 43
    div-long/2addr v0, v2

    .line 44
    .line 45
    const-wide/16 v2, 0x0

    .line 46
    .line 47
    cmp-long p1, v0, v2

    .line 48
    .line 49
    if-gez p1, :cond_0

    .line 50
    return-wide v2

    .line 51
    :cond_0
    return-wide v0

    .line 52
    .line 53
    :pswitch_2
    iget-wide v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrate:J

    .line 54
    return-wide v0

    .line 55
    .line 56
    :pswitch_3
    const/16 p1, 0xce

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :pswitch_4
    const/16 p1, 0xcd

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :pswitch_5
    const/16 p1, 0xcc

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :pswitch_6
    const/16 p1, 0xcb

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :pswitch_7
    const/16 p1, 0xca

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :pswitch_8
    const/16 p1, 0xc9

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :pswitch_9
    const/16 p1, 0x67

    .line 75
    goto :goto_0

    .line 76
    .line 77
    :pswitch_a
    const/16 p1, 0x66

    .line 78
    goto :goto_0

    .line 79
    .line 80
    :pswitch_b
    const/16 p1, 0x65

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :pswitch_c
    const/16 p1, 0x64

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move p1, v0

    .line 86
    .line 87
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getPropertyLong(I)J

    .line 91
    move-result-wide v0

    .line 92
    return-wide v0

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
    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0xc9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x12d
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public getRate()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mRate:F

    .line 3
    return v0
    .line 4
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
.end method

.method public getSupportedBitrates()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/liteav/txcplayer/model/a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getProgramInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_5

    .line 9
    array-length v1, v0

    .line 10
    .line 11
    if-lez v1, :cond_5

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    array-length v2, v0

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    array-length v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    .line 22
    :goto_0
    if-ge v4, v2, :cond_6

    .line 23
    .line 24
    aget-object v5, v0, v4

    .line 25
    .line 26
    if-eqz v5, :cond_4

    .line 27
    .line 28
    new-instance v6, Lcom/tencent/liteav/txcplayer/model/a;

    .line 29
    .line 30
    .line 31
    invoke-direct {v6}, Lcom/tencent/liteav/txcplayer/model/a;-><init>()V

    .line 32
    .line 33
    iget-object v7, v5, Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;->resolution:Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    const-string/jumbo v8, "x"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 40
    move-result-object v7

    .line 41
    .line 42
    if-eqz v7, :cond_0

    .line 43
    array-length v8, v7

    .line 44
    const/4 v9, 0x2

    .line 45
    .line 46
    if-ne v8, v9, :cond_0

    .line 47
    .line 48
    aget-object v8, v7, v3

    .line 49
    .line 50
    .line 51
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 52
    move-result-object v8

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 56
    move-result v8

    .line 57
    .line 58
    iput v8, v6, Lcom/tencent/liteav/txcplayer/model/a;->b:I

    .line 59
    const/4 v8, 0x1

    .line 60
    .line 61
    aget-object v7, v7, v8

    .line 62
    .line 63
    .line 64
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 65
    move-result-object v7

    .line 66
    .line 67
    .line 68
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 69
    move-result v7

    .line 70
    .line 71
    iput v7, v6, Lcom/tencent/liteav/txcplayer/model/a;->c:I

    .line 72
    .line 73
    :cond_0
    iget-wide v7, v5, Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;->bandwidth:J

    .line 74
    long-to-int v7, v7

    .line 75
    .line 76
    iput v7, v6, Lcom/tencent/liteav/txcplayer/model/a;->d:I

    .line 77
    .line 78
    iget v8, v5, Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;->programId:I

    .line 79
    .line 80
    iput v8, v6, Lcom/tencent/liteav/txcplayer/model/a;->a:I

    .line 81
    .line 82
    iget-boolean v5, v5, Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;->actived:Z

    .line 83
    .line 84
    if-eqz v5, :cond_1

    .line 85
    int-to-long v8, v7

    .line 86
    .line 87
    iput-wide v8, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrate:J

    .line 88
    .line 89
    :cond_1
    iget v5, v6, Lcom/tencent/liteav/txcplayer/model/a;->b:I

    .line 90
    .line 91
    if-eqz v5, :cond_2

    .line 92
    .line 93
    iget v5, v6, Lcom/tencent/liteav/txcplayer/model/a;->c:I

    .line 94
    .line 95
    if-nez v5, :cond_3

    .line 96
    .line 97
    :cond_2
    if-eqz v7, :cond_4

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    new-instance v5, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v7, "getSupportedBitrates item index\uff1a"

    .line 105
    .line 106
    .line 107
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    iget v7, v6, Lcom/tencent/liteav/txcplayer/model/a;->a:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v7, ":width:"

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    iget v7, v6, Lcom/tencent/liteav/txcplayer/model/a;->b:I

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v7, ":height:"

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    iget v7, v6, Lcom/tencent/liteav/txcplayer/model/a;->c:I

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v7, ":bitrate:"

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    iget v6, v6, Lcom/tencent/liteav/txcplayer/model/a;->d:I

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    move-result-object v5

    .line 147
    .line 148
    .line 149
    invoke-direct {p0, v5}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 150
    .line 151
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    :cond_5
    const/4 v1, 0x0

    .line 155
    .line 156
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v2, "mBitrateIndex:"

    .line 159
    .line 160
    .line 161
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    iget v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v2, ":mBitrate:"

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    iget-wide v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrate:J

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    move-result-object v0

    .line 181
    .line 182
    .line 183
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 184
    return-object v1
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
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "getSurface\uff1a"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 22
    return-object v0
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
.end method

.method public getSurfaceTexture()Landroid/graphics/SurfaceTexture;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public getTPPPlayer()Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public getTrackInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getTrackInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPTrackInfo;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public getVideoHeight()I
    .locals 1

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getVideoHeight()I

    .line 6
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    return v0

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    const/4 v0, 0x0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getVideoSarDen()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
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
.end method

.method public getVideoSarNum()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
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
.end method

.method public getVideoWidth()I
    .locals 1

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getVideoWidth()I

    .line 6
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    return v0

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    const/4 v0, 0x0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public isLooping()Z
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "isLooping \uff1a"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mIsLooping:Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mIsLooping:Z

    .line 22
    return v0
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
.end method

.method public isPlayable()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
    .line 4
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
.end method

.method public isPlaying()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 4
    .line 5
    .line 6
    invoke-interface {v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getCurrentState()I

    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    const/4 v2, 0x5

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    :cond_0
    return v0

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    return v0
.end method

.method public onReceiveFirstPacketReadEvent()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    const/16 v2, 0x7e1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v2, v0, v0, v1}, Lcom/tencent/liteav/txcplayer/a;->notifyOnInfo(IIILjava/lang/Object;)Z

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
.end method

.method public onReceiveFirstVideoRenderEvent()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/liteav/txcplayer/a;->getTXCVodVideoViewTargetState()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->getConfig()Lcom/tencent/liteav/txcplayer/e;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-boolean v0, v0, Lcom/tencent/liteav/txcplayer/e;->p:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getCurrentState()I

    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x5

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    :cond_0
    const/16 v0, 0x7ea

    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0, v1, v1, v2}, Lcom/tencent/liteav/txcplayer/a;->notifyOnInfo(IIILjava/lang/Object;)Z

    .line 32
    .line 33
    const/16 v0, 0x7d3

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0, v1, v1, v2}, Lcom/tencent/liteav/txcplayer/a;->notifyOnInfo(IIILjava/lang/Object;)Z

    .line 37
    .line 38
    iput-boolean v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mHasReceiveFirstVideoRenderEvent:Z

    .line 39
    return-void

    .line 40
    :cond_1
    const/4 v0, 0x1

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mHasReceiveFirstVideoRenderEvent:Z

    .line 43
    return-void
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
.end method

.method public pause()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->pause()V

    .line 6
    return-void
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
.end method

.method public prepareAsync()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    :try_start_0
    const-string/jumbo v0, "prepareAsync"

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->prepareAsync()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    .line 18
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    throw v1
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
.end method

.method public publishAudioToNetwork()V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "publishAudioToNetwork"

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const-string v1, "enableMixExternalAudioFrame"

    .line 17
    .line 18
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    filled-new-array {v2, v2}, [Ljava/lang/Object;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return-void

    .line 39
    :catch_0
    move-exception v0

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string/jumbo v2, "publishAudioToNetwork exception : "

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogE(Ljava/lang/String;)V

    .line 62
    :cond_0
    return-void
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
.end method

.method public release()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mIsPlayerReleased:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->releaseSurfaceTexture()V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setSurface(Landroid/view/Surface;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->detachTRTC()V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/a;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    new-instance v1, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer$1;-><init>(Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

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
.end method

.method public releaseSurfaceTexture()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mReuseSurfaceTexture:Z

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceTextureHost:Lcom/tencent/liteav/txcplayer/c;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v0}, Lcom/tencent/liteav/txcplayer/c;->a(Landroid/graphics/SurfaceTexture;)V

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 20
    :goto_0
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 23
    :cond_1
    return-void
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
.end method

.method public releaseTextureHost()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceTextureHost:Lcom/tencent/liteav/txcplayer/c;

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
.end method

.method public reset()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->releaseSurfaceTexture()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 6
    .line 7
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v2, "taskInfo_player_start"

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v2, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->updateTaskInfo(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->reset()V

    .line 23
    :cond_0
    return-void
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
.end method

.method public seekTo(JZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "seekTo msec: "

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string/jumbo v1, "\uff1aisAccurateSeek\uff1a"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 28
    .line 29
    if-eqz p3, :cond_0

    .line 30
    .line 31
    iget-object p3, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 32
    long-to-int p1, p1

    .line 33
    const/4 p2, 0x3

    .line 34
    .line 35
    .line 36
    invoke-interface {p3, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->seekTo(II)V

    .line 37
    return-void

    .line 38
    .line 39
    :cond_0
    iget-object p3, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 40
    long-to-int p1, p1

    .line 41
    const/4 p2, 0x1

    .line 42
    .line 43
    .line 44
    invoke-interface {p3, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->seekTo(II)V

    .line 45
    return-void
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
.end method

.method public selectTrack(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    int-to-long v1, p1

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->selectTrack(IJ)V

    .line 7
    return-void
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
.end method

.method public setAudioNormalization(F)V
    .locals 3

    .line 1
    .line 2
    const/high16 v0, -0x3d740000    # -70.0f

    .line 3
    .line 4
    cmpl-float v0, p1, v0

    .line 5
    .line 6
    if-ltz v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    cmpg-float v0, p1, v0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "enable,loudnorm=I="

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string p1, ":TP=-1.5:LRA=5.4:linear=1"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setAudioNormalizeVolumeParams(Ljava/lang/String;)V

    .line 36
    return-void

    .line 37
    .line 38
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 39
    .line 40
    cmpl-float p1, p1, v0

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 45
    .line 46
    const-string v0, "disable"

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setAudioNormalizeVolumeParams(Ljava/lang/String;)V

    .line 50
    :cond_1
    return-void
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

.method public setAudioStreamType(I)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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
.end method

.method public setAudioVolume(I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "setAudioVolume\uff1a"

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOutputMute(Z)V

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setOutputMute(Z)V

    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 32
    int-to-float v1, p1

    .line 33
    .line 34
    const/high16 v2, 0x42c80000    # 100.0f

    .line 35
    div-float/2addr v1, v2

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setAudioGainRatio(F)V

    .line 39
    .line 40
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    const-string/jumbo v1, "setMixExternalAudioVolume"

    .line 50
    .line 51
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    filled-new-array {v2, p1}, [Ljava/lang/Object;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    return-void

    .line 78
    :catch_0
    move-exception p1

    .line 79
    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string/jumbo v1, "setAudioVolume exception : "

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    .line 100
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogE(Ljava/lang/String;)V

    .line 101
    :cond_1
    return-void
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
.end method

.method public setAutoMaxBitrate(I)V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 8
    int-to-long v5, p1

    .line 9
    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    const/16 v2, 0x1f7

    .line 13
    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {v1 .. v8}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJJJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public setBitrateIndex(I)V
    .locals 6

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "setBitrateIndex\uff1a"

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 15
    .line 16
    iget v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    const/4 v3, -0x1

    .line 20
    .line 21
    if-ne v0, v3, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 24
    .line 25
    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 26
    .line 27
    .line 28
    invoke-direct {v4}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 29
    .line 30
    const/16 v5, 0x1f8

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v5, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v4}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 38
    .line 39
    :cond_0
    if-eq p1, v3, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->getProgramInfo()[Lcom/tencent/thumbplayer/tcmedia/api/TPProgramInfo;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    if-ltz p1, :cond_1

    .line 50
    array-length v0, v0

    .line 51
    .line 52
    if-ge p1, v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, p1, v1, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->selectProgram(IJ)V

    .line 58
    .line 59
    :cond_1
    iput p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 60
    return-void
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

.method public setConfig(Lcom/tencent/liteav/txcplayer/e;)V
    .locals 10

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/b;->a()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->setProxyDataDir(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/b;->b()I

    .line 16
    move-result v1

    .line 17
    .line 18
    const/16 v2, 0x64

    .line 19
    .line 20
    if-ltz v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/liteav/txcplayer/common/b;->b()I

    .line 24
    move-result v1

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 28
    .line 29
    iget v1, v1, Lcom/tencent/liteav/txcplayer/e;->f:I

    .line 30
    mul-int/2addr v1, v2

    .line 31
    .line 32
    :goto_0
    if-lez v1, :cond_2

    .line 33
    .line 34
    new-instance v3, Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 38
    .line 39
    :try_start_0
    const-string v4, "VodCacheReserveSizeMB"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 43
    .line 44
    new-instance v4, Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 48
    .line 49
    const-string v5, "httpproxy_config"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    .line 60
    invoke-static {v3}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->parseHostConfig(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception v3

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 66
    .line 67
    :cond_2
    :goto_1
    iget-boolean v3, p1, Lcom/tencent/liteav/txcplayer/e;->i:Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v3}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setEnableAccurateSeek(Z)V

    .line 71
    .line 72
    iget-object v3, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 73
    .line 74
    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 75
    .line 76
    .line 77
    invoke-direct {v4}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 78
    .line 79
    iget-wide v5, p1, Lcom/tencent/liteav/txcplayer/e;->o:J

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v2, v5, v6}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    .line 86
    invoke-interface {v3, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 87
    .line 88
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 89
    .line 90
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 91
    .line 92
    .line 93
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 94
    .line 95
    const/16 v4, 0x65

    .line 96
    .line 97
    iget-boolean v5, p1, Lcom/tencent/liteav/txcplayer/e;->i:Z

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildBoolean(IZ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 101
    move-result-object v3

    .line 102
    .line 103
    .line 104
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 105
    .line 106
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 107
    .line 108
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 109
    .line 110
    .line 111
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 112
    .line 113
    const/16 v4, 0x66

    .line 114
    .line 115
    const-wide/16 v5, 0x3e8

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v4, v5, v6}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 119
    move-result-object v3

    .line 120
    .line 121
    .line 122
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 123
    .line 124
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 125
    .line 126
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 127
    .line 128
    .line 129
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 130
    .line 131
    const/16 v4, 0x75

    .line 132
    .line 133
    .line 134
    const-wide/32 v7, 0x13880

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v4, v7, v8}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 138
    move-result-object v3

    .line 139
    .line 140
    .line 141
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 142
    .line 143
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 144
    .line 145
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 146
    .line 147
    .line 148
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 149
    .line 150
    const/16 v4, 0x67

    .line 151
    .line 152
    const-wide/16 v7, 0xc8

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v4, v7, v8}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 156
    move-result-object v3

    .line 157
    .line 158
    .line 159
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 160
    .line 161
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 162
    .line 163
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 164
    .line 165
    .line 166
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 167
    .line 168
    const/16 v4, 0x69

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v4, v5, v6}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 172
    move-result-object v3

    .line 173
    .line 174
    .line 175
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 176
    .line 177
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 178
    .line 179
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 180
    .line 181
    .line 182
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 183
    .line 184
    const/16 v4, 0x6a

    .line 185
    .line 186
    const-wide/16 v5, 0x1f40

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3, v4, v5, v6}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 190
    move-result-object v3

    .line 191
    .line 192
    .line 193
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 194
    .line 195
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 196
    .line 197
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 198
    .line 199
    .line 200
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 201
    .line 202
    const/16 v4, 0x6b

    .line 203
    .line 204
    const-wide/16 v5, 0x2710

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v4, v5, v6}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 208
    move-result-object v3

    .line 209
    .line 210
    .line 211
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 212
    .line 213
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 214
    .line 215
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 216
    .line 217
    .line 218
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 219
    .line 220
    iget v4, p1, Lcom/tencent/liteav/txcplayer/e;->c:I

    .line 221
    int-to-float v4, v4

    .line 222
    .line 223
    const/high16 v5, 0x447a0000    # 1000.0f

    .line 224
    mul-float/2addr v4, v5

    .line 225
    float-to-long v4, v4

    .line 226
    .line 227
    const/16 v6, 0x6c

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v6, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 231
    move-result-object v3

    .line 232
    .line 233
    .line 234
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 235
    .line 236
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 237
    .line 238
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 239
    .line 240
    .line 241
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 242
    .line 243
    iget v4, p1, Lcom/tencent/liteav/txcplayer/e;->a:I

    .line 244
    int-to-float v4, v4

    .line 245
    float-to-long v4, v4

    .line 246
    .line 247
    const/16 v6, 0x6d

    .line 248
    .line 249
    .line 250
    invoke-virtual {v3, v6, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 251
    move-result-object v3

    .line 252
    .line 253
    .line 254
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 255
    .line 256
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 257
    .line 258
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 259
    .line 260
    .line 261
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 262
    .line 263
    iget-boolean v4, p1, Lcom/tencent/liteav/txcplayer/e;->z:Z

    .line 264
    int-to-long v4, v4

    .line 265
    .line 266
    const/16 v6, 0x1f8

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3, v6, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 270
    move-result-object v3

    .line 271
    .line 272
    .line 273
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 274
    .line 275
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 276
    .line 277
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 278
    .line 279
    .line 280
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 281
    .line 282
    const/16 v4, 0xb4

    .line 283
    .line 284
    iget-object v5, p1, Lcom/tencent/liteav/txcplayer/e;->x:Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildString(ILjava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 288
    move-result-object v3

    .line 289
    .line 290
    .line 291
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 292
    .line 293
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 294
    .line 295
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 296
    .line 297
    .line 298
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 299
    .line 300
    const/16 v4, 0xb5

    .line 301
    .line 302
    iget-object v5, p1, Lcom/tencent/liteav/txcplayer/e;->y:Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildString(ILjava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 306
    move-result-object v3

    .line 307
    .line 308
    .line 309
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 310
    .line 311
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 312
    .line 313
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 314
    .line 315
    .line 316
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 317
    .line 318
    const/16 v4, 0xc8

    .line 319
    .line 320
    const-wide/16 v5, 0x50

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3, v4, v5, v6}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 324
    move-result-object v3

    .line 325
    .line 326
    .line 327
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 328
    .line 329
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 330
    .line 331
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 332
    .line 333
    .line 334
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 335
    .line 336
    const/16 v4, 0xc9

    .line 337
    const/4 v5, 0x1

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildBoolean(IZ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 341
    move-result-object v3

    .line 342
    .line 343
    .line 344
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 345
    .line 346
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 347
    .line 348
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 349
    .line 350
    .line 351
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 352
    .line 353
    const/16 v4, 0x191

    .line 354
    .line 355
    .line 356
    invoke-virtual {v3, v4, v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildBoolean(IZ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 357
    move-result-object v3

    .line 358
    .line 359
    .line 360
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 361
    .line 362
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 363
    .line 364
    iget v2, v2, Lcom/tencent/liteav/txcplayer/e;->g:I

    .line 365
    .line 366
    const-wide/16 v3, 0x2

    .line 367
    .line 368
    const-wide/16 v6, 0x4

    .line 369
    .line 370
    const/16 v8, 0xca

    .line 371
    .line 372
    if-nez v2, :cond_3

    .line 373
    .line 374
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 375
    .line 376
    new-instance v9, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 377
    .line 378
    .line 379
    invoke-direct {v9}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v9, v8, v6, v7}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 383
    move-result-object v8

    .line 384
    .line 385
    .line 386
    invoke-interface {v2, v8}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 387
    goto :goto_2

    .line 388
    .line 389
    :cond_3
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 390
    .line 391
    new-instance v9, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 392
    .line 393
    .line 394
    invoke-direct {v9}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v9, v8, v3, v4}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 398
    move-result-object v8

    .line 399
    .line 400
    .line 401
    invoke-interface {v2, v8}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 402
    .line 403
    :goto_2
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 404
    .line 405
    new-instance v8, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 406
    .line 407
    .line 408
    invoke-direct {v8}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 409
    .line 410
    iget-boolean v9, p1, Lcom/tencent/liteav/txcplayer/e;->d:Z

    .line 411
    .line 412
    if-eqz v9, :cond_4

    .line 413
    goto :goto_3

    .line 414
    :cond_4
    move-wide v3, v6

    .line 415
    .line 416
    :goto_3
    const/16 v6, 0xcb

    .line 417
    .line 418
    .line 419
    invoke-virtual {v8, v6, v3, v4}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 420
    move-result-object v3

    .line 421
    .line 422
    .line 423
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 424
    .line 425
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 426
    .line 427
    iget v2, v2, Lcom/tencent/liteav/txcplayer/e;->s:I

    .line 428
    .line 429
    const/16 v3, -0x3e8

    .line 430
    .line 431
    if-ne v2, v3, :cond_6

    .line 432
    .line 433
    iget v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrateIndex:I

    .line 434
    .line 435
    if-eq v2, v3, :cond_5

    .line 436
    goto :goto_4

    .line 437
    :cond_5
    move v2, v3

    .line 438
    .line 439
    :cond_6
    :goto_4
    if-eq v2, v3, :cond_7

    .line 440
    .line 441
    iget-object v3, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 442
    .line 443
    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 444
    .line 445
    .line 446
    invoke-direct {v4}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 447
    .line 448
    const/16 v6, 0x84

    .line 449
    int-to-long v7, v2

    .line 450
    .line 451
    .line 452
    invoke-virtual {v4, v6, v7, v8}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 453
    move-result-object v2

    .line 454
    .line 455
    .line 456
    invoke-interface {v3, v2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 457
    .line 458
    :cond_7
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 459
    .line 460
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 461
    .line 462
    .line 463
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 464
    .line 465
    iget-wide v6, p1, Lcom/tencent/liteav/txcplayer/e;->v:J

    .line 466
    .line 467
    .line 468
    invoke-direct {p0, v6, v7}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->resolveAdaptivePreferredResolution(J)J

    .line 469
    move-result-wide v6

    .line 470
    .line 471
    const/16 v4, 0x85

    .line 472
    .line 473
    .line 474
    invoke-virtual {v3, v4, v6, v7}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 475
    move-result-object v3

    .line 476
    .line 477
    .line 478
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 479
    .line 480
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 481
    .line 482
    new-instance v3, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 483
    .line 484
    .line 485
    invoke-direct {v3}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 486
    .line 487
    const/16 v4, 0x1c2

    .line 488
    .line 489
    const-wide/16 v6, 0x1

    .line 490
    .line 491
    .line 492
    invoke-virtual {v3, v4, v6, v7}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildLong(IJ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 493
    move-result-object v3

    .line 494
    .line 495
    .line 496
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 497
    .line 498
    sget-object v2, Lcom/tencent/liteav/sdk/common/HouseBuilder$a;->h:Lcom/tencent/liteav/sdk/common/HouseBuilder$a;

    .line 499
    .line 500
    .line 501
    invoke-static {v2}, Lcom/tencent/liteav/txcplayer/common/c;->a(Lcom/tencent/liteav/sdk/common/HouseBuilder$a;)Z

    .line 502
    move-result v2

    .line 503
    .line 504
    const/16 v3, 0xb6

    .line 505
    .line 506
    if-eqz v2, :cond_8

    .line 507
    .line 508
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 509
    .line 510
    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 511
    .line 512
    .line 513
    invoke-direct {v4}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v4, v3, v5}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildBoolean(IZ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 517
    move-result-object v3

    .line 518
    .line 519
    .line 520
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 521
    goto :goto_5

    .line 522
    .line 523
    :cond_8
    iget-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 524
    .line 525
    new-instance v4, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 526
    .line 527
    .line 528
    invoke-direct {v4}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 529
    const/4 v6, 0x0

    .line 530
    .line 531
    .line 532
    invoke-virtual {v4, v3, v6}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildBoolean(IZ)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 533
    move-result-object v3

    .line 534
    .line 535
    .line 536
    invoke-interface {v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 537
    .line 538
    .line 539
    :goto_5
    invoke-static {v5}, Lcom/tencent/thumbplayer/tcmedia/config/TPPlayerConfig;->setP2PEnable(Z)V

    .line 540
    .line 541
    .line 542
    const v2, 0x238ebf

    .line 543
    .line 544
    .line 545
    invoke-static {v2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDownloadProxyFactory;->getTPDownloadProxy(I)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;

    .line 546
    move-result-object v2

    .line 547
    .line 548
    if-eqz v2, :cond_9

    .line 549
    .line 550
    .line 551
    invoke-interface {v2, v0}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->updateStoragePath(Ljava/lang/String;)V

    .line 552
    int-to-long v3, v1

    .line 553
    .line 554
    .line 555
    invoke-interface {v2, v3, v4}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/ITPDownloadProxy;->setMaxStorageSizeMB(J)V

    .line 556
    .line 557
    :cond_9
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 558
    .line 559
    iget-object v1, v1, Lcom/tencent/liteav/txcplayer/e;->A:Ljava/util/Map;

    .line 560
    .line 561
    if-eqz v1, :cond_a

    .line 562
    .line 563
    .line 564
    invoke-direct {p0, v1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->parseExtraConfig(Ljava/util/Map;)V

    .line 565
    .line 566
    :cond_a
    iget-object v1, p1, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    invoke-direct {p0, v1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setVideoInfo(Ljava/lang/String;)V

    .line 570
    .line 571
    iget-object p1, p1, Lcom/tencent/liteav/txcplayer/e;->q:Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 575
    move-result v0

    .line 576
    xor-int/2addr v0, v5

    .line 577
    .line 578
    .line 579
    invoke-direct {p0, p1, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setMp4EncryptionInfo(Ljava/lang/String;Z)V

    .line 580
    return-void
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method public setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/SecurityException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->isContentUri(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string/jumbo v0, "r"

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    invoke-interface {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setDataSource(Landroid/content/res/AssetFileDescriptor;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->isAssetFile(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "://"

    invoke-virtual {p2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    add-int/lit8 p2, p2, 0x3

    invoke-virtual {v0, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    .line 6
    iget-object p2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    invoke-interface {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setDataSource(Landroid/content/res/AssetFileDescriptor;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V

    return-void
.end method

.method public setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V
    .locals 0
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

    .line 8
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mDataSource:Ljava/lang/String;

    .line 10
    invoke-static {p1}, Lcom/tencent/liteav/txcplayer/a/a;->f(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 11
    const-string p2, "?"

    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 12
    :cond_0
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->handleDRMAsset(Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 13
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->handleUrlAsset(Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaUrlAsset;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 14
    invoke-interface {p1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;->getExtraParam()Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetExtraParam;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;->setExtraParam(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAssetExtraParam;)V

    :cond_1
    if-eqz p3, :cond_2

    .line 15
    invoke-interface {p3}, Ljava/util/Map;->size()I

    move-result p1

    if-lez p1, :cond_2

    .line 16
    invoke-interface {p2, p3}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;->setHttpHeader(Ljava/util/Map;)V

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    invoke-interface {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setDataSource(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;)V

    return-void

    .line 18
    :cond_3
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->handleUrlAsset(Ljava/lang/String;)Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaUrlAsset;

    move-result-object p2

    if-eqz p2, :cond_5

    if-eqz p3, :cond_4

    .line 19
    invoke-interface {p3}, Ljava/util/Map;->size()I

    move-result p1

    if-lez p1, :cond_4

    .line 20
    invoke-interface {p2, p3}, Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;->setHttpHeader(Ljava/util/Map;)V

    .line 21
    :cond_4
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    invoke-interface {p1, p2}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setDataSource(Lcom/tencent/thumbplayer/tcmedia/api/composition/ITPMediaAsset;)V

    return-void

    .line 22
    :cond_5
    iget-object p2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    invoke-interface {p2, p1, p3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setDataSource(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public setDataSource(Ljava/io/FileDescriptor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    invoke-static {p1}, Landroid/os/ParcelFileDescriptor;->dup(Ljava/io/FileDescriptor;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setDataSource(Landroid/os/ParcelFileDescriptor;)V

    return-void
.end method

.method public setDataSource(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/SecurityException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 24
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    return-void
.end method

.method public setDisplay(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 14
    .line 15
    :cond_1
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setSurfaceHolder(Landroid/view/SurfaceHolder;)V

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setEnableAccurateSeek(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mEnableAccurateSeek:Z

    .line 3
    return-void
    .line 4
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
.end method

.method public setKeepInBackground(Z)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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
.end method

.method public setLogEnabled(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->setDebugEnable(Z)V

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
.end method

.method public setLooping(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "setLooping \uff1a"

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 15
    .line 16
    iput-boolean p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mIsLooping:Z

    .line 17
    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setLoopback(Z)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public setMaxCacheSize(I)V
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    .line 3
    .line 4
    invoke-static {v0, v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPPlayerMgr;->setProxyMaxStorageSizeMB(J)V

    .line 5
    return-void
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
.end method

.method public setPrivateConfig(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mPrivateConfig:Ljava/util/Map;

    .line 3
    return-void
    .line 4
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
.end method

.method public setRate(F)V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "setRate: "

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 15
    .line 16
    iput p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mRate:F

    .line 17
    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlaySpeedRatio(F)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public setScreenOnWhilePlaying(Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "setScreenOnWhilePlaying"

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mScreenOnWhilePlaying:Z

    .line 17
    .line 18
    if-eq v0, p1, :cond_1

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    .line 27
    const-string/jumbo v0, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder"

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 31
    .line 32
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mScreenOnWhilePlaying:Z

    .line 33
    .line 34
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, p1}, Landroid/view/SurfaceHolder;->setKeepScreenOn(Z)V

    .line 40
    :cond_1
    return-void
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

.method public setSubtitleStyle(Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->convertToTPSubtitleRenderModel(Lcom/tencent/liteav/txcplayer/model/TXSubtitleRenderModel;)Lcom/tencent/thumbplayer/tcmedia/api/TPSubtitleRenderModel;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 11
    .line 12
    new-instance v1, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;-><init>()V

    .line 16
    .line 17
    const/16 v2, 0x1fb

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;->buildObject(ILjava/lang/Object;)Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, p1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->setPlayerOptionalParam(Lcom/tencent/thumbplayer/tcmedia/api/TPOptionalParam;)V

    .line 25
    :cond_0
    return-void
.end method

.method public setSurface(Landroid/view/Surface;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "setSurface: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setSurfaceToPlayer(Landroid/view/Surface;)V

    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->releaseSurfaceTexture()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    const/4 p1, 0x0

    .line 14
    .line 15
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setSurfaceToPlayer(Landroid/view/Surface;)V

    .line 19
    return-void

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    new-instance v0, Landroid/view/Surface;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 31
    .line 32
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurface:Landroid/view/Surface;

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, p1}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->setSurfaceToPlayer(Landroid/view/Surface;)V

    .line 36
    return-void
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

.method public setSurfaceTextureHost(Lcom/tencent/liteav/txcplayer/c;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mSurfaceTextureHost:Lcom/tencent/liteav/txcplayer/c;

    .line 3
    return-void
    .line 4
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
.end method

.method public setWakeMode(Landroid/content/Context;I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "setWakeMode\uff1a"

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mWakeLock:Landroid/os/PowerManager$WakeLock;

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mWakeLock:Landroid/os/PowerManager$WakeLock;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v1

    .line 34
    :goto_0
    const/4 v2, 0x0

    .line 35
    .line 36
    iput-object v2, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mWakeLock:Landroid/os/PowerManager$WakeLock;

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v0, v1

    .line 39
    .line 40
    .line 41
    :goto_1
    const-string/jumbo v2, "power"

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    check-cast p1, Landroid/os/PowerManager;

    .line 48
    .line 49
    const/high16 v2, 0x20000000

    .line 50
    or-int/2addr p2, v2

    .line 51
    .line 52
    const-class v2, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    iput-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mWakeLock:Landroid/os/PowerManager$WakeLock;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    iget-object p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mWakeLock:Landroid/os/PowerManager$WakeLock;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 73
    :cond_2
    return-void
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
.end method

.method public start()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "start"

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mHasReceiveFirstVideoRenderEvent:Z

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x7ea

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, v1, v1, v2}, Lcom/tencent/liteav/txcplayer/a;->notifyOnInfo(IIILjava/lang/Object;)Z

    .line 18
    .line 19
    const/16 v0, 0x7d3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, v1, v1, v2}, Lcom/tencent/liteav/txcplayer/a;->notifyOnInfo(IIILjava/lang/Object;)Z

    .line 23
    .line 24
    iput-boolean v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mHasReceiveFirstVideoRenderEvent:Z

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 27
    .line 28
    iget v0, v0, Lcom/tencent/liteav/txcplayer/e;->m:F

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    cmpl-float v0, v0, v2

    .line 32
    .line 33
    .line 34
    const-string/jumbo v2, "taskinfo_buffer_size_byte"

    .line 35
    .line 36
    if-ltz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mConfig:Lcom/tencent/liteav/txcplayer/e;

    .line 41
    .line 42
    iget v1, v1, Lcom/tencent/liteav/txcplayer/e;->m:F

    .line 43
    .line 44
    const/high16 v3, 0x44800000    # 1024.0f

    .line 45
    mul-float/2addr v1, v3

    .line 46
    mul-float/2addr v1, v3

    .line 47
    float-to-long v3, v1

    .line 48
    .line 49
    .line 50
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v2, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->updateTaskInfo(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :cond_1
    iget-boolean v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mIsSetDefaultBufferSize:Z

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, v2, v3}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->updateTaskInfo(Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    iput-boolean v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mIsSetDefaultBufferSize:Z

    .line 71
    .line 72
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 73
    .line 74
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    const-string/jumbo v2, "taskInfo_player_start"

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, v2, v1}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->updateTaskInfo(Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 83
    .line 84
    .line 85
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->start()V

    .line 86
    return-void
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
.end method

.method public stop()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTPPPlayer:Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/thumbplayer/tcmedia/api/ITPPlayer;->stopAsync()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public unpublishAudioToNetwork()V
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "unpublishAudioToNetwork"

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogI(Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const-string v1, "enableMixExternalAudioFrame"

    .line 17
    .line 18
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTrtcCloud:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    return-void

    .line 41
    :catch_0
    move-exception v0

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string/jumbo v2, "unpublishAudioToNetwork exception : "

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, v0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->innerLogE(Ljava/lang/String;)V

    .line 64
    :cond_0
    return-void
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
.end method

.method public updateBitrate(J)V
    .locals 5

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v2, p1, v0

    .line 5
    .line 6
    if-lez v2, :cond_1

    .line 7
    .line 8
    iget-wide v3, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTotalFileSize:J

    .line 9
    .line 10
    cmp-long v3, v3, p1

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    iget-wide v3, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrate:J

    .line 15
    .line 16
    cmp-long v3, v3, v0

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    :cond_0
    iput-wide p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTotalFileSize:J

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->getDuration()J

    .line 24
    move-result-wide v3

    .line 25
    .line 26
    cmp-long v0, v3, v0

    .line 27
    .line 28
    if-lez v0, :cond_1

    .line 29
    .line 30
    if-lez v2, :cond_1

    .line 31
    .line 32
    const-wide/16 v0, 0x1f40

    .line 33
    mul-long/2addr p1, v0

    .line 34
    div-long/2addr p1, v3

    .line 35
    .line 36
    iput-wide p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mBitrate:J

    .line 37
    :cond_1
    return-void
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

.method public updateTcpSpeed(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/liteav/thumbplayer/ThumbMediaPlayer;->mTcpSpeed:J

    .line 3
    return-void
    .line 4
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
.end method
