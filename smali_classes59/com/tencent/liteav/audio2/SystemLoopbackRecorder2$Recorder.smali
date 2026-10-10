.class Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Recorder"
.end annotation


# instance fields
.field private a:Landroid/media/AudioRecord;

.field private b:Landroid/media/AudioManager;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    const-string v1, "audio"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Landroid/media/AudioManager;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->b:Landroid/media/AudioManager;

    .line 21
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
.end method

.method private static a(Landroid/media/projection/MediaProjection;III)Landroid/media/AudioRecord;
    .locals 10

    .line 1
    const-string v0, "SystemLoopbackRecorder2"

    .line 2
    invoke-static {p0}, Lcom/tencent/liteav/audio2/n;->a(Landroid/media/projection/MediaProjection;)Landroid/media/AudioPlaybackCaptureConfiguration$Builder;

    move-result-object p0

    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v1}, Lcom/tencent/liteav/audio2/k;->a(Landroid/media/AudioPlaybackCaptureConfiguration$Builder;I)Landroid/media/AudioPlaybackCaptureConfiguration$Builder;

    const/16 v2, 0xe

    .line 4
    invoke-static {p0, v2}, Lcom/tencent/liteav/audio2/k;->a(Landroid/media/AudioPlaybackCaptureConfiguration$Builder;I)Landroid/media/AudioPlaybackCaptureConfiguration$Builder;

    .line 5
    invoke-static {p0}, Lcom/tencent/liteav/audio2/l;->a(Landroid/media/AudioPlaybackCaptureConfiguration$Builder;)Landroid/media/AudioPlaybackCaptureConfiguration;

    move-result-object p0

    const/4 v2, 0x0

    if-nez p0, :cond_0

    return-object v2

    :cond_0
    if-ne p2, v1, :cond_1

    const/16 p2, 0x10

    goto :goto_0

    :cond_1
    const/16 p2, 0xc

    .line 6
    :goto_0
    new-instance v3, Landroid/media/AudioFormat$Builder;

    invoke-direct {v3}, Landroid/media/AudioFormat$Builder;-><init>()V

    const/4 v4, 0x2

    .line 7
    invoke-virtual {v3, v4}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v3

    .line 8
    invoke-virtual {v3, p1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v3

    .line 9
    invoke-virtual {v3, p2}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v3

    .line 10
    invoke-virtual {v3}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v3

    .line 11
    invoke-static {p1, p2, v4}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result p1

    move p2, v1

    move-object v5, v2

    :goto_1
    if-gt p2, v4, :cond_5

    if-nez v5, :cond_5

    mul-int v6, p1, p2

    mul-int/lit8 v7, p3, 0x4

    if-ge v6, v7, :cond_2

    if-lt p2, v4, :cond_4

    :cond_2
    const/4 v7, 0x0

    .line 12
    :try_start_0
    new-instance v8, Landroid/media/AudioRecord$Builder;

    invoke-direct {v8}, Landroid/media/AudioRecord$Builder;-><init>()V

    .line 13
    invoke-virtual {v8, v3}, Landroid/media/AudioRecord$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioRecord$Builder;

    move-result-object v8

    .line 14
    invoke-virtual {v8, v6}, Landroid/media/AudioRecord$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioRecord$Builder;

    move-result-object v6

    .line 15
    invoke-static {v6, p0}, Lcom/tencent/liteav/audio2/m;->a(Landroid/media/AudioRecord$Builder;Landroid/media/AudioPlaybackCaptureConfiguration;)Landroid/media/AudioRecord$Builder;

    move-result-object v6

    .line 16
    invoke-virtual {v6}, Landroid/media/AudioRecord$Builder;->build()Landroid/media/AudioRecord;

    move-result-object v5

    .line 17
    invoke-virtual {v5}, Landroid/media/AudioRecord;->getState()I

    move-result v6

    if-eq v6, v1, :cond_3

    .line 18
    const-string v6, "Audio record state error"

    new-array v8, v7, [Ljava/lang/Object;

    invoke-static {v0, v6, v8}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    invoke-static {v5}, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a(Landroid/media/AudioRecord;)V

    :goto_2
    move-object v5, v2

    goto :goto_4

    :catchall_0
    move-exception v6

    goto :goto_3

    .line 20
    :cond_3
    invoke-virtual {v5}, Landroid/media/AudioRecord;->startRecording()V

    .line 21
    const-string v6, "Create audio record success"

    new-array v8, v7, [Ljava/lang/Object;

    invoke-static {v0, v6, v8}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    .line 22
    :goto_3
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Create record error "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v0, v6, v7}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    invoke-static {v5}, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a(Landroid/media/AudioRecord;)V

    goto :goto_2

    :cond_4
    :goto_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_5
    return-object v5
.end method

.method private a(I)V
    .locals 2

    .line 28
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->b:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    .line 29
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setMode(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    .line 30
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Set audio mode exception "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "SystemLoopbackRecorder2"

    invoke-static {v1, p1, v0}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private static a(Landroid/media/AudioRecord;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 24
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 25
    invoke-virtual {p0}, Landroid/media/AudioRecord;->stop()V

    .line 26
    :cond_1
    invoke-virtual {p0}, Landroid/media/AudioRecord;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Destroy AudioRecord failed."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "SystemLoopbackRecorder2"

    invoke-static {v1, p0, v0}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public read(Ljava/nio/ByteBuffer;I)I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a:Landroid/media/AudioRecord;

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
    iget-object v2, p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a:Landroid/media/AudioRecord;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1, p2}, Landroid/media/AudioRecord;->read(Ljava/nio/ByteBuffer;I)I

    .line 16
    move-result p1

    .line 17
    .line 18
    if-gtz p1, :cond_1

    .line 19
    .line 20
    const-string p2, "Read failed "

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    new-array p2, v0, [Ljava/lang/Object;

    .line 31
    .line 32
    const-string v0, "SystemLoopbackRecorder2"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p1, p2}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    return v1

    .line 37
    :cond_1
    return p1
.end method

.method public startRecording(Landroid/media/projection/MediaProjection;IIII)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p5, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object p5, p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->b:Landroid/media/AudioManager;

    .line 6
    .line 7
    if-eqz p5, :cond_0

    .line 8
    const/4 v1, 0x3

    .line 9
    .line 10
    .line 11
    invoke-static {p5, v1}, Lcom/tencent/liteav/audio2/j;->a(Landroid/media/AudioManager;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p5

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "ForbidCaptureAudioFromCurrentApp error "

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    move-result-object p5

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object p5

    .line 32
    .line 33
    new-array v1, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    const-string v2, "SystemLoopbackRecorder2"

    .line 36
    .line 37
    .line 38
    invoke-static {v2, p5, v1}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    :cond_0
    :goto_0
    iget-object p5, p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->b:Landroid/media/AudioManager;

    .line 41
    .line 42
    if-eqz p5, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p5}, Landroid/media/AudioManager;->getMode()I

    .line 46
    move-result p5

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move p5, v0

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-direct {p0, v0}, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2, p3, p4}, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a(Landroid/media/projection/MediaProjection;III)Landroid/media/AudioRecord;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    iput-object p1, p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a:Landroid/media/AudioRecord;

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, p5}, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a(I)V

    .line 61
    .line 62
    iget-object p1, p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a:Landroid/media/AudioRecord;

    .line 63
    .line 64
    if-nez p1, :cond_2

    .line 65
    const/4 p1, -0x1

    .line 66
    return p1

    .line 67
    .line 68
    :cond_2
    const/16 p1, -0x13

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 72
    return v0
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
.end method

.method public stopRecording()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a:Landroid/media/AudioRecord;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a(Landroid/media/AudioRecord;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;->a:Landroid/media/AudioRecord;

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
