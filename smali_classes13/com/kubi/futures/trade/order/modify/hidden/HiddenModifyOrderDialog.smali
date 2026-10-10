.class public final Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;
.super Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;
.source "HiddenModifyOrderDialog.kt"

# interfaces
.implements Lcom/kubi/futures/trade/submit/panel/tradeType/hidden/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0008\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016J\u0008\u0010\u0011\u001a\u00020\nH\u0016J\u0008\u0010\u0012\u001a\u00020\u0013H\u0016J\u0008\u0010\u0014\u001a\u00020\u0008H\u0016J\u0008\u0010\u0015\u001a\u00020\u000fH\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;",
        "Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;",
        "Lcom/kubi/futures/trade/submit/panel/tradeType/hidden/IHiddenInputPanel;",
        "<init>",
        "()V",
        "orderType",
        "Lcom/kubi/kumex/logic/constant/OrderTradeType;",
        "initView",
        "",
        "tradeInputInitialized",
        "",
        "isModifyOfOrder",
        "showQty",
        "Ljava/math/BigDecimal;",
        "side",
        "",
        "showInputQty",
        "isFullPercent",
        "createValidate",
        "Lcom/kubi/futures/trade/submit/validate/factory/OrderValidate$Factory;",
        "ensureInputPrecision",
        "blockId",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;-><init>()V

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
.end method

.method public static synthetic C5(Ldm/l0;Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;->D5(Ldm/l0;Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final D5(Ldm/l0;Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Ldm/l0;->c:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->m()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;->u5()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    sget p0, Lcom/kubi/kumex/R$string;->kc_trade_order_not_modify:I

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p0}, Lcom/kubi/kumex/utils/m0;->c(Landroidx/lifecycle/LifecycleOwner;I)V

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 25
    return-object p0

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;->b5()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    const/16 v4, 0x8

    .line 36
    const/4 v5, 0x0

    .line 37
    .line 38
    const-string v2, "1"

    .line 39
    const/4 v3, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;->o1()V

    .line 46
    .line 47
    iget-object p0, p0, Ldm/l0;->c:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->o()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->d5()Lcom/kubi/futures/trade/order/modify/limit/s;

    .line 54
    move-result-object p0

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1, p1}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderViewModel;->V(Lcom/kubi/futures/trade/submit/validate/f;Lcom/kubi/futures/trade/submit/panel/tradeType/a3;)V

    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 60
    return-object p0
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
.end method


# virtual methods
.method public E4()Lcom/kubi/kumex/logic/constant/OrderTradeType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/logic/constant/OrderTradeType;->Hidden:Lcom/kubi/kumex/logic/constant/OrderTradeType;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public J1()Lcom/kubi/futures/trade/submit/validate/factory/f$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->w4()Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getVisibleSize()Ljava/math/BigDecimal;

    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Lcom/kubi/futures/trade/submit/validate/factory/b;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/kubi/futures/trade/submit/validate/factory/b;-><init>()V

    .line 24
    return-object v0

    .line 25
    .line 26
    :cond_1
    new-instance v0, Lcom/kubi/futures/trade/submit/validate/factory/c;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Lcom/kubi/futures/trade/submit/validate/factory/c;-><init>()V

    .line 30
    return-object v0
    .line 31
    .line 32
    .line 33
.end method

.method public L2(Ljava/lang/String;)Ljava/math/BigDecimal;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "side"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->Q2()Lhi/a;

    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    return-object v1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->x4()Lki/a;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->v2(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;->u1()Ljava/math/BigDecimal;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    .line 28
    invoke-interface {v2, v0, p1, v3, v1}, Lki/a;->i(Lhi/a;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 29
    move-result-object p1

    .line 30
    return-object p1
    .line 31
    .line 32
.end method

.method public V1()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
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
.end method

.method public a2()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->CREATED:Landroidx/lifecycle/Lifecycle$State;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    .line 14
    move-result v0

    .line 15
    return v0
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
.end method

.method public b5()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->w4()Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getVisibleSize()Ljava/math/BigDecimal;

    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string v0, "ModifyHiddenOrder"

    .line 21
    return-object v0

    .line 22
    .line 23
    :cond_1
    const-string v0, "ModifyIcebergOrder"

    .line 24
    return-object v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public initView()V
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->initView()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->c5()Ldm/l0;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->Q2()Lhi/a;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->w4()Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    :goto_0
    return-void

    .line 25
    .line 26
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    sget-object v4, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 32
    .line 33
    sget v5, Lcom/kubi/kumex/R$string;->show_amount:I

    .line 34
    const/4 v6, 0x0

    .line 35
    .line 36
    new-array v7, v6, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v5, v7}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const/16 v4, 0x28

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->t0()Lki/a;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    .line 55
    invoke-interface {v4, v1}, Lki/a;->g(Lhi/a;)Ljava/math/BigDecimal;

    .line 56
    move-result-object v4

    .line 57
    .line 58
    .line 59
    invoke-static {v4}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 64
    move-result-object v4

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const/16 v4, 0x29

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    move-result-object v3

    .line 77
    .line 78
    iget-object v7, v0, Ldm/l0;->x:Lcom/kubi/resources/widget/KcTradeNumAbInputView;

    .line 79
    .line 80
    .line 81
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 82
    const/4 v4, 0x1

    .line 83
    .line 84
    .line 85
    invoke-static {v7, v4}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7, v3}, Lcom/kubi/resources/widget/KcTradeNumAbInputView;->setHint(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v4}, Lcom/kubi/resources/widget/KcTradeNumAbInputView;->setSupportFloatInputFilter(Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->x4()Lki/a;

    .line 95
    move-result-object v3

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getPrice()Ljava/math/BigDecimal;

    .line 99
    move-result-object v5

    .line 100
    const/4 v13, 0x0

    .line 101
    .line 102
    .line 103
    invoke-interface {v3, v1, v5, v13}, Lki/a;->j(Lhi/a;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 104
    move-result-object v8

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->x4()Lki/a;

    .line 108
    move-result-object v3

    .line 109
    .line 110
    .line 111
    invoke-interface {v3, v1}, Lki/a;->k(Lhi/a;)I

    .line 112
    move-result v9

    .line 113
    const/4 v11, 0x4

    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v10, 0x0

    .line 116
    .line 117
    .line 118
    invoke-static/range {v7 .. v12}, Lcom/kubi/resources/widget/e0;->d(Lcom/kubi/resources/widget/e0;Ljava/math/BigDecimal;IZILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->x4()Lki/a;

    .line 122
    move-result-object v3

    .line 123
    .line 124
    .line 125
    invoke-interface {v3, v1}, Lki/a;->g(Lhi/a;)Ljava/math/BigDecimal;

    .line 126
    move-result-object v3

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, v3}, Lcom/kubi/resources/widget/KcTradeNumAbInputView;->setEnsureIncrement(Ljava/math/BigDecimal;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getVisibleSize()Ljava/math/BigDecimal;

    .line 133
    move-result-object v3

    .line 134
    .line 135
    if-eqz v3, :cond_3

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 139
    move-result-object v3

    .line 140
    goto :goto_1

    .line 141
    :cond_3
    move-object v3, v13

    .line 142
    .line 143
    .line 144
    :goto_1
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 145
    move-result-object v3

    .line 146
    .line 147
    sget-object v5, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 151
    move-result v5

    .line 152
    .line 153
    if-nez v5, :cond_4

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7}, Lcom/kubi/resources/widget/KcTradeNumAbInputView;->getEditText()Landroid/widget/EditText;

    .line 157
    move-result-object v1

    .line 158
    .line 159
    const-string v2, "0"

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    goto :goto_2

    .line 164
    .line 165
    .line 166
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->x4()Lki/a;

    .line 167
    move-result-object v5

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getPrice()Ljava/math/BigDecimal;

    .line 171
    move-result-object v2

    .line 172
    .line 173
    .line 174
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 175
    move-result-object v2

    .line 176
    .line 177
    .line 178
    invoke-interface {v5, v1, v2, v3, v13}, Lki/a;->c(Lhi/a;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 179
    move-result-object v1

    .line 180
    .line 181
    .line 182
    invoke-static {v1}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 183
    move-result-object v1

    .line 184
    .line 185
    const-string v2, "stripTrailingZeros(...)"

    .line 186
    .line 187
    .line 188
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    const/4 v2, 0x2

    .line 190
    .line 191
    .line 192
    invoke-static {v7, v1, v6, v2, v13}, Lcom/kubi/resources/widget/e0;->a(Lcom/kubi/resources/widget/e0;Ljava/math/BigDecimal;ZILjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :goto_2
    invoke-static {v3}, Lkf/a;->B(Ljava/math/BigDecimal;)Z

    .line 196
    move-result v1

    .line 197
    xor-int/2addr v1, v4

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7, v1}, Lcom/kubi/resources/widget/KcTradeNumAbInputView;->setStatusEnabled(Z)V

    .line 201
    .line 202
    iget-object v8, v0, Ldm/l0;->c:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 203
    .line 204
    const-string v1, "confirm"

    .line 205
    .line 206
    .line 207
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    new-instance v11, Lri/a;

    .line 210
    .line 211
    .line 212
    invoke-direct {v11, v0, p0}, Lri/a;-><init>(Ldm/l0;Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;)V

    .line 213
    const/4 v12, 0x1

    .line 214
    const/4 v13, 0x0

    .line 215
    .line 216
    const-wide/16 v9, 0x0

    .line 217
    .line 218
    .line 219
    invoke-static/range {v8 .. v13}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 220
    return-void
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
.end method

.method public o1()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->o1()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->c5()Ldm/l0;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Ldm/l0;->x:Lcom/kubi/resources/widget/KcTradeNumAbInputView;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/KcTradeNumAbInputView;->g(Z)V

    .line 18
    :cond_0
    return-void
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
.end method

.method public u1()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->c5()Ldm/l0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Ldm/l0;->x:Lcom/kubi/resources/widget/KcTradeNumAbInputView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/resources/widget/KcTradeNumAbInputView;->getValue()Ljava/math/BigDecimal;

    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
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
.end method

.method public u5()Z
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;->w4()Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getSide()Ljava/lang/String;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    const-string v3, "buy"

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->v2(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getSide()Ljava/lang/String;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    .line 29
    invoke-static {v4, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v4}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->I2(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getSide()Ljava/lang/String;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    .line 41
    invoke-static {v5, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v3}, Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;->L2(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->x0()Ljava/math/BigDecimal;

    .line 50
    move-result-object v5

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;->g0()Ljava/math/BigDecimal;

    .line 54
    move-result-object v6

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getPrice()Ljava/math/BigDecimal;

    .line 58
    move-result-object v7

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v7}, Lcom/kubi/kumex/utils/k0;->b(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Z

    .line 62
    move-result v2

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getSize()Ljava/math/BigDecimal;

    .line 68
    move-result-object v2

    .line 69
    const/4 v7, 0x0

    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getDealSize()Ljava/math/BigDecimal;

    .line 81
    move-result-object v8

    .line 82
    .line 83
    .line 84
    invoke-static {v8}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 85
    move-result-object v8

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v8}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 89
    move-result-object v2

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    move-object v2, v7

    .line 92
    .line 93
    .line 94
    :goto_0
    invoke-static {v4, v2}, Lcom/kubi/kumex/utils/k0;->b(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Z

    .line 95
    move-result v2

    .line 96
    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getVisibleSize()Ljava/math/BigDecimal;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    if-eqz v2, :cond_2

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 107
    move-result-object v7

    .line 108
    .line 109
    .line 110
    :cond_2
    invoke-static {v3, v7}, Lcom/kubi/kumex/utils/k0;->b(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Z

    .line 111
    move-result v2

    .line 112
    .line 113
    if-eqz v2, :cond_4

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getTriggerStopUpPrice()Ljava/math/BigDecimal;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    .line 120
    invoke-static {v5, v2}, Lcom/kubi/kumex/utils/k0;->b(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Z

    .line 121
    move-result v2

    .line 122
    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getTriggerStopDownPrice()Ljava/math/BigDecimal;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    .line 130
    invoke-static {v6, v0}, Lcom/kubi/kumex/utils/k0;->b(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Z

    .line 131
    move-result v0

    .line 132
    .line 133
    if-nez v0, :cond_3

    .line 134
    goto :goto_1

    .line 135
    :cond_3
    return v1

    .line 136
    :cond_4
    :goto_1
    const/4 v0, 0x1

    .line 137
    return v0
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
.end method
