.class public Lcom/facebook/imagepipeline/cache/e;
.super Ljava/lang/Object;
.source "LruCountingMemoryCache.java"

# interfaces
.implements Lcom/facebook/imagepipeline/cache/c;
.implements Lcom/facebook/imagepipeline/cache/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/cache/c<",
        "TK;TV;>;",
        "Lcom/facebook/imagepipeline/cache/f<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/facebook/imagepipeline/cache/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/c$b<",
            "TK;>;"
        }
    .end annotation
.end field

.field public final b:Lq5/i;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq5/i<",
            "TK;",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field public final c:Lq5/i;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq5/i<",
            "TK;",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Map;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lq5/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq5/u<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final f:Lcom/facebook/imagepipeline/cache/f$a;

.field public final g:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Lq5/q;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lq5/q;

.field public i:J

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(Lq5/u;Lcom/facebook/imagepipeline/cache/f$a;Lw3/k;Lcom/facebook/imagepipeline/cache/c$b;ZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq5/u<",
            "TV;>;",
            "Lcom/facebook/imagepipeline/cache/f$a;",
            "Lw3/k<",
            "Lq5/q;",
            ">;",
            "Lcom/facebook/imagepipeline/cache/c$b<",
            "TK;>;ZZ)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/WeakHashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->d:Ljava/util/Map;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/imagepipeline/cache/e;->e:Lq5/u;

    .line 13
    .line 14
    new-instance v0, Lq5/i;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e;->A(Lq5/u;)Lq5/u;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Lq5/i;-><init>(Lq5/u;)V

    .line 22
    .line 23
    iput-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 24
    .line 25
    new-instance v0, Lq5/i;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e;->A(Lq5/u;)Lq5/u;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, p1}, Lq5/i;-><init>(Lq5/u;)V

    .line 33
    .line 34
    iput-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/facebook/imagepipeline/cache/e;->f:Lcom/facebook/imagepipeline/cache/f$a;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/facebook/imagepipeline/cache/e;->g:Lw3/k;

    .line 39
    .line 40
    .line 41
    invoke-interface {p3}, Lw3/k;->get()Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    check-cast p1, Lq5/q;

    .line 45
    .line 46
    const-string p2, "mMemoryCacheParamsSupplier returned null"

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p2}, Lw3/h;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    check-cast p1, Lq5/q;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/facebook/imagepipeline/cache/e;->h:Lq5/q;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 58
    move-result-wide p1

    .line 59
    .line 60
    iput-wide p1, p0, Lcom/facebook/imagepipeline/cache/e;->i:J

    .line 61
    .line 62
    iput-object p4, p0, Lcom/facebook/imagepipeline/cache/e;->a:Lcom/facebook/imagepipeline/cache/c$b;

    .line 63
    .line 64
    iput-boolean p5, p0, Lcom/facebook/imagepipeline/cache/e;->j:Z

    .line 65
    .line 66
    iput-boolean p6, p0, Lcom/facebook/imagepipeline/cache/e;->k:Z

    .line 67
    return-void
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
.end method

.method public static bridge synthetic g(Lcom/facebook/imagepipeline/cache/e;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/facebook/imagepipeline/cache/e;->j:Z

    .line 3
    return p0
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
.end method

.method public static bridge synthetic h(Lcom/facebook/imagepipeline/cache/e;Lcom/facebook/imagepipeline/cache/c$a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e;->y(Lcom/facebook/imagepipeline/cache/c$a;)V

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
.end method

.method public static s(Lcom/facebook/imagepipeline/cache/c$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/c$a;->e:Lcom/facebook/imagepipeline/cache/c$b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lcom/facebook/imagepipeline/cache/c$a;->a:Ljava/lang/Object;

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p0, v1}, Lcom/facebook/imagepipeline/cache/c$b;->a(Ljava/lang/Object;Z)V

    .line 13
    :cond_0
    return-void
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

.method public static t(Lcom/facebook/imagepipeline/cache/c$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/c$a;->e:Lcom/facebook/imagepipeline/cache/c$b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lcom/facebook/imagepipeline/cache/c$a;->a:Ljava/lang/Object;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p0, v1}, Lcom/facebook/imagepipeline/cache/c$b;->a(Ljava/lang/Object;Z)V

    .line 13
    :cond_0
    return-void
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
.method public final A(Lq5/u;)Lq5/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq5/u<",
            "TV;>;)",
            "Lq5/u<",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/cache/e$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/facebook/imagepipeline/cache/e$a;-><init>(Lcom/facebook/imagepipeline/cache/e;Lq5/u;)V

    .line 6
    return-object v0
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

.method public a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    monitor-enter p0

    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lq5/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/cache/c$a;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1, v0}, Lq5/i;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1
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
.end method

.method public b(Ljava/lang/Object;)La4/a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "La4/a<",
            "TV;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    monitor-enter p0

    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lq5/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/cache/c$a;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v2, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p1}, Lq5/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    check-cast p1, Lcom/facebook/imagepipeline/cache/c$a;

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    iget v2, p1, Lcom/facebook/imagepipeline/cache/c$a;->c:I

    .line 29
    const/4 v3, 0x1

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    move v1, v3

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {v1}, Lw3/h;->i(Z)V

    .line 36
    .line 37
    iget-object p1, p1, Lcom/facebook/imagepipeline/cache/c$a;->b:La4/a;

    .line 38
    move v1, v3

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 p1, 0x0

    .line 43
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/facebook/imagepipeline/cache/e;->t(Lcom/facebook/imagepipeline/cache/c$a;)V

    .line 49
    :cond_2
    return-object p1

    .line 50
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p1
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

.method public c(Lw3/i;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/i<",
            "TK;>;)I"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lq5/i;->j(Lw3/i;)Ljava/util/ArrayList;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lq5/i;->j(Lw3/i;)Ljava/util/ArrayList;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e;->o(Ljava/util/ArrayList;)V

    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e;->q(Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/cache/e;->u(Ljava/util/ArrayList;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->v()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->r()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw p1
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

.method public declared-synchronized contains(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lq5/i;->a(Ljava/lang/Object;)Z

    .line 7
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
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

.method public d(Ljava/lang/Object;La4/a;Lcom/facebook/imagepipeline/cache/c$b;)La4/a;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "La4/a<",
            "TV;>;",
            "Lcom/facebook/imagepipeline/cache/c$b<",
            "TK;>;)",
            "La4/a<",
            "TV;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->v()V

    .line 10
    monitor-enter p0

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lq5/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/facebook/imagepipeline/cache/c$a;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lq5/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Lcom/facebook/imagepipeline/cache/c$a;

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lcom/facebook/imagepipeline/cache/e;->n(Lcom/facebook/imagepipeline/cache/c$a;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lcom/facebook/imagepipeline/cache/e;->x(Lcom/facebook/imagepipeline/cache/c$a;)La4/a;

    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_2

    .line 40
    :cond_0
    move-object v1, v2

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p2}, La4/a;->l()Ljava/lang/Object;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    iget-object v4, p0, Lcom/facebook/imagepipeline/cache/e;->e:Lq5/u;

    .line 47
    .line 48
    .line 49
    invoke-interface {v4, v3}, Lq5/u;->a(Ljava/lang/Object;)I

    .line 50
    move-result v3

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v3}, Lcom/facebook/imagepipeline/cache/e;->i(I)Z

    .line 54
    move-result v4

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    iget-boolean v2, p0, Lcom/facebook/imagepipeline/cache/e;->j:Z

    .line 59
    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    .line 63
    invoke-static {p1, p2, v3, p3}, Lcom/facebook/imagepipeline/cache/c$a;->a(Ljava/lang/Object;La4/a;ILcom/facebook/imagepipeline/cache/c$b;)Lcom/facebook/imagepipeline/cache/c$a;

    .line 64
    move-result-object p2

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-static {p1, p2, p3}, Lcom/facebook/imagepipeline/cache/c$a;->b(Ljava/lang/Object;La4/a;Lcom/facebook/imagepipeline/cache/c$b;)Lcom/facebook/imagepipeline/cache/c$a;

    .line 69
    move-result-object p2

    .line 70
    .line 71
    :goto_1
    iget-object p3, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3, p1, p2}, Lq5/i;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p2}, Lcom/facebook/imagepipeline/cache/e;->w(Lcom/facebook/imagepipeline/cache/c$a;)La4/a;

    .line 78
    move-result-object v2

    .line 79
    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, La4/a;->j(La4/a;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Lcom/facebook/imagepipeline/cache/e;->t(Lcom/facebook/imagepipeline/cache/c$a;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->r()V

    .line 89
    return-object v2

    .line 90
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    throw p1
    .line 92
    .line 93
.end method

.method public e(Ljava/lang/Object;La4/a;)La4/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "La4/a<",
            "TV;>;)",
            "La4/a<",
            "TV;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->a:Lcom/facebook/imagepipeline/cache/c$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/imagepipeline/cache/e;->d(Ljava/lang/Object;La4/a;Lcom/facebook/imagepipeline/cache/c$b;)La4/a;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method

.method public declared-synchronized f(Lw3/i;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/i<",
            "TK;>;)Z"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lq5/i;->e(Lw3/i;)Ljava/util/ArrayList;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    xor-int/lit8 p1, p1, 0x1

    .line 14
    monitor-exit p0

    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public get(Ljava/lang/Object;)La4/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "La4/a<",
            "TV;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    monitor-enter p0

    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lq5/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/cache/c$a;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lq5/i;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast p1, Lcom/facebook/imagepipeline/cache/c$a;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e;->w(Lcom/facebook/imagepipeline/cache/c$a;)La4/a;

    .line 26
    move-result-object p1

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/facebook/imagepipeline/cache/e;->t(Lcom/facebook/imagepipeline/cache/c$a;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->v()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->r()V

    .line 41
    return-object p1

    .line 42
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p1
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

.method public final declared-synchronized i(I)Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->h:Lq5/q;

    .line 4
    .line 5
    iget v0, v0, Lq5/q;->e:I

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->k()I

    .line 11
    move-result v0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->h:Lq5/q;

    .line 14
    .line 15
    iget v1, v1, Lq5/q;->b:I

    .line 16
    const/4 v2, 0x1

    .line 17
    sub-int/2addr v1, v2

    .line 18
    .line 19
    if-gt v0, v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->l()I

    .line 23
    move-result v0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->h:Lq5/q;

    .line 26
    .line 27
    iget v1, v1, Lq5/q;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    sub-int/2addr v1, p1

    .line 29
    .line 30
    if-gt v0, v1, :cond_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/4 v2, 0x0

    .line 35
    :goto_0
    monitor-exit p0

    .line 36
    return v2

    .line 37
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw p1
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

.method public final declared-synchronized j(Lcom/facebook/imagepipeline/cache/c$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    iget v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->c:I

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    move v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0}, Lw3/h;->i(Z)V

    .line 16
    .line 17
    iget v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->c:I

    .line 18
    sub-int/2addr v0, v1

    .line 19
    .line 20
    iput v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p1
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
.end method

.method public declared-synchronized k()I
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lq5/i;->c()I

    .line 7
    move-result v0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lq5/i;->c()I

    .line 13
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    sub-int/2addr v0, v1

    .line 15
    monitor-exit p0

    .line 16
    return v0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
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

.method public declared-synchronized l()I
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lq5/i;->f()I

    .line 7
    move-result v0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lq5/i;->f()I

    .line 13
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    sub-int/2addr v0, v1

    .line 15
    monitor-exit p0

    .line 16
    return v0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
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

.method public final declared-synchronized m(Lcom/facebook/imagepipeline/cache/c$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->d:Z

    .line 7
    .line 8
    xor-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lw3/h;->i(Z)V

    .line 12
    .line 13
    iget v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->c:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    iput v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
    .line 23
.end method

.method public final declared-synchronized n(Lcom/facebook/imagepipeline/cache/c$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->d:Z

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lw3/h;->i(Z)V

    .line 12
    .line 13
    iput-boolean v1, p1, Lcom/facebook/imagepipeline/cache/c$a;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final declared-synchronized o(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    check-cast v0, Lcom/facebook/imagepipeline/cache/c$a;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/cache/e;->n(Lcom/facebook/imagepipeline/cache/c$a;)V

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1

    .line 27
    :cond_0
    monitor-exit p0

    .line 28
    return-void
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
.end method

.method public final declared-synchronized p(Lcom/facebook/imagepipeline/cache/c$a;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;)Z"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->d:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->c:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 12
    .line 13
    iget-object v1, p1, Lcom/facebook/imagepipeline/cache/c$a;->a:Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Lq5/i;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    monitor-exit p0

    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    monitor-exit p0

    .line 23
    const/4 p1, 0x0

    .line 24
    return p1

    .line 25
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p1
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
.end method

.method public final q(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/facebook/imagepipeline/cache/c$a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/cache/e;->x(Lcom/facebook/imagepipeline/cache/c$a;)La4/a;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, La4/a;->j(La4/a;)V

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
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
.end method

.method public r()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->h:Lq5/q;

    .line 4
    .line 5
    iget v1, v0, Lq5/q;->d:I

    .line 6
    .line 7
    iget v0, v0, Lq5/q;->b:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->k()I

    .line 11
    move-result v2

    .line 12
    sub-int/2addr v0, v2

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 16
    move-result v0

    .line 17
    .line 18
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->h:Lq5/q;

    .line 19
    .line 20
    iget v2, v1, Lq5/q;->c:I

    .line 21
    .line 22
    iget v1, v1, Lq5/q;->a:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->l()I

    .line 26
    move-result v3

    .line 27
    sub-int/2addr v1, v3

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 31
    move-result v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lcom/facebook/imagepipeline/cache/e;->z(II)Ljava/util/ArrayList;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/cache/e;->o(Ljava/util/ArrayList;)V

    .line 39
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/cache/e;->q(Ljava/util/ArrayList;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/cache/e;->u(Ljava/util/ArrayList;)V

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw v0
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

.method public final u(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/facebook/imagepipeline/cache/c$a;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/facebook/imagepipeline/cache/e;->t(Lcom/facebook/imagepipeline/cache/c$a;)V

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final declared-synchronized v()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/facebook/imagepipeline/cache/e;->i:J

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/imagepipeline/cache/e;->h:Lq5/q;

    .line 6
    .line 7
    iget-wide v2, v2, Lq5/q;->f:J

    .line 8
    add-long/2addr v0, v2

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 12
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 22
    move-result-wide v0

    .line 23
    .line 24
    iput-wide v0, p0, Lcom/facebook/imagepipeline/cache/e;->i:J

    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->g:Lw3/k;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lw3/k;->get()Ljava/lang/Object;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Lq5/q;

    .line 33
    .line 34
    const-string v1, "mMemoryCacheParamsSupplier returned null"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lw3/h;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    check-cast v0, Lq5/q;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->h:Lq5/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    throw v0
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

.method public final declared-synchronized w(Lcom/facebook/imagepipeline/cache/c$a;)La4/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;)",
            "La4/a<",
            "TV;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e;->m(Lcom/facebook/imagepipeline/cache/c$a;)V

    .line 5
    .line 6
    iget-object v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->b:La4/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, La4/a;->l()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    new-instance v1, Lcom/facebook/imagepipeline/cache/e$b;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lcom/facebook/imagepipeline/cache/e$b;-><init>(Lcom/facebook/imagepipeline/cache/e;Lcom/facebook/imagepipeline/cache/c$a;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, La4/a;->u(Ljava/lang/Object;La4/h;)La4/a;

    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit p0

    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1
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
.end method

.method public final declared-synchronized x(Lcom/facebook/imagepipeline/cache/c$a;)La4/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;)",
            "La4/a<",
            "TV;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    iget-boolean v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget v0, p1, Lcom/facebook/imagepipeline/cache/c$a;->c:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Lcom/facebook/imagepipeline/cache/c$a;->b:La4/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    monitor-exit p0

    .line 20
    return-object p1

    .line 21
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
    .line 23
.end method

.method public final y(Lcom/facebook/imagepipeline/cache/c$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    monitor-enter p0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e;->j(Lcom/facebook/imagepipeline/cache/c$a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e;->p(Lcom/facebook/imagepipeline/cache/c$a;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/e;->x(Lcom/facebook/imagepipeline/cache/c$a;)La4/a;

    .line 15
    move-result-object v1

    .line 16
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, La4/a;->j(La4/a;)V

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {p1}, Lcom/facebook/imagepipeline/cache/e;->s(Lcom/facebook/imagepipeline/cache/c$a;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->v()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/cache/e;->r()V

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    :try_start_1
    monitor-exit p0
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

.method public final declared-synchronized z(II)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/imagepipeline/cache/c$a<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 10
    move-result p2

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lq5/i;->c()I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-gt v0, p1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lq5/i;->f()I

    .line 24
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    if-gt v0, p2, :cond_0

    .line 27
    monitor-exit p0

    .line 28
    const/4 p1, 0x0

    .line 29
    return-object p1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    .line 33
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    :goto_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lq5/i;->c()I

    .line 42
    move-result v1

    .line 43
    .line 44
    if-gt v1, p1, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lq5/i;->f()I

    .line 50
    move-result v1

    .line 51
    .line 52
    if-le v1, p2, :cond_2

    .line 53
    .line 54
    :cond_1
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lq5/i;->d()Ljava/lang/Object;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    if-nez v1, :cond_4

    .line 61
    .line 62
    iget-boolean p1, p0, Lcom/facebook/imagepipeline/cache/e;->k:Z

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    iget-object p1, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lq5/i;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    :cond_2
    monitor-exit p0

    .line 71
    return-object v0

    .line 72
    .line 73
    :cond_3
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string p2, "key is null, but exclusiveEntries count: %d, size: %d"

    .line 76
    .line 77
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lq5/i;->c()I

    .line 81
    move-result v0

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lq5/i;->f()I

    .line 91
    move-result v1

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    .line 98
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    .line 102
    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    move-result-object p2

    .line 104
    .line 105
    .line 106
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    throw p1

    .line 108
    .line 109
    :cond_4
    iget-object v2, p0, Lcom/facebook/imagepipeline/cache/e;->b:Lq5/i;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v1}, Lq5/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    iget-object v2, p0, Lcom/facebook/imagepipeline/cache/e;->c:Lq5/i;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v1}, Lq5/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    check-cast v1, Lcom/facebook/imagepipeline/cache/c$a;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    goto :goto_0

    .line 125
    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    throw p1
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
.end method
