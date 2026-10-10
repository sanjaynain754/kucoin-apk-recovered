.class public final Lkv/e;
.super Ljava/lang/Object;
.source "FavTradeBeanMapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0008"
    }
    d2 = {
        "convert",
        "Lcom/kubi/quotefacade/entity/AllTradeItemBean;",
        "input",
        "Lcom/kubi/quotefacade/entity/AlphaItemEntity;",
        "type",
        "",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "Lcom/kubi/quotefacade/entity/MarketListEntityItem;",
        "QuoteFacadeLib_googleRelease"
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
.method public static final a(Lcom/kubi/quotefacade/entity/AllTradeItemBean;Lcom/kubi/data/entity/TradeItemBean;I)Lcom/kubi/quotefacade/entity/AllTradeItemBean;
    .locals 2
    .param p0    # Lcom/kubi/quotefacade/entity/AllTradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/kubi/data/entity/TradeItemBean;
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
    const-string v0, "input"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->setCollectType(I)V

    .line 14
    const/4 p2, 0x0

    .line 15
    .line 16
    iput-boolean p2, p0, Lcom/kubi/data/entity/TradeItemBean;->isChecked:Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getChangeRate()Ljava/lang/Double;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setChangeRate(Ljava/lang/Double;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getLastDealPrice()D

    .line 27
    move-result-wide v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/kubi/data/entity/TradeItemBean;->setLastDealPrice(D)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setSymbol(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getValue()D

    .line 41
    move-result-wide v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0, v1}, Lcom/kubi/data/entity/TradeItemBean;->setValue(D)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->isAlarm()Z

    .line 48
    move-result p2

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setAlarm(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getMark()I

    .line 55
    move-result p2

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setMark(I)V

    .line 59
    const/4 p2, 0x1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setFavor(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getCoinLabel()Ljava/lang/String;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setCoinLabel(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setSymbolInfoEntity(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getMaxLeverage()I

    .line 80
    move-result p1

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Lcom/kubi/data/entity/TradeItemBean;->setMaxLeverage(I)V

    .line 84
    return-object p0
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
.end method

.method public static final b(Lcom/kubi/quotefacade/entity/AllTradeItemBean;Lcom/kubi/quotefacade/entity/AlphaItemEntity;I)Lcom/kubi/quotefacade/entity/AllTradeItemBean;
    .locals 2
    .param p0    # Lcom/kubi/quotefacade/entity/AllTradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/kubi/quotefacade/entity/AlphaItemEntity;
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
    const-string v0, "input"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->setCollectType(I)V

    .line 14
    const/4 p2, 0x0

    .line 15
    .line 16
    iput-boolean p2, p0, Lcom/kubi/data/entity/TradeItemBean;->isChecked:Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getPriceRate()Ljava/math/BigDecimal;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 24
    move-result-wide v0

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/kubi/data/entity/TradeItemBean;->setChangeRate(Ljava/lang/Double;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getPrice()Ljava/math/BigDecimal;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 39
    move-result-wide v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0, v1}, Lcom/kubi/data/entity/TradeItemBean;->setLastDealPrice(D)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getDisplayToken()Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lcom/kubi/data/entity/TradeItemBean;->setShowSymbol(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getTradingVolume()Ljava/math/BigDecimal;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 57
    move-result-wide v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0, v1}, Lcom/kubi/data/entity/TradeItemBean;->setValue(D)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setAlarm(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setMark(I)V

    .line 67
    const/4 p2, 0x1

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setFavor(Z)V

    .line 71
    .line 72
    const-string p2, ""

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setCoinLabel(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getAlphaMarks()Ljava/util/List;

    .line 79
    move-result-object p2

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p2}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->setAlphaMarks(Ljava/util/List;)V

    .line 83
    .line 84
    new-instance p2, Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 85
    .line 86
    .line 87
    invoke-direct {p2}, Lcom/kubi/data/entity/SymbolInfoEntity;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getCurrencyUnit()Ljava/lang/String;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->setQuoteCurrency(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getToken()Ljava/lang/String;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->setFeeCode(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getKcChain()Ljava/lang/String;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->setQuoteCurrencyName(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getExternalChain()Ljava/lang/String;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->setPriceIncrement(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getTokenBridgeId()Ljava/lang/String;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->setMarket(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getCollectTypeOrCategory()Ljava/lang/String;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2, p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->setBaseCurrency(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setSymbolInfoEntity(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 133
    return-object p0
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
.end method

.method public static final c(Lcom/kubi/quotefacade/entity/AllTradeItemBean;Lcom/kubi/quotefacade/entity/MarketListEntityItem;I)Lcom/kubi/quotefacade/entity/AllTradeItemBean;
    .locals 8
    .param p0    # Lcom/kubi/quotefacade/entity/AllTradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/kubi/quotefacade/entity/MarketListEntityItem;
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
    const-string v0, "input"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->setCollectType(I)V

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/kubi/data/entity/TradeItemBean;->isChecked:Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getLast24HourRate()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 27
    move-result-wide v3

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v1, v2

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {p0, v1}, Lcom/kubi/data/entity/TradeItemBean;->setChangeRate(Ljava/lang/Double;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getLastPrice()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 48
    move-result-wide v5

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-wide v5, v3

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-virtual {p0, v5, v6}, Lcom/kubi/data/entity/TradeItemBean;->setLastDealPrice(D)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getSymbol()Ljava/lang/String;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lcom/kubi/data/entity/TradeItemBean;->setSymbol(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getLast24HourTradingVolume()Ljava/lang/String;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 70
    move-result-wide v3

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {p0, v3, v4}, Lcom/kubi/data/entity/TradeItemBean;->setValue(D)V

    .line 74
    const/4 v1, 0x2

    .line 75
    .line 76
    if-ne p2, v1, :cond_4

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getFuturesMarks()Ljava/util/List;

    .line 80
    move-result-object p2

    .line 81
    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    const-string v1, "Price_Alarm"

    .line 85
    .line 86
    .line 87
    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 88
    move-result p2

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    move p2, v0

    .line 91
    goto :goto_2

    .line 92
    .line 93
    .line 94
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getAlarmingPersonal()Z

    .line 95
    move-result p2

    .line 96
    .line 97
    .line 98
    :goto_2
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setAlarm(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getSymbolMark()Ljava/lang/Integer;

    .line 102
    move-result-object p2

    .line 103
    .line 104
    if-eqz p2, :cond_5

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 108
    move-result p2

    .line 109
    goto :goto_3

    .line 110
    :cond_5
    move p2, v0

    .line 111
    .line 112
    .line 113
    :goto_3
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setMark(I)V

    .line 114
    const/4 p2, 0x1

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p2}, Lcom/kubi/data/entity/TradeItemBean;->setFavor(Z)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getSymbolLabel()Ljava/lang/String;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v1}, Lcom/kubi/data/entity/TradeItemBean;->setCoinLabel(Ljava/lang/String;)V

    .line 125
    .line 126
    sget-object v1, Lgf/n;->a:Lgf/n;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getSymbol()Ljava/lang/String;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    if-nez v3, :cond_6

    .line 133
    .line 134
    const-string v3, ""

    .line 135
    .line 136
    .line 137
    :cond_6
    invoke-virtual {v1, v3}, Lgf/n;->B(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    if-eqz v1, :cond_b

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getSymbolMark()Ljava/lang/Integer;

    .line 144
    move-result-object v2

    .line 145
    .line 146
    if-eqz v2, :cond_7

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 150
    move-result v2

    .line 151
    goto :goto_4

    .line 152
    :cond_7
    move v2, v0

    .line 153
    .line 154
    .line 155
    :goto_4
    invoke-virtual {v1, v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->setMark(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getSymbolBoard()Ljava/lang/Integer;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    if-eqz v2, :cond_8

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 165
    move-result v2

    .line 166
    goto :goto_5

    .line 167
    :cond_8
    move v2, v0

    .line 168
    .line 169
    .line 170
    :goto_5
    invoke-virtual {v1, v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->setBoard(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getTradingEnabled()Ljava/lang/Boolean;

    .line 174
    move-result-object v2

    .line 175
    .line 176
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    move-result v2

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->setEnableTrading(Z)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getOpenAt()Ljava/lang/Long;

    .line 187
    move-result-object v2

    .line 188
    .line 189
    if-eqz v2, :cond_9

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 193
    move-result-wide v4

    .line 194
    goto :goto_6

    .line 195
    .line 196
    :cond_9
    const-wide/16 v4, 0x0

    .line 197
    .line 198
    :goto_6
    const/16 v2, 0x3e8

    .line 199
    int-to-long v6, v2

    .line 200
    mul-long/2addr v4, v6

    .line 201
    .line 202
    sget-object v2, Lcom/kubi/sdk/util/TimeSyncManager;->a:Lcom/kubi/sdk/util/TimeSyncManager;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Lcom/kubi/sdk/util/TimeSyncManager;->p()J

    .line 206
    move-result-wide v6

    .line 207
    .line 208
    cmp-long v2, v4, v6

    .line 209
    .line 210
    if-lez v2, :cond_a

    .line 211
    move v0, p2

    .line 212
    .line 213
    .line 214
    :cond_a
    invoke-virtual {v1, v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->setPreviewEnableShow(Z)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getMarginEnabled()Ljava/lang/Boolean;

    .line 218
    move-result-object p2

    .line 219
    .line 220
    .line 221
    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    move-result p2

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->setMarginEnabled(Z)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getIsolatedEnabled()Ljava/lang/Boolean;

    .line 229
    move-result-object p2

    .line 230
    .line 231
    .line 232
    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    move-result p2

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->setIsolatedMarginEnabled(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getCallAuctionSymbol()Ljava/lang/Boolean;

    .line 240
    move-result-object p2

    .line 241
    .line 242
    .line 243
    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    move-result p2

    .line 245
    .line 246
    .line 247
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 248
    move-result-object p2

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->setEnableAuctionTrade(Ljava/lang/Boolean;)V

    .line 252
    move-object v2, v1

    .line 253
    .line 254
    .line 255
    :cond_b
    invoke-virtual {p0, v2}, Lcom/kubi/data/entity/TradeItemBean;->setSymbolInfoEntity(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;->getMaxLeverageByAccountStatus()I

    .line 259
    move-result p1

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0, p1}, Lcom/kubi/data/entity/TradeItemBean;->setMaxLeverage(I)V

    .line 263
    return-object p0
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
.end method
