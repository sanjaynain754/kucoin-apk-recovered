.class public La6/g0;
.super Ljava/lang/Object;
.source "PoolFactory.java"


# instance fields
.field public final a:La6/e0;

.field public b:Lcom/facebook/imagepipeline/memory/b;

.field public c:La6/i;

.field public d:Lcom/facebook/imagepipeline/memory/b;

.field public e:La6/u;

.field public f:Lcom/facebook/imagepipeline/memory/b;

.field public g:Lz3/h;

.field public h:Lz3/k;

.field public i:Lz3/a;


# direct methods
.method public constructor <init>(La6/e0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, La6/e0;

    .line 10
    .line 11
    iput-object p1, p0, La6/g0;->a:La6/e0;

    .line 12
    return-void
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
.method public final a()Lcom/facebook/imagepipeline/memory/b;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, La6/g0;->b:Lcom/facebook/imagepipeline/memory/b;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    :try_start_0
    const-class v1, Lcom/facebook/imagepipeline/memory/AshmemMemoryChunkPool;

    .line 8
    .line 9
    const-class v2, Lz3/d;

    .line 10
    .line 11
    const-class v3, La6/h0;

    .line 12
    .line 13
    const-class v4, Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 14
    .line 15
    .line 16
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    iget-object v2, p0, La6/g0;->a:La6/e0;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, La6/e0;->i()Lz3/d;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    iget-object v3, p0, La6/g0;->a:La6/e0;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, La6/e0;->g()La6/h0;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    iget-object v4, p0, La6/g0;->a:La6/e0;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, La6/e0;->h()Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    .line 42
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    check-cast v1, Lcom/facebook/imagepipeline/memory/b;

    .line 50
    .line 51
    iput-object v1, p0, La6/g0;->b:Lcom/facebook/imagepipeline/memory/b;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :catch_0
    iput-object v0, p0, La6/g0;->b:Lcom/facebook/imagepipeline/memory/b;

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :catch_1
    iput-object v0, p0, La6/g0;->b:Lcom/facebook/imagepipeline/memory/b;

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :catch_2
    iput-object v0, p0, La6/g0;->b:Lcom/facebook/imagepipeline/memory/b;

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :catch_3
    iput-object v0, p0, La6/g0;->b:Lcom/facebook/imagepipeline/memory/b;

    .line 64
    goto :goto_0

    .line 65
    .line 66
    :catch_4
    iput-object v0, p0, La6/g0;->b:Lcom/facebook/imagepipeline/memory/b;

    .line 67
    .line 68
    :cond_0
    :goto_0
    iget-object v0, p0, La6/g0;->b:Lcom/facebook/imagepipeline/memory/b;

    .line 69
    return-object v0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public b()La6/i;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, La6/g0;->c:La6/i;

    .line 3
    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    iget-object v0, p0, La6/g0;->a:La6/e0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, La6/e0;->e()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x3

    .line 16
    const/4 v3, 0x2

    .line 17
    const/4 v4, 0x1

    .line 18
    .line 19
    .line 20
    sparse-switch v1, :sswitch_data_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :sswitch_0
    const-string v1, "dummy"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    const/4 v0, 0x0

    .line 31
    goto :goto_1

    .line 32
    .line 33
    :sswitch_1
    const-string v1, "dummy_with_tracking"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    move v0, v4

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :sswitch_2
    const-string v1, "experimental"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    move-result v0

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    move v0, v3

    .line 51
    goto :goto_1

    .line 52
    .line 53
    :sswitch_3
    const-string v1, "legacy"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    const/4 v0, 0x4

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :sswitch_4
    const-string v1, "legacy_default_params"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    move-result v0

    .line 68
    .line 69
    if-eqz v0, :cond_0

    .line 70
    move v0, v2

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    :goto_0
    const/4 v0, -0x1

    .line 73
    .line 74
    :goto_1
    if-eqz v0, :cond_5

    .line 75
    .line 76
    if-eq v0, v4, :cond_4

    .line 77
    .line 78
    if-eq v0, v3, :cond_2

    .line 79
    .line 80
    if-eq v0, v2, :cond_1

    .line 81
    .line 82
    new-instance v0, La6/m;

    .line 83
    .line 84
    iget-object v1, p0, La6/g0;->a:La6/e0;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, La6/e0;->i()Lz3/d;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    iget-object v2, p0, La6/g0;->a:La6/e0;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, La6/e0;->c()La6/h0;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    iget-object v3, p0, La6/g0;->a:La6/e0;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, La6/e0;->d()Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    iget-object v4, p0, La6/g0;->a:La6/e0;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, La6/e0;->l()Z

    .line 106
    move-result v4

    .line 107
    .line 108
    .line 109
    invoke-direct {v0, v1, v2, v3, v4}, La6/m;-><init>(Lz3/d;La6/h0;Lcom/facebook/imagepipeline/memory/PoolStatsTracker;Z)V

    .line 110
    .line 111
    iput-object v0, p0, La6/g0;->c:La6/i;

    .line 112
    goto :goto_3

    .line 113
    .line 114
    :cond_1
    new-instance v0, La6/m;

    .line 115
    .line 116
    iget-object v1, p0, La6/g0;->a:La6/e0;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, La6/e0;->i()Lz3/d;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    .line 123
    invoke-static {}, La6/o;->a()La6/h0;

    .line 124
    move-result-object v2

    .line 125
    .line 126
    iget-object v3, p0, La6/g0;->a:La6/e0;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, La6/e0;->d()Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    iget-object v4, p0, La6/g0;->a:La6/e0;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4}, La6/e0;->l()Z

    .line 136
    move-result v4

    .line 137
    .line 138
    .line 139
    invoke-direct {v0, v1, v2, v3, v4}, La6/m;-><init>(Lz3/d;La6/h0;Lcom/facebook/imagepipeline/memory/PoolStatsTracker;Z)V

    .line 140
    .line 141
    iput-object v0, p0, La6/g0;->c:La6/i;

    .line 142
    goto :goto_3

    .line 143
    .line 144
    :cond_2
    new-instance v0, La6/v;

    .line 145
    .line 146
    iget-object v1, p0, La6/g0;->a:La6/e0;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, La6/e0;->b()I

    .line 150
    move-result v1

    .line 151
    .line 152
    iget-object v2, p0, La6/g0;->a:La6/e0;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, La6/e0;->a()I

    .line 156
    move-result v2

    .line 157
    .line 158
    .line 159
    invoke-static {}, La6/b0;->h()La6/b0;

    .line 160
    move-result-object v3

    .line 161
    .line 162
    iget-object v4, p0, La6/g0;->a:La6/e0;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4}, La6/e0;->m()Z

    .line 166
    move-result v4

    .line 167
    .line 168
    if-eqz v4, :cond_3

    .line 169
    .line 170
    iget-object v4, p0, La6/g0;->a:La6/e0;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, La6/e0;->i()Lz3/d;

    .line 174
    move-result-object v4

    .line 175
    goto :goto_2

    .line 176
    :cond_3
    const/4 v4, 0x0

    .line 177
    .line 178
    .line 179
    :goto_2
    invoke-direct {v0, v1, v2, v3, v4}, La6/v;-><init>(IILcom/facebook/imagepipeline/memory/PoolStatsTracker;Lz3/d;)V

    .line 180
    .line 181
    iput-object v0, p0, La6/g0;->c:La6/i;

    .line 182
    goto :goto_3

    .line 183
    .line 184
    :cond_4
    new-instance v0, La6/t;

    .line 185
    .line 186
    .line 187
    invoke-direct {v0}, La6/t;-><init>()V

    .line 188
    .line 189
    iput-object v0, p0, La6/g0;->c:La6/i;

    .line 190
    goto :goto_3

    .line 191
    .line 192
    :cond_5
    new-instance v0, La6/s;

    .line 193
    .line 194
    .line 195
    invoke-direct {v0}, La6/s;-><init>()V

    .line 196
    .line 197
    iput-object v0, p0, La6/g0;->c:La6/i;

    .line 198
    .line 199
    :cond_6
    :goto_3
    iget-object v0, p0, La6/g0;->c:La6/i;

    .line 200
    return-object v0

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
    :sswitch_data_0
    .sparse-switch
        -0x6f64eb86 -> :sswitch_4
        -0x41f50c37 -> :sswitch_3
        -0x181d2318 -> :sswitch_2
        -0x17f85147 -> :sswitch_1
        0x5b804a8 -> :sswitch_0
    .end sparse-switch
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
.end method

.method public c()Lcom/facebook/imagepipeline/memory/b;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, La6/g0;->d:Lcom/facebook/imagepipeline/memory/b;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    :try_start_0
    const-class v1, Lcom/facebook/imagepipeline/memory/BufferMemoryChunkPool;

    .line 8
    .line 9
    const-class v2, Lz3/d;

    .line 10
    .line 11
    const-class v3, La6/h0;

    .line 12
    .line 13
    const-class v4, Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 14
    .line 15
    .line 16
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    iget-object v2, p0, La6/g0;->a:La6/e0;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, La6/e0;->i()Lz3/d;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    iget-object v3, p0, La6/g0;->a:La6/e0;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, La6/e0;->g()La6/h0;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    iget-object v4, p0, La6/g0;->a:La6/e0;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, La6/e0;->h()Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    .line 42
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    check-cast v1, Lcom/facebook/imagepipeline/memory/b;

    .line 50
    .line 51
    iput-object v1, p0, La6/g0;->d:Lcom/facebook/imagepipeline/memory/b;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :catch_0
    iput-object v0, p0, La6/g0;->d:Lcom/facebook/imagepipeline/memory/b;

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :catch_1
    iput-object v0, p0, La6/g0;->d:Lcom/facebook/imagepipeline/memory/b;

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :catch_2
    iput-object v0, p0, La6/g0;->d:Lcom/facebook/imagepipeline/memory/b;

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :catch_3
    iput-object v0, p0, La6/g0;->d:Lcom/facebook/imagepipeline/memory/b;

    .line 64
    goto :goto_0

    .line 65
    .line 66
    :catch_4
    iput-object v0, p0, La6/g0;->d:Lcom/facebook/imagepipeline/memory/b;

    .line 67
    .line 68
    :cond_0
    :goto_0
    iget-object v0, p0, La6/g0;->d:Lcom/facebook/imagepipeline/memory/b;

    .line 69
    return-object v0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public d()La6/u;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, La6/g0;->e:La6/u;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, La6/u;

    .line 7
    .line 8
    iget-object v1, p0, La6/g0;->a:La6/e0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, La6/e0;->i()Lz3/d;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iget-object v2, p0, La6/g0;->a:La6/e0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, La6/e0;->f()La6/h0;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, La6/u;-><init>(Lz3/d;La6/h0;)V

    .line 22
    .line 23
    iput-object v0, p0, La6/g0;->e:La6/u;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, La6/g0;->e:La6/u;

    .line 26
    return-object v0
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
.end method

.method public e()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, La6/g0;->a:La6/e0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, La6/e0;->f()La6/h0;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v0, v0, La6/h0;->g:I

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final f(I)Lcom/facebook/imagepipeline/memory/b;
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La6/g0;->a()Lcom/facebook/imagepipeline/memory/b;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "Invalid MemoryChunkType"

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    throw p1

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, La6/g0;->c()Lcom/facebook/imagepipeline/memory/b;

    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-virtual {p0}, La6/g0;->g()Lcom/facebook/imagepipeline/memory/b;

    .line 30
    move-result-object p1

    .line 31
    return-object p1
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
.end method

.method public g()Lcom/facebook/imagepipeline/memory/b;
    .locals 7

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    const-string v1, "PoolFactory"

    .line 5
    .line 6
    iget-object v2, p0, La6/g0;->f:Lcom/facebook/imagepipeline/memory/b;

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    :try_start_0
    const-class v3, Lcom/facebook/imagepipeline/memory/NativeMemoryChunkPool;

    .line 12
    .line 13
    const-class v4, Lz3/d;

    .line 14
    .line 15
    const-class v5, La6/h0;

    .line 16
    .line 17
    const-class v6, Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 18
    .line 19
    .line 20
    filled-new-array {v4, v5, v6}, [Ljava/lang/Class;

    .line 21
    move-result-object v4

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    iget-object v4, p0, La6/g0;->a:La6/e0;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, La6/e0;->i()Lz3/d;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    iget-object v5, p0, La6/g0;->a:La6/e0;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5}, La6/e0;->g()La6/h0;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    iget-object v6, p0, La6/g0;->a:La6/e0;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6}, La6/e0;->h()Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    .line 46
    filled-new-array {v4, v5, v6}, [Ljava/lang/Object;

    .line 47
    move-result-object v4

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    check-cast v3, Lcom/facebook/imagepipeline/memory/b;

    .line 54
    .line 55
    iput-object v3, p0, La6/g0;->f:Lcom/facebook/imagepipeline/memory/b;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    goto :goto_5

    .line 57
    :catch_0
    move-exception v3

    .line 58
    goto :goto_0

    .line 59
    :catch_1
    move-exception v3

    .line 60
    goto :goto_1

    .line 61
    :catch_2
    move-exception v3

    .line 62
    goto :goto_2

    .line 63
    :catch_3
    move-exception v3

    .line 64
    goto :goto_3

    .line 65
    :catch_4
    move-exception v3

    .line 66
    goto :goto_4

    .line 67
    .line 68
    .line 69
    :goto_0
    invoke-static {v1, v0, v3}, Lx3/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    iput-object v2, p0, La6/g0;->f:Lcom/facebook/imagepipeline/memory/b;

    .line 72
    goto :goto_5

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-static {v1, v0, v3}, Lx3/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    iput-object v2, p0, La6/g0;->f:Lcom/facebook/imagepipeline/memory/b;

    .line 78
    goto :goto_5

    .line 79
    .line 80
    .line 81
    :goto_2
    invoke-static {v1, v0, v3}, Lx3/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    iput-object v2, p0, La6/g0;->f:Lcom/facebook/imagepipeline/memory/b;

    .line 84
    goto :goto_5

    .line 85
    .line 86
    .line 87
    :goto_3
    invoke-static {v1, v0, v3}, Lx3/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    iput-object v2, p0, La6/g0;->f:Lcom/facebook/imagepipeline/memory/b;

    .line 90
    goto :goto_5

    .line 91
    .line 92
    .line 93
    :goto_4
    invoke-static {v1, v0, v3}, Lx3/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    iput-object v2, p0, La6/g0;->f:Lcom/facebook/imagepipeline/memory/b;

    .line 96
    .line 97
    :cond_0
    :goto_5
    iget-object v0, p0, La6/g0;->f:Lcom/facebook/imagepipeline/memory/b;

    .line 98
    return-object v0
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
.end method

.method public h()Lz3/h;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ls5/s;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    xor-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, La6/g0;->i(I)Lz3/h;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public i(I)Lz3/h;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, La6/g0;->g:Lz3/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, La6/g0;->f(I)Lcom/facebook/imagepipeline/memory/b;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    const-string v2, "failed to get pool for chunk type: "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {v0, p1}, Lw3/h;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    new-instance p1, La6/a0;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La6/g0;->j()Lz3/k;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v0, v1}, La6/a0;-><init>(Lcom/facebook/imagepipeline/memory/b;Lz3/k;)V

    .line 38
    .line 39
    iput-object p1, p0, La6/g0;->g:Lz3/h;

    .line 40
    .line 41
    :cond_0
    iget-object p1, p0, La6/g0;->g:Lz3/h;

    .line 42
    return-object p1
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
.end method

.method public j()Lz3/k;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, La6/g0;->h:Lz3/k;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lz3/k;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La6/g0;->k()Lz3/a;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Lz3/k;-><init>(Lz3/a;)V

    .line 14
    .line 15
    iput-object v0, p0, La6/g0;->h:Lz3/k;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, La6/g0;->h:Lz3/k;

    .line 18
    return-object v0
.end method

.method public k()Lz3/a;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, La6/g0;->i:Lz3/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/facebook/imagepipeline/memory/a;

    .line 7
    .line 8
    iget-object v1, p0, La6/g0;->a:La6/e0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, La6/e0;->i()Lz3/d;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iget-object v2, p0, La6/g0;->a:La6/e0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, La6/e0;->j()La6/h0;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    iget-object v3, p0, La6/g0;->a:La6/e0;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, La6/e0;->k()Lcom/facebook/imagepipeline/memory/PoolStatsTracker;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/memory/a;-><init>(Lz3/d;La6/h0;Lcom/facebook/imagepipeline/memory/PoolStatsTracker;)V

    .line 28
    .line 29
    iput-object v0, p0, La6/g0;->i:Lz3/a;

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, La6/g0;->i:Lz3/a;

    .line 32
    return-object v0
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
.end method
