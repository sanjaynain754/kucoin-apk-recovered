.class public Lcom/tencent/liteav/videobase/common/HDRCapability;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::video"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "HDRCapability"

.field private static sIsHDR10Supported:Ljava/lang/Boolean;

.field private static final sSequenceTaskRunner:Lcom/tencent/liteav/base/util/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/base/util/m;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/liteav/base/util/m;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/liteav/videobase/common/HDRCapability;->sSequenceTaskRunner:Lcom/tencent/liteav/base/util/m;

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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method private static checkIsHDR10Supported()V
    .locals 4

    .line 1
    .line 2
    const-class v0, Lcom/tencent/liteav/videobase/common/HDRCapability;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/liteav/videobase/common/HDRCapability;->sIsHDR10Supported:Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :try_start_1
    invoke-static {}, Lcom/tencent/liteav/videobase/common/HDRCapability;->isDisplaySupportHDR10()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/tencent/liteav/videobase/common/HDRCapability;->isDecoderSupportHDR10()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    const-class v2, Lcom/tencent/liteav/videobase/common/HDRCapability;

    .line 23
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    const/4 v0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    .line 32
    .line 33
    :goto_0
    :try_start_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sput-object v0, Lcom/tencent/liteav/videobase/common/HDRCapability;->sIsHDR10Supported:Ljava/lang/Boolean;

    .line 37
    .line 38
    const-string v1, "HDRCapability"

    .line 39
    .line 40
    .line 41
    const-string/jumbo v3, "the device supports hdr10 %b"

    .line 42
    .line 43
    .line 44
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v3, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    monitor-exit v2

    .line 50
    return-void

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 54
    :catchall_2
    move-exception v0

    .line 55
    .line 56
    const-string v1, "HDRCapability"

    .line 57
    .line 58
    const-string v2, "check hdr capability error "

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    return-void

    .line 63
    :goto_1
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 64
    throw v1
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

.method private static hasHDR10ProfileLevel([Landroid/media/MediaCodecInfo$CodecProfileLevel;)Z
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    aget-object v3, p0, v2

    .line 8
    .line 9
    iget v3, v3, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 10
    .line 11
    const/16 v4, 0x1000

    .line 12
    .line 13
    if-ne v3, v4, :cond_0

    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return v1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private static isDecoderSupportHDR10()Z
    .locals 10

    .line 1
    .line 2
    new-instance v0, Landroid/media/MediaCodecList;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Landroid/media/MediaCodecList;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    .line 10
    move-result-object v0

    .line 11
    array-length v2, v0

    .line 12
    move v3, v1

    .line 13
    .line 14
    :goto_0
    if-ge v3, v2, :cond_2

    .line 15
    .line 16
    aget-object v4, v0, v3

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    .line 20
    move-result-object v5

    .line 21
    array-length v6, v5

    .line 22
    move v7, v1

    .line 23
    .line 24
    :goto_1
    if-ge v7, v6, :cond_1

    .line 25
    .line 26
    aget-object v8, v5, v7

    .line 27
    .line 28
    .line 29
    const-string/jumbo v9, "video/hevc"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 33
    move-result v8

    .line 34
    .line 35
    if-eqz v8, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v9}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 39
    move-result-object v8

    .line 40
    .line 41
    iget-object v8, v8, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 42
    .line 43
    .line 44
    invoke-static {v8}, Lcom/tencent/liteav/videobase/common/HDRCapability;->hasHDR10ProfileLevel([Landroid/media/MediaCodecInfo$CodecProfileLevel;)Z

    .line 45
    move-result v8

    .line 46
    .line 47
    if-eqz v8, :cond_0

    .line 48
    const/4 v0, 0x1

    .line 49
    return v0

    .line 50
    .line 51
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 52
    goto :goto_1

    .line 53
    .line 54
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return v1
    .line 57
.end method

.method private static isDisplaySupportHDR10()Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    const-string/jumbo v2, "window"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Landroid/view/WindowManager;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    return v1

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/Display;->getHdrCapabilities()Landroid/view/Display$HdrCapabilities;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    return v1

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {v0}, Landroid/view/Display$HdrCapabilities;->getSupportedHdrTypes()[I

    .line 35
    move-result-object v0

    .line 36
    array-length v2, v0

    .line 37
    move v3, v1

    .line 38
    .line 39
    :goto_0
    if-ge v3, v2, :cond_4

    .line 40
    .line 41
    aget v4, v0, v3

    .line 42
    const/4 v5, 0x2

    .line 43
    .line 44
    if-ne v4, v5, :cond_3

    .line 45
    const/4 v0, 0x1

    .line 46
    return v0

    .line 47
    .line 48
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_4
    return v1
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public static declared-synchronized isHDRSupported(I)Z
    .locals 4

    .line 1
    .line 2
    const-class v0, Lcom/tencent/liteav/videobase/common/HDRCapability;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    const/16 v2, 0x18

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    monitor-exit v0

    .line 14
    return v3

    .line 15
    .line 16
    :cond_0
    :try_start_1
    sget-object v1, Lcom/tencent/liteav/videobase/common/b;->b:Lcom/tencent/liteav/videobase/common/b;

    .line 17
    .line 18
    iget v1, v1, Lcom/tencent/liteav/videobase/common/b;->mValue:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    if-eq p0, v1, :cond_1

    .line 21
    monitor-exit v0

    .line 22
    return v3

    .line 23
    .line 24
    :cond_1
    :try_start_2
    sget-object p0, Lcom/tencent/liteav/videobase/common/HDRCapability;->sIsHDR10Supported:Ljava/lang/Boolean;

    .line 25
    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    monitor-exit v0

    .line 32
    return p0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_2
    :try_start_3
    sget-object p0, Lcom/tencent/liteav/videobase/common/HDRCapability;->sSequenceTaskRunner:Lcom/tencent/liteav/base/util/m;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/tencent/liteav/videobase/common/a;->a()Ljava/lang/Runnable;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/base/util/m;->a(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 44
    monitor-exit v0

    .line 45
    return v3

    .line 46
    :goto_0
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 47
    throw p0
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

.method public static synthetic lambda$isHDRSupported$0()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/videobase/common/HDRCapability;->checkIsHDR10Supported()V

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
