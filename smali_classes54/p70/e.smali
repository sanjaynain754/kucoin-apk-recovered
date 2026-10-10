.class public final Lp70/e;
.super Ljava/lang/Object;
.source "SegmentOrderDetailLayout.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp70/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "createSegmentOrderDetailView",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "data",
        "Lcom/kubi/core/spot/business/holder/intercept/data/SegmentTradeInputData;",
        "TEXT_SIZE_MAX_SP",
        "",
        "TEXT_SIZE_MIN_SP",
        "UtaSpotLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSegmentOrderDetailLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentOrderDetailLayout.kt\ncom/kubi/utaspotlib/biz/order/infodetail/SegmentOrderDetailLayoutKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroid/content/Context;Lne/g;)Landroid/view/View;
    .locals 21
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lne/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    const-string v0, "context"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v0, "data"

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    sget v0, Lcom/kubi/utaspotlib/R$layout;->uta_order_segment_layout:I

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v0, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lq70/j;->a(Landroid/view/View;)Lq70/j;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    const-string v0, "bind(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lne/g;->m()Ljava/math/BigDecimal;

    .line 34
    move-result-object v5

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lne/g;->p()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    const/16 v15, 0xc

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 46
    move-result v0

    .line 47
    move v7, v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v7, v15

    .line 50
    .line 51
    :goto_0
    const/16 v13, 0x7d

    .line 52
    const/4 v14, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static/range {v5 .. v14}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lne/g;->l()Ljava/math/BigDecimal;

    .line 66
    move-result-object v5

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lne/g;->p()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 70
    move-result-object v6

    .line 71
    .line 72
    if-eqz v6, :cond_1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 76
    move-result v15

    .line 77
    :cond_1
    move v7, v15

    .line 78
    .line 79
    const/16 v13, 0x7d

    .line 80
    const/4 v14, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    const/4 v10, 0x0

    .line 85
    const/4 v11, 0x0

    .line 86
    const/4 v12, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static/range {v5 .. v14}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 90
    move-result-object v5

    .line 91
    .line 92
    iget-object v6, v4, Lq70/j;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    iget-object v5, v4, Lq70/j;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    iget-object v0, v4, Lq70/j;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Lne/g;->n()Ljava/lang/String;

    .line 106
    move-result-object v5

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    iget-object v0, v4, Lq70/j;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Lne/g;->n()Ljava/lang/String;

    .line 115
    move-result-object v5

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    .line 120
    iget-object v0, v4, Lq70/j;->q:Lcom/kubi/resources/widget/BaseTextView;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Lne/g;->i()I

    .line 124
    move-result v5

    .line 125
    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 128
    move-result-object v5

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    iget-object v0, v4, Lq70/j;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Lne/g;->h()Lcom/kubi/tradebase/api/segment/SegmentDistributionType;

    .line 137
    move-result-object v5

    .line 138
    .line 139
    sget-object v6, Lp70/e$a;->$EnumSwitchMapping$0:[I

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 143
    move-result v5

    .line 144
    .line 145
    aget v5, v6, v5

    .line 146
    const/4 v6, 0x1

    .line 147
    const/4 v7, 0x2

    .line 148
    .line 149
    if-eq v5, v6, :cond_4

    .line 150
    .line 151
    if-eq v5, v7, :cond_3

    .line 152
    const/4 v6, 0x3

    .line 153
    .line 154
    if-ne v5, v6, :cond_2

    .line 155
    .line 156
    sget v5, Lcom/kubi/utaspotlib/R$string;->kumex_segment_decreasing:I

    .line 157
    goto :goto_1

    .line 158
    .line 159
    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 160
    .line 161
    .line 162
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 163
    throw v0

    .line 164
    .line 165
    :cond_3
    sget v5, Lcom/kubi/utaspotlib/R$string;->kumex_segment_incremental:I

    .line 166
    goto :goto_1

    .line 167
    .line 168
    :cond_4
    sget v5, Lcom/kubi/utaspotlib/R$string;->kumex_segment_average:I

    .line 169
    .line 170
    .line 171
    :goto_1
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 172
    move-result-object v5

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Lne/g;->p()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 179
    move-result-object v0

    .line 180
    const/4 v5, 0x0

    .line 181
    .line 182
    if-eqz v0, :cond_5

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 186
    move-result v0

    .line 187
    move v10, v0

    .line 188
    goto :goto_2

    .line 189
    :cond_5
    move v10, v5

    .line 190
    .line 191
    .line 192
    :goto_2
    invoke-virtual {v2}, Lne/g;->p()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    if-eqz v0, :cond_6

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 199
    move-result v0

    .line 200
    move v15, v0

    .line 201
    goto :goto_3

    .line 202
    :cond_6
    move v15, v5

    .line 203
    .line 204
    :goto_3
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 205
    .line 206
    sget-object v8, Lj30/c;->a:Lj30/c;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Lne/g;->m()Ljava/math/BigDecimal;

    .line 210
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 211
    move v14, v10

    .line 212
    .line 213
    .line 214
    :try_start_1
    invoke-virtual {v2}, Lne/g;->l()Ljava/math/BigDecimal;

    .line 215
    move-result-object v10

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Lne/g;->i()I

    .line 219
    move-result v11

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Lne/g;->q()Ljava/math/BigDecimal;

    .line 223
    move-result-object v12

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Lne/g;->h()Lcom/kubi/tradebase/api/segment/SegmentDistributionType;

    .line 227
    move-result-object v13

    .line 228
    .line 229
    const/16 v17, 0x80

    .line 230
    .line 231
    const/16 v18, 0x0

    .line 232
    .line 233
    const/16 v16, 0x0

    .line 234
    .line 235
    .line 236
    invoke-static/range {v8 .. v18}, Lj30/c;->d(Lj30/c;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Lcom/kubi/tradebase/api/segment/SegmentDistributionType;IILjava/math/BigDecimal;ILjava/lang/Object;)Ljava/util/List;

    .line 237
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 238
    move v6, v15

    .line 239
    .line 240
    .line 241
    :try_start_2
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 243
    goto :goto_6

    .line 244
    :catchall_0
    move-exception v0

    .line 245
    goto :goto_5

    .line 246
    :catchall_1
    move-exception v0

    .line 247
    :goto_4
    move v6, v15

    .line 248
    goto :goto_5

    .line 249
    :catchall_2
    move-exception v0

    .line 250
    move v14, v10

    .line 251
    goto :goto_4

    .line 252
    .line 253
    :goto_5
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 254
    .line 255
    .line 256
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 257
    move-result-object v0

    .line 258
    .line 259
    .line 260
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    move-result-object v0

    .line 262
    .line 263
    .line 264
    :goto_6
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 265
    move-result v8

    .line 266
    .line 267
    if-eqz v8, :cond_7

    .line 268
    move-object v0, v3

    .line 269
    .line 270
    :cond_7
    check-cast v0, Ljava/util/List;

    .line 271
    .line 272
    if-eqz v0, :cond_8

    .line 273
    .line 274
    sget-object v8, Lj30/c;->a:Lj30/c;

    .line 275
    .line 276
    .line 277
    invoke-static {v8, v0, v5, v7, v3}, Lj30/c;->f(Lj30/c;Ljava/util/List;IILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 278
    move-result-object v3

    .line 279
    :cond_8
    move-object v8, v3

    .line 280
    .line 281
    iget-object v3, v4, Lq70/j;->k:Lcom/kubi/resources/widget/BaseTextView;

    .line 282
    .line 283
    if-eqz v8, :cond_9

    .line 284
    .line 285
    const/16 v16, 0x7d

    .line 286
    .line 287
    const/16 v17, 0x0

    .line 288
    const/4 v9, 0x0

    .line 289
    const/4 v11, 0x0

    .line 290
    const/4 v12, 0x0

    .line 291
    const/4 v13, 0x0

    .line 292
    move v10, v14

    .line 293
    const/4 v14, 0x0

    .line 294
    const/4 v15, 0x0

    .line 295
    .line 296
    .line 297
    invoke-static/range {v8 .. v17}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 298
    move-result-object v5

    .line 299
    .line 300
    if-eqz v5, :cond_a

    .line 301
    goto :goto_7

    .line 302
    :cond_9
    move v10, v14

    .line 303
    .line 304
    :cond_a
    const-string v5, "--"

    .line 305
    .line 306
    .line 307
    :goto_7
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 308
    .line 309
    iget-object v3, v4, Lq70/j;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Lne/g;->n()Ljava/lang/String;

    .line 313
    move-result-object v5

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 317
    .line 318
    iget-object v3, v4, Lq70/j;->w:Lcom/kubi/resources/widget/BaseTextView;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, Lne/g;->q()Ljava/math/BigDecimal;

    .line 322
    move-result-object v11

    .line 323
    .line 324
    const/16 v19, 0x7d

    .line 325
    .line 326
    const/16 v20, 0x0

    .line 327
    const/4 v12, 0x0

    .line 328
    const/4 v14, 0x0

    .line 329
    const/4 v15, 0x0

    .line 330
    .line 331
    const/16 v16, 0x0

    .line 332
    .line 333
    const/16 v17, 0x0

    .line 334
    .line 335
    const/16 v18, 0x0

    .line 336
    move v13, v6

    .line 337
    .line 338
    .line 339
    invoke-static/range {v11 .. v20}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 340
    move-result-object v5

    .line 341
    move v15, v13

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 345
    .line 346
    iget-object v3, v4, Lq70/j;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2}, Lne/g;->f()Ljava/lang/String;

    .line 350
    move-result-object v5

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 354
    .line 355
    iget-object v3, v4, Lq70/j;->c:Lcom/kubi/resources/widget/BaseTextView;

    .line 356
    .line 357
    sget-object v5, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 358
    .line 359
    sget v6, Lcom/kubi/utaspotlib/R$string;->price_order:I

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Lne/g;->n()Ljava/lang/String;

    .line 363
    move-result-object v7

    .line 364
    .line 365
    .line 366
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 367
    move-result-object v7

    .line 368
    .line 369
    .line 370
    invoke-virtual {v5, v6, v7}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 371
    move-result-object v5

    .line 372
    .line 373
    .line 374
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    .line 376
    iget-object v3, v4, Lq70/j;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 377
    .line 378
    sget v5, Lcom/kubi/utaspotlib/R$string;->delegation_amount_stub:I

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2}, Lne/g;->f()Ljava/lang/String;

    .line 382
    move-result-object v6

    .line 383
    .line 384
    .line 385
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 386
    move-result-object v6

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 390
    move-result-object v5

    .line 391
    .line 392
    .line 393
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 394
    .line 395
    new-instance v8, Lp70/f;

    .line 396
    .line 397
    .line 398
    invoke-direct {v8}, Lp70/f;-><init>()V

    .line 399
    .line 400
    iget-object v3, v4, Lq70/j;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 401
    .line 402
    new-instance v5, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 403
    .line 404
    .line 405
    invoke-direct {v5, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 409
    .line 410
    iget-object v3, v4, Lq70/j;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v3, v8}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2}, Lne/g;->r()Z

    .line 417
    move-result v3

    .line 418
    .line 419
    if-eqz v3, :cond_b

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2}, Lne/g;->j()Lcom/kubi/core/spot/business/holder/SegmentOrderHolder;

    .line 423
    move-result-object v3

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->t0()Z

    .line 427
    move-result v3

    .line 428
    goto :goto_8

    .line 429
    .line 430
    .line 431
    :cond_b
    invoke-virtual {v2}, Lne/g;->j()Lcom/kubi/core/spot/business/holder/SegmentOrderHolder;

    .line 432
    move-result-object v3

    .line 433
    .line 434
    .line 435
    invoke-virtual {v3}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->s0()Z

    .line 436
    move-result v3

    .line 437
    .line 438
    :goto_8
    iget-object v5, v4, Lq70/j;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 439
    .line 440
    const-string v6, "segmentOrderListContainer"

    .line 441
    .line 442
    .line 443
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    invoke-static {v5, v3}, Laf/a;->d(Landroid/view/View;Z)V

    .line 447
    .line 448
    if-nez v0, :cond_c

    .line 449
    .line 450
    .line 451
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 452
    move-result-object v0

    .line 453
    :cond_c
    move-object v9, v0

    .line 454
    .line 455
    sget v0, Lcom/kubi/utaspotlib/R$string;->limit_price:I

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 459
    move-result-object v12

    .line 460
    .line 461
    const-string v0, "getString(...)"

    .line 462
    .line 463
    .line 464
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, Lne/g;->k()Lcom/kubi/core/spot/business/holder/f0;

    .line 468
    move-result-object v0

    .line 469
    .line 470
    .line 471
    invoke-interface {v0}, Lcom/kubi/core/spot/business/holder/f0;->G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 472
    move-result-object v0

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2}, Lne/g;->r()Z

    .line 476
    move-result v1

    .line 477
    .line 478
    .line 479
    invoke-virtual {v0, v1}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getMarketPrice(Z)Ljava/math/BigDecimal;

    .line 480
    move-result-object v13

    .line 481
    .line 482
    const-string v0, "getMarketPrice(...)"

    .line 483
    .line 484
    .line 485
    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v2}, Lne/g;->r()Z

    .line 489
    move-result v14

    .line 490
    move v11, v15

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v8 .. v14}, Lp70/f;->j(Ljava/util/List;IILjava/lang/String;Ljava/math/BigDecimal;Z)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v4}, Lq70/j;->b()Landroid/widget/LinearLayout;

    .line 497
    move-result-object v0

    .line 498
    .line 499
    const-string v1, "getRoot(...)"

    .line 500
    .line 501
    .line 502
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 503
    return-object v0
.end method
