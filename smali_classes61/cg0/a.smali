.class public final Lcg0/a;
.super Ljava/lang/Object;
.source "BlurUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicx/widget/utils/BlurUtils;",
        "",
        "<init>",
        "()V",
        "SAMPLING",
        "",
        "blur",
        "Landroid/graphics/Bitmap;",
        "context",
        "Landroid/content/Context;",
        "pool",
        "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;",
        "toTransform",
        "radius",
        "",
        "bitmap",
        "fastBlur",
        "sentBitmap",
        "canReuseInBitmap",
        "",
        "atomic_x_googleRelease"
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
.field public static final a:Lcg0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcg0/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcg0/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcg0/a;->a:Lcg0/a;

    .line 8
    return-void
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final a(Landroid/content/Context;Lw1/d;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lw1/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "pool"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v0, "toTransform"

    .line 14
    .line 15
    .line 16
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 24
    move-result v1

    .line 25
    int-to-float v0, v0

    .line 26
    .line 27
    const/high16 v2, 0x41200000    # 10.0f

    .line 28
    div-float/2addr v0, v2

    .line 29
    float-to-int v0, v0

    .line 30
    int-to-float v1, v1

    .line 31
    div-float/2addr v1, v2

    .line 32
    float-to-int v1, v1

    .line 33
    .line 34
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v0, v1, v2}, Lw1/d;->d(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    const-string v0, "get(...)"

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getDensity()I

    .line 47
    move-result v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 51
    .line 52
    new-instance v0, Landroid/graphics/Canvas;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 56
    .line 57
    .line 58
    const v1, 0x3dcccccd    # 0.1f

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 62
    .line 63
    new-instance v1, Landroid/graphics/Paint;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 67
    const/4 v2, 0x2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 71
    const/4 v2, 0x0

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p2, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 75
    const/4 p2, 0x1

    .line 76
    const/4 v0, 0x0

    .line 77
    .line 78
    .line 79
    :try_start_0
    invoke-static {p0}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    .line 80
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 81
    .line 82
    :try_start_1
    new-instance v1, Landroid/renderscript/RenderScript$RSMessageHandler;

    .line 83
    .line 84
    .line 85
    invoke-direct {v1}, Landroid/renderscript/RenderScript$RSMessageHandler;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v1}, Landroid/renderscript/RenderScript;->setMessageHandler(Landroid/renderscript/RenderScript$RSMessageHandler;)V

    .line 89
    .line 90
    sget-object v1, Landroid/renderscript/Allocation$MipmapControl;->MIPMAP_NONE:Landroid/renderscript/Allocation$MipmapControl;

    .line 91
    .line 92
    .line 93
    invoke-static {p0, p1, v1, p2}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;Landroid/renderscript/Allocation$MipmapControl;I)Landroid/renderscript/Allocation;

    .line 94
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 95
    .line 96
    .line 97
    :try_start_2
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    .line 98
    move-result-object v2

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v2}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    .line 102
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    .line 104
    .line 105
    :try_start_3
    invoke-static {p0}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    .line 106
    move-result-object v3

    .line 107
    .line 108
    .line 109
    invoke-static {p0, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    .line 110
    move-result-object v0

    .line 111
    int-to-float v3, p3

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v2}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, p1}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 124
    .line 125
    .line 126
    invoke-static {}, Landroid/renderscript/RenderScript;->releaseAllContexts()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/renderscript/BaseObj;->destroy()V

    .line 136
    return-object p1

    .line 137
    :catchall_0
    move-exception p1

    .line 138
    move-object v4, v0

    .line 139
    move-object v0, p0

    .line 140
    move-object p0, v4

    .line 141
    goto :goto_3

    .line 142
    :catch_0
    move-exception v3

    .line 143
    move-object v4, v0

    .line 144
    move-object v0, p0

    .line 145
    move-object p0, v4

    .line 146
    goto :goto_2

    .line 147
    :catchall_1
    move-exception p1

    .line 148
    move-object v2, v0

    .line 149
    :goto_0
    move-object v0, p0

    .line 150
    move-object p0, v2

    .line 151
    goto :goto_3

    .line 152
    :catch_1
    move-exception v3

    .line 153
    move-object v2, v0

    .line 154
    :goto_1
    move-object v0, p0

    .line 155
    move-object p0, v2

    .line 156
    goto :goto_2

    .line 157
    :catchall_2
    move-exception p1

    .line 158
    move-object v1, v0

    .line 159
    move-object v2, v1

    .line 160
    goto :goto_0

    .line 161
    :catch_2
    move-exception v3

    .line 162
    move-object v1, v0

    .line 163
    move-object v2, v1

    .line 164
    goto :goto_1

    .line 165
    :catchall_3
    move-exception p1

    .line 166
    move-object p0, v0

    .line 167
    move-object v1, p0

    .line 168
    move-object v2, v1

    .line 169
    goto :goto_3

    .line 170
    :catch_3
    move-exception v3

    .line 171
    move-object p0, v0

    .line 172
    move-object v1, p0

    .line 173
    move-object v2, v1

    .line 174
    .line 175
    .line 176
    :goto_2
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 177
    .line 178
    .line 179
    invoke-static {p1, p3, p2}, Lcg0/a;->b(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 180
    .line 181
    if-eqz v0, :cond_0

    .line 182
    .line 183
    .line 184
    invoke-static {}, Landroid/renderscript/RenderScript;->releaseAllContexts()V

    .line 185
    .line 186
    :cond_0
    if-eqz v1, :cond_1

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 190
    .line 191
    :cond_1
    if-eqz v2, :cond_2

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    .line 195
    .line 196
    :cond_2
    if-eqz p0, :cond_3

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Landroid/renderscript/BaseObj;->destroy()V

    .line 200
    :cond_3
    return-object p1

    .line 201
    :catchall_4
    move-exception p1

    .line 202
    .line 203
    :goto_3
    if-eqz v0, :cond_4

    .line 204
    .line 205
    .line 206
    invoke-static {}, Landroid/renderscript/RenderScript;->releaseAllContexts()V

    .line 207
    .line 208
    :cond_4
    if-eqz v1, :cond_5

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 212
    .line 213
    :cond_5
    if-eqz v2, :cond_6

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    .line 217
    .line 218
    :cond_6
    if-eqz p0, :cond_7

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0}, Landroid/renderscript/BaseObj;->destroy()V

    .line 222
    :cond_7
    throw p1
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
.end method

.method public static final b(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
    .locals 36
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "sentBitmap"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    const/4 v2, 0x1

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    move-object v4, v0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v3, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 25
    move-result-object v3

    .line 26
    move-object v4, v3

    .line 27
    .line 28
    :goto_0
    if-ge v1, v2, :cond_1

    .line 29
    return-object v0

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 33
    move-result v7

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 37
    move-result v11

    .line 38
    .line 39
    mul-int v0, v7, v11

    .line 40
    .line 41
    new-array v5, v0, [I

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    move v10, v7

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 49
    .line 50
    add-int/lit8 v3, v7, -0x1

    .line 51
    .line 52
    add-int/lit8 v6, v11, -0x1

    .line 53
    .line 54
    add-int v8, v1, v1

    .line 55
    .line 56
    add-int/lit8 v9, v8, 0x1

    .line 57
    .line 58
    new-array v10, v0, [I

    .line 59
    .line 60
    new-array v12, v0, [I

    .line 61
    .line 62
    new-array v0, v0, [I

    .line 63
    .line 64
    .line 65
    invoke-static {v7, v11}, Ljava/lang/Math;->max(II)I

    .line 66
    move-result v13

    .line 67
    .line 68
    new-array v13, v13, [I

    .line 69
    const/4 v14, 0x2

    .line 70
    add-int/2addr v8, v14

    .line 71
    shr-int/2addr v8, v2

    .line 72
    mul-int/2addr v8, v8

    .line 73
    .line 74
    mul-int/lit16 v15, v8, 0x100

    .line 75
    .line 76
    move/from16 v16, v2

    .line 77
    .line 78
    new-array v2, v15, [I

    .line 79
    .line 80
    move/from16 p0, v14

    .line 81
    const/4 v14, 0x0

    .line 82
    .line 83
    :goto_1
    if-ge v14, v15, :cond_2

    .line 84
    .line 85
    div-int v17, v14, v8

    .line 86
    .line 87
    aput v17, v2, v14

    .line 88
    .line 89
    add-int/lit8 v14, v14, 0x1

    .line 90
    goto :goto_1

    .line 91
    .line 92
    :cond_2
    new-array v8, v9, [[I

    .line 93
    const/4 v14, 0x0

    .line 94
    .line 95
    :goto_2
    if-ge v14, v9, :cond_3

    .line 96
    const/4 v15, 0x3

    .line 97
    .line 98
    new-array v15, v15, [I

    .line 99
    .line 100
    aput-object v15, v8, v14

    .line 101
    .line 102
    add-int/lit8 v14, v14, 0x1

    .line 103
    goto :goto_2

    .line 104
    .line 105
    :cond_3
    add-int/lit8 v14, v1, 0x1

    .line 106
    const/4 v15, 0x0

    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    const/16 v18, 0x0

    .line 111
    .line 112
    :goto_3
    if-ge v15, v11, :cond_8

    .line 113
    .line 114
    move-object/from16 v19, v0

    .line 115
    neg-int v0, v1

    .line 116
    .line 117
    .line 118
    const v20, 0xff00

    .line 119
    .line 120
    const/high16 v21, 0xff0000

    .line 121
    .line 122
    move-object/from16 v31, v2

    .line 123
    .line 124
    move-object/from16 v32, v4

    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const/16 v23, 0x0

    .line 129
    .line 130
    const/16 v24, 0x0

    .line 131
    .line 132
    const/16 v25, 0x0

    .line 133
    .line 134
    const/16 v26, 0x0

    .line 135
    .line 136
    const/16 v27, 0x0

    .line 137
    .line 138
    const/16 v28, 0x0

    .line 139
    .line 140
    const/16 v29, 0x0

    .line 141
    .line 142
    const/16 v30, 0x0

    .line 143
    .line 144
    if-gt v0, v1, :cond_5

    .line 145
    :goto_4
    const/4 v2, 0x0

    .line 146
    .line 147
    .line 148
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 149
    move-result v4

    .line 150
    .line 151
    .line 152
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 153
    move-result v4

    .line 154
    .line 155
    add-int v4, v17, v4

    .line 156
    .line 157
    aget v4, v5, v4

    .line 158
    .line 159
    add-int v33, v0, v1

    .line 160
    .line 161
    aget-object v33, v8, v33

    .line 162
    .line 163
    and-int v34, v4, v21

    .line 164
    .line 165
    shr-int/lit8 v34, v34, 0x10

    .line 166
    .line 167
    aput v34, v33, v2

    .line 168
    .line 169
    and-int v34, v4, v20

    .line 170
    .line 171
    shr-int/lit8 v34, v34, 0x8

    .line 172
    .line 173
    aput v34, v33, v16

    .line 174
    .line 175
    and-int/lit16 v4, v4, 0xff

    .line 176
    .line 177
    aput v4, v33, p0

    .line 178
    .line 179
    .line 180
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 181
    move-result v4

    .line 182
    .line 183
    sub-int v4, v14, v4

    .line 184
    .line 185
    aget v34, v33, v2

    .line 186
    .line 187
    mul-int v2, v34, v4

    .line 188
    .line 189
    add-int v30, v30, v2

    .line 190
    .line 191
    aget v2, v33, v16

    .line 192
    .line 193
    mul-int v35, v2, v4

    .line 194
    .line 195
    add-int v22, v22, v35

    .line 196
    .line 197
    aget v33, v33, p0

    .line 198
    .line 199
    mul-int v4, v4, v33

    .line 200
    .line 201
    add-int v23, v23, v4

    .line 202
    .line 203
    if-lez v0, :cond_4

    .line 204
    .line 205
    add-int v27, v27, v34

    .line 206
    .line 207
    add-int v28, v28, v2

    .line 208
    .line 209
    add-int v29, v29, v33

    .line 210
    goto :goto_5

    .line 211
    .line 212
    :cond_4
    add-int v24, v24, v34

    .line 213
    .line 214
    add-int v25, v25, v2

    .line 215
    .line 216
    add-int v26, v26, v33

    .line 217
    .line 218
    :goto_5
    if-eq v0, v1, :cond_5

    .line 219
    .line 220
    add-int/lit8 v0, v0, 0x1

    .line 221
    goto :goto_4

    .line 222
    :cond_5
    move v2, v1

    .line 223
    const/4 v0, 0x0

    .line 224
    .line 225
    :goto_6
    if-ge v0, v7, :cond_7

    .line 226
    .line 227
    aget v4, v31, v30

    .line 228
    .line 229
    aput v4, v10, v17

    .line 230
    .line 231
    aget v4, v31, v22

    .line 232
    .line 233
    aput v4, v12, v17

    .line 234
    .line 235
    aget v4, v31, v23

    .line 236
    .line 237
    aput v4, v19, v17

    .line 238
    .line 239
    sub-int v30, v30, v24

    .line 240
    .line 241
    sub-int v22, v22, v25

    .line 242
    .line 243
    sub-int v23, v23, v26

    .line 244
    .line 245
    sub-int v4, v2, v1

    .line 246
    add-int/2addr v4, v9

    .line 247
    rem-int/2addr v4, v9

    .line 248
    .line 249
    aget-object v4, v8, v4

    .line 250
    .line 251
    const/16 v33, 0x0

    .line 252
    .line 253
    aget v34, v4, v33

    .line 254
    .line 255
    sub-int v24, v24, v34

    .line 256
    .line 257
    aget v33, v4, v16

    .line 258
    .line 259
    sub-int v25, v25, v33

    .line 260
    .line 261
    aget v33, v4, p0

    .line 262
    .line 263
    sub-int v26, v26, v33

    .line 264
    .line 265
    if-nez v15, :cond_6

    .line 266
    .line 267
    add-int v33, v0, v1

    .line 268
    .line 269
    move/from16 v34, v0

    .line 270
    .line 271
    add-int/lit8 v0, v33, 0x1

    .line 272
    .line 273
    .line 274
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 275
    move-result v0

    .line 276
    .line 277
    aput v0, v13, v34

    .line 278
    goto :goto_7

    .line 279
    .line 280
    :cond_6
    move/from16 v34, v0

    .line 281
    .line 282
    :goto_7
    aget v0, v13, v34

    .line 283
    .line 284
    add-int v0, v18, v0

    .line 285
    .line 286
    aget v0, v5, v0

    .line 287
    .line 288
    and-int v33, v0, v21

    .line 289
    .line 290
    shr-int/lit8 v33, v33, 0x10

    .line 291
    .line 292
    const/16 v35, 0x0

    .line 293
    .line 294
    aput v33, v4, v35

    .line 295
    .line 296
    and-int v35, v0, v20

    .line 297
    .line 298
    shr-int/lit8 v35, v35, 0x8

    .line 299
    .line 300
    aput v35, v4, v16

    .line 301
    .line 302
    and-int/lit16 v0, v0, 0xff

    .line 303
    .line 304
    aput v0, v4, p0

    .line 305
    .line 306
    add-int v27, v27, v33

    .line 307
    .line 308
    add-int v28, v28, v35

    .line 309
    .line 310
    add-int v29, v29, v0

    .line 311
    .line 312
    add-int v30, v30, v27

    .line 313
    .line 314
    add-int v22, v22, v28

    .line 315
    .line 316
    add-int v23, v23, v29

    .line 317
    .line 318
    add-int/lit8 v2, v2, 0x1

    .line 319
    rem-int/2addr v2, v9

    .line 320
    .line 321
    rem-int v0, v2, v9

    .line 322
    .line 323
    aget-object v0, v8, v0

    .line 324
    .line 325
    const/16 v33, 0x0

    .line 326
    .line 327
    aget v4, v0, v33

    .line 328
    .line 329
    add-int v24, v24, v4

    .line 330
    .line 331
    aget v33, v0, v16

    .line 332
    .line 333
    add-int v25, v25, v33

    .line 334
    .line 335
    aget v0, v0, p0

    .line 336
    .line 337
    add-int v26, v26, v0

    .line 338
    .line 339
    sub-int v27, v27, v4

    .line 340
    .line 341
    sub-int v28, v28, v33

    .line 342
    .line 343
    sub-int v29, v29, v0

    .line 344
    .line 345
    add-int/lit8 v17, v17, 0x1

    .line 346
    .line 347
    add-int/lit8 v0, v34, 0x1

    .line 348
    goto :goto_6

    .line 349
    .line 350
    :cond_7
    add-int v18, v18, v7

    .line 351
    .line 352
    add-int/lit8 v15, v15, 0x1

    .line 353
    .line 354
    move-object/from16 v0, v19

    .line 355
    .line 356
    move-object/from16 v2, v31

    .line 357
    .line 358
    move-object/from16 v4, v32

    .line 359
    .line 360
    goto/16 :goto_3

    .line 361
    .line 362
    :cond_8
    move-object/from16 v19, v0

    .line 363
    .line 364
    move-object/from16 v31, v2

    .line 365
    .line 366
    move-object/from16 v32, v4

    .line 367
    const/4 v2, 0x0

    .line 368
    .line 369
    :goto_8
    if-ge v2, v7, :cond_f

    .line 370
    neg-int v0, v1

    .line 371
    .line 372
    mul-int v3, v0, v7

    .line 373
    .line 374
    move/from16 v24, v2

    .line 375
    .line 376
    if-gt v0, v1, :cond_b

    .line 377
    move v2, v3

    .line 378
    const/4 v4, 0x0

    .line 379
    const/4 v15, 0x0

    .line 380
    .line 381
    const/16 v17, 0x0

    .line 382
    .line 383
    const/16 v18, 0x0

    .line 384
    .line 385
    const/16 v20, 0x0

    .line 386
    .line 387
    const/16 v21, 0x0

    .line 388
    .line 389
    const/16 v22, 0x0

    .line 390
    .line 391
    const/16 v23, 0x0

    .line 392
    .line 393
    const/16 v25, 0x0

    .line 394
    :goto_9
    const/4 v3, 0x0

    .line 395
    .line 396
    .line 397
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 398
    move-result v26

    .line 399
    .line 400
    add-int v26, v26, v24

    .line 401
    .line 402
    add-int v27, v0, v1

    .line 403
    .line 404
    aget-object v27, v8, v27

    .line 405
    .line 406
    aget v28, v10, v26

    .line 407
    .line 408
    aput v28, v27, v3

    .line 409
    .line 410
    aget v3, v12, v26

    .line 411
    .line 412
    aput v3, v27, v16

    .line 413
    .line 414
    aget v3, v19, v26

    .line 415
    .line 416
    aput v3, v27, p0

    .line 417
    .line 418
    .line 419
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 420
    move-result v3

    .line 421
    .line 422
    sub-int v3, v14, v3

    .line 423
    .line 424
    aget v28, v10, v26

    .line 425
    .line 426
    mul-int v28, v28, v3

    .line 427
    .line 428
    add-int v23, v23, v28

    .line 429
    .line 430
    aget v28, v12, v26

    .line 431
    .line 432
    mul-int v28, v28, v3

    .line 433
    .line 434
    add-int v25, v25, v28

    .line 435
    .line 436
    aget v26, v19, v26

    .line 437
    .line 438
    mul-int v26, v26, v3

    .line 439
    .line 440
    add-int v4, v4, v26

    .line 441
    .line 442
    if-lez v0, :cond_9

    .line 443
    .line 444
    const/16 v33, 0x0

    .line 445
    .line 446
    aget v3, v27, v33

    .line 447
    .line 448
    add-int v20, v20, v3

    .line 449
    .line 450
    aget v3, v27, v16

    .line 451
    .line 452
    add-int v21, v21, v3

    .line 453
    .line 454
    aget v3, v27, p0

    .line 455
    .line 456
    add-int v22, v22, v3

    .line 457
    goto :goto_a

    .line 458
    .line 459
    :cond_9
    const/16 v33, 0x0

    .line 460
    .line 461
    aget v3, v27, v33

    .line 462
    add-int/2addr v15, v3

    .line 463
    .line 464
    aget v3, v27, v16

    .line 465
    .line 466
    add-int v17, v17, v3

    .line 467
    .line 468
    aget v3, v27, p0

    .line 469
    .line 470
    add-int v18, v18, v3

    .line 471
    .line 472
    :goto_a
    if-ge v0, v6, :cond_a

    .line 473
    add-int/2addr v2, v7

    .line 474
    .line 475
    :cond_a
    if-eq v0, v1, :cond_c

    .line 476
    .line 477
    add-int/lit8 v0, v0, 0x1

    .line 478
    goto :goto_9

    .line 479
    :cond_b
    const/4 v4, 0x0

    .line 480
    const/4 v15, 0x0

    .line 481
    .line 482
    const/16 v17, 0x0

    .line 483
    .line 484
    const/16 v18, 0x0

    .line 485
    .line 486
    const/16 v20, 0x0

    .line 487
    .line 488
    const/16 v21, 0x0

    .line 489
    .line 490
    const/16 v22, 0x0

    .line 491
    .line 492
    const/16 v23, 0x0

    .line 493
    .line 494
    const/16 v25, 0x0

    .line 495
    :cond_c
    move v3, v1

    .line 496
    .line 497
    move/from16 v0, v24

    .line 498
    const/4 v2, 0x0

    .line 499
    .line 500
    :goto_b
    if-ge v2, v11, :cond_e

    .line 501
    .line 502
    aget v26, v5, v0

    .line 503
    .line 504
    const/high16 v27, -0x1000000

    .line 505
    .line 506
    and-int v26, v26, v27

    .line 507
    .line 508
    aget v27, v31, v23

    .line 509
    .line 510
    shl-int/lit8 v27, v27, 0x10

    .line 511
    .line 512
    or-int v26, v26, v27

    .line 513
    .line 514
    aget v27, v31, v25

    .line 515
    .line 516
    shl-int/lit8 v27, v27, 0x8

    .line 517
    .line 518
    or-int v26, v26, v27

    .line 519
    .line 520
    aget v27, v31, v4

    .line 521
    .line 522
    or-int v26, v26, v27

    .line 523
    .line 524
    aput v26, v5, v0

    .line 525
    .line 526
    sub-int v23, v23, v15

    .line 527
    .line 528
    sub-int v25, v25, v17

    .line 529
    .line 530
    sub-int v4, v4, v18

    .line 531
    .line 532
    sub-int v26, v3, v1

    .line 533
    .line 534
    add-int v26, v26, v9

    .line 535
    .line 536
    rem-int v26, v26, v9

    .line 537
    .line 538
    aget-object v26, v8, v26

    .line 539
    .line 540
    const/16 v33, 0x0

    .line 541
    .line 542
    aget v27, v26, v33

    .line 543
    .line 544
    sub-int v15, v15, v27

    .line 545
    .line 546
    aget v27, v26, v16

    .line 547
    .line 548
    sub-int v17, v17, v27

    .line 549
    .line 550
    aget v27, v26, p0

    .line 551
    .line 552
    sub-int v18, v18, v27

    .line 553
    .line 554
    move/from16 v27, v0

    .line 555
    .line 556
    if-nez v24, :cond_d

    .line 557
    .line 558
    add-int v0, v2, v14

    .line 559
    .line 560
    .line 561
    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    .line 562
    move-result v0

    .line 563
    mul-int/2addr v0, v7

    .line 564
    .line 565
    aput v0, v13, v2

    .line 566
    .line 567
    :cond_d
    aget v0, v13, v2

    .line 568
    .line 569
    add-int v0, v24, v0

    .line 570
    .line 571
    aget v28, v10, v0

    .line 572
    .line 573
    const/16 v33, 0x0

    .line 574
    .line 575
    aput v28, v26, v33

    .line 576
    .line 577
    aget v29, v12, v0

    .line 578
    .line 579
    aput v29, v26, v16

    .line 580
    .line 581
    aget v0, v19, v0

    .line 582
    .line 583
    aput v0, v26, p0

    .line 584
    .line 585
    add-int v20, v20, v28

    .line 586
    .line 587
    add-int v21, v21, v29

    .line 588
    .line 589
    add-int v22, v22, v0

    .line 590
    .line 591
    add-int v23, v23, v20

    .line 592
    .line 593
    add-int v25, v25, v21

    .line 594
    .line 595
    add-int v4, v4, v22

    .line 596
    .line 597
    add-int/lit8 v3, v3, 0x1

    .line 598
    rem-int/2addr v3, v9

    .line 599
    .line 600
    aget-object v0, v8, v3

    .line 601
    .line 602
    const/16 v33, 0x0

    .line 603
    .line 604
    aget v26, v0, v33

    .line 605
    .line 606
    add-int v15, v15, v26

    .line 607
    .line 608
    aget v28, v0, v16

    .line 609
    .line 610
    add-int v17, v17, v28

    .line 611
    .line 612
    aget v0, v0, p0

    .line 613
    .line 614
    add-int v18, v18, v0

    .line 615
    .line 616
    sub-int v20, v20, v26

    .line 617
    .line 618
    sub-int v21, v21, v28

    .line 619
    .line 620
    sub-int v22, v22, v0

    .line 621
    .line 622
    add-int v0, v27, v7

    .line 623
    .line 624
    add-int/lit8 v2, v2, 0x1

    .line 625
    goto :goto_b

    .line 626
    .line 627
    :cond_e
    const/16 v33, 0x0

    .line 628
    .line 629
    add-int/lit8 v2, v24, 0x1

    .line 630
    .line 631
    goto/16 :goto_8

    .line 632
    :cond_f
    const/4 v8, 0x0

    .line 633
    const/4 v9, 0x0

    .line 634
    const/4 v6, 0x0

    .line 635
    move v10, v7

    .line 636
    .line 637
    move-object/from16 v4, v32

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 641
    .line 642
    .line 643
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 644
    return-object v4
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method
