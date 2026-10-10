.class public Lcom/jumio/core/extraction/ExtractionUpdateState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/jumio/core/extraction/ExtractionUpdateState;",
        "",
        "<init>",
        "()V",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static a:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:I

.field public static final f:I

.field public static final g:I

.field public static final h:I

.field public static final i:I

.field public static final j:I

.field public static final k:I

.field public static final l:I

.field public static final m:I

.field public static final n:I

.field public static final o:I

.field public static final p:I

.field public static final q:I

.field public static final r:I

.field public static final s:I

.field public static final t:I

.field public static final u:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    .line 9
    .line 10
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 15
    .line 16
    sput-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 20
    move-result v0

    .line 21
    .line 22
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->b:I

    .line 23
    .line 24
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 28
    move-result v0

    .line 29
    .line 30
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->c:I

    .line 31
    .line 32
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 36
    move-result v0

    .line 37
    .line 38
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->d:I

    .line 39
    .line 40
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 44
    move-result v0

    .line 45
    .line 46
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->e:I

    .line 47
    .line 48
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 52
    move-result v0

    .line 53
    .line 54
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->f:I

    .line 55
    .line 56
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 60
    move-result v0

    .line 61
    .line 62
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->g:I

    .line 63
    .line 64
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 68
    move-result v0

    .line 69
    .line 70
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->h:I

    .line 71
    .line 72
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 76
    move-result v0

    .line 77
    .line 78
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->i:I

    .line 79
    .line 80
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 84
    move-result v0

    .line 85
    .line 86
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->j:I

    .line 87
    .line 88
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 92
    move-result v0

    .line 93
    .line 94
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->k:I

    .line 95
    .line 96
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 100
    move-result v0

    .line 101
    .line 102
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->l:I

    .line 103
    .line 104
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 108
    move-result v0

    .line 109
    .line 110
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->m:I

    .line 111
    .line 112
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 116
    move-result v0

    .line 117
    .line 118
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->n:I

    .line 119
    .line 120
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 124
    move-result v0

    .line 125
    .line 126
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->o:I

    .line 127
    .line 128
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 132
    move-result v0

    .line 133
    .line 134
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->p:I

    .line 135
    .line 136
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 140
    move-result v0

    .line 141
    .line 142
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->q:I

    .line 143
    .line 144
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 148
    move-result v0

    .line 149
    .line 150
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->r:I

    .line 151
    .line 152
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 156
    move-result v0

    .line 157
    .line 158
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->s:I

    .line 159
    .line 160
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 164
    move-result v0

    .line 165
    .line 166
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->t:I

    .line 167
    .line 168
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 172
    move-result v0

    .line 173
    .line 174
    sput v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->u:I

    .line 175
    return-void
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
.end method

.method public static final synthetic access$getCaptureHighResolutionImage$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->n:I

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
.end method

.method public static final synthetic access$getCenterId$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->g:I

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
.end method

.method public static final synthetic access$getDocumentClassified$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->m:I

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
.end method

.method public static final synthetic access$getFallbackRequired$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->l:I

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
.end method

.method public static final synthetic access$getFlash$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->o:I

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
.end method

.method public static final synthetic access$getHoldStill$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->h:I

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
.end method

.method public static final synthetic access$getHoldStraight$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->i:I

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
.end method

.method public static final synthetic access$getId$cp()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

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
.end method

.method public static final synthetic access$getLockExposureAndWhiteBalance$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->r:I

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
.end method

.method public static final synthetic access$getMetering$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->u:I

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
.end method

.method public static final synthetic access$getMoveCloser$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->j:I

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
.end method

.method public static final synthetic access$getResetOverlay$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->f:I

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
.end method

.method public static final synthetic access$getRotate$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->t:I

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
.end method

.method public static final synthetic access$getSaveDebugImage$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->d:I

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
.end method

.method public static final synthetic access$getSaveHighResolutionImage$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->c:I

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
.end method

.method public static final synthetic access$getSaveImage$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->b:I

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
.end method

.method public static final synthetic access$getSetChallenge$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->s:I

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
.end method

.method public static final synthetic access$getShotTaken$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->e:I

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
.end method

.method public static final synthetic access$getSkipImage$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->p:I

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
.end method

.method public static final synthetic access$getTilt$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->q:I

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
.end method

.method public static final synthetic access$getTooClose$cp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->k:I

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
.end method

.method public static final synthetic access$setId$cp(Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/jumio/core/extraction/ExtractionUpdateState;->a:Ljava/util/concurrent/atomic/AtomicInteger;

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
.end method
