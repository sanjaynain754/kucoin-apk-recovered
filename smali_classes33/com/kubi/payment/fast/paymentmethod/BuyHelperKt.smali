.class public final Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;
.super Ljava/lang/Object;
.source "BuyHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\t\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u001a.\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a\u001c\u0010\u000c\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u001a.\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002\u001a$\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u001a.\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002\u001a,\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0002\u00a8\u0006\u0019"
    }
    d2 = {
        "previewOrderOneTimePurchase",
        "",
        "Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;",
        "context",
        "Landroid/content/Context;",
        "paymentMethod",
        "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;",
        "extraParams",
        "Lcom/kubi/payment/fast/paymentmethod/ExtraParams;",
        "handlePaymentType",
        "confirmExtraParams",
        "Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;",
        "handleThird",
        "handleBalance",
        "handleBankCard",
        "fiatCurrencyIconUrl",
        "",
        "handlePopularPay",
        "handleRevolut",
        "handleZen",
        "handleGooglePay",
        "handleP2P",
        "cryptoCurrencyIconUrl",
        "launchP2PConfirm",
        "preSpmId",
        "PaymentLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBuyHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyHelper.kt\ncom/kubi/payment/fast/paymentmethod/BuyHelperKt\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,394:1\n44#2,2:395\n*S KotlinDebug\n*F\n+ 1 BuyHelper.kt\ncom/kubi/payment/fast/paymentmethod/BuyHelperKt\n*L\n106#1:395,2\n*E\n"
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Landroid/content/Context;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p7}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->i(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Landroid/content/Context;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;

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
.end method

.method public static synthetic b(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p5}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->k(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;

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
.end method

.method public static synthetic c(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p6}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->n(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;

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
.end method

.method public static synthetic d(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->o(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;

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
.end method

.method public static synthetic e(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p5}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->j(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;

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
.end method

.method public static final synthetic f(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/paymentmethod/ExtraParams;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->p(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/paymentmethod/ExtraParams;)V

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
.end method

.method public static final g(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/otc/service/a;->j()Lcom/kubi/user/model/LoginUserEntity;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/user/model/LoginUserEntity;->isWithDrawPassword()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object p1, Lcom/kubi/otc/security/SecuritySettingDialog;->x0:Lcom/kubi/otc/security/SecuritySettingDialog$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    const-string p2, "getChildFragmentManager(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;

    .line 26
    .line 27
    const/16 v7, 0x3d

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v0 .. v8}, Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;-><init>(ZZZZZLjava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0, v0}, Lcom/kubi/otc/security/SecuritySettingDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;)V

    .line 41
    return-void

    .line 42
    .line 43
    :cond_0
    sget-object v0, Lcom/kubi/payment/fast/buy/balance/BalanceBuyConfirmFragment;->b0:Lcom/kubi/payment/fast/buy/balance/BalanceBuyConfirmFragment$Companion;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1, p0, p2}, Lcom/kubi/payment/fast/buy/balance/BalanceBuyConfirmFragment$Companion;->launch(Landroid/content/Context;Lcom/kubi/sdk/BaseFragment;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V

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
.end method

.method public static final h(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;)V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p2, p1, p3, v0}, Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragmentExtKt;->l(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Z)Z

    .line 5
    move-result v1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    return-void

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getBankCardInfo()Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;

    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;->getCardFiatCurrency()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-object v1, v2

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    .line 28
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 29
    move-result v1

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    goto :goto_1

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    :goto_1
    const-string p2, "B7BuyCryBankCard"

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p2}, Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;->Q3(Ljava/lang/String;)V

    .line 48
    .line 49
    sget-object v0, Lcom/kubi/payment/fast/buy/bankcard/BankCardBuyConfirmFragment;->c0:Lcom/kubi/payment/fast/buy/bankcard/BankCardBuyConfirmFragment$Companion;

    .line 50
    .line 51
    const-string p0, "submitbutton"

    .line 52
    .line 53
    const-string p2, "1"

    .line 54
    .line 55
    const-string p4, "B7PaymentMethod"

    .line 56
    .line 57
    .line 58
    invoke-static {p4, p0, p2}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    move-result-object v4

    .line 60
    const/4 v5, 0x4

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v3, 0x0

    .line 63
    move-object v1, p1

    .line 64
    move-object v2, p3

    .line 65
    .line 66
    .line 67
    invoke-static/range {v0 .. v6}, Lcom/kubi/payment/fast/buy/bankcard/BankCardBuyConfirmFragment$Companion;->launch$default(Lcom/kubi/payment/fast/buy/bankcard/BankCardBuyConfirmFragment$Companion;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Ljava/lang/String;ILjava/lang/Object;)V

    .line 68
    return-void

    .line 69
    :cond_3
    move-object v1, p1

    .line 70
    move-object v9, p3

    .line 71
    .line 72
    new-instance v7, Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getBankCardInfo()Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;->getCardFiatCurrencyIconUrl()Ljava/lang/String;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-direct {v7, v4, v2, p1, p4}, Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    sget-object p1, Lcom/kubi/resources/dialog/DialogFragmentHelper;->p0:Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;

    .line 92
    .line 93
    sget p3, Lcom/kubi/otc/R$layout;->payment_dialog_credit_card_fiat_currency:I

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p3, v0}, Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;->newInstance(IZ)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    new-instance v3, Lcom/kubi/payment/fast/paymentmethod/b;

    .line 100
    move-object v8, p0

    .line 101
    move-object v5, p2

    .line 102
    move-object v6, v1

    .line 103
    .line 104
    .line 105
    invoke-direct/range {v3 .. v9}, Lcom/kubi/payment/fast/paymentmethod/b;-><init>(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Landroid/content/Context;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v3}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->f4(Lkotlin/jvm/functions/Function2;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 109
    move-result-object p0

    .line 110
    .line 111
    .line 112
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    const-string p2, "getChildFragmentManager(...)"

    .line 116
    .line 117
    .line 118
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    const-string p2, "payment_fast_switch_fiat_currency"

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1, p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 124
    return-void
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

.method public static final i(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Landroid/content/Context;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 9

    .line 1
    .line 2
    const-string v1, "viewHolder"

    .line 3
    .line 4
    .line 5
    invoke-static {p6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "helper"

    .line 8
    .line 9
    move-object/from16 v8, p7

    .line 10
    .line 11
    .line 12
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    sget v1, Lcom/kubi/otc/R$id;->tv_description:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p6, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Landroid/widget/TextView;

    .line 21
    .line 22
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 23
    .line 24
    sget v3, Lcom/kubi/otc/R$string;->payment_switch_currency_description:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    .line 31
    filled-new-array {p0, v4}, [Ljava/lang/Object;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    sget-object v2, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 45
    .line 46
    new-instance v3, Lkotlin/Pair;

    .line 47
    .line 48
    sget-object v4, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 49
    .line 50
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    .line 51
    .line 52
    sget v6, Lcom/kubi/otc/R$color;->c_text:I

    .line 53
    .line 54
    .line 55
    invoke-static {p2, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 56
    move-result v6

    .line 57
    .line 58
    .line 59
    invoke-direct {v5, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v3, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 66
    move-result-object v3

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v1, v3}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 70
    .line 71
    sget v1, Lcom/kubi/otc/R$id;->iv_matched:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p6, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    check-cast v1, Landroid/widget/ImageView;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3}, Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;->getBestMatchedFiatCurrencyIcon()Ljava/lang/String;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    .line 84
    invoke-static {p2, v2, v1}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 85
    .line 86
    sget v1, Lcom/kubi/otc/R$id;->tv_matched_fiat_currency:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {p6, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    check-cast v1, Landroid/widget/TextView;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    sget v1, Lcom/kubi/otc/R$id;->iv_other:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {p6, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    check-cast v1, Landroid/widget/ImageView;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3}, Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;->getOtherFiatCurrencyIcon()Ljava/lang/String;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    .line 110
    invoke-static {p2, v2, v1}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 111
    .line 112
    sget v1, Lcom/kubi/otc/R$id;->tv_other_fiat_currency:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {p6, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 116
    move-result-object v1

    .line 117
    .line 118
    check-cast v1, Landroid/widget/TextView;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    sget v1, Lcom/kubi/otc/R$id;->tv_matched:I

    .line 128
    .line 129
    .line 130
    invoke-virtual {p6, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    check-cast v1, Landroid/widget/TextView;

    .line 134
    .line 135
    sget v2, Lcom/kubi/otc/R$string;->payment_switch_currency_buy:I

    .line 136
    .line 137
    .line 138
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 139
    move-result-object v3

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    move-result-object v2

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 150
    .line 151
    new-instance v2, Lcom/kubi/payment/fast/paymentmethod/c;

    .line 152
    move-object v6, p0

    .line 153
    move-object v4, p2

    .line 154
    move-object v7, p3

    .line 155
    move-object v3, p4

    .line 156
    move-object v5, p5

    .line 157
    .line 158
    .line 159
    invoke-direct/range {v2 .. v8}, Lcom/kubi/payment/fast/paymentmethod/c;-><init>(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

    .line 160
    const/4 v6, 0x1

    .line 161
    const/4 v7, 0x0

    .line 162
    .line 163
    const-wide/16 v3, 0x0

    .line 164
    move-object v5, v2

    .line 165
    move-object v2, v1

    .line 166
    .line 167
    .line 168
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 169
    .line 170
    sget v1, Lcom/kubi/otc/R$id;->tv_other:I

    .line 171
    .line 172
    .line 173
    invoke-virtual {p6, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 174
    move-result-object v0

    .line 175
    .line 176
    check-cast v0, Landroid/widget/TextView;

    .line 177
    .line 178
    sget v1, Lcom/kubi/otc/R$string;->payment_continue_currency_buy:I

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 182
    move-result-object v2

    .line 183
    .line 184
    .line 185
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 186
    move-result-object v2

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 190
    move-result-object v1

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 197
    .line 198
    new-instance v2, Lcom/kubi/payment/fast/paymentmethod/d;

    .line 199
    move-object v6, p1

    .line 200
    move-object v4, p2

    .line 201
    move-object v7, p3

    .line 202
    move-object v3, p4

    .line 203
    move-object v5, p5

    .line 204
    .line 205
    .line 206
    invoke-direct/range {v2 .. v8}, Lcom/kubi/payment/fast/paymentmethod/d;-><init>(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

    .line 207
    move-object p3, v2

    .line 208
    const/4 p4, 0x1

    .line 209
    const/4 p5, 0x0

    .line 210
    .line 211
    const-wide/16 p1, 0x0

    .line 212
    move-object p0, v0

    .line 213
    .line 214
    .line 215
    invoke-static/range {p0 .. p5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 216
    .line 217
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 218
    return-object p0
.end method

.method public static final j(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 17

    .line 1
    .line 2
    const-string v0, "B7BuyCryBankCard"

    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;->Q3(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/payment/fast/buy/bankcard/BankCardBuyConfirmFragment;->c0:Lcom/kubi/payment/fast/buy/bankcard/BankCardBuyConfirmFragment$Companion;

    .line 10
    .line 11
    const/16 v15, 0x1ff5

    .line 12
    .line 13
    const/16 v16, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    const-string v3, "BANK_CARD"

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x0

    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x0

    .line 27
    .line 28
    move-object/from16 v1, p2

    .line 29
    .line 30
    move-object/from16 v5, p3

    .line 31
    .line 32
    .line 33
    invoke-static/range {v1 .. v16}, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;->copy$default(Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/payment/fast/buy/recurring/RecurringFrequency;ILjava/lang/Object;)Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    const-string v2, "submitbutton"

    .line 37
    .line 38
    const-string v3, "1"

    .line 39
    .line 40
    const-string v4, "B7PaymentMethod"

    .line 41
    .line 42
    .line 43
    invoke-static {v4, v2, v3}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    move-object/from16 v3, p1

    .line 47
    .line 48
    move-object/from16 v4, p4

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v3, v1, v4, v2}, Lcom/kubi/payment/fast/buy/bankcard/BankCardBuyConfirmFragment$Companion;->launch(Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {p5 .. p5}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    return-object v0
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
.end method

.method public static final k(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 18

    .line 1
    .line 2
    const-string v0, "B7BuyCryBankCard"

    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;->Q3(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/payment/fast/buy/bankcard/BankCardBuyConfirmFragment;->c0:Lcom/kubi/payment/fast/buy/bankcard/BankCardBuyConfirmFragment$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v6

    .line 18
    .line 19
    const/16 v16, 0x1ff5

    .line 20
    .line 21
    const/16 v17, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    const-string v4, "BANK_CARD"

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    const/4 v12, 0x0

    .line 32
    const/4 v13, 0x0

    .line 33
    const/4 v14, 0x0

    .line 34
    const/4 v15, 0x0

    .line 35
    .line 36
    move-object/from16 v2, p2

    .line 37
    .line 38
    .line 39
    invoke-static/range {v2 .. v17}, Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;->copy$default(Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/payment/fast/buy/recurring/RecurringFrequency;ILjava/lang/Object;)Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-string v2, "submitbutton"

    .line 43
    .line 44
    const-string v3, "1"

    .line 45
    .line 46
    const-string v4, "B7PaymentMethod"

    .line 47
    .line 48
    .line 49
    invoke-static {v4, v2, v3}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    move-object/from16 v3, p1

    .line 53
    .line 54
    move-object/from16 v4, p4

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v3, v1, v4, v2}, Lcom/kubi/payment/fast/buy/bankcard/BankCardBuyConfirmFragment$Companion;->launch(Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/buy/bankcard/BankCardExtraParams;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {p5 .. p5}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 61
    .line 62
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 63
    return-object v0
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
.end method

.method public static final l(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/fast/buy/popularpay/googlepay/GooglePayConfirmFragment;->a0:Lcom/kubi/payment/fast/buy/popularpay/googlepay/GooglePayConfirmFragment$Companion;

    .line 3
    .line 4
    const/16 v5, 0x8

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    move-object v2, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v3, p2

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v6}, Lcom/kubi/payment/fast/buy/popularpay/googlepay/GooglePayConfirmFragment$Companion;->launch$default(Lcom/kubi/payment/fast/buy/popularpay/googlepay/GooglePayConfirmFragment$Companion;Landroid/content/Context;Lcom/kubi/sdk/BaseFragment;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;ILjava/lang/Object;)V

    .line 13
    return-void
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
.end method

.method public static final m(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getHedgeMidCurrency()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x4

    .line 6
    .line 7
    const-string v2, "submitButton"

    .line 8
    .line 9
    const-string v3, "B7PaymentMethod"

    .line 10
    const/4 v4, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    :cond_0
    move-object p0, p1

    .line 20
    move-object v5, p2

    .line 21
    move-object v6, p3

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_1
    const-string v0, "B7PaymentMethodContinueGuide"

    .line 25
    .line 26
    .line 27
    invoke-static {v3, v2, v4, v1, v4}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lqq/m;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    sget-object v0, Lcom/kubi/resources/dialog/DialogFragmentHelper;->p0:Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;

    .line 34
    .line 35
    sget v1, Lcom/kubi/otc/R$layout;->payment_dialog_fast_p2p:I

    .line 36
    const/4 v2, 0x1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;->newInstance(IZ)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    new-instance v1, Lcom/kubi/payment/fast/paymentmethod/a;

    .line 43
    move-object v4, p0

    .line 44
    move-object v2, p1

    .line 45
    move-object v5, p2

    .line 46
    move-object v6, p3

    .line 47
    move-object v3, p4

    .line 48
    .line 49
    .line 50
    invoke-direct/range {v1 .. v6}, Lcom/kubi/payment/fast/paymentmethod/a;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->f4(Lkotlin/jvm/functions/Function2;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 54
    move-result-object p0

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    const-string p2, "getChildFragmentManager(...)"

    .line 61
    .line 62
    .line 63
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    const-string p2, "payment_fast_p2p_express"

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1, p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 69
    return-void

    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-static {v3, v2, v4, v1, v4}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v5, v6, p1}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->u(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;)V

    .line 77
    return-void
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
.end method

.method public static final n(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const-string v0, "viewHolder"

    .line 3
    .line 4
    .line 5
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "helper"

    .line 8
    .line 9
    .line 10
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget v0, Lcom/kubi/otc/R$id;->iv_fiat_currency:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p5, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1, v0}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 22
    .line 23
    sget p1, Lcom/kubi/otc/R$id;->tv_title:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p5, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    check-cast p1, Landroid/widget/TextView;

    .line 30
    .line 31
    sget v0, Lcom/kubi/otc/R$string;->payment_fast_p2p_express_title:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getCryptoCurrency()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    sget p1, Lcom/kubi/otc/R$id;->tv_step_1_title:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p5, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    check-cast p1, Landroid/widget/TextView;

    .line 55
    .line 56
    sget v0, Lcom/kubi/otc/R$string;->payment_fast_convert_title:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getHedgeMidCurrency()Ljava/lang/String;

    .line 64
    move-result-object v2

    .line 65
    .line 66
    .line 67
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v0, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    sget p1, Lcom/kubi/otc/R$id;->tv_step_1_description:I

    .line 78
    .line 79
    .line 80
    invoke-virtual {p5, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    check-cast p1, Landroid/widget/TextView;

    .line 84
    .line 85
    sget v0, Lcom/kubi/otc/R$string;->payment_fast_transfer_description:I

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getHedgeMidCurrency()Ljava/lang/String;

    .line 93
    move-result-object v2

    .line 94
    .line 95
    .line 96
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v0, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    sget p1, Lcom/kubi/otc/R$id;->tv_step_2_title:I

    .line 107
    .line 108
    .line 109
    invoke-virtual {p5, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    check-cast p1, Landroid/widget/TextView;

    .line 113
    .line 114
    sget v0, Lcom/kubi/otc/R$string;->payment_fast_automatic_transfer_title:I

    .line 115
    .line 116
    .line 117
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getHedgeMidCurrency()Ljava/lang/String;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getCryptoCurrency()Ljava/lang/String;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    .line 125
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 126
    move-result-object v1

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2, v0, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    sget p1, Lcom/kubi/otc/R$id;->tv_step_2_description:I

    .line 136
    .line 137
    .line 138
    invoke-virtual {p5, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    check-cast p1, Landroid/widget/TextView;

    .line 142
    .line 143
    sget v0, Lcom/kubi/otc/R$string;->payment_fast_automatic_transfer_description:I

    .line 144
    .line 145
    .line 146
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getHedgeMidCurrency()Ljava/lang/String;

    .line 147
    move-result-object v1

    .line 148
    .line 149
    .line 150
    invoke-virtual {p3}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getCryptoCurrency()Ljava/lang/String;

    .line 151
    move-result-object v2

    .line 152
    .line 153
    .line 154
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 155
    move-result-object v1

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2, v0, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    move-result-object p2

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    sget p1, Lcom/kubi/otc/R$id;->tv_confirm:I

    .line 165
    .line 166
    .line 167
    invoke-virtual {p5, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 168
    move-result-object p1

    .line 169
    move-object v0, p1

    .line 170
    .line 171
    check-cast v0, Landroid/widget/TextView;

    .line 172
    .line 173
    .line 174
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 175
    .line 176
    new-instance v3, Lcom/kubi/payment/fast/paymentmethod/e;

    .line 177
    .line 178
    .line 179
    invoke-direct {v3, p0, p3, p4, p6}, Lcom/kubi/payment/fast/paymentmethod/e;-><init>(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

    .line 180
    const/4 v4, 0x1

    .line 181
    const/4 v5, 0x0

    .line 182
    .line 183
    const-wide/16 v1, 0x0

    .line 184
    .line 185
    .line 186
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 187
    .line 188
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 189
    return-object p0
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
.end method

.method public static final o(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    new-instance v3, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    const-string v1, "pay_fiat_currency"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getCryptoCurrency()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    const-string v1, "pay_crypto_currency"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    const-string v0, "pay_side"

    .line 34
    .line 35
    const-string v1, "buy"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    const-string v0, "norm_version"

    .line 41
    .line 42
    const-string v1, "1"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 48
    const/4 v4, 0x4

    .line 49
    const/4 v5, 0x0

    .line 50
    .line 51
    const-string v0, "B7PaymentMethodContinueGuide"

    .line 52
    .line 53
    const-string v1, "continueGuide"

    .line 54
    const/4 v2, 0x0

    .line 55
    .line 56
    .line 57
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 58
    const/4 v0, 0x0

    .line 59
    const/4 v1, 0x4

    .line 60
    .line 61
    const-string v2, "B7PaymentMethodContinueGuide"

    .line 62
    .line 63
    const-string v3, "continueButton"

    .line 64
    .line 65
    .line 66
    invoke-static {v2, v3, v0, v1, v0}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-static {p0, p1, p2, v0}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->u(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 76
    return-object p0
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
.end method

.method public static final p(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/paymentmethod/ExtraParams;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getPaymentType()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    sparse-switch v1, :sswitch_data_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :sswitch_0
    const-string v1, "BANK_CARD"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    if-eqz p4, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p4}, Lcom/kubi/payment/fast/paymentmethod/ExtraParams;->getFiatCurrencyIconUrl()Ljava/lang/String;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {p0, p2, p1, p3, v2}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->h(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;)V

    .line 34
    return-void

    .line 35
    .line 36
    :sswitch_1
    const-string p1, "BALANCE"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-nez p1, :cond_2

    .line 43
    goto :goto_0

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-static {p0, p2, p3}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->g(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V

    .line 47
    return-void

    .line 48
    .line 49
    :sswitch_2
    const-string v1, "P2P_EXPRESS"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-nez v0, :cond_3

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_3
    if-eqz p4, :cond_4

    .line 59
    .line 60
    .line 61
    invoke-virtual {p4}, Lcom/kubi/payment/fast/paymentmethod/ExtraParams;->getCryptoCurrencyIconUrl()Ljava/lang/String;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    :cond_4
    invoke-static {p0, p2, p1, p3, v2}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->m(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;)V

    .line 66
    return-void

    .line 67
    .line 68
    :sswitch_3
    const-string p4, "POPULAR_PAY"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    move-result p4

    .line 73
    .line 74
    if-nez p4, :cond_5

    .line 75
    goto :goto_0

    .line 76
    .line 77
    .line 78
    :cond_5
    invoke-static {p0, p2, p1, p3}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->q(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V

    .line 79
    return-void

    .line 80
    .line 81
    :sswitch_4
    const-string p3, "THIRD_PARTY"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    move-result p3

    .line 86
    .line 87
    if-nez p3, :cond_6

    .line 88
    goto :goto_0

    .line 89
    .line 90
    .line 91
    :cond_6
    invoke-static {p0, p2, p1}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->s(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;)V

    .line 92
    :cond_7
    :goto_0
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x2edf3e32 -> :sswitch_4
        -0x1ac321fe -> :sswitch_3
        -0x3779941 -> :sswitch_2
        0x1693fabc -> :sswitch_1
        0x3d4cb333 -> :sswitch_0
    .end sparse-switch
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

.method public static final q(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    sparse-switch v0, :sswitch_data_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :sswitch_0
    const-string v0, "revolut"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result p2

    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1, p3}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->r(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V

    .line 26
    return-void

    .line 27
    .line 28
    :sswitch_1
    const-string v0, "google_pay_eu"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result p2

    .line 33
    .line 34
    if-nez p2, :cond_1

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :sswitch_2
    const-string v0, "google_pay_au"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    move-result p2

    .line 42
    .line 43
    if-nez p2, :cond_1

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :sswitch_3
    const-string v0, "blik"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result p2

    .line 51
    .line 52
    if-nez p2, :cond_0

    .line 53
    goto :goto_0

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-static {p0, p1, p3}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->t(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V

    .line 57
    return-void

    .line 58
    .line 59
    :sswitch_4
    const-string v0, "google_pay"

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    move-result p2

    .line 64
    .line 65
    if-nez p2, :cond_1

    .line 66
    goto :goto_0

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-static {p0, p1, p3}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt;->l(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V

    .line 70
    :cond_2
    :goto_0
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x5b7b865e -> :sswitch_4
        0x2e2eec -> :sswitch_3
        0x1447fbf1 -> :sswitch_2
        0x1447fc6d -> :sswitch_1
        0x4192c85f -> :sswitch_0
    .end sparse-switch
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
.end method

.method public static final r(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "B7BuyCryRevolut"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;->Q3(Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/payment/fast/buy/popularpay/revolut/RevolutConfirmActivity;->l:Lcom/kubi/payment/fast/buy/popularpay/revolut/RevolutConfirmActivity$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p0, p2}, Lcom/kubi/payment/fast/buy/popularpay/revolut/RevolutConfirmActivity$Companion;->launch(Landroid/content/Context;Lcom/kubi/sdk/BaseFragment;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V

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
.end method

.method public static final s(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;)V
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->ThirdParty:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v2, Ljava/lang/Exception;

    .line 11
    .line 12
    const-string p0, "third party is not available"

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    new-instance v1, Lcom/kubi/otc/exception/OtcException;

    .line 18
    .line 19
    const/16 v6, 0x8

    .line 20
    const/4 v7, 0x0

    .line 21
    .line 22
    const-string v3, "BuyHelper"

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct/range {v1 .. v7}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    const/4 p0, 0x2

    .line 29
    const/4 p1, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static {v1, p1, p0, p1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 33
    return-void

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    const-string v1, "PayID"

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    sget-object v1, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/kubi/otc/service/a;->m()Lcom/kubi/user/api/IUserService;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    .line 58
    invoke-interface {v2}, Lcom/kubi/user/api/IUserService;->M()Z

    .line 59
    move-result v2

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/kubi/otc/service/a;->m()Lcom/kubi/user/api/IUserService;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-interface {v1}, Lcom/kubi/user/api/IUserService;->R()Z

    .line 69
    move-result v1

    .line 70
    .line 71
    if-nez v1, :cond_1

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    :goto_0
    move-object v6, v0

    .line 74
    goto :goto_2

    .line 75
    .line 76
    :cond_2
    :goto_1
    sget-object p1, Lcom/kubi/otc/security/SecuritySettingDialog;->x0:Lcom/kubi/otc/security/SecuritySettingDialog$Companion;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 80
    move-result-object p0

    .line 81
    .line 82
    const-string p2, "getChildFragmentManager(...)"

    .line 83
    .line 84
    .line 85
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    new-instance v0, Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;

    .line 88
    .line 89
    const/16 v7, 0x3a

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v1, 0x1

    .line 92
    const/4 v2, 0x0

    .line 93
    const/4 v3, 0x1

    .line 94
    const/4 v4, 0x0

    .line 95
    const/4 v5, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    .line 98
    .line 99
    invoke-direct/range {v0 .. v8}, Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;-><init>(ZZZZZLjava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p0, v0}, Lcom/kubi/otc/security/SecuritySettingDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;)V

    .line 103
    return-void

    .line 104
    .line 105
    :cond_3
    const-string v0, ""

    .line 106
    goto :goto_0

    .line 107
    .line 108
    :goto_2
    sget-object v1, Lcom/kubi/payment/third/quote/ThirdQuoteFragment;->b0:Lcom/kubi/payment/third/quote/ThirdQuoteFragment$Companion;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 112
    move-result-object p0

    .line 113
    .line 114
    .line 115
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    move-result-object v3

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getCryptoCurrency()Ljava/lang/String;

    .line 120
    move-result-object p0

    .line 121
    .line 122
    .line 123
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    move-result-object v4

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatAmount()Ljava/lang/String;

    .line 128
    move-result-object p0

    .line 129
    .line 130
    .line 131
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    move-result-object v5

    .line 133
    move-object v2, p1

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v1 .. v6}, Lcom/kubi/payment/third/quote/ThirdQuoteFragment$Companion;->startFragment(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    return-void
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
.end method

.method public static final t(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "B7BuyZenConfirm"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;->Q3(Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/payment/helper/PreCheckHelper;->a:Lcom/kubi/payment/helper/PreCheckHelper;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "getChildFragmentManager(...)"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/kubi/payment/helper/PreCheckHelper;->l(Landroidx/fragment/app/FragmentManager;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    sget-object v0, Lcom/kubi/payment/fast/buy/popularpay/zen/ZenConfirmFragment;->Z:Lcom/kubi/payment/fast/buy/popularpay/zen/ZenConfirmFragment$Companion;

    .line 25
    .line 26
    const-string v1, "submitbutton"

    .line 27
    const/4 v2, 0x4

    .line 28
    .line 29
    const-string v3, "B7PaymentMethod"

    .line 30
    const/4 v4, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v1, v4, v2, v4}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1, p0, p2, v1}, Lcom/kubi/payment/fast/buy/popularpay/zen/ZenConfirmFragment$Companion;->launch(Landroid/content/Context;Lcom/kubi/sdk/BaseFragment;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;)V

    .line 38
    :cond_0
    return-void
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
.end method

.method public static final u(Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Ljava/lang/String;)V
    .locals 16

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getName()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getChannelId()Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatCurrency()Ljava/lang/String;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    .line 33
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getCryptoCurrency()Ljava/lang/String;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    .line 41
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v6

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getFiatAmount()Ljava/lang/String;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    .line 49
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v7

    .line 51
    .line 52
    .line 53
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getBankCardInfo()Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;

    .line 54
    move-result-object v5

    .line 55
    const/4 v8, 0x0

    .line 56
    .line 57
    if-eqz v5, :cond_0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;->getCardId()Ljava/lang/String;

    .line 61
    move-result-object v5

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move-object v5, v8

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getAdInfo()Lcom/kubi/payment/fast/data/entities/PaymentMethodList$AdInfo;

    .line 67
    move-result-object v9

    .line 68
    .line 69
    if-eqz v9, :cond_1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$AdInfo;->getAdId()Ljava/lang/String;

    .line 73
    move-result-object v9

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move-object v9, v8

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;->getAdInfo()Lcom/kubi/payment/fast/data/entities/PaymentMethodList$AdInfo;

    .line 79
    move-result-object v10

    .line 80
    .line 81
    if-eqz v10, :cond_2

    .line 82
    .line 83
    .line 84
    invoke-virtual {v10}, Lcom/kubi/payment/fast/data/entities/PaymentMethodList$AdInfo;->getPayTypeCode()Ljava/lang/String;

    .line 85
    move-result-object v8

    .line 86
    :cond_2
    move-object v10, v8

    .line 87
    .line 88
    const/16 v14, 0x1c10

    .line 89
    const/4 v15, 0x0

    .line 90
    move-object v8, v5

    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v12, 0x0

    .line 94
    const/4 v13, 0x0

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v0 .. v15}, Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/payment/fast/buy/recurring/RecurringFrequency;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 98
    .line 99
    sget-object v1, Lcom/kubi/payment/fasttradev2/buy/confirm/p2p/BuyP2PConfirmFragment;->Z:Lcom/kubi/payment/fasttradev2/buy/confirm/p2p/BuyP2PConfirmFragment$Companion;

    .line 100
    .line 101
    move-object/from16 v2, p0

    .line 102
    .line 103
    move-object/from16 v3, p3

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v2, v0, v3}, Lcom/kubi/payment/fasttradev2/buy/confirm/p2p/BuyP2PConfirmFragment$Companion;->launch(Landroid/content/Context;Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;Ljava/lang/String;)V

    .line 107
    return-void
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
.end method

.method public static final v(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Landroid/content/Context;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lcom/kubi/payment/fast/paymentmethod/ExtraParams;)V
    .locals 7
    .param p0    # Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/payment/fast/paymentmethod/ExtraParams;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "context"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    new-instance v1, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt$previewOrderOneTimePurchase$1;

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v2, p0

    .line 22
    move-object v4, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v5, p3

    .line 25
    .line 26
    .line 27
    invoke-direct/range {v1 .. v6}, Lcom/kubi/payment/fast/paymentmethod/BuyHelperKt$previewOrderOneTimePurchase$1;-><init>(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Landroid/content/Context;Lcom/kubi/payment/fast/paymentmethod/ExtraParams;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 31
    return-void
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
.end method
