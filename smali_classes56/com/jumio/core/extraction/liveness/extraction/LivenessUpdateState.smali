.class public final Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;
.super Lcom/jumio/core/extraction/ExtractionUpdateState;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u001f\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007R\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0007\u00a8\u0006$"
    }
    d2 = {
        "Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;",
        "Lcom/jumio/core/extraction/ExtractionUpdateState;",
        "<init>",
        "()V",
        "faceRoiRect",
        "",
        "getFaceRoiRect",
        "()I",
        "faceCenterArea",
        "getFaceCenterArea",
        "moveFaceIntoFrame",
        "getMoveFaceIntoFrame",
        "centerFace",
        "getCenterFace",
        "levelEyesAndDevice",
        "getLevelEyesAndDevice",
        "faceTiltUp",
        "getFaceTiltUp",
        "faceTiltDown",
        "getFaceTiltDown",
        "faceTiltLeft",
        "getFaceTiltLeft",
        "faceTiltRight",
        "getFaceTiltRight",
        "faceTooClose",
        "getFaceTooClose",
        "moveFaceCloser",
        "getMoveFaceCloser",
        "nextPosition",
        "getNextPosition",
        "livenessFinished",
        "getLivenessFinished",
        "updateColor",
        "getUpdateColor",
        "attachClient",
        "getAttachClient",
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
.field public static final A:I

.field public static final B:I

.field public static final C:I

.field public static final D:I

.field public static final E:I

.field public static final F:I

.field public static final G:I

.field public static final H:I

.field public static final I:I

.field public static final INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final J:I

.field public static final v:I

.field public static final w:I

.field public static final x:I

.field public static final y:I

.field public static final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    .line 8
    .line 9
    sget-object v0, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 17
    move-result v1

    .line 18
    .line 19
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->v:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 27
    move-result v1

    .line 28
    .line 29
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->w:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 37
    move-result v1

    .line 38
    .line 39
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->x:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 47
    move-result v1

    .line 48
    .line 49
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->y:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 57
    move-result v1

    .line 58
    .line 59
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->z:I

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 67
    move-result v1

    .line 68
    .line 69
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->A:I

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 77
    move-result v1

    .line 78
    .line 79
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->B:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 87
    move-result v1

    .line 88
    .line 89
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->C:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 97
    move-result v1

    .line 98
    .line 99
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->D:I

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 107
    move-result v1

    .line 108
    .line 109
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->E:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 113
    move-result-object v1

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 117
    move-result v1

    .line 118
    .line 119
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->F:I

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 123
    move-result-object v1

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 127
    move-result v1

    .line 128
    .line 129
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->G:I

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 137
    move-result v1

    .line 138
    .line 139
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->H:I

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 147
    move-result v1

    .line 148
    .line 149
    sput v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->I:I

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getId()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 157
    move-result v0

    .line 158
    .line 159
    sput v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->J:I

    .line 160
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/extraction/ExtractionUpdateState;-><init>()V

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


# virtual methods
.method public final getAttachClient()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->J:I

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

.method public final getCenterFace()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->y:I

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

.method public final getFaceCenterArea()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->w:I

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

.method public final getFaceRoiRect()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->v:I

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

.method public final getFaceTiltDown()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->B:I

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

.method public final getFaceTiltLeft()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->C:I

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

.method public final getFaceTiltRight()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->D:I

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

.method public final getFaceTiltUp()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->A:I

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

.method public final getFaceTooClose()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->E:I

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

.method public final getLevelEyesAndDevice()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->z:I

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

.method public final getLivenessFinished()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->H:I

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

.method public final getMoveFaceCloser()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->F:I

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

.method public final getMoveFaceIntoFrame()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->x:I

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

.method public final getNextPosition()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->G:I

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

.method public final getUpdateColor()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->I:I

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
