.class public final Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment$a;
.super Ljava/lang/Object;
.source "KuMexFlutterKlineFragment.kt"

# interfaces
.implements Lcom/kubi/flutter/widget/kline/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/kumex/kline/KuMexFlutterKlineFragment$onViewCreated$1",
        "Lcom/kubi/flutter/widget/kline/IKLineContainer$EventListener;",
        "onJumpOrder",
        "",
        "orderItem",
        "Lcom/kubi/flutter/proto/kline/OrderItem;",
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
.end method


# virtual methods
.method public a(Lcom/kubi/flutter/proto/kline/OrderItem;)V
    .locals 21

    .line 1
    .line 2
    const-string v0, "orderItem"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/flutter/widget/kline/l;->a:Lcom/kubi/flutter/widget/kline/l;

    .line 10
    .line 11
    sget-object v2, Lgf/b0;->a:Lgf/b0;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lgf/b0;->d()I

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lcom/kubi/flutter/widget/kline/l;->a(I)Lcom/kubi/flutter/widget/kline/KLineType;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineType;->q()I

    .line 23
    move-result v2

    .line 24
    .line 25
    sget-object v3, Lcom/kubi/flutter/widget/kline/KLineType;->e:Lcom/kubi/flutter/widget/kline/KLineType$Companion;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Lcom/kubi/flutter/widget/kline/KLineType$Companion;->getONE_DAY()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/kubi/flutter/widget/kline/KLineType;->q()I

    .line 33
    move-result v4

    .line 34
    .line 35
    const-wide/16 v5, 0x1

    .line 36
    .line 37
    const/16 v7, 0x3e8

    .line 38
    .line 39
    if-lt v2, v4, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/kubi/flutter/proto/kline/OrderItem;->getTime()J

    .line 43
    move-result-wide v2

    .line 44
    int-to-long v8, v7

    .line 45
    mul-long/2addr v2, v8

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    move-result-wide v8

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineType;->q()I

    .line 53
    move-result v0

    .line 54
    mul-int/2addr v0, v7

    .line 55
    int-to-long v10, v0

    .line 56
    add-long/2addr v10, v2

    .line 57
    sub-long/2addr v10, v5

    .line 58
    .line 59
    .line 60
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 61
    move-result-wide v7

    .line 62
    goto :goto_0

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {v1}, Lcom/kubi/flutter/proto/kline/OrderItem;->getTime()J

    .line 66
    move-result-wide v8

    .line 67
    int-to-long v10, v7

    .line 68
    mul-long/2addr v8, v10

    .line 69
    .line 70
    const-string v0, "yyyy-MM-dd"

    .line 71
    .line 72
    .line 73
    invoke-static {v8, v9, v0}, Lcom/kubi/utils/extensions/core/d;->a(JLjava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lcom/kubi/utils/TimeUtils;->r(Ljava/lang/String;)Ljava/util/Date;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 82
    move-result-wide v8

    .line 83
    .line 84
    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 86
    move-result-wide v10

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Lcom/kubi/flutter/widget/kline/KLineType$Companion;->getONE_DAY()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineType;->q()I

    .line 94
    move-result v0

    .line 95
    mul-int/2addr v0, v7

    .line 96
    int-to-long v2, v0

    .line 97
    add-long/2addr v2, v8

    .line 98
    sub-long/2addr v2, v5

    .line 99
    .line 100
    .line 101
    invoke-static {v10, v11, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 102
    move-result-wide v2

    .line 103
    .line 104
    move-wide/from16 v19, v8

    .line 105
    move-wide v7, v2

    .line 106
    .line 107
    move-wide/from16 v2, v19

    .line 108
    .line 109
    :goto_0
    sget-object v9, Lf00/a;->a:Lf00/a;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/kubi/flutter/proto/kline/OrderItem;->getSymbol()Ljava/lang/String;

    .line 113
    move-result-object v10

    .line 114
    .line 115
    .line 116
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    move-result-object v11

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    move-result-object v12

    .line 122
    .line 123
    .line 124
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    move-result-object v13

    .line 126
    .line 127
    const/16 v17, 0x70

    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    const/4 v14, 0x0

    .line 131
    const/4 v15, 0x0

    .line 132
    .line 133
    const/16 v16, 0x0

    .line 134
    .line 135
    .line 136
    invoke-static/range {v9 .. v18}, Lg00/d$a;->d(Lg00/d;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 137
    return-void
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
.end method
