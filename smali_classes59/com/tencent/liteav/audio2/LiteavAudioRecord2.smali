.class Lcom/tencent/liteav/audio2/LiteavAudioRecord2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::audio"
.end annotation


# static fields
.field private static final DEFAULT_LATENCY_MS:I = 0x1e

.field private static final HARDWARE_LATENCY_MS:I = 0x14

.field private static final LATENCY_THRESHOLD_MS:J = 0x3e8L

.field private static final NANOS_PER_MS:J = 0xf4240L

.field private static final NANOS_PER_SECOND:J = 0x3b9aca00L

.field private static final TAG:Ljava/lang/String; = "LiteavAudioRecord2"


# instance fields
.field private mAudioRecord:Landroid/media/AudioRecord;

.field private mBufferSize:I

.field private mBytesPerFrame:I

.field private mReadFrameIndex:I

.field private mSampleRate:I

.field private mSystemOSVersion:I


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
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mSampleRate:I

    .line 7
    .line 8
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mBufferSize:I

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mReadFrameIndex:I

    .line 11
    .line 12
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mBytesPerFrame:I

    .line 13
    .line 14
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mSystemOSVersion:I

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method private static audioSourceToString(I)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    :pswitch_0
    const-string p0, "INVALID"

    .line 6
    return-object p0

    .line 7
    .line 8
    :pswitch_1
    const-string p0, "VOICE_PERFORMANCE"

    .line 9
    return-object p0

    .line 10
    .line 11
    :pswitch_2
    const-string p0, "UNPROCESSED"

    .line 12
    return-object p0

    .line 13
    .line 14
    :pswitch_3
    const-string p0, "VOICE_COMMUNICATION"

    .line 15
    return-object p0

    .line 16
    .line 17
    :pswitch_4
    const-string p0, "VOICE_RECOGNITION"

    .line 18
    return-object p0

    .line 19
    .line 20
    :pswitch_5
    const-string p0, "CAMCORDER"

    .line 21
    return-object p0

    .line 22
    .line 23
    :pswitch_6
    const-string p0, "VOICE_CALL"

    .line 24
    return-object p0

    .line 25
    .line 26
    :pswitch_7
    const-string p0, "VOICE_DOWNLINK"

    .line 27
    return-object p0

    .line 28
    .line 29
    :pswitch_8
    const-string p0, "VOICE_UPLINK"

    .line 30
    return-object p0

    .line 31
    .line 32
    :pswitch_9
    const-string p0, "MIC"

    .line 33
    return-object p0

    .line 34
    .line 35
    :pswitch_a
    const-string p0, "DEFAULT"

    .line 36
    return-object p0

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
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

.method private createStartedAudioRecord(IIII)Landroid/media/AudioRecord;
    .locals 8

    .line 1
    .line 2
    const-string v0, "LiteavAudioRecord2"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Landroid/media/AudioRecord;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const/4 v6, 0x2

    .line 7
    move v3, p1

    .line 8
    move v4, p2

    .line 9
    move v5, p3

    .line 10
    move v7, p4

    .line 11
    .line 12
    .line 13
    :try_start_1
    invoke-direct/range {v2 .. v7}, Landroid/media/AudioRecord;-><init>(IIIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    .line 15
    .line 16
    :try_start_2
    invoke-virtual {v2}, Landroid/media/AudioRecord;->getState()I

    .line 17
    move-result p1

    .line 18
    const/4 p2, 0x1

    .line 19
    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    const/4 p1, 0x0

    .line 22
    .line 23
    iput p1, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mReadFrameIndex:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/media/AudioRecord;->startRecording()V

    .line 27
    .line 28
    const-string p1, "create AudioRecord success. sampleRate: %d, channelConfig: %d, bufferSize: %d, audio source: %s"

    .line 29
    .line 30
    .line 31
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    move-result-object p3

    .line 37
    .line 38
    .line 39
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    move-result-object p4

    .line 41
    .line 42
    .line 43
    invoke-static {v3}, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->audioSourceToString(I)Ljava/lang/String;

    .line 44
    move-result-object v6

    .line 45
    .line 46
    .line 47
    filled-new-array {p2, p3, p4, v6}, [Ljava/lang/Object;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    .line 51
    invoke-static {v0, p1, p2}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    return-object v2

    .line 53
    .line 54
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 55
    .line 56
    const-string p2, "AudioRecord is not initialized."

    .line 57
    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 60
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 61
    :catchall_0
    move v3, p1

    .line 62
    move v4, p2

    .line 63
    move v5, p3

    .line 64
    move v7, p4

    .line 65
    :catchall_1
    move-object v2, v1

    .line 66
    .line 67
    .line 68
    :catchall_2
    invoke-static {v3}, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->audioSourceToString(I)Ljava/lang/String;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    .line 76
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    move-result-object p3

    .line 78
    .line 79
    .line 80
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    move-result-object p4

    .line 82
    .line 83
    .line 84
    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    const-string p2, "create AudioRecord failed. source: %s, sampleRate: %d, channelConfig: %d, bufferSize: %d"

    .line 88
    .line 89
    .line 90
    invoke-static {v0, p2, p1}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {p0, v2}, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->destroyAudioRecord(Landroid/media/AudioRecord;)V

    .line 94
    return-object v1
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

.method private destroyAudioRecord(Landroid/media/AudioRecord;)V
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
    invoke-virtual {p1}, Landroid/media/AudioRecord;->getRecordingState()I

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
    invoke-virtual {p1}, Landroid/media/AudioRecord;->stop()V

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/media/AudioRecord;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    return-void

    .line 21
    .line 22
    .line 23
    :goto_1
    const-string/jumbo v0, "stop AudioRecord failed."

    .line 24
    .line 25
    .line 26
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    const-string v1, "LiteavAudioRecord2"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0, p1}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    return-void
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

.method private getLatencyByTimestamp()I
    .locals 8

    .line 1
    .line 2
    new-instance v0, Landroid/media/AudioTimestamp;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/media/AudioTimestamp;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0, v2}, Landroid/media/AudioRecord;->getTimestamp(Landroid/media/AudioTimestamp;I)I

    .line 12
    move-result v1

    .line 13
    .line 14
    const/16 v3, 0x1e

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const-string v0, "fail to get audio record timestamp"

    .line 19
    .line 20
    new-array v1, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v2, "LiteavAudioRecord2"

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v0, v1}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    return v3

    .line 27
    .line 28
    :cond_0
    iget v1, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mReadFrameIndex:I

    .line 29
    int-to-long v1, v1

    .line 30
    .line 31
    iget-wide v4, v0, Landroid/media/AudioTimestamp;->framePosition:J

    .line 32
    sub-long/2addr v1, v4

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v1, v2}, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->lengthBytesToNano(J)J

    .line 36
    move-result-wide v1

    .line 37
    .line 38
    iget-wide v4, v0, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 39
    add-long/2addr v4, v1

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 43
    move-result-wide v0

    .line 44
    sub-long/2addr v0, v4

    .line 45
    .line 46
    .line 47
    const-wide/32 v4, 0xf4240

    .line 48
    div-long/2addr v0, v4

    .line 49
    long-to-int v0, v0

    .line 50
    .line 51
    add-int/lit8 v1, v0, 0x14

    .line 52
    .line 53
    if-lez v0, :cond_1

    .line 54
    int-to-long v4, v0

    .line 55
    .line 56
    const-wide/16 v6, 0x3e8

    .line 57
    .line 58
    cmp-long v0, v4, v6

    .line 59
    .line 60
    if-gtz v0, :cond_1

    .line 61
    return v1

    .line 62
    :cond_1
    return v3
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
    iget v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mSampleRate:I

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


# virtual methods
.method public getRecordLatencyMs()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

    .line 3
    .line 4
    const/16 v1, 0x1e

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return v1

    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mSystemOSVersion:I

    .line 10
    .line 11
    const/16 v2, 0x18

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
    invoke-direct {p0}, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->getLatencyByTimestamp()I

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
    const-string v3, "LiteavAudioRecord2"

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

.method public getSessionId()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, -0x1

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioRecord;->getAudioSessionId()I

    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public read(Ljava/nio/ByteBuffer;I)I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/media/AudioRecord;->read(Ljava/nio/ByteBuffer;I)I

    .line 16
    move-result p1

    .line 17
    .line 18
    if-gez p1, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    const-string p2, "LiteavAudioRecord2"

    .line 29
    .line 30
    .line 31
    const-string/jumbo v0, "read failed, %d"

    .line 32
    .line 33
    .line 34
    invoke-static {p2, v0, p1}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    return v1

    .line 36
    .line 37
    :cond_1
    iget p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mReadFrameIndex:I

    .line 38
    .line 39
    iget v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mBytesPerFrame:I

    .line 40
    .line 41
    div-int v0, p1, v0

    .line 42
    add-int/2addr p2, v0

    .line 43
    .line 44
    iput p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mReadFrameIndex:I

    .line 45
    return p1
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

.method public startRecording(IIII)I
    .locals 10

    .line 1
    .line 2
    mul-int/lit8 v0, p3, 0x2

    .line 3
    .line 4
    iput v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mBytesPerFrame:I

    .line 5
    .line 6
    iput p2, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mSampleRate:I

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    if-ne p3, v0, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    const/16 v1, 0xc

    .line 15
    :goto_0
    const/4 v2, 0x2

    .line 16
    .line 17
    .line 18
    invoke-static {p2, v1, v2}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x0

    .line 21
    .line 22
    if-gtz v3, :cond_1

    .line 23
    .line 24
    const-string v5, "AudioRecord.getMinBufferSize return error: "

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    move-result-object v6

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v5

    .line 33
    .line 34
    new-array v6, v4, [Ljava/lang/Object;

    .line 35
    .line 36
    const-string v7, "LiteavAudioRecord2"

    .line 37
    .line 38
    .line 39
    invoke-static {v7, v5, v6}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    :cond_1
    mul-int/2addr p3, p2

    .line 41
    .line 42
    if-ge v3, p3, :cond_2

    .line 43
    move v3, p3

    .line 44
    :cond_2
    const/4 p3, 0x5

    .line 45
    .line 46
    .line 47
    filled-new-array {p1, v0, p3, v4}, [I

    .line 48
    move-result-object p1

    .line 49
    move p3, v4

    .line 50
    :goto_1
    const/4 v5, 0x4

    .line 51
    .line 52
    if-ge p3, v5, :cond_6

    .line 53
    .line 54
    iget-object v6, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

    .line 55
    .line 56
    if-nez v6, :cond_6

    .line 57
    .line 58
    aget v6, p1, p3

    .line 59
    move v7, v0

    .line 60
    .line 61
    :goto_2
    if-gt v7, v2, :cond_5

    .line 62
    .line 63
    iget-object v8, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

    .line 64
    .line 65
    if-nez v8, :cond_5

    .line 66
    .line 67
    mul-int v8, v3, v7

    .line 68
    .line 69
    iput v8, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mBufferSize:I

    .line 70
    .line 71
    mul-int/lit8 v9, p4, 0x4

    .line 72
    .line 73
    if-ge v8, v9, :cond_3

    .line 74
    .line 75
    if-lt v7, v2, :cond_4

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-direct {p0, v6, p2, v1, v8}, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->createStartedAudioRecord(IIII)Landroid/media/AudioRecord;

    .line 79
    move-result-object v8

    .line 80
    .line 81
    iput-object v8, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

    .line 82
    .line 83
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 84
    goto :goto_2

    .line 85
    .line 86
    :cond_5
    add-int/lit8 p3, p3, 0x1

    .line 87
    goto :goto_1

    .line 88
    .line 89
    :cond_6
    iget-object p1, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

    .line 90
    .line 91
    if-nez p1, :cond_7

    .line 92
    const/4 p1, -0x1

    .line 93
    return p1

    .line 94
    .line 95
    .line 96
    :cond_7
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 97
    move-result p1

    .line 98
    .line 99
    iput p1, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mSystemOSVersion:I

    .line 100
    .line 101
    const/16 p1, -0x13

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 105
    return v4
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

.method public stopRecording()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->destroyAudioRecord(Landroid/media/AudioRecord;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/liteav/audio2/LiteavAudioRecord2;->mAudioRecord:Landroid/media/AudioRecord;

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
