.class Lcom/datavisorobfus/l$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/datavisorobfus/l$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/datavisorobfus/l$a;


# direct methods
.method public constructor <init>(Lcom/datavisorobfus/l$a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/datavisorobfus/l$a$a;->a:Lcom/datavisorobfus/l$a;

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
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 1
    .line 2
    const-string v0, "c"

    .line 3
    .line 4
    const-string v1, "1"

    .line 5
    .line 6
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-string/jumbo v3, "pretoken"

    .line 16
    .line 17
    .line 18
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 26
    move-result-wide v4

    .line 27
    .line 28
    iput-wide v4, v3, Lcom/datavisorobfus/i;->j:J

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    iget-object v3, v3, Lcom/datavisorobfus/i;->g:[B

    .line 35
    .line 36
    iget-object v4, p0, Lcom/datavisorobfus/l$a$a;->a:Lcom/datavisorobfus/l$a;

    .line 37
    .line 38
    iget-object v4, v4, Lcom/datavisorobfus/l$a;->b:Lcom/datavisorobfus/l;

    .line 39
    .line 40
    .line 41
    invoke-static {v4}, Lcom/datavisorobfus/l;->a(Lcom/datavisorobfus/l;)Landroid/content/Context;

    .line 42
    move-result-object v4

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3, v4}, Lcom/datavisorobfus/r0;->c(Ljava/util/Map;[BLandroid/content/Context;)Lcom/datavisorobfus/s0;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 54
    move-result-wide v4

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    iget-wide v6, v6, Lcom/datavisorobfus/i;->j:J

    .line 61
    sub-long/2addr v4, v6

    .line 62
    .line 63
    .line 64
    const-wide/32 v6, 0xf4240

    .line 65
    div-long/2addr v4, v6

    .line 66
    .line 67
    iput-wide v4, v3, Lcom/datavisorobfus/i;->j:J

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 71
    move-result-object v3

    .line 72
    const/4 v4, 0x0

    .line 73
    .line 74
    iput-object v4, v3, Lcom/datavisorobfus/i;->g:[B

    .line 75
    .line 76
    new-instance v3, Lcom/datavisorobfus/p0;

    .line 77
    .line 78
    iget-object v5, p0, Lcom/datavisorobfus/l$a$a;->a:Lcom/datavisorobfus/l$a;

    .line 79
    .line 80
    iget-object v5, v5, Lcom/datavisorobfus/l$a;->b:Lcom/datavisorobfus/l;

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Lcom/datavisorobfus/l;->a(Lcom/datavisorobfus/l;)Landroid/content/Context;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    invoke-direct {v3, v5, v2}, Lcom/datavisorobfus/p0;-><init>(Landroid/content/Context;Lcom/datavisorobfus/s0;)V

    .line 88
    .line 89
    iget v2, v3, Lcom/datavisorobfus/p0;->h:I

    .line 90
    .line 91
    if-nez v2, :cond_0

    .line 92
    .line 93
    iget-object v2, p0, Lcom/datavisorobfus/l$a$a;->a:Lcom/datavisorobfus/l$a;

    .line 94
    .line 95
    iget-object v2, v2, Lcom/datavisorobfus/l$a;->b:Lcom/datavisorobfus/l;

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Lcom/datavisorobfus/l;->a(Lcom/datavisorobfus/l;)Landroid/content/Context;

    .line 99
    move-result-object v2

    .line 100
    .line 101
    .line 102
    invoke-static {v2}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    .line 103
    move-result-object v2

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v3}, Lcom/datavisorobfus/y0;->a(Lcom/datavisorobfus/p0;)V

    .line 107
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    .line 110
    goto/16 :goto_2

    .line 111
    .line 112
    .line 113
    :cond_0
    :goto_0
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 114
    move-result-object v2

    .line 115
    .line 116
    .line 117
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 118
    move-result-wide v8

    .line 119
    .line 120
    .line 121
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 122
    move-result-object v5

    .line 123
    .line 124
    iget-wide v10, v5, Lcom/datavisorobfus/i;->i:J

    .line 125
    sub-long/2addr v8, v10

    .line 126
    div-long/2addr v8, v6

    .line 127
    .line 128
    iput-wide v8, v2, Lcom/datavisorobfus/i;->i:J

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    iget-object v5, p0, Lcom/datavisorobfus/l$a$a;->a:Lcom/datavisorobfus/l$a;

    .line 135
    .line 136
    iget-object v5, v5, Lcom/datavisorobfus/l$a;->b:Lcom/datavisorobfus/l;

    .line 137
    .line 138
    .line 139
    invoke-static {v5}, Lcom/datavisorobfus/l;->a(Lcom/datavisorobfus/l;)Landroid/content/Context;

    .line 140
    move-result-object v5

    .line 141
    .line 142
    iget v6, v3, Lcom/datavisorobfus/p0;->h:I

    .line 143
    .line 144
    iget-object v7, v3, Lcom/datavisorobfus/p0;->g:Ljava/lang/Throwable;

    .line 145
    .line 146
    iget-object v8, p0, Lcom/datavisorobfus/l$a$a;->a:Lcom/datavisorobfus/l$a;

    .line 147
    .line 148
    iget-object v8, v8, Lcom/datavisorobfus/l$a;->a:Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v5, v6, v7, v8}, Lcom/datavisorobfus/i;->a(Landroid/content/Context;ILjava/lang/Throwable;Ljava/lang/String;)V

    .line 152
    .line 153
    iget v2, v3, Lcom/datavisorobfus/p0;->h:I

    .line 154
    .line 155
    if-eqz v2, :cond_1

    .line 156
    .line 157
    .line 158
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 159
    move-result-object v0

    .line 160
    const/4 v1, 0x0

    .line 161
    .line 162
    iput-boolean v1, v0, Lcom/datavisorobfus/i;->f:Z

    .line 163
    .line 164
    .line 165
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 166
    move-result-object v0

    .line 167
    .line 168
    iget-object v0, v0, Lcom/datavisorobfus/i;->e:Ljava/util/concurrent/CyclicBarrier;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/util/concurrent/CyclicBarrier;->await()I

    .line 172
    return-void

    .line 173
    .line 174
    .line 175
    :cond_1
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 176
    move-result-object v2

    .line 177
    const/4 v5, 0x1

    .line 178
    .line 179
    iput-boolean v5, v2, Lcom/datavisorobfus/i;->f:Z

    .line 180
    .line 181
    .line 182
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 183
    move-result-object v2

    .line 184
    .line 185
    iget-object v2, v2, Lcom/datavisorobfus/i;->e:Ljava/util/concurrent/CyclicBarrier;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/util/concurrent/CyclicBarrier;->await()I

    .line 189
    .line 190
    .line 191
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 192
    move-result-object v2

    .line 193
    .line 194
    iget-object v2, v2, Lcom/datavisorobfus/i;->e:Ljava/util/concurrent/CyclicBarrier;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2}, Ljava/util/concurrent/CyclicBarrier;->await()I

    .line 198
    .line 199
    iget-object v2, v3, Lcom/datavisorobfus/p0;->f:Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    invoke-static {v2}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    .line 203
    move-result v2

    .line 204
    .line 205
    if-eqz v2, :cond_3

    .line 206
    .line 207
    .line 208
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 209
    move-result-object v2

    .line 210
    .line 211
    iget-object v2, v2, Lcom/datavisorobfus/i;->h:[B

    .line 212
    .line 213
    if-eqz v2, :cond_3

    .line 214
    .line 215
    new-instance v2, Ljava/util/HashMap;

    .line 216
    .line 217
    .line 218
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    const-string/jumbo v0, "ut"

    .line 225
    .line 226
    iget-object v1, v3, Lcom/datavisorobfus/p0;->f:Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 233
    move-result-object v0

    .line 234
    .line 235
    iget-object v0, v0, Lcom/datavisorobfus/i;->h:[B

    .line 236
    .line 237
    iget-object v1, p0, Lcom/datavisorobfus/l$a$a;->a:Lcom/datavisorobfus/l$a;

    .line 238
    .line 239
    iget-object v1, v1, Lcom/datavisorobfus/l$a;->b:Lcom/datavisorobfus/l;

    .line 240
    .line 241
    .line 242
    invoke-static {v1}, Lcom/datavisorobfus/l;->a(Lcom/datavisorobfus/l;)Landroid/content/Context;

    .line 243
    move-result-object v1

    .line 244
    .line 245
    .line 246
    invoke-static {v2, v0, v1}, Lcom/datavisorobfus/r0;->b(Ljava/util/Map;[BLandroid/content/Context;)Lcom/datavisorobfus/s0;

    .line 247
    move-result-object v0

    .line 248
    .line 249
    if-eqz v0, :cond_2

    .line 250
    .line 251
    new-instance v1, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const-string/jumbo v2, "\u4e0a\u62a5DynamicData status"

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    iget v0, v0, Lcom/datavisorobfus/s0;->c:I

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    move-result-object v0

    .line 270
    goto :goto_1

    .line 271
    .line 272
    .line 273
    :cond_2
    const-string/jumbo v0, "\u4e0a\u62a5DynamicData status resultSecond is null"

    .line 274
    .line 275
    .line 276
    :goto_1
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 280
    move-result-object v0

    .line 281
    .line 282
    iput-object v4, v0, Lcom/datavisorobfus/i;->h:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 283
    return-void

    .line 284
    .line 285
    :goto_2
    iget-object v1, p0, Lcom/datavisorobfus/l$a$a;->a:Lcom/datavisorobfus/l$a;

    .line 286
    .line 287
    iget-object v1, v1, Lcom/datavisorobfus/l$a;->b:Lcom/datavisorobfus/l;

    .line 288
    .line 289
    .line 290
    invoke-static {v1}, Lcom/datavisorobfus/l;->a(Lcom/datavisorobfus/l;)Landroid/content/Context;

    .line 291
    move-result-object v1

    .line 292
    .line 293
    .line 294
    const-string/jumbo v2, "singleThreadVangoghRealPost"

    .line 295
    .line 296
    .line 297
    invoke-static {v2, v0, v1}, Lcom/datavisor/vangogh/util/ExceptionUtil;->b(Ljava/lang/String;Ljava/lang/Throwable;Landroid/content/Context;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 301
    :cond_3
    return-void
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
.end method
