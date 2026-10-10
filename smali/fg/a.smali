.class public abstract Lfg/a;
.super Ljava/lang/Object;
.source "IHttpCodec.kt"

# interfaces
.implements Lfg/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008 \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lfg/a;",
        "Lfg/f;",
        "<init>",
        "()V",
        "",
        "data",
        "Lokhttp3/Request;",
        "a",
        "(Ljava/lang/Object;)Lokhttp3/Request;",
        "component_network_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIHttpCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IHttpCodec.kt\ncom/kubi/flutter/network/codec/BaseHttpCodec\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,128:1\n216#2,2:129\n216#2,2:131\n216#2,2:133\n*S KotlinDebug\n*F\n+ 1 IHttpCodec.kt\ncom/kubi/flutter/network/codec/BaseHttpCodec\n*L\n45#1:129,2\n56#1:131,2\n80#1:133,2\n*E\n"
    }
.end annotation


# direct methods
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
    .line 22
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lokhttp3/Request;
    .locals 13
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    check-cast p1, Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v0, "type"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, "path"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    const-string v1, "params"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    instance-of v3, v1, Ljava/util/Map;

    .line 41
    const/4 v4, 0x0

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    check-cast v1, Ljava/util/Map;

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v1, v4

    .line 48
    .line 49
    :goto_0
    const-string v3, "headers"

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    instance-of v5, v3, Ljava/util/Map;

    .line 56
    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    check-cast v3, Ljava/util/Map;

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object v3, v4

    .line 62
    .line 63
    :goto_1
    new-instance v5, Lokhttp3/Request$Builder;

    .line 64
    .line 65
    .line 66
    invoke-direct {v5}, Lokhttp3/Request$Builder;-><init>()V

    .line 67
    .line 68
    sget-object v6, Lokhttp3/HttpUrl;->Companion:Lokhttp3/HttpUrl$Companion;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v2}, Lokhttp3/HttpUrl$Companion;->get(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    .line 85
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    move-result v6

    .line 91
    .line 92
    if-eqz v6, :cond_3

    .line 93
    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    move-result-object v6

    .line 97
    .line 98
    check-cast v6, Ljava/util/Map$Entry;

    .line 99
    .line 100
    .line 101
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 102
    move-result-object v7

    .line 103
    .line 104
    check-cast v7, Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 108
    move-result-object v6

    .line 109
    .line 110
    instance-of v8, v6, Ljava/lang/String;

    .line 111
    .line 112
    if-eqz v8, :cond_2

    .line 113
    .line 114
    check-cast v6, Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v7, v6}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 118
    goto :goto_2

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-virtual {v2}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    .line 126
    .line 127
    if-eqz v3, :cond_5

    .line 128
    .line 129
    .line 130
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    .line 134
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    .line 138
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    move-result v2

    .line 140
    .line 141
    if-eqz v2, :cond_5

    .line 142
    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    move-result-object v2

    .line 146
    .line 147
    check-cast v2, Ljava/util/Map$Entry;

    .line 148
    .line 149
    .line 150
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    check-cast v3, Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 157
    move-result-object v2

    .line 158
    .line 159
    instance-of v6, v2, Ljava/lang/String;

    .line 160
    .line 161
    if-eqz v6, :cond_4

    .line 162
    .line 163
    check-cast v2, Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5, v3, v2}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 167
    goto :goto_3

    .line 168
    .line 169
    .line 170
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 171
    move-result v1

    .line 172
    .line 173
    .line 174
    const v2, 0x136ef

    .line 175
    .line 176
    if-eq v1, v2, :cond_8

    .line 177
    .line 178
    .line 179
    const v2, 0x2590a0

    .line 180
    .line 181
    if-eq v1, v2, :cond_7

    .line 182
    .line 183
    .line 184
    const v2, 0x4862828

    .line 185
    .line 186
    if-eq v1, v2, :cond_6

    .line 187
    .line 188
    goto/16 :goto_a

    .line 189
    .line 190
    :cond_6
    const-string v1, "PATCH"

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    move-result v1

    .line 195
    .line 196
    if-eqz v1, :cond_14

    .line 197
    goto :goto_4

    .line 198
    .line 199
    :cond_7
    const-string v1, "POST"

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    move-result v1

    .line 204
    .line 205
    if-nez v1, :cond_9

    .line 206
    .line 207
    goto/16 :goto_a

    .line 208
    .line 209
    :cond_8
    const-string v1, "PUT"

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    move-result v1

    .line 214
    .line 215
    if-nez v1, :cond_9

    .line 216
    .line 217
    goto/16 :goto_a

    .line 218
    .line 219
    :cond_9
    :goto_4
    const-string v1, "body"

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    move-result-object p1

    .line 224
    .line 225
    instance-of v1, p1, Ljava/util/Map;

    .line 226
    .line 227
    if-eqz v1, :cond_a

    .line 228
    .line 229
    check-cast p1, Ljava/util/Map;

    .line 230
    goto :goto_5

    .line 231
    :cond_a
    move-object p1, v4

    .line 232
    .line 233
    :goto_5
    if-eqz p1, :cond_b

    .line 234
    .line 235
    const-string v1, "body_type"

    .line 236
    .line 237
    .line 238
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    move-result-object v1

    .line 240
    goto :goto_6

    .line 241
    :cond_b
    move-object v1, v4

    .line 242
    .line 243
    :goto_6
    instance-of v2, v1, Ljava/lang/String;

    .line 244
    .line 245
    if-eqz v2, :cond_c

    .line 246
    .line 247
    check-cast v1, Ljava/lang/String;

    .line 248
    goto :goto_7

    .line 249
    :cond_c
    move-object v1, v4

    .line 250
    .line 251
    :goto_7
    const-string v2, "application/json"

    .line 252
    .line 253
    if-nez v1, :cond_d

    .line 254
    move-object v1, v2

    .line 255
    .line 256
    :cond_d
    if-eqz p1, :cond_e

    .line 257
    .line 258
    const-string v3, "body_data"

    .line 259
    .line 260
    .line 261
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    move-result-object p1

    .line 263
    goto :goto_8

    .line 264
    :cond_e
    move-object p1, v4

    .line 265
    .line 266
    :goto_8
    if-nez p1, :cond_f

    .line 267
    .line 268
    goto/16 :goto_a

    .line 269
    .line 270
    :cond_f
    instance-of v3, p1, Ljava/lang/String;

    .line 271
    .line 272
    if-eqz v3, :cond_10

    .line 273
    .line 274
    sget-object v2, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 275
    .line 276
    check-cast p1, Ljava/lang/String;

    .line 277
    .line 278
    sget-object v3, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v1}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 282
    move-result-object v1

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, p1, v1}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 286
    move-result-object v4

    .line 287
    .line 288
    goto/16 :goto_a

    .line 289
    .line 290
    :cond_10
    instance-of v3, p1, [B

    .line 291
    .line 292
    if-eqz v3, :cond_11

    .line 293
    .line 294
    sget-object v6, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 295
    move-object v7, p1

    .line 296
    .line 297
    check-cast v7, [B

    .line 298
    .line 299
    sget-object p1, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1, v1}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 303
    move-result-object v8

    .line 304
    const/4 v11, 0x6

    .line 305
    const/4 v12, 0x0

    .line 306
    const/4 v9, 0x0

    .line 307
    const/4 v10, 0x0

    .line 308
    .line 309
    .line 310
    invoke-static/range {v6 .. v12}, Lokhttp3/RequestBody$Companion;->create$default(Lokhttp3/RequestBody$Companion;[BLokhttp3/MediaType;IIILjava/lang/Object;)Lokhttp3/RequestBody;

    .line 311
    move-result-object v4

    .line 312
    goto :goto_a

    .line 313
    .line 314
    .line 315
    :cond_11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    move-result v2

    .line 317
    .line 318
    if-eqz v2, :cond_12

    .line 319
    .line 320
    .line 321
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/c;->i(Ljava/lang/Object;)Ljava/lang/String;

    .line 322
    move-result-object p1

    .line 323
    .line 324
    if-eqz p1, :cond_14

    .line 325
    .line 326
    sget-object v2, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 327
    .line 328
    sget-object v3, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v1}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 332
    move-result-object v1

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, p1, v1}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 336
    move-result-object v4

    .line 337
    goto :goto_a

    .line 338
    .line 339
    :cond_12
    const-string v2, "application/x-www-form-urlencoded"

    .line 340
    .line 341
    .line 342
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    move-result v2

    .line 344
    .line 345
    const/16 v3, 0x5d

    .line 346
    .line 347
    const-string v6, " not support body type["

    .line 348
    .line 349
    if-eqz v2, :cond_16

    .line 350
    .line 351
    instance-of v2, p1, Ljava/util/Map;

    .line 352
    .line 353
    if-eqz v2, :cond_15

    .line 354
    .line 355
    new-instance v1, Lokhttp3/FormBody$Builder;

    .line 356
    const/4 v2, 0x1

    .line 357
    .line 358
    .line 359
    invoke-direct {v1, v4, v2, v4}, Lokhttp3/FormBody$Builder;-><init>(Ljava/nio/charset/Charset;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 360
    .line 361
    check-cast p1, Ljava/util/Map;

    .line 362
    .line 363
    .line 364
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 365
    move-result-object p1

    .line 366
    .line 367
    .line 368
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 369
    move-result-object p1

    .line 370
    .line 371
    .line 372
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    move-result v2

    .line 374
    .line 375
    if-eqz v2, :cond_13

    .line 376
    .line 377
    .line 378
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    move-result-object v2

    .line 380
    .line 381
    check-cast v2, Ljava/util/Map$Entry;

    .line 382
    .line 383
    .line 384
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 385
    move-result-object v3

    .line 386
    .line 387
    .line 388
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 389
    move-result-object v2

    .line 390
    .line 391
    .line 392
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 393
    move-result-object v3

    .line 394
    .line 395
    .line 396
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 397
    move-result-object v2

    .line 398
    .line 399
    .line 400
    invoke-virtual {v1, v3, v2}, Lokhttp3/FormBody$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/FormBody$Builder;

    .line 401
    goto :goto_9

    .line 402
    .line 403
    .line 404
    :cond_13
    invoke-virtual {v1}, Lokhttp3/FormBody$Builder;->build()Lokhttp3/FormBody;

    .line 405
    move-result-object v4

    .line 406
    .line 407
    .line 408
    :cond_14
    :goto_a
    invoke-virtual {v5, v0, v4}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v5}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 412
    move-result-object p1

    .line 413
    return-object p1

    .line 414
    .line 415
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 416
    .line 417
    new-instance v2, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    move-result-object p1

    .line 431
    .line 432
    .line 433
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 434
    move-result-object p1

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    move-result-object p1

    .line 445
    .line 446
    .line 447
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 448
    throw v0

    .line 449
    .line 450
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 451
    .line 452
    new-instance v2, Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    move-result-object p1

    .line 466
    .line 467
    .line 468
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 469
    move-result-object p1

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 479
    move-result-object p1

    .line 480
    .line 481
    .line 482
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 483
    throw v0
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
.end method
