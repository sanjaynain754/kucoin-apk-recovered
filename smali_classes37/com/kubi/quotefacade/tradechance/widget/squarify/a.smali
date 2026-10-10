.class public final Lcom/kubi/quotefacade/tradechance/widget/squarify/a;
.super Ljava/lang/Object;
.source "ChanceSquarify.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007J0\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002J0\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarify;",
        "",
        "<init>",
        "()V",
        "squarifyRatio",
        "",
        "ratio",
        "",
        "parent",
        "Lcom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyNode;",
        "x0",
        "y0",
        "x1",
        "y1",
        "treeMapDice",
        "treeMapSlice",
        "QuoteFacadeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/kubi/quotefacade/tradechance/widget/squarify/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/tradechance/widget/squarify/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/quotefacade/tradechance/widget/squarify/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/quotefacade/tradechance/widget/squarify/a;->a:Lcom/kubi/quotefacade/tradechance/widget/squarify/a;

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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a(DLcom/kubi/quotefacade/tradechance/widget/squarify/b;DDDD)V
    .locals 34
    .param p3    # Lcom/kubi/quotefacade/tradechance/widget/squarify/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "parent"

    .line 3
    .line 4
    move-object/from16 v1, p3

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 11
    move-result-wide v2

    .line 12
    .line 13
    move-wide/from16 v6, p4

    .line 14
    .line 15
    move-wide/from16 v8, p6

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->b()Ljava/util/List;

    .line 21
    move-result-object v10

    .line 22
    .line 23
    .line 24
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 25
    move-result v10

    .line 26
    .line 27
    if-ge v4, v10, :cond_c

    .line 28
    .line 29
    sub-double v10, p8, v6

    .line 30
    .line 31
    sub-double v12, p10, v8

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->b()Ljava/util/List;

    .line 35
    move-result-object v14

    .line 36
    .line 37
    .line 38
    invoke-interface {v14, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    move-result-object v14

    .line 40
    .line 41
    check-cast v14, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v14}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 45
    move-result-wide v14

    .line 46
    .line 47
    const/16 v16, 0x1

    .line 48
    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    const-wide/16 v17, 0x0

    .line 52
    .line 53
    cmpg-double v19, v14, v17

    .line 54
    .line 55
    if-nez v19, :cond_1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->b()Ljava/util/List;

    .line 59
    move-result-object v19

    .line 60
    .line 61
    .line 62
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 63
    move-result v0

    .line 64
    .line 65
    if-lt v5, v0, :cond_0

    .line 66
    .line 67
    :cond_1
    div-double v0, v12, v10

    .line 68
    .line 69
    move-wide/from16 p4, v2

    .line 70
    .line 71
    div-double v2, v10, v12

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 75
    move-result-wide v0

    .line 76
    .line 77
    mul-double v2, p4, p1

    .line 78
    div-double/2addr v0, v2

    .line 79
    const/4 v2, 0x2

    .line 80
    int-to-double v2, v2

    .line 81
    .line 82
    .line 83
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 84
    move-result-wide v20

    .line 85
    .line 86
    mul-double v20, v20, v0

    .line 87
    .line 88
    move-wide/from16 p6, v0

    .line 89
    .line 90
    div-double v0, v14, v20

    .line 91
    .line 92
    move-wide/from16 v22, v6

    .line 93
    move v7, v5

    .line 94
    .line 95
    div-double v5, v20, v14

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(DD)D

    .line 99
    move-result-wide v0

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->b()Ljava/util/List;

    .line 103
    move-result-object v5

    .line 104
    .line 105
    .line 106
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 107
    move-result v5

    .line 108
    move v6, v7

    .line 109
    .line 110
    move-wide/from16 v20, v14

    .line 111
    .line 112
    move-wide/from16 v24, v20

    .line 113
    .line 114
    :goto_1
    if-ge v7, v5, :cond_5

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->b()Ljava/util/List;

    .line 118
    move-result-object v6

    .line 119
    .line 120
    .line 121
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    move-result-object v6

    .line 123
    .line 124
    check-cast v6, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 128
    move-result-wide v26

    .line 129
    .line 130
    add-double v14, v14, v26

    .line 131
    .line 132
    cmpg-double v6, v26, v20

    .line 133
    .line 134
    if-gez v6, :cond_2

    .line 135
    .line 136
    move-wide/from16 v20, v26

    .line 137
    .line 138
    :cond_2
    cmpl-double v6, v26, v24

    .line 139
    .line 140
    if-lez v6, :cond_3

    .line 141
    .line 142
    move-wide/from16 v24, v26

    .line 143
    .line 144
    .line 145
    :cond_3
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 146
    move-result-wide v28

    .line 147
    .line 148
    mul-double v28, v28, p6

    .line 149
    .line 150
    move-wide/from16 v30, v0

    .line 151
    .line 152
    div-double v0, v24, v28

    .line 153
    .line 154
    move-wide/from16 v32, v2

    .line 155
    .line 156
    div-double v2, v28, v20

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 160
    move-result-wide v0

    .line 161
    .line 162
    cmpl-double v2, v0, v30

    .line 163
    .line 164
    if-lez v2, :cond_4

    .line 165
    .line 166
    sub-double v14, v14, v26

    .line 167
    move v0, v7

    .line 168
    .line 169
    :goto_2
    move-wide/from16 v25, v14

    .line 170
    goto :goto_3

    .line 171
    .line 172
    :cond_4
    add-int/lit8 v6, v7, 0x1

    .line 173
    move v7, v6

    .line 174
    .line 175
    move-wide/from16 v2, v32

    .line 176
    goto :goto_1

    .line 177
    :cond_5
    move v0, v6

    .line 178
    goto :goto_2

    .line 179
    .line 180
    :goto_3
    new-instance v5, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;

    .line 181
    .line 182
    const/16 v31, 0xe

    .line 183
    .line 184
    const/16 v32, 0x0

    .line 185
    .line 186
    const-wide/16 v27, 0x0

    .line 187
    .line 188
    const/16 v29, 0x0

    .line 189
    .line 190
    const/16 v30, 0x0

    .line 191
    .line 192
    move-object/from16 v24, v5

    .line 193
    .line 194
    .line 195
    invoke-direct/range {v24 .. v32}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;-><init>(DDLjava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 196
    .line 197
    cmpg-double v1, v10, v12

    .line 198
    .line 199
    if-gez v1, :cond_6

    .line 200
    .line 201
    move/from16 v1, v16

    .line 202
    goto :goto_4

    .line 203
    :cond_6
    const/4 v1, 0x0

    .line 204
    .line 205
    .line 206
    :goto_4
    invoke-virtual {v5, v1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->i(Z)V

    .line 207
    .line 208
    new-instance v1, Ljava/util/ArrayList;

    .line 209
    .line 210
    .line 211
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->b()Ljava/util/List;

    .line 215
    move-result-object v2

    .line 216
    .line 217
    .line 218
    invoke-interface {v2, v4, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 219
    move-result-object v2

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5, v1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->h(Ljava/util/List;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->c()Z

    .line 229
    move-result v1

    .line 230
    .line 231
    if-eqz v1, :cond_9

    .line 232
    .line 233
    cmpg-double v1, p4, v17

    .line 234
    .line 235
    if-nez v1, :cond_7

    .line 236
    .line 237
    move-wide/from16 v12, p10

    .line 238
    .line 239
    :goto_5
    move-object/from16 v4, p0

    .line 240
    .line 241
    move-wide/from16 v10, p8

    .line 242
    .line 243
    move-wide/from16 v6, v22

    .line 244
    goto :goto_6

    .line 245
    .line 246
    :cond_7
    mul-double v12, v12, v25

    .line 247
    .line 248
    div-double v12, v12, p4

    .line 249
    add-double/2addr v12, v8

    .line 250
    goto :goto_5

    .line 251
    .line 252
    .line 253
    :goto_6
    invoke-virtual/range {v4 .. v13}, Lcom/kubi/quotefacade/tradechance/widget/squarify/a;->b(Lcom/kubi/quotefacade/tradechance/widget/squarify/b;DDDD)V

    .line 254
    .line 255
    if-nez v1, :cond_8

    .line 256
    goto :goto_9

    .line 257
    :cond_8
    move-wide v8, v12

    .line 258
    goto :goto_9

    .line 259
    .line 260
    :cond_9
    move-wide/from16 v6, v22

    .line 261
    .line 262
    cmpg-double v1, p4, v17

    .line 263
    .line 264
    if-nez v1, :cond_a

    .line 265
    .line 266
    move-wide/from16 v10, p8

    .line 267
    .line 268
    :goto_7
    move-object/from16 v4, p0

    .line 269
    .line 270
    move-wide/from16 v12, p10

    .line 271
    goto :goto_8

    .line 272
    .line 273
    :cond_a
    mul-double v10, v10, v25

    .line 274
    .line 275
    div-double v10, v10, p4

    .line 276
    .line 277
    add-double v2, v6, v10

    .line 278
    move-wide v10, v2

    .line 279
    goto :goto_7

    .line 280
    .line 281
    .line 282
    :goto_8
    invoke-virtual/range {v4 .. v13}, Lcom/kubi/quotefacade/tradechance/widget/squarify/a;->c(Lcom/kubi/quotefacade/tradechance/widget/squarify/b;DDDD)V

    .line 283
    move-wide v2, v10

    .line 284
    .line 285
    if-nez v1, :cond_b

    .line 286
    goto :goto_9

    .line 287
    :cond_b
    move-wide v6, v2

    .line 288
    .line 289
    :goto_9
    sub-double v2, p4, v25

    .line 290
    .line 291
    move-object/from16 v1, p3

    .line 292
    move v4, v0

    .line 293
    move v5, v4

    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    :cond_c
    return-void
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
.end method

.method public final b(Lcom/kubi/quotefacade/tradechance/widget/squarify/b;DDDD)V
    .locals 6

    .line 1
    sub-double/2addr p6, p2

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 5
    move-result-wide v0

    .line 6
    div-double/2addr p6, v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 14
    move-result-wide v2

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmpg-double v2, v2, v4

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    cmpg-double v2, p6, v4

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    :goto_0
    move-wide p6, v0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->b()Ljava/util/List;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    move-result v1

    .line 36
    .line 37
    if-ge v0, v1, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->b()Ljava/util/List;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    check-cast v1, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p4, p5}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->m(D)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p8, p9}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->n(D)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p2, p3}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->k(D)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 60
    move-result-wide v2

    .line 61
    mul-double/2addr v2, p6

    .line 62
    add-double/2addr p2, v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p2, p3}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->l(D)V

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    return-void
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
.end method

.method public final c(Lcom/kubi/quotefacade/tradechance/widget/squarify/b;DDDD)V
    .locals 6

    .line 1
    sub-double/2addr p8, p4

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 5
    move-result-wide v0

    .line 6
    div-double/2addr p8, v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 14
    move-result-wide v2

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmpg-double v2, v2, v4

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    cmpg-double v2, p8, v4

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    :goto_0
    move-wide p8, v0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->b()Ljava/util/List;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    move-result v1

    .line 36
    .line 37
    if-ge v0, v1, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->b()Ljava/util/List;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    check-cast v1, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p2, p3}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->k(D)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p6, p7}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->l(D)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p4, p5}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->m(D)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->g()D

    .line 60
    move-result-wide v2

    .line 61
    mul-double/2addr v2, p8

    .line 62
    add-double/2addr p4, v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p4, p5}, Lcom/kubi/quotefacade/tradechance/widget/squarify/b;->n(D)V

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    return-void
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
.end method
