.class public Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$LayoutManager;
.source "PagerGridLayoutManager.java"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;,
        Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;,
        Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;,
        Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;,
        Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$e;,
        Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$f;
    }
.end annotation


# static fields
.field public static B:Z


# instance fields
.field public A:Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;

.field public b:Lcom/kubi/home/pagergridlayoutmanager/c;

.field public c:I

.field public d:I
    .annotation build Landroidx/annotation/IntRange;
        from = 0x1L
    .end annotation
.end field

.field public e:I
    .annotation build Landroidx/annotation/IntRange;
        from = 0x1L
    .end annotation
.end field

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public final m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

.field public final n:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;

.field public final o:Landroid/graphics/Rect;

.field public final p:Landroid/graphics/Rect;

.field public q:Landroidx/recyclerview/widget/RecyclerView;

.field public r:Z

.field public s:Z

.field public t:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$e;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public u:I

.field public v:I

.field public w:Z

.field public x:F

.field public y:I

.field public final z:Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;


# direct methods
.method static constructor <clinit>()V
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
.end method

.method public constructor <init>(III)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;-><init>(IIIZ)V

    return-void
.end method

.method public constructor <init>(IIIZ)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 4
    iput v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g:I

    const/4 v1, -0x1

    .line 5
    iput v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h:I

    .line 6
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->o:Landroid/graphics/Rect;

    .line 7
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->p:Landroid/graphics/Rect;

    .line 8
    iput-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->r:Z

    .line 9
    iput-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->s:Z

    .line 10
    iput v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->u:I

    .line 11
    iput v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->v:I

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->w:Z

    const/high16 v0, 0x42c80000    # 100.0f

    .line 13
    iput v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->x:F

    const/16 v0, 0x1f4

    .line 14
    iput v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->y:I

    .line 15
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$a;

    invoke-direct {v0, p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$a;-><init>(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;)V

    iput-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->z:Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;

    .line 16
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d()Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    move-result-object v0

    iput-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 17
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c()Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;

    move-result-object v0

    iput-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->n:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;

    .line 18
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->Q(I)V

    .line 19
    invoke-virtual {p0, p2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->L(I)V

    .line 20
    invoke-virtual {p0, p3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->setOrientation(I)V

    .line 21
    invoke-virtual {p0, p4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->setReverseLayout(Z)V

    return-void
.end method

.method private scrollBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    if-eqz p1, :cond_a

    .line 10
    .line 11
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g:I

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_4

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 19
    .line 20
    iput-boolean v2, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->b:Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 24
    move-result v0

    .line 25
    const/4 v3, -0x1

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    if-lez p1, :cond_1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    move v3, v2

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_2
    if-lez p1, :cond_3

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 38
    .line 39
    iput v3, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->d:I

    .line 40
    .line 41
    if-ne v3, v2, :cond_4

    .line 42
    move v0, v2

    .line 43
    goto :goto_2

    .line 44
    :cond_4
    move v0, v1

    .line 45
    .line 46
    .line 47
    :goto_2
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 48
    move-result v4

    .line 49
    .line 50
    sget-boolean v5, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 51
    .line 52
    const-string v6, ",delta:"

    .line 53
    .line 54
    const-string v7, ",recycler.scrapList.size:"

    .line 55
    .line 56
    const-string v8, "PagerGridLayoutManager"

    .line 57
    .line 58
    if-eqz v5, :cond_5

    .line 59
    .line 60
    new-instance v5, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    const-string v9, "scrollBy -> before : childCount:"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 72
    move-result v9

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->getScrapList()Ljava/util/List;

    .line 82
    move-result-object v9

    .line 83
    .line 84
    .line 85
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 86
    move-result v9

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    move-result-object v5

    .line 100
    .line 101
    .line 102
    invoke-static {v8, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    :cond_5
    invoke-virtual {p0, v0, v4, v2, p3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->T(ZIZLandroidx/recyclerview/widget/RecyclerView$State;)V

    .line 106
    .line 107
    iget-object v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 108
    .line 109
    iget v2, v2, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->e:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, p2, p3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 113
    move-result p3

    .line 114
    add-int/2addr v2, p3

    .line 115
    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    iget-object p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 119
    .line 120
    iget p3, p3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->h:I

    .line 121
    add-int/2addr v2, p3

    .line 122
    .line 123
    :cond_6
    if-gez v2, :cond_7

    .line 124
    return v1

    .line 125
    .line 126
    :cond_7
    if-le v4, v2, :cond_8

    .line 127
    mul-int/2addr v3, v2

    .line 128
    goto :goto_3

    .line 129
    :cond_8
    move v3, p1

    .line 130
    :goto_3
    neg-int p3, v3

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, p3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->F(I)V

    .line 134
    .line 135
    iget-object p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 136
    .line 137
    iput v3, p3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->g:I

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->G(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 141
    .line 142
    sget-boolean p3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 143
    .line 144
    if-eqz p3, :cond_9

    .line 145
    .line 146
    new-instance p3, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    const-string v0, "scrollBy -> end : childCount:"

    .line 152
    .line 153
    .line 154
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 158
    move-result v0

    .line 159
    .line 160
    .line 161
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->getScrapList()Ljava/util/List;

    .line 168
    move-result-object p2

    .line 169
    .line 170
    .line 171
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 172
    move-result p2

    .line 173
    .line 174
    .line 175
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-string p1, ",scrolled:"

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    move-result-object p1

    .line 194
    .line 195
    .line 196
    invoke-static {v8, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 197
    :cond_9
    return v3

    .line 198
    :cond_a
    :goto_4
    return v1
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
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
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
.end method

.method public final B(Landroid/view/View;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    :goto_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    move-object v0, p1

    .line 10
    .line 11
    check-cast v0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return p1
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
.end method

.method public final C(I)Z
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

    .line 9
    rem-int/2addr p1, v0

    .line 10
    .line 11
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 12
    div-int/2addr p1, v0

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    return v2

    .line 16
    :cond_0
    return v1

    .line 17
    .line 18
    :cond_1
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 19
    rem-int/2addr p1, v0

    .line 20
    .line 21
    if-nez p1, :cond_2

    .line 22
    return v2

    .line 23
    :cond_2
    return v1
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
.end method

.method public final D(I)Z
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

    .line 9
    rem-int/2addr p1, v0

    .line 10
    .line 11
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 12
    div-int/2addr p1, v0

    .line 13
    .line 14
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 15
    sub-int/2addr v0, v2

    .line 16
    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    return v2

    .line 19
    :cond_0
    return v1

    .line 20
    .line 21
    :cond_1
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 22
    rem-int/2addr p1, v0

    .line 23
    sub-int/2addr v0, v2

    .line 24
    .line 25
    if-ne p1, v0, :cond_2

    .line 26
    return v2

    .line 27
    :cond_2
    return v1
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
.end method

.method public final E(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;)V
    .locals 11

    .line 1
    .line 2
    iget v0, p3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->d:I

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    .line 11
    :goto_0
    iget v4, p3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->d(Landroidx/recyclerview/widget/RecyclerView$Recycler;)Landroid/view/View;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;)V

    .line 21
    goto :goto_1

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;I)V

    .line 25
    .line 26
    :goto_1
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget v5, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 29
    .line 30
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 31
    .line 32
    iget v7, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 33
    move-object v8, p2

    .line 34
    move-object v3, p3

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {v3 .. v8}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a(IIIILandroidx/recyclerview/widget/RecyclerView$State;)I

    .line 38
    move-result p2

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-object v8, p2

    .line 41
    move-object v3, p3

    .line 42
    .line 43
    iget v5, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 44
    .line 45
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 46
    .line 47
    iget v7, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 48
    .line 49
    .line 50
    invoke-virtual/range {v3 .. v8}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->b(IIIILandroidx/recyclerview/widget/RecyclerView$State;)I

    .line 51
    move-result p2

    .line 52
    .line 53
    :goto_2
    iput p2, v3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c:I

    .line 54
    .line 55
    iget p2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->k:I

    .line 56
    .line 57
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->l:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->C(I)Z

    .line 66
    move-result p2

    .line 67
    goto :goto_3

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-virtual {p0, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->D(I)Z

    .line 71
    move-result p2

    .line 72
    .line 73
    :goto_3
    if-eqz p2, :cond_5

    .line 74
    .line 75
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 76
    .line 77
    if-nez p3, :cond_4

    .line 78
    .line 79
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 80
    goto :goto_4

    .line 81
    .line 82
    :cond_4
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 83
    goto :goto_4

    .line 84
    :cond_5
    move p3, v1

    .line 85
    .line 86
    :goto_4
    iput p3, p4, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;->a:I

    .line 87
    .line 88
    iget-object p3, v3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->f:Landroid/graphics/Rect;

    .line 89
    .line 90
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 91
    .line 92
    if-nez p4, :cond_9

    .line 93
    .line 94
    if-eqz v0, :cond_7

    .line 95
    .line 96
    if-eqz p2, :cond_6

    .line 97
    .line 98
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 99
    .line 100
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 101
    add-int/2addr p2, p3

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v2, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 105
    move-result p3

    .line 106
    add-int/2addr p2, p3

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 110
    move-result p3

    .line 111
    goto :goto_5

    .line 112
    .line 113
    :cond_6
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 114
    .line 115
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 116
    .line 117
    :goto_5
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 118
    add-int/2addr p4, p2

    .line 119
    .line 120
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 121
    :goto_6
    add-int/2addr v0, p3

    .line 122
    :goto_7
    move v7, p2

    .line 123
    move v8, p3

    .line 124
    move v9, p4

    .line 125
    move v10, v0

    .line 126
    .line 127
    goto/16 :goto_b

    .line 128
    .line 129
    :cond_7
    if-eqz p2, :cond_8

    .line 130
    .line 131
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 132
    .line 133
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 134
    sub-int/2addr p2, p3

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v1, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 138
    move-result p3

    .line 139
    sub-int/2addr p2, p3

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 143
    move-result p3

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 147
    move-result p4

    .line 148
    sub-int/2addr p3, p4

    .line 149
    :goto_8
    move v0, p3

    .line 150
    goto :goto_9

    .line 151
    .line 152
    :cond_8
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 153
    .line 154
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 155
    goto :goto_8

    .line 156
    .line 157
    :goto_9
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 158
    .line 159
    sub-int p3, v0, p3

    .line 160
    .line 161
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 162
    add-int/2addr p4, p2

    .line 163
    goto :goto_7

    .line 164
    .line 165
    :cond_9
    if-eqz v0, :cond_b

    .line 166
    .line 167
    if-eqz p2, :cond_a

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 171
    move-result p2

    .line 172
    .line 173
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, v2, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 177
    move-result p4

    .line 178
    add-int/2addr p3, p4

    .line 179
    goto :goto_a

    .line 180
    .line 181
    :cond_a
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 182
    .line 183
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 184
    add-int/2addr p2, p4

    .line 185
    .line 186
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 187
    .line 188
    :goto_a
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 189
    add-int/2addr p4, p2

    .line 190
    .line 191
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 192
    goto :goto_6

    .line 193
    .line 194
    :cond_b
    if-eqz p2, :cond_c

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 198
    move-result p2

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 202
    move-result p4

    .line 203
    .line 204
    sub-int p4, p2, p4

    .line 205
    .line 206
    iget p2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 207
    .line 208
    sub-int p2, p4, p2

    .line 209
    .line 210
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, v1, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 214
    move-result v0

    .line 215
    .line 216
    sub-int v0, p3, v0

    .line 217
    .line 218
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 219
    .line 220
    sub-int p3, v0, p3

    .line 221
    goto :goto_7

    .line 222
    .line 223
    :cond_c
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 224
    .line 225
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 226
    sub-int/2addr p2, p4

    .line 227
    .line 228
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 229
    add-int/2addr p4, p2

    .line 230
    .line 231
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 232
    goto :goto_6

    .line 233
    .line 234
    .line 235
    :goto_b
    invoke-virtual {v3, v7, v8, v9, v10}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->e(IIII)V

    .line 236
    move-object v5, p0

    .line 237
    move-object v6, p1

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v5 .. v10}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    .line 241
    return-void
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
.end method

.method public final F(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->offsetChildrenHorizontal(I)V

    .line 8
    return-void

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->offsetChildrenVertical(I)V

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
.end method

.method public final G(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->b:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 11
    move-result v0

    .line 12
    const/4 v1, -0x1

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 17
    .line 18
    iget v0, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->d:I

    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->I(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->H(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 28
    return-void

    .line 29
    .line 30
    :cond_2
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 31
    .line 32
    iget v0, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->d:I

    .line 33
    .line 34
    if-ne v0, v1, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->H(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 38
    return-void

    .line 39
    .line 40
    .line 41
    :cond_3
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->I(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 42
    return-void
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
.end method

.method public final H(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getClipToPadding()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->l()I

    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 24
    move-result v0

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 28
    move-result v1

    .line 29
    .line 30
    add-int/lit8 v1, v1, -0x1

    .line 31
    .line 32
    :goto_1
    if-ltz v1, :cond_5

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h(Landroid/view/View;)I

    .line 42
    move-result v3

    .line 43
    .line 44
    if-gt v3, v0, :cond_2

    .line 45
    goto :goto_2

    .line 46
    .line 47
    :cond_2
    sget-boolean v3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 48
    .line 49
    if-eqz v3, :cond_3

    .line 50
    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    const-string v4, "recycleViewsFromEnd-removeAndRecycleViewAt: "

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v4, ", position: "

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 71
    move-result v2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    const-string v3, "PagerGridLayoutManager"

    .line 81
    .line 82
    .line 83
    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-virtual {p0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAndRecycleViewAt(ILandroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 87
    .line 88
    :cond_4
    :goto_2
    add-int/lit8 v1, v1, -0x1

    .line 89
    goto :goto_1

    .line 90
    :cond_5
    return-void
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
.end method

.method public final I(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getClipToPadding()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->y()I

    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 16
    move-result v1

    .line 17
    .line 18
    add-int/lit8 v1, v1, -0x1

    .line 19
    .line 20
    :goto_1
    if-ltz v1, :cond_4

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g(Landroid/view/View;)I

    .line 30
    move-result v3

    .line 31
    .line 32
    if-lt v3, v0, :cond_1

    .line 33
    goto :goto_2

    .line 34
    .line 35
    :cond_1
    sget-boolean v3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    const-string v4, "recycleViewsFromStart-removeAndRecycleViewAt: "

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v4, ", position: "

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 59
    move-result v2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    const-string v3, "PagerGridLayoutManager"

    .line 69
    .line 70
    .line 71
    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAndRecycleViewAt(ILandroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 75
    .line 76
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, -0x1

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    return-void
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
.end method

.method public final J(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;)V
    .locals 11

    .line 1
    .line 2
    iget v0, p3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->d:I

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    .line 11
    :goto_0
    iget v4, p3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->d(Landroidx/recyclerview/widget/RecyclerView$Recycler;)Landroid/view/View;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;)V

    .line 21
    goto :goto_1

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;I)V

    .line 25
    .line 26
    :goto_1
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget v5, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 29
    .line 30
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 31
    .line 32
    iget v7, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 33
    move-object v8, p2

    .line 34
    move-object v3, p3

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {v3 .. v8}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a(IIIILandroidx/recyclerview/widget/RecyclerView$State;)I

    .line 38
    move-result p2

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-object v8, p2

    .line 41
    move-object v3, p3

    .line 42
    .line 43
    iget v5, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 44
    .line 45
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 46
    .line 47
    iget v7, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 48
    .line 49
    .line 50
    invoke-virtual/range {v3 .. v8}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->b(IIIILandroidx/recyclerview/widget/RecyclerView$State;)I

    .line 51
    move-result p2

    .line 52
    .line 53
    :goto_2
    iput p2, v3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c:I

    .line 54
    .line 55
    iget p2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->k:I

    .line 56
    .line 57
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->l:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->C(I)Z

    .line 66
    move-result p2

    .line 67
    goto :goto_3

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-virtual {p0, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->D(I)Z

    .line 71
    move-result p2

    .line 72
    .line 73
    :goto_3
    if-eqz p2, :cond_5

    .line 74
    .line 75
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 76
    .line 77
    if-nez p3, :cond_4

    .line 78
    .line 79
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 80
    goto :goto_4

    .line 81
    .line 82
    :cond_4
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 83
    goto :goto_4

    .line 84
    :cond_5
    move p3, v1

    .line 85
    .line 86
    :goto_4
    iput p3, p4, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;->a:I

    .line 87
    .line 88
    iget-object p3, v3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->f:Landroid/graphics/Rect;

    .line 89
    .line 90
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 91
    .line 92
    if-nez p4, :cond_9

    .line 93
    .line 94
    if-eqz v0, :cond_7

    .line 95
    .line 96
    if-eqz p2, :cond_6

    .line 97
    .line 98
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 99
    .line 100
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 101
    sub-int/2addr p2, p3

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v2, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 105
    move-result p3

    .line 106
    sub-int/2addr p2, p3

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 110
    move-result p3

    .line 111
    goto :goto_5

    .line 112
    .line 113
    :cond_6
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 114
    .line 115
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 116
    .line 117
    :goto_5
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 118
    add-int/2addr p4, p2

    .line 119
    .line 120
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 121
    :goto_6
    add-int/2addr v0, p3

    .line 122
    :goto_7
    move v7, p2

    .line 123
    move v8, p3

    .line 124
    move v9, p4

    .line 125
    move v10, v0

    .line 126
    .line 127
    goto/16 :goto_c

    .line 128
    .line 129
    :cond_7
    if-eqz p2, :cond_8

    .line 130
    .line 131
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 132
    .line 133
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 134
    add-int/2addr p2, p3

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v1, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 138
    move-result p3

    .line 139
    add-int/2addr p2, p3

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 143
    move-result p3

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 147
    move-result p4

    .line 148
    sub-int/2addr p3, p4

    .line 149
    :goto_8
    move v0, p3

    .line 150
    goto :goto_9

    .line 151
    .line 152
    :cond_8
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 153
    .line 154
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 155
    goto :goto_8

    .line 156
    .line 157
    :goto_9
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 158
    .line 159
    sub-int p3, v0, p3

    .line 160
    .line 161
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 162
    add-int/2addr p4, p2

    .line 163
    goto :goto_7

    .line 164
    .line 165
    :cond_9
    if-eqz v0, :cond_b

    .line 166
    .line 167
    if-eqz p2, :cond_a

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 171
    move-result p2

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 175
    move-result p4

    .line 176
    sub-int/2addr p2, p4

    .line 177
    .line 178
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v2, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 182
    move-result p4

    .line 183
    add-int/2addr p3, p4

    .line 184
    :goto_a
    move p4, p2

    .line 185
    goto :goto_b

    .line 186
    .line 187
    :cond_a
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 188
    .line 189
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 190
    goto :goto_a

    .line 191
    .line 192
    :goto_b
    iget p2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 193
    .line 194
    sub-int p2, p4, p2

    .line 195
    .line 196
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 197
    goto :goto_6

    .line 198
    .line 199
    :cond_b
    if-eqz p2, :cond_c

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 203
    move-result p2

    .line 204
    .line 205
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 206
    add-int/2addr p4, p2

    .line 207
    .line 208
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v1, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 212
    move-result v0

    .line 213
    .line 214
    sub-int v0, p3, v0

    .line 215
    .line 216
    iget p3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 217
    .line 218
    sub-int p3, v0, p3

    .line 219
    goto :goto_7

    .line 220
    .line 221
    :cond_c
    iget p2, p3, Landroid/graphics/Rect;->right:I

    .line 222
    .line 223
    iget p4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 224
    add-int/2addr p4, p2

    .line 225
    .line 226
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 227
    .line 228
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 229
    goto :goto_6

    .line 230
    .line 231
    .line 232
    :goto_c
    invoke-virtual {v3, v7, v8, v9, v10}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->e(IIII)V

    .line 233
    move-object v5, p0

    .line 234
    move-object v6, p1

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v5 .. v10}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    .line 238
    return-void
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
.end method

.method public K(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 9
    move-result p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->o()I

    .line 13
    move-result v0

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 17
    move-result p1

    .line 18
    .line 19
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h:I

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    return-void

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->M(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 29
    return-void
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
.end method

.method public L(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 7
    .line 8
    if-ne v0, p1, :cond_0

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 14
    move-result p1

    .line 15
    .line 16
    iput p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 17
    const/4 p1, 0x0

    .line 18
    .line 19
    iput p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g:I

    .line 20
    const/4 p1, -0x1

    .line 21
    .line 22
    iput p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

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
.end method

.method public final M(I)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h:I

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iput p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h:I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->t:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$e;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$e;->a(II)V

    .line 15
    :cond_1
    :goto_0
    return-void
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
.end method

.method public final N(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->w:Z

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
.end method

.method public O(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$e;)V
    .locals 0
    .param p1    # Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$e;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->t:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$e;

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
.end method

.method public final P(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g:I

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iput p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g:I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->t:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$e;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$e;->b(I)V

    .line 15
    :cond_1
    :goto_0
    return-void
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
.end method

.method public Q(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 7
    .line 8
    if-ne v0, p1, :cond_0

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 14
    move-result p1

    .line 15
    .line 16
    iput p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 17
    const/4 p1, 0x0

    .line 18
    .line 19
    iput p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g:I

    .line 20
    const/4 p1, -0x1

    .line 21
    .line 22
    iput p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

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
.end method

.method public R()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->s:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
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
.end method

.method public S(I)V
    .locals 4
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 9
    move-result p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->o()I

    .line 13
    move-result v1

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 17
    move-result p1

    .line 18
    .line 19
    iget v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h:I

    .line 20
    .line 21
    if-ne p1, v1, :cond_0

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_0
    if-le p1, v1, :cond_1

    .line 25
    const/4 v0, 0x1

    .line 26
    .line 27
    :cond_1
    sub-int v2, p1, v1

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 31
    move-result v2

    .line 32
    const/4 v3, 0x3

    .line 33
    .line 34
    if-le v2, v3, :cond_4

    .line 35
    .line 36
    if-le p1, v1, :cond_2

    .line 37
    .line 38
    add-int/lit8 v1, p1, -0x3

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_2
    add-int/lit8 v1, p1, 0x3

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-virtual {p0, v1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->K(I)V

    .line 45
    .line 46
    iget-object v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    new-instance v2, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$f;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->u(IZ)I

    .line 54
    move-result p1

    .line 55
    .line 56
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 57
    .line 58
    .line 59
    invoke-direct {v2, p1, p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$f;-><init>(ILcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 63
    :cond_3
    :goto_1
    return-void

    .line 64
    .line 65
    :cond_4
    new-instance v1, Lcom/kubi/home/pagergridlayoutmanager/b;

    .line 66
    .line 67
    iget-object v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v2, p0}, Lcom/kubi/home/pagergridlayoutmanager/b;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->u(IZ)I

    .line 74
    move-result p1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;->setTargetPosition(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

    .line 81
    return-void
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
.end method

.method public final T(ZIZLandroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 9

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getChildClosestToEnd()Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h(Landroid/view/View;)I

    .line 16
    move-result v1

    .line 17
    neg-int v1, v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->y()I

    .line 21
    move-result v2

    .line 22
    :goto_0
    add-int/2addr v1, v2

    .line 23
    goto :goto_2

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g(Landroid/view/View;)I

    .line 27
    move-result v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->l()I

    .line 31
    move-result v2

    .line 32
    :goto_1
    sub-int/2addr v1, v2

    .line 33
    goto :goto_2

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getChildClosestToStart()Landroid/view/View;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 41
    move-result v1

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g(Landroid/view/View;)I

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->l()I

    .line 51
    move-result v2

    .line 52
    goto :goto_1

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h(Landroid/view/View;)I

    .line 56
    move-result v1

    .line 57
    neg-int v1, v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->y()I

    .line 61
    move-result v2

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :goto_2
    iget-object v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 65
    .line 66
    iget-object v2, v2, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->f:Landroid/graphics/Rect;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 70
    .line 71
    iget-object v3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 77
    move-result v4

    .line 78
    .line 79
    iget v5, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 80
    .line 81
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 82
    .line 83
    iget v7, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 84
    move-object v8, p4

    .line 85
    .line 86
    .line 87
    invoke-virtual/range {v3 .. v8}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a(IIIILandroidx/recyclerview/widget/RecyclerView$State;)I

    .line 88
    move-result p1

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    move-object v8, p4

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 94
    move-result v4

    .line 95
    .line 96
    iget v5, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 97
    .line 98
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 99
    .line 100
    iget v7, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v3 .. v8}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->b(IIIILandroidx/recyclerview/widget/RecyclerView$State;)I

    .line 104
    move-result p1

    .line 105
    .line 106
    :goto_3
    iput p1, v3, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c:I

    .line 107
    .line 108
    iget-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 109
    .line 110
    iput p2, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 111
    .line 112
    if-eqz p3, :cond_4

    .line 113
    sub-int/2addr p2, v1

    .line 114
    .line 115
    iput p2, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 116
    .line 117
    :cond_4
    iput v1, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->e:I

    .line 118
    return-void
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
.end method

.method public final a(ZI)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getClipToPadding()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

    .line 10
    rem-int/2addr p2, v0

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    move v0, v1

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    :goto_0
    if-ne p2, v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f()I

    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_1
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
.end method

.method public final b(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->t(I)I

    .line 4
    move-result p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->M(I)V

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
.end method

.method public c()Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;-><init>()V

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
.end method

.method public final canScrollHorizontally()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
.end method

.method public final canScrollVertically()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
.end method

.method public checkLayoutParams(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .locals 0

    .line 1
    .line 2
    instance-of p1, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;

    .line 3
    return p1
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
.end method

.method public computeHorizontalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->computeScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method public computeHorizontalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->computeScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method public computeHorizontalScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->computeScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method public final computeScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 10
    move-result p1

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->k()I

    .line 17
    move-result p1

    .line 18
    .line 19
    sget-boolean v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    const-string v1, "computeScrollExtent: "

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    const-string v1, "PagerGridLayoutManager"

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    :cond_1
    return p1

    .line 45
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 46
    return p1
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
.end method

.method public final computeScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    return v1

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 26
    move-result v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->k()I

    .line 30
    move-result v2

    .line 31
    int-to-float v2, v2

    .line 32
    .line 33
    iget v3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    iget v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_2
    iget v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 41
    :goto_0
    int-to-float v4, v4

    .line 42
    div-float/2addr v2, v4

    .line 43
    .line 44
    if-nez v3, :cond_3

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->t(I)I

    .line 48
    move-result v3

    .line 49
    .line 50
    iget v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 51
    mul-int/2addr v3, v4

    .line 52
    rem-int/2addr v1, v4

    .line 53
    add-int/2addr v3, v1

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_3
    iget v3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 57
    .line 58
    div-int v3, v1, v3

    .line 59
    .line 60
    .line 61
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->computeScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 68
    move-result v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->computeScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 72
    move-result p1

    .line 73
    sub-int/2addr v1, p1

    .line 74
    int-to-float p1, v3

    .line 75
    mul-float/2addr p1, v2

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g(Landroid/view/View;)I

    .line 79
    move-result v0

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->l()I

    .line 83
    move-result v2

    .line 84
    sub-int/2addr v0, v2

    .line 85
    int-to-float v0, v0

    .line 86
    add-float/2addr p1, v0

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 90
    move-result p1

    .line 91
    sub-int/2addr v1, p1

    .line 92
    goto :goto_2

    .line 93
    :cond_4
    int-to-float p1, v3

    .line 94
    mul-float/2addr p1, v2

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->y()I

    .line 98
    move-result v1

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h(Landroid/view/View;)I

    .line 102
    move-result v0

    .line 103
    sub-int/2addr v1, v0

    .line 104
    int-to-float v0, v1

    .line 105
    add-float/2addr p1, v0

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 109
    move-result v1

    .line 110
    .line 111
    :goto_2
    sget-boolean p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 112
    .line 113
    if-eqz p1, :cond_5

    .line 114
    .line 115
    new-instance p1, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    const-string v0, "computeScrollOffset: "

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    move-result-object p1

    .line 131
    .line 132
    const-string v0, "PagerGridLayoutManager"

    .line 133
    .line 134
    .line 135
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    :cond_5
    :goto_3
    return v1
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
.end method

.method public final computeScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 11
    move-result p1

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    iget p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g:I

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 20
    move-result p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->k()I

    .line 24
    move-result v0

    .line 25
    mul-int/2addr p1, v0

    .line 26
    .line 27
    sget-boolean v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    const-string v1, "computeScrollRange: "

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    const-string v1, "PagerGridLayoutManager"

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    :cond_1
    return p1

    .line 53
    :cond_2
    :goto_0
    return v1
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
.end method

.method public computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 5
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 11
    :goto_0
    const/4 v2, -0x1

    .line 12
    .line 13
    if-ltz v0, :cond_2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 23
    move-result v3

    .line 24
    .line 25
    iget v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

    .line 26
    .line 27
    rem-int v4, v3, v4

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move v3, v2

    .line 35
    .line 36
    :goto_1
    if-ne v3, v2, :cond_3

    .line 37
    return-object v1

    .line 38
    .line 39
    :cond_3
    if-ge p1, v3, :cond_4

    .line 40
    .line 41
    const/high16 v0, -0x40800000    # -1.0f

    .line 42
    goto :goto_2

    .line 43
    .line 44
    :cond_4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 45
    .line 46
    .line 47
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->R()Z

    .line 48
    move-result v1

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    neg-float v0, v0

    .line 52
    .line 53
    :cond_5
    sget-boolean v1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 54
    .line 55
    if-eqz v1, :cond_6

    .line 56
    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    const-string v2, "computeScrollVectorForPosition-firstSnapPosition: "

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v2, ", targetPosition:"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string p1, ",mOrientation :"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    iget p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string p1, ", direction:"

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    const-string v1, "PagerGridLayoutManager"

    .line 101
    .line 102
    .line 103
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    .line 105
    :cond_6
    iget p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 106
    const/4 v1, 0x0

    .line 107
    .line 108
    if-nez p1, :cond_7

    .line 109
    .line 110
    new-instance p1, Landroid/graphics/PointF;

    .line 111
    .line 112
    .line 113
    invoke-direct {p1, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 114
    return-object p1

    .line 115
    .line 116
    :cond_7
    new-instance p1, Landroid/graphics/PointF;

    .line 117
    .line 118
    .line 119
    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 120
    return-object p1
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
.end method

.method public computeVerticalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->computeScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method public computeVerticalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->computeScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method public computeVerticalScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->computeScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method public d()Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;-><init>()V

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
.end method

.method public final e(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 3
    .line 4
    iget v1, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->n:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;

    .line 7
    move v3, v1

    .line 8
    .line 9
    :goto_0
    if-lez v3, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c(Landroidx/recyclerview/widget/RecyclerView$State;)Z

    .line 13
    move-result v4

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    iget-boolean v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->s:Z

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, p2, v0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->J(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;)V

    .line 23
    goto :goto_1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0, p1, p2, v0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->E(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;)V

    .line 27
    .line 28
    :goto_1
    iget v4, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 29
    .line 30
    iget v5, v2, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;->a:I

    .line 31
    sub-int/2addr v4, v5

    .line 32
    .line 33
    iput v4, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 34
    sub-int/2addr v3, v5

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    iget v3, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->d:I

    .line 38
    const/4 v4, 0x1

    .line 39
    .line 40
    if-ne v3, v4, :cond_2

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 v4, 0x0

    .line 43
    .line 44
    .line 45
    :goto_2
    invoke-virtual {v0, p2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c(Landroidx/recyclerview/widget/RecyclerView$State;)Z

    .line 46
    move-result v3

    .line 47
    .line 48
    if-eqz v3, :cond_6

    .line 49
    .line 50
    iget v3, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c:I

    .line 51
    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->C(I)Z

    .line 56
    move-result v3

    .line 57
    goto :goto_3

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {p0, v3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->D(I)Z

    .line 61
    move-result v3

    .line 62
    .line 63
    :goto_3
    if-eqz v3, :cond_4

    .line 64
    goto :goto_4

    .line 65
    .line 66
    :cond_4
    iget-boolean v3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->s:Z

    .line 67
    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1, p2, v0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->J(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;)V

    .line 72
    goto :goto_2

    .line 73
    .line 74
    .line 75
    :cond_5
    invoke-virtual {p0, p1, p2, v0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->E(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$b;)V

    .line 76
    goto :goto_2

    .line 77
    .line 78
    .line 79
    :cond_6
    :goto_4
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->G(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 80
    .line 81
    iget p1, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 82
    sub-int/2addr v1, p1

    .line 83
    return v1
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
.end method

.method public final f()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 12
    move-result v1

    .line 13
    :goto_0
    add-int/2addr v0, v1

    .line 14
    return v0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 22
    move-result v1

    .line 23
    goto :goto_0
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
.end method

.method public findViewByPosition(I)Landroid/view/View;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 17
    move-result v1

    .line 18
    .line 19
    sub-int v1, p1, v1

    .line 20
    .line 21
    if-ltz v1, :cond_1

    .line 22
    .line 23
    if-ge v1, v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 31
    move-result v1

    .line 32
    .line 33
    if-ne v1, p1, :cond_1

    .line 34
    return-object v0

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    .line 38
    move-result-object p1

    .line 39
    return-object p1
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
.end method

.method public final g(Landroid/view/View;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;

    .line 7
    .line 8
    iget v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedRight(Landroid/view/View;)I

    .line 14
    move-result p1

    .line 15
    .line 16
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 17
    :goto_0
    add-int/2addr p1, v0

    .line 18
    return p1

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedBottom(Landroid/view/View;)I

    .line 22
    move-result p1

    .line 23
    .line 24
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 25
    goto :goto_0
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
.end method

.method public final generateDefaultLayoutParams()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1, v1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;-><init>(II)V

    .line 7
    return-object v0
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
.end method

.method public generateLayoutParams(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 1

    .line 1
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;

    invoke-direct {v0, p1, p2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 1

    .line 2
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;-><init>(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)V

    return-object v0

    .line 4
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 5
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 6
    :cond_1
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;

    invoke-direct {v0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final getChildClosestToEnd()Landroid/view/View;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 4
    move-result v0

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
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
.end method

.method public final getChildClosestToStart()Landroid/view/View;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 5
    move-result-object v0

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
.end method

.method public final getHeight()I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i()I

    .line 8
    move-result v1

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
.end method

.method public final getWidth()I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j()I

    .line 8
    move-result v1

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
.end method

.method public final h(Landroid/view/View;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$c;

    .line 7
    .line 8
    iget v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedLeft(Landroid/view/View;)I

    .line 14
    move-result p1

    .line 15
    .line 16
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 17
    :goto_0
    sub-int/2addr p1, v0

    .line 18
    return p1

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedTop(Landroid/view/View;)I

    .line 22
    move-result p1

    .line 23
    .line 24
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 25
    goto :goto_0
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
.end method

.method public final i()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->v:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 7
    move-result v0

    .line 8
    return v0
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
.end method

.method public isLayoutRTL()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLayoutDirection()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x0

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
.end method

.method public final j()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->u:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 7
    move-result v0

    .line 8
    return v0
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
.end method

.method public final k()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->w()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->v()I

    .line 13
    move-result v0

    .line 14
    return v0
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
.end method

.method public final l()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 12
    move-result v1

    .line 13
    :goto_0
    sub-int/2addr v0, v1

    .line 14
    return v0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 22
    move-result v1

    .line 23
    goto :goto_0
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
.end method

.method public final m()Landroid/graphics/Rect;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->p:Landroid/graphics/Rect;

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
.end method

.method public final n()Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

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
.end method

.method public final o()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 4
    move-result v0

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->t(I)I

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method

.method public onAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 4
    .line 5
    sget-boolean v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 6
    .line 7
    const-string v1, "PagerGridLayoutManager"

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "onAttachedToWindow: "

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    :cond_0
    const/4 v0, 0x1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B(Landroid/view/View;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->w:Z

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/a;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/a;-><init>(Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 34
    .line 35
    iput-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->A:Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnItemTouchListener(Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;)V

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_1
    sget-boolean v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    const-string v0, "isHandlingSlidingConflictsEnabled: false."

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->z:Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnChildAttachStateChangeListener(Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;)V

    .line 54
    .line 55
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/c;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0}, Lcom/kubi/home/pagergridlayoutmanager/c;-><init>()V

    .line 59
    .line 60
    iput-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->b:Lcom/kubi/home/pagergridlayoutmanager/c;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lcom/kubi/home/pagergridlayoutmanager/c;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 64
    .line 65
    iput-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->q:Landroidx/recyclerview/widget/RecyclerView;

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
.end method

.method public onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$Recycler;)V
    .locals 1
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 4
    .line 5
    sget-boolean p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string p1, "PagerGridLayoutManager"

    .line 10
    .line 11
    const-string p2, "onDetachedFromWindow: "

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    const/4 p2, 0x0

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->A:Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->removeOnItemTouchListener(Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;)V

    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->z:Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->removeOnChildAttachStateChangeListener(Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;)V

    .line 34
    .line 35
    iput-object p2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    .line 37
    :cond_2
    iget-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->b:Lcom/kubi/home/pagergridlayoutmanager/c;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Lcom/kubi/home/pagergridlayoutmanager/c;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 41
    .line 42
    iput-object p2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->b:Lcom/kubi/home/pagergridlayoutmanager/c;

    .line 43
    return-void
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
.end method

.method public onLayoutChildren(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 11

    .line 1
    .line 2
    sget-boolean v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 3
    .line 4
    const-string v1, "PagerGridLayoutManager"

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v2, "onLayoutChildren: "

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$State;->toString()Ljava/lang/String;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 34
    move-result v0

    .line 35
    const/4 v2, -0x1

    .line 36
    const/4 v3, 0x0

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAndRecycleAllViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->P(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->M(I)V

    .line 48
    return-void

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$State;->isPreLayout()Z

    .line 52
    move-result v4

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    goto/16 :goto_d

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->resolveShouldLayoutReverse()V

    .line 60
    .line 61
    iget-boolean v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->s:Z

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    iget-object v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->o:Landroid/graphics/Rect;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 69
    move-result v5

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 73
    move-result v6

    .line 74
    sub-int/2addr v5, v6

    .line 75
    .line 76
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 77
    sub-int/2addr v5, v6

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 81
    move-result v6

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 85
    move-result v7

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 89
    move-result v8

    .line 90
    sub-int/2addr v7, v8

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 94
    move-result v8

    .line 95
    .line 96
    iget v9, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 97
    add-int/2addr v8, v9

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/graphics/Rect;->set(IIII)V

    .line 101
    .line 102
    iget-object v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->p:Landroid/graphics/Rect;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 106
    move-result v5

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 110
    move-result v6

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 114
    move-result v7

    .line 115
    sub-int/2addr v6, v7

    .line 116
    .line 117
    iget v7, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 118
    sub-int/2addr v6, v7

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 122
    move-result v7

    .line 123
    .line 124
    iget v8, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 125
    add-int/2addr v7, v8

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 129
    move-result v8

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 133
    move-result v9

    .line 134
    sub-int/2addr v8, v9

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/graphics/Rect;->set(IIII)V

    .line 138
    goto :goto_0

    .line 139
    .line 140
    :cond_3
    iget-object v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->o:Landroid/graphics/Rect;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 144
    move-result v5

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 148
    move-result v6

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 152
    move-result v7

    .line 153
    .line 154
    iget v8, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 155
    add-int/2addr v7, v8

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 159
    move-result v8

    .line 160
    .line 161
    iget v9, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 162
    add-int/2addr v8, v9

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/graphics/Rect;->set(IIII)V

    .line 166
    .line 167
    iget-object v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->p:Landroid/graphics/Rect;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 171
    move-result v5

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 175
    move-result v6

    .line 176
    sub-int/2addr v5, v6

    .line 177
    .line 178
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 179
    sub-int/2addr v5, v6

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 183
    move-result v6

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 187
    move-result v7

    .line 188
    sub-int/2addr v6, v7

    .line 189
    .line 190
    iget v7, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 191
    sub-int/2addr v6, v7

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 195
    move-result v7

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 199
    move-result v8

    .line 200
    sub-int/2addr v7, v8

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 204
    move-result v8

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 208
    move-result v9

    .line 209
    sub-int/2addr v8, v9

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/graphics/Rect;->set(IIII)V

    .line 213
    .line 214
    :goto_0
    iget v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 215
    .line 216
    iget v5, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 217
    .line 218
    mul-int v6, v4, v5

    .line 219
    .line 220
    iput v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

    .line 221
    .line 222
    div-int v7, v0, v6

    .line 223
    .line 224
    rem-int v8, v0, v6

    .line 225
    .line 226
    if-eqz v8, :cond_4

    .line 227
    .line 228
    add-int/lit8 v7, v7, 0x1

    .line 229
    .line 230
    :cond_4
    iget-object v8, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 231
    .line 232
    iput v3, v8, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->h:I

    .line 233
    const/4 v9, 0x1

    .line 234
    .line 235
    if-le v7, v9, :cond_8

    .line 236
    rem-int/2addr v0, v6

    .line 237
    .line 238
    if-eqz v0, :cond_7

    .line 239
    .line 240
    div-int v6, v0, v5

    .line 241
    rem-int/2addr v0, v5

    .line 242
    .line 243
    iget v10, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 244
    .line 245
    if-nez v10, :cond_5

    .line 246
    .line 247
    if-nez v6, :cond_7

    .line 248
    sub-int/2addr v5, v0

    .line 249
    .line 250
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 251
    mul-int/2addr v5, v0

    .line 252
    goto :goto_1

    .line 253
    .line 254
    :cond_5
    if-lez v0, :cond_6

    .line 255
    .line 256
    add-int/lit8 v6, v6, 0x1

    .line 257
    :cond_6
    sub-int/2addr v4, v6

    .line 258
    .line 259
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 260
    .line 261
    mul-int v5, v4, v0

    .line 262
    goto :goto_1

    .line 263
    :cond_7
    move v5, v3

    .line 264
    .line 265
    :goto_1
    iput v5, v8, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->h:I

    .line 266
    .line 267
    :cond_8
    iput-boolean v3, v8, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->b:Z

    .line 268
    .line 269
    iput v9, v8, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->d:I

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->k()I

    .line 273
    move-result v0

    .line 274
    .line 275
    iput v0, v8, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 276
    .line 277
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 278
    .line 279
    const/high16 v4, -0x80000000

    .line 280
    .line 281
    iput v4, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->e:I

    .line 282
    .line 283
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h:I

    .line 284
    .line 285
    if-ne v0, v2, :cond_9

    .line 286
    goto :goto_2

    .line 287
    .line 288
    .line 289
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->o()I

    .line 290
    move-result v2

    .line 291
    .line 292
    .line 293
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 294
    move-result v3

    .line 295
    .line 296
    .line 297
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->A()Z

    .line 298
    move-result v0

    .line 299
    .line 300
    if-nez v0, :cond_a

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 304
    move-result v0

    .line 305
    .line 306
    if-eqz v0, :cond_a

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getChildClosestToStart()Landroid/view/View;

    .line 310
    move-result-object v0

    .line 311
    goto :goto_3

    .line 312
    :cond_a
    const/4 v0, 0x0

    .line 313
    .line 314
    :goto_3
    iget-boolean v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->s:Z

    .line 315
    .line 316
    if-eqz v2, :cond_11

    .line 317
    .line 318
    if-nez v0, :cond_c

    .line 319
    .line 320
    iget-object v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 321
    .line 322
    iget v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

    .line 323
    mul-int/2addr v4, v3

    .line 324
    .line 325
    iput v4, v2, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c:I

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0, v9, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 329
    move-result v2

    .line 330
    .line 331
    iget v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 332
    .line 333
    if-nez v4, :cond_b

    .line 334
    .line 335
    .line 336
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 337
    move-result v4

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 341
    move-result v5

    .line 342
    sub-int/2addr v4, v5

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 346
    move-result v5

    .line 347
    .line 348
    .line 349
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 350
    move-result v6

    .line 351
    sub-int/2addr v5, v6

    .line 352
    add-int/2addr v5, v2

    .line 353
    goto :goto_7

    .line 354
    .line 355
    .line 356
    :cond_b
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 357
    move-result v4

    .line 358
    sub-int/2addr v4, v2

    .line 359
    .line 360
    .line 361
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 362
    move-result v5

    .line 363
    goto :goto_7

    .line 364
    .line 365
    .line 366
    :cond_c
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 367
    move-result v2

    .line 368
    .line 369
    iget-object v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 370
    .line 371
    iput v2, v4, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c:I

    .line 372
    .line 373
    iget-object v4, v4, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->f:Landroid/graphics/Rect;

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0, v9, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 377
    move-result v5

    .line 378
    .line 379
    .line 380
    invoke-virtual {p0, v0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 381
    .line 382
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 383
    .line 384
    if-nez v6, :cond_e

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->C(I)Z

    .line 388
    move-result v2

    .line 389
    .line 390
    if-eqz v2, :cond_d

    .line 391
    .line 392
    .line 393
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 394
    move-result v2

    .line 395
    .line 396
    .line 397
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 398
    move-result v6

    .line 399
    sub-int/2addr v2, v6

    .line 400
    .line 401
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 402
    add-int/2addr v4, v5

    .line 403
    :goto_4
    move v5, v4

    .line 404
    move v4, v2

    .line 405
    goto :goto_5

    .line 406
    .line 407
    :cond_d
    iget v2, v4, Landroid/graphics/Rect;->top:I

    .line 408
    .line 409
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 410
    goto :goto_4

    .line 411
    .line 412
    .line 413
    :cond_e
    invoke-virtual {p0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->C(I)Z

    .line 414
    move-result v2

    .line 415
    .line 416
    if-eqz v2, :cond_f

    .line 417
    .line 418
    iget v2, v4, Landroid/graphics/Rect;->top:I

    .line 419
    sub-int/2addr v2, v5

    .line 420
    .line 421
    .line 422
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 423
    move-result v4

    .line 424
    goto :goto_4

    .line 425
    .line 426
    :cond_f
    iget v2, v4, Landroid/graphics/Rect;->bottom:I

    .line 427
    .line 428
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 429
    goto :goto_4

    .line 430
    .line 431
    :goto_5
    iget v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 432
    .line 433
    if-nez v2, :cond_10

    .line 434
    .line 435
    .line 436
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h(Landroid/view/View;)I

    .line 437
    move-result v2

    .line 438
    .line 439
    .line 440
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->l()I

    .line 441
    move-result v6

    .line 442
    sub-int/2addr v2, v6

    .line 443
    goto :goto_6

    .line 444
    .line 445
    .line 446
    :cond_10
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h(Landroid/view/View;)I

    .line 447
    move-result v2

    .line 448
    .line 449
    :goto_6
    iget-object v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 450
    .line 451
    iget v8, v6, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 452
    sub-int/2addr v8, v2

    .line 453
    .line 454
    iput v8, v6, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 455
    .line 456
    :goto_7
    iget v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 457
    .line 458
    sub-int v2, v4, v2

    .line 459
    .line 460
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 461
    add-int/2addr v6, v5

    .line 462
    .line 463
    goto/16 :goto_c

    .line 464
    .line 465
    :cond_11
    if-nez v0, :cond_13

    .line 466
    .line 467
    iget-object v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 468
    .line 469
    iget v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

    .line 470
    mul-int/2addr v4, v3

    .line 471
    .line 472
    iput v4, v2, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c:I

    .line 473
    .line 474
    .line 475
    invoke-virtual {p0, v9, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 476
    move-result v2

    .line 477
    .line 478
    iget v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 479
    .line 480
    if-nez v4, :cond_12

    .line 481
    .line 482
    .line 483
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 484
    move-result v4

    .line 485
    .line 486
    .line 487
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 488
    move-result v5

    .line 489
    sub-int/2addr v4, v5

    .line 490
    .line 491
    .line 492
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 493
    move-result v5

    .line 494
    sub-int/2addr v5, v2

    .line 495
    goto :goto_8

    .line 496
    .line 497
    .line 498
    :cond_12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 499
    move-result v4

    .line 500
    sub-int/2addr v4, v2

    .line 501
    .line 502
    .line 503
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 504
    move-result v2

    .line 505
    .line 506
    .line 507
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 508
    move-result v5

    .line 509
    .line 510
    sub-int v5, v2, v5

    .line 511
    :goto_8
    move v6, v5

    .line 512
    goto :goto_b

    .line 513
    .line 514
    .line 515
    :cond_13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 516
    move-result v2

    .line 517
    .line 518
    iget-object v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 519
    .line 520
    iput v2, v4, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->c:I

    .line 521
    .line 522
    iget-object v4, v4, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->f:Landroid/graphics/Rect;

    .line 523
    .line 524
    .line 525
    invoke-virtual {p0, v9, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->a(ZI)I

    .line 526
    move-result v5

    .line 527
    .line 528
    .line 529
    invoke-virtual {p0, v0, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 530
    .line 531
    iget v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 532
    .line 533
    if-nez v6, :cond_15

    .line 534
    .line 535
    .line 536
    invoke-virtual {p0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->C(I)Z

    .line 537
    move-result v2

    .line 538
    .line 539
    if-eqz v2, :cond_14

    .line 540
    .line 541
    .line 542
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 543
    move-result v2

    .line 544
    .line 545
    .line 546
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 547
    move-result v6

    .line 548
    sub-int/2addr v2, v6

    .line 549
    .line 550
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 551
    :goto_9
    sub-int/2addr v4, v5

    .line 552
    goto :goto_a

    .line 553
    .line 554
    :cond_14
    iget v2, v4, Landroid/graphics/Rect;->top:I

    .line 555
    .line 556
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 557
    goto :goto_a

    .line 558
    .line 559
    .line 560
    :cond_15
    invoke-virtual {p0, v2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->C(I)Z

    .line 561
    move-result v2

    .line 562
    .line 563
    if-eqz v2, :cond_16

    .line 564
    .line 565
    iget v2, v4, Landroid/graphics/Rect;->top:I

    .line 566
    sub-int/2addr v2, v5

    .line 567
    .line 568
    .line 569
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 570
    move-result v4

    .line 571
    .line 572
    .line 573
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 574
    move-result v5

    .line 575
    goto :goto_9

    .line 576
    .line 577
    :cond_16
    iget v2, v4, Landroid/graphics/Rect;->bottom:I

    .line 578
    .line 579
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 580
    .line 581
    .line 582
    :goto_a
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h(Landroid/view/View;)I

    .line 583
    move-result v5

    .line 584
    .line 585
    iget-object v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 586
    .line 587
    iget v8, v6, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 588
    sub-int/2addr v8, v5

    .line 589
    .line 590
    iput v8, v6, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 591
    move v6, v4

    .line 592
    move v4, v2

    .line 593
    .line 594
    :goto_b
    iget v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 595
    .line 596
    sub-int v2, v4, v2

    .line 597
    .line 598
    iget v5, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 599
    .line 600
    sub-int v5, v6, v5

    .line 601
    .line 602
    :goto_c
    iget-object v8, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v8, v5, v2, v6, v4}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->e(IIII)V

    .line 606
    .line 607
    sget-boolean v2, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 608
    .line 609
    if-eqz v2, :cond_17

    .line 610
    .line 611
    new-instance v2, Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 615
    .line 616
    const-string v4, "onLayoutChildren-pagerCount:"

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    const-string v4, ",mLayoutState.mAvailable: "

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    iget-object v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 630
    .line 631
    iget v4, v4, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->a:I

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 638
    move-result-object v2

    .line 639
    .line 640
    .line 641
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 642
    .line 643
    .line 644
    :cond_17
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {p0, p1, p2}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 648
    .line 649
    sget-boolean p2, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 650
    .line 651
    if-eqz p2, :cond_18

    .line 652
    .line 653
    new-instance p2, Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 657
    .line 658
    const-string v2, "onLayoutChildren: childCount:"

    .line 659
    .line 660
    .line 661
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 665
    move-result v2

    .line 666
    .line 667
    .line 668
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    const-string v2, ",recycler.scrapList.size:"

    .line 671
    .line 672
    .line 673
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->getScrapList()Ljava/util/List;

    .line 677
    move-result-object p1

    .line 678
    .line 679
    .line 680
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 681
    move-result p1

    .line 682
    .line 683
    .line 684
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    const-string p1, ",mLayoutState.replenishDelta:"

    .line 687
    .line 688
    .line 689
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    iget-object p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->m:Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;

    .line 692
    .line 693
    iget p1, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$d;->h:I

    .line 694
    .line 695
    .line 696
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 700
    move-result-object p1

    .line 701
    .line 702
    .line 703
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 704
    .line 705
    :cond_18
    if-nez v0, :cond_19

    .line 706
    .line 707
    .line 708
    invoke-virtual {p0, v7}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->P(I)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {p0, v3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->M(I)V

    .line 712
    :cond_19
    :goto_d
    return-void
.end method

.method public onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$State;)V
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
.end method

.method public onMeasure(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;II)V
    .locals 8
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$Recycler;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 8
    move-result v1

    .line 9
    .line 10
    const/high16 v2, 0x40000000    # 2.0f

    .line 11
    .line 12
    if-ne v0, v2, :cond_3

    .line 13
    .line 14
    if-ne v1, v2, :cond_3

    .line 15
    .line 16
    .line 17
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 22
    move-result v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 26
    move-result v2

    .line 27
    .line 28
    sub-int v2, v0, v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 32
    move-result v3

    .line 33
    sub-int/2addr v2, v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 37
    move-result v3

    .line 38
    .line 39
    sub-int v3, v1, v3

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 43
    move-result v4

    .line 44
    sub-int/2addr v3, v4

    .line 45
    .line 46
    iget v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 47
    const/4 v5, 0x0

    .line 48
    .line 49
    if-lez v4, :cond_0

    .line 50
    .line 51
    div-int v6, v2, v4

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v6, v5

    .line 54
    .line 55
    :goto_0
    iput v6, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 56
    .line 57
    iget v7, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 58
    .line 59
    if-lez v7, :cond_1

    .line 60
    .line 61
    div-int v5, v3, v7

    .line 62
    .line 63
    :cond_1
    iput v5, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 64
    mul-int/2addr v4, v6

    .line 65
    .line 66
    sub-int v4, v2, v4

    .line 67
    .line 68
    iput v4, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->u:I

    .line 69
    mul-int/2addr v7, v5

    .line 70
    .line 71
    sub-int v7, v3, v7

    .line 72
    .line 73
    iput v7, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->v:I

    .line 74
    sub-int/2addr v2, v4

    .line 75
    sub-int/2addr v2, v6

    .line 76
    .line 77
    iput v2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->k:I

    .line 78
    sub-int/2addr v3, v7

    .line 79
    sub-int/2addr v3, v5

    .line 80
    .line 81
    iput v3, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->l:I

    .line 82
    .line 83
    sget-boolean v2, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 84
    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    new-instance v2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    const-string v3, "onMeasure-originalWidthSize: "

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v0, ",originalHeightSize: "

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v0, ",diffWidth: "

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->u:I

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v0, ",diffHeight: "

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->v:I

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v0, ",mItemWidth: "

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->i:I

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v0, ",mItemHeight: "

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->j:I

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v0, ",mStartSnapRect:"

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->o:Landroid/graphics/Rect;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v0, ",mEndSnapRect:"

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->p:Landroid/graphics/Rect;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    move-result-object v0

    .line 171
    .line 172
    const-string v1, "PagerGridLayoutManager"

    .line 173
    .line 174
    .line 175
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    :cond_2
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onMeasure(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;II)V

    .line 179
    return-void

    .line 180
    .line 181
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 182
    .line 183
    const-string p2, "RecyclerView\'s width and height must be exactly"

    .line 184
    .line 185
    .line 186
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    throw p1
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
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;

    .line 7
    .line 8
    iget v0, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;->mOrientation:I

    .line 9
    .line 10
    iput v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 11
    .line 12
    iget v0, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;->mRows:I

    .line 13
    .line 14
    iput v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 15
    .line 16
    iget v0, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;->mColumns:I

    .line 17
    .line 18
    iput v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 19
    .line 20
    iget v0, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;->mCurrentPagerIndex:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->M(I)V

    .line 24
    .line 25
    iget-boolean p1, p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;->mReverseLayout:Z

    .line 26
    .line 27
    iput-boolean p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->r:Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 31
    .line 32
    sget-boolean p1, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const-string p1, "PagerGridLayoutManager"

    .line 37
    .line 38
    const-string v0, "onRestoreInstanceState: loaded saved state"

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    :cond_0
    return-void
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
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-boolean v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->B:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string v0, "PagerGridLayoutManager"

    .line 7
    .line 8
    const-string v1, "onSaveInstanceState: "

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    :cond_0
    new-instance v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;-><init>()V

    .line 17
    .line 18
    iget v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 19
    .line 20
    iput v1, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;->mOrientation:I

    .line 21
    .line 22
    iget v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->d:I

    .line 23
    .line 24
    iput v1, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;->mRows:I

    .line 25
    .line 26
    iget v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->e:I

    .line 27
    .line 28
    iput v1, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;->mColumns:I

    .line 29
    .line 30
    iget v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->h:I

    .line 31
    .line 32
    iput v1, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;->mCurrentPagerIndex:I

    .line 33
    .line 34
    iget-boolean v1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->r:Z

    .line 35
    .line 36
    iput-boolean v1, v0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$SavedState;->mReverseLayout:Z

    .line 37
    return-object v0
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
.end method

.method public onScrollStateChanged(I)V
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
.end method

.method public final p()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->y:I

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
.end method

.method public final q()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->x:F

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
.end method

.method public final r()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

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
.end method

.method public final resolveShouldLayoutReverse()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->isLayoutRTL()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->r:Z

    .line 15
    xor-int/2addr v0, v1

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->s:Z

    .line 18
    return-void

    .line 19
    .line 20
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->r:Z

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->s:Z

    .line 23
    return-void
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
.end method

.method public final s()I
    .locals 2
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->g:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 7
    move-result v0

    .line 8
    return v0
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
.end method

.method public scrollHorizontallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    const/4 p1, 0x0

    .line 7
    return p1

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 11
    move-result p1

    .line 12
    return p1
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
.end method

.method public scrollToPosition(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->t(I)I

    .line 8
    move-result p1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->K(I)V

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
.end method

.method public scrollVerticallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 10
    move-result p1

    .line 11
    return p1
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
.end method

.method public setOrientation(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    const-string v2, "invalid orientation:"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    throw v0

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 36
    .line 37
    if-eq p1, v0, :cond_2

    .line 38
    .line 39
    iput p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 43
    :cond_2
    return-void
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
.end method

.method public setReverseLayout(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->r:Z

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iput-boolean p1, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->r:Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 15
    return-void
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
.end method

.method public smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;I)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->t(I)I

    .line 8
    move-result p1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->S(I)V

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
.end method

.method public final t(I)I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

    .line 3
    div-int/2addr p1, v0

    .line 4
    return p1
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
.end method

.method public final u(IZ)I
    .locals 0

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget p2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

    .line 5
    mul-int/2addr p1, p2

    .line 6
    return p1

    .line 7
    .line 8
    :cond_0
    iget p2, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->f:I

    .line 9
    mul-int/2addr p1, p2

    .line 10
    add-int/2addr p1, p2

    .line 11
    .line 12
    add-int/lit8 p1, p1, -0x1

    .line 13
    return p1
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
.end method

.method public final v()I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getHeight()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 13
    move-result v1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    return v0
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
.end method

.method public final w()I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingEnd()I

    .line 13
    move-result v1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    return v0
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
.end method

.method public x()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->s:Z

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
.end method

.method public final y()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->c:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingStart()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 13
    move-result v0

    .line 14
    return v0
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
.end method

.method public final z()Landroid/graphics/Rect;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager;->o:Landroid/graphics/Rect;

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
.end method
