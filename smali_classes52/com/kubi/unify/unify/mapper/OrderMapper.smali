.class public interface abstract Lcom/kubi/unify/unify/mapper/OrderMapper;
.super Ljava/lang/Object;
.source "OrderMapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0003H\u0017J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001a\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0001\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0017\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000c\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/unify/unify/mapper/OrderMapper;",
        "",
        "toLowerCaseCustom",
        "",
        "toOrderEntity",
        "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
        "entity",
        "Lcom/kubi/unify/entity/UnifyOrderEntity;",
        "afterMapping",
        "",
        "target",
        "source",
        "BUnifyAccountLib_googleRelease"
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
        "SMAP\nOrderMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderMapper.kt\ncom/kubi/unify/unify/mapper/OrderMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1#2:106\n295#3,2:107\n*S KotlinDebug\n*F\n+ 1 OrderMapper.kt\ncom/kubi/unify/unify/mapper/OrderMapper\n*L\n94#1:107,2\n*E\n"
    }
.end annotation


# virtual methods
.method public afterMapping(Lcom/kubi/kumex/data/trade/model/OrderEntity;Lcom/kubi/unify/entity/UnifyOrderEntity;)V
    .locals 6
    .param p1    # Lcom/kubi/kumex/data/trade/model/OrderEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/unify/entity/UnifyOrderEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "target"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "source"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getSlTriggerPriceType()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 21
    move-result v2

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    :cond_0
    move-object v0, v1

    .line 25
    .line 26
    :cond_1
    const-string v2, "buy"

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setStopPriceType(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getSide()Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v0

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getSlTriggerPrice()Ljava/math/BigDecimal;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setTriggerStopDownPrice(Ljava/math/BigDecimal;)V

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getSlTriggerPrice()Ljava/math/BigDecimal;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setTriggerStopUpPrice(Ljava/math/BigDecimal;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_0
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTpTriggerPriceType()Ljava/lang/String;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 66
    move-result v3

    .line 67
    .line 68
    if-nez v3, :cond_5

    .line 69
    :cond_4
    move-object v0, v1

    .line 70
    .line 71
    :cond_5
    if-eqz v0, :cond_7

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setStopPriceType(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->getSide()Ljava/lang/String;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result v0

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTpTriggerPrice()Ljava/math/BigDecimal;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setTriggerStopUpPrice(Ljava/math/BigDecimal;)V

    .line 92
    goto :goto_1

    .line 93
    .line 94
    .line 95
    :cond_6
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTpTriggerPrice()Ljava/math/BigDecimal;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setTriggerStopDownPrice(Ljava/math/BigDecimal;)V

    .line 100
    .line 101
    .line 102
    :cond_7
    :goto_1
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getStatus()Ljava/lang/Integer;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    sget-object v2, Lcom/kubi/unify/api/entity/UnifyOrderStatusEnum;->CANCELED:Lcom/kubi/unify/api/entity/UnifyOrderStatusEnum;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lcom/kubi/unify/api/entity/UnifyOrderStatusEnum;->getType()I

    .line 109
    move-result v2

    .line 110
    const/4 v3, 0x1

    .line 111
    const/4 v4, 0x0

    .line 112
    .line 113
    if-nez v0, :cond_8

    .line 114
    goto :goto_2

    .line 115
    .line 116
    .line 117
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 118
    move-result v0

    .line 119
    .line 120
    if-eq v0, v2, :cond_b

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getStatus()Ljava/lang/Integer;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    sget-object v2, Lcom/kubi/unify/api/entity/UnifyOrderStatusEnum;->PARTIAL_CANCELED:Lcom/kubi/unify/api/entity/UnifyOrderStatusEnum;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Lcom/kubi/unify/api/entity/UnifyOrderStatusEnum;->getType()I

    .line 130
    move-result v2

    .line 131
    .line 132
    if-nez v0, :cond_9

    .line 133
    goto :goto_3

    .line 134
    .line 135
    .line 136
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 137
    move-result v0

    .line 138
    .line 139
    if-ne v0, v2, :cond_a

    .line 140
    goto :goto_4

    .line 141
    :cond_a
    :goto_3
    move v0, v4

    .line 142
    goto :goto_5

    .line 143
    :cond_b
    :goto_4
    move v0, v3

    .line 144
    .line 145
    .line 146
    :goto_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setCancelExist(Ljava/lang/Boolean;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getStatus()Ljava/lang/Integer;

    .line 154
    move-result-object v0

    .line 155
    .line 156
    sget-object v2, Lcom/kubi/unify/api/entity/UnifyOrderStatusEnum;->TRIGGERED:Lcom/kubi/unify/api/entity/UnifyOrderStatusEnum;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Lcom/kubi/unify/api/entity/UnifyOrderStatusEnum;->getType()I

    .line 160
    move-result v2

    .line 161
    .line 162
    if-nez v0, :cond_c

    .line 163
    goto :goto_6

    .line 164
    .line 165
    .line 166
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 167
    move-result v0

    .line 168
    .line 169
    if-ne v0, v2, :cond_d

    .line 170
    goto :goto_7

    .line 171
    :cond_d
    :goto_6
    move v3, v4

    .line 172
    .line 173
    .line 174
    :goto_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setStopTriggered(Ljava/lang/Boolean;)V

    .line 179
    .line 180
    .line 181
    invoke-static {}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->getEntries()Lkotlin/enums/EnumEntries;

    .line 182
    move-result-object v0

    .line 183
    .line 184
    .line 185
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 186
    move-result-object v0

    .line 187
    .line 188
    .line 189
    :cond_e
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    move-result v2

    .line 191
    .line 192
    if-eqz v2, :cond_10

    .line 193
    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    move-result-object v2

    .line 197
    move-object v3, v2

    .line 198
    .line 199
    check-cast v3, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->getType()I

    .line 203
    move-result v3

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getOrderDisplayType()Ljava/lang/Integer;

    .line 207
    move-result-object v5

    .line 208
    .line 209
    if-nez v5, :cond_f

    .line 210
    goto :goto_8

    .line 211
    .line 212
    .line 213
    :cond_f
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 214
    move-result v5

    .line 215
    .line 216
    if-ne v3, v5, :cond_e

    .line 217
    goto :goto_9

    .line 218
    :cond_10
    move-object v2, v1

    .line 219
    .line 220
    :goto_9
    check-cast v2, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 221
    .line 222
    if-eqz v2, :cond_11

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->getTradeType()Ljava/lang/String;

    .line 226
    move-result-object v0

    .line 227
    goto :goto_a

    .line 228
    :cond_11
    move-object v0, v1

    .line 229
    .line 230
    :goto_a
    const-string v3, "limit"

    .line 231
    .line 232
    .line 233
    invoke-static {v0, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    move-result-object v0

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setDisplayType(Ljava/lang/String;)V

    .line 238
    .line 239
    if-eqz v2, :cond_12

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->getDisplayString()I

    .line 243
    move-result v0

    .line 244
    .line 245
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 246
    .line 247
    new-array v3, v4, [Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v0, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 251
    move-result-object v0

    .line 252
    goto :goto_b

    .line 253
    :cond_12
    move-object v0, v1

    .line 254
    .line 255
    .line 256
    :goto_b
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setAdvancedDisplayType(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTriggerDirection()Ljava/lang/String;

    .line 260
    move-result-object v0

    .line 261
    .line 262
    .line 263
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 264
    move-result v0

    .line 265
    .line 266
    if-nez v0, :cond_13

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setDealValue(Ljava/math/BigDecimal;)V

    .line 270
    .line 271
    .line 272
    :cond_13
    invoke-virtual {p2}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getMarginMode()Ljava/lang/String;

    .line 273
    move-result-object p2

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, p2}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setMarginMode(Ljava/lang/String;)V

    .line 277
    return-void
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
.end method

.method public toLowerCaseCustom(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    const-string v0, "toLowerCase(...)"

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    return-object p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return-object p1
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
.end method

.method public abstract toOrderEntity(Lcom/kubi/unify/entity/UnifyOrderEntity;)Lcom/kubi/kumex/data/trade/model/OrderEntity;
    .param p1    # Lcom/kubi/unify/entity/UnifyOrderEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
