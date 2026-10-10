.class Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;
.super Ljava/lang/Object;
.source "FrameMetricsAggregator.java"

# interfaces
.implements Landroid/view/Window$OnFrameMetricsAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field private static synthetic ajc$tjp_0:Lorg/aspectj/lang/a$a;


# instance fields
.field final synthetic this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->ajc$preClinit()V

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
.end method

.method public constructor <init>(Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method private static synthetic ajc$preClinit()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Ldh0/b;

    .line 3
    .line 4
    const-string v1, "FrameMetricsAggregator.java"

    .line 5
    .line 6
    const-class v2, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ldh0/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 10
    .line 11
    const-string v6, ""

    .line 12
    .line 13
    .line 14
    const-string/jumbo v7, "void"

    .line 15
    .line 16
    const-string v1, "1"

    .line 17
    .line 18
    const-string v2, "onFrameMetricsAvailable"

    .line 19
    .line 20
    const-string v3, "androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl$1"

    .line 21
    .line 22
    const-string v4, "android.view.Window:android.view.FrameMetrics:int"

    .line 23
    .line 24
    .line 25
    const-string/jumbo v5, "window:frameMetrics:dropCountSinceLastInvocation"

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {v0 .. v7}, Ldh0/b;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lch0/a;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    const/16 v2, 0x160

    .line 32
    .line 33
    const-string v3, "method-execution"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v3, v1, v2}, Ldh0/b;->h(Ljava/lang/String;Lorg/aspectj/lang/c;I)Lorg/aspectj/lang/a$a;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    sput-object v0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->ajc$tjp_0:Lorg/aspectj/lang/a$a;

    .line 40
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

.method public static final synthetic onFrameMetricsAvailable_aroundBody0(Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;Landroid/view/Window;Landroid/view/FrameMetrics;ILorg/aspectj/lang/a;)V
    .locals 7

    .line 1
    .line 2
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;

    .line 3
    .line 4
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mTrackingFlags:I

    .line 5
    const/4 p4, 0x1

    .line 6
    and-int/2addr p3, p4

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mMetrics:[Landroid/util/SparseIntArray;

    .line 14
    .line 15
    aget-object p3, p3, v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, v1}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 19
    move-result-wide v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p3, v2, v3}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->addDurationItem(Landroid/util/SparseIntArray;J)V

    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;

    .line 25
    .line 26
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mTrackingFlags:I

    .line 27
    const/4 v2, 0x2

    .line 28
    and-int/2addr p3, v2

    .line 29
    .line 30
    if-eqz p3, :cond_1

    .line 31
    .line 32
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mMetrics:[Landroid/util/SparseIntArray;

    .line 33
    .line 34
    aget-object p3, p3, p4

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p4}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 38
    move-result-wide v3

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p3, v3, v4}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->addDurationItem(Landroid/util/SparseIntArray;J)V

    .line 42
    .line 43
    :cond_1
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;

    .line 44
    .line 45
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mTrackingFlags:I

    .line 46
    const/4 p4, 0x4

    .line 47
    and-int/2addr p3, p4

    .line 48
    const/4 v3, 0x3

    .line 49
    .line 50
    if-eqz p3, :cond_2

    .line 51
    .line 52
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mMetrics:[Landroid/util/SparseIntArray;

    .line 53
    .line 54
    aget-object p3, p3, v2

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v3}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 58
    move-result-wide v4

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p3, v4, v5}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->addDurationItem(Landroid/util/SparseIntArray;J)V

    .line 62
    .line 63
    :cond_2
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;

    .line 64
    .line 65
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mTrackingFlags:I

    .line 66
    and-int/2addr p3, v1

    .line 67
    .line 68
    if-eqz p3, :cond_3

    .line 69
    .line 70
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mMetrics:[Landroid/util/SparseIntArray;

    .line 71
    .line 72
    aget-object p3, p3, v3

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, p4}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 76
    move-result-wide v3

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p3, v3, v4}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->addDurationItem(Landroid/util/SparseIntArray;J)V

    .line 80
    .line 81
    :cond_3
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;

    .line 82
    .line 83
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mTrackingFlags:I

    .line 84
    .line 85
    and-int/lit8 p3, p3, 0x10

    .line 86
    const/4 v3, 0x5

    .line 87
    .line 88
    if-eqz p3, :cond_4

    .line 89
    .line 90
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mMetrics:[Landroid/util/SparseIntArray;

    .line 91
    .line 92
    aget-object p3, p3, p4

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v3}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 96
    move-result-wide v4

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p3, v4, v5}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->addDurationItem(Landroid/util/SparseIntArray;J)V

    .line 100
    .line 101
    :cond_4
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;

    .line 102
    .line 103
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mTrackingFlags:I

    .line 104
    .line 105
    and-int/lit8 p3, p3, 0x40

    .line 106
    const/4 p4, 0x7

    .line 107
    const/4 v4, 0x6

    .line 108
    .line 109
    if-eqz p3, :cond_5

    .line 110
    .line 111
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mMetrics:[Landroid/util/SparseIntArray;

    .line 112
    .line 113
    aget-object p3, p3, v4

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p4}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 117
    move-result-wide v5

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p3, v5, v6}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->addDurationItem(Landroid/util/SparseIntArray;J)V

    .line 121
    .line 122
    :cond_5
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;

    .line 123
    .line 124
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mTrackingFlags:I

    .line 125
    .line 126
    and-int/lit8 p3, p3, 0x20

    .line 127
    .line 128
    if-eqz p3, :cond_6

    .line 129
    .line 130
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mMetrics:[Landroid/util/SparseIntArray;

    .line 131
    .line 132
    aget-object p3, p3, v3

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v4}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 136
    move-result-wide v3

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p3, v3, v4}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->addDurationItem(Landroid/util/SparseIntArray;J)V

    .line 140
    .line 141
    :cond_6
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;

    .line 142
    .line 143
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mTrackingFlags:I

    .line 144
    .line 145
    and-int/lit16 p3, p3, 0x80

    .line 146
    .line 147
    if-eqz p3, :cond_7

    .line 148
    .line 149
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mMetrics:[Landroid/util/SparseIntArray;

    .line 150
    .line 151
    aget-object p3, p3, p4

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, v0}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 155
    move-result-wide v3

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p3, v3, v4}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->addDurationItem(Landroid/util/SparseIntArray;J)V

    .line 159
    .line 160
    :cond_7
    iget-object p0, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->this$0:Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;

    .line 161
    .line 162
    iget p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mTrackingFlags:I

    .line 163
    .line 164
    and-int/lit16 p1, p1, 0x100

    .line 165
    .line 166
    if-eqz p1, :cond_8

    .line 167
    .line 168
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->mMetrics:[Landroid/util/SparseIntArray;

    .line 169
    .line 170
    aget-object p1, p1, v1

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2, v2}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 174
    move-result-wide p2

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, p1, p2, p3}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;->addDurationItem(Landroid/util/SparseIntArray;J)V

    .line 178
    :cond_8
    return-void
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
.end method


# virtual methods
.method public onFrameMetricsAvailable(Landroid/view/Window;Landroid/view/FrameMetrics;I)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;->ajc$tjp_0:Lorg/aspectj/lang/a$a;

    .line 3
    .line 4
    .line 5
    invoke-static {p3}, Lorg/aspectj/runtime/internal/b;->c(I)Ljava/lang/Object;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    filled-new-array {p1, p2, v1}, [Ljava/lang/Object;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p0, p0, v1}, Ldh0/b;->e(Lorg/aspectj/lang/a$a;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lorg/aspectj/lang/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/kubi/sdk/aspect/d;->b()Lcom/kubi/sdk/aspect/d;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-static {p3}, Lorg/aspectj/runtime/internal/b;->c(I)Ljava/lang/Object;

    .line 22
    move-result-object p3

    .line 23
    .line 24
    .line 25
    filled-new-array {p0, p1, p2, p3, v0}, [Ljava/lang/Object;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    new-instance p2, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1$AjcClosure1;

    .line 29
    .line 30
    .line 31
    invoke-direct {p2, p1}, Landroidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1$AjcClosure1;-><init>([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const p1, 0x11010

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1}, Lorg/aspectj/runtime/internal/a;->linkClosureAndJoinPoint(I)Lorg/aspectj/lang/b;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lcom/kubi/sdk/aspect/d;->c(Lorg/aspectj/lang/b;)V

    .line 42
    return-void
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
.end method
