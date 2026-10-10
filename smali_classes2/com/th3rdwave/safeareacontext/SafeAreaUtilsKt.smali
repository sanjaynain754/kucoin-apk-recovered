.class public final Lcom/th3rdwave/safeareacontext/SafeAreaUtilsKt;
.super Ljava/lang/Object;
.source "SafeAreaUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0008\u001a\u00020\u0003\u001a\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u0003\u00a8\u0006\u000c"
    }
    d2 = {
        "getRootWindowInsetsCompatR",
        "Lcom/th3rdwave/safeareacontext/EdgeInsets;",
        "rootView",
        "Landroid/view/View;",
        "getRootWindowInsetsCompatM",
        "getRootWindowInsetsCompatBase",
        "getRootWindowInsetsCompat",
        "getSafeAreaInsets",
        "view",
        "getFrame",
        "Lcom/th3rdwave/safeareacontext/Rect;",
        "Landroid/view/ViewGroup;",
        "react-native-safe-area-context_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getFrame(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/th3rdwave/safeareacontext/Rect;
    .locals 3
    .param p0    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "rootView"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "view"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    return-object v1

    .line 19
    .line 20
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    new-instance p0, Lcom/th3rdwave/safeareacontext/Rect;

    .line 32
    .line 33
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 34
    int-to-float v1, v1

    .line 35
    .line 36
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 37
    int-to-float v0, v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 41
    move-result v2

    .line 42
    int-to-float v2, v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 46
    move-result p1

    .line 47
    int-to-float p1, p1

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v1, v0, v2, p1}, Lcom/th3rdwave/safeareacontext/Rect;-><init>(FFFF)V

    .line 51
    return-object p0

    .line 52
    :catch_0
    move-exception p0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    return-object v1
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
.end method

.method private static final getRootWindowInsetsCompat(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;
    .locals 2

    .line 1
    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/16 v1, 0x1e

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lcom/th3rdwave/safeareacontext/SafeAreaUtilsKt;->getRootWindowInsetsCompatR(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p0}, Lcom/th3rdwave/safeareacontext/SafeAreaUtilsKt;->getRootWindowInsetsCompatM(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
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
.end method

.method private static final getRootWindowInsetsCompatBase(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    new-instance v1, Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 11
    .line 12
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 13
    int-to-float v2, v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 17
    move-result v3

    .line 18
    .line 19
    iget v4, v0, Landroid/graphics/Rect;->right:I

    .line 20
    sub-int/2addr v3, v4

    .line 21
    int-to-float v3, v3

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 25
    move-result p0

    .line 26
    .line 27
    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    .line 28
    sub-int/2addr p0, v4

    .line 29
    int-to-float p0, p0

    .line 30
    .line 31
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 32
    int-to-float v0, v0

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v2, v3, p0, v0}, Lcom/th3rdwave/safeareacontext/EdgeInsets;-><init>(FFFF)V

    .line 36
    return-object v1
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

.method private static final getRootWindowInsetsCompatM(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;
    .locals 5
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x17
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    .line 10
    :cond_0
    new-instance v0, Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    .line 19
    move-result v2

    .line 20
    int-to-float v2, v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 24
    move-result v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    .line 28
    move-result v4

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 32
    move-result v3

    .line 33
    int-to-float v3, v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    .line 37
    move-result p0

    .line 38
    int-to-float p0, p0

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/th3rdwave/safeareacontext/EdgeInsets;-><init>(FFFF)V

    .line 42
    return-object v0
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

.method private static final getRootWindowInsetsCompatR(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1e
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroidx/core/view/e2;->a()I

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroidx/core/view/k2;->a()I

    .line 14
    move-result v1

    .line 15
    or-int/2addr v0, v1

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroidx/core/view/f2;->a()I

    .line 19
    move-result v1

    .line 20
    or-int/2addr v0, v1

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroidx/core/view/g2;->a()I

    .line 24
    move-result v1

    .line 25
    or-int/2addr v0, v1

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0}, Landroidx/core/view/b2;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 29
    move-result-object p0

    .line 30
    .line 31
    if-nez p0, :cond_0

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_0
    new-instance v0, Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Landroidx/appcompat/widget/k;->a(Landroid/graphics/Insets;)I

    .line 38
    move-result v1

    .line 39
    int-to-float v1, v1

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Landroidx/appcompat/widget/l;->a(Landroid/graphics/Insets;)I

    .line 43
    move-result v2

    .line 44
    int-to-float v2, v2

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Landroidx/appcompat/widget/m;->a(Landroid/graphics/Insets;)I

    .line 48
    move-result v3

    .line 49
    int-to-float v3, v3

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Landroidx/appcompat/widget/j;->a(Landroid/graphics/Insets;)I

    .line 53
    move-result p0

    .line 54
    int-to-float p0, p0

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/th3rdwave/safeareacontext/EdgeInsets;-><init>(FFFF)V

    .line 58
    return-object v0

    .line 59
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 60
    return-object p0
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

.method public static final getSafeAreaInsets(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;
    .locals 9
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    return-object v1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/th3rdwave/safeareacontext/SafeAreaUtilsKt;->getRootWindowInsetsCompat(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    return-object v1

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 31
    move-result v1

    .line 32
    int-to-float v1, v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 36
    move-result v0

    .line 37
    int-to-float v0, v0

    .line 38
    .line 39
    new-instance v3, Landroid/graphics/Rect;

    .line 40
    .line 41
    .line 42
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 46
    .line 47
    new-instance v4, Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/th3rdwave/safeareacontext/EdgeInsets;->getTop()F

    .line 51
    move-result v5

    .line 52
    .line 53
    iget v6, v3, Landroid/graphics/Rect;->top:I

    .line 54
    int-to-float v6, v6

    .line 55
    sub-float/2addr v5, v6

    .line 56
    const/4 v6, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    .line 60
    move-result v5

    .line 61
    .line 62
    iget v7, v3, Landroid/graphics/Rect;->left:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 66
    move-result v8

    .line 67
    add-int/2addr v7, v8

    .line 68
    int-to-float v7, v7

    .line 69
    sub-float/2addr v7, v1

    .line 70
    .line 71
    .line 72
    invoke-static {v7, v6}, Ljava/lang/Math;->min(FF)F

    .line 73
    move-result v1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/th3rdwave/safeareacontext/EdgeInsets;->getRight()F

    .line 77
    move-result v7

    .line 78
    add-float/2addr v1, v7

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    .line 82
    move-result v1

    .line 83
    .line 84
    iget v7, v3, Landroid/graphics/Rect;->top:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 88
    move-result p0

    .line 89
    add-int/2addr v7, p0

    .line 90
    int-to-float p0, v7

    .line 91
    sub-float/2addr p0, v0

    .line 92
    .line 93
    .line 94
    invoke-static {p0, v6}, Ljava/lang/Math;->min(FF)F

    .line 95
    move-result p0

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Lcom/th3rdwave/safeareacontext/EdgeInsets;->getBottom()F

    .line 99
    move-result v0

    .line 100
    add-float/2addr p0, v0

    .line 101
    .line 102
    .line 103
    invoke-static {p0, v6}, Ljava/lang/Math;->max(FF)F

    .line 104
    move-result p0

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Lcom/th3rdwave/safeareacontext/EdgeInsets;->getLeft()F

    .line 108
    move-result v0

    .line 109
    .line 110
    iget v2, v3, Landroid/graphics/Rect;->left:I

    .line 111
    int-to-float v2, v2

    .line 112
    sub-float/2addr v0, v2

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v6}, Ljava/lang/Math;->max(FF)F

    .line 116
    move-result v0

    .line 117
    .line 118
    .line 119
    invoke-direct {v4, v5, v1, p0, v0}, Lcom/th3rdwave/safeareacontext/EdgeInsets;-><init>(FFFF)V

    .line 120
    return-object v4
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
.end method
