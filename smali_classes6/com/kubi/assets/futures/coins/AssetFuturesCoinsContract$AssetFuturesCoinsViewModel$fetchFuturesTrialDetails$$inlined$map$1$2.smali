.class public final Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "Emitters.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel\n*L\n1#1,49:1\n50#2:50\n175#3,34:51\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lkotlinx/coroutines/flow/f;

.field public final synthetic c:Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2;->b:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2;->c:Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 37

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    instance-of v2, v1, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;

    .line 12
    .line 13
    iget v3, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->label:I

    .line 14
    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    and-int v5, v3, v4

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    sub-int/2addr v3, v4

    .line 21
    .line 22
    iput v3, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->label:I

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v0, v1}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;-><init>(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    :goto_0
    iget-object v1, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    iget v4, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->label:I

    .line 37
    const/4 v5, 0x1

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    if-ne v4, v5, :cond_1

    .line 42
    .line 43
    iget-object v3, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Lkotlinx/coroutines/flow/f;

    .line 46
    .line 47
    iget-object v2, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    throw v1

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    .line 67
    iget-object v1, v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2;->b:Lkotlinx/coroutines/flow/f;

    .line 68
    .line 69
    move-object/from16 v4, p1

    .line 70
    .line 71
    check-cast v4, Lcom/kubi/assets/entity/FuturesTrialDetailsEntity;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Lcom/kubi/assets/entity/FuturesTrialDetailsEntity;->getCurrency()Ljava/lang/String;

    .line 75
    move-result-object v6

    .line 76
    .line 77
    .line 78
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    move-result-object v6

    .line 80
    .line 81
    .line 82
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    move-result-object v6

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lcom/kubi/assets/service/a;->c()Lcom/kubi/kumex/api/IKuMexService;

    .line 87
    move-result-object v7

    .line 88
    .line 89
    sget-object v8, Lgf/n;->a:Lgf/n;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v6}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 93
    move-result-object v8

    .line 94
    .line 95
    if-eqz v8, :cond_3

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 99
    move-result-object v8

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const/4 v8, 0x0

    .line 102
    .line 103
    .line 104
    :goto_1
    invoke-interface {v7, v8}, Lcom/kubi/kumex/api/IKuMexService;->w(Ljava/lang/String;)I

    .line 105
    move-result v7

    .line 106
    .line 107
    .line 108
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 109
    move-result-object v7

    .line 110
    .line 111
    .line 112
    invoke-static {v7}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 113
    move-result v12

    .line 114
    .line 115
    new-instance v7, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Lcom/kubi/assets/entity/FuturesTrialDetailsEntity;->getTrialFundBalance()Ljava/math/BigDecimal;

    .line 122
    move-result-object v10

    .line 123
    .line 124
    if-eqz v10, :cond_4

    .line 125
    .line 126
    const/16 v18, 0x55

    .line 127
    .line 128
    const/16 v19, 0x0

    .line 129
    const/4 v11, 0x0

    .line 130
    const/4 v13, 0x0

    .line 131
    const/4 v14, 0x1

    .line 132
    const/4 v15, 0x0

    .line 133
    .line 134
    const/16 v16, 0x2

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    .line 139
    invoke-static/range {v10 .. v19}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 140
    move-result-object v8

    .line 141
    goto :goto_2

    .line 142
    :cond_4
    const/4 v8, 0x0

    .line 143
    .line 144
    .line 145
    :goto_2
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const/16 v8, 0x20

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    move-result-object v7

    .line 158
    .line 159
    new-instance v10, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    const-string v11, "\u2248 "

    .line 165
    .line 166
    .line 167
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Lcom/kubi/assets/entity/FuturesTrialDetailsEntity;->getTrialFundBalance()Ljava/math/BigDecimal;

    .line 171
    move-result-object v13

    .line 172
    .line 173
    if-eqz v13, :cond_5

    .line 174
    .line 175
    .line 176
    invoke-virtual {v13}, Ljava/math/BigDecimal;->doubleValue()D

    .line 177
    move-result-wide v13

    .line 178
    .line 179
    .line 180
    invoke-static {v13, v14, v6}, Lkf/a;->m(DLjava/lang/String;)D

    .line 181
    move-result-wide v15

    .line 182
    .line 183
    const/16 v24, 0x3f

    .line 184
    .line 185
    const/16 v25, 0x0

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    const/16 v19, 0x0

    .line 192
    .line 193
    const/16 v20, 0x0

    .line 194
    .line 195
    const/16 v21, 0x0

    .line 196
    .line 197
    const/16 v22, 0x0

    .line 198
    .line 199
    const/16 v23, 0x1

    .line 200
    .line 201
    .line 202
    invoke-static/range {v15 .. v25}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 203
    move-result-object v13

    .line 204
    goto :goto_3

    .line 205
    :cond_5
    const/4 v13, 0x0

    .line 206
    .line 207
    .line 208
    :goto_3
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    move-result-object v20

    .line 213
    .line 214
    new-instance v10, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    move-object v13, v10

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4}, Lcom/kubi/assets/entity/FuturesTrialDetailsEntity;->getRealisedPNL()Ljava/math/BigDecimal;

    .line 222
    move-result-object v10

    .line 223
    .line 224
    if-eqz v10, :cond_6

    .line 225
    .line 226
    const/16 v18, 0x55

    .line 227
    .line 228
    const/16 v19, 0x0

    .line 229
    move-object v14, v11

    .line 230
    const/4 v11, 0x0

    .line 231
    move-object v15, v13

    .line 232
    const/4 v13, 0x0

    .line 233
    .line 234
    move-object/from16 v16, v14

    .line 235
    const/4 v14, 0x1

    .line 236
    .line 237
    move-object/from16 v17, v15

    .line 238
    const/4 v15, 0x0

    .line 239
    .line 240
    move-object/from16 v21, v16

    .line 241
    .line 242
    const/16 v16, 0x2

    .line 243
    .line 244
    move-object/from16 v22, v17

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    move-object/from16 v9, v21

    .line 249
    .line 250
    move-object/from16 v5, v22

    .line 251
    .line 252
    .line 253
    invoke-static/range {v10 .. v19}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 254
    move-result-object v10

    .line 255
    goto :goto_4

    .line 256
    :cond_6
    move-object v9, v11

    .line 257
    move-object v5, v13

    .line 258
    const/4 v10, 0x0

    .line 259
    .line 260
    .line 261
    :goto_4
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    move-result-object v16

    .line 272
    .line 273
    new-instance v5, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4}, Lcom/kubi/assets/entity/FuturesTrialDetailsEntity;->getRealisedPNL()Ljava/math/BigDecimal;

    .line 283
    move-result-object v8

    .line 284
    .line 285
    if-eqz v8, :cond_7

    .line 286
    .line 287
    .line 288
    invoke-virtual {v8}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 289
    move-result-object v8

    .line 290
    .line 291
    if-eqz v8, :cond_7

    .line 292
    .line 293
    .line 294
    invoke-virtual {v8}, Ljava/math/BigDecimal;->doubleValue()D

    .line 295
    move-result-wide v8

    .line 296
    .line 297
    .line 298
    invoke-static {v8, v9, v6}, Lkf/a;->m(DLjava/lang/String;)D

    .line 299
    move-result-wide v26

    .line 300
    .line 301
    const/16 v35, 0x3f

    .line 302
    .line 303
    const/16 v36, 0x0

    .line 304
    .line 305
    const/16 v28, 0x0

    .line 306
    .line 307
    const/16 v29, 0x0

    .line 308
    .line 309
    const/16 v30, 0x0

    .line 310
    .line 311
    const/16 v31, 0x0

    .line 312
    .line 313
    const/16 v32, 0x0

    .line 314
    .line 315
    const/16 v33, 0x0

    .line 316
    .line 317
    const/16 v34, 0x1

    .line 318
    .line 319
    .line 320
    invoke-static/range {v26 .. v36}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 321
    move-result-object v9

    .line 322
    goto :goto_5

    .line 323
    :cond_7
    const/4 v9, 0x0

    .line 324
    .line 325
    .line 326
    :goto_5
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    move-result-object v17

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4}, Lcom/kubi/assets/entity/FuturesTrialDetailsEntity;->getPrizeType()Ljava/lang/String;

    .line 334
    move-result-object v23

    .line 335
    .line 336
    new-instance v13, Lcom/kubi/assets/entity/FuturesTrialAssets;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v4}, Lcom/kubi/assets/entity/FuturesTrialDetailsEntity;->getRealisedPNL()Ljava/math/BigDecimal;

    .line 340
    move-result-object v4

    .line 341
    .line 342
    .line 343
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 344
    move-result-object v4

    .line 345
    .line 346
    .line 347
    invoke-virtual {v4}, Ljava/math/BigDecimal;->doubleValue()D

    .line 348
    move-result-wide v18

    .line 349
    .line 350
    iget-object v4, v0, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2;->c:Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;

    .line 351
    .line 352
    .line 353
    invoke-static {v4}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;->s(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;)I

    .line 354
    move-result v4

    .line 355
    .line 356
    const/16 v24, 0xc0

    .line 357
    .line 358
    const/16 v25, 0x0

    .line 359
    .line 360
    const/16 v21, 0x0

    .line 361
    .line 362
    const/16 v22, 0x0

    .line 363
    move-object v14, v7

    .line 364
    .line 365
    move-object/from16 v15, v20

    .line 366
    .line 367
    move/from16 v20, v4

    .line 368
    .line 369
    .line 370
    invoke-direct/range {v13 .. v25}, Lcom/kubi/assets/entity/FuturesTrialAssets;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 371
    .line 372
    .line 373
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    move-result-object v4

    .line 375
    .line 376
    iput-object v4, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    move-result-object v4

    .line 381
    .line 382
    iput-object v4, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    move-result-object v4

    .line 387
    .line 388
    iput-object v4, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    move-result-object v4

    .line 393
    .line 394
    iput-object v4, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 395
    const/4 v4, 0x0

    .line 396
    .line 397
    iput v4, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->I$0:I

    .line 398
    const/4 v4, 0x1

    .line 399
    .line 400
    iput v4, v2, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1;->label:I

    .line 401
    .line 402
    .line 403
    invoke-interface {v1, v13, v2}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 404
    move-result-object v1

    .line 405
    .line 406
    if-ne v1, v3, :cond_8

    .line 407
    return-object v3

    .line 408
    .line 409
    :cond_8
    :goto_6
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 410
    return-object v1
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
.end method
