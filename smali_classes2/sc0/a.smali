.class public Lsc0/a;
.super Ljava/lang/Object;
.source "BlurUtils.java"


# direct methods
.method public static a(Landroid/content/Context;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {p0}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 7
    .line 8
    :try_start_1
    new-instance v2, Landroid/renderscript/RenderScript$RSMessageHandler;

    .line 9
    .line 10
    .line 11
    invoke-direct {v2}, Landroid/renderscript/RenderScript$RSMessageHandler;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v2}, Landroid/renderscript/RenderScript;->setMessageHandler(Landroid/renderscript/RenderScript$RSMessageHandler;)V

    .line 15
    .line 16
    sget-object v2, Landroid/renderscript/Allocation$MipmapControl;->MIPMAP_NONE:Landroid/renderscript/Allocation$MipmapControl;

    .line 17
    .line 18
    .line 19
    invoke-static {p0, p1, v2, v0}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;Landroid/renderscript/Allocation$MipmapControl;I)Landroid/renderscript/Allocation;

    .line 20
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 21
    .line 22
    .line 23
    :try_start_2
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v3}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    .line 28
    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29
    .line 30
    .line 31
    :try_start_3
    invoke-static {p0}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v4}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    .line 36
    move-result-object v1

    .line 37
    int-to-float v4, p2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v4}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, p1}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    .line 51
    .line 52
    invoke-static {}, Landroid/renderscript/RenderScript;->releaseAllContexts()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/renderscript/Allocation;->destroy()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/renderscript/BaseObj;->destroy()V

    .line 62
    return-object p1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    move-object v5, v1

    .line 65
    move-object v1, p0

    .line 66
    move-object p0, v5

    .line 67
    goto :goto_3

    .line 68
    :catch_0
    move-exception v4

    .line 69
    move-object v5, v1

    .line 70
    move-object v1, p0

    .line 71
    move-object p0, v5

    .line 72
    goto :goto_2

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    move-object v3, v1

    .line 75
    :goto_0
    move-object v1, p0

    .line 76
    move-object p0, v3

    .line 77
    goto :goto_3

    .line 78
    :catch_1
    move-exception v4

    .line 79
    move-object v3, v1

    .line 80
    :goto_1
    move-object v1, p0

    .line 81
    move-object p0, v3

    .line 82
    goto :goto_2

    .line 83
    :catchall_2
    move-exception p1

    .line 84
    move-object v2, v1

    .line 85
    move-object v3, v2

    .line 86
    goto :goto_0

    .line 87
    :catch_2
    move-exception v4

    .line 88
    move-object v2, v1

    .line 89
    move-object v3, v2

    .line 90
    goto :goto_1

    .line 91
    :catchall_3
    move-exception p1

    .line 92
    move-object p0, v1

    .line 93
    move-object v2, p0

    .line 94
    move-object v3, v2

    .line 95
    goto :goto_3

    .line 96
    :catch_3
    move-exception v4

    .line 97
    move-object p0, v1

    .line 98
    move-object v2, p0

    .line 99
    move-object v3, v2

    .line 100
    .line 101
    .line 102
    :goto_2
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 103
    .line 104
    .line 105
    invoke-static {p1, p2, v0}, Lsc0/a;->c(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 106
    .line 107
    if-eqz v1, :cond_0

    .line 108
    .line 109
    .line 110
    invoke-static {}, Landroid/renderscript/RenderScript;->releaseAllContexts()V

    .line 111
    .line 112
    :cond_0
    if-eqz v2, :cond_1

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    .line 116
    .line 117
    :cond_1
    if-eqz v3, :cond_2

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Landroid/renderscript/Allocation;->destroy()V

    .line 121
    .line 122
    :cond_2
    if-eqz p0, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/renderscript/BaseObj;->destroy()V

    .line 126
    :cond_3
    return-object p1

    .line 127
    :catchall_4
    move-exception p1

    .line 128
    .line 129
    :goto_3
    if-eqz v1, :cond_4

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroid/renderscript/RenderScript;->releaseAllContexts()V

    .line 133
    .line 134
    :cond_4
    if-eqz v2, :cond_5

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    .line 138
    .line 139
    :cond_5
    if-eqz v3, :cond_6

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Landroid/renderscript/Allocation;->destroy()V

    .line 143
    .line 144
    :cond_6
    if-eqz p0, :cond_7

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/renderscript/BaseObj;->destroy()V

    .line 148
    :cond_7
    throw p1
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
.end method

.method public static b(Landroid/content/Context;Lw1/d;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 5
    .param p1    # Lw1/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 8
    move-result v1

    .line 9
    int-to-float v0, v0

    .line 10
    .line 11
    const/high16 v2, 0x41200000    # 10.0f

    .line 12
    div-float/2addr v0, v2

    .line 13
    float-to-int v0, v0

    .line 14
    int-to-float v1, v1

    .line 15
    div-float/2addr v1, v2

    .line 16
    float-to-int v1, v1

    .line 17
    .line 18
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1, v2}, Lw1/d;->d(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getDensity()I

    .line 26
    move-result v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 30
    .line 31
    new-instance v0, Landroid/graphics/Canvas;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 35
    .line 36
    .line 37
    const v1, 0x3dcccccd    # 0.1f

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 41
    .line 42
    new-instance v1, Landroid/graphics/Paint;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 46
    const/4 v2, 0x2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFlags(I)V

    .line 50
    const/4 v2, 0x0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p2, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 54
    const/4 p2, 0x1

    .line 55
    const/4 v0, 0x0

    .line 56
    .line 57
    .line 58
    :try_start_0
    invoke-static {p0}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    .line 59
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 60
    .line 61
    :try_start_1
    new-instance v1, Landroid/renderscript/RenderScript$RSMessageHandler;

    .line 62
    .line 63
    .line 64
    invoke-direct {v1}, Landroid/renderscript/RenderScript$RSMessageHandler;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1}, Landroid/renderscript/RenderScript;->setMessageHandler(Landroid/renderscript/RenderScript$RSMessageHandler;)V

    .line 68
    .line 69
    sget-object v1, Landroid/renderscript/Allocation$MipmapControl;->MIPMAP_NONE:Landroid/renderscript/Allocation$MipmapControl;

    .line 70
    .line 71
    .line 72
    invoke-static {p0, p1, v1, p2}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;Landroid/renderscript/Allocation$MipmapControl;I)Landroid/renderscript/Allocation;

    .line 73
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 74
    .line 75
    .line 76
    :try_start_2
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v2}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    .line 81
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 82
    .line 83
    .line 84
    :try_start_3
    invoke-static {p0}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    .line 85
    move-result-object v3

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    .line 89
    move-result-object v0

    .line 90
    int-to-float v3, p3

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, p1}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 103
    .line 104
    .line 105
    invoke-static {}, Landroid/renderscript/RenderScript;->releaseAllContexts()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/renderscript/BaseObj;->destroy()V

    .line 115
    return-object p1

    .line 116
    :catchall_0
    move-exception p1

    .line 117
    move-object v4, v0

    .line 118
    move-object v0, p0

    .line 119
    move-object p0, v4

    .line 120
    goto :goto_3

    .line 121
    :catch_0
    move-exception v3

    .line 122
    move-object v4, v0

    .line 123
    move-object v0, p0

    .line 124
    move-object p0, v4

    .line 125
    goto :goto_2

    .line 126
    :catchall_1
    move-exception p1

    .line 127
    move-object v2, v0

    .line 128
    :goto_0
    move-object v0, p0

    .line 129
    move-object p0, v2

    .line 130
    goto :goto_3

    .line 131
    :catch_1
    move-exception v3

    .line 132
    move-object v2, v0

    .line 133
    :goto_1
    move-object v0, p0

    .line 134
    move-object p0, v2

    .line 135
    goto :goto_2

    .line 136
    :catchall_2
    move-exception p1

    .line 137
    move-object v1, v0

    .line 138
    move-object v2, v1

    .line 139
    goto :goto_0

    .line 140
    :catch_2
    move-exception v3

    .line 141
    move-object v1, v0

    .line 142
    move-object v2, v1

    .line 143
    goto :goto_1

    .line 144
    :catchall_3
    move-exception p1

    .line 145
    move-object p0, v0

    .line 146
    move-object v1, p0

    .line 147
    move-object v2, v1

    .line 148
    goto :goto_3

    .line 149
    :catch_3
    move-exception v3

    .line 150
    move-object p0, v0

    .line 151
    move-object v1, p0

    .line 152
    move-object v2, v1

    .line 153
    .line 154
    .line 155
    :goto_2
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 156
    .line 157
    .line 158
    invoke-static {p1, p3, p2}, Lsc0/a;->c(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 159
    .line 160
    if-eqz v0, :cond_0

    .line 161
    .line 162
    .line 163
    invoke-static {}, Landroid/renderscript/RenderScript;->releaseAllContexts()V

    .line 164
    .line 165
    :cond_0
    if-eqz v1, :cond_1

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 169
    .line 170
    :cond_1
    if-eqz v2, :cond_2

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    .line 174
    .line 175
    :cond_2
    if-eqz p0, :cond_3

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Landroid/renderscript/BaseObj;->destroy()V

    .line 179
    :cond_3
    return-object p1

    .line 180
    :catchall_4
    move-exception p1

    .line 181
    .line 182
    :goto_3
    if-eqz v0, :cond_4

    .line 183
    .line 184
    .line 185
    invoke-static {}, Landroid/renderscript/RenderScript;->releaseAllContexts()V

    .line 186
    .line 187
    :cond_4
    if-eqz v1, :cond_5

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 191
    .line 192
    :cond_5
    if-eqz v2, :cond_6

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    .line 196
    .line 197
    :cond_6
    if-eqz p0, :cond_7

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Landroid/renderscript/BaseObj;->destroy()V

    .line 201
    :cond_7
    throw p1
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
.end method

.method public static c(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
    .locals 37

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x1

    if-eqz p2, :cond_0

    move-object v4, v0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v3

    move-object v4, v3

    :goto_0
    if-ge v1, v2, :cond_1

    return-object v0

    .line 2
    :cond_1
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 3
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    mul-int v0, v7, v11

    .line 4
    new-array v5, v0, [I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x0

    move v10, v7

    .line 5
    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    add-int/lit8 v3, v7, -0x1

    add-int/lit8 v6, v11, -0x1

    add-int v8, v1, v1

    add-int/lit8 v9, v8, 0x1

    .line 6
    new-array v10, v0, [I

    .line 7
    new-array v12, v0, [I

    .line 8
    new-array v0, v0, [I

    .line 9
    invoke-static {v7, v11}, Ljava/lang/Math;->max(II)I

    move-result v13

    new-array v13, v13, [I

    const/4 v14, 0x2

    add-int/2addr v8, v14

    shr-int/2addr v8, v2

    mul-int/2addr v8, v8

    mul-int/lit16 v15, v8, 0x100

    move/from16 v16, v2

    .line 10
    new-array v2, v15, [I

    const/16 p2, 0x0

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v15, :cond_2

    .line 11
    div-int v17, v14, v8

    aput v17, v2, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_2
    const/4 v14, 0x2

    .line 12
    new-array v8, v14, [I

    const/4 v14, 0x3

    aput v14, v8, v16

    aput v9, v8, p2

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v14, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [[I

    add-int/lit8 v14, v1, 0x1

    move/from16 v15, p2

    move/from16 v17, v15

    move/from16 v18, v17

    :goto_2
    if-ge v15, v11, :cond_7

    move-object/from16 v19, v0

    neg-int v0, v1

    move/from16 v20, p2

    move/from16 v21, v20

    move/from16 v22, v21

    move/from16 v23, v22

    move/from16 v24, v23

    move/from16 v25, v24

    move/from16 v26, v25

    move/from16 v27, v26

    move/from16 v28, v27

    :goto_3
    const v29, 0xff00

    const/high16 v30, 0xff0000

    if-gt v0, v1, :cond_4

    move-object/from16 v31, v2

    move-object/from16 v32, v4

    move/from16 v2, p2

    .line 13
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int v4, v17, v4

    aget v4, v5, v4

    add-int v33, v0, v1

    .line 14
    aget-object v33, v8, v33

    and-int v30, v4, v30

    shr-int/lit8 v30, v30, 0x10

    .line 15
    aput v30, v33, v2

    and-int v29, v4, v29

    shr-int/lit8 v29, v29, 0x8

    .line 16
    aput v29, v33, v16

    and-int/lit16 v4, v4, 0xff

    const/16 v29, 0x2

    .line 17
    aput v4, v33, v29

    .line 18
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    sub-int v4, v14, v4

    .line 19
    aget v30, v33, v2

    mul-int v2, v30, v4

    add-int v28, v28, v2

    .line 20
    aget v2, v33, v16

    mul-int v34, v2, v4

    add-int v20, v20, v34

    .line 21
    aget v33, v33, v29

    mul-int v4, v4, v33

    add-int v21, v21, v4

    if-lez v0, :cond_3

    add-int v25, v25, v30

    add-int v26, v26, v2

    add-int v27, v27, v33

    goto :goto_4

    :cond_3
    add-int v22, v22, v30

    add-int v23, v23, v2

    add-int v24, v24, v33

    :goto_4
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v2, v31

    move-object/from16 v4, v32

    const/16 p2, 0x0

    goto :goto_3

    :cond_4
    move-object/from16 v31, v2

    move-object/from16 v32, v4

    move v2, v1

    const/4 v0, 0x0

    :goto_5
    if-ge v0, v7, :cond_6

    .line 22
    aget v4, v31, v28

    aput v4, v10, v17

    .line 23
    aget v4, v31, v20

    aput v4, v12, v17

    .line 24
    aget v4, v31, v21

    aput v4, v19, v17

    sub-int v28, v28, v22

    sub-int v20, v20, v23

    sub-int v21, v21, v24

    sub-int v4, v2, v1

    add-int/2addr v4, v9

    .line 25
    rem-int/2addr v4, v9

    aget-object v4, v8, v4

    const/16 v33, 0x0

    .line 26
    aget v34, v4, v33

    sub-int v22, v22, v34

    .line 27
    aget v33, v4, v16

    sub-int v23, v23, v33

    const/16 v33, 0x2

    .line 28
    aget v34, v4, v33

    sub-int v24, v24, v34

    if-nez v15, :cond_5

    add-int v33, v0, v1

    move/from16 v34, v0

    add-int/lit8 v0, v33, 0x1

    .line 29
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    aput v0, v13, v34

    goto :goto_6

    :cond_5
    move/from16 v34, v0

    .line 30
    :goto_6
    aget v0, v13, v34

    add-int v0, v18, v0

    aget v0, v5, v0

    and-int v33, v0, v30

    shr-int/lit8 v33, v33, 0x10

    const/16 v35, 0x0

    .line 31
    aput v33, v4, v35

    and-int v35, v0, v29

    shr-int/lit8 v35, v35, 0x8

    .line 32
    aput v35, v4, v16

    and-int/lit16 v0, v0, 0xff

    const/16 v36, 0x2

    .line 33
    aput v0, v4, v36

    add-int v25, v25, v33

    add-int v26, v26, v35

    add-int v27, v27, v0

    add-int v28, v28, v25

    add-int v20, v20, v26

    add-int v21, v21, v27

    add-int/lit8 v2, v2, 0x1

    .line 34
    rem-int/2addr v2, v9

    .line 35
    rem-int v0, v2, v9

    aget-object v0, v8, v0

    const/16 v33, 0x0

    .line 36
    aget v4, v0, v33

    add-int v22, v22, v4

    .line 37
    aget v33, v0, v16

    add-int v23, v23, v33

    const/16 v36, 0x2

    .line 38
    aget v0, v0, v36

    add-int v24, v24, v0

    sub-int v25, v25, v4

    sub-int v26, v26, v33

    sub-int v27, v27, v0

    add-int/lit8 v17, v17, 0x1

    add-int/lit8 v0, v34, 0x1

    goto/16 :goto_5

    :cond_6
    add-int v18, v18, v7

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, v19

    move-object/from16 v2, v31

    move-object/from16 v4, v32

    const/16 p2, 0x0

    goto/16 :goto_2

    :cond_7
    move-object/from16 v19, v0

    move-object/from16 v31, v2

    move-object/from16 v32, v4

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v7, :cond_d

    neg-int v0, v1

    mul-int v3, v0, v7

    move/from16 v24, v2

    move v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    :goto_8
    if-gt v0, v1, :cond_a

    const/4 v1, 0x0

    .line 39
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v25

    add-int v25, v25, v24

    add-int v26, v0, p1

    .line 40
    aget-object v26, v8, v26

    .line 41
    aget v27, v10, v25

    aput v27, v26, v1

    .line 42
    aget v1, v12, v25

    aput v1, v26, v16

    .line 43
    aget v1, v19, v25

    const/16 v36, 0x2

    aput v1, v26, v36

    .line 44
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    sub-int v1, v14, v1

    .line 45
    aget v27, v10, v25

    mul-int v27, v27, v1

    add-int v23, v23, v27

    .line 46
    aget v27, v12, v25

    mul-int v27, v27, v1

    add-int v3, v3, v27

    .line 47
    aget v25, v19, v25

    mul-int v25, v25, v1

    add-int v4, v4, v25

    if-lez v0, :cond_8

    const/16 v33, 0x0

    .line 48
    aget v1, v26, v33

    add-int v20, v20, v1

    .line 49
    aget v1, v26, v16

    add-int v21, v21, v1

    const/16 v36, 0x2

    .line 50
    aget v1, v26, v36

    add-int v22, v22, v1

    goto :goto_9

    :cond_8
    const/16 v33, 0x0

    const/16 v36, 0x2

    .line 51
    aget v1, v26, v33

    add-int/2addr v15, v1

    .line 52
    aget v1, v26, v16

    add-int v17, v17, v1

    .line 53
    aget v1, v26, v36

    add-int v18, v18, v1

    :goto_9
    if-ge v0, v6, :cond_9

    add-int/2addr v2, v7

    :cond_9
    add-int/lit8 v0, v0, 0x1

    move/from16 v1, p1

    goto :goto_8

    :cond_a
    move/from16 v0, v23

    move/from16 v1, v24

    const/4 v2, 0x0

    move/from16 v23, p1

    :goto_a
    if-ge v2, v11, :cond_c

    const/high16 v25, -0x1000000

    .line 54
    aget v26, v5, v1

    and-int v25, v26, v25

    aget v26, v31, v0

    shl-int/lit8 v26, v26, 0x10

    or-int v25, v25, v26

    aget v26, v31, v3

    shl-int/lit8 v26, v26, 0x8

    or-int v25, v25, v26

    aget v26, v31, v4

    or-int v25, v25, v26

    aput v25, v5, v1

    sub-int/2addr v0, v15

    sub-int v3, v3, v17

    sub-int v4, v4, v18

    sub-int v25, v23, p1

    add-int v25, v25, v9

    .line 55
    rem-int v25, v25, v9

    aget-object v25, v8, v25

    const/16 v33, 0x0

    .line 56
    aget v26, v25, v33

    sub-int v15, v15, v26

    .line 57
    aget v26, v25, v16

    sub-int v17, v17, v26

    const/16 v36, 0x2

    .line 58
    aget v26, v25, v36

    sub-int v18, v18, v26

    move/from16 v26, v0

    if-nez v24, :cond_b

    add-int v0, v2, v14

    .line 59
    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v0

    mul-int/2addr v0, v7

    aput v0, v13, v2

    .line 60
    :cond_b
    aget v0, v13, v2

    add-int v0, v24, v0

    .line 61
    aget v27, v10, v0

    const/16 v33, 0x0

    aput v27, v25, v33

    .line 62
    aget v28, v12, v0

    aput v28, v25, v16

    .line 63
    aget v0, v19, v0

    const/16 v36, 0x2

    aput v0, v25, v36

    add-int v20, v20, v27

    add-int v21, v21, v28

    add-int v22, v22, v0

    add-int v0, v26, v20

    add-int v3, v3, v21

    add-int v4, v4, v22

    add-int/lit8 v23, v23, 0x1

    .line 64
    rem-int v23, v23, v9

    .line 65
    aget-object v25, v8, v23

    const/16 v33, 0x0

    .line 66
    aget v26, v25, v33

    add-int v15, v15, v26

    .line 67
    aget v27, v25, v16

    add-int v17, v17, v27

    const/16 v36, 0x2

    .line 68
    aget v25, v25, v36

    add-int v18, v18, v25

    sub-int v20, v20, v26

    sub-int v21, v21, v27

    sub-int v22, v22, v25

    add-int/2addr v1, v7

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_a

    :cond_c
    const/16 v33, 0x0

    const/16 v36, 0x2

    add-int/lit8 v2, v24, 0x1

    move/from16 v1, p1

    goto/16 :goto_7

    :cond_d
    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x0

    move v10, v7

    move-object/from16 v4, v32

    .line 69
    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v4
.end method
