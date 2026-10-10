.class Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;
.super Ljava/lang/Object;
.source "CaptureResultImageMatcher.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;
    }
.end annotation


# static fields
.field private static final INVALID_TIMESTAMP:I = -0x1


# instance fields
.field mCaptureStageIdMap:Ljava/util/Map;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field mImageReferenceListener:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private final mLock:Ljava/lang/Object;

.field private final mPendingCaptureResults:Landroid/util/LongSparseArray;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mPendingImages:Landroid/util/LongSparseArray;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Ljava/util/List<",
            "Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance v0, Landroid/util/LongSparseArray;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 18
    .line 19
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mCaptureStageIdMap:Ljava/util/Map;

    .line 25
    .line 26
    new-instance v0, Landroid/util/LongSparseArray;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    .line 30
    .line 31
    iput-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

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
.end method

.method private addToList(Landroid/util/LongSparseArray;JLjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/util/LongSparseArray<",
            "Ljava/util/List<",
            "TT;>;>;JTT;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p2, p3}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2, p3, v0}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    return-void
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

.method private getTimeStampFromCaptureResult(Landroid/hardware/camera2/TotalCaptureResult;)J
    .locals 2

    .line 1
    .line 2
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->SENSOR_TIMESTAMP:Landroid/hardware/camera2/CaptureResult$Key;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Long;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    .line 17
    :cond_0
    const-wide/16 v0, -0x1

    .line 18
    return-wide v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private matchImages()V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    sub-int/2addr v1, v2

    .line 12
    .line 13
    :goto_0
    if-ltz v1, :cond_2

    .line 14
    .line 15
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v1}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    check-cast v3, Ljava/util/List;

    .line 22
    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 25
    move-result v4

    .line 26
    .line 27
    if-nez v4, :cond_1

    .line 28
    const/4 v4, 0x0

    .line 29
    .line 30
    .line 31
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    move-result-object v5

    .line 33
    .line 34
    check-cast v5, Landroid/hardware/camera2/TotalCaptureResult;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v5}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->getTimeStampFromCaptureResult(Landroid/hardware/camera2/TotalCaptureResult;)J

    .line 38
    move-result-wide v6

    .line 39
    .line 40
    iget-object v8, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    .line 44
    move-result-wide v8

    .line 45
    .line 46
    cmp-long v8, v6, v8

    .line 47
    .line 48
    if-nez v8, :cond_0

    .line 49
    move v8, v2

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    move v8, v4

    .line 52
    .line 53
    .line 54
    :goto_1
    invoke-static {v8}, Landroidx/core/util/Preconditions;->checkState(Z)V

    .line 55
    .line 56
    iget-object v8, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v6, v7}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 60
    move-result-object v8

    .line 61
    .line 62
    check-cast v8, Ljava/util/List;

    .line 63
    .line 64
    if-eqz v8, :cond_1

    .line 65
    .line 66
    .line 67
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 68
    move-result v9

    .line 69
    .line 70
    if-nez v9, :cond_1

    .line 71
    .line 72
    .line 73
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    check-cast v2, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;

    .line 77
    .line 78
    iget-object v4, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v4, v6, v7, v2}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->removeFromList(Landroid/util/LongSparseArray;JLjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v3, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 88
    move-result v3

    .line 89
    .line 90
    if-eqz v3, :cond_3

    .line 91
    .line 92
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v1}, Landroid/util/LongSparseArray;->removeAt(I)V

    .line 96
    goto :goto_2

    .line 97
    :catchall_0
    move-exception v1

    .line 98
    goto :goto_3

    .line 99
    .line 100
    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    const/4 v5, 0x0

    .line 103
    move-object v2, v5

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_2
    invoke-direct {p0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->removeStaleData()V

    .line 107
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    if-eqz v2, :cond_4

    .line 110
    .line 111
    if-eqz v5, :cond_4

    .line 112
    .line 113
    .line 114
    invoke-direct {p0, v2, v5}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->notifyImage(Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;Landroid/hardware/camera2/TotalCaptureResult;)V

    .line 115
    :cond_4
    return-void

    .line 116
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    throw v1
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
.end method

.method private notifyImage(Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mImageReferenceListener:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mCaptureStageIdMap:Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    check-cast v2, Ljava/lang/Integer;

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-interface {p1}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->decrement()Z

    .line 22
    const/4 v1, 0x0

    .line 23
    move-object v2, v1

    .line 24
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 30
    move-result v0

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, p1, p2, v0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;->onImageReferenceIncoming(Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;Landroid/hardware/camera2/TotalCaptureResult;I)V

    .line 34
    :cond_1
    return-void

    .line 35
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw p1
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private removeFromList(Landroid/util/LongSparseArray;JLjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/util/LongSparseArray<",
            "Ljava/util/List<",
            "TT;>;>;JTT;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p2, p3}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 15
    move-result p4

    .line 16
    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2, p3}, Landroid/util/LongSparseArray;->remove(J)V

    .line 21
    :cond_0
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
.end method

.method private removeStaleData()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_6

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    .line 17
    move-result v1

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/util/LongSparseArray;->keyAt(I)J

    .line 28
    move-result-wide v3

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    iget-object v5, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v2}, Landroid/util/LongSparseArray;->keyAt(I)J

    .line 38
    move-result-wide v5

    .line 39
    .line 40
    .line 41
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    .line 46
    move-result v1

    .line 47
    .line 48
    xor-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Landroidx/core/util/Preconditions;->checkArgument(Z)V

    .line 52
    .line 53
    cmp-long v1, v5, v3

    .line 54
    .line 55
    if-lez v1, :cond_3

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    .line 61
    move-result v1

    .line 62
    .line 63
    add-int/lit8 v1, v1, -0x1

    .line 64
    .line 65
    :goto_0
    if-ltz v1, :cond_5

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    .line 71
    move-result-wide v2

    .line 72
    .line 73
    cmp-long v2, v2, v5

    .line 74
    .line 75
    if-gez v2, :cond_2

    .line 76
    .line 77
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v1}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    check-cast v2, Ljava/util/List;

    .line 84
    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    .line 90
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    move-result v3

    .line 92
    .line 93
    if-eqz v3, :cond_1

    .line 94
    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    move-result-object v3

    .line 98
    .line 99
    check-cast v3, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;

    .line 100
    .line 101
    .line 102
    invoke-interface {v3}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->decrement()Z

    .line 103
    goto :goto_1

    .line 104
    :catchall_0
    move-exception v1

    .line 105
    goto :goto_4

    .line 106
    .line 107
    :cond_1
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v1}, Landroid/util/LongSparseArray;->removeAt(I)V

    .line 111
    .line 112
    :cond_2
    add-int/lit8 v1, v1, -0x1

    .line 113
    goto :goto_0

    .line 114
    .line 115
    :cond_3
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    .line 119
    move-result v1

    .line 120
    .line 121
    add-int/lit8 v1, v1, -0x1

    .line 122
    .line 123
    :goto_2
    if-ltz v1, :cond_5

    .line 124
    .line 125
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    .line 129
    move-result-wide v5

    .line 130
    .line 131
    cmp-long v2, v5, v3

    .line 132
    .line 133
    if-gez v2, :cond_4

    .line 134
    .line 135
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v1}, Landroid/util/LongSparseArray;->removeAt(I)V

    .line 139
    .line 140
    :cond_4
    add-int/lit8 v1, v1, -0x1

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    monitor-exit v0

    .line 143
    return-void

    .line 144
    :cond_6
    :goto_3
    monitor-exit v0

    .line 145
    return-void

    .line 146
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    throw v1
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
.end method


# virtual methods
.method public captureResultIncoming(Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->captureResultIncoming(Landroid/hardware/camera2/TotalCaptureResult;I)V

    return-void
.end method

.method public captureResultIncoming(Landroid/hardware/camera2/TotalCaptureResult;I)V
    .locals 5

    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    invoke-direct {p0, p1}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->getTimeStampFromCaptureResult(Landroid/hardware/camera2/TotalCaptureResult;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 5
    :cond_0
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    invoke-direct {p0, v3, v1, v2, p1}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->addToList(Landroid/util/LongSparseArray;JLjava/lang/Object;)V

    .line 6
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mCaptureStageIdMap:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    invoke-direct {p0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->matchImages()V

    return-void

    .line 9
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public clear()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingCaptureResults:Landroid/util/LongSparseArray;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/util/LongSparseArray;->clear()V

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    :goto_0
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/util/LongSparseArray;->size()I

    .line 15
    move-result v2

    .line 16
    .line 17
    if-ge v1, v2, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    .line 23
    move-result-wide v2

    .line 24
    .line 25
    iget-object v4, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v2, v3}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    check-cast v2, Ljava/util/List;

    .line 32
    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    move-result v3

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    check-cast v3, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;

    .line 48
    .line 49
    .line 50
    invoke-interface {v3}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->decrement()Z

    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto :goto_2

    .line 54
    .line 55
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_1
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/util/LongSparseArray;->clear()V

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mCaptureStageIdMap:Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 67
    monitor-exit v0

    .line 68
    return-void

    .line 69
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    throw v1
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
.end method

.method public clearImageReferenceListener()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    :try_start_0
    iput-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mImageReferenceListener:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;

    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v1
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public imageIncoming(Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p1}, Landroidx/camera/extensions/internal/sessionprocessor/ImageReference;->get()Landroid/media/Image;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mPendingImages:Landroid/util/LongSparseArray;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/media/Image;->getTimestamp()J

    .line 13
    move-result-wide v3

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v2, v3, v4, p1}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->addToList(Landroid/util/LongSparseArray;JLjava/lang/Object;)V

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->matchImages()V

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1
.end method

.method public setImageReferenceListener(Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher;->mImageReferenceListener:Landroidx/camera/extensions/internal/sessionprocessor/CaptureResultImageMatcher$ImageReferenceListener;

    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
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
.end method
