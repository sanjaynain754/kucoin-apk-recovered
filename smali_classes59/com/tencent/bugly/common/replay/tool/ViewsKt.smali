.class public final Lcom/tencent/bugly/common/replay/tool/ViewsKt;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0000\u001a,\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b*\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a\u000e\u0010\u0011\u001a\u00020\u0012*\u0004\u0018\u00010\u0013H\u0001\u001a\u001a\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0015*\u00020\u0007H\u0000\u001a\u0016\u0010\u0016\u001a\u00020\u0006*\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0000\u001a\u000c\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u001c\u0010\u0018\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u001d"
    }
    d2 = {
        "totalPaddingTopSafe",
        "",
        "Landroid/widget/TextView;",
        "getTotalPaddingTopSafe",
        "(Landroid/widget/TextView;)I",
        "addOnDrawListenerSafe",
        "",
        "Landroid/view/View;",
        "listener",
        "Landroid/view/ViewTreeObserver$OnDrawListener;",
        "getVisibleRects",
        "",
        "Landroid/graphics/Rect;",
        "Lcom/tencent/bugly/common/replay/tool/TextLayout;",
        "globalRect",
        "paddingLeft",
        "paddingTop",
        "isMaskable",
        "",
        "Landroid/graphics/drawable/Drawable;",
        "isVisibleToUser",
        "Lkotlin/Pair;",
        "removeOnDrawListenerSafe",
        "toOpaque",
        "traverse",
        "parentNode",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
        "options",
        "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;",
        "bugly-pro_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final addOnDrawListenerSafe(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewTreeObserver$OnDrawListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    .line 27
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    :catch_0
    :cond_1
    :goto_0
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static final getTotalPaddingTopSafe(Landroid/widget/TextView;)I
    .locals 1
    .param p0    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getTotalPaddingTop()I

    .line 9
    move-result p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return p0

    .line 11
    .line 12
    .line 13
    :catch_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getExtendedPaddingTop()I

    .line 14
    move-result p0

    .line 15
    return p0
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
.end method

.method public static final getVisibleRects(Lcom/tencent/bugly/common/replay/tool/TextLayout;Landroid/graphics/Rect;II)Ljava/util/List;
    .locals 10
    .param p0    # Lcom/tencent/bugly/common/replay/tool/TextLayout;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/common/replay/tool/TextLayout;",
            "Landroid/graphics/Rect;",
            "II)",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "globalRect"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    .line 14
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Lcom/tencent/bugly/common/replay/tool/TextLayout;->getLineCount()I

    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    .line 25
    :goto_0
    if-ge v3, v1, :cond_3

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, v3}, Lcom/tencent/bugly/common/replay/tool/TextLayout;->getLineStart(I)I

    .line 29
    move-result v4

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v3, v4}, Lcom/tencent/bugly/common/replay/tool/TextLayout;->getPrimaryHorizontal(II)F

    .line 33
    move-result v4

    .line 34
    float-to-int v4, v4

    .line 35
    .line 36
    .line 37
    invoke-interface {p0, v3}, Lcom/tencent/bugly/common/replay/tool/TextLayout;->getEllipsisCount(I)I

    .line 38
    move-result v5

    .line 39
    .line 40
    .line 41
    invoke-interface {p0, v3}, Lcom/tencent/bugly/common/replay/tool/TextLayout;->getLineVisibleEnd(I)I

    .line 42
    move-result v6

    .line 43
    .line 44
    sub-int v7, v6, v5

    .line 45
    const/4 v8, 0x1

    .line 46
    .line 47
    if-lez v5, :cond_1

    .line 48
    move v5, v8

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v5, v2

    .line 51
    :goto_1
    add-int/2addr v7, v5

    .line 52
    .line 53
    .line 54
    invoke-interface {p0, v3, v7}, Lcom/tencent/bugly/common/replay/tool/TextLayout;->getPrimaryHorizontal(II)F

    .line 55
    move-result v5

    .line 56
    float-to-int v5, v5

    .line 57
    .line 58
    if-nez v5, :cond_2

    .line 59
    .line 60
    if-lez v6, :cond_2

    .line 61
    .line 62
    add-int/lit8 v6, v6, -0x1

    .line 63
    .line 64
    .line 65
    invoke-interface {p0, v3, v6}, Lcom/tencent/bugly/common/replay/tool/TextLayout;->getPrimaryHorizontal(II)F

    .line 66
    move-result v5

    .line 67
    float-to-int v5, v5

    .line 68
    add-int/2addr v5, v8

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-interface {p0, v3}, Lcom/tencent/bugly/common/replay/tool/TextLayout;->getLineTop(I)I

    .line 72
    move-result v6

    .line 73
    .line 74
    .line 75
    invoke-interface {p0, v3}, Lcom/tencent/bugly/common/replay/tool/TextLayout;->getLineBottom(I)I

    .line 76
    move-result v7

    .line 77
    .line 78
    new-instance v8, Landroid/graphics/Rect;

    .line 79
    .line 80
    .line 81
    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    .line 82
    .line 83
    iget v9, p1, Landroid/graphics/Rect;->left:I

    .line 84
    add-int/2addr v9, p2

    .line 85
    add-int/2addr v9, v4

    .line 86
    .line 87
    iput v9, v8, Landroid/graphics/Rect;->left:I

    .line 88
    sub-int/2addr v5, v4

    .line 89
    add-int/2addr v5, v9

    .line 90
    .line 91
    iput v5, v8, Landroid/graphics/Rect;->right:I

    .line 92
    .line 93
    iget v4, p1, Landroid/graphics/Rect;->top:I

    .line 94
    add-int/2addr v4, p3

    .line 95
    add-int/2addr v4, v6

    .line 96
    .line 97
    iput v4, v8, Landroid/graphics/Rect;->top:I

    .line 98
    sub-int/2addr v7, v6

    .line 99
    add-int/2addr v7, v4

    .line 100
    .line 101
    iput v7, v8, Landroid/graphics/Rect;->bottom:I

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    add-int/lit8 v3, v3, 0x1

    .line 107
    goto :goto_0

    .line 108
    :cond_3
    return-object v0
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
.end method

.method public static final isMaskable(Landroid/graphics/drawable/Drawable;)Z
    .locals 4
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ObsoleteSdkInt"
        }
    .end annotation

    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    .line 2
    instance-of v0, p0, Landroid/graphics/drawable/InsetDrawable;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    instance-of v0, p0, Landroid/graphics/drawable/ColorDrawable;

    .line 10
    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    move v0, v1

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_1
    instance-of v0, p0, Landroid/graphics/drawable/VectorDrawable;

    .line 16
    .line 17
    :goto_1
    if-eqz v0, :cond_2

    .line 18
    move v0, v1

    .line 19
    goto :goto_2

    .line 20
    .line 21
    :cond_2
    instance-of v0, p0, Landroid/graphics/drawable/GradientDrawable;

    .line 22
    :goto_2
    const/4 v2, 0x0

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    return v2

    .line 26
    .line 27
    :cond_3
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 28
    .line 29
    if-eqz v0, :cond_6

    .line 30
    .line 31
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 35
    move-result-object p0

    .line 36
    .line 37
    if-nez p0, :cond_4

    .line 38
    return v2

    .line 39
    .line 40
    .line 41
    :cond_4
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-nez v0, :cond_5

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 48
    move-result v0

    .line 49
    .line 50
    const/16 v3, 0xa

    .line 51
    .line 52
    if-le v0, v3, :cond_5

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 56
    move-result p0

    .line 57
    .line 58
    if-le p0, v3, :cond_5

    .line 59
    return v1

    .line 60
    :cond_5
    return v2

    .line 61
    :cond_6
    return v1
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
.end method

.method public static final isVisibleToUser(Landroid/view/View;)Lkotlin/Pair;
    .locals 5
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    move-object v0, p0

    .line 27
    .line 28
    :goto_0
    instance-of v2, v0, Landroid/view/View;

    .line 29
    .line 30
    if-eqz v2, :cond_4

    .line 31
    .line 32
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v3, 0x1d

    .line 35
    .line 36
    if-lt v2, v3, :cond_1

    .line 37
    move-object v2, v0

    .line 38
    .line 39
    check-cast v2, Landroid/view/View;

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Landroidx/transition/j;->a(Landroid/view/View;)F

    .line 43
    move-result v2

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    .line 47
    .line 48
    :goto_1
    check-cast v0, Landroid/view/View;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 52
    move-result v3

    .line 53
    const/4 v4, 0x0

    .line 54
    .line 55
    cmpg-float v3, v3, v4

    .line 56
    .line 57
    if-lez v3, :cond_3

    .line 58
    .line 59
    cmpg-float v2, v2, v4

    .line 60
    .line 61
    if-lez v2, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 65
    move-result v2

    .line 66
    .line 67
    if-eqz v2, :cond_2

    .line 68
    goto :goto_2

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 72
    move-result-object v0

    .line 73
    goto :goto_0

    .line 74
    .line 75
    :cond_3
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    invoke-static {p0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    .line 82
    :cond_4
    new-instance v0, Landroid/graphics/Rect;

    .line 83
    .line 84
    .line 85
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 86
    .line 87
    new-instance v1, Landroid/graphics/Point;

    .line 88
    .line 89
    .line 90
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    .line 94
    move-result p0

    .line 95
    .line 96
    .line 97
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    move-result-object p0

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    .line 105
    :cond_5
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    invoke-static {p0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 109
    move-result-object p0

    .line 110
    return-object p0
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
.end method

.method public static final removeOnDrawListenerSafe(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewTreeObserver$OnDrawListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    .line 27
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    :catch_0
    :cond_1
    :goto_0
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static final toOpaque(I)I
    .locals 1

    .line 1
    .line 2
    const/high16 v0, -0x1000000

    .line 3
    or-int/2addr p0, v0

    .line 4
    return p0
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
.end method

.method public static final traverse(Landroid/view/View;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)V
    .locals 6
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/bugly/common/replay/BuglyReplayOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "parentNode"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string/jumbo v0, "options"

    .line 15
    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    sget-object v0, Lcom/tencent/bugly/common/replay/viewhierarchy/ComposeViewHierarchyNode;->INSTANCE:Lcom/tencent/bugly/common/replay/viewhierarchy/ComposeViewHierarchyNode;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0, p1, p2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ComposeViewHierarchyNode;->fromView(Landroid/view/View;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 37
    move-result v0

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    :goto_0
    return-void

    .line 41
    .line 42
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 46
    move-result v1

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 53
    move-result v1

    .line 54
    const/4 v2, 0x0

    .line 55
    .line 56
    :goto_1
    if-ge v2, v1, :cond_4

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    sget-object v4, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->Companion:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 68
    move-result v5

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v3, p1, v5, p2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;->fromView(Landroid/view/View;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ILcom/tencent/bugly/common/replay/BuglyReplayOptions;)Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    invoke-static {v3, v4, p2}, Lcom/tencent/bugly/common/replay/tool/ViewsKt;->traverse(Landroid/view/View;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)V

    .line 79
    .line 80
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 81
    goto :goto_1

    .line 82
    .line 83
    .line 84
    :cond_4
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->setChildren(Ljava/util/List;)V

    .line 85
    return-void
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
.end method
