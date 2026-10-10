.class public final Lj50/u;
.super Ljava/lang/Object;
.source "SpotCtaBinder.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "bindSpotCta",
        "",
        "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "TradingBotKitLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V
    .locals 21
    .param p0    # Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "<this>"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v2, "helper"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Ll50/g0;->a(Landroid/view/View;)Ll50/g0;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    const-string v3, "bind(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    iget-object v3, v2, Ll50/g0;->R:Lcom/kubi/resources/widget/BaseTextView;

    .line 34
    .line 35
    sget-object v4, Lgf/n;->a:Lgf/n;

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lj50/a0;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 39
    move-result-object v5

    .line 40
    .line 41
    .line 42
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    move-result-object v5

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v5}, Lgf/n;->B(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 47
    move-result-object v4

    .line 48
    const/4 v5, 0x0

    .line 49
    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->getShowSymbol()Ljava/lang/String;

    .line 54
    move-result-object v4

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-object v4, v5

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    iget-object v3, v2, Ll50/g0;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStartTimeDifference()Ljava/lang/Long;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    .line 72
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 73
    move-result-wide v6

    .line 74
    .line 75
    .line 76
    invoke-static {v6, v7}, Lo50/j;->b(J)Ljava/lang/String;

    .line 77
    move-result-object v4

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    iget-object v3, v2, Ll50/g0;->Q:Lcom/kubi/resources/widget/BaseTextView;

    .line 83
    .line 84
    sget v4, Lcom/kubi/tradingbotkit/R$string;->kc_tb_spot_cta:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 88
    move-result-object v4

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    iget-object v3, v2, Ll50/g0;->D:Landroidx/appcompat/widget/AppCompatImageView;

    .line 94
    .line 95
    const-string v4, "loadingIv"

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v3}, Lj50/f;->r(Landroid/view/View;)V

    .line 102
    .line 103
    iget-object v3, v2, Ll50/g0;->D:Landroidx/appcompat/widget/AppCompatImageView;

    .line 104
    .line 105
    const/16 v6, 0x8

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 109
    .line 110
    iget-object v3, v2, Ll50/g0;->T:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 111
    .line 112
    sget v6, Lcom/kubi/tradingbotkit/R$string;->kc_tb_terminate_title:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 116
    move-result-object v6

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    iget-object v3, v2, Ll50/g0;->T:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStatus()Ljava/lang/String;

    .line 125
    move-result-object v6

    .line 126
    .line 127
    const-string v7, "STOPPING"

    .line 128
    .line 129
    .line 130
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    move-result v6

    .line 132
    const/4 v8, 0x1

    .line 133
    xor-int/2addr v6, v8

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v6}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 137
    .line 138
    iget-object v3, v2, Ll50/g0;->T:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 139
    .line 140
    const-string v6, "terminalTv"

    .line 141
    .line 142
    .line 143
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v3}, Lj50/b1;->H(Landroid/view/View;)V

    .line 147
    .line 148
    iget-object v3, v2, Ll50/g0;->P:Lcom/kubi/resources/widget/BaseTextView;

    .line 149
    .line 150
    sget v6, Lcom/kubi/tradingbotkit/R$color;->c_text:I

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v6}, Landroid/content/Context;->getColor(I)I

    .line 154
    move-result v6

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 158
    .line 159
    iget-object v3, v2, Ll50/g0;->o:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 160
    .line 161
    const-string v6, "detailTv"

    .line 162
    .line 163
    .line 164
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v0}, Lj50/a0;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 168
    move-result-object v6

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStatus()Ljava/lang/String;

    .line 172
    move-result-object v9

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 176
    move-result-object v10

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getId()Ljava/lang/Long;

    .line 180
    move-result-object v11

    .line 181
    .line 182
    .line 183
    invoke-static {v3, v6, v9, v10, v11}, Lj50/b1;->F(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V

    .line 184
    .line 185
    iget-object v3, v2, Ll50/g0;->O:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 186
    .line 187
    const-string v6, "rootCl"

    .line 188
    .line 189
    .line 190
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v0}, Lj50/a0;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 194
    move-result-object v6

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStatus()Ljava/lang/String;

    .line 198
    move-result-object v9

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 202
    move-result-object v10

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getId()Ljava/lang/Long;

    .line 206
    move-result-object v11

    .line 207
    .line 208
    .line 209
    invoke-static {v3, v6, v9, v10, v11}, Lj50/b1;->F(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStatus()Ljava/lang/String;

    .line 213
    move-result-object v3

    .line 214
    .line 215
    .line 216
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    move-result v3

    .line 218
    const/4 v6, 0x0

    .line 219
    .line 220
    if-eqz v3, :cond_1

    .line 221
    .line 222
    iget-object v3, v2, Ll50/g0;->P:Lcom/kubi/resources/widget/BaseTextView;

    .line 223
    .line 224
    sget v7, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_action_close:I

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 228
    move-result-object v9

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    .line 233
    iget-object v3, v2, Ll50/g0;->D:Landroidx/appcompat/widget/AppCompatImageView;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 237
    .line 238
    iget-object v3, v2, Ll50/g0;->D:Landroidx/appcompat/widget/AppCompatImageView;

    .line 239
    .line 240
    .line 241
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v3}, Lj50/f;->q(Landroid/view/View;)V

    .line 245
    .line 246
    iget-object v3, v2, Ll50/g0;->T:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 250
    move-result-object v4

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 254
    goto :goto_1

    .line 255
    .line 256
    :cond_1
    iget-object v3, v2, Ll50/g0;->P:Lcom/kubi/resources/widget/BaseTextView;

    .line 257
    .line 258
    sget v4, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_status_running:I

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 262
    move-result-object v4

    .line 263
    .line 264
    .line 265
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    .line 267
    iget-object v3, v2, Ll50/g0;->P:Lcom/kubi/resources/widget/BaseTextView;

    .line 268
    .line 269
    sget v4, Lcom/kubi/tradingbotkit/R$color;->brandGreen:I

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1, v4}, Landroid/content/Context;->getColor(I)I

    .line 273
    move-result v4

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 277
    .line 278
    :goto_1
    iget-object v3, v2, Ll50/g0;->j:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 279
    .line 280
    const-string v4, "couponLl"

    .line 281
    .line 282
    .line 283
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    iget-object v4, v2, Ll50/g0;->i:Lcom/kubi/resources/widget/BaseTextView;

    .line 286
    .line 287
    const-string v7, "couponDescTv"

    .line 288
    .line 289
    .line 290
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    iget-object v7, v2, Ll50/g0;->k:Lcom/kubi/resources/widget/BaseTextView;

    .line 293
    .line 294
    const-string v9, "couponTimeTv"

    .line 295
    .line 296
    .line 297
    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v0, v3, v4, v7}, Lj50/f;->c(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Landroidx/appcompat/widget/LinearLayoutCompat;Lcom/kubi/resources/widget/BaseTextView;Lcom/kubi/resources/widget/BaseTextView;)V

    .line 301
    .line 302
    iget-object v3, v2, Ll50/g0;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 303
    .line 304
    new-instance v4, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 308
    .line 309
    new-instance v7, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 313
    .line 314
    sget v9, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_total_invest:I

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 318
    move-result-object v9

    .line 319
    .line 320
    .line 321
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    const-string v9, " ("

    .line 324
    .line 325
    .line 326
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    move-result-object v7

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-static {v0}, Lj50/a0;->m(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 337
    move-result-object v7

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    const-string v7, ")"

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    move-result-object v4

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 353
    .line 354
    iget-object v3, v2, Ll50/g0;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalCost()Ljava/math/BigDecimal;

    .line 358
    move-result-object v10

    .line 359
    .line 360
    if-eqz v10, :cond_2

    .line 361
    .line 362
    .line 363
    invoke-static {v0}, Lj50/a0;->q(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 364
    move-result v12

    .line 365
    .line 366
    const/16 v18, 0x7d

    .line 367
    .line 368
    const/16 v19, 0x0

    .line 369
    const/4 v11, 0x0

    .line 370
    const/4 v13, 0x0

    .line 371
    const/4 v14, 0x0

    .line 372
    const/4 v15, 0x0

    .line 373
    .line 374
    const/16 v16, 0x0

    .line 375
    .line 376
    const/16 v17, 0x0

    .line 377
    .line 378
    .line 379
    invoke-static/range {v10 .. v19}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 380
    move-result-object v4

    .line 381
    goto :goto_2

    .line 382
    :cond_2
    move-object v4, v5

    .line 383
    .line 384
    .line 385
    :goto_2
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 386
    .line 387
    iget-object v3, v2, Ll50/g0;->G:Lcom/kubi/resources/widget/BaseTextView;

    .line 388
    .line 389
    new-instance v4, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 393
    .line 394
    new-instance v10, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 398
    .line 399
    sget v11, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_total_profit:I

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 403
    move-result-object v11

    .line 404
    .line 405
    .line 406
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    move-result-object v10

    .line 414
    .line 415
    .line 416
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-static {v0}, Lj50/a0;->m(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 420
    move-result-object v10

    .line 421
    .line 422
    .line 423
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    move-result-object v4

    .line 431
    .line 432
    .line 433
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 434
    .line 435
    iget-object v3, v2, Ll50/g0;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalProfit()Ljava/math/BigDecimal;

    .line 439
    move-result-object v10

    .line 440
    .line 441
    if-eqz v10, :cond_3

    .line 442
    .line 443
    .line 444
    invoke-static {v0}, Lj50/a0;->q(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 445
    move-result v12

    .line 446
    .line 447
    const/16 v18, 0x7d

    .line 448
    .line 449
    const/16 v19, 0x0

    .line 450
    const/4 v11, 0x0

    .line 451
    const/4 v13, 0x0

    .line 452
    const/4 v14, 0x0

    .line 453
    const/4 v15, 0x0

    .line 454
    .line 455
    const/16 v16, 0x0

    .line 456
    .line 457
    const/16 v17, 0x0

    .line 458
    .line 459
    .line 460
    invoke-static/range {v10 .. v19}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 461
    move-result-object v4

    .line 462
    goto :goto_3

    .line 463
    :cond_3
    move-object v4, v5

    .line 464
    .line 465
    .line 466
    :goto_3
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 467
    move-result-object v4

    .line 468
    .line 469
    .line 470
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 471
    .line 472
    iget-object v3, v2, Ll50/g0;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 473
    .line 474
    .line 475
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalProfit()Ljava/math/BigDecimal;

    .line 479
    move-result-object v4

    .line 480
    .line 481
    if-nez v4, :cond_4

    .line 482
    .line 483
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 484
    .line 485
    .line 486
    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 487
    const/4 v10, 0x2

    .line 488
    .line 489
    .line 490
    invoke-static {v1, v4, v6, v10, v5}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 491
    move-result v4

    .line 492
    .line 493
    .line 494
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 495
    .line 496
    iget-object v3, v2, Ll50/g0;->F:Lcom/kubi/resources/widget/BaseTextView;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalProfitRate()Ljava/math/BigDecimal;

    .line 500
    move-result-object v11

    .line 501
    .line 502
    if-eqz v11, :cond_5

    .line 503
    .line 504
    const/16 v18, 0x37

    .line 505
    .line 506
    const/16 v19, 0x0

    .line 507
    const/4 v12, 0x0

    .line 508
    const/4 v13, 0x0

    .line 509
    const/4 v14, 0x0

    .line 510
    const/4 v15, 0x1

    .line 511
    .line 512
    const/16 v16, 0x0

    .line 513
    .line 514
    const/16 v17, 0x0

    .line 515
    .line 516
    .line 517
    invoke-static/range {v11 .. v19}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 518
    move-result-object v4

    .line 519
    goto :goto_4

    .line 520
    :cond_5
    move-object v4, v5

    .line 521
    .line 522
    .line 523
    :goto_4
    invoke-static {v4}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 524
    move-result-object v4

    .line 525
    .line 526
    .line 527
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 528
    .line 529
    iget-object v3, v2, Ll50/g0;->F:Lcom/kubi/resources/widget/BaseTextView;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalProfitRate()Ljava/math/BigDecimal;

    .line 533
    move-result-object v4

    .line 534
    .line 535
    if-nez v4, :cond_6

    .line 536
    .line 537
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 538
    .line 539
    .line 540
    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    invoke-static {v1, v4, v6, v10, v5}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 544
    move-result v4

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 548
    .line 549
    iget-object v3, v2, Ll50/g0;->M:Lcom/kubi/resources/widget/DashTextView;

    .line 550
    .line 551
    const-string v4, "realizedProfitTitleTv"

    .line 552
    .line 553
    .line 554
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-static {v3}, Lj50/b1;->z(Landroid/widget/TextView;)V

    .line 558
    .line 559
    iget-object v3, v2, Ll50/g0;->N:Lcom/kubi/resources/widget/BaseTextView;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStrategyProfit()Ljava/math/BigDecimal;

    .line 563
    move-result-object v11

    .line 564
    .line 565
    if-eqz v11, :cond_7

    .line 566
    .line 567
    .line 568
    invoke-static {v0}, Lj50/f;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 569
    move-result v13

    .line 570
    .line 571
    const/16 v19, 0x7d

    .line 572
    .line 573
    const/16 v20, 0x0

    .line 574
    const/4 v12, 0x0

    .line 575
    const/4 v14, 0x0

    .line 576
    const/4 v15, 0x0

    .line 577
    .line 578
    const/16 v16, 0x0

    .line 579
    .line 580
    const/16 v17, 0x0

    .line 581
    .line 582
    const/16 v18, 0x0

    .line 583
    .line 584
    .line 585
    invoke-static/range {v11 .. v20}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 586
    move-result-object v4

    .line 587
    goto :goto_5

    .line 588
    :cond_7
    move-object v4, v5

    .line 589
    .line 590
    .line 591
    :goto_5
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 592
    move-result-object v4

    .line 593
    .line 594
    .line 595
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 596
    .line 597
    iget-object v3, v2, Ll50/g0;->N:Lcom/kubi/resources/widget/BaseTextView;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStrategyProfit()Ljava/math/BigDecimal;

    .line 601
    move-result-object v4

    .line 602
    .line 603
    if-nez v4, :cond_8

    .line 604
    .line 605
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 606
    .line 607
    .line 608
    :cond_8
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    invoke-static {v1, v4, v6, v10, v5}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 612
    move-result v4

    .line 613
    .line 614
    .line 615
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 616
    .line 617
    iget-object v3, v2, Ll50/g0;->Y:Lcom/kubi/resources/widget/DashTextView;

    .line 618
    .line 619
    const-string v4, "unPnlTitleTv"

    .line 620
    .line 621
    .line 622
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    invoke-static {v3}, Lj50/b1;->t(Landroid/widget/TextView;)V

    .line 626
    .line 627
    iget-object v3, v2, Ll50/g0;->Z:Lcom/kubi/resources/widget/BaseTextView;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getFloatingAmount()Ljava/math/BigDecimal;

    .line 631
    move-result-object v11

    .line 632
    .line 633
    if-eqz v11, :cond_9

    .line 634
    .line 635
    .line 636
    invoke-static {v0}, Lj50/f;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 637
    move-result v13

    .line 638
    .line 639
    const/16 v19, 0x7d

    .line 640
    .line 641
    const/16 v20, 0x0

    .line 642
    const/4 v12, 0x0

    .line 643
    const/4 v14, 0x0

    .line 644
    const/4 v15, 0x0

    .line 645
    .line 646
    const/16 v16, 0x0

    .line 647
    .line 648
    const/16 v17, 0x0

    .line 649
    .line 650
    const/16 v18, 0x0

    .line 651
    .line 652
    .line 653
    invoke-static/range {v11 .. v20}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 654
    move-result-object v4

    .line 655
    goto :goto_6

    .line 656
    :cond_9
    move-object v4, v5

    .line 657
    .line 658
    .line 659
    :goto_6
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 660
    move-result-object v4

    .line 661
    .line 662
    .line 663
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 664
    .line 665
    iget-object v3, v2, Ll50/g0;->Z:Lcom/kubi/resources/widget/BaseTextView;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getFloatingAmount()Ljava/math/BigDecimal;

    .line 669
    move-result-object v4

    .line 670
    .line 671
    if-nez v4, :cond_a

    .line 672
    .line 673
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 674
    .line 675
    .line 676
    :cond_a
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    invoke-static {v1, v4, v6, v10, v5}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 680
    move-result v4

    .line 681
    .line 682
    .line 683
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 684
    .line 685
    iget-object v3, v2, Ll50/g0;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getYearProfitRate()Ljava/math/BigDecimal;

    .line 689
    move-result-object v11

    .line 690
    .line 691
    if-eqz v11, :cond_b

    .line 692
    .line 693
    const/16 v18, 0x3f

    .line 694
    .line 695
    const/16 v19, 0x0

    .line 696
    const/4 v12, 0x0

    .line 697
    const/4 v13, 0x0

    .line 698
    const/4 v14, 0x0

    .line 699
    const/4 v15, 0x0

    .line 700
    .line 701
    const/16 v16, 0x0

    .line 702
    .line 703
    const/16 v17, 0x0

    .line 704
    .line 705
    .line 706
    invoke-static/range {v11 .. v19}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 707
    move-result-object v4

    .line 708
    goto :goto_7

    .line 709
    :cond_b
    move-object v4, v5

    .line 710
    .line 711
    .line 712
    :goto_7
    invoke-static {v4}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 713
    move-result-object v4

    .line 714
    .line 715
    .line 716
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 717
    .line 718
    iget-object v3, v2, Ll50/g0;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getYearProfitRate()Ljava/math/BigDecimal;

    .line 722
    move-result-object v4

    .line 723
    .line 724
    if-nez v4, :cond_c

    .line 725
    .line 726
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 727
    .line 728
    .line 729
    :cond_c
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    invoke-static {v1, v4, v6, v10, v5}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 733
    move-result v4

    .line 734
    .line 735
    .line 736
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 737
    .line 738
    iget-object v3, v2, Ll50/g0;->J:Lcom/kubi/resources/widget/BaseTextView;

    .line 739
    .line 740
    new-instance v4, Ljava/lang/StringBuilder;

    .line 741
    .line 742
    .line 743
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 744
    .line 745
    new-instance v11, Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 749
    .line 750
    sget v12, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_spot_cta_cur_position:I

    .line 751
    .line 752
    .line 753
    invoke-virtual {v1, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 754
    move-result-object v12

    .line 755
    .line 756
    .line 757
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 764
    move-result-object v9

    .line 765
    .line 766
    .line 767
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    invoke-static {v0}, Lj50/a0;->o(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 771
    move-result-object v9

    .line 772
    .line 773
    .line 774
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 781
    move-result-object v4

    .line 782
    .line 783
    .line 784
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 785
    .line 786
    iget-object v3, v2, Ll50/g0;->K:Lcom/kubi/resources/widget/BaseTextView;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getBaseAmount()Ljava/math/BigDecimal;

    .line 790
    move-result-object v11

    .line 791
    .line 792
    if-eqz v11, :cond_d

    .line 793
    .line 794
    .line 795
    invoke-static {v0}, Lj50/a0;->q(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 796
    move-result v13

    .line 797
    .line 798
    const/16 v19, 0x7d

    .line 799
    .line 800
    const/16 v20, 0x0

    .line 801
    const/4 v12, 0x0

    .line 802
    const/4 v14, 0x0

    .line 803
    const/4 v15, 0x0

    .line 804
    .line 805
    const/16 v16, 0x0

    .line 806
    .line 807
    const/16 v17, 0x0

    .line 808
    .line 809
    const/16 v18, 0x0

    .line 810
    .line 811
    .line 812
    invoke-static/range {v11 .. v20}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 813
    move-result-object v4

    .line 814
    goto :goto_8

    .line 815
    :cond_d
    move-object v4, v5

    .line 816
    .line 817
    .line 818
    :goto_8
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 819
    move-result-object v4

    .line 820
    .line 821
    .line 822
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 823
    .line 824
    iget-object v3, v2, Ll50/g0;->m:Lcom/kubi/resources/widget/DashTextView;

    .line 825
    .line 826
    const-string v4, "currentCostTitleTv"

    .line 827
    .line 828
    .line 829
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-static {v3}, Lj50/b1;->q(Landroid/widget/TextView;)V

    .line 833
    .line 834
    iget-object v3, v2, Ll50/g0;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 835
    .line 836
    .line 837
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getAvgBuyPrice()Ljava/math/BigDecimal;

    .line 838
    move-result-object v11

    .line 839
    .line 840
    if-eqz v11, :cond_e

    .line 841
    .line 842
    .line 843
    invoke-static {v0}, Lj50/a0;->p(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 844
    move-result v13

    .line 845
    .line 846
    const/16 v19, 0x7d

    .line 847
    .line 848
    const/16 v20, 0x0

    .line 849
    const/4 v12, 0x0

    .line 850
    const/4 v14, 0x0

    .line 851
    const/4 v15, 0x0

    .line 852
    .line 853
    const/16 v16, 0x0

    .line 854
    .line 855
    const/16 v17, 0x0

    .line 856
    .line 857
    const/16 v18, 0x0

    .line 858
    .line 859
    .line 860
    invoke-static/range {v11 .. v20}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 861
    move-result-object v4

    .line 862
    goto :goto_9

    .line 863
    :cond_e
    move-object v4, v5

    .line 864
    .line 865
    .line 866
    :goto_9
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 867
    move-result-object v4

    .line 868
    .line 869
    .line 870
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 871
    .line 872
    iget-object v3, v2, Ll50/g0;->V:Lcom/kubi/resources/widget/DashTextView;

    .line 873
    .line 874
    const-string v4, "trendTitleTv"

    .line 875
    .line 876
    .line 877
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    invoke-static {v3}, Lj50/b1;->C(Landroid/widget/TextView;)V

    .line 881
    .line 882
    iget-object v3, v2, Ll50/g0;->W:Lcom/kubi/resources/widget/BaseTextView;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTrend()Ljava/lang/String;

    .line 886
    move-result-object v4

    .line 887
    .line 888
    .line 889
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 890
    move-result-object v4

    .line 891
    .line 892
    .line 893
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 894
    .line 895
    iget-object v3, v2, Ll50/g0;->W:Lcom/kubi/resources/widget/BaseTextView;

    .line 896
    .line 897
    const-string v4, "up"

    .line 898
    .line 899
    .line 900
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTrend()Ljava/lang/String;

    .line 901
    move-result-object v7

    .line 902
    .line 903
    .line 904
    invoke-static {v4, v7, v8}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 905
    move-result v4

    .line 906
    .line 907
    if-eqz v4, :cond_f

    .line 908
    .line 909
    sget-object v4, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 910
    goto :goto_a

    .line 911
    .line 912
    :cond_f
    sget-object v4, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v4}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 916
    move-result-object v4

    .line 917
    .line 918
    .line 919
    :goto_a
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 920
    .line 921
    .line 922
    invoke-static {v1, v4, v6, v10, v5}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 923
    move-result v1

    .line 924
    .line 925
    .line 926
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 927
    .line 928
    iget-object v1, v2, Ll50/g0;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 929
    .line 930
    new-instance v3, Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getDayArbitrageNum()Ljava/lang/Integer;

    .line 937
    move-result-object v4

    .line 938
    .line 939
    .line 940
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 941
    move-result v4

    .line 942
    int-to-long v6, v4

    .line 943
    .line 944
    .line 945
    invoke-static {v6, v7}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 946
    move-result-object v8

    .line 947
    .line 948
    const-string v4, "valueOf(...)"

    .line 949
    .line 950
    .line 951
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 952
    .line 953
    const/16 v16, 0x7f

    .line 954
    .line 955
    const/16 v17, 0x0

    .line 956
    const/4 v9, 0x0

    .line 957
    const/4 v10, 0x0

    .line 958
    const/4 v11, 0x0

    .line 959
    const/4 v12, 0x0

    .line 960
    const/4 v13, 0x0

    .line 961
    const/4 v14, 0x0

    .line 962
    const/4 v15, 0x0

    .line 963
    .line 964
    .line 965
    invoke-static/range {v8 .. v17}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 966
    move-result-object v6

    .line 967
    .line 968
    .line 969
    invoke-static {v6}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 970
    move-result-object v6

    .line 971
    .line 972
    .line 973
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 974
    .line 975
    const-string v6, "/"

    .line 976
    .line 977
    .line 978
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 979
    .line 980
    .line 981
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalArbitrageNum()Ljava/lang/Integer;

    .line 982
    move-result-object v6

    .line 983
    .line 984
    .line 985
    invoke-static {v6}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 986
    move-result v6

    .line 987
    int-to-long v6, v6

    .line 988
    .line 989
    .line 990
    invoke-static {v6, v7}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 991
    move-result-object v8

    .line 992
    .line 993
    .line 994
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    invoke-static/range {v8 .. v17}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 998
    move-result-object v4

    .line 999
    .line 1000
    .line 1001
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 1002
    move-result-object v4

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1009
    move-result-object v3

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1013
    .line 1014
    iget-object v1, v2, Ll50/g0;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getPrice()Ljava/math/BigDecimal;

    .line 1018
    move-result-object v6

    .line 1019
    .line 1020
    if-eqz v6, :cond_10

    .line 1021
    .line 1022
    .line 1023
    invoke-static {v0}, Lj50/f;->l(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 1024
    move-result v8

    .line 1025
    .line 1026
    const/16 v14, 0x7d

    .line 1027
    const/4 v15, 0x0

    .line 1028
    const/4 v7, 0x0

    .line 1029
    const/4 v9, 0x0

    .line 1030
    const/4 v10, 0x0

    .line 1031
    const/4 v11, 0x0

    .line 1032
    const/4 v12, 0x0

    .line 1033
    const/4 v13, 0x0

    .line 1034
    .line 1035
    .line 1036
    invoke-static/range {v6 .. v15}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 1037
    move-result-object v5

    .line 1038
    .line 1039
    .line 1040
    :cond_10
    invoke-static {v5}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 1041
    move-result-object v0

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1045
    return-void
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
.end method
