.class public Lf1/m;
.super Lf1/a;
.source "ShapeKeyframeAnimation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1/a<",
        "Lj1/i;",
        "Landroid/graphics/Path;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Lj1/i;

.field public final j:Landroid/graphics/Path;

.field public k:Landroid/graphics/Path;

.field public l:Landroid/graphics/Path;

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le1/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp1/a<",
            "Lj1/i;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lf1/a;-><init>(Ljava/util/List;)V

    .line 4
    .line 5
    new-instance p1, Lj1/i;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Lj1/i;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lf1/m;->i:Lj1/i;

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Path;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Lf1/m;->j:Landroid/graphics/Path;

    .line 18
    return-void
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
.end method


# virtual methods
.method public bridge synthetic i(Lp1/a;F)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lf1/m;->q(Lp1/a;F)Landroid/graphics/Path;

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

.method public q(Lp1/a;F)Landroid/graphics/Path;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/a<",
            "Lj1/i;",
            ">;F)",
            "Landroid/graphics/Path;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p1, Lp1/a;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lj1/i;

    .line 5
    .line 6
    iget-object v1, p1, Lp1/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lj1/i;

    .line 9
    .line 10
    iget-object v2, p0, Lf1/m;->i:Lj1/i;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    move-object v3, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v3, v1

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v2, v0, v3, p2}, Lj1/i;->c(Lj1/i;Lj1/i;F)V

    .line 19
    .line 20
    iget-object v2, p0, Lf1/m;->i:Lj1/i;

    .line 21
    .line 22
    iget-object v3, p0, Lf1/m;->m:Ljava/util/List;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 28
    move-result v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, -0x1

    .line 31
    .line 32
    :goto_1
    if-ltz v3, :cond_1

    .line 33
    .line 34
    iget-object v4, p0, Lf1/m;->m:Ljava/util/List;

    .line 35
    .line 36
    .line 37
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    check-cast v4, Le1/s;

    .line 41
    .line 42
    .line 43
    invoke-interface {v4, v2}, Le1/s;->h(Lj1/i;)Lj1/i;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    add-int/lit8 v3, v3, -0x1

    .line 47
    goto :goto_1

    .line 48
    .line 49
    :cond_1
    iget-object v3, p0, Lf1/m;->j:Landroid/graphics/Path;

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Lo1/k;->h(Lj1/i;Landroid/graphics/Path;)V

    .line 53
    .line 54
    iget-object v2, p0, Lf1/a;->e:Lp1/c;

    .line 55
    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    iget-object v2, p0, Lf1/m;->k:Landroid/graphics/Path;

    .line 59
    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    new-instance v2, Landroid/graphics/Path;

    .line 63
    .line 64
    .line 65
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 66
    .line 67
    iput-object v2, p0, Lf1/m;->k:Landroid/graphics/Path;

    .line 68
    .line 69
    new-instance v2, Landroid/graphics/Path;

    .line 70
    .line 71
    .line 72
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 73
    .line 74
    iput-object v2, p0, Lf1/m;->l:Landroid/graphics/Path;

    .line 75
    .line 76
    :cond_2
    iget-object v2, p0, Lf1/m;->k:Landroid/graphics/Path;

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v2}, Lo1/k;->h(Lj1/i;Landroid/graphics/Path;)V

    .line 80
    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    iget-object v0, p0, Lf1/m;->l:Landroid/graphics/Path;

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v0}, Lo1/k;->h(Lj1/i;Landroid/graphics/Path;)V

    .line 87
    .line 88
    :cond_3
    iget-object v2, p0, Lf1/a;->e:Lp1/c;

    .line 89
    .line 90
    iget v3, p1, Lp1/a;->g:F

    .line 91
    .line 92
    iget-object p1, p1, Lp1/a;->h:Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 96
    move-result v4

    .line 97
    .line 98
    iget-object v5, p0, Lf1/m;->k:Landroid/graphics/Path;

    .line 99
    .line 100
    if-nez v1, :cond_4

    .line 101
    move-object v6, v5

    .line 102
    goto :goto_2

    .line 103
    .line 104
    :cond_4
    iget-object p1, p0, Lf1/m;->l:Landroid/graphics/Path;

    .line 105
    move-object v6, p1

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-virtual {p0}, Lf1/a;->e()F

    .line 109
    move-result v8

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lf1/a;->f()F

    .line 113
    move-result v9

    .line 114
    move v7, p2

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v2 .. v9}, Lp1/c;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    check-cast p1, Landroid/graphics/Path;

    .line 121
    return-object p1

    .line 122
    .line 123
    :cond_5
    iget-object p1, p0, Lf1/m;->j:Landroid/graphics/Path;

    .line 124
    return-object p1
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
.end method

.method public r(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le1/s;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lf1/m;->m:Ljava/util/List;

    .line 3
    return-void
    .line 4
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
.end method
