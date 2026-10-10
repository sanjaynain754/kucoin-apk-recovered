.class public abstract Lcom/sumsub/sns/internal/features/presentation/utils/g;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/core/common/Z0;Lcom/sumsub/sns/internal/features/domain/appdata/b;ZLjava/lang/Boolean;Ljava/util/Map;Ljava/util/Set;)Ljava/util/List;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v2, p3

    .line 7
    .line 8
    move-object/from16 v3, p6

    .line 9
    .line 10
    new-instance v4, Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v5

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v6

    .line 22
    .line 23
    if-eqz v6, :cond_2f

    .line 24
    .line 25
    .line 26
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v6

    .line 28
    .line 29
    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/D;

    .line 30
    .line 31
    instance-of v8, v6, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 32
    .line 33
    .line 34
    const-string/jumbo v9, "sns_data_error_fieldIsMalformed"

    .line 35
    .line 36
    const-string v10, ""

    .line 37
    .line 38
    if-eqz v8, :cond_4

    .line 39
    move-object v11, v6

    .line 40
    .line 41
    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 42
    .line 43
    iget-object v12, v11, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 44
    .line 45
    sget-object v13, Lcom/sumsub/sns/internal/features/data/model/common/S1;->b:Lcom/sumsub/sns/internal/features/data/model/common/S1;

    .line 46
    .line 47
    .line 48
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    move-result v12

    .line 50
    .line 51
    if-nez v12, :cond_0

    .line 52
    goto :goto_1

    .line 53
    .line 54
    .line 55
    :cond_0
    const-string/jumbo v12, "msdk_local_tin_validation_country"

    .line 56
    .line 57
    .line 58
    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    move-result-object v12

    .line 60
    .line 61
    check-cast v12, Ljava/lang/String;

    .line 62
    .line 63
    if-nez v12, :cond_1

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_1
    const-string/jumbo v13, "tin"

    .line 68
    .line 69
    .line 70
    invoke-interface {v3, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    move-result-object v13

    .line 72
    .line 73
    check-cast v13, Ljava/lang/String;

    .line 74
    .line 75
    if-nez v13, :cond_2

    .line 76
    move-object v13, v10

    .line 77
    .line 78
    :cond_2
    iget-boolean v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 79
    .line 80
    if-nez v11, :cond_3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 84
    move-result v11

    .line 85
    .line 86
    if-lez v11, :cond_4

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-virtual {v1, v13, v12}, Lcom/sumsub/sns/internal/core/common/Z0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/common/Y0;

    .line 90
    move-result-object v11

    .line 91
    .line 92
    sget-object v12, Lcom/sumsub/sns/internal/core/common/V0;->a:Lcom/sumsub/sns/internal/core/common/V0;

    .line 93
    .line 94
    .line 95
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    move-result v11

    .line 97
    .line 98
    if-eqz v11, :cond_4

    .line 99
    .line 100
    new-instance v7, Lcom/sumsub/sns/internal/features/domain/appdata/a;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v9}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    move-result-object v8

    .line 105
    .line 106
    .line 107
    invoke-direct {v7, v6, v8}, Lcom/sumsub/sns/internal/features/domain/appdata/a;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/D;Ljava/lang/String;)V

    .line 108
    .line 109
    move-object/from16 v1, p5

    .line 110
    .line 111
    move-object/from16 v13, p7

    .line 112
    .line 113
    goto/16 :goto_21

    .line 114
    .line 115
    :cond_4
    :goto_1
    if-nez v8, :cond_6

    .line 116
    .line 117
    :cond_5
    move-object/from16 v13, p7

    .line 118
    goto :goto_3

    .line 119
    :cond_6
    move-object v12, v6

    .line 120
    .line 121
    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 122
    .line 123
    iget-object v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 124
    .line 125
    instance-of v13, v12, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    .line 126
    .line 127
    if-eqz v13, :cond_7

    .line 128
    .line 129
    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    .line 130
    .line 131
    iget v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/U1;->b:I

    .line 132
    goto :goto_2

    .line 133
    .line 134
    :cond_7
    instance-of v13, v12, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 135
    .line 136
    if-eqz v13, :cond_5

    .line 137
    .line 138
    check-cast v12, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 139
    .line 140
    iget v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/Y1;->b:I

    .line 141
    .line 142
    .line 143
    :goto_2
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    move-result-object v12

    .line 145
    .line 146
    move-object/from16 v13, p7

    .line 147
    .line 148
    .line 149
    invoke-interface {v13, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 150
    move-result v12

    .line 151
    goto :goto_4

    .line 152
    :goto_3
    const/4 v12, 0x0

    .line 153
    .line 154
    :goto_4
    if-eqz v12, :cond_8

    .line 155
    .line 156
    move-object/from16 v1, p5

    .line 157
    .line 158
    const/16 v16, 0x0

    .line 159
    .line 160
    goto/16 :goto_1f

    .line 161
    .line 162
    :cond_8
    if-eqz v8, :cond_d

    .line 163
    move-object v14, v6

    .line 164
    .line 165
    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 166
    .line 167
    iget-object v15, v14, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 168
    .line 169
    const/16 v16, 0x0

    .line 170
    .line 171
    instance-of v7, v15, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 172
    .line 173
    if-nez v7, :cond_9

    .line 174
    goto :goto_5

    .line 175
    .line 176
    :cond_9
    check-cast v15, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 177
    .line 178
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/common/U1;

    .line 179
    .line 180
    iget v15, v15, Lcom/sumsub/sns/internal/features/data/model/common/Y1;->b:I

    .line 181
    .line 182
    .line 183
    invoke-direct {v7, v15}, Lcom/sumsub/sns/internal/features/data/model/common/U1;-><init>(I)V

    .line 184
    .line 185
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/d2;->a:Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    move-result-object v7

    .line 190
    .line 191
    check-cast v7, Ljava/lang/String;

    .line 192
    .line 193
    if-nez v7, :cond_a

    .line 194
    goto :goto_5

    .line 195
    .line 196
    :cond_a
    iget-object v15, v14, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 197
    .line 198
    check-cast v15, Lcom/sumsub/sns/internal/features/data/model/common/Y1;

    .line 199
    .line 200
    iget-object v15, v15, Lcom/sumsub/sns/internal/features/data/model/common/d2;->a:Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    invoke-interface {v3, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    move-result-object v15

    .line 205
    .line 206
    check-cast v15, Ljava/lang/String;

    .line 207
    .line 208
    if-nez v15, :cond_b

    .line 209
    move-object v15, v10

    .line 210
    .line 211
    :cond_b
    iget-boolean v14, v14, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 212
    .line 213
    if-nez v14, :cond_c

    .line 214
    .line 215
    .line 216
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 217
    move-result v14

    .line 218
    .line 219
    if-lez v14, :cond_e

    .line 220
    .line 221
    .line 222
    :cond_c
    invoke-virtual {v1, v15, v7}, Lcom/sumsub/sns/internal/core/common/Z0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/common/Y0;

    .line 223
    move-result-object v7

    .line 224
    .line 225
    sget-object v14, Lcom/sumsub/sns/internal/core/common/V0;->a:Lcom/sumsub/sns/internal/core/common/V0;

    .line 226
    .line 227
    .line 228
    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    move-result v7

    .line 230
    .line 231
    if-eqz v7, :cond_e

    .line 232
    const/4 v7, 0x1

    .line 233
    goto :goto_6

    .line 234
    .line 235
    :cond_d
    const/16 v16, 0x0

    .line 236
    :cond_e
    :goto_5
    const/4 v7, 0x0

    .line 237
    .line 238
    :goto_6
    if-eqz v7, :cond_f

    .line 239
    .line 240
    new-instance v7, Lcom/sumsub/sns/internal/features/domain/appdata/a;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v9}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    move-result-object v8

    .line 245
    .line 246
    .line 247
    invoke-direct {v7, v6, v8}, Lcom/sumsub/sns/internal/features/domain/appdata/a;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/D;Ljava/lang/String;)V

    .line 248
    .line 249
    move-object/from16 v1, p5

    .line 250
    .line 251
    goto/16 :goto_21

    .line 252
    .line 253
    :cond_f
    const-string v7, "USA"

    .line 254
    .line 255
    if-eqz v8, :cond_1a

    .line 256
    move-object v9, v6

    .line 257
    .line 258
    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 259
    .line 260
    iget-object v14, v9, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 261
    .line 262
    sget-object v15, Lcom/sumsub/sns/internal/features/data/model/common/I1;->b:Lcom/sumsub/sns/internal/features/data/model/common/I1;

    .line 263
    .line 264
    .line 265
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    move-result v14

    .line 267
    .line 268
    if-nez v14, :cond_10

    .line 269
    .line 270
    goto/16 :goto_f

    .line 271
    .line 272
    :cond_10
    sget-object v14, Lcom/sumsub/sns/internal/features/data/model/common/U0;->b:Lcom/sumsub/sns/internal/features/data/model/common/U0;

    .line 273
    .line 274
    .line 275
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 276
    move-result-object v15

    .line 277
    .line 278
    .line 279
    :cond_11
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    move-result v17

    .line 281
    .line 282
    if-eqz v17, :cond_12

    .line 283
    .line 284
    .line 285
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    move-result-object v17

    .line 287
    .line 288
    move-object/from16 v11, v17

    .line 289
    .line 290
    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/D;

    .line 291
    .line 292
    instance-of v12, v11, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 293
    .line 294
    if-eqz v12, :cond_11

    .line 295
    .line 296
    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 297
    .line 298
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 299
    .line 300
    .line 301
    invoke-static {v11, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    move-result v11

    .line 303
    .line 304
    if-eqz v11, :cond_11

    .line 305
    .line 306
    move-object/from16 v11, v17

    .line 307
    goto :goto_7

    .line 308
    .line 309
    :cond_12
    move-object/from16 v11, v16

    .line 310
    .line 311
    :goto_7
    instance-of v12, v11, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 312
    .line 313
    if-eqz v12, :cond_13

    .line 314
    .line 315
    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 316
    goto :goto_8

    .line 317
    .line 318
    :cond_13
    move-object/from16 v11, v16

    .line 319
    .line 320
    :goto_8
    const-string v12, "country"

    .line 321
    .line 322
    .line 323
    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    move-result-object v12

    .line 325
    .line 326
    check-cast v12, Ljava/lang/String;

    .line 327
    .line 328
    iget-boolean v9, v9, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 329
    .line 330
    if-nez v9, :cond_17

    .line 331
    .line 332
    if-eqz v12, :cond_14

    .line 333
    const/4 v9, 0x1

    .line 334
    .line 335
    .line 336
    invoke-static {v12, v7, v9}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 337
    move-result v14

    .line 338
    goto :goto_9

    .line 339
    :cond_14
    const/4 v9, 0x1

    .line 340
    const/4 v14, 0x0

    .line 341
    .line 342
    :goto_9
    if-nez v14, :cond_17

    .line 343
    .line 344
    if-eqz v11, :cond_16

    .line 345
    .line 346
    iget-boolean v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 347
    .line 348
    if-ne v11, v9, :cond_16

    .line 349
    .line 350
    if-eqz p4, :cond_16

    .line 351
    .line 352
    if-eqz v2, :cond_15

    .line 353
    .line 354
    iget-object v11, v2, Lcom/sumsub/sns/internal/features/domain/appdata/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 355
    .line 356
    if-eqz v11, :cond_15

    .line 357
    .line 358
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/h;->j:Ljava/util/Map;

    .line 359
    .line 360
    if-eqz v11, :cond_15

    .line 361
    .line 362
    .line 363
    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    move-result-object v11

    .line 365
    .line 366
    check-cast v11, Ljava/util/Map;

    .line 367
    .line 368
    if-eqz v11, :cond_15

    .line 369
    .line 370
    .line 371
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    .line 372
    move-result v11

    .line 373
    xor-int/2addr v11, v9

    .line 374
    goto :goto_a

    .line 375
    :cond_15
    const/4 v11, 0x0

    .line 376
    .line 377
    :goto_a
    if-eqz v11, :cond_16

    .line 378
    goto :goto_b

    .line 379
    :cond_16
    const/4 v9, 0x0

    .line 380
    goto :goto_c

    .line 381
    :cond_17
    :goto_b
    const/4 v9, 0x1

    .line 382
    .line 383
    .line 384
    :goto_c
    const-string/jumbo v11, "state"

    .line 385
    .line 386
    .line 387
    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    move-result-object v11

    .line 389
    .line 390
    check-cast v11, Ljava/lang/String;

    .line 391
    .line 392
    if-eqz v9, :cond_1a

    .line 393
    .line 394
    if-eqz v11, :cond_19

    .line 395
    .line 396
    .line 397
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 398
    move-result v9

    .line 399
    .line 400
    if-nez v9, :cond_18

    .line 401
    goto :goto_d

    .line 402
    :cond_18
    const/4 v9, 0x0

    .line 403
    goto :goto_e

    .line 404
    :cond_19
    :goto_d
    const/4 v9, 0x1

    .line 405
    .line 406
    :goto_e
    if-eqz v9, :cond_1a

    .line 407
    const/4 v9, 0x1

    .line 408
    goto :goto_10

    .line 409
    :cond_1a
    :goto_f
    const/4 v9, 0x0

    .line 410
    .line 411
    :goto_10
    if-nez v9, :cond_28

    .line 412
    .line 413
    if-eqz v8, :cond_1b

    .line 414
    move-object v9, v6

    .line 415
    .line 416
    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 417
    .line 418
    iget-object v11, v9, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 419
    .line 420
    sget-object v12, Lcom/sumsub/sns/internal/features/data/model/common/K1;->b:Lcom/sumsub/sns/internal/features/data/model/common/K1;

    .line 421
    .line 422
    .line 423
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 424
    move-result v11

    .line 425
    .line 426
    if-nez v11, :cond_1c

    .line 427
    :cond_1b
    const/4 v9, 0x1

    .line 428
    .line 429
    goto/16 :goto_1a

    .line 430
    .line 431
    :cond_1c
    sget-object v11, Lcom/sumsub/sns/internal/features/data/model/common/W0;->b:Lcom/sumsub/sns/internal/features/data/model/common/W0;

    .line 432
    .line 433
    .line 434
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 435
    move-result-object v12

    .line 436
    .line 437
    .line 438
    :goto_11
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    move-result v14

    .line 440
    .line 441
    if-eqz v14, :cond_1e

    .line 442
    .line 443
    .line 444
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    move-result-object v14

    .line 446
    move-object v15, v14

    .line 447
    .line 448
    check-cast v15, Lcom/sumsub/sns/internal/features/data/model/common/D;

    .line 449
    .line 450
    instance-of v1, v15, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 451
    .line 452
    if-eqz v1, :cond_1d

    .line 453
    .line 454
    check-cast v15, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 455
    .line 456
    iget-object v1, v15, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 457
    .line 458
    .line 459
    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 460
    move-result v1

    .line 461
    .line 462
    if-eqz v1, :cond_1d

    .line 463
    goto :goto_12

    .line 464
    .line 465
    :cond_1d
    move-object/from16 v1, p2

    .line 466
    goto :goto_11

    .line 467
    .line 468
    :cond_1e
    move-object/from16 v14, v16

    .line 469
    .line 470
    :goto_12
    instance-of v1, v14, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 471
    .line 472
    if-eqz v1, :cond_1f

    .line 473
    .line 474
    check-cast v14, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 475
    goto :goto_13

    .line 476
    .line 477
    :cond_1f
    move-object/from16 v14, v16

    .line 478
    .line 479
    :goto_13
    const-string v1, "countryOfBirth"

    .line 480
    .line 481
    .line 482
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    move-result-object v1

    .line 484
    .line 485
    check-cast v1, Ljava/lang/String;

    .line 486
    .line 487
    iget-boolean v9, v9, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 488
    .line 489
    if-nez v9, :cond_23

    .line 490
    .line 491
    if-eqz v1, :cond_20

    .line 492
    const/4 v9, 0x1

    .line 493
    .line 494
    .line 495
    invoke-static {v1, v7, v9}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 496
    move-result v7

    .line 497
    goto :goto_14

    .line 498
    :cond_20
    const/4 v9, 0x1

    .line 499
    const/4 v7, 0x0

    .line 500
    .line 501
    :goto_14
    if-nez v7, :cond_24

    .line 502
    .line 503
    if-eqz v14, :cond_22

    .line 504
    .line 505
    iget-boolean v7, v14, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 506
    .line 507
    if-ne v7, v9, :cond_22

    .line 508
    .line 509
    if-eqz p4, :cond_22

    .line 510
    .line 511
    if-eqz v2, :cond_21

    .line 512
    .line 513
    iget-object v7, v2, Lcom/sumsub/sns/internal/features/domain/appdata/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 514
    .line 515
    if-eqz v7, :cond_21

    .line 516
    .line 517
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/h;->j:Ljava/util/Map;

    .line 518
    .line 519
    if-eqz v7, :cond_21

    .line 520
    .line 521
    .line 522
    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    move-result-object v1

    .line 524
    .line 525
    check-cast v1, Ljava/util/Map;

    .line 526
    .line 527
    if-eqz v1, :cond_21

    .line 528
    .line 529
    .line 530
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 531
    move-result v1

    .line 532
    xor-int/2addr v1, v9

    .line 533
    goto :goto_15

    .line 534
    :cond_21
    const/4 v1, 0x0

    .line 535
    .line 536
    :goto_15
    if-eqz v1, :cond_22

    .line 537
    goto :goto_16

    .line 538
    :cond_22
    const/4 v1, 0x0

    .line 539
    goto :goto_17

    .line 540
    :cond_23
    const/4 v9, 0x1

    .line 541
    :cond_24
    :goto_16
    move v1, v9

    .line 542
    .line 543
    .line 544
    :goto_17
    const-string/jumbo v7, "stateOfBirth"

    .line 545
    .line 546
    .line 547
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    move-result-object v7

    .line 549
    .line 550
    check-cast v7, Ljava/lang/String;

    .line 551
    .line 552
    if-eqz v1, :cond_27

    .line 553
    .line 554
    if-eqz v7, :cond_26

    .line 555
    .line 556
    .line 557
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 558
    move-result v1

    .line 559
    .line 560
    if-nez v1, :cond_25

    .line 561
    goto :goto_18

    .line 562
    :cond_25
    const/4 v1, 0x0

    .line 563
    goto :goto_19

    .line 564
    :cond_26
    :goto_18
    move v1, v9

    .line 565
    .line 566
    :goto_19
    if-eqz v1, :cond_27

    .line 567
    move v1, v9

    .line 568
    goto :goto_1b

    .line 569
    :cond_27
    :goto_1a
    const/4 v1, 0x0

    .line 570
    .line 571
    :goto_1b
    if-eqz v1, :cond_29

    .line 572
    .line 573
    :cond_28
    move-object/from16 v1, p5

    .line 574
    goto :goto_20

    .line 575
    .line 576
    :cond_29
    if-eqz v8, :cond_2a

    .line 577
    move-object v1, v6

    .line 578
    .line 579
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 580
    .line 581
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 582
    .line 583
    instance-of v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/W1;

    .line 584
    .line 585
    if-eqz v1, :cond_2a

    .line 586
    move v11, v9

    .line 587
    goto :goto_1c

    .line 588
    :cond_2a
    const/4 v11, 0x0

    .line 589
    .line 590
    :goto_1c
    if-eqz v11, :cond_2b

    .line 591
    .line 592
    move-object/from16 v1, p5

    .line 593
    goto :goto_1f

    .line 594
    .line 595
    .line 596
    :cond_2b
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/D;->c()Ljava/lang/String;

    .line 597
    move-result-object v1

    .line 598
    .line 599
    .line 600
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 601
    move-result-object v1

    .line 602
    .line 603
    check-cast v1, Ljava/lang/String;

    .line 604
    .line 605
    if-nez v1, :cond_2c

    .line 606
    .line 607
    :goto_1d
    move-object/from16 v1, p5

    .line 608
    goto :goto_1e

    .line 609
    :cond_2c
    move-object v10, v1

    .line 610
    goto :goto_1d

    .line 611
    .line 612
    .line 613
    :goto_1e
    invoke-static {v6, v10, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/i;->a(Lcom/sumsub/sns/internal/features/data/model/common/D;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 614
    move-result-object v7

    .line 615
    .line 616
    if-eqz v7, :cond_2d

    .line 617
    .line 618
    new-instance v8, Lcom/sumsub/sns/internal/features/domain/appdata/a;

    .line 619
    .line 620
    .line 621
    invoke-direct {v8, v6, v7}, Lcom/sumsub/sns/internal/features/domain/appdata/a;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/D;Ljava/lang/String;)V

    .line 622
    move-object v7, v8

    .line 623
    goto :goto_21

    .line 624
    .line 625
    :cond_2d
    :goto_1f
    move-object/from16 v7, v16

    .line 626
    goto :goto_21

    .line 627
    .line 628
    :goto_20
    new-instance v7, Lcom/sumsub/sns/internal/features/domain/appdata/a;

    .line 629
    .line 630
    .line 631
    const-string/jumbo v8, "sns_data_error_fieldIsRequired"

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0, v8}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 635
    move-result-object v8

    .line 636
    .line 637
    .line 638
    invoke-direct {v7, v6, v8}, Lcom/sumsub/sns/internal/features/domain/appdata/a;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/D;Ljava/lang/String;)V

    .line 639
    .line 640
    :goto_21
    if-eqz v7, :cond_2e

    .line 641
    .line 642
    .line 643
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 644
    .line 645
    :cond_2e
    move-object/from16 v1, p2

    .line 646
    .line 647
    goto/16 :goto_0

    .line 648
    .line 649
    :cond_2f
    const/16 v16, 0x0

    .line 650
    .line 651
    .line 652
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 653
    move-result-object v0

    .line 654
    .line 655
    .line 656
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 657
    move-result v1

    .line 658
    .line 659
    if-nez v1, :cond_30

    .line 660
    return-object v0

    .line 661
    :cond_30
    return-object v16
.end method
