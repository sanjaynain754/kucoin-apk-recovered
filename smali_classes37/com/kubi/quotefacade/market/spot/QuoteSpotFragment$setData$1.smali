.class final Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "QuoteSpotFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->j3(Lcom/kubi/quotefacade/entity/MarketMenuEntity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/m0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1"
    f = "QuoteSpotFragment.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x76,
        0x8c
    }
    m = "invokeSuspend"
    n = {
        "spotMenu",
        "list",
        "$this$forEachIndexed$iv",
        "item$iv",
        "spotLevel1",
        "$i$a$-let-QuoteSpotFragment$setData$1$1",
        "$i$f$forEachIndexed",
        "index$iv",
        "index",
        "$i$a$-forEachIndexed-QuoteSpotFragment$setData$1$1$2",
        "spotMenu",
        "list",
        "it",
        "it1",
        "$i$a$-let-QuoteSpotFragment$setData$1$1",
        "$i$a$-let-QuoteSpotFragment$setData$1$1$3",
        "$i$a$-let-QuoteSpotFragment$setData$1$1$3$1"
    }
    s = {
        "L$0",
        "L$2",
        "L$3",
        "L$5",
        "L$6",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "I$4",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "I$1",
        "I$2"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQuoteSpotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteSpotFragment.kt\ncom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n774#2:306\n865#2,2:307\n1878#2,3:309\n1#3:312\n*S KotlinDebug\n*F\n+ 1 QuoteSpotFragment.kt\ncom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1\n*L\n115#1:306\n115#1:307,2\n116#1:309,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $marketMenuEntity:Lcom/kubi/quotefacade/entity/MarketMenuEntity;

.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field I$4:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/quotefacade/entity/MarketMenuEntity;Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/MarketMenuEntity;",
            "Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->$marketMenuEntity:Lcom/kubi/quotefacade/entity/MarketMenuEntity;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->this$0:Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance p1, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->$marketMenuEntity:Lcom/kubi/quotefacade/entity/MarketMenuEntity;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->this$0:Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p2}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;-><init>(Lcom/kubi/quotefacade/entity/MarketMenuEntity;Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;Lkotlin/coroutines/Continuation;)V

    .line 10
    return-object p1
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget v2, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->label:I

    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v4, :cond_1

    .line 15
    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$3:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$2:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/util/List;

    .line 25
    .line 26
    iget-object v1, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$1:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ljava/util/List;

    .line 29
    .line 30
    iget-object v1, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$0:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lcom/kubi/quotefacade/entity/SpotMenu;

    .line 33
    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    goto/16 :goto_8

    .line 38
    .line 39
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    throw v1

    .line 46
    .line 47
    :cond_1
    iget v2, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$2:I

    .line 48
    .line 49
    iget v6, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$1:I

    .line 50
    .line 51
    iget v7, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$0:I

    .line 52
    .line 53
    iget-object v8, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$6:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v8, Lcom/kubi/quotefacade/entity/SpotLevel1;

    .line 56
    .line 57
    iget-object v9, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$4:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v9, Ljava/util/Iterator;

    .line 60
    .line 61
    iget-object v10, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$3:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v10, Ljava/lang/Iterable;

    .line 64
    .line 65
    iget-object v11, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$2:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v11, Ljava/util/List;

    .line 68
    .line 69
    iget-object v12, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v12, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;

    .line 72
    .line 73
    iget-object v13, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v13, Lcom/kubi/quotefacade/entity/SpotMenu;

    .line 76
    .line 77
    .line 78
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 79
    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    .line 85
    iget-object v2, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->$marketMenuEntity:Lcom/kubi/quotefacade/entity/MarketMenuEntity;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/kubi/quotefacade/entity/MarketMenuEntity;->getSpotMenu()Lcom/kubi/quotefacade/entity/SpotMenu;

    .line 89
    move-result-object v2

    .line 90
    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Lcom/kubi/quotefacade/entity/SpotMenu;->getLevel1()Ljava/util/List;

    .line 95
    move-result-object v6

    .line 96
    .line 97
    if-eqz v6, :cond_3

    .line 98
    .line 99
    .line 100
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 101
    move-result v6

    .line 102
    .line 103
    if-ne v6, v4, :cond_3

    .line 104
    .line 105
    goto/16 :goto_8

    .line 106
    .line 107
    :cond_3
    iget-object v6, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->this$0:Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;

    .line 108
    .line 109
    .line 110
    invoke-static {v6}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->q3(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 111
    move-result-object v6

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 115
    .line 116
    iget-object v6, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->this$0:Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;

    .line 117
    .line 118
    .line 119
    invoke-static {v6}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->o3(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;)Ljava/util/List;

    .line 120
    move-result-object v6

    .line 121
    .line 122
    .line 123
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 124
    .line 125
    if-eqz v2, :cond_d

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Lcom/kubi/quotefacade/entity/SpotMenu;->getLevel1()Ljava/util/List;

    .line 129
    move-result-object v6

    .line 130
    .line 131
    if-eqz v6, :cond_d

    .line 132
    .line 133
    iget-object v7, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->this$0:Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;

    .line 134
    .line 135
    .line 136
    invoke-static {v7}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->q3(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 137
    move-result-object v8

    .line 138
    .line 139
    new-instance v9, Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    move-result-object v10

    .line 147
    .line 148
    .line 149
    :cond_4
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    move-result v11

    .line 151
    .line 152
    if-eqz v11, :cond_5

    .line 153
    .line 154
    .line 155
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    move-result-object v11

    .line 157
    move-object v12, v11

    .line 158
    .line 159
    check-cast v12, Lcom/kubi/quotefacade/entity/SpotLevel1;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Lcom/kubi/quotefacade/entity/SpotLevel1;->getEnabled()Z

    .line 163
    move-result v12

    .line 164
    .line 165
    if-eqz v12, :cond_4

    .line 166
    .line 167
    .line 168
    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 169
    goto :goto_0

    .line 170
    .line 171
    .line 172
    :cond_5
    invoke-virtual {v8, v9}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 173
    .line 174
    .line 175
    invoke-static {v7}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->q3(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 176
    move-result-object v8

    .line 177
    .line 178
    .line 179
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    move-result-object v9

    .line 181
    move-object v13, v2

    .line 182
    move-object v11, v6

    .line 183
    move-object v12, v7

    .line 184
    move-object v10, v8

    .line 185
    const/4 v2, 0x0

    .line 186
    const/4 v6, 0x0

    .line 187
    const/4 v7, 0x0

    .line 188
    .line 189
    .line 190
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    move-result v8

    .line 192
    const/4 v14, 0x0

    .line 193
    .line 194
    if-eqz v8, :cond_c

    .line 195
    .line 196
    .line 197
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    move-result-object v8

    .line 199
    .line 200
    add-int/lit8 v15, v2, 0x1

    .line 201
    .line 202
    if-gez v2, :cond_6

    .line 203
    .line 204
    .line 205
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 206
    :cond_6
    move-object v3, v8

    .line 207
    .line 208
    check-cast v3, Lcom/kubi/quotefacade/entity/SpotLevel1;

    .line 209
    .line 210
    if-nez v2, :cond_8

    .line 211
    .line 212
    .line 213
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    .line 214
    move-result-object v4

    .line 215
    .line 216
    new-instance v5, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1$1$2$1;

    .line 217
    .line 218
    .line 219
    invoke-direct {v5, v12, v3, v14}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1$1$2$1;-><init>(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;Lcom/kubi/quotefacade/entity/SpotLevel1;Lkotlin/coroutines/Continuation;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    move-result-object v14

    .line 224
    .line 225
    iput-object v14, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$0:Ljava/lang/Object;

    .line 226
    .line 227
    iput-object v12, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$1:Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    move-result-object v14

    .line 232
    .line 233
    iput-object v14, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$2:Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    move-result-object v14

    .line 238
    .line 239
    iput-object v14, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$3:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v9, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$4:Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    move-result-object v8

    .line 246
    .line 247
    iput-object v8, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$5:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v3, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$6:Ljava/lang/Object;

    .line 250
    .line 251
    iput v7, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$0:I

    .line 252
    .line 253
    iput v6, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$1:I

    .line 254
    .line 255
    iput v15, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$2:I

    .line 256
    .line 257
    iput v2, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$3:I

    .line 258
    const/4 v2, 0x0

    .line 259
    .line 260
    iput v2, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$4:I

    .line 261
    const/4 v2, 0x1

    .line 262
    .line 263
    iput v2, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->label:I

    .line 264
    .line 265
    .line 266
    invoke-static {v4, v5, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 267
    move-result-object v2

    .line 268
    .line 269
    if-ne v2, v1, :cond_7

    .line 270
    .line 271
    goto/16 :goto_7

    .line 272
    :cond_7
    move-object v8, v3

    .line 273
    move v2, v15

    .line 274
    .line 275
    .line 276
    :goto_2
    invoke-static {v12}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->o3(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;)Ljava/util/List;

    .line 277
    move-result-object v3

    .line 278
    .line 279
    new-instance v16, Lcom/kubi/sdk/widget/dialog/a;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/SpotLevel1;->getNameA()Ljava/lang/String;

    .line 283
    move-result-object v4

    .line 284
    .line 285
    .line 286
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    move-result-object v18

    .line 288
    .line 289
    const/16 v29, 0xbfd

    .line 290
    .line 291
    const/16 v30, 0x0

    .line 292
    .line 293
    const/16 v17, 0x0

    .line 294
    .line 295
    const/16 v19, 0x0

    .line 296
    .line 297
    const/16 v20, 0x0

    .line 298
    .line 299
    const/16 v21, 0x0

    .line 300
    .line 301
    const/16 v22, 0x0

    .line 302
    .line 303
    const/16 v23, 0x0

    .line 304
    .line 305
    const/16 v24, 0x0

    .line 306
    .line 307
    const/16 v25, 0x0

    .line 308
    .line 309
    const/16 v26, 0x0

    .line 310
    .line 311
    const/16 v27, 0x1

    .line 312
    .line 313
    const/16 v28, 0x0

    .line 314
    .line 315
    .line 316
    invoke-direct/range {v16 .. v30}, Lcom/kubi/sdk/widget/dialog/a;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 317
    .line 318
    move-object/from16 v4, v16

    .line 319
    .line 320
    .line 321
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 322
    const/4 v5, 0x1

    .line 323
    goto :goto_6

    .line 324
    .line 325
    .line 326
    :cond_8
    invoke-static {v12}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->o3(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;)Ljava/util/List;

    .line 327
    move-result-object v2

    .line 328
    .line 329
    new-instance v16, Lcom/kubi/sdk/widget/dialog/a;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3}, Lcom/kubi/quotefacade/entity/SpotLevel1;->getNameA()Ljava/lang/String;

    .line 333
    move-result-object v4

    .line 334
    .line 335
    .line 336
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 337
    move-result-object v18

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3}, Lcom/kubi/quotefacade/entity/SpotLevel1;->getQuoteCryptos()Ljava/util/List;

    .line 341
    move-result-object v4

    .line 342
    .line 343
    if-eqz v4, :cond_9

    .line 344
    .line 345
    .line 346
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 347
    move-result v4

    .line 348
    .line 349
    if-eqz v4, :cond_a

    .line 350
    :cond_9
    const/4 v5, 0x1

    .line 351
    goto :goto_4

    .line 352
    .line 353
    .line 354
    :cond_a
    invoke-virtual {v3}, Lcom/kubi/quotefacade/entity/SpotLevel1;->getQuoteCryptos()Ljava/util/List;

    .line 355
    move-result-object v4

    .line 356
    .line 357
    .line 358
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 359
    move-result v4

    .line 360
    const/4 v5, 0x1

    .line 361
    .line 362
    if-le v4, v5, :cond_b

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3}, Lcom/kubi/quotefacade/entity/SpotLevel1;->getQuoteCryptos()Ljava/util/List;

    .line 366
    move-result-object v19

    .line 367
    .line 368
    const/16 v26, 0x3e

    .line 369
    .line 370
    const/16 v27, 0x0

    .line 371
    .line 372
    const-string v20, "\u3001"

    .line 373
    .line 374
    const/16 v21, 0x0

    .line 375
    .line 376
    const/16 v22, 0x0

    .line 377
    .line 378
    const/16 v23, 0x0

    .line 379
    .line 380
    const/16 v24, 0x0

    .line 381
    .line 382
    const/16 v25, 0x0

    .line 383
    .line 384
    .line 385
    invoke-static/range {v19 .. v27}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 386
    move-result-object v3

    .line 387
    .line 388
    :goto_3
    move-object/from16 v28, v3

    .line 389
    goto :goto_5

    .line 390
    .line 391
    :cond_b
    :goto_4
    const-string v3, ""

    .line 392
    goto :goto_3

    .line 393
    .line 394
    :goto_5
    const/16 v29, 0x7fd

    .line 395
    .line 396
    const/16 v30, 0x0

    .line 397
    .line 398
    const/16 v17, 0x0

    .line 399
    .line 400
    const/16 v19, 0x0

    .line 401
    .line 402
    const/16 v20, 0x0

    .line 403
    .line 404
    const/16 v21, 0x0

    .line 405
    .line 406
    const/16 v22, 0x0

    .line 407
    .line 408
    const/16 v23, 0x0

    .line 409
    .line 410
    const/16 v24, 0x0

    .line 411
    .line 412
    const/16 v25, 0x0

    .line 413
    .line 414
    const/16 v26, 0x0

    .line 415
    .line 416
    const/16 v27, 0x0

    .line 417
    .line 418
    .line 419
    invoke-direct/range {v16 .. v30}, Lcom/kubi/sdk/widget/dialog/a;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 420
    .line 421
    move-object/from16 v3, v16

    .line 422
    .line 423
    .line 424
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 425
    move v2, v15

    .line 426
    :goto_6
    move v4, v5

    .line 427
    const/4 v3, 0x2

    .line 428
    .line 429
    goto/16 :goto_1

    .line 430
    .line 431
    .line 432
    :cond_c
    invoke-static {v12}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->q3(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 433
    move-result-object v2

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 437
    move-result v2

    .line 438
    .line 439
    if-lez v2, :cond_d

    .line 440
    .line 441
    .line 442
    invoke-static {v12}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->q3(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 443
    move-result-object v2

    .line 444
    const/4 v3, 0x0

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 448
    move-result-object v2

    .line 449
    .line 450
    check-cast v2, Lcom/kubi/quotefacade/entity/SpotLevel1;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2}, Lcom/kubi/quotefacade/entity/SpotLevel1;->getLevel2()Ljava/util/List;

    .line 454
    move-result-object v2

    .line 455
    .line 456
    if-eqz v2, :cond_d

    .line 457
    .line 458
    .line 459
    invoke-static {v12}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->q3(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 460
    move-result-object v4

    .line 461
    .line 462
    .line 463
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 464
    move-result-object v4

    .line 465
    .line 466
    check-cast v4, Lcom/kubi/quotefacade/entity/SpotLevel1;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v4}, Lcom/kubi/quotefacade/entity/SpotLevel1;->getQuoteCryptoAliasName()Ljava/lang/String;

    .line 470
    move-result-object v3

    .line 471
    .line 472
    if-eqz v3, :cond_d

    .line 473
    .line 474
    .line 475
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    move-result-object v4

    .line 477
    .line 478
    iput-object v4, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$0:Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    move-result-object v4

    .line 483
    .line 484
    iput-object v4, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$1:Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    move-result-object v4

    .line 489
    .line 490
    iput-object v4, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$2:Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    move-result-object v4

    .line 495
    .line 496
    iput-object v4, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$3:Ljava/lang/Object;

    .line 497
    .line 498
    iput-object v14, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$4:Ljava/lang/Object;

    .line 499
    .line 500
    iput-object v14, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$5:Ljava/lang/Object;

    .line 501
    .line 502
    iput-object v14, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->L$6:Ljava/lang/Object;

    .line 503
    .line 504
    iput v7, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$0:I

    .line 505
    const/4 v4, 0x0

    .line 506
    .line 507
    iput v4, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$1:I

    .line 508
    .line 509
    iput v4, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->I$2:I

    .line 510
    const/4 v5, 0x2

    .line 511
    .line 512
    iput v5, v0, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1;->label:I

    .line 513
    .line 514
    .line 515
    invoke-static {v12, v3, v2, v4, v0}, Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;->t3(Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;Ljava/lang/String;Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 516
    move-result-object v2

    .line 517
    .line 518
    if-ne v2, v1, :cond_d

    .line 519
    :goto_7
    return-object v1

    .line 520
    .line 521
    :cond_d
    :goto_8
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 522
    return-object v1
.end method
