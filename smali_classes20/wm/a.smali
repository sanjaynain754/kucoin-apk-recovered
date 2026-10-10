.class public final Lwm/a;
.super Ljava/lang/Object;
.source "TPSLPointInputFilter.kt"

# interfaces
.implements Landroid/text/InputFilter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J>\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/kumex/utils/inputfilter/TPSLPointInputFilter;",
        "Landroid/text/InputFilter;",
        "decimal_digits",
        "",
        "<init>",
        "(I)V",
        "filter",
        "",
        "source",
        "start",
        "end",
        "dest",
        "Landroid/text/Spanned;",
        "dstart",
        "dend",
        "KumexLib_googleRelease"
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
        "SMAP\nTPSLPointInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TPSLPointInputFilter.kt\ncom/kubi/kumex/utils/inputfilter/TPSLPointInputFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,93:1\n739#2,9:94\n37#3:103\n36#3,3:104\n*S KotlinDebug\n*F\n+ 1 TPSLPointInputFilter.kt\ncom/kubi/kumex/utils/inputfilter/TPSLPointInputFilter\n*L\n75#1:94,9\n75#1:103\n75#1:104,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lwm/a;->a:I

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
.end method


# virtual methods
.method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 19
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Landroid/text/Spanned;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move/from16 v0, p5

    .line 5
    .line 6
    move/from16 v2, p6

    .line 7
    .line 8
    .line 9
    invoke-static/range {p4 .. p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    move-result-object v4

    .line 15
    .line 16
    sget-object v5, Lcom/kubi/futures/j;->a:Lcom/kubi/futures/j;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5}, Lcom/kubi/futures/j;->s()Z

    .line 20
    move-result v5

    .line 21
    const/4 v6, 0x2

    .line 22
    .line 23
    const-string v7, "."

    .line 24
    .line 25
    const-string v8, ""

    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v10, 0x1

    .line 28
    const/4 v11, 0x0

    .line 29
    .line 30
    if-eqz v5, :cond_4

    .line 31
    .line 32
    .line 33
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v4

    .line 35
    .line 36
    if-eqz v4, :cond_4

    .line 37
    .line 38
    iget v4, v1, Lwm/a;->a:I

    .line 39
    .line 40
    if-lez v4, :cond_4

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v7, v11, v6, v9}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 44
    move-result v4

    .line 45
    .line 46
    if-eqz v4, :cond_0

    .line 47
    return-object v8

    .line 48
    .line 49
    :cond_0
    const-string v4, "-"

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v5

    .line 54
    .line 55
    const-string v12, "0."

    .line 56
    .line 57
    if-eqz v5, :cond_1

    .line 58
    return-object v12

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-static {v3, v4, v11, v6, v9}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 62
    move-result v4

    .line 63
    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-static {v3}, Lkotlin/text/StringsKt;->toBigDecimalOrNull(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 68
    move-result-object v4

    .line 69
    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    if-ne v0, v10, :cond_2

    .line 73
    return-object v12

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 77
    move-result v4

    .line 78
    .line 79
    if-nez v4, :cond_3

    .line 80
    goto :goto_0

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-static {v3}, Lkotlin/text/StringsKt;->toBigDecimalOrNull(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    if-nez v0, :cond_4

    .line 89
    :goto_0
    return-object v12

    .line 90
    .line 91
    .line 92
    :cond_4
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    move-result-object v3

    .line 94
    .line 95
    move/from16 v4, p2

    .line 96
    .line 97
    move/from16 v5, p3

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 101
    move-result-object v12

    .line 102
    .line 103
    const-string v3, "substring(...)"

    .line 104
    .line 105
    .line 106
    invoke-static {v12, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static/range {p4 .. p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    move-result-object v4

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 114
    move-result-object v4

    .line 115
    .line 116
    .line 117
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    move-result v5

    .line 122
    .line 123
    if-eqz v5, :cond_6

    .line 124
    .line 125
    if-nez v0, :cond_5

    .line 126
    .line 127
    .line 128
    invoke-static/range {p4 .. p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    move-result-object v13

    .line 130
    .line 131
    const/16 v17, 0x6

    .line 132
    .line 133
    const/16 v18, 0x0

    .line 134
    .line 135
    const-string v14, "."

    .line 136
    const/4 v15, 0x0

    .line 137
    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    .line 141
    invoke-static/range {v13 .. v18}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 142
    move-result v0

    .line 143
    .line 144
    if-ne v0, v2, :cond_5

    .line 145
    return-object v4

    .line 146
    :cond_5
    return-object v9

    .line 147
    .line 148
    :cond_6
    if-nez v0, :cond_7

    .line 149
    .line 150
    const/16 v16, 0x6

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const-string v13, "."

    .line 155
    const/4 v14, 0x0

    .line 156
    const/4 v15, 0x0

    .line 157
    .line 158
    .line 159
    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 160
    move-result v2

    .line 161
    .line 162
    if-nez v2, :cond_7

    .line 163
    return-object v8

    .line 164
    .line 165
    :cond_7
    iget v2, v1, Lwm/a;->a:I

    .line 166
    .line 167
    if-gtz v2, :cond_9

    .line 168
    .line 169
    .line 170
    invoke-static {v12, v7, v11, v6, v9}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 171
    move-result v2

    .line 172
    .line 173
    if-eqz v2, :cond_9

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 177
    move-result v0

    .line 178
    .line 179
    if-ne v0, v10, :cond_8

    .line 180
    return-object v8

    .line 181
    :cond_8
    const/4 v0, 0x6

    .line 182
    const/4 v2, 0x0

    .line 183
    .line 184
    const-string v4, "."

    .line 185
    const/4 v5, 0x0

    .line 186
    const/4 v6, 0x0

    .line 187
    .line 188
    move/from16 p5, v0

    .line 189
    .line 190
    move-object/from16 p6, v2

    .line 191
    .line 192
    move-object/from16 p2, v4

    .line 193
    .line 194
    move/from16 p3, v5

    .line 195
    .line 196
    move/from16 p4, v6

    .line 197
    .line 198
    move-object/from16 p1, v12

    .line 199
    .line 200
    .line 201
    invoke-static/range {p1 .. p6}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 202
    move-result v0

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v11, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 206
    move-result-object v0

    .line 207
    .line 208
    .line 209
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    return-object v0

    .line 211
    .line 212
    .line 213
    :cond_9
    invoke-static/range {p4 .. p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 214
    move-result-object v2

    .line 215
    .line 216
    new-instance v3, Lkotlin/text/Regex;

    .line 217
    .line 218
    const-string v4, "\\."

    .line 219
    .line 220
    .line 221
    invoke-direct {v3, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v3, v2, v11}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    .line 225
    move-result-object v2

    .line 226
    .line 227
    .line 228
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 229
    move-result v3

    .line 230
    .line 231
    if-nez v3, :cond_b

    .line 232
    .line 233
    .line 234
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 235
    move-result v3

    .line 236
    .line 237
    .line 238
    invoke-interface {v2, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 239
    move-result-object v3

    .line 240
    .line 241
    .line 242
    :goto_1
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 243
    move-result v4

    .line 244
    .line 245
    if-eqz v4, :cond_b

    .line 246
    .line 247
    .line 248
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 249
    move-result-object v4

    .line 250
    .line 251
    check-cast v4, Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 255
    move-result v4

    .line 256
    .line 257
    if-nez v4, :cond_a

    .line 258
    goto :goto_1

    .line 259
    .line 260
    .line 261
    :cond_a
    invoke-interface {v3}, Ljava/util/ListIterator;->nextIndex()I

    .line 262
    move-result v3

    .line 263
    add-int/2addr v3, v10

    .line 264
    .line 265
    .line 266
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 267
    move-result-object v2

    .line 268
    goto :goto_2

    .line 269
    .line 270
    .line 271
    :cond_b
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 272
    move-result-object v2

    .line 273
    .line 274
    :goto_2
    new-array v3, v11, [Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 278
    move-result-object v2

    .line 279
    .line 280
    check-cast v2, [Ljava/lang/String;

    .line 281
    array-length v3, v2

    .line 282
    .line 283
    if-le v3, v10, :cond_c

    .line 284
    .line 285
    aget-object v3, v2, v10

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 289
    move-result v3

    .line 290
    .line 291
    iget v4, v1, Lwm/a;->a:I

    .line 292
    .line 293
    if-lt v3, v4, :cond_c

    .line 294
    .line 295
    aget-object v2, v2, v11

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 299
    move-result v2

    .line 300
    .line 301
    if-le v0, v2, :cond_c

    .line 302
    return-object v8

    .line 303
    .line 304
    .line 305
    :cond_c
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 306
    move-result v0

    .line 307
    .line 308
    if-le v0, v10, :cond_d

    .line 309
    .line 310
    .line 311
    invoke-static {v12, v7, v11, v6, v9}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 312
    move-result v0

    .line 313
    .line 314
    if-eqz v0, :cond_d

    .line 315
    .line 316
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    .line 317
    .line 318
    .line 319
    invoke-direct {v0, v12}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    iget v2, v1, Lwm/a;->a:I

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v2, v10}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    .line 325
    move-result-object v0

    .line 326
    .line 327
    .line 328
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 329
    move-result-object v0

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 333
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 334
    return-object v0

    .line 335
    :catch_0
    move-exception v0

    .line 336
    .line 337
    const-string v2, "TPSLPointInputFilter"

    .line 338
    .line 339
    .line 340
    invoke-static {v0, v2}, Lem/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 341
    return-object v8

    .line 342
    :cond_d
    return-object v9
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
.end method
