.class public Lcom/kubi/spot/business/delegation/delegateHistory/b0;
.super Lcom/kubi/spot/business/delegation/delegateHistory/d;
.source "DelegationHistoryNormalItemView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryNormalItemView;",
        "Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryBaseItemView;",
        "<init>",
        "()V",
        "bindItemView",
        "",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "Lcom/kubi/spot/entity/DelegationEntity;",
        "isUpGreen",
        "",
        "isTradePage",
        "delegationHistoryFragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "SpotLib_googleRelease"
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
        "SMAP\nDelegationHistoryNormalItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationHistoryNormalItemView.kt\ncom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryNormalItemView\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,66:1\n17#2,2:67\n*S KotlinDebug\n*F\n+ 1 DelegationHistoryNormalItemView.kt\ncom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryNormalItemView\n*L\n24#1:67,2\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/spot/business/delegation/delegateHistory/d;-><init>()V

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
.end method


# virtual methods
.method public a(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/entity/DelegationEntity;ZZLcom/kubi/sdk/BaseFragment;)V
    .locals 2
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/spot/entity/DelegationEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "item"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "delegationHistoryFragment"

    .line 13
    .line 14
    .line 15
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-super/range {p0 .. p5}, Lcom/kubi/spot/business/delegation/delegateHistory/d;->a(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/spot/entity/DelegationEntity;ZZLcom/kubi/sdk/BaseFragment;)V

    .line 19
    .line 20
    sget-object p3, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 21
    .line 22
    sget-object p4, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p4}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 26
    move-result-object p4

    .line 27
    .line 28
    const-class v0, Lzf/o0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, v0, p4}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    move-result-object p3

    .line 33
    const/4 p4, 0x0

    .line 34
    .line 35
    if-eqz p3, :cond_0

    .line 36
    .line 37
    check-cast p3, Lzf/o0;

    .line 38
    .line 39
    .line 40
    invoke-interface {p3}, Lzf/o0;->a()Z

    .line 41
    move-result p3

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move p3, p4

    .line 44
    .line 45
    :goto_0
    if-eqz p3, :cond_1

    .line 46
    .line 47
    sget p3, Lcom/kubi/spot/R$string;->price:I

    .line 48
    goto :goto_1

    .line 49
    .line 50
    :cond_1
    sget p3, Lcom/kubi/spot/R$string;->deal_avg_price:I

    .line 51
    .line 52
    :goto_1
    sget v0, Lcom/kubi/spot/R$id;->tv_avg_price_label:I

    .line 53
    .line 54
    new-array v1, p4, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p5, p3, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    move-result-object p3

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0, p3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 62
    move-result-object p3

    .line 63
    .line 64
    sget v0, Lcom/kubi/spot/R$id;->tv_average_price:I

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getAveragePrice()Ljava/math/BigDecimal;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v1}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 76
    move-result-object p3

    .line 77
    .line 78
    sget v0, Lcom/kubi/spot/R$id;->tv_delegation_price_label:I

    .line 79
    .line 80
    sget v1, Lcom/kubi/spot/R$string;->delegation_price:I

    .line 81
    .line 82
    new-array p4, p4, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p5, v1, p4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    move-result-object p4

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3, v0, p4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 90
    move-result-object p3

    .line 91
    .line 92
    sget p4, Lcom/kubi/spot/R$id;->tv_delegation_price:I

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/kubi/spot/business/delegation/delegateHistory/d;->h()Z

    .line 96
    move-result v0

    .line 97
    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    sget v0, Lcom/kubi/spot/R$string;->market_price:I

    .line 101
    .line 102
    .line 103
    invoke-virtual {p5, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 104
    move-result-object p5

    .line 105
    goto :goto_2

    .line 106
    .line 107
    .line 108
    :cond_2
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getPrice()Ljava/math/BigDecimal;

    .line 109
    move-result-object p5

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, p5}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 113
    move-result-object p5

    .line 114
    .line 115
    .line 116
    :goto_2
    invoke-virtual {p3, p4, p5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 117
    .line 118
    sget p3, Lcom/kubi/spot/R$id;->tv_trigger_price:I

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/kubi/spot/business/delegation/delegateHistory/d;->i()Z

    .line 122
    move-result p4

    .line 123
    .line 124
    if-eqz p4, :cond_5

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStop()Ljava/lang/String;

    .line 128
    move-result-object p4

    .line 129
    .line 130
    const-string p5, "loss"

    .line 131
    .line 132
    .line 133
    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    move-result p5

    .line 135
    .line 136
    if-eqz p5, :cond_3

    .line 137
    .line 138
    new-instance p4, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    const/16 p5, 0x2264

    .line 144
    .line 145
    .line 146
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStopPrice()Ljava/math/BigDecimal;

    .line 150
    move-result-object p5

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, p5}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 154
    move-result-object p2

    .line 155
    .line 156
    .line 157
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    move-result-object p2

    .line 162
    goto :goto_3

    .line 163
    .line 164
    :cond_3
    const-string p5, "entry"

    .line 165
    .line 166
    .line 167
    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    move-result p4

    .line 169
    .line 170
    if-eqz p4, :cond_4

    .line 171
    .line 172
    new-instance p4, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    const/16 p5, 0x2265

    .line 178
    .line 179
    .line 180
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStopPrice()Ljava/math/BigDecimal;

    .line 184
    move-result-object p5

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, p5}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 188
    move-result-object p2

    .line 189
    .line 190
    .line 191
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    move-result-object p2

    .line 196
    goto :goto_3

    .line 197
    .line 198
    .line 199
    :cond_4
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStopPrice()Ljava/math/BigDecimal;

    .line 200
    move-result-object p4

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2, p4}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 204
    move-result-object p2

    .line 205
    goto :goto_3

    .line 206
    .line 207
    :cond_5
    const-string p2, "--"

    .line 208
    .line 209
    .line 210
    :goto_3
    invoke-virtual {p1, p3, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 211
    return-void
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
.end method
