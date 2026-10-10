.class Lcom/horcrux/svg/MarkerView;
.super Lcom/horcrux/svg/GroupView;
.source "MarkerView.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public g:Lcom/horcrux/svg/SVGLength;

.field public h:Lcom/horcrux/svg/SVGLength;

.field public i:Lcom/horcrux/svg/SVGLength;

.field public j:Lcom/horcrux/svg/SVGLength;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:Ljava/lang/String;

.field public r:I

.field public s:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/horcrux/svg/GroupView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 4
    .line 5
    new-instance p1, Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/horcrux/svg/MarkerView;->s:Landroid/graphics/Matrix;

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
.end method


# virtual methods
.method public q(Landroid/graphics/Canvas;Landroid/graphics/Paint;FLcom/horcrux/svg/j;F)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mCTM:Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/horcrux/svg/VirtualView;->saveAndSetupCanvas(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/horcrux/svg/MarkerView;->s:Landroid/graphics/Matrix;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 12
    .line 13
    iget-object v1, p4, Lcom/horcrux/svg/j;->b:Lcom/horcrux/svg/h;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/horcrux/svg/MarkerView;->s:Landroid/graphics/Matrix;

    .line 16
    .line 17
    iget-wide v3, v1, Lcom/horcrux/svg/h;->a:D

    .line 18
    double-to-float v3, v3

    .line 19
    .line 20
    iget-wide v4, v1, Lcom/horcrux/svg/h;->b:D

    .line 21
    double-to-float v1, v4

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 25
    .line 26
    const-string v1, "auto"

    .line 27
    .line 28
    iget-object v2, p0, Lcom/horcrux/svg/MarkerView;->l:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    move-wide v4, v2

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    iget-object v1, p0, Lcom/horcrux/svg/MarkerView;->l:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 44
    move-result-wide v4

    .line 45
    .line 46
    :goto_0
    cmpl-double v1, v4, v2

    .line 47
    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    iget-wide v4, p4, Lcom/horcrux/svg/j;->c:D

    .line 51
    :cond_1
    double-to-float p4, v4

    .line 52
    .line 53
    const/high16 v1, 0x43340000    # 180.0f

    .line 54
    add-float/2addr p4, v1

    .line 55
    .line 56
    iget-object v1, p0, Lcom/horcrux/svg/MarkerView;->s:Landroid/graphics/Matrix;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p4}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 60
    .line 61
    const-string p4, "strokeWidth"

    .line 62
    .line 63
    iget-object v1, p0, Lcom/horcrux/svg/MarkerView;->k:Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    move-result p4

    .line 68
    .line 69
    if-eqz p4, :cond_2

    .line 70
    .line 71
    iget-object p4, p0, Lcom/horcrux/svg/MarkerView;->s:Landroid/graphics/Matrix;

    .line 72
    .line 73
    iget v1, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 74
    .line 75
    div-float v2, p5, v1

    .line 76
    div-float/2addr p5, v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p4, v2, p5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 80
    .line 81
    :cond_2
    iget-object p4, p0, Lcom/horcrux/svg/MarkerView;->i:Lcom/horcrux/svg/SVGLength;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p4}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 85
    move-result-wide p4

    .line 86
    .line 87
    iget v1, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 88
    float-to-double v1, v1

    .line 89
    div-double/2addr p4, v1

    .line 90
    .line 91
    iget-object v1, p0, Lcom/horcrux/svg/MarkerView;->j:Lcom/horcrux/svg/SVGLength;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 95
    move-result-wide v1

    .line 96
    .line 97
    iget v3, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 98
    float-to-double v3, v3

    .line 99
    div-double/2addr v1, v3

    .line 100
    .line 101
    new-instance v3, Landroid/graphics/RectF;

    .line 102
    double-to-float p4, p4

    .line 103
    double-to-float p5, v1

    .line 104
    const/4 v1, 0x0

    .line 105
    .line 106
    .line 107
    invoke-direct {v3, v1, v1, p4, p5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 108
    .line 109
    iget-object p4, p0, Lcom/horcrux/svg/MarkerView;->q:Ljava/lang/String;

    .line 110
    .line 111
    if-eqz p4, :cond_3

    .line 112
    .line 113
    new-instance p4, Landroid/graphics/RectF;

    .line 114
    .line 115
    iget p5, p0, Lcom/horcrux/svg/MarkerView;->m:F

    .line 116
    .line 117
    iget v1, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 118
    .line 119
    mul-float v2, p5, v1

    .line 120
    .line 121
    iget v4, p0, Lcom/horcrux/svg/MarkerView;->n:F

    .line 122
    .line 123
    mul-float v5, v4, v1

    .line 124
    .line 125
    iget v6, p0, Lcom/horcrux/svg/MarkerView;->o:F

    .line 126
    add-float/2addr p5, v6

    .line 127
    mul-float/2addr p5, v1

    .line 128
    .line 129
    iget v6, p0, Lcom/horcrux/svg/MarkerView;->p:F

    .line 130
    add-float/2addr v4, v6

    .line 131
    mul-float/2addr v4, v1

    .line 132
    .line 133
    .line 134
    invoke-direct {p4, v2, v5, p5, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 135
    .line 136
    iget-object p5, p0, Lcom/horcrux/svg/MarkerView;->q:Ljava/lang/String;

    .line 137
    .line 138
    iget v1, p0, Lcom/horcrux/svg/MarkerView;->r:I

    .line 139
    .line 140
    .line 141
    invoke-static {p4, v3, p5, v1}, Lcom/horcrux/svg/t;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/lang/String;I)Landroid/graphics/Matrix;

    .line 142
    move-result-object p4

    .line 143
    .line 144
    const/16 p5, 0x9

    .line 145
    .line 146
    new-array p5, p5, [F

    .line 147
    .line 148
    .line 149
    invoke-virtual {p4, p5}, Landroid/graphics/Matrix;->getValues([F)V

    .line 150
    .line 151
    iget-object p4, p0, Lcom/horcrux/svg/MarkerView;->s:Landroid/graphics/Matrix;

    .line 152
    const/4 v1, 0x0

    .line 153
    .line 154
    aget v1, p5, v1

    .line 155
    const/4 v2, 0x4

    .line 156
    .line 157
    aget p5, p5, v2

    .line 158
    .line 159
    .line 160
    invoke-virtual {p4, v1, p5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 161
    .line 162
    :cond_3
    iget-object p4, p0, Lcom/horcrux/svg/MarkerView;->g:Lcom/horcrux/svg/SVGLength;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, p4}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 166
    move-result-wide p4

    .line 167
    .line 168
    iget-object v1, p0, Lcom/horcrux/svg/MarkerView;->h:Lcom/horcrux/svg/SVGLength;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v1}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 172
    move-result-wide v1

    .line 173
    .line 174
    iget-object v3, p0, Lcom/horcrux/svg/MarkerView;->s:Landroid/graphics/Matrix;

    .line 175
    neg-double p4, p4

    .line 176
    double-to-float p4, p4

    .line 177
    neg-double v1, v1

    .line 178
    double-to-float p5, v1

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3, p4, p5}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 182
    .line 183
    iget-object p4, p0, Lcom/horcrux/svg/MarkerView;->s:Landroid/graphics/Matrix;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, p4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/GroupView;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p1, v0}, Lcom/horcrux/svg/VirtualView;->restoreCanvas(Landroid/graphics/Canvas;I)V

    .line 193
    return-void
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

.method public r(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/MarkerView;->j:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 10
    return-void
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

.method public s(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/MarkerView;->k:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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

.method public saveDefinition()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0, v1}, Lcom/horcrux/svg/SvgView;->defineMarker(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 18
    move-result v1

    .line 19
    .line 20
    if-ge v0, v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    instance-of v2, v1, Lcom/horcrux/svg/VirtualView;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    check-cast v1, Lcom/horcrux/svg/VirtualView;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/horcrux/svg/VirtualView;->saveDefinition()V

    .line 34
    .line 35
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
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

.method public setAlign(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/MarkerView;->q:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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

.method public setMeetOrSlice(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/horcrux/svg/MarkerView;->r:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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

.method public setMinX(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/horcrux/svg/MarkerView;->m:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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

.method public setMinY(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/horcrux/svg/MarkerView;->n:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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

.method public setVbHeight(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/horcrux/svg/MarkerView;->p:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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

.method public setVbWidth(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/horcrux/svg/MarkerView;->o:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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

.method public t(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/MarkerView;->i:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 10
    return-void
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

.method public u(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/MarkerView;->l:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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

.method public v(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/MarkerView;->g:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 10
    return-void
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

.method public w(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/MarkerView;->h:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 10
    return-void
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
