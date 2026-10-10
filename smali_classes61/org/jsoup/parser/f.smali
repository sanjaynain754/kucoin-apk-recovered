.class public Lorg/jsoup/parser/f;
.super Ljava/lang/Object;
.source "Tag.java"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/jsoup/parser/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:[Ljava/lang/String;

.field public static final m:[Ljava/lang/String;

.field public static final n:[Ljava/lang/String;

.field public static final o:[Ljava/lang/String;

.field public static final p:[Ljava/lang/String;

.field public static final q:[Ljava/lang/String;

.field public static final r:[Ljava/lang/String;


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 67

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lorg/jsoup/parser/f;->k:Ljava/util/Map;

    .line 8
    .line 9
    const-string v63, "math"

    .line 10
    .line 11
    const-string v64, "center"

    .line 12
    .line 13
    const-string v1, "html"

    .line 14
    .line 15
    const-string v2, "head"

    .line 16
    .line 17
    const-string v3, "body"

    .line 18
    .line 19
    const-string v4, "frameset"

    .line 20
    .line 21
    const-string v5, "script"

    .line 22
    .line 23
    const-string v6, "noscript"

    .line 24
    .line 25
    .line 26
    const-string/jumbo v7, "style"

    .line 27
    .line 28
    const-string v8, "meta"

    .line 29
    .line 30
    const-string v9, "link"

    .line 31
    .line 32
    .line 33
    const-string/jumbo v10, "title"

    .line 34
    .line 35
    const-string v11, "frame"

    .line 36
    .line 37
    const-string v12, "noframes"

    .line 38
    .line 39
    const-string v13, "section"

    .line 40
    .line 41
    const-string v14, "nav"

    .line 42
    .line 43
    const-string v15, "aside"

    .line 44
    .line 45
    const-string v16, "hgroup"

    .line 46
    .line 47
    const-string v17, "header"

    .line 48
    .line 49
    const-string v18, "footer"

    .line 50
    .line 51
    const-string v19, "p"

    .line 52
    .line 53
    const-string v20, "h1"

    .line 54
    .line 55
    const-string v21, "h2"

    .line 56
    .line 57
    const-string v22, "h3"

    .line 58
    .line 59
    const-string v23, "h4"

    .line 60
    .line 61
    const-string v24, "h5"

    .line 62
    .line 63
    const-string v25, "h6"

    .line 64
    .line 65
    .line 66
    const-string/jumbo v26, "ul"

    .line 67
    .line 68
    const-string v27, "ol"

    .line 69
    .line 70
    const-string v28, "pre"

    .line 71
    .line 72
    const-string v29, "div"

    .line 73
    .line 74
    const-string v30, "blockquote"

    .line 75
    .line 76
    const-string v31, "hr"

    .line 77
    .line 78
    const-string v32, "address"

    .line 79
    .line 80
    const-string v33, "figure"

    .line 81
    .line 82
    const-string v34, "figcaption"

    .line 83
    .line 84
    const-string v35, "form"

    .line 85
    .line 86
    const-string v36, "fieldset"

    .line 87
    .line 88
    const-string v37, "ins"

    .line 89
    .line 90
    const-string v38, "del"

    .line 91
    .line 92
    const-string v39, "dl"

    .line 93
    .line 94
    const-string v40, "dt"

    .line 95
    .line 96
    const-string v41, "dd"

    .line 97
    .line 98
    const-string v42, "li"

    .line 99
    .line 100
    .line 101
    const-string/jumbo v43, "table"

    .line 102
    .line 103
    const-string v44, "caption"

    .line 104
    .line 105
    .line 106
    const-string/jumbo v45, "thead"

    .line 107
    .line 108
    .line 109
    const-string/jumbo v46, "tfoot"

    .line 110
    .line 111
    .line 112
    const-string/jumbo v47, "tbody"

    .line 113
    .line 114
    const-string v48, "colgroup"

    .line 115
    .line 116
    const-string v49, "col"

    .line 117
    .line 118
    .line 119
    const-string/jumbo v50, "tr"

    .line 120
    .line 121
    .line 122
    const-string/jumbo v51, "th"

    .line 123
    .line 124
    .line 125
    const-string/jumbo v52, "td"

    .line 126
    .line 127
    .line 128
    const-string/jumbo v53, "video"

    .line 129
    .line 130
    const-string v54, "audio"

    .line 131
    .line 132
    const-string v55, "canvas"

    .line 133
    .line 134
    const-string v56, "details"

    .line 135
    .line 136
    const-string v57, "menu"

    .line 137
    .line 138
    const-string v58, "plaintext"

    .line 139
    .line 140
    .line 141
    const-string/jumbo v59, "template"

    .line 142
    .line 143
    const-string v60, "article"

    .line 144
    .line 145
    const-string v61, "main"

    .line 146
    .line 147
    .line 148
    const-string/jumbo v62, "svg"

    .line 149
    .line 150
    .line 151
    filled-new-array/range {v1 .. v64}, [Ljava/lang/String;

    .line 152
    move-result-object v0

    .line 153
    .line 154
    sput-object v0, Lorg/jsoup/parser/f;->l:[Ljava/lang/String;

    .line 155
    .line 156
    const-string v65, "bdi"

    .line 157
    .line 158
    const-string v66, "s"

    .line 159
    .line 160
    const-string v1, "object"

    .line 161
    .line 162
    const-string v2, "base"

    .line 163
    .line 164
    const-string v3, "font"

    .line 165
    .line 166
    .line 167
    const-string/jumbo v4, "tt"

    .line 168
    .line 169
    const-string v5, "i"

    .line 170
    .line 171
    const-string v6, "b"

    .line 172
    .line 173
    .line 174
    const-string/jumbo v7, "u"

    .line 175
    .line 176
    const-string v8, "big"

    .line 177
    .line 178
    .line 179
    const-string/jumbo v9, "small"

    .line 180
    .line 181
    const-string v10, "em"

    .line 182
    .line 183
    .line 184
    const-string/jumbo v11, "strong"

    .line 185
    .line 186
    const-string v12, "dfn"

    .line 187
    .line 188
    const-string v13, "code"

    .line 189
    .line 190
    const-string v14, "samp"

    .line 191
    .line 192
    const-string v15, "kbd"

    .line 193
    .line 194
    .line 195
    const-string/jumbo v16, "var"

    .line 196
    .line 197
    const-string v17, "cite"

    .line 198
    .line 199
    const-string v18, "abbr"

    .line 200
    .line 201
    .line 202
    const-string/jumbo v19, "time"

    .line 203
    .line 204
    const-string v20, "acronym"

    .line 205
    .line 206
    const-string v21, "mark"

    .line 207
    .line 208
    const-string v22, "ruby"

    .line 209
    .line 210
    const-string v23, "rt"

    .line 211
    .line 212
    const-string v24, "rp"

    .line 213
    .line 214
    const-string v25, "a"

    .line 215
    .line 216
    const-string v26, "img"

    .line 217
    .line 218
    const-string v27, "br"

    .line 219
    .line 220
    .line 221
    const-string/jumbo v28, "wbr"

    .line 222
    .line 223
    const-string v29, "map"

    .line 224
    .line 225
    const-string v30, "q"

    .line 226
    .line 227
    .line 228
    const-string/jumbo v31, "sub"

    .line 229
    .line 230
    .line 231
    const-string/jumbo v32, "sup"

    .line 232
    .line 233
    const-string v33, "bdo"

    .line 234
    .line 235
    const-string v34, "iframe"

    .line 236
    .line 237
    const-string v35, "embed"

    .line 238
    .line 239
    .line 240
    const-string/jumbo v36, "span"

    .line 241
    .line 242
    const-string v37, "input"

    .line 243
    .line 244
    const-string v38, "select"

    .line 245
    .line 246
    .line 247
    const-string/jumbo v39, "textarea"

    .line 248
    .line 249
    const-string v40, "label"

    .line 250
    .line 251
    const-string v41, "button"

    .line 252
    .line 253
    const-string v42, "optgroup"

    .line 254
    .line 255
    const-string v43, "option"

    .line 256
    .line 257
    const-string v44, "legend"

    .line 258
    .line 259
    const-string v45, "datalist"

    .line 260
    .line 261
    const-string v46, "keygen"

    .line 262
    .line 263
    const-string v47, "output"

    .line 264
    .line 265
    const-string v48, "progress"

    .line 266
    .line 267
    const-string v49, "meter"

    .line 268
    .line 269
    const-string v50, "area"

    .line 270
    .line 271
    const-string v51, "param"

    .line 272
    .line 273
    .line 274
    const-string/jumbo v52, "source"

    .line 275
    .line 276
    .line 277
    const-string/jumbo v53, "track"

    .line 278
    .line 279
    .line 280
    const-string/jumbo v54, "summary"

    .line 281
    .line 282
    const-string v55, "command"

    .line 283
    .line 284
    const-string v56, "device"

    .line 285
    .line 286
    const-string v57, "area"

    .line 287
    .line 288
    const-string v58, "basefont"

    .line 289
    .line 290
    const-string v59, "bgsound"

    .line 291
    .line 292
    const-string v60, "menuitem"

    .line 293
    .line 294
    const-string v61, "param"

    .line 295
    .line 296
    .line 297
    const-string/jumbo v62, "source"

    .line 298
    .line 299
    .line 300
    const-string/jumbo v63, "track"

    .line 301
    .line 302
    const-string v64, "data"

    .line 303
    .line 304
    .line 305
    filled-new-array/range {v1 .. v66}, [Ljava/lang/String;

    .line 306
    move-result-object v1

    .line 307
    .line 308
    sput-object v1, Lorg/jsoup/parser/f;->m:[Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    const-string/jumbo v21, "source"

    .line 312
    .line 313
    .line 314
    const-string/jumbo v22, "track"

    .line 315
    .line 316
    const-string v2, "meta"

    .line 317
    .line 318
    const-string v3, "link"

    .line 319
    .line 320
    const-string v4, "base"

    .line 321
    .line 322
    const-string v5, "frame"

    .line 323
    .line 324
    const-string v6, "img"

    .line 325
    .line 326
    const-string v7, "br"

    .line 327
    .line 328
    .line 329
    const-string/jumbo v8, "wbr"

    .line 330
    .line 331
    const-string v9, "embed"

    .line 332
    .line 333
    const-string v10, "hr"

    .line 334
    .line 335
    const-string v11, "input"

    .line 336
    .line 337
    const-string v12, "keygen"

    .line 338
    .line 339
    const-string v13, "col"

    .line 340
    .line 341
    const-string v14, "command"

    .line 342
    .line 343
    const-string v15, "device"

    .line 344
    .line 345
    const-string v16, "area"

    .line 346
    .line 347
    const-string v17, "basefont"

    .line 348
    .line 349
    const-string v18, "bgsound"

    .line 350
    .line 351
    const-string v19, "menuitem"

    .line 352
    .line 353
    const-string v20, "param"

    .line 354
    .line 355
    .line 356
    filled-new-array/range {v2 .. v22}, [Ljava/lang/String;

    .line 357
    move-result-object v1

    .line 358
    .line 359
    sput-object v1, Lorg/jsoup/parser/f;->n:[Ljava/lang/String;

    .line 360
    .line 361
    const-string v19, "del"

    .line 362
    .line 363
    const-string v20, "s"

    .line 364
    .line 365
    .line 366
    const-string/jumbo v2, "title"

    .line 367
    .line 368
    const-string v3, "a"

    .line 369
    .line 370
    const-string v4, "p"

    .line 371
    .line 372
    const-string v5, "h1"

    .line 373
    .line 374
    const-string v6, "h2"

    .line 375
    .line 376
    const-string v7, "h3"

    .line 377
    .line 378
    const-string v8, "h4"

    .line 379
    .line 380
    const-string v9, "h5"

    .line 381
    .line 382
    const-string v10, "h6"

    .line 383
    .line 384
    const-string v11, "pre"

    .line 385
    .line 386
    const-string v12, "address"

    .line 387
    .line 388
    const-string v13, "li"

    .line 389
    .line 390
    .line 391
    const-string/jumbo v14, "th"

    .line 392
    .line 393
    .line 394
    const-string/jumbo v15, "td"

    .line 395
    .line 396
    const-string v16, "script"

    .line 397
    .line 398
    .line 399
    const-string/jumbo v17, "style"

    .line 400
    .line 401
    const-string v18, "ins"

    .line 402
    .line 403
    .line 404
    filled-new-array/range {v2 .. v20}, [Ljava/lang/String;

    .line 405
    move-result-object v1

    .line 406
    .line 407
    sput-object v1, Lorg/jsoup/parser/f;->o:[Ljava/lang/String;

    .line 408
    .line 409
    const-string v1, "pre"

    .line 410
    .line 411
    const-string v2, "plaintext"

    .line 412
    .line 413
    .line 414
    const-string/jumbo v3, "title"

    .line 415
    .line 416
    .line 417
    const-string/jumbo v4, "textarea"

    .line 418
    .line 419
    .line 420
    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/String;

    .line 421
    move-result-object v1

    .line 422
    .line 423
    sput-object v1, Lorg/jsoup/parser/f;->p:[Ljava/lang/String;

    .line 424
    .line 425
    const-string v11, "select"

    .line 426
    .line 427
    .line 428
    const-string/jumbo v12, "textarea"

    .line 429
    .line 430
    const-string v5, "button"

    .line 431
    .line 432
    const-string v6, "fieldset"

    .line 433
    .line 434
    const-string v7, "input"

    .line 435
    .line 436
    const-string v8, "keygen"

    .line 437
    .line 438
    const-string v9, "object"

    .line 439
    .line 440
    const-string v10, "output"

    .line 441
    .line 442
    .line 443
    filled-new-array/range {v5 .. v12}, [Ljava/lang/String;

    .line 444
    move-result-object v1

    .line 445
    .line 446
    sput-object v1, Lorg/jsoup/parser/f;->q:[Ljava/lang/String;

    .line 447
    .line 448
    const-string v1, "object"

    .line 449
    .line 450
    const-string v2, "select"

    .line 451
    .line 452
    const-string v3, "input"

    .line 453
    .line 454
    const-string v5, "keygen"

    .line 455
    .line 456
    .line 457
    filled-new-array {v3, v5, v1, v2, v4}, [Ljava/lang/String;

    .line 458
    move-result-object v1

    .line 459
    .line 460
    sput-object v1, Lorg/jsoup/parser/f;->r:[Ljava/lang/String;

    .line 461
    array-length v1, v0

    .line 462
    const/4 v2, 0x0

    .line 463
    move v3, v2

    .line 464
    .line 465
    :goto_0
    if-ge v3, v1, :cond_0

    .line 466
    .line 467
    aget-object v4, v0, v3

    .line 468
    .line 469
    new-instance v5, Lorg/jsoup/parser/f;

    .line 470
    .line 471
    .line 472
    invoke-direct {v5, v4}, Lorg/jsoup/parser/f;-><init>(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    invoke-static {v5}, Lorg/jsoup/parser/f;->l(Lorg/jsoup/parser/f;)V

    .line 476
    .line 477
    add-int/lit8 v3, v3, 0x1

    .line 478
    goto :goto_0

    .line 479
    .line 480
    :cond_0
    sget-object v0, Lorg/jsoup/parser/f;->m:[Ljava/lang/String;

    .line 481
    array-length v1, v0

    .line 482
    move v3, v2

    .line 483
    .line 484
    :goto_1
    if-ge v3, v1, :cond_1

    .line 485
    .line 486
    aget-object v4, v0, v3

    .line 487
    .line 488
    new-instance v5, Lorg/jsoup/parser/f;

    .line 489
    .line 490
    .line 491
    invoke-direct {v5, v4}, Lorg/jsoup/parser/f;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    iput-boolean v2, v5, Lorg/jsoup/parser/f;->d:Z

    .line 494
    .line 495
    iput-boolean v2, v5, Lorg/jsoup/parser/f;->e:Z

    .line 496
    .line 497
    .line 498
    invoke-static {v5}, Lorg/jsoup/parser/f;->l(Lorg/jsoup/parser/f;)V

    .line 499
    .line 500
    add-int/lit8 v3, v3, 0x1

    .line 501
    goto :goto_1

    .line 502
    .line 503
    :cond_1
    sget-object v0, Lorg/jsoup/parser/f;->n:[Ljava/lang/String;

    .line 504
    array-length v1, v0

    .line 505
    move v3, v2

    .line 506
    :goto_2
    const/4 v4, 0x1

    .line 507
    .line 508
    if-ge v3, v1, :cond_2

    .line 509
    .line 510
    aget-object v5, v0, v3

    .line 511
    .line 512
    sget-object v6, Lorg/jsoup/parser/f;->k:Ljava/util/Map;

    .line 513
    .line 514
    .line 515
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    move-result-object v5

    .line 517
    .line 518
    check-cast v5, Lorg/jsoup/parser/f;

    .line 519
    .line 520
    .line 521
    invoke-static {v5}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 522
    .line 523
    iput-boolean v4, v5, Lorg/jsoup/parser/f;->f:Z

    .line 524
    .line 525
    add-int/lit8 v3, v3, 0x1

    .line 526
    goto :goto_2

    .line 527
    .line 528
    :cond_2
    sget-object v0, Lorg/jsoup/parser/f;->o:[Ljava/lang/String;

    .line 529
    array-length v1, v0

    .line 530
    move v3, v2

    .line 531
    .line 532
    :goto_3
    if-ge v3, v1, :cond_3

    .line 533
    .line 534
    aget-object v5, v0, v3

    .line 535
    .line 536
    sget-object v6, Lorg/jsoup/parser/f;->k:Ljava/util/Map;

    .line 537
    .line 538
    .line 539
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    move-result-object v5

    .line 541
    .line 542
    check-cast v5, Lorg/jsoup/parser/f;

    .line 543
    .line 544
    .line 545
    invoke-static {v5}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 546
    .line 547
    iput-boolean v2, v5, Lorg/jsoup/parser/f;->e:Z

    .line 548
    .line 549
    add-int/lit8 v3, v3, 0x1

    .line 550
    goto :goto_3

    .line 551
    .line 552
    :cond_3
    sget-object v0, Lorg/jsoup/parser/f;->p:[Ljava/lang/String;

    .line 553
    array-length v1, v0

    .line 554
    move v3, v2

    .line 555
    .line 556
    :goto_4
    if-ge v3, v1, :cond_4

    .line 557
    .line 558
    aget-object v5, v0, v3

    .line 559
    .line 560
    sget-object v6, Lorg/jsoup/parser/f;->k:Ljava/util/Map;

    .line 561
    .line 562
    .line 563
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    move-result-object v5

    .line 565
    .line 566
    check-cast v5, Lorg/jsoup/parser/f;

    .line 567
    .line 568
    .line 569
    invoke-static {v5}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 570
    .line 571
    iput-boolean v4, v5, Lorg/jsoup/parser/f;->h:Z

    .line 572
    .line 573
    add-int/lit8 v3, v3, 0x1

    .line 574
    goto :goto_4

    .line 575
    .line 576
    :cond_4
    sget-object v0, Lorg/jsoup/parser/f;->q:[Ljava/lang/String;

    .line 577
    array-length v1, v0

    .line 578
    move v3, v2

    .line 579
    .line 580
    :goto_5
    if-ge v3, v1, :cond_5

    .line 581
    .line 582
    aget-object v5, v0, v3

    .line 583
    .line 584
    sget-object v6, Lorg/jsoup/parser/f;->k:Ljava/util/Map;

    .line 585
    .line 586
    .line 587
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    move-result-object v5

    .line 589
    .line 590
    check-cast v5, Lorg/jsoup/parser/f;

    .line 591
    .line 592
    .line 593
    invoke-static {v5}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 594
    .line 595
    iput-boolean v4, v5, Lorg/jsoup/parser/f;->i:Z

    .line 596
    .line 597
    add-int/lit8 v3, v3, 0x1

    .line 598
    goto :goto_5

    .line 599
    .line 600
    :cond_5
    sget-object v0, Lorg/jsoup/parser/f;->r:[Ljava/lang/String;

    .line 601
    array-length v1, v0

    .line 602
    .line 603
    :goto_6
    if-ge v2, v1, :cond_6

    .line 604
    .line 605
    aget-object v3, v0, v2

    .line 606
    .line 607
    sget-object v5, Lorg/jsoup/parser/f;->k:Ljava/util/Map;

    .line 608
    .line 609
    .line 610
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    move-result-object v3

    .line 612
    .line 613
    check-cast v3, Lorg/jsoup/parser/f;

    .line 614
    .line 615
    .line 616
    invoke-static {v3}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 617
    .line 618
    iput-boolean v4, v3, Lorg/jsoup/parser/f;->j:Z

    .line 619
    .line 620
    add-int/lit8 v2, v2, 0x1

    .line 621
    goto :goto_6

    .line 622
    :cond_6
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lorg/jsoup/parser/f;->d:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lorg/jsoup/parser/f;->e:Z

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-boolean v0, p0, Lorg/jsoup/parser/f;->f:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lorg/jsoup/parser/f;->g:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lorg/jsoup/parser/f;->h:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lorg/jsoup/parser/f;->i:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lorg/jsoup/parser/f;->j:Z

    .line 20
    .line 21
    iput-object p1, p0, Lorg/jsoup/parser/f;->b:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Loh0/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    iput-object p1, p0, Lorg/jsoup/parser/f;->c:Ljava/lang/String;

    .line 28
    return-void
    .line 29
    .line 30
.end method

.method public static l(Lorg/jsoup/parser/f;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lorg/jsoup/parser/f;->k:Ljava/util/Map;

    .line 3
    .line 4
    iget-object v1, p0, Lorg/jsoup/parser/f;->b:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public static n(Ljava/lang/String;)Lorg/jsoup/parser/f;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lorg/jsoup/parser/d;->d:Lorg/jsoup/parser/d;

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lorg/jsoup/parser/f;->o(Ljava/lang/String;Lorg/jsoup/parser/d;)Lorg/jsoup/parser/f;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.end method

.method public static o(Ljava/lang/String;Lorg/jsoup/parser/d;)Lorg/jsoup/parser/f;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lnh0/b;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    sget-object v0, Lorg/jsoup/parser/f;->k:Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    check-cast v1, Lorg/jsoup/parser/f;

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lorg/jsoup/parser/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lnh0/b;->g(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Loh0/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    check-cast v0, Lorg/jsoup/parser/f;

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    new-instance p1, Lorg/jsoup/parser/f;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, p0}, Lorg/jsoup/parser/f;-><init>(Ljava/lang/String;)V

    .line 38
    const/4 p0, 0x0

    .line 39
    .line 40
    iput-boolean p0, p1, Lorg/jsoup/parser/f;->d:Z

    .line 41
    return-object p1

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p1}, Lorg/jsoup/parser/d;->e()Z

    .line 45
    move-result p1

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    move-result p1

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lorg/jsoup/parser/f;->a()Lorg/jsoup/parser/f;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    iput-object p0, p1, Lorg/jsoup/parser/f;->b:Ljava/lang/String;

    .line 60
    return-object p1

    .line 61
    :cond_1
    return-object v0

    .line 62
    :cond_2
    return-object v1
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
.end method


# virtual methods
.method public a()Lorg/jsoup/parser/f;
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lorg/jsoup/parser/f;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/RuntimeException;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 14
    throw v1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/jsoup/parser/f;->e:Z

    .line 3
    return v0
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
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/f;->b:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/jsoup/parser/f;->a()Lorg/jsoup/parser/f;

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
.end method

.method public d()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/jsoup/parser/f;->d:Z

    .line 3
    return v0
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
.end method

.method public e()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/jsoup/parser/f;->f:Z

    .line 3
    return v0
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
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lorg/jsoup/parser/f;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lorg/jsoup/parser/f;

    .line 13
    .line 14
    iget-object v1, p0, Lorg/jsoup/parser/f;->b:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lorg/jsoup/parser/f;->b:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->f:Z

    .line 26
    .line 27
    iget-boolean v3, p1, Lorg/jsoup/parser/f;->f:Z

    .line 28
    .line 29
    if-eq v1, v3, :cond_3

    .line 30
    return v2

    .line 31
    .line 32
    :cond_3
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->e:Z

    .line 33
    .line 34
    iget-boolean v3, p1, Lorg/jsoup/parser/f;->e:Z

    .line 35
    .line 36
    if-eq v1, v3, :cond_4

    .line 37
    return v2

    .line 38
    .line 39
    :cond_4
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->d:Z

    .line 40
    .line 41
    iget-boolean v3, p1, Lorg/jsoup/parser/f;->d:Z

    .line 42
    .line 43
    if-eq v1, v3, :cond_5

    .line 44
    return v2

    .line 45
    .line 46
    :cond_5
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->h:Z

    .line 47
    .line 48
    iget-boolean v3, p1, Lorg/jsoup/parser/f;->h:Z

    .line 49
    .line 50
    if-eq v1, v3, :cond_6

    .line 51
    return v2

    .line 52
    .line 53
    :cond_6
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->g:Z

    .line 54
    .line 55
    iget-boolean v3, p1, Lorg/jsoup/parser/f;->g:Z

    .line 56
    .line 57
    if-eq v1, v3, :cond_7

    .line 58
    return v2

    .line 59
    .line 60
    :cond_7
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->i:Z

    .line 61
    .line 62
    iget-boolean v3, p1, Lorg/jsoup/parser/f;->i:Z

    .line 63
    .line 64
    if-eq v1, v3, :cond_8

    .line 65
    return v2

    .line 66
    .line 67
    :cond_8
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->j:Z

    .line 68
    .line 69
    iget-boolean p1, p1, Lorg/jsoup/parser/f;->j:Z

    .line 70
    .line 71
    if-ne v1, p1, :cond_9

    .line 72
    return v0

    .line 73
    :cond_9
    return v2
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
.end method

.method public f()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/jsoup/parser/f;->i:Z

    .line 3
    return v0
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
.end method

.method public g()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/jsoup/parser/f;->d:Z

    .line 3
    .line 4
    xor-int/lit8 v0, v0, 0x1

    .line 5
    return v0
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
.end method

.method public h()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lorg/jsoup/parser/f;->k:Ljava/util/Map;

    .line 3
    .line 4
    iget-object v1, p0, Lorg/jsoup/parser/f;->b:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    return v0
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
.end method

.method public hashCode()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/f;->b:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->d:Z

    .line 11
    add-int/2addr v0, v1

    .line 12
    .line 13
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->e:Z

    .line 16
    add-int/2addr v0, v1

    .line 17
    .line 18
    mul-int/lit8 v0, v0, 0x1f

    .line 19
    .line 20
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->f:Z

    .line 21
    add-int/2addr v0, v1

    .line 22
    .line 23
    mul-int/lit8 v0, v0, 0x1f

    .line 24
    .line 25
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->g:Z

    .line 26
    add-int/2addr v0, v1

    .line 27
    .line 28
    mul-int/lit8 v0, v0, 0x1f

    .line 29
    .line 30
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->h:Z

    .line 31
    add-int/2addr v0, v1

    .line 32
    .line 33
    mul-int/lit8 v0, v0, 0x1f

    .line 34
    .line 35
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->i:Z

    .line 36
    add-int/2addr v0, v1

    .line 37
    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-boolean v1, p0, Lorg/jsoup/parser/f;->j:Z

    .line 41
    add-int/2addr v0, v1

    .line 42
    return v0
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
.end method

.method public i()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/jsoup/parser/f;->f:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lorg/jsoup/parser/f;->g:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/f;->c:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public k()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/jsoup/parser/f;->h:Z

    .line 3
    return v0
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
.end method

.method public m()Lorg/jsoup/parser/f;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lorg/jsoup/parser/f;->g:Z

    .line 4
    return-object p0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/jsoup/parser/f;->b:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method
