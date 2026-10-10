.class public final Lcom/kubi/rn/core/ReactInitParam$Companion;
.super Ljava/lang/Object;
.source "ReactInitParam.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/rn/core/ReactInitParam;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0014\u0010\u0008\u001a\u00020\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/rn/core/ReactInitParam$Companion;",
        "",
        "<init>",
        "()V",
        "fromBundle",
        "Lcom/kubi/rn/core/ReactInitParam;",
        "bundle",
        "Landroid/os/Bundle;",
        "getBooleanParam",
        "",
        "key",
        "",
        "BReactNativeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReactInitParam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactInitParam.kt\ncom/kubi/rn/core/ReactInitParam$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/rn/core/ReactInitParam$Companion;-><init>()V

    return-void
.end method

.method private final getBooleanParam(Landroid/os/Bundle;Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    move-result p2

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    return v0

    .line 15
    .line 16
    :cond_0
    const-string p2, "true"

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    return v0

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    return p1
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
.end method


# virtual methods
.method public final fromBundle(Landroid/os/Bundle;)Lcom/kubi/rn/core/ReactInitParam;
    .locals 22
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    :cond_0
    const-string v2, "biz"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v4

    .line 13
    .line 14
    if-nez v4, :cond_1

    .line 15
    return-object v1

    .line 16
    .line 17
    :cond_1
    const-string v2, "entry"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    const-string v2, "index"

    .line 26
    :cond_2
    move-object v5, v2

    .line 27
    .line 28
    const-string v2, "component"

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    if-nez v2, :cond_3

    .line 35
    move-object v6, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    move-object v6, v2

    .line 38
    .line 39
    :goto_0
    const-string v2, "backup"

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    move-result-object v7

    .line 44
    .line 45
    const-string v2, "theme"

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    const-string v3, "dark"

    .line 54
    .line 55
    .line 56
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    move-result v2

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    move-result-object v2

    .line 62
    move-object v8, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    move-object v8, v1

    .line 65
    .line 66
    :goto_1
    const-string v2, "language"

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    move-result-object v9

    .line 71
    .line 72
    const-string v2, "present"

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    const-string v3, "true"

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result v10

    .line 83
    .line 84
    const-string v2, "appPresent"

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    move-result-object v11

    .line 89
    .line 90
    const-string v2, "isDebug"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 94
    move-result v12

    .line 95
    const/4 v13, 0x1

    .line 96
    .line 97
    if-eqz v12, :cond_6

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    move-result v2

    .line 106
    :cond_5
    :goto_2
    move v12, v2

    .line 107
    goto :goto_5

    .line 108
    .line 109
    .line 110
    :cond_6
    invoke-static {}, Lcom/kubi/rn/core/ReactConstKt;->getDeveloperSupport()Z

    .line 111
    move-result v2

    .line 112
    const/4 v3, 0x0

    .line 113
    .line 114
    if-eqz v2, :cond_a

    .line 115
    .line 116
    const-string v2, "rn_debug"

    .line 117
    .line 118
    const-string v12, "switch_rn_debug"

    .line 119
    .line 120
    .line 121
    invoke-static {v2, v12, v3}, Ly70/e;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 122
    move-result v2

    .line 123
    .line 124
    const-string v12, "rn_debug_bundle_info"

    .line 125
    .line 126
    const-string v14, ""

    .line 127
    .line 128
    const-string v15, "rn_debug_bundle"

    .line 129
    .line 130
    .line 131
    invoke-static {v15, v12, v14}, Ly70/e;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    move-result-object v16

    .line 133
    .line 134
    const-string v12, ":"

    .line 135
    .line 136
    .line 137
    filled-new-array {v12}, [Ljava/lang/String;

    .line 138
    move-result-object v17

    .line 139
    .line 140
    const/16 v20, 0x6

    .line 141
    .line 142
    const/16 v21, 0x0

    .line 143
    .line 144
    const/16 v18, 0x0

    .line 145
    .line 146
    const/16 v19, 0x0

    .line 147
    .line 148
    .line 149
    invoke-static/range {v16 .. v21}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 150
    move-result-object v12

    .line 151
    .line 152
    .line 153
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 154
    move-result v14

    .line 155
    const/4 v15, 0x2

    .line 156
    .line 157
    if-ne v14, v15, :cond_7

    .line 158
    .line 159
    .line 160
    invoke-static {v12, v3}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 161
    move-result-object v14

    .line 162
    .line 163
    .line 164
    invoke-static {v14, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    move-result v14

    .line 166
    .line 167
    if-eqz v14, :cond_7

    .line 168
    .line 169
    .line 170
    invoke-static {v12, v13}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 171
    move-result-object v12

    .line 172
    .line 173
    .line 174
    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    move-result v12

    .line 176
    .line 177
    if-eqz v12, :cond_7

    .line 178
    move v12, v13

    .line 179
    goto :goto_3

    .line 180
    :cond_7
    move v12, v3

    .line 181
    .line 182
    :goto_3
    if-eqz v2, :cond_9

    .line 183
    .line 184
    if-nez v12, :cond_8

    .line 185
    .line 186
    if-eqz v16, :cond_8

    .line 187
    .line 188
    .line 189
    invoke-interface/range {v16 .. v16}, Ljava/lang/CharSequence;->length()I

    .line 190
    move-result v2

    .line 191
    .line 192
    if-nez v2, :cond_9

    .line 193
    :cond_8
    move v2, v13

    .line 194
    goto :goto_4

    .line 195
    :cond_9
    move v2, v3

    .line 196
    .line 197
    :goto_4
    if-eqz v2, :cond_5

    .line 198
    .line 199
    const-string v12, "\u52a0\u8f7d\u672c\u5730\u8c03\u8bd5bundle"

    .line 200
    .line 201
    new-array v3, v3, [Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    invoke-static {v12, v3}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    goto :goto_2

    .line 206
    :cond_a
    move v12, v3

    .line 207
    .line 208
    :goto_5
    const-string v2, "titleBarHidden"

    .line 209
    .line 210
    .line 211
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 212
    move-result-object v2

    .line 213
    .line 214
    if-eqz v2, :cond_b

    .line 215
    .line 216
    const-string v3, "false"

    .line 217
    .line 218
    .line 219
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    move-result v2

    .line 221
    xor-int/2addr v13, v2

    .line 222
    .line 223
    :cond_b
    const-string v2, "transparent"

    .line 224
    .line 225
    move-object/from16 v3, p0

    .line 226
    .line 227
    .line 228
    invoke-direct {v3, v0, v2}, Lcom/kubi/rn/core/ReactInitParam$Companion;->getBooleanParam(Landroid/os/Bundle;Ljava/lang/String;)Z

    .line 229
    move-result v14

    .line 230
    .line 231
    new-instance v15, Landroid/os/Bundle;

    .line 232
    .line 233
    .line 234
    invoke-direct {v15, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 235
    .line 236
    const-string v2, "timeout"

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->b0(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    if-eqz v0, :cond_c

    .line 246
    .line 247
    .line 248
    invoke-static {v0}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    .line 249
    move-result-object v1

    .line 250
    .line 251
    :cond_c
    move-object/from16 v16, v1

    .line 252
    .line 253
    new-instance v3, Lcom/kubi/rn/core/ReactInitParam;

    .line 254
    .line 255
    .line 256
    invoke-direct/range {v3 .. v16}, Lcom/kubi/rn/core/ReactInitParam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;ZZZLandroid/os/Bundle;Ljava/lang/Long;)V

    .line 257
    return-object v3
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
.end method
