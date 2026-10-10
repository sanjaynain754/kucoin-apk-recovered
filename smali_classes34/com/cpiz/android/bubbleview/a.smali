.class public Lcom/cpiz/android/bubbleview/a;
.super Landroid/graphics/drawable/Drawable;
.source "BubbleDrawable.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/cpiz/android/bubbleview/a$b;
    }
.end annotation


# instance fields
.field public a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

.field public b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

.field public c:Lcom/cpiz/android/bubbleview/a$b;

.field public d:Lcom/cpiz/android/bubbleview/a$b;

.field public e:Lcom/cpiz/android/bubbleview/a$b;

.field public f:Landroid/graphics/Paint;

.field public g:Landroid/graphics/Path;

.field public h:Landroid/graphics/Paint;

.field public i:Landroid/graphics/Path;

.field public j:F

.field public k:I

.field public l:I

.field public m:Landroid/graphics/PointF;

.field public n:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->None:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 8
    .line 9
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/a;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 12
    .line 13
    new-instance v0, Lcom/cpiz/android/bubbleview/a$b;

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Lcom/cpiz/android/bubbleview/a$b;-><init>(Lcom/cpiz/android/bubbleview/a;Lcom/cpiz/android/bubbleview/a$a;)V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 20
    .line 21
    new-instance v0, Lcom/cpiz/android/bubbleview/a$b;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, v1}, Lcom/cpiz/android/bubbleview/a$b;-><init>(Lcom/cpiz/android/bubbleview/a;Lcom/cpiz/android/bubbleview/a$a;)V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/a;->d:Lcom/cpiz/android/bubbleview/a$b;

    .line 27
    .line 28
    new-instance v0, Lcom/cpiz/android/bubbleview/a$b;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p0, v1}, Lcom/cpiz/android/bubbleview/a$b;-><init>(Lcom/cpiz/android/bubbleview/a;Lcom/cpiz/android/bubbleview/a$a;)V

    .line 32
    .line 33
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/a;->e:Lcom/cpiz/android/bubbleview/a$b;

    .line 34
    .line 35
    new-instance v0, Landroid/graphics/Paint;

    .line 36
    const/4 v1, 0x1

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 40
    .line 41
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/a;->f:Landroid/graphics/Paint;

    .line 42
    .line 43
    new-instance v0, Landroid/graphics/Path;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 47
    .line 48
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/a;->g:Landroid/graphics/Path;

    .line 49
    .line 50
    new-instance v0, Landroid/graphics/Paint;

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 54
    .line 55
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/a;->h:Landroid/graphics/Paint;

    .line 56
    .line 57
    new-instance v0, Landroid/graphics/Path;

    .line 58
    .line 59
    .line 60
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 61
    .line 62
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/a;->i:Landroid/graphics/Path;

    .line 63
    const/4 v0, 0x0

    .line 64
    .line 65
    iput v0, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 66
    .line 67
    const/high16 v1, -0x34000000    # -3.3554432E7f

    .line 68
    .line 69
    iput v1, p0, Lcom/cpiz/android/bubbleview/a;->k:I

    .line 70
    const/4 v1, -0x1

    .line 71
    .line 72
    iput v1, p0, Lcom/cpiz/android/bubbleview/a;->l:I

    .line 73
    .line 74
    new-instance v1, Landroid/graphics/PointF;

    .line 75
    .line 76
    .line 77
    invoke-direct {v1, v0, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 78
    .line 79
    iput-object v1, p0, Lcom/cpiz/android/bubbleview/a;->m:Landroid/graphics/PointF;

    .line 80
    .line 81
    new-instance v0, Landroid/graphics/RectF;

    .line 82
    .line 83
    .line 84
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 85
    .line 86
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/a;->n:Landroid/graphics/RectF;

    .line 87
    return-void
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
.end method

.method public static A(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;Lcom/cpiz/android/bubbleview/a$b;Lcom/cpiz/android/bubbleview/a$b;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/cpiz/android/bubbleview/a$a;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p0

    .line 7
    .line 8
    aget p0, v0, p0

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p0, v0, :cond_3

    .line 12
    const/4 v0, 0x2

    .line 13
    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    const/4 v0, 0x3

    .line 16
    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    const/4 v0, 0x4

    .line 19
    .line 20
    if-eq p0, v0, :cond_0

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    iget p0, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 24
    .line 25
    iput p0, p2, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 26
    .line 27
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 28
    .line 29
    iget p0, p0, Landroid/graphics/RectF;->bottom:F

    .line 30
    .line 31
    iget p1, p2, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 32
    add-float/2addr p0, p1

    .line 33
    .line 34
    iput p0, p2, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 35
    return-void

    .line 36
    .line 37
    :cond_1
    iget p0, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 38
    .line 39
    iput p0, p2, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 40
    .line 41
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 42
    .line 43
    iget p0, p0, Landroid/graphics/RectF;->top:F

    .line 44
    .line 45
    iget p1, p2, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 46
    sub-float/2addr p0, p1

    .line 47
    .line 48
    iput p0, p2, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 49
    return-void

    .line 50
    .line 51
    :cond_2
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 52
    .line 53
    iget p0, p0, Landroid/graphics/RectF;->right:F

    .line 54
    .line 55
    iget v0, p2, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 56
    add-float/2addr p0, v0

    .line 57
    .line 58
    iput p0, p2, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 59
    .line 60
    iget p0, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 61
    .line 62
    iput p0, p2, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 63
    return-void

    .line 64
    .line 65
    :cond_3
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 66
    .line 67
    iget p0, p0, Landroid/graphics/RectF;->left:F

    .line 68
    .line 69
    iget v0, p2, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 70
    sub-float/2addr p0, v0

    .line 71
    .line 72
    iput p0, p2, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 73
    .line 74
    iget p0, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 75
    .line 76
    iput p0, p2, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 77
    return-void
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
.end method

.method public static k(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;Landroid/graphics/PointF;Lcom/cpiz/android/bubbleview/a$b;)F
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/cpiz/android/bubbleview/a$a;->b:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p0

    .line 7
    .line 8
    aget p0, v0, p0

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p0, v0, :cond_3

    .line 12
    const/4 p1, 0x2

    .line 13
    .line 14
    if-eq p0, p1, :cond_2

    .line 15
    const/4 p1, 0x3

    .line 16
    .line 17
    if-eq p0, p1, :cond_1

    .line 18
    const/4 p1, 0x4

    .line 19
    .line 20
    if-eq p0, p1, :cond_0

    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    .line 24
    :cond_0
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 25
    .line 26
    iget p0, p0, Landroid/graphics/RectF;->bottom:F

    .line 27
    .line 28
    iget p1, p2, Lcom/cpiz/android/bubbleview/a$b;->e:F

    .line 29
    sub-float/2addr p0, p1

    .line 30
    return p0

    .line 31
    .line 32
    :cond_1
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 33
    .line 34
    iget p0, p0, Landroid/graphics/RectF;->top:F

    .line 35
    .line 36
    iget p1, p2, Lcom/cpiz/android/bubbleview/a$b;->e:F

    .line 37
    add-float/2addr p0, p1

    .line 38
    return p0

    .line 39
    .line 40
    :cond_2
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/graphics/RectF;->centerY()F

    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    .line 47
    :cond_3
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/graphics/RectF;->centerY()F

    .line 51
    move-result p0

    .line 52
    .line 53
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 54
    add-float/2addr p0, p1

    .line 55
    return p0
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
.end method

.method public static l(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;Landroid/graphics/PointF;Lcom/cpiz/android/bubbleview/a$b;)F
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/cpiz/android/bubbleview/a$a;->b:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p0

    .line 7
    .line 8
    aget p0, v0, p0

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p0, v0, :cond_3

    .line 12
    const/4 p1, 0x2

    .line 13
    .line 14
    if-eq p0, p1, :cond_2

    .line 15
    const/4 p1, 0x3

    .line 16
    .line 17
    if-eq p0, p1, :cond_1

    .line 18
    const/4 p1, 0x4

    .line 19
    .line 20
    if-eq p0, p1, :cond_0

    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    .line 24
    :cond_0
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 25
    .line 26
    iget p0, p0, Landroid/graphics/RectF;->right:F

    .line 27
    .line 28
    iget p1, p2, Lcom/cpiz/android/bubbleview/a$b;->e:F

    .line 29
    sub-float/2addr p0, p1

    .line 30
    return p0

    .line 31
    .line 32
    :cond_1
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 33
    .line 34
    iget p0, p0, Landroid/graphics/RectF;->left:F

    .line 35
    .line 36
    iget p1, p2, Lcom/cpiz/android/bubbleview/a$b;->e:F

    .line 37
    add-float/2addr p0, p1

    .line 38
    return p0

    .line 39
    .line 40
    :cond_2
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/graphics/RectF;->centerX()F

    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    .line 47
    :cond_3
    iget-object p0, p2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/graphics/RectF;->centerX()F

    .line 51
    move-result p0

    .line 52
    .line 53
    iget p1, p1, Landroid/graphics/PointF;->x:F

    .line 54
    add-float/2addr p0, p1

    .line 55
    return p0
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
.end method


# virtual methods
.method public final B()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->e:Lcom/cpiz/android/bubbleview/a$b;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->d:Lcom/cpiz/android/bubbleview/a$b;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/cpiz/android/bubbleview/a$b;->a(Lcom/cpiz/android/bubbleview/a$b;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->e:Lcom/cpiz/android/bubbleview/a$b;

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    iput v1, v0, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 13
    .line 14
    iget-object v0, v0, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 17
    .line 18
    iget-object v3, v2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 19
    .line 20
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 21
    .line 22
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 23
    add-float/2addr v3, v2

    .line 24
    .line 25
    iget v2, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 26
    add-float/2addr v3, v2

    .line 27
    .line 28
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->isLeft()Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 37
    .line 38
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v2, v1

    .line 41
    :goto_0
    add-float/2addr v3, v2

    .line 42
    .line 43
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 44
    .line 45
    iget-object v4, v2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 46
    .line 47
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 48
    .line 49
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 50
    add-float/2addr v4, v2

    .line 51
    .line 52
    iget v2, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 53
    add-float/2addr v4, v2

    .line 54
    .line 55
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->isUp()Z

    .line 59
    move-result v2

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 64
    .line 65
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v2, v1

    .line 68
    :goto_1
    add-float/2addr v4, v2

    .line 69
    .line 70
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 71
    .line 72
    iget-object v5, v2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 73
    .line 74
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 75
    .line 76
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 77
    sub-float/2addr v5, v2

    .line 78
    .line 79
    iget v2, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 80
    sub-float/2addr v5, v2

    .line 81
    .line 82
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->isRight()Z

    .line 86
    move-result v2

    .line 87
    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 91
    .line 92
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    move v2, v1

    .line 95
    :goto_2
    sub-float/2addr v5, v2

    .line 96
    .line 97
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 98
    .line 99
    iget-object v6, v2, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 100
    .line 101
    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    .line 102
    .line 103
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 104
    sub-float/2addr v6, v2

    .line 105
    .line 106
    iget v2, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 107
    sub-float/2addr v6, v2

    .line 108
    .line 109
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->isDown()Z

    .line 113
    move-result v2

    .line 114
    .line 115
    if-eqz v2, :cond_3

    .line 116
    .line 117
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 118
    .line 119
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 120
    goto :goto_3

    .line 121
    :cond_3
    move v2, v1

    .line 122
    :goto_3
    sub-float/2addr v6, v2

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 126
    .line 127
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->e:Lcom/cpiz/android/bubbleview/a$b;

    .line 128
    .line 129
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 130
    .line 131
    iget v3, v2, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 132
    .line 133
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 134
    .line 135
    const/high16 v4, 0x40000000    # 2.0f

    .line 136
    div-float/2addr v2, v4

    .line 137
    sub-float/2addr v3, v2

    .line 138
    .line 139
    iget v2, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 140
    sub-float/2addr v3, v2

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    .line 144
    move-result v2

    .line 145
    .line 146
    iput v2, v0, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 147
    .line 148
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->e:Lcom/cpiz/android/bubbleview/a$b;

    .line 149
    .line 150
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 151
    .line 152
    iget v3, v2, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 153
    .line 154
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 155
    div-float/2addr v2, v4

    .line 156
    sub-float/2addr v3, v2

    .line 157
    .line 158
    iget v2, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 159
    sub-float/2addr v3, v2

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    .line 163
    move-result v2

    .line 164
    .line 165
    iput v2, v0, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 166
    .line 167
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->e:Lcom/cpiz/android/bubbleview/a$b;

    .line 168
    .line 169
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 170
    .line 171
    iget v3, v2, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 172
    .line 173
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 174
    div-float/2addr v2, v4

    .line 175
    sub-float/2addr v3, v2

    .line 176
    .line 177
    iget v2, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 178
    sub-float/2addr v3, v2

    .line 179
    .line 180
    .line 181
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    .line 182
    move-result v2

    .line 183
    .line 184
    iput v2, v0, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 185
    .line 186
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->e:Lcom/cpiz/android/bubbleview/a$b;

    .line 187
    .line 188
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 189
    .line 190
    iget v3, v2, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 191
    .line 192
    iget v2, v2, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 193
    div-float/2addr v2, v4

    .line 194
    sub-float/2addr v3, v2

    .line 195
    .line 196
    iget v2, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 197
    sub-float/2addr v3, v2

    .line 198
    .line 199
    .line 200
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    .line 201
    move-result v1

    .line 202
    .line 203
    iput v1, v0, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 204
    .line 205
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 206
    .line 207
    iget v1, v0, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 208
    float-to-double v2, v1

    .line 209
    .line 210
    iget v5, v0, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 211
    div-float/2addr v5, v4

    .line 212
    .line 213
    iget v6, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 214
    add-float/2addr v5, v6

    .line 215
    mul-float/2addr v5, v4

    .line 216
    float-to-double v5, v5

    .line 217
    .line 218
    iget v0, v0, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 219
    div-float/2addr v1, v4

    .line 220
    div-float/2addr v0, v1

    .line 221
    float-to-double v0, v0

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    .line 225
    move-result-wide v0

    .line 226
    .line 227
    .line 228
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 229
    move-result-wide v0

    .line 230
    div-double/2addr v5, v0

    .line 231
    sub-double/2addr v2, v5

    .line 232
    .line 233
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 234
    .line 235
    iget v1, v0, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 236
    float-to-double v5, v1

    .line 237
    mul-double/2addr v2, v5

    .line 238
    .line 239
    iget v1, v0, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 240
    float-to-double v5, v1

    .line 241
    div-double/2addr v2, v5

    .line 242
    .line 243
    iget-object v5, p0, Lcom/cpiz/android/bubbleview/a;->e:Lcom/cpiz/android/bubbleview/a$b;

    .line 244
    .line 245
    iget v6, v0, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 246
    div-float/2addr v6, v4

    .line 247
    float-to-double v6, v6

    .line 248
    add-double/2addr v2, v6

    .line 249
    .line 250
    iget v4, p0, Lcom/cpiz/android/bubbleview/a;->j:F

    .line 251
    float-to-double v6, v4

    .line 252
    add-double/2addr v2, v6

    .line 253
    double-to-float v2, v2

    .line 254
    .line 255
    iput v2, v5, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 256
    mul-float/2addr v2, v1

    .line 257
    .line 258
    iget v0, v0, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 259
    div-float/2addr v2, v0

    .line 260
    .line 261
    iput v2, v5, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 262
    .line 263
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 264
    .line 265
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->d:Lcom/cpiz/android/bubbleview/a$b;

    .line 266
    .line 267
    .line 268
    invoke-static {v0, v1, v5}, Lcom/cpiz/android/bubbleview/a;->A(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;Lcom/cpiz/android/bubbleview/a$b;Lcom/cpiz/android/bubbleview/a$b;)V

    .line 269
    .line 270
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->e:Lcom/cpiz/android/bubbleview/a$b;

    .line 271
    .line 272
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->i:Landroid/graphics/Path;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0, v0, v1}, Lcom/cpiz/android/bubbleview/a;->C(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 276
    return-void
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
.end method

.method public final C(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    sget-object v0, Lcom/cpiz/android/bubbleview/a$a;->a:[I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    move-result v1

    .line 12
    .line 13
    aget v0, v0, v1

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    if-eq v0, v1, :cond_3

    .line 17
    const/4 v1, 0x2

    .line 18
    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    const/4 v1, 0x3

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    const/4 v1, 0x4

    .line 24
    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->g(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 29
    return-void

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->e(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 33
    return-void

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->i(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 37
    return-void

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->h(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 41
    return-void

    .line 42
    .line 43
    .line 44
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->f(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

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
.end method

.method public D()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/cpiz/android/bubbleview/a;->z()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/cpiz/android/bubbleview/a;->B()V

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
    .line 17
    .line 18
.end method

.method public final a(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 5
    .line 6
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 7
    .line 8
    iget p1, p1, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 9
    .line 10
    const/high16 v0, 0x40000000    # 2.0f

    .line 11
    .line 12
    mul-float v1, p1, v0

    .line 13
    .line 14
    sub-float v4, v6, v1

    .line 15
    mul-float/2addr p1, v0

    .line 16
    .line 17
    add-float v5, v3, p1

    .line 18
    .line 19
    const/high16 v7, 0x42b40000    # 90.0f

    .line 20
    .line 21
    const/high16 v8, 0x42b40000    # 90.0f

    .line 22
    move-object v1, p0

    .line 23
    move-object v2, p2

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {v1 .. v8}, Lcom/cpiz/android/bubbleview/a;->j(Landroid/graphics/Path;FFFFFF)V

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
.end method

.method public final b(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 5
    .line 6
    iget p1, p1, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 7
    .line 8
    const/high16 v1, 0x40000000    # 2.0f

    .line 9
    .line 10
    mul-float v2, p1, v1

    .line 11
    .line 12
    sub-float v3, v5, v2

    .line 13
    .line 14
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 15
    mul-float/2addr p1, v1

    .line 16
    .line 17
    sub-float v4, v6, p1

    .line 18
    const/4 v7, 0x0

    .line 19
    .line 20
    const/high16 v8, 0x42b40000    # 90.0f

    .line 21
    move-object v1, p0

    .line 22
    move-object v2, p2

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {v1 .. v8}, Lcom/cpiz/android/bubbleview/a;->j(Landroid/graphics/Path;FFFFFF)V

    .line 26
    return-void
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

.method public final c(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 5
    .line 6
    iget v4, v0, Landroid/graphics/RectF;->top:F

    .line 7
    .line 8
    iget p1, p1, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 9
    .line 10
    const/high16 v0, 0x40000000    # 2.0f

    .line 11
    .line 12
    mul-float v1, p1, v0

    .line 13
    .line 14
    add-float v5, v3, v1

    .line 15
    mul-float/2addr p1, v0

    .line 16
    .line 17
    add-float v6, v4, p1

    .line 18
    .line 19
    const/high16 v7, 0x43340000    # 180.0f

    .line 20
    .line 21
    const/high16 v8, 0x42b40000    # 90.0f

    .line 22
    move-object v1, p0

    .line 23
    move-object v2, p2

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {v1 .. v8}, Lcom/cpiz/android/bubbleview/a;->j(Landroid/graphics/Path;FFFFFF)V

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
.end method

.method public final d(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 5
    .line 6
    iget p1, p1, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 7
    .line 8
    const/high16 v1, 0x40000000    # 2.0f

    .line 9
    .line 10
    mul-float v2, p1, v1

    .line 11
    .line 12
    sub-float v3, v5, v2

    .line 13
    .line 14
    iget v4, v0, Landroid/graphics/RectF;->top:F

    .line 15
    mul-float/2addr p1, v1

    .line 16
    .line 17
    add-float v6, v4, p1

    .line 18
    .line 19
    const/high16 v7, 0x43870000    # 270.0f

    .line 20
    .line 21
    const/high16 v8, 0x42b40000    # 90.0f

    .line 22
    move-object v1, p0

    .line 23
    move-object v2, p2

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {v1 .. v8}, Lcom/cpiz/android/bubbleview/a;->j(Landroid/graphics/Path;FFFFFF)V

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
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->h:Landroid/graphics/Paint;

    .line 3
    .line 4
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->h:Landroid/graphics/Paint;

    .line 10
    .line 11
    iget v1, p0, Lcom/cpiz/android/bubbleview/a;->k:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->i:Landroid/graphics/Path;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->h:Landroid/graphics/Paint;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->d:Lcom/cpiz/android/bubbleview/a$b;

    .line 24
    .line 25
    iget v0, v0, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    cmpl-float v0, v0, v1

    .line 29
    .line 30
    if-lez v0, :cond_0

    .line 31
    .line 32
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->f:Landroid/graphics/Paint;

    .line 33
    .line 34
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 38
    .line 39
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->f:Landroid/graphics/Paint;

    .line 40
    .line 41
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 45
    .line 46
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->f:Landroid/graphics/Paint;

    .line 47
    .line 48
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 52
    .line 53
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->f:Landroid/graphics/Paint;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->d:Lcom/cpiz/android/bubbleview/a$b;

    .line 56
    .line 57
    iget v1, v1, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 61
    .line 62
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->f:Landroid/graphics/Paint;

    .line 63
    .line 64
    iget v1, p0, Lcom/cpiz/android/bubbleview/a;->l:I

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    .line 69
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->g:Landroid/graphics/Path;

    .line 70
    .line 71
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->f:Landroid/graphics/Paint;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 75
    :cond_0
    return-void
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
.end method

.method public final e(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 5
    .line 6
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 10
    .line 11
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 12
    .line 13
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 14
    .line 15
    const/high16 v3, 0x40000000    # 2.0f

    .line 16
    div-float/2addr v2, v3

    .line 17
    sub-float/2addr v1, v2

    .line 18
    .line 19
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 23
    .line 24
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 25
    .line 26
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 27
    add-float/2addr v1, v2

    .line 28
    .line 29
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->a(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 36
    .line 37
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 38
    .line 39
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 40
    .line 41
    iget v4, p1, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 42
    add-float/2addr v2, v4

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->c(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 49
    .line 50
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 53
    sub-float/2addr v1, v2

    .line 54
    .line 55
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->d(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 62
    .line 63
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 64
    .line 65
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 66
    .line 67
    iget v4, p1, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 68
    sub-float/2addr v2, v4

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->b(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 75
    .line 76
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 77
    .line 78
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 79
    div-float/2addr v2, v3

    .line 80
    add-float/2addr v1, v2

    .line 81
    .line 82
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 86
    .line 87
    iget v0, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 88
    .line 89
    iget p1, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v0, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 93
    return-void
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
.end method

.method public final f(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 5
    .line 6
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 10
    .line 11
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 12
    .line 13
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 14
    .line 15
    iget v3, p1, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 16
    .line 17
    const/high16 v4, 0x40000000    # 2.0f

    .line 18
    div-float/2addr v3, v4

    .line 19
    sub-float/2addr v2, v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 23
    .line 24
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 25
    .line 26
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 27
    .line 28
    iget v3, p1, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 29
    add-float/2addr v2, v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->c(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 36
    .line 37
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 38
    .line 39
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 40
    sub-float/2addr v1, v2

    .line 41
    .line 42
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->d(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 49
    .line 50
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 53
    .line 54
    iget v3, p1, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 55
    sub-float/2addr v2, v3

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->b(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 62
    .line 63
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 64
    .line 65
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 66
    add-float/2addr v1, v2

    .line 67
    .line 68
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->a(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 75
    .line 76
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 77
    .line 78
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 79
    .line 80
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 81
    div-float/2addr v2, v4

    .line 82
    add-float/2addr v1, v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 86
    .line 87
    iget v0, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 88
    .line 89
    iget p1, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v0, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 93
    return-void
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
.end method

.method public final g(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V
    .locals 11

    .line 1
    .line 2
    iget-object v0, p1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 5
    .line 6
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 7
    .line 8
    iget v3, p1, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 9
    add-float/2addr v2, v3

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 13
    .line 14
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 15
    .line 16
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 17
    .line 18
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 19
    .line 20
    const/high16 v2, 0x40000000    # 2.0f

    .line 21
    .line 22
    mul-float v3, v1, v2

    .line 23
    .line 24
    add-float v7, v5, v3

    .line 25
    mul-float/2addr v1, v2

    .line 26
    .line 27
    add-float v8, v6, v1

    .line 28
    .line 29
    const/high16 v9, 0x43340000    # 180.0f

    .line 30
    .line 31
    const/high16 v10, 0x42b40000    # 90.0f

    .line 32
    move-object v3, p0

    .line 33
    move-object v4, p2

    .line 34
    .line 35
    .line 36
    invoke-virtual/range {v3 .. v10}, Lcom/cpiz/android/bubbleview/a;->j(Landroid/graphics/Path;FFFFFF)V

    .line 37
    .line 38
    iget p2, v0, Landroid/graphics/RectF;->right:F

    .line 39
    .line 40
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 41
    sub-float/2addr p2, v1

    .line 42
    .line 43
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1, v4}, Lcom/cpiz/android/bubbleview/a;->d(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 50
    .line 51
    iget p2, v0, Landroid/graphics/RectF;->right:F

    .line 52
    .line 53
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 54
    .line 55
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 56
    sub-float/2addr v1, v2

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, v4}, Lcom/cpiz/android/bubbleview/a;->b(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 63
    .line 64
    iget p2, v0, Landroid/graphics/RectF;->left:F

    .line 65
    .line 66
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 67
    add-float/2addr p2, v1

    .line 68
    .line 69
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1, v4}, Lcom/cpiz/android/bubbleview/a;->a(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 76
    .line 77
    iget p2, v0, Landroid/graphics/RectF;->left:F

    .line 78
    .line 79
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 80
    .line 81
    iget p1, p1, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 82
    add-float/2addr v0, p1

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, p2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 86
    return-void
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
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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
.end method

.method public final h(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 5
    .line 6
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 10
    .line 11
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 12
    .line 13
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 14
    .line 15
    iget v3, p1, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 16
    .line 17
    const/high16 v4, 0x40000000    # 2.0f

    .line 18
    div-float/2addr v3, v4

    .line 19
    add-float/2addr v2, v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 23
    .line 24
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 25
    .line 26
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 27
    .line 28
    iget v3, p1, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 29
    sub-float/2addr v2, v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->b(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 36
    .line 37
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 38
    .line 39
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 40
    add-float/2addr v1, v2

    .line 41
    .line 42
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->a(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 49
    .line 50
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 51
    .line 52
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 53
    .line 54
    iget v3, p1, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 55
    add-float/2addr v2, v3

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->c(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 62
    .line 63
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 64
    .line 65
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 66
    sub-float/2addr v1, v2

    .line 67
    .line 68
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->d(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 75
    .line 76
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 77
    .line 78
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 79
    .line 80
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 81
    div-float/2addr v2, v4

    .line 82
    sub-float/2addr v1, v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 86
    .line 87
    iget v0, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 88
    .line 89
    iget p1, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v0, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 93
    return-void
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
.end method

.method public final i(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 5
    .line 6
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 10
    .line 11
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 12
    .line 13
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 14
    .line 15
    const/high16 v3, 0x40000000    # 2.0f

    .line 16
    div-float/2addr v2, v3

    .line 17
    add-float/2addr v1, v2

    .line 18
    .line 19
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 23
    .line 24
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 25
    .line 26
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 27
    sub-float/2addr v1, v2

    .line 28
    .line 29
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->d(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 36
    .line 37
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 38
    .line 39
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 40
    .line 41
    iget v4, p1, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 42
    sub-float/2addr v2, v4

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->b(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 49
    .line 50
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 51
    .line 52
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 53
    add-float/2addr v1, v2

    .line 54
    .line 55
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->a(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 62
    .line 63
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 64
    .line 65
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 66
    .line 67
    iget v4, p1, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 68
    add-float/2addr v2, v4

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, p2}, Lcom/cpiz/android/bubbleview/a;->c(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 75
    .line 76
    iget v1, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 77
    .line 78
    iget v2, p1, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 79
    div-float/2addr v2, v3

    .line 80
    sub-float/2addr v1, v2

    .line 81
    .line 82
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 86
    .line 87
    iget v0, p1, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 88
    .line 89
    iget p1, p1, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v0, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 93
    return-void
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
.end method

.method public final j(Landroid/graphics/Path;FFFFFF)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->n:Landroid/graphics/RectF;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 6
    .line 7
    iget-object p2, p0, Lcom/cpiz/android/bubbleview/a;->n:Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2, p6, p7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 11
    return-void
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
.end method

.method public m(II)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 5
    int-to-float p1, p1

    .line 6
    int-to-float p2, p2

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 11
    return-void
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

.method public n(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

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
.end method

.method public o(F)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 3
    .line 4
    iput p1, v0, Lcom/cpiz/android/bubbleview/a$b;->c:F

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
.end method

.method public p(F)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 3
    .line 4
    iput p1, v0, Lcom/cpiz/android/bubbleview/a$b;->e:F

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
.end method

.method public q(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/cpiz/android/bubbleview/a;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

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
.end method

.method public r(FF)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->m:Landroid/graphics/PointF;

    .line 3
    .line 4
    iput p1, v0, Landroid/graphics/PointF;->x:F

    .line 5
    .line 6
    iput p2, v0, Landroid/graphics/PointF;->y:F

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

.method public s(F)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 3
    .line 4
    iput p1, v0, Lcom/cpiz/android/bubbleview/a$b;->d:F

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
.end method

.method public setAlpha(I)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public t(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/a;->l:I

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
.end method

.method public u(F)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 3
    .line 4
    iput p1, v0, Lcom/cpiz/android/bubbleview/a$b;->b:F

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
.end method

.method public v(FFFF)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 3
    .line 4
    iput p1, v0, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 5
    .line 6
    iput p2, v0, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 7
    .line 8
    iput p3, v0, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 9
    .line 10
    iput p4, v0, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 11
    return-void
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
.end method

.method public w(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/a;->k:I

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
.end method

.method public x(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/a;->j:F

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
.end method

.method public final y(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;Landroid/graphics/PointF;Lcom/cpiz/android/bubbleview/a$b;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/cpiz/android/bubbleview/a$a;->a:[I

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
    const/4 v0, 0x1

    .line 10
    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    if-eq p1, v0, :cond_3

    .line 14
    const/4 v0, 0x2

    .line 15
    .line 16
    if-eq p1, v0, :cond_2

    .line 17
    const/4 v0, 0x3

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    const/4 v0, 0x4

    .line 21
    .line 22
    if-eq p1, v0, :cond_0

    .line 23
    return-void

    .line 24
    .line 25
    :cond_0
    iget-object p1, p4, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 26
    .line 27
    iget p1, p1, Landroid/graphics/RectF;->left:F

    .line 28
    .line 29
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 30
    add-float/2addr p1, v0

    .line 31
    .line 32
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 33
    div-float/2addr v0, v1

    .line 34
    add-float/2addr p1, v0

    .line 35
    .line 36
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 37
    div-float/2addr v0, v1

    .line 38
    add-float/2addr p1, v0

    .line 39
    .line 40
    .line 41
    invoke-static {p2, p3, p4}, Lcom/cpiz/android/bubbleview/a;->l(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;Landroid/graphics/PointF;Lcom/cpiz/android/bubbleview/a$b;)F

    .line 42
    move-result p2

    .line 43
    .line 44
    iget-object p3, p4, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 45
    .line 46
    iget p3, p3, Landroid/graphics/RectF;->right:F

    .line 47
    .line 48
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 49
    sub-float/2addr p3, v0

    .line 50
    .line 51
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 52
    div-float/2addr v0, v1

    .line 53
    sub-float/2addr p3, v0

    .line 54
    .line 55
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 56
    div-float/2addr v0, v1

    .line 57
    sub-float/2addr p3, v0

    .line 58
    .line 59
    .line 60
    invoke-static {p1, p2, p3}, Lx2/b;->a(FFF)F

    .line 61
    move-result p1

    .line 62
    .line 63
    iput p1, p4, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 64
    .line 65
    iget-object p1, p4, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 66
    .line 67
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 68
    .line 69
    iget p2, p4, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 70
    add-float/2addr p1, p2

    .line 71
    .line 72
    iput p1, p4, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 73
    return-void

    .line 74
    .line 75
    :cond_1
    iget-object p1, p4, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 76
    .line 77
    iget p1, p1, Landroid/graphics/RectF;->left:F

    .line 78
    .line 79
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 80
    add-float/2addr p1, v0

    .line 81
    .line 82
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 83
    div-float/2addr v0, v1

    .line 84
    add-float/2addr p1, v0

    .line 85
    .line 86
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 87
    div-float/2addr v0, v1

    .line 88
    add-float/2addr p1, v0

    .line 89
    .line 90
    .line 91
    invoke-static {p2, p3, p4}, Lcom/cpiz/android/bubbleview/a;->l(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;Landroid/graphics/PointF;Lcom/cpiz/android/bubbleview/a$b;)F

    .line 92
    move-result p2

    .line 93
    .line 94
    iget-object p3, p4, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 95
    .line 96
    iget p3, p3, Landroid/graphics/RectF;->right:F

    .line 97
    .line 98
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 99
    sub-float/2addr p3, v0

    .line 100
    .line 101
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 102
    div-float/2addr v0, v1

    .line 103
    sub-float/2addr p3, v0

    .line 104
    .line 105
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 106
    div-float/2addr v0, v1

    .line 107
    sub-float/2addr p3, v0

    .line 108
    .line 109
    .line 110
    invoke-static {p1, p2, p3}, Lx2/b;->a(FFF)F

    .line 111
    move-result p1

    .line 112
    .line 113
    iput p1, p4, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 114
    .line 115
    iget-object p1, p4, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 116
    .line 117
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 118
    .line 119
    iget p2, p4, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 120
    sub-float/2addr p1, p2

    .line 121
    .line 122
    iput p1, p4, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 123
    return-void

    .line 124
    .line 125
    :cond_2
    iget-object p1, p4, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 126
    .line 127
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 128
    .line 129
    iget v2, p4, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 130
    add-float/2addr v0, v2

    .line 131
    .line 132
    iput v0, p4, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 133
    .line 134
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 135
    .line 136
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->i:F

    .line 137
    add-float/2addr p1, v0

    .line 138
    .line 139
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 140
    div-float/2addr v0, v1

    .line 141
    add-float/2addr p1, v0

    .line 142
    .line 143
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 144
    div-float/2addr v0, v1

    .line 145
    add-float/2addr p1, v0

    .line 146
    .line 147
    .line 148
    invoke-static {p2, p3, p4}, Lcom/cpiz/android/bubbleview/a;->k(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;Landroid/graphics/PointF;Lcom/cpiz/android/bubbleview/a$b;)F

    .line 149
    move-result p2

    .line 150
    .line 151
    iget-object p3, p4, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 152
    .line 153
    iget p3, p3, Landroid/graphics/RectF;->bottom:F

    .line 154
    .line 155
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->k:F

    .line 156
    sub-float/2addr p3, v0

    .line 157
    .line 158
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 159
    div-float/2addr v0, v1

    .line 160
    sub-float/2addr p3, v0

    .line 161
    .line 162
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 163
    div-float/2addr v0, v1

    .line 164
    sub-float/2addr p3, v0

    .line 165
    .line 166
    .line 167
    invoke-static {p1, p2, p3}, Lx2/b;->a(FFF)F

    .line 168
    move-result p1

    .line 169
    .line 170
    iput p1, p4, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 171
    return-void

    .line 172
    .line 173
    :cond_3
    iget-object p1, p4, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 174
    .line 175
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 176
    .line 177
    iget v2, p4, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 178
    sub-float/2addr v0, v2

    .line 179
    .line 180
    iput v0, p4, Lcom/cpiz/android/bubbleview/a$b;->f:F

    .line 181
    .line 182
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 183
    .line 184
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->h:F

    .line 185
    add-float/2addr p1, v0

    .line 186
    .line 187
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 188
    div-float/2addr v0, v1

    .line 189
    add-float/2addr p1, v0

    .line 190
    .line 191
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 192
    div-float/2addr v0, v1

    .line 193
    add-float/2addr p1, v0

    .line 194
    .line 195
    .line 196
    invoke-static {p2, p3, p4}, Lcom/cpiz/android/bubbleview/a;->k(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;Landroid/graphics/PointF;Lcom/cpiz/android/bubbleview/a$b;)F

    .line 197
    move-result p2

    .line 198
    .line 199
    iget-object p3, p4, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 200
    .line 201
    iget p3, p3, Landroid/graphics/RectF;->bottom:F

    .line 202
    .line 203
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->j:F

    .line 204
    sub-float/2addr p3, v0

    .line 205
    .line 206
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->d:F

    .line 207
    div-float/2addr v0, v1

    .line 208
    sub-float/2addr p3, v0

    .line 209
    .line 210
    iget v0, p4, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 211
    div-float/2addr v0, v1

    .line 212
    sub-float/2addr p3, v0

    .line 213
    .line 214
    .line 215
    invoke-static {p1, p2, p3}, Lx2/b;->a(FFF)F

    .line 216
    move-result p1

    .line 217
    .line 218
    iput p1, p4, Lcom/cpiz/android/bubbleview/a$b;->g:F

    .line 219
    return-void
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
.end method

.method public final z()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->d:Lcom/cpiz/android/bubbleview/a$b;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/cpiz/android/bubbleview/a$b;->a(Lcom/cpiz/android/bubbleview/a$b;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->d:Lcom/cpiz/android/bubbleview/a$b;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 14
    .line 15
    iget-object v2, v1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 16
    .line 17
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 18
    .line 19
    iget v1, v1, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 20
    .line 21
    const/high16 v3, 0x40000000    # 2.0f

    .line 22
    div-float/2addr v1, v3

    .line 23
    add-float/2addr v2, v1

    .line 24
    .line 25
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->isLeft()Z

    .line 29
    move-result v1

    .line 30
    const/4 v4, 0x0

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 35
    .line 36
    iget v1, v1, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v1, v4

    .line 39
    :goto_0
    add-float/2addr v2, v1

    .line 40
    .line 41
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 42
    .line 43
    iget-object v5, v1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 44
    .line 45
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 46
    .line 47
    iget v1, v1, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 48
    div-float/2addr v1, v3

    .line 49
    add-float/2addr v5, v1

    .line 50
    .line 51
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->isUp()Z

    .line 55
    move-result v1

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 60
    .line 61
    iget v1, v1, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move v1, v4

    .line 64
    :goto_1
    add-float/2addr v5, v1

    .line 65
    .line 66
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 67
    .line 68
    iget-object v6, v1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 69
    .line 70
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 71
    .line 72
    iget v1, v1, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 73
    div-float/2addr v1, v3

    .line 74
    sub-float/2addr v6, v1

    .line 75
    .line 76
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->isRight()Z

    .line 80
    move-result v1

    .line 81
    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 85
    .line 86
    iget v1, v1, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    move v1, v4

    .line 89
    :goto_2
    sub-float/2addr v6, v1

    .line 90
    .line 91
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 92
    .line 93
    iget-object v7, v1, Lcom/cpiz/android/bubbleview/a$b;->a:Landroid/graphics/RectF;

    .line 94
    .line 95
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 96
    .line 97
    iget v1, v1, Lcom/cpiz/android/bubbleview/a$b;->b:F

    .line 98
    div-float/2addr v1, v3

    .line 99
    sub-float/2addr v7, v1

    .line 100
    .line 101
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->isDown()Z

    .line 105
    move-result v1

    .line 106
    .line 107
    if-eqz v1, :cond_3

    .line 108
    .line 109
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->c:Lcom/cpiz/android/bubbleview/a$b;

    .line 110
    .line 111
    iget v4, v1, Lcom/cpiz/android/bubbleview/a$b;->c:F

    .line 112
    :cond_3
    sub-float/2addr v7, v4

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v2, v5, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 116
    .line 117
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->a:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 118
    .line 119
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->b:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 120
    .line 121
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/a;->m:Landroid/graphics/PointF;

    .line 122
    .line 123
    iget-object v3, p0, Lcom/cpiz/android/bubbleview/a;->d:Lcom/cpiz/android/bubbleview/a$b;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/cpiz/android/bubbleview/a;->y(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;Landroid/graphics/PointF;Lcom/cpiz/android/bubbleview/a$b;)V

    .line 127
    .line 128
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/a;->d:Lcom/cpiz/android/bubbleview/a$b;

    .line 129
    .line 130
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/a;->g:Landroid/graphics/Path;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v0, v1}, Lcom/cpiz/android/bubbleview/a;->C(Lcom/cpiz/android/bubbleview/a$b;Landroid/graphics/Path;)V

    .line 134
    return-void
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
.end method
