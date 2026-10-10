.class public final Lw2/a;
.super Ljava/util/TimerTask;
.source "InertiaTimerTask.java"


# instance fields
.field public b:F

.field public final c:F

.field public final d:Lcom/contrarywind/view/WheelView;


# direct methods
.method public constructor <init>(Lcom/contrarywind/view/WheelView;F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 6
    .line 7
    iput p2, p0, Lw2/a;->c:F

    .line 8
    .line 9
    const/high16 p1, 0x4f000000

    .line 10
    .line 11
    iput p1, p0, Lw2/a;->b:F

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
.method public final run()V
    .locals 12

    .line 1
    .line 2
    iget v0, p0, Lw2/a;->b:F

    .line 3
    .line 4
    const/high16 v1, 0x4f000000

    .line 5
    .line 6
    cmpl-float v0, v0, v1

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget v0, p0, Lw2/a;->c:F

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 15
    move-result v0

    .line 16
    .line 17
    const/high16 v2, 0x44fa0000    # 2000.0f

    .line 18
    .line 19
    cmpl-float v0, v0, v2

    .line 20
    .line 21
    if-lez v0, :cond_1

    .line 22
    .line 23
    iget v0, p0, Lw2/a;->c:F

    .line 24
    .line 25
    cmpl-float v0, v0, v1

    .line 26
    .line 27
    if-lez v0, :cond_0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    const/high16 v2, -0x3b060000    # -2000.0f

    .line 31
    .line 32
    :goto_0
    iput v2, p0, Lw2/a;->b:F

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_1
    iget v0, p0, Lw2/a;->c:F

    .line 36
    .line 37
    iput v0, p0, Lw2/a;->b:F

    .line 38
    .line 39
    :cond_2
    :goto_1
    iget v0, p0, Lw2/a;->b:F

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 43
    move-result v0

    .line 44
    .line 45
    cmpl-float v0, v0, v1

    .line 46
    .line 47
    const/high16 v2, 0x41a00000    # 20.0f

    .line 48
    .line 49
    if-ltz v0, :cond_3

    .line 50
    .line 51
    iget v0, p0, Lw2/a;->b:F

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 55
    move-result v0

    .line 56
    .line 57
    cmpg-float v0, v0, v2

    .line 58
    .line 59
    if-gtz v0, :cond_3

    .line 60
    .line 61
    iget-object v0, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/contrarywind/view/WheelView;->b()V

    .line 65
    .line 66
    iget-object v0, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/contrarywind/view/WheelView;->getHandler()Landroid/os/Handler;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    const/16 v1, 0x7d0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 76
    return-void

    .line 77
    .line 78
    :cond_3
    iget v0, p0, Lw2/a;->b:F

    .line 79
    .line 80
    const/high16 v3, 0x42c80000    # 100.0f

    .line 81
    div-float/2addr v0, v3

    .line 82
    float-to-int v0, v0

    .line 83
    .line 84
    iget-object v3, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Lcom/contrarywind/view/WheelView;->getTotalScrollY()F

    .line 88
    move-result v4

    .line 89
    int-to-float v0, v0

    .line 90
    sub-float/2addr v4, v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v4}, Lcom/contrarywind/view/WheelView;->setTotalScrollY(F)V

    .line 94
    .line 95
    iget-object v3, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Lcom/contrarywind/view/WheelView;->h()Z

    .line 99
    move-result v3

    .line 100
    .line 101
    if-nez v3, :cond_7

    .line 102
    .line 103
    iget-object v3, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Lcom/contrarywind/view/WheelView;->getItemHeight()F

    .line 107
    move-result v3

    .line 108
    .line 109
    iget-object v4, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/contrarywind/view/WheelView;->getInitPosition()I

    .line 113
    move-result v4

    .line 114
    neg-int v4, v4

    .line 115
    int-to-float v4, v4

    .line 116
    mul-float/2addr v4, v3

    .line 117
    .line 118
    iget-object v5, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Lcom/contrarywind/view/WheelView;->getItemsCount()I

    .line 122
    move-result v5

    .line 123
    .line 124
    add-int/lit8 v5, v5, -0x1

    .line 125
    .line 126
    iget-object v6, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6}, Lcom/contrarywind/view/WheelView;->getInitPosition()I

    .line 130
    move-result v6

    .line 131
    sub-int/2addr v5, v6

    .line 132
    int-to-float v5, v5

    .line 133
    mul-float/2addr v5, v3

    .line 134
    .line 135
    iget-object v6, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6}, Lcom/contrarywind/view/WheelView;->getTotalScrollY()F

    .line 139
    move-result v6

    .line 140
    float-to-double v6, v6

    .line 141
    float-to-double v8, v3

    .line 142
    .line 143
    const-wide/high16 v10, 0x3fd0000000000000L    # 0.25

    .line 144
    mul-double/2addr v8, v10

    .line 145
    sub-double/2addr v6, v8

    .line 146
    float-to-double v10, v4

    .line 147
    .line 148
    cmpg-double v3, v6, v10

    .line 149
    .line 150
    if-gez v3, :cond_4

    .line 151
    .line 152
    iget-object v3, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Lcom/contrarywind/view/WheelView;->getTotalScrollY()F

    .line 156
    move-result v3

    .line 157
    .line 158
    add-float v4, v3, v0

    .line 159
    goto :goto_2

    .line 160
    .line 161
    :cond_4
    iget-object v3, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3}, Lcom/contrarywind/view/WheelView;->getTotalScrollY()F

    .line 165
    move-result v3

    .line 166
    float-to-double v6, v3

    .line 167
    add-double/2addr v6, v8

    .line 168
    float-to-double v8, v5

    .line 169
    .line 170
    cmpl-double v3, v6, v8

    .line 171
    .line 172
    if-lez v3, :cond_5

    .line 173
    .line 174
    iget-object v3, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3}, Lcom/contrarywind/view/WheelView;->getTotalScrollY()F

    .line 178
    move-result v3

    .line 179
    .line 180
    add-float v5, v3, v0

    .line 181
    .line 182
    :cond_5
    :goto_2
    iget-object v0, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Lcom/contrarywind/view/WheelView;->getTotalScrollY()F

    .line 186
    move-result v0

    .line 187
    .line 188
    cmpg-float v0, v0, v4

    .line 189
    .line 190
    if-gtz v0, :cond_6

    .line 191
    .line 192
    const/high16 v0, 0x42200000    # 40.0f

    .line 193
    .line 194
    iput v0, p0, Lw2/a;->b:F

    .line 195
    .line 196
    iget-object v0, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 197
    float-to-int v3, v4

    .line 198
    int-to-float v3, v3

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v3}, Lcom/contrarywind/view/WheelView;->setTotalScrollY(F)V

    .line 202
    goto :goto_3

    .line 203
    .line 204
    :cond_6
    iget-object v0, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Lcom/contrarywind/view/WheelView;->getTotalScrollY()F

    .line 208
    move-result v0

    .line 209
    .line 210
    cmpl-float v0, v0, v5

    .line 211
    .line 212
    if-ltz v0, :cond_7

    .line 213
    .line 214
    iget-object v0, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 215
    float-to-int v3, v5

    .line 216
    int-to-float v3, v3

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v3}, Lcom/contrarywind/view/WheelView;->setTotalScrollY(F)V

    .line 220
    .line 221
    const/high16 v0, -0x3de00000    # -40.0f

    .line 222
    .line 223
    iput v0, p0, Lw2/a;->b:F

    .line 224
    .line 225
    :cond_7
    :goto_3
    iget v0, p0, Lw2/a;->b:F

    .line 226
    .line 227
    cmpg-float v1, v0, v1

    .line 228
    .line 229
    if-gez v1, :cond_8

    .line 230
    add-float/2addr v0, v2

    .line 231
    .line 232
    iput v0, p0, Lw2/a;->b:F

    .line 233
    goto :goto_4

    .line 234
    :cond_8
    sub-float/2addr v0, v2

    .line 235
    .line 236
    iput v0, p0, Lw2/a;->b:F

    .line 237
    .line 238
    :goto_4
    iget-object v0, p0, Lw2/a;->d:Lcom/contrarywind/view/WheelView;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Lcom/contrarywind/view/WheelView;->getHandler()Landroid/os/Handler;

    .line 242
    move-result-object v0

    .line 243
    .line 244
    const/16 v1, 0x3e8

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 248
    return-void
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
