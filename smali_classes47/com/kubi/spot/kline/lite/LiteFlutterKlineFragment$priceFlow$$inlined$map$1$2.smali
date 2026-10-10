.class public final Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "Emitters.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LiteFlutterKlineFragment.kt\ncom/kubi/spot/kline/lite/LiteFlutterKlineFragment\n*L\n1#1,49:1\n50#2:50\n168#3,41:51\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lkotlinx/coroutines/flow/f;

.field public final synthetic c:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2;->b:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2;->c:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;

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
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    instance-of v2, v1, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;

    .line 12
    .line 13
    iget v3, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->label:I

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
    iput v3, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->label:I

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v0, v1}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;-><init>(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    :goto_0
    iget-object v1, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    iget v4, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->label:I

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
    iget-object v3, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Lkotlinx/coroutines/flow/f;

    .line 46
    .line 47
    iget-object v2, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    goto/16 :goto_5

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
    iget-object v1, v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2;->b:Lkotlinx/coroutines/flow/f;

    .line 68
    .line 69
    move-object/from16 v4, p1

    .line 70
    .line 71
    check-cast v4, Lcom/kubi/flutter/proto/kline/CandleList;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Lcom/kubi/flutter/proto/kline/CandleList;->getItemsCount()I

    .line 75
    move-result v6

    .line 76
    const/4 v7, 0x0

    .line 77
    .line 78
    if-nez v6, :cond_3

    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-virtual {v4}, Lcom/kubi/flutter/proto/kline/CandleList;->getItemsList()Ljava/util/List;

    .line 84
    move-result-object v6

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Lcom/kubi/flutter/proto/kline/CandleList;->getItemsList()Ljava/util/List;

    .line 88
    move-result-object v8

    .line 89
    .line 90
    const-string v9, "getItemsList(...)"

    .line 91
    .line 92
    .line 93
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 97
    move-result-object v8

    .line 98
    .line 99
    check-cast v8, Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 100
    .line 101
    sget-object v9, Lgf/b0;->a:Lgf/b0;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9}, Lgf/b0;->i()Z

    .line 105
    move-result v9

    .line 106
    .line 107
    const-wide/16 v10, 0x0

    .line 108
    .line 109
    if-eqz v9, :cond_6

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/kubi/flutter/proto/kline/CandleList;->getUpdateType()Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;

    .line 113
    move-result-object v4

    .line 114
    .line 115
    sget-object v9, Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;->UPDATE_BY_PULL:Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;

    .line 116
    .line 117
    if-ne v4, v9, :cond_4

    .line 118
    .line 119
    .line 120
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 124
    move-result-object v4

    .line 125
    .line 126
    check-cast v4, Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Lcom/kubi/flutter/proto/kline/CandleItem;->getClose()D

    .line 130
    move-result-wide v12

    .line 131
    .line 132
    iget-object v4, v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2;->c:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;

    .line 133
    .line 134
    .line 135
    invoke-static {v12, v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxDouble(D)Ljava/lang/Double;

    .line 136
    move-result-object v6

    .line 137
    .line 138
    .line 139
    invoke-static {v4, v6}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->u3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;Ljava/lang/Double;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v12, v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxDouble(D)Ljava/lang/Double;

    .line 143
    move-result-object v4

    .line 144
    goto :goto_1

    .line 145
    .line 146
    :cond_4
    iget-object v4, v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2;->c:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;

    .line 147
    .line 148
    .line 149
    invoke-static {v4}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->s3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)Ljava/lang/Double;

    .line 150
    move-result-object v4

    .line 151
    .line 152
    :goto_1
    if-eqz v4, :cond_d

    .line 153
    .line 154
    .line 155
    invoke-static {v4, v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Double;D)Z

    .line 156
    move-result v6

    .line 157
    .line 158
    if-eqz v6, :cond_5

    .line 159
    .line 160
    goto/16 :goto_3

    .line 161
    .line 162
    .line 163
    :cond_5
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getClose()D

    .line 164
    move-result-wide v6

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 168
    move-result-wide v9

    .line 169
    sub-double/2addr v6, v9

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 173
    move-result-wide v9

    .line 174
    div-double/2addr v6, v9

    .line 175
    .line 176
    .line 177
    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxDouble(D)Ljava/lang/Double;

    .line 178
    move-result-object v7

    .line 179
    .line 180
    goto/16 :goto_3

    .line 181
    .line 182
    .line 183
    :cond_6
    invoke-virtual {v4}, Lcom/kubi/flutter/proto/kline/CandleList;->getUpdateType()Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;

    .line 184
    move-result-object v4

    .line 185
    .line 186
    sget-object v9, Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;->UPDATE_BY_PULL:Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;

    .line 187
    .line 188
    if-ne v4, v9, :cond_8

    .line 189
    .line 190
    .line 191
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 192
    move-result v4

    .line 193
    .line 194
    if-le v4, v5, :cond_7

    .line 195
    .line 196
    .line 197
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 198
    move-result v4

    .line 199
    .line 200
    add-int/lit8 v4, v4, -0x2

    .line 201
    .line 202
    .line 203
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    move-result-object v4

    .line 205
    .line 206
    check-cast v4, Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 207
    .line 208
    iget-object v6, v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2;->c:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;

    .line 209
    .line 210
    .line 211
    invoke-static {v6, v4}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->v3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;Lcom/kubi/flutter/proto/kline/CandleItem;)V

    .line 212
    goto :goto_2

    .line 213
    :cond_7
    move-object v4, v7

    .line 214
    goto :goto_2

    .line 215
    .line 216
    :cond_8
    iget-object v4, v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2;->c:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;

    .line 217
    .line 218
    .line 219
    invoke-static {v4}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->t3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 220
    move-result-object v4

    .line 221
    .line 222
    :goto_2
    if-nez v4, :cond_a

    .line 223
    .line 224
    .line 225
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getOpen()D

    .line 226
    move-result-wide v12

    .line 227
    .line 228
    cmpg-double v4, v12, v10

    .line 229
    .line 230
    if-nez v4, :cond_9

    .line 231
    goto :goto_3

    .line 232
    .line 233
    .line 234
    :cond_9
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getClose()D

    .line 235
    move-result-wide v6

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getOpen()D

    .line 239
    move-result-wide v9

    .line 240
    sub-double/2addr v6, v9

    .line 241
    .line 242
    .line 243
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getOpen()D

    .line 244
    move-result-wide v9

    .line 245
    div-double/2addr v6, v9

    .line 246
    .line 247
    .line 248
    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxDouble(D)Ljava/lang/Double;

    .line 249
    move-result-object v7

    .line 250
    goto :goto_3

    .line 251
    .line 252
    .line 253
    :cond_a
    invoke-virtual {v4}, Lcom/kubi/flutter/proto/kline/CandleItem;->getClose()D

    .line 254
    move-result-wide v12

    .line 255
    .line 256
    cmpg-double v6, v12, v10

    .line 257
    .line 258
    if-nez v6, :cond_c

    .line 259
    .line 260
    .line 261
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getOpen()D

    .line 262
    move-result-wide v12

    .line 263
    .line 264
    cmpg-double v4, v12, v10

    .line 265
    .line 266
    if-nez v4, :cond_b

    .line 267
    goto :goto_3

    .line 268
    .line 269
    .line 270
    :cond_b
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getClose()D

    .line 271
    move-result-wide v6

    .line 272
    .line 273
    .line 274
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getOpen()D

    .line 275
    move-result-wide v9

    .line 276
    sub-double/2addr v6, v9

    .line 277
    .line 278
    .line 279
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getOpen()D

    .line 280
    move-result-wide v9

    .line 281
    div-double/2addr v6, v9

    .line 282
    .line 283
    .line 284
    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxDouble(D)Ljava/lang/Double;

    .line 285
    move-result-object v7

    .line 286
    goto :goto_3

    .line 287
    .line 288
    .line 289
    :cond_c
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getClose()D

    .line 290
    move-result-wide v6

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4}, Lcom/kubi/flutter/proto/kline/CandleItem;->getClose()D

    .line 294
    move-result-wide v9

    .line 295
    sub-double/2addr v6, v9

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4}, Lcom/kubi/flutter/proto/kline/CandleItem;->getClose()D

    .line 299
    move-result-wide v9

    .line 300
    div-double/2addr v6, v9

    .line 301
    .line 302
    .line 303
    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxDouble(D)Ljava/lang/Double;

    .line 304
    move-result-object v7

    .line 305
    .line 306
    :cond_d
    :goto_3
    new-instance v4, Ljava/math/BigDecimal;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v8}, Lcom/kubi/flutter/proto/kline/CandleItem;->getClose()D

    .line 310
    move-result-wide v8

    .line 311
    .line 312
    .line 313
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 314
    move-result-object v6

    .line 315
    .line 316
    .line 317
    invoke-direct {v4, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    const-string v6, "USDT"

    .line 320
    .line 321
    .line 322
    invoke-static {v4, v6}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 323
    move-result-wide v8

    .line 324
    .line 325
    const/16 v17, 0x5f

    .line 326
    .line 327
    const/16 v18, 0x0

    .line 328
    const/4 v10, 0x0

    .line 329
    const/4 v11, 0x0

    .line 330
    const/4 v12, 0x0

    .line 331
    const/4 v13, 0x0

    .line 332
    const/4 v14, 0x0

    .line 333
    const/4 v15, 0x1

    .line 334
    .line 335
    const/16 v16, 0x0

    .line 336
    .line 337
    .line 338
    invoke-static/range {v8 .. v18}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 339
    move-result-object v4

    .line 340
    .line 341
    const-string v6, "--"

    .line 342
    .line 343
    .line 344
    invoke-static {v4, v6}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 345
    move-result-object v4

    .line 346
    .line 347
    new-instance v6, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$a;

    .line 348
    .line 349
    .line 350
    invoke-direct {v6, v4, v7}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$a;-><init>(Ljava/lang/String;Ljava/lang/Double;)V

    .line 351
    move-object v7, v6

    .line 352
    .line 353
    .line 354
    :goto_4
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    move-result-object v4

    .line 356
    .line 357
    iput-object v4, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    move-result-object v4

    .line 362
    .line 363
    iput-object v4, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    move-result-object v4

    .line 368
    .line 369
    iput-object v4, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    move-result-object v4

    .line 374
    .line 375
    iput-object v4, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 376
    const/4 v4, 0x0

    .line 377
    .line 378
    iput v4, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->I$0:I

    .line 379
    .line 380
    iput v5, v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1;->label:I

    .line 381
    .line 382
    .line 383
    invoke-interface {v1, v7, v2}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 384
    move-result-object v1

    .line 385
    .line 386
    if-ne v1, v3, :cond_e

    .line 387
    return-object v3

    .line 388
    .line 389
    :cond_e
    :goto_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 390
    return-object v1
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
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
.end method
