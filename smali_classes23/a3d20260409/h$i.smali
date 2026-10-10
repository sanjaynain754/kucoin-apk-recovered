.class public La3d20260409/h$i;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3d20260409/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public final synthetic b:La3d20260409/h;


# direct methods
.method public constructor <init>(La3d20260409/h;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 3
    .line 4
    .line 5
    const-string/jumbo p1, "preprocess_camera_image"

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 4
    .line 5
    :try_start_0
    sget-boolean v0, La3d20260409/s;->d:Z

    .line 6
    .line 7
    new-instance v0, Lk/e;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lk/e;-><init>()V

    .line 11
    .line 12
    :cond_0
    :goto_0
    iget-object v1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, La3d20260409/h;->Z(La3d20260409/h;)Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_5

    .line 19
    .line 20
    iget-object v1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, La3d20260409/h;->g0(La3d20260409/h;)Ljava/util/concurrent/BlockingQueue;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, La3d20260409/h;->g0(La3d20260409/h;)Ljava/util/concurrent/BlockingQueue;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 35
    .line 36
    const-wide/16 v3, 0x1e

    .line 37
    .line 38
    .line 39
    invoke-interface {v1, v3, v4, v2}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    check-cast v1, La3d20260409/d;

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, La3d20260409/h;->n0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    move-result-wide v2

    .line 62
    .line 63
    new-instance v4, La3d20260409/c;

    .line 64
    .line 65
    .line 66
    invoke-direct {v4, v1}, La3d20260409/c;-><init>(La3d20260409/d;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, La3d20260409/c;->a()V

    .line 70
    .line 71
    iget-object v5, v4, La3d20260409/c;->a:[B

    .line 72
    .line 73
    if-nez v5, :cond_2

    .line 74
    goto :goto_0

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    move-result-wide v5

    .line 79
    sub-long/2addr v5, v2

    .line 80
    long-to-int v2, v5

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v2}, Lk/e;->e(I)V

    .line 84
    .line 85
    iget-object v3, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, La3d20260409/h;->l(La3d20260409/h;)Lwe0/g;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v2}, Lwe0/g;->c(I)V

    .line 93
    .line 94
    iget-object v2, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 95
    .line 96
    .line 97
    invoke-static {v2}, La3d20260409/h;->u0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 98
    move-result-object v2

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 102
    move-result v2

    .line 103
    .line 104
    iget-object v3, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 105
    .line 106
    iget-object v3, v3, La3d20260409/h;->j:La3d20260409/f;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v2}, La3d20260409/f;->x(I)V

    .line 110
    .line 111
    iget-object v3, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 112
    .line 113
    iget-object v3, v3, La3d20260409/h;->j:La3d20260409/f;

    .line 114
    .line 115
    iget v5, v4, La3d20260409/c;->e:I

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v5, v2}, La3d20260409/f;->y(II)V

    .line 119
    .line 120
    sget-object v2, Lintl/oOooooooo0000000000;->OOOOooooo:Lintl/oOooooooo0000000000;

    .line 121
    .line 122
    .line 123
    invoke-static {v2}, La3d20260409/v;->r(Lintl/oOooooooo0000000000;)Z

    .line 124
    move-result v2

    .line 125
    .line 126
    if-eqz v2, :cond_3

    .line 127
    .line 128
    iget-object v2, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 129
    .line 130
    .line 131
    invoke-static {v2}, La3d20260409/h;->f(La3d20260409/h;)Lwe0/c;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v1}, Lwe0/c;->j(La3d20260409/d;)V

    .line 136
    .line 137
    :cond_3
    iget-object v1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 138
    .line 139
    .line 140
    invoke-static {v1}, La3d20260409/h;->T(La3d20260409/h;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    if-eqz v1, :cond_0

    .line 144
    .line 145
    iget-object v1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 146
    .line 147
    .line 148
    invoke-static {v1}, La3d20260409/h;->T(La3d20260409/h;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 149
    move-result-object v1

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    .line 153
    move-result v1

    .line 154
    .line 155
    .line 156
    invoke-static {}, La3d20260409/v;->K()I

    .line 157
    move-result v2

    .line 158
    .line 159
    if-ne v1, v2, :cond_4

    .line 160
    .line 161
    iget-object v1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 162
    .line 163
    .line 164
    invoke-static {v1}, La3d20260409/h;->d0(La3d20260409/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 165
    move-result-object v1

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 169
    .line 170
    iget-object v1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 171
    .line 172
    .line 173
    invoke-static {v1}, La3d20260409/h;->T(La3d20260409/h;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 174
    move-result-object v1

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    .line 178
    .line 179
    :cond_4
    iget-object v1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 180
    .line 181
    .line 182
    invoke-static {v1}, La3d20260409/h;->T(La3d20260409/h;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 183
    move-result-object v1

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v4}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :goto_1
    iget-object v1, p0, La3d20260409/h$i;->b:La3d20260409/h;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v0}, La3d20260409/h;->K(Ljava/lang/Throwable;)V

    .line 194
    :cond_5
    return-void
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
