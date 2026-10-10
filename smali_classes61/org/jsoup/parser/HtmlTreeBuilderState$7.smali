.class final enum Lorg/jsoup/parser/HtmlTreeBuilderState$7;
.super Lorg/jsoup/parser/HtmlTreeBuilderState;
.source "HtmlTreeBuilderState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jsoup/parser/HtmlTreeBuilderState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v0}, Lorg/jsoup/parser/HtmlTreeBuilderState;-><init>(Ljava/lang/String;ILorg/jsoup/parser/HtmlTreeBuilderState$1;)V

    .line 5
    return-void
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
.method public anyOtherEndTag(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lorg/jsoup/parser/Token;->d()Lorg/jsoup/parser/Token$g;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-object p1, p1, Lorg/jsoup/parser/Token$i;->c:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->D()Ljava/util/ArrayList;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    :goto_0
    if-ltz v1, :cond_3

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    check-cast v3, Lorg/jsoup/nodes/Element;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result v4

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->v(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    move-result v0

    .line 50
    .line 51
    if-nez v0, :cond_0

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->m0(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 58
    goto :goto_1

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->d0(Lorg/jsoup/nodes/Element;)Z

    .line 62
    move-result v3

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 68
    const/4 p1, 0x0

    .line 69
    return p1

    .line 70
    .line 71
    :cond_2
    add-int/lit8 v1, v1, -0x1

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    :goto_1
    return v2
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

.method public final e(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    const-string v1, "br"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lorg/jsoup/parser/Token;->d()Lorg/jsoup/parser/Token$g;

    .line 7
    move-result-object v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lorg/jsoup/parser/Token$i;->D()Ljava/lang/String;

    .line 11
    move-result-object v3

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    const-string v4, "body"

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, -0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 22
    move-result v7

    .line 23
    .line 24
    .line 25
    sparse-switch v7, :sswitch_data_0

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_0
    const-string v7, "sarcasm"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    move-result v7

    .line 34
    .line 35
    if-nez v7, :cond_0

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_0
    const/16 v6, 0xf

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    .line 44
    :sswitch_1
    const-string/jumbo v7, "span"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    move-result v7

    .line 49
    .line 50
    if-nez v7, :cond_1

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_1
    const/16 v6, 0xe

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_2
    const-string v7, "html"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    move-result v7

    .line 63
    .line 64
    if-nez v7, :cond_2

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_2
    const/16 v6, 0xd

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_3
    const-string v7, "form"

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    move-result v7

    .line 77
    .line 78
    if-nez v7, :cond_3

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_3
    const/16 v6, 0xc

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    .line 87
    :sswitch_4
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    move-result v7

    .line 89
    .line 90
    if-nez v7, :cond_4

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :cond_4
    const/16 v6, 0xb

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :sswitch_5
    const-string v7, "li"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    move-result v7

    .line 103
    .line 104
    if-nez v7, :cond_5

    .line 105
    .line 106
    goto/16 :goto_0

    .line 107
    .line 108
    :cond_5
    const/16 v6, 0xa

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :sswitch_6
    const-string v7, "h6"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    move-result v7

    .line 117
    .line 118
    if-nez v7, :cond_6

    .line 119
    .line 120
    goto/16 :goto_0

    .line 121
    .line 122
    :cond_6
    const/16 v6, 0x9

    .line 123
    .line 124
    goto/16 :goto_0

    .line 125
    .line 126
    :sswitch_7
    const-string v7, "h5"

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    move-result v7

    .line 131
    .line 132
    if-nez v7, :cond_7

    .line 133
    .line 134
    goto/16 :goto_0

    .line 135
    .line 136
    :cond_7
    const/16 v6, 0x8

    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :sswitch_8
    const-string v7, "h4"

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    move-result v7

    .line 145
    .line 146
    if-nez v7, :cond_8

    .line 147
    goto :goto_0

    .line 148
    :cond_8
    const/4 v6, 0x7

    .line 149
    goto :goto_0

    .line 150
    .line 151
    :sswitch_9
    const-string v7, "h3"

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    move-result v7

    .line 156
    .line 157
    if-nez v7, :cond_9

    .line 158
    goto :goto_0

    .line 159
    :cond_9
    const/4 v6, 0x6

    .line 160
    goto :goto_0

    .line 161
    .line 162
    :sswitch_a
    const-string v7, "h2"

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    move-result v7

    .line 167
    .line 168
    if-nez v7, :cond_a

    .line 169
    goto :goto_0

    .line 170
    :cond_a
    const/4 v6, 0x5

    .line 171
    goto :goto_0

    .line 172
    .line 173
    :sswitch_b
    const-string v7, "h1"

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    move-result v7

    .line 178
    .line 179
    if-nez v7, :cond_b

    .line 180
    goto :goto_0

    .line 181
    :cond_b
    const/4 v6, 0x4

    .line 182
    goto :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v7, "dt"

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    move-result v7

    .line 189
    .line 190
    if-nez v7, :cond_c

    .line 191
    goto :goto_0

    .line 192
    :cond_c
    const/4 v6, 0x3

    .line 193
    goto :goto_0

    .line 194
    .line 195
    :sswitch_d
    const-string v7, "dd"

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    move-result v7

    .line 200
    .line 201
    if-nez v7, :cond_d

    .line 202
    goto :goto_0

    .line 203
    :cond_d
    const/4 v6, 0x2

    .line 204
    goto :goto_0

    .line 205
    .line 206
    .line 207
    :sswitch_e
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    move-result v7

    .line 209
    .line 210
    if-nez v7, :cond_e

    .line 211
    goto :goto_0

    .line 212
    :cond_e
    move v6, v0

    .line 213
    goto :goto_0

    .line 214
    .line 215
    :sswitch_f
    const-string v7, "p"

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    move-result v7

    .line 220
    .line 221
    if-nez v7, :cond_f

    .line 222
    goto :goto_0

    .line 223
    :cond_f
    move v6, v5

    .line 224
    .line 225
    .line 226
    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 227
    .line 228
    sget-object v1, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->s:[Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    invoke-static {v3, v1}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 232
    move-result v1

    .line 233
    .line 234
    if-eqz v1, :cond_10

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, p1, p2}, Lorg/jsoup/parser/HtmlTreeBuilderState$7;->f(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z

    .line 238
    move-result p1

    .line 239
    return p1

    .line 240
    .line 241
    :cond_10
    sget-object v1, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->r:[Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    invoke-static {v3, v1}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 245
    move-result v1

    .line 246
    .line 247
    if-eqz v1, :cond_13

    .line 248
    .line 249
    .line 250
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->G(Ljava/lang/String;)Z

    .line 251
    move-result p1

    .line 252
    .line 253
    if-nez p1, :cond_11

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 257
    return v5

    .line 258
    .line 259
    .line 260
    :cond_11
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->u()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 264
    move-result-object p1

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 268
    move-result-object p1

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    move-result p1

    .line 273
    .line 274
    if-nez p1, :cond_12

    .line 275
    .line 276
    .line 277
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 278
    .line 279
    .line 280
    :cond_12
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->m0(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 281
    .line 282
    goto/16 :goto_2

    .line 283
    .line 284
    :cond_13
    sget-object v1, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->m:[Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    invoke-static {v3, v1}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 288
    move-result v1

    .line 289
    .line 290
    if-eqz v1, :cond_16

    .line 291
    .line 292
    const-string p1, "name"

    .line 293
    .line 294
    .line 295
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->G(Ljava/lang/String;)Z

    .line 296
    move-result p1

    .line 297
    .line 298
    if-nez p1, :cond_23

    .line 299
    .line 300
    .line 301
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->G(Ljava/lang/String;)Z

    .line 302
    move-result p1

    .line 303
    .line 304
    if-nez p1, :cond_14

    .line 305
    .line 306
    .line 307
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 308
    return v5

    .line 309
    .line 310
    .line 311
    :cond_14
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->u()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p2}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 315
    move-result-object p1

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 319
    move-result-object p1

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    move-result p1

    .line 324
    .line 325
    if-nez p1, :cond_15

    .line 326
    .line 327
    .line 328
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 329
    .line 330
    .line 331
    :cond_15
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->m0(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 332
    .line 333
    .line 334
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->m()V

    .line 335
    .line 336
    goto/16 :goto_2

    .line 337
    .line 338
    .line 339
    :cond_16
    invoke-virtual {p0, p1, p2}, Lorg/jsoup/parser/HtmlTreeBuilderState$7;->anyOtherEndTag(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z

    .line 340
    move-result p1

    .line 341
    return p1

    .line 342
    .line 343
    .line 344
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lorg/jsoup/parser/HtmlTreeBuilderState$7;->anyOtherEndTag(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z

    .line 345
    move-result p1

    .line 346
    return p1

    .line 347
    .line 348
    .line 349
    :pswitch_1
    invoke-virtual {p2, v4}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 350
    move-result p1

    .line 351
    .line 352
    if-eqz p1, :cond_23

    .line 353
    .line 354
    .line 355
    invoke-virtual {p2, v2}, Lorg/jsoup/parser/b;->g(Lorg/jsoup/parser/Token;)Z

    .line 356
    move-result p1

    .line 357
    return p1

    .line 358
    .line 359
    .line 360
    :pswitch_2
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->z()Lph0/b;

    .line 361
    move-result-object p1

    .line 362
    const/4 v1, 0x0

    .line 363
    .line 364
    .line 365
    invoke-virtual {p2, v1}, Lorg/jsoup/parser/b;->z0(Lph0/b;)V

    .line 366
    .line 367
    if-eqz p1, :cond_19

    .line 368
    .line 369
    .line 370
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->G(Ljava/lang/String;)Z

    .line 371
    move-result v1

    .line 372
    .line 373
    if-nez v1, :cond_17

    .line 374
    goto :goto_1

    .line 375
    .line 376
    .line 377
    :cond_17
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->u()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p2}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 381
    move-result-object v1

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 385
    move-result-object v1

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    move-result v1

    .line 390
    .line 391
    if-nez v1, :cond_18

    .line 392
    .line 393
    .line 394
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 395
    .line 396
    .line 397
    :cond_18
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->t0(Lorg/jsoup/nodes/Element;)Z

    .line 398
    .line 399
    goto/16 :goto_2

    .line 400
    .line 401
    .line 402
    :cond_19
    :goto_1
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 403
    return v5

    .line 404
    .line 405
    .line 406
    :pswitch_3
    invoke-virtual {p2, v4}, Lorg/jsoup/parser/b;->G(Ljava/lang/String;)Z

    .line 407
    move-result p1

    .line 408
    .line 409
    if-nez p1, :cond_1a

    .line 410
    .line 411
    .line 412
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 413
    return v5

    .line 414
    .line 415
    :cond_1a
    sget-object p1, Lorg/jsoup/parser/HtmlTreeBuilderState;->AfterBody:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 416
    .line 417
    .line 418
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->D0(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 419
    .line 420
    goto/16 :goto_2

    .line 421
    .line 422
    .line 423
    :pswitch_4
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->F(Ljava/lang/String;)Z

    .line 424
    move-result p1

    .line 425
    .line 426
    if-nez p1, :cond_1b

    .line 427
    .line 428
    .line 429
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 430
    return v5

    .line 431
    .line 432
    .line 433
    :cond_1b
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->v(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {p2}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 437
    move-result-object p1

    .line 438
    .line 439
    .line 440
    invoke-virtual {p1}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 441
    move-result-object p1

    .line 442
    .line 443
    .line 444
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    move-result p1

    .line 446
    .line 447
    if-nez p1, :cond_1c

    .line 448
    .line 449
    .line 450
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 451
    .line 452
    .line 453
    :cond_1c
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->m0(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 454
    .line 455
    goto/16 :goto_2

    .line 456
    .line 457
    :pswitch_5
    sget-object p1, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->i:[Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->I([Ljava/lang/String;)Z

    .line 461
    move-result v1

    .line 462
    .line 463
    if-nez v1, :cond_1d

    .line 464
    .line 465
    .line 466
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 467
    return v5

    .line 468
    .line 469
    .line 470
    :cond_1d
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->v(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {p2}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 474
    move-result-object v1

    .line 475
    .line 476
    .line 477
    invoke-virtual {v1}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 478
    move-result-object v1

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 482
    move-result v1

    .line 483
    .line 484
    if-nez v1, :cond_1e

    .line 485
    .line 486
    .line 487
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 488
    .line 489
    .line 490
    :cond_1e
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->n0([Ljava/lang/String;)V

    .line 491
    goto :goto_2

    .line 492
    .line 493
    .line 494
    :pswitch_6
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->G(Ljava/lang/String;)Z

    .line 495
    move-result p1

    .line 496
    .line 497
    if-nez p1, :cond_1f

    .line 498
    .line 499
    .line 500
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 501
    return v5

    .line 502
    .line 503
    .line 504
    :cond_1f
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->v(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {p2}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 508
    move-result-object p1

    .line 509
    .line 510
    .line 511
    invoke-virtual {p1}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 512
    move-result-object p1

    .line 513
    .line 514
    .line 515
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 516
    move-result p1

    .line 517
    .line 518
    if-nez p1, :cond_20

    .line 519
    .line 520
    .line 521
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 522
    .line 523
    .line 524
    :cond_20
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->m0(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 525
    goto :goto_2

    .line 526
    .line 527
    .line 528
    :pswitch_7
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {p2, v1}, Lorg/jsoup/parser/i;->i(Ljava/lang/String;)Z

    .line 532
    return v5

    .line 533
    .line 534
    .line 535
    :pswitch_8
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 536
    move-result p1

    .line 537
    .line 538
    if-nez p1, :cond_21

    .line 539
    .line 540
    .line 541
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/i;->i(Ljava/lang/String;)Z

    .line 545
    .line 546
    .line 547
    invoke-virtual {p2, v2}, Lorg/jsoup/parser/b;->g(Lorg/jsoup/parser/Token;)Z

    .line 548
    move-result p1

    .line 549
    return p1

    .line 550
    .line 551
    .line 552
    :cond_21
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->v(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {p2}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 556
    move-result-object p1

    .line 557
    .line 558
    .line 559
    invoke-virtual {p1}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 560
    move-result-object p1

    .line 561
    .line 562
    .line 563
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 564
    move-result p1

    .line 565
    .line 566
    if-nez p1, :cond_22

    .line 567
    .line 568
    .line 569
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 570
    .line 571
    .line 572
    :cond_22
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->m0(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 573
    :cond_23
    :goto_2
    return v0

    .line 574
    nop

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
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    :sswitch_data_0
    .sparse-switch
        0x70 -> :sswitch_f
        0xc50 -> :sswitch_e
        0xc80 -> :sswitch_d
        0xc90 -> :sswitch_c
        0xcc9 -> :sswitch_b
        0xcca -> :sswitch_a
        0xccb -> :sswitch_9
        0xccc -> :sswitch_8
        0xccd -> :sswitch_7
        0xcce -> :sswitch_6
        0xd7d -> :sswitch_5
        0x2e39a2 -> :sswitch_4
        0x300cc4 -> :sswitch_3
        0x3107ab -> :sswitch_2
        0x35f74a -> :sswitch_1
        0x6f67a51c -> :sswitch_0
    .end sparse-switch

    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
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

.method public final f(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lorg/jsoup/parser/Token;->d()Lorg/jsoup/parser/Token$g;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/jsoup/parser/Token$i;->D()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->D()Ljava/util/ArrayList;

    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    .line 16
    :goto_0
    const/16 v4, 0x8

    .line 17
    const/4 v5, 0x1

    .line 18
    .line 19
    if-ge v3, v4, :cond_11

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v0}, Lorg/jsoup/parser/b;->w(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 23
    move-result-object v4

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/jsoup/parser/HtmlTreeBuilderState$7;->anyOtherEndTag(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z

    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p2, v4}, Lorg/jsoup/parser/b;->i0(Lorg/jsoup/nodes/Element;)Z

    .line 34
    move-result v6

    .line 35
    .line 36
    if-nez v6, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v4}, Lorg/jsoup/parser/b;->s0(Lorg/jsoup/nodes/Element;)V

    .line 43
    return v5

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v4}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 47
    move-result-object v6

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v6}, Lorg/jsoup/parser/b;->G(Ljava/lang/String;)Z

    .line 51
    move-result v6

    .line 52
    .line 53
    if-nez v6, :cond_2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 57
    return v2

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-virtual {p2}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 61
    move-result-object v6

    .line 62
    .line 63
    if-eq v6, v4, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 70
    move-result v6

    .line 71
    const/4 v7, 0x0

    .line 72
    move v8, v2

    .line 73
    move v9, v8

    .line 74
    move-object v10, v7

    .line 75
    .line 76
    :goto_1
    if-ge v8, v6, :cond_6

    .line 77
    .line 78
    const/16 v11, 0x40

    .line 79
    .line 80
    if-ge v8, v11, :cond_6

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    move-result-object v11

    .line 85
    .line 86
    check-cast v11, Lorg/jsoup/nodes/Element;

    .line 87
    .line 88
    if-ne v11, v4, :cond_4

    .line 89
    .line 90
    add-int/lit8 v9, v8, -0x1

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    move-result-object v9

    .line 95
    move-object v10, v9

    .line 96
    .line 97
    check-cast v10, Lorg/jsoup/nodes/Element;

    .line 98
    move v9, v5

    .line 99
    goto :goto_2

    .line 100
    .line 101
    :cond_4
    if-eqz v9, :cond_5

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2, v11}, Lorg/jsoup/parser/b;->d0(Lorg/jsoup/nodes/Element;)Z

    .line 105
    move-result v12

    .line 106
    .line 107
    if-eqz v12, :cond_5

    .line 108
    move-object v7, v11

    .line 109
    goto :goto_3

    .line 110
    .line 111
    :cond_5
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 112
    goto :goto_1

    .line 113
    .line 114
    :cond_6
    :goto_3
    if-nez v7, :cond_7

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->m0(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v4}, Lorg/jsoup/parser/b;->s0(Lorg/jsoup/nodes/Element;)V

    .line 125
    return v5

    .line 126
    :cond_7
    move v5, v2

    .line 127
    move-object v6, v7

    .line 128
    move-object v8, v6

    .line 129
    :goto_4
    const/4 v9, 0x3

    .line 130
    .line 131
    if-ge v5, v9, :cond_c

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v6}, Lorg/jsoup/parser/b;->i0(Lorg/jsoup/nodes/Element;)Z

    .line 135
    move-result v9

    .line 136
    .line 137
    if-eqz v9, :cond_8

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v6}, Lorg/jsoup/parser/b;->l(Lorg/jsoup/nodes/Element;)Lorg/jsoup/nodes/Element;

    .line 141
    move-result-object v6

    .line 142
    .line 143
    .line 144
    :cond_8
    invoke-virtual {p2, v6}, Lorg/jsoup/parser/b;->b0(Lorg/jsoup/nodes/Element;)Z

    .line 145
    move-result v9

    .line 146
    .line 147
    if-nez v9, :cond_9

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, v6}, Lorg/jsoup/parser/b;->t0(Lorg/jsoup/nodes/Element;)Z

    .line 151
    goto :goto_5

    .line 152
    .line 153
    :cond_9
    if-ne v6, v4, :cond_a

    .line 154
    goto :goto_6

    .line 155
    .line 156
    :cond_a
    new-instance v9, Lorg/jsoup/nodes/Element;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6}, Lorg/jsoup/nodes/Element;->A()Ljava/lang/String;

    .line 160
    move-result-object v11

    .line 161
    .line 162
    sget-object v12, Lorg/jsoup/parser/d;->d:Lorg/jsoup/parser/d;

    .line 163
    .line 164
    .line 165
    invoke-static {v11, v12}, Lorg/jsoup/parser/f;->o(Ljava/lang/String;Lorg/jsoup/parser/d;)Lorg/jsoup/parser/f;

    .line 166
    move-result-object v11

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->x()Ljava/lang/String;

    .line 170
    move-result-object v12

    .line 171
    .line 172
    .line 173
    invoke-direct {v9, v11, v12}, Lorg/jsoup/nodes/Element;-><init>(Lorg/jsoup/parser/f;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, v6, v9}, Lorg/jsoup/parser/b;->v0(Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Element;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, v6, v9}, Lorg/jsoup/parser/b;->x0(Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Element;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v8}, Lorg/jsoup/nodes/Element;->O0()Lorg/jsoup/nodes/Element;

    .line 183
    move-result-object v6

    .line 184
    .line 185
    if-eqz v6, :cond_b

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8}, Lorg/jsoup/nodes/g;->L()V

    .line 189
    .line 190
    .line 191
    :cond_b
    invoke-virtual {v9, v8}, Lorg/jsoup/nodes/Element;->f0(Lorg/jsoup/nodes/g;)Lorg/jsoup/nodes/Element;

    .line 192
    move-object v6, v9

    .line 193
    move-object v8, v6

    .line 194
    .line 195
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 196
    goto :goto_4

    .line 197
    .line 198
    .line 199
    :cond_c
    :goto_6
    invoke-virtual {v10}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 200
    move-result-object v5

    .line 201
    .line 202
    sget-object v6, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->t:[Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    invoke-static {v5, v6}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 206
    move-result v5

    .line 207
    .line 208
    if-eqz v5, :cond_e

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8}, Lorg/jsoup/nodes/Element;->O0()Lorg/jsoup/nodes/Element;

    .line 212
    move-result-object v5

    .line 213
    .line 214
    if-eqz v5, :cond_d

    .line 215
    .line 216
    .line 217
    invoke-virtual {v8}, Lorg/jsoup/nodes/g;->L()V

    .line 218
    .line 219
    .line 220
    :cond_d
    invoke-virtual {p2, v8}, Lorg/jsoup/parser/b;->T(Lorg/jsoup/nodes/g;)V

    .line 221
    goto :goto_7

    .line 222
    .line 223
    .line 224
    :cond_e
    invoke-virtual {v8}, Lorg/jsoup/nodes/Element;->O0()Lorg/jsoup/nodes/Element;

    .line 225
    move-result-object v5

    .line 226
    .line 227
    if-eqz v5, :cond_f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v8}, Lorg/jsoup/nodes/g;->L()V

    .line 231
    .line 232
    .line 233
    :cond_f
    invoke-virtual {v10, v8}, Lorg/jsoup/nodes/Element;->f0(Lorg/jsoup/nodes/g;)Lorg/jsoup/nodes/Element;

    .line 234
    .line 235
    :goto_7
    new-instance v5, Lorg/jsoup/nodes/Element;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4}, Lorg/jsoup/nodes/Element;->b1()Lorg/jsoup/parser/f;

    .line 239
    move-result-object v6

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->x()Ljava/lang/String;

    .line 243
    move-result-object v8

    .line 244
    .line 245
    .line 246
    invoke-direct {v5, v6, v8}, Lorg/jsoup/nodes/Element;-><init>(Lorg/jsoup/parser/f;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5}, Lorg/jsoup/nodes/Element;->h()Lorg/jsoup/nodes/b;

    .line 250
    move-result-object v6

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4}, Lorg/jsoup/nodes/Element;->h()Lorg/jsoup/nodes/b;

    .line 254
    move-result-object v8

    .line 255
    .line 256
    .line 257
    invoke-virtual {v6, v8}, Lorg/jsoup/nodes/b;->e(Lorg/jsoup/nodes/b;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v7}, Lorg/jsoup/nodes/g;->n()Ljava/util/List;

    .line 261
    move-result-object v6

    .line 262
    .line 263
    new-array v8, v2, [Lorg/jsoup/nodes/g;

    .line 264
    .line 265
    .line 266
    invoke-interface {v6, v8}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 267
    move-result-object v6

    .line 268
    .line 269
    check-cast v6, [Lorg/jsoup/nodes/g;

    .line 270
    array-length v8, v6

    .line 271
    move v9, v2

    .line 272
    .line 273
    :goto_8
    if-ge v9, v8, :cond_10

    .line 274
    .line 275
    aget-object v10, v6, v9

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5, v10}, Lorg/jsoup/nodes/Element;->f0(Lorg/jsoup/nodes/g;)Lorg/jsoup/nodes/Element;

    .line 279
    .line 280
    add-int/lit8 v9, v9, 0x1

    .line 281
    goto :goto_8

    .line 282
    .line 283
    .line 284
    :cond_10
    invoke-virtual {v7, v5}, Lorg/jsoup/nodes/Element;->f0(Lorg/jsoup/nodes/g;)Lorg/jsoup/nodes/Element;

    .line 285
    .line 286
    .line 287
    invoke-virtual {p2, v4}, Lorg/jsoup/parser/b;->s0(Lorg/jsoup/nodes/Element;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2, v4}, Lorg/jsoup/parser/b;->t0(Lorg/jsoup/nodes/Element;)Z

    .line 291
    .line 292
    .line 293
    invoke-virtual {p2, v7, v5}, Lorg/jsoup/parser/b;->W(Lorg/jsoup/nodes/Element;Lorg/jsoup/nodes/Element;)V

    .line 294
    .line 295
    add-int/lit8 v3, v3, 0x1

    .line 296
    .line 297
    goto/16 :goto_0

    .line 298
    :cond_11
    return v5
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
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
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

.method public final g(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z
    .locals 19

    .line 1
    .line 2
    move-object/from16 v1, p2

    .line 3
    .line 4
    const-string v2, "isindex"

    .line 5
    .line 6
    const-string v3, "input"

    .line 7
    .line 8
    const-string v4, "nobr"

    .line 9
    .line 10
    const-string v5, "form"

    .line 11
    .line 12
    .line 13
    const-string/jumbo v6, "svg"

    .line 14
    .line 15
    const-string v7, "li"

    .line 16
    .line 17
    const-string v8, "hr"

    .line 18
    .line 19
    const-string v9, "a"

    .line 20
    .line 21
    const-string v10, "option"

    .line 22
    .line 23
    const-string v11, "button"

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {p1 .. p1}, Lorg/jsoup/parser/Token;->e()Lorg/jsoup/parser/Token$h;

    .line 27
    move-result-object v12

    .line 28
    .line 29
    .line 30
    invoke-virtual {v12}, Lorg/jsoup/parser/Token$i;->D()Ljava/lang/String;

    .line 31
    move-result-object v13

    .line 32
    .line 33
    .line 34
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    const-string v14, "body"

    .line 37
    .line 38
    const-string v15, "p"

    .line 39
    .line 40
    const/16 v17, -0x1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 44
    move-result v18

    .line 45
    .line 46
    .line 47
    sparse-switch v18, :sswitch_data_0

    .line 48
    .line 49
    :goto_0
    move/from16 v0, v17

    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :sswitch_0
    const-string v0, "noembed"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-nez v0, :cond_0

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_0
    const/16 v0, 0x23

    .line 63
    .line 64
    goto/16 :goto_1

    .line 65
    .line 66
    .line 67
    :sswitch_1
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    move-result v0

    .line 69
    .line 70
    if-nez v0, :cond_1

    .line 71
    goto :goto_0

    .line 72
    .line 73
    :cond_1
    const/16 v0, 0x22

    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :sswitch_2
    const-string v0, "plaintext"

    .line 78
    .line 79
    .line 80
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    move-result v0

    .line 82
    .line 83
    if-nez v0, :cond_2

    .line 84
    goto :goto_0

    .line 85
    .line 86
    :cond_2
    const/16 v0, 0x21

    .line 87
    .line 88
    goto/16 :goto_1

    .line 89
    .line 90
    :sswitch_3
    const-string v0, "listing"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result v0

    .line 95
    .line 96
    if-nez v0, :cond_3

    .line 97
    goto :goto_0

    .line 98
    .line 99
    :cond_3
    const/16 v0, 0x20

    .line 100
    .line 101
    goto/16 :goto_1

    .line 102
    .line 103
    .line 104
    :sswitch_4
    const-string/jumbo v0, "table"

    .line 105
    .line 106
    .line 107
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    move-result v0

    .line 109
    .line 110
    if-nez v0, :cond_4

    .line 111
    goto :goto_0

    .line 112
    .line 113
    :cond_4
    const/16 v0, 0x1f

    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    .line 118
    :sswitch_5
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    move-result v0

    .line 120
    .line 121
    if-nez v0, :cond_5

    .line 122
    goto :goto_0

    .line 123
    .line 124
    :cond_5
    const/16 v0, 0x1e

    .line 125
    .line 126
    goto/16 :goto_1

    .line 127
    .line 128
    :sswitch_6
    const-string v0, "image"

    .line 129
    .line 130
    .line 131
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    move-result v0

    .line 133
    .line 134
    if-nez v0, :cond_6

    .line 135
    goto :goto_0

    .line 136
    .line 137
    :cond_6
    const/16 v0, 0x1d

    .line 138
    .line 139
    goto/16 :goto_1

    .line 140
    .line 141
    .line 142
    :sswitch_7
    const-string/jumbo v0, "span"

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    move-result v0

    .line 147
    .line 148
    if-nez v0, :cond_7

    .line 149
    goto :goto_0

    .line 150
    .line 151
    :cond_7
    const/16 v0, 0x1c

    .line 152
    .line 153
    goto/16 :goto_1

    .line 154
    .line 155
    .line 156
    :sswitch_8
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    move-result v0

    .line 158
    .line 159
    if-nez v0, :cond_8

    .line 160
    goto :goto_0

    .line 161
    .line 162
    :cond_8
    const/16 v0, 0x1b

    .line 163
    .line 164
    goto/16 :goto_1

    .line 165
    .line 166
    :sswitch_9
    const-string v0, "math"

    .line 167
    .line 168
    .line 169
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    move-result v0

    .line 171
    .line 172
    if-nez v0, :cond_9

    .line 173
    goto :goto_0

    .line 174
    .line 175
    :cond_9
    const/16 v0, 0x1a

    .line 176
    .line 177
    goto/16 :goto_1

    .line 178
    .line 179
    :sswitch_a
    const-string v0, "html"

    .line 180
    .line 181
    .line 182
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    move-result v0

    .line 184
    .line 185
    if-nez v0, :cond_a

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_a
    const/16 v0, 0x19

    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    .line 194
    :sswitch_b
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    move-result v0

    .line 196
    .line 197
    if-nez v0, :cond_b

    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_b
    const/16 v0, 0x18

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    .line 206
    :sswitch_c
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    move-result v0

    .line 208
    .line 209
    if-nez v0, :cond_c

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_c
    const/16 v0, 0x17

    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    .line 218
    :sswitch_d
    const-string/jumbo v0, "xmp"

    .line 219
    .line 220
    .line 221
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    move-result v0

    .line 223
    .line 224
    if-nez v0, :cond_d

    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :cond_d
    const/16 v0, 0x16

    .line 229
    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    .line 233
    :sswitch_e
    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    move-result v0

    .line 235
    .line 236
    if-nez v0, :cond_e

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_e
    const/16 v0, 0x15

    .line 241
    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :sswitch_f
    const-string v0, "pre"

    .line 245
    .line 246
    .line 247
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    move-result v0

    .line 249
    .line 250
    if-nez v0, :cond_f

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_f
    const/16 v0, 0x14

    .line 255
    .line 256
    goto/16 :goto_1

    .line 257
    .line 258
    :sswitch_10
    const-string v0, "rt"

    .line 259
    .line 260
    .line 261
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    move-result v0

    .line 263
    .line 264
    if-nez v0, :cond_10

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :cond_10
    const/16 v0, 0x13

    .line 269
    .line 270
    goto/16 :goto_1

    .line 271
    .line 272
    :sswitch_11
    const-string v0, "rp"

    .line 273
    .line 274
    .line 275
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    move-result v0

    .line 277
    .line 278
    if-nez v0, :cond_11

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :cond_11
    const/16 v0, 0x12

    .line 283
    .line 284
    goto/16 :goto_1

    .line 285
    .line 286
    .line 287
    :sswitch_12
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    move-result v0

    .line 289
    .line 290
    if-nez v0, :cond_12

    .line 291
    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    :cond_12
    const/16 v0, 0x11

    .line 295
    .line 296
    goto/16 :goto_1

    .line 297
    .line 298
    .line 299
    :sswitch_13
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    move-result v0

    .line 301
    .line 302
    if-nez v0, :cond_13

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :cond_13
    const/16 v0, 0x10

    .line 307
    .line 308
    goto/16 :goto_1

    .line 309
    .line 310
    :sswitch_14
    const-string v0, "h6"

    .line 311
    .line 312
    .line 313
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    move-result v0

    .line 315
    .line 316
    if-nez v0, :cond_14

    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :cond_14
    const/16 v0, 0xf

    .line 321
    .line 322
    goto/16 :goto_1

    .line 323
    .line 324
    :sswitch_15
    const-string v0, "h5"

    .line 325
    .line 326
    .line 327
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    move-result v0

    .line 329
    .line 330
    if-nez v0, :cond_15

    .line 331
    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :cond_15
    const/16 v0, 0xe

    .line 335
    .line 336
    goto/16 :goto_1

    .line 337
    .line 338
    :sswitch_16
    const-string v0, "h4"

    .line 339
    .line 340
    .line 341
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    move-result v0

    .line 343
    .line 344
    if-nez v0, :cond_16

    .line 345
    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :cond_16
    const/16 v0, 0xd

    .line 349
    .line 350
    goto/16 :goto_1

    .line 351
    .line 352
    :sswitch_17
    const-string v0, "h3"

    .line 353
    .line 354
    .line 355
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 356
    move-result v0

    .line 357
    .line 358
    if-nez v0, :cond_17

    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :cond_17
    const/16 v0, 0xc

    .line 363
    .line 364
    goto/16 :goto_1

    .line 365
    .line 366
    :sswitch_18
    const-string v0, "h2"

    .line 367
    .line 368
    .line 369
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    move-result v0

    .line 371
    .line 372
    if-nez v0, :cond_18

    .line 373
    .line 374
    goto/16 :goto_0

    .line 375
    .line 376
    :cond_18
    const/16 v0, 0xb

    .line 377
    .line 378
    goto/16 :goto_1

    .line 379
    .line 380
    :sswitch_19
    const-string v0, "h1"

    .line 381
    .line 382
    .line 383
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    move-result v0

    .line 385
    .line 386
    if-nez v0, :cond_19

    .line 387
    .line 388
    goto/16 :goto_0

    .line 389
    .line 390
    :cond_19
    const/16 v0, 0xa

    .line 391
    .line 392
    goto/16 :goto_1

    .line 393
    .line 394
    :sswitch_1a
    const-string v0, "dt"

    .line 395
    .line 396
    .line 397
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 398
    move-result v0

    .line 399
    .line 400
    if-nez v0, :cond_1a

    .line 401
    .line 402
    goto/16 :goto_0

    .line 403
    .line 404
    :cond_1a
    const/16 v0, 0x9

    .line 405
    .line 406
    goto/16 :goto_1

    .line 407
    .line 408
    :sswitch_1b
    const-string v0, "dd"

    .line 409
    .line 410
    .line 411
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    move-result v0

    .line 413
    .line 414
    if-nez v0, :cond_1b

    .line 415
    .line 416
    goto/16 :goto_0

    .line 417
    .line 418
    :cond_1b
    const/16 v0, 0x8

    .line 419
    goto :goto_1

    .line 420
    .line 421
    .line 422
    :sswitch_1c
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 423
    move-result v0

    .line 424
    .line 425
    if-nez v0, :cond_1c

    .line 426
    .line 427
    goto/16 :goto_0

    .line 428
    :cond_1c
    const/4 v0, 0x7

    .line 429
    goto :goto_1

    .line 430
    .line 431
    :sswitch_1d
    const-string v0, "optgroup"

    .line 432
    .line 433
    .line 434
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 435
    move-result v0

    .line 436
    .line 437
    if-nez v0, :cond_1d

    .line 438
    .line 439
    goto/16 :goto_0

    .line 440
    :cond_1d
    const/4 v0, 0x6

    .line 441
    goto :goto_1

    .line 442
    .line 443
    :sswitch_1e
    const-string v0, "select"

    .line 444
    .line 445
    .line 446
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 447
    move-result v0

    .line 448
    .line 449
    if-nez v0, :cond_1e

    .line 450
    .line 451
    goto/16 :goto_0

    .line 452
    :cond_1e
    const/4 v0, 0x5

    .line 453
    goto :goto_1

    .line 454
    .line 455
    .line 456
    :sswitch_1f
    const-string/jumbo v0, "textarea"

    .line 457
    .line 458
    .line 459
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    move-result v0

    .line 461
    .line 462
    if-nez v0, :cond_1f

    .line 463
    .line 464
    goto/16 :goto_0

    .line 465
    :cond_1f
    const/4 v0, 0x4

    .line 466
    goto :goto_1

    .line 467
    .line 468
    .line 469
    :sswitch_20
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    move-result v0

    .line 471
    .line 472
    if-nez v0, :cond_20

    .line 473
    .line 474
    goto/16 :goto_0

    .line 475
    :cond_20
    const/4 v0, 0x3

    .line 476
    goto :goto_1

    .line 477
    .line 478
    :sswitch_21
    const-string v0, "iframe"

    .line 479
    .line 480
    .line 481
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 482
    move-result v0

    .line 483
    .line 484
    if-nez v0, :cond_21

    .line 485
    .line 486
    goto/16 :goto_0

    .line 487
    :cond_21
    const/4 v0, 0x2

    .line 488
    goto :goto_1

    .line 489
    .line 490
    .line 491
    :sswitch_22
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 492
    move-result v0

    .line 493
    .line 494
    if-nez v0, :cond_22

    .line 495
    .line 496
    goto/16 :goto_0

    .line 497
    :cond_22
    const/4 v0, 0x1

    .line 498
    goto :goto_1

    .line 499
    .line 500
    :sswitch_23
    const-string v0, "frameset"

    .line 501
    .line 502
    .line 503
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 504
    move-result v0

    .line 505
    .line 506
    if-nez v0, :cond_23

    .line 507
    .line 508
    goto/16 :goto_0

    .line 509
    :cond_23
    const/4 v0, 0x0

    .line 510
    .line 511
    .line 512
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 513
    .line 514
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->n:[Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    invoke-static {v13, v0}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 518
    move-result v0

    .line 519
    .line 520
    if-eqz v0, :cond_25

    .line 521
    .line 522
    .line 523
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->R(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 527
    const/4 v0, 0x0

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 531
    .line 532
    :goto_2
    move-object/from16 v13, p0

    .line 533
    :cond_24
    :goto_3
    const/4 v3, 0x1

    .line 534
    .line 535
    goto/16 :goto_f

    .line 536
    .line 537
    :cond_25
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->h:[Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    invoke-static {v13, v0}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 541
    move-result v0

    .line 542
    .line 543
    if-eqz v0, :cond_27

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 547
    move-result v0

    .line 548
    .line 549
    if-eqz v0, :cond_26

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 553
    .line 554
    .line 555
    :cond_26
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 556
    goto :goto_2

    .line 557
    .line 558
    :cond_27
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->g:[Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    invoke-static {v13, v0}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 562
    move-result v0

    .line 563
    .line 564
    if-eqz v0, :cond_28

    .line 565
    .line 566
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState;->InHead:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 567
    .line 568
    move-object/from16 v2, p1

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1, v2, v0}, Lorg/jsoup/parser/b;->o0(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/HtmlTreeBuilderState;)Z

    .line 572
    move-result v0

    .line 573
    return v0

    .line 574
    .line 575
    :cond_28
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->l:[Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    invoke-static {v13, v0}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 579
    move-result v0

    .line 580
    .line 581
    if-eqz v0, :cond_29

    .line 582
    .line 583
    .line 584
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 588
    move-result-object v0

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->q0(Lorg/jsoup/nodes/Element;)V

    .line 592
    goto :goto_2

    .line 593
    .line 594
    :cond_29
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->m:[Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    invoke-static {v13, v0}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 598
    move-result v0

    .line 599
    .line 600
    if-eqz v0, :cond_2a

    .line 601
    .line 602
    .line 603
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->U()V

    .line 610
    const/4 v0, 0x0

    .line 611
    .line 612
    .line 613
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 614
    goto :goto_2

    .line 615
    :cond_2a
    const/4 v0, 0x0

    .line 616
    .line 617
    sget-object v2, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->o:[Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    invoke-static {v13, v2}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 621
    move-result v2

    .line 622
    .line 623
    if-eqz v2, :cond_2b

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->R(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 627
    goto :goto_2

    .line 628
    .line 629
    :cond_2b
    sget-object v2, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->q:[Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    invoke-static {v13, v2}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 633
    move-result v2

    .line 634
    .line 635
    if-eqz v2, :cond_2c

    .line 636
    .line 637
    move-object/from16 v13, p0

    .line 638
    .line 639
    .line 640
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 641
    return v0

    .line 642
    .line 643
    :cond_2c
    move-object/from16 v13, p0

    .line 644
    .line 645
    .line 646
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 650
    goto :goto_3

    .line 651
    .line 652
    :pswitch_0
    move-object/from16 v13, p0

    .line 653
    .line 654
    .line 655
    invoke-static {v12, v1}, Lorg/jsoup/parser/HtmlTreeBuilderState;->access$300(Lorg/jsoup/parser/Token$h;Lorg/jsoup/parser/b;)V

    .line 656
    goto :goto_3

    .line 657
    .line 658
    :pswitch_1
    move-object/from16 v13, p0

    .line 659
    const/4 v0, 0x0

    .line 660
    .line 661
    .line 662
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->z()Lph0/b;

    .line 666
    move-result-object v4

    .line 667
    .line 668
    if-eqz v4, :cond_2d

    .line 669
    return v0

    .line 670
    .line 671
    .line 672
    :cond_2d
    invoke-virtual {v1, v5}, Lorg/jsoup/parser/i;->i(Ljava/lang/String;)Z

    .line 673
    .line 674
    iget-object v0, v12, Lorg/jsoup/parser/Token$i;->j:Lorg/jsoup/nodes/b;

    .line 675
    .line 676
    const-string v4, "action"

    .line 677
    .line 678
    .line 679
    invoke-virtual {v0, v4}, Lorg/jsoup/nodes/b;->n(Ljava/lang/String;)Z

    .line 680
    move-result v0

    .line 681
    .line 682
    if-eqz v0, :cond_2e

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->z()Lph0/b;

    .line 686
    move-result-object v0

    .line 687
    .line 688
    iget-object v6, v12, Lorg/jsoup/parser/Token$i;->j:Lorg/jsoup/nodes/b;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v6, v4}, Lorg/jsoup/nodes/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 692
    move-result-object v6

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0, v4, v6}, Lorg/jsoup/nodes/Element;->j0(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 696
    .line 697
    .line 698
    :cond_2e
    invoke-virtual {v1, v8}, Lorg/jsoup/parser/i;->i(Ljava/lang/String;)Z

    .line 699
    .line 700
    const-string v0, "label"

    .line 701
    .line 702
    .line 703
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/i;->i(Ljava/lang/String;)Z

    .line 704
    .line 705
    iget-object v4, v12, Lorg/jsoup/parser/Token$i;->j:Lorg/jsoup/nodes/b;

    .line 706
    .line 707
    const-string v6, "prompt"

    .line 708
    .line 709
    .line 710
    invoke-virtual {v4, v6}, Lorg/jsoup/nodes/b;->n(Ljava/lang/String;)Z

    .line 711
    move-result v4

    .line 712
    .line 713
    if-eqz v4, :cond_2f

    .line 714
    .line 715
    iget-object v4, v12, Lorg/jsoup/parser/Token$i;->j:Lorg/jsoup/nodes/b;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v4, v6}, Lorg/jsoup/nodes/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 719
    move-result-object v4

    .line 720
    goto :goto_4

    .line 721
    .line 722
    :cond_2f
    const-string v4, "This is a searchable index. Enter search keywords: "

    .line 723
    .line 724
    :goto_4
    new-instance v6, Lorg/jsoup/parser/Token$c;

    .line 725
    .line 726
    .line 727
    invoke-direct {v6}, Lorg/jsoup/parser/Token$c;-><init>()V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v6, v4}, Lorg/jsoup/parser/Token$c;->p(Ljava/lang/String;)Lorg/jsoup/parser/Token$c;

    .line 731
    move-result-object v4

    .line 732
    .line 733
    .line 734
    invoke-virtual {v1, v4}, Lorg/jsoup/parser/b;->g(Lorg/jsoup/parser/Token;)Z

    .line 735
    .line 736
    new-instance v4, Lorg/jsoup/nodes/b;

    .line 737
    .line 738
    .line 739
    invoke-direct {v4}, Lorg/jsoup/nodes/b;-><init>()V

    .line 740
    .line 741
    iget-object v6, v12, Lorg/jsoup/parser/Token$i;->j:Lorg/jsoup/nodes/b;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v6}, Lorg/jsoup/nodes/b;->iterator()Ljava/util/Iterator;

    .line 745
    move-result-object v6

    .line 746
    .line 747
    .line 748
    :cond_30
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 749
    move-result v7

    .line 750
    .line 751
    if-eqz v7, :cond_31

    .line 752
    .line 753
    .line 754
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 755
    move-result-object v7

    .line 756
    .line 757
    check-cast v7, Lorg/jsoup/nodes/a;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v7}, Lorg/jsoup/nodes/a;->b()Ljava/lang/String;

    .line 761
    move-result-object v9

    .line 762
    .line 763
    sget-object v10, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->p:[Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    invoke-static {v9, v10}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 767
    move-result v9

    .line 768
    .line 769
    if-nez v9, :cond_30

    .line 770
    .line 771
    .line 772
    invoke-virtual {v4, v7}, Lorg/jsoup/nodes/b;->H(Lorg/jsoup/nodes/a;)Lorg/jsoup/nodes/b;

    .line 773
    goto :goto_5

    .line 774
    .line 775
    :cond_31
    const-string v6, "name"

    .line 776
    .line 777
    .line 778
    invoke-virtual {v4, v6, v2}, Lorg/jsoup/nodes/b;->G(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/b;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v1, v3, v4}, Lorg/jsoup/parser/b;->j(Ljava/lang/String;Lorg/jsoup/nodes/b;)Z

    .line 782
    .line 783
    .line 784
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 785
    .line 786
    .line 787
    invoke-virtual {v1, v8}, Lorg/jsoup/parser/i;->i(Ljava/lang/String;)Z

    .line 788
    .line 789
    .line 790
    invoke-virtual {v1, v5}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 791
    .line 792
    goto/16 :goto_3

    .line 793
    .line 794
    :pswitch_2
    move-object/from16 v13, p0

    .line 795
    .line 796
    .line 797
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 798
    move-result v0

    .line 799
    .line 800
    if-eqz v0, :cond_32

    .line 801
    .line 802
    .line 803
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 804
    .line 805
    .line 806
    :cond_32
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 807
    .line 808
    iget-object v0, v1, Lorg/jsoup/parser/i;->c:Lorg/jsoup/parser/h;

    .line 809
    .line 810
    sget-object v1, Lorg/jsoup/parser/TokeniserState;->PLAINTEXT:Lorg/jsoup/parser/TokeniserState;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v0, v1}, Lorg/jsoup/parser/h;->v(Lorg/jsoup/parser/TokeniserState;)V

    .line 814
    .line 815
    goto/16 :goto_3

    .line 816
    .line 817
    :pswitch_3
    move-object/from16 v13, p0

    .line 818
    .line 819
    .line 820
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->y()Lorg/jsoup/nodes/Document;

    .line 821
    move-result-object v0

    .line 822
    .line 823
    .line 824
    invoke-virtual {v0}, Lorg/jsoup/nodes/Document;->v1()Lorg/jsoup/nodes/Document$QuirksMode;

    .line 825
    move-result-object v0

    .line 826
    .line 827
    sget-object v2, Lorg/jsoup/nodes/Document$QuirksMode;->quirks:Lorg/jsoup/nodes/Document$QuirksMode;

    .line 828
    .line 829
    if-eq v0, v2, :cond_33

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 833
    move-result v0

    .line 834
    .line 835
    if-eqz v0, :cond_33

    .line 836
    .line 837
    .line 838
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 839
    .line 840
    .line 841
    :cond_33
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 842
    const/4 v0, 0x0

    .line 843
    .line 844
    .line 845
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 846
    .line 847
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState;->InTable:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->D0(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 851
    .line 852
    goto/16 :goto_3

    .line 853
    .line 854
    :pswitch_4
    move-object/from16 v13, p0

    .line 855
    const/4 v0, 0x0

    .line 856
    .line 857
    .line 858
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->R(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 862
    move-result-object v2

    .line 863
    .line 864
    .line 865
    const-string/jumbo v3, "type"

    .line 866
    .line 867
    .line 868
    invoke-virtual {v2, v3}, Lorg/jsoup/nodes/g;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 869
    move-result-object v2

    .line 870
    .line 871
    const-string v3, "hidden"

    .line 872
    .line 873
    .line 874
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 875
    move-result v2

    .line 876
    .line 877
    if-nez v2, :cond_24

    .line 878
    .line 879
    .line 880
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 881
    .line 882
    goto/16 :goto_3

    .line 883
    .line 884
    :pswitch_5
    move-object/from16 v13, p0

    .line 885
    .line 886
    .line 887
    invoke-virtual {v1, v6}, Lorg/jsoup/parser/b;->A(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 888
    move-result-object v0

    .line 889
    .line 890
    if-nez v0, :cond_34

    .line 891
    .line 892
    const-string v0, "img"

    .line 893
    .line 894
    .line 895
    invoke-virtual {v12, v0}, Lorg/jsoup/parser/Token$i;->B(Ljava/lang/String;)Lorg/jsoup/parser/Token$i;

    .line 896
    move-result-object v0

    .line 897
    .line 898
    .line 899
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->g(Lorg/jsoup/parser/Token;)Z

    .line 900
    move-result v0

    .line 901
    return v0

    .line 902
    .line 903
    .line 904
    :cond_34
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 905
    .line 906
    goto/16 :goto_3

    .line 907
    .line 908
    :pswitch_6
    move-object/from16 v13, p0

    .line 909
    .line 910
    .line 911
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 915
    .line 916
    goto/16 :goto_3

    .line 917
    .line 918
    :pswitch_7
    move-object/from16 v13, p0

    .line 919
    .line 920
    .line 921
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v1, v4}, Lorg/jsoup/parser/b;->G(Ljava/lang/String;)Z

    .line 925
    move-result v0

    .line 926
    .line 927
    if-eqz v0, :cond_35

    .line 928
    .line 929
    .line 930
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v1, v4}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 934
    .line 935
    .line 936
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 937
    .line 938
    .line 939
    :cond_35
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 940
    move-result-object v0

    .line 941
    .line 942
    .line 943
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->q0(Lorg/jsoup/nodes/Element;)V

    .line 944
    .line 945
    goto/16 :goto_3

    .line 946
    .line 947
    :pswitch_8
    move-object/from16 v13, p0

    .line 948
    .line 949
    .line 950
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 954
    .line 955
    goto/16 :goto_3

    .line 956
    .line 957
    :pswitch_9
    move-object/from16 v13, p0

    .line 958
    .line 959
    .line 960
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->D()Ljava/util/ArrayList;

    .line 964
    move-result-object v0

    .line 965
    const/4 v1, 0x0

    .line 966
    .line 967
    .line 968
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 969
    move-result-object v0

    .line 970
    .line 971
    check-cast v0, Lorg/jsoup/nodes/Element;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v12}, Lorg/jsoup/parser/Token$i;->y()Lorg/jsoup/nodes/b;

    .line 975
    move-result-object v1

    .line 976
    .line 977
    .line 978
    invoke-virtual {v1}, Lorg/jsoup/nodes/b;->iterator()Ljava/util/Iterator;

    .line 979
    move-result-object v1

    .line 980
    .line 981
    .line 982
    :cond_36
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 983
    move-result v2

    .line 984
    .line 985
    if-eqz v2, :cond_24

    .line 986
    .line 987
    .line 988
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 989
    move-result-object v2

    .line 990
    .line 991
    check-cast v2, Lorg/jsoup/nodes/a;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v2}, Lorg/jsoup/nodes/a;->b()Ljava/lang/String;

    .line 995
    move-result-object v3

    .line 996
    .line 997
    .line 998
    invoke-virtual {v0, v3}, Lorg/jsoup/nodes/g;->v(Ljava/lang/String;)Z

    .line 999
    move-result v3

    .line 1000
    .line 1001
    if-nez v3, :cond_36

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v0}, Lorg/jsoup/nodes/Element;->h()Lorg/jsoup/nodes/b;

    .line 1005
    move-result-object v3

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v3, v2}, Lorg/jsoup/nodes/b;->H(Lorg/jsoup/nodes/a;)Lorg/jsoup/nodes/b;

    .line 1009
    goto :goto_6

    .line 1010
    .line 1011
    :pswitch_a
    move-object/from16 v13, p0

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->z()Lph0/b;

    .line 1015
    move-result-object v0

    .line 1016
    .line 1017
    if-eqz v0, :cond_37

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1021
    .line 1022
    const/16 v18, 0x0

    .line 1023
    return v18

    .line 1024
    .line 1025
    .line 1026
    :cond_37
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 1027
    move-result v0

    .line 1028
    .line 1029
    if-eqz v0, :cond_38

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1033
    :cond_38
    const/4 v0, 0x1

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v1, v12, v0}, Lorg/jsoup/parser/b;->S(Lorg/jsoup/parser/Token$h;Z)Lph0/b;

    .line 1037
    move v3, v0

    .line 1038
    .line 1039
    goto/16 :goto_f

    .line 1040
    .line 1041
    :pswitch_b
    move-object/from16 v13, p0

    .line 1042
    const/4 v0, 0x1

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->D()Ljava/util/ArrayList;

    .line 1049
    move-result-object v2

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1053
    move-result v3

    .line 1054
    .line 1055
    if-eq v3, v0, :cond_39

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1059
    move-result v3

    .line 1060
    const/4 v4, 0x2

    .line 1061
    .line 1062
    if-le v3, v4, :cond_3a

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1066
    move-result-object v3

    .line 1067
    .line 1068
    check-cast v3, Lorg/jsoup/nodes/Element;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v3}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 1072
    move-result-object v3

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1076
    move-result v3

    .line 1077
    .line 1078
    if-nez v3, :cond_3a

    .line 1079
    :cond_39
    const/4 v0, 0x0

    .line 1080
    goto :goto_8

    .line 1081
    :cond_3a
    const/4 v3, 0x0

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v1, v3}, Lorg/jsoup/parser/b;->s(Z)V

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1088
    move-result-object v1

    .line 1089
    .line 1090
    check-cast v1, Lorg/jsoup/nodes/Element;

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v12}, Lorg/jsoup/parser/Token$i;->y()Lorg/jsoup/nodes/b;

    .line 1094
    move-result-object v0

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v0}, Lorg/jsoup/nodes/b;->iterator()Ljava/util/Iterator;

    .line 1098
    move-result-object v0

    .line 1099
    .line 1100
    .line 1101
    :cond_3b
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1102
    move-result v2

    .line 1103
    .line 1104
    if-eqz v2, :cond_24

    .line 1105
    .line 1106
    .line 1107
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1108
    move-result-object v2

    .line 1109
    .line 1110
    check-cast v2, Lorg/jsoup/nodes/a;

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v2}, Lorg/jsoup/nodes/a;->b()Ljava/lang/String;

    .line 1114
    move-result-object v3

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v1, v3}, Lorg/jsoup/nodes/g;->v(Ljava/lang/String;)Z

    .line 1118
    move-result v3

    .line 1119
    .line 1120
    if-nez v3, :cond_3b

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v1}, Lorg/jsoup/nodes/Element;->h()Lorg/jsoup/nodes/b;

    .line 1124
    move-result-object v3

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v3, v2}, Lorg/jsoup/nodes/b;->H(Lorg/jsoup/nodes/a;)Lorg/jsoup/nodes/b;

    .line 1128
    goto :goto_7

    .line 1129
    :goto_8
    return v0

    .line 1130
    .line 1131
    :pswitch_c
    move-object/from16 v13, p0

    .line 1132
    const/4 v0, 0x0

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 1136
    move-result v2

    .line 1137
    .line 1138
    if-eqz v2, :cond_3c

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1142
    .line 1143
    .line 1144
    :cond_3c
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 1148
    .line 1149
    .line 1150
    invoke-static {v12, v1}, Lorg/jsoup/parser/HtmlTreeBuilderState;->access$300(Lorg/jsoup/parser/Token$h;Lorg/jsoup/parser/b;)V

    .line 1151
    .line 1152
    goto/16 :goto_3

    .line 1153
    .line 1154
    :pswitch_d
    move-object/from16 v13, p0

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1161
    .line 1162
    goto/16 :goto_3

    .line 1163
    .line 1164
    :pswitch_e
    move-object/from16 v13, p0

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 1168
    move-result v0

    .line 1169
    .line 1170
    if-eqz v0, :cond_3d

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1174
    .line 1175
    .line 1176
    :cond_3d
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1177
    .line 1178
    iget-object v0, v1, Lorg/jsoup/parser/i;->b:Lorg/jsoup/parser/a;

    .line 1179
    .line 1180
    const-string v2, "\n"

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v0, v2}, Lorg/jsoup/parser/a;->w(Ljava/lang/String;)Z

    .line 1184
    const/4 v0, 0x0

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 1188
    .line 1189
    goto/16 :goto_3

    .line 1190
    .line 1191
    :pswitch_f
    move-object/from16 v13, p0

    .line 1192
    .line 1193
    const-string v0, "ruby"

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->G(Ljava/lang/String;)Z

    .line 1197
    move-result v2

    .line 1198
    .line 1199
    if-eqz v2, :cond_24

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->u()V

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v1}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 1206
    move-result-object v2

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v2}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 1210
    move-result-object v2

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1214
    move-result v2

    .line 1215
    .line 1216
    if-nez v2, :cond_3e

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->l0(Ljava/lang/String;)V

    .line 1223
    .line 1224
    .line 1225
    :cond_3e
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1226
    .line 1227
    goto/16 :goto_3

    .line 1228
    .line 1229
    :pswitch_10
    move-object/from16 v13, p0

    .line 1230
    const/4 v0, 0x0

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->D()Ljava/util/ArrayList;

    .line 1237
    move-result-object v0

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1241
    move-result v2

    .line 1242
    .line 1243
    const/16 v16, 0x1

    .line 1244
    .line 1245
    add-int/lit8 v2, v2, -0x1

    .line 1246
    .line 1247
    :goto_9
    if-lez v2, :cond_41

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1251
    move-result-object v3

    .line 1252
    .line 1253
    check-cast v3, Lorg/jsoup/nodes/Element;

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v3}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 1257
    move-result-object v4

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1261
    move-result v4

    .line 1262
    .line 1263
    if-eqz v4, :cond_3f

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v1, v7}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1267
    goto :goto_a

    .line 1268
    .line 1269
    .line 1270
    :cond_3f
    invoke-virtual {v1, v3}, Lorg/jsoup/parser/b;->d0(Lorg/jsoup/nodes/Element;)Z

    .line 1271
    move-result v4

    .line 1272
    .line 1273
    if-eqz v4, :cond_40

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v3}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 1277
    move-result-object v3

    .line 1278
    .line 1279
    sget-object v4, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->j:[Ljava/lang/String;

    .line 1280
    .line 1281
    .line 1282
    invoke-static {v3, v4}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 1283
    move-result v3

    .line 1284
    .line 1285
    if-nez v3, :cond_40

    .line 1286
    goto :goto_a

    .line 1287
    .line 1288
    :cond_40
    add-int/lit8 v2, v2, -0x1

    .line 1289
    goto :goto_9

    .line 1290
    .line 1291
    .line 1292
    :cond_41
    :goto_a
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 1293
    move-result v0

    .line 1294
    .line 1295
    if-eqz v0, :cond_42

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1299
    .line 1300
    .line 1301
    :cond_42
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1302
    .line 1303
    goto/16 :goto_3

    .line 1304
    .line 1305
    :pswitch_11
    move-object/from16 v13, p0

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 1309
    move-result v0

    .line 1310
    .line 1311
    if-eqz v0, :cond_43

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1315
    .line 1316
    .line 1317
    :cond_43
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->R(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1318
    const/4 v0, 0x0

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 1322
    .line 1323
    goto/16 :goto_3

    .line 1324
    .line 1325
    :pswitch_12
    move-object/from16 v13, p0

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 1329
    move-result v0

    .line 1330
    .line 1331
    if-eqz v0, :cond_44

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1335
    .line 1336
    .line 1337
    :cond_44
    invoke-virtual {v1}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 1338
    move-result-object v0

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v0}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 1342
    move-result-object v0

    .line 1343
    .line 1344
    sget-object v2, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->i:[Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    invoke-static {v0, v2}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 1348
    move-result v0

    .line 1349
    .line 1350
    if-eqz v0, :cond_45

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->k0()Lorg/jsoup/nodes/Element;

    .line 1357
    .line 1358
    .line 1359
    :cond_45
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1360
    .line 1361
    goto/16 :goto_3

    .line 1362
    .line 1363
    :pswitch_13
    move-object/from16 v13, p0

    .line 1364
    const/4 v0, 0x0

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->D()Ljava/util/ArrayList;

    .line 1371
    move-result-object v0

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1375
    move-result v2

    .line 1376
    .line 1377
    const/16 v16, 0x1

    .line 1378
    .line 1379
    add-int/lit8 v2, v2, -0x1

    .line 1380
    .line 1381
    :goto_b
    if-lez v2, :cond_48

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1385
    move-result-object v3

    .line 1386
    .line 1387
    check-cast v3, Lorg/jsoup/nodes/Element;

    .line 1388
    .line 1389
    .line 1390
    invoke-virtual {v3}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 1391
    move-result-object v4

    .line 1392
    .line 1393
    sget-object v5, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->k:[Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    invoke-static {v4, v5}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 1397
    move-result v4

    .line 1398
    .line 1399
    if-eqz v4, :cond_46

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual {v3}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 1403
    move-result-object v0

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1407
    goto :goto_c

    .line 1408
    .line 1409
    .line 1410
    :cond_46
    invoke-virtual {v1, v3}, Lorg/jsoup/parser/b;->d0(Lorg/jsoup/nodes/Element;)Z

    .line 1411
    move-result v4

    .line 1412
    .line 1413
    if-eqz v4, :cond_47

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v3}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 1417
    move-result-object v3

    .line 1418
    .line 1419
    sget-object v4, Lorg/jsoup/parser/HtmlTreeBuilderState$b;->j:[Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    invoke-static {v3, v4}, Loh0/c;->d(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 1423
    move-result v3

    .line 1424
    .line 1425
    if-nez v3, :cond_47

    .line 1426
    goto :goto_c

    .line 1427
    .line 1428
    :cond_47
    add-int/lit8 v2, v2, -0x1

    .line 1429
    goto :goto_b

    .line 1430
    .line 1431
    .line 1432
    :cond_48
    :goto_c
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 1433
    move-result v0

    .line 1434
    .line 1435
    if-eqz v0, :cond_49

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v1, v15}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1439
    .line 1440
    .line 1441
    :cond_49
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1442
    .line 1443
    goto/16 :goto_3

    .line 1444
    .line 1445
    :pswitch_14
    move-object/from16 v13, p0

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v1, v9}, Lorg/jsoup/parser/b;->w(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 1449
    move-result-object v0

    .line 1450
    .line 1451
    if-eqz v0, :cond_4a

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v1, v9}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v1, v9}, Lorg/jsoup/parser/b;->A(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 1461
    move-result-object v0

    .line 1462
    .line 1463
    if-eqz v0, :cond_4a

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s0(Lorg/jsoup/nodes/Element;)V

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->t0(Lorg/jsoup/nodes/Element;)Z

    .line 1470
    .line 1471
    .line 1472
    :cond_4a
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1476
    move-result-object v0

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->q0(Lorg/jsoup/nodes/Element;)V

    .line 1480
    .line 1481
    goto/16 :goto_3

    .line 1482
    .line 1483
    :pswitch_15
    move-object/from16 v13, p0

    .line 1484
    .line 1485
    .line 1486
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1490
    const/4 v0, 0x0

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 1494
    .line 1495
    .line 1496
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->C0()Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 1497
    move-result-object v0

    .line 1498
    .line 1499
    sget-object v2, Lorg/jsoup/parser/HtmlTreeBuilderState;->InTable:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1503
    move-result v2

    .line 1504
    .line 1505
    if-nez v2, :cond_4c

    .line 1506
    .line 1507
    sget-object v2, Lorg/jsoup/parser/HtmlTreeBuilderState;->InCaption:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1511
    move-result v2

    .line 1512
    .line 1513
    if-nez v2, :cond_4c

    .line 1514
    .line 1515
    sget-object v2, Lorg/jsoup/parser/HtmlTreeBuilderState;->InTableBody:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1519
    move-result v2

    .line 1520
    .line 1521
    if-nez v2, :cond_4c

    .line 1522
    .line 1523
    sget-object v2, Lorg/jsoup/parser/HtmlTreeBuilderState;->InRow:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 1524
    .line 1525
    .line 1526
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1527
    move-result v2

    .line 1528
    .line 1529
    if-nez v2, :cond_4c

    .line 1530
    .line 1531
    sget-object v2, Lorg/jsoup/parser/HtmlTreeBuilderState;->InCell:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 1532
    .line 1533
    .line 1534
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1535
    move-result v0

    .line 1536
    .line 1537
    if-eqz v0, :cond_4b

    .line 1538
    goto :goto_d

    .line 1539
    .line 1540
    :cond_4b
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState;->InSelect:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->D0(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1544
    .line 1545
    goto/16 :goto_3

    .line 1546
    .line 1547
    :cond_4c
    :goto_d
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState;->InSelectInTable:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->D0(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1551
    .line 1552
    goto/16 :goto_3

    .line 1553
    .line 1554
    :pswitch_16
    move-object/from16 v13, p0

    .line 1555
    .line 1556
    .line 1557
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual {v12}, Lorg/jsoup/parser/Token$i;->z()Z

    .line 1561
    move-result v0

    .line 1562
    .line 1563
    if-nez v0, :cond_24

    .line 1564
    .line 1565
    iget-object v0, v1, Lorg/jsoup/parser/i;->c:Lorg/jsoup/parser/h;

    .line 1566
    .line 1567
    sget-object v2, Lorg/jsoup/parser/TokeniserState;->Rcdata:Lorg/jsoup/parser/TokeniserState;

    .line 1568
    .line 1569
    .line 1570
    invoke-virtual {v0, v2}, Lorg/jsoup/parser/h;->v(Lorg/jsoup/parser/TokeniserState;)V

    .line 1571
    .line 1572
    .line 1573
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->f0()V

    .line 1574
    const/4 v0, 0x0

    .line 1575
    .line 1576
    .line 1577
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 1578
    .line 1579
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState;->Text:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->D0(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1583
    .line 1584
    goto/16 :goto_3

    .line 1585
    .line 1586
    :pswitch_17
    move-object/from16 v13, p0

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v1}, Lorg/jsoup/parser/i;->a()Lorg/jsoup/nodes/Element;

    .line 1590
    move-result-object v0

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual {v0}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 1594
    move-result-object v0

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1598
    move-result v0

    .line 1599
    .line 1600
    if-eqz v0, :cond_4d

    .line 1601
    .line 1602
    .line 1603
    invoke-virtual {v1, v10}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1604
    .line 1605
    .line 1606
    :cond_4d
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 1607
    .line 1608
    .line 1609
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1610
    .line 1611
    goto/16 :goto_3

    .line 1612
    .line 1613
    :pswitch_18
    move-object/from16 v13, p0

    .line 1614
    const/4 v0, 0x0

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 1618
    .line 1619
    .line 1620
    invoke-static {v12, v1}, Lorg/jsoup/parser/HtmlTreeBuilderState;->access$300(Lorg/jsoup/parser/Token$h;Lorg/jsoup/parser/b;)V

    .line 1621
    .line 1622
    goto/16 :goto_3

    .line 1623
    .line 1624
    :pswitch_19
    move-object/from16 v13, p0

    .line 1625
    const/4 v0, 0x0

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v1, v11}, Lorg/jsoup/parser/b;->E(Ljava/lang/String;)Z

    .line 1629
    move-result v2

    .line 1630
    .line 1631
    if-eqz v2, :cond_4e

    .line 1632
    .line 1633
    .line 1634
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v1, v11}, Lorg/jsoup/parser/i;->h(Ljava/lang/String;)Z

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->g(Lorg/jsoup/parser/Token;)Z

    .line 1641
    .line 1642
    goto/16 :goto_3

    .line 1643
    .line 1644
    .line 1645
    :cond_4e
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->r0()V

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1649
    .line 1650
    .line 1651
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->s(Z)V

    .line 1652
    .line 1653
    goto/16 :goto_3

    .line 1654
    .line 1655
    :pswitch_1a
    move-object/from16 v13, p0

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v1, v13}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1659
    .line 1660
    .line 1661
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->D()Ljava/util/ArrayList;

    .line 1662
    move-result-object v0

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1666
    move-result v2

    .line 1667
    const/4 v3, 0x1

    .line 1668
    .line 1669
    if-eq v2, v3, :cond_4f

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1673
    move-result v2

    .line 1674
    const/4 v4, 0x2

    .line 1675
    .line 1676
    if-le v2, v4, :cond_50

    .line 1677
    .line 1678
    .line 1679
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1680
    move-result-object v2

    .line 1681
    .line 1682
    check-cast v2, Lorg/jsoup/nodes/Element;

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual {v2}, Lorg/jsoup/nodes/Element;->L0()Ljava/lang/String;

    .line 1686
    move-result-object v2

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1690
    move-result v2

    .line 1691
    .line 1692
    if-nez v2, :cond_50

    .line 1693
    .line 1694
    :cond_4f
    const/16 v18, 0x0

    .line 1695
    goto :goto_10

    .line 1696
    .line 1697
    .line 1698
    :cond_50
    invoke-virtual {v1}, Lorg/jsoup/parser/b;->t()Z

    .line 1699
    move-result v2

    .line 1700
    .line 1701
    if-nez v2, :cond_51

    .line 1702
    .line 1703
    const/16 v18, 0x0

    .line 1704
    return v18

    .line 1705
    .line 1706
    .line 1707
    :cond_51
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1708
    move-result-object v2

    .line 1709
    .line 1710
    check-cast v2, Lorg/jsoup/nodes/Element;

    .line 1711
    .line 1712
    .line 1713
    invoke-virtual {v2}, Lorg/jsoup/nodes/Element;->O0()Lorg/jsoup/nodes/Element;

    .line 1714
    move-result-object v4

    .line 1715
    .line 1716
    if-eqz v4, :cond_52

    .line 1717
    .line 1718
    .line 1719
    invoke-virtual {v2}, Lorg/jsoup/nodes/g;->L()V

    .line 1720
    .line 1721
    .line 1722
    :cond_52
    :goto_e
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1723
    move-result v2

    .line 1724
    .line 1725
    if-le v2, v3, :cond_53

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1729
    move-result v2

    .line 1730
    sub-int/2addr v2, v3

    .line 1731
    .line 1732
    .line 1733
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1734
    goto :goto_e

    .line 1735
    .line 1736
    .line 1737
    :cond_53
    invoke-virtual {v1, v12}, Lorg/jsoup/parser/b;->N(Lorg/jsoup/parser/Token$h;)Lorg/jsoup/nodes/Element;

    .line 1738
    .line 1739
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState;->InFrameset:Lorg/jsoup/parser/HtmlTreeBuilderState;

    .line 1740
    .line 1741
    .line 1742
    invoke-virtual {v1, v0}, Lorg/jsoup/parser/b;->D0(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 1743
    :goto_f
    return v3

    .line 1744
    :goto_10
    return v18

    :sswitch_data_0
    .sparse-switch
        -0x620c002b -> :sswitch_23
        -0x521dd8ce -> :sswitch_22
        -0x47007d5c -> :sswitch_21
        -0x3c35778b -> :sswitch_20
        -0x3bcc48c6 -> :sswitch_1f
        -0x3600cb04 -> :sswitch_1e
        -0x4d08054 -> :sswitch_1d
        0x61 -> :sswitch_1c
        0xc80 -> :sswitch_1b
        0xc90 -> :sswitch_1a
        0xcc9 -> :sswitch_19
        0xcca -> :sswitch_18
        0xccb -> :sswitch_17
        0xccc -> :sswitch_16
        0xccd -> :sswitch_15
        0xcce -> :sswitch_14
        0xd0a -> :sswitch_13
        0xd7d -> :sswitch_12
        0xe3e -> :sswitch_11
        0xe42 -> :sswitch_10
        0x1b2a3 -> :sswitch_f
        0x1be64 -> :sswitch_e
        0x1d01b -> :sswitch_d
        0x2e39a2 -> :sswitch_c
        0x300cc4 -> :sswitch_b
        0x3107ab -> :sswitch_a
        0x330708 -> :sswitch_9
        0x33add1 -> :sswitch_8
        0x35f74a -> :sswitch_7
        0x5faa95b -> :sswitch_6
        0x5fb57ca -> :sswitch_5
        0x6903bce -> :sswitch_4
        0xad8ba84 -> :sswitch_3
        0x759d29f7 -> :sswitch_2
        0x7ca6c5e8 -> :sswitch_1
        0x7e19b1b8 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_17
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_f
        :pswitch_e
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
        :pswitch_e
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public process(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lorg/jsoup/parser/HtmlTreeBuilderState$a;->a:[I

    .line 3
    .line 4
    iget-object v1, p1, Lorg/jsoup/parser/Token;->a:Lorg/jsoup/parser/Token$TokenType;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v1

    .line 9
    .line 10
    aget v0, v0, v1

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eq v0, v1, :cond_6

    .line 14
    const/4 v2, 0x2

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    if-eq v0, v2, :cond_5

    .line 18
    const/4 v2, 0x3

    .line 19
    .line 20
    if-eq v0, v2, :cond_4

    .line 21
    const/4 v2, 0x4

    .line 22
    .line 23
    if-eq v0, v2, :cond_3

    .line 24
    const/4 v2, 0x5

    .line 25
    .line 26
    if-eq v0, v2, :cond_0

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Lorg/jsoup/parser/Token;->a()Lorg/jsoup/parser/Token$c;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lorg/jsoup/parser/Token$c;->q()Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lorg/jsoup/parser/HtmlTreeBuilderState;->access$400()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 49
    return v3

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->t()Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Lorg/jsoup/parser/HtmlTreeBuilderState;->access$100(Lorg/jsoup/parser/Token;)Z

    .line 59
    move-result v0

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->r0()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->P(Lorg/jsoup/parser/Token$c;)V

    .line 68
    goto :goto_0

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {p2}, Lorg/jsoup/parser/b;->r0()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->P(Lorg/jsoup/parser/Token$c;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v3}, Lorg/jsoup/parser/b;->s(Z)V

    .line 78
    goto :goto_0

    .line 79
    .line 80
    .line 81
    :cond_3
    invoke-virtual {p0, p1, p2}, Lorg/jsoup/parser/HtmlTreeBuilderState$7;->e(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z

    .line 82
    move-result p1

    .line 83
    return p1

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-virtual {p0, p1, p2}, Lorg/jsoup/parser/HtmlTreeBuilderState$7;->g(Lorg/jsoup/parser/Token;Lorg/jsoup/parser/b;)Z

    .line 87
    move-result p1

    .line 88
    return p1

    .line 89
    .line 90
    .line 91
    :cond_5
    invoke-virtual {p2, p0}, Lorg/jsoup/parser/b;->r(Lorg/jsoup/parser/HtmlTreeBuilderState;)V

    .line 92
    return v3

    .line 93
    .line 94
    .line 95
    :cond_6
    invoke-virtual {p1}, Lorg/jsoup/parser/Token;->b()Lorg/jsoup/parser/Token$d;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, p1}, Lorg/jsoup/parser/b;->Q(Lorg/jsoup/parser/Token$d;)V

    .line 100
    :goto_0
    return v1
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
