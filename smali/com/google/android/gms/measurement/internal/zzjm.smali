.class public final Lcom/google/android/gms/measurement/internal/zzjm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-base@@22.5.0"


# static fields
.field public static final zza:[Ljava/lang/String;

.field public static final zzb:[Ljava/lang/String;

.field public static final zzc:[Ljava/lang/String;

.field public static final zzd:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 59

    .line 1
    .line 2
    .line 3
    const-string/jumbo v57, "session_number"

    .line 4
    .line 5
    .line 6
    const-string/jumbo v58, "session_id"

    .line 7
    .line 8
    const-string v1, "ga_conversion"

    .line 9
    .line 10
    const-string v2, "engagement_time_msec"

    .line 11
    .line 12
    const-string v3, "exposure_time"

    .line 13
    .line 14
    const-string v4, "ad_event_id"

    .line 15
    .line 16
    const-string v5, "ad_unit_id"

    .line 17
    .line 18
    const-string v6, "ga_error"

    .line 19
    .line 20
    const-string v7, "ga_error_value"

    .line 21
    .line 22
    const-string v8, "ga_error_length"

    .line 23
    .line 24
    const-string v9, "ga_event_origin"

    .line 25
    .line 26
    const-string v10, "ga_screen"

    .line 27
    .line 28
    const-string v11, "ga_screen_class"

    .line 29
    .line 30
    const-string v12, "ga_screen_id"

    .line 31
    .line 32
    const-string v13, "ga_previous_screen"

    .line 33
    .line 34
    const-string v14, "ga_previous_class"

    .line 35
    .line 36
    const-string v15, "ga_previous_id"

    .line 37
    .line 38
    const-string v16, "manual_tracking"

    .line 39
    .line 40
    const-string v17, "message_device_time"

    .line 41
    .line 42
    const-string v18, "message_id"

    .line 43
    .line 44
    const-string v19, "message_name"

    .line 45
    .line 46
    const-string v20, "message_time"

    .line 47
    .line 48
    const-string v21, "message_tracking_id"

    .line 49
    .line 50
    const-string v22, "message_type"

    .line 51
    .line 52
    const-string v23, "previous_app_version"

    .line 53
    .line 54
    const-string v24, "previous_os_version"

    .line 55
    .line 56
    .line 57
    const-string/jumbo v25, "topic"

    .line 58
    .line 59
    .line 60
    const-string/jumbo v26, "update_with_analytics"

    .line 61
    .line 62
    const-string v27, "previous_first_open_count"

    .line 63
    .line 64
    .line 65
    const-string/jumbo v28, "system_app"

    .line 66
    .line 67
    .line 68
    const-string/jumbo v29, "system_app_update"

    .line 69
    .line 70
    const-string v30, "previous_install_count"

    .line 71
    .line 72
    const-string v31, "ga_event_id"

    .line 73
    .line 74
    const-string v32, "ga_extra_params_ct"

    .line 75
    .line 76
    const-string v33, "ga_group_name"

    .line 77
    .line 78
    const-string v34, "ga_list_length"

    .line 79
    .line 80
    const-string v35, "ga_index"

    .line 81
    .line 82
    const-string v36, "ga_event_name"

    .line 83
    .line 84
    const-string v37, "campaign_info_source"

    .line 85
    .line 86
    const-string v38, "cached_campaign"

    .line 87
    .line 88
    const-string v39, "deferred_analytics_collection"

    .line 89
    .line 90
    const-string v40, "ga_session_number"

    .line 91
    .line 92
    const-string v41, "ga_session_id"

    .line 93
    .line 94
    const-string v42, "campaign_extra_referrer"

    .line 95
    .line 96
    const-string v43, "app_in_background"

    .line 97
    .line 98
    const-string v44, "firebase_feature_rollouts"

    .line 99
    .line 100
    const-string v45, "customer_type"

    .line 101
    .line 102
    const-string v46, "firebase_conversion"

    .line 103
    .line 104
    const-string v47, "firebase_error"

    .line 105
    .line 106
    const-string v48, "firebase_error_value"

    .line 107
    .line 108
    const-string v49, "firebase_error_length"

    .line 109
    .line 110
    const-string v50, "firebase_event_origin"

    .line 111
    .line 112
    const-string v51, "firebase_screen"

    .line 113
    .line 114
    const-string v52, "firebase_screen_class"

    .line 115
    .line 116
    const-string v53, "firebase_screen_id"

    .line 117
    .line 118
    const-string v54, "firebase_previous_screen"

    .line 119
    .line 120
    const-string v55, "firebase_previous_class"

    .line 121
    .line 122
    const-string v56, "firebase_previous_id"

    .line 123
    .line 124
    .line 125
    filled-new-array/range {v1 .. v58}, [Ljava/lang/String;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    sput-object v0, Lcom/google/android/gms/measurement/internal/zzjm;->zza:[Ljava/lang/String;

    .line 129
    .line 130
    const-string v57, "_sno"

    .line 131
    .line 132
    const-string v58, "_sid"

    .line 133
    .line 134
    const-string v1, "_c"

    .line 135
    .line 136
    const-string v2, "_et"

    .line 137
    .line 138
    const-string v3, "_xt"

    .line 139
    .line 140
    const-string v4, "_aeid"

    .line 141
    .line 142
    const-string v5, "_ai"

    .line 143
    .line 144
    const-string v6, "_err"

    .line 145
    .line 146
    const-string v7, "_ev"

    .line 147
    .line 148
    const-string v8, "_el"

    .line 149
    .line 150
    const-string v9, "_o"

    .line 151
    .line 152
    const-string v10, "_sn"

    .line 153
    .line 154
    const-string v11, "_sc"

    .line 155
    .line 156
    const-string v12, "_si"

    .line 157
    .line 158
    const-string v13, "_pn"

    .line 159
    .line 160
    const-string v14, "_pc"

    .line 161
    .line 162
    const-string v15, "_pi"

    .line 163
    .line 164
    const-string v16, "_mst"

    .line 165
    .line 166
    const-string v17, "_ndt"

    .line 167
    .line 168
    const-string v18, "_nmid"

    .line 169
    .line 170
    const-string v19, "_nmn"

    .line 171
    .line 172
    const-string v20, "_nmt"

    .line 173
    .line 174
    const-string v21, "_nmtid"

    .line 175
    .line 176
    const-string v22, "_nmc"

    .line 177
    .line 178
    const-string v23, "_pv"

    .line 179
    .line 180
    const-string v24, "_po"

    .line 181
    .line 182
    const-string v25, "_nt"

    .line 183
    .line 184
    const-string v26, "_uwa"

    .line 185
    .line 186
    const-string v27, "_pfo"

    .line 187
    .line 188
    const-string v28, "_sys"

    .line 189
    .line 190
    const-string v29, "_sysu"

    .line 191
    .line 192
    const-string v30, "_pin"

    .line 193
    .line 194
    const-string v31, "_eid"

    .line 195
    .line 196
    const-string v32, "_epc"

    .line 197
    .line 198
    const-string v33, "_gn"

    .line 199
    .line 200
    const-string v34, "_ll"

    .line 201
    .line 202
    const-string v35, "_i"

    .line 203
    .line 204
    const-string v36, "_en"

    .line 205
    .line 206
    const-string v37, "_cis"

    .line 207
    .line 208
    const-string v38, "_cc"

    .line 209
    .line 210
    const-string v39, "_dac"

    .line 211
    .line 212
    const-string v40, "_sno"

    .line 213
    .line 214
    const-string v41, "_sid"

    .line 215
    .line 216
    const-string v42, "_cer"

    .line 217
    .line 218
    const-string v43, "_aib"

    .line 219
    .line 220
    const-string v44, "_ffr"

    .line 221
    .line 222
    const-string v45, "_ct"

    .line 223
    .line 224
    const-string v46, "_c"

    .line 225
    .line 226
    const-string v47, "_err"

    .line 227
    .line 228
    const-string v48, "_ev"

    .line 229
    .line 230
    const-string v49, "_el"

    .line 231
    .line 232
    const-string v50, "_o"

    .line 233
    .line 234
    const-string v51, "_sn"

    .line 235
    .line 236
    const-string v52, "_sc"

    .line 237
    .line 238
    const-string v53, "_si"

    .line 239
    .line 240
    const-string v54, "_pn"

    .line 241
    .line 242
    const-string v55, "_pc"

    .line 243
    .line 244
    const-string v56, "_pi"

    .line 245
    .line 246
    .line 247
    filled-new-array/range {v1 .. v58}, [Ljava/lang/String;

    .line 248
    move-result-object v0

    .line 249
    .line 250
    sput-object v0, Lcom/google/android/gms/measurement/internal/zzjm;->zzb:[Ljava/lang/String;

    .line 251
    .line 252
    const-string v0, "items"

    .line 253
    .line 254
    .line 255
    filled-new-array {v0}, [Ljava/lang/String;

    .line 256
    move-result-object v0

    .line 257
    .line 258
    sput-object v0, Lcom/google/android/gms/measurement/internal/zzjm;->zzc:[Ljava/lang/String;

    .line 259
    .line 260
    const-string v33, "checkout_option"

    .line 261
    .line 262
    const-string v34, "item_location_id"

    .line 263
    .line 264
    const-string v1, "affiliation"

    .line 265
    .line 266
    const-string v2, "coupon"

    .line 267
    .line 268
    const-string v3, "creative_name"

    .line 269
    .line 270
    const-string v4, "creative_slot"

    .line 271
    .line 272
    const-string v5, "currency"

    .line 273
    .line 274
    const-string v6, "_ct"

    .line 275
    .line 276
    const-string v7, "discount"

    .line 277
    .line 278
    const-string v8, "index"

    .line 279
    .line 280
    const-string v9, "item_id"

    .line 281
    .line 282
    const-string v10, "item_brand"

    .line 283
    .line 284
    const-string v11, "item_category"

    .line 285
    .line 286
    const-string v12, "item_category2"

    .line 287
    .line 288
    const-string v13, "item_category3"

    .line 289
    .line 290
    const-string v14, "item_category4"

    .line 291
    .line 292
    const-string v15, "item_category5"

    .line 293
    .line 294
    const-string v16, "item_list_name"

    .line 295
    .line 296
    const-string v17, "item_list_id"

    .line 297
    .line 298
    const-string v18, "item_name"

    .line 299
    .line 300
    const-string v19, "item_variant"

    .line 301
    .line 302
    const-string v20, "location_id"

    .line 303
    .line 304
    const-string v21, "payment_type"

    .line 305
    .line 306
    const-string v22, "price"

    .line 307
    .line 308
    const-string v23, "promotion_id"

    .line 309
    .line 310
    const-string v24, "promotion_name"

    .line 311
    .line 312
    const-string v25, "quantity"

    .line 313
    .line 314
    .line 315
    const-string/jumbo v26, "shipping"

    .line 316
    .line 317
    .line 318
    const-string/jumbo v27, "shipping_tier"

    .line 319
    .line 320
    .line 321
    const-string/jumbo v28, "tax"

    .line 322
    .line 323
    .line 324
    const-string/jumbo v29, "transaction_id"

    .line 325
    .line 326
    .line 327
    const-string/jumbo v30, "value"

    .line 328
    .line 329
    const-string v31, "item_list"

    .line 330
    .line 331
    const-string v32, "checkout_step"

    .line 332
    .line 333
    .line 334
    filled-new-array/range {v1 .. v34}, [Ljava/lang/String;

    .line 335
    move-result-object v0

    .line 336
    .line 337
    sput-object v0, Lcom/google/android/gms/measurement/internal/zzjm;->zzd:[Ljava/lang/String;

    .line 338
    return-void
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
.end method
