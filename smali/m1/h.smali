.class public Lm1/h;
.super Ljava/lang/Object;
.source "ContentModelParser.java"


# static fields
.field public static final a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "ty"

    .line 4
    .line 5
    const-string v1, "d"

    .line 6
    .line 7
    .line 8
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader$a;->a([Ljava/lang/String;)Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sput-object v0, Lm1/h;->a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lj1/c;
    .locals 7
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->g()V

    .line 5
    const/4 v1, 0x2

    .line 6
    move v2, v1

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->j()Z

    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    .line 13
    if-eqz v3, :cond_2

    .line 14
    .line 15
    sget-object v3, Lm1/h;->a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->v(Lcom/airbnb/lottie/parser/moshi/JsonReader$a;)I

    .line 19
    move-result v3

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    if-eq v3, v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->w()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->x()V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->m()I

    .line 34
    move-result v2

    .line 35
    goto :goto_0

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->o()Ljava/lang/String;

    .line 39
    move-result-object v3

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v3, v4

    .line 42
    .line 43
    :goto_1
    if-nez v3, :cond_3

    .line 44
    return-object v4

    .line 45
    :cond_3
    const/4 v5, -0x1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 49
    move-result v6

    .line 50
    .line 51
    .line 52
    sparse-switch v6, :sswitch_data_0

    .line 53
    :goto_2
    move v0, v5

    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    .line 58
    :sswitch_0
    const-string/jumbo v0, "tr"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    move-result v0

    .line 63
    .line 64
    if-nez v0, :cond_4

    .line 65
    goto :goto_2

    .line 66
    .line 67
    :cond_4
    const/16 v0, 0xd

    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    .line 72
    :sswitch_1
    const-string/jumbo v0, "tm"

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    move-result v0

    .line 77
    .line 78
    if-nez v0, :cond_5

    .line 79
    goto :goto_2

    .line 80
    .line 81
    :cond_5
    const/16 v0, 0xc

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    .line 86
    :sswitch_2
    const-string/jumbo v0, "st"

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    move-result v0

    .line 91
    .line 92
    if-nez v0, :cond_6

    .line 93
    goto :goto_2

    .line 94
    .line 95
    :cond_6
    const/16 v0, 0xb

    .line 96
    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    .line 100
    :sswitch_3
    const-string/jumbo v0, "sr"

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    move-result v0

    .line 105
    .line 106
    if-nez v0, :cond_7

    .line 107
    goto :goto_2

    .line 108
    .line 109
    :cond_7
    const/16 v0, 0xa

    .line 110
    .line 111
    goto/16 :goto_3

    .line 112
    .line 113
    .line 114
    :sswitch_4
    const-string/jumbo v0, "sh"

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    move-result v0

    .line 119
    .line 120
    if-nez v0, :cond_8

    .line 121
    goto :goto_2

    .line 122
    .line 123
    :cond_8
    const/16 v0, 0x9

    .line 124
    .line 125
    goto/16 :goto_3

    .line 126
    .line 127
    :sswitch_5
    const-string v0, "rp"

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    move-result v0

    .line 132
    .line 133
    if-nez v0, :cond_9

    .line 134
    goto :goto_2

    .line 135
    .line 136
    :cond_9
    const/16 v0, 0x8

    .line 137
    goto :goto_3

    .line 138
    .line 139
    :sswitch_6
    const-string v0, "rd"

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    move-result v0

    .line 144
    .line 145
    if-nez v0, :cond_a

    .line 146
    goto :goto_2

    .line 147
    :cond_a
    const/4 v0, 0x7

    .line 148
    goto :goto_3

    .line 149
    .line 150
    :sswitch_7
    const-string v0, "rc"

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    move-result v0

    .line 155
    .line 156
    if-nez v0, :cond_b

    .line 157
    goto :goto_2

    .line 158
    :cond_b
    const/4 v0, 0x6

    .line 159
    goto :goto_3

    .line 160
    .line 161
    :sswitch_8
    const-string v0, "mm"

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    move-result v0

    .line 166
    .line 167
    if-nez v0, :cond_c

    .line 168
    goto :goto_2

    .line 169
    :cond_c
    const/4 v0, 0x5

    .line 170
    goto :goto_3

    .line 171
    .line 172
    :sswitch_9
    const-string v0, "gs"

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    move-result v0

    .line 177
    .line 178
    if-nez v0, :cond_d

    .line 179
    goto :goto_2

    .line 180
    :cond_d
    const/4 v0, 0x4

    .line 181
    goto :goto_3

    .line 182
    .line 183
    :sswitch_a
    const-string v0, "gr"

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    move-result v0

    .line 188
    .line 189
    if-nez v0, :cond_e

    .line 190
    .line 191
    goto/16 :goto_2

    .line 192
    :cond_e
    const/4 v0, 0x3

    .line 193
    goto :goto_3

    .line 194
    .line 195
    :sswitch_b
    const-string v0, "gf"

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    move-result v0

    .line 200
    .line 201
    if-nez v0, :cond_f

    .line 202
    .line 203
    goto/16 :goto_2

    .line 204
    :cond_f
    move v0, v1

    .line 205
    goto :goto_3

    .line 206
    .line 207
    :sswitch_c
    const-string v1, "fl"

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    move-result v1

    .line 212
    .line 213
    if-nez v1, :cond_11

    .line 214
    .line 215
    goto/16 :goto_2

    .line 216
    .line 217
    :sswitch_d
    const-string v0, "el"

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    move-result v0

    .line 222
    .line 223
    if-nez v0, :cond_10

    .line 224
    .line 225
    goto/16 :goto_2

    .line 226
    :cond_10
    const/4 v0, 0x0

    .line 227
    .line 228
    .line 229
    :cond_11
    :goto_3
    packed-switch v0, :pswitch_data_0

    .line 230
    .line 231
    new-instance p1, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    const-string v0, "Unknown shape type "

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    move-result-object p1

    .line 247
    .line 248
    .line 249
    invoke-static {p1}, Lo1/f;->c(Ljava/lang/String;)V

    .line 250
    goto :goto_4

    .line 251
    .line 252
    .line 253
    :pswitch_0
    invoke-static {p0, p1}, Lm1/c;->g(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/l;

    .line 254
    move-result-object v4

    .line 255
    goto :goto_4

    .line 256
    .line 257
    .line 258
    :pswitch_1
    invoke-static {p0, p1}, Lm1/m0;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lcom/airbnb/lottie/model/content/ShapeTrimPath;

    .line 259
    move-result-object v4

    .line 260
    goto :goto_4

    .line 261
    .line 262
    .line 263
    :pswitch_2
    invoke-static {p0, p1}, Lm1/l0;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lcom/airbnb/lottie/model/content/ShapeStroke;

    .line 264
    move-result-object v4

    .line 265
    goto :goto_4

    .line 266
    .line 267
    .line 268
    :pswitch_3
    invoke-static {p0, p1, v2}, Lm1/c0;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;I)Lcom/airbnb/lottie/model/content/PolystarShape;

    .line 269
    move-result-object v4

    .line 270
    goto :goto_4

    .line 271
    .line 272
    .line 273
    :pswitch_4
    invoke-static {p0, p1}, Lm1/k0;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lj1/l;

    .line 274
    move-result-object v4

    .line 275
    goto :goto_4

    .line 276
    .line 277
    .line 278
    :pswitch_5
    invoke-static {p0, p1}, Lm1/e0;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lj1/g;

    .line 279
    move-result-object v4

    .line 280
    goto :goto_4

    .line 281
    .line 282
    .line 283
    :pswitch_6
    invoke-static {p0, p1}, Lm1/f0;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lj1/h;

    .line 284
    move-result-object v4

    .line 285
    goto :goto_4

    .line 286
    .line 287
    .line 288
    :pswitch_7
    invoke-static {p0, p1}, Lm1/d0;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lj1/f;

    .line 289
    move-result-object v4

    .line 290
    goto :goto_4

    .line 291
    .line 292
    .line 293
    :pswitch_8
    invoke-static {p0}, Lm1/y;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;)Lcom/airbnb/lottie/model/content/MergePaths;

    .line 294
    move-result-object v4

    .line 295
    .line 296
    const-string v0, "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/h;->a(Ljava/lang/String;)V

    .line 300
    goto :goto_4

    .line 301
    .line 302
    .line 303
    :pswitch_9
    invoke-static {p0, p1}, Lm1/q;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lcom/airbnb/lottie/model/content/a;

    .line 304
    move-result-object v4

    .line 305
    goto :goto_4

    .line 306
    .line 307
    .line 308
    :pswitch_a
    invoke-static {p0, p1}, Lm1/j0;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lj1/k;

    .line 309
    move-result-object v4

    .line 310
    goto :goto_4

    .line 311
    .line 312
    .line 313
    :pswitch_b
    invoke-static {p0, p1}, Lm1/p;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lj1/e;

    .line 314
    move-result-object v4

    .line 315
    goto :goto_4

    .line 316
    .line 317
    .line 318
    :pswitch_c
    invoke-static {p0, p1}, Lm1/i0;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Lj1/j;

    .line 319
    move-result-object v4

    .line 320
    goto :goto_4

    .line 321
    .line 322
    .line 323
    :pswitch_d
    invoke-static {p0, p1, v2}, Lm1/f;->a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;I)Lj1/b;

    .line 324
    move-result-object v4

    .line 325
    .line 326
    .line 327
    :goto_4
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->j()Z

    .line 328
    move-result p1

    .line 329
    .line 330
    if-eqz p1, :cond_12

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->x()V

    .line 334
    goto :goto_4

    .line 335
    .line 336
    .line 337
    :cond_12
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->i()V

    .line 338
    return-object v4

    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    :sswitch_data_0
    .sparse-switch
        0xca7 -> :sswitch_d
        0xcc6 -> :sswitch_c
        0xcdf -> :sswitch_b
        0xceb -> :sswitch_a
        0xcec -> :sswitch_9
        0xda0 -> :sswitch_8
        0xe31 -> :sswitch_7
        0xe32 -> :sswitch_6
        0xe3e -> :sswitch_5
        0xe55 -> :sswitch_4
        0xe5f -> :sswitch_3
        0xe61 -> :sswitch_2
        0xe79 -> :sswitch_1
        0xe7e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
.end method
