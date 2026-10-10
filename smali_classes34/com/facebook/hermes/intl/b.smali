.class public Lcom/facebook/hermes/intl/b;
.super Ljava/lang/Object;
.source "LocaleResolver.java"


# direct methods
.method public static a(Ljava/util/List;Ljava/lang/Object;Ljava/util/List;)Ljava/util/HashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/facebook/hermes/intl/JSRangeErrorException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    const-string v1, "localeMatcher"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1}, Lj5/d;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lj5/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-string v2, "lookup"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 27
    move-result v1

    .line 28
    .line 29
    new-array v1, v1, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    check-cast p0, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Lcom/facebook/hermes/intl/a;->f([Ljava/lang/String;)Lcom/facebook/hermes/intl/a$a;

    .line 39
    move-result-object p0

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 44
    move-result v1

    .line 45
    .line 46
    new-array v1, v1, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-interface {p0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    check-cast p0, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Lcom/facebook/hermes/intl/a;->c([Ljava/lang/String;)Lcom/facebook/hermes/intl/a$a;

    .line 56
    move-result-object p0

    .line 57
    .line 58
    :goto_0
    new-instance v1, Ljava/util/HashSet;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    move-result-object p2

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    move-result v2

    .line 70
    .line 71
    if-eqz v2, :cond_7

    .line 72
    .line 73
    .line 74
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    check-cast v2, Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lj5/d;->b()Ljava/lang/Object;

    .line 81
    move-result-object v3

    .line 82
    .line 83
    iget-object v4, p0, Lcom/facebook/hermes/intl/a$a;->b:Ljava/util/HashMap;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 87
    move-result v4

    .line 88
    .line 89
    if-nez v4, :cond_2

    .line 90
    .line 91
    iget-object v4, p0, Lcom/facebook/hermes/intl/a$a;->b:Ljava/util/HashMap;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 95
    move-result v4

    .line 96
    .line 97
    if-eqz v4, :cond_2

    .line 98
    .line 99
    iget-object v3, p0, Lcom/facebook/hermes/intl/a$a;->b:Ljava/util/HashMap;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    move-result-object v3

    .line 104
    .line 105
    check-cast v3, Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 109
    move-result v4

    .line 110
    .line 111
    if-nez v4, :cond_1

    .line 112
    goto :goto_2

    .line 113
    .line 114
    .line 115
    :cond_1
    const-string/jumbo v3, "true"

    .line 116
    .line 117
    .line 118
    invoke-static {v3}, Lj5/d;->r(Ljava/lang/String;)Ljava/lang/Object;

    .line 119
    move-result-object v3

    .line 120
    .line 121
    .line 122
    :goto_2
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    :cond_2
    invoke-static {p1}, Lj5/d;->g(Ljava/lang/Object;)Ljava/util/Map;

    .line 126
    move-result-object v4

    .line 127
    .line 128
    .line 129
    invoke-interface {v4, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 130
    move-result v4

    .line 131
    .line 132
    if-eqz v4, :cond_4

    .line 133
    .line 134
    .line 135
    invoke-static {p1, v2}, Lj5/d;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 136
    move-result-object v4

    .line 137
    .line 138
    .line 139
    invoke-static {v4}, Lj5/d;->m(Ljava/lang/Object;)Z

    .line 140
    move-result v5

    .line 141
    .line 142
    if-eqz v5, :cond_3

    .line 143
    .line 144
    .line 145
    invoke-static {v4}, Lj5/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    move-result-object v5

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 150
    move-result v5

    .line 151
    .line 152
    if-eqz v5, :cond_3

    .line 153
    const/4 v4, 0x1

    .line 154
    .line 155
    .line 156
    invoke-static {v4}, Lj5/d;->o(Z)Ljava/lang/Object;

    .line 157
    move-result-object v4

    .line 158
    .line 159
    .line 160
    :cond_3
    invoke-static {v4}, Lj5/d;->n(Ljava/lang/Object;)Z

    .line 161
    move-result v5

    .line 162
    .line 163
    if-nez v5, :cond_4

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    move-result v5

    .line 168
    .line 169
    if-nez v5, :cond_4

    .line 170
    .line 171
    .line 172
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 173
    move-object v3, v4

    .line 174
    .line 175
    .line 176
    :cond_4
    invoke-static {v3}, Lj5/d;->j(Ljava/lang/Object;)Z

    .line 177
    move-result v4

    .line 178
    .line 179
    if-nez v4, :cond_5

    .line 180
    .line 181
    .line 182
    invoke-static {v2, v3}, Lcom/facebook/hermes/intl/UnicodeExtensionKeys;->f(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    move-result-object v3

    .line 184
    .line 185
    .line 186
    :cond_5
    invoke-static {v3}, Lj5/d;->m(Ljava/lang/Object;)Z

    .line 187
    move-result v4

    .line 188
    .line 189
    if-eqz v4, :cond_6

    .line 190
    .line 191
    .line 192
    invoke-static {v3}, Lj5/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 193
    move-result-object v4

    .line 194
    .line 195
    iget-object v5, p0, Lcom/facebook/hermes/intl/a$a;->a:Lj5/b;

    .line 196
    .line 197
    .line 198
    invoke-static {v2, v4, v5}, Lcom/facebook/hermes/intl/UnicodeExtensionKeys;->c(Ljava/lang/String;Ljava/lang/String;Lj5/b;)Z

    .line 199
    move-result v4

    .line 200
    .line 201
    if-nez v4, :cond_6

    .line 202
    .line 203
    .line 204
    invoke-static {}, Lj5/d;->b()Ljava/lang/Object;

    .line 205
    move-result-object v3

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    .line 213
    :cond_6
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    .line 218
    :cond_7
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 219
    move-result-object p1

    .line 220
    .line 221
    .line 222
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    move-result p2

    .line 224
    .line 225
    if-eqz p2, :cond_9

    .line 226
    .line 227
    .line 228
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    move-result-object p2

    .line 230
    .line 231
    check-cast p2, Ljava/lang/String;

    .line 232
    .line 233
    new-instance v1, Ljava/util/ArrayList;

    .line 234
    .line 235
    .line 236
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 237
    .line 238
    iget-object v2, p0, Lcom/facebook/hermes/intl/a$a;->b:Ljava/util/HashMap;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    move-result-object v2

    .line 243
    .line 244
    check-cast v2, Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    invoke-static {v2}, Lj5/d;->r(Ljava/lang/String;)Ljava/lang/Object;

    .line 248
    move-result-object v2

    .line 249
    .line 250
    .line 251
    invoke-static {p2, v2}, Lcom/facebook/hermes/intl/UnicodeExtensionKeys;->f(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    move-result-object v2

    .line 253
    .line 254
    .line 255
    invoke-static {v2}, Lj5/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 256
    move-result-object v2

    .line 257
    .line 258
    .line 259
    invoke-static {v2}, Lj5/d;->m(Ljava/lang/Object;)Z

    .line 260
    move-result v3

    .line 261
    .line 262
    if-eqz v3, :cond_8

    .line 263
    .line 264
    .line 265
    invoke-static {v2}, Lj5/d;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 266
    move-result-object v3

    .line 267
    .line 268
    iget-object v4, p0, Lcom/facebook/hermes/intl/a$a;->a:Lj5/b;

    .line 269
    .line 270
    .line 271
    invoke-static {p2, v3, v4}, Lcom/facebook/hermes/intl/UnicodeExtensionKeys;->c(Ljava/lang/String;Ljava/lang/String;Lj5/b;)Z

    .line 272
    move-result v3

    .line 273
    .line 274
    if-nez v3, :cond_8

    .line 275
    goto :goto_3

    .line 276
    .line 277
    .line 278
    :cond_8
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    iget-object v2, p0, Lcom/facebook/hermes/intl/a$a;->a:Lj5/b;

    .line 281
    .line 282
    .line 283
    invoke-interface {v2, p2, v1}, Lj5/b;->c(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 284
    goto :goto_3

    .line 285
    .line 286
    :cond_9
    const-string p1, "locale"

    .line 287
    .line 288
    iget-object p0, p0, Lcom/facebook/hermes/intl/a$a;->a:Lj5/b;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    return-object v0
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
.end method
