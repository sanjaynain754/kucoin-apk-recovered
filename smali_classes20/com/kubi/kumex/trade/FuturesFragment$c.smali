.class public final Lcom/kubi/kumex/trade/FuturesFragment$c;
.super Ljava/lang/Object;
.source "FuturesFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/kumex/trade/FuturesFragment;->Z6()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
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
        "SMAP\nFuturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragment$initObserver$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2545:1\n388#2,7:2546\n*S KotlinDebug\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragment$initObserver$1$1$1\n*L\n1008#1:2546,7\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lm50/a;

.field public final synthetic c:Lcom/kubi/kumex/trade/FuturesFragment;


# direct methods
.method public constructor <init>(Lm50/a;Lcom/kubi/kumex/trade/FuturesFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->b:Lm50/a;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->c:Lcom/kubi/kumex/trade/FuturesFragment;

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
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->b:Lm50/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lm50/a;->b()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "futures"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->c:Lcom/kubi/kumex/trade/FuturesFragment;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/kubi/kumex/trade/FuturesFragment;->n5(Lcom/kubi/kumex/trade/FuturesFragment;)Ljava/util/ArrayList;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->c:Lcom/kubi/kumex/trade/FuturesFragment;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    move-result v2

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 36
    move-result v2

    .line 37
    const/4 v3, -0x1

    .line 38
    const/4 v4, 0x0

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    check-cast v2, Ljava/lang/String;

    .line 47
    .line 48
    sget v5, Lcom/kubi/kumex/R$string;->robot:I

    .line 49
    .line 50
    new-array v6, v4, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v5, v6}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    move-result-object v5

    .line 55
    const/4 v6, 0x2

    .line 56
    const/4 v7, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v5, v4, v6, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 60
    move-result v2

    .line 61
    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 66
    move-result v0

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move v0, v3

    .line 69
    .line 70
    :goto_0
    if-eq v0, v3, :cond_4

    .line 71
    .line 72
    iget-object v1, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->b:Lm50/a;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lm50/a;->a()Ljava/lang/Integer;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    iget-object v1, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->c:Lcom/kubi/kumex/trade/FuturesFragment;

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Lcom/kubi/kumex/trade/FuturesFragment;->n5(Lcom/kubi/kumex/trade/FuturesFragment;)Ljava/util/ArrayList;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    iget-object v2, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->c:Lcom/kubi/kumex/trade/FuturesFragment;

    .line 87
    .line 88
    sget v3, Lcom/kubi/kumex/R$string;->robot:I

    .line 89
    .line 90
    new-array v4, v4, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3, v4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 98
    goto :goto_1

    .line 99
    .line 100
    :cond_3
    iget-object v1, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->c:Lcom/kubi/kumex/trade/FuturesFragment;

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, Lcom/kubi/kumex/trade/FuturesFragment;->n5(Lcom/kubi/kumex/trade/FuturesFragment;)Ljava/util/ArrayList;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    new-instance v2, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    iget-object v3, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->c:Lcom/kubi/kumex/trade/FuturesFragment;

    .line 112
    .line 113
    sget v5, Lcom/kubi/kumex/R$string;->robot:I

    .line 114
    .line 115
    new-array v4, v4, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v5, v4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    move-result-object v3

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v3, " ("

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    iget-object v3, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->b:Lm50/a;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3}, Lm50/a;->a()Ljava/lang/Integer;

    .line 133
    move-result-object v3

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const/16 v3, 0x29

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    move-result-object v2

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    :goto_1
    iget-object v1, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->c:Lcom/kubi/kumex/trade/FuturesFragment;

    .line 151
    .line 152
    .line 153
    invoke-static {v1}, Lcom/kubi/kumex/trade/FuturesFragment;->k5(Lcom/kubi/kumex/trade/FuturesFragment;)Ldm/f2;

    .line 154
    move-result-object v1

    .line 155
    .line 156
    if-eqz v1, :cond_4

    .line 157
    .line 158
    iget-object v1, v1, Ldm/f2;->b:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 159
    .line 160
    if-eqz v1, :cond_4

    .line 161
    .line 162
    iget-object v2, p0, Lcom/kubi/kumex/trade/FuturesFragment$c;->c:Lcom/kubi/kumex/trade/FuturesFragment;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v0}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->t(I)Landroid/widget/TextView;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    if-eqz v1, :cond_4

    .line 169
    .line 170
    .line 171
    invoke-static {v2}, Lcom/kubi/kumex/trade/FuturesFragment;->n5(Lcom/kubi/kumex/trade/FuturesFragment;)Ljava/util/ArrayList;

    .line 172
    move-result-object v2

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    move-result-object v0

    .line 177
    .line 178
    check-cast v0, Ljava/lang/CharSequence;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    :cond_4
    :goto_2
    return-void
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
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kumex/trade/FuturesFragment$c;->a()V

    .line 4
    .line 5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object v0
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
