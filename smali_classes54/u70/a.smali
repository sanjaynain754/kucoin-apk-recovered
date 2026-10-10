.class public final Lu70/a;
.super Ljava/lang/Object;
.source "MapRequestOrderEntity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "mapRequestOrderToUtaEntity",
        "Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;",
        "req",
        "Lcom/kubi/core/base/order/data/MakeOrderData$Request;",
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


# direct methods
.method public static final a(Lcom/kubi/core/base/order/data/MakeOrderData$Request;)Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;
    .locals 2
    .param p0    # Lcom/kubi/core/base/order/data/MakeOrderData$Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "req"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Limit;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/kubi/utaspotlib/repo/order/data/UtaLimit;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Lcom/kubi/utaspotlib/repo/order/data/UtaLimit;-><init>()V

    .line 15
    .line 16
    check-cast p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Limit;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Limit;->getSymbol()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSymbol(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Limit;->getSide()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSide(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Limit;->getPrice()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setPrice(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Limit;->getSize()Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSize(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Limit;->isFullPercent()Z

    .line 48
    move-result p0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setFullPercent(Z)V

    .line 52
    return-object v0

    .line 53
    .line 54
    :cond_0
    instance-of v0, p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Market;

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    new-instance v0, Lcom/kubi/utaspotlib/repo/order/data/UtaMarket;

    .line 59
    .line 60
    .line 61
    invoke-direct {v0}, Lcom/kubi/utaspotlib/repo/order/data/UtaMarket;-><init>()V

    .line 62
    .line 63
    check-cast p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Market;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Market;->getSymbol()Ljava/lang/String;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSymbol(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Market;->getSide()Ljava/lang/String;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSide(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Market;->getSize()Ljava/lang/String;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSize(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Market;->getFunds()Ljava/lang/String;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setFunds(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Market;->isFullPercent()Z

    .line 95
    move-result p0

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p0}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setFullPercent(Z)V

    .line 99
    return-object v0

    .line 100
    .line 101
    :cond_1
    instance-of v0, p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;

    .line 102
    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    new-instance v0, Lcom/kubi/utaspotlib/repo/order/data/UtaAdvancedLimit;

    .line 106
    .line 107
    .line 108
    invoke-direct {v0}, Lcom/kubi/utaspotlib/repo/order/data/UtaAdvancedLimit;-><init>()V

    .line 109
    .line 110
    check-cast p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;->getSymbol()Ljava/lang/String;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSymbol(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;->getSide()Ljava/lang/String;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSide(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;->getSize()Ljava/lang/String;

    .line 128
    move-result-object v1

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSize(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;->getPrice()Ljava/lang/String;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setPrice(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;->getPostOnly()Z

    .line 142
    move-result v1

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setPostOnly(Z)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;->getTimeInForce()Lcom/kubi/core/base/order/data/TimeInForce;

    .line 149
    move-result-object v1

    .line 150
    .line 151
    .line 152
    invoke-interface {v1}, Lcom/kubi/core/base/order/data/TimeInForce;->getParam()Ljava/lang/String;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setTimeInForce(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;->isFullPercent()Z

    .line 160
    move-result p0

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, p0}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setFullPercent(Z)V

    .line 164
    return-object v0

    .line 165
    .line 166
    :cond_2
    instance-of v0, p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;

    .line 167
    .line 168
    if-eqz v0, :cond_3

    .line 169
    .line 170
    new-instance v0, Lcom/kubi/utaspotlib/repo/order/data/UtaLimitStop;

    .line 171
    .line 172
    .line 173
    invoke-direct {v0}, Lcom/kubi/utaspotlib/repo/order/data/UtaLimitStop;-><init>()V

    .line 174
    .line 175
    check-cast p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;->getSymbol()Ljava/lang/String;

    .line 179
    move-result-object v1

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSymbol(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;->getSide()Ljava/lang/String;

    .line 186
    move-result-object v1

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSide(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;->getPrice()Ljava/lang/String;

    .line 193
    move-result-object v1

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setPrice(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;->getSize()Ljava/lang/String;

    .line 200
    move-result-object v1

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSize(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;->getTriggerPrice()Ljava/lang/String;

    .line 207
    move-result-object v1

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setTriggerPrice(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;->getTriggerDirection()Lcom/kubi/core/base/order/data/TriggerDirection;

    .line 214
    move-result-object p0

    .line 215
    .line 216
    .line 217
    invoke-interface {p0}, Lcom/kubi/core/base/order/data/TriggerDirection;->getParam()Ljava/lang/String;

    .line 218
    move-result-object p0

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, p0}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setTriggerDirection(Ljava/lang/String;)V

    .line 222
    return-object v0

    .line 223
    .line 224
    :cond_3
    instance-of v0, p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;

    .line 225
    .line 226
    if-eqz v0, :cond_4

    .line 227
    .line 228
    new-instance v0, Lcom/kubi/utaspotlib/repo/order/data/UtaMarketStop;

    .line 229
    .line 230
    .line 231
    invoke-direct {v0}, Lcom/kubi/utaspotlib/repo/order/data/UtaMarketStop;-><init>()V

    .line 232
    .line 233
    check-cast p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;->getSymbol()Ljava/lang/String;

    .line 237
    move-result-object v1

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSymbol(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;->getSide()Ljava/lang/String;

    .line 244
    move-result-object v1

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSide(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;->getSize()Ljava/lang/String;

    .line 251
    move-result-object v1

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setSize(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;->getFunds()Ljava/lang/String;

    .line 258
    move-result-object v1

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setFunds(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;->getTriggerPrice()Ljava/lang/String;

    .line 265
    move-result-object v1

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setTriggerPrice(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;->getTriggerDirection()Lcom/kubi/core/base/order/data/TriggerDirection;

    .line 272
    move-result-object v1

    .line 273
    .line 274
    .line 275
    invoke-interface {v1}, Lcom/kubi/core/base/order/data/TriggerDirection;->getParam()Ljava/lang/String;

    .line 276
    move-result-object v1

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v1}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setTriggerDirection(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0}, Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;->getTriggerPriceType()Ljava/lang/String;

    .line 283
    move-result-object p0

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, p0}, Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;->setTriggerPriceType(Ljava/lang/String;)V

    .line 287
    return-object v0

    .line 288
    .line 289
    :cond_4
    instance-of p0, p0, Lcom/kubi/core/base/order/data/MakeOrderData$Request$Segment;

    .line 290
    .line 291
    if-eqz p0, :cond_5

    .line 292
    .line 293
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 294
    .line 295
    const-string v0, "Segment orders must use requestScaledOrder API"

    .line 296
    .line 297
    .line 298
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 299
    throw p0

    .line 300
    .line 301
    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 302
    .line 303
    .line 304
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 305
    throw p0
.end method
