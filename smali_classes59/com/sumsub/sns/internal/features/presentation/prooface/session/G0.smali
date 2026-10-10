.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final g:Ljava/text/SimpleDateFormat;


# instance fields
.field public final a:Lxg0/a;

.field public final b:Lcom/sumsub/sns/internal/features/data/network/prooface/a;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

.field public final e:Lcom/sumsub/sns/internal/features/presentation/prooface/session/q;

.field public final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 3
    .line 4
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "yyyy-MM-dd HH:mm:ss"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 11
    .line 12
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->g:Ljava/text/SimpleDateFormat;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Lxg0/a;Lcom/sumsub/sns/internal/features/data/network/prooface/a;Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/prooface/A1;Lcom/sumsub/sns/internal/features/presentation/prooface/session/q;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->a:Lxg0/a;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->b:Lcom/sumsub/sns/internal/features/data/network/prooface/a;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->c:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/session/q;

    .line 14
    .line 15
    sget-object p1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 16
    .line 17
    sget-object p2, Lcom/sumsub/sns/internal/core/common/k0;->d:Ljava/lang/String;

    .line 18
    .line 19
    sget-object p3, Lcom/sumsub/sns/internal/core/common/k0;->b:Ljava/lang/String;

    .line 20
    .line 21
    sget p4, Lcom/sumsub/sns/internal/core/common/k0;->c:I

    .line 22
    .line 23
    new-instance p5, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string/jumbo v0, "msdk2 / 1.46.0 (Android "

    .line 30
    .line 31
    .line 32
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string p1, ") - App "

    .line 38
    .line 39
    .line 40
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string p1, " "

    .line 46
    .line 47
    .line 48
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string p1, " / "

    .line 54
    .line 55
    .line 56
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->f:Ljava/lang/String;

    .line 66
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


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Landroid/util/Size;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/prooface/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v0, p5

    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->s:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->s:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;

    invoke-direct {v2, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->q:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->s:I

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-wide v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->p:J

    iget v6, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->o:I

    iget-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->n:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    iget-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->m:Lcom/sumsub/sns/internal/features/data/model/prooface/l;

    iget-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->l:Ljava/lang/Integer;

    iget-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->k:Ljava/lang/Integer;

    iget-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->j:Ljava/lang/String;

    iget-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->i:Ljava/lang/String;

    iget-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->h:Ljava/lang/Integer;

    iget-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->g:Ljava/lang/Integer;

    iget-object v15, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->f:Ljava/lang/String;

    iget-object v5, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->e:Ljava/lang/String;

    move-object/from16 v16, v0

    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->d:Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->c:Lxg0/a;

    move-object/from16 p2, v0

    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->b:Lcom/sumsub/sns/internal/core/domain/facedetector/o;

    move-object/from16 p3, v0

    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->a:[B

    invoke-static/range {v16 .. v16}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v22, p1

    move-object/from16 v23, v5

    move-object/from16 v32, v7

    move-object/from16 v31, v8

    move-object/from16 v29, v10

    move-object/from16 v28, v11

    move-object/from16 v27, v12

    move-object/from16 v10, p2

    move-wide v4, v3

    move-object v3, v0

    move-object/from16 v0, p3

    :goto_1
    move-object/from16 v30, v9

    move-object/from16 v26, v13

    move-object/from16 v25, v14

    move-object/from16 v24, v15

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object/from16 v16, v0

    invoke-static/range {v16 .. v16}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 v4, 0x0

    .line 2
    :try_start_0
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->c:Ljava/lang/String;

    const/4 v5, 0x2

    invoke-static {v0, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v7

    .line 3
    invoke-static {v7, v8}, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a(J)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_3

    const-string v5, ""

    .line 5
    :cond_3
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 6
    iget-object v7, v7, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 7
    const-string v8, "Prooface"

    invoke-virtual {v7, v8, v5, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->d:Lcom/sumsub/sns/internal/features/presentation/prooface/A1;

    .line 9
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/prooface/A1;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 10
    invoke-virtual {v5, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a(Ljava/lang/Throwable;)V

    .line 11
    sget-object v0, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a(J)[B

    move-result-object v0

    .line 12
    :goto_2
    aget-byte v5, v0, v4

    .line 13
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v7

    .line 14
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    .line 15
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 16
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 17
    sget-object v11, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v12, 0x5c

    move-object/from16 v13, p1

    invoke-virtual {v13, v11, v12, v10}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 18
    new-instance v11, Lcom/sumsub/sns/internal/core/domain/facedetector/o;

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v12

    invoke-direct {v11, v12}, Lcom/sumsub/sns/internal/core/domain/facedetector/o;-><init>([B)V

    .line 19
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 20
    iget-object v10, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->a:Lxg0/a;

    .line 21
    iget-object v12, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->f:Ljava/lang/String;

    .line 22
    invoke-static {}, Lcom/sumsub/sns/internal/core/common/h;->b()Ljava/lang/String;

    move-result-object v15

    .line 23
    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getWidth()I

    move-result v13

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v14

    .line 24
    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getHeight()I

    move-result v13

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v13

    .line 25
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->g:Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v17

    move/from16 v18, v4

    invoke-virtual/range {v17 .. v17}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 26
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v6

    .line 27
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v17, v3

    .line 28
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/prooface/l;

    move-wide/from16 v18, v7

    move-object/from16 v7, p3

    invoke-direct {v3, v7}, Lcom/sumsub/sns/internal/features/data/model/prooface/l;-><init>(Ljava/lang/String;)V

    .line 29
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/session/q;

    iput-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->a:[B

    iput-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->b:Lcom/sumsub/sns/internal/core/domain/facedetector/o;

    iput-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->c:Lxg0/a;

    iput-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->d:Ljava/lang/String;

    const-string v8, "Built-in front camera"

    iput-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->e:Ljava/lang/String;

    iput-object v15, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->f:Ljava/lang/String;

    iput-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->g:Ljava/lang/Integer;

    iput-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->h:Ljava/lang/Integer;

    move-object/from16 v20, v0

    const-string/jumbo v0, "user"

    iput-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->i:Ljava/lang/String;

    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->j:Ljava/lang/String;

    iput-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->k:Ljava/lang/Integer;

    iput-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->l:Ljava/lang/Integer;

    iput-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->m:Lcom/sumsub/sns/internal/features/data/model/prooface/l;

    move-object/from16 p1, v3

    move-object/from16 v3, p4

    iput-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->n:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->o:I

    move-object/from16 p2, v4

    move-wide/from16 v3, v18

    iput-wide v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->p:J

    const/4 v3, 0x1

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->s:I

    invoke-virtual {v7, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/q;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v17

    if-ne v3, v4, :cond_4

    return-object v4

    :cond_4
    move-object/from16 v31, p1

    move-object/from16 v28, p2

    move-object/from16 v32, p4

    move-object/from16 v27, v0

    move-object/from16 v16, v3

    move-object/from16 v29, v6

    move-object/from16 v23, v8

    move-object v0, v11

    move-object/from16 v22, v12

    move-object/from16 v3, v20

    move v6, v5

    move-wide/from16 v4, v18

    goto/16 :goto_1

    .line 30
    :goto_3
    move-object/from16 v33, v16

    check-cast v33, Ljava/util/Map;

    .line 31
    new-instance v21, Lcom/sumsub/sns/internal/features/data/model/prooface/x;

    invoke-direct/range {v21 .. v33}, Lcom/sumsub/sns/internal/features/data/model/prooface/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sumsub/sns/internal/features/data/model/prooface/l;Lcom/sumsub/sns/internal/features/data/model/prooface/c;Ljava/util/Map;)V

    move-object/from16 v7, v21

    .line 32
    invoke-interface {v10}, Ltg0/n;->getSerializersModule()Lyg0/a;

    sget-object v8, Lcom/sumsub/sns/internal/features/data/model/prooface/x;->Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/w;

    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/prooface/w;->serializer()Ltg0/d;

    move-result-object v8

    check-cast v8, Ltg0/p;

    invoke-interface {v10, v8, v7}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 33
    sget-object v8, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    .line 34
    invoke-virtual {v2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v8

    invoke-static {v8}, Lkotlinx/coroutines/z1;->l(Lkotlin/coroutines/CoroutineContext;)V

    .line 35
    sget-object v8, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a:Ljava/util/concurrent/atomic/AtomicLong;

    array-length v8, v7

    int-to-byte v6, v6

    invoke-static {v7, v8, v6, v4, v5}, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a([BIBJ)[B

    move-result-object v7

    .line 36
    invoke-virtual {v2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v8

    invoke-static {v8}, Lkotlinx/coroutines/z1;->l(Lkotlin/coroutines/CoroutineContext;)V

    .line 37
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/domain/facedetector/o;->a:[B

    .line 38
    array-length v8, v0

    invoke-static {v0, v8, v6, v4, v5}, Lcom/sumsub/sns/internal/features/data/network/prooface/q;->a([BIBJ)[B

    move-result-object v0

    .line 39
    invoke-virtual {v2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    invoke-static {v4}, Lkotlinx/coroutines/z1;->l(Lkotlin/coroutines/CoroutineContext;)V

    .line 40
    array-length v4, v7

    array-length v5, v0

    add-int/2addr v4, v5

    add-int/lit8 v4, v4, 0x8

    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 41
    array-length v5, v7

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 42
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 43
    array-length v5, v0

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 44
    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 45
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    .line 46
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->b:Lcom/sumsub/sns/internal/features/data/network/prooface/a;

    invoke-virtual {v4, v0, v3}, Lcom/sumsub/sns/internal/features/data/network/prooface/a;->a([B[B)[B

    move-result-object v0

    const/4 v5, 0x2

    invoke-static {v0, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-virtual {v2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    invoke-static {v2}, Lkotlinx/coroutines/z1;->l(Lkotlin/coroutines/CoroutineContext;)V

    .line 48
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/prooface/A;

    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;->livenessFragment:Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;->getType()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/prooface/u;

    invoke-direct {v4, v0}, Lcom/sumsub/sns/internal/features/data/model/prooface/u;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/16 v5, 0x1a

    invoke-direct {v2, v3, v0, v4, v5}, Lcom/sumsub/sns/internal/features/data/model/prooface/A;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/prooface/P;Lcom/sumsub/sns/internal/features/data/model/prooface/u;I)V

    return-object v2
.end method
