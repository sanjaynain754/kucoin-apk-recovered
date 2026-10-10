.class public final Lcom/kubi/assets/view/stickydecoration/StickyDecoration;
.super Lmb/a;
.source "StickyDecoration.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/kubi/assets/view/stickydecoration/StickyDecoration;",
        "Lcom/kubi/assets/view/stickydecoration/BaseDecoration;",
        "groupListener",
        "Lcom/kubi/assets/view/stickydecoration/StickyDecorationListener;",
        "<init>",
        "(Lcom/kubi/assets/view/stickydecoration/StickyDecorationListener;)V",
        "mGroupListener",
        "mGroutPaint",
        "Landroid/graphics/Paint;",
        "mCachedBitmap",
        "Landroid/graphics/Bitmap;",
        "mCachedCanvas",
        "Landroid/graphics/Canvas;",
        "onDrawOver",
        "",
        "c",
        "parent",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "state",
        "Landroidx/recyclerview/widget/RecyclerView$State;",
        "getOrCreateBitmap",
        "width",
        "",
        "height",
        "createNewBitmap",
        "getGroupName",
        "",
        "position",
        "getGroupView",
        "Landroid/view/View;",
        "Builder",
        "AssetsCenterLib_googleRelease"
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
.field public final j:Lmb/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final k:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public l:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:Landroid/graphics/Canvas;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lmb/b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lmb/a;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->j:Lmb/b;

    .line 4
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->k:Landroid/graphics/Paint;

    .line 5
    iget v0, p0, Lmb/a;->d:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lmb/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;-><init>(Lmb/b;)V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->j:Lmb/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lmb/b;->a(I)Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return-object p1
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
.end method

.method public final c(II)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string p2, "createBitmap(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iput-object p1, p0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->l:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    new-instance p2, Landroid/graphics/Canvas;

    .line 16
    .line 17
    .line 18
    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 19
    .line 20
    iput-object p2, p0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->m:Landroid/graphics/Canvas;

    .line 21
    return-object p1
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
.end method

.method public final d(I)Landroid/view/View;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->j:Lmb/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lmb/b;->b(I)Landroid/view/View;

    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return-object p1
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
.end method

.method public final e(II)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->l:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 14
    move-result v1

    .line 15
    .line 16
    if-ne v1, p2, :cond_0

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->c(II)Landroid/graphics/Bitmap;

    .line 26
    move-result-object p1

    .line 27
    return-object p1
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
.end method

.method public onDrawOver(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 19
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
    invoke-super/range {p0 .. p3}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->onDrawOver(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 30
    move-result v8

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 34
    move-result v9

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Landroid/view/View;->getPaddingStart()I

    .line 38
    move-result v10

    .line 39
    .line 40
    .line 41
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 42
    move-result v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7}, Landroid/view/View;->getPaddingEnd()I

    .line 46
    move-result v3

    .line 47
    .line 48
    sub-int v11, v2, v3

    .line 49
    const/4 v12, 0x0

    .line 50
    const/4 v13, 0x0

    .line 51
    move-object v2, v12

    .line 52
    move v14, v13

    .line 53
    .line 54
    :goto_0
    if-ge v14, v9, :cond_6

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 58
    move-result-object v3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v7, v3}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 62
    move-result v15

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v15}, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->a(I)Ljava/lang/String;

    .line 66
    move-result-object v4

    .line 67
    .line 68
    if-eqz v4, :cond_0

    .line 69
    .line 70
    .line 71
    invoke-static {v4, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 72
    move-result v2

    .line 73
    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    :cond_0
    move-object/from16 v17, v4

    .line 77
    .line 78
    goto/16 :goto_2

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    .line 82
    move-result v2

    .line 83
    .line 84
    iget v5, v0, Lmb/a;->e:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 88
    move-result v3

    .line 89
    .line 90
    .line 91
    invoke-static {v5, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 92
    move-result v3

    .line 93
    .line 94
    add-int/lit8 v5, v15, 0x1

    .line 95
    .line 96
    if-ge v5, v8, :cond_2

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v5}, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->a(I)Ljava/lang/String;

    .line 100
    move-result-object v5

    .line 101
    .line 102
    .line 103
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    move-result v5

    .line 105
    .line 106
    if-nez v5, :cond_2

    .line 107
    .line 108
    if-ge v2, v3, :cond_2

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    move v2, v3

    .line 111
    :goto_1
    int-to-float v3, v10

    .line 112
    .line 113
    iget v5, v0, Lmb/a;->e:I

    .line 114
    .line 115
    sub-int v5, v2, v5

    .line 116
    int-to-float v5, v5

    .line 117
    move-object v6, v4

    .line 118
    int-to-float v4, v11

    .line 119
    .line 120
    move/from16 v16, v3

    .line 121
    move v3, v5

    .line 122
    int-to-float v5, v2

    .line 123
    .line 124
    move-object/from16 v17, v6

    .line 125
    .line 126
    iget-object v6, v0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->k:Landroid/graphics/Paint;

    .line 127
    .line 128
    move/from16 v18, v16

    .line 129
    .line 130
    move/from16 v16, v2

    .line 131
    .line 132
    move/from16 v2, v18

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v15}, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->d(I)Landroid/view/View;

    .line 139
    move-result-object v3

    .line 140
    .line 141
    if-nez v3, :cond_3

    .line 142
    goto :goto_4

    .line 143
    .line 144
    .line 145
    :cond_3
    invoke-static {v13, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 146
    move-result v4

    .line 147
    .line 148
    .line 149
    invoke-static {v13, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 150
    move-result v5

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v4, v5}, Landroid/view/View;->measure(II)V

    .line 154
    .line 155
    iget v4, v0, Lmb/a;->e:I

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v13, v13, v11, v4}, Landroid/view/View;->layout(IIII)V

    .line 159
    .line 160
    iget v4, v0, Lmb/a;->e:I

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v11, v4}, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->e(II)Landroid/graphics/Bitmap;

    .line 164
    move-result-object v4

    .line 165
    .line 166
    iget-object v5, v0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;->m:Landroid/graphics/Canvas;

    .line 167
    .line 168
    .line 169
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v13}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v5}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 176
    .line 177
    iget v3, v0, Lmb/a;->e:I

    .line 178
    .line 179
    sub-int v3, v16, v3

    .line 180
    int-to-float v3, v3

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v4, v2, v3, v12}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 184
    goto :goto_3

    .line 185
    .line 186
    :goto_2
    if-eqz v17, :cond_5

    .line 187
    .line 188
    iget v2, v0, Lmb/a;->h:I

    .line 189
    .line 190
    if-eqz v2, :cond_5

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 194
    move-result v2

    .line 195
    int-to-float v5, v2

    .line 196
    .line 197
    iget v2, v0, Lmb/a;->e:I

    .line 198
    int-to-float v2, v2

    .line 199
    .line 200
    cmpg-float v2, v5, v2

    .line 201
    .line 202
    if-gez v2, :cond_4

    .line 203
    goto :goto_3

    .line 204
    :cond_4
    int-to-float v2, v10

    .line 205
    .line 206
    iget v3, v0, Lmb/a;->h:I

    .line 207
    int-to-float v3, v3

    .line 208
    .line 209
    sub-float v3, v5, v3

    .line 210
    int-to-float v4, v11

    .line 211
    .line 212
    iget-object v6, v0, Lmb/a;->i:Landroid/graphics/Paint;

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 216
    .line 217
    :cond_5
    :goto_3
    add-int/lit8 v14, v14, 0x1

    .line 218
    .line 219
    move-object/from16 v1, p1

    .line 220
    .line 221
    move-object/from16 v2, v17

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    :cond_6
    :goto_4
    return-void
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
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
.end method
