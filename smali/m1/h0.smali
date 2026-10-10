.class public Lm1/h0;
.super Ljava/lang/Object;
.source "ShapeDataParser.java"

# interfaces
.implements Lm1/n0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm1/n0<",
        "Lj1/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm1/h0;

.field public static final b:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lm1/h0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lm1/h0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lm1/h0;->a:Lm1/h0;

    .line 8
    .line 9
    const-string v0, "i"

    .line 10
    .line 11
    const-string v1, "o"

    .line 12
    .line 13
    const-string v2, "c"

    .line 14
    .line 15
    .line 16
    const-string/jumbo v3, "v"

    .line 17
    .line 18
    .line 19
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader$a;->a([Ljava/lang/String;)Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sput-object v0, Lm1/h0;->b:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 27
    return-void
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
.end method


# virtual methods
.method public bridge synthetic a(Lcom/airbnb/lottie/parser/moshi/JsonReader;F)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lm1/h0;->b(Lcom/airbnb/lottie/parser/moshi/JsonReader;F)Lj1/i;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public b(Lcom/airbnb/lottie/parser/moshi/JsonReader;F)Lj1/i;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->q()Lcom/airbnb/lottie/parser/moshi/JsonReader$Token;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/airbnb/lottie/parser/moshi/JsonReader$Token;->BEGIN_ARRAY:Lcom/airbnb/lottie/parser/moshi/JsonReader$Token;

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->b()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->g()V

    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    move-object v2, v0

    .line 18
    move-object v3, v2

    .line 19
    move v4, v1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p1}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->j()Z

    .line 23
    move-result v5

    .line 24
    const/4 v6, 0x1

    .line 25
    .line 26
    if-eqz v5, :cond_5

    .line 27
    .line 28
    sget-object v5, Lm1/h0;->b:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v5}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->v(Lcom/airbnb/lottie/parser/moshi/JsonReader$a;)I

    .line 32
    move-result v5

    .line 33
    .line 34
    if-eqz v5, :cond_4

    .line 35
    .line 36
    if-eq v5, v6, :cond_3

    .line 37
    const/4 v6, 0x2

    .line 38
    .line 39
    if-eq v5, v6, :cond_2

    .line 40
    const/4 v6, 0x3

    .line 41
    .line 42
    if-eq v5, v6, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->w()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->x()V

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {p1, p2}, Lm1/s;->f(Lcom/airbnb/lottie/parser/moshi/JsonReader;F)Ljava/util/List;

    .line 53
    move-result-object v3

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-static {p1, p2}, Lm1/s;->f(Lcom/airbnb/lottie/parser/moshi/JsonReader;F)Ljava/util/List;

    .line 58
    move-result-object v2

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-static {p1, p2}, Lm1/s;->f(Lcom/airbnb/lottie/parser/moshi/JsonReader;F)Ljava/util/List;

    .line 63
    move-result-object v0

    .line 64
    goto :goto_0

    .line 65
    .line 66
    .line 67
    :cond_4
    invoke-virtual {p1}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->k()Z

    .line 68
    move-result v4

    .line 69
    goto :goto_0

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {p1}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->i()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->q()Lcom/airbnb/lottie/parser/moshi/JsonReader$Token;

    .line 76
    move-result-object p2

    .line 77
    .line 78
    sget-object v5, Lcom/airbnb/lottie/parser/moshi/JsonReader$Token;->END_ARRAY:Lcom/airbnb/lottie/parser/moshi/JsonReader$Token;

    .line 79
    .line 80
    if-ne p2, v5, :cond_6

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->h()V

    .line 84
    .line 85
    :cond_6
    if-eqz v0, :cond_a

    .line 86
    .line 87
    if-eqz v2, :cond_a

    .line 88
    .line 89
    if-eqz v3, :cond_a

    .line 90
    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 93
    move-result p1

    .line 94
    .line 95
    if-eqz p1, :cond_7

    .line 96
    .line 97
    new-instance p1, Lj1/i;

    .line 98
    .line 99
    new-instance p2, Landroid/graphics/PointF;

    .line 100
    .line 101
    .line 102
    invoke-direct {p2}, Landroid/graphics/PointF;-><init>()V

    .line 103
    .line 104
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 105
    .line 106
    .line 107
    invoke-direct {p1, p2, v1, v0}, Lj1/i;-><init>(Landroid/graphics/PointF;ZLjava/util/List;)V

    .line 108
    return-object p1

    .line 109
    .line 110
    .line 111
    :cond_7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 112
    move-result p1

    .line 113
    .line 114
    .line 115
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 116
    move-result-object p2

    .line 117
    .line 118
    check-cast p2, Landroid/graphics/PointF;

    .line 119
    .line 120
    new-instance v5, Ljava/util/ArrayList;

    .line 121
    .line 122
    .line 123
    invoke-direct {v5, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    move v7, v6

    .line 125
    .line 126
    :goto_1
    if-ge v7, p1, :cond_8

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    move-result-object v8

    .line 131
    .line 132
    check-cast v8, Landroid/graphics/PointF;

    .line 133
    .line 134
    add-int/lit8 v9, v7, -0x1

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    move-result-object v10

    .line 139
    .line 140
    check-cast v10, Landroid/graphics/PointF;

    .line 141
    .line 142
    .line 143
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    move-result-object v9

    .line 145
    .line 146
    check-cast v9, Landroid/graphics/PointF;

    .line 147
    .line 148
    .line 149
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    move-result-object v11

    .line 151
    .line 152
    check-cast v11, Landroid/graphics/PointF;

    .line 153
    .line 154
    .line 155
    invoke-static {v10, v9}, Lo1/k;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 156
    move-result-object v9

    .line 157
    .line 158
    .line 159
    invoke-static {v8, v11}, Lo1/k;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 160
    move-result-object v10

    .line 161
    .line 162
    new-instance v11, Lh1/a;

    .line 163
    .line 164
    .line 165
    invoke-direct {v11, v9, v10, v8}, Lh1/a;-><init>(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v5, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    add-int/lit8 v7, v7, 0x1

    .line 171
    goto :goto_1

    .line 172
    .line 173
    :cond_8
    if-eqz v4, :cond_9

    .line 174
    .line 175
    .line 176
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    move-result-object v7

    .line 178
    .line 179
    check-cast v7, Landroid/graphics/PointF;

    .line 180
    sub-int/2addr p1, v6

    .line 181
    .line 182
    .line 183
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 184
    move-result-object v0

    .line 185
    .line 186
    check-cast v0, Landroid/graphics/PointF;

    .line 187
    .line 188
    .line 189
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 190
    move-result-object p1

    .line 191
    .line 192
    check-cast p1, Landroid/graphics/PointF;

    .line 193
    .line 194
    .line 195
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 196
    move-result-object v1

    .line 197
    .line 198
    check-cast v1, Landroid/graphics/PointF;

    .line 199
    .line 200
    .line 201
    invoke-static {v0, p1}, Lo1/k;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 202
    move-result-object p1

    .line 203
    .line 204
    .line 205
    invoke-static {v7, v1}, Lo1/k;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 206
    move-result-object v0

    .line 207
    .line 208
    new-instance v1, Lh1/a;

    .line 209
    .line 210
    .line 211
    invoke-direct {v1, p1, v0, v7}, Lh1/a;-><init>(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    :cond_9
    new-instance p1, Lj1/i;

    .line 217
    .line 218
    .line 219
    invoke-direct {p1, p2, v4, v5}, Lj1/i;-><init>(Landroid/graphics/PointF;ZLjava/util/List;)V

    .line 220
    return-object p1

    .line 221
    .line 222
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 223
    .line 224
    const-string p2, "Shape data was missing information."

    .line 225
    .line 226
    .line 227
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 228
    throw p1
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
.end method
