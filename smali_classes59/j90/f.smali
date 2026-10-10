.class public final Lj90/f;
.super Ljava/lang/Object;
.source "SVGAScaleInfo.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0003R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0010\u001a\u0004\u0008\u0017\u0010\u0012\"\u0004\u0008\u0018\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u0010\u001a\u0004\u0008\u0016\u0010\u0012\"\u0004\u0008\u001b\u0010\u0014R\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0010\u001a\u0004\u0008\u001a\u0010\u0012\"\u0004\u0008\u001d\u0010\u0014R\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0010\u001a\u0004\u0008\u001f\u0010\u0012\"\u0004\u0008 \u0010\u0014R\"\u0010\'\u001a\u00020\"8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010#\u001a\u0004\u0008\u000f\u0010$\"\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lj90/f;",
        "",
        "<init>",
        "()V",
        "",
        "canvasWidth",
        "canvasHeight",
        "videoWidth",
        "videoHeight",
        "Landroid/widget/ImageView$ScaleType;",
        "scaleType",
        "",
        "f",
        "(FFFFLandroid/widget/ImageView$ScaleType;)V",
        "g",
        "a",
        "F",
        "d",
        "()F",
        "setTranFx",
        "(F)V",
        "tranFx",
        "b",
        "e",
        "setTranFy",
        "tranFy",
        "c",
        "setScaleFx",
        "scaleFx",
        "setScaleFy",
        "scaleFy",
        "getRatio",
        "setRatio",
        "ratio",
        "",
        "Z",
        "()Z",
        "setRatioX",
        "(Z)V",
        "ratioX",
        "com.opensource.svgaplayer"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iput v0, p0, Lj90/f;->c:F

    .line 8
    .line 9
    iput v0, p0, Lj90/f;->d:F

    .line 10
    .line 11
    iput v0, p0, Lj90/f;->e:F

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lj90/f;->f:Z

    .line 3
    return v0
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
.end method

.method public final b()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lj90/f;->c:F

    .line 3
    return v0
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
.end method

.method public final c()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lj90/f;->d:F

    .line 3
    return v0
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
.end method

.method public final d()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lj90/f;->a:F

    .line 3
    return v0
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
.end method

.method public final e()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lj90/f;->b:F

    .line 3
    return v0
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
.end method

.method public final f(FFFFLandroid/widget/ImageView$ScaleType;)V
    .locals 9
    .param p5    # Landroid/widget/ImageView$ScaleType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    cmpg-float v1, p1, v0

    .line 4
    .line 5
    if-eqz v1, :cond_8

    .line 6
    .line 7
    cmpg-float v1, p2, v0

    .line 8
    .line 9
    if-eqz v1, :cond_8

    .line 10
    .line 11
    cmpg-float v1, p3, v0

    .line 12
    .line 13
    if-eqz v1, :cond_8

    .line 14
    .line 15
    cmpg-float v0, p4, v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lj90/f;->g()V

    .line 23
    .line 24
    sub-float v0, p1, p3

    .line 25
    .line 26
    const/high16 v1, 0x40000000    # 2.0f

    .line 27
    div-float/2addr v0, v1

    .line 28
    .line 29
    sub-float v2, p2, p4

    .line 30
    div-float/2addr v2, v1

    .line 31
    .line 32
    div-float v3, p3, p4

    .line 33
    .line 34
    div-float v4, p1, p2

    .line 35
    .line 36
    div-float v5, p2, p4

    .line 37
    .line 38
    div-float v6, p1, p3

    .line 39
    .line 40
    sget-object v7, Lj90/e;->$EnumSwitchMapping$0:[I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    .line 44
    move-result p5

    .line 45
    .line 46
    aget p5, v7, p5

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x1

    .line 49
    .line 50
    .line 51
    packed-switch p5, :pswitch_data_0

    .line 52
    .line 53
    iput v6, p0, Lj90/f;->e:F

    .line 54
    .line 55
    iput-boolean v8, p0, Lj90/f;->f:Z

    .line 56
    .line 57
    iput v6, p0, Lj90/f;->c:F

    .line 58
    .line 59
    iput v6, p0, Lj90/f;->d:F

    .line 60
    return-void

    .line 61
    .line 62
    .line 63
    :pswitch_0
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    .line 64
    move-result p1

    .line 65
    .line 66
    iput p1, p0, Lj90/f;->e:F

    .line 67
    .line 68
    cmpl-float p1, v6, v5

    .line 69
    .line 70
    if-lez p1, :cond_1

    .line 71
    move v7, v8

    .line 72
    .line 73
    :cond_1
    iput-boolean v7, p0, Lj90/f;->f:Z

    .line 74
    .line 75
    iput v6, p0, Lj90/f;->c:F

    .line 76
    .line 77
    iput v5, p0, Lj90/f;->d:F

    .line 78
    return-void

    .line 79
    .line 80
    :pswitch_1
    cmpl-float p5, v3, v4

    .line 81
    .line 82
    if-lez p5, :cond_2

    .line 83
    .line 84
    iput v6, p0, Lj90/f;->e:F

    .line 85
    .line 86
    iput-boolean v8, p0, Lj90/f;->f:Z

    .line 87
    .line 88
    iput v6, p0, Lj90/f;->c:F

    .line 89
    .line 90
    iput v6, p0, Lj90/f;->d:F

    .line 91
    mul-float/2addr p4, v6

    .line 92
    sub-float/2addr p2, p4

    .line 93
    .line 94
    iput p2, p0, Lj90/f;->b:F

    .line 95
    return-void

    .line 96
    .line 97
    :cond_2
    iput v5, p0, Lj90/f;->e:F

    .line 98
    .line 99
    iput-boolean v7, p0, Lj90/f;->f:Z

    .line 100
    .line 101
    iput v5, p0, Lj90/f;->c:F

    .line 102
    .line 103
    iput v5, p0, Lj90/f;->d:F

    .line 104
    mul-float/2addr p3, v5

    .line 105
    sub-float/2addr p1, p3

    .line 106
    .line 107
    iput p1, p0, Lj90/f;->a:F

    .line 108
    return-void

    .line 109
    .line 110
    :pswitch_2
    cmpl-float p1, v3, v4

    .line 111
    .line 112
    if-lez p1, :cond_3

    .line 113
    .line 114
    iput v6, p0, Lj90/f;->e:F

    .line 115
    .line 116
    iput-boolean v8, p0, Lj90/f;->f:Z

    .line 117
    .line 118
    iput v6, p0, Lj90/f;->c:F

    .line 119
    .line 120
    iput v6, p0, Lj90/f;->d:F

    .line 121
    return-void

    .line 122
    .line 123
    :cond_3
    iput v5, p0, Lj90/f;->e:F

    .line 124
    .line 125
    iput-boolean v7, p0, Lj90/f;->f:Z

    .line 126
    .line 127
    iput v5, p0, Lj90/f;->c:F

    .line 128
    .line 129
    iput v5, p0, Lj90/f;->d:F

    .line 130
    return-void

    .line 131
    .line 132
    :pswitch_3
    cmpl-float p5, v3, v4

    .line 133
    .line 134
    if-lez p5, :cond_4

    .line 135
    .line 136
    iput v6, p0, Lj90/f;->e:F

    .line 137
    .line 138
    iput-boolean v8, p0, Lj90/f;->f:Z

    .line 139
    .line 140
    iput v6, p0, Lj90/f;->c:F

    .line 141
    .line 142
    iput v6, p0, Lj90/f;->d:F

    .line 143
    mul-float/2addr p4, v6

    .line 144
    sub-float/2addr p2, p4

    .line 145
    div-float/2addr p2, v1

    .line 146
    .line 147
    iput p2, p0, Lj90/f;->b:F

    .line 148
    return-void

    .line 149
    .line 150
    :cond_4
    iput v5, p0, Lj90/f;->e:F

    .line 151
    .line 152
    iput-boolean v7, p0, Lj90/f;->f:Z

    .line 153
    .line 154
    iput v5, p0, Lj90/f;->c:F

    .line 155
    .line 156
    iput v5, p0, Lj90/f;->d:F

    .line 157
    mul-float/2addr p3, v5

    .line 158
    sub-float/2addr p1, p3

    .line 159
    div-float/2addr p1, v1

    .line 160
    .line 161
    iput p1, p0, Lj90/f;->a:F

    .line 162
    return-void

    .line 163
    .line 164
    :pswitch_4
    cmpg-float p5, p3, p1

    .line 165
    .line 166
    if-gez p5, :cond_5

    .line 167
    .line 168
    cmpg-float p5, p4, p2

    .line 169
    .line 170
    if-gez p5, :cond_5

    .line 171
    .line 172
    iput v0, p0, Lj90/f;->a:F

    .line 173
    .line 174
    iput v2, p0, Lj90/f;->b:F

    .line 175
    return-void

    .line 176
    .line 177
    :cond_5
    cmpl-float p5, v3, v4

    .line 178
    .line 179
    if-lez p5, :cond_6

    .line 180
    .line 181
    iput v6, p0, Lj90/f;->e:F

    .line 182
    .line 183
    iput-boolean v8, p0, Lj90/f;->f:Z

    .line 184
    .line 185
    iput v6, p0, Lj90/f;->c:F

    .line 186
    .line 187
    iput v6, p0, Lj90/f;->d:F

    .line 188
    mul-float/2addr p4, v6

    .line 189
    sub-float/2addr p2, p4

    .line 190
    div-float/2addr p2, v1

    .line 191
    .line 192
    iput p2, p0, Lj90/f;->b:F

    .line 193
    return-void

    .line 194
    .line 195
    :cond_6
    iput v5, p0, Lj90/f;->e:F

    .line 196
    .line 197
    iput-boolean v7, p0, Lj90/f;->f:Z

    .line 198
    .line 199
    iput v5, p0, Lj90/f;->c:F

    .line 200
    .line 201
    iput v5, p0, Lj90/f;->d:F

    .line 202
    mul-float/2addr p3, v5

    .line 203
    sub-float/2addr p1, p3

    .line 204
    div-float/2addr p1, v1

    .line 205
    .line 206
    iput p1, p0, Lj90/f;->a:F

    .line 207
    return-void

    .line 208
    .line 209
    :pswitch_5
    cmpl-float p5, v3, v4

    .line 210
    .line 211
    if-lez p5, :cond_7

    .line 212
    .line 213
    iput v5, p0, Lj90/f;->e:F

    .line 214
    .line 215
    iput-boolean v7, p0, Lj90/f;->f:Z

    .line 216
    .line 217
    iput v5, p0, Lj90/f;->c:F

    .line 218
    .line 219
    iput v5, p0, Lj90/f;->d:F

    .line 220
    mul-float/2addr p3, v5

    .line 221
    sub-float/2addr p1, p3

    .line 222
    div-float/2addr p1, v1

    .line 223
    .line 224
    iput p1, p0, Lj90/f;->a:F

    .line 225
    return-void

    .line 226
    .line 227
    :cond_7
    iput v6, p0, Lj90/f;->e:F

    .line 228
    .line 229
    iput-boolean v8, p0, Lj90/f;->f:Z

    .line 230
    .line 231
    iput v6, p0, Lj90/f;->c:F

    .line 232
    .line 233
    iput v6, p0, Lj90/f;->d:F

    .line 234
    mul-float/2addr p4, v6

    .line 235
    sub-float/2addr p2, p4

    .line 236
    div-float/2addr p2, v1

    .line 237
    .line 238
    iput p2, p0, Lj90/f;->b:F

    .line 239
    return-void

    .line 240
    .line 241
    :pswitch_6
    iput v0, p0, Lj90/f;->a:F

    .line 242
    .line 243
    iput v2, p0, Lj90/f;->b:F

    .line 244
    :cond_8
    :goto_0
    return-void

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lj90/f;->a:F

    .line 4
    .line 5
    iput v0, p0, Lj90/f;->b:F

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    iput v0, p0, Lj90/f;->c:F

    .line 10
    .line 11
    iput v0, p0, Lj90/f;->d:F

    .line 12
    .line 13
    iput v0, p0, Lj90/f;->e:F

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    iput-boolean v0, p0, Lj90/f;->f:Z

    .line 17
    return-void
.end method
