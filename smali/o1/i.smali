.class public Lo1/i;
.super Lo1/c;
.source "LottieValueAnimator.java"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public e:F

.field public f:Z

.field public g:J

.field public h:F

.field public i:F

.field public j:I

.field public k:F

.field public l:F

.field public m:Lcom/airbnb/lottie/h;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public n:Z
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public o:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lo1/c;-><init>()V

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iput v0, p0, Lo1/i;->e:F

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lo1/i;->f:Z

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    iput-wide v1, p0, Lo1/i;->g:J

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    iput v1, p0, Lo1/i;->h:F

    .line 18
    .line 19
    iput v1, p0, Lo1/i;->i:F

    .line 20
    .line 21
    iput v0, p0, Lo1/i;->j:I

    .line 22
    .line 23
    const/high16 v1, -0x31000000

    .line 24
    .line 25
    iput v1, p0, Lo1/i;->k:F

    .line 26
    .line 27
    const/high16 v1, 0x4f000000

    .line 28
    .line 29
    iput v1, p0, Lo1/i;->l:F

    .line 30
    .line 31
    iput-boolean v0, p0, Lo1/i;->n:Z

    .line 32
    .line 33
    iput-boolean v0, p0, Lo1/i;->o:Z

    .line 34
    return-void
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


# virtual methods
.method public A(FF)V
    .locals 2

    .line 1
    .line 2
    cmpl-float v0, p1, p2

    .line 3
    .line 4
    if-gtz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    const v0, -0x800001

    .line 12
    goto :goto_0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Lcom/airbnb/lottie/h;->p()F

    .line 16
    move-result v0

    .line 17
    .line 18
    :goto_0
    iget-object v1, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    .line 23
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 24
    goto :goto_1

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {v1}, Lcom/airbnb/lottie/h;->f()F

    .line 28
    move-result v1

    .line 29
    .line 30
    .line 31
    :goto_1
    invoke-static {p1, v0, v1}, Lo1/k;->b(FFF)F

    .line 32
    move-result p1

    .line 33
    .line 34
    .line 35
    invoke-static {p2, v0, v1}, Lo1/k;->b(FFF)F

    .line 36
    move-result p2

    .line 37
    .line 38
    iget v0, p0, Lo1/i;->k:F

    .line 39
    .line 40
    cmpl-float v0, p1, v0

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    iget v0, p0, Lo1/i;->l:F

    .line 45
    .line 46
    cmpl-float v0, p2, v0

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    return-void

    .line 51
    .line 52
    :cond_3
    :goto_2
    iput p1, p0, Lo1/i;->k:F

    .line 53
    .line 54
    iput p2, p0, Lo1/i;->l:F

    .line 55
    .line 56
    iget v0, p0, Lo1/i;->i:F

    .line 57
    .line 58
    .line 59
    invoke-static {v0, p1, p2}, Lo1/k;->b(FFF)F

    .line 60
    move-result p1

    .line 61
    float-to-int p1, p1

    .line 62
    int-to-float p1, p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lo1/i;->y(F)V

    .line 66
    return-void

    .line 67
    .line 68
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 76
    move-result-object p2

    .line 77
    .line 78
    .line 79
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    const-string p2, "minFrame (%s) must be <= maxFrame (%s)"

    .line 83
    .line 84
    .line 85
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    throw v0
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
.end method

.method public B(I)V
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    .line 3
    iget v0, p0, Lo1/i;->l:F

    .line 4
    float-to-int v0, v0

    .line 5
    int-to-float v0, v0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Lo1/i;->A(FF)V

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
.end method

.method public C(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lo1/i;->e:F

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

.method public D(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lo1/i;->o:Z

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

.method public final E()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget v0, p0, Lo1/i;->i:F

    .line 8
    .line 9
    iget v1, p0, Lo1/i;->k:F

    .line 10
    .line 11
    cmpg-float v1, v0, v1

    .line 12
    .line 13
    if-ltz v1, :cond_1

    .line 14
    .line 15
    iget v1, p0, Lo1/i;->l:F

    .line 16
    .line 17
    cmpl-float v0, v0, v1

    .line 18
    .line 19
    if-gtz v0, :cond_1

    .line 20
    :goto_0
    return-void

    .line 21
    .line 22
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    iget v1, p0, Lo1/i;->k:F

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iget v2, p0, Lo1/i;->l:F

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    iget v3, p0, Lo1/i;->i:F

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    .line 43
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    const-string v2, "Frame must be [%f,%f]. It is %f"

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    throw v0
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

.method public a()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lo1/c;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lo1/i;->p()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lo1/c;->b(Z)V

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
.end method

.method public cancel()V
    .locals 0
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo1/i;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lo1/i;->t()V

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
.end method

.method public doFrame(J)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo1/i;->s()V

    .line 4
    .line 5
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 6
    .line 7
    if-eqz v0, :cond_c

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lo1/i;->isRunning()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_5

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lcom/airbnb/lottie/d;->g()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    const-string v1, "LottieValueAnimator#doFrame"

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lcom/airbnb/lottie/d;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    :cond_1
    iget-wide v2, p0, Lo1/i;->g:J

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    cmp-long v0, v2, v4

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_2
    sub-long v4, p1, v2

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {p0}, Lo1/i;->l()F

    .line 41
    move-result v0

    .line 42
    long-to-float v2, v4

    .line 43
    div-float/2addr v2, v0

    .line 44
    .line 45
    iget v0, p0, Lo1/i;->h:F

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lo1/i;->p()Z

    .line 49
    move-result v3

    .line 50
    .line 51
    if-eqz v3, :cond_3

    .line 52
    neg-float v2, v2

    .line 53
    :cond_3
    add-float/2addr v0, v2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 57
    move-result v2

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 61
    move-result v3

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v2, v3}, Lo1/k;->d(FFF)Z

    .line 65
    move-result v2

    .line 66
    .line 67
    iget v3, p0, Lo1/i;->h:F

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 71
    move-result v4

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 75
    move-result v5

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v4, v5}, Lo1/k;->b(FFF)F

    .line 79
    move-result v0

    .line 80
    .line 81
    iput v0, p0, Lo1/i;->h:F

    .line 82
    .line 83
    iget-boolean v4, p0, Lo1/i;->o:Z

    .line 84
    .line 85
    if-eqz v4, :cond_4

    .line 86
    float-to-double v4, v0

    .line 87
    .line 88
    .line 89
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    .line 90
    move-result-wide v4

    .line 91
    double-to-float v0, v4

    .line 92
    .line 93
    :cond_4
    iput v0, p0, Lo1/i;->i:F

    .line 94
    .line 95
    iput-wide p1, p0, Lo1/i;->g:J

    .line 96
    .line 97
    iget-boolean v0, p0, Lo1/i;->o:Z

    .line 98
    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    iget v0, p0, Lo1/i;->h:F

    .line 102
    .line 103
    cmpl-float v0, v0, v3

    .line 104
    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    .line 108
    :cond_5
    invoke-virtual {p0}, Lo1/c;->g()V

    .line 109
    .line 110
    :cond_6
    if-nez v2, :cond_b

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    .line 114
    move-result v0

    .line 115
    const/4 v2, -0x1

    .line 116
    .line 117
    if-eq v0, v2, :cond_8

    .line 118
    .line 119
    iget v0, p0, Lo1/i;->j:I

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    .line 123
    move-result v2

    .line 124
    .line 125
    if-lt v0, v2, :cond_8

    .line 126
    .line 127
    iget p1, p0, Lo1/i;->e:F

    .line 128
    const/4 p2, 0x0

    .line 129
    .line 130
    cmpg-float p1, p1, p2

    .line 131
    .line 132
    if-gez p1, :cond_7

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 136
    move-result p1

    .line 137
    goto :goto_1

    .line 138
    .line 139
    .line 140
    :cond_7
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 141
    move-result p1

    .line 142
    .line 143
    :goto_1
    iput p1, p0, Lo1/i;->h:F

    .line 144
    .line 145
    iput p1, p0, Lo1/i;->i:F

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lo1/i;->t()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lo1/i;->p()Z

    .line 152
    move-result p1

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, p1}, Lo1/c;->b(Z)V

    .line 156
    goto :goto_4

    .line 157
    .line 158
    .line 159
    :cond_8
    invoke-virtual {p0}, Lo1/c;->d()V

    .line 160
    .line 161
    iget v0, p0, Lo1/i;->j:I

    .line 162
    .line 163
    add-int/lit8 v0, v0, 0x1

    .line 164
    .line 165
    iput v0, p0, Lo1/i;->j:I

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatMode()I

    .line 169
    move-result v0

    .line 170
    const/4 v2, 0x2

    .line 171
    .line 172
    if-ne v0, v2, :cond_9

    .line 173
    .line 174
    iget-boolean v0, p0, Lo1/i;->f:Z

    .line 175
    .line 176
    xor-int/lit8 v0, v0, 0x1

    .line 177
    .line 178
    iput-boolean v0, p0, Lo1/i;->f:Z

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lo1/i;->w()V

    .line 182
    goto :goto_3

    .line 183
    .line 184
    .line 185
    :cond_9
    invoke-virtual {p0}, Lo1/i;->p()Z

    .line 186
    move-result v0

    .line 187
    .line 188
    if-eqz v0, :cond_a

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 192
    move-result v0

    .line 193
    goto :goto_2

    .line 194
    .line 195
    .line 196
    :cond_a
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 197
    move-result v0

    .line 198
    .line 199
    :goto_2
    iput v0, p0, Lo1/i;->h:F

    .line 200
    .line 201
    iput v0, p0, Lo1/i;->i:F

    .line 202
    .line 203
    :goto_3
    iput-wide p1, p0, Lo1/i;->g:J

    .line 204
    .line 205
    .line 206
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lo1/i;->E()V

    .line 207
    .line 208
    .line 209
    invoke-static {}, Lcom/airbnb/lottie/d;->g()Z

    .line 210
    move-result p1

    .line 211
    .line 212
    if-eqz p1, :cond_c

    .line 213
    .line 214
    .line 215
    invoke-static {v1}, Lcom/airbnb/lottie/d;->c(Ljava/lang/String;)F

    .line 216
    :cond_c
    :goto_5
    return-void
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
.end method

.method public getAnimatedFraction()F
    .locals 3
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Lo1/i;->p()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 16
    move-result v0

    .line 17
    .line 18
    iget v1, p0, Lo1/i;->i:F

    .line 19
    sub-float/2addr v0, v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 23
    move-result v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 27
    move-result v2

    .line 28
    :goto_0
    sub-float/2addr v1, v2

    .line 29
    div-float/2addr v0, v1

    .line 30
    return v0

    .line 31
    .line 32
    :cond_1
    iget v0, p0, Lo1/i;->i:F

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 36
    move-result v1

    .line 37
    sub-float/2addr v0, v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 41
    move-result v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 45
    move-result v2

    .line 46
    goto :goto_0
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

.method public getAnimatedValue()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo1/i;->j()F

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public getDuration()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    return-wide v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/airbnb/lottie/h;->d()F

    .line 11
    move-result v0

    .line 12
    float-to-long v0, v0

    .line 13
    return-wide v0
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

.method public h()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 4
    .line 5
    const/high16 v0, -0x31000000

    .line 6
    .line 7
    iput v0, p0, Lo1/i;->k:F

    .line 8
    .line 9
    const/high16 v0, 0x4f000000

    .line 10
    .line 11
    iput v0, p0, Lo1/i;->l:F

    .line 12
    return-void
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

.method public i()V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo1/i;->t()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lo1/i;->p()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lo1/c;->b(Z)V

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
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lo1/i;->n:Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public j()F
    .locals 3
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    iget v1, p0, Lo1/i;->i:F

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/airbnb/lottie/h;->p()F

    .line 12
    move-result v0

    .line 13
    sub-float/2addr v1, v0

    .line 14
    .line 15
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/airbnb/lottie/h;->f()F

    .line 19
    move-result v0

    .line 20
    .line 21
    iget-object v2, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/airbnb/lottie/h;->p()F

    .line 25
    move-result v2

    .line 26
    sub-float/2addr v0, v2

    .line 27
    div-float/2addr v1, v0

    .line 28
    return v1
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

.method public k()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lo1/i;->i:F

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final l()F
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    return v0

    .line 9
    .line 10
    .line 11
    :cond_0
    const v1, 0x4e6e6b28    # 1.0E9f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/airbnb/lottie/h;->i()F

    .line 15
    move-result v0

    .line 16
    div-float/2addr v1, v0

    .line 17
    .line 18
    iget v0, p0, Lo1/i;->e:F

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 22
    move-result v0

    .line 23
    div-float/2addr v1, v0

    .line 24
    return v1
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
.end method

.method public m()F
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    iget v1, p0, Lo1/i;->l:F

    .line 9
    .line 10
    const/high16 v2, 0x4f000000

    .line 11
    .line 12
    cmpl-float v2, v1, v2

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/airbnb/lottie/h;->f()F

    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_1
    return v1
    .line 21
    .line 22
.end method

.method public n()F
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    iget v1, p0, Lo1/i;->k:F

    .line 9
    .line 10
    const/high16 v2, -0x31000000

    .line 11
    .line 12
    cmpl-float v2, v1, v2

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/airbnb/lottie/h;->p()F

    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_1
    return v1
    .line 21
    .line 22
.end method

.method public o()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lo1/i;->e:F

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final p()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo1/i;->o()F

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    cmpg-float v0, v0, v1

    .line 8
    .line 9
    if-gez v0, :cond_0

    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
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

.method public q()V
    .locals 0
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo1/i;->t()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lo1/c;->c()V

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
.end method

.method public r()V
    .locals 2
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lo1/i;->n:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lo1/i;->p()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lo1/c;->f(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lo1/i;->p()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 25
    move-result v0

    .line 26
    :goto_0
    float-to-int v0, v0

    .line 27
    int-to-float v0, v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lo1/i;->y(F)V

    .line 31
    .line 32
    const-wide/16 v0, 0x0

    .line 33
    .line 34
    iput-wide v0, p0, Lo1/i;->g:J

    .line 35
    const/4 v0, 0x0

    .line 36
    .line 37
    iput v0, p0, Lo1/i;->j:I

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lo1/i;->s()V

    .line 41
    return-void
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

.method public s()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo1/i;->isRunning()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lo1/i;->u(Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setRepeatMode(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    iget-boolean p1, p0, Lo1/i;->f:Z

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    const/4 p1, 0x0

    .line 12
    .line 13
    iput-boolean p1, p0, Lo1/i;->f:Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lo1/i;->w()V

    .line 17
    :cond_0
    return-void
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

.method public t()V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lo1/i;->u(Z)V

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
.end method

.method public u(Z)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    const/4 p1, 0x0

    .line 11
    .line 12
    iput-boolean p1, p0, Lo1/i;->n:Z

    .line 13
    :cond_0
    return-void
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

.method public v()V
    .locals 2
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lo1/i;->n:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lo1/i;->s()V

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    iput-wide v0, p0, Lo1/i;->g:J

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lo1/i;->p()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lo1/i;->k()F

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 24
    move-result v1

    .line 25
    .line 26
    cmpl-float v0, v0, v1

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 32
    move-result v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lo1/i;->y(F)V

    .line 36
    goto :goto_0

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Lo1/i;->p()Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lo1/i;->k()F

    .line 46
    move-result v0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 50
    move-result v1

    .line 51
    .line 52
    cmpl-float v0, v0, v1

    .line 53
    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 58
    move-result v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lo1/i;->y(F)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lo1/c;->e()V

    .line 65
    return-void
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

.method public w()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo1/i;->o()F

    .line 4
    move-result v0

    .line 5
    neg-float v0, v0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lo1/i;->C(F)V

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
.end method

.method public x(Lcom/airbnb/lottie/h;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    .line 9
    :goto_0
    iput-object p1, p0, Lo1/i;->m:Lcom/airbnb/lottie/h;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lo1/i;->k:F

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/airbnb/lottie/h;->p()F

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 21
    move-result v0

    .line 22
    .line 23
    iget v1, p0, Lo1/i;->l:F

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/airbnb/lottie/h;->f()F

    .line 27
    move-result p1

    .line 28
    .line 29
    .line 30
    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    .line 31
    move-result p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, p1}, Lo1/i;->A(FF)V

    .line 35
    goto :goto_1

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p1}, Lcom/airbnb/lottie/h;->p()F

    .line 39
    move-result v0

    .line 40
    float-to-int v0, v0

    .line 41
    int-to-float v0, v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/airbnb/lottie/h;->f()F

    .line 45
    move-result p1

    .line 46
    float-to-int p1, p1

    .line 47
    int-to-float p1, p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0, p1}, Lo1/i;->A(FF)V

    .line 51
    .line 52
    :goto_1
    iget p1, p0, Lo1/i;->i:F

    .line 53
    const/4 v0, 0x0

    .line 54
    .line 55
    iput v0, p0, Lo1/i;->i:F

    .line 56
    .line 57
    iput v0, p0, Lo1/i;->h:F

    .line 58
    float-to-int p1, p1

    .line 59
    int-to-float p1, p1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lo1/i;->y(F)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lo1/c;->g()V

    .line 66
    return-void
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
.end method

.method public y(F)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lo1/i;->h:F

    .line 3
    .line 4
    cmpl-float v0, v0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lo1/i;->n()F

    .line 11
    move-result v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lo1/i;->m()F

    .line 15
    move-result v1

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0, v1}, Lo1/k;->b(FFF)F

    .line 19
    move-result p1

    .line 20
    .line 21
    iput p1, p0, Lo1/i;->h:F

    .line 22
    .line 23
    iget-boolean v0, p0, Lo1/i;->o:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    float-to-double v0, p1

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 30
    move-result-wide v0

    .line 31
    double-to-float p1, v0

    .line 32
    .line 33
    :cond_1
    iput p1, p0, Lo1/i;->i:F

    .line 34
    .line 35
    const-wide/16 v0, 0x0

    .line 36
    .line 37
    iput-wide v0, p0, Lo1/i;->g:J

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lo1/c;->g()V

    .line 41
    return-void
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
.end method

.method public z(F)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lo1/i;->k:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lo1/i;->A(FF)V

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method
