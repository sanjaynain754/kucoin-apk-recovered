.class public final Lshark/internal/HprofInMemoryIndex$Companion;
.super Ljava/lang/Object;
.source "HprofInMemoryIndex.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/internal/HprofInMemoryIndex;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lshark/internal/HprofInMemoryIndex$Companion;",
        "",
        "<init>",
        "()V",
        "Lshark/StreamingHprofReader;",
        "reader",
        "Lshark/HprofHeader;",
        "hprofHeader",
        "Lshark/r;",
        "proguardMapping",
        "",
        "Lshark/HprofRecordTag;",
        "indexedGcRootTags",
        "Lshark/internal/HprofInMemoryIndex;",
        "indexHprof",
        "(Lshark/StreamingHprofReader;Lshark/HprofHeader;Lshark/r;Ljava/util/Set;)Lshark/internal/HprofInMemoryIndex;",
        "",
        "maxValue",
        "",
        "a",
        "(J)I",
        "shark-graph"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lshark/internal/HprofInMemoryIndex$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$byteSizeForUnsigned(Lshark/internal/HprofInMemoryIndex$Companion;J)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lshark/internal/HprofInMemoryIndex$Companion;->a(J)I

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method


# virtual methods
.method public final a(J)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    cmp-long v1, p1, v1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    shr-long/2addr p1, v1

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return v0
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

.method public final indexHprof(Lshark/StreamingHprofReader;Lshark/HprofHeader;Lshark/r;Ljava/util/Set;)Lshark/internal/HprofInMemoryIndex;
    .locals 31
    .param p1    # Lshark/StreamingHprofReader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lshark/HprofHeader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lshark/r;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/StreamingHprofReader;",
            "Lshark/HprofHeader;",
            "Lshark/r;",
            "Ljava/util/Set<",
            "+",
            "Lshark/HprofRecordTag;",
            ">;)",
            "Lshark/internal/HprofInMemoryIndex;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    new-instance v4, Lkotlin/jvm/internal/Ref$LongRef;

    .line 7
    .line 8
    .line 9
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    iput-wide v2, v4, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 14
    .line 15
    new-instance v7, Lkotlin/jvm/internal/Ref$LongRef;

    .line 16
    .line 17
    .line 18
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 19
    .line 20
    iput-wide v2, v7, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 21
    .line 22
    new-instance v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 23
    .line 24
    .line 25
    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 26
    .line 27
    iput-wide v2, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 28
    .line 29
    new-instance v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 30
    .line 31
    .line 32
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 33
    .line 34
    iput-wide v2, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 35
    .line 36
    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    .line 37
    .line 38
    .line 39
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 40
    const/4 v12, 0x0

    .line 41
    .line 42
    iput v12, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 43
    .line 44
    new-instance v6, Lkotlin/jvm/internal/Ref$IntRef;

    .line 45
    .line 46
    .line 47
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 48
    .line 49
    iput v12, v6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 50
    .line 51
    new-instance v8, Lkotlin/jvm/internal/Ref$IntRef;

    .line 52
    .line 53
    .line 54
    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 55
    .line 56
    iput v12, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 57
    .line 58
    new-instance v10, Lkotlin/jvm/internal/Ref$IntRef;

    .line 59
    .line 60
    .line 61
    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 62
    .line 63
    iput v12, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 64
    .line 65
    new-instance v5, Lkotlin/jvm/internal/Ref$IntRef;

    .line 66
    .line 67
    .line 68
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 69
    .line 70
    iput v12, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 71
    .line 72
    sget-object v13, Lshark/HprofRecordTag;->CLASS_DUMP:Lshark/HprofRecordTag;

    .line 73
    .line 74
    sget-object v14, Lshark/HprofRecordTag;->INSTANCE_DUMP:Lshark/HprofRecordTag;

    .line 75
    .line 76
    sget-object v15, Lshark/HprofRecordTag;->OBJECT_ARRAY_DUMP:Lshark/HprofRecordTag;

    .line 77
    .line 78
    sget-object v2, Lshark/HprofRecordTag;->PRIMITIVE_ARRAY_DUMP:Lshark/HprofRecordTag;

    .line 79
    .line 80
    .line 81
    invoke-static {v13, v14, v15, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 82
    move-result-object v12

    .line 83
    .line 84
    move-object/from16 v16, v2

    .line 85
    .line 86
    const-string v2, "EnumSet.of(CLASS_DUMP, I\u2026MP, PRIMITIVE_ARRAY_DUMP)"

    .line 87
    .line 88
    .line 89
    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    sget-object v2, Lshark/OnHprofRecordTagListener;->a:Lshark/OnHprofRecordTagListener$Companion;

    .line 92
    .line 93
    new-instance v2, Lshark/internal/HprofInMemoryIndex$Companion$a;

    .line 94
    .line 95
    move-object/from16 v17, v16

    .line 96
    .line 97
    .line 98
    invoke-direct/range {v2 .. v11}, Lshark/internal/HprofInMemoryIndex$Companion$a;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$LongRef;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v12, v2}, Lshark/StreamingHprofReader;->a(Ljava/util/Set;Lshark/OnHprofRecordTagListener;)J

    .line 102
    move-result-wide v20

    .line 103
    .line 104
    iget-wide v1, v4, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1, v2}, Lshark/internal/HprofInMemoryIndex$Companion;->a(J)I

    .line 108
    move-result v26

    .line 109
    .line 110
    iget-wide v1, v7, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1, v2}, Lshark/internal/HprofInMemoryIndex$Companion;->a(J)I

    .line 114
    move-result v27

    .line 115
    .line 116
    iget-wide v1, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1, v2}, Lshark/internal/HprofInMemoryIndex$Companion;->a(J)I

    .line 120
    move-result v28

    .line 121
    .line 122
    iget-wide v1, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1, v2}, Lshark/internal/HprofInMemoryIndex$Companion;->a(J)I

    .line 126
    move-result v29

    .line 127
    .line 128
    new-instance v18, Lshark/internal/HprofInMemoryIndex$a;

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {p2 .. p2}, Lshark/HprofHeader;->c()I

    .line 132
    move-result v1

    .line 133
    .line 134
    const/16 v2, 0x8

    .line 135
    .line 136
    if-ne v1, v2, :cond_0

    .line 137
    const/4 v12, 0x1

    .line 138
    .line 139
    move/from16 v19, v12

    .line 140
    goto :goto_0

    .line 141
    .line 142
    :cond_0
    const/16 v19, 0x0

    .line 143
    .line 144
    :goto_0
    iget v1, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 145
    .line 146
    iget v2, v6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 147
    .line 148
    iget v3, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 149
    .line 150
    iget v4, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 151
    .line 152
    iget v5, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 153
    .line 154
    move/from16 v22, v1

    .line 155
    .line 156
    move/from16 v23, v2

    .line 157
    .line 158
    move/from16 v24, v3

    .line 159
    .line 160
    move/from16 v25, v4

    .line 161
    .line 162
    move/from16 v30, v5

    .line 163
    .line 164
    .line 165
    invoke-direct/range {v18 .. v30}, Lshark/internal/HprofInMemoryIndex$a;-><init>(ZJIIIIIIIII)V

    .line 166
    .line 167
    move-object/from16 v1, v18

    .line 168
    .line 169
    sget-object v2, Lshark/HprofRecordTag;->STRING_IN_UTF8:Lshark/HprofRecordTag;

    .line 170
    .line 171
    sget-object v3, Lshark/HprofRecordTag;->LOAD_CLASS:Lshark/HprofRecordTag;

    .line 172
    .line 173
    move-object/from16 v4, v17

    .line 174
    .line 175
    .line 176
    filled-new-array {v3, v13, v14, v15, v4}, [Lshark/HprofRecordTag;

    .line 177
    move-result-object v3

    .line 178
    .line 179
    .line 180
    invoke-static {v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 181
    move-result-object v2

    .line 182
    .line 183
    const-string v3, "EnumSet.of(\n        STRI\u2026MITIVE_ARRAY_DUMP\n      )"

    .line 184
    .line 185
    .line 186
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    sget-object v3, Lshark/HprofRecordTag;->Companion:Lshark/HprofRecordTag$Companion;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Lshark/HprofRecordTag$Companion;->getRootTags()Ljava/util/EnumSet;

    .line 192
    move-result-object v3

    .line 193
    .line 194
    move-object/from16 v4, p4

    .line 195
    .line 196
    .line 197
    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->intersect(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 198
    move-result-object v3

    .line 199
    .line 200
    .line 201
    invoke-static {v2, v3}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 202
    move-result-object v2

    .line 203
    .line 204
    move-object/from16 v3, p1

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v2, v1}, Lshark/StreamingHprofReader;->a(Ljava/util/Set;Lshark/OnHprofRecordTagListener;)J

    .line 208
    .line 209
    move-object/from16 v2, p2

    .line 210
    .line 211
    move-object/from16 v3, p3

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v3, v2}, Lshark/internal/HprofInMemoryIndex$a;->b(Lshark/r;Lshark/HprofHeader;)Lshark/internal/HprofInMemoryIndex;

    .line 215
    move-result-object v1

    .line 216
    return-object v1
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
.end method
