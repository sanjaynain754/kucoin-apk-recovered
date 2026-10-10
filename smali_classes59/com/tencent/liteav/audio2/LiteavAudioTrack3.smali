.class public Lcom/tencent/liteav/audio2/LiteavAudioTrack3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::audio"
.end annotation


# static fields
.field private static final DEFAULT_LATENCY_MS:I = 0xa0

.field private static final HARDWARE_LATENCY_MS:I = 0x14

.field private static final LATENCY_THRESHOLD_MS:J = 0x3e8L

.field private static final NANOS_PER_MS:J = 0xf4240L

.field private static final NANOS_PER_SECOND:J = 0x3b9aca00L

.field private static final TAG:Ljava/lang/String; = "LiteavAudioTrack3"


# instance fields
.field private mAudioTrack:Landroid/media/AudioTrack;

.field private mBufferSize:I

.field private mBytesPerFrame:I

.field private mPlayBuffer:[B

.field private mSampleRate:I

.field private mSystemOSVersion:I

.field private mWriteFrameIndex:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mSampleRate:I

    .line 7
    .line 8
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mBufferSize:I

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mSystemOSVersion:I

    .line 11
    .line 12
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mWriteFrameIndex:I

    .line 13
    .line 14
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mBytesPerFrame:I

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method private createStartedAudioTrack(IIII)Landroid/media/AudioTrack;
    .locals 9

    .line 1
    .line 2
    const-string v0, "LiteavAudioTrack3"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Landroid/media/AudioTrack;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const/4 v6, 0x2

    .line 7
    const/4 v8, 0x1

    .line 8
    move v4, p1

    .line 9
    move v5, p2

    .line 10
    move v7, p3

    .line 11
    move v3, p4

    .line 12
    .line 13
    .line 14
    :try_start_1
    invoke-direct/range {v2 .. v8}, Landroid/media/AudioTrack;-><init>(IIIIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 15
    .line 16
    .line 17
    :try_start_2
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getState()I

    .line 18
    move-result p1

    .line 19
    const/4 p2, 0x1

    .line 20
    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    const/4 p1, 0x0

    .line 23
    .line 24
    iput p1, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mWriteFrameIndex:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/media/AudioTrack;->play()V

    .line 28
    .line 29
    const-string p1, "create AudioTrack success. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s"

    .line 30
    .line 31
    .line 32
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    .line 36
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    move-result-object p3

    .line 38
    .line 39
    .line 40
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    move-result-object p4

    .line 42
    .line 43
    .line 44
    invoke-static {v3}, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->streamTypeToString(I)Ljava/lang/String;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    .line 48
    filled-new-array {p2, p3, p4, v6}, [Ljava/lang/Object;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    .line 52
    invoke-static {v0, p1, p2}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    return-object v2

    .line 54
    .line 55
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 56
    .line 57
    const-string p2, "AudioTrack is not initialized."

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 62
    :catchall_0
    move v4, p1

    .line 63
    move v5, p2

    .line 64
    move v7, p3

    .line 65
    move v3, p4

    .line 66
    :catchall_1
    move-object v2, v1

    .line 67
    .line 68
    .line 69
    :catchall_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    move-result-object p2

    .line 75
    .line 76
    .line 77
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    move-result-object p3

    .line 79
    .line 80
    .line 81
    invoke-static {v3}, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->streamTypeToString(I)Ljava/lang/String;

    .line 82
    move-result-object p4

    .line 83
    .line 84
    .line 85
    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    const-string p2, "create AudioTrack failed. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s"

    .line 89
    .line 90
    .line 91
    invoke-static {v0, p2, p1}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0, v2}, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->destroyAudioTrack(Landroid/media/AudioTrack;)V

    .line 95
    return-object v1
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
.end method

.method private destroyAudioTrack(Landroid/media/AudioTrack;)V
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getPlayState()I

    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x3

    .line 9
    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/media/AudioTrack;->stop()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/media/AudioTrack;->flush()V

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    return-void

    .line 24
    .line 25
    .line 26
    :goto_1
    const-string/jumbo v0, "stop AudioTrack failed."

    .line 27
    .line 28
    .line 29
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    const-string v1, "LiteavAudioTrack3"

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v0, p1}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

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

.method private getLatencyByTimestamp()I
    .locals 7

    .line 1
    .line 2
    new-instance v0, Landroid/media/AudioTimestamp;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/media/AudioTimestamp;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->getTimestamp(Landroid/media/AudioTimestamp;)Z

    .line 11
    move-result v1

    .line 12
    .line 13
    const/16 v2, 0xa0

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    new-array v0, v0, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v1, "LiteavAudioTrack3"

    .line 21
    .line 22
    const-string v3, "fail to get AudioTrack timestamp"

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v3, v0}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    return v2

    .line 27
    .line 28
    :cond_0
    iget v1, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mWriteFrameIndex:I

    .line 29
    int-to-long v3, v1

    .line 30
    .line 31
    iget-wide v5, v0, Landroid/media/AudioTimestamp;->framePosition:J

    .line 32
    sub-long/2addr v3, v5

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v3, v4}, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->lengthBytesToNano(J)J

    .line 36
    move-result-wide v3

    .line 37
    .line 38
    iget-wide v0, v0, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 39
    add-long/2addr v0, v3

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 43
    move-result-wide v3

    .line 44
    sub-long/2addr v0, v3

    .line 45
    .line 46
    .line 47
    const-wide/32 v3, 0xf4240

    .line 48
    div-long/2addr v0, v3

    .line 49
    long-to-int v0, v0

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x14

    .line 52
    .line 53
    if-lez v0, :cond_1

    .line 54
    int-to-long v3, v0

    .line 55
    .line 56
    const-wide/16 v5, 0x3e8

    .line 57
    .line 58
    cmp-long v1, v3, v5

    .line 59
    .line 60
    if-gez v1, :cond_1

    .line 61
    return v0

    .line 62
    :cond_1
    return v2
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

.method private lengthBytesToNano(J)J
    .locals 2

    .line 1
    .line 2
    .line 3
    const-wide/32 v0, 0x3b9aca00

    .line 4
    mul-long/2addr p1, v0

    .line 5
    .line 6
    iget v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mSampleRate:I

    .line 7
    int-to-long v0, v0

    .line 8
    div-long/2addr p1, v0

    .line 9
    return-wide p1
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

.method private static streamTypeToString(I)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    if-eqz p0, :cond_5

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p0, v0, :cond_4

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    if-eq p0, v0, :cond_3

    .line 9
    const/4 v0, 0x3

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    const/4 v0, 0x4

    .line 13
    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    const/4 v0, 0x5

    .line 16
    .line 17
    if-eq p0, v0, :cond_0

    .line 18
    .line 19
    const-string p0, "STREAM_INVALID"

    .line 20
    return-object p0

    .line 21
    .line 22
    :cond_0
    const-string p0, "STREAM_NOTIFICATION"

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_1
    const-string p0, "STREAM_ALARM"

    .line 26
    return-object p0

    .line 27
    .line 28
    :cond_2
    const-string p0, "STREAM_MUSIC"

    .line 29
    return-object p0

    .line 30
    .line 31
    :cond_3
    const-string p0, "STREAM_RING"

    .line 32
    return-object p0

    .line 33
    .line 34
    :cond_4
    const-string p0, "STREAM_SYSTEM"

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_5
    const-string p0, "STREAM_VOICE_CALL"

    .line 38
    return-object p0
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
.method public getBufferSize()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mBufferSize:I

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

.method public getPlayoutLatencyMs()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 3
    .line 4
    const/16 v1, 0xa0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return v1

    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mSystemOSVersion:I

    .line 10
    .line 11
    const/16 v2, 0x17

    .line 12
    .line 13
    if-ge v0, v2, :cond_1

    .line 14
    return v1

    .line 15
    .line 16
    .line 17
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->getLatencyByTimestamp()I

    .line 18
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v3, "get latency exception "

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    new-array v2, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    const-string v3, "LiteavAudioTrack3"

    .line 44
    .line 45
    .line 46
    invoke-static {v3, v0, v2}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    return v1
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

.method public getUnderrunCount()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

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
    :try_start_0
    iget v2, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mSystemOSVersion:I

    .line 9
    .line 10
    const/16 v3, 0x18

    .line 11
    .line 12
    if-lt v2, v3, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getUnderrunCount()I

    .line 16
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    return v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "get under run count exception "

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-array v2, v1, [Ljava/lang/Object;

    .line 39
    .line 40
    const-string v3, "LiteavAudioTrack3"

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v0, v2}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    :cond_1
    return v1
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

.method public startPlayout(IIII)I
    .locals 10

    .line 1
    .line 2
    mul-int/lit8 v0, p3, 0x2

    .line 3
    .line 4
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mBytesPerFrame:I

    .line 5
    .line 6
    iput p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mSampleRate:I

    .line 7
    const/4 v0, 0x4

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    if-ne p3, v1, :cond_0

    .line 11
    move p3, v0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    const/16 p3, 0xc

    .line 15
    :goto_0
    const/4 v2, 0x2

    .line 16
    .line 17
    .line 18
    invoke-static {p2, p3, v2}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x0

    .line 21
    .line 22
    if-gtz v3, :cond_1

    .line 23
    .line 24
    const-string p1, "AudioTrack.getMinBufferSize return error: "

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    new-array p2, v4, [Ljava/lang/Object;

    .line 35
    .line 36
    const-string p3, "LiteavAudioTrack3"

    .line 37
    .line 38
    .line 39
    invoke-static {p3, p1, p2}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    const/4 p1, -0x2

    .line 41
    return p1

    .line 42
    :cond_1
    const/4 v5, 0x3

    .line 43
    .line 44
    .line 45
    filled-new-array {p1, v4, v5, v1}, [I

    .line 46
    move-result-object p1

    .line 47
    move v5, v4

    .line 48
    .line 49
    :goto_1
    if-ge v5, v0, :cond_5

    .line 50
    .line 51
    iget-object v6, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 52
    .line 53
    if-nez v6, :cond_5

    .line 54
    .line 55
    aget v6, p1, v5

    .line 56
    move v7, v1

    .line 57
    .line 58
    :goto_2
    if-gt v7, v2, :cond_4

    .line 59
    .line 60
    iget-object v8, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 61
    .line 62
    if-nez v8, :cond_4

    .line 63
    .line 64
    mul-int v8, v3, v7

    .line 65
    .line 66
    iput v8, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mBufferSize:I

    .line 67
    .line 68
    mul-int/lit8 v9, p4, 0x4

    .line 69
    .line 70
    if-ge v8, v9, :cond_2

    .line 71
    .line 72
    if-lt v7, v2, :cond_3

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-direct {p0, p2, p3, v8, v6}, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->createStartedAudioTrack(IIII)Landroid/media/AudioTrack;

    .line 76
    move-result-object v8

    .line 77
    .line 78
    iput-object v8, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 79
    .line 80
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 81
    goto :goto_2

    .line 82
    .line 83
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :cond_5
    iget-object p1, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 87
    .line 88
    if-nez p1, :cond_6

    .line 89
    const/4 p1, -0x1

    .line 90
    return p1

    .line 91
    .line 92
    .line 93
    :cond_6
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 94
    move-result p1

    .line 95
    .line 96
    iput p1, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mSystemOSVersion:I

    .line 97
    .line 98
    const/16 p1, -0x13

    .line 99
    .line 100
    .line 101
    invoke-static {p1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 102
    return v4
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
.end method

.method public stopPlayout()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->destroyAudioTrack(Landroid/media/AudioTrack;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public write(Ljava/nio/ByteBuffer;IIZ)I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 10
    .line 11
    iget p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mSystemOSVersion:I

    .line 12
    .line 13
    const/16 v0, 0x15

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    if-lt p2, v0, :cond_1

    .line 17
    .line 18
    iget-object p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1, p3, p4}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 22
    move-result p1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    iget-object p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mPlayBuffer:[B

    .line 26
    .line 27
    if-eqz p2, :cond_2

    .line 28
    array-length p2, p2

    .line 29
    .line 30
    if-ge p2, p3, :cond_3

    .line 31
    .line 32
    :cond_2
    new-array p2, p3, [B

    .line 33
    .line 34
    iput-object p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mPlayBuffer:[B

    .line 35
    .line 36
    :cond_3
    iget-object p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mPlayBuffer:[B

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2, v2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    iget-object p1, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mAudioTrack:Landroid/media/AudioTrack;

    .line 42
    .line 43
    iget-object p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mPlayBuffer:[B

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2, v2, p3}, Landroid/media/AudioTrack;->write([BII)I

    .line 47
    move-result p1

    .line 48
    .line 49
    :goto_0
    if-gez p1, :cond_4

    .line 50
    .line 51
    .line 52
    const-string/jumbo p2, "write audio data to AudioTrack failed. "

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    new-array p2, v2, [Ljava/lang/Object;

    .line 63
    .line 64
    const-string p3, "LiteavAudioTrack3"

    .line 65
    .line 66
    .line 67
    invoke-static {p3, p1, p2}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    return v1

    .line 69
    .line 70
    :cond_4
    iget p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mWriteFrameIndex:I

    .line 71
    .line 72
    iget p3, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mBytesPerFrame:I

    .line 73
    .line 74
    div-int p3, p1, p3

    .line 75
    add-int/2addr p2, p3

    .line 76
    .line 77
    iput p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioTrack3;->mWriteFrameIndex:I

    .line 78
    return p1
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
.end method
