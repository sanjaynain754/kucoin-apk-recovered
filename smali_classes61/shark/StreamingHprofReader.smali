.class public final Lshark/StreamingHprofReader;
.super Ljava/lang/Object;
.source "StreamingHprofReader.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/StreamingHprofReader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0008\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lshark/StreamingHprofReader;",
        "",
        "Lshark/w;",
        "sourceProvider",
        "Lshark/HprofHeader;",
        "header",
        "<init>",
        "(Lshark/w;Lshark/HprofHeader;)V",
        "",
        "Lshark/HprofRecordTag;",
        "recordTags",
        "Lshark/OnHprofRecordTagListener;",
        "listener",
        "",
        "a",
        "(Ljava/util/Set;Lshark/OnHprofRecordTagListener;)J",
        "Lshark/w;",
        "b",
        "Lshark/HprofHeader;",
        "c",
        "Companion",
        "shark-hprof"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final c:Lshark/StreamingHprofReader$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lshark/w;

.field public final b:Lshark/HprofHeader;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lshark/StreamingHprofReader$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lshark/StreamingHprofReader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lshark/StreamingHprofReader;->c:Lshark/StreamingHprofReader$Companion;

    .line 9
    return-void
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

.method public constructor <init>(Lshark/w;Lshark/HprofHeader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lshark/StreamingHprofReader;->a:Lshark/w;

    iput-object p2, p0, Lshark/StreamingHprofReader;->b:Lshark/HprofHeader;

    return-void
.end method

.method public synthetic constructor <init>(Lshark/w;Lshark/HprofHeader;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lshark/StreamingHprofReader;-><init>(Lshark/w;Lshark/HprofHeader;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;Lshark/OnHprofRecordTagListener;)J
    .locals 25
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lshark/OnHprofRecordTagListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lshark/HprofRecordTag;",
            ">;",
            "Lshark/OnHprofRecordTagListener;",
            ")J"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    const-string v3, " at "

    .line 9
    .line 10
    const-string v4, "java.lang.String.format(this, *args)"

    .line 11
    .line 12
    const-string v5, "0x%02x"

    .line 13
    .line 14
    iget-object v6, v1, Lshark/StreamingHprofReader;->a:Lshark/w;

    .line 15
    .line 16
    .line 17
    invoke-interface {v6}, Lshark/w;->b()Lokio/BufferedSource;

    .line 18
    move-result-object v6

    .line 19
    .line 20
    :try_start_0
    new-instance v7, Lshark/HprofRecordReader;

    .line 21
    .line 22
    iget-object v8, v1, Lshark/StreamingHprofReader;->b:Lshark/HprofHeader;

    .line 23
    .line 24
    .line 25
    invoke-direct {v7, v8, v6}, Lshark/HprofRecordReader;-><init>(Lshark/HprofHeader;Lokio/BufferedSource;)V

    .line 26
    .line 27
    iget-object v8, v1, Lshark/StreamingHprofReader;->b:Lshark/HprofHeader;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v8}, Lshark/HprofHeader;->d()I

    .line 31
    move-result v8

    .line 32
    .line 33
    .line 34
    invoke-virtual {v7, v8}, Lshark/HprofRecordReader;->U(I)V

    .line 35
    .line 36
    sget-object v8, Lshark/PrimitiveType;->INT:Lshark/PrimitiveType;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v8}, Lshark/PrimitiveType;->getByteSize()I

    .line 40
    move-result v8

    .line 41
    const/4 v9, 0x2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7, v9}, Lshark/HprofRecordReader;->T(I)I

    .line 45
    move-result v9

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-interface {v6}, Lokio/BufferedSource;->exhausted()Z

    .line 49
    move-result v10

    .line 50
    .line 51
    if-nez v10, :cond_38

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7}, Lshark/HprofRecordReader;->N()I

    .line 55
    move-result v10

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7, v8}, Lshark/HprofRecordReader;->U(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v7}, Lshark/HprofRecordReader;->O()J

    .line 62
    move-result-wide v11

    .line 63
    .line 64
    sget-object v13, Lshark/HprofRecordTag;->STRING_IN_UTF8:Lshark/HprofRecordTag;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v13}, Lshark/HprofRecordTag;->getTag()I

    .line 68
    move-result v14

    .line 69
    .line 70
    if-ne v10, v14, :cond_2

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 74
    move-result v10

    .line 75
    .line 76
    if-eqz v10, :cond_1

    .line 77
    .line 78
    .line 79
    invoke-interface {v2, v13, v11, v12, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 80
    .line 81
    :cond_0
    :goto_1
    move/from16 v19, v8

    .line 82
    .line 83
    goto/16 :goto_5

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object v1, v0

    .line 86
    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-virtual {v7, v11, v12}, Lshark/HprofRecordReader;->V(J)V

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_2
    sget-object v13, Lshark/HprofRecordTag;->LOAD_CLASS:Lshark/HprofRecordTag;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v13}, Lshark/HprofRecordTag;->getTag()I

    .line 97
    move-result v14

    .line 98
    .line 99
    if-ne v10, v14, :cond_4

    .line 100
    .line 101
    .line 102
    invoke-interface {v0, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 103
    move-result v10

    .line 104
    .line 105
    if-eqz v10, :cond_3

    .line 106
    .line 107
    .line 108
    invoke-interface {v2, v13, v11, v12, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 109
    goto :goto_1

    .line 110
    .line 111
    .line 112
    :cond_3
    invoke-virtual {v7, v11, v12}, Lshark/HprofRecordReader;->V(J)V

    .line 113
    goto :goto_1

    .line 114
    .line 115
    :cond_4
    sget-object v13, Lshark/HprofRecordTag;->STACK_FRAME:Lshark/HprofRecordTag;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v13}, Lshark/HprofRecordTag;->getTag()I

    .line 119
    move-result v14

    .line 120
    .line 121
    if-ne v10, v14, :cond_6

    .line 122
    .line 123
    .line 124
    invoke-interface {v0, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 125
    move-result v10

    .line 126
    .line 127
    if-eqz v10, :cond_5

    .line 128
    .line 129
    .line 130
    invoke-interface {v2, v13, v11, v12, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 131
    goto :goto_1

    .line 132
    .line 133
    .line 134
    :cond_5
    invoke-virtual {v7, v11, v12}, Lshark/HprofRecordReader;->V(J)V

    .line 135
    goto :goto_1

    .line 136
    .line 137
    :cond_6
    sget-object v13, Lshark/HprofRecordTag;->STACK_TRACE:Lshark/HprofRecordTag;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v13}, Lshark/HprofRecordTag;->getTag()I

    .line 141
    move-result v14

    .line 142
    .line 143
    if-ne v10, v14, :cond_8

    .line 144
    .line 145
    .line 146
    invoke-interface {v0, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 147
    move-result v10

    .line 148
    .line 149
    if-eqz v10, :cond_7

    .line 150
    .line 151
    .line 152
    invoke-interface {v2, v13, v11, v12, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 153
    goto :goto_1

    .line 154
    .line 155
    .line 156
    :cond_7
    invoke-virtual {v7, v11, v12}, Lshark/HprofRecordReader;->V(J)V

    .line 157
    goto :goto_1

    .line 158
    .line 159
    :cond_8
    sget-object v13, Lshark/HprofRecordTag;->HEAP_DUMP:Lshark/HprofRecordTag;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v13}, Lshark/HprofRecordTag;->getTag()I

    .line 163
    move-result v13

    .line 164
    .line 165
    if-ne v10, v13, :cond_9

    .line 166
    goto :goto_2

    .line 167
    .line 168
    :cond_9
    sget-object v13, Lshark/HprofRecordTag;->HEAP_DUMP_SEGMENT:Lshark/HprofRecordTag;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v13}, Lshark/HprofRecordTag;->getTag()I

    .line 172
    move-result v13

    .line 173
    .line 174
    if-ne v10, v13, :cond_35

    .line 175
    .line 176
    .line 177
    :goto_2
    invoke-virtual {v7}, Lshark/HprofRecordReader;->a()J

    .line 178
    move-result-wide v13

    .line 179
    const/4 v10, 0x0

    .line 180
    .line 181
    const-wide/16 v15, 0x0

    .line 182
    .line 183
    move-wide/from16 v23, v15

    .line 184
    move-wide v15, v13

    .line 185
    .line 186
    move-wide/from16 v13, v23

    .line 187
    .line 188
    .line 189
    :goto_3
    invoke-virtual {v7}, Lshark/HprofRecordReader;->a()J

    .line 190
    move-result-wide v17

    .line 191
    .line 192
    sub-long v17, v17, v15

    .line 193
    .line 194
    cmp-long v17, v17, v11

    .line 195
    .line 196
    if-gez v17, :cond_0

    .line 197
    .line 198
    move-wide/from16 v17, v11

    .line 199
    move v12, v10

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7}, Lshark/HprofRecordReader;->a()J

    .line 203
    move-result-wide v10

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7}, Lshark/HprofRecordReader;->N()I

    .line 207
    move-result v1

    .line 208
    .line 209
    move/from16 v19, v8

    .line 210
    .line 211
    sget-object v8, Lshark/HprofRecordTag;->ROOT_UNKNOWN:Lshark/HprofRecordTag;

    .line 212
    .line 213
    move/from16 v20, v12

    .line 214
    .line 215
    .line 216
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 217
    move-result v12

    .line 218
    .line 219
    move-wide/from16 v21, v13

    .line 220
    .line 221
    const-wide/16 v13, -0x1

    .line 222
    .line 223
    if-ne v1, v12, :cond_b

    .line 224
    .line 225
    .line 226
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 227
    move-result v12

    .line 228
    .line 229
    if-eqz v12, :cond_a

    .line 230
    .line 231
    .line 232
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 233
    .line 234
    goto/16 :goto_4

    .line 235
    .line 236
    .line 237
    :cond_a
    invoke-virtual {v7, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 238
    .line 239
    goto/16 :goto_4

    .line 240
    .line 241
    :cond_b
    sget-object v8, Lshark/HprofRecordTag;->ROOT_JNI_GLOBAL:Lshark/HprofRecordTag;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 245
    move-result v12

    .line 246
    .line 247
    if-ne v1, v12, :cond_d

    .line 248
    .line 249
    .line 250
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 251
    move-result v12

    .line 252
    .line 253
    if-eqz v12, :cond_c

    .line 254
    .line 255
    .line 256
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 257
    .line 258
    goto/16 :goto_4

    .line 259
    .line 260
    :cond_c
    add-int v8, v9, v9

    .line 261
    .line 262
    .line 263
    invoke-virtual {v7, v8}, Lshark/HprofRecordReader;->U(I)V

    .line 264
    .line 265
    goto/16 :goto_4

    .line 266
    .line 267
    :cond_d
    sget-object v8, Lshark/HprofRecordTag;->ROOT_JNI_LOCAL:Lshark/HprofRecordTag;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 271
    move-result v12

    .line 272
    .line 273
    if-ne v1, v12, :cond_f

    .line 274
    .line 275
    .line 276
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 277
    move-result v12

    .line 278
    .line 279
    if-eqz v12, :cond_e

    .line 280
    .line 281
    .line 282
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 283
    .line 284
    goto/16 :goto_4

    .line 285
    .line 286
    :cond_e
    add-int v8, v9, v19

    .line 287
    .line 288
    add-int v8, v8, v19

    .line 289
    .line 290
    .line 291
    invoke-virtual {v7, v8}, Lshark/HprofRecordReader;->U(I)V

    .line 292
    .line 293
    goto/16 :goto_4

    .line 294
    .line 295
    :cond_f
    sget-object v8, Lshark/HprofRecordTag;->ROOT_JAVA_FRAME:Lshark/HprofRecordTag;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 299
    move-result v12

    .line 300
    .line 301
    if-ne v1, v12, :cond_11

    .line 302
    .line 303
    .line 304
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 305
    move-result v12

    .line 306
    .line 307
    if-eqz v12, :cond_10

    .line 308
    .line 309
    .line 310
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 311
    .line 312
    goto/16 :goto_4

    .line 313
    .line 314
    :cond_10
    add-int v8, v9, v19

    .line 315
    .line 316
    add-int v8, v8, v19

    .line 317
    .line 318
    .line 319
    invoke-virtual {v7, v8}, Lshark/HprofRecordReader;->U(I)V

    .line 320
    .line 321
    goto/16 :goto_4

    .line 322
    .line 323
    :cond_11
    sget-object v8, Lshark/HprofRecordTag;->ROOT_NATIVE_STACK:Lshark/HprofRecordTag;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 327
    move-result v12

    .line 328
    .line 329
    if-ne v1, v12, :cond_13

    .line 330
    .line 331
    .line 332
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 333
    move-result v12

    .line 334
    .line 335
    if-eqz v12, :cond_12

    .line 336
    .line 337
    .line 338
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 339
    .line 340
    goto/16 :goto_4

    .line 341
    .line 342
    :cond_12
    add-int v8, v9, v19

    .line 343
    .line 344
    .line 345
    invoke-virtual {v7, v8}, Lshark/HprofRecordReader;->U(I)V

    .line 346
    .line 347
    goto/16 :goto_4

    .line 348
    .line 349
    :cond_13
    sget-object v8, Lshark/HprofRecordTag;->ROOT_STICKY_CLASS:Lshark/HprofRecordTag;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 353
    move-result v12

    .line 354
    .line 355
    if-ne v1, v12, :cond_15

    .line 356
    .line 357
    .line 358
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 359
    move-result v12

    .line 360
    .line 361
    if-eqz v12, :cond_14

    .line 362
    .line 363
    .line 364
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 365
    .line 366
    goto/16 :goto_4

    .line 367
    .line 368
    .line 369
    :cond_14
    invoke-virtual {v7, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 370
    .line 371
    goto/16 :goto_4

    .line 372
    .line 373
    :cond_15
    sget-object v8, Lshark/HprofRecordTag;->ROOT_THREAD_BLOCK:Lshark/HprofRecordTag;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 377
    move-result v12

    .line 378
    .line 379
    if-ne v1, v12, :cond_17

    .line 380
    .line 381
    .line 382
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 383
    move-result v12

    .line 384
    .line 385
    if-eqz v12, :cond_16

    .line 386
    .line 387
    .line 388
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 389
    .line 390
    goto/16 :goto_4

    .line 391
    .line 392
    :cond_16
    add-int v8, v9, v19

    .line 393
    .line 394
    .line 395
    invoke-virtual {v7, v8}, Lshark/HprofRecordReader;->U(I)V

    .line 396
    .line 397
    goto/16 :goto_4

    .line 398
    .line 399
    :cond_17
    sget-object v8, Lshark/HprofRecordTag;->ROOT_MONITOR_USED:Lshark/HprofRecordTag;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 403
    move-result v12

    .line 404
    .line 405
    if-ne v1, v12, :cond_19

    .line 406
    .line 407
    .line 408
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 409
    move-result v12

    .line 410
    .line 411
    if-eqz v12, :cond_18

    .line 412
    .line 413
    .line 414
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 415
    .line 416
    goto/16 :goto_4

    .line 417
    .line 418
    .line 419
    :cond_18
    invoke-virtual {v7, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 420
    .line 421
    goto/16 :goto_4

    .line 422
    .line 423
    :cond_19
    sget-object v8, Lshark/HprofRecordTag;->ROOT_THREAD_OBJECT:Lshark/HprofRecordTag;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 427
    move-result v12

    .line 428
    .line 429
    if-ne v1, v12, :cond_1b

    .line 430
    .line 431
    .line 432
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 433
    move-result v12

    .line 434
    .line 435
    if-eqz v12, :cond_1a

    .line 436
    .line 437
    .line 438
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 439
    .line 440
    goto/16 :goto_4

    .line 441
    .line 442
    :cond_1a
    add-int v8, v9, v19

    .line 443
    .line 444
    add-int v8, v8, v19

    .line 445
    .line 446
    .line 447
    invoke-virtual {v7, v8}, Lshark/HprofRecordReader;->U(I)V

    .line 448
    .line 449
    goto/16 :goto_4

    .line 450
    .line 451
    :cond_1b
    sget-object v8, Lshark/HprofRecordTag;->ROOT_INTERNED_STRING:Lshark/HprofRecordTag;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 455
    move-result v12

    .line 456
    .line 457
    if-ne v1, v12, :cond_1d

    .line 458
    .line 459
    .line 460
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 461
    move-result v12

    .line 462
    .line 463
    if-eqz v12, :cond_1c

    .line 464
    .line 465
    .line 466
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 467
    .line 468
    goto/16 :goto_4

    .line 469
    .line 470
    .line 471
    :cond_1c
    invoke-virtual {v7, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 472
    .line 473
    goto/16 :goto_4

    .line 474
    .line 475
    :cond_1d
    sget-object v8, Lshark/HprofRecordTag;->ROOT_FINALIZING:Lshark/HprofRecordTag;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 479
    move-result v12

    .line 480
    .line 481
    if-ne v1, v12, :cond_1f

    .line 482
    .line 483
    .line 484
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 485
    move-result v12

    .line 486
    .line 487
    if-eqz v12, :cond_1e

    .line 488
    .line 489
    .line 490
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 491
    .line 492
    goto/16 :goto_4

    .line 493
    .line 494
    .line 495
    :cond_1e
    invoke-virtual {v7, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 496
    .line 497
    goto/16 :goto_4

    .line 498
    .line 499
    :cond_1f
    sget-object v8, Lshark/HprofRecordTag;->ROOT_DEBUGGER:Lshark/HprofRecordTag;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 503
    move-result v12

    .line 504
    .line 505
    if-ne v1, v12, :cond_21

    .line 506
    .line 507
    .line 508
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 509
    move-result v12

    .line 510
    .line 511
    if-eqz v12, :cond_20

    .line 512
    .line 513
    .line 514
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 515
    .line 516
    goto/16 :goto_4

    .line 517
    .line 518
    .line 519
    :cond_20
    invoke-virtual {v7, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 520
    .line 521
    goto/16 :goto_4

    .line 522
    .line 523
    :cond_21
    sget-object v8, Lshark/HprofRecordTag;->ROOT_REFERENCE_CLEANUP:Lshark/HprofRecordTag;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 527
    move-result v12

    .line 528
    .line 529
    if-ne v1, v12, :cond_23

    .line 530
    .line 531
    .line 532
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 533
    move-result v12

    .line 534
    .line 535
    if-eqz v12, :cond_22

    .line 536
    .line 537
    .line 538
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 539
    .line 540
    goto/16 :goto_4

    .line 541
    .line 542
    .line 543
    :cond_22
    invoke-virtual {v7, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 544
    .line 545
    goto/16 :goto_4

    .line 546
    .line 547
    :cond_23
    sget-object v8, Lshark/HprofRecordTag;->ROOT_VM_INTERNAL:Lshark/HprofRecordTag;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 551
    move-result v12

    .line 552
    .line 553
    if-ne v1, v12, :cond_25

    .line 554
    .line 555
    .line 556
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 557
    move-result v12

    .line 558
    .line 559
    if-eqz v12, :cond_24

    .line 560
    .line 561
    .line 562
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 563
    .line 564
    goto/16 :goto_4

    .line 565
    .line 566
    .line 567
    :cond_24
    invoke-virtual {v7, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 568
    .line 569
    goto/16 :goto_4

    .line 570
    .line 571
    :cond_25
    sget-object v8, Lshark/HprofRecordTag;->ROOT_JNI_MONITOR:Lshark/HprofRecordTag;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 575
    move-result v12

    .line 576
    .line 577
    if-ne v1, v12, :cond_27

    .line 578
    .line 579
    .line 580
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 581
    move-result v12

    .line 582
    .line 583
    if-eqz v12, :cond_26

    .line 584
    .line 585
    .line 586
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 587
    .line 588
    goto/16 :goto_4

    .line 589
    .line 590
    :cond_26
    add-int v8, v9, v19

    .line 591
    .line 592
    add-int v8, v8, v19

    .line 593
    .line 594
    .line 595
    invoke-virtual {v7, v8}, Lshark/HprofRecordReader;->U(I)V

    .line 596
    .line 597
    goto/16 :goto_4

    .line 598
    .line 599
    :cond_27
    sget-object v8, Lshark/HprofRecordTag;->ROOT_UNREACHABLE:Lshark/HprofRecordTag;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 603
    move-result v12

    .line 604
    .line 605
    if-ne v1, v12, :cond_29

    .line 606
    .line 607
    .line 608
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 609
    move-result v12

    .line 610
    .line 611
    if-eqz v12, :cond_28

    .line 612
    .line 613
    .line 614
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 615
    .line 616
    goto/16 :goto_4

    .line 617
    .line 618
    .line 619
    :cond_28
    invoke-virtual {v7, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 620
    .line 621
    goto/16 :goto_4

    .line 622
    .line 623
    :cond_29
    sget-object v8, Lshark/HprofRecordTag;->CLASS_DUMP:Lshark/HprofRecordTag;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 627
    move-result v12

    .line 628
    .line 629
    if-ne v1, v12, :cond_2b

    .line 630
    .line 631
    .line 632
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 633
    move-result v12

    .line 634
    .line 635
    if-eqz v12, :cond_2a

    .line 636
    .line 637
    .line 638
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 639
    goto :goto_4

    .line 640
    .line 641
    .line 642
    :cond_2a
    invoke-virtual {v7}, Lshark/HprofRecordReader;->Z()V

    .line 643
    goto :goto_4

    .line 644
    .line 645
    :cond_2b
    sget-object v8, Lshark/HprofRecordTag;->INSTANCE_DUMP:Lshark/HprofRecordTag;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 649
    move-result v12

    .line 650
    .line 651
    if-ne v1, v12, :cond_2d

    .line 652
    .line 653
    .line 654
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 655
    move-result v12

    .line 656
    .line 657
    if-eqz v12, :cond_2c

    .line 658
    .line 659
    .line 660
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 661
    goto :goto_4

    .line 662
    .line 663
    .line 664
    :cond_2c
    invoke-virtual {v7}, Lshark/HprofRecordReader;->c0()V

    .line 665
    goto :goto_4

    .line 666
    .line 667
    :cond_2d
    sget-object v8, Lshark/HprofRecordTag;->OBJECT_ARRAY_DUMP:Lshark/HprofRecordTag;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 671
    move-result v12

    .line 672
    .line 673
    if-ne v1, v12, :cond_2f

    .line 674
    .line 675
    .line 676
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 677
    move-result v12

    .line 678
    .line 679
    if-eqz v12, :cond_2e

    .line 680
    .line 681
    .line 682
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 683
    goto :goto_4

    .line 684
    .line 685
    .line 686
    :cond_2e
    invoke-virtual {v7}, Lshark/HprofRecordReader;->d0()V

    .line 687
    goto :goto_4

    .line 688
    .line 689
    :cond_2f
    sget-object v8, Lshark/HprofRecordTag;->PRIMITIVE_ARRAY_DUMP:Lshark/HprofRecordTag;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 693
    move-result v12

    .line 694
    .line 695
    if-ne v1, v12, :cond_31

    .line 696
    .line 697
    .line 698
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 699
    move-result v12

    .line 700
    .line 701
    if-eqz v12, :cond_30

    .line 702
    .line 703
    .line 704
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 705
    goto :goto_4

    .line 706
    .line 707
    .line 708
    :cond_30
    invoke-virtual {v7}, Lshark/HprofRecordReader;->e0()V

    .line 709
    goto :goto_4

    .line 710
    .line 711
    :cond_31
    sget-object v8, Lshark/HprofRecordTag;->PRIMITIVE_ARRAY_NODATA:Lshark/HprofRecordTag;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 715
    move-result v12

    .line 716
    .line 717
    if-eq v1, v12, :cond_34

    .line 718
    .line 719
    sget-object v8, Lshark/HprofRecordTag;->HEAP_DUMP_INFO:Lshark/HprofRecordTag;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v8}, Lshark/HprofRecordTag;->getTag()I

    .line 723
    move-result v12

    .line 724
    .line 725
    if-ne v1, v12, :cond_33

    .line 726
    .line 727
    .line 728
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 729
    move-result v12

    .line 730
    .line 731
    if-eqz v12, :cond_32

    .line 732
    .line 733
    .line 734
    invoke-interface {v2, v8, v13, v14, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 735
    goto :goto_4

    .line 736
    .line 737
    .line 738
    :cond_32
    invoke-virtual {v7}, Lshark/HprofRecordReader;->b0()V

    .line 739
    :goto_4
    move-wide v13, v10

    .line 740
    .line 741
    move-wide/from16 v11, v17

    .line 742
    .line 743
    move/from16 v8, v19

    .line 744
    move v10, v1

    .line 745
    .line 746
    move-object/from16 v1, p0

    .line 747
    .line 748
    goto/16 :goto_3

    .line 749
    .line 750
    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 751
    .line 752
    new-instance v2, Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 756
    .line 757
    const-string v7, "Unknown tag "

    .line 758
    .line 759
    .line 760
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 761
    .line 762
    .line 763
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 764
    move-result-object v1

    .line 765
    .line 766
    .line 767
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 768
    move-result-object v1

    .line 769
    const/4 v7, 0x1

    .line 770
    .line 771
    .line 772
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 773
    move-result-object v1

    .line 774
    .line 775
    .line 776
    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 777
    move-result-object v1

    .line 778
    .line 779
    .line 780
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    const-string v1, " after "

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 798
    move-result-object v1

    .line 799
    .line 800
    .line 801
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 802
    move-result-object v1

    .line 803
    .line 804
    .line 805
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 806
    move-result-object v1

    .line 807
    .line 808
    .line 809
    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 810
    move-result-object v1

    .line 811
    .line 812
    .line 813
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    move-wide/from16 v10, v21

    .line 822
    .line 823
    .line 824
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 828
    move-result-object v1

    .line 829
    .line 830
    .line 831
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 832
    throw v0

    .line 833
    .line 834
    :cond_34
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 835
    .line 836
    new-instance v1, Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 843
    .line 844
    const-string v2, " cannot be parsed"

    .line 845
    .line 846
    .line 847
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 851
    move-result-object v1

    .line 852
    .line 853
    .line 854
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 855
    throw v0

    .line 856
    .line 857
    :cond_35
    move/from16 v19, v8

    .line 858
    .line 859
    move-wide/from16 v17, v11

    .line 860
    .line 861
    sget-object v1, Lshark/HprofRecordTag;->HEAP_DUMP_END:Lshark/HprofRecordTag;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v1}, Lshark/HprofRecordTag;->getTag()I

    .line 865
    move-result v8

    .line 866
    .line 867
    if-ne v10, v8, :cond_36

    .line 868
    .line 869
    .line 870
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 871
    move-result v8

    .line 872
    .line 873
    if-eqz v8, :cond_37

    .line 874
    .line 875
    move-wide/from16 v10, v17

    .line 876
    .line 877
    .line 878
    invoke-interface {v2, v1, v10, v11, v7}, Lshark/OnHprofRecordTagListener;->a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V

    .line 879
    goto :goto_5

    .line 880
    .line 881
    :cond_36
    move-wide/from16 v10, v17

    .line 882
    .line 883
    .line 884
    invoke-virtual {v7, v10, v11}, Lshark/HprofRecordReader;->V(J)V

    .line 885
    .line 886
    :cond_37
    :goto_5
    move-object/from16 v1, p0

    .line 887
    .line 888
    move/from16 v8, v19

    .line 889
    .line 890
    goto/16 :goto_0

    .line 891
    .line 892
    .line 893
    :cond_38
    invoke-virtual {v7}, Lshark/HprofRecordReader;->a()J

    .line 894
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 895
    const/4 v2, 0x0

    .line 896
    .line 897
    .line 898
    invoke-static {v6, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 899
    return-wide v0

    .line 900
    :goto_6
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 901
    :catchall_1
    move-exception v0

    .line 902
    .line 903
    .line 904
    invoke-static {v6, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 905
    throw v0
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
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method
