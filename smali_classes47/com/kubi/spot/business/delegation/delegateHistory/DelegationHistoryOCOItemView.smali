.class public Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView;
.super Lcom/kubi/spot/business/delegation/delegateHistory/d;
.source "DelegationHistoryOCOItemView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView;",
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
        "Companion",
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


# static fields
.field public static final c:Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView;->c:Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView$Companion;

    .line 9
    return-void
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
    sget p3, Lcom/kubi/spot/R$id;->tv_avg_price_label:I

    .line 21
    .line 22
    sget p4, Lcom/kubi/spot/R$string;->oco_price:I

    .line 23
    const/4 v0, 0x0

    .line 24
    .line 25
    new-array v1, v0, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p5, p4, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    move-result-object p4

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p3, p4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 33
    move-result-object p3

    .line 34
    .line 35
    sget p4, Lcom/kubi/spot/R$id;->tv_average_price:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getPrice()Ljava/math/BigDecimal;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v1}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3, p4, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 47
    move-result-object p3

    .line 48
    .line 49
    sget p4, Lcom/kubi/spot/R$id;->tv_delegation_price_label:I

    .line 50
    .line 51
    sget v1, Lcom/kubi/spot/R$string;->trade_limit_price:I

    .line 52
    .line 53
    new-array v0, v0, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p5, v1, v0}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3, p4, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 61
    move-result-object p3

    .line 62
    .line 63
    sget p4, Lcom/kubi/spot/R$id;->tv_delegation_price:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kubi/spot/business/delegation/delegateHistory/d;->h()Z

    .line 67
    move-result v0

    .line 68
    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    sget v0, Lcom/kubi/spot/R$string;->market_price:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p5, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 75
    move-result-object p5

    .line 76
    goto :goto_0

    .line 77
    .line 78
    .line 79
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getLimitPrice()Ljava/math/BigDecimal;

    .line 80
    move-result-object p5

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, p5}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 84
    move-result-object p5

    .line 85
    .line 86
    .line 87
    :goto_0
    invoke-virtual {p3, p4, p5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 88
    .line 89
    sget p3, Lcom/kubi/spot/R$id;->tv_trigger_price:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/kubi/spot/business/delegation/delegateHistory/d;->i()Z

    .line 93
    move-result p4

    .line 94
    .line 95
    if-eqz p4, :cond_4

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStop()Ljava/lang/String;

    .line 99
    move-result-object p4

    .line 100
    .line 101
    if-eqz p4, :cond_3

    .line 102
    .line 103
    .line 104
    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    .line 105
    move-result p5

    .line 106
    .line 107
    .line 108
    sparse-switch p5, :sswitch_data_0

    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :sswitch_0
    const-string p5, "l_s_o"

    .line 113
    .line 114
    .line 115
    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    move-result p4

    .line 117
    .line 118
    if-nez p4, :cond_1

    .line 119
    goto :goto_1

    .line 120
    .line 121
    :sswitch_1
    const-string p5, "l_oco"

    .line 122
    .line 123
    .line 124
    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    move-result p4

    .line 126
    .line 127
    if-nez p4, :cond_1

    .line 128
    goto :goto_1

    .line 129
    .line 130
    :sswitch_2
    const-string p5, "l_l_o"

    .line 131
    .line 132
    .line 133
    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    move-result p4

    .line 135
    .line 136
    if-nez p4, :cond_1

    .line 137
    goto :goto_1

    .line 138
    .line 139
    :cond_1
    new-instance p4, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    const/16 p5, 0x2264

    .line 145
    .line 146
    .line 147
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStopPrice()Ljava/math/BigDecimal;

    .line 151
    move-result-object p5

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, p5}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 155
    move-result-object p2

    .line 156
    .line 157
    .line 158
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    move-result-object p2

    .line 163
    goto :goto_2

    .line 164
    .line 165
    :sswitch_3
    const-string p5, "e_s_o"

    .line 166
    .line 167
    .line 168
    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    move-result p4

    .line 170
    .line 171
    if-nez p4, :cond_2

    .line 172
    goto :goto_1

    .line 173
    .line 174
    :sswitch_4
    const-string p5, "e_oco"

    .line 175
    .line 176
    .line 177
    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    move-result p4

    .line 179
    .line 180
    if-nez p4, :cond_2

    .line 181
    goto :goto_1

    .line 182
    .line 183
    :sswitch_5
    const-string p5, "e_l_o"

    .line 184
    .line 185
    .line 186
    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    move-result p4

    .line 188
    .line 189
    if-nez p4, :cond_2

    .line 190
    goto :goto_1

    .line 191
    .line 192
    :cond_2
    new-instance p4, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    const/16 p5, 0x2265

    .line 198
    .line 199
    .line 200
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStopPrice()Ljava/math/BigDecimal;

    .line 204
    move-result-object p5

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, p5}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 208
    move-result-object p2

    .line 209
    .line 210
    .line 211
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    move-result-object p2

    .line 216
    goto :goto_2

    .line 217
    .line 218
    .line 219
    :cond_3
    :goto_1
    invoke-virtual {p2}, Lcom/kubi/spot/entity/DelegationEntity;->getStopPrice()Ljava/math/BigDecimal;

    .line 220
    move-result-object p4

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2, p4}, Lcom/kubi/spot/entity/DelegationEntity;->getPriceFormatterStr(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 224
    move-result-object p2

    .line 225
    goto :goto_2

    .line 226
    .line 227
    :cond_4
    const-string p2, "--"

    .line 228
    .line 229
    .line 230
    :goto_2
    invoke-virtual {p1, p3, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 231
    return-void

    .line 232
    nop

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
    :sswitch_data_0
    .sparse-switch
        0x5bc1682 -> :sswitch_5
        0x5bc2241 -> :sswitch_4
        0x5bc30c9 -> :sswitch_3
        0x61ebb09 -> :sswitch_2
        0x61ec6c8 -> :sswitch_1
        0x61ed550 -> :sswitch_0
    .end sparse-switch
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
