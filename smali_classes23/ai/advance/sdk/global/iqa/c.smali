.class public Lai/advance/sdk/global/iqa/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

.field public c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

.field public d:Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/TextView;

.field public h:Landroid/widget/ImageView;

.field public i:Landroid/widget/TextView;

.field public j:Landroid/widget/TextView;

.field public k:Landroid/widget/TextView;

.field public final l:Landroid/content/res/Resources;

.field public final m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/ImageView;

.field public p:Landroid/view/View;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/ImageView;

.field public s:Landroid/view/View;

.field public t:Landroid/app/ProgressDialog;

.field public u:Landroid/widget/ImageView;

.field public v:Lai/advance/sdk/global/iqa/e;


# direct methods
.method public constructor <init>(Lai/advance/sdk/global/iqa/GlobalIQAActivity;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->l:Landroid/content/res/Resources;

    .line 12
    .line 13
    iget-object v0, p1, Lai/advance/sdk/global/iqa/d;->i:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 14
    .line 15
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 16
    .line 17
    iput-object p1, p0, Lai/advance/sdk/global/iqa/c;->v:Lai/advance/sdk/global/iqa/e;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->x()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->C()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->B()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->D()V

    .line 30
    return-void
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
.end method

.method public static synthetic a(Lai/advance/sdk/global/iqa/c;IIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lai/advance/sdk/global/iqa/c;->i(IIII)V

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
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
.end method

.method public static synthetic b(Lai/advance/sdk/global/iqa/c;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lai/advance/sdk/global/iqa/c;->d(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

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
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
.end method

.method public static synthetic c(Lai/advance/sdk/global/iqa/c;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lai/advance/sdk/global/iqa/c;->o:Landroid/widget/ImageView;

    .line 3
    return-object p0
    .line 4
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
.end method

.method public static e(Lai/advance/sdk/global/iqa/lib/TipViewUIElements;Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;)Ljava/lang/Integer;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_6

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    sget-object v1, Lai/advance/sdk/global/iqa/c$c;->a:[I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    move-result p1

    .line 13
    .line 14
    aget p1, v1, p1

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    if-eq p1, v1, :cond_5

    .line 18
    const/4 v1, 0x2

    .line 19
    .line 20
    if-eq p1, v1, :cond_4

    .line 21
    const/4 v1, 0x3

    .line 22
    .line 23
    if-eq p1, v1, :cond_3

    .line 24
    const/4 v1, 0x4

    .line 25
    .line 26
    if-eq p1, v1, :cond_2

    .line 27
    const/4 v1, 0x7

    .line 28
    .line 29
    if-eq p1, v1, :cond_1

    .line 30
    return-object v0

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/lib/TipViewUIElements;->getHoldSteadilyDrawableResId()Ljava/lang/Integer;

    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/lib/TipViewUIElements;->getCardIncompleteDrawableResId()Ljava/lang/Integer;

    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    .line 42
    .line 43
    :cond_3
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/lib/TipViewUIElements;->getCardTooSmallDrawableResId()Ljava/lang/Integer;

    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    .line 47
    .line 48
    :cond_4
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/lib/TipViewUIElements;->getCardPoorQualityDrawableResId()Ljava/lang/Integer;

    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    .line 52
    .line 53
    :cond_5
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/lib/TipViewUIElements;->getNoCardDrawableResId()Ljava/lang/Integer;

    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_6
    :goto_0
    return-object v0
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
.end method

.method public static synthetic j(Lai/advance/sdk/global/iqa/c;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lai/advance/sdk/global/iqa/c;->s(I)V

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
    .line 44
    .line 45
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->L()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->f()V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->canRetry()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 17
    .line 18
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getTakePhotoTipDialogShowSeconds()Ljava/lang/Integer;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 28
    move-result v0

    .line 29
    .line 30
    if-lez v0, :cond_0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void

    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->l:Landroid/content/res/Resources;

    .line 35
    .line 36
    sget v1, Lai/advance/sdk/global/iqa/R$string;->iqa_retry_tips:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    sget v1, Lai/advance/sdk/global/iqa/R$drawable;->advance_iqa_tip_warning:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0, v1}, Lai/advance/sdk/global/iqa/c;->l(Ljava/lang/CharSequence;I)V

    .line 46
    return-void

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->n()V

    .line 50
    .line 51
    sget v0, Lai/advance/sdk/global/iqa/R$drawable;->advance_iqa_tip_capture:I

    .line 52
    const/4 v1, 0x0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1, v0}, Lai/advance/sdk/global/iqa/c;->l(Ljava/lang/CharSequence;I)V

    .line 56
    return-void
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
.end method

.method public final B()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 5
    .line 6
    if-eqz v0, :cond_12

    .line 7
    .line 8
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->p:Landroid/view/View;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->isFlipCameraBtnVisible()Z

    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    const/16 v0, 0x8

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 25
    .line 26
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getFrameRectColor()Ljava/lang/Integer;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->d:Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 38
    move-result v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->setLineColor(I)V

    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 44
    .line 45
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getFrameRectCornerRadius()Ljava/lang/Integer;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->d:Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->setCornerRadius(Ljava/lang/Integer;)V

    .line 57
    .line 58
    :cond_2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 59
    .line 60
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getPageColor()Ljava/lang/Integer;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 69
    .line 70
    sget v3, Lai/advance/sdk/global/iqa/R$id;->bg_iqa_view_activity:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 81
    move-result v3

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 85
    .line 86
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->s:Landroid/view/View;

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 92
    move-result v0

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 96
    .line 97
    :cond_3
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 98
    .line 99
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getTitleTextColor()Ljava/lang/Integer;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->q:Landroid/widget/TextView;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 111
    move-result v0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 115
    .line 116
    :cond_4
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 117
    .line 118
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getPrimaryTextColor()Ljava/lang/Integer;

    .line 122
    move-result-object v0

    .line 123
    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->n:Landroid/widget/TextView;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 130
    move-result v3

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 134
    .line 135
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->g:Landroid/widget/TextView;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 139
    move-result v3

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 143
    .line 144
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->g:Landroid/widget/TextView;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    check-cast v1, Landroid/graphics/drawable/GradientDrawable;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Landroid/graphics/drawable/GradientDrawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Landroid/graphics/drawable/GradientDrawable;->getIntrinsicWidth()I

    .line 157
    move-result v3

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 161
    move-result v4

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 165
    .line 166
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 170
    move-result v0

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 174
    .line 175
    :cond_5
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 176
    .line 177
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getSpannableTextAboveCamera()Ljava/lang/CharSequence;

    .line 181
    move-result-object v0

    .line 182
    .line 183
    if-eqz v0, :cond_6

    .line 184
    .line 185
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->n:Landroid/widget/TextView;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    :cond_6
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 191
    .line 192
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getTakePhotoViewIcon()Ljava/lang/Integer;

    .line 196
    move-result-object v0

    .line 197
    .line 198
    if-eqz v0, :cond_7

    .line 199
    .line 200
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->h:Landroid/widget/ImageView;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 204
    move-result v0

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 208
    .line 209
    :cond_7
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 213
    move-result v0

    .line 214
    .line 215
    if-eqz v0, :cond_8

    .line 216
    .line 217
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 218
    .line 219
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getPagePortraitBackgroundResource()Ljava/lang/Integer;

    .line 223
    move-result-object v0

    .line 224
    goto :goto_1

    .line 225
    .line 226
    :cond_8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 227
    .line 228
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getPageLandscapeBackgroundResource()Ljava/lang/Integer;

    .line 232
    move-result-object v0

    .line 233
    .line 234
    :goto_1
    if-eqz v0, :cond_9

    .line 235
    .line 236
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->r:Landroid/widget/ImageView;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 240
    move-result v0

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 244
    .line 245
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->s:Landroid/view/View;

    .line 246
    .line 247
    if-eqz v0, :cond_9

    .line 248
    const/4 v1, 0x0

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 252
    .line 253
    :cond_9
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 254
    .line 255
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->isCountdownTimerVisible()Z

    .line 259
    move-result v0

    .line 260
    .line 261
    if-nez v0, :cond_a

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->n()V

    .line 265
    .line 266
    :cond_a
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 267
    .line 268
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getRetakeBtnTextColor()Ljava/lang/Integer;

    .line 272
    move-result-object v0

    .line 273
    .line 274
    if-eqz v0, :cond_b

    .line 275
    .line 276
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->j:Landroid/widget/TextView;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 280
    move-result v0

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 284
    .line 285
    :cond_b
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 286
    .line 287
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getContinueBtnTextColor()Ljava/lang/Integer;

    .line 291
    move-result-object v0

    .line 292
    .line 293
    if-eqz v0, :cond_c

    .line 294
    .line 295
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->k:Landroid/widget/TextView;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 299
    move-result v0

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 303
    .line 304
    :cond_c
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 308
    move-result v0

    .line 309
    .line 310
    if-eqz v0, :cond_d

    .line 311
    .line 312
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 313
    .line 314
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getCameraWidthPercentInPortraitState()Ljava/lang/Float;

    .line 318
    move-result-object v0

    .line 319
    .line 320
    if-eqz v0, :cond_e

    .line 321
    .line 322
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 326
    move-result-object v1

    .line 327
    .line 328
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 332
    move-result v0

    .line 333
    .line 334
    iput v0, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->matchConstraintPercentWidth:F

    .line 335
    .line 336
    :goto_2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 340
    goto :goto_3

    .line 341
    .line 342
    :cond_d
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 343
    .line 344
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getCameraHeightPercentInLandscapeState()Ljava/lang/Float;

    .line 348
    move-result-object v0

    .line 349
    .line 350
    if-eqz v0, :cond_e

    .line 351
    .line 352
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 356
    move-result-object v1

    .line 357
    .line 358
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 362
    move-result v0

    .line 363
    .line 364
    iput v0, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->matchConstraintPercentHeight:F

    .line 365
    goto :goto_2

    .line 366
    .line 367
    :cond_e
    :goto_3
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 371
    move-result v0

    .line 372
    .line 373
    if-eqz v0, :cond_f

    .line 374
    .line 375
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 376
    .line 377
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getPagePortraitTitleBgResource()Ljava/lang/Integer;

    .line 381
    move-result-object v0

    .line 382
    goto :goto_4

    .line 383
    .line 384
    :cond_f
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 385
    .line 386
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getPageLandscapeTitleBgResource()Ljava/lang/Integer;

    .line 390
    move-result-object v0

    .line 391
    .line 392
    :goto_4
    if-eqz v0, :cond_10

    .line 393
    .line 394
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->u:Landroid/widget/ImageView;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 398
    .line 399
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->u:Landroid/widget/ImageView;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 403
    move-result v0

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 407
    .line 408
    :cond_10
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 409
    .line 410
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getTitleBgColor()Ljava/lang/Integer;

    .line 414
    move-result-object v0

    .line 415
    .line 416
    if-eqz v0, :cond_11

    .line 417
    .line 418
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->u:Landroid/widget/ImageView;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 422
    .line 423
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->u:Landroid/widget/ImageView;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 427
    move-result v0

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 431
    .line 432
    :cond_11
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 433
    .line 434
    new-instance v1, Lai/advance/sdk/global/iqa/a;

    .line 435
    .line 436
    .line 437
    invoke-direct {v1, p0}, Lai/advance/sdk/global/iqa/a;-><init>(Lai/advance/sdk/global/iqa/c;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v1}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->setOnSizeChangedListener(Lai/advance/sdk/global/iqa/lib/GlobalIQAView$c;)V

    .line 441
    .line 442
    :cond_12
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->getPageId()Ljava/lang/String;

    .line 446
    move-result-object v0

    .line 447
    .line 448
    if-nez v0, :cond_13

    .line 449
    .line 450
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 451
    .line 452
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->getPageId()Ljava/lang/String;

    .line 456
    move-result-object v1

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0, v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->setPageId(Ljava/lang/String;)V

    .line 460
    return-void

    .line 461
    .line 462
    :cond_13
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1, v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->setPageId(Ljava/lang/String;)V

    .line 466
    return-void
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
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
.end method

.method public final C()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 3
    .line 4
    sget v1, Lai/advance/sdk/global/iqa/R$id;->back_view_iqa_activity:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    .line 13
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->h:Landroid/widget/ImageView;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->j:Landroid/widget/TextView;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->k:Landroid/widget/TextView;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->d:Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    return-void
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
.end method

.method public final D()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    const/16 v1, 0x700

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 16
    .line 17
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v1, 0x22

    .line 20
    .line 21
    if-ge v0, v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 32
    .line 33
    :cond_0
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 34
    .line 35
    sget v2, Lai/advance/sdk/global/iqa/R$id;->root_view_iqa_activity:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 42
    .line 43
    sget v3, Lai/advance/sdk/global/iqa/R$id;->status_bar_iqa_activity:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    new-instance v3, Lai/advance/sdk/global/iqa/b;

    .line 50
    .line 51
    .line 52
    invoke-direct {v3, p0, v1, v2}, Lai/advance/sdk/global/iqa/b;-><init>(Lai/advance/sdk/global/iqa/c;Landroid/view/View;Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v3}, Landroidx/core/view/ViewCompat;->setOnApplyWindowInsetsListener(Landroid/view/View;Landroidx/core/view/OnApplyWindowInsetsListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 59
    move-result v2

    .line 60
    .line 61
    or-int/lit16 v3, v2, 0x2000

    .line 62
    .line 63
    const/16 v4, 0x1a

    .line 64
    .line 65
    if-lt v0, v4, :cond_1

    .line 66
    .line 67
    or-int/lit16 v3, v2, 0x2010

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 71
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method public E()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/c;->s(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/c;->q(I)V

    .line 8
    .line 9
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->n:Landroid/widget/TextView;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 15
    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->h:Landroid/widget/ImageView;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 27
    .line 28
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->j:Landroid/widget/TextView;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->k:Landroid/widget/TextView;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    return-void
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
.end method

.method public F()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/c;->q(I)V

    .line 5
    .line 6
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->n:Landroid/widget/TextView;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->u()Ljava/lang/CharSequence;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 25
    .line 26
    sget v2, Lai/advance/sdk/global/iqa/R$string;->iqa_take_photo_tips:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    :goto_0
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 38
    .line 39
    iget-object v1, v1, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getTakePhotoTipViewBackgroundColor()Ljava/lang/Integer;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 50
    .line 51
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 52
    .line 53
    iget-object v2, v2, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getTakePhotoTipViewBackgroundColor()Ljava/lang/Integer;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 61
    move-result v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 65
    .line 66
    :cond_1
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->y()Z

    .line 70
    move-result v2

    .line 71
    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    sget v2, Lai/advance/sdk/global/iqa/R$drawable;->iqa_take_photo_tip:I

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    move v2, v0

    .line 77
    .line 78
    .line 79
    :goto_1
    invoke-virtual {v1, v2, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 80
    .line 81
    :cond_3
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 85
    move-result v1

    .line 86
    .line 87
    if-nez v1, :cond_7

    .line 88
    .line 89
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->u()Ljava/lang/CharSequence;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    if-nez v1, :cond_4

    .line 99
    .line 100
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 101
    .line 102
    sget v2, Lai/advance/sdk/global/iqa/R$string;->iqa_take_photo_tips:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 106
    goto :goto_2

    .line 107
    .line 108
    :cond_4
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    :goto_2
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 114
    .line 115
    iget-object v1, v1, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 116
    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getTakePhotoTipViewBackgroundColor()Ljava/lang/Integer;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 126
    .line 127
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 128
    .line 129
    iget-object v2, v2, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getTakePhotoTipViewBackgroundColor()Ljava/lang/Integer;

    .line 133
    move-result-object v2

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 137
    move-result v2

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 141
    .line 142
    :cond_5
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->y()Z

    .line 146
    move-result v2

    .line 147
    .line 148
    if-eqz v2, :cond_6

    .line 149
    .line 150
    sget v2, Lai/advance/sdk/global/iqa/R$drawable;->iqa_take_photo_tip:I

    .line 151
    goto :goto_3

    .line 152
    :cond_6
    move v2, v0

    .line 153
    .line 154
    .line 155
    :goto_3
    invoke-virtual {v1, v2, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 156
    .line 157
    :cond_7
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->h:Landroid/widget/ImageView;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 161
    .line 162
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->j:Landroid/widget/TextView;

    .line 163
    .line 164
    const/16 v1, 0x8

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 168
    .line 169
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->k:Landroid/widget/TextView;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->n()V

    .line 176
    return-void
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
.end method

.method public G()V
    .locals 5

    .line 1
    .line 2
    const/16 v0, 0x8

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/c;->s(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/c;->q(I)V

    .line 9
    .line 10
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->n:Landroid/widget/TextView;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 16
    .line 17
    iget-object v1, v1, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    const/4 v1, 0x0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getSpannablePreviewTipOfTakePhoto()Ljava/lang/CharSequence;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    :goto_0
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 36
    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    sget v4, Lai/advance/sdk/global/iqa/R$string;->iqa_take_photo_ensure:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(I)V

    .line 43
    goto :goto_1

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    :goto_1
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->y()Z

    .line 52
    move-result v4

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    sget v4, Lai/advance/sdk/global/iqa/R$drawable;->iqa_icon_info_normal:I

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move v4, v3

    .line 59
    .line 60
    .line 61
    :goto_2
    invoke-virtual {v2, v4, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 62
    .line 63
    :cond_3
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 67
    move-result v2

    .line 68
    .line 69
    if-nez v2, :cond_6

    .line 70
    .line 71
    if-nez v1, :cond_4

    .line 72
    .line 73
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 74
    .line 75
    sget v2, Lai/advance/sdk/global/iqa/R$string;->iqa_take_photo_ensure:I

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 79
    goto :goto_3

    .line 80
    .line 81
    :cond_4
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    :goto_3
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 87
    .line 88
    sget v2, Lai/advance/sdk/global/iqa/R$drawable;->iqa_land_black_tips:I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 92
    .line 93
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->y()Z

    .line 97
    move-result v2

    .line 98
    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    sget v2, Lai/advance/sdk/global/iqa/R$drawable;->iqa_icon_info_normal:I

    .line 102
    goto :goto_4

    .line 103
    :cond_5
    move v2, v3

    .line 104
    .line 105
    .line 106
    :goto_4
    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 107
    .line 108
    :cond_6
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->h:Landroid/widget/ImageView;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 112
    .line 113
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->j:Landroid/widget/TextView;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 117
    .line 118
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->k:Landroid/widget/TextView;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 122
    return-void
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
.end method

.method public H()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->t:Landroid/app/ProgressDialog;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 6
    return-void
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
.end method

.method public I()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->l:Landroid/content/res/Resources;

    .line 11
    .line 12
    sget v2, Lai/advance/sdk/global/iqa/R$string;->iqa_scan_successfully:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    sget v0, Lai/advance/sdk/global/iqa/R$drawable;->iqa_scan_successfully:I

    .line 22
    .line 23
    sget v1, Lai/advance/sdk/global/iqa/R$drawable;->iqa_land_green_tips:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Lai/advance/sdk/global/iqa/c;->h(II)V

    .line 27
    return-void
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
.end method

.method public J()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->l:Landroid/content/res/Resources;

    .line 11
    .line 12
    sget v2, Lai/advance/sdk/global/iqa/R$string;->hold_phone:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    sget v0, Lai/advance/sdk/global/iqa/R$drawable;->iqa_scan_processing:I

    .line 22
    .line 23
    sget v1, Lai/advance/sdk/global/iqa/R$drawable;->iqa_land_black_tips:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Lai/advance/sdk/global/iqa/c;->h(II)V

    .line 27
    return-void
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
.end method

.method public K()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->f:Landroid/widget/ImageView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->f:Landroid/widget/ImageView;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 12
    move-result v2

    .line 13
    neg-int v2, v2

    .line 14
    int-to-float v2, v2

    .line 15
    .line 16
    iget-object v3, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    move-result v3

    .line 21
    int-to-float v3, v3

    .line 22
    const/4 v4, 0x2

    .line 23
    .line 24
    new-array v4, v4, [F

    .line 25
    .line 26
    aput v2, v4, v1

    .line 27
    const/4 v1, 0x1

    .line 28
    .line 29
    aput v3, v4, v1

    .line 30
    .line 31
    .line 32
    const-string/jumbo v1, "translationX"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    const-wide/16 v1, 0xfa0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 42
    const/4 v1, -0x1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 49
    .line 50
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->f:Landroid/widget/ImageView;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 54
    return-void
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
.end method

.method public L()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->f:Landroid/widget/ImageView;

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->f:Landroid/widget/ImageView;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    instance-of v1, v0, Landroid/animation/ObjectAnimator;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Landroid/animation/ObjectAnimator;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 22
    :cond_0
    return-void
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
.end method

.method public final synthetic d(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p4}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetTop()I

    .line 4
    move-result p3

    .line 5
    .line 6
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 20
    move-result v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 24
    move-result v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 28
    move-result v3

    .line 29
    .line 30
    .line 31
    invoke-virtual {p4}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetBottom()I

    .line 32
    move-result v4

    .line 33
    add-int/2addr v3, v4

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    goto :goto_1

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 41
    move-result v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 45
    move-result v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p4}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetRight()I

    .line 49
    move-result v2

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 53
    move-result v3

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :goto_1
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    iput p3, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    return-object p4
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
.end method

.method public f()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v0}, Lai/advance/sdk/global/iqa/c;->h(II)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public g(I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->isCountdownTimerVisible()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->g:Landroid/widget/TextView;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->g:Landroid/widget/TextView;

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->g:Landroid/widget/TextView;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 32
    move-result v0

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->g:Landroid/widget/TextView;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string p1, " s"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    :cond_2
    return-void
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
.end method

.method public final h(II)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 12
    .line 13
    iget-object p2, p2, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lai/advance/sdk/global/iqa/lib/UIExtras;->isTipIconVisible()Z

    .line 19
    move-result p2

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    iget-object p2, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v1, p1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 33
    return-void

    .line 34
    .line 35
    :cond_1
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 39
    .line 40
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 44
    return-void
    .line 45
.end method

.method public final synthetic i(IIII)V
    .locals 1

    .line 1
    .line 2
    iget-object p2, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 6
    move-result p2

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    iget-object p2, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 11
    .line 12
    iget-object p2, p2, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getPortraitTipViewBackgrounds()Lai/advance/sdk/global/iqa/lib/TipViewUIElements;

    .line 16
    move-result-object p2

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object p2, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 20
    .line 21
    iget-object p2, p2, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getLandscapeTipViewBackgrounds()Lai/advance/sdk/global/iqa/lib/TipViewUIElements;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    :goto_0
    if-eqz p2, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lai/advance/sdk/global/iqa/lib/TipViewUIElements;->getViewWidthPercentRelativeToCameraView()Ljava/lang/Float;

    .line 31
    move-result-object p3

    .line 32
    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    iget-object p4, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 36
    int-to-float p1, p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    .line 40
    move-result v0

    .line 41
    mul-float/2addr v0, p1

    .line 42
    float-to-int v0, v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setWidth(I)V

    .line 46
    .line 47
    iget-object p4, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    .line 51
    move-result p3

    .line 52
    mul-float/2addr p1, p3

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Lai/advance/sdk/global/iqa/lib/TipViewUIElements;->getAspectRatio()Ljava/lang/Float;

    .line 56
    move-result-object p2

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 60
    move-result p2

    .line 61
    mul-float/2addr p1, p2

    .line 62
    float-to-int p1, p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setHeight(I)V

    .line 66
    :cond_1
    return-void
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
.end method

.method public k(Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;)V
    .locals 3

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_2

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget-object v1, Lai/advance/sdk/global/iqa/c$c;->a:[I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    move-result v2

    .line 16
    .line 17
    aget v1, v1, v2

    .line 18
    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->f()V

    .line 24
    goto :goto_1

    .line 25
    .line 26
    .line 27
    :pswitch_0
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->J()V

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :pswitch_1
    sget v1, Lai/advance/sdk/global/iqa/R$string;->iqa_card_too_glossy:I

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/c;->m(Ljava/lang/String;)V

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :pswitch_2
    sget v1, Lai/advance/sdk/global/iqa/R$string;->iqa_card_occluded:I

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :pswitch_3
    sget v1, Lai/advance/sdk/global/iqa/R$string;->iqa_min_gap_ratio:I

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :pswitch_4
    sget v1, Lai/advance/sdk/global/iqa/R$string;->too_small_card:I

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :pswitch_5
    sget v1, Lai/advance/sdk/global/iqa/R$string;->iqa_card_poor_quality:I

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :pswitch_6
    sget v1, Lai/advance/sdk/global/iqa/R$string;->no_card:I

    .line 53
    goto :goto_0

    .line 54
    .line 55
    :goto_1
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 56
    .line 57
    iget-object v1, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 58
    .line 59
    if-nez v1, :cond_1

    .line 60
    :goto_2
    return-void

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 64
    move-result v0

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 69
    .line 70
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getPortraitTipViewBackgrounds()Lai/advance/sdk/global/iqa/lib/TipViewUIElements;

    .line 74
    move-result-object v0

    .line 75
    goto :goto_3

    .line 76
    .line 77
    :cond_2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 78
    .line 79
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getLandscapeTipViewBackgrounds()Lai/advance/sdk/global/iqa/lib/TipViewUIElements;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    :goto_3
    invoke-static {v0, p1}, Lai/advance/sdk/global/iqa/c;->e(Lai/advance/sdk/global/iqa/lib/TipViewUIElements;Lai/advance/sdk/global/iqa/lib/code/ImageWarnCode;)Ljava/lang/Integer;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    if-nez p1, :cond_3

    .line 90
    .line 91
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 92
    const/4 v0, 0x0

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 96
    return-void

    .line 97
    .line 98
    :cond_3
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 102
    move-result p1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 106
    return-void

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public l(Ljava/lang/CharSequence;I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->d:Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->k(Ljava/lang/CharSequence;I)V

    .line 6
    return-void
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
.end method

.method public m(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    sget p1, Lai/advance/sdk/global/iqa/R$drawable;->iqa_scan_warning:I

    .line 14
    .line 15
    sget v0, Lai/advance/sdk/global/iqa/R$drawable;->iqa_land_red_tips:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, v0}, Lai/advance/sdk/global/iqa/c;->h(II)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public n()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->g:Landroid/widget/TextView;

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    return-void
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
.end method

.method public o(I)V
    .locals 5

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->F()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->t()V

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->l:Landroid/content/res/Resources;

    .line 17
    .line 18
    sget v2, Lai/advance/sdk/global/iqa/R$string;->iqa_time_out_tips:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, " "

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string/jumbo p1, "s"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    new-instance v0, Landroid/text/SpannableString;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    .line 51
    .line 52
    iget-object v3, p0, Lai/advance/sdk/global/iqa/c;->l:Landroid/content/res/Resources;

    .line 53
    .line 54
    sget v4, Lai/advance/sdk/global/iqa/R$color;->iqa_round_green:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 58
    move-result v3

    .line 59
    .line 60
    .line 61
    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 65
    move-result v1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 69
    move-result p1

    .line 70
    .line 71
    const/16 v3, 0x21

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2, v1, p1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 75
    .line 76
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->d:Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->a(Ljava/lang/CharSequence;)V

    .line 80
    return-void
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
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 4
    move-result p1

    .line 5
    .line 6
    sget v0, Lai/advance/sdk/global/iqa/R$id;->back_view_iqa_activity:I

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->v:Lai/advance/sdk/global/iqa/e;

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lai/advance/sdk/global/iqa/e;->a()V

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    sget v0, Lai/advance/sdk/global/iqa/R$id;->take_photo_view_iqa_activity:I

    .line 17
    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->r()V

    .line 22
    .line 23
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->v:Lai/advance/sdk/global/iqa/e;

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Lai/advance/sdk/global/iqa/e;->d()V

    .line 27
    return-void

    .line 28
    .line 29
    :cond_1
    sget v0, Lai/advance/sdk/global/iqa/R$id;->retake_view_iqa_activity:I

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->v:Lai/advance/sdk/global/iqa/e;

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lai/advance/sdk/global/iqa/e;->b()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->F()V

    .line 40
    return-void

    .line 41
    .line 42
    :cond_2
    sget v0, Lai/advance/sdk/global/iqa/R$id;->continue_view_iqa_activity:I

    .line 43
    .line 44
    if-ne p1, v0, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->v:Lai/advance/sdk/global/iqa/e;

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Lai/advance/sdk/global/iqa/e;->c()V

    .line 50
    return-void

    .line 51
    .line 52
    :cond_3
    sget v0, Lai/advance/sdk/global/iqa/R$id;->root_view_iqa_activity:I

    .line 53
    .line 54
    if-ne p1, v0, :cond_4

    .line 55
    .line 56
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->d()V

    .line 60
    :cond_4
    return-void
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
.end method

.method public p()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->t:Landroid/app/ProgressDialog;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    return-void
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
.end method

.method public final q(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->isFlipCameraBtnVisible()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->p:Landroid/view/View;

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->p:Landroid/view/View;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    return-void
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
.end method

.method public r()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->h:Landroid/widget/ImageView;

    .line 3
    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    .line 9
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final s(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->isLightBtnVisible()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lai/advance/sdk/global/iqa/c;->o:Landroid/widget/ImageView;

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->o:Landroid/widget/ImageView;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 26
    return-void
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
.end method

.method public t()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->d:Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->f()V

    .line 6
    return-void
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
.end method

.method public final u()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->getSpannableTipTextOfTakePhoto()Ljava/lang/CharSequence;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final v()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 3
    .line 4
    sget v1, Lai/advance/sdk/global/iqa/R$id;->card_side_desc_iqa_activity:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    iget-object v2, p0, Lai/advance/sdk/global/iqa/c;->l:Landroid/content/res/Resources;

    .line 26
    .line 27
    iget-object v3, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isFrontCardSide()Z

    .line 31
    move-result v3

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    sget v3, Lai/advance/sdk/global/iqa/R$string;->iqa_front_side_of_document:I

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_0
    sget v3, Lai/advance/sdk/global/iqa/R$string;->iqa_back_side_of_document:I

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "\n"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget-object v3, p0, Lai/advance/sdk/global/iqa/c;->l:Landroid/content/res/Resources;

    .line 53
    .line 54
    sget v4, Lai/advance/sdk/global/iqa/R$string;->iqa_top_desc:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 58
    move-result-object v3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    new-instance v3, Landroid/text/SpannableString;

    .line 68
    .line 69
    .line 70
    invoke-direct {v3, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 74
    move-result v1

    .line 75
    .line 76
    new-instance v2, Landroid/text/style/StyleSpan;

    .line 77
    const/4 v4, 0x1

    .line 78
    .line 79
    .line 80
    invoke-direct {v2, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 81
    const/4 v4, 0x0

    .line 82
    .line 83
    const/16 v5, 0x21

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v2, v4, v1, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 87
    .line 88
    new-instance v2, Landroid/text/style/RelativeSizeSpan;

    .line 89
    .line 90
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 91
    .line 92
    .line 93
    invoke-direct {v2, v6}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v2, v4, v1, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    return-void

    .line 101
    .line 102
    :cond_1
    sget v1, Lai/advance/sdk/global/iqa/R$string;->iqa_top_desc:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 106
    return-void
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
.end method

.method public final w()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 3
    .line 4
    sget v1, Lai/advance/sdk/global/iqa/R$id;->light_view_iqa_activity:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Landroid/widget/ImageView;

    .line 11
    .line 12
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->o:Landroid/widget/ImageView;

    .line 13
    .line 14
    new-instance v1, Lai/advance/sdk/global/iqa/c$a;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0}, Lai/advance/sdk/global/iqa/c$a;-><init>(Lai/advance/sdk/global/iqa/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    .line 22
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->h()Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isFrontCamera()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    const/4 v0, 0x0

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    const/16 v0, 0x8

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p0, v0}, Lai/advance/sdk/global/iqa/c;->s(I)V

    .line 44
    .line 45
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 46
    .line 47
    sget v1, Lai/advance/sdk/global/iqa/R$id;->flip_camera_view_iqa_activity:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->p:Landroid/view/View;

    .line 54
    .line 55
    new-instance v1, Lai/advance/sdk/global/iqa/c$b;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, p0}, Lai/advance/sdk/global/iqa/c$b;-><init>(Lai/advance/sdk/global/iqa/c;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    return-void
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
.end method

.method public final x()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 3
    .line 4
    sget v1, Lai/advance/sdk/global/iqa/R$id;->camera_view_iqa_activity:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 11
    .line 12
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 13
    .line 14
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 15
    .line 16
    sget v1, Lai/advance/sdk/global/iqa/R$id;->root_view_iqa_activity:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;

    .line 23
    .line 24
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->d:Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;

    .line 25
    .line 26
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 27
    .line 28
    sget v1, Lai/advance/sdk/global/iqa/R$id;->tip_view_iqa_activity:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Landroid/widget/TextView;

    .line 35
    .line 36
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->e:Landroid/widget/TextView;

    .line 37
    .line 38
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 39
    .line 40
    sget v1, Lai/advance/sdk/global/iqa/R$id;->scan_view_iqa_activity:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    check-cast v0, Landroid/widget/ImageView;

    .line 47
    .line 48
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->f:Landroid/widget/ImageView;

    .line 49
    .line 50
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 51
    .line 52
    sget v1, Lai/advance/sdk/global/iqa/R$id;->countdown_iqa_activity:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    check-cast v0, Landroid/widget/TextView;

    .line 59
    .line 60
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->g:Landroid/widget/TextView;

    .line 61
    .line 62
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 63
    .line 64
    sget v1, Lai/advance/sdk/global/iqa/R$id;->take_photo_view_iqa_activity:I

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    check-cast v0, Landroid/widget/ImageView;

    .line 71
    .line 72
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->h:Landroid/widget/ImageView;

    .line 73
    .line 74
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 75
    .line 76
    sget v1, Lai/advance/sdk/global/iqa/R$id;->take_photo_tip_view_iqa_activity:I

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    check-cast v0, Landroid/widget/TextView;

    .line 83
    .line 84
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 85
    .line 86
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 87
    .line 88
    sget v1, Lai/advance/sdk/global/iqa/R$id;->retake_view_iqa_activity:I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    check-cast v0, Landroid/widget/TextView;

    .line 95
    .line 96
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->j:Landroid/widget/TextView;

    .line 97
    .line 98
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 99
    .line 100
    sget v1, Lai/advance/sdk/global/iqa/R$id;->continue_view_iqa_activity:I

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    check-cast v0, Landroid/widget/TextView;

    .line 107
    .line 108
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->k:Landroid/widget/TextView;

    .line 109
    .line 110
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 111
    .line 112
    sget v1, Lai/advance/sdk/global/iqa/R$id;->card_side_desc_iqa_activity:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    check-cast v0, Landroid/widget/TextView;

    .line 119
    .line 120
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->n:Landroid/widget/TextView;

    .line 121
    .line 122
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 123
    .line 124
    sget v1, Lai/advance/sdk/global/iqa/R$raw;->global_iqa_voice:I

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->setVoiceRawId(I)V

    .line 128
    .line 129
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 130
    .line 131
    sget v1, Lai/advance/sdk/global/iqa/R$id;->full_bg_iqa_view_activity:I

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    check-cast v0, Landroid/widget/ImageView;

    .line 138
    .line 139
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->r:Landroid/widget/ImageView;

    .line 140
    .line 141
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 142
    .line 143
    sget v1, Lai/advance/sdk/global/iqa/R$id;->title_view_iqa_activity:I

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    check-cast v0, Landroid/widget/TextView;

    .line 150
    .line 151
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->q:Landroid/widget/TextView;

    .line 152
    .line 153
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 154
    .line 155
    sget v1, Lai/advance/sdk/global/iqa/R$id;->title_bg_view_iqa_activity:I

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    check-cast v0, Landroid/widget/ImageView;

    .line 162
    .line 163
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->u:Landroid/widget/ImageView;

    .line 164
    .line 165
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 166
    .line 167
    sget v1, Lai/advance/sdk/global/iqa/R$id;->frame_for_android19_iqa_activity:I

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 171
    move-result-object v0

    .line 172
    .line 173
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->s:Landroid/view/View;

    .line 174
    .line 175
    new-instance v0, Landroid/app/ProgressDialog;

    .line 176
    .line 177
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 178
    .line 179
    .line 180
    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 181
    .line 182
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->t:Landroid/app/ProgressDialog;

    .line 183
    .line 184
    iget-object v1, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    sget v2, Lai/advance/sdk/global/iqa/R$string;->iqa_auth_check:I

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 194
    move-result-object v1

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->t:Landroid/app/ProgressDialog;

    .line 200
    const/4 v1, 0x0

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 204
    .line 205
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->canRetry()Z

    .line 209
    move-result v0

    .line 210
    .line 211
    if-nez v0, :cond_0

    .line 212
    .line 213
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->h:Landroid/widget/ImageView;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 217
    .line 218
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->i:Landroid/widget/TextView;

    .line 219
    .line 220
    if-eqz v0, :cond_0

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 224
    .line 225
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/IQAPageState;->isPortrait()Z

    .line 229
    move-result v0

    .line 230
    .line 231
    if-nez v0, :cond_1

    .line 232
    .line 233
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->k:Landroid/widget/TextView;

    .line 234
    .line 235
    sget v2, Lai/advance/sdk/global/iqa/R$drawable;->iqa_land_confirm:I

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v1, v2, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 239
    .line 240
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->j:Landroid/widget/TextView;

    .line 241
    .line 242
    sget v2, Lai/advance/sdk/global/iqa/R$drawable;->iqa_land_retake:I

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1, v2, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 246
    .line 247
    .line 248
    :cond_1
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->w()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/c;->v()V

    .line 252
    return-void
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
.end method

.method public final y()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->m:Lai/advance/sdk/global/iqa/lib/IQAPageState;

    .line 3
    .line 4
    iget-object v0, v0, Lai/advance/sdk/global/iqa/lib/IQAPageState;->uiExtras:Lai/advance/sdk/global/iqa/lib/UIExtras;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/UIExtras;->isTakePhotoTipViewLeftIconVisible()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
.end method

.method public z()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->t:Landroid/app/ProgressDialog;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->t:Landroid/app/ProgressDialog;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->c:Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;->e()V

    .line 19
    .line 20
    iget-object v0, p0, Lai/advance/sdk/global/iqa/c;->d:Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->f()V

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->b:Lai/advance/sdk/global/iqa/GlobalIQAActivity;

    .line 27
    .line 28
    iput-object v0, p0, Lai/advance/sdk/global/iqa/c;->v:Lai/advance/sdk/global/iqa/e;

    .line 29
    return-void
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
.end method
