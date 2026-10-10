.class public Lcom/blankj/utilcode/util/SpanUtils$e;
.super Ljava/lang/Object;
.source "SpanUtils.java"

# interfaces
.implements Landroid/text/style/LineHeightSpan;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/SpanUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# static fields
.field public static d:Landroid/graphics/Paint$FontMetricsInt;


# instance fields
.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils$e;->b:I

    .line 6
    .line 7
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils$e;->c:I

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
.end method


# virtual methods
.method public chooseHeight(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V
    .locals 6

    .line 1
    .line 2
    sget-object p2, Lcom/blankj/utilcode/util/SpanUtils$e;->d:Landroid/graphics/Paint$FontMetricsInt;

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    new-instance p2, Landroid/graphics/Paint$FontMetricsInt;

    .line 7
    .line 8
    .line 9
    invoke-direct {p2}, Landroid/graphics/Paint$FontMetricsInt;-><init>()V

    .line 10
    .line 11
    sput-object p2, Lcom/blankj/utilcode/util/SpanUtils$e;->d:Landroid/graphics/Paint$FontMetricsInt;

    .line 12
    .line 13
    iget v0, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 14
    .line 15
    iput v0, p2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 16
    .line 17
    iget v0, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 18
    .line 19
    iput v0, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 20
    .line 21
    iget v0, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 22
    .line 23
    iput v0, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 24
    .line 25
    iget v0, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 26
    .line 27
    iput v0, p2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 28
    .line 29
    iget v0, p6, Landroid/graphics/Paint$FontMetricsInt;->leading:I

    .line 30
    .line 31
    iput v0, p2, Landroid/graphics/Paint$FontMetricsInt;->leading:I

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_0
    iget v0, p2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 35
    .line 36
    iput v0, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 37
    .line 38
    iget v0, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 39
    .line 40
    iput v0, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 41
    .line 42
    iget v0, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 43
    .line 44
    iput v0, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 45
    .line 46
    iget v0, p2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 47
    .line 48
    iput v0, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 49
    .line 50
    iget p2, p2, Landroid/graphics/Paint$FontMetricsInt;->leading:I

    .line 51
    .line 52
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->leading:I

    .line 53
    .line 54
    :goto_0
    iget p2, p0, Lcom/blankj/utilcode/util/SpanUtils$e;->b:I

    .line 55
    .line 56
    iget v0, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 57
    .line 58
    add-int v1, p5, v0

    .line 59
    .line 60
    iget v2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 61
    sub-int/2addr v1, v2

    .line 62
    sub-int/2addr v1, p4

    .line 63
    .line 64
    sub-int v1, p2, v1

    .line 65
    const/4 v3, 0x3

    .line 66
    const/4 v4, 0x2

    .line 67
    .line 68
    if-lez v1, :cond_3

    .line 69
    .line 70
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils$e;->c:I

    .line 71
    .line 72
    if-ne v5, v3, :cond_1

    .line 73
    add-int/2addr v0, v1

    .line 74
    .line 75
    iput v0, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 76
    goto :goto_1

    .line 77
    .line 78
    :cond_1
    if-ne v5, v4, :cond_2

    .line 79
    div-int/2addr v1, v4

    .line 80
    add-int/2addr v0, v1

    .line 81
    .line 82
    iput v0, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 83
    sub-int/2addr v2, v1

    .line 84
    .line 85
    iput v2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    sub-int/2addr v2, v1

    .line 88
    .line 89
    iput v2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 90
    .line 91
    :cond_3
    :goto_1
    iget v0, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 92
    add-int/2addr p5, v0

    .line 93
    .line 94
    iget v1, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 95
    sub-int/2addr p5, v1

    .line 96
    sub-int/2addr p5, p4

    .line 97
    sub-int/2addr p2, p5

    .line 98
    .line 99
    if-lez p2, :cond_6

    .line 100
    .line 101
    iget p4, p0, Lcom/blankj/utilcode/util/SpanUtils$e;->c:I

    .line 102
    .line 103
    if-ne p4, v3, :cond_4

    .line 104
    add-int/2addr v0, p2

    .line 105
    .line 106
    iput v0, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 107
    goto :goto_2

    .line 108
    .line 109
    :cond_4
    if-ne p4, v4, :cond_5

    .line 110
    div-int/2addr p2, v4

    .line 111
    add-int/2addr v0, p2

    .line 112
    .line 113
    iput v0, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 114
    sub-int/2addr v1, p2

    .line 115
    .line 116
    iput v1, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    sub-int/2addr v1, p2

    .line 119
    .line 120
    iput v1, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 121
    .line 122
    :cond_6
    :goto_2
    check-cast p1, Landroid/text/Spanned;

    .line 123
    .line 124
    .line 125
    invoke-interface {p1, p0}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 126
    move-result p1

    .line 127
    .line 128
    if-ne p3, p1, :cond_7

    .line 129
    const/4 p1, 0x0

    .line 130
    .line 131
    sput-object p1, Lcom/blankj/utilcode/util/SpanUtils$e;->d:Landroid/graphics/Paint$FontMetricsInt;

    .line 132
    :cond_7
    return-void
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
.end method
