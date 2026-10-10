.class public Lcom/kubi/unify/unify/mapper/OrderMapperImpl;
.super Ljava/lang/Object;
.source "OrderMapperImpl.java"

# interfaces
.implements Lcom/kubi/unify/unify/mapper/OrderMapper;


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
.end method


# virtual methods
.method public toOrderEntity(Lcom/kubi/unify/entity/UnifyOrderEntity;)Lcom/kubi/kumex/data/trade/model/OrderEntity;
    .locals 3

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    .line 6
    :cond_0
    new-instance v0, Lcom/kubi/kumex/data/trade/model/OrderEntity;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/kubi/kumex/data/trade/model/OrderEntity;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getOrderId()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setId(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getOrderType()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, v1}, Lcom/kubi/unify/unify/mapper/OrderMapper;->toLowerCaseCustom(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setType(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getSide()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, v1}, Lcom/kubi/unify/unify/mapper/OrderMapper;->toLowerCaseCustom(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setSide(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTriggerDirection()Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-interface {p0, v1}, Lcom/kubi/unify/unify/mapper/OrderMapper;->toLowerCaseCustom(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setStop(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTriggerPrice()Ljava/math/BigDecimal;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setStopPrice(Ljava/math/BigDecimal;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getReduceOnly()Ljava/lang/Boolean;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setCloseOnly(Ljava/lang/Boolean;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTriggerPriceType()Ljava/lang/String;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setStopPriceType(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getOrderTime()Ljava/lang/Long;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setCreatedAt(Ljava/lang/Long;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getFilledSize()Ljava/math/BigDecimal;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setDealSize(Ljava/math/BigDecimal;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getFilledFunds()Ljava/math/BigDecimal;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setDealValue(Ljava/math/BigDecimal;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getSymbol()Ljava/lang/String;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setSymbol(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getLeverage()Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    new-instance v1, Ljava/math/BigDecimal;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getLeverage()Ljava/lang/String;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    .line 113
    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setLeverage(Ljava/math/BigDecimal;)V

    .line 117
    .line 118
    .line 119
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getChannel()Ljava/lang/String;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setChannel(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTimeInForce()Ljava/lang/String;

    .line 127
    move-result-object v1

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setTimeInForce(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getFromReduce()Ljava/lang/Boolean;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setFromReduce(Ljava/lang/Boolean;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getCloseOrder()Ljava/lang/Boolean;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setCloseOrder(Ljava/lang/Boolean;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getPostOnly()Ljava/lang/Boolean;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setPostOnly(Ljava/lang/Boolean;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getShortcut()Ljava/lang/Boolean;

    .line 155
    move-result-object v1

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setShortcut(Ljava/lang/Boolean;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getHidden()Ljava/lang/Boolean;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setHidden(Ljava/lang/Boolean;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getIceberg()Ljava/lang/Boolean;

    .line 169
    move-result-object v1

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setIceberg(Ljava/lang/Boolean;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getPrice()Ljava/math/BigDecimal;

    .line 176
    move-result-object v1

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setPrice(Ljava/math/BigDecimal;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getCancelSize()Ljava/math/BigDecimal;

    .line 183
    move-result-object v1

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setCancelSize(Ljava/math/BigDecimal;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getSize()Ljava/math/BigDecimal;

    .line 190
    move-result-object v1

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setSize(Ljava/math/BigDecimal;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getVisibleSize()Ljava/math/BigDecimal;

    .line 197
    move-result-object v1

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setVisibleSize(Ljava/math/BigDecimal;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTriggerOrderId()Ljava/lang/String;

    .line 204
    move-result-object v1

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setTriggerOrderId(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getMarginMode()Ljava/lang/String;

    .line 211
    move-result-object v1

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setMarginMode(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getPositionSide()Ljava/lang/String;

    .line 218
    move-result-object v1

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setPositionSide(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getStatus()Ljava/lang/Integer;

    .line 225
    move-result-object v1

    .line 226
    .line 227
    if-eqz v1, :cond_2

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getStatus()Ljava/lang/Integer;

    .line 231
    move-result-object v1

    .line 232
    .line 233
    .line 234
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 235
    move-result-object v1

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setStatus(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getFee()Ljava/math/BigDecimal;

    .line 242
    move-result-object v1

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setFee(Ljava/math/BigDecimal;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getFeeCurrency()Ljava/lang/String;

    .line 249
    move-result-object v1

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setFeeCurrency(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTax()Ljava/math/BigDecimal;

    .line 256
    move-result-object v1

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setTax(Ljava/math/BigDecimal;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getTaxCurrency()Ljava/lang/String;

    .line 263
    move-result-object v1

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setTaxCurrency(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getPnl()Ljava/math/BigDecimal;

    .line 270
    move-result-object v1

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setPnl(Ljava/math/BigDecimal;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyOrderEntity;->getCancelReason()Ljava/lang/String;

    .line 277
    move-result-object v1

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/OrderEntity;->setCancelReason(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-interface {p0, v0, p1}, Lcom/kubi/unify/unify/mapper/OrderMapper;->afterMapping(Lcom/kubi/kumex/data/trade/model/OrderEntity;Lcom/kubi/unify/entity/UnifyOrderEntity;)V

    .line 284
    return-object v0
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
.end method
