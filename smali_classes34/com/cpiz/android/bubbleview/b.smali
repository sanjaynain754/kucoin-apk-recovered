.class public Lcom/cpiz/android/bubbleview/b;
.super Ljava/lang/Object;
.source "BubbleImpl.java"

# interfaces
.implements Lcom/cpiz/android/bubbleview/BubbleStyle;


# instance fields
.field public A:Landroid/graphics/Rect;

.field public B:Landroid/graphics/Rect;

.field public b:Landroid/view/View;

.field public c:Lx2/a;

.field public d:Lcom/cpiz/android/bubbleview/a;

.field public e:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

.field public f:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

.field public g:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

.field public h:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public i:I

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:F

.field public x:F

.field public y:Landroid/view/View$OnLayoutChangeListener;

.field public z:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/cpiz/android/bubbleview/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/cpiz/android/bubbleview/a;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 11
    .line 12
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Auto:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->e:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 15
    .line 16
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->None:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->f:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 19
    .line 20
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->g:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 23
    const/4 v0, 0x0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->h:Ljava/lang/ref/WeakReference;

    .line 26
    const/4 v0, 0x0

    .line 27
    .line 28
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->i:I

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    iput v1, p0, Lcom/cpiz/android/bubbleview/b;->j:F

    .line 32
    .line 33
    iput v1, p0, Lcom/cpiz/android/bubbleview/b;->k:F

    .line 34
    .line 35
    iput v1, p0, Lcom/cpiz/android/bubbleview/b;->l:F

    .line 36
    .line 37
    iput v1, p0, Lcom/cpiz/android/bubbleview/b;->m:F

    .line 38
    .line 39
    iput v1, p0, Lcom/cpiz/android/bubbleview/b;->n:F

    .line 40
    .line 41
    iput v1, p0, Lcom/cpiz/android/bubbleview/b;->o:F

    .line 42
    .line 43
    iput v1, p0, Lcom/cpiz/android/bubbleview/b;->p:F

    .line 44
    .line 45
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->q:I

    .line 46
    .line 47
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->r:I

    .line 48
    .line 49
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->s:I

    .line 50
    .line 51
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->t:I

    .line 52
    .line 53
    const/high16 v0, -0x34000000    # -3.3554432E7f

    .line 54
    .line 55
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->u:I

    .line 56
    const/4 v0, -0x1

    .line 57
    .line 58
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->v:I

    .line 59
    .line 60
    iput v1, p0, Lcom/cpiz/android/bubbleview/b;->w:F

    .line 61
    .line 62
    iput v1, p0, Lcom/cpiz/android/bubbleview/b;->x:F

    .line 63
    .line 64
    new-instance v0, Lcom/cpiz/android/bubbleview/b$a;

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, p0}, Lcom/cpiz/android/bubbleview/b$a;-><init>(Lcom/cpiz/android/bubbleview/b;)V

    .line 68
    .line 69
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->y:Landroid/view/View$OnLayoutChangeListener;

    .line 70
    const/4 v0, 0x2

    .line 71
    .line 72
    new-array v0, v0, [I

    .line 73
    .line 74
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->z:[I

    .line 75
    .line 76
    new-instance v0, Landroid/graphics/Rect;

    .line 77
    .line 78
    .line 79
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 80
    .line 81
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->A:Landroid/graphics/Rect;

    .line 82
    .line 83
    new-instance v0, Landroid/graphics/Rect;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 87
    .line 88
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->B:Landroid/graphics/Rect;

    .line 89
    return-void
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

.method public static synthetic a(Lcom/cpiz/android/bubbleview/b;)Lx2/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 3
    return-object p0
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

.method public static g(Landroid/graphics/Rect;Landroid/graphics/Rect;)Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;
    .locals 4

    .line 1
    .line 2
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 3
    .line 4
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 5
    .line 6
    iget v2, p1, Landroid/graphics/Rect;->right:I

    .line 7
    .line 8
    iget v3, p1, Landroid/graphics/Rect;->bottom:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/graphics/Rect;->intersects(IIII)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    new-instance v0, Landroid/graphics/Point;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerX()I

    .line 20
    move-result v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    .line 24
    move-result v2

    .line 25
    sub-int/2addr v1, v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerY()I

    .line 29
    move-result v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    .line 33
    move-result v3

    .line 34
    sub-int/2addr v2, v3

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 38
    .line 39
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 43
    move-result v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 47
    move-result v2

    .line 48
    .line 49
    div-int/lit8 v2, v2, 0x2

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 53
    move-result v3

    .line 54
    .line 55
    div-int/lit8 v3, v3, 0x2

    .line 56
    add-int/2addr v2, v3

    .line 57
    .line 58
    if-ge v1, v2, :cond_1

    .line 59
    .line 60
    iget p0, v0, Landroid/graphics/Point;->y:I

    .line 61
    .line 62
    if-gez p0, :cond_0

    .line 63
    .line 64
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Down:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 65
    return-object p0

    .line 66
    .line 67
    :cond_0
    if-lez p0, :cond_3

    .line 68
    .line 69
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Up:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 70
    return-object p0

    .line 71
    .line 72
    :cond_1
    iget v1, v0, Landroid/graphics/Point;->y:I

    .line 73
    .line 74
    .line 75
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 76
    move-result v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 80
    move-result p0

    .line 81
    .line 82
    div-int/lit8 p0, p0, 0x2

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 86
    move-result p1

    .line 87
    .line 88
    div-int/lit8 p1, p1, 0x2

    .line 89
    add-int/2addr p0, p1

    .line 90
    .line 91
    if-ge v1, p0, :cond_3

    .line 92
    .line 93
    iget p0, v0, Landroid/graphics/Point;->x:I

    .line 94
    .line 95
    if-gez p0, :cond_2

    .line 96
    .line 97
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Right:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 98
    return-object p0

    .line 99
    .line 100
    :cond_2
    if-lez p0, :cond_3

    .line 101
    .line 102
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Left:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 103
    return-object p0

    .line 104
    .line 105
    :cond_3
    sget-object p0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->None:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 106
    return-object p0
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


# virtual methods
.method public A(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/b;->w:F

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

.method public B(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p1, p1, p1}, Lcom/cpiz/android/bubbleview/b;->C(FFFF)V

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
    .line 23
.end method

.method public C(FFFF)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/b;->m:F

    .line 3
    .line 4
    iput p2, p0, Lcom/cpiz/android/bubbleview/b;->n:F

    .line 5
    .line 6
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->p:F

    .line 7
    .line 8
    iput p4, p0, Lcom/cpiz/android/bubbleview/b;->o:F

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

.method public D(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/b;->u:I

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

.method public E(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/b;->x:F

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

.method public F(IIII)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    .line 9
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->t:I

    .line 10
    .line 11
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->s:I

    .line 12
    .line 13
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->r:I

    .line 14
    .line 15
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->q:I

    .line 16
    .line 17
    sget-object v0, Lcom/cpiz/android/bubbleview/b$c;->a:[I

    .line 18
    .line 19
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/b;->f:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 23
    move-result v1

    .line 24
    .line 25
    aget v0, v0, v1

    .line 26
    const/4 v1, 0x1

    .line 27
    .line 28
    if-eq v0, v1, :cond_4

    .line 29
    const/4 v1, 0x2

    .line 30
    .line 31
    if-eq v0, v1, :cond_3

    .line 32
    const/4 v1, 0x3

    .line 33
    .line 34
    if-eq v0, v1, :cond_2

    .line 35
    const/4 v1, 0x4

    .line 36
    .line 37
    if-eq v0, v1, :cond_1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_1
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->t:I

    .line 41
    int-to-float v0, v0

    .line 42
    .line 43
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->j:F

    .line 44
    add-float/2addr v0, v1

    .line 45
    float-to-int v0, v0

    .line 46
    .line 47
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->t:I

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->s:I

    .line 51
    int-to-float v0, v0

    .line 52
    .line 53
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->j:F

    .line 54
    add-float/2addr v0, v1

    .line 55
    float-to-int v0, v0

    .line 56
    .line 57
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->s:I

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :cond_3
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->r:I

    .line 61
    int-to-float v0, v0

    .line 62
    .line 63
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->j:F

    .line 64
    add-float/2addr v0, v1

    .line 65
    float-to-int v0, v0

    .line 66
    .line 67
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->r:I

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_4
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->q:I

    .line 71
    int-to-float v0, v0

    .line 72
    .line 73
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->j:F

    .line 74
    add-float/2addr v0, v1

    .line 75
    float-to-int v0, v0

    .line 76
    .line 77
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->q:I

    .line 78
    .line 79
    :goto_0
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->q:I

    .line 80
    .line 81
    add-int v3, p1, v0

    .line 82
    .line 83
    iget p1, p0, Lcom/cpiz/android/bubbleview/b;->r:I

    .line 84
    .line 85
    add-int v4, p2, p1

    .line 86
    .line 87
    iget p1, p0, Lcom/cpiz/android/bubbleview/b;->s:I

    .line 88
    .line 89
    add-int v5, p3, p1

    .line 90
    .line 91
    iget p1, p0, Lcom/cpiz/android/bubbleview/b;->t:I

    .line 92
    .line 93
    add-int v6, p4, p1

    .line 94
    .line 95
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 96
    .line 97
    .line 98
    invoke-interface {p1}, Lx2/a;->getSuperPaddingLeft()I

    .line 99
    move-result p1

    .line 100
    .line 101
    if-ne v3, p1, :cond_6

    .line 102
    .line 103
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 104
    .line 105
    .line 106
    invoke-interface {p1}, Lx2/a;->getSuperPaddingTop()I

    .line 107
    move-result p1

    .line 108
    .line 109
    if-ne v4, p1, :cond_6

    .line 110
    .line 111
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 112
    .line 113
    .line 114
    invoke-interface {p1}, Lx2/a;->getSuperPaddingRight()I

    .line 115
    move-result p1

    .line 116
    .line 117
    if-ne v5, p1, :cond_6

    .line 118
    .line 119
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 120
    .line 121
    .line 122
    invoke-interface {p1}, Lx2/a;->getSuperPaddingBottom()I

    .line 123
    move-result p1

    .line 124
    .line 125
    if-eq v6, p1, :cond_5

    .line 126
    goto :goto_2

    .line 127
    :cond_5
    :goto_1
    return-void

    .line 128
    .line 129
    :cond_6
    :goto_2
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 130
    .line 131
    new-instance v1, Lcom/cpiz/android/bubbleview/b$b;

    .line 132
    move-object v2, p0

    .line 133
    .line 134
    .line 135
    invoke-direct/range {v1 .. v6}, Lcom/cpiz/android/bubbleview/b$b;-><init>(Lcom/cpiz/android/bubbleview/b;IIII)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 139
    return-void
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

.method public G(IIZ)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/cpiz/android/bubbleview/b;->e()Landroid/view/View;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->i:I

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lcom/cpiz/android/bubbleview/b;->b(I)Landroid/view/View;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/cpiz/android/bubbleview/b;->x(Landroid/view/View;)V

    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/b;->e:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 20
    .line 21
    iput-object v1, p0, Lcom/cpiz/android/bubbleview/b;->f:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/b;->z:[I

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 30
    .line 31
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/b;->A:Landroid/graphics/Rect;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/cpiz/android/bubbleview/b;->z:[I

    .line 34
    .line 35
    aget v4, v3, v1

    .line 36
    const/4 v5, 0x1

    .line 37
    .line 38
    aget v3, v3, v5

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 42
    move-result v6

    .line 43
    add-int/2addr v6, v4

    .line 44
    .line 45
    iget-object v7, p0, Lcom/cpiz/android/bubbleview/b;->z:[I

    .line 46
    .line 47
    aget v7, v7, v5

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 51
    move-result v0

    .line 52
    add-int/2addr v7, v0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v4, v3, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    .line 56
    .line 57
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 58
    .line 59
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/b;->z:[I

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 63
    .line 64
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->B:Landroid/graphics/Rect;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/b;->z:[I

    .line 67
    .line 68
    aget v1, v2, v1

    .line 69
    .line 70
    aget v2, v2, v5

    .line 71
    .line 72
    add-int v3, v1, p1

    .line 73
    .line 74
    add-int v4, v2, p2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 78
    .line 79
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->f:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 80
    .line 81
    sget-object v1, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Auto:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 82
    .line 83
    if-ne v0, v1, :cond_1

    .line 84
    .line 85
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->B:Landroid/graphics/Rect;

    .line 86
    .line 87
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/b;->A:Landroid/graphics/Rect;

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v1}, Lcom/cpiz/android/bubbleview/b;->g(Landroid/graphics/Rect;Landroid/graphics/Rect;)Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->f:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 94
    .line 95
    :cond_1
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->A:Landroid/graphics/Rect;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    .line 99
    move-result v0

    .line 100
    .line 101
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/b;->B:Landroid/graphics/Rect;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    .line 105
    move-result v1

    .line 106
    .line 107
    sub-int v1, v0, v1

    .line 108
    .line 109
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->A:Landroid/graphics/Rect;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    .line 113
    move-result v0

    .line 114
    .line 115
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/b;->B:Landroid/graphics/Rect;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Landroid/graphics/Rect;->centerY()I

    .line 119
    move-result v2

    .line 120
    sub-int/2addr v0, v2

    .line 121
    goto :goto_0

    .line 122
    :cond_2
    move v0, v1

    .line 123
    .line 124
    :goto_0
    iget-object v2, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 128
    move-result v2

    .line 129
    .line 130
    iget-object v3, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 134
    move-result v3

    .line 135
    .line 136
    iget-object v4, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Landroid/view/View;->getPaddingRight()I

    .line 140
    move-result v4

    .line 141
    .line 142
    iget-object v5, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 146
    move-result v5

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/cpiz/android/bubbleview/b;->F(IIII)V

    .line 150
    .line 151
    if-eqz p3, :cond_3

    .line 152
    .line 153
    iget-object p3, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p3, p1, p2}, Lcom/cpiz/android/bubbleview/a;->m(II)V

    .line 157
    .line 158
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 159
    .line 160
    iget p2, p0, Lcom/cpiz/android/bubbleview/b;->m:F

    .line 161
    .line 162
    iget p3, p0, Lcom/cpiz/android/bubbleview/b;->n:F

    .line 163
    .line 164
    iget v2, p0, Lcom/cpiz/android/bubbleview/b;->p:F

    .line 165
    .line 166
    iget v3, p0, Lcom/cpiz/android/bubbleview/b;->o:F

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, p2, p3, v2, v3}, Lcom/cpiz/android/bubbleview/a;->v(FFFF)V

    .line 170
    .line 171
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 172
    .line 173
    iget p2, p0, Lcom/cpiz/android/bubbleview/b;->u:I

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, p2}, Lcom/cpiz/android/bubbleview/a;->w(I)V

    .line 177
    .line 178
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 179
    .line 180
    iget p2, p0, Lcom/cpiz/android/bubbleview/b;->w:F

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p2}, Lcom/cpiz/android/bubbleview/a;->u(F)V

    .line 184
    .line 185
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 186
    .line 187
    iget p2, p0, Lcom/cpiz/android/bubbleview/b;->x:F

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, p2}, Lcom/cpiz/android/bubbleview/a;->x(F)V

    .line 191
    .line 192
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 193
    .line 194
    iget p2, p0, Lcom/cpiz/android/bubbleview/b;->v:I

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, p2}, Lcom/cpiz/android/bubbleview/a;->t(I)V

    .line 198
    .line 199
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 200
    .line 201
    iget-object p2, p0, Lcom/cpiz/android/bubbleview/b;->f:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, p2}, Lcom/cpiz/android/bubbleview/a;->n(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;)V

    .line 205
    .line 206
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 207
    .line 208
    iget-object p2, p0, Lcom/cpiz/android/bubbleview/b;->g:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, p2}, Lcom/cpiz/android/bubbleview/a;->q(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;)V

    .line 212
    .line 213
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 214
    int-to-float p2, v1

    .line 215
    int-to-float p3, v0

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, p2, p3}, Lcom/cpiz/android/bubbleview/a;->r(FF)V

    .line 219
    .line 220
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 221
    .line 222
    iget p2, p0, Lcom/cpiz/android/bubbleview/b;->l:F

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, p2}, Lcom/cpiz/android/bubbleview/a;->p(F)V

    .line 226
    .line 227
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 228
    .line 229
    iget p2, p0, Lcom/cpiz/android/bubbleview/b;->j:F

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p2}, Lcom/cpiz/android/bubbleview/a;->o(F)V

    .line 233
    .line 234
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 235
    .line 236
    iget p2, p0, Lcom/cpiz/android/bubbleview/b;->k:F

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, p2}, Lcom/cpiz/android/bubbleview/a;->s(F)V

    .line 240
    .line 241
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1}, Lcom/cpiz/android/bubbleview/a;->D()V

    .line 245
    .line 246
    iget-object p1, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 247
    .line 248
    iget-object p2, p0, Lcom/cpiz/android/bubbleview/b;->d:Lcom/cpiz/android/bubbleview/a;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 252
    :cond_3
    return-void
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
.end method

.method public final b(I)Landroid/view/View;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    :cond_0
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 7
    .line 8
    .line 9
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    instance-of v2, v2, Landroid/view/View;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Landroid/view/View;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    return-object v2

    .line 28
    :cond_2
    return-object v0
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
.end method

.method public c()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->l:F

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
    .line 18
.end method

.method public d()Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->g:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 3
    return-object v0
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

.method public e()Landroid/view/View;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->h:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Landroid/view/View;

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public f()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->k:F

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
    .line 18
.end method

.method public getArrowDirection()Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->e:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 3
    return-object v0
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

.method public getArrowHeight()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->j:F

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
    .line 18
.end method

.method public h()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->v:I

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
    .line 18
.end method

.method public i()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->w:F

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
    .line 18
.end method

.method public j()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->o:F

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
    .line 18
.end method

.method public k()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->p:F

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
    .line 18
.end method

.method public l()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->m:F

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
    .line 18
.end method

.method public m()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->n:F

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
    .line 18
.end method

.method public n()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->u:I

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
    .line 18
.end method

.method public o()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/b;->x:F

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
    .line 18
.end method

.method public p()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lx2/a;->getSuperPaddingBottom()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->t:I

    .line 9
    sub-int/2addr v0, v1

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public q()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lx2/a;->getSuperPaddingLeft()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->q:I

    .line 9
    sub-int/2addr v0, v1

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public r()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lx2/a;->getSuperPaddingRight()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->s:I

    .line 9
    sub-int/2addr v0, v1

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public s()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lx2/a;->getSuperPaddingTop()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->r:I

    .line 9
    sub-int/2addr v0, v1

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public setArrowDirection(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/cpiz/android/bubbleview/b;->e:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

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

.method public setArrowPosDelta(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/b;->l:F

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

.method public setArrowPosPolicy(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/cpiz/android/bubbleview/b;->g:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

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

.method public setArrowTo(Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 6
    move-result v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    :goto_0
    iput v0, p0, Lcom/cpiz/android/bubbleview/b;->i:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/cpiz/android/bubbleview/b;->x(Landroid/view/View;)V

    .line 14
    return-void
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

.method public t(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 3
    .line 4
    check-cast p1, Lx2/a;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/cpiz/android/bubbleview/b;->c:Lx2/a;

    .line 7
    const/4 p1, 0x0

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle:[I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_arrowDirection:I

    .line 18
    .line 19
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Auto:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->getValue()I

    .line 23
    move-result v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 27
    move-result p3

    .line 28
    .line 29
    .line 30
    invoke-static {p3}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->valueOf(I)Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 31
    move-result-object p3

    .line 32
    .line 33
    iput-object p3, p0, Lcom/cpiz/android/bubbleview/b;->e:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 34
    .line 35
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_arrowHeight:I

    .line 36
    const/4 v0, 0x6

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lx2/b;->b(I)I

    .line 40
    move-result v0

    .line 41
    int-to-float v0, v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 45
    move-result p3

    .line 46
    .line 47
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->j:F

    .line 48
    .line 49
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_arrowWidth:I

    .line 50
    .line 51
    const/16 v0, 0xa

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lx2/b;->b(I)I

    .line 55
    move-result v0

    .line 56
    int-to-float v0, v0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 60
    move-result p3

    .line 61
    .line 62
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->k:F

    .line 63
    .line 64
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_arrowPosPolicy:I

    .line 65
    .line 66
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->TargetCenter:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->getValue()I

    .line 70
    move-result v0

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 74
    move-result p3

    .line 75
    .line 76
    .line 77
    invoke-static {p3}, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;->valueOf(I)Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 78
    move-result-object p3

    .line 79
    .line 80
    iput-object p3, p0, Lcom/cpiz/android/bubbleview/b;->g:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowPosPolicy;

    .line 81
    .line 82
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_arrowPosDelta:I

    .line 83
    const/4 v0, 0x0

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 87
    move-result p3

    .line 88
    .line 89
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->l:F

    .line 90
    .line 91
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_arrowTo:I

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 95
    move-result p3

    .line 96
    .line 97
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->i:I

    .line 98
    .line 99
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_cornerRadius:I

    .line 100
    const/4 v1, 0x4

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, Lx2/b;->b(I)I

    .line 104
    move-result v1

    .line 105
    int-to-float v1, v1

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 109
    move-result p3

    .line 110
    .line 111
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->p:F

    .line 112
    .line 113
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->o:F

    .line 114
    .line 115
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->n:F

    .line 116
    .line 117
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->m:F

    .line 118
    .line 119
    sget v1, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_cornerTopLeftRadius:I

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, v1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 123
    move-result p3

    .line 124
    .line 125
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->m:F

    .line 126
    .line 127
    sget v1, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_cornerTopRightRadius:I

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 131
    move-result p3

    .line 132
    .line 133
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->n:F

    .line 134
    .line 135
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_cornerBottomLeftRadius:I

    .line 136
    .line 137
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->m:F

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 141
    move-result p3

    .line 142
    .line 143
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->o:F

    .line 144
    .line 145
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_cornerBottomRightRadius:I

    .line 146
    .line 147
    iget v1, p0, Lcom/cpiz/android/bubbleview/b;->m:F

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 151
    move-result p3

    .line 152
    .line 153
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->p:F

    .line 154
    .line 155
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_fillColor:I

    .line 156
    .line 157
    const/high16 v1, -0x34000000    # -3.3554432E7f

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 161
    move-result p3

    .line 162
    .line 163
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->u:I

    .line 164
    .line 165
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_fillPadding:I

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 169
    move-result p3

    .line 170
    .line 171
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->x:F

    .line 172
    .line 173
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_borderColor:I

    .line 174
    const/4 v1, -0x1

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 178
    move-result p3

    .line 179
    .line 180
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->v:I

    .line 181
    .line 182
    sget p3, Lcom/cpiz/android/bubbleview/R$styleable;->BubbleStyle_bb_borderWidth:I

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 186
    move-result p3

    .line 187
    .line 188
    iput p3, p0, Lcom/cpiz/android/bubbleview/b;->w:F

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 192
    .line 193
    :cond_0
    iget-object p2, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 197
    move-result p2

    .line 198
    .line 199
    iget-object p3, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    .line 203
    move-result p3

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, p2, p3, p1}, Lcom/cpiz/android/bubbleview/b;->G(IIZ)V

    .line 207
    return-void
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
.end method

.method public u()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/b;->b:Landroid/view/View;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v1, v2}, Lcom/cpiz/android/bubbleview/b;->G(IIZ)V

    .line 17
    return-void
    .line 18
.end method

.method public v(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/b;->j:F

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

.method public w(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/b;->i:I

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/cpiz/android/bubbleview/b;->x(Landroid/view/View;)V

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
.end method

.method public final x(Landroid/view/View;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->h:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Landroid/view/View;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/cpiz/android/bubbleview/b;->y:Landroid/view/View$OnLayoutChangeListener;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 18
    .line 19
    :cond_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    .line 28
    :goto_0
    iput-object v0, p0, Lcom/cpiz/android/bubbleview/b;->h:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lcom/cpiz/android/bubbleview/b;->y:Landroid/view/View$OnLayoutChangeListener;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 36
    :cond_2
    return-void
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
.end method

.method public y(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/b;->k:F

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

.method public z(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/cpiz/android/bubbleview/b;->v:I

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
