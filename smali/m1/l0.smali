.class public Lm1/l0;
.super Ljava/lang/Object;
.source "ShapeStrokeParser.java"


# static fields
.field public static final a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

.field public static final b:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    .line 2
    const-string v7, "hd"

    .line 3
    .line 4
    const-string v8, "d"

    .line 5
    .line 6
    const-string v0, "nm"

    .line 7
    .line 8
    const-string v1, "c"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "w"

    .line 12
    .line 13
    const-string v3, "o"

    .line 14
    .line 15
    const-string v4, "lc"

    .line 16
    .line 17
    const-string v5, "lj"

    .line 18
    .line 19
    const-string v6, "ml"

    .line 20
    .line 21
    .line 22
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader$a;->a([Ljava/lang/String;)Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sput-object v0, Lm1/l0;->a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 30
    .line 31
    const-string v0, "n"

    .line 32
    .line 33
    .line 34
    const-string/jumbo v1, "v"

    .line 35
    .line 36
    .line 37
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader$a;->a([Ljava/lang/String;)Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    sput-object v0, Lm1/l0;->b:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 45
    return-void
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
.end method

.method public static a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lcom/airbnb/lottie/model/content/ShapeStroke;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    new-instance v5, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    move v11, v3

    .line 12
    move v13, v4

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v12, 0x0

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->j()Z

    .line 23
    move-result v14

    .line 24
    .line 25
    if-eqz v14, :cond_8

    .line 26
    .line 27
    sget-object v14, Lm1/l0;->a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v14}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->v(Lcom/airbnb/lottie/parser/moshi/JsonReader$a;)I

    .line 31
    move-result v14

    .line 32
    .line 33
    .line 34
    packed-switch v14, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->x()V

    .line 38
    goto :goto_0

    .line 39
    .line 40
    .line 41
    :pswitch_0
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->b()V

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->j()Z

    .line 45
    move-result v14

    .line 46
    .line 47
    if-eqz v14, :cond_7

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->g()V

    .line 51
    const/4 v14, 0x0

    .line 52
    const/4 v15, 0x0

    .line 53
    .line 54
    .line 55
    :goto_2
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->j()Z

    .line 56
    move-result v16

    .line 57
    .line 58
    if-eqz v16, :cond_3

    .line 59
    .line 60
    sget-object v2, Lm1/l0;->b:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->v(Lcom/airbnb/lottie/parser/moshi/JsonReader$a;)I

    .line 64
    move-result v2

    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    if-eq v2, v1, :cond_1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->w()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->x()V

    .line 75
    goto :goto_2

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-static/range {p0 .. p1}, Lm1/d;->e(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/b;

    .line 79
    move-result-object v15

    .line 80
    goto :goto_2

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->o()Ljava/lang/String;

    .line 84
    move-result-object v14

    .line 85
    goto :goto_2

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->i()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    .line 95
    move-result v17

    .line 96
    .line 97
    .line 98
    sparse-switch v17, :sswitch_data_0

    .line 99
    :goto_3
    const/4 v2, -0x1

    .line 100
    goto :goto_4

    .line 101
    .line 102
    :sswitch_0
    const-string v2, "o"

    .line 103
    .line 104
    .line 105
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    move-result v2

    .line 107
    .line 108
    if-nez v2, :cond_4

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    const/4 v2, 0x2

    .line 111
    goto :goto_4

    .line 112
    .line 113
    :sswitch_1
    const-string v2, "g"

    .line 114
    .line 115
    .line 116
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    move-result v2

    .line 118
    .line 119
    if-nez v2, :cond_5

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    move v2, v1

    .line 122
    goto :goto_4

    .line 123
    .line 124
    :sswitch_2
    const-string v2, "d"

    .line 125
    .line 126
    .line 127
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    move-result v2

    .line 129
    .line 130
    if-nez v2, :cond_6

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move v2, v4

    .line 133
    .line 134
    .line 135
    :goto_4
    packed-switch v2, :pswitch_data_1

    .line 136
    .line 137
    move-object/from16 v2, p1

    .line 138
    goto :goto_1

    .line 139
    .line 140
    :pswitch_1
    move-object/from16 v2, p1

    .line 141
    move-object v9, v15

    .line 142
    goto :goto_1

    .line 143
    .line 144
    :pswitch_2
    move-object/from16 v2, p1

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v1}, Lcom/airbnb/lottie/h;->u(Z)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v5, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    goto :goto_1

    .line 152
    .line 153
    :cond_7
    move-object/from16 v2, p1

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->h()V

    .line 157
    .line 158
    .line 159
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 160
    move-result v14

    .line 161
    .line 162
    if-ne v14, v1, :cond_0

    .line 163
    .line 164
    .line 165
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 166
    move-result-object v14

    .line 167
    .line 168
    check-cast v14, Li1/b;

    .line 169
    .line 170
    .line 171
    invoke-interface {v5, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :pswitch_3
    move-object/from16 v2, p1

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->k()Z

    .line 179
    move-result v13

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :pswitch_4
    move-object/from16 v2, p1

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->l()D

    .line 187
    move-result-wide v14

    .line 188
    double-to-float v11, v14

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :pswitch_5
    move-object/from16 v2, p1

    .line 193
    .line 194
    .line 195
    invoke-static {}, Lcom/airbnb/lottie/model/content/ShapeStroke$LineJoinType;->values()[Lcom/airbnb/lottie/model/content/ShapeStroke$LineJoinType;

    .line 196
    move-result-object v7

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->m()I

    .line 200
    move-result v14

    .line 201
    sub-int/2addr v14, v1

    .line 202
    .line 203
    aget-object v7, v7, v14

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :pswitch_6
    move-object/from16 v2, p1

    .line 208
    .line 209
    .line 210
    invoke-static {}, Lcom/airbnb/lottie/model/content/ShapeStroke$LineCapType;->values()[Lcom/airbnb/lottie/model/content/ShapeStroke$LineCapType;

    .line 211
    move-result-object v6

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->m()I

    .line 215
    move-result v14

    .line 216
    sub-int/2addr v14, v1

    .line 217
    .line 218
    aget-object v6, v6, v14

    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :pswitch_7
    move-object/from16 v2, p1

    .line 223
    .line 224
    .line 225
    invoke-static/range {p0 .. p1}, Lm1/d;->h(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/d;

    .line 226
    move-result-object v3

    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :pswitch_8
    move-object/from16 v2, p1

    .line 231
    .line 232
    .line 233
    invoke-static/range {p0 .. p1}, Lm1/d;->e(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/b;

    .line 234
    move-result-object v12

    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :pswitch_9
    move-object/from16 v2, p1

    .line 239
    .line 240
    .line 241
    invoke-static/range {p0 .. p1}, Lm1/d;->c(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/a;

    .line 242
    move-result-object v10

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :pswitch_a
    move-object/from16 v2, p1

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->o()Ljava/lang/String;

    .line 250
    move-result-object v8

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_8
    if-nez v3, :cond_9

    .line 255
    .line 256
    new-instance v3, Li1/d;

    .line 257
    .line 258
    new-instance v0, Lp1/a;

    .line 259
    .line 260
    const/16 v1, 0x64

    .line 261
    .line 262
    .line 263
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    move-result-object v1

    .line 265
    .line 266
    .line 267
    invoke-direct {v0, v1}, Lp1/a;-><init>(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 271
    move-result-object v0

    .line 272
    .line 273
    .line 274
    invoke-direct {v3, v0}, Li1/d;-><init>(Ljava/util/List;)V

    .line 275
    .line 276
    :cond_9
    if-nez v6, :cond_a

    .line 277
    .line 278
    sget-object v6, Lcom/airbnb/lottie/model/content/ShapeStroke$LineCapType;->BUTT:Lcom/airbnb/lottie/model/content/ShapeStroke$LineCapType;

    .line 279
    .line 280
    :cond_a
    if-nez v7, :cond_b

    .line 281
    .line 282
    sget-object v7, Lcom/airbnb/lottie/model/content/ShapeStroke$LineJoinType;->MITER:Lcom/airbnb/lottie/model/content/ShapeStroke$LineJoinType;

    .line 283
    .line 284
    :cond_b
    new-instance v2, Lcom/airbnb/lottie/model/content/ShapeStroke;

    .line 285
    move-object v4, v9

    .line 286
    move-object v9, v6

    .line 287
    move-object v6, v10

    .line 288
    move-object v10, v7

    .line 289
    move-object v7, v3

    .line 290
    move-object v3, v8

    .line 291
    move-object v8, v12

    .line 292
    move v12, v13

    .line 293
    .line 294
    .line 295
    invoke-direct/range {v2 .. v12}, Lcom/airbnb/lottie/model/content/ShapeStroke;-><init>(Ljava/lang/String;Li1/b;Ljava/util/List;Li1/a;Li1/d;Li1/b;Lcom/airbnb/lottie/model/content/ShapeStroke$LineCapType;Lcom/airbnb/lottie/model/content/ShapeStroke$LineJoinType;FZ)V

    .line 296
    return-object v2

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
    .end packed-switch

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
    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_2
        0x67 -> :sswitch_1
        0x6f -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
.end method
