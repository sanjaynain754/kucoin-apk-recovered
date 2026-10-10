.class public Ls/o0$b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic b:Ls/o0;


# direct methods
.method public constructor <init>(Ls/o0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ls/o0$b;->b:Ls/o0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

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
.end method


# virtual methods
.method public final a(Ls/e1;[B)V
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->isRecordModelLog()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Ls/e1;->j:Ls/c;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls/c;->a()Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget-object v1, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->GOOD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ls/e1;->c([B)Landroid/graphics/Bitmap;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    .line 23
    invoke-static {p2}, Ls/n;->b(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    iput-object p2, p1, Ls/e1;->f:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-void

    .line 28
    :catch_0
    move-exception p1

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Ls/v0;->g(Ljava/lang/Throwable;)V

    .line 32
    :cond_0
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
.end method

.method public run()V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 4
    .line 5
    :cond_0
    :goto_0
    iget-object v0, p0, Ls/o0$b;->b:Ls/o0;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ls/o0;->v(Ls/o0;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Ls/o0$b;->b:Ls/o0;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ls/o0;->w(Ls/o0;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    const-wide/16 v2, 0x1e

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    check-cast v0, Ls/c0;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Ls/o0$b;->b:Ls/o0;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ls/o0;->z(Ls/o0;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    :cond_1
    iget-object v1, v0, Ls/c0;->b:Lai/advance/sdk/global/iqa/lib/data/CropParams;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 50
    move-result-wide v1

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    move-result-wide v3

    .line 55
    .line 56
    iget-object v5, v0, Ls/c0;->a:[B

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->getOutputPictureMinSize()I

    .line 60
    move-result v6

    .line 61
    .line 62
    iget-object v7, v0, Ls/c0;->b:Lai/advance/sdk/global/iqa/lib/data/CropParams;

    .line 63
    .line 64
    iget-object v8, p0, Ls/o0$b;->b:Ls/o0;

    .line 65
    .line 66
    .line 67
    invoke-static {v8}, Ls/o0;->B(Ls/o0;)Ls/g;

    .line 68
    move-result-object v8

    .line 69
    .line 70
    iget-boolean v8, v8, Ls/g;->i:Z

    .line 71
    .line 72
    iget-object v9, p0, Ls/o0$b;->b:Ls/o0;

    .line 73
    .line 74
    .line 75
    invoke-static {v9}, Ls/o0;->B(Ls/o0;)Ls/g;

    .line 76
    move-result-object v9

    .line 77
    .line 78
    iget-boolean v9, v9, Ls/g;->j:Z

    .line 79
    .line 80
    iget v10, v0, Ls/c0;->c:I

    .line 81
    .line 82
    .line 83
    invoke-static/range {v5 .. v10}, Ls/n;->f([BILai/advance/sdk/global/iqa/lib/data/CropParams;ZZI)Landroid/graphics/Bitmap;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    if-nez v5, :cond_2

    .line 87
    goto :goto_0

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-static {v5}, Lk/a;->h(Landroid/graphics/Bitmap;)[B

    .line 91
    move-result-object v6

    .line 92
    .line 93
    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 95
    move-result-wide v7

    .line 96
    sub-long/2addr v7, v3

    .line 97
    long-to-int v3, v7

    .line 98
    .line 99
    iget-object v4, p0, Ls/o0$b;->b:Ls/o0;

    .line 100
    .line 101
    .line 102
    invoke-static {v4}, Ls/o0;->C(Ls/o0;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 103
    move-result-object v4

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 107
    .line 108
    new-instance v4, Ls/e1;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 112
    move-result v7

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 116
    move-result v8

    .line 117
    .line 118
    iget-object v9, p0, Ls/o0$b;->b:Ls/o0;

    .line 119
    .line 120
    .line 121
    invoke-static {v9}, Ls/o0;->F(Ls/o0;)Z

    .line 122
    move-result v9

    .line 123
    .line 124
    .line 125
    invoke-direct {v4, v7, v8, v9}, Ls/e1;-><init>(IIZ)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 129
    .line 130
    iput v3, v4, Ls/e1;->g:I

    .line 131
    .line 132
    .line 133
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 134
    move-result-wide v7

    .line 135
    .line 136
    iget v3, v4, Ls/e1;->c:I

    .line 137
    .line 138
    iget v5, v4, Ls/e1;->d:I

    .line 139
    .line 140
    iget-object v9, p0, Ls/o0$b;->b:Ls/o0;

    .line 141
    .line 142
    .line 143
    invoke-static {v9}, Ls/o0;->B(Ls/o0;)Ls/g;

    .line 144
    move-result-object v9

    .line 145
    .line 146
    iget-object v9, v9, Ls/g;->c:Lai/advance/sdk/global/iqa/lib/enums/CardType;

    .line 147
    .line 148
    iget-object v10, p0, Ls/o0$b;->b:Ls/o0;

    .line 149
    .line 150
    .line 151
    invoke-static {v10}, Ls/o0;->B(Ls/o0;)Ls/g;

    .line 152
    move-result-object v10

    .line 153
    .line 154
    iget-object v10, v10, Ls/g;->a:Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    invoke-static {v6, v3, v5, v9, v10}, Lai/advance/sdk/global/iqa/lib/JNI;->h([BIILai/advance/sdk/global/iqa/lib/enums/CardType;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    move-result-object v3

    .line 159
    .line 160
    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 162
    move-result-wide v9

    .line 163
    sub-long/2addr v9, v7

    .line 164
    long-to-int v5, v9

    .line 165
    .line 166
    iput v5, v4, Ls/e1;->h:I

    .line 167
    .line 168
    iget-object v5, p0, Ls/o0$b;->b:Ls/o0;

    .line 169
    .line 170
    .line 171
    invoke-static {v5}, Ls/o0;->B(Ls/o0;)Ls/g;

    .line 172
    move-result-object v5

    .line 173
    .line 174
    iget-object v5, v5, Ls/g;->a:Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    invoke-static {v3, v5}, Ls/n;->c(Ljava/lang/String;Ljava/lang/String;)Ls/c;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    iput-object v3, v4, Ls/e1;->j:Ls/c;

    .line 181
    .line 182
    iget-object v5, p0, Ls/o0$b;->b:Ls/o0;

    .line 183
    .line 184
    iget-object v5, v5, Ls/o0;->p:Ls/e0;

    .line 185
    .line 186
    iget v7, v4, Ls/e1;->g:I

    .line 187
    .line 188
    iget v8, v4, Ls/e1;->h:I

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Ls/c;->a()Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 192
    move-result-object v3

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v7, v8, v3}, Ls/e0;->f(IILai/advance/sdk/global/iqa/lib/code/ImageWarnCode;)V

    .line 196
    .line 197
    iget-object v3, p0, Ls/o0$b;->b:Ls/o0;

    .line 198
    .line 199
    .line 200
    invoke-static {v3}, Ls/o0;->F(Ls/o0;)Z

    .line 201
    move-result v3

    .line 202
    .line 203
    if-eqz v3, :cond_3

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, v4, v6}, Ls/o0$b;->a(Ls/e1;[B)V

    .line 207
    .line 208
    iget-object v3, v4, Ls/e1;->j:Ls/c;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3}, Ls/c;->a()Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 212
    move-result-object v3

    .line 213
    .line 214
    sget-object v5, Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;->GOOD:Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;

    .line 215
    .line 216
    if-ne v3, v5, :cond_3

    .line 217
    .line 218
    iget-object v0, v0, Ls/c0;->a:[B

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v6, v0}, Ls/e1;->b([B[B)V

    .line 222
    .line 223
    :cond_3
    iget-object v0, p0, Ls/o0$b;->b:Ls/o0;

    .line 224
    .line 225
    .line 226
    invoke-static {v0}, Ls/o0;->H(Ls/o0;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 227
    move-result-object v0

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    .line 231
    move-result v0

    .line 232
    .line 233
    .line 234
    invoke-static {}, Lai/advance/sdk/global/iqa/lib/JNI;->getPreProcessQueueMaxSize()I

    .line 235
    move-result v3

    .line 236
    .line 237
    if-ne v0, v3, :cond_4

    .line 238
    .line 239
    iget-object v0, p0, Ls/o0$b;->b:Ls/o0;

    .line 240
    .line 241
    .line 242
    invoke-static {v0}, Ls/o0;->H(Ls/o0;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    .line 247
    .line 248
    iget-object v0, p0, Ls/o0$b;->b:Ls/o0;

    .line 249
    .line 250
    iget-object v0, v0, Ls/o0;->p:Ls/e0;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Ls/e0;->e()V

    .line 254
    .line 255
    :cond_4
    iget-object v0, p0, Ls/o0$b;->b:Ls/o0;

    .line 256
    .line 257
    .line 258
    invoke-static {v0}, Ls/o0;->H(Ls/o0;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 259
    move-result-object v0

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v4}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 266
    move-result-wide v5

    .line 267
    sub-long/2addr v5, v1

    .line 268
    long-to-int v0, v5

    .line 269
    .line 270
    iput v0, v4, Ls/e1;->i:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    .line 275
    :goto_1
    invoke-static {v0}, Ls/v0;->g(Ljava/lang/Throwable;)V

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    :cond_5
    return-void
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
