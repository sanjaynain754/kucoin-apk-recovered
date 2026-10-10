.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;
.super Lcom/sumsub/sns/internal/core/presentation/screen/base/s;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/presentation/verification2/email/h;
.implements Lcom/sumsub/sns/internal/features/presentation/verification2/phone/l;
.implements Lcom/sumsub/sns/internal/features/presentation/verification2/code/y;
.implements Lcom/sumsub/sns/internal/features/presentation/verification2/status/h;


# static fields
.field public static final synthetic V:I


# instance fields
.field public final d:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

.field public final e:Z

.field public final f:Z

.field public final g:Lcom/sumsub/sns/internal/features/presentation/verification/d;

.field public final h:Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;

.field public i:Z

.field public final j:Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;ZZLcom/sumsub/sns/internal/features/presentation/verification/d;Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/L;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result v1

    .line 7
    .line 8
    aget v0, v0, v1

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    const/4 v1, 0x2

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/h;->a:Lcom/sumsub/sns/internal/core/presentation/screen/navigation/h;

    .line 17
    :goto_0
    move-object v1, p6

    .line 18
    move-object v2, p7

    .line 19
    move-object v3, p8

    .line 20
    move-object v5, p9

    .line 21
    move-object v4, v0

    .line 22
    move-object v0, p0

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 29
    throw v0

    .line 30
    .line 31
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/d;->a:Lcom/sumsub/sns/internal/core/presentation/screen/navigation/d;

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/core/presentation/screen/navigation/i;Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;)V

    .line 36
    .line 37
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->d:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 38
    .line 39
    iput-boolean p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->e:Z

    .line 40
    .line 41
    iput-boolean p3, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->f:Z

    .line 42
    .line 43
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->g:Lcom/sumsub/sns/internal/features/presentation/verification/d;

    .line 44
    .line 45
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->h:Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;

    .line 46
    .line 47
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;)V

    .line 51
    .line 52
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->j:Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;

    .line 53
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification2/code/e;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/d;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/k;

    .line 8
    .line 9
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/k;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->d:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/k;-><init>(ZLcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->b(Lcom/sumsub/sns/internal/core/presentation/screen/navigation/i;)V

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/c;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->j:Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;

    .line 25
    .line 26
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/m;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/m;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a(Lcom/sumsub/sns/internal/features/presentation/verification2/host/n;)V

    .line 30
    .line 31
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/k;

    .line 32
    .line 33
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/k;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->d:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 36
    const/4 v2, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v2, v1}, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/k;-><init>(ZLcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a(Lcom/sumsub/sns/internal/core/presentation/screen/navigation/k;)V

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/b;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->j:Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;

    .line 50
    .line 51
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/m;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/m;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a(Lcom/sumsub/sns/internal/features/presentation/verification2/host/n;)V

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/a;

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/a;

    .line 68
    .line 69
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/a;->a:Ljava/lang/Throwable;

    .line 70
    .line 71
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 72
    .line 73
    const-string v3, "Code request failed"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v0, v3, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/k;

    .line 79
    .line 80
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->d:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 81
    .line 82
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/verification2/host/L;->a:[I

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 86
    move-result v0

    .line 87
    .line 88
    aget v0, v2, v0

    .line 89
    .line 90
    if-eq v0, v1, :cond_4

    .line 91
    const/4 v1, 0x2

    .line 92
    .line 93
    if-ne v0, v1, :cond_3

    .line 94
    .line 95
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/h;->a:Lcom/sumsub/sns/internal/core/presentation/screen/navigation/h;

    .line 96
    goto :goto_0

    .line 97
    .line 98
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 99
    .line 100
    .line 101
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 102
    throw p1

    .line 103
    .line 104
    :cond_4
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/d;->a:Lcom/sumsub/sns/internal/core/presentation/screen/navigation/d;

    .line 105
    .line 106
    .line 107
    :goto_0
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a(Lcom/sumsub/sns/internal/core/presentation/screen/navigation/i;)V

    .line 108
    .line 109
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 110
    return-object p1

    .line 111
    .line 112
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 113
    .line 114
    .line 115
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 116
    throw p1
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

.method public final b(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    const-string v2, "+"

    .line 5
    const/4 v3, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->j:Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;

    .line 30
    .line 31
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/l;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/l;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a(Lcom/sumsub/sns/internal/features/presentation/verification2/host/n;)V

    .line 35
    .line 36
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/k;

    .line 37
    .line 38
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/b;

    .line 39
    .line 40
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->d:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, p1, v2}, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/b;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->b(Lcom/sumsub/sns/internal/core/presentation/screen/navigation/i;)V

    .line 47
    return-void
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
.end method

.method public final getDocumentType()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->d:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/L;->a:[I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v0

    .line 9
    .line 10
    aget v0, v1, v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const-string v0, "PHONE_VERIFICATION"

    .line 19
    return-object v0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 25
    throw v0

    .line 26
    .line 27
    :cond_1
    const-string v0, "EMAIL_VERIFICATION"

    .line 28
    return-object v0
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
.end method

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/k;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a()Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    if-gt v0, v1, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->j:Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;

    .line 24
    .line 25
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/o;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/o;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a(Lcom/sumsub/sns/internal/features/presentation/verification2/host/r;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;->onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 32
    move-result p1

    .line 33
    return p1
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
.end method
