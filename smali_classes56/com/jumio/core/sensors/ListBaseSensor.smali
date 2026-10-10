.class public abstract Lcom/jumio/core/sensors/ListBaseSensor;
.super Lcom/jumio/core/sensors/BaseSensor;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u0008&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0008\u0010\u0013\u001a\u00020\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\u00102\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0008\u0010\u0017\u001a\u00020\u0018H\u0016J@\u0010\u0019\u001a\u00020\u001a2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\t2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\t2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\tH&J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH&R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/jumio/core/sensors/ListBaseSensor;",
        "Lcom/jumio/core/sensors/BaseSensor;",
        "type",
        "Lcom/jumio/core/sensors/SensorType;",
        "config",
        "Lcom/jumio/core/sensors/SensorConfig;",
        "<init>",
        "(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)V",
        "sensorDataList",
        "",
        "Lcom/jumio/core/sensors/SensorData;",
        "lastTimestamp",
        "",
        "minSensorCaptureDelayThreshold",
        "",
        "start",
        "",
        "context",
        "Landroid/content/Context;",
        "resetAllData",
        "handleSensorEvent",
        "event",
        "Landroid/hardware/SensorEvent;",
        "getResult",
        "Lcom/jumio/core/sensors/SensorResult;",
        "createDataMap",
        "Lcom/jumio/core/sensors/SensorResult$ListSensorResult;",
        "timeDeltas",
        "sensorValues0",
        "",
        "sensorValues1",
        "sensorValues2",
        "roundDataValue",
        "eventValue",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final i:Ljava/util/ArrayList;

.field public j:J

.field public final k:D


# direct methods
.method public constructor <init>(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)V
    .locals 2
    .param p1    # Lcom/jumio/core/sensors/SensorType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/sensors/SensorConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "type"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "config"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lcom/jumio/core/sensors/BaseSensor;-><init>(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)V

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/jumio/core/sensors/ListBaseSensor;->i:Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/jumio/core/sensors/SensorConfig;->getCaptureDelay()I

    .line 24
    move-result p1

    .line 25
    int-to-double p1, p1

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const-wide v0, 0x3feccccccccccccdL    # 0.9

    .line 31
    mul-double/2addr p1, v0

    .line 32
    .line 33
    iput-wide p1, p0, Lcom/jumio/core/sensors/ListBaseSensor;->k:D

    .line 34
    return-void
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
.end method


# virtual methods
.method public abstract createDataMap(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljumio/core/I3;
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)",
            "Ljumio/core/I3;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public declared-synchronized getResult()Ljumio/core/J3;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    iget-object v4, p0, Lcom/jumio/core/sensors/ListBaseSensor;->i:Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v5

    .line 32
    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    check-cast v5, Ljumio/core/F3;

    .line 40
    .line 41
    iget-wide v6, v5, Ljumio/core/F3;->a:J

    .line 42
    .line 43
    .line 44
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    iget v6, v5, Ljumio/core/F3;->b:F

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v6}, Lcom/jumio/core/sensors/ListBaseSensor;->roundDataValue(F)F

    .line 54
    move-result v6

    .line 55
    .line 56
    .line 57
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    iget v6, v5, Ljumio/core/F3;->c:F

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v6}, Lcom/jumio/core/sensors/ListBaseSensor;->roundDataValue(F)F

    .line 67
    move-result v6

    .line 68
    .line 69
    .line 70
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    move-result-object v6

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    iget v5, v5, Ljumio/core/F3;->d:F

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v5}, Lcom/jumio/core/sensors/ListBaseSensor;->roundDataValue(F)F

    .line 80
    move-result v5

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    goto :goto_1

    .line 91
    .line 92
    .line 93
    :cond_0
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/jumio/core/sensors/ListBaseSensor;->createDataMap(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljumio/core/I3;

    .line 94
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    monitor-exit p0

    .line 96
    return-object v0

    .line 97
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    throw v0
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
.end method

.method public handleSensorEvent(Landroid/hardware/SensorEvent;)V
    .locals 10
    .param p1    # Landroid/hardware/SensorEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/jumio/core/sensors/ListBaseSensor;->j:J

    .line 7
    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    cmp-long v2, v2, v4

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/jumio/core/sensors/ListBaseSensor;->j:J

    .line 15
    .line 16
    :cond_0
    iget-wide v2, p0, Lcom/jumio/core/sensors/ListBaseSensor;->j:J

    .line 17
    .line 18
    sub-long v5, v0, v2

    .line 19
    long-to-double v2, v5

    .line 20
    .line 21
    iget-wide v7, p0, Lcom/jumio/core/sensors/ListBaseSensor;->k:D

    .line 22
    .line 23
    cmpl-double v2, v2, v7

    .line 24
    .line 25
    if-ltz v2, :cond_4

    .line 26
    .line 27
    new-instance v4, Ljumio/core/F3;

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    const/4 v7, 0x0

    .line 36
    .line 37
    aget v3, v3, v7

    .line 38
    move v7, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v7, v2

    .line 41
    .line 42
    :goto_0
    if-eqz p1, :cond_2

    .line 43
    .line 44
    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    const/4 v8, 0x1

    .line 48
    .line 49
    aget v3, v3, v8

    .line 50
    move v8, v3

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v8, v2

    .line 53
    .line 54
    :goto_1
    if-eqz p1, :cond_3

    .line 55
    .line 56
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    const/4 v2, 0x2

    .line 60
    .line 61
    aget v2, p1, v2

    .line 62
    :cond_3
    move v9, v2

    .line 63
    .line 64
    .line 65
    invoke-direct/range {v4 .. v9}, Ljumio/core/F3;-><init>(JFFF)V

    .line 66
    .line 67
    iget-object p1, p0, Lcom/jumio/core/sensors/ListBaseSensor;->i:Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    iput-wide v0, p0, Lcom/jumio/core/sensors/ListBaseSensor;->j:J

    .line 73
    :cond_4
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
.end method

.method public resetAllData()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/sensors/BaseSensor;->resetAllData()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/jumio/core/sensors/ListBaseSensor;->i:Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/jumio/core/sensors/ListBaseSensor;->j:J

    .line 15
    return-void
    .line 16
.end method

.method public abstract roundDataValue(F)F
.end method

.method public start(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/jumio/core/sensors/ListBaseSensor;->j:J

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1}, Lcom/jumio/core/sensors/BaseSensor;->start(Landroid/content/Context;)V

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
.end method
