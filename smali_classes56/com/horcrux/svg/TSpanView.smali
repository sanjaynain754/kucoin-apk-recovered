.class Lcom/horcrux/svg/TSpanView;
.super Lcom/horcrux/svg/TextView;
.source "TSpanView.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public r:Landroid/graphics/Path;

.field public s:Ljava/lang/String;

.field public t:Lcom/horcrux/svg/TextPathView;

.field public final u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/Matrix;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Landroid/content/res/AssetManager;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/horcrux/svg/TextView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->u:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->v:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object p1, p0, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->w:Landroid/content/res/AssetManager;

    .line 30
    return-void
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
.end method

.method public static Q(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_3

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/text/Bidi;

    .line 12
    const/4 v1, -0x2

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Ljava/text/Bidi;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/text/Bidi;->isLeftToRight()Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    return-object p0

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {v0}, Ljava/text/Bidi;->getRunCount()I

    .line 26
    move-result v1

    .line 27
    .line 28
    new-array v2, v1, [B

    .line 29
    .line 30
    new-array v3, v1, [Ljava/lang/Integer;

    .line 31
    const/4 v4, 0x0

    .line 32
    move v5, v4

    .line 33
    .line 34
    :goto_0
    if-ge v5, v1, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v5}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 38
    move-result v6

    .line 39
    int-to-byte v6, v6

    .line 40
    .line 41
    aput-byte v6, v2, v5

    .line 42
    .line 43
    .line 44
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    aput-object v6, v3, v5

    .line 48
    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    goto :goto_0

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-static {v2, v4, v3, v4, v1}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    .line 54
    .line 55
    new-instance v5, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    :goto_1
    if-ge v4, v1, :cond_5

    .line 61
    .line 62
    aget-object v6, v3, v4

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 66
    move-result v6

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunStart(I)I

    .line 70
    move-result v7

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunLimit(I)I

    .line 74
    move-result v8

    .line 75
    .line 76
    aget-byte v6, v2, v6

    .line 77
    .line 78
    and-int/lit8 v6, v6, 0x1

    .line 79
    .line 80
    if-eqz v6, :cond_3

    .line 81
    .line 82
    :goto_2
    add-int/lit8 v8, v8, -0x1

    .line 83
    .line 84
    if-lt v8, v7, :cond_4

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 88
    move-result v6

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    goto :goto_2

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-virtual {v5, p0, v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 98
    goto :goto_1

    .line 99
    .line 100
    .line 101
    :cond_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    move-result-object p0

    .line 103
    :cond_6
    :goto_3
    return-object p0
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method


# virtual methods
.method public final H(Landroid/graphics/Paint;Lcom/horcrux/svg/c;)V
    .locals 7

    .line 1
    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    iget-wide v1, p2, Lcom/horcrux/svg/c;->n:D

    .line 5
    .line 6
    iget-wide v3, p2, Lcom/horcrux/svg/c;->a:D

    .line 7
    .line 8
    iget v5, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 9
    float-to-double v5, v5

    .line 10
    mul-double/2addr v3, v5

    .line 11
    .line 12
    div-double v3, v1, v3

    .line 13
    double-to-float v3, v3

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    cmpl-double v1, v1, v3

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p2, Lcom/horcrux/svg/c;->i:Lcom/horcrux/svg/TextProperties$FontVariantLigatures;

    .line 25
    .line 26
    sget-object v2, Lcom/horcrux/svg/TextProperties$FontVariantLigatures;->normal:Lcom/horcrux/svg/TextProperties$FontVariantLigatures;

    .line 27
    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    iget-object v2, p2, Lcom/horcrux/svg/c;->g:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    iget-object v2, p2, Lcom/horcrux/svg/c;->g:Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 74
    .line 75
    :goto_0
    const/16 v1, 0x1a

    .line 76
    .line 77
    if-lt v0, v1, :cond_1

    .line 78
    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    const-string v1, "\'wght\' "

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    iget v1, p2, Lcom/horcrux/svg/c;->f:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    iget-object p2, p2, Lcom/horcrux/svg/c;->h:Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    .line 104
    invoke-static {p1, p2}, Lcom/horcrux/svg/l;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    .line 105
    :cond_1
    return-void
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
.end method

.method public final I(Landroid/graphics/Paint;Lcom/horcrux/svg/c;)V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p2, Lcom/horcrux/svg/c;->e:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 3
    .line 4
    sget-object v1, Lcom/horcrux/svg/TextProperties$FontWeight;->Bold:Lcom/horcrux/svg/TextProperties$FontWeight;

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    iget v0, p2, Lcom/horcrux/svg/c;->f:I

    .line 11
    .line 12
    const/16 v1, 0x226

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    move v0, v3

    .line 19
    .line 20
    :goto_1
    iget-object v1, p2, Lcom/horcrux/svg/c;->c:Lcom/horcrux/svg/TextProperties$FontStyle;

    .line 21
    .line 22
    sget-object v4, Lcom/horcrux/svg/TextProperties$FontStyle;->italic:Lcom/horcrux/svg/TextProperties$FontStyle;

    .line 23
    .line 24
    if-ne v1, v4, :cond_2

    .line 25
    move v1, v3

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move v1, v2

    .line 28
    .line 29
    :goto_2
    if-eqz v0, :cond_3

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    const/4 v2, 0x3

    .line 33
    goto :goto_3

    .line 34
    .line 35
    :cond_3
    if-eqz v0, :cond_4

    .line 36
    move v2, v3

    .line 37
    goto :goto_3

    .line 38
    .line 39
    :cond_4
    if-eqz v1, :cond_5

    .line 40
    const/4 v2, 0x2

    .line 41
    .line 42
    :cond_5
    :goto_3
    iget v0, p2, Lcom/horcrux/svg/c;->f:I

    .line 43
    .line 44
    iget-object v4, p2, Lcom/horcrux/svg/c;->b:Ljava/lang/String;

    .line 45
    const/4 v5, 0x0

    .line 46
    .line 47
    if-eqz v4, :cond_7

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 51
    move-result v6

    .line 52
    .line 53
    if-lez v6, :cond_7

    .line 54
    .line 55
    new-instance v6, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    const-string v7, "fonts/"

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v8, ".otf"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    move-result-object v6

    .line 76
    .line 77
    new-instance v8, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v7, ".ttf"

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    move-result-object v7

    .line 96
    .line 97
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 98
    .line 99
    const/16 v9, 0x1a

    .line 100
    .line 101
    if-lt v8, v9, :cond_6

    .line 102
    .line 103
    .line 104
    invoke-static {}, Lcom/horcrux/svg/s;->a()V

    .line 105
    .line 106
    iget-object v5, p0, Lcom/horcrux/svg/TSpanView;->w:Landroid/content/res/AssetManager;

    .line 107
    .line 108
    .line 109
    invoke-static {v5, v6}, Lcom/horcrux/svg/q;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 110
    move-result-object v5

    .line 111
    .line 112
    new-instance v6, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    const-string v8, "\'wght\' "

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    iget-object v9, p2, Lcom/horcrux/svg/c;->h:Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    move-result-object v6

    .line 133
    .line 134
    .line 135
    invoke-static {v5, v6}, Lcom/horcrux/svg/m;->a(Landroid/graphics/Typeface$Builder;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 136
    .line 137
    .line 138
    invoke-static {v5, v0}, Lcom/horcrux/svg/n;->a(Landroid/graphics/Typeface$Builder;I)Landroid/graphics/Typeface$Builder;

    .line 139
    .line 140
    .line 141
    invoke-static {v5, v1}, Lcom/horcrux/svg/o;->a(Landroid/graphics/Typeface$Builder;Z)Landroid/graphics/Typeface$Builder;

    .line 142
    .line 143
    .line 144
    invoke-static {v5}, Lcom/horcrux/svg/p;->a(Landroid/graphics/Typeface$Builder;)Landroid/graphics/Typeface;

    .line 145
    move-result-object v5

    .line 146
    .line 147
    if-nez v5, :cond_7

    .line 148
    .line 149
    .line 150
    invoke-static {}, Lcom/horcrux/svg/s;->a()V

    .line 151
    .line 152
    iget-object v5, p0, Lcom/horcrux/svg/TSpanView;->w:Landroid/content/res/AssetManager;

    .line 153
    .line 154
    .line 155
    invoke-static {v5, v7}, Lcom/horcrux/svg/q;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 156
    move-result-object v5

    .line 157
    .line 158
    new-instance v6, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    iget-object v7, p2, Lcom/horcrux/svg/c;->h:Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    move-result-object v6

    .line 177
    .line 178
    .line 179
    invoke-static {v5, v6}, Lcom/horcrux/svg/m;->a(Landroid/graphics/Typeface$Builder;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 180
    .line 181
    .line 182
    invoke-static {v5, v0}, Lcom/horcrux/svg/n;->a(Landroid/graphics/Typeface$Builder;I)Landroid/graphics/Typeface$Builder;

    .line 183
    .line 184
    .line 185
    invoke-static {v5, v1}, Lcom/horcrux/svg/o;->a(Landroid/graphics/Typeface$Builder;Z)Landroid/graphics/Typeface$Builder;

    .line 186
    .line 187
    .line 188
    invoke-static {v5}, Lcom/horcrux/svg/p;->a(Landroid/graphics/Typeface$Builder;)Landroid/graphics/Typeface;

    .line 189
    move-result-object v5

    .line 190
    goto :goto_4

    .line 191
    .line 192
    :cond_6
    :try_start_0
    iget-object v8, p0, Lcom/horcrux/svg/TSpanView;->w:Landroid/content/res/AssetManager;

    .line 193
    .line 194
    .line 195
    invoke-static {v8, v6}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 196
    move-result-object v5

    .line 197
    .line 198
    .line 199
    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 200
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    goto :goto_4

    .line 202
    .line 203
    :catch_0
    :try_start_1
    iget-object v6, p0, Lcom/horcrux/svg/TSpanView;->w:Landroid/content/res/AssetManager;

    .line 204
    .line 205
    .line 206
    invoke-static {v6, v7}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 207
    move-result-object v5

    .line 208
    .line 209
    .line 210
    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 211
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 212
    .line 213
    :catch_1
    :cond_7
    :goto_4
    if-nez v5, :cond_8

    .line 214
    .line 215
    .line 216
    :try_start_2
    invoke-static {}, Lcom/facebook/react/views/text/ReactFontManager;->getInstance()Lcom/facebook/react/views/text/ReactFontManager;

    .line 217
    move-result-object v6

    .line 218
    .line 219
    iget-object v7, p0, Lcom/horcrux/svg/TSpanView;->w:Landroid/content/res/AssetManager;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6, v4, v2, v7}, Lcom/facebook/react/views/text/ReactFontManager;->getTypeface(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 223
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 224
    .line 225
    :catch_2
    :cond_8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 226
    .line 227
    const/16 v4, 0x1c

    .line 228
    .line 229
    if-lt v2, v4, :cond_9

    .line 230
    .line 231
    .line 232
    invoke-static {v5, v0, v1}, Lcom/facebook/react/common/assets/a;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 233
    move-result-object v5

    .line 234
    .line 235
    .line 236
    :cond_9
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLinearText(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 243
    .line 244
    iget-wide v0, p2, Lcom/horcrux/svg/c;->a:D

    .line 245
    .line 246
    iget p2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 247
    float-to-double v2, p2

    .line 248
    mul-double/2addr v0, v2

    .line 249
    double-to-float p2, v0

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 253
    const/4 p2, 0x0

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 257
    return-void
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
.end method

.method public final J(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/GroupView;->j()Lcom/horcrux/svg/d;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/TextView;->l()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/horcrux/svg/d;->b()Lcom/horcrux/svg/c;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    new-instance v3, Landroid/text/TextPaint;

    .line 14
    .line 15
    .line 16
    invoke-direct {v3, p2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v3, v1}, Lcom/horcrux/svg/TSpanView;->I(Landroid/graphics/Paint;Lcom/horcrux/svg/c;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v3, v1}, Lcom/horcrux/svg/TSpanView;->H(Landroid/graphics/Paint;Lcom/horcrux/svg/c;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/horcrux/svg/d;->c()D

    .line 26
    move-result-wide v11

    .line 27
    .line 28
    sget-object p2, Lcom/horcrux/svg/TSpanView$a;->a:[I

    .line 29
    .line 30
    iget-object v1, v1, Lcom/horcrux/svg/c;->j:Lcom/horcrux/svg/TextProperties$TextAnchor;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    move-result v1

    .line 35
    .line 36
    aget p2, p2, v1

    .line 37
    const/4 v1, 0x2

    .line 38
    .line 39
    if-eq p2, v1, :cond_1

    .line 40
    const/4 v1, 0x3

    .line 41
    .line 42
    if-eq p2, v1, :cond_0

    .line 43
    .line 44
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_0
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_1
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 51
    .line 52
    :goto_0
    new-instance v1, Landroid/text/SpannableString;

    .line 53
    .line 54
    iget-object v2, p0, Lcom/horcrux/svg/TSpanView;->s:Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    iget-object v4, p0, Lcom/horcrux/svg/TextView;->g:Lcom/horcrux/svg/SVGLength;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 63
    move-result v2

    .line 64
    int-to-double v5, v2

    .line 65
    .line 66
    iget v2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 67
    float-to-double v9, v2

    .line 68
    .line 69
    const-wide/16 v7, 0x0

    .line 70
    .line 71
    .line 72
    invoke-static/range {v4 .. v12}, Lcom/horcrux/svg/i;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 73
    move-result-wide v4

    .line 74
    double-to-int v7, v4

    .line 75
    const/4 v5, 0x1

    .line 76
    move-object v2, p0

    .line 77
    move-object v4, p2

    .line 78
    move-object v6, v1

    .line 79
    .line 80
    .line 81
    invoke-virtual/range {v2 .. v7}, Lcom/horcrux/svg/TSpanView;->M(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;

    .line 82
    move-result-object p2

    .line 83
    const/4 v1, 0x0

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v1}, Landroid/text/Layout;->getLineAscent(I)I

    .line 87
    move-result v1

    .line 88
    .line 89
    const-wide/16 v2, 0x0

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2, v3}, Lcom/horcrux/svg/d;->l(D)D

    .line 93
    move-result-wide v2

    .line 94
    double-to-float v2, v2

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/horcrux/svg/d;->m()D

    .line 98
    move-result-wide v3

    .line 99
    int-to-double v0, v1

    .line 100
    add-double/2addr v3, v0

    .line 101
    double-to-float v0, v3

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/horcrux/svg/GroupView;->k()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 117
    return-void
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
.end method

.method public final K(Lcom/horcrux/svg/SVGLength;DD)D
    .locals 10

    .line 1
    .line 2
    iget v0, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 3
    float-to-double v6, v0

    .line 4
    .line 5
    const-wide/16 v4, 0x0

    .line 6
    move-object v1, p1

    .line 7
    move-wide v2, p2

    .line 8
    move-wide v8, p4

    .line 9
    .line 10
    .line 11
    invoke-static/range {v1 .. v9}, Lcom/horcrux/svg/i;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 12
    move-result-wide p1

    .line 13
    return-wide p1
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
.end method

.method public final L(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;
    .locals 71

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v6, p2

    .line 5
    .line 6
    move-object/from16 v7, p3

    .line 7
    const/4 v10, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 11
    move-result v12

    .line 12
    .line 13
    new-instance v13, Landroid/graphics/Path;

    .line 14
    .line 15
    .line 16
    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    .line 17
    .line 18
    iget-object v1, v0, Lcom/horcrux/svg/TSpanView;->u:Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 22
    .line 23
    iget-object v1, v0, Lcom/horcrux/svg/TSpanView;->v:Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 27
    .line 28
    if-nez v12, :cond_0

    .line 29
    :goto_0
    move-object v10, v0

    .line 30
    move-object v1, v13

    .line 31
    .line 32
    goto/16 :goto_23

    .line 33
    .line 34
    :cond_0
    iget-object v1, v0, Lcom/horcrux/svg/TSpanView;->t:Lcom/horcrux/svg/TextPathView;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    const/4 v14, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v14, v10

    .line 40
    .line 41
    :goto_1
    const-wide/16 v15, 0x0

    .line 42
    .line 43
    if-eqz v14, :cond_3

    .line 44
    .line 45
    new-instance v1, Landroid/graphics/PathMeasure;

    .line 46
    .line 47
    iget-object v2, v0, Lcom/horcrux/svg/TSpanView;->t:Lcom/horcrux/svg/TextPathView;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v7, v6}, Lcom/horcrux/svg/TextPathView;->K(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, v2, v10}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    .line 58
    move-result v2

    .line 59
    float-to-double v2, v2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->isClosed()Z

    .line 63
    move-result v4

    .line 64
    .line 65
    cmpl-double v5, v2, v15

    .line 66
    .line 67
    if-nez v5, :cond_2

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_2
    move/from16 v17, v4

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    const/4 v1, 0x0

    .line 73
    .line 74
    move/from16 v17, v10

    .line 75
    move-wide v2, v15

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-virtual {v0}, Lcom/horcrux/svg/GroupView;->j()Lcom/horcrux/svg/d;

    .line 79
    move-result-object v4

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Lcom/horcrux/svg/d;->b()Lcom/horcrux/svg/c;

    .line 83
    move-result-object v5

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v6, v5}, Lcom/horcrux/svg/TSpanView;->I(Landroid/graphics/Paint;Lcom/horcrux/svg/c;)V

    .line 87
    .line 88
    new-instance v9, Lcom/horcrux/svg/e;

    .line 89
    .line 90
    .line 91
    invoke-direct {v9, v6}, Lcom/horcrux/svg/e;-><init>(Landroid/graphics/Paint;)V

    .line 92
    .line 93
    move-wide/from16 v19, v15

    .line 94
    .line 95
    new-array v15, v12, [Z

    .line 96
    .line 97
    .line 98
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toCharArray()[C

    .line 99
    move-result-object v16

    .line 100
    .line 101
    const/16 v22, 0x1

    .line 102
    .line 103
    iget-wide v10, v5, Lcom/horcrux/svg/c;->l:D

    .line 104
    .line 105
    move-object/from16 v24, v9

    .line 106
    .line 107
    iget-wide v8, v5, Lcom/horcrux/svg/c;->m:D

    .line 108
    .line 109
    move-wide/from16 v25, v8

    .line 110
    .line 111
    iget-wide v8, v5, Lcom/horcrux/svg/c;->n:D

    .line 112
    .line 113
    move-wide/from16 v27, v8

    .line 114
    .line 115
    iget-boolean v8, v5, Lcom/horcrux/svg/c;->o:Z

    .line 116
    .line 117
    cmpl-double v9, v27, v19

    .line 118
    .line 119
    if-nez v9, :cond_4

    .line 120
    .line 121
    iget-object v9, v5, Lcom/horcrux/svg/c;->i:Lcom/horcrux/svg/TextProperties$FontVariantLigatures;

    .line 122
    .line 123
    move-object/from16 v29, v1

    .line 124
    .line 125
    sget-object v1, Lcom/horcrux/svg/TextProperties$FontVariantLigatures;->normal:Lcom/horcrux/svg/TextProperties$FontVariantLigatures;

    .line 126
    .line 127
    if-ne v9, v1, :cond_5

    .line 128
    .line 129
    move/from16 v1, v22

    .line 130
    goto :goto_3

    .line 131
    .line 132
    :cond_4
    move-object/from16 v29, v1

    .line 133
    :cond_5
    const/4 v1, 0x0

    .line 134
    .line 135
    :goto_3
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 136
    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    move-wide/from16 v30, v2

    .line 145
    .line 146
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    iget-object v2, v5, Lcom/horcrux/svg/c;->g:Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 162
    goto :goto_4

    .line 163
    .line 164
    :cond_6
    move-wide/from16 v30, v2

    .line 165
    .line 166
    new-instance v1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    iget-object v2, v5, Lcom/horcrux/svg/c;->g:Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    move-result-object v1

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 187
    .line 188
    :goto_4
    const/16 v1, 0x1a

    .line 189
    .line 190
    if-lt v9, v1, :cond_7

    .line 191
    .line 192
    new-instance v1, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    const-string v2, "\'wght\' "

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    iget v2, v5, Lcom/horcrux/svg/c;->f:I

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    iget-object v2, v5, Lcom/horcrux/svg/c;->h:Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    move-result-object v1

    .line 215
    .line 216
    .line 217
    invoke-static {v6, v1}, Lcom/horcrux/svg/l;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    .line 218
    .line 219
    :cond_7
    iget-object v9, v5, Lcom/horcrux/svg/c;->d:Lcom/facebook/react/bridge/ReadableMap;

    .line 220
    .line 221
    new-array v1, v12, [F

    .line 222
    .line 223
    move-object/from16 v2, p1

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6, v2, v1}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    .line 227
    .line 228
    iget-object v2, v5, Lcom/horcrux/svg/c;->j:Lcom/horcrux/svg/TextProperties$TextAnchor;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Lcom/horcrux/svg/TextView;->u()Lcom/horcrux/svg/TextView;

    .line 232
    move-result-object v3

    .line 233
    .line 234
    move-wide/from16 v32, v10

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3, v6}, Lcom/horcrux/svg/TextView;->t(Landroid/graphics/Paint;)D

    .line 238
    move-result-wide v10

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v2, v10, v11}, Lcom/horcrux/svg/TSpanView;->N(Lcom/horcrux/svg/TextProperties$TextAnchor;D)D

    .line 242
    move-result-wide v34

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4}, Lcom/horcrux/svg/d;->c()D

    .line 246
    move-result-wide v41

    .line 247
    .line 248
    const-wide/high16 v45, 0x4000000000000000L    # 2.0

    .line 249
    .line 250
    if-eqz v14, :cond_c

    .line 251
    .line 252
    iget-object v3, v0, Lcom/horcrux/svg/TSpanView;->t:Lcom/horcrux/svg/TextPathView;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3}, Lcom/horcrux/svg/TextPathView;->H()Lcom/horcrux/svg/TextProperties$TextPathMidLine;

    .line 256
    move-result-object v3

    .line 257
    .line 258
    sget-object v5, Lcom/horcrux/svg/TextProperties$TextPathMidLine;->sharp:Lcom/horcrux/svg/TextProperties$TextPathMidLine;

    .line 259
    .line 260
    if-ne v3, v5, :cond_8

    .line 261
    .line 262
    move/from16 v36, v22

    .line 263
    goto :goto_5

    .line 264
    .line 265
    :cond_8
    const/16 v36, 0x0

    .line 266
    .line 267
    :goto_5
    iget-object v3, v0, Lcom/horcrux/svg/TSpanView;->t:Lcom/horcrux/svg/TextPathView;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3}, Lcom/horcrux/svg/TextPathView;->I()Lcom/horcrux/svg/TextProperties$TextPathSide;

    .line 271
    move-result-object v3

    .line 272
    .line 273
    sget-object v5, Lcom/horcrux/svg/TextProperties$TextPathSide;->right:Lcom/horcrux/svg/TextProperties$TextPathSide;

    .line 274
    .line 275
    if-ne v3, v5, :cond_9

    .line 276
    .line 277
    const/16 v37, -0x1

    .line 278
    goto :goto_6

    .line 279
    .line 280
    :cond_9
    move/from16 v37, v22

    .line 281
    .line 282
    :goto_6
    iget-object v3, v0, Lcom/horcrux/svg/TSpanView;->t:Lcom/horcrux/svg/TextPathView;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3}, Lcom/horcrux/svg/TextPathView;->J()Lcom/horcrux/svg/SVGLength;

    .line 286
    move-result-object v3

    .line 287
    .line 288
    move-object/from16 p1, v1

    .line 289
    move-object v1, v3

    .line 290
    .line 291
    move/from16 v47, v8

    .line 292
    .line 293
    move-object/from16 v8, v29

    .line 294
    .line 295
    move-wide/from16 v69, v10

    .line 296
    move-object v11, v2

    .line 297
    move-object v10, v4

    .line 298
    .line 299
    move-wide/from16 v2, v30

    .line 300
    .line 301
    move-wide/from16 v4, v41

    .line 302
    .line 303
    move-wide/from16 v29, v69

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/TSpanView;->K(Lcom/horcrux/svg/SVGLength;DD)D

    .line 307
    move-result-wide v38

    .line 308
    .line 309
    move-wide/from16 v69, v2

    .line 310
    move-object v2, v0

    .line 311
    .line 312
    move-wide/from16 v0, v69

    .line 313
    .line 314
    add-double v34, v34, v38

    .line 315
    .line 316
    move-wide/from16 v43, v4

    .line 317
    .line 318
    if-eqz v17, :cond_b

    .line 319
    .line 320
    div-double v3, v0, v45

    .line 321
    .line 322
    sget-object v5, Lcom/horcrux/svg/TextProperties$TextAnchor;->middle:Lcom/horcrux/svg/TextProperties$TextAnchor;

    .line 323
    .line 324
    if-ne v11, v5, :cond_a

    .line 325
    neg-double v3, v3

    .line 326
    goto :goto_7

    .line 327
    .line 328
    :cond_a
    move-wide/from16 v3, v19

    .line 329
    .line 330
    :goto_7
    add-double v38, v38, v3

    .line 331
    .line 332
    add-double v3, v38, v0

    .line 333
    .line 334
    move-wide/from16 v48, v34

    .line 335
    .line 336
    move/from16 v11, v36

    .line 337
    .line 338
    move-wide/from16 v50, v38

    .line 339
    .line 340
    move-wide/from16 v34, v3

    .line 341
    .line 342
    move/from16 v3, v37

    .line 343
    goto :goto_9

    .line 344
    .line 345
    :cond_b
    move-wide/from16 v50, v19

    .line 346
    .line 347
    move-wide/from16 v48, v34

    .line 348
    .line 349
    move/from16 v11, v36

    .line 350
    .line 351
    move/from16 v3, v37

    .line 352
    .line 353
    :goto_8
    move-wide/from16 v34, v0

    .line 354
    goto :goto_9

    .line 355
    :cond_c
    move-object v2, v0

    .line 356
    .line 357
    move-object/from16 p1, v1

    .line 358
    .line 359
    move/from16 v47, v8

    .line 360
    .line 361
    move-object/from16 v8, v29

    .line 362
    .line 363
    move-wide/from16 v0, v30

    .line 364
    .line 365
    move-wide/from16 v43, v41

    .line 366
    .line 367
    move-wide/from16 v29, v10

    .line 368
    move-object v10, v4

    .line 369
    .line 370
    move-wide/from16 v50, v19

    .line 371
    .line 372
    move/from16 v3, v22

    .line 373
    .line 374
    move-wide/from16 v48, v34

    .line 375
    const/4 v11, 0x0

    .line 376
    goto :goto_8

    .line 377
    .line 378
    :goto_9
    iget-object v4, v2, Lcom/horcrux/svg/TextView;->h:Lcom/horcrux/svg/SVGLength;

    .line 379
    .line 380
    const-wide/high16 v52, 0x3ff0000000000000L    # 1.0

    .line 381
    .line 382
    if-eqz v4, :cond_f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v7}, Landroid/graphics/Canvas;->getWidth()I

    .line 386
    move-result v5

    .line 387
    .line 388
    move-object/from16 v36, v4

    .line 389
    int-to-double v4, v5

    .line 390
    .line 391
    move-wide/from16 v37, v4

    .line 392
    .line 393
    iget v4, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 394
    float-to-double v4, v4

    .line 395
    .line 396
    const-wide/16 v39, 0x0

    .line 397
    .line 398
    move-wide/from16 v41, v4

    .line 399
    .line 400
    .line 401
    invoke-static/range {v36 .. v44}, Lcom/horcrux/svg/i;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 402
    move-result-wide v4

    .line 403
    .line 404
    cmpg-double v17, v4, v19

    .line 405
    .line 406
    if-ltz v17, :cond_e

    .line 407
    .line 408
    sget-object v17, Lcom/horcrux/svg/TSpanView$a;->b:[I

    .line 409
    .line 410
    move-wide/from16 v36, v4

    .line 411
    .line 412
    iget-object v4, v2, Lcom/horcrux/svg/TextView;->j:Lcom/horcrux/svg/TextProperties$TextLengthAdjust;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 416
    move-result v4

    .line 417
    .line 418
    aget v4, v17, v4

    .line 419
    const/4 v5, 0x2

    .line 420
    .line 421
    if-eq v4, v5, :cond_d

    .line 422
    .line 423
    sub-double v4, v36, v29

    .line 424
    .line 425
    move-wide/from16 v29, v4

    .line 426
    .line 427
    add-int/lit8 v4, v12, -0x1

    .line 428
    int-to-double v4, v4

    .line 429
    .line 430
    div-double v4, v29, v4

    .line 431
    .line 432
    add-double v4, v27, v4

    .line 433
    .line 434
    move-wide/from16 v27, v4

    .line 435
    goto :goto_a

    .line 436
    .line 437
    :cond_d
    div-double v52, v36, v29

    .line 438
    goto :goto_a

    .line 439
    .line 440
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 441
    .line 442
    const-string v1, "Negative textLength value"

    .line 443
    .line 444
    .line 445
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 446
    throw v0

    .line 447
    :cond_f
    :goto_a
    int-to-double v4, v3

    .line 448
    .line 449
    move-wide/from16 v29, v4

    .line 450
    .line 451
    mul-double v4, v52, v29

    .line 452
    .line 453
    move/from16 v17, v11

    .line 454
    .line 455
    .line 456
    invoke-virtual {v6}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 457
    move-result-object v11

    .line 458
    .line 459
    move/from16 v31, v14

    .line 460
    .line 461
    iget v14, v11, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 462
    .line 463
    move-object/from16 v54, v15

    .line 464
    float-to-double v14, v14

    .line 465
    .line 466
    move-object/from16 v55, v13

    .line 467
    .line 468
    iget v13, v11, Landroid/graphics/Paint$FontMetrics;->leading:F

    .line 469
    .line 470
    move/from16 v56, v3

    .line 471
    .line 472
    move-wide/from16 v57, v4

    .line 473
    float-to-double v3, v13

    .line 474
    add-double/2addr v3, v14

    .line 475
    .line 476
    iget v5, v11, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 477
    neg-float v5, v5

    .line 478
    add-float/2addr v5, v13

    .line 479
    .line 480
    move-wide/from16 v36, v3

    .line 481
    float-to-double v3, v5

    .line 482
    .line 483
    iget v5, v11, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 484
    neg-float v5, v5

    .line 485
    .line 486
    move-wide/from16 v38, v3

    .line 487
    float-to-double v3, v5

    .line 488
    .line 489
    add-double v40, v3, v36

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2}, Lcom/horcrux/svg/TextView;->r()Ljava/lang/String;

    .line 493
    move-result-object v5

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2}, Lcom/horcrux/svg/TextView;->q()Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 497
    move-result-object v11

    .line 498
    .line 499
    if-eqz v11, :cond_10

    .line 500
    .line 501
    sget-object v13, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 502
    .line 503
    .line 504
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 505
    move-result v42

    .line 506
    .line 507
    aget v13, v13, v42

    .line 508
    .line 509
    .line 510
    packed-switch v13, :pswitch_data_0

    .line 511
    .line 512
    move-wide/from16 v3, v19

    .line 513
    .line 514
    :goto_b
    :pswitch_0
    const/16 v21, 0x0

    .line 515
    goto :goto_d

    .line 516
    .line 517
    :pswitch_1
    div-double v3, v40, v45

    .line 518
    goto :goto_b

    .line 519
    .line 520
    :pswitch_2
    move-wide/from16 v3, v36

    .line 521
    goto :goto_b

    .line 522
    .line 523
    :pswitch_3
    move-wide/from16 v3, v38

    .line 524
    goto :goto_b

    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    :pswitch_4
    const-wide v3, 0x3fe999999999999aL    # 0.8

    .line 530
    .line 531
    :goto_c
    mul-double v3, v3, v38

    .line 532
    goto :goto_b

    .line 533
    .line 534
    :pswitch_5
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 535
    goto :goto_c

    .line 536
    .line 537
    :pswitch_6
    sub-double v3, v38, v14

    .line 538
    .line 539
    div-double v3, v3, v45

    .line 540
    goto :goto_b

    .line 541
    .line 542
    :pswitch_7
    new-instance v3, Landroid/graphics/Rect;

    .line 543
    .line 544
    .line 545
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 546
    .line 547
    const-string v4, "x"

    .line 548
    .line 549
    move/from16 v13, v22

    .line 550
    const/4 v14, 0x0

    .line 551
    .line 552
    .line 553
    invoke-virtual {v6, v4, v14, v13, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 557
    move-result v3

    .line 558
    int-to-double v3, v3

    .line 559
    .line 560
    div-double v3, v3, v45

    .line 561
    .line 562
    move/from16 v21, v14

    .line 563
    goto :goto_d

    .line 564
    .line 565
    :pswitch_8
    const/16 v21, 0x0

    .line 566
    neg-double v3, v14

    .line 567
    goto :goto_d

    .line 568
    .line 569
    :cond_10
    :pswitch_9
    const/16 v21, 0x0

    .line 570
    .line 571
    move-wide/from16 v3, v19

    .line 572
    .line 573
    :goto_d
    if-eqz v5, :cond_14

    .line 574
    .line 575
    .line 576
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 577
    move-result v13

    .line 578
    .line 579
    if-nez v13, :cond_14

    .line 580
    .line 581
    sget-object v13, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 582
    .line 583
    .line 584
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 585
    move-result v11

    .line 586
    .line 587
    aget v11, v13, v11

    .line 588
    .line 589
    const/16 v13, 0xe

    .line 590
    .line 591
    if-eq v11, v13, :cond_14

    .line 592
    .line 593
    const/16 v13, 0x10

    .line 594
    .line 595
    if-eq v11, v13, :cond_14

    .line 596
    .line 597
    const-string v11, "os2"

    .line 598
    .line 599
    const-string v13, "unitsPerEm"

    .line 600
    .line 601
    const-string v14, "tables"

    .line 602
    .line 603
    .line 604
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 605
    move-result v15

    .line 606
    .line 607
    .line 608
    sparse-switch v15, :sswitch_data_0

    .line 609
    .line 610
    :goto_e
    const/16 v18, -0x1

    .line 611
    goto :goto_f

    .line 612
    .line 613
    :sswitch_0
    const-string v15, "super"

    .line 614
    .line 615
    .line 616
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 617
    move-result v15

    .line 618
    .line 619
    if-nez v15, :cond_11

    .line 620
    goto :goto_e

    .line 621
    .line 622
    :cond_11
    const/16 v18, 0x2

    .line 623
    goto :goto_f

    .line 624
    .line 625
    :sswitch_1
    const-string v15, "sub"

    .line 626
    .line 627
    .line 628
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 629
    move-result v15

    .line 630
    .line 631
    if-nez v15, :cond_12

    .line 632
    goto :goto_e

    .line 633
    .line 634
    :cond_12
    const/16 v18, 0x1

    .line 635
    goto :goto_f

    .line 636
    .line 637
    :sswitch_2
    const-string v15, "baseline"

    .line 638
    .line 639
    .line 640
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 641
    move-result v15

    .line 642
    .line 643
    if-nez v15, :cond_13

    .line 644
    goto :goto_e

    .line 645
    .line 646
    :cond_13
    move/from16 v18, v21

    .line 647
    .line 648
    .line 649
    :goto_f
    packed-switch v18, :pswitch_data_1

    .line 650
    .line 651
    iget v9, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 652
    float-to-double v13, v9

    .line 653
    .line 654
    mul-double v37, v13, v43

    .line 655
    float-to-double v13, v9

    .line 656
    .line 657
    move-object/from16 v36, v5

    .line 658
    .line 659
    move-wide/from16 v39, v13

    .line 660
    .line 661
    move-wide/from16 v41, v43

    .line 662
    .line 663
    .line 664
    invoke-static/range {v36 .. v42}, Lcom/horcrux/svg/i;->b(Ljava/lang/String;DDD)D

    .line 665
    move-result-wide v13

    .line 666
    sub-double/2addr v3, v13

    .line 667
    .line 668
    :cond_14
    :goto_10
    :pswitch_a
    move-wide/from16 v36, v3

    .line 669
    .line 670
    goto/16 :goto_11

    .line 671
    .line 672
    :pswitch_b
    if-eqz v9, :cond_14

    .line 673
    .line 674
    .line 675
    invoke-interface {v9, v14}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 676
    move-result v5

    .line 677
    .line 678
    if-eqz v5, :cond_14

    .line 679
    .line 680
    .line 681
    invoke-interface {v9, v13}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 682
    move-result v5

    .line 683
    .line 684
    if-eqz v5, :cond_14

    .line 685
    .line 686
    .line 687
    invoke-interface {v9, v13}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 688
    move-result v5

    .line 689
    .line 690
    .line 691
    invoke-interface {v9, v14}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 692
    move-result-object v9

    .line 693
    .line 694
    .line 695
    invoke-interface {v9, v11}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 696
    move-result v13

    .line 697
    .line 698
    if-eqz v13, :cond_15

    .line 699
    .line 700
    .line 701
    invoke-interface {v9, v11}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 702
    move-result-object v9

    .line 703
    .line 704
    const-string v11, "ySuperscriptYOffset"

    .line 705
    .line 706
    .line 707
    invoke-interface {v9, v11}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 708
    move-result v13

    .line 709
    .line 710
    if-eqz v13, :cond_15

    .line 711
    .line 712
    .line 713
    invoke-interface {v9, v11}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 714
    move-result-wide v13

    .line 715
    .line 716
    iget v9, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 717
    .line 718
    move-wide/from16 v36, v3

    .line 719
    float-to-double v3, v9

    .line 720
    .line 721
    mul-double v3, v3, v43

    .line 722
    mul-double/2addr v3, v13

    .line 723
    int-to-double v13, v5

    .line 724
    div-double/2addr v3, v13

    .line 725
    .line 726
    sub-double v3, v36, v3

    .line 727
    goto :goto_10

    .line 728
    .line 729
    :cond_15
    move-wide/from16 v36, v3

    .line 730
    .line 731
    :cond_16
    move-wide/from16 v3, v36

    .line 732
    goto :goto_10

    .line 733
    .line 734
    :pswitch_c
    move-wide/from16 v36, v3

    .line 735
    .line 736
    if-eqz v9, :cond_17

    .line 737
    .line 738
    .line 739
    invoke-interface {v9, v14}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 740
    move-result v3

    .line 741
    .line 742
    if-eqz v3, :cond_17

    .line 743
    .line 744
    .line 745
    invoke-interface {v9, v13}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 746
    move-result v3

    .line 747
    .line 748
    if-eqz v3, :cond_17

    .line 749
    .line 750
    .line 751
    invoke-interface {v9, v13}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 752
    move-result v3

    .line 753
    .line 754
    .line 755
    invoke-interface {v9, v14}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 756
    move-result-object v4

    .line 757
    .line 758
    .line 759
    invoke-interface {v4, v11}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 760
    move-result v5

    .line 761
    .line 762
    if-eqz v5, :cond_16

    .line 763
    .line 764
    .line 765
    invoke-interface {v4, v11}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 766
    move-result-object v4

    .line 767
    .line 768
    const-string v5, "ySubscriptYOffset"

    .line 769
    .line 770
    .line 771
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 772
    move-result v9

    .line 773
    .line 774
    if-eqz v9, :cond_16

    .line 775
    .line 776
    .line 777
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 778
    move-result-wide v4

    .line 779
    .line 780
    iget v9, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 781
    float-to-double v13, v9

    .line 782
    .line 783
    mul-double v13, v13, v43

    .line 784
    mul-double/2addr v13, v4

    .line 785
    int-to-double v3, v3

    .line 786
    div-double/2addr v13, v3

    .line 787
    .line 788
    add-double v3, v36, v13

    .line 789
    goto :goto_10

    .line 790
    .line 791
    :cond_17
    :goto_11
    new-instance v9, Landroid/graphics/Matrix;

    .line 792
    .line 793
    .line 794
    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 795
    .line 796
    new-instance v11, Landroid/graphics/Matrix;

    .line 797
    .line 798
    .line 799
    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 800
    .line 801
    new-instance v13, Landroid/graphics/Matrix;

    .line 802
    .line 803
    .line 804
    invoke-direct {v13}, Landroid/graphics/Matrix;-><init>()V

    .line 805
    .line 806
    const/16 v3, 0x9

    .line 807
    .line 808
    new-array v14, v3, [F

    .line 809
    .line 810
    new-array v15, v3, [F

    .line 811
    .line 812
    move/from16 v3, v21

    .line 813
    .line 814
    :goto_12
    if-ge v3, v12, :cond_29

    .line 815
    .line 816
    aget-char v4, v16, v3

    .line 817
    .line 818
    .line 819
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 820
    move-result-object v5

    .line 821
    .line 822
    aget-boolean v18, v54, v3

    .line 823
    .line 824
    if-eqz v18, :cond_18

    .line 825
    .line 826
    const-string v5, ""

    .line 827
    .line 828
    move/from16 v38, v21

    .line 829
    .line 830
    const/16 v40, 0x0

    .line 831
    goto :goto_14

    .line 832
    .line 833
    :cond_18
    move/from16 v22, v3

    .line 834
    .line 835
    move/from16 v38, v21

    .line 836
    .line 837
    const/16 v40, 0x0

    .line 838
    .line 839
    :goto_13
    const/16 v39, 0x1

    .line 840
    .line 841
    add-int/lit8 v2, v22, 0x1

    .line 842
    .line 843
    if-ge v2, v12, :cond_1a

    .line 844
    .line 845
    aget v39, p1, v2

    .line 846
    .line 847
    cmpl-float v39, v39, v40

    .line 848
    .line 849
    if-lez v39, :cond_19

    .line 850
    goto :goto_14

    .line 851
    .line 852
    :cond_19
    move/from16 v39, v2

    .line 853
    .line 854
    new-instance v2, Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 861
    .line 862
    aget-char v5, v16, v39

    .line 863
    .line 864
    .line 865
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 869
    move-result-object v5

    .line 870
    .line 871
    const/16 v22, 0x1

    .line 872
    .line 873
    aput-boolean v22, v54, v39

    .line 874
    .line 875
    move/from16 v22, v39

    .line 876
    .line 877
    const/16 v38, 0x1

    .line 878
    goto :goto_13

    .line 879
    .line 880
    .line 881
    :cond_1a
    :goto_14
    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 882
    move-result v2

    .line 883
    .line 884
    move/from16 v39, v3

    .line 885
    float-to-double v2, v2

    .line 886
    .line 887
    mul-double v2, v2, v52

    .line 888
    .line 889
    move-wide/from16 v41, v2

    .line 890
    .line 891
    if-nez v47, :cond_1b

    .line 892
    .line 893
    aget v2, p1, v39

    .line 894
    float-to-double v2, v2

    .line 895
    .line 896
    mul-double v2, v2, v52

    .line 897
    .line 898
    sub-double v2, v2, v41

    .line 899
    .line 900
    move-wide/from16 v32, v2

    .line 901
    .line 902
    :cond_1b
    const/16 v2, 0x20

    .line 903
    .line 904
    if-ne v4, v2, :cond_1c

    .line 905
    const/4 v2, 0x1

    .line 906
    goto :goto_15

    .line 907
    .line 908
    :cond_1c
    move/from16 v2, v21

    .line 909
    .line 910
    :goto_15
    if-eqz v2, :cond_1d

    .line 911
    .line 912
    move-wide/from16 v43, v25

    .line 913
    goto :goto_16

    .line 914
    .line 915
    :cond_1d
    move-wide/from16 v43, v19

    .line 916
    .line 917
    :goto_16
    add-double v43, v43, v27

    .line 918
    .line 919
    add-double v43, v41, v43

    .line 920
    .line 921
    if-eqz v18, :cond_1e

    .line 922
    .line 923
    move/from16 v61, v2

    .line 924
    .line 925
    move-wide/from16 v2, v19

    .line 926
    goto :goto_17

    .line 927
    .line 928
    :cond_1e
    add-double v59, v32, v43

    .line 929
    .line 930
    move/from16 v61, v2

    .line 931
    .line 932
    move-wide/from16 v2, v59

    .line 933
    .line 934
    .line 935
    :goto_17
    invoke-virtual {v10, v2, v3}, Lcom/horcrux/svg/d;->l(D)D

    .line 936
    move-result-wide v2

    .line 937
    .line 938
    move-wide/from16 v59, v2

    .line 939
    .line 940
    .line 941
    invoke-virtual {v10}, Lcom/horcrux/svg/d;->m()D

    .line 942
    move-result-wide v2

    .line 943
    .line 944
    .line 945
    invoke-virtual {v10}, Lcom/horcrux/svg/d;->i()D

    .line 946
    move-result-wide v62

    .line 947
    .line 948
    .line 949
    invoke-virtual {v10}, Lcom/horcrux/svg/d;->j()D

    .line 950
    move-result-wide v64

    .line 951
    .line 952
    move-object/from16 v66, v5

    .line 953
    .line 954
    .line 955
    invoke-virtual {v10}, Lcom/horcrux/svg/d;->k()D

    .line 956
    move-result-wide v5

    .line 957
    .line 958
    if-nez v18, :cond_28

    .line 959
    .line 960
    if-eqz v61, :cond_1f

    .line 961
    move-object v3, v7

    .line 962
    .line 963
    :goto_18
    move-object/from16 v59, v10

    .line 964
    .line 965
    move/from16 v60, v12

    .line 966
    .line 967
    move-object/from16 v18, v13

    .line 968
    .line 969
    move-object/from16 v2, v24

    .line 970
    .line 971
    const/16 v22, 0x1

    .line 972
    .line 973
    const/16 v23, 0x2

    .line 974
    .line 975
    move-object/from16 v10, p0

    .line 976
    move-wide v12, v0

    .line 977
    .line 978
    move-object/from16 v1, v55

    .line 979
    .line 980
    move-object/from16 v0, p2

    .line 981
    .line 982
    goto/16 :goto_22

    .line 983
    .line 984
    :cond_1f
    mul-double v43, v43, v29

    .line 985
    .line 986
    mul-double v41, v41, v29

    .line 987
    .line 988
    add-double v59, v59, v62

    .line 989
    .line 990
    mul-double v59, v59, v29

    .line 991
    .line 992
    add-double v59, v48, v59

    .line 993
    .line 994
    move/from16 v18, v4

    .line 995
    .line 996
    move-wide/from16 v61, v5

    .line 997
    .line 998
    sub-double v4, v59, v43

    .line 999
    .line 1000
    if-eqz v31, :cond_25

    .line 1001
    .line 1002
    add-double v6, v4, v41

    .line 1003
    .line 1004
    move-wide/from16 v43, v2

    .line 1005
    .line 1006
    div-double v2, v41, v45

    .line 1007
    .line 1008
    move-wide/from16 v41, v2

    .line 1009
    .line 1010
    add-double v2, v4, v41

    .line 1011
    .line 1012
    cmpl-double v59, v2, v34

    .line 1013
    .line 1014
    if-lez v59, :cond_20

    .line 1015
    .line 1016
    :goto_19
    move-object/from16 v3, p3

    .line 1017
    goto :goto_18

    .line 1018
    .line 1019
    :cond_20
    cmpg-double v59, v2, v50

    .line 1020
    .line 1021
    if-gez v59, :cond_21

    .line 1022
    goto :goto_19

    .line 1023
    .line 1024
    :cond_21
    move-object/from16 v59, v10

    .line 1025
    const/4 v10, 0x3

    .line 1026
    .line 1027
    if-eqz v17, :cond_22

    .line 1028
    double-to-float v2, v2

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v8, v2, v11, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1032
    .line 1033
    move/from16 v60, v12

    .line 1034
    .line 1035
    const/16 v23, 0x2

    .line 1036
    .line 1037
    :goto_1a
    move-wide/from16 v2, v41

    .line 1038
    goto :goto_1d

    .line 1039
    .line 1040
    :cond_22
    cmpg-double v60, v4, v19

    .line 1041
    .line 1042
    if-gez v60, :cond_23

    .line 1043
    .line 1044
    move/from16 v60, v12

    .line 1045
    .line 1046
    move/from16 v12, v40

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v8, v12, v9, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1050
    double-to-float v4, v4

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v9, v4, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1054
    const/4 v5, 0x1

    .line 1055
    goto :goto_1b

    .line 1056
    .line 1057
    :cond_23
    move/from16 v60, v12

    .line 1058
    double-to-float v4, v4

    .line 1059
    const/4 v5, 0x1

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v8, v4, v9, v5}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1063
    :goto_1b
    double-to-float v2, v2

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v8, v2, v11, v5}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1067
    .line 1068
    cmpl-double v2, v6, v0

    .line 1069
    .line 1070
    if-lez v2, :cond_24

    .line 1071
    double-to-float v2, v0

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v8, v2, v13, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1075
    sub-double/2addr v6, v0

    .line 1076
    double-to-float v2, v6

    .line 1077
    const/4 v12, 0x0

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v13, v2, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1081
    goto :goto_1c

    .line 1082
    :cond_24
    double-to-float v2, v6

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v8, v2, v13, v5}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 1086
    .line 1087
    .line 1088
    :goto_1c
    invoke-virtual {v9, v14}, Landroid/graphics/Matrix;->getValues([F)V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v13, v15}, Landroid/graphics/Matrix;->getValues([F)V

    .line 1092
    .line 1093
    const/16 v23, 0x2

    .line 1094
    .line 1095
    aget v2, v14, v23

    .line 1096
    float-to-double v2, v2

    .line 1097
    const/4 v4, 0x5

    .line 1098
    .line 1099
    aget v5, v14, v4

    .line 1100
    float-to-double v5, v5

    .line 1101
    .line 1102
    aget v7, v15, v23

    .line 1103
    move v10, v4

    .line 1104
    .line 1105
    move-wide/from16 v67, v5

    .line 1106
    float-to-double v4, v7

    .line 1107
    .line 1108
    aget v6, v15, v10

    .line 1109
    float-to-double v6, v6

    .line 1110
    sub-double/2addr v4, v2

    .line 1111
    .line 1112
    sub-double v6, v6, v67

    .line 1113
    .line 1114
    .line 1115
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    .line 1116
    move-result-wide v2

    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    const-wide v4, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 1122
    mul-double/2addr v2, v4

    .line 1123
    .line 1124
    mul-double v2, v2, v29

    .line 1125
    double-to-float v2, v2

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v11, v2}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 1129
    goto :goto_1a

    .line 1130
    :goto_1d
    neg-double v2, v2

    .line 1131
    double-to-float v2, v2

    .line 1132
    .line 1133
    add-double v3, v64, v36

    .line 1134
    double-to-float v3, v3

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v11, v2, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1138
    .line 1139
    move-wide/from16 v2, v57

    .line 1140
    double-to-float v4, v2

    .line 1141
    .line 1142
    move/from16 v6, v56

    .line 1143
    int-to-float v5, v6

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v11, v4, v5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 1147
    .line 1148
    move-wide/from16 v4, v43

    .line 1149
    double-to-float v4, v4

    .line 1150
    const/4 v12, 0x0

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v11, v12, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1154
    move-object v7, v13

    .line 1155
    .line 1156
    :goto_1e
    move-wide/from16 v12, v61

    .line 1157
    goto :goto_1f

    .line 1158
    .line 1159
    :cond_25
    move-wide/from16 v43, v2

    .line 1160
    .line 1161
    move-object/from16 v59, v10

    .line 1162
    .line 1163
    move/from16 v60, v12

    .line 1164
    .line 1165
    move/from16 v12, v40

    .line 1166
    .line 1167
    move/from16 v6, v56

    .line 1168
    .line 1169
    move-wide/from16 v2, v57

    .line 1170
    .line 1171
    const/16 v23, 0x2

    .line 1172
    double-to-float v4, v4

    .line 1173
    .line 1174
    add-double v40, v43, v64

    .line 1175
    move-object v7, v13

    .line 1176
    .line 1177
    add-double v12, v40, v36

    .line 1178
    double-to-float v10, v12

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {v11, v4, v10}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 1182
    goto :goto_1e

    .line 1183
    :goto_1f
    double-to-float v4, v12

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v11, v4}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 1187
    .line 1188
    if-eqz v38, :cond_26

    .line 1189
    .line 1190
    new-instance v4, Landroid/graphics/Path;

    .line 1191
    .line 1192
    .line 1193
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 1194
    .line 1195
    move-wide/from16 v57, v2

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual/range {v66 .. v66}, Ljava/lang/String;->length()I

    .line 1199
    move-result v3

    .line 1200
    .line 1201
    move/from16 v56, v6

    .line 1202
    move-object v6, v4

    .line 1203
    const/4 v4, 0x0

    .line 1204
    const/4 v12, 0x0

    .line 1205
    const/4 v5, 0x0

    .line 1206
    const/4 v2, 0x0

    .line 1207
    .line 1208
    move-object/from16 v10, p0

    .line 1209
    .line 1210
    move-object/from16 v18, v7

    .line 1211
    move v7, v12

    .line 1212
    move-wide v12, v0

    .line 1213
    .line 1214
    move-object/from16 v1, v66

    .line 1215
    .line 1216
    move-object/from16 v0, p2

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    .line 1220
    move-object v4, v6

    .line 1221
    .line 1222
    move-object/from16 v2, v24

    .line 1223
    goto :goto_20

    .line 1224
    .line 1225
    :cond_26
    move-object/from16 v10, p0

    .line 1226
    move-wide v12, v0

    .line 1227
    .line 1228
    move-wide/from16 v57, v2

    .line 1229
    .line 1230
    move/from16 v56, v6

    .line 1231
    .line 1232
    move/from16 v3, v18

    .line 1233
    .line 1234
    move-object/from16 v2, v24

    .line 1235
    .line 1236
    move-object/from16 v1, v66

    .line 1237
    .line 1238
    move-object/from16 v0, p2

    .line 1239
    .line 1240
    move-object/from16 v18, v7

    .line 1241
    const/4 v7, 0x0

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v2, v3, v1}, Lcom/horcrux/svg/e;->b(CLjava/lang/String;)Landroid/graphics/Path;

    .line 1245
    move-result-object v4

    .line 1246
    .line 1247
    :goto_20
    new-instance v3, Landroid/graphics/RectF;

    .line 1248
    .line 1249
    .line 1250
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 1251
    const/4 v5, 0x1

    .line 1252
    .line 1253
    .line 1254
    invoke-virtual {v4, v3, v5}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 1258
    move-result v3

    .line 1259
    .line 1260
    cmpl-float v3, v3, v7

    .line 1261
    .line 1262
    if-nez v3, :cond_27

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    .line 1266
    .line 1267
    move-object/from16 v3, p3

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v3, v11}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1271
    .line 1272
    iget-object v4, v10, Lcom/horcrux/svg/TSpanView;->u:Ljava/util/ArrayList;

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1276
    .line 1277
    iget-object v4, v10, Lcom/horcrux/svg/TSpanView;->v:Ljava/util/ArrayList;

    .line 1278
    .line 1279
    new-instance v5, Landroid/graphics/Matrix;

    .line 1280
    .line 1281
    .line 1282
    invoke-direct {v5, v11}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v3, v1, v7, v7, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    .line 1292
    .line 1293
    move-object/from16 v1, v55

    .line 1294
    .line 1295
    :goto_21
    const/16 v22, 0x1

    .line 1296
    goto :goto_22

    .line 1297
    .line 1298
    :cond_27
    move-object/from16 v3, p3

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v4, v11}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 1302
    .line 1303
    move-object/from16 v1, v55

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v1, v4}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 1307
    goto :goto_21

    .line 1308
    :cond_28
    move-object v3, v7

    .line 1309
    .line 1310
    move-object/from16 v59, v10

    .line 1311
    .line 1312
    move/from16 v60, v12

    .line 1313
    .line 1314
    move-object/from16 v18, v13

    .line 1315
    .line 1316
    move-object/from16 v2, v24

    .line 1317
    .line 1318
    const/16 v23, 0x2

    .line 1319
    .line 1320
    move-object/from16 v10, p0

    .line 1321
    move-wide v12, v0

    .line 1322
    .line 1323
    move-object/from16 v1, v55

    .line 1324
    .line 1325
    move-object/from16 v0, p2

    .line 1326
    goto :goto_21

    .line 1327
    .line 1328
    :goto_22
    add-int/lit8 v4, v39, 0x1

    .line 1329
    move-object v6, v0

    .line 1330
    .line 1331
    move-object/from16 v55, v1

    .line 1332
    .line 1333
    move-object/from16 v24, v2

    .line 1334
    move-object v7, v3

    .line 1335
    move v3, v4

    .line 1336
    move-object v2, v10

    .line 1337
    move-wide v0, v12

    .line 1338
    .line 1339
    move-object/from16 v13, v18

    .line 1340
    .line 1341
    move-object/from16 v10, v59

    .line 1342
    .line 1343
    move/from16 v12, v60

    .line 1344
    .line 1345
    goto/16 :goto_12

    .line 1346
    :cond_29
    move-object v10, v2

    .line 1347
    .line 1348
    move-object/from16 v1, v55

    .line 1349
    :goto_23
    return-object v1

    .line 1350
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x669119bb -> :sswitch_2
        0x1be40 -> :sswitch_1
        0x68b6f7b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method public final M(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p4}, Landroid/text/SpannableString;->length()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p4, v1, v0, p1, p5}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 13
    move-result-object p1

    .line 14
    const/4 p2, 0x0

    .line 15
    .line 16
    const/high16 p4, 0x3f800000    # 1.0f

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2, p4}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p3}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 24
    move-result-object p1

    .line 25
    const/4 p2, 0x1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 37
    move-result-object p1

    .line 38
    return-object p1
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
.end method

.method public final N(Lcom/horcrux/svg/TextProperties$TextAnchor;D)D
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/horcrux/svg/TSpanView$a;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x2

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    const/4 v0, 0x3

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    const-wide/16 p1, 0x0

    .line 17
    return-wide p1

    .line 18
    :cond_0
    neg-double p1, p2

    .line 19
    return-wide p1

    .line 20
    :cond_1
    neg-double p1, p2

    .line 21
    .line 22
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 23
    div-double/2addr p1, v0

    .line 24
    return-wide p1
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
.end method

.method public O(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->s:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->invalidate()V

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
.end method

.method public final P()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    :goto_0
    if-eqz v0, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-class v2, Lcom/horcrux/svg/TextPathView;

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    check-cast v0, Lcom/horcrux/svg/TextPathView;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/horcrux/svg/TSpanView;->t:Lcom/horcrux/svg/TextPathView;

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    instance-of v1, v0, Lcom/horcrux/svg/TextView;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    goto :goto_1

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    return-void
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
.end method

.method public clearCache()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/horcrux/svg/TSpanView;->r:Landroid/graphics/Path;

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/horcrux/svg/TextView;->clearCache()V

    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->s:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, Lcom/horcrux/svg/TextView;->g:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-wide v0, v0, Lcom/horcrux/svg/SVGLength;->a:D

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmpl-double v0, v0, v2

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget v0, p0, Lcom/horcrux/svg/RenderableView;->fillOpacity:F

    .line 19
    mul-float/2addr v0, p3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p2, v0}, Lcom/horcrux/svg/RenderableView;->setupFillPaint(Landroid/graphics/Paint;F)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/TSpanView;->J(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 29
    .line 30
    :cond_0
    iget v0, p0, Lcom/horcrux/svg/RenderableView;->strokeOpacity:F

    .line 31
    mul-float/2addr p3, v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p2, p3}, Lcom/horcrux/svg/RenderableView;->setupStrokePaint(Landroid/graphics/Paint;F)Z

    .line 35
    move-result p3

    .line 36
    .line 37
    if-eqz p3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/TSpanView;->J(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 41
    :cond_1
    return-void

    .line 42
    .line 43
    :cond_2
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->u:Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 47
    move-result v0

    .line 48
    .line 49
    if-lez v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/horcrux/svg/GroupView;->j()Lcom/horcrux/svg/d;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/horcrux/svg/d;->b()Lcom/horcrux/svg/c;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p2, v1}, Lcom/horcrux/svg/TSpanView;->I(Landroid/graphics/Paint;Lcom/horcrux/svg/c;)V

    .line 61
    const/4 v1, 0x0

    .line 62
    .line 63
    :goto_0
    if-ge v1, v0, :cond_3

    .line 64
    .line 65
    iget-object v2, p0, Lcom/horcrux/svg/TSpanView;->u:Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    check-cast v2, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v3, p0, Lcom/horcrux/svg/TSpanView;->v:Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    move-result-object v3

    .line 78
    .line 79
    check-cast v3, Landroid/graphics/Matrix;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 86
    const/4 v3, 0x0

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v2, v3, v3, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    goto :goto_0

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/GroupView;->g(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 99
    return-void

    .line 100
    .line 101
    .line 102
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/VirtualView;->clip(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/GroupView;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 106
    return-void
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
.end method

.method public getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->r:Landroid/graphics/Path;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->s:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/TextView;->s(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->r:Landroid/graphics/Path;

    .line 16
    return-object p1

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0}, Lcom/horcrux/svg/TSpanView;->P()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/horcrux/svg/TextView;->l()V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->s:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lcom/horcrux/svg/TSpanView;->Q(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0, p2, p1}, Lcom/horcrux/svg/TSpanView;->L(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    iput-object p1, p0, Lcom/horcrux/svg/TSpanView;->r:Landroid/graphics/Path;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/horcrux/svg/GroupView;->k()V

    .line 38
    .line 39
    iget-object p1, p0, Lcom/horcrux/svg/TSpanView;->r:Landroid/graphics/Path;

    .line 40
    return-object p1
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public hitTest([F)I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->s:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Lcom/horcrux/svg/GroupView;->hitTest([F)I

    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mPath:Landroid/graphics/Path;

    .line 12
    const/4 v1, -0x1

    .line 13
    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/horcrux/svg/VirtualView;->mInvertible:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x2

    .line 21
    .line 22
    new-array v0, v0, [F

    .line 23
    .line 24
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mInvMatrix:Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 28
    .line 29
    iget-object p1, p0, Lcom/horcrux/svg/VirtualView;->mInvTransform:Landroid/graphics/Matrix;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 33
    const/4 p1, 0x0

    .line 34
    .line 35
    aget p1, v0, p1

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 39
    move-result p1

    .line 40
    const/4 v2, 0x1

    .line 41
    .line 42
    aget v0, v0, v2

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 46
    move-result v0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/horcrux/svg/RenderableView;->initBounds()V

    .line 50
    .line 51
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mRegion:Landroid/graphics/Region;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 57
    move-result v2

    .line 58
    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    :cond_2
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mStrokeRegion:Landroid/graphics/Region;

    .line 62
    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 67
    move-result v2

    .line 68
    .line 69
    if-nez v2, :cond_3

    .line 70
    goto :goto_0

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getClipPath()Landroid/graphics/Path;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mClipRegion:Landroid/graphics/Region;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 82
    move-result p1

    .line 83
    .line 84
    if-nez p1, :cond_4

    .line 85
    return v1

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 89
    move-result p1

    .line 90
    return p1

    .line 91
    :cond_5
    :goto_0
    return v1
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
.end method

.method public invalidate()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/horcrux/svg/TSpanView;->r:Landroid/graphics/Path;

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/horcrux/svg/TextView;->invalidate()V

    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public t(Landroid/graphics/Paint;)D
    .locals 5

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/horcrux/svg/TextView;->q:D

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-wide v0, p0, Lcom/horcrux/svg/TextView;->q:D

    .line 11
    return-wide v0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/TSpanView;->s:Ljava/lang/String;

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    if-nez v0, :cond_3

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    move-result v3

    .line 23
    .line 24
    if-ge v0, v3, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    instance-of v4, v3, Lcom/horcrux/svg/TextView;

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    check-cast v3, Lcom/horcrux/svg/TextView;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, p1}, Lcom/horcrux/svg/TextView;->t(Landroid/graphics/Paint;)D

    .line 38
    move-result-wide v3

    .line 39
    add-double/2addr v1, v3

    .line 40
    .line 41
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_2
    iput-wide v1, p0, Lcom/horcrux/svg/TextView;->q:D

    .line 45
    return-wide v1

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 49
    move-result v3

    .line 50
    .line 51
    if-nez v3, :cond_4

    .line 52
    .line 53
    iput-wide v1, p0, Lcom/horcrux/svg/TextView;->q:D

    .line 54
    return-wide v1

    .line 55
    .line 56
    .line 57
    :cond_4
    invoke-virtual {p0}, Lcom/horcrux/svg/GroupView;->j()Lcom/horcrux/svg/d;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/horcrux/svg/d;->b()Lcom/horcrux/svg/c;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1, v1}, Lcom/horcrux/svg/TSpanView;->I(Landroid/graphics/Paint;Lcom/horcrux/svg/c;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1, v1}, Lcom/horcrux/svg/TSpanView;->H(Landroid/graphics/Paint;Lcom/horcrux/svg/c;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 72
    move-result p1

    .line 73
    float-to-double v0, p1

    .line 74
    .line 75
    iput-wide v0, p0, Lcom/horcrux/svg/TextView;->q:D

    .line 76
    return-wide v0
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
.end method
