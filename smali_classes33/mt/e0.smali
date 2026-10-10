.class public final Lmt/e0;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "StickySectionDecoration.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010!\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/kubi/otc/view/StickySectionDecoration;",
        "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;",
        "context",
        "Landroid/content/Context;",
        "list",
        "",
        "Lcom/kubi/otc/view/StickySection;",
        "<init>",
        "(Landroid/content/Context;Ljava/util/List;)V",
        "getContext",
        "()Landroid/content/Context;",
        "getList",
        "()Ljava/util/List;",
        "mBounds",
        "Landroid/graphics/Rect;",
        "fontColor",
        "",
        "bgColor",
        "mSectionHeight",
        "mPaint",
        "Landroid/graphics/Paint;",
        "getItemOffsets",
        "",
        "outRect",
        "view",
        "Landroid/view/View;",
        "parent",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "state",
        "Landroidx/recyclerview/widget/RecyclerView$State;",
        "onDraw",
        "c",
        "Landroid/graphics/Canvas;",
        "onDrawOver",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final d:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmt/d0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public f:Landroid/graphics/Rect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:I

.field public h:I

.field public i:I

.field public j:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "+",
            "Lmt/d0;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "list"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lmt/e0;->d:Landroid/content/Context;

    .line 16
    .line 17
    iput-object p2, p0, Lmt/e0;->e:Ljava/util/List;

    .line 18
    .line 19
    new-instance p2, Landroid/graphics/Rect;

    .line 20
    .line 21
    .line 22
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 23
    .line 24
    iput-object p2, p0, Lmt/e0;->f:Landroid/graphics/Rect;

    .line 25
    .line 26
    sget p2, Lcom/kubi/otc/R$color;->emphasis:I

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 30
    move-result p2

    .line 31
    .line 32
    iput p2, p0, Lmt/e0;->g:I

    .line 33
    .line 34
    sget p2, Lcom/kubi/otc/R$color;->c_background:I

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 38
    move-result p1

    .line 39
    .line 40
    iput p1, p0, Lmt/e0;->h:I

    .line 41
    .line 42
    const/high16 p1, 0x41e00000    # 28.0f

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 46
    move-result p1

    .line 47
    .line 48
    iput p1, p0, Lmt/e0;->i:I

    .line 49
    .line 50
    new-instance p1, Landroid/graphics/Paint;

    .line 51
    .line 52
    .line 53
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 54
    .line 55
    const/high16 p2, 0x41400000    # 12.0f

    .line 56
    .line 57
    .line 58
    invoke-static {p2}, Lcom/blankj/utilcode/util/i0;->f(F)I

    .line 59
    move-result p2

    .line 60
    int-to-float p2, p2

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 64
    const/4 p2, 0x1

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 68
    .line 69
    iput-object p1, p0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 70
    return-void
    .line 71
    .line 72
    .line 73
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "outRect"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "view"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "parent"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "state"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    move-result-object p2

    .line 28
    .line 29
    const-string p3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams"

    .line 30
    .line 31
    .line 32
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->getViewLayoutPosition()I

    .line 38
    move-result p2

    .line 39
    .line 40
    iget-object p3, p0, Lmt/e0;->e:Ljava/util/List;

    .line 41
    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 46
    move-result p3

    .line 47
    .line 48
    if-eqz p3, :cond_0

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_0
    if-ltz p2, :cond_2

    .line 52
    .line 53
    iget-object p3, p0, Lmt/e0;->e:Ljava/util/List;

    .line 54
    .line 55
    .line 56
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 57
    move-result p3

    .line 58
    .line 59
    if-lt p2, p3, :cond_1

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_1
    iget-object p3, p0, Lmt/e0;->e:Ljava/util/List;

    .line 63
    .line 64
    .line 65
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    check-cast p2, Lmt/d0;

    .line 69
    .line 70
    .line 71
    invoke-interface {p2}, Lmt/d0;->isTitle()Z

    .line 72
    move-result p2

    .line 73
    .line 74
    if-eqz p2, :cond_2

    .line 75
    .line 76
    iget p2, p0, Lmt/e0;->i:I

    .line 77
    const/4 p3, 0x0

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p3, p2, p3, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 81
    :cond_2
    :goto_0
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
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 16
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v7, p2

    .line 7
    .line 8
    const-string v2, "c"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v2, "parent"

    .line 14
    .line 15
    .line 16
    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    const-string v2, "state"

    .line 19
    .line 20
    move-object/from16 v3, p3

    .line 21
    .line 22
    .line 23
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-super/range {p0 .. p3}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v7}, Landroid/view/View;->getPaddingLeft()I

    .line 30
    move-result v8

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 34
    move-result v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Landroid/view/View;->getPaddingRight()I

    .line 38
    move-result v3

    .line 39
    .line 40
    sub-int v9, v2, v3

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 44
    move-result v10

    .line 45
    const/4 v11, 0x0

    .line 46
    move v12, v11

    .line 47
    .line 48
    :goto_0
    if-ge v12, v10, :cond_3

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 52
    move-result-object v13

    .line 53
    .line 54
    .line 55
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    const-string v3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams"

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    move-object v14, v2

    .line 63
    .line 64
    check-cast v14, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v14}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->getViewLayoutPosition()I

    .line 68
    move-result v15

    .line 69
    .line 70
    iget-object v2, v0, Lmt/e0;->e:Ljava/util/List;

    .line 71
    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 76
    move-result v2

    .line 77
    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :cond_0
    if-ltz v15, :cond_2

    .line 83
    .line 84
    iget-object v2, v0, Lmt/e0;->e:Ljava/util/List;

    .line 85
    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 88
    move-result v2

    .line 89
    .line 90
    if-ge v15, v2, :cond_2

    .line 91
    .line 92
    iget-object v2, v0, Lmt/e0;->e:Ljava/util/List;

    .line 93
    .line 94
    .line 95
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    check-cast v2, Lmt/d0;

    .line 99
    .line 100
    .line 101
    invoke-interface {v2}, Lmt/d0;->isTitle()Z

    .line 102
    move-result v2

    .line 103
    .line 104
    if-nez v2, :cond_1

    .line 105
    goto :goto_1

    .line 106
    .line 107
    :cond_1
    iget-object v2, v0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 108
    .line 109
    iget v3, v0, Lmt/e0;->h:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    int-to-float v2, v8

    .line 114
    .line 115
    .line 116
    invoke-virtual {v13}, Landroid/view/View;->getTop()I

    .line 117
    move-result v3

    .line 118
    .line 119
    iget v4, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 120
    sub-int/2addr v3, v4

    .line 121
    .line 122
    iget v4, v0, Lmt/e0;->i:I

    .line 123
    sub-int/2addr v3, v4

    .line 124
    int-to-float v3, v3

    .line 125
    int-to-float v4, v9

    .line 126
    .line 127
    .line 128
    invoke-virtual {v13}, Landroid/view/View;->getTop()I

    .line 129
    move-result v5

    .line 130
    .line 131
    iget v6, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 132
    sub-int/2addr v5, v6

    .line 133
    int-to-float v5, v5

    .line 134
    .line 135
    iget-object v6, v0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 139
    .line 140
    iget-object v2, v0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 141
    .line 142
    iget v3, v0, Lmt/e0;->g:I

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 146
    .line 147
    iget-object v2, v0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 148
    .line 149
    iget-object v3, v0, Lmt/e0;->e:Ljava/util/List;

    .line 150
    .line 151
    .line 152
    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    move-result-object v3

    .line 154
    .line 155
    check-cast v3, Lmt/d0;

    .line 156
    .line 157
    .line 158
    invoke-interface {v3}, Lmt/d0;->getTitle()Ljava/lang/String;

    .line 159
    move-result-object v3

    .line 160
    .line 161
    iget-object v4, v0, Lmt/e0;->e:Ljava/util/List;

    .line 162
    .line 163
    .line 164
    invoke-interface {v4, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    move-result-object v4

    .line 166
    .line 167
    check-cast v4, Lmt/d0;

    .line 168
    .line 169
    .line 170
    invoke-interface {v4}, Lmt/d0;->getTitle()Ljava/lang/String;

    .line 171
    move-result-object v4

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 175
    move-result v4

    .line 176
    .line 177
    iget-object v5, v0, Lmt/e0;->f:Landroid/graphics/Rect;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v3, v11, v4, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 181
    .line 182
    iget-object v2, v0, Lmt/e0;->e:Ljava/util/List;

    .line 183
    .line 184
    .line 185
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    move-result-object v2

    .line 187
    .line 188
    check-cast v2, Lmt/d0;

    .line 189
    .line 190
    .line 191
    invoke-interface {v2}, Lmt/d0;->getTitle()Ljava/lang/String;

    .line 192
    move-result-object v2

    .line 193
    .line 194
    .line 195
    invoke-virtual {v13}, Landroid/view/View;->getPaddingLeft()I

    .line 196
    move-result v3

    .line 197
    int-to-float v3, v3

    .line 198
    .line 199
    .line 200
    invoke-virtual {v13}, Landroid/view/View;->getTop()I

    .line 201
    move-result v4

    .line 202
    .line 203
    iget v5, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 204
    sub-int/2addr v4, v5

    .line 205
    int-to-float v4, v4

    .line 206
    .line 207
    iget v5, v0, Lmt/e0;->i:I

    .line 208
    int-to-float v5, v5

    .line 209
    .line 210
    const/high16 v6, 0x40000000    # 2.0f

    .line 211
    div-float/2addr v5, v6

    .line 212
    .line 213
    iget-object v13, v0, Lmt/e0;->f:Landroid/graphics/Rect;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 217
    move-result v13

    .line 218
    int-to-float v13, v13

    .line 219
    div-float/2addr v13, v6

    .line 220
    sub-float/2addr v5, v13

    .line 221
    sub-float/2addr v4, v5

    .line 222
    .line 223
    iget-object v5, v0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 227
    .line 228
    :cond_2
    :goto_1
    add-int/lit8 v12, v12, 0x1

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    :cond_3
    return-void
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
.end method

.method public onDrawOver(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 10
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "c"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "parent"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "state"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 19
    move-result-object p3

    .line 20
    .line 21
    check-cast p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 22
    .line 23
    .line 24
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    .line 28
    move-result p3

    .line 29
    .line 30
    iget-object v0, p0, Lmt/e0;->e:Ljava/util/List;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_0
    if-ltz p3, :cond_3

    .line 43
    .line 44
    iget-object v0, p0, Lmt/e0;->e:Ljava/util/List;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 48
    move-result v0

    .line 49
    .line 50
    if-lt p3, v0, :cond_1

    .line 51
    .line 52
    goto/16 :goto_1

    .line 53
    .line 54
    :cond_1
    iget-object v0, p0, Lmt/e0;->e:Ljava/util/List;

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    check-cast v0, Lmt/d0;

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Lmt/d0;->getTitle()Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForLayoutPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 72
    .line 73
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 74
    .line 75
    const-string v2, "itemView"

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    iget-object v2, p0, Lmt/e0;->e:Ljava/util/List;

    .line 81
    const/4 v3, 0x1

    .line 82
    add-int/2addr p3, v3

    .line 83
    .line 84
    .line 85
    invoke-interface {v2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    move-result-object p3

    .line 87
    .line 88
    check-cast p3, Lmt/d0;

    .line 89
    .line 90
    .line 91
    invoke-interface {p3}, Lmt/d0;->getTitle()Ljava/lang/String;

    .line 92
    move-result-object p3

    .line 93
    .line 94
    .line 95
    invoke-static {v0, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    move-result p3

    .line 97
    const/4 v2, 0x0

    .line 98
    .line 99
    if-nez p3, :cond_2

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 103
    move-result p3

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 107
    move-result v4

    .line 108
    add-int/2addr p3, v4

    .line 109
    .line 110
    iget v4, p0, Lmt/e0;->i:I

    .line 111
    .line 112
    if-ge p3, v4, :cond_2

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 119
    move-result p3

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 123
    move-result v4

    .line 124
    add-int/2addr p3, v4

    .line 125
    .line 126
    iget v4, p0, Lmt/e0;->i:I

    .line 127
    sub-int/2addr p3, v4

    .line 128
    int-to-float p3, p3

    .line 129
    const/4 v4, 0x0

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v4, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 133
    goto :goto_0

    .line 134
    :cond_2
    move v3, v2

    .line 135
    .line 136
    :goto_0
    iget-object p3, p0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 137
    .line 138
    iget v4, p0, Lmt/e0;->h:I

    .line 139
    .line 140
    .line 141
    invoke-virtual {p3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 145
    move-result p3

    .line 146
    int-to-float v5, p3

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    .line 150
    move-result p3

    .line 151
    int-to-float v6, p3

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    .line 155
    move-result p3

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    .line 159
    move-result v4

    .line 160
    sub-int/2addr p3, v4

    .line 161
    int-to-float v7, p3

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    .line 165
    move-result p3

    .line 166
    .line 167
    iget v4, p0, Lmt/e0;->i:I

    .line 168
    add-int/2addr p3, v4

    .line 169
    int-to-float v8, p3

    .line 170
    .line 171
    iget-object v9, p0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 172
    move-object v4, p1

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 176
    .line 177
    iget-object p1, p0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 178
    .line 179
    iget p3, p0, Lmt/e0;->g:I

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 183
    .line 184
    iget-object p1, p0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 188
    move-result p3

    .line 189
    .line 190
    iget-object v5, p0, Lmt/e0;->f:Landroid/graphics/Rect;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v0, v2, p3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 197
    move-result p1

    .line 198
    int-to-float p1, p1

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    .line 202
    move-result p2

    .line 203
    .line 204
    iget p3, p0, Lmt/e0;->i:I

    .line 205
    add-int/2addr p2, p3

    .line 206
    int-to-float p2, p2

    .line 207
    int-to-float p3, p3

    .line 208
    .line 209
    const/high16 v1, 0x40000000    # 2.0f

    .line 210
    div-float/2addr p3, v1

    .line 211
    .line 212
    iget-object v2, p0, Lmt/e0;->f:Landroid/graphics/Rect;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 216
    move-result v2

    .line 217
    int-to-float v2, v2

    .line 218
    div-float/2addr v2, v1

    .line 219
    sub-float/2addr p3, v2

    .line 220
    sub-float/2addr p2, p3

    .line 221
    .line 222
    iget-object p3, p0, Lmt/e0;->j:Landroid/graphics/Paint;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v0, p1, p2, p3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 226
    .line 227
    if-eqz v3, :cond_3

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, Landroid/graphics/Canvas;->restore()V

    .line 231
    :cond_3
    :goto_1
    return-void
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
.end method
