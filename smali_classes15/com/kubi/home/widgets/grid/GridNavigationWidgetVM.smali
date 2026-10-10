.class public final Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;
.super Lcom/kubi/mvi/state/m;
.source "GridNavigationWidgetVM.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/m<",
        "Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;",
        "Lcom/kubi/mvi/state/SingleSimpleStateVM;",
        "Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;",
        "<init>",
        "()V",
        "repo",
        "Lcom/kubi/home/widgets/HomeWidgetRepo;",
        "firstLoad",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "initState",
        "getInitState",
        "()Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;",
        "dispatchIntent",
        "",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadData",
        "forceRefresh",
        "",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "HomeLib_googleRelease"
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
        "SMAP\nGridNavigationWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationWidgetVM.kt\ncom/kubi/home/widgets/grid/GridNavigationWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n*L\n1#1,72:1\n473#2,4:73\n*S KotlinDebug\n*F\n+ 1 GridNavigationWidgetVM.kt\ncom/kubi/home/widgets/grid/GridNavigationWidgetVM\n*L\n29#1:73,4\n*E\n"
    }
.end annotation


# instance fields
.field public final X:Lcom/kubi/home/widgets/HomeWidgetRepo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/m;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/home/widgets/HomeWidgetRepo;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/home/widgets/HomeWidgetRepo;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;->X:Lcom/kubi/home/widgets/HomeWidgetRepo;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    return-void
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
.end method

.method public static synthetic b(Ljava/util/List;Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;)Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;->p(Ljava/util/List;Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;)Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic d(Ljava/util/List;Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;)Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;->q(Ljava/util/List;Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;)Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic e(Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;->o(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method private final o(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    instance-of v3, v2, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    move-object v3, v2

    .line 12
    .line 13
    check-cast v3, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;

    .line 14
    .line 15
    iget v4, v3, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->label:I

    .line 16
    .line 17
    const/high16 v5, -0x80000000

    .line 18
    .line 19
    and-int v6, v4, v5

    .line 20
    .line 21
    if-eqz v6, :cond_0

    .line 22
    sub-int/2addr v4, v5

    .line 23
    .line 24
    iput v4, v3, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->label:I

    .line 25
    :goto_0
    move-object v8, v3

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    new-instance v3, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;

    .line 29
    .line 30
    .line 31
    invoke-direct {v3, v0, v2}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;-><init>(Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;Lkotlin/coroutines/Continuation;)V

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :goto_1
    iget-object v2, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->result:Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    iget v4, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->label:I

    .line 41
    .line 42
    const-string v5, "duration11"

    .line 43
    const/4 v6, 0x2

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v11, 0x1

    .line 46
    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    if-eq v4, v11, :cond_2

    .line 50
    .line 51
    if-ne v4, v6, :cond_1

    .line 52
    .line 53
    iget-object v1, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->L$3:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Ljava/util/List;

    .line 56
    .line 57
    iget-object v3, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->L$2:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lcom/kubi/home/entity/MoreIconEntity;

    .line 60
    .line 61
    iget-object v3, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v3, Lcom/kubi/home/entity/HomeGridNavigationEntity;

    .line 64
    .line 65
    iget-object v3, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    .line 72
    goto/16 :goto_8

    .line 73
    .line 74
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    throw v1

    .line 81
    .line 82
    :cond_2
    iget-wide v9, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->J$0:J

    .line 83
    .line 84
    iget-boolean v1, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->Z$0:Z

    .line 85
    .line 86
    iget-object v4, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->L$0:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v4, Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 92
    goto :goto_3

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 96
    .line 97
    sget-object v2, Lcom/kubi/sdk/util/j1;->a:Lcom/kubi/sdk/util/j1;

    .line 98
    .line 99
    const-string v4, "duration10"

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4}, Lcom/kubi/sdk/util/j1;->j(Ljava/lang/String;)V

    .line 103
    .line 104
    sget-object v4, Loj/f;->a:Loj/f;

    .line 105
    .line 106
    const-string v9, "home_page_menu_widget_load_data"

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, v9}, Loj/f;->b(Ljava/lang/String;)V

    .line 110
    .line 111
    iget-object v9, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 112
    const/4 v10, 0x0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v9, v11, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 116
    move-result v9

    .line 117
    .line 118
    if-eqz v9, :cond_4

    .line 119
    .line 120
    sget-object v9, Lcom/kubi/home/widgets/grid/GridNavigationWidgetPreloader;->a:Lcom/kubi/home/widgets/grid/GridNavigationWidgetPreloader;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetPreloader;->a()Ljava/util/List;

    .line 124
    move-result-object v9

    .line 125
    .line 126
    if-eqz v9, :cond_4

    .line 127
    .line 128
    .line 129
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 130
    move-result v10

    .line 131
    .line 132
    if-le v10, v11, :cond_4

    .line 133
    .line 134
    const-string v10, "home_page_menu_widget_use_cache"

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, v10}, Loj/f;->b(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v5}, Lcom/kubi/sdk/util/j1;->j(Ljava/lang/String;)V

    .line 141
    .line 142
    new-instance v2, Lcom/kubi/home/widgets/grid/j;

    .line 143
    .line 144
    .line 145
    invoke-direct {v2, v9}, Lcom/kubi/home/widgets/grid/j;-><init>(Ljava/util/List;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v2}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 149
    .line 150
    :cond_4
    if-eqz v1, :cond_5

    .line 151
    move-object v2, v7

    .line 152
    goto :goto_2

    .line 153
    .line 154
    :cond_5
    sget-object v2, Lcom/kubi/home/api/c;->a:Lcom/kubi/home/api/c;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/kubi/home/api/c;->b()J

    .line 158
    move-result-wide v9

    .line 159
    .line 160
    .line 161
    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 162
    move-result-object v2

    .line 163
    .line 164
    :goto_2
    const-string v9, "home_page_menu_widget_start_fetch_data"

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v9}, Loj/f;->b(Ljava/lang/String;)V

    .line 168
    .line 169
    sget-object v4, Loj/h;->a:Loj/h;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4}, Loj/h;->b()J

    .line 173
    move-result-wide v9

    .line 174
    .line 175
    iget-object v4, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;->X:Lcom/kubi/home/widgets/HomeWidgetRepo;

    .line 176
    .line 177
    .line 178
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    move-result-object v12

    .line 180
    .line 181
    iput-object v12, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->L$0:Ljava/lang/Object;

    .line 182
    .line 183
    iput-boolean v1, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->Z$0:Z

    .line 184
    .line 185
    iput-wide v9, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->J$0:J

    .line 186
    .line 187
    iput v11, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->label:I

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v2, v8}, Lcom/kubi/home/widgets/HomeWidgetRepo;->h(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 191
    move-result-object v4

    .line 192
    .line 193
    if-ne v4, v3, :cond_6

    .line 194
    .line 195
    goto/16 :goto_7

    .line 196
    .line 197
    :cond_6
    move-object/from16 v16, v4

    .line 198
    move-object v4, v2

    .line 199
    .line 200
    move-object/from16 v2, v16

    .line 201
    .line 202
    :goto_3
    check-cast v2, Lcom/kubi/home/entity/HomeGridNavigationEntity;

    .line 203
    .line 204
    sget-object v12, Loj/h;->a:Loj/h;

    .line 205
    .line 206
    sget-object v13, Lcom/kubi/home/api/HomeWidgetCode;->Menu:Lcom/kubi/home/api/HomeWidgetCode;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v13}, Lcom/kubi/home/api/HomeWidgetCode;->getCode()Ljava/lang/String;

    .line 210
    move-result-object v13

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Loj/h;->b()J

    .line 214
    move-result-wide v14

    .line 215
    sub-long/2addr v14, v9

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v13, v14, v15}, Loj/h;->d(Ljava/lang/String;J)V

    .line 219
    .line 220
    sget-object v12, Loj/f;->a:Loj/f;

    .line 221
    .line 222
    const-string v13, "home_page_menu_widget_end_fetch_data"

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v13}, Loj/f;->b(Ljava/lang/String;)V

    .line 226
    .line 227
    sget-object v12, Lcom/kubi/sdk/util/j1;->a:Lcom/kubi/sdk/util/j1;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v5}, Lcom/kubi/sdk/util/j1;->j(Ljava/lang/String;)V

    .line 231
    .line 232
    if-eqz v2, :cond_7

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Lcom/kubi/home/entity/HomeGridNavigationEntity;->getIconResponse()Lcom/kubi/home/entity/MoreIconEntity;

    .line 236
    move-result-object v5

    .line 237
    goto :goto_4

    .line 238
    :cond_7
    move-object v5, v7

    .line 239
    .line 240
    :goto_4
    if-eqz v2, :cond_8

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Lcom/kubi/home/entity/HomeGridNavigationEntity;->getNavigationList()Ljava/util/List;

    .line 244
    move-result-object v12

    .line 245
    goto :goto_5

    .line 246
    :cond_8
    move-object v12, v7

    .line 247
    .line 248
    :goto_5
    if-nez v12, :cond_9

    .line 249
    .line 250
    .line 251
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 252
    move-result-object v12

    .line 253
    .line 254
    .line 255
    :cond_9
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 256
    move-result-object v12

    .line 257
    .line 258
    new-instance v13, Lcom/kubi/home/entity/MoreNavigationEntity;

    .line 259
    .line 260
    if-eqz v5, :cond_a

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5}, Lcom/kubi/home/entity/MoreIconEntity;->getDayIcon()Ljava/lang/String;

    .line 264
    move-result-object v14

    .line 265
    goto :goto_6

    .line 266
    :cond_a
    move-object v14, v7

    .line 267
    .line 268
    :goto_6
    if-eqz v5, :cond_b

    .line 269
    .line 270
    .line 271
    invoke-virtual {v5}, Lcom/kubi/home/entity/MoreIconEntity;->getDarkIcon()Ljava/lang/String;

    .line 272
    move-result-object v7

    .line 273
    .line 274
    .line 275
    :cond_b
    invoke-direct {v13, v14, v7}, Lcom/kubi/home/entity/MoreNavigationEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 282
    move-result-object v7

    .line 283
    .line 284
    .line 285
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 286
    move-result v12

    .line 287
    .line 288
    if-nez v12, :cond_d

    .line 289
    move-object v12, v4

    .line 290
    .line 291
    sget-object v4, Lcom/kubi/home/v2/biz/grid/utils/GridItemHeightHelper;->a:Lcom/kubi/home/v2/biz/grid/utils/GridItemHeightHelper;

    .line 292
    .line 293
    .line 294
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    move-result-object v12

    .line 296
    .line 297
    iput-object v12, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->L$0:Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    move-result-object v2

    .line 302
    .line 303
    iput-object v2, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->L$1:Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    move-result-object v2

    .line 308
    .line 309
    iput-object v2, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->L$2:Ljava/lang/Object;

    .line 310
    .line 311
    iput-object v7, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->L$3:Ljava/lang/Object;

    .line 312
    .line 313
    iput-boolean v1, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->Z$0:Z

    .line 314
    .line 315
    iput-wide v9, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->J$0:J

    .line 316
    .line 317
    iput v6, v8, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$loadData$1;->label:I

    .line 318
    const/4 v6, 0x4

    .line 319
    move-object v5, v7

    .line 320
    const/4 v7, 0x0

    .line 321
    const/4 v9, 0x4

    .line 322
    const/4 v10, 0x0

    .line 323
    .line 324
    .line 325
    invoke-static/range {v4 .. v10}, Lcom/kubi/home/v2/biz/grid/utils/GridItemHeightHelper;->e(Lcom/kubi/home/v2/biz/grid/utils/GridItemHeightHelper;Ljava/util/List;IILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 326
    move-result-object v1

    .line 327
    .line 328
    if-ne v1, v3, :cond_c

    .line 329
    :goto_7
    return-object v3

    .line 330
    :cond_c
    move-object v1, v5

    .line 331
    :goto_8
    move-object v7, v1

    .line 332
    goto :goto_9

    .line 333
    :cond_d
    move-object v5, v7

    .line 334
    .line 335
    .line 336
    :goto_9
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 337
    move-result v1

    .line 338
    .line 339
    if-le v1, v11, :cond_e

    .line 340
    .line 341
    new-instance v1, Lcom/kubi/home/widgets/grid/k;

    .line 342
    .line 343
    .line 344
    invoke-direct {v1, v7}, Lcom/kubi/home/widgets/grid/k;-><init>(Ljava/util/List;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 348
    .line 349
    sget-object v1, Lcom/kubi/home/widgets/grid/GridNavigationWidgetPreloader;->a:Lcom/kubi/home/widgets/grid/GridNavigationWidgetPreloader;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetPreloader;->b()Lkotlinx/coroutines/x1;

    .line 353
    goto :goto_a

    .line 354
    .line 355
    .line 356
    :cond_e
    invoke-virtual {v0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 357
    move-result-object v1

    .line 358
    .line 359
    check-cast v1, Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;->getDataList()Ljava/util/List;

    .line 363
    move-result-object v1

    .line 364
    .line 365
    if-nez v1, :cond_f

    .line 366
    .line 367
    sget-object v1, Lcom/kubi/home/widgets/grid/h;->a:Lcom/kubi/home/widgets/grid/h;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 371
    goto :goto_a

    .line 372
    .line 373
    :cond_f
    sget-object v1, Loj/f;->a:Loj/f;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1}, Loj/f;->h()V

    .line 377
    .line 378
    :goto_a
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 379
    return-object v1
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
.end method

.method public static final p(Ljava/util/List;Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;)Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;
    .locals 1

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;->copy(Ljava/util/List;)Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method

.method public static final q(Ljava/util/List;Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;)Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;
    .locals 1

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;->copy(Ljava/util/List;)Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method


# virtual methods
.method public dispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lcom/kubi/mvi/state/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/mvi/state/d;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;-><init>(Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UiIntent$LoadData;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 46
    .line 47
    iget-object p1, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/kubi/mvi/state/BaseStateVM;

    .line 50
    .line 51
    iget-object p1, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    throw p1

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    .line 70
    instance-of p2, p1, Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UiIntent$LoadData;

    .line 71
    .line 72
    if-eqz p2, :cond_3

    .line 73
    move-object p2, p1

    .line 74
    .line 75
    check-cast p2, Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UiIntent$LoadData;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UiIntent$LoadData;->getForceRefresh()Z

    .line 79
    move-result v2

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    move-result-object v4

    .line 84
    .line 85
    iput-object v4, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    move-result-object v4

    .line 90
    .line 91
    iput-object v4, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object p1, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    iput-object p1, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 100
    const/4 p1, 0x0

    .line 101
    .line 102
    iput p1, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->I$0:I

    .line 103
    .line 104
    iput p1, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->I$1:I

    .line 105
    .line 106
    iput v3, v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM$dispatchIntent$1;->label:I

    .line 107
    .line 108
    .line 109
    invoke-direct {p0, v2, v0}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;->o(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    if-ne p1, v1, :cond_3

    .line 113
    return-object v1

    .line 114
    .line 115
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 116
    return-object p1
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
.end method

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetVM;->n()Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public n()Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v1}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetContract$UIState;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    return-object v0
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
.end method
