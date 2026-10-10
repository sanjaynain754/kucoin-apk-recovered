.class public Lcom/blankj/utilcode/util/m0$f;
.super Lcom/blankj/utilcode/util/m0$b;
.source "ToastUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public b:Landroid/view/View;

.field public c:Landroid/view/WindowManager;

.field public d:Landroid/view/WindowManager$LayoutParams;


# direct methods
.method public constructor <init>(Landroid/widget/Toast;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/blankj/utilcode/util/m0$b;-><init>(Landroid/widget/Toast;)V

    .line 4
    .line 5
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

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
.end method

.method public static synthetic b(Lcom/blankj/utilcode/util/m0$f;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/m0$f;->d()V

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


# virtual methods
.method public final c()Lcom/blankj/utilcode/util/o0$a;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/blankj/utilcode/util/m0$f$c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/blankj/utilcode/util/m0$f$c;-><init>(Lcom/blankj/utilcode/util/m0$f;)V

    .line 6
    return-object v0
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

.method public cancel()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->c:Landroid/view/WindowManager;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$f;->b:Landroid/view/View;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->b:Landroid/view/View;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->c:Landroid/view/WindowManager;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 17
    return-void
    .line 18
.end method

.method public final d()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->b:Landroid/view/View;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    :goto_0
    return-void

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v2, 0x19

    .line 29
    .line 30
    .line 31
    const-string/jumbo v3, "window"

    .line 32
    .line 33
    if-ge v1, v2, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    check-cast v0, Landroid/view/WindowManager;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->c:Landroid/view/WindowManager;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 44
    .line 45
    const/16 v1, 0x7d5

    .line 46
    .line 47
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 48
    goto :goto_1

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-static {}, Lcom/blankj/utilcode/util/u0;->D()Z

    .line 52
    move-result v2

    .line 53
    .line 54
    if-eqz v2, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    check-cast v0, Landroid/view/WindowManager;

    .line 61
    .line 62
    iput-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->c:Landroid/view/WindowManager;

    .line 63
    .line 64
    const/16 v0, 0x1a

    .line 65
    .line 66
    if-lt v1, v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 69
    .line 70
    const/16 v1, 0x7f6

    .line 71
    .line 72
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_3
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 76
    .line 77
    const/16 v1, 0x7d2

    .line 78
    .line 79
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 80
    goto :goto_1

    .line 81
    .line 82
    .line 83
    :cond_4
    invoke-static {}, Lcom/blankj/utilcode/util/u0;->z()Landroid/content/Context;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    instance-of v1, v0, Landroid/app/Activity;

    .line 87
    .line 88
    const-string v2, "ToastUtils"

    .line 89
    .line 90
    if-nez v1, :cond_5

    .line 91
    .line 92
    const-string v0, "Couldn\'t get top Activity."

    .line 93
    .line 94
    .line 95
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .line 97
    new-instance v0, Lcom/blankj/utilcode/util/m0$d;

    .line 98
    .line 99
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, v1}, Lcom/blankj/utilcode/util/m0$d;-><init>(Landroid/widget/Toast;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/blankj/utilcode/util/m0$d;->show()V

    .line 106
    return-void

    .line 107
    .line 108
    :cond_5
    check-cast v0, Landroid/app/Activity;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 112
    move-result v1

    .line 113
    .line 114
    if-nez v1, :cond_9

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 118
    move-result v1

    .line 119
    .line 120
    if-eqz v1, :cond_6

    .line 121
    goto :goto_3

    .line 122
    .line 123
    .line 124
    :cond_6
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    iput-object v1, p0, Lcom/blankj/utilcode/util/m0$f;->c:Landroid/view/WindowManager;

    .line 128
    .line 129
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 130
    .line 131
    const/16 v2, 0x63

    .line 132
    .line 133
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/m0$f;->c()Lcom/blankj/utilcode/util/o0$a;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    .line 140
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/u0;->a(Landroid/app/Activity;Lcom/blankj/utilcode/util/o0$a;)V

    .line 141
    .line 142
    .line 143
    :goto_1
    invoke-virtual {p0}, Lcom/blankj/utilcode/util/m0$f;->e()V

    .line 144
    .line 145
    :try_start_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->c:Landroid/view/WindowManager;

    .line 146
    .line 147
    if-eqz v0, :cond_7

    .line 148
    .line 149
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$f;->b:Landroid/view/View;

    .line 150
    .line 151
    iget-object v2, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 152
    .line 153
    .line 154
    invoke-interface {v0, v1, v2}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    .line 156
    :catch_0
    :cond_7
    new-instance v0, Lcom/blankj/utilcode/util/m0$f$b;

    .line 157
    .line 158
    .line 159
    invoke-direct {v0, p0}, Lcom/blankj/utilcode/util/m0$f$b;-><init>(Lcom/blankj/utilcode/util/m0$f;)V

    .line 160
    .line 161
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Landroid/widget/Toast;->getDuration()I

    .line 165
    move-result v1

    .line 166
    .line 167
    if-nez v1, :cond_8

    .line 168
    .line 169
    const-wide/16 v1, 0x7d0

    .line 170
    goto :goto_2

    .line 171
    .line 172
    :cond_8
    const-wide/16 v1, 0xdac

    .line 173
    .line 174
    .line 175
    :goto_2
    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/u0;->L(Ljava/lang/Runnable;J)V

    .line 176
    return-void

    .line 177
    .line 178
    :cond_9
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v0, " is useless"

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    .line 196
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 197
    .line 198
    new-instance v0, Lcom/blankj/utilcode/util/m0$d;

    .line 199
    .line 200
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 201
    .line 202
    .line 203
    invoke-direct {v0, v1}, Lcom/blankj/utilcode/util/m0$d;-><init>(Landroid/widget/Toast;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Lcom/blankj/utilcode/util/m0$d;->show()V

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
.end method

.method public final e()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 3
    const/4 v1, -0x2

    .line 4
    .line 5
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 6
    .line 7
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 8
    const/4 v1, -0x3

    .line 9
    .line 10
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 11
    .line 12
    .line 13
    const v1, 0x1030004

    .line 14
    .line 15
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 16
    .line 17
    const-string v1, "ToastWithoutNotification"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 23
    .line 24
    const/16 v1, 0x98

    .line 25
    .line 26
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/blankj/utilcode/util/o0;->a()Landroid/app/Application;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    iput-object v1, v0, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/widget/Toast;->getGravity()I

    .line 44
    move-result v1

    .line 45
    .line 46
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 47
    .line 48
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 49
    .line 50
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 51
    .line 52
    and-int/lit8 v2, v1, 0x7

    .line 53
    .line 54
    const/high16 v3, 0x3f800000    # 1.0f

    .line 55
    const/4 v4, 0x7

    .line 56
    .line 57
    if-ne v2, v4, :cond_0

    .line 58
    .line 59
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->horizontalWeight:F

    .line 60
    .line 61
    :cond_0
    const/16 v2, 0x70

    .line 62
    and-int/2addr v1, v2

    .line 63
    .line 64
    if-ne v1, v2, :cond_1

    .line 65
    .line 66
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->verticalWeight:F

    .line 67
    .line 68
    :cond_1
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/widget/Toast;->getXOffset()I

    .line 72
    move-result v1

    .line 73
    .line 74
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 75
    .line 76
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 77
    .line 78
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/widget/Toast;->getYOffset()I

    .line 82
    move-result v1

    .line 83
    .line 84
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 85
    .line 86
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 87
    .line 88
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/widget/Toast;->getHorizontalMargin()F

    .line 92
    move-result v1

    .line 93
    .line 94
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->horizontalMargin:F

    .line 95
    .line 96
    iget-object v0, p0, Lcom/blankj/utilcode/util/m0$f;->d:Landroid/view/WindowManager$LayoutParams;

    .line 97
    .line 98
    iget-object v1, p0, Lcom/blankj/utilcode/util/m0$b;->a:Landroid/widget/Toast;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/widget/Toast;->getVerticalMargin()F

    .line 102
    move-result v1

    .line 103
    .line 104
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->verticalMargin:F

    .line 105
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
.end method

.method public show()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/blankj/utilcode/util/m0$f$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/blankj/utilcode/util/m0$f$a;-><init>(Lcom/blankj/utilcode/util/m0$f;)V

    .line 6
    .line 7
    const-wide/16 v1, 0x12c

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/u0;->L(Ljava/lang/Runnable;J)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
