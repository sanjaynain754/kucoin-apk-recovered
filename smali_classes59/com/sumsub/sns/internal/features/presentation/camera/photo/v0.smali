.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic V:I


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final d:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

.field public final e:Lcom/sumsub/sns/internal/features/domain/e;

.field public final f:Lcom/sumsub/sns/internal/features/domain/x;

.field public final g:Lcom/sumsub/sns/internal/features/domain/ekyc/b;

.field public final h:Lcom/sumsub/sns/internal/features/domain/ekyc/d;

.field public final i:Lkotlinx/coroutines/flow/w;

.field public final j:Lkotlinx/coroutines/flow/w;

.field public final k:Lkotlinx/coroutines/flow/n;

.field public final l:Lkotlinx/coroutines/flow/n;

.field public final m:Lcom/sumsub/sns/internal/features/presentation/camera/photo/o0;

.field public final n:Lcom/sumsub/sns/internal/features/presentation/camera/photo/r0;

.field public final o:Lkotlinx/coroutines/flow/m;

.field public final p:Lkotlinx/coroutines/flow/w;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/core/domain/d;Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/x;Lcom/sumsub/sns/internal/features/domain/ekyc/b;Lcom/sumsub/sns/internal/features/domain/ekyc/d;)V
    .locals 9

    .line 1
    .line 2
    new-instance v1, Lcom/sumsub/sns/core/presentation/base/P;

    .line 3
    const/4 v2, 0x3

    .line 4
    .line 5
    .line 6
    invoke-direct {v1, v2}, Lcom/sumsub/sns/core/presentation/base/P;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p3, p4, v1}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 10
    .line 11
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->b:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 16
    .line 17
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->d:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 18
    .line 19
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->e:Lcom/sumsub/sns/internal/features/domain/e;

    .line 20
    .line 21
    move-object/from16 p1, p7

    .line 22
    .line 23
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->f:Lcom/sumsub/sns/internal/features/domain/x;

    .line 24
    .line 25
    move-object/from16 p1, p8

    .line 26
    .line 27
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->g:Lcom/sumsub/sns/internal/features/domain/ekyc/b;

    .line 28
    .line 29
    move-object/from16 p1, p9

    .line 30
    .line 31
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->h:Lcom/sumsub/sns/internal/features/domain/ekyc/d;

    .line 32
    .line 33
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/K;

    .line 34
    const/4 p2, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/K;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 45
    move-result-object p3

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p3}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 53
    move-result-object p3

    .line 54
    .line 55
    sget-object v0, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 56
    const/4 v5, 0x3

    .line 57
    const/4 v6, 0x0

    .line 58
    .line 59
    const-wide/16 v1, 0x0

    .line 60
    .line 61
    const-wide/16 v3, 0x0

    .line 62
    .line 63
    .line 64
    invoke-static/range {v0 .. v6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-static {p1, p3, v1, p2}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->i:Lkotlinx/coroutines/flow/w;

    .line 72
    .line 73
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i0;

    .line 74
    .line 75
    .line 76
    invoke-direct {p3, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i0;-><init>(Lkotlinx/coroutines/flow/w;)V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 84
    move-result-object v7

    .line 85
    .line 86
    const-wide/16 v1, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static/range {v0 .. v6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    .line 93
    invoke-static {p3, v7, v1, p1}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->j:Lkotlinx/coroutines/flow/w;

    .line 97
    .line 98
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    invoke-static {p3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 102
    move-result-object p3

    .line 103
    .line 104
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->k:Lkotlinx/coroutines/flow/n;

    .line 105
    .line 106
    .line 107
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 108
    move-result-object p3

    .line 109
    .line 110
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->l:Lkotlinx/coroutines/flow/n;

    .line 111
    .line 112
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/l0;

    .line 113
    .line 114
    .line 115
    invoke-direct {v1, p3, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/l0;-><init>(Lkotlinx/coroutines/flow/n;Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;)V

    .line 116
    .line 117
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/S;

    .line 118
    .line 119
    .line 120
    invoke-direct {v2, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/S;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1, v2}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/T;

    .line 127
    .line 128
    .line 129
    invoke-direct {v2, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/T;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v2}, Lkotlinx/coroutines/flow/g;->T(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 137
    move-result-object v2

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v2}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 141
    move-result-object v7

    .line 142
    .line 143
    .line 144
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 145
    move-result-object v8

    .line 146
    .line 147
    const-wide/16 v1, 0x0

    .line 148
    .line 149
    .line 150
    invoke-static/range {v0 .. v6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    .line 151
    move-result-object v1

    .line 152
    .line 153
    .line 154
    invoke-static {v7, v8, v1, p2}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 155
    move-result-object v1

    .line 156
    .line 157
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/camera/photo/o0;

    .line 158
    .line 159
    .line 160
    invoke-direct {v7, v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/o0;-><init>(Lkotlinx/coroutines/flow/w;Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;)V

    .line 161
    .line 162
    iput-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->m:Lcom/sumsub/sns/internal/features/presentation/camera/photo/o0;

    .line 163
    .line 164
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/r0;

    .line 165
    .line 166
    .line 167
    invoke-direct {v2, v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/r0;-><init>(Lkotlinx/coroutines/flow/w;Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;)V

    .line 168
    .line 169
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->n:Lcom/sumsub/sns/internal/features/presentation/camera/photo/r0;

    .line 170
    const/4 v1, 0x0

    .line 171
    const/4 v2, 0x7

    .line 172
    .line 173
    .line 174
    invoke-static {v1, v1, p2, v2, p2}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 175
    move-result-object v2

    .line 176
    .line 177
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->o:Lkotlinx/coroutines/flow/m;

    .line 178
    .line 179
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/u0;

    .line 180
    .line 181
    .line 182
    invoke-direct {v3, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/u0;-><init>(Lkotlinx/coroutines/flow/n;)V

    .line 183
    const/4 p3, 0x2

    .line 184
    .line 185
    new-array p3, p3, [Lkotlinx/coroutines/flow/e;

    .line 186
    .line 187
    aput-object v3, p3, v1

    .line 188
    const/4 v1, 0x1

    .line 189
    .line 190
    aput-object v2, p3, v1

    .line 191
    .line 192
    .line 193
    invoke-static {p3}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 194
    move-result-object p3

    .line 195
    .line 196
    .line 197
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 198
    move-result-object v8

    .line 199
    .line 200
    const-wide/16 v1, 0x0

    .line 201
    .line 202
    const-wide/16 v3, 0x0

    .line 203
    .line 204
    .line 205
    invoke-static/range {v0 .. v6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    .line 206
    move-result-object v0

    .line 207
    .line 208
    .line 209
    invoke-static {p3, v8, v0, p2}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 210
    move-result-object p3

    .line 211
    .line 212
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->p:Lkotlinx/coroutines/flow/w;

    .line 213
    .line 214
    .line 215
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;

    .line 219
    .line 220
    .line 221
    invoke-direct {v1, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V

    .line 222
    .line 223
    .line 224
    invoke-static {p1, v0, v1}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 225
    .line 226
    .line 227
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 228
    move-result-object p1

    .line 229
    .line 230
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j;

    .line 231
    .line 232
    .line 233
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V

    .line 234
    .line 235
    .line 236
    invoke-static {p3, p1, v0}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 237
    .line 238
    .line 239
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 240
    move-result-object p1

    .line 241
    .line 242
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/k;

    .line 243
    .line 244
    .line 245
    invoke-direct {p3, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v7, p1, p3}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 249
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x1

    .line 44
    const-string/jumbo v1, "sns_step_%s_selector_country_prompt_short"

    const-string/jumbo v2, "sns_step_%s_selector_country_prompt"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 45
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_0

    .line 46
    aget-object v6, v1, v5

    .line 47
    sget-object v7, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a:Ljava/lang/String;

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 48
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v5, v0

    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_1

    .line 50
    aget-object v6, v1, v5

    .line 51
    sget-object v7, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const-string v7, "defaults"

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 52
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v5, v0

    goto :goto_1

    .line 53
    :cond_1
    invoke-static {v2, p0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    .line 54
    new-array v0, v4, [Ljava/lang/String;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    .line 55
    check-cast p0, [Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 56
    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    invoke-static {p1, p0}, Lcom/sumsub/sns/internal/core/common/I;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/domain/v;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->i:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 25
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->k:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->h:Ljava/util/Collection;

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->g:Lcom/sumsub/sns/internal/features/presentation/camera/photo/p;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->f:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->e:Lcom/sumsub/sns/internal/features/data/model/common/q2;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->d:Lcom/sumsub/sns/internal/features/data/model/common/q2;

    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->c:Ljava/util/Iterator;

    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->b:Ljava/util/Collection;

    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->a:Ljava/lang/String;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/v;->b:Ljava/util/List;

    .line 27
    new-instance p3, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v6, p1

    move-object p1, p3

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 29
    move-object v4, p3

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    .line 30
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/p;

    invoke-direct {p3, p2, v4}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/p;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/q2;)V

    .line 31
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->d:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->a:Ljava/lang/String;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->b:Ljava/util/Collection;

    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->c:Ljava/util/Iterator;

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->d:Lcom/sumsub/sns/internal/features/data/model/common/q2;

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->e:Lcom/sumsub/sns/internal/features/data/model/common/q2;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->f:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    iput-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->g:Lcom/sumsub/sns/internal/features/presentation/camera/photo/p;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->h:Ljava/util/Collection;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Y;->k:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_3

    return-object v1

    :cond_3
    move-object v7, p1

    move-object v8, p2

    move-object p2, p3

    move-object p3, v5

    move-object v5, v4

    :goto_2
    check-cast p3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    const/4 v9, 0x0

    .line 32
    invoke-virtual {v4, p3, v9}, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p3

    .line 33
    check-cast v2, Lcom/sumsub/sns/internal/core/domain/d;

    .line 34
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 35
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 36
    invoke-static {p3, v2}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p3

    .line 37
    iget-object v2, v5, Lcom/sumsub/sns/internal/features/data/model/common/q2;->b:Ljava/lang/String;

    .line 38
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "IdentityType/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 39
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;

    invoke-direct {v4, p2, p3, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/D;Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 40
    invoke-interface {p1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object p1, v7

    move-object p2, v8

    goto :goto_1

    .line 41
    :cond_4
    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->g:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->i:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->f:Lcom/sumsub/sns/internal/features/presentation/camera/photo/u;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->e:Ljava/lang/String;

    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->d:Lcom/sumsub/sns/internal/features/data/model/common/F;

    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->c:Ljava/util/Iterator;

    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->b:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->a:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->b:Ljava/lang/Object;

    check-cast p1, Lcom/sumsub/sns/internal/features/domain/ekyc/b;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->a:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->g:Lcom/sumsub/sns/internal/features/domain/ekyc/b;

    .line 3
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->a:Ljava/lang/String;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->b:Ljava/lang/Object;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->i:I

    .line 4
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    move-object v10, v2

    move-object v2, p1

    move-object p1, p2

    move-object p2, v10

    .line 5
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 6
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->k:Ljava/util/Map;

    .line 7
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, p2}, Lcom/sumsub/sns/internal/features/domain/ekyc/b;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 9
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    goto :goto_2

    :cond_5
    move-object p1, v5

    :goto_2
    if-eqz p1, :cond_c

    .line 10
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_8

    .line 11
    :cond_6
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v6, p1

    move-object v7, p2

    move-object v8, v2

    :cond_7
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    .line 13
    move-object v4, p1

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/F;

    .line 14
    iget-object v2, v4, Lcom/sumsub/sns/internal/features/data/model/common/F;->a:Ljava/lang/String;

    if-nez v2, :cond_8

    move-object v4, v5

    goto :goto_7

    .line 15
    :cond_8
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/u;

    invoke-direct {p1, v8, v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->h:Lcom/sumsub/sns/internal/features/domain/ekyc/d;

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->a:Ljava/lang/String;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->b:Ljava/lang/Object;

    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->c:Ljava/util/Iterator;

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->d:Lcom/sumsub/sns/internal/features/data/model/common/F;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->e:Ljava/lang/String;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->f:Lcom/sumsub/sns/internal/features/presentation/camera/photo/u;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Z;->i:I

    .line 17
    const-string/jumbo v9, "name"

    invoke-virtual {p2, v9, v2, v5, v0}, Lcom/sumsub/sns/internal/features/domain/ekyc/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    :goto_4
    return-object v1

    .line 18
    :cond_9
    :goto_5
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_a

    goto :goto_6

    :cond_a
    move-object v2, p2

    .line 19
    :goto_6
    iget-object p2, v4, Lcom/sumsub/sns/internal/features/data/model/common/F;->b:Ljava/lang/String;

    .line 20
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "IdentityType/"

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 21
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;

    invoke-direct {v4, p1, v2, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/D;Ljava/lang/CharSequence;Ljava/lang/String;)V

    :goto_7
    if-eqz v4, :cond_7

    .line 22
    invoke-interface {v7, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 23
    :cond_b
    check-cast v7, Ljava/util/List;

    return-object v7

    .line 24
    :cond_c
    :goto_8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-eqz p1, :cond_0

    .line 57
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 58
    const-string v2, "defaults"

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {v0, p2}, [Ljava/lang/String;

    move-result-object p2

    .line 59
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/I;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;)V
    .locals 12

    .line 42
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onItemSelected: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 43
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/f0;

    const/4 v0, 0x0

    invoke-direct {v9, p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/f0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->j:Lkotlinx/coroutines/flow/w;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/N;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/N;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->k:Lkotlinx/coroutines/flow/n;

    .line 10
    .line 11
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/O;

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/O;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v0, v2}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 19
    move-result-object v4

    .line 20
    .line 21
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/H;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/H;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/core/presentation/base/O;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    new-instance v1, Lcom/sumsub/sns/internal/core/common/D;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v0, v3}, Lcom/sumsub/sns/internal/core/common/D;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 33
    move-result-object v5

    .line 34
    .line 35
    iget-object v0, p1, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 36
    .line 37
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/d0;

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, p0, v0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/coroutines/Continuation;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 44
    move-result-object v6

    .line 45
    .line 46
    iget-object v0, p1, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 47
    .line 48
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, p0, v0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/Q;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/coroutines/Continuation;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 55
    move-result-object v7

    .line 56
    .line 57
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 58
    .line 59
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/X;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, p0, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/X;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/coroutines/Continuation;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 66
    move-result-object v8

    .line 67
    .line 68
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/camera/photo/I;

    .line 69
    .line 70
    .line 71
    invoke-direct {v9, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/I;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 72
    .line 73
    .line 74
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/flow/g;->p(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/e;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/J;

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/J;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/g;->U(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 84
    move-result-object p1

    .line 85
    return-object p1
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
.end method

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 7

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/x;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/x;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/x;->a:Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 9
    .line 10
    if-eqz p1, :cond_7

    .line 11
    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->l:Lkotlinx/coroutines/flow/n;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->l:Lkotlinx/coroutines/flow/n;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getEventHandler()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    if-eqz v0, :cond_7

    .line 38
    .line 39
    new-instance v1, Lcom/sumsub/sns/core/data/listener/SNSEvent$CountrySelected;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 42
    const/4 v2, 0x1

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, p1, v2}, Lcom/sumsub/sns/core/data/listener/SNSEvent$CountrySelected;-><init>(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1}, Lcom/sumsub/sns/core/data/listener/SNSEventHandler;->onEvent(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 49
    return-void

    .line 50
    .line 51
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/z;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/z;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/z;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;)V

    .line 61
    return-void

    .line 62
    .line 63
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/e0;

    .line 72
    const/4 p1, 0x0

    .line 73
    .line 74
    .line 75
    invoke-direct {v4, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;Lkotlin/coroutines/Continuation;)V

    .line 76
    const/4 v5, 0x3

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v2, 0x0

    .line 79
    const/4 v3, 0x0

    .line 80
    .line 81
    .line 82
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 83
    return-void

    .line 84
    .line 85
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/A;

    .line 86
    .line 87
    if-eqz v0, :cond_6

    .line 88
    .line 89
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->j:Lkotlinx/coroutines/flow/w;

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    check-cast p1, Ljava/util/List;

    .line 96
    .line 97
    .line 98
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 99
    move-result p1

    .line 100
    .line 101
    if-eqz p1, :cond_4

    .line 102
    goto :goto_0

    .line 103
    .line 104
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->k:Lkotlinx/coroutines/flow/n;

    .line 105
    .line 106
    .line 107
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    check-cast p1, Ljava/lang/Boolean;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    move-result p1

    .line 115
    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 119
    .line 120
    .line 121
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    move-result-object v1

    .line 123
    const/4 v4, 0x4

    .line 124
    const/4 v5, 0x0

    .line 125
    .line 126
    .line 127
    const-string/jumbo v2, "onSelectCountryClick: dialog already shown"

    .line 128
    const/4 v3, 0x0

    .line 129
    .line 130
    .line 131
    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 132
    return-void

    .line 133
    .line 134
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->k:Lkotlinx/coroutines/flow/n;

    .line 135
    .line 136
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    .line 139
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 140
    return-void

    .line 141
    .line 142
    :cond_6
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/y;

    .line 143
    .line 144
    if-eqz p1, :cond_7

    .line 145
    .line 146
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->k:Lkotlinx/coroutines/flow/n;

    .line 147
    .line 148
    .line 149
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    check-cast p1, Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    move-result p1

    .line 157
    .line 158
    if-eqz p1, :cond_7

    .line 159
    .line 160
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->k:Lkotlinx/coroutines/flow/n;

    .line 161
    .line 162
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 163
    .line 164
    .line 165
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 166
    :cond_7
    :goto_0
    return-void
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
.end method
