.class final Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;
.super Ljava/lang/Object;
.source "ProjectionRenderer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;
    }
.end annotation


# static fields
.field private static final FRAGMENT_SHADER:Ljava/lang/String; = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n"

.field private static final TAG:Ljava/lang/String; = "ProjectionRenderer"

.field private static final TEX_MATRIX_BOTTOM:[F

.field private static final TEX_MATRIX_LEFT:[F

.field private static final TEX_MATRIX_RIGHT:[F

.field private static final TEX_MATRIX_TOP:[F

.field private static final TEX_MATRIX_WHOLE:[F

.field private static final VERTEX_SHADER:Ljava/lang/String; = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n"


# instance fields
.field private leftMeshData:Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mvpMatrixHandle:I

.field private positionHandle:I

.field private program:Landroidx/media3/common/util/GlProgram;

.field private rightMeshData:Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private stereoMode:I

.field private texCoordsHandle:I

.field private textureHandle:I

.field private uTexMatrixHandle:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x9

    .line 3
    .line 4
    new-array v1, v0, [F

    .line 5
    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    sput-object v1, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->TEX_MATRIX_WHOLE:[F

    .line 10
    .line 11
    new-array v1, v0, [F

    .line 12
    .line 13
    .line 14
    fill-array-data v1, :array_1

    .line 15
    .line 16
    sput-object v1, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->TEX_MATRIX_TOP:[F

    .line 17
    .line 18
    new-array v1, v0, [F

    .line 19
    .line 20
    .line 21
    fill-array-data v1, :array_2

    .line 22
    .line 23
    sput-object v1, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->TEX_MATRIX_BOTTOM:[F

    .line 24
    .line 25
    new-array v1, v0, [F

    .line 26
    .line 27
    .line 28
    fill-array-data v1, :array_3

    .line 29
    .line 30
    sput-object v1, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->TEX_MATRIX_LEFT:[F

    .line 31
    .line 32
    new-array v0, v0, [F

    .line 33
    .line 34
    .line 35
    fill-array-data v0, :array_4

    .line 36
    .line 37
    sput-object v0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->TEX_MATRIX_RIGHT:[F

    .line 38
    return-void

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
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

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
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x41000000    # -0.5f
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x41000000    # -0.5f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x3f000000    # 0.5f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_4
    .array-data 4
        0x3f000000    # 0.5f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
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
.end method

.method public static isSupported(Landroidx/media3/exoplayer/video/spherical/Projection;)Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/Projection;->leftMesh:Landroidx/media3/exoplayer/video/spherical/Projection$Mesh;

    .line 3
    .line 4
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/Projection;->rightMesh:Landroidx/media3/exoplayer/video/spherical/Projection$Mesh;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/media3/exoplayer/video/spherical/Projection$Mesh;->getSubMeshCount()I

    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/video/spherical/Projection$Mesh;->getSubMesh(I)Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget v0, v0, Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;->textureId:I

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/media3/exoplayer/video/spherical/Projection$Mesh;->getSubMeshCount()I

    .line 24
    move-result v0

    .line 25
    .line 26
    if-ne v0, v3, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v2}, Landroidx/media3/exoplayer/video/spherical/Projection$Mesh;->getSubMesh(I)Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    iget p0, p0, Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;->textureId:I

    .line 33
    .line 34
    if-nez p0, :cond_0

    .line 35
    return v3

    .line 36
    :cond_0
    return v2
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


# virtual methods
.method public draw(I[FZ)V
    .locals 11

    .line 1
    .line 2
    const-string v1, "ProjectionRenderer"

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->rightMeshData:Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;

    .line 7
    :goto_0
    move-object v2, v0

    .line 8
    goto :goto_1

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->leftMeshData:Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :goto_1
    if-nez v2, :cond_1

    .line 14
    .line 15
    goto/16 :goto_6

    .line 16
    .line 17
    :cond_1
    iget v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->stereoMode:I

    .line 18
    const/4 v3, 0x1

    .line 19
    .line 20
    if-ne v0, v3, :cond_3

    .line 21
    .line 22
    if-eqz p3, :cond_2

    .line 23
    .line 24
    sget-object p3, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->TEX_MATRIX_BOTTOM:[F

    .line 25
    goto :goto_2

    .line 26
    .line 27
    :cond_2
    sget-object p3, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->TEX_MATRIX_TOP:[F

    .line 28
    goto :goto_2

    .line 29
    :cond_3
    const/4 v4, 0x2

    .line 30
    .line 31
    if-ne v0, v4, :cond_5

    .line 32
    .line 33
    if-eqz p3, :cond_4

    .line 34
    .line 35
    sget-object p3, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->TEX_MATRIX_RIGHT:[F

    .line 36
    goto :goto_2

    .line 37
    .line 38
    :cond_4
    sget-object p3, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->TEX_MATRIX_LEFT:[F

    .line 39
    goto :goto_2

    .line 40
    .line 41
    :cond_5
    sget-object p3, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->TEX_MATRIX_WHOLE:[F

    .line 42
    .line 43
    :goto_2
    iget v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->uTexMatrixHandle:I

    .line 44
    const/4 v4, 0x0

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v3, v4, p3, v4}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 48
    .line 49
    iget p3, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->mvpMatrixHandle:I

    .line 50
    .line 51
    .line 52
    invoke-static {p3, v3, v4, p2, v4}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 53
    .line 54
    .line 55
    const p2, 0x84c0

    .line 56
    .line 57
    .line 58
    invoke-static {p2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 59
    .line 60
    .line 61
    const p2, 0x8d65

    .line 62
    .line 63
    .line 64
    invoke-static {p2, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 65
    .line 66
    iget p1, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->textureHandle:I

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v4}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 70
    .line 71
    .line 72
    :try_start_0
    invoke-static {}, Landroidx/media3/common/util/GlUtil;->checkGlError()V
    :try_end_0
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    goto :goto_3

    .line 74
    :catch_0
    move-exception v0

    .line 75
    move-object p1, v0

    .line 76
    .line 77
    const-string p2, "Failed to bind uniforms"

    .line 78
    .line 79
    .line 80
    invoke-static {v1, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 81
    .line 82
    :goto_3
    iget v5, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->positionHandle:I

    .line 83
    .line 84
    const/16 v9, 0xc

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->access$000(Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;)Ljava/nio/FloatBuffer;

    .line 88
    move-result-object v10

    .line 89
    const/4 v6, 0x3

    .line 90
    .line 91
    const/16 v7, 0x1406

    .line 92
    const/4 v8, 0x0

    .line 93
    .line 94
    .line 95
    invoke-static/range {v5 .. v10}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 96
    .line 97
    .line 98
    :try_start_1
    invoke-static {}, Landroidx/media3/common/util/GlUtil;->checkGlError()V
    :try_end_1
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_1 .. :try_end_1} :catch_1

    .line 99
    goto :goto_4

    .line 100
    :catch_1
    move-exception v0

    .line 101
    move-object p1, v0

    .line 102
    .line 103
    const-string p2, "Failed to load position data"

    .line 104
    .line 105
    .line 106
    invoke-static {v1, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 107
    .line 108
    :goto_4
    iget v5, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->texCoordsHandle:I

    .line 109
    .line 110
    const/16 v9, 0x8

    .line 111
    .line 112
    .line 113
    invoke-static {v2}, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->access$100(Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;)Ljava/nio/FloatBuffer;

    .line 114
    move-result-object v10

    .line 115
    const/4 v6, 0x2

    .line 116
    .line 117
    const/16 v7, 0x1406

    .line 118
    const/4 v8, 0x0

    .line 119
    .line 120
    .line 121
    invoke-static/range {v5 .. v10}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 122
    .line 123
    .line 124
    :try_start_2
    invoke-static {}, Landroidx/media3/common/util/GlUtil;->checkGlError()V
    :try_end_2
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_2 .. :try_end_2} :catch_2

    .line 125
    goto :goto_5

    .line 126
    :catch_2
    move-exception v0

    .line 127
    move-object p1, v0

    .line 128
    .line 129
    const-string p2, "Failed to load texture data"

    .line 130
    .line 131
    .line 132
    invoke-static {v1, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 133
    .line 134
    .line 135
    :goto_5
    invoke-static {v2}, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->access$200(Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;)I

    .line 136
    move-result p1

    .line 137
    .line 138
    .line 139
    invoke-static {v2}, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->access$300(Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;)I

    .line 140
    move-result p2

    .line 141
    .line 142
    .line 143
    invoke-static {p1, v4, p2}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 144
    .line 145
    .line 146
    :try_start_3
    invoke-static {}, Landroidx/media3/common/util/GlUtil;->checkGlError()V
    :try_end_3
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_3 .. :try_end_3} :catch_3

    .line 147
    goto :goto_6

    .line 148
    :catch_3
    move-exception v0

    .line 149
    move-object p1, v0

    .line 150
    .line 151
    const-string p2, "Failed to render"

    .line 152
    .line 153
    .line 154
    invoke-static {v1, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 155
    :goto_6
    return-void
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
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
.end method

.method public init()V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Landroidx/media3/common/util/GlProgram;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n"

    .line 6
    .line 7
    const-string v2, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Landroidx/media3/common/util/GlProgram;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->program:Landroidx/media3/common/util/GlProgram;

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "uMvpMatrix"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/GlProgram;->getUniformLocation(Ljava/lang/String;)I

    .line 19
    move-result v0

    .line 20
    .line 21
    iput v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->mvpMatrixHandle:I

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->program:Landroidx/media3/common/util/GlProgram;

    .line 24
    .line 25
    .line 26
    const-string/jumbo v1, "uTexMatrix"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/GlProgram;->getUniformLocation(Ljava/lang/String;)I

    .line 30
    move-result v0

    .line 31
    .line 32
    iput v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->uTexMatrixHandle:I

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->program:Landroidx/media3/common/util/GlProgram;

    .line 35
    .line 36
    const-string v1, "aPosition"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/GlProgram;->getAttributeArrayLocationAndEnable(Ljava/lang/String;)I

    .line 40
    move-result v0

    .line 41
    .line 42
    iput v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->positionHandle:I

    .line 43
    .line 44
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->program:Landroidx/media3/common/util/GlProgram;

    .line 45
    .line 46
    const-string v1, "aTexCoords"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/GlProgram;->getAttributeArrayLocationAndEnable(Ljava/lang/String;)I

    .line 50
    move-result v0

    .line 51
    .line 52
    iput v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->texCoordsHandle:I

    .line 53
    .line 54
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->program:Landroidx/media3/common/util/GlProgram;

    .line 55
    .line 56
    .line 57
    const-string/jumbo v1, "uTexture"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroidx/media3/common/util/GlProgram;->getUniformLocation(Ljava/lang/String;)I

    .line 61
    move-result v0

    .line 62
    .line 63
    iput v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->textureHandle:I
    :try_end_0
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    return-void

    .line 65
    :catch_0
    move-exception v0

    .line 66
    .line 67
    const-string v1, "ProjectionRenderer"

    .line 68
    .line 69
    const-string v2, "Failed to initialize the program"

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 73
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public setProjection(Landroidx/media3/exoplayer/video/spherical/Projection;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->isSupported(Landroidx/media3/exoplayer/video/spherical/Projection;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget v0, p1, Landroidx/media3/exoplayer/video/spherical/Projection;->stereoMode:I

    .line 10
    .line 11
    iput v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->stereoMode:I

    .line 12
    .line 13
    new-instance v0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;

    .line 14
    .line 15
    iget-object v1, p1, Landroidx/media3/exoplayer/video/spherical/Projection;->leftMesh:Landroidx/media3/exoplayer/video/spherical/Projection$Mesh;

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/video/spherical/Projection$Mesh;->getSubMesh(I)Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;-><init>(Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;)V

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->leftMeshData:Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;

    .line 26
    .line 27
    iget-boolean v1, p1, Landroidx/media3/exoplayer/video/spherical/Projection;->singleMesh:Z

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_1
    new-instance v0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;

    .line 33
    .line 34
    iget-object p1, p1, Landroidx/media3/exoplayer/video/spherical/Projection;->rightMesh:Landroidx/media3/exoplayer/video/spherical/Projection$Mesh;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v2}, Landroidx/media3/exoplayer/video/spherical/Projection$Mesh;->getSubMesh(I)Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;-><init>(Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;)V

    .line 42
    .line 43
    :goto_0
    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->rightMeshData:Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;

    .line 44
    return-void
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

.method public shutdown()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;->program:Landroidx/media3/common/util/GlProgram;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0}, Landroidx/media3/common/util/GlProgram;->delete()V
    :try_end_0
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    .line 11
    const-string v1, "ProjectionRenderer"

    .line 12
    .line 13
    const-string v2, "Failed to delete the shader program"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 17
    :cond_0
    return-void
    .line 18
.end method
