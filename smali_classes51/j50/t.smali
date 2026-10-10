.class public final Lj50/t;
.super Ljava/lang/Object;
.source "SpotAipBinder.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "bindSpotAip",
        "",
        "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "formatNextTimeCountDown",
        "",
        "",
        "(Ljava/lang/Long;)Ljava/lang/String;",
        "getIntervalDesc",
        "ctx",
        "Landroid/content/Context;",
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
    .locals 19
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
    invoke-static {v2}, Ll50/e0;->a(Landroid/view/View;)Ll50/e0;

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
    iget-object v3, v2, Ll50/e0;->N:Lcom/kubi/resources/widget/BaseTextView;

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
    move-result-object v5

    .line 48
    const/4 v6, 0x0

    .line 49
    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Lcom/kubi/data/entity/SymbolInfoEntity;->getShowSymbol()Ljava/lang/String;

    .line 54
    move-result-object v5

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-object v5, v6

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object v5

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    iget-object v3, v2, Ll50/e0;->M:Lcom/kubi/resources/widget/BaseTextView;

    .line 66
    .line 67
    sget v5, Lcom/kubi/tradingbotkit/R$string;->kc_tb_spot_aip:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lj50/a0;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 78
    move-result-object v3

    .line 79
    .line 80
    .line 81
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v3}, Lgf/n;->B(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    if-eqz v3, :cond_1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 92
    move-result-object v3

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    move-object v3, v6

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-static {v0}, Lj50/a0;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 98
    move-result-object v5

    .line 99
    .line 100
    .line 101
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    move-result-object v5

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v5}, Lgf/n;->B(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 106
    move-result-object v4

    .line 107
    .line 108
    if-eqz v4, :cond_2

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 112
    move-result-object v4

    .line 113
    goto :goto_2

    .line 114
    :cond_2
    move-object v4, v6

    .line 115
    .line 116
    :goto_2
    iget-object v5, v2, Ll50/e0;->o:Lcom/kubi/resources/widget/BaseTextView;

    .line 117
    .line 118
    sget v7, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_spot_dca_status_desc:I

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getNextTimeDifference()Ljava/lang/Long;

    .line 122
    move-result-object v8

    .line 123
    .line 124
    .line 125
    invoke-static {v8}, Lj50/t;->b(Ljava/lang/Long;)Ljava/lang/String;

    .line 126
    move-result-object v8

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getAmount()Ljava/math/BigDecimal;

    .line 130
    move-result-object v9

    .line 131
    .line 132
    if-eqz v9, :cond_3

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lj50/f;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 136
    move-result v11

    .line 137
    .line 138
    const/16 v17, 0x7d

    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    const/4 v10, 0x0

    .line 142
    const/4 v12, 0x0

    .line 143
    const/4 v13, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    .line 150
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 151
    move-result-object v9

    .line 152
    goto :goto_3

    .line 153
    :cond_3
    move-object v9, v6

    .line 154
    .line 155
    .line 156
    :goto_3
    invoke-static {v9}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    move-result-object v9

    .line 158
    .line 159
    .line 160
    filled-new-array {v8, v9, v3, v4}, [Ljava/lang/Object;

    .line 161
    move-result-object v3

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v7, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    move-result-object v3

    .line 166
    .line 167
    .line 168
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    iget-object v3, v2, Ll50/e0;->B:Landroidx/appcompat/widget/AppCompatImageView;

    .line 171
    .line 172
    const-string v4, "loadingIv"

    .line 173
    .line 174
    .line 175
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v3}, Lj50/f;->r(Landroid/view/View;)V

    .line 179
    .line 180
    iget-object v3, v2, Ll50/e0;->B:Landroidx/appcompat/widget/AppCompatImageView;

    .line 181
    .line 182
    const/16 v5, 0x8

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 186
    .line 187
    iget-object v3, v2, Ll50/e0;->P:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 188
    .line 189
    sget v5, Lcom/kubi/tradingbotkit/R$string;->kc_tb_terminate_title:I

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 193
    move-result-object v5

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    .line 198
    iget-object v3, v2, Ll50/e0;->P:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStatus()Ljava/lang/String;

    .line 202
    move-result-object v5

    .line 203
    .line 204
    const-string v7, "STOPPING"

    .line 205
    .line 206
    .line 207
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    move-result v5

    .line 209
    .line 210
    xor-int/lit8 v5, v5, 0x1

    .line 211
    .line 212
    .line 213
    invoke-virtual {v3, v5}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 214
    .line 215
    iget-object v3, v2, Ll50/e0;->P:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 216
    .line 217
    const-string v5, "terminalTv"

    .line 218
    .line 219
    .line 220
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v3}, Lj50/b1;->H(Landroid/view/View;)V

    .line 224
    .line 225
    iget-object v3, v2, Ll50/e0;->L:Lcom/kubi/resources/widget/BaseTextView;

    .line 226
    .line 227
    sget v5, Lcom/kubi/tradingbotkit/R$color;->c_text:I

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v5}, Landroid/content/Context;->getColor(I)I

    .line 231
    move-result v5

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 235
    .line 236
    iget-object v3, v2, Ll50/e0;->p:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 237
    .line 238
    const-string v5, "detailTv"

    .line 239
    .line 240
    .line 241
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v0}, Lj50/a0;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 245
    move-result-object v5

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStatus()Ljava/lang/String;

    .line 249
    move-result-object v8

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 253
    move-result-object v9

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getId()Ljava/lang/Long;

    .line 257
    move-result-object v10

    .line 258
    .line 259
    .line 260
    invoke-static {v3, v5, v8, v9, v10}, Lj50/b1;->F(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V

    .line 261
    .line 262
    iget-object v3, v2, Ll50/e0;->J:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 263
    .line 264
    const-string v5, "rootCl"

    .line 265
    .line 266
    .line 267
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v0}, Lj50/a0;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 271
    move-result-object v5

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStatus()Ljava/lang/String;

    .line 275
    move-result-object v8

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 279
    move-result-object v9

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getId()Ljava/lang/Long;

    .line 283
    move-result-object v10

    .line 284
    .line 285
    .line 286
    invoke-static {v3, v5, v8, v9, v10}, Lj50/b1;->F(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getStatus()Ljava/lang/String;

    .line 290
    move-result-object v3

    .line 291
    .line 292
    .line 293
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 294
    move-result v3

    .line 295
    const/4 v5, 0x0

    .line 296
    .line 297
    if-eqz v3, :cond_4

    .line 298
    .line 299
    iget-object v3, v2, Ll50/e0;->L:Lcom/kubi/resources/widget/BaseTextView;

    .line 300
    .line 301
    sget v7, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_action_close:I

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 305
    move-result-object v8

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 309
    .line 310
    iget-object v3, v2, Ll50/e0;->B:Landroidx/appcompat/widget/AppCompatImageView;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 314
    .line 315
    iget-object v3, v2, Ll50/e0;->B:Landroidx/appcompat/widget/AppCompatImageView;

    .line 316
    .line 317
    .line 318
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-static {v3}, Lj50/f;->q(Landroid/view/View;)V

    .line 322
    .line 323
    iget-object v3, v2, Ll50/e0;->P:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 327
    move-result-object v4

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 331
    goto :goto_4

    .line 332
    .line 333
    :cond_4
    iget-object v3, v2, Ll50/e0;->L:Lcom/kubi/resources/widget/BaseTextView;

    .line 334
    .line 335
    sget v4, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_status_running:I

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 339
    move-result-object v4

    .line 340
    .line 341
    .line 342
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 343
    .line 344
    iget-object v3, v2, Ll50/e0;->L:Lcom/kubi/resources/widget/BaseTextView;

    .line 345
    .line 346
    sget v4, Lcom/kubi/tradingbotkit/R$color;->brandGreen:I

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1, v4}, Landroid/content/Context;->getColor(I)I

    .line 350
    move-result v4

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 354
    .line 355
    :goto_4
    iget-object v3, v2, Ll50/e0;->m:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 356
    .line 357
    const-string v4, "couponLl"

    .line 358
    .line 359
    .line 360
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    .line 362
    iget-object v4, v2, Ll50/e0;->l:Lcom/kubi/resources/widget/BaseTextView;

    .line 363
    .line 364
    const-string v7, "couponDescTv"

    .line 365
    .line 366
    .line 367
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    .line 369
    iget-object v7, v2, Ll50/e0;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 370
    .line 371
    const-string v8, "couponTimeTv"

    .line 372
    .line 373
    .line 374
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v0, v3, v4, v7}, Lj50/f;->c(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Landroidx/appcompat/widget/LinearLayoutCompat;Lcom/kubi/resources/widget/BaseTextView;Lcom/kubi/resources/widget/BaseTextView;)V

    .line 378
    .line 379
    iget-object v3, v2, Ll50/e0;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 380
    .line 381
    new-instance v4, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 385
    .line 386
    new-instance v7, Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 390
    .line 391
    sget v8, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_total_invest:I

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 395
    move-result-object v8

    .line 396
    .line 397
    .line 398
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    const-string v8, " ("

    .line 401
    .line 402
    .line 403
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 407
    move-result-object v7

    .line 408
    .line 409
    .line 410
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-static {v0}, Lj50/a0;->m(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 414
    move-result-object v7

    .line 415
    .line 416
    .line 417
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    const-string v7, ")"

    .line 420
    .line 421
    .line 422
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    move-result-object v4

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 430
    .line 431
    iget-object v3, v2, Ll50/e0;->w:Lcom/kubi/resources/widget/BaseTextView;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalCost()Ljava/math/BigDecimal;

    .line 435
    move-result-object v9

    .line 436
    .line 437
    if-eqz v9, :cond_5

    .line 438
    .line 439
    .line 440
    invoke-static {v0}, Lj50/a0;->q(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 441
    move-result v11

    .line 442
    .line 443
    const/16 v17, 0x7d

    .line 444
    .line 445
    const/16 v18, 0x0

    .line 446
    const/4 v10, 0x0

    .line 447
    const/4 v12, 0x0

    .line 448
    const/4 v13, 0x0

    .line 449
    const/4 v14, 0x0

    .line 450
    const/4 v15, 0x0

    .line 451
    .line 452
    const/16 v16, 0x0

    .line 453
    .line 454
    .line 455
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 456
    move-result-object v4

    .line 457
    goto :goto_5

    .line 458
    :cond_5
    move-object v4, v6

    .line 459
    .line 460
    .line 461
    :goto_5
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 462
    .line 463
    iget-object v3, v2, Ll50/e0;->H:Lcom/kubi/resources/widget/BaseTextView;

    .line 464
    .line 465
    new-instance v4, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 469
    .line 470
    new-instance v9, Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 474
    .line 475
    sget v10, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_total_profit:I

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 479
    move-result-object v10

    .line 480
    .line 481
    .line 482
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 489
    move-result-object v9

    .line 490
    .line 491
    .line 492
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-static {v0}, Lj50/a0;->m(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 496
    move-result-object v9

    .line 497
    .line 498
    .line 499
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 506
    move-result-object v4

    .line 507
    .line 508
    .line 509
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 510
    .line 511
    iget-object v3, v2, Ll50/e0;->I:Lcom/kubi/resources/widget/BaseTextView;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalProfit()Ljava/math/BigDecimal;

    .line 515
    move-result-object v9

    .line 516
    .line 517
    if-eqz v9, :cond_6

    .line 518
    .line 519
    .line 520
    invoke-static {v0}, Lj50/a0;->q(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 521
    move-result v11

    .line 522
    .line 523
    const/16 v17, 0x7d

    .line 524
    .line 525
    const/16 v18, 0x0

    .line 526
    const/4 v10, 0x0

    .line 527
    const/4 v12, 0x0

    .line 528
    const/4 v13, 0x0

    .line 529
    const/4 v14, 0x0

    .line 530
    const/4 v15, 0x0

    .line 531
    .line 532
    const/16 v16, 0x0

    .line 533
    .line 534
    .line 535
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 536
    move-result-object v4

    .line 537
    goto :goto_6

    .line 538
    :cond_6
    move-object v4, v6

    .line 539
    .line 540
    .line 541
    :goto_6
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 542
    move-result-object v4

    .line 543
    .line 544
    .line 545
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 546
    .line 547
    iget-object v3, v2, Ll50/e0;->I:Lcom/kubi/resources/widget/BaseTextView;

    .line 548
    .line 549
    .line 550
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalProfit()Ljava/math/BigDecimal;

    .line 554
    move-result-object v4

    .line 555
    .line 556
    if-nez v4, :cond_7

    .line 557
    .line 558
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 559
    .line 560
    .line 561
    :cond_7
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 562
    const/4 v9, 0x2

    .line 563
    .line 564
    .line 565
    invoke-static {v1, v4, v5, v9, v6}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 566
    move-result v4

    .line 567
    .line 568
    .line 569
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 570
    .line 571
    iget-object v3, v2, Ll50/e0;->G:Lcom/kubi/resources/widget/BaseTextView;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalProfitRate()Ljava/math/BigDecimal;

    .line 575
    move-result-object v10

    .line 576
    .line 577
    if-eqz v10, :cond_8

    .line 578
    .line 579
    const/16 v17, 0x37

    .line 580
    .line 581
    const/16 v18, 0x0

    .line 582
    const/4 v11, 0x0

    .line 583
    const/4 v12, 0x0

    .line 584
    const/4 v13, 0x0

    .line 585
    const/4 v14, 0x1

    .line 586
    const/4 v15, 0x0

    .line 587
    .line 588
    const/16 v16, 0x0

    .line 589
    .line 590
    .line 591
    invoke-static/range {v10 .. v18}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 592
    move-result-object v4

    .line 593
    goto :goto_7

    .line 594
    :cond_8
    move-object v4, v6

    .line 595
    .line 596
    .line 597
    :goto_7
    invoke-static {v4}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 598
    move-result-object v4

    .line 599
    .line 600
    .line 601
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 602
    .line 603
    iget-object v3, v2, Ll50/e0;->G:Lcom/kubi/resources/widget/BaseTextView;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalProfitRate()Ljava/math/BigDecimal;

    .line 607
    move-result-object v4

    .line 608
    .line 609
    if-nez v4, :cond_9

    .line 610
    .line 611
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 612
    .line 613
    .line 614
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    invoke-static {v1, v4, v5, v9, v6}, Lcom/kubi/resources/g;->g(Landroid/content/Context;Ljava/math/BigDecimal;IILjava/lang/Object;)I

    .line 618
    move-result v4

    .line 619
    .line 620
    .line 621
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 622
    .line 623
    iget-object v3, v2, Ll50/e0;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 624
    .line 625
    .line 626
    invoke-static {v0, v1}, Lj50/t;->d(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Landroid/content/Context;)Ljava/lang/String;

    .line 627
    move-result-object v4

    .line 628
    .line 629
    .line 630
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 631
    .line 632
    iget-object v3, v2, Ll50/e0;->E:Lcom/kubi/resources/widget/BaseTextView;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getAmount()Ljava/math/BigDecimal;

    .line 636
    move-result-object v9

    .line 637
    .line 638
    if-eqz v9, :cond_a

    .line 639
    .line 640
    .line 641
    invoke-static {v0}, Lj50/f;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 642
    move-result v11

    .line 643
    .line 644
    const/16 v17, 0x7d

    .line 645
    .line 646
    const/16 v18, 0x0

    .line 647
    const/4 v10, 0x0

    .line 648
    const/4 v12, 0x0

    .line 649
    const/4 v13, 0x0

    .line 650
    const/4 v14, 0x0

    .line 651
    const/4 v15, 0x0

    .line 652
    .line 653
    const/16 v16, 0x0

    .line 654
    .line 655
    .line 656
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 657
    move-result-object v4

    .line 658
    goto :goto_8

    .line 659
    :cond_a
    move-object v4, v6

    .line 660
    .line 661
    .line 662
    :goto_8
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 663
    move-result-object v4

    .line 664
    .line 665
    .line 666
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 667
    .line 668
    iget-object v3, v2, Ll50/e0;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getAvgBuyPrice()Ljava/math/BigDecimal;

    .line 672
    move-result-object v9

    .line 673
    .line 674
    if-eqz v9, :cond_b

    .line 675
    .line 676
    .line 677
    invoke-static {v0}, Lj50/f;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 678
    move-result v11

    .line 679
    .line 680
    const/16 v17, 0x7d

    .line 681
    .line 682
    const/16 v18, 0x0

    .line 683
    const/4 v10, 0x0

    .line 684
    const/4 v12, 0x0

    .line 685
    const/4 v13, 0x0

    .line 686
    const/4 v14, 0x0

    .line 687
    const/4 v15, 0x0

    .line 688
    .line 689
    const/16 v16, 0x0

    .line 690
    .line 691
    .line 692
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 693
    move-result-object v4

    .line 694
    goto :goto_9

    .line 695
    :cond_b
    move-object v4, v6

    .line 696
    .line 697
    .line 698
    :goto_9
    invoke-static {v4}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 699
    move-result-object v4

    .line 700
    .line 701
    .line 702
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 703
    .line 704
    iget-object v3, v2, Ll50/e0;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 705
    .line 706
    new-instance v4, Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 710
    .line 711
    new-instance v5, Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 715
    .line 716
    sget v9, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_spot_aip_invest_amount:I

    .line 717
    .line 718
    .line 719
    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 720
    move-result-object v1

    .line 721
    .line 722
    .line 723
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 730
    move-result-object v1

    .line 731
    .line 732
    .line 733
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-static {v0}, Lj50/a0;->o(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 737
    move-result-object v1

    .line 738
    .line 739
    .line 740
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 747
    move-result-object v1

    .line 748
    .line 749
    .line 750
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 751
    .line 752
    iget-object v1, v2, Ll50/e0;->k:Lcom/kubi/resources/widget/BaseTextView;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getTotalSize()Ljava/math/BigDecimal;

    .line 756
    move-result-object v7

    .line 757
    .line 758
    if-eqz v7, :cond_c

    .line 759
    .line 760
    .line 761
    invoke-static {v0}, Lj50/f;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 762
    move-result v9

    .line 763
    .line 764
    const/16 v15, 0x7d

    .line 765
    .line 766
    const/16 v16, 0x0

    .line 767
    const/4 v8, 0x0

    .line 768
    const/4 v10, 0x0

    .line 769
    const/4 v11, 0x0

    .line 770
    const/4 v12, 0x0

    .line 771
    const/4 v13, 0x0

    .line 772
    const/4 v14, 0x0

    .line 773
    .line 774
    .line 775
    invoke-static/range {v7 .. v16}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 776
    move-result-object v3

    .line 777
    goto :goto_a

    .line 778
    :cond_c
    move-object v3, v6

    .line 779
    .line 780
    .line 781
    :goto_a
    invoke-static {v3}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 782
    move-result-object v3

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 786
    .line 787
    iget-object v1, v2, Ll50/e0;->i:Lcom/kubi/resources/widget/BaseTextView;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getInvestedNum()Ljava/lang/Long;

    .line 791
    move-result-object v3

    .line 792
    .line 793
    if-eqz v3, :cond_d

    .line 794
    .line 795
    .line 796
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 797
    move-result-wide v3

    .line 798
    .line 799
    .line 800
    invoke-static {v3, v4}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 801
    move-result-object v7

    .line 802
    .line 803
    const-string v3, "valueOf(...)"

    .line 804
    .line 805
    .line 806
    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 807
    .line 808
    if-eqz v7, :cond_d

    .line 809
    .line 810
    .line 811
    invoke-static {v0}, Lj50/f;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)I

    .line 812
    move-result v9

    .line 813
    .line 814
    const/16 v15, 0x7d

    .line 815
    .line 816
    const/16 v16, 0x0

    .line 817
    const/4 v8, 0x0

    .line 818
    const/4 v10, 0x0

    .line 819
    const/4 v11, 0x0

    .line 820
    const/4 v12, 0x0

    .line 821
    const/4 v13, 0x0

    .line 822
    const/4 v14, 0x0

    .line 823
    .line 824
    .line 825
    invoke-static/range {v7 .. v16}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 826
    move-result-object v6

    .line 827
    .line 828
    .line 829
    :cond_d
    invoke-static {v6}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 830
    move-result-object v3

    .line 831
    .line 832
    .line 833
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->isNewAipVersion()Ljava/lang/Boolean;

    .line 837
    move-result-object v1

    .line 838
    .line 839
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 840
    .line 841
    .line 842
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 843
    move-result v1

    .line 844
    .line 845
    const-string v3, "spotAipPnlTips"

    .line 846
    .line 847
    if-eqz v1, :cond_f

    .line 848
    .line 849
    .line 850
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getNewAipVersionTip()Ljava/lang/String;

    .line 851
    move-result-object v1

    .line 852
    .line 853
    if-eqz v1, :cond_f

    .line 854
    .line 855
    .line 856
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 857
    move-result v1

    .line 858
    .line 859
    if-nez v1, :cond_e

    .line 860
    goto :goto_b

    .line 861
    .line 862
    :cond_e
    iget-object v1, v2, Ll50/e0;->K:Lcom/kubi/resources/widget/BaseTextView;

    .line 863
    .line 864
    .line 865
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 869
    .line 870
    iget-object v1, v2, Ll50/e0;->K:Lcom/kubi/resources/widget/BaseTextView;

    .line 871
    .line 872
    new-instance v2, Ljava/lang/StringBuilder;

    .line 873
    .line 874
    .line 875
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 876
    .line 877
    const-string v3, "* "

    .line 878
    .line 879
    .line 880
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getNewAipVersionTip()Ljava/lang/String;

    .line 884
    move-result-object v0

    .line 885
    .line 886
    .line 887
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 891
    move-result-object v0

    .line 892
    .line 893
    .line 894
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 895
    return-void

    .line 896
    .line 897
    :cond_f
    :goto_b
    iget-object v0, v2, Ll50/e0;->K:Lcom/kubi/resources/widget/BaseTextView;

    .line 898
    .line 899
    .line 900
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 904
    return-void
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
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

.method public static final b(Ljava/lang/Long;)Ljava/lang/String;
    .locals 8
    .param p0    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    move-result-wide v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-wide v2, v0

    .line 11
    .line 12
    :goto_0
    cmp-long p0, v2, v0

    .line 13
    .line 14
    if-gtz p0, :cond_1

    .line 15
    .line 16
    const-string p0, ""

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_1
    const/16 p0, 0x3e8

    .line 24
    int-to-long v0, p0

    .line 25
    div-long/2addr v2, v0

    .line 26
    .line 27
    const/16 p0, 0xe10

    .line 28
    int-to-long v0, p0

    .line 29
    .line 30
    div-long v4, v2, v0

    .line 31
    .line 32
    rem-long v0, v2, v0

    .line 33
    .line 34
    const/16 p0, 0x3c

    .line 35
    int-to-long v6, p0

    .line 36
    div-long/2addr v0, v6

    .line 37
    rem-long/2addr v2, v6

    .line 38
    .line 39
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {v4, v5}, Lj50/t;->c(J)Ljava/lang/String;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const/16 v4, 0x3a

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lj50/t;->c(J)Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-static {v2, v3}, Lj50/t;->c(J)Ljava/lang/String;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    move-result-object p0

    .line 76
    return-object p0
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
.end method

.method public static final c(J)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    const/16 v0, 0x30

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, v0}, Lkotlin/text/StringsKt;->padStart(Ljava/lang/String;IC)Ljava/lang/String;

    .line 11
    move-result-object p0

    .line 12
    return-object p0
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
.end method

.method public static final d(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Landroid/content/Context;)Ljava/lang/String;
    .locals 5
    .param p0    # Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "ctx"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getInterval()Ljava/lang/String;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    if-eqz p0, :cond_f

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 20
    move-result v0

    .line 21
    .line 22
    const-string v1, "4"

    .line 23
    .line 24
    const-string v2, "2"

    .line 25
    .line 26
    const-string v3, "1"

    .line 27
    .line 28
    const-string v4, "getString(...)"

    .line 29
    .line 30
    .line 31
    sparse-switch v0, :sswitch_data_0

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :sswitch_0
    const-string v0, "m50"

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    move-result p0

    .line 40
    .line 41
    if-nez p0, :cond_0

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_0
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_minute_1:I

    .line 46
    .line 47
    const-string v0, "50"

    .line 48
    .line 49
    .line 50
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    move-result-object p0

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    return-object p0

    .line 60
    .line 61
    :sswitch_1
    const-string v0, "m40"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    move-result p0

    .line 66
    .line 67
    if-nez p0, :cond_1

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_1
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_minute_1:I

    .line 72
    .line 73
    const-string v0, "40"

    .line 74
    .line 75
    .line 76
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    move-result-object p0

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    return-object p0

    .line 86
    .line 87
    :sswitch_2
    const-string v0, "m30"

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    move-result p0

    .line 92
    .line 93
    if-nez p0, :cond_2

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_2
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_minute_1:I

    .line 98
    .line 99
    const-string v0, "30"

    .line 100
    .line 101
    .line 102
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    move-result-object p0

    .line 108
    .line 109
    .line 110
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    return-object p0

    .line 112
    .line 113
    :sswitch_3
    const-string v0, "m20"

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    move-result p0

    .line 118
    .line 119
    if-nez p0, :cond_3

    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :cond_3
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_minute_1:I

    .line 124
    .line 125
    const-string v0, "20"

    .line 126
    .line 127
    .line 128
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    move-result-object p0

    .line 134
    .line 135
    .line 136
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    return-object p0

    .line 138
    .line 139
    :sswitch_4
    const-string v0, "m10"

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    move-result p0

    .line 144
    .line 145
    if-nez p0, :cond_4

    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_4
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_minute_1:I

    .line 150
    .line 151
    const-string v0, "10"

    .line 152
    .line 153
    .line 154
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    move-result-object p0

    .line 160
    .line 161
    .line 162
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    return-object p0

    .line 164
    .line 165
    :sswitch_5
    const-string v0, "H12"

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    move-result p0

    .line 170
    .line 171
    if-nez p0, :cond_5

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_5
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_hour_2:I

    .line 176
    .line 177
    const-string v0, "12"

    .line 178
    .line 179
    .line 180
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 181
    move-result-object v0

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    move-result-object p0

    .line 186
    .line 187
    .line 188
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    return-object p0

    .line 190
    .line 191
    :sswitch_6
    const-string v0, "W2"

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    move-result p0

    .line 196
    .line 197
    if-nez p0, :cond_6

    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_6
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_week_2:I

    .line 202
    .line 203
    .line 204
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 205
    move-result-object v0

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 209
    move-result-object p0

    .line 210
    .line 211
    .line 212
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    return-object p0

    .line 214
    .line 215
    :sswitch_7
    const-string v0, "W1"

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    move-result p0

    .line 220
    .line 221
    if-nez p0, :cond_7

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_7
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_week:I

    .line 226
    .line 227
    .line 228
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 229
    move-result-object v0

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 233
    move-result-object p0

    .line 234
    .line 235
    .line 236
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    return-object p0

    .line 238
    .line 239
    :sswitch_8
    const-string v0, "H8"

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    move-result p0

    .line 244
    .line 245
    if-nez p0, :cond_8

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_8
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_hour_2:I

    .line 250
    .line 251
    const-string v0, "8"

    .line 252
    .line 253
    .line 254
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 255
    move-result-object v0

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 259
    move-result-object p0

    .line 260
    .line 261
    .line 262
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    return-object p0

    .line 264
    .line 265
    :sswitch_9
    const-string v0, "H4"

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    move-result p0

    .line 270
    .line 271
    if-nez p0, :cond_9

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_9
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_hour_2:I

    .line 276
    .line 277
    .line 278
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 279
    move-result-object v0

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 283
    move-result-object p0

    .line 284
    .line 285
    .line 286
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    return-object p0

    .line 288
    .line 289
    :sswitch_a
    const-string v0, "H1"

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    move-result p0

    .line 294
    .line 295
    if-nez p0, :cond_a

    .line 296
    goto :goto_0

    .line 297
    .line 298
    :cond_a
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_hour:I

    .line 299
    .line 300
    .line 301
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 302
    move-result-object v0

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 306
    move-result-object p0

    .line 307
    .line 308
    .line 309
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    return-object p0

    .line 311
    .line 312
    :sswitch_b
    const-string v0, "D4"

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    move-result p0

    .line 317
    .line 318
    if-nez p0, :cond_b

    .line 319
    goto :goto_0

    .line 320
    .line 321
    :cond_b
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_day2:I

    .line 322
    .line 323
    .line 324
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 325
    move-result-object v0

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 329
    move-result-object p0

    .line 330
    .line 331
    .line 332
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    return-object p0

    .line 334
    .line 335
    :sswitch_c
    const-string v0, "D3"

    .line 336
    .line 337
    .line 338
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 339
    move-result p0

    .line 340
    .line 341
    if-nez p0, :cond_c

    .line 342
    goto :goto_0

    .line 343
    .line 344
    :cond_c
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_day2:I

    .line 345
    .line 346
    const-string v0, "3"

    .line 347
    .line 348
    .line 349
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 350
    move-result-object v0

    .line 351
    .line 352
    .line 353
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 354
    move-result-object p0

    .line 355
    .line 356
    .line 357
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    return-object p0

    .line 359
    .line 360
    :sswitch_d
    const-string v0, "D2"

    .line 361
    .line 362
    .line 363
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    move-result p0

    .line 365
    .line 366
    if-nez p0, :cond_d

    .line 367
    goto :goto_0

    .line 368
    .line 369
    :cond_d
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_day2:I

    .line 370
    .line 371
    .line 372
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 373
    move-result-object v0

    .line 374
    .line 375
    .line 376
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 377
    move-result-object p0

    .line 378
    .line 379
    .line 380
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    return-object p0

    .line 382
    .line 383
    :sswitch_e
    const-string v0, "D1"

    .line 384
    .line 385
    .line 386
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 387
    move-result p0

    .line 388
    .line 389
    if-nez p0, :cond_e

    .line 390
    goto :goto_0

    .line 391
    .line 392
    :cond_e
    sget p0, Lcom/kubi/tradingbotkit/R$string;->kc_tb_grid_interval_day:I

    .line 393
    .line 394
    .line 395
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 396
    move-result-object v0

    .line 397
    .line 398
    .line 399
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 400
    move-result-object p0

    .line 401
    .line 402
    .line 403
    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    return-object p0

    .line 405
    .line 406
    :cond_f
    :goto_0
    const-string p0, ""

    .line 407
    return-object p0

    .line 408
    nop

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
    :sswitch_data_0
    .sparse-switch
        0x86d -> :sswitch_e
        0x86e -> :sswitch_d
        0x86f -> :sswitch_c
        0x870 -> :sswitch_b
        0x8e9 -> :sswitch_a
        0x8ec -> :sswitch_9
        0x8f0 -> :sswitch_8
        0xaba -> :sswitch_7
        0xabb -> :sswitch_6
        0x11469 -> :sswitch_5
        0x19f4c -> :sswitch_4
        0x19f6b -> :sswitch_3
        0x19f8a -> :sswitch_2
        0x19fa9 -> :sswitch_1
        0x19fc8 -> :sswitch_0
    .end sparse-switch
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
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
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
