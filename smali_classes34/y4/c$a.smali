.class public final Ly4/c$a;
.super Ljava/lang/Object;
.source "DefaultBitmapFramePreparer.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Ly4/c$a;",
        "Ljava/lang/Runnable;",
        "Lv4/a;",
        "animationBackend",
        "Lw4/a;",
        "bitmapFrameCache",
        "",
        "frameNumber",
        "frameId",
        "<init>",
        "(Ly4/c;Lv4/a;Lw4/a;II)V",
        "",
        "run",
        "()V",
        "frameType",
        "",
        "a",
        "(II)Z",
        "La4/a;",
        "Landroid/graphics/Bitmap;",
        "bitmapReference",
        "b",
        "(ILa4/a;I)Z",
        "Lv4/a;",
        "c",
        "Lw4/a;",
        "d",
        "I",
        "e",
        "animated-drawable_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDefaultBitmapFramePreparer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultBitmapFramePreparer.kt\ncom/facebook/fresco/animation/bitmap/preparation/DefaultBitmapFramePreparer$FrameDecodeRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lv4/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lw4/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:I

.field public final e:I

.field public final synthetic f:Ly4/c;


# direct methods
.method public constructor <init>(Ly4/c;Lv4/a;Lw4/a;II)V
    .locals 1
    .param p1    # Ly4/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lv4/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv4/a;",
            "Lw4/a;",
            "II)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "animationBackend"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "bitmapFrameCache"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object p1, p0, Ly4/c$a;->f:Ly4/c;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    iput-object p2, p0, Ly4/c$a;->b:Lv4/a;

    .line 18
    .line 19
    iput-object p3, p0, Ly4/c$a;->c:Lw4/a;

    .line 20
    .line 21
    iput p4, p0, Ly4/c$a;->d:I

    .line 22
    .line 23
    iput p5, p0, Ly4/c$a;->e:I

    .line 24
    return-void
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
.end method


# virtual methods
.method public final a(II)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x0

    .line 5
    .line 6
    if-eq p2, v0, :cond_1

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    if-eq p2, v2, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {v3}, La4/a;->j(La4/a;)V

    .line 13
    return v0

    .line 14
    .line 15
    :cond_0
    :try_start_0
    iget-object v2, p0, Ly4/c$a;->f:Ly4/c;

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Ly4/c;->e(Ly4/c;)Lp5/c;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    iget-object v4, p0, Ly4/c$a;->b:Lv4/a;

    .line 22
    .line 23
    .line 24
    invoke-interface {v4}, Lv4/a;->c()I

    .line 25
    move-result v4

    .line 26
    .line 27
    iget-object v5, p0, Ly4/c$a;->b:Lv4/a;

    .line 28
    .line 29
    .line 30
    invoke-interface {v5}, Lv4/a;->d()I

    .line 31
    move-result v5

    .line 32
    .line 33
    iget-object v6, p0, Ly4/c$a;->f:Ly4/c;

    .line 34
    .line 35
    .line 36
    invoke-static {v6}, Ly4/c;->b(Ly4/c;)Landroid/graphics/Bitmap$Config;

    .line 37
    move-result-object v6

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v4, v5, v6}, Lp5/c;->b(IILandroid/graphics/Bitmap$Config;)La4/a;

    .line 41
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    move v2, v1

    .line 43
    :goto_0
    move-object v3, v0

    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_3

    .line 47
    :catch_0
    move-exception p1

    .line 48
    .line 49
    :try_start_1
    iget-object p2, p0, Ly4/c$a;->f:Ly4/c;

    .line 50
    .line 51
    .line 52
    invoke-static {p2}, Ly4/c;->f(Ly4/c;)Ljava/lang/Class;

    .line 53
    move-result-object p2

    .line 54
    .line 55
    const-string v1, "Failed to create frame bitmap"

    .line 56
    .line 57
    .line 58
    invoke-static {p2, v1, p1}, Lx3/a;->F(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    invoke-static {v3}, La4/a;->j(La4/a;)V

    .line 62
    return v0

    .line 63
    .line 64
    :cond_1
    :try_start_2
    iget-object v0, p0, Ly4/c$a;->c:Lw4/a;

    .line 65
    .line 66
    iget-object v4, p0, Ly4/c$a;->b:Lv4/a;

    .line 67
    .line 68
    .line 69
    invoke-interface {v4}, Lv4/a;->c()I

    .line 70
    move-result v4

    .line 71
    .line 72
    iget-object v5, p0, Ly4/c$a;->b:Lv4/a;

    .line 73
    .line 74
    .line 75
    invoke-interface {v5}, Lv4/a;->d()I

    .line 76
    move-result v5

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, p1, v4, v5}, Lw4/a;->d(III)La4/a;

    .line 80
    move-result-object v0

    .line 81
    goto :goto_0

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {p0, p1, v3, p2}, Ly4/c$a;->b(ILa4/a;I)Z

    .line 85
    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, La4/a;->j(La4/a;)V

    .line 89
    .line 90
    if-nez p2, :cond_3

    .line 91
    .line 92
    if-ne v2, v1, :cond_2

    .line 93
    goto :goto_2

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-virtual {p0, p1, v2}, Ly4/c$a;->a(II)Z

    .line 97
    move-result p1

    .line 98
    return p1

    .line 99
    :cond_3
    :goto_2
    return p2

    .line 100
    .line 101
    .line 102
    :goto_3
    invoke-static {v3}, La4/a;->j(La4/a;)V

    .line 103
    throw p1
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
.end method

.method public final b(ILa4/a;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "La4/a<",
            "Landroid/graphics/Bitmap;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, La4/a;->o(La4/a;)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    :cond_0
    if-eqz p2, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Ly4/c$a;->f:Ly4/c;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ly4/c;->c(Ly4/c;)Lw4/b;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, La4/a;->l()Ljava/lang/Object;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    const-string v3, "get(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    check-cast v2, Landroid/graphics/Bitmap;

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, p1, v2}, Lw4/b;->a(ILandroid/graphics/Bitmap;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Ly4/c$a;->f:Ly4/c;

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Ly4/c;->f(Ly4/c;)Ljava/lang/Class;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    const-string v1, "Frame %d ready."

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1, v2}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    iget-object v0, p0, Ly4/c$a;->f:Ly4/c;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ly4/c;->d(Ly4/c;)Landroid/util/SparseArray;

    .line 55
    move-result-object v0

    .line 56
    monitor-enter v0

    .line 57
    .line 58
    :try_start_0
    iget-object v1, p0, Ly4/c$a;->c:Lw4/a;

    .line 59
    .line 60
    .line 61
    invoke-interface {v1, p1, p2, p3}, Lw4/a;->e(ILa4/a;I)V

    .line 62
    .line 63
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    monitor-exit v0

    .line 65
    const/4 p1, 0x1

    .line 66
    return p1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    monitor-exit v0

    .line 69
    throw p1

    .line 70
    :cond_2
    :goto_0
    return v1
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
.end method

.method public run()V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Ly4/c$a;->c:Lw4/a;

    .line 3
    .line 4
    iget v1, p0, Ly4/c$a;->d:I

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1}, Lw4/a;->contains(I)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Ly4/c$a;->f:Ly4/c;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ly4/c;->f(Ly4/c;)Ljava/lang/Class;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    const-string v1, "Frame %d is cached already."

    .line 19
    .line 20
    iget v2, p0, Ly4/c$a;->d:I

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    .line 29
    iget-object v0, p0, Ly4/c$a;->f:Ly4/c;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ly4/c;->d(Ly4/c;)Landroid/util/SparseArray;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    iget-object v1, p0, Ly4/c$a;->f:Ly4/c;

    .line 36
    monitor-enter v0

    .line 37
    .line 38
    .line 39
    :try_start_1
    invoke-static {v1}, Ly4/c;->d(Ly4/c;)Landroid/util/SparseArray;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    iget v2, p0, Ly4/c$a;->e:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 46
    .line 47
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    monitor-exit v0

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception v1

    .line 51
    monitor-exit v0

    .line 52
    throw v1

    .line 53
    :catchall_1
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_0
    :try_start_2
    iget v0, p0, Ly4/c$a;->d:I

    .line 57
    const/4 v1, 0x1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0, v1}, Ly4/c$a;->a(II)Z

    .line 61
    move-result v0

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    iget-object v0, p0, Ly4/c$a;->f:Ly4/c;

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ly4/c;->f(Ly4/c;)Ljava/lang/Class;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    const-string v1, "Prepared frame %d."

    .line 72
    .line 73
    iget v2, p0, Ly4/c$a;->d:I

    .line 74
    .line 75
    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1, v2}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :cond_1
    iget-object v0, p0, Ly4/c$a;->f:Ly4/c;

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Ly4/c;->f(Ly4/c;)Ljava/lang/Class;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    const-string v1, "Could not prepare frame %d."

    .line 90
    .line 91
    iget v2, p0, Ly4/c$a;->d:I

    .line 92
    .line 93
    .line 94
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    move-result-object v2

    .line 96
    .line 97
    .line 98
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 99
    move-result-object v2

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v1, v2}, Lx3/a;->k(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    .line 104
    :goto_0
    iget-object v0, p0, Ly4/c$a;->f:Ly4/c;

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Ly4/c;->d(Ly4/c;)Landroid/util/SparseArray;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    iget-object v1, p0, Ly4/c$a;->f:Ly4/c;

    .line 111
    monitor-enter v0

    .line 112
    .line 113
    .line 114
    :try_start_3
    invoke-static {v1}, Ly4/c;->d(Ly4/c;)Landroid/util/SparseArray;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    iget v2, p0, Ly4/c$a;->e:I

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 121
    .line 122
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    monitor-exit v0

    .line 124
    return-void

    .line 125
    :catchall_2
    move-exception v1

    .line 126
    monitor-exit v0

    .line 127
    throw v1

    .line 128
    .line 129
    :goto_1
    iget-object v1, p0, Ly4/c$a;->f:Ly4/c;

    .line 130
    .line 131
    .line 132
    invoke-static {v1}, Ly4/c;->d(Ly4/c;)Landroid/util/SparseArray;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    iget-object v2, p0, Ly4/c$a;->f:Ly4/c;

    .line 136
    monitor-enter v1

    .line 137
    .line 138
    .line 139
    :try_start_4
    invoke-static {v2}, Ly4/c;->d(Ly4/c;)Landroid/util/SparseArray;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    iget v3, p0, Ly4/c$a;->e:I

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->remove(I)V

    .line 146
    .line 147
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 148
    monitor-exit v1

    .line 149
    throw v0

    .line 150
    :catchall_3
    move-exception v0

    .line 151
    monitor-exit v1

    .line 152
    throw v0
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
