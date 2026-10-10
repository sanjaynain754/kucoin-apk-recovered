.class public final Lkotlin/jvm/internal/ClassReference$Companion;
.super Ljava/lang/Object;
.source "ClassReference.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/jvm/internal/ClassReference;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\u0006J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\u0006J\u001c\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\u0006R&\u0010\u0004\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u0006\u0012\u0004\u0012\u00020\u00080\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lkotlin/jvm/internal/ClassReference$Companion;",
        "",
        "<init>",
        "()V",
        "FUNCTION_CLASSES",
        "",
        "Ljava/lang/Class;",
        "Lkotlin/Function;",
        "",
        "classFqNameOf",
        "",
        "type",
        "simpleNameOf",
        "getClassSimpleName",
        "jClass",
        "getClassQualifiedName",
        "isInstance",
        "",
        "value",
        "kotlin-stdlib"
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
        "SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/ClassReference$Companion;-><init>()V

    return-void
.end method

.method private final classFqNameOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "kotlin.Int"

    .line 7
    .line 8
    const-string v2, "kotlin.Float"

    .line 9
    .line 10
    const-string v3, "kotlin.Short"

    .line 11
    .line 12
    const-string v4, "kotlin.Char"

    .line 13
    .line 14
    const-string v5, "kotlin.Boolean"

    .line 15
    .line 16
    const-string v6, "kotlin.Byte"

    .line 17
    .line 18
    const-string v7, "kotlin.Long"

    .line 19
    .line 20
    const-string v8, "kotlin.Double"

    .line 21
    .line 22
    .line 23
    sparse-switch v0, :sswitch_data_0

    .line 24
    .line 25
    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    packed-switch v0, :pswitch_data_1

    .line 30
    .line 31
    .line 32
    packed-switch v0, :pswitch_data_2

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :pswitch_0
    const-string v0, "kotlin.jvm.functions.Function9"

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :cond_0
    const-string p1, "kotlin.Function9"

    .line 47
    return-object p1

    .line 48
    .line 49
    :pswitch_1
    const-string v0, "kotlin.jvm.functions.Function8"

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    move-result p1

    .line 54
    .line 55
    if-nez p1, :cond_1

    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_1
    const-string p1, "kotlin.Function8"

    .line 60
    return-object p1

    .line 61
    .line 62
    :pswitch_2
    const-string v0, "kotlin.jvm.functions.Function7"

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    move-result p1

    .line 67
    .line 68
    if-nez p1, :cond_2

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :cond_2
    const-string p1, "kotlin.Function7"

    .line 73
    return-object p1

    .line 74
    .line 75
    :pswitch_3
    const-string v0, "kotlin.jvm.functions.Function6"

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    move-result p1

    .line 80
    .line 81
    if-nez p1, :cond_3

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :cond_3
    const-string p1, "kotlin.Function6"

    .line 86
    return-object p1

    .line 87
    .line 88
    :pswitch_4
    const-string v0, "kotlin.jvm.functions.Function5"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    move-result p1

    .line 93
    .line 94
    if-nez p1, :cond_4

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :cond_4
    const-string p1, "kotlin.Function5"

    .line 99
    return-object p1

    .line 100
    .line 101
    :pswitch_5
    const-string v0, "kotlin.jvm.functions.Function4"

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    move-result p1

    .line 106
    .line 107
    if-nez p1, :cond_5

    .line 108
    .line 109
    goto/16 :goto_0

    .line 110
    .line 111
    :cond_5
    const-string p1, "kotlin.Function4"

    .line 112
    return-object p1

    .line 113
    .line 114
    :pswitch_6
    const-string v0, "kotlin.jvm.functions.Function3"

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    move-result p1

    .line 119
    .line 120
    if-nez p1, :cond_6

    .line 121
    .line 122
    goto/16 :goto_0

    .line 123
    .line 124
    :cond_6
    const-string p1, "kotlin.Function3"

    .line 125
    return-object p1

    .line 126
    .line 127
    :pswitch_7
    const-string v0, "kotlin.jvm.functions.Function2"

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    move-result p1

    .line 132
    .line 133
    if-nez p1, :cond_7

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_7
    const-string p1, "kotlin.Function2"

    .line 138
    return-object p1

    .line 139
    .line 140
    :pswitch_8
    const-string v0, "kotlin.jvm.functions.Function1"

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    move-result p1

    .line 145
    .line 146
    if-nez p1, :cond_8

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_8
    const-string p1, "kotlin.Function1"

    .line 151
    return-object p1

    .line 152
    .line 153
    :pswitch_9
    const-string v0, "kotlin.jvm.functions.Function0"

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    move-result p1

    .line 158
    .line 159
    if-nez p1, :cond_9

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_9
    const-string p1, "kotlin.Function0"

    .line 164
    return-object p1

    .line 165
    .line 166
    :pswitch_a
    const-string v0, "kotlin.jvm.functions.Function22"

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    move-result p1

    .line 171
    .line 172
    if-nez p1, :cond_a

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_a
    const-string p1, "kotlin.Function22"

    .line 177
    return-object p1

    .line 178
    .line 179
    :pswitch_b
    const-string v0, "kotlin.jvm.functions.Function21"

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    move-result p1

    .line 184
    .line 185
    if-nez p1, :cond_b

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_b
    const-string p1, "kotlin.Function21"

    .line 190
    return-object p1

    .line 191
    .line 192
    :pswitch_c
    const-string v0, "kotlin.jvm.functions.Function20"

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    move-result p1

    .line 197
    .line 198
    if-nez p1, :cond_c

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_c
    const-string p1, "kotlin.Function20"

    .line 203
    return-object p1

    .line 204
    .line 205
    :pswitch_d
    const-string v0, "kotlin.jvm.functions.Function19"

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    move-result p1

    .line 210
    .line 211
    if-nez p1, :cond_d

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_d
    const-string p1, "kotlin.Function19"

    .line 216
    return-object p1

    .line 217
    .line 218
    :pswitch_e
    const-string v0, "kotlin.jvm.functions.Function18"

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    move-result p1

    .line 223
    .line 224
    if-nez p1, :cond_e

    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :cond_e
    const-string p1, "kotlin.Function18"

    .line 229
    return-object p1

    .line 230
    .line 231
    :pswitch_f
    const-string v0, "kotlin.jvm.functions.Function17"

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    move-result p1

    .line 236
    .line 237
    if-nez p1, :cond_f

    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :cond_f
    const-string p1, "kotlin.Function17"

    .line 242
    return-object p1

    .line 243
    .line 244
    :pswitch_10
    const-string v0, "kotlin.jvm.functions.Function16"

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    move-result p1

    .line 249
    .line 250
    if-nez p1, :cond_10

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_10
    const-string p1, "kotlin.Function16"

    .line 255
    return-object p1

    .line 256
    .line 257
    :pswitch_11
    const-string v0, "kotlin.jvm.functions.Function15"

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    move-result p1

    .line 262
    .line 263
    if-nez p1, :cond_11

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :cond_11
    const-string p1, "kotlin.Function15"

    .line 268
    return-object p1

    .line 269
    .line 270
    :pswitch_12
    const-string v0, "kotlin.jvm.functions.Function14"

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    move-result p1

    .line 275
    .line 276
    if-nez p1, :cond_12

    .line 277
    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :cond_12
    const-string p1, "kotlin.Function14"

    .line 281
    return-object p1

    .line 282
    .line 283
    :pswitch_13
    const-string v0, "kotlin.jvm.functions.Function13"

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    move-result p1

    .line 288
    .line 289
    if-nez p1, :cond_13

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :cond_13
    const-string p1, "kotlin.Function13"

    .line 294
    return-object p1

    .line 295
    .line 296
    :pswitch_14
    const-string v0, "kotlin.jvm.functions.Function12"

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    move-result p1

    .line 301
    .line 302
    if-nez p1, :cond_14

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :cond_14
    const-string p1, "kotlin.Function12"

    .line 307
    return-object p1

    .line 308
    .line 309
    :pswitch_15
    const-string v0, "kotlin.jvm.functions.Function11"

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    move-result p1

    .line 314
    .line 315
    if-nez p1, :cond_15

    .line 316
    .line 317
    goto/16 :goto_0

    .line 318
    .line 319
    :cond_15
    const-string p1, "kotlin.Function11"

    .line 320
    return-object p1

    .line 321
    .line 322
    :pswitch_16
    const-string v0, "kotlin.jvm.functions.Function10"

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    move-result p1

    .line 327
    .line 328
    if-nez p1, :cond_16

    .line 329
    .line 330
    goto/16 :goto_0

    .line 331
    .line 332
    :cond_16
    const-string p1, "kotlin.Function10"

    .line 333
    return-object p1

    .line 334
    .line 335
    :sswitch_0
    const-string v0, "kotlin.jvm.internal.IntCompanionObject"

    .line 336
    .line 337
    .line 338
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 339
    move-result p1

    .line 340
    .line 341
    if-nez p1, :cond_17

    .line 342
    .line 343
    goto/16 :goto_0

    .line 344
    .line 345
    :cond_17
    const-string p1, "kotlin.Int.Companion"

    .line 346
    return-object p1

    .line 347
    .line 348
    :sswitch_1
    const-string v0, "java.lang.Throwable"

    .line 349
    .line 350
    .line 351
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    move-result p1

    .line 353
    .line 354
    if-nez p1, :cond_18

    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :cond_18
    const-string p1, "kotlin.Throwable"

    .line 359
    return-object p1

    .line 360
    .line 361
    :sswitch_2
    const-string v0, "kotlin.jvm.internal.BooleanCompanionObject"

    .line 362
    .line 363
    .line 364
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    move-result p1

    .line 366
    .line 367
    if-nez p1, :cond_19

    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :cond_19
    const-string p1, "kotlin.Boolean.Companion"

    .line 372
    return-object p1

    .line 373
    .line 374
    :sswitch_3
    const-string v0, "java.lang.Iterable"

    .line 375
    .line 376
    .line 377
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    move-result p1

    .line 379
    .line 380
    if-nez p1, :cond_1a

    .line 381
    .line 382
    goto/16 :goto_0

    .line 383
    .line 384
    :cond_1a
    const-string p1, "kotlin.collections.Iterable"

    .line 385
    return-object p1

    .line 386
    .line 387
    :sswitch_4
    const-string v0, "java.lang.String"

    .line 388
    .line 389
    .line 390
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    move-result p1

    .line 392
    .line 393
    if-nez p1, :cond_1b

    .line 394
    .line 395
    goto/16 :goto_0

    .line 396
    .line 397
    :cond_1b
    const-string p1, "kotlin.String"

    .line 398
    return-object p1

    .line 399
    .line 400
    :sswitch_5
    const-string v0, "java.lang.Object"

    .line 401
    .line 402
    .line 403
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    move-result p1

    .line 405
    .line 406
    if-nez p1, :cond_1c

    .line 407
    .line 408
    goto/16 :goto_0

    .line 409
    .line 410
    :cond_1c
    const-string p1, "kotlin.Any"

    .line 411
    return-object p1

    .line 412
    .line 413
    :sswitch_6
    const-string v0, "java.lang.Number"

    .line 414
    .line 415
    .line 416
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 417
    move-result p1

    .line 418
    .line 419
    if-nez p1, :cond_1d

    .line 420
    .line 421
    goto/16 :goto_0

    .line 422
    .line 423
    :cond_1d
    const-string p1, "kotlin.Number"

    .line 424
    return-object p1

    .line 425
    .line 426
    :sswitch_7
    const-string v0, "java.lang.Double"

    .line 427
    .line 428
    .line 429
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 430
    move-result p1

    .line 431
    .line 432
    if-nez p1, :cond_1e

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    :cond_1e
    return-object v8

    .line 436
    .line 437
    :sswitch_8
    const-string v0, "kotlin.jvm.internal.StringCompanionObject"

    .line 438
    .line 439
    .line 440
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 441
    move-result p1

    .line 442
    .line 443
    if-nez p1, :cond_1f

    .line 444
    .line 445
    goto/16 :goto_0

    .line 446
    .line 447
    :cond_1f
    const-string p1, "kotlin.String.Companion"

    .line 448
    return-object p1

    .line 449
    .line 450
    :sswitch_9
    const-string v0, "java.util.ListIterator"

    .line 451
    .line 452
    .line 453
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 454
    move-result p1

    .line 455
    .line 456
    if-nez p1, :cond_20

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :cond_20
    const-string p1, "kotlin.collections.ListIterator"

    .line 461
    return-object p1

    .line 462
    .line 463
    :sswitch_a
    const-string v0, "java.util.Iterator"

    .line 464
    .line 465
    .line 466
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 467
    move-result p1

    .line 468
    .line 469
    if-nez p1, :cond_21

    .line 470
    .line 471
    goto/16 :goto_0

    .line 472
    .line 473
    :cond_21
    const-string p1, "kotlin.collections.Iterator"

    .line 474
    return-object p1

    .line 475
    .line 476
    :sswitch_b
    const-string v0, "kotlin.jvm.internal.FloatCompanionObject"

    .line 477
    .line 478
    .line 479
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 480
    move-result p1

    .line 481
    .line 482
    if-nez p1, :cond_22

    .line 483
    .line 484
    goto/16 :goto_0

    .line 485
    .line 486
    :cond_22
    const-string p1, "kotlin.Float.Companion"

    .line 487
    return-object p1

    .line 488
    .line 489
    :sswitch_c
    const-string v0, "java.lang.Long"

    .line 490
    .line 491
    .line 492
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 493
    move-result p1

    .line 494
    .line 495
    if-nez p1, :cond_23

    .line 496
    .line 497
    goto/16 :goto_0

    .line 498
    :cond_23
    return-object v7

    .line 499
    .line 500
    :sswitch_d
    const-string v0, "java.lang.Enum"

    .line 501
    .line 502
    .line 503
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 504
    move-result p1

    .line 505
    .line 506
    if-nez p1, :cond_24

    .line 507
    .line 508
    goto/16 :goto_0

    .line 509
    .line 510
    :cond_24
    const-string p1, "kotlin.Enum"

    .line 511
    return-object p1

    .line 512
    .line 513
    :sswitch_e
    const-string v0, "java.lang.Byte"

    .line 514
    .line 515
    .line 516
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    move-result p1

    .line 518
    .line 519
    if-nez p1, :cond_25

    .line 520
    .line 521
    goto/16 :goto_0

    .line 522
    :cond_25
    return-object v6

    .line 523
    .line 524
    :sswitch_f
    const-string v0, "java.lang.Boolean"

    .line 525
    .line 526
    .line 527
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 528
    move-result p1

    .line 529
    .line 530
    if-nez p1, :cond_26

    .line 531
    .line 532
    goto/16 :goto_0

    .line 533
    :cond_26
    return-object v5

    .line 534
    .line 535
    :sswitch_10
    const-string v0, "kotlin.jvm.internal.EnumCompanionObject"

    .line 536
    .line 537
    .line 538
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 539
    move-result p1

    .line 540
    .line 541
    if-nez p1, :cond_27

    .line 542
    .line 543
    goto/16 :goto_0

    .line 544
    .line 545
    :cond_27
    const-string p1, "kotlin.Enum.Companion"

    .line 546
    return-object p1

    .line 547
    .line 548
    :sswitch_11
    const-string v0, "java.lang.Character"

    .line 549
    .line 550
    .line 551
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 552
    move-result p1

    .line 553
    .line 554
    if-nez p1, :cond_28

    .line 555
    .line 556
    goto/16 :goto_0

    .line 557
    :cond_28
    return-object v4

    .line 558
    .line 559
    .line 560
    :sswitch_12
    const-string/jumbo v0, "short"

    .line 561
    .line 562
    .line 563
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 564
    move-result p1

    .line 565
    .line 566
    if-nez p1, :cond_29

    .line 567
    .line 568
    goto/16 :goto_0

    .line 569
    :cond_29
    return-object v3

    .line 570
    .line 571
    :sswitch_13
    const-string v0, "float"

    .line 572
    .line 573
    .line 574
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 575
    move-result p1

    .line 576
    .line 577
    if-nez p1, :cond_2a

    .line 578
    .line 579
    goto/16 :goto_0

    .line 580
    :cond_2a
    return-object v2

    .line 581
    .line 582
    :sswitch_14
    const-string v0, "kotlin.jvm.internal.ShortCompanionObject"

    .line 583
    .line 584
    .line 585
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 586
    move-result p1

    .line 587
    .line 588
    if-nez p1, :cond_2b

    .line 589
    .line 590
    goto/16 :goto_0

    .line 591
    .line 592
    :cond_2b
    const-string p1, "kotlin.Short.Companion"

    .line 593
    return-object p1

    .line 594
    .line 595
    :sswitch_15
    const-string v0, "java.util.List"

    .line 596
    .line 597
    .line 598
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 599
    move-result p1

    .line 600
    .line 601
    if-nez p1, :cond_2c

    .line 602
    .line 603
    goto/16 :goto_0

    .line 604
    .line 605
    :cond_2c
    const-string p1, "kotlin.collections.List"

    .line 606
    return-object p1

    .line 607
    .line 608
    :sswitch_16
    const-string v0, "boolean"

    .line 609
    .line 610
    .line 611
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 612
    move-result p1

    .line 613
    .line 614
    if-nez p1, :cond_2d

    .line 615
    .line 616
    goto/16 :goto_0

    .line 617
    :cond_2d
    return-object v5

    .line 618
    .line 619
    :sswitch_17
    const-string v0, "long"

    .line 620
    .line 621
    .line 622
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 623
    move-result p1

    .line 624
    .line 625
    if-nez p1, :cond_2e

    .line 626
    .line 627
    goto/16 :goto_0

    .line 628
    :cond_2e
    return-object v7

    .line 629
    .line 630
    :sswitch_18
    const-string v0, "char"

    .line 631
    .line 632
    .line 633
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 634
    move-result p1

    .line 635
    .line 636
    if-nez p1, :cond_2f

    .line 637
    .line 638
    goto/16 :goto_0

    .line 639
    :cond_2f
    return-object v4

    .line 640
    .line 641
    :sswitch_19
    const-string v0, "byte"

    .line 642
    .line 643
    .line 644
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 645
    move-result p1

    .line 646
    .line 647
    if-nez p1, :cond_30

    .line 648
    .line 649
    goto/16 :goto_0

    .line 650
    :cond_30
    return-object v6

    .line 651
    .line 652
    :sswitch_1a
    const-string v0, "int"

    .line 653
    .line 654
    .line 655
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 656
    move-result p1

    .line 657
    .line 658
    if-nez p1, :cond_31

    .line 659
    .line 660
    goto/16 :goto_0

    .line 661
    :cond_31
    return-object v1

    .line 662
    .line 663
    :sswitch_1b
    const-string v0, "java.util.Map$Entry"

    .line 664
    .line 665
    .line 666
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 667
    move-result p1

    .line 668
    .line 669
    if-nez p1, :cond_32

    .line 670
    .line 671
    goto/16 :goto_0

    .line 672
    .line 673
    :cond_32
    const-string p1, "kotlin.collections.Map.Entry"

    .line 674
    return-object p1

    .line 675
    .line 676
    :sswitch_1c
    const-string v0, "kotlin.jvm.internal.LongCompanionObject"

    .line 677
    .line 678
    .line 679
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 680
    move-result p1

    .line 681
    .line 682
    if-nez p1, :cond_33

    .line 683
    .line 684
    goto/16 :goto_0

    .line 685
    .line 686
    :cond_33
    const-string p1, "kotlin.Long.Companion"

    .line 687
    return-object p1

    .line 688
    .line 689
    :sswitch_1d
    const-string v0, "kotlin.jvm.internal.CharCompanionObject"

    .line 690
    .line 691
    .line 692
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 693
    move-result p1

    .line 694
    .line 695
    if-nez p1, :cond_34

    .line 696
    .line 697
    goto/16 :goto_0

    .line 698
    .line 699
    :cond_34
    const-string p1, "kotlin.Char.Companion"

    .line 700
    return-object p1

    .line 701
    .line 702
    :sswitch_1e
    const-string v0, "java.lang.Short"

    .line 703
    .line 704
    .line 705
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 706
    move-result p1

    .line 707
    .line 708
    if-nez p1, :cond_35

    .line 709
    .line 710
    goto/16 :goto_0

    .line 711
    :cond_35
    return-object v3

    .line 712
    .line 713
    :sswitch_1f
    const-string v0, "java.lang.Float"

    .line 714
    .line 715
    .line 716
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 717
    move-result p1

    .line 718
    .line 719
    if-nez p1, :cond_36

    .line 720
    .line 721
    goto/16 :goto_0

    .line 722
    :cond_36
    return-object v2

    .line 723
    .line 724
    :sswitch_20
    const-string v0, "java.util.Collection"

    .line 725
    .line 726
    .line 727
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 728
    move-result p1

    .line 729
    .line 730
    if-nez p1, :cond_37

    .line 731
    .line 732
    goto/16 :goto_0

    .line 733
    .line 734
    :cond_37
    const-string p1, "kotlin.collections.Collection"

    .line 735
    return-object p1

    .line 736
    .line 737
    :sswitch_21
    const-string v0, "java.lang.CharSequence"

    .line 738
    .line 739
    .line 740
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 741
    move-result p1

    .line 742
    .line 743
    if-nez p1, :cond_38

    .line 744
    .line 745
    goto/16 :goto_0

    .line 746
    .line 747
    :cond_38
    const-string p1, "kotlin.CharSequence"

    .line 748
    return-object p1

    .line 749
    .line 750
    :sswitch_22
    const-string v0, "kotlin.jvm.internal.ByteCompanionObject"

    .line 751
    .line 752
    .line 753
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 754
    move-result p1

    .line 755
    .line 756
    if-nez p1, :cond_39

    .line 757
    goto :goto_0

    .line 758
    .line 759
    :cond_39
    const-string p1, "kotlin.Byte.Companion"

    .line 760
    return-object p1

    .line 761
    .line 762
    :sswitch_23
    const-string v0, "double"

    .line 763
    .line 764
    .line 765
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 766
    move-result p1

    .line 767
    .line 768
    if-nez p1, :cond_3a

    .line 769
    goto :goto_0

    .line 770
    :cond_3a
    return-object v8

    .line 771
    .line 772
    :sswitch_24
    const-string v0, "java.util.Set"

    .line 773
    .line 774
    .line 775
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 776
    move-result p1

    .line 777
    .line 778
    if-nez p1, :cond_3b

    .line 779
    goto :goto_0

    .line 780
    .line 781
    :cond_3b
    const-string p1, "kotlin.collections.Set"

    .line 782
    return-object p1

    .line 783
    .line 784
    :sswitch_25
    const-string v0, "java.util.Map"

    .line 785
    .line 786
    .line 787
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 788
    move-result p1

    .line 789
    .line 790
    if-nez p1, :cond_3c

    .line 791
    goto :goto_0

    .line 792
    .line 793
    :cond_3c
    const-string p1, "kotlin.collections.Map"

    .line 794
    return-object p1

    .line 795
    .line 796
    :sswitch_26
    const-string v0, "java.lang.Comparable"

    .line 797
    .line 798
    .line 799
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 800
    move-result p1

    .line 801
    .line 802
    if-nez p1, :cond_3d

    .line 803
    goto :goto_0

    .line 804
    .line 805
    :cond_3d
    const-string p1, "kotlin.Comparable"

    .line 806
    return-object p1

    .line 807
    .line 808
    :sswitch_27
    const-string v0, "java.lang.annotation.Annotation"

    .line 809
    .line 810
    .line 811
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 812
    move-result p1

    .line 813
    .line 814
    if-nez p1, :cond_3e

    .line 815
    goto :goto_0

    .line 816
    .line 817
    :cond_3e
    const-string p1, "kotlin.Annotation"

    .line 818
    return-object p1

    .line 819
    .line 820
    :sswitch_28
    const-string v0, "java.lang.Cloneable"

    .line 821
    .line 822
    .line 823
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 824
    move-result p1

    .line 825
    .line 826
    if-nez p1, :cond_3f

    .line 827
    goto :goto_0

    .line 828
    .line 829
    :cond_3f
    const-string p1, "kotlin.Cloneable"

    .line 830
    return-object p1

    .line 831
    .line 832
    :sswitch_29
    const-string v0, "java.lang.Integer"

    .line 833
    .line 834
    .line 835
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 836
    move-result p1

    .line 837
    .line 838
    if-nez p1, :cond_40

    .line 839
    goto :goto_0

    .line 840
    :cond_40
    return-object v1

    .line 841
    .line 842
    :sswitch_2a
    const-string v0, "kotlin.jvm.internal.DoubleCompanionObject"

    .line 843
    .line 844
    .line 845
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 846
    move-result p1

    .line 847
    .line 848
    if-nez p1, :cond_41

    .line 849
    :goto_0
    const/4 p1, 0x0

    .line 850
    return-object p1

    .line 851
    .line 852
    :cond_41
    const-string p1, "kotlin.Double.Companion"

    .line 853
    return-object p1

    .line 854
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x7ae0c43d -> :sswitch_2a
        -0x7a988a96 -> :sswitch_29
        -0x793eea9d -> :sswitch_28
        -0x75fda146 -> :sswitch_27
        -0x5dab6ad2 -> :sswitch_26
        -0x52743c64 -> :sswitch_25
        -0x5274255e -> :sswitch_24
        -0x4f08842f -> :sswitch_23
        -0x46781814 -> :sswitch_22
        -0x3f507f75 -> :sswitch_21
        -0x2906f7a2 -> :sswitch_20
        -0x1f76ce78 -> :sswitch_1f
        -0x1ec16c58 -> :sswitch_1e
        -0xeb0f022 -> :sswitch_1d
        -0xc5a9408 -> :sswitch_1c
        -0x9d7d2b6 -> :sswitch_1b
        0x197ef -> :sswitch_1a
        0x2e6108 -> :sswitch_19
        0x2e9356 -> :sswitch_18
        0x32c67c -> :sswitch_17
        0x3db6c28 -> :sswitch_16
        0x3ec5a5e -> :sswitch_15
        0x49a71c6 -> :sswitch_14
        0x5d0225c -> :sswitch_13
        0x685847c -> :sswitch_12
        0x9415455 -> :sswitch_11
        0xd7b22d3 -> :sswitch_10
        0x148d6054 -> :sswitch_f
        0x17c0bc5c -> :sswitch_e
        0x17c1f055 -> :sswitch_d
        0x17c521d0 -> :sswitch_c
        0x1cc457e6 -> :sswitch_b
        0x1dcad22e -> :sswitch_a
        0x226988ec -> :sswitch_9
        0x23b44f83 -> :sswitch_8
        0x2d605225 -> :sswitch_7
        0x3ec1b19d -> :sswitch_6
        0x3f697993 -> :sswitch_5
        0x473e3665 -> :sswitch_4
        0x4c0855c6 -> :sswitch_3
        0x52797ada -> :sswitch_2
        0x612cf26c -> :sswitch_1
        0x6fe35bb3 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch -0x6bf3d83c
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch -0x6bf3d81d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x4c695eb
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method private final simpleNameOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "Int"

    .line 7
    .line 8
    const-string v2, "Float"

    .line 9
    .line 10
    const-string v3, "Short"

    .line 11
    .line 12
    const-string v4, "Char"

    .line 13
    .line 14
    const-string v5, "Boolean"

    .line 15
    .line 16
    const-string v6, "Byte"

    .line 17
    .line 18
    const-string v7, "Long"

    .line 19
    .line 20
    const-string v8, "Double"

    .line 21
    .line 22
    const-string v9, "Companion"

    .line 23
    .line 24
    .line 25
    sparse-switch v0, :sswitch_data_0

    .line 26
    .line 27
    .line 28
    packed-switch v0, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    packed-switch v0, :pswitch_data_1

    .line 32
    .line 33
    .line 34
    packed-switch v0, :pswitch_data_2

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :pswitch_0
    const-string v0, "kotlin.jvm.functions.Function9"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result p1

    .line 43
    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_0
    const-string p1, "Function9"

    .line 49
    return-object p1

    .line 50
    .line 51
    :pswitch_1
    const-string v0, "kotlin.jvm.functions.Function8"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    move-result p1

    .line 56
    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_1
    const-string p1, "Function8"

    .line 62
    return-object p1

    .line 63
    .line 64
    :pswitch_2
    const-string v0, "kotlin.jvm.functions.Function7"

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    move-result p1

    .line 69
    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :cond_2
    const-string p1, "Function7"

    .line 75
    return-object p1

    .line 76
    .line 77
    :pswitch_3
    const-string v0, "kotlin.jvm.functions.Function6"

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    move-result p1

    .line 82
    .line 83
    if-nez p1, :cond_3

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_3
    const-string p1, "Function6"

    .line 88
    return-object p1

    .line 89
    .line 90
    :pswitch_4
    const-string v0, "kotlin.jvm.functions.Function5"

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result p1

    .line 95
    .line 96
    if-nez p1, :cond_4

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :cond_4
    const-string p1, "Function5"

    .line 101
    return-object p1

    .line 102
    .line 103
    :pswitch_5
    const-string v0, "kotlin.jvm.functions.Function4"

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    move-result p1

    .line 108
    .line 109
    if-nez p1, :cond_5

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_5
    const-string p1, "Function4"

    .line 114
    return-object p1

    .line 115
    .line 116
    :pswitch_6
    const-string v0, "kotlin.jvm.functions.Function3"

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    move-result p1

    .line 121
    .line 122
    if-nez p1, :cond_6

    .line 123
    .line 124
    goto/16 :goto_0

    .line 125
    .line 126
    :cond_6
    const-string p1, "Function3"

    .line 127
    return-object p1

    .line 128
    .line 129
    :pswitch_7
    const-string v0, "kotlin.jvm.functions.Function2"

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    move-result p1

    .line 134
    .line 135
    if-nez p1, :cond_7

    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :cond_7
    const-string p1, "Function2"

    .line 140
    return-object p1

    .line 141
    .line 142
    :pswitch_8
    const-string v0, "kotlin.jvm.functions.Function1"

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    move-result p1

    .line 147
    .line 148
    if-nez p1, :cond_8

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_8
    const-string p1, "Function1"

    .line 153
    return-object p1

    .line 154
    .line 155
    :pswitch_9
    const-string v0, "kotlin.jvm.functions.Function0"

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    move-result p1

    .line 160
    .line 161
    if-nez p1, :cond_9

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_9
    const-string p1, "Function0"

    .line 166
    return-object p1

    .line 167
    .line 168
    :pswitch_a
    const-string v0, "kotlin.jvm.functions.Function22"

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    move-result p1

    .line 173
    .line 174
    if-nez p1, :cond_a

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_a
    const-string p1, "Function22"

    .line 179
    return-object p1

    .line 180
    .line 181
    :pswitch_b
    const-string v0, "kotlin.jvm.functions.Function21"

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    move-result p1

    .line 186
    .line 187
    if-nez p1, :cond_b

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_b
    const-string p1, "Function21"

    .line 192
    return-object p1

    .line 193
    .line 194
    :pswitch_c
    const-string v0, "kotlin.jvm.functions.Function20"

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    move-result p1

    .line 199
    .line 200
    if-nez p1, :cond_c

    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_c
    const-string p1, "Function20"

    .line 205
    return-object p1

    .line 206
    .line 207
    :pswitch_d
    const-string v0, "kotlin.jvm.functions.Function19"

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    move-result p1

    .line 212
    .line 213
    if-nez p1, :cond_d

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_d
    const-string p1, "Function19"

    .line 218
    return-object p1

    .line 219
    .line 220
    :pswitch_e
    const-string v0, "kotlin.jvm.functions.Function18"

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    move-result p1

    .line 225
    .line 226
    if-nez p1, :cond_e

    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :cond_e
    const-string p1, "Function18"

    .line 231
    return-object p1

    .line 232
    .line 233
    :pswitch_f
    const-string v0, "kotlin.jvm.functions.Function17"

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    move-result p1

    .line 238
    .line 239
    if-nez p1, :cond_f

    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_f
    const-string p1, "Function17"

    .line 244
    return-object p1

    .line 245
    .line 246
    :pswitch_10
    const-string v0, "kotlin.jvm.functions.Function16"

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    move-result p1

    .line 251
    .line 252
    if-nez p1, :cond_10

    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_10
    const-string p1, "Function16"

    .line 257
    return-object p1

    .line 258
    .line 259
    :pswitch_11
    const-string v0, "kotlin.jvm.functions.Function15"

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    move-result p1

    .line 264
    .line 265
    if-nez p1, :cond_11

    .line 266
    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :cond_11
    const-string p1, "Function15"

    .line 270
    return-object p1

    .line 271
    .line 272
    :pswitch_12
    const-string v0, "kotlin.jvm.functions.Function14"

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    move-result p1

    .line 277
    .line 278
    if-nez p1, :cond_12

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :cond_12
    const-string p1, "Function14"

    .line 283
    return-object p1

    .line 284
    .line 285
    :pswitch_13
    const-string v0, "kotlin.jvm.functions.Function13"

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    move-result p1

    .line 290
    .line 291
    if-nez p1, :cond_13

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :cond_13
    const-string p1, "Function13"

    .line 296
    return-object p1

    .line 297
    .line 298
    :pswitch_14
    const-string v0, "kotlin.jvm.functions.Function12"

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    move-result p1

    .line 303
    .line 304
    if-nez p1, :cond_14

    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_14
    const-string p1, "Function12"

    .line 309
    return-object p1

    .line 310
    .line 311
    :pswitch_15
    const-string v0, "kotlin.jvm.functions.Function11"

    .line 312
    .line 313
    .line 314
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    move-result p1

    .line 316
    .line 317
    if-nez p1, :cond_15

    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :cond_15
    const-string p1, "Function11"

    .line 322
    return-object p1

    .line 323
    .line 324
    :pswitch_16
    const-string v0, "kotlin.jvm.functions.Function10"

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    move-result p1

    .line 329
    .line 330
    if-nez p1, :cond_16

    .line 331
    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :cond_16
    const-string p1, "Function10"

    .line 335
    return-object p1

    .line 336
    .line 337
    :sswitch_0
    const-string v0, "kotlin.jvm.internal.IntCompanionObject"

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    move-result p1

    .line 342
    .line 343
    if-nez p1, :cond_17

    .line 344
    .line 345
    goto/16 :goto_0

    .line 346
    :cond_17
    return-object v9

    .line 347
    .line 348
    :sswitch_1
    const-string v0, "java.lang.Throwable"

    .line 349
    .line 350
    .line 351
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    move-result p1

    .line 353
    .line 354
    if-nez p1, :cond_18

    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :cond_18
    const-string p1, "Throwable"

    .line 359
    return-object p1

    .line 360
    .line 361
    :sswitch_2
    const-string v0, "kotlin.jvm.internal.BooleanCompanionObject"

    .line 362
    .line 363
    .line 364
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    move-result p1

    .line 366
    .line 367
    if-nez p1, :cond_19

    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    :cond_19
    return-object v9

    .line 371
    .line 372
    :sswitch_3
    const-string v0, "java.lang.Iterable"

    .line 373
    .line 374
    .line 375
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    move-result p1

    .line 377
    .line 378
    if-nez p1, :cond_1a

    .line 379
    .line 380
    goto/16 :goto_0

    .line 381
    .line 382
    :cond_1a
    const-string p1, "Iterable"

    .line 383
    return-object p1

    .line 384
    .line 385
    :sswitch_4
    const-string v0, "java.lang.String"

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    move-result p1

    .line 390
    .line 391
    if-nez p1, :cond_1b

    .line 392
    .line 393
    goto/16 :goto_0

    .line 394
    .line 395
    :cond_1b
    const-string p1, "String"

    .line 396
    return-object p1

    .line 397
    .line 398
    :sswitch_5
    const-string v0, "java.lang.Object"

    .line 399
    .line 400
    .line 401
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    move-result p1

    .line 403
    .line 404
    if-nez p1, :cond_1c

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :cond_1c
    const-string p1, "Any"

    .line 409
    return-object p1

    .line 410
    .line 411
    :sswitch_6
    const-string v0, "java.lang.Number"

    .line 412
    .line 413
    .line 414
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    move-result p1

    .line 416
    .line 417
    if-nez p1, :cond_1d

    .line 418
    .line 419
    goto/16 :goto_0

    .line 420
    .line 421
    :cond_1d
    const-string p1, "Number"

    .line 422
    return-object p1

    .line 423
    .line 424
    :sswitch_7
    const-string v0, "java.lang.Double"

    .line 425
    .line 426
    .line 427
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 428
    move-result p1

    .line 429
    .line 430
    if-nez p1, :cond_1e

    .line 431
    .line 432
    goto/16 :goto_0

    .line 433
    :cond_1e
    return-object v8

    .line 434
    .line 435
    :sswitch_8
    const-string v0, "kotlin.jvm.internal.StringCompanionObject"

    .line 436
    .line 437
    .line 438
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 439
    move-result p1

    .line 440
    .line 441
    if-nez p1, :cond_1f

    .line 442
    .line 443
    goto/16 :goto_0

    .line 444
    :cond_1f
    return-object v9

    .line 445
    .line 446
    :sswitch_9
    const-string v0, "java.util.ListIterator"

    .line 447
    .line 448
    .line 449
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 450
    move-result p1

    .line 451
    .line 452
    if-nez p1, :cond_20

    .line 453
    .line 454
    goto/16 :goto_0

    .line 455
    .line 456
    :cond_20
    const-string p1, "ListIterator"

    .line 457
    return-object p1

    .line 458
    .line 459
    :sswitch_a
    const-string v0, "java.util.Iterator"

    .line 460
    .line 461
    .line 462
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 463
    move-result p1

    .line 464
    .line 465
    if-nez p1, :cond_21

    .line 466
    .line 467
    goto/16 :goto_0

    .line 468
    .line 469
    :cond_21
    const-string p1, "Iterator"

    .line 470
    return-object p1

    .line 471
    .line 472
    :sswitch_b
    const-string v0, "kotlin.jvm.internal.FloatCompanionObject"

    .line 473
    .line 474
    .line 475
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 476
    move-result p1

    .line 477
    .line 478
    if-nez p1, :cond_22

    .line 479
    .line 480
    goto/16 :goto_0

    .line 481
    :cond_22
    return-object v9

    .line 482
    .line 483
    :sswitch_c
    const-string v0, "java.lang.Long"

    .line 484
    .line 485
    .line 486
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    move-result p1

    .line 488
    .line 489
    if-nez p1, :cond_23

    .line 490
    .line 491
    goto/16 :goto_0

    .line 492
    :cond_23
    return-object v7

    .line 493
    .line 494
    :sswitch_d
    const-string v0, "java.lang.Enum"

    .line 495
    .line 496
    .line 497
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 498
    move-result p1

    .line 499
    .line 500
    if-nez p1, :cond_24

    .line 501
    .line 502
    goto/16 :goto_0

    .line 503
    .line 504
    :cond_24
    const-string p1, "Enum"

    .line 505
    return-object p1

    .line 506
    .line 507
    :sswitch_e
    const-string v0, "java.lang.Byte"

    .line 508
    .line 509
    .line 510
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 511
    move-result p1

    .line 512
    .line 513
    if-nez p1, :cond_25

    .line 514
    .line 515
    goto/16 :goto_0

    .line 516
    :cond_25
    return-object v6

    .line 517
    .line 518
    :sswitch_f
    const-string v0, "java.lang.Boolean"

    .line 519
    .line 520
    .line 521
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 522
    move-result p1

    .line 523
    .line 524
    if-nez p1, :cond_26

    .line 525
    .line 526
    goto/16 :goto_0

    .line 527
    :cond_26
    return-object v5

    .line 528
    .line 529
    :sswitch_10
    const-string v0, "kotlin.jvm.internal.EnumCompanionObject"

    .line 530
    .line 531
    .line 532
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 533
    move-result p1

    .line 534
    .line 535
    if-nez p1, :cond_27

    .line 536
    .line 537
    goto/16 :goto_0

    .line 538
    :cond_27
    return-object v9

    .line 539
    .line 540
    :sswitch_11
    const-string v0, "java.lang.Character"

    .line 541
    .line 542
    .line 543
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 544
    move-result p1

    .line 545
    .line 546
    if-nez p1, :cond_28

    .line 547
    .line 548
    goto/16 :goto_0

    .line 549
    :cond_28
    return-object v4

    .line 550
    .line 551
    .line 552
    :sswitch_12
    const-string/jumbo v0, "short"

    .line 553
    .line 554
    .line 555
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 556
    move-result p1

    .line 557
    .line 558
    if-nez p1, :cond_29

    .line 559
    .line 560
    goto/16 :goto_0

    .line 561
    :cond_29
    return-object v3

    .line 562
    .line 563
    :sswitch_13
    const-string v0, "float"

    .line 564
    .line 565
    .line 566
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 567
    move-result p1

    .line 568
    .line 569
    if-nez p1, :cond_2a

    .line 570
    .line 571
    goto/16 :goto_0

    .line 572
    :cond_2a
    return-object v2

    .line 573
    .line 574
    :sswitch_14
    const-string v0, "kotlin.jvm.internal.ShortCompanionObject"

    .line 575
    .line 576
    .line 577
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 578
    move-result p1

    .line 579
    .line 580
    if-nez p1, :cond_2b

    .line 581
    .line 582
    goto/16 :goto_0

    .line 583
    :cond_2b
    return-object v9

    .line 584
    .line 585
    :sswitch_15
    const-string v0, "java.util.List"

    .line 586
    .line 587
    .line 588
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 589
    move-result p1

    .line 590
    .line 591
    if-nez p1, :cond_2c

    .line 592
    .line 593
    goto/16 :goto_0

    .line 594
    .line 595
    :cond_2c
    const-string p1, "List"

    .line 596
    return-object p1

    .line 597
    .line 598
    :sswitch_16
    const-string v0, "boolean"

    .line 599
    .line 600
    .line 601
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 602
    move-result p1

    .line 603
    .line 604
    if-nez p1, :cond_2d

    .line 605
    .line 606
    goto/16 :goto_0

    .line 607
    :cond_2d
    return-object v5

    .line 608
    .line 609
    :sswitch_17
    const-string v0, "long"

    .line 610
    .line 611
    .line 612
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 613
    move-result p1

    .line 614
    .line 615
    if-nez p1, :cond_2e

    .line 616
    .line 617
    goto/16 :goto_0

    .line 618
    :cond_2e
    return-object v7

    .line 619
    .line 620
    :sswitch_18
    const-string v0, "char"

    .line 621
    .line 622
    .line 623
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 624
    move-result p1

    .line 625
    .line 626
    if-nez p1, :cond_2f

    .line 627
    .line 628
    goto/16 :goto_0

    .line 629
    :cond_2f
    return-object v4

    .line 630
    .line 631
    :sswitch_19
    const-string v0, "byte"

    .line 632
    .line 633
    .line 634
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 635
    move-result p1

    .line 636
    .line 637
    if-nez p1, :cond_30

    .line 638
    .line 639
    goto/16 :goto_0

    .line 640
    :cond_30
    return-object v6

    .line 641
    .line 642
    :sswitch_1a
    const-string v0, "int"

    .line 643
    .line 644
    .line 645
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 646
    move-result p1

    .line 647
    .line 648
    if-nez p1, :cond_31

    .line 649
    .line 650
    goto/16 :goto_0

    .line 651
    :cond_31
    return-object v1

    .line 652
    .line 653
    :sswitch_1b
    const-string v0, "java.util.Map$Entry"

    .line 654
    .line 655
    .line 656
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 657
    move-result p1

    .line 658
    .line 659
    if-nez p1, :cond_32

    .line 660
    .line 661
    goto/16 :goto_0

    .line 662
    .line 663
    :cond_32
    const-string p1, "Entry"

    .line 664
    return-object p1

    .line 665
    .line 666
    :sswitch_1c
    const-string v0, "kotlin.jvm.internal.LongCompanionObject"

    .line 667
    .line 668
    .line 669
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 670
    move-result p1

    .line 671
    .line 672
    if-nez p1, :cond_33

    .line 673
    .line 674
    goto/16 :goto_0

    .line 675
    :cond_33
    return-object v9

    .line 676
    .line 677
    :sswitch_1d
    const-string v0, "kotlin.jvm.internal.CharCompanionObject"

    .line 678
    .line 679
    .line 680
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 681
    move-result p1

    .line 682
    .line 683
    if-nez p1, :cond_34

    .line 684
    .line 685
    goto/16 :goto_0

    .line 686
    :cond_34
    return-object v9

    .line 687
    .line 688
    :sswitch_1e
    const-string v0, "java.lang.Short"

    .line 689
    .line 690
    .line 691
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 692
    move-result p1

    .line 693
    .line 694
    if-nez p1, :cond_35

    .line 695
    .line 696
    goto/16 :goto_0

    .line 697
    :cond_35
    return-object v3

    .line 698
    .line 699
    :sswitch_1f
    const-string v0, "java.lang.Float"

    .line 700
    .line 701
    .line 702
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 703
    move-result p1

    .line 704
    .line 705
    if-nez p1, :cond_36

    .line 706
    .line 707
    goto/16 :goto_0

    .line 708
    :cond_36
    return-object v2

    .line 709
    .line 710
    :sswitch_20
    const-string v0, "java.util.Collection"

    .line 711
    .line 712
    .line 713
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 714
    move-result p1

    .line 715
    .line 716
    if-nez p1, :cond_37

    .line 717
    .line 718
    goto/16 :goto_0

    .line 719
    .line 720
    :cond_37
    const-string p1, "Collection"

    .line 721
    return-object p1

    .line 722
    .line 723
    :sswitch_21
    const-string v0, "java.lang.CharSequence"

    .line 724
    .line 725
    .line 726
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 727
    move-result p1

    .line 728
    .line 729
    if-nez p1, :cond_38

    .line 730
    .line 731
    goto/16 :goto_0

    .line 732
    .line 733
    :cond_38
    const-string p1, "CharSequence"

    .line 734
    return-object p1

    .line 735
    .line 736
    :sswitch_22
    const-string v0, "kotlin.jvm.internal.ByteCompanionObject"

    .line 737
    .line 738
    .line 739
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 740
    move-result p1

    .line 741
    .line 742
    if-nez p1, :cond_39

    .line 743
    goto :goto_0

    .line 744
    :cond_39
    return-object v9

    .line 745
    .line 746
    :sswitch_23
    const-string v0, "double"

    .line 747
    .line 748
    .line 749
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 750
    move-result p1

    .line 751
    .line 752
    if-nez p1, :cond_3a

    .line 753
    goto :goto_0

    .line 754
    :cond_3a
    return-object v8

    .line 755
    .line 756
    :sswitch_24
    const-string v0, "java.util.Set"

    .line 757
    .line 758
    .line 759
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 760
    move-result p1

    .line 761
    .line 762
    if-nez p1, :cond_3b

    .line 763
    goto :goto_0

    .line 764
    .line 765
    :cond_3b
    const-string p1, "Set"

    .line 766
    return-object p1

    .line 767
    .line 768
    :sswitch_25
    const-string v0, "java.util.Map"

    .line 769
    .line 770
    .line 771
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 772
    move-result p1

    .line 773
    .line 774
    if-nez p1, :cond_3c

    .line 775
    goto :goto_0

    .line 776
    .line 777
    :cond_3c
    const-string p1, "Map"

    .line 778
    return-object p1

    .line 779
    .line 780
    :sswitch_26
    const-string v0, "java.lang.Comparable"

    .line 781
    .line 782
    .line 783
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 784
    move-result p1

    .line 785
    .line 786
    if-nez p1, :cond_3d

    .line 787
    goto :goto_0

    .line 788
    .line 789
    :cond_3d
    const-string p1, "Comparable"

    .line 790
    return-object p1

    .line 791
    .line 792
    :sswitch_27
    const-string v0, "java.lang.annotation.Annotation"

    .line 793
    .line 794
    .line 795
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 796
    move-result p1

    .line 797
    .line 798
    if-nez p1, :cond_3e

    .line 799
    goto :goto_0

    .line 800
    .line 801
    :cond_3e
    const-string p1, "Annotation"

    .line 802
    return-object p1

    .line 803
    .line 804
    :sswitch_28
    const-string v0, "java.lang.Cloneable"

    .line 805
    .line 806
    .line 807
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 808
    move-result p1

    .line 809
    .line 810
    if-nez p1, :cond_3f

    .line 811
    goto :goto_0

    .line 812
    .line 813
    :cond_3f
    const-string p1, "Cloneable"

    .line 814
    return-object p1

    .line 815
    .line 816
    :sswitch_29
    const-string v0, "java.lang.Integer"

    .line 817
    .line 818
    .line 819
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 820
    move-result p1

    .line 821
    .line 822
    if-nez p1, :cond_40

    .line 823
    goto :goto_0

    .line 824
    :cond_40
    return-object v1

    .line 825
    .line 826
    :sswitch_2a
    const-string v0, "kotlin.jvm.internal.DoubleCompanionObject"

    .line 827
    .line 828
    .line 829
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 830
    move-result p1

    .line 831
    .line 832
    if-nez p1, :cond_41

    .line 833
    :goto_0
    const/4 p1, 0x0

    .line 834
    return-object p1

    .line 835
    :cond_41
    return-object v9

    .line 836
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x7ae0c43d -> :sswitch_2a
        -0x7a988a96 -> :sswitch_29
        -0x793eea9d -> :sswitch_28
        -0x75fda146 -> :sswitch_27
        -0x5dab6ad2 -> :sswitch_26
        -0x52743c64 -> :sswitch_25
        -0x5274255e -> :sswitch_24
        -0x4f08842f -> :sswitch_23
        -0x46781814 -> :sswitch_22
        -0x3f507f75 -> :sswitch_21
        -0x2906f7a2 -> :sswitch_20
        -0x1f76ce78 -> :sswitch_1f
        -0x1ec16c58 -> :sswitch_1e
        -0xeb0f022 -> :sswitch_1d
        -0xc5a9408 -> :sswitch_1c
        -0x9d7d2b6 -> :sswitch_1b
        0x197ef -> :sswitch_1a
        0x2e6108 -> :sswitch_19
        0x2e9356 -> :sswitch_18
        0x32c67c -> :sswitch_17
        0x3db6c28 -> :sswitch_16
        0x3ec5a5e -> :sswitch_15
        0x49a71c6 -> :sswitch_14
        0x5d0225c -> :sswitch_13
        0x685847c -> :sswitch_12
        0x9415455 -> :sswitch_11
        0xd7b22d3 -> :sswitch_10
        0x148d6054 -> :sswitch_f
        0x17c0bc5c -> :sswitch_e
        0x17c1f055 -> :sswitch_d
        0x17c521d0 -> :sswitch_c
        0x1cc457e6 -> :sswitch_b
        0x1dcad22e -> :sswitch_a
        0x226988ec -> :sswitch_9
        0x23b44f83 -> :sswitch_8
        0x2d605225 -> :sswitch_7
        0x3ec1b19d -> :sswitch_6
        0x3f697993 -> :sswitch_5
        0x473e3665 -> :sswitch_4
        0x4c0855c6 -> :sswitch_3
        0x52797ada -> :sswitch_2
        0x612cf26c -> :sswitch_1
        0x6fe35bb3 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch -0x6bf3d83c
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch -0x6bf3d81d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x4c695eb
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method


# virtual methods
.method public final getClassQualifiedName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "jClass"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    return-object v1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isLocalClass()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    return-object v1

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    const-string v2, "getName(...)"

    .line 27
    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/ClassReference$Companion;->classFqNameOf(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string p1, "Array"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    :cond_2
    if-nez v1, :cond_3

    .line 71
    .line 72
    const-string p1, "kotlin.Array"

    .line 73
    return-object p1

    .line 74
    :cond_3
    return-object v1

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/ClassReference$Companion;->classFqNameOf(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :cond_5
    return-object v0
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

.method public final getClassSimpleName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 6
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "jClass"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    return-object v1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isLocalClass()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x2

    .line 29
    .line 30
    const/16 v4, 0x24

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 36
    .line 37
    new-instance v5, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v2, v1, v3, v1}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    if-nez v2, :cond_1

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return-object v2

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingConstructor()Ljava/lang/reflect/Constructor;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 72
    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getName()Ljava/lang/String;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    .line 93
    invoke-static {v0, p1, v1, v3, v1}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v4, v1, v3, v1}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 107
    move-result v0

    .line 108
    .line 109
    const-string v2, "getName(...)"

    .line 110
    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 119
    move-result v0

    .line 120
    .line 121
    const-string v3, "Array"

    .line 122
    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    .line 130
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/ClassReference$Companion;->simpleNameOf(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    if-eqz p1, :cond_5

    .line 137
    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    move-result-object v1

    .line 152
    .line 153
    :cond_5
    if-nez v1, :cond_6

    .line 154
    return-object v3

    .line 155
    :cond_6
    return-object v1

    .line 156
    .line 157
    .line 158
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    .line 162
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/ClassReference$Companion;->simpleNameOf(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    move-result-object v0

    .line 167
    .line 168
    if-nez v0, :cond_8

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 172
    move-result-object p1

    .line 173
    return-object p1

    .line 174
    :cond_8
    return-object v0
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
.end method

.method public final isInstance(Ljava/lang/Object;Ljava/lang/Class;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "jClass"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lkotlin/jvm/internal/ClassReference;->access$getFUNCTION_CLASSES$cp()Ljava/util/Map;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Integer;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 26
    move-result p2

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p2}, Lkotlin/jvm/internal/TypeIntrinsics;->isFunctionOfArity(Ljava/lang/Object;I)Z

    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {p2}, Lkotlin/jvm/JvmClassMappingKt;->getKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/jvm/JvmClassMappingKt;->getJavaObjectType(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 49
    move-result p1

    .line 50
    return p1
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
.end method
