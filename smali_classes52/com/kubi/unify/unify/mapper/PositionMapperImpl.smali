.class public Lcom/kubi/unify/unify/mapper/PositionMapperImpl;
.super Ljava/lang/Object;
.source "PositionMapperImpl.java"

# interfaces
.implements Lcom/kubi/unify/unify/mapper/PositionMapper;


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
.method public toPositionEntity(Lcom/kubi/unify/entity/UnifyPositionEntity;)Lcom/kubi/kumex/data/trade/model/PositionEntity;
    .locals 2

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
    new-instance v0, Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getPositionId()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setId(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getCurrentQuantity()Ljava/math/BigDecimal;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setCurrentQty(Ljava/math/BigDecimal;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getAvgPrice()Ljava/math/BigDecimal;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setAvgEntryPrice(Ljava/math/BigDecimal;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getLeverage()Ljava/math/BigDecimal;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setRealLeverage(Ljava/math/BigDecimal;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getUnrealisedCost()Ljava/math/BigDecimal;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setUnrealisedPnl(Ljava/math/BigDecimal;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getOpenTime()Ljava/lang/Long;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setOpeningTimestamp(Ljava/lang/Long;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getCumulativeTax()Ljava/math/BigDecimal;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setTax(Ljava/math/BigDecimal;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getCumulativeFundingFee()Ljava/math/BigDecimal;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setFundingFee(Ljava/math/BigDecimal;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getCumulativeTradeFee()Ljava/math/BigDecimal;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setDealComm(Ljava/math/BigDecimal;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getRealisedCost()Ljava/math/BigDecimal;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setRealisedPnl(Ljava/math/BigDecimal;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getAdlPercentage()Ljava/math/BigDecimal;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setDelevPercentage(Ljava/math/BigDecimal;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getRealisedGrossCost()Ljava/math/BigDecimal;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setRealisedGrossPnl(Ljava/math/BigDecimal;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setMaintMargin(Ljava/math/BigDecimal;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getImr()Ljava/math/BigDecimal;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setCrossIMR(Ljava/math/BigDecimal;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getMmr()Ljava/math/BigDecimal;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setCrossMMR(Ljava/math/BigDecimal;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getSymbol()Ljava/lang/String;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setSymbol(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->isOpen()Ljava/lang/Boolean;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setOpen(Ljava/lang/Boolean;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getCurrentCost()Ljava/math/BigDecimal;

    .line 132
    move-result-object v1

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setCurrentCost(Ljava/math/BigDecimal;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getLiquidationPrice()Ljava/math/BigDecimal;

    .line 139
    move-result-object v1

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setLiquidationPrice(Ljava/math/BigDecimal;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getMarkPrice()Ljava/math/BigDecimal;

    .line 146
    move-result-object v1

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setMarkPrice(Ljava/math/BigDecimal;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getMarkValue()Ljava/math/BigDecimal;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setMarkValue(Ljava/math/BigDecimal;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getPosComm()Ljava/math/BigDecimal;

    .line 160
    move-result-object v1

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setPosComm(Ljava/math/BigDecimal;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getPosCost()Ljava/math/BigDecimal;

    .line 167
    move-result-object v1

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setPosCost(Ljava/math/BigDecimal;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getPosInit()Ljava/math/BigDecimal;

    .line 174
    move-result-object v1

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setPosInit(Ljava/math/BigDecimal;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getPosMaint()Ljava/math/BigDecimal;

    .line 181
    move-result-object v1

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setPosMaint(Ljava/math/BigDecimal;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getPosMargin()Ljava/math/BigDecimal;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setPosMargin(Ljava/math/BigDecimal;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getRealisedGrossCost()Ljava/math/BigDecimal;

    .line 195
    move-result-object v1

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setRealisedGrossCost(Ljava/math/BigDecimal;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getUnrealisedRoePcnt()Ljava/math/BigDecimal;

    .line 202
    move-result-object v1

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setUnrealisedRoePcnt(Ljava/math/BigDecimal;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getSettleCurrency()Ljava/lang/String;

    .line 209
    move-result-object v1

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setSettleCurrency(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->isTrialFunds()Ljava/lang/Boolean;

    .line 216
    move-result-object v1

    .line 217
    .line 218
    if-eqz v1, :cond_1

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->isTrialFunds()Ljava/lang/Boolean;

    .line 222
    move-result-object v1

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 226
    move-result v1

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setTrialFunds(Z)V

    .line 230
    .line 231
    .line 232
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getMarginMode()Ljava/lang/String;

    .line 233
    move-result-object v1

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setMarginMode(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getRiskRatio()Ljava/math/BigDecimal;

    .line 240
    move-result-object v1

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setRiskRatio(Ljava/math/BigDecimal;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getLatestPrice()Ljava/math/BigDecimal;

    .line 247
    move-result-object v1

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setLatestPrice(Ljava/math/BigDecimal;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getLatestUnrealisedPnl()Ljava/math/BigDecimal;

    .line 254
    move-result-object v1

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setLatestUnrealisedPnl(Ljava/math/BigDecimal;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getLatestUnrealisedRoePcnt()Ljava/math/BigDecimal;

    .line 261
    move-result-object v1

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setLatestUnrealisedRoePcnt(Ljava/math/BigDecimal;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1}, Lcom/kubi/unify/entity/UnifyPositionEntity;->getPositionSide()Ljava/lang/String;

    .line 268
    move-result-object p1

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->setPositionSide(Ljava/lang/String;)V

    .line 272
    return-object v0
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
.end method
